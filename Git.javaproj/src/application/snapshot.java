package application;

public class snapshot {
	private packed_ref_store refs;
	private int mmapped;
	private Byte buf;
	private Byte start;
	private Byte eof;
	private  peeled;
	private int referrers;
	private stat_validity validity;
	
	public snapshot(packed_ref_store refs, int mmapped, Byte buf, Byte start, Byte eof,  peeled, int referrers, stat_validity validity) {
		setRefs(refs);
		setMmapped(mmapped);
		setBuf(buf);
		setStart(start);
		setEof(eof);
		setPeeled(peeled);
		setReferrers(referrers);
		setValidity(validity);
	}
	public snapshot() {
	}
	
	public void acquire_snapshot() {
		int generatedReferrers = this.getReferrers();
		generatedReferrers++;
	}
	public void clear_snapshot_buffer() {
		int generatedMmapped = this.getMmapped();
		Byte generatedBuf = this.getBuf();
		Byte generatedEof = this.getEof();
		packed_ref_store generatedRefs = this.getRefs();
		Byte generatedPath = generatedRefs.getPath();
		if (generatedMmapped) {
			if (/*Error: Function owner not recognized*/munmap(generatedBuf, generatedEof - generatedBuf)) {
				ModernizedCProgram.die_errno("error ummapping packed-refs file %s", generatedPath);
			} 
			this.setMmapped(0);
		} else {
				ModernizedCProgram.free(generatedBuf);
		} 
		this.setBuf(this.setStart(this.setEof(((Object)0/*
		 * Decrease the reference count of `*snapshot`. If it goes to zero,
		 * free `*snapshot` and return true; otherwise return false.
		 */))));
	}
	public int release_snapshot() {
		int generatedReferrers = this.getReferrers();
		stat_validity generatedValidity = this.getValidity();
		if (!--generatedReferrers) {
			generatedValidity.stat_validity_clear();
			snapshot.clear_snapshot_buffer();
			ModernizedCProgram.free(snapshot);
			return 1;
		} else {
				return 0;
		} 
	}
	public void sort_snapshot() {
		snapshot_record records = ((Object)0);
		size_t alloc = 0;
		size_t nr = 0;
		int sorted = 1;
		byte pos;
		byte eof;
		byte eol;
		size_t len = new size_t();
		size_t i = new size_t();
		byte new_buffer;
		byte dst;
		Byte generatedStart = this.getStart();
		pos = generatedStart;
		Byte generatedEof = this.getEof();
		eof = generatedEof;
		if (pos == eof) {
			return /*Error: Unsupported expression*/;
		} 
		len = eof - pos/*
			 * Initialize records based on a crude estimate of the number
			 * of references in the file (we'll grow it below if needed):
			 */;
		do {
			if ((len / 80 + 20) > alloc) {
				if ((((alloc) + 16) * 3 / 2) < (len / 80 + 20)) {
					alloc = (len / 80 + 20);
				} else {
						alloc = (((alloc) + 16) * 3 / 2);
				} 
				(records) = ModernizedCProgram.xrealloc((records), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (alloc)));
			} 
		} while (0);
		packed_ref_store generatedRefs = this.getRefs();
		Byte generatedPath = generatedRefs.getPath();
		while (pos < eof) {
			eol = /*Error: Function owner not recognized*/memchr(pos, (byte)'\n', eof - pos);
			if (!eol) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\packed-backend.c", 346, /* The safety check should prevent this. */"unterminated line found in packed-refs");
			} 
			if (eol - pos < ModernizedCProgram.the_repository.getHash_algo().getHexsz() + 2) {
				ModernizedCProgram.die_invalid_line(generatedPath, pos, eof - pos);
			} 
			eol++;
			if (eol < eof && eol == (byte)'^'/*
						 * Keep any peeled line together with its
						 * reference:
						 */) {
				byte peeled_start = eol;
				eol = /*Error: Function owner not recognized*/memchr(peeled_start, (byte)'\n', eof - peeled_start);
				if (!eol) {
					ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\packed-backend.c", 361, /* The safety check should prevent this. */"unterminated peeled line found in packed-refs");
				} 
				eol++;
			} 
			do {
				if ((nr + 1) > alloc) {
					if ((((alloc) + 16) * 3 / 2) < (nr + 1)) {
						alloc = (nr + 1);
					} else {
							alloc = (((alloc) + 16) * 3 / 2);
					} 
					(records) = ModernizedCProgram.xrealloc((records), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (alloc)));
				} 
			} while (0);
			records[nr].setStart(pos);
			records[nr].setLen(eol - pos);
			nr++;
			if (sorted && nr > 1 && ModernizedCProgram.cmp_packed_ref_records(records[nr - 2], records[nr - 1]) >= 0) {
				sorted = 0;
			} 
			pos = eol;
		}
		if (sorted) {
			;
		} 
		ModernizedCProgram.sane_qsort((records), (nr), /*Error: sizeof expression not supported yet*/, /* We need to sort the memory. First we sort the records array: */cmp_packed_ref_records/*
			 * Allocate a new chunk of memory, and copy the old memory to
			 * the new in the order indicated by `records` (not bothering
			 * with the header line):
			 */);
		new_buffer = ModernizedCProgram.xmalloc(len);
		for (; i < nr; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(dst, generatedStart, records[i].getLen());
			dst += records[i].getLen();
		}
		snapshot.clear_snapshot_buffer();
		this.setBuf(this.setStart(new_buffer));
		this.setEof(new_buffer + len);
	}
	public void verify_buffer_safe() {
		Byte generatedStart = this.getStart();
		byte start = generatedStart;
		Byte generatedEof = this.getEof();
		byte eof = generatedEof;
		byte last_line;
		if (start == eof) {
			return /*Error: Unsupported expression*/;
		} 
		last_line = ModernizedCProgram.find_start_of_record(start, eof - 1);
		packed_ref_store generatedRefs = this.getRefs();
		Byte generatedPath = generatedRefs.getPath();
		if ((eof - 1) != (byte)'\n' || eof - last_line < ModernizedCProgram.the_repository.getHash_algo().getHexsz() + 2) {
			ModernizedCProgram.die_invalid_line(generatedPath, last_line, eof - last_line/*
			 * Depending on `mmap_strategy`, either mmap or read the contents of
			 * the `packed-refs` file into the snapshot. Return 1 if the file
			 * existed and was read, or 0 if the file was absent or empty. Die on
			 * errors.
			 */);
		} 
	}
	public int load_contents() {
		int fd;
		stat st = new stat();
		size_t size = new size_t();
		ssize_t bytes_read = new ssize_t();
		packed_ref_store generatedRefs = this.getRefs();
		Byte generatedPath = generatedRefs.getPath();
		fd = /*Error: Function owner not recognized*/open(generatedPath, 0);
		if (fd < 0) {
			if ((/*Error: Function owner not recognized*/_errno()) == 2/*
						 * This is OK; it just means that no
						 * "packed-refs" file has been written yet,
						 * which is equivalent to it being empty,
						 * which is its state when initialized with
						 * zeros.
						 */) {
				return 0;
			} else {
					ModernizedCProgram.die_errno("couldn't read %s", generatedPath);
			} 
		} 
		stat_validity generatedValidity = this.getValidity();
		generatedValidity.stat_validity_update(fd);
		if (/*Error: Function owner not recognized*/fstat(fd, st) < 0) {
			ModernizedCProgram.die_errno("couldn't stat %s", generatedPath);
		} 
		Object generatedSt_size = st.getSt_size();
		size = ModernizedCProgram.xsize_t(generatedSt_size);
		Byte generatedBuf = this.getBuf();
		if (!size) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
			return 0;
		}  else if (mmap_strategy.mmap_strategy == mmap_strategy.MMAP_NONE || size <= (32 * 1024)) {
			this.setBuf(ModernizedCProgram.xmalloc(size));
			bytes_read = ModernizedCProgram.read_in_full(fd, generatedBuf, size);
			if (bytes_read < 0 || bytes_read != size) {
				ModernizedCProgram.die_errno("couldn't read %s", generatedPath);
			} 
			this.setMmapped(0);
		} else {
				this.setBuf(ModernizedCProgram.xmmap(((Object)0), size, PROT_READ, MAP_PRIVATE, fd, 0));
				this.setMmapped(1);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
		this.setStart(generatedBuf);
		this.setEof(generatedBuf + size);
		return 1/*
		 * Find the place in `snapshot->buf` where the start of the record for
		 * `refname` starts. If `mustexist` is true and the reference doesn't
		 * exist, then return NULL. If `mustexist` is false and the reference
		 * doesn't exist, then return the point where that reference would be
		 * inserted, or `snapshot->eof` (which might be NULL) if it would be
		 * inserted at the end of the file. In the latter mode, `refname`
		 * doesn't have to be a proper reference name; for example, one could
		 * search for "refs/replace/" to find the start of any replace
		 * references.
		 *
		 * The record is sought using a binary search, so `snapshot->buf` must
		 * be sorted.
		 */;
	}
	public Object find_reference_location(Object refname, int mustexist) {
		Byte generatedStart = this.getStart();
		byte lo = generatedStart;
		Byte generatedEof = this.getEof();
		byte hi = generatedEof;
		while (lo != hi) {
			byte mid;
			byte rec;
			int cmp;
			mid = lo + (hi - lo) / 2;
			rec = ModernizedCProgram.find_start_of_record(lo, mid);
			cmp = ModernizedCProgram.cmp_record_to_refname(rec, refname);
			if (cmp < 0) {
				lo = ModernizedCProgram.find_end_of_record(mid, hi);
			}  else if (cmp > 0) {
				hi = rec;
			} else {
					return rec;
			} 
		}
		if (mustexist) {
			return ((Object)0);
		} else {
				return lo/*
				 * Create a newly-allocated `snapshot` of the `packed-refs` file in
				 * its current state and return it. The return value will already have
				 * its reference count incremented.
				 *
				 * A comment line of the form "# pack-refs with: " may contain zero or
				 * more traits. We interpret the traits as follows:
				 *
				 *   Neither `peeled` nor `fully-peeled`:
				 *
				 *      Probably no references are peeled. But if the file contains a
				 *      peeled value for a reference, we will use it.
				 *
				 *   `peeled`:
				 *
				 *      References under "refs/tags/", if they *can* be peeled, *are*
				 *      peeled in this file. References outside of "refs/tags/" are
				 *      probably not peeled even if they could have been, but if we find
				 *      a peeled value for such a reference we will use it.
				 *
				 *   `fully-peeled`:
				 *
				 *      All references in the file that can be peeled are peeled.
				 *      Inversely (and this is more important), any references in the
				 *      file for which no peeled value is recorded is not peelable. This
				 *      trait should typically be written alongside "peeled" for
				 *      compatibility with older clients, but we do not require it
				 *      (i.e., "peeled" is a no-op if "fully-peeled" is set).
				 *
				 *   `sorted`:
				 *
				 *      The references in this file are known to be sorted by refname.
				 */;
		} 
	}
	/*
		 * This is not *quite* a garden-variety binary search, because
		 * the data we're searching is made up of records, and we
		 * always need to find the beginning of a record to do a
		 * comparison. A "record" here is one line for the reference
		 * itself and zero or one peel lines that start with '^'. Our
		 * loop invariant is described in the next two comments.
		 */
	public snapshot create_snapshot(packed_ref_store refs) {
		snapshot snapshot = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
		int sorted = 0;
		snapshot.setRefs(refs);
		snapshot.acquire_snapshot();
		snapshot.setPeeled(.PEELED_NONE);
		if (!snapshot.load_contents()) {
			return snapshot;
		} 
		Byte generatedBuf = snapshot.getBuf();
		Byte generatedEof = snapshot.getEof();
		Byte generatedPath = refs.getPath();
		if (generatedBuf < generatedEof && generatedBuf == /* If the file has a header line, process it: */(byte)'#') {
			byte tmp;
			byte p;
			byte eol;
			string_list traits = new string_list(((Object)0), 0, 0, 0, ((Object)0));
			eol = /*Error: Function owner not recognized*/memchr(generatedBuf, (byte)'\n', generatedEof - generatedBuf);
			if (!eol) {
				ModernizedCProgram.die_unterminated_line(generatedPath, generatedBuf, generatedEof - generatedBuf);
			} 
			tmp = ModernizedCProgram.xmemdupz(generatedBuf, eol - generatedBuf);
			if (!ModernizedCProgram.skip_prefix(tmp, "# pack-refs with:", (byte)p)) {
				ModernizedCProgram.die_invalid_line(generatedPath, generatedBuf, generatedEof - generatedBuf);
			} 
			traits.string_list_split_in_place(p, (byte)' ', -1);
			if (traits.unsorted_string_list_has_string("fully-peeled")) {
				snapshot.setPeeled(.PEELED_FULLY);
			}  else if (traits.unsorted_string_list_has_string("peeled")) {
				snapshot.setPeeled(.PEELED_TAGS);
			} 
			sorted = traits.unsorted_string_list_has_string("sorted"/* perhaps other traits later as well */);
			snapshot.setStart(eol + /* The "+ 1" is for the LF character. */1);
			traits.string_list_clear(0);
			ModernizedCProgram.free(tmp);
		} 
		snapshot.verify_buffer_safe();
		if (!sorted) {
			snapshot/*
					 * Reordering the records might have moved a short one
					 * to the end of the buffer, so verify the buffer's
					 * safety again:
					 */.sort_snapshot();
			snapshot.verify_buffer_safe();
		} 
		int generatedMmapped = snapshot.getMmapped();
		Byte generatedStart = snapshot.getStart();
		if (mmap_strategy.mmap_strategy != mmap_strategy.MMAP_OK && generatedMmapped) {
			size_t size = generatedEof - generatedStart;
			byte buf_copy = ModernizedCProgram.xmalloc(size);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf_copy, generatedStart, size);
			snapshot.clear_snapshot_buffer();
			snapshot.setBuf(snapshot.setStart(buf_copy));
			snapshot.setEof(buf_copy + size);
		} 
		return snapshot/*
		 * Check that `refs->snapshot` (if present) still reflects the
		 * contents of the `packed-refs` file. If not, clear the snapshot.
		 */;
	}
	public snapshot get_snapshot(packed_ref_store refs) {
		lock_file generatedLock = refs.getLock();
		if (!generatedLock.is_lock_file_locked()) {
			refs.validate_snapshot();
		} 
		snapshot generatedSnapshot = refs.getSnapshot();
		snapshot snapshot = new snapshot();
		if (!generatedSnapshot) {
			refs.setSnapshot(snapshot.create_snapshot(refs));
		} 
		return generatedSnapshot;
	}
	public packed_ref_store getRefs() {
		return refs;
	}
	public void setRefs(packed_ref_store newRefs) {
		refs = newRefs;
	}
	public int getMmapped() {
		return mmapped;
	}
	public void setMmapped(int newMmapped) {
		mmapped = newMmapped;
	}
	public Byte getBuf() {
		return buf;
	}
	public void setBuf(Byte newBuf) {
		buf = newBuf;
	}
	public Byte getStart() {
		return start;
	}
	public void setStart(Byte newStart) {
		start = newStart;
	}
	public Byte getEof() {
		return eof;
	}
	public void setEof(Byte newEof) {
		eof = newEof;
	}
	public  getPeeled() {
		return peeled;
	}
	public void setPeeled( newPeeled) {
		peeled = newPeeled;
	}
	public int getReferrers() {
		return referrers;
	}
	public void setReferrers(int newReferrers) {
		referrers = newReferrers;
	}
	public stat_validity getValidity() {
		return validity;
	}
	public void setValidity(stat_validity newValidity) {
		validity = newValidity;
	}
}
/*
	 * A back-pointer to the packed_ref_store with which this
	 * snapshot is associated:
	 */
/*
	 * Lock used for the "packed-refs" file. Note that this (and
	 * thus the enclosing `packed_ref_store`) must not be freed.
	 */
