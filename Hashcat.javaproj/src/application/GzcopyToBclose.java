package application;

public class GzcopyToBclose {
	
	
	private static void gzcopy(Byte name, int clr, Long crc, Long tot) {
		/* return value from zlib functions */int ret;
		/* where the "last block" bit is in byte */int pos;
		/* true if processing the last block */int last;
		/* buffered input file */bin in = new bin();
		/* start of compressed data in buffer */byte[] start;
		/* buffer for uncompressed data -- discarded */Byte junk;
		/* length of uncompressed data (support > 4 GB) */long len;
		/* zlib inflate stream */z_stream strm = new z_stream();
		in = ModernizedCProgram.bopen(/* open gzip file and skip header */name);
		if (in == (null)) {
			ModernizedCProgram.bail("could not open ", name);
		} 
		in.gzhead();
		junk = /*Error: Function owner not recognized*/malloc(/* allocate buffer for uncompressed data and initialize raw inflate
		       stream */32768);
		strm.setZalloc(0);
		strm.setZfree(0);
		strm.setOpaque(0);
		strm.setAvail_in(0);
		strm.setNext_in(0);
		ret = ModernizedCProgram.inflateInit2_((strm), (true), "1.2.11", (int)/*Error: Unsupported expression*/);
		if (junk == (null) || ret != 0) {
			ModernizedCProgram.bail("out of memory", "");
		} 
		len = /* inflate and copy compressed data, clear last-block bit if requested */0;
		in.zpull(strm);
		Object generatedNext = in.getNext();
		start = generatedNext;
		last = start[0] & 1;
		if (last && clr) {
			start[0] &=  ~1;
		} 
		strm.setAvail_out(0);
		Object generatedAvail_in = strm.getAvail_in();
		Object generatedAvail_out = strm.getAvail_out();
		Object[] generatedNext_in = strm.getNext_in();
		Object generatedBuf = in.getBuf();
		Object generatedName = in.getName();
		int generatedData_type = strm.getData_type();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (generatedAvail_in == 0 && generatedAvail_out != /* if input used and output done, write used input and get more */0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(start, 1, generatedNext_in - start, out);
				start = generatedBuf;
				in.setLeft(0);
				in.zpull(strm);
			} 
			strm.setAvail_out(/* decompress -- return early when end-of-block reached */32768);
			strm.setNext_out(junk);
			ret = ModernizedCProgram.inflate(strm, 5);
			switch (ret) {
			case (true):
					ModernizedCProgram.bail("out of memory", "");
			case (true):
					ModernizedCProgram.bail("invalid compressed data in ", generatedName);
			}
			len += 32768 - generatedAvail_out;
			if (generatedData_type & /* check for block boundary (only get this when block copied out) */128) {
				if (/* if that was the last block, then done */last) {
					break;
				} 
				pos = generatedData_type & /* number of unused bits in last byte */7;
				if (pos != /* find the next last-block bit */0) {
					pos = -1024 >> /* next last-block bit is in last used byte */pos;
					last = generatedNext_in[-1] & pos;
					if (last && clr) {
						generatedBuf[generatedNext_in - generatedBuf - 1] &=  ~pos;
					} 
				} else {
						if (generatedAvail_in == /* next last-block bit is in next unused byte */0) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(start, 1, generatedNext_in - start, /* don't have that byte yet -- get it */out);
							start = generatedBuf;
							in.setLeft(0);
							in.zpull(strm);
						} 
						last = generatedNext_in[0] & 1;
						if (last && clr) {
							generatedBuf[generatedNext_in - generatedBuf] &=  ~1;
						} 
				} 
			} 
		}
		in.setLeft(generatedAvail_in);
		in.setNext(generatedBuf + (generatedNext_in - generatedBuf));
		pos = generatedData_type & /* copy used input, write empty blocks to get to byte boundary */7;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(start, 1, generatedNext - start - 1, out);
		last = generatedNext[-1];
		if (pos == 0 || !clr) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putc(last, /* already at byte boundary, or last file: write last byte */out);
		} else {
				last &=  ((-1024 >> pos) - /* append empty blocks to last byte *//* assure unused bits are zero */1);
				if (pos & 1) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putc(last, /* odd -- append an empty stored block */out);
					if (pos == 1) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putc(0, /* two more bits in block header */out);
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite("\0\0\xff\xff", 1, 4, out);
				} else {
						switch (/* even -- append 1, 2, or 3 empty fixed blocks */pos) {
						case 2:
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putc(last | -1024, out);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putc(0, out);
						case 6:
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putc(last | 8, out);
								last = 0;
						case 4:
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putc(last | -1024, out);
								last = 0;
						}
				} 
		} 
		crc = ModernizedCProgram.crc32_combine(crc, in.bget4(), /* update crc and tot */len);
		tot += (long)len;
		ModernizedCProgram.inflateEnd(/* clean up */strm);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(junk);
		in.bclose();
		if (!/* write trailer if this is the last gzip file */clr) {
			out.put4(crc);
			out.put4(tot);
		} 
	}
	/* skip the gzip header from file in */
	private static void gzhead() {
		int flags;
		Object generatedName = this.getName();
		if (() != -1024 || () != -1024 || () != /* verify gzip magic header and compression method */8) {
			ModernizedCProgram.bail(generatedName, " is not a valid gzip file");
		} 
		flags = ();
		if ((flags & -1024) != 0) {
			ModernizedCProgram.bail("unknown reserved bits set in ", generatedName);
		} 
		in.bskip(/* skip modification time, extra flags, and os */6);
		if (flags & /* skip extra field if present */4) {
			int len;
			len = ();
			len += (int)(()) << 8;
			in.bskip(len);
		} 
		if (flags & /* skip file name if present */8) {
			while (() != 0) {
				;
			}
		} 
		if (flags & /* skip comment if present */16) {
			while (() != 0) {
				;
			}
		} 
		if (flags & /* skip header crc if present */2) {
			in.bskip(2);
		} 
	}
	/* skip bytes in file */
	private static void bskip(int skip) {
		if (in == (null)) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedLeft = this.getLeft();
		Object generatedNext = this.getNext();
		if (skip <= generatedLeft) {
			generatedLeft -= skip;
			generatedNext += skip;
			return /*Error: Unsupported expression*/;
		} 
		skip -= generatedLeft;
		this.setLeft(0);
		Object generatedFd = this.getFd();
		Object generatedBuf = this.getBuf();
		Object generatedName = this.getName();
		if (skip > /* seek past multiples of CHUNK bytes */32768) {
			int left;
			left = skip & (32768 - 1);
			if (left == 0/* exact number of chunks: seek all the way minus one byte to check
			               for end-of-file with a read */) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lseek(generatedFd, skip - 1, 1);
				if (/*Error: Function owner not recognized*/read(generatedFd, generatedBuf, 1) != 1) {
					ModernizedCProgram.bail("unexpected end of file on ", generatedName);
				} 
				return /*Error: Unsupported expression*/;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lseek(generatedFd, skip - left, /* skip the integral chunks, update skip with remainder */1);
			skip = left;
		} 
		/* read more input and skip remainder */in.bload();
		if (skip > generatedLeft) {
			ModernizedCProgram.bail("unexpected end of file on ", generatedName);
		} 
		generatedLeft -= skip;
		generatedNext += skip/* -- end of buffered input functions -- */;
	}
	/* Load up zlib stream from buffered input, bail if end of file */
	private static void zpull(Object strm) {
		Object generatedLeft = this.getLeft();
		if (generatedLeft == 0) {
			in.bload();
		} 
		Object generatedName = this.getName();
		if (generatedLeft == 0) {
			ModernizedCProgram.bail("unexpected end of file on ", generatedName);
		} 
		strm.setAvail_in(generatedLeft);
		Object generatedNext = this.getNext();
		strm.setNext_in(generatedNext);
	}
	public static int inflateEnd(Object strm) {
		inflate_state state = new inflate_state();
		if (ModernizedCProgram.inflateStateCheck(strm)) {
			return (true);
		} 
		state = (inflate_state)strm.getState();
		Object generatedWindow = state.getWindow();
		if (generatedWindow != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((strm).getOpaque(), (voidpf)(generatedWindow));
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((strm).getOpaque(), (voidpf)(strm.getState()));
		strm.setState(0);
		;
		return 0;
	}
	/* close a buffered file and free allocated memory */
	private static void bclose() {
		Object generatedFd = this.getFd();
		Object generatedBuf = this.getBuf();
		if (in != (null)) {
			if (generatedFd != -1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedFd);
			} 
			if (generatedBuf != (null)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedBuf);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(in);
		} 
	}
}
