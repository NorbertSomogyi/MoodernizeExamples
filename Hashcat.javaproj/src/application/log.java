package application;

/*
 * gzlog.c
 * Copyright (C) 2004, 2008, 2012, 2016 Mark Adler, all rights reserved
 * For conditions of distribution and use, see copyright notice in gzlog.h
 * version 2.2, 14 Aug 2012
 */
/*
   gzlog provides a mechanism for frequently appending short strings to a gzip
   file that is efficient both in execution time and compression ratio.  The
   strategy is to write the short strings in an uncompressed form to the end of
   the gzip file, only compressing when the amount of uncompressed data has
   reached a given threshold.

   gzlog also provides protection against interruptions in the process due to
   system crashes.  The status of the operation is recorded in an extra field
   in the gzip file, and is only updated once the gzip file is brought to a
   valid state.  The last data to be appended or compressed is saved in an
   auxiliary file, so that if the operation is interrupted, it can be completed
   the next time an append operation is attempted.

   gzlog maintains another auxiliary file with the last 32K of data from the
   compressed portion, which is preloaded for the compression of the subsequent
   data.  This minimizes the impact to the compression ratio of appending.
 */
/*
   Operations Concept:

   Files (log name "foo"):
   foo.gz -- gzip file with the complete log
   foo.add -- last message to append or last data to compress
   foo.dict -- dictionary of the last 32K of data for next compression
   foo.temp -- temporary dictionary file for compression after this one
   foo.lock -- lock file for reading and writing the other files
   foo.repairs -- log file for log file recovery operations (not compressed)

   gzip file structure:
   - fixed-length (no file name) header with extra field (see below)
   - compressed data ending initially with empty stored block
   - uncompressed data filling out originally empty stored block and
     subsequent stored blocks as needed (16K max each)
   - gzip trailer
   - no junk at end (no other gzip streams)

   When appending data, the information in the first three items above plus the
   foo.add file are sufficient to recover an interrupted append operation.  The
   extra field has the necessary information to restore the start of the last
   stored block and determine where to append the data in the foo.add file, as
   well as the crc and length of the gzip data before the append operation.

   The foo.add file is created before the gzip file is marked for append, and
   deleted after the gzip file is marked as complete.  So if the append
   operation is interrupted, the data to add will still be there.  If due to
   some external force, the foo.add file gets deleted between when the append
   operation was interrupted and when recovery is attempted, the gzip file will
   still be restored, but without the appended data.

   When compressing data, the information in the first two items above plus the
   foo.add file are sufficient to recover an interrupted compress operation.
   The extra field has the necessary information to find the end of the
   compressed data, and contains both the crc and length of just the compressed
   data and of the complete set of data including the contents of the foo.add
   file.

   Again, the foo.add file is maintained during the compress operation in case
   of an interruption.  If in the unlikely event the foo.add file with the data
   to be compressed is missing due to some external force, a gzip file with
   just the previous compressed data will be reconstructed.  In this case, all
   of the data that was to be compressed is lost (approximately one megabyte).
   This will not occur if all that happened was an interruption of the compress
   operation.

   The third state that is marked is the replacement of the old dictionary with
   the new dictionary after a compress operation.  Once compression is
   complete, the gzip file is marked as being in the replace state.  This
   completes the gzip file, so an interrupt after being so marked does not
   result in recompression.  Then the dictionary file is replaced, and the gzip
   file is marked as completed.  This state prevents the possibility of
   restarting compression with the wrong dictionary file.

   All three operations are wrapped by a lock/unlock procedure.  In order to
   gain exclusive access to the log files, first a foo.lock file must be
   exclusively created.  When all operations are complete, the lock is
   released by deleting the foo.lock file.  If when attempting to create the
   lock file, it already exists and the modify time of the lock file is more
   than five minutes old (set by the PATIENCE define below), then the old
   lock file is considered stale and deleted, and the exclusive creation of
   the lock file is retried.  To assure that there are no false assessments
   of the staleness of the lock file, the operations periodically touch the
   lock file to update the modified date.

   Following is the definition of the extra field with all of the information
   required to enable the above append and compress operations and their
   recovery if interrupted.  Multi-byte values are stored little endian
   (consistent with the gzip format).  File pointers are eight bytes long.
   The crc's and lengths for the gzip trailer are four bytes long.  (Note that
   the length at the end of a gzip file is used for error checking only, and
   for large files is actually the length modulo 2^32.)  The stored block
   length is two bytes long.  The gzip extra field two-byte identification is
   "ap" for append.  It is assumed that writing the extra field to the file is
   an "atomic" operation.  That is, either all of the extra field is written
   to the file, or none of it is, if the operation is interrupted right at the
   point of updating the extra field.  This is a reasonable assumption, since
   the extra field is within the first 52 bytes of the file, which is smaller
   than any expected block size for a mass storage device (usually 512 bytes or
   larger).

   Extra field (35 bytes):
   - Pointer to first stored block length -- this points to the two-byte length
     of the first stored block, which is followed by the two-byte, one's
     complement of that length.  The stored block length is preceded by the
     three-bit header of the stored block, which is the actual start of the
     stored block in the deflate format.  See the bit offset field below.
   - Pointer to the last stored block length.  This is the same as above, but
     for the last stored block of the uncompressed data in the gzip file.
     Initially this is the same as the first stored block length pointer.
     When the stored block gets to 16K (see the MAX_STORE define), then a new
     stored block as added, at which point the last stored block length pointer
     is different from the first stored block length pointer.  When they are
     different, the first bit of the last stored block header is eight bits, or
     one byte back from the block length.
   - Compressed data crc and length.  This is the crc and length of the data
     that is in the compressed portion of the deflate stream.  These are used
     only in the event that the foo.add file containing the data to compress is
     lost after a compress operation is interrupted.
   - Total data crc and length.  This is the crc and length of all of the data
     stored in the gzip file, compressed and uncompressed.  It is used to
     reconstruct the gzip trailer when compressing, as well as when recovering
     interrupted operations.
   - Final stored block length.  This is used to quickly find where to append,
     and allows the restoration of the original final stored block state when
     an append operation is interrupted.
   - First stored block start as the number of bits back from the final stored
     block first length byte.  This value is in the range of 3..10, and is
     stored as the low three bits of the final byte of the extra field after
     subtracting three (0..7).  This allows the last-block bit of the stored
     block header to be updated when a new stored block is added, for the case
     when the first stored block and the last stored block are the same.  (When
     they are different, the numbers of bits back is known to be eight.)  This
     also allows for new compressed data to be appended to the old compressed
     data in the compress operation, overwriting the previous first stored
     block, or for the compressed data to be terminated and a valid gzip file
     reconstructed on the off chance that a compression operation was
     interrupted and the data to compress in the foo.add file was deleted.
   - The operation in process.  This is the next two bits in the last byte (the
     bits under the mask 0x18).  The are interpreted as 0: nothing in process,
     1: append in process, 2: compress in process, 3: replace in process.
   - The top three bits of the last byte in the extra field are reserved and
     are currently set to zero.

   Main procedure:
   - Exclusively create the foo.lock file using the O_CREAT and O_EXCL modes of
     the system open() call.  If the modify time of an existing lock file is
     more than PATIENCE seconds old, then the lock file is deleted and the
     exclusive create is retried.
   - Load the extra field from the foo.gz file, and see if an operation was in
     progress but not completed.  If so, apply the recovery procedure below.
   - Perform the append procedure with the provided data.
   - If the uncompressed data in the foo.gz file is 1MB or more, apply the
     compress procedure.
   - Delete the foo.lock file.

   Append procedure:
   - Put what to append in the foo.add file so that the operation can be
     restarted if this procedure is interrupted.
   - Mark the foo.gz extra field with the append operation in progress.
   + Restore the original last-block bit and stored block length of the last
     stored block from the information in the extra field, in case a previous
     append operation was interrupted.
   - Append the provided data to the last stored block, creating new stored
     blocks as needed and updating the stored blocks last-block bits and
     lengths.
   - Update the crc and length with the new data, and write the gzip trailer.
   - Write over the extra field (with a single write operation) with the new
     pointers, lengths, and crc's, and mark the gzip file as not in process.
     Though there is still a foo.add file, it will be ignored since nothing
     is in process.  If a foo.add file is leftover from a previously
     completed operation, it is truncated when writing new data to it.
   - Delete the foo.add file.

   Compress and replace procedures:
   - Read all of the uncompressed data in the stored blocks in foo.gz and write
     it to foo.add.  Also write foo.temp with the last 32K of that data to
     provide a dictionary for the next invocation of this procedure.
   - Rewrite the extra field marking foo.gz with a compression in process.
   * If there is no data provided to compress (due to a missing foo.add file
     when recovering), reconstruct and truncate the foo.gz file to contain
     only the previous compressed data and proceed to the step after the next
     one.  Otherwise ...
   - Compress the data with the dictionary in foo.dict, and write to the
     foo.gz file starting at the bit immediately following the last previously
     compressed block.  If there is no foo.dict, proceed anyway with the
     compression at slightly reduced efficiency.  (For the foo.dict file to be
     missing requires some external failure beyond simply the interruption of
     a compress operation.)  During this process, the foo.lock file is
     periodically touched to assure that that file is not considered stale by
     another process before we're done.  The deflation is terminated with a
     non-last empty static block (10 bits long), that is then located and
     written over by a last-bit-set empty stored block.
   - Append the crc and length of the data in the gzip file (previously
     calculated during the append operations).
   - Write over the extra field with the updated stored block offsets, bits
     back, crc's, and lengths, and mark foo.gz as in process for a replacement
     of the dictionary.
   @ Delete the foo.add file.
   - Replace foo.dict with foo.temp.
   - Write over the extra field, marking foo.gz as complete.

   Recovery procedure:
   - If not a replace recovery, read in the foo.add file, and provide that data
     to the appropriate recovery below.  If there is no foo.add file, provide
     a zero data length to the recovery.  In that case, the append recovery
     restores the foo.gz to the previous compressed + uncompressed data state.
     For the the compress recovery, a missing foo.add file results in foo.gz
     being restored to the previous compressed-only data state.
   - Append recovery:
     - Pick up append at + step above
   - Compress recovery:
     - Pick up compress at * step above
   - Replace recovery:
     - Pick up compress at @ step above
   - Log the repair with a date stamp in foo.repairs
 */
/* rename, fopen, fprintf, fclose */
/* malloc, free */
/* strlen, strrchr, strcpy, strncpy, strcmp */
/* open */
/* lseek, read, write, close, unlink, sleep, */
/* ftruncate, fsync */
/* errno */
/* time, ctime */
/* stat */
/* utimes */
/* crc32 */
/* header for external access */
/* Macro for debugging to deterministically force recovery operations */
/* longjmp */
/* where to go back to */
/* which point to bail at (1..8) */
/* number of times through to wait */
/* how old the lock file can be in seconds before considering it stale */
/* maximum stored block size in Kbytes -- must be in 1..63 */
/* number of stored Kbytes to trigger compression (must be >= 32 to allow
   dictionary construction, and <= 204 * MAX_STORE, in order for >> 10 to
   discard the stored block headers contribution of five bytes each) */
/* size of a deflate dictionary (this cannot be changed) */
/* values for the operation (2 bits) */
/* macros to extract little-endian integers from an unsigned byte buffer */
/* macros to store integers into a byte buffer in little-endian order */
/* internal structure for log information */
/* should be three non-zero characters */
public class log {
	private Object id;
	private int fd;
	private Byte path;
	private Byte end;
	private Object first;
	private int back;
	private Object stored;
	private Object last;
	private Object ccrc;
	private Object clen;
	private Object tcrc;
	private Object tlen;
	private Object lock;
	
	public log(Object id, int fd, Byte path, Byte end, Object first, int back, Object stored, Object last, Object ccrc, Object clen, Object tcrc, Object tlen, Object lock) {
		setId(id);
		setFd(fd);
		setPath(path);
		setEnd(end);
		setFirst(first);
		setBack(back);
		setStored(stored);
		setLast(last);
		setCcrc(ccrc);
		setClen(clen);
		setTcrc(tcrc);
		setTlen(tlen);
		setLock(lock);
	}
	public log() {
	}
	
	public int log_lock() {
		int fd;
		stat st = new stat();
		Byte generatedEnd = this.getEnd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(generatedEnd, ".lock");
		Byte generatedPath = this.getPath();
		Object generatedSt_mtime = st.getSt_mtime();
		while ((fd = /*Error: Function owner not recognized*/open(generatedPath, -1024 | -1024, 644)) < 0) {
			if ((/*Error: Function owner not recognized*/_errno()) != 17) {
				return -1;
			} 
			if (/*Error: Function owner not recognized*/stat(generatedPath, st) == 0 && /*Error: Function owner not recognized*/time(((Object)0)) - generatedSt_mtime > 300) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(generatedPath);
				continue;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sleep(/* relinquish the CPU for two seconds while waiting */2);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
		if (/*Error: Function owner not recognized*/stat(generatedPath, st) == 0) {
			this.setLock(generatedSt_mtime);
		} 
		return 0/* Update the modify time of the lock file to now, in order to prevent another
		   task from thinking that the lock is stale.  Save the lock file modify time
		   for verification of ownership. */;
	}
	public void log_touch() {
		stat st = new stat();
		Byte generatedEnd = this.getEnd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(generatedEnd, ".lock");
		Byte generatedPath = this.getPath();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/utimes(generatedPath, ((Object)0));
		Object generatedSt_mtime = st.getSt_mtime();
		if (/*Error: Function owner not recognized*/stat(generatedPath, st) == 0) {
			this.setLock(generatedSt_mtime);
		} 
	}
	/* Check the log file modify time against what is expected.  Return true if
	   this is not our lock.  If it is our lock, touch it to keep it. */
	public int log_check() {
		stat st = new stat();
		Byte generatedEnd = this.getEnd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(generatedEnd, ".lock");
		Byte generatedPath = this.getPath();
		Object generatedSt_mtime = st.getSt_mtime();
		Object generatedLock = this.getLock();
		if (/*Error: Function owner not recognized*/stat(generatedPath, st) || generatedSt_mtime != generatedLock) {
			return 1;
		} 
		log.log_touch();
		return 0;
	}
	/* Unlock a previously acquired lock, but only if it's ours. */
	public void log_unlock() {
		if (log.log_check()) {
			return /*Error: Unsupported expression*/;
		} 
		Byte generatedEnd = this.getEnd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(generatedEnd, ".lock");
		Byte generatedPath = this.getPath();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(generatedPath);
		this.setLock(0/* Check the gzip header and read in the extra field, filling in the values in
		   the log structure.  Return op on success or -1 if the gzip header was not as
		   expected.  op is the current operation in progress last written to the extra
		   field.  This assumes that the gzip file has already been opened, with the
		   file descriptor log->fd. */);
	}
	public int log_head() {
		int op;
		byte[] buf = new byte[/*Error: sizeof expression not supported yet*/ + /*Error: sizeof expression not supported yet*/];
		int generatedFd = this.getFd();
		if (/*Error: Function owner not recognized*/lseek(generatedFd, 0, 0) < 0 || /*Error: Function owner not recognized*/read(generatedFd, buf, /*Error: sizeof expression not supported yet*/ + /*Error: sizeof expression not supported yet*/) != /*Error: sizeof expression not supported yet*/ + /*Error: sizeof expression not supported yet*/ || /*Error: Function owner not recognized*/memcmp(buf, ModernizedCProgram.log_gzhead, /*Error: sizeof expression not supported yet*/)) {
			return -1;
		} 
		this.setFirst(((((buf + /*Error: sizeof expression not supported yet*/)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/)[1]) << 8)) + ((ulong)((buf + /*Error: sizeof expression not supported yet*/ + 2)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 2)[1]) << 8)) << 16)) + ((off_t)(((buf + /*Error: sizeof expression not supported yet*/ + 4)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 4)[1]) << 8)) + ((ulong)((buf + /*Error: sizeof expression not supported yet*/ + 4 + 2)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 4 + 2)[1]) << 8)) << 16)) << 32)));
		this.setLast(((((buf + /*Error: sizeof expression not supported yet*/ + 8)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 8)[1]) << 8)) + ((ulong)((buf + /*Error: sizeof expression not supported yet*/ + 8 + 2)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 8 + 2)[1]) << 8)) << 16)) + ((off_t)(((buf + /*Error: sizeof expression not supported yet*/ + 8 + 4)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 8 + 4)[1]) << 8)) + ((ulong)((buf + /*Error: sizeof expression not supported yet*/ + 8 + 4 + 2)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 8 + 4 + 2)[1]) << 8)) << 16)) << 32)));
		this.setCcrc((((buf + /*Error: sizeof expression not supported yet*/ + 16)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 16)[1]) << 8)) + ((ulong)((buf + /*Error: sizeof expression not supported yet*/ + 16 + 2)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 16 + 2)[1]) << 8)) << 16)));
		this.setClen((((buf + /*Error: sizeof expression not supported yet*/ + 20)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 20)[1]) << 8)) + ((ulong)((buf + /*Error: sizeof expression not supported yet*/ + 20 + 2)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 20 + 2)[1]) << 8)) << 16)));
		this.setTcrc((((buf + /*Error: sizeof expression not supported yet*/ + 24)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 24)[1]) << 8)) + ((ulong)((buf + /*Error: sizeof expression not supported yet*/ + 24 + 2)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 24 + 2)[1]) << 8)) << 16)));
		this.setTlen((((buf + /*Error: sizeof expression not supported yet*/ + 28)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 28)[1]) << 8)) + ((ulong)((buf + /*Error: sizeof expression not supported yet*/ + 28 + 2)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 28 + 2)[1]) << 8)) << 16)));
		this.setStored(((buf + /*Error: sizeof expression not supported yet*/ + 32)[0] + ((uint)((buf + /*Error: sizeof expression not supported yet*/ + 32)[1]) << 8)));
		this.setBack(3 + (buf[/*Error: sizeof expression not supported yet*/ + 34] & 7));
		op = (buf[/*Error: sizeof expression not supported yet*/ + 34] >> 3) & 3;
		return op/* Write over the extra field contents, marking the operation as op.  Use fsync
		   to assure that the device is written to, and in the requested order.  This
		   operation, and only this operation, is assumed to be atomic in order to
		   assure that the log is recoverable in the event of an interruption at any
		   point in the process.  Return -1 if the write to foo.gz failed. */;
	}
	public int log_mark(int op) {
		int ret;
		byte[] ext = new byte[/*Error: sizeof expression not supported yet*/];
		Object generatedFirst = this.getFirst();
		do {
			do {
				do {
					(ext)[0] = generatedFirst;
					(ext)[1] = (generatedFirst) >> 8;
				} while (0);
				do {
					(ext + 2)[0] = generatedFirst >> 16;
					(ext + 2)[1] = (generatedFirst >> 16) >> 8;
				} while (0);
			} while (0);
			do {
				do {
					(ext + 4)[0] = generatedFirst >> 32;
					(ext + 4)[1] = (generatedFirst >> 32) >> 8;
				} while (0);
				do {
					(ext + 4 + 2)[0] = generatedFirst >> 32 >> 16;
					(ext + 4 + 2)[1] = (generatedFirst >> 32 >> 16) >> 8;
				} while (0);
			} while (0);
		} while (0);
		Object generatedLast = this.getLast();
		do {
			do {
				do {
					(ext + 8)[0] = generatedLast;
					(ext + 8)[1] = (generatedLast) >> 8;
				} while (0);
				do {
					(ext + 8 + 2)[0] = generatedLast >> 16;
					(ext + 8 + 2)[1] = (generatedLast >> 16) >> 8;
				} while (0);
			} while (0);
			do {
				do {
					(ext + 8 + 4)[0] = generatedLast >> 32;
					(ext + 8 + 4)[1] = (generatedLast >> 32) >> 8;
				} while (0);
				do {
					(ext + 8 + 4 + 2)[0] = generatedLast >> 32 >> 16;
					(ext + 8 + 4 + 2)[1] = (generatedLast >> 32 >> 16) >> 8;
				} while (0);
			} while (0);
		} while (0);
		Object generatedCcrc = this.getCcrc();
		do {
			do {
				(ext + 16)[0] = generatedCcrc;
				(ext + 16)[1] = (generatedCcrc) >> 8;
			} while (0);
			do {
				(ext + 16 + 2)[0] = generatedCcrc >> 16;
				(ext + 16 + 2)[1] = (generatedCcrc >> 16) >> 8;
			} while (0);
		} while (0);
		Object generatedClen = this.getClen();
		do {
			do {
				(ext + 20)[0] = generatedClen;
				(ext + 20)[1] = (generatedClen) >> 8;
			} while (0);
			do {
				(ext + 20 + 2)[0] = generatedClen >> 16;
				(ext + 20 + 2)[1] = (generatedClen >> 16) >> 8;
			} while (0);
		} while (0);
		Object generatedTcrc = this.getTcrc();
		do {
			do {
				(ext + 24)[0] = generatedTcrc;
				(ext + 24)[1] = (generatedTcrc) >> 8;
			} while (0);
			do {
				(ext + 24 + 2)[0] = generatedTcrc >> 16;
				(ext + 24 + 2)[1] = (generatedTcrc >> 16) >> 8;
			} while (0);
		} while (0);
		Object generatedTlen = this.getTlen();
		do {
			do {
				(ext + 28)[0] = generatedTlen;
				(ext + 28)[1] = (generatedTlen) >> 8;
			} while (0);
			do {
				(ext + 28 + 2)[0] = generatedTlen >> 16;
				(ext + 28 + 2)[1] = (generatedTlen >> 16) >> 8;
			} while (0);
		} while (0);
		Object generatedStored = this.getStored();
		do {
			(ext + 32)[0] = generatedStored;
			(ext + 32)[1] = (generatedStored) >> 8;
		} while (0);
		int generatedBack = this.getBack();
		ext[34] = generatedBack - 3 + (op << 3);
		int generatedFd = this.getFd();
		ModernizedCProgram.fsync(generatedFd);
		ret = /*Error: Function owner not recognized*/lseek(generatedFd, /*Error: sizeof expression not supported yet*/, 0) < 0 || /*Error: Function owner not recognized*/write(generatedFd, ext, /*Error: sizeof expression not supported yet*/) != /*Error: sizeof expression not supported yet*/ ? -1 : 0;
		ModernizedCProgram.fsync(generatedFd);
		return ret/* Rewrite the last block header bits and subsequent zero bits to get to a byte
		   boundary, setting the last block bit if last is true, and then write the
		   remainder of the stored block header (length and one's complement).  Leave
		   the file pointer after the end of the last stored block data.  Return -1 if
		   there is a read or write failure on the foo.gz file */;
	}
	public int log_last(int last) {
		int back;
		int len;
		int mask;
		byte[] buf = new byte[6];
		Object generatedLast = this.getLast();
		Object generatedFirst = this.getFirst();
		int generatedBack = this.getBack();
		back = generatedLast == generatedFirst ? generatedBack : /* determine the locations of the bytes and bits to modify */8;
		len = back > 8 ? 2 : /* bytes back from log->last */1;
		mask = -1024 >> ((back - 1) & /* mask for block last-bit */7/* get the byte to modify (one or two back) into buf[0] -- don't need to
		       read the byte if the last-bit is eight bits back, since in that case
		       the entire byte will be modified */);
		buf[0] = 0;
		int generatedFd = this.getFd();
		if (back != 8 && (/*Error: Function owner not recognized*/lseek(generatedFd, generatedLast - len, 0) < 0 || /*Error: Function owner not recognized*/read(generatedFd, buf, 1) != 1)) {
			return -1/* change the last-bit of the last stored block as requested -- note
			       that all bits above the last-bit are set to zero, per the type bits
			       of a stored block being 00 and per the convention that the bits to
			       bring the stream to a byte boundary are also zeros */;
		} 
		buf[1] = 0;
		buf[2 - len] = (buf & (mask - 1)) + (last ? mask : 0);
		Object generatedStored = this.getStored();
		do {
			(buf + 2)[0] = generatedStored;
			(buf + 2)[1] = (generatedStored) >> 8;
		} while (/* write the modified stored block header and lengths, move the file
		       pointer to after the last stored block data */0);
		do {
			(buf + 4)[0] = generatedStored ^ -1024;
			(buf + 4)[1] = (generatedStored ^ -1024) >> 8;
		} while (0);
		return /*Error: Function owner not recognized*/lseek(generatedFd, generatedLast - len, 0) < 0 || /*Error: Function owner not recognized*/write(generatedFd, buf + 2 - len, len + 4) != len + 4 || /*Error: Function owner not recognized*/lseek(generatedFd, generatedStored, 1) < 0 ? -1 : 0/* Append len bytes from data to the locked and open log file.  len may be zero
		   if recovering and no .add file was found.  In that case, the previous state
		   of the foo.gz file is restored.  The data is appended uncompressed in
		   deflate stored blocks.  Return -1 if there was an error reading or writing
		   the foo.gz file. */;
	}
	public int log_append(Byte data, Object len) {
		uint put = new uint();
		off_t end = new off_t();
		byte[] buf = new byte[8/* set the last block last-bit and length, in case recovering an
		       interrupted append, then position the file pointer to append to the
		       block */];
		if (log.log_last(1)) {
			return -1;
		} 
		Object generatedStored = this.getStored();
		int generatedFd = this.getFd();
		Object generatedTcrc = this.getTcrc();
		Object generatedTlen = this.getTlen();
		Object generatedLast = this.getLast();
		while (/* append, adding stored blocks and updating the offset of the last stored
		       block as needed, and update the total crc and length */len) {
			put = (16 << 10) - generatedStored;
			if (put > len) {
				put = (uint)len;
			} 
			if (put) {
				if (/*Error: Function owner not recognized*/write(generatedFd, data, put) != put) {
					return -1;
				} 
				;
				this.setTcrc(ModernizedCProgram.crc32(generatedTcrc, data, put));
				generatedTlen += put;
				generatedStored += put;
				data += put;
				len -= put;
			} 
			if (/* if we need to, add a new empty stored block */len) {
				if (log.log_last(/* mark current block as not last */0)) {
					return -1;
				} 
				generatedLast += 4 + generatedStored + /* point to new, empty stored block */1;
				this.setStored(0);
			} 
			if (log.log_last(/* mark last block as last, update its length */1)) {
				return -1;
			} 
			;
		}
		do {
			do {
				(buf)[0] = generatedTcrc;
				(buf)[1] = (generatedTcrc) >> 8;
			} while (0);
			do {
				(buf + 2)[0] = generatedTcrc >> 16;
				(buf + 2)[1] = (generatedTcrc >> 16) >> 8;
			} while (0);
		} while (/* write the new crc and length trailer, and truncate just in case (could
		       be recovering from partial append with a missing foo.add file) */0);
		do {
			do {
				(buf + 4)[0] = generatedTlen;
				(buf + 4)[1] = (generatedTlen) >> 8;
			} while (0);
			do {
				(buf + 4 + 2)[0] = generatedTlen >> 16;
				(buf + 4 + 2)[1] = (generatedTlen >> 16) >> 8;
			} while (0);
		} while (0);
		if (/*Error: Function owner not recognized*/write(generatedFd, buf, 8) != 8 || (end = /*Error: Function owner not recognized*/lseek(generatedFd, 0, 1)) < 0 || /*Error: Function owner not recognized*/ftruncate(generatedFd, end)) {
			return -1;
		} 
		if (log.log_mark(/* write the extra field, marking the log file as done, delete .add file */0)) {
			return -1;
		} 
		Byte generatedEnd = this.getEnd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(generatedEnd, ".add");
		Byte generatedPath = this.getPath();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(generatedPath);
		return 0/* Replace the foo.dict file with the foo.temp file.  Also delete the foo.add
		   file, since the compress operation may have been interrupted before that was
		   done.  Returns 1 if memory could not be allocated, or -1 if reading or
		   writing foo.gz fails, or if the rename fails for some reason other than
		   foo.temp not existing.  foo.temp not existing is a permitted error, since
		   the replace operation may have been interrupted after the rename is done,
		   but before foo.gz is marked as complete. */;
	}
	public int log_replace() {
		int ret;
		byte dest;
		Byte generatedEnd = this.getEnd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(generatedEnd, /* delete foo.add file */".add");
		Byte generatedPath = this.getPath();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(generatedPath);
		;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(generatedEnd, /* rename foo.name to foo.dict, replacing foo.dict if it exists */".dict");
		dest = /*Error: Function owner not recognized*/malloc(/*Error: Function owner not recognized*/strlen(generatedPath) + 1);
		if (dest == ((Object)0)) {
			return -2;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(dest, generatedPath);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(generatedEnd, ".temp");
		ret = /*Error: Function owner not recognized*/rename(generatedPath, dest);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(dest);
		if (ret && (/*Error: Function owner not recognized*/_errno()) != 2) {
			return -1;
		} 
		;
		return log.log_mark(/* mark the foo.gz file as done */0/* Compress the len bytes at data and append the compressed data to the
		   foo.gz deflate data immediately after the previous compressed data.  This
		   overwrites the previous uncompressed data, which was stored in foo.add
		   and is the data provided in data[0..len-1].  If this operation is
		   interrupted, it picks up at the start of this routine, with the foo.add
		   file read in again.  If there is no data to compress (len == 0), then we
		   simply terminate the foo.gz file after the previously compressed data,
		   appending a final empty stored block and the gzip trailer.  Return -1 if
		   reading or writing the log.gz file failed, or -2 if there was a memory
		   allocation failure. */);
	}
	public int log_compress(Byte data, Object len) {
		int fd;
		uint got = new uint();
		uint max = new uint();
		ssize_t dict = new ssize_t();
		off_t end = new off_t();
		z_stream strm = new z_stream();
		byte[] buf = new byte[-1024];
		Byte generatedEnd = this.getEnd();
		Byte generatedPath = this.getPath();
		int generatedFd = this.getFd();
		Object generatedFirst = this.getFirst();
		int generatedBack = this.getBack();
		Object generatedAvail_in = strm.getAvail_in();
		Object generatedAvail_out = strm.getAvail_out();
		Object generatedTcrc = this.getTcrc();
		Object generatedTlen = this.getTlen();
		Object generatedCcrc = this.getCcrc();
		Object generatedClen = this.getClen();
		if (/* compress and append compressed data */len) {
			strm.setZalloc(/* set up for deflate, allocating memory */0);
			strm.setZfree(0);
			strm.setOpaque(0);
			if (ModernizedCProgram.deflateInit2_((strm), ((true)), (true), (true), (true), (false), "1.2.11", (int)/*Error: Unsupported expression*/) != 0) {
				return -2;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(generatedEnd, /* read in dictionary (last 32K of data that was compressed) */".dict");
			fd = /*Error: Function owner not recognized*/open(generatedPath, 0, 0);
			if (fd >= 0) {
				dict = /*Error: Function owner not recognized*/read(fd, buf, -1024);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
				if (dict < 0) {
					ModernizedCProgram.deflateEnd(strm);
					return -1;
				} 
				if (dict) {
					ModernizedCProgram.deflateSetDictionary(strm, buf, (uint)dict);
				} 
			} 
			log.log_touch();
			if (/*Error: Function owner not recognized*/lseek(generatedFd, generatedFirst - (generatedBack > 8 ? 2 : /* prime deflate with last bits of previous block, position write
			           pointer to write those bits and overwrite what follows */1), 0) < 0 || /*Error: Function owner not recognized*/read(generatedFd, buf, 1) != 1 || /*Error: Function owner not recognized*/lseek(generatedFd, -1, 1) < 0) {
				ModernizedCProgram.deflateEnd(strm);
				return -1;
			} 
			ModernizedCProgram.deflatePrime(strm, (8 - generatedBack) & 7, buf);
			strm.setNext_in(/* compress, finishing with a partial non-last empty static block */data);
			max = (((uint)0 - 1) >> 1) + /* in case int smaller than size_t */1;
			do {
				strm.setAvail_in(len > max ? max : (uint)len);
				len -= generatedAvail_in;
				do {
					strm.setAvail_out(-1024);
					strm.setNext_out(buf);
					ModernizedCProgram.deflate(strm, len ? 0 : 1);
					got = -1024 - generatedAvail_out;
					if (got && /*Error: Function owner not recognized*/write(generatedFd, buf, got) != got) {
						ModernizedCProgram.deflateEnd(strm);
						return -1;
					} 
					log.log_touch();
				} while (generatedAvail_out == 0);
			} while (len);
			ModernizedCProgram.deflateEnd(strm);
			;
			if ((this.setFirst(/*Error: Function owner not recognized*/lseek(generatedFd, -1, 1))) < 0 || /*Error: Function owner not recognized*/read(generatedFd, buf, 1) != 1) {
				return -1;
			} 
			generatedFirst++;
			if (buf) {
				this.setBack(1);
				while ((buf & ((uint)1 << (8 - generatedBack++))) == 0) {
					;
				}
			} else {
					this.setBack(10);
			} 
			this.setCcrc(generatedTcrc);
			this.setClen(generatedTlen);
		} else {
				this.setTcrc(generatedCcrc);
				this.setTlen(generatedClen);
		} 
		this.setLast(generatedFirst);
		this.setStored(0);
		do {
			do {
				(buf)[0] = generatedTcrc;
				(buf)[1] = (generatedTcrc) >> 8;
			} while (0);
			do {
				(buf + 2)[0] = generatedTcrc >> 16;
				(buf + 2)[1] = (generatedTcrc >> 16) >> 8;
			} while (0);
		} while (0);
		do {
			do {
				(buf + 4)[0] = generatedTlen;
				(buf + 4)[1] = (generatedTlen) >> 8;
			} while (0);
			do {
				(buf + 4 + 2)[0] = generatedTlen >> 16;
				(buf + 4 + 2)[1] = (generatedTlen >> 16) >> 8;
			} while (0);
		} while (0);
		if (log.log_last(1) || /*Error: Function owner not recognized*/write(generatedFd, buf, 8) != 8 || (end = /*Error: Function owner not recognized*/lseek(generatedFd, 0, 1)) < 0 || /*Error: Function owner not recognized*/ftruncate(generatedFd, end)) {
			return -1;
		} 
		;
		if (log.log_mark(/* mark as being in the replace operation */3)) {
			return -1;
		} 
		return /* execute the replace operation and mark the file as done */log.log_replace();
	}
	/* log a repair record to the .repairs file */
	public void log_log(int op, Byte record) {
		time_t now = new time_t();
		FILE rec = new FILE();
		now = /*Error: Function owner not recognized*/time(((Object)0));
		Byte generatedEnd = this.getEnd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(generatedEnd, ".repairs");
		Byte generatedPath = this.getPath();
		rec = /*Error: Function owner not recognized*/fopen(generatedPath, "a");
		if (rec == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(rec, "%.24s %s recovery: %s\n", /*Error: Function owner not recognized*/ctime(now), op == 1 ? "append" : (op == 2 ? "compress" : "replace"), record);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(rec);
		return /*Error: Unsupported expression*/;/* Recover the interrupted operation op.  First read foo.add for recovering an
		   append or compress operation.  Return -1 if there was an error reading or
		   writing foo.gz or reading an existing foo.add, or -2 if there was a memory
		   allocation failure. */
	}
	public int log_recover(int op) {
		int fd;
		int ret = 0;
		byte data = ((Object)0);
		size_t len = 0;
		stat st = new stat();
		log.log_log(op, /* log recovery */"start");
		Byte generatedEnd = this.getEnd();
		Byte generatedPath = this.getPath();
		Object generatedSt_size = st.getSt_size();
		if (op == 1 || op == /* load foo.add file if expected and present */2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(generatedEnd, ".add");
			if (/*Error: Function owner not recognized*/stat(generatedPath, st) == 0 && generatedSt_size) {
				len = (size_t)(generatedSt_size);
				if ((off_t)len != generatedSt_size || (data = /*Error: Function owner not recognized*/malloc(generatedSt_size)) == ((Object)0)) {
					log.log_log(op, "allocation failure");
					return -2;
				} 
				if ((fd = /*Error: Function owner not recognized*/open(generatedPath, 0, 0)) < 0) {
					log.log_log(op, ".add file read failure");
					return -1;
				} 
				ret = (size_t)/*Error: Function owner not recognized*/read(fd, data, len) != len;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
				if (ret) {
					log.log_log(op, ".add file read failure");
					return -1;
				} 
				log.log_log(op, "loaded .add file");
			} else {
					log.log_log(op, "missing .add file!");
			} 
		} 
		switch (/* recover the interrupted operation */op) {
		case 1:
				ret = log.log_append(data, len);
				break;
		case 3:
				ret = log.log_replace();
		case 2:
				ret = log.log_compress(data, len);
				break;
		}
		log.log_log(op, ret ? "failure" : /* log status */"complete");
		if (data != ((Object)/* clean up */0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(data);
		} 
		return ret;
	}
	/* Close the foo.gz file (if open) and release the lock. */
	public void log_close() {
		int generatedFd = this.getFd();
		if (generatedFd >= 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedFd);
		} 
		this.setFd(-1);
		log/* Open foo.gz, verify the header, and load the extra field contents, after
		   first creating the foo.lock file to gain exclusive access to the foo.*
		   files.  If foo.gz does not exist or is empty, then write the initial header,
		   extra, and body content of an empty foo.gz log file.  If there is an error
		   creating the lock file due to access restrictions, or an error reading or
		   writing the foo.gz file, or if the foo.gz file is not a proper log file for
		   this object (e.g. not a gzip file or does not contain the expected extra
		   field), then return true.  If there is an error, the lock is released.
		   Otherwise, the lock is left in place. */.log_unlock();
	}
	public int log_open() {
		int op;
		int generatedFd = this.getFd();
		if (generatedFd >= /* release open file resource if left over -- can occur if lock lost
		       between gzlog_open() and gzlog_write() */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedFd);
		} 
		this.setFd(-1);
		if (log.log_lock() < /* negotiate exclusive access */0) {
			return -1;
		} 
		Byte generatedEnd = this.getEnd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(generatedEnd, /* open the log file, foo.gz */".gz");
		Byte generatedPath = this.getPath();
		this.setFd(/*Error: Function owner not recognized*/open(generatedPath, 2 | -1024, 644));
		if (generatedFd < 0) {
			log.log_close();
			return -1;
		} 
		if (/*Error: Function owner not recognized*/lseek(generatedFd, 0, 2) == /* if new, initialize foo.gz with an empty log, delete old dictionary */0) {
			if (/*Error: Function owner not recognized*/write(generatedFd, ModernizedCProgram.log_gzhead, /*Error: sizeof expression not supported yet*/) != /*Error: sizeof expression not supported yet*/ || /*Error: Function owner not recognized*/write(generatedFd, ModernizedCProgram.log_gzext, /*Error: sizeof expression not supported yet*/) != /*Error: sizeof expression not supported yet*/ || /*Error: Function owner not recognized*/write(generatedFd, ModernizedCProgram.log_gzbody, /*Error: sizeof expression not supported yet*/) != /*Error: sizeof expression not supported yet*/) {
				log.log_close();
				return -1;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(generatedEnd, ".dict");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(generatedPath);
		} 
		if ((op = log.log_head()) < /* verify log file and load extra field information */0) {
			log.log_close();
			return -1;
		} 
		if (op != 0 && log.log_recover(/* check for interrupted process and if so, recover */op)) {
			log.log_close();
			return -1;
		} 
		/* touch the lock file to prevent another process from grabbing it */log.log_touch();
		return 0;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public int getFd() {
		return fd;
	}
	public void setFd(int newFd) {
		fd = newFd;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public Byte getEnd() {
		return end;
	}
	public void setEnd(Byte newEnd) {
		end = newEnd;
	}
	public Object getFirst() {
		return first;
	}
	public void setFirst(Object newFirst) {
		first = newFirst;
	}
	public int getBack() {
		return back;
	}
	public void setBack(int newBack) {
		back = newBack;
	}
	public Object getStored() {
		return stored;
	}
	public void setStored(Object newStored) {
		stored = newStored;
	}
	public Object getLast() {
		return last;
	}
	public void setLast(Object newLast) {
		last = newLast;
	}
	public Object getCcrc() {
		return ccrc;
	}
	public void setCcrc(Object newCcrc) {
		ccrc = newCcrc;
	}
	public Object getClen() {
		return clen;
	}
	public void setClen(Object newClen) {
		clen = newClen;
	}
	public Object getTcrc() {
		return tcrc;
	}
	public void setTcrc(Object newTcrc) {
		tcrc = newTcrc;
	}
	public Object getTlen() {
		return tlen;
	}
	public void setTlen(Object newTlen) {
		tlen = newTlen;
	}
	public Object getLock() {
		return lock;
	}
	public void setLock(Object newLock) {
		lock = newLock;
	}
}
