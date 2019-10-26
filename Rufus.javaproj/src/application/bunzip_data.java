package application;

public class bunzip_data {
	private int inbufBitCount;
	private int inbufBits;
	private int in_fd;
	private int out_fd;
	private int inbufCount;
	private int inbufPos;
	private Object inbuf;
	private int writeCopies;
	private int writePos;
	private int writeRunCountdown;
	private int writeCount;
	private int writeCurrent;
	private Object headerCRC;
	private Object totalCRC;
	private Object writeCRC;
	private Object dbuf;
	private int dbufSize;
	private Object jmpbuf;
	private Object crc32Table;
	private Object selectors;
	private Object groups;
	
	public bunzip_data(int inbufBitCount, int inbufBits, int in_fd, int out_fd, int inbufCount, int inbufPos, Object inbuf, int writeCopies, int writePos, int writeRunCountdown, int writeCount, int writeCurrent, Object headerCRC, Object totalCRC, Object writeCRC, Object dbuf, int dbufSize, Object jmpbuf, Object crc32Table, Object selectors, Object groups) {
		setInbufBitCount(inbufBitCount);
		setInbufBits(inbufBits);
		setIn_fd(in_fd);
		setOut_fd(out_fd);
		setInbufCount(inbufCount);
		setInbufPos(inbufPos);
		setInbuf(inbuf);
		setWriteCopies(writeCopies);
		setWritePos(writePos);
		setWriteRunCountdown(writeRunCountdown);
		setWriteCount(writeCount);
		setWriteCurrent(writeCurrent);
		setHeaderCRC(headerCRC);
		setTotalCRC(totalCRC);
		setWriteCRC(writeCRC);
		setDbuf(dbuf);
		setDbufSize(dbufSize);
		setJmpbuf(jmpbuf);
		setCrc32Table(crc32Table);
		setSelectors(selectors);
		setGroups(groups);
	}
	public bunzip_data() {
	}
	
	/* Return the next nnn bits of input.  All reads from the compressed input
	   are done through this function.  All reads are big endian */
	public int get_bits(int bits_wanted) {
		int bits = 0;
		int generatedInbufBitCount = this.getInbufBitCount();
		int bit_count = generatedInbufBitCount;
		int generatedInbufPos = this.getInbufPos();
		int generatedInbufCount = this.getInbufCount();
		int generatedIn_fd = this.getIn_fd();
		Object generatedInbuf = this.getInbuf();
		Object generatedJmpbuf = this.getJmpbuf();
		int generatedInbufBits = this.getInbufBits();
		while (bit_count < /* If we need to get more data from the byte buffer, do so.  (Loop getting
			   one byte at a time to enforce endianness and avoid unaligned access.) */bits_wanted) {
			if (generatedInbufPos == generatedInbufCount) {
				this.setInbufCount(ModernizedCProgram.full_read(generatedIn_fd, generatedInbuf, /* if "no input fd" case: in_fd == -1, read fails, we jump */4096));
				if (generatedInbufCount <= 0) {
					.longjmp(generatedJmpbuf, ());
				} 
				this.setInbufPos(0);
			} 
			if (bit_count >= /* Avoid 32-bit overflow (dump bit buffer to top of output) */24) {
				bits = generatedInbufBits & ((1 << bit_count) - 1);
				bits_wanted -= bit_count;
				bits <<=  bits_wanted;
				bit_count = 0;
			} 
			this.setInbufBits((generatedInbufBits << 8) | generatedInbuf[generatedInbufPos++]);
			bit_count += 8;
		}
		bit_count -= /* Calculate result */bits_wanted;
		this.setInbufBitCount(bit_count);
		bits |=  (generatedInbufBits >> bit_count) & ((1 << bits_wanted) - 1);
		return bits;
	}
	/* Unpacks the next block and sets up for the inverse Burrows-Wheeler step. */
	public int get_next_block() {
		group_data hufGroup = new group_data();
		int dbufCount;
		int dbufSize;
		int groupCount;
		int base;
		int limit;
		int selector;
		int i;
		int j;
		int t;
		int runPos;
		int symCount;
		int symTotal;
		int nSelectors;
		int[] byteCount = new int[256];
		int runCnt;
		uint8_t uc = new uint8_t();
		uint8_t[] symToByte = new uint8_t();
		uint8_t[] mtfSymbol = new uint8_t();
		uint8_t selectors = new uint8_t();
		uint32_t dbuf = new uint32_t();
		int origPtr;
		Object generatedDbuf = this.getDbuf();
		dbuf = generatedDbuf;
		int generatedDbufSize = this.getDbufSize();
		dbufSize = generatedDbufSize;
		Object generatedSelectors = this.getSelectors();
		selectors = generatedSelectors;
		i = bd.get_bits(/* Read in header signature and CRC, then validate signature.
			   (last block signature means CRC is for whole file, return now) */24);
		j = bd.get_bits(24);
		this.setHeaderCRC(bd.get_bits(32));
		if ((i == -1024) && (j == -1024)) {
			return ();
		} 
		if ((i != -1024) || (j != -1024)) {
			return ();
		} 
		if (bd.get_bits(1)) {
			return ();
		} 
		origPtr = bd.get_bits(24);
		if ((int)origPtr > dbufSize) {
			return ();
		} 
		symTotal = 0;
		i = 0;
		t = bd.get_bits(16);
		do {
			if (t & (1 << 15)) {
				int inner_map = bd.get_bits(16);
				do {
					if (inner_map & (1 << 15)) {
						symToByte[symTotal++] = i;
					} 
					inner_map <<=  1;
					i++;
				} while (i & 15);
				i -= 16;
			} 
			t <<=  1;
			i += 16;
		} while (i < 256);
		groupCount = bd.get_bits(/* How many different Huffman coding groups does this block use? */3);
		if (groupCount < 2 || groupCount > 6) {
			return ();
		} 
		for (i = 0; i < groupCount; i++) {
			mtfSymbol[i] = i;
		}
		nSelectors = bd.get_bits(15);
		if (!nSelectors) {
			return ();
		} 
		for (i = 0; i < nSelectors; i++) {
			uint8_t tmp_byte = new uint8_t();
			int n = /* Get next value */0;
			while (bd.get_bits(1)) {
				if (n >= groupCount) {
					return ();
				} 
				n++;
			}
			tmp_byte = mtfSymbol[/* Decode MTF to get the next selector */n];
			while (--n >= 0) {
				mtfSymbol[n + 1] = mtfSymbol[n];
			}
			mtfSymbol[0] = selectors[i] = tmp_byte;
		}
		symCount = symTotal + /* Read the Huffman coding tables for each group, which code for symTotal
			   literal symbols, plus two run symbols (RUNA, RUNB) */2;
		int generatedInbufBitCount = this.getInbufBitCount();
		Object generatedGroups = this.getGroups();
		Object generatedBase = hufGroup.getBase();
		Object generatedLimit = hufGroup.getLimit();
		Object generatedPermute = hufGroup.getPermute();
		for (j = 0; j < groupCount; j++) {
			uint8_t[] length = new uint8_t();
			int[] temp = new int[20 + /* 8 bits is ALMOST enough for temp[], see below */1];
			int minLen;
			int maxLen;
			int pp;
			int len_m1;
			len_m1 = bd.get_bits(5) - 1;
			for (i = 0; i < symCount; i++) {
				for (; ; ) {
					int two_bits;
					if ((int)len_m1 > (20 - 1)) {
						return ();
					} 
					two_bits = bd.get_bits(2);
					if (two_bits < 2) {
						generatedInbufBitCount++;
						break;
					} 
					len_m1 += (((two_bits + 1) & 2) - /* Add one if second bit 1, else subtract 1.  Avoids if/else */1);
				}
				length[i] = len_m1 + /* Correct for the initial -1, to get the final symbol length */1;
			}
			minLen = maxLen = length[/* Find largest and smallest lengths in this group */0];
			for (i = 1; i < symCount; i++) {
				if (length[i] > maxLen) {
					maxLen = length[i];
				}  else if (length[i] < minLen) {
					minLen = length[i/* Calculate permute[], base[], and limit[] tables from length[].
							 *
							 * permute[] is the lookup table for converting Huffman coded symbols
							 * into decoded symbols.  base[] is the amount to subtract from the
							 * value of a Huffman symbol of a given length when using permute[].
							 *
							 * limit[] indicates the largest numerical value a symbol with a given
							 * number of bits can have.  This is how the Huffman codes can vary in
							 * length: each code with a value>limit[length] needs another bit.
							 */];
				} 
			}
			hufGroup = generatedGroups + j;
			hufGroup.setMinLen(minLen);
			hufGroup.setMaxLen(maxLen/* Note that minLen can't be smaller than 1, so we adjust the base
					   and limit array pointers so we're not always wasting the first
					   entry.  We do this again when using them (during symbol decoding). */);
			base = generatedBase - 1;
			limit = generatedLimit - 1;
			pp = /* Calculate permute[].  Concurently, initialize temp[] and limit[]. */0;
			for (i = minLen; i <= maxLen; i++) {
				int k;
				temp[i] = limit[i] = 0;
				for (k = 0; k < symCount; k++) {
					if (length[k] == i) {
						generatedPermute[pp++] = k;
					} 
				}
			}
			for (i = 0; i < symCount; i++) {
				temp[length[/* Count symbols coded for at each bit length *//* NB: in pathological cases, temp[8] can end ip being 256.
						 * That's why uint8_t is too small for temp[]. */i/* Calculate limit[] (the largest symbol-coding value at each bit
						 * length, which is (previous limit<<1)+symbols at this level), and
						 * base[] (number of symbols to ignore at each bit length, which is
						 * limit minus the cumulative count of symbols coded for already). */]]++;
			}
			pp = t = 0;
			for (i = minLen; i < maxLen; ) {
				int temp_i = temp[i];
				pp += temp_i/* We read the largest possible symbol size and then unget bits
							   after determining how many we need, and those extra bits could
							   be set to anything.  (They're noise from future symbols.)  At
							   each level we're really only interested in the first few bits,
							   so here we set all the trailing to-be-ignored bits to 1 so they
							   don't affect the value>limit[length] comparison. */;
				limit[i] = (pp << (maxLen - i)) - 1;
				pp <<=  1;
				t += temp_i;
				base[++i] = pp - t;
			}
			limit[maxLen] = pp + temp[maxLen] - 1;
			limit[maxLen + 1] = /* Sentinel value for reading next sym. */2147483647;
			base[minLen] = 0/* We've finished reading and digesting the block header.  Now read this
				   block's Huffman coded symbols from the file and undo the Huffman coding
				   and run length encoding, saving the result into dbuf[dbufCount++] = uc */;
		}
		for (i = 0; i < 256; /* Initialize symbol occurrence counters and symbol Move To Front table *//*memset(byteCount, 0, sizeof(byteCount)); - smaller, but slower */i++) {
			byteCount[i] = 0;
			mtfSymbol[i] = (uint8_t)i;
		}
		runPos = dbufCount = selector = /* Loop through compressed symbols. */0;
		j = /* Turn byteCount into cumulative occurrence counts of 0 to n-1. */0;
		for (i = 0; i < 256; i++) {
			int tmp_count = j + byteCount[i];
			byteCount[i] = j;
			j = tmp_count;
		}
		for (i = 0; i < dbufCount; /* Figure out what order dbuf would be in if we sorted it. */i++) {
			uint8_t tmp_byte = (uint8_t)dbuf[i];
			int tmp_count = byteCount[tmp_byte];
			dbuf[tmp_count] |=  (i << 8);
			byteCount[tmp_byte] = tmp_count + 1;
		}
		if (/* Decode first byte by hand to initialize "previous" byte.  Note that it
			   doesn't get output, and if the first three characters are identical
			   it doesn't qualify as a run (hence writeRunCountdown=5). */dbufCount) {
			uint32_t tmp = new uint32_t();
			if ((int)origPtr >= dbufCount) {
				return ();
			} 
			tmp = dbuf[origPtr];
			this.setWriteCurrent((uint8_t)tmp);
			this.setWritePos((tmp >> 8));
			this.setWriteRunCountdown(5);
		} 
		this.setWriteCount(dbufCount);
		return 0/* Undo Burrows-Wheeler transform on intermediate buffer to produce output.
		   If start_bunzip was initialized with out_fd=-1, then up to len bytes of
		   data are written to outbuf.  Return value is number of bytes written or
		   error (all errors are negative numbers).  If out_fd!=-1, outbuf and len
		   are ignored, data is written to out_fd and return is RETVAL_OK or error.
		
		   NB: read_bunzip returns < 0 on error, or the number of *unfilled* bytes
		   in outbuf. IOW: on EOF returns len ("all bytes are not filled"), not 0.
		   (Why? This allows to get rid of one local variable)
		*/;
	}
	public int read_bunzip(Byte outbuf, int len) {
		uint32_t dbuf = new uint32_t();
		int pos;
		int current;
		int previous;
		uint32_t CRC = new uint32_t();
		int generatedWriteCount = this.getWriteCount();
		if (generatedWriteCount < /* If we already have error/end indicator, return it */0) {
			return generatedWriteCount;
		} 
		Object generatedDbuf = this.getDbuf();
		dbuf = generatedDbuf;
		int generatedWritePos = this.getWritePos();
		pos = generatedWritePos;
		int generatedWriteCurrent = this.getWriteCurrent();
		current = generatedWriteCurrent;
		Object generatedWriteCRC = this.getWriteCRC();
		CRC = generatedWriteCRC;
		int generatedWriteCopies = this.getWriteCopies();
		{ 
			int r = /* Refill the intermediate buffer by Huffman-decoding next block of input */bd.get_next_block();
			if (/* error/end */r) {
				this.setWriteCount(r);
				return (r != ()) ? r : len;
			} 
		}
		CRC = ~0;
		pos = generatedWritePos;
		current = generatedWriteCurrent;
		;
		this.setWriteCurrent(current);
		this.setWriteCRC(CRC);
		generatedWriteCopies++;
		return 0/* Allocate the structure, read file header.  If in_fd==-1, inbuf must contain
		   a complete bunzip file (len bytes long).  If in_fd!=-1, inbuf and len are
		   ignored, and data is read from file handle into temporary buffer. */;
	}
	/* Because bunzip2 is used for help text unpacking, and because bb_show_usage()
	   should work for NOFORK applets too, we must be extremely careful to not leak
	   any allocations! */
	public int start_bunzip(int in_fd, Object inbuf, int len) {
		bunzip_data bd = new bunzip_data();
		int i;
		i = /* Figure out how much data to allocate */;
		if (in_fd != -1) {
			i += 4096;
		} 
		bd = bdp = .calloc(i, /* Allocate bunzip_data.  Most fields initialize to zero. */1);
		bd.setIn_fd(/* Setup input buffer */in_fd);
		Object generatedInbuf = bd.getInbuf();
		if (-1 == in_fd) {
			bd.setInbuf((Object)/* in this case, bd->inbuf is read-only *//* cast away const-ness */inbuf);
		} else {
				bd.setInbuf((uint8_t)(bd + 1));
				.memcpy(generatedInbuf, inbuf, len);
		} 
		bd.setInbufCount(len);
		Object generatedCrc32Table = bd.getCrc32Table();
		ModernizedCProgram.crc32_filltable(generatedCrc32Table, /* Init the CRC32 table (big endian) */1);
		Object generatedJmpbuf = bd.getJmpbuf();
		i = ._setjmp(generatedJmpbuf);
		if (i) {
			return i/* Ensure that file starts with "BZh['1'-'9']." *//* Update: now caller verifies 1st two bytes, makes .gz/.bz2
				 * integration easier */;
		} 
		i = bd.get_bits(/* was: *//* i = get_bits(bd, 32); *//* if ((unsigned)(i - BZh0 - 1) >= 9) return RETVAL_NOT_BZIP_DATA; */16);
		if ((int)(i - .h0 - 1) >= 9) {
			return ();
		} 
		bd.setDbufSize(100000 * (i - /* bd->dbufSize = 100000 * (i - BZh0); */.h0));
		int generatedDbufSize = bd.getDbufSize();
		Object generatedDbuf = bd.getDbuf();
		bd.setDbuf(.malloc(generatedDbufSize * ));
		if (!generatedDbuf) {
			.free(bd);
			.longjmp(ModernizedCProgram.bb_error_jmp, 1);
		} 
		return 0;
	}
	public void dealloc_bunzip() {
		Object generatedDbuf = this.getDbuf();
		.free(generatedDbuf);
		.free(bd);
	}
	public int getInbufBitCount() {
		return inbufBitCount;
	}
	public void setInbufBitCount(int newInbufBitCount) {
		inbufBitCount = newInbufBitCount;
	}
	public int getInbufBits() {
		return inbufBits;
	}
	public void setInbufBits(int newInbufBits) {
		inbufBits = newInbufBits;
	}
	public int getIn_fd() {
		return in_fd;
	}
	public void setIn_fd(int newIn_fd) {
		in_fd = newIn_fd;
	}
	public int getOut_fd() {
		return out_fd;
	}
	public void setOut_fd(int newOut_fd) {
		out_fd = newOut_fd;
	}
	public int getInbufCount() {
		return inbufCount;
	}
	public void setInbufCount(int newInbufCount) {
		inbufCount = newInbufCount;
	}
	public int getInbufPos() {
		return inbufPos;
	}
	public void setInbufPos(int newInbufPos) {
		inbufPos = newInbufPos;
	}
	public Object getInbuf() {
		return inbuf;
	}
	public void setInbuf(Object newInbuf) {
		inbuf = newInbuf;
	}
	public int getWriteCopies() {
		return writeCopies;
	}
	public void setWriteCopies(int newWriteCopies) {
		writeCopies = newWriteCopies;
	}
	public int getWritePos() {
		return writePos;
	}
	public void setWritePos(int newWritePos) {
		writePos = newWritePos;
	}
	public int getWriteRunCountdown() {
		return writeRunCountdown;
	}
	public void setWriteRunCountdown(int newWriteRunCountdown) {
		writeRunCountdown = newWriteRunCountdown;
	}
	public int getWriteCount() {
		return writeCount;
	}
	public void setWriteCount(int newWriteCount) {
		writeCount = newWriteCount;
	}
	public int getWriteCurrent() {
		return writeCurrent;
	}
	public void setWriteCurrent(int newWriteCurrent) {
		writeCurrent = newWriteCurrent;
	}
	public Object getHeaderCRC() {
		return headerCRC;
	}
	public void setHeaderCRC(Object newHeaderCRC) {
		headerCRC = newHeaderCRC;
	}
	public Object getTotalCRC() {
		return totalCRC;
	}
	public void setTotalCRC(Object newTotalCRC) {
		totalCRC = newTotalCRC;
	}
	public Object getWriteCRC() {
		return writeCRC;
	}
	public void setWriteCRC(Object newWriteCRC) {
		writeCRC = newWriteCRC;
	}
	public Object getDbuf() {
		return dbuf;
	}
	public void setDbuf(Object newDbuf) {
		dbuf = newDbuf;
	}
	public int getDbufSize() {
		return dbufSize;
	}
	public void setDbufSize(int newDbufSize) {
		dbufSize = newDbufSize;
	}
	public Object getJmpbuf() {
		return jmpbuf;
	}
	public void setJmpbuf(Object newJmpbuf) {
		jmpbuf = newJmpbuf;
	}
	public Object getCrc32Table() {
		return crc32Table;
	}
	public void setCrc32Table(Object newCrc32Table) {
		crc32Table = newCrc32Table;
	}
	public Object getSelectors() {
		return selectors;
	}
	public void setSelectors(Object newSelectors) {
		selectors = newSelectors;
	}
	public Object getGroups() {
		return groups;
	}
	public void setGroups(Object newGroups) {
		groups = newGroups;
	}
}
/* I/O tracking data (file handles, buffers, positions, etc.) */
