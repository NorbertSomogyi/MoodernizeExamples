package application;

public class z_stream_s {
	private Object[] next_in;
	private Object avail_in;
	private Object total_in;
	private Object next_out;
	private Object avail_out;
	private Object total_out;
	private Byte msg;
	private internal_state state;
	private Object zalloc;
	private Object zfree;
	private Object opaque;
	private int data_type;
	private Object adler;
	private Object reserved;
	
	public z_stream_s(Object[] next_in, Object avail_in, Object total_in, Object next_out, Object avail_out, Object total_out, Byte msg, internal_state state, Object zalloc, Object zfree, Object opaque, int data_type, Object adler, Object reserved) {
		setNext_in(next_in);
		setAvail_in(avail_in);
		setTotal_in(total_in);
		setNext_out(next_out);
		setAvail_out(avail_out);
		setTotal_out(total_out);
		setMsg(msg);
		setState(state);
		setZalloc(zalloc);
		setZfree(zfree);
		setOpaque(opaque);
		setData_type(data_type);
		setAdler(adler);
		setReserved(reserved);
	}
	public z_stream_s() {
	}
	
	public int gzscan(Byte name, int level) {
		int ret;
		int lastbit;
		int left;
		int full;
		int have;
		long crc;
		long tot;
		Byte window;
		off_t lastoff = new off_t();
		off_t end = new off_t();
		file gz = new file();
		gz.setName(/* open gzip file */name);
		gz.setFd(/*Error: Function owner not recognized*/open(name, 2, 0));
		Object generatedFd = gz.getFd();
		if (generatedFd == -1) {
			ModernizedCProgram.bye("cannot open ", name);
		} 
		gz.setBuf(/*Error: Function owner not recognized*/malloc((-1024 << 14)));
		Object generatedBuf = gz.getBuf();
		if (generatedBuf == (null)) {
			ModernizedCProgram.bye("out of memory", "");
		} 
		gz.setSize(14);
		gz.setLeft(0);
		/* skip gzip header */gz.gzheader();
		window = /*Error: Function owner not recognized*/malloc(/* prepare to decompress */-1024);
		if (window == (null)) {
			ModernizedCProgram.bye("out of memory", "");
		} 
		this.setZalloc(0);
		this.setZfree(0);
		this.setOpaque(0);
		ret = ModernizedCProgram.inflateInit2_((strm), (true), "1.2.11", (int)/*Error: Unsupported expression*/);
		if (ret != 0) {
			ModernizedCProgram.bye("out of memory", " or library mismatch");
		} 
		lastbit = /* decompress the deflate stream, saving append information */0;
		Object generatedLeft = gz.getLeft();
		lastoff = /*Error: Function owner not recognized*/lseek(generatedFd, -1024, 1) - generatedLeft;
		left = 0;
		this.setAvail_in(generatedLeft);
		Object generatedNext = gz.getNext();
		this.setNext_in(generatedNext);
		crc = ModernizedCProgram.crc32(-1024, 0, 0);
		have = full = 0;
		Object generatedAvail_in = this.getAvail_in();
		Object generatedAvail_out = this.getAvail_out();
		int generatedData_type = this.getData_type();
		do {
			if (generatedAvail_in == /* if needed, get more input */0) {
				gz.readmore();
				this.setAvail_in(generatedLeft);
				this.setNext_in(generatedNext);
			} 
			this.setAvail_out(-1024 - /* set up output to next available section of sliding window */have);
			this.setNext_out(window + have);
			ret = ModernizedCProgram.inflate(strm, /* inflate and check for errors */5);
			if (ret == (true)) {
				ModernizedCProgram.bye("internal stream error!", "");
			} 
			if (ret == (true)) {
				ModernizedCProgram.bye("out of memory", "");
			} 
			if (ret == (true)) {
				ModernizedCProgram.bye("invalid compressed data--format violated in", name);
			} 
			crc = ModernizedCProgram.crc32(crc, window + have, -1024 - have - generatedAvail_out);
			if (generatedAvail_out) {
				have = -1024 - generatedAvail_out;
			} else {
					have = 0;
					full = 1;
			} 
			if (generatedData_type & /* process end of block */128) {
				if (generatedData_type & 64) {
					left = generatedData_type & -1024;
				} else {
						lastbit = generatedData_type & -1024;
						lastoff = /*Error: Function owner not recognized*/lseek(generatedFd, -1024, 1) - generatedAvail_in;
				} 
			} 
		} while (ret != 1);
		ModernizedCProgram.inflateEnd(strm);
		gz.setLeft(generatedAvail_in);
		Object[] generatedNext_in = this.getNext_in();
		gz.setNext(generatedNext_in);
		end = /*Error: Function owner not recognized*/lseek(generatedFd, -1024, 1) - generatedLeft;
		if (crc != /* check gzip trailer and save total for deflate */gz.read4()) {
			ModernizedCProgram.bye("invalid compressed data--crc mismatch in ", name);
		} 
		Object generatedTotal_out = this.getTotal_out();
		tot = generatedTotal_out;
		if ((tot & -1024) != gz.read4()) {
			ModernizedCProgram.bye("invalid compressed data--length mismatch in", name);
		} 
		if (generatedLeft || /* if not at end of file, warn */gz.readin()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gzappend warning: junk at end of gzip file overwritten\n");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lseek(generatedFd, lastoff - (lastbit != 0), /* clear last block bit */0);
		if (/*Error: Function owner not recognized*/read(generatedFd, generatedBuf, 1) != 1) {
			ModernizedCProgram.bye("reading after seek on ", name);
		} 
		generatedBuf = (byte)(generatedBuf ^ (1 << ((8 - lastbit) & 7)));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lseek(generatedFd, --1024, 1);
		if (/*Error: Function owner not recognized*/write(generatedFd, generatedBuf, 1) != 1) {
			ModernizedCProgram.bye("writing after seek to ", name);
		} 
		if (/* if window wrapped, build dictionary from window by rotating */full) {
			ModernizedCProgram.rotate(window, -1024, have);
			have = -1024;
		} 
		ret = ModernizedCProgram.deflateInit2_((strm), (level), (true), (true), (true), (false), "1.2.11", (int)/*Error: Unsupported expression*//* set up deflate stream with window, crc, total_in, and leftover bits */);
		if (ret != 0) {
			ModernizedCProgram.bye("out of memory", "");
		} 
		ModernizedCProgram.deflateSetDictionary(strm, window, have);
		this.setAdler(crc);
		this.setTotal_in(tot);
		if (left) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lseek(generatedFd, --end, 0);
			if (/*Error: Function owner not recognized*/read(generatedFd, generatedBuf, 1) != 1) {
				ModernizedCProgram.bye("reading after seek on ", name);
			} 
			ModernizedCProgram.deflatePrime(strm, 8 - left, generatedBuf);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lseek(generatedFd, end, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(/* clean up and return */window);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedBuf);
		return generatedFd;
	}
	/* append file "name" to gzip file gd using deflate stream strm -- if last
	   is true, then finish off the deflate stream at the end */
	public void gztack(Byte name, int gd, int last) {
		int fd;
		int len;
		int ret;
		int left;
		Byte in;
		byte[] out;
		fd = /* open file to compress and append */0;
		if (name != (null)) {
			fd = /*Error: Function owner not recognized*/open(name, 0, 0);
			if (fd == -1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gzappend warning: %s not found, skipping ...\n", name);
			} 
		} 
		in = /*Error: Function owner not recognized*/malloc((-1024 << /* allocate buffers */14));
		out = /*Error: Function owner not recognized*/malloc((-1024 << 14));
		if (in == (null) || out == (null)) {
			ModernizedCProgram.bye("out of memory", "");
		} 
		Object generatedAdler = this.getAdler();
		Object generatedAvail_out = this.getAvail_out();
		/* compress input file and append to gzip file */do {
			len = /*Error: Function owner not recognized*/read(fd, in, (-1024 << /* get more input */14));
			if (len == -1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gzappend warning: error reading %s, skipping rest ...\n", name);
				len = 0;
			} 
			this.setAvail_in((int)len);
			this.setNext_in(in);
			if (len) {
				this.setAdler(ModernizedCProgram.crc32(generatedAdler, in, (int)len));
			} 
			do {
				this.setAvail_out((-1024 << 14));
				this.setNext_out(out);
				ret = ModernizedCProgram.deflate(strm, last && len == 0 ? 4 : 0);
				left = (-1024 << 14) - generatedAvail_out;
				while (left) {
					len = /*Error: Function owner not recognized*/write(gd, out + (-1024 << 14) - generatedAvail_out - left, left);
					if (len == -1) {
						ModernizedCProgram.bye("writing gzip file", "");
					} 
					left -= (int)len;
				}
			} while (generatedAvail_out == 0 && ret != 1);
		} while (len != 0);
		Object generatedTotal_in = this.getTotal_in();
		if (/* write trailer after last entry */last) {
			ModernizedCProgram.deflateEnd(strm);
			out[0] = (byte)(generatedAdler);
			out[1] = (byte)(generatedAdler >> 8);
			out[2] = (byte)(generatedAdler >> 16);
			out[3] = (byte)(generatedAdler >> 24);
			out[4] = (byte)(generatedTotal_in);
			out[5] = (byte)(generatedTotal_in >> 8);
			out[6] = (byte)(generatedTotal_in >> 16);
			out[7] = (byte)(generatedTotal_in >> 24);
			len = 8;
			do {
				ret = /*Error: Function owner not recognized*/write(gd, out + 8 - len, len);
				if (ret == -1) {
					ModernizedCProgram.bye("writing gzip file", "");
				} 
				len -= ret;
			} while (len);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(gd);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(/* clean up and return */out);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(in);
		if (fd > 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd/* process the compression level option if present, scan the gzip file, and
			   append the specified files, or append the data from stdin if no other file
			   names are provided on the command line -- the gzip file must be writable
			   and seekable */);
		} 
	}
	/* set up a controlled memory allocation space for monitoring, set the stream
	   parameters to the controlled routines, with opaque pointing to the space */
	public void mem_setup() {
		mem_zone zone = new mem_zone();
		zone = /*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/);
		((zone != (null)) ? null : /*Error: Function owner not recognized*/_assert("zone != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Hashcat\\src\\infcover.c", 163));
		zone.setFirst((null));
		zone.setTotal(0);
		zone.setHighwater(0);
		zone.setLimit(0);
		zone.setNotlifo(0);
		zone.setRogue(0);
		this.setOpaque(zone);
		this.setZalloc(mem_alloc);
		this.setZfree(mem_free);
	}
	/* set a limit on the total memory allocation, or 0 to remove the limit */
	public void mem_limit(Object limit) {
		Object generatedOpaque = this.getOpaque();
		mem_zone zone = generatedOpaque;
		zone.setLimit(limit);
	}
	/* show the current total requested allocations in bytes */
	public void mem_used(Byte prefix) {
		Object generatedOpaque = this.getOpaque();
		mem_zone zone = generatedOpaque;
		Object generatedTotal = zone.getTotal();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: %lu allocated\n", prefix, generatedTotal);
	}
	/* show the high water allocation in bytes */
	public void mem_high(Byte prefix) {
		Object generatedOpaque = this.getOpaque();
		mem_zone zone = generatedOpaque;
		Object generatedHighwater = zone.getHighwater();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: %lu high water mark\n", prefix, generatedHighwater);
	}
	/* release the memory allocation zone -- if there are any surprises, notify */
	public void mem_done(Byte prefix) {
		int count = 0;
		mem_item item = new mem_item();
		mem_item next = new mem_item();
		Object generatedOpaque = this.getOpaque();
		mem_zone zone = generatedOpaque;
		strm.mem_high(/* show high water mark */prefix);
		mem_item generatedFirst = zone.getFirst();
		item = generatedFirst;
		Object generatedPtr = item.getPtr();
		mem_item generatedNext = item.getNext();
		while (item != (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedPtr);
			next = generatedNext;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(item);
			item = next;
			count++;
		}
		Object generatedTotal = zone.getTotal();
		if (count || generatedTotal) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "** %s: %lu bytes in %d blocks not freed\n", prefix, generatedTotal, count);
		} 
		int generatedNotlifo = zone.getNotlifo();
		if (generatedNotlifo) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "** %s: %d frees not LIFO\n", prefix, generatedNotlifo);
		} 
		int generatedRogue = zone.getRogue();
		if (generatedRogue) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "** %s: %d frees not recognized\n", prefix, generatedRogue);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(/* free the zone and delete from the stream */zone);
		this.setOpaque(0);
		this.setZalloc(0);
		this.setZfree(0/* -- inflate test routines -- *//* Decode a hexadecimal string, set *len to length, in[] to the bytes.  This
		   decodes liberally, in that hex digits can be adjacent, in which case two in
		   a row writes a byte.  Or they can be delimited by any non-hex character,
		   where the delimiters are ignored except when a single hex digit is followed
		   by a delimiter, where that single digit writes a byte.  The returned data is
		   allocated and must eventually be freed.  NULL is returned if out of memory.
		   If the length is not needed, then len can be NULL. */);
	}
	/* infback9.c -- inflate deflate64 data using a call-back interface
	 * Copyright (C) 1995-2008 Mark Adler
	 * For conditions of distribution and use, see copyright notice in zlib.h
	 */
	/*
	   strm provides memory allocation functions in zalloc and zfree, or
	   Z_NULL to use the library memory allocation functions.
	
	   window is a user-supplied window and output buffer that is 64K bytes.
	 */
	public int inflateBack9Init_(Byte window, Object[] version, int stream_size) {
		inflate_state state = new inflate_state();
		if (version == 0 || version[0] != "1.2.11"[0] || stream_size != (int)(/*Error: Unsupported expression*/)) {
			return (true);
		} 
		if (strm == 0 || window == 0) {
			return (true);
		} 
		this.setMsg(/* in case we return an error */0);
		Object generatedZalloc = this.getZalloc();
		if (generatedZalloc == (alloc_func)0) {
			this.setZalloc(ModernizedCProgram.zcalloc);
			this.setOpaque((voidpf)0);
		} 
		Object generatedZfree = this.getZfree();
		if (generatedZfree == (free_func)0) {
			this.setZfree(ModernizedCProgram.zcfree);
		} 
		Object generatedOpaque = (strm).getOpaque();
		state = (inflate_state)/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedOpaque, (true), (/*Error: Unsupported expression*/));
		if (state == 0) {
			return (true);
		} 
		;
		this.setState((voidpf)state);
		state.setWindow(window);
		return 0/*
		   Build and output length and distance decoding tables for fixed code
		   decoding.
		 */;
	}
	/* literal/length table */
	/* distance table */
	/* write tables */
	/* MAKEFIXED */
	/* Macros for inflateBack(): */
	/* Clear the input bit accumulator */
	/* Assure that some input is available.  If input is requested, but denied,
	   then return a Z_BUF_ERROR from inflateBack(). */
	/* Get a byte of input into the bit accumulator, or return from inflateBack()
	   with an error if there is no input available. */
	/* Assure that there are at least n bits in the bit accumulator.  If there is
	   not enough available input to do that, then return from inflateBack() with
	   an error. */
	/* Return the low n bits of the bit accumulator (n <= 16) */
	/* Remove n bits from the bit accumulator */
	/* Remove zero to seven bits as needed to go to a byte boundary */
	/* Assure that some output space is available, by writing out the window
	   if it's full.  If the write fails, return from inflateBack() with a
	   Z_BUF_ERROR. */
	/*
	   strm provides the memory allocation functions and window buffer on input,
	   and provides information on the unused input on return.  For Z_DATA_ERROR
	   returns, strm will also provide an error message.
	
	   in() and out() are the call-back input and output functions.  When
	   inflateBack() needs more input, it calls in().  When inflateBack() has
	   filled the window with output, or when it completes with data in the
	   window, it calls out() to write out the data.  The application must not
	   change the provided input until in() is called again or inflateBack()
	   returns.  The application must not change the window/output buffer until
	   inflateBack() returns.
	
	   in() and out() are called with a descriptor parameter provided in the
	   inflateBack() call.  This parameter can be a structure that provides the
	   information required to do the read or write, as well as accumulated
	   information on the input and output such as totals and check values.
	
	   in() should return zero on failure.  out() should return non-zero on
	   failure.  If either in() or out() fails, than inflateBack() returns a
	   Z_BUF_ERROR.  strm->next_in can be checked for Z_NULL to see whether it
	   was in() or out() that caused in the error.  Otherwise,  inflateBack()
	   returns Z_STREAM_END on success, Z_DATA_ERROR for an deflate format
	   error, or Z_MEM_ERROR if it could not allocate memory for the state.
	   inflateBack() can also return Z_STREAM_ERROR if the input parameters
	   are not correct, i.e. strm is Z_NULL or the state was not initialized.
	 */
	public int inflateBack9(Object in, Object in_desc, Object out, Object out_desc) {
		inflate_state state = new inflate_state();
		/* next input */Byte next;
		/* next output */Byte put;
		/* available input */int have;
		/* available output */long left;
		/* current inflate mode */inflate_mode mode = new inflate_mode();
		/* true if processing last block */int lastblock;
		/* true if the window has wrapped */int wrap;
		/* allocated sliding window, if needed */Byte window;
		/* bit buffer */long hold;
		/* bits in bit buffer */int bits;
		/* extra bits needed */int extra;
		/* literal or length of data to copy */long length;
		/* distance back to copy string from */long offset;
		/* number of stored or match bytes to copy */long copy;
		/* where to copy match bytes from */Byte from;
		/* starting table for length/literal codes */code[] lencode = new code();
		/* starting table for distance codes */code[] distcode = new code();
		/* index bits for lencode */int lenbits;
		/* index bits for distcode */int distbits;
		/* current decoding table entry */code here = new code();
		/* parent table entry */code last = new code();
		/* length to copy for repeats, bits to drop */int len;
		/* return code */int ret;
		int[] order = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
		code[] lenfix = new code[]{new code(96, 7, 0), new code(0, 8, 80), new code(0, 8, 16), new code(132, 8, 115), new code(130, 7, 31), new code(0, 8, 112), new code(0, 8, 48), new code(0, 9, 192), new code(128, 7, 10), new code(0, 8, 96), new code(0, 8, 32), new code(0, 9, 160), new code(0, 8, 0), new code(0, 8, 128), new code(0, 8, 64), new code(0, 9, 224), new code(128, 7, 6), new code(0, 8, 88), new code(0, 8, 24), new code(0, 9, 144), new code(131, 7, 59), new code(0, 8, 120), new code(0, 8, 56), new code(0, 9, 208), new code(129, 7, 17), new code(0, 8, 104), new code(0, 8, 40), new code(0, 9, 176), new code(0, 8, 8), new code(0, 8, 136), new code(0, 8, 72), new code(0, 9, 240), new code(128, 7, 4), new code(0, 8, 84), new code(0, 8, 20), new code(133, 8, 227), new code(131, 7, 43), new code(0, 8, 116), new code(0, 8, 52), new code(0, 9, 200), new code(129, 7, 13), new code(0, 8, 100), new code(0, 8, 36), new code(0, 9, 168), new code(0, 8, 4), new code(0, 8, 132), new code(0, 8, 68), new code(0, 9, 232), new code(128, 7, 8), new code(0, 8, 92), new code(0, 8, 28), new code(0, 9, 152), new code(132, 7, 83), new code(0, 8, 124), new code(0, 8, 60), new code(0, 9, 216), new code(130, 7, 23), new code(0, 8, 108), new code(0, 8, 44), new code(0, 9, 184), new code(0, 8, 12), new code(0, 8, 140), new code(0, 8, 76), new code(0, 9, 248), new code(128, 7, 3), new code(0, 8, 82), new code(0, 8, 18), new code(133, 8, 163), new code(131, 7, 35), new code(0, 8, 114), new code(0, 8, 50), new code(0, 9, 196), new code(129, 7, 11), new code(0, 8, 98), new code(0, 8, 34), new code(0, 9, 164), new code(0, 8, 2), new code(0, 8, 130), new code(0, 8, 66), new code(0, 9, 228), new code(128, 7, 7), new code(0, 8, 90), new code(0, 8, 26), new code(0, 9, 148), new code(132, 7, 67), new code(0, 8, 122), new code(0, 8, 58), new code(0, 9, 212), new code(130, 7, 19), new code(0, 8, 106), new code(0, 8, 42), new code(0, 9, 180), new code(0, 8, 10), new code(0, 8, 138), new code(0, 8, 74), new code(0, 9, 244), new code(128, 7, 5), new code(0, 8, 86), new code(0, 8, 22), new code(65, 8, 0), new code(131, 7, 51), new code(0, 8, 118), new code(0, 8, 54), new code(0, 9, 204), new code(129, 7, 15), new code(0, 8, 102), new code(0, 8, 38), new code(0, 9, 172), new code(0, 8, 6), new code(0, 8, 134), new code(0, 8, 70), new code(0, 9, 236), new code(128, 7, 9), new code(0, 8, 94), new code(0, 8, 30), new code(0, 9, 156), new code(132, 7, 99), new code(0, 8, 126), new code(0, 8, 62), new code(0, 9, 220), new code(130, 7, 27), new code(0, 8, 110), new code(0, 8, 46), new code(0, 9, 188), new code(0, 8, 14), new code(0, 8, 142), new code(0, 8, 78), new code(0, 9, 252), new code(96, 7, 0), new code(0, 8, 81), new code(0, 8, 17), new code(133, 8, 131), new code(130, 7, 31), new code(0, 8, 113), new code(0, 8, 49), new code(0, 9, 194), new code(128, 7, 10), new code(0, 8, 97), new code(0, 8, 33), new code(0, 9, 162), new code(0, 8, 1), new code(0, 8, 129), new code(0, 8, 65), new code(0, 9, 226), new code(128, 7, 6), new code(0, 8, 89), new code(0, 8, 25), new code(0, 9, 146), new code(131, 7, 59), new code(0, 8, 121), new code(0, 8, 57), new code(0, 9, 210), new code(129, 7, 17), new code(0, 8, 105), new code(0, 8, 41), new code(0, 9, 178), new code(0, 8, 9), new code(0, 8, 137), new code(0, 8, 73), new code(0, 9, 242), new code(128, 7, 4), new code(0, 8, 85), new code(0, 8, 21), new code(144, 8, 3), new code(131, 7, 43), new code(0, 8, 117), new code(0, 8, 53), new code(0, 9, 202), new code(129, 7, 13), new code(0, 8, 101), new code(0, 8, 37), new code(0, 9, 170), new code(0, 8, 5), new code(0, 8, 133), new code(0, 8, 69), new code(0, 9, 234), new code(128, 7, 8), new code(0, 8, 93), new code(0, 8, 29), new code(0, 9, 154), new code(132, 7, 83), new code(0, 8, 125), new code(0, 8, 61), new code(0, 9, 218), new code(130, 7, 23), new code(0, 8, 109), new code(0, 8, 45), new code(0, 9, 186), new code(0, 8, 13), new code(0, 8, 141), new code(0, 8, 77), new code(0, 9, 250), new code(128, 7, 3), new code(0, 8, 83), new code(0, 8, 19), new code(133, 8, 195), new code(131, 7, 35), new code(0, 8, 115), new code(0, 8, 51), new code(0, 9, 198), new code(129, 7, 11), new code(0, 8, 99), new code(0, 8, 35), new code(0, 9, 166), new code(0, 8, 3), new code(0, 8, 131), new code(0, 8, 67), new code(0, 9, 230), new code(128, 7, 7), new code(0, 8, 91), new code(0, 8, 27), new code(0, 9, 150), new code(132, 7, 67), new code(0, 8, 123), new code(0, 8, 59), new code(0, 9, 214), new code(130, 7, 19), new code(0, 8, 107), new code(0, 8, 43), new code(0, 9, 182), new code(0, 8, 11), new code(0, 8, 139), new code(0, 8, 75), new code(0, 9, 246), new code(128, 7, 5), new code(0, 8, 87), new code(0, 8, 23), new code(77, 8, 0), new code(131, 7, 51), new code(0, 8, 119), new code(0, 8, 55), new code(0, 9, 206), new code(129, 7, 15), new code(0, 8, 103), new code(0, 8, 39), new code(0, 9, 174), new code(0, 8, 7), new code(0, 8, 135), new code(0, 8, 71), new code(0, 9, 238), new code(128, 7, 9), new code(0, 8, 95), new code(0, 8, 31), new code(0, 9, 158), new code(132, 7, 99), new code(0, 8, 127), new code(0, 8, 63), new code(0, 9, 222), new code(130, 7, 27), new code(0, 8, 111), new code(0, 8, 47), new code(0, 9, 190), new code(0, 8, 15), new code(0, 8, 143), new code(0, 8, 79), new code(0, 9, 254), new code(96, 7, 0), new code(0, 8, 80), new code(0, 8, 16), new code(132, 8, 115), new code(130, 7, 31), new code(0, 8, 112), new code(0, 8, 48), new code(0, 9, 193), new code(128, 7, 10), new code(0, 8, 96), new code(0, 8, 32), new code(0, 9, 161), new code(0, 8, 0), new code(0, 8, 128), new code(0, 8, 64), new code(0, 9, 225), new code(128, 7, 6), new code(0, 8, 88), new code(0, 8, 24), new code(0, 9, 145), new code(131, 7, 59), new code(0, 8, 120), new code(0, 8, 56), new code(0, 9, 209), new code(129, 7, 17), new code(0, 8, 104), new code(0, 8, 40), new code(0, 9, 177), new code(0, 8, 8), new code(0, 8, 136), new code(0, 8, 72), new code(0, 9, 241), new code(128, 7, 4), new code(0, 8, 84), new code(0, 8, 20), new code(133, 8, 227), new code(131, 7, 43), new code(0, 8, 116), new code(0, 8, 52), new code(0, 9, 201), new code(129, 7, 13), new code(0, 8, 100), new code(0, 8, 36), new code(0, 9, 169), new code(0, 8, 4), new code(0, 8, 132), new code(0, 8, 68), new code(0, 9, 233), new code(128, 7, 8), new code(0, 8, 92), new code(0, 8, 28), new code(0, 9, 153), new code(132, 7, 83), new code(0, 8, 124), new code(0, 8, 60), new code(0, 9, 217), new code(130, 7, 23), new code(0, 8, 108), new code(0, 8, 44), new code(0, 9, 185), new code(0, 8, 12), new code(0, 8, 140), new code(0, 8, 76), new code(0, 9, 249), new code(128, 7, 3), new code(0, 8, 82), new code(0, 8, 18), new code(133, 8, 163), new code(131, 7, 35), new code(0, 8, 114), new code(0, 8, 50), new code(0, 9, 197), new code(129, 7, 11), new code(0, 8, 98), new code(0, 8, 34), new code(0, 9, 165), new code(0, 8, 2), new code(0, 8, 130), new code(0, 8, 66), new code(0, 9, 229), new code(128, 7, 7), new code(0, 8, 90), new code(0, 8, 26), new code(0, 9, 149), new code(132, 7, 67), new code(0, 8, 122), new code(0, 8, 58), new code(0, 9, 213), new code(130, 7, 19), new code(0, 8, 106), new code(0, 8, 42), new code(0, 9, 181), new code(0, 8, 10), new code(0, 8, 138), new code(0, 8, 74), new code(0, 9, 245), new code(128, 7, 5), new code(0, 8, 86), new code(0, 8, 22), new code(65, 8, 0), new code(131, 7, 51), new code(0, 8, 118), new code(0, 8, 54), new code(0, 9, 205), new code(129, 7, 15), new code(0, 8, 102), new code(0, 8, 38), new code(0, 9, 173), new code(0, 8, 6), new code(0, 8, 134), new code(0, 8, 70), new code(0, 9, 237), new code(128, 7, 9), new code(0, 8, 94), new code(0, 8, 30), new code(0, 9, 157), new code(132, 7, 99), new code(0, 8, 126), new code(0, 8, 62), new code(0, 9, 221), new code(130, 7, 27), new code(0, 8, 110), new code(0, 8, 46), new code(0, 9, 189), new code(0, 8, 14), new code(0, 8, 142), new code(0, 8, 78), new code(0, 9, 253), new code(96, 7, 0), new code(0, 8, 81), new code(0, 8, 17), new code(133, 8, 131), new code(130, 7, 31), new code(0, 8, 113), new code(0, 8, 49), new code(0, 9, 195), new code(128, 7, 10), new code(0, 8, 97), new code(0, 8, 33), new code(0, 9, 163), new code(0, 8, 1), new code(0, 8, 129), new code(0, 8, 65), new code(0, 9, 227), new code(128, 7, 6), new code(0, 8, 89), new code(0, 8, 25), new code(0, 9, 147), new code(131, 7, 59), new code(0, 8, 121), new code(0, 8, 57), new code(0, 9, 211), new code(129, 7, 17), new code(0, 8, 105), new code(0, 8, 41), new code(0, 9, 179), new code(0, 8, 9), new code(0, 8, 137), new code(0, 8, 73), new code(0, 9, 243), new code(128, 7, 4), new code(0, 8, 85), new code(0, 8, 21), new code(144, 8, 3), new code(131, 7, 43), new code(0, 8, 117), new code(0, 8, 53), new code(0, 9, 203), new code(129, 7, 13), new code(0, 8, 101), new code(0, 8, 37), new code(0, 9, 171), new code(0, 8, 5), new code(0, 8, 133), new code(0, 8, 69), new code(0, 9, 235), new code(128, 7, 8), new code(0, 8, 93), new code(0, 8, 29), new code(0, 9, 155), new code(132, 7, 83), new code(0, 8, 125), new code(0, 8, 61), new code(0, 9, 219), new code(130, 7, 23), new code(0, 8, 109), new code(0, 8, 45), new code(0, 9, 187), new code(0, 8, 13), new code(0, 8, 141), new code(0, 8, 77), new code(0, 9, 251), new code(128, 7, 3), new code(0, 8, 83), new code(0, 8, 19), new code(133, 8, 195), new code(131, 7, 35), new code(0, 8, 115), new code(0, 8, 51), new code(0, 9, 199), new code(129, 7, 11), new code(0, 8, 99), new code(0, 8, 35), new code(0, 9, 167), new code(0, 8, 3), new code(0, 8, 131), new code(0, 8, 67), new code(0, 9, 231), new code(128, 7, 7), new code(0, 8, 91), new code(0, 8, 27), new code(0, 9, 151), new code(132, 7, 67), new code(0, 8, 123), new code(0, 8, 59), new code(0, 9, 215), new code(130, 7, 19), new code(0, 8, 107), new code(0, 8, 43), new code(0, 9, 183), new code(0, 8, 11), new code(0, 8, 139), new code(0, 8, 75), new code(0, 9, 247), new code(128, 7, 5), new code(0, 8, 87), new code(0, 8, 23), new code(77, 8, 0), new code(131, 7, 51), new code(0, 8, 119), new code(0, 8, 55), new code(0, 9, 207), new code(129, 7, 15), new code(0, 8, 103), new code(0, 8, 39), new code(0, 9, 175), new code(0, 8, 7), new code(0, 8, 135), new code(0, 8, 71), new code(0, 9, 239), new code(128, 7, 9), new code(0, 8, 95), new code(0, 8, 31), new code(0, 9, 159), new code(132, 7, 99), new code(0, 8, 127), new code(0, 8, 63), new code(0, 9, 223), new code(130, 7, 27), new code(0, 8, 111), new code(0, 8, 47), new code(0, 9, 191), new code(0, 8, 15), new code(0, 8, 143), new code(0, 8, 79), new code(0, 9, 255)};
		code[] distfix = new code[]{new code(128, 5, 1), new code(135, 5, 257), new code(131, 5, 17), new code(139, 5, 4097), new code(129, 5, 5), new code(137, 5, 1025), new code(133, 5, 65), new code(141, 5, 16385), new code(128, 5, 3), new code(136, 5, 513), new code(132, 5, 33), new code(140, 5, 8193), new code(130, 5, 9), new code(138, 5, 2049), new code(134, 5, 129), new code(142, 5, 32769), new code(128, 5, 2), new code(135, 5, 385), new code(131, 5, 25), new code(139, 5, 6145), new code(129, 5, 7), new code(137, 5, 1537), new code(133, 5, 97), new code(141, 5, 24577), new code(128, 5, 4), new code(136, 5, 769), new code(132, 5, 49), new code(140, 5, 12289), new code(130, 5, 13), new code(138, 5, 3073), new code(134, 5, 193), new code(142, 5, 49153)};
		internal_state generatedState = this.getState();
		if (strm == 0 || generatedState == /* Check that the strm exists and that the state was initialized */0) {
			return (true);
		} 
		state = (inflate_state)generatedState;
		this.setMsg(/* Reset the state */0);
		mode = .TYPE;
		lastblock = 0;
		wrap = 0;
		Object generatedWindow = state.getWindow();
		window = generatedWindow;
		Object[] generatedNext_in = this.getNext_in();
		next = generatedNext_in;
		Object generatedAvail_in = this.getAvail_in();
		have = next != 0 ? generatedAvail_in : 0;
		hold = 0;
		bits = 0;
		put = window;
		left = -1024;
		lencode = 0;
		distcode = 0;
		int generatedNlen = state.getNlen();
		int generatedHave = state.getHave();
		int generatedNcode = state.getNcode();
		Object[] generatedLens = state.getLens();
		Object[] generatedCodes = state.getCodes();
		Object generatedNext = state.getNext();
		Object[] generatedWork = state.getWork();
		int generatedNdist = state.getNdist();
		Object generatedBits = here.getBits();
		Object generatedVal = here.getVal();
		Object generatedOp = here.getOp();
		/* Inflate until end of block marked as last */for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			switch (mode) {
			case .TABLE:
					do {
						while (bits < (int)(true)) {
							do {
								do {
									if (have == 0) {
										have = ModernizedCProgram.in(in_desc, next);
										if (have == 0) {
											next = 0;
											ret = (true);
											;
										} 
									} 
								} while (0);
								have--;
								hold += (long)(next++) << bits;
								bits += 8;
							} while (0);
						}
					} while (/* get dynamic table entries descriptor */0);
					state.setNlen(((int)hold & ((-1024 << (true)) - 1)) + 257);
					do {
						hold >>=  (true);
						bits -= (int)(true);
					} while (0);
					state.setNdist(((int)hold & ((-1024 << (true)) - 1)) + 1);
					do {
						hold >>=  (true);
						bits -= (int)(true);
					} while (0);
					state.setNcode(((int)hold & ((-1024 << (true)) - 1)) + 4);
					do {
						hold >>=  (true);
						bits -= (int)(true);
					} while (0);
					if (generatedNlen > 286) {
						this.setMsg((byte)"too many length symbols");
						mode = .BAD;
						break;
					} 
					;
					state.setHave(/* get code length code lengths (not a typo) */0);
					while (generatedHave < generatedNcode) {
						do {
							while (bits < (int)(true)) {
								do {
									do {
										if (have == 0) {
											have = ModernizedCProgram.in(in_desc, next);
											if (have == 0) {
												next = 0;
												ret = (true);
												;
											} 
										} 
									} while (0);
									have--;
									hold += (long)(next++) << bits;
									bits += 8;
								} while (0);
							}
						} while (0);
						generatedLens[order[generatedHave++]] = (int)((int)hold & ((-1024 << (true)) - 1));
						do {
							hold >>=  (true);
							bits -= (int)(true);
						} while (0);
					}
					while (generatedHave < 19) {
						generatedLens[order[generatedHave++]] = 0;
					}
					state.setNext(generatedCodes);
					lencode = (code)(generatedNext);
					lenbits = 7;
					ret = (generatedNext).inflate_table9(.CODES, generatedLens, 19, (lenbits), generatedWork);
					if (ret) {
						this.setMsg((byte)"invalid code lengths set");
						mode = .BAD;
						break;
					} 
					;
					state.setHave(/* get length and distance code code lengths */0);
					while (generatedHave < generatedNlen + generatedNdist) {
						for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
							here = lencode[((int)hold & ((-1024 << (lenbits)) - 1))];
							if ((int)(generatedBits) <= bits) {
								break;
							} 
							do {
								do {
									if (have == 0) {
										have = ModernizedCProgram.in(in_desc, next);
										if (have == 0) {
											next = 0;
											ret = (true);
											;
										} 
									} 
								} while (0);
								have--;
								hold += (long)(next++) << bits;
								bits += 8;
							} while (0);
						}
						if (generatedVal < 16) {
							do {
								while (bits < (int)(generatedBits)) {
									do {
										do {
											if (have == 0) {
												have = ModernizedCProgram.in(in_desc, next);
												if (have == 0) {
													next = 0;
													ret = (true);
													;
												} 
											} 
										} while (0);
										have--;
										hold += (long)(next++) << bits;
										bits += 8;
									} while (0);
								}
							} while (0);
							do {
								hold >>=  (generatedBits);
								bits -= (int)(generatedBits);
							} while (0);
							generatedLens[generatedHave++] = generatedVal;
						} else {
								if (generatedVal == 16) {
									do {
										while (bits < (int)(generatedBits + 2)) {
											do {
												do {
													if (have == 0) {
														have = ModernizedCProgram.in(in_desc, next);
														if (have == 0) {
															next = 0;
															ret = (true);
															;
														} 
													} 
												} while (0);
												have--;
												hold += (long)(next++) << bits;
												bits += 8;
											} while (0);
										}
									} while (0);
									do {
										hold >>=  (generatedBits);
										bits -= (int)(generatedBits);
									} while (0);
									if (generatedHave == 0) {
										this.setMsg((byte)"invalid bit length repeat");
										mode = .BAD;
										break;
									} 
									len = (int)(generatedLens[generatedHave - 1]);
									copy = 3 + ((int)hold & ((-1024 << (true)) - 1));
									do {
										hold >>=  (true);
										bits -= (int)(true);
									} while (0);
								}  else if (generatedVal == 17) {
									do {
										while (bits < (int)(generatedBits + 3)) {
											do {
												do {
													if (have == 0) {
														have = ModernizedCProgram.in(in_desc, next);
														if (have == 0) {
															next = 0;
															ret = (true);
															;
														} 
													} 
												} while (0);
												have--;
												hold += (long)(next++) << bits;
												bits += 8;
											} while (0);
										}
									} while (0);
									do {
										hold >>=  (generatedBits);
										bits -= (int)(generatedBits);
									} while (0);
									len = 0;
									copy = 3 + ((int)hold & ((-1024 << (true)) - 1));
									do {
										hold >>=  (true);
										bits -= (int)(true);
									} while (0);
								} else {
										do {
											while (bits < (int)(generatedBits + 7)) {
												do {
													do {
														if (have == 0) {
															have = ModernizedCProgram.in(in_desc, next);
															if (have == 0) {
																next = 0;
																ret = (true);
																;
															} 
														} 
													} while (0);
													have--;
													hold += (long)(next++) << bits;
													bits += 8;
												} while (0);
											}
										} while (0);
										do {
											hold >>=  (generatedBits);
											bits -= (int)(generatedBits);
										} while (0);
										len = 0;
										copy = 11 + ((int)hold & ((-1024 << (true)) - 1));
										do {
											hold >>=  (true);
											bits -= (int)(true);
										} while (0);
								} 
								if (generatedHave + copy > generatedNlen + generatedNdist) {
									this.setMsg((byte)"invalid bit length repeat");
									mode = .BAD;
									break;
								} 
								while (copy--) {
									generatedLens[generatedHave++] = (int)len;
								}
						} 
					}
					if (mode == /* handle error breaks in while */.BAD) {
						break;
					} 
					if (generatedLens[256] == /* check for end-of-block code (better have one) */0) {
						this.setMsg((byte)"invalid code -- missing end-of-block");
						mode = .BAD;
						break;
					} 
					state.setNext(generatedCodes);
					lencode = (code)(generatedNext);
					lenbits = 9;
					ret = (generatedNext).inflate_table9(.LENS, generatedLens, generatedNlen, (lenbits), generatedWork);
					if (ret) {
						this.setMsg((byte)"invalid literal/lengths set");
						mode = .BAD;
						break;
					} 
					distcode = (code)(generatedNext);
					distbits = 6;
					ret = (generatedNext).inflate_table9(.DISTS, generatedLens + generatedNlen, generatedNdist, (distbits), generatedWork);
					if (ret) {
						this.setMsg((byte)"invalid distances set");
						mode = .BAD;
						break;
					} 
					;
					mode = .LEN;
			case .DONE:
					ret = /* inflate stream terminated properly -- write leftover output */1;
					if (left < -1024) {
						if (ModernizedCProgram.out(out_desc, window, (int)(-1024 - left))) {
							ret = (true);
						} 
					} 
					;
			case .BAD:
					ret = (true);
					;
			case .TYPE:
					if (/* determine and dispatch block type */lastblock) {
						do {
							hold >>=  bits & 7;
							bits -= bits & 7;
						} while (0);
						mode = .DONE;
						break;
					} 
					do {
						while (bits < (int)(true)) {
							do {
								do {
									if (have == 0) {
										have = ModernizedCProgram.in(in_desc, next);
										if (have == 0) {
											next = 0;
											ret = (true);
											;
										} 
									} 
								} while (0);
								have--;
								hold += (long)(next++) << bits;
								bits += 8;
							} while (0);
						}
					} while (0);
					lastblock = ((int)hold & ((-1024 << (true)) - 1));
					do {
						hold >>=  (true);
						bits -= (int)(true);
					} while (0);
					switch (((int)hold & ((-1024 << (true)) - 1))) {
					case /* stored block */0:
							;
							mode = .STORED;
							break;
					case /* dynamic block */2:
							;
							mode = .TABLE;
							break;
					case /* fixed block */1:
							lencode = lenfix;
							lenbits = 9;
							distcode = distfix;
							distbits = 5;
							;
							mode = /* decode codes */.LEN;
							break;
					case 3:
							this.setMsg((byte)"invalid block type");
							mode = .BAD;
					}
					do {
						hold >>=  (true);
						bits -= (int)(true);
					} while (0);
					break;
			case .LEN/* get a literal, length, or end-of-block code */:
					for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
						here = lencode[((int)hold & ((-1024 << (lenbits)) - 1))];
						if ((int)(generatedBits) <= bits) {
							break;
						} 
						do {
							do {
								if (have == 0) {
									have = ModernizedCProgram.in(in_desc, next);
									if (have == 0) {
										next = 0;
										ret = (true);
										;
									} 
								} 
							} while (0);
							have--;
							hold += (long)(next++) << bits;
							bits += 8;
						} while (0);
					}
					if (generatedOp && (generatedOp & -1024) == 0) {
						last = here;
						for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
							here = lencode[generatedVal + (((int)hold & ((-1024 << (generatedBits + generatedOp)) - 1)) >> generatedBits)];
							if ((int)(generatedBits + generatedBits) <= bits) {
								break;
							} 
							do {
								do {
									if (have == 0) {
										have = ModernizedCProgram.in(in_desc, next);
										if (have == 0) {
											next = 0;
											ret = (true);
											;
										} 
									} 
								} while (0);
								have--;
								hold += (long)(next++) << bits;
								bits += 8;
							} while (0);
						}
						do {
							hold >>=  (generatedBits);
							bits -= (int)(generatedBits);
						} while (0);
					} 
					do {
						hold >>=  (generatedBits);
						bits -= (int)(generatedBits);
					} while (0);
					length = (int)generatedVal;
					if (generatedOp == /* process literal */0) {
						;
						do {
							if (left == 0) {
								put = window;
								left = -1024;
								wrap = 1;
								if (ModernizedCProgram.out(out_desc, put, (int)left)) {
									ret = (true);
									;
								} 
							} 
						} while (0);
						put++ = (byte)(length);
						left--;
						mode = .LEN;
						break;
					} 
					if (generatedOp & /* process end of block */32) {
						;
						mode = .TYPE;
						break;
					} 
					if (generatedOp & /* invalid code */64) {
						this.setMsg((byte)"invalid literal/length code");
						mode = .BAD;
						break;
					} 
					extra = (int)(generatedOp) & /* length code -- get extra bits, if any */31;
					if (extra != 0) {
						do {
							while (bits < (int)(extra)) {
								do {
									do {
										if (have == 0) {
											have = ModernizedCProgram.in(in_desc, next);
											if (have == 0) {
												next = 0;
												ret = (true);
												;
											} 
										} 
									} while (0);
									have--;
									hold += (long)(next++) << bits;
									bits += 8;
								} while (0);
							}
						} while (0);
						length += ((int)hold & ((-1024 << (extra)) - 1));
						do {
							hold >>=  (extra);
							bits -= (int)(extra);
						} while (0);
					} 
					;
					for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
						here = distcode[((int)hold & ((-1024 << (distbits)) - 1))];
						if ((int)(generatedBits) <= bits) {
							break;
						} 
						do {
							do {
								if (have == 0) {
									have = ModernizedCProgram.in(in_desc, next);
									if (have == 0) {
										next = 0;
										ret = (true);
										;
									} 
								} 
							} while (0);
							have--;
							hold += (long)(next++) << bits;
							bits += 8;
						} while (0);
					}
					if ((generatedOp & -1024) == 0) {
						last = here;
						for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
							here = distcode[generatedVal + (((int)hold & ((-1024 << (generatedBits + generatedOp)) - 1)) >> generatedBits)];
							if ((int)(generatedBits + generatedBits) <= bits) {
								break;
							} 
							do {
								do {
									if (have == 0) {
										have = ModernizedCProgram.in(in_desc, next);
										if (have == 0) {
											next = 0;
											ret = (true);
											;
										} 
									} 
								} while (0);
								have--;
								hold += (long)(next++) << bits;
								bits += 8;
							} while (0);
						}
						do {
							hold >>=  (generatedBits);
							bits -= (int)(generatedBits);
						} while (0);
					} 
					do {
						hold >>=  (generatedBits);
						bits -= (int)(generatedBits);
					} while (0);
					if (generatedOp & 64) {
						this.setMsg((byte)"invalid distance code");
						mode = .BAD;
						break;
					} 
					offset = (int)generatedVal;
					extra = (int)(generatedOp) & /* get distance extra bits, if any */15;
					if (extra != 0) {
						do {
							while (bits < (int)(extra)) {
								do {
									do {
										if (have == 0) {
											have = ModernizedCProgram.in(in_desc, next);
											if (have == 0) {
												next = 0;
												ret = (true);
												;
											} 
										} 
									} while (0);
									have--;
									hold += (long)(next++) << bits;
									bits += 8;
								} while (0);
							}
						} while (0);
						offset += ((int)hold & ((-1024 << (extra)) - 1));
						do {
							hold >>=  (extra);
							bits -= (int)(extra);
						} while (0);
					} 
					if (offset > -1024 - (wrap ? 0 : left)) {
						this.setMsg((byte)"invalid distance too far back");
						mode = .BAD;
						break;
					} 
					;
					do {
						do {
							if (left == 0) {
								put = window;
								left = -1024;
								wrap = 1;
								if (ModernizedCProgram.out(out_desc, put, (int)left)) {
									ret = (true);
									;
								} 
							} 
						} while (0);
						copy = -1024 - offset;
						if (copy < left) {
							from = put + copy;
							copy = left - copy;
						} else {
								from = put - offset;
								copy = left;
						} 
						if (copy > length) {
							copy = length;
						} 
						length -= copy;
						left -= copy;
						do {
							put++ = from++;
						} while (--copy);
					} while (length != 0);
					break;
			case .STORED:
					do {
						hold >>=  bits & 7;
						bits -= bits & 7;
					} while (/* get and verify stored block length *//* go to byte boundary */0);
					do {
						while (bits < (int)(true)) {
							do {
								do {
									if (have == 0) {
										have = ModernizedCProgram.in(in_desc, next);
										if (have == 0) {
											next = 0;
											ret = (true);
											;
										} 
									} 
								} while (0);
								have--;
								hold += (long)(next++) << bits;
								bits += 8;
							} while (0);
						}
					} while (0);
					if ((hold & -1024) != ((hold >> 16) ^ -1024)) {
						this.setMsg((byte)"invalid stored block lengths");
						mode = .BAD;
						break;
					} 
					length = (int)hold & -1024;
					;
					do {
						hold = 0;
						bits = 0;
					} while (0);
					while (length != /* copy stored block from input to output */0) {
						copy = length;
						do {
							if (have == 0) {
								have = ModernizedCProgram.in(in_desc, next);
								if (have == 0) {
									next = 0;
									ret = (true);
									;
								} 
							} 
						} while (0);
						do {
							if (left == 0) {
								put = window;
								left = -1024;
								wrap = 1;
								if (ModernizedCProgram.out(out_desc, put, (int)left)) {
									ret = (true);
									;
								} 
							} 
						} while (0);
						if (copy > have) {
							copy = have;
						} 
						if (copy > left) {
							copy = left;
						} 
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(put, next, copy);
						have -= copy;
						next += copy;
						left -= copy;
						put += copy;
						length -= copy;
					}
					;
					mode = .TYPE;
					break;
			default:
					ret = (true);
					;
			}
		}
		this.setAvail_in(have);
		return ret;
	}
	public int inflateBack9End() {
		internal_state generatedState = this.getState();
		Object generatedZfree = this.getZfree();
		if (strm == 0 || generatedState == 0 || generatedZfree == (free_func)0) {
			return (true);
		} 
		Object generatedOpaque = (strm).getOpaque();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedOpaque, (voidpf)(generatedState));
		this.setState(0);
		;
		return 0;
	}
	public int gunpipe(int infile, int outfile) {
		int ret;
		int first;
		int last;
		int have;
		int flags;
		int len;
		Byte next = (null);
		ind ind = new ind();
		ind indp = new ind();
		outd outd = new outd();
		ind.setInfile(/* setup input buffer */infile);
		ind.setInbuf(ModernizedCProgram.inbuf);
		indp = ind;
		have = /* decompress concatenated gzip streams *//* no input data read in yet */0;
		first = /* looking for first gzip header */1;
		this.setNext_in(/* so Z_BUF_ERROR means EOF */0);
		Object[] generatedNext_in = this.getNext_in();
		Object generatedAvail_in = this.getAvail_in();
		long generatedCrc = outd.getCrc();
		long generatedTotal = outd.getTotal();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (() == -/* look for the two magic header bytes for a gzip stream */1) {
				ret = 0;
				break;
			} 
			if (last != 31 || (() != 139 && last != 157)) {
				this.setMsg((byte)"incorrect header check");
				ret = first ? (true) : (true);
				break;
			} 
			first = /* next non-header is junk */0;
			if (last == /* process a compress (LZW) file -- can't be concatenated after this */157) {
				ret = ModernizedCProgram.lunpipe(have, next, indp, outfile, strm);
				break;
			} 
			ret = (/* process remainder of gzip header */true);
			if (() != /* only deflate method allowed */8) {
				if (last == -1) {
					break;
				} 
				this.setMsg((byte)"unknown compression method");
				ret = (true);
				break;
			} 
			flags = ();
			();
			();
			();
			();
			();
			();
			if (last == -1) {
				break;
			} 
			if (flags & -1024) {
				this.setMsg((byte)"unknown header flags set");
				ret = (true);
				break;
			} 
			if (flags & /* extra field */4) {
				len = ();
				len += (int)(()) << 8;
				if (last == -1) {
					break;
				} 
				while (len > have) {
					len -= have;
					have = 0;
					if (() == -1) {
						break;
					} 
					len--;
				}
				if (last == -1) {
					break;
				} 
				have -= len;
				next += len;
			} 
			if (flags & /* file name */8) {
				while (() != 0 && last != -1) {
					;
				}
			} 
			if (flags & /* comment */16) {
				while (() != 0 && last != -1) {
					;
				}
			} 
			if (flags & /* header crc */2) {
				();
				();
			} 
			if (last == -1) {
				break;
			} 
			outd.setOutfile(/* set up output */outfile);
			outd.setCheck(1);
			outd.setCrc(ModernizedCProgram.crc32(-1024, 0, 0));
			outd.setTotal(0);
			this.setNext_in(/* decompress data to output */next);
			this.setAvail_in(have);
			ret = ModernizedCProgram.inflateBack(strm, in, indp, out, outd);
			if (ret != 1) {
				break;
			} 
			next = generatedNext_in;
			have = generatedAvail_in;
			this.setNext_in(/* so Z_BUF_ERROR means EOF */0);
			ret = (/* check trailer */true);
			if (() != (int)(generatedCrc & -1024) || () != (int)((generatedCrc >> 8) & -1024) || () != (int)((generatedCrc >> 16) & -1024) || () != (int)((generatedCrc >> 24) & -1024)) {
				if (last != -/* crc error */1) {
					this.setMsg((byte)"incorrect data check");
					ret = (true);
				} 
				break;
			} 
			if (() != (int)(generatedTotal & -1024) || () != (int)((generatedTotal >> 8) & -1024) || () != (int)((generatedTotal >> 16) & -1024) || () != (int)((generatedTotal >> 24) & -1024)) {
				if (last != -/* length error */1) {
					this.setMsg((byte)"incorrect length check");
					ret = (true);
				} 
				break;
			} 
		}
		return /* clean up and return */ret/* Copy file attributes, from -> to, as best we can.  This is best effort, so
		   no errors are reported.  The mode bits, including suid, sgid, and the sticky
		   bit are copied (if allowed), the owner's user id and group id are copied
		   (again if allowed), and the access and modify times are copied. */;
	}
	public int gunzip(Byte inname, Byte outname, int test) {
		int ret;
		int infile;
		int outfile;
		if (inname == (null) || inname == /* open files */0) {
			inname = "-";
			infile = /* stdin */0;
		} else {
				infile = /*Error: Function owner not recognized*/open(inname, 0, 0);
				if (infile == -1) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gun cannot open %s\n", inname);
					return 0;
				} 
		} 
		if (test) {
			outfile = -1;
		}  else if (outname == (null) || outname == 0) {
			outname = "-";
			outfile = /* stdout */1;
		} else {
				outfile = /*Error: Function owner not recognized*/open(outname, -1024 | -1024 | 1, 666);
				if (outfile == -1) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(infile);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gun cannot create %s\n", outname);
					return 0;
				} 
		} 
		(/*Error: Function owner not recognized*/_errno()) = 0;
		ret = strm.gunpipe(infile, /* decompress */outfile);
		if (outfile > 2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(outfile);
		} 
		if (infile > 2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(infile);
		} 
		Byte generatedMsg = this.getMsg();
		Object[] generatedNext_in = this.getNext_in();
		switch (/* interpret result */ret) {
		case (true):
				if (outfile > 2) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(outname);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gun out of memory error--aborting\n");
				return 1;
		case (true):
				if (outfile > 2) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(outname);
				} 
				if (generatedNext_in != 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gun write error on %s: %s\n", outname, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
				}  else if ((/*Error: Function owner not recognized*/_errno())) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gun read error on %s: %s\n", inname, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gun unexpected end of file on %s\n", inname);
				} 
				break;
		case 0:
		case (true):
				if (outfile > 2) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(outname);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gun data error on %s: %s\n", inname, generatedMsg);
				break;
		case (true):
				if (infile > 2 && outfile > 2) {
					ModernizedCProgram.copymeta(inname, /* copy attributes */outname);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(inname);
				} 
				if (ret == (true)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gun warning: trailing garbage ignored in %s\n", inname);
				} 
				break;
		default:
				if (outfile > 2) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(outname);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "gun internal error--aborting\n");
				return 1;
		}
		return 0;
	}
	public Object[] getNext_in() {
		return next_in;
	}
	public void setNext_in(Object[] newNext_in) {
		next_in = newNext_in;
	}
	public Object getAvail_in() {
		return avail_in;
	}
	public void setAvail_in(Object newAvail_in) {
		avail_in = newAvail_in;
	}
	public Object getTotal_in() {
		return total_in;
	}
	public void setTotal_in(Object newTotal_in) {
		total_in = newTotal_in;
	}
	public Object getNext_out() {
		return next_out;
	}
	public void setNext_out(Object newNext_out) {
		next_out = newNext_out;
	}
	public Object getAvail_out() {
		return avail_out;
	}
	public void setAvail_out(Object newAvail_out) {
		avail_out = newAvail_out;
	}
	public Object getTotal_out() {
		return total_out;
	}
	public void setTotal_out(Object newTotal_out) {
		total_out = newTotal_out;
	}
	public Byte getMsg() {
		return msg;
	}
	public void setMsg(Byte newMsg) {
		msg = newMsg;
	}
	public internal_state getState() {
		return state;
	}
	public void setState(internal_state newState) {
		state = newState;
	}
	public Object getZalloc() {
		return zalloc;
	}
	public void setZalloc(Object newZalloc) {
		zalloc = newZalloc;
	}
	public Object getZfree() {
		return zfree;
	}
	public void setZfree(Object newZfree) {
		zfree = newZfree;
	}
	public Object getOpaque() {
		return opaque;
	}
	public void setOpaque(Object newOpaque) {
		opaque = newOpaque;
	}
	public int getData_type() {
		return data_type;
	}
	public void setData_type(int newData_type) {
		data_type = newData_type;
	}
	public Object getAdler() {
		return adler;
	}
	public void setAdler(Object newAdler) {
		adler = newAdler;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}
