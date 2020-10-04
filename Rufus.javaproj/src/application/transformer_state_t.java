package application;

/* Meaning and direction (input/output) of the fields are transformer-specific */
public class transformer_state_t {
	private Object check_signature;
	private int dst_fd;
	private Object mem_output_size_max;
	private Object mem_output_size;
	private Byte mem_output_buf;
	private Object bytes_out;
	private Object bytes_in;
	private Object crc32;
	private Object mtime;
	
	public transformer_state_t(Object check_signature, int dst_fd, Object mem_output_size_max, Object mem_output_size, Byte mem_output_buf, Object bytes_out, Object bytes_in, Object crc32, Object mtime) {
		setCheck_signature(check_signature);
		setDst_fd(dst_fd);
		setMem_output_size_max(mem_output_size_max);
		setMem_output_size(mem_output_size);
		setMem_output_buf(mem_output_buf);
		setBytes_out(bytes_out);
		setBytes_in(bytes_in);
		setCrc32(crc32);
		setMtime(mtime);
	}
	public transformer_state_t() {
	}
	
	public int unpack_xz_stream() {
		long n = 0;
		xz_buf b = new xz_buf();
		xz_dec s = new xz_dec();
		xz_ret ret = xz_ret.XZ_STREAM_END;
		uint8_t in = (null);
		uint8_t out = (null);
		ssize_t nwrote = new ssize_t();
		ModernizedCProgram.xz_crc32_init();
		xz_dec xz_dec = new xz_dec();
		s = xz_dec.xz_dec_init(xz_mode.XZ_DYNALLOC, 1 << 26);
		if (!s) {
			do {
				do {
					if (ModernizedCProgram.bled_printf != (null)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: memory allocation error");
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: memory allocation error");
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
					} 
				} while (0);
				;
			} while (0);
		} 
		in = /*Error: Function owner not recognized*/malloc(65536);
		out = /*Error: Function owner not recognized*/malloc(65536);
		b.setIn(in);
		b.setIn_pos(0);
		b.setIn_size(0);
		b.setOut(out);
		b.setOut_pos(0);
		b.setOut_size(65536);
		Object generatedIn_pos = b.getIn_pos();
		Object generatedIn_size = b.getIn_size();
		Object generatedSrc_fd = this.getSrc_fd();
		Object generatedOut_pos = b.getOut_pos();
		Object generatedOut = b.getOut();
		while (1) {
			if (generatedIn_pos == generatedIn_size) {
				b.setIn_size(ModernizedCProgram.full_read(generatedSrc_fd, in, 65536));
				if ((int)generatedIn_size < 0) {
					do {
						do {
							if (ModernizedCProgram.bled_printf != (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: read error (errno: %d)", (/*Error: Function owner not recognized*/_errno()));
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: read error (errno: %d)", (/*Error: Function owner not recognized*/_errno()));
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
							} 
						} while (0);
						;
					} while (0);
				} 
				b.setIn_pos(0);
			} 
			xz_ret.ret = ModernizedCProgram.xz_dec_run(s, b);
			if (generatedOut_pos == 65536) {
				nwrote = xstate.transformer_write(generatedOut, generatedOut_pos);
				if (nwrote == -28) {
					xz_ret.ret = xz_ret.XZ_BUF_FULL;
					;
				} 
				if (nwrote < 0) {
					xz_ret.ret = xz_ret.XZ_DATA_ERROR;
					do {
						do {
							if (ModernizedCProgram.bled_printf != (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: write error (errno: %d)", (/*Error: Function owner not recognized*/_errno()));
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: write error (errno: %d)", (/*Error: Function owner not recognized*/_errno()));
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
							} 
						} while (0);
						;
					} while (0);
				} 
				n += nwrote;
				b.setOut_pos(0);
			} 
			if (xz_ret.ret == xz_ret.XZ_OK) {
				continue;
			} 
			if (xz_ret.ret == xz_ret.XZ_UNSUPPORTED_CHECK) {
				do {
					if (ModernizedCProgram.bled_printf != (null)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: unsupported check; not verifying file integrity");
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: unsupported check; not verifying file integrity");
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
					} 
				} while (0);
				continue;
			} 
			nwrote = xstate.transformer_write(generatedOut, generatedOut_pos);
			if (nwrote == -28) {
				xz_ret.ret = xz_ret.XZ_BUF_FULL;
				;
			} 
			if (nwrote < 0) {
				xz_ret.ret = xz_ret.XZ_DATA_ERROR;
				do {
					do {
						if (ModernizedCProgram.bled_printf != (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: write error (errno: %d)", (/*Error: Function owner not recognized*/_errno()));
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: write error (errno: %d)", (/*Error: Function owner not recognized*/_errno()));
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
						} 
					} while (0);
					;
				} while (0);
			} 
			n += nwrote;
			switch (xz_ret.ret) {
			case xz_ret.XZ_DATA_ERROR:
					do {
						do {
							if (ModernizedCProgram.bled_printf != (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: corrupted archive");
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: corrupted archive");
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
							} 
						} while (0);
						;
					} while (0);
			case xz_ret.XZ_FORMAT_ERROR:
					do {
						do {
							if (ModernizedCProgram.bled_printf != (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: not a .xz file");
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: not a .xz file");
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
							} 
						} while (0);
						;
					} while (0);
			case xz_ret.XZ_MEMLIMIT_ERROR:
					do {
						do {
							if (ModernizedCProgram.bled_printf != (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: memory usage limit error");
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: memory usage limit error");
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
							} 
						} while (0);
						;
					} while (0);
			case xz_ret.XZ_BUF_ERROR:
					do {
						do {
							if (ModernizedCProgram.bled_printf != (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: corrupted buffer");
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: corrupted buffer");
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
							} 
						} while (0);
						;
					} while (0);
			case xz_ret.XZ_BUF_FULL:
					break;
			case xz_ret.XZ_STREAM_END:
					xz_ret.ret = xz_ret.XZ_OK;
					;
			case xz_ret.XZ_MEM_ERROR:
					do {
						do {
							if (ModernizedCProgram.bled_printf != (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: memory allocation error");
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: memory allocation error");
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
							} 
						} while (0);
						;
					} while (0);
			case xz_ret.XZ_OPTIONS_ERROR:
					do {
						do {
							if (ModernizedCProgram.bled_printf != (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: unsupported XZ header option");
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: unsupported XZ header option");
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
							} 
						} while (0);
						;
					} while (0);
			default:
					do {
						do {
							if (ModernizedCProgram.bled_printf != (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: XZ decompression bug!");
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: XZ decompression bug!");
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
							} 
						} while (0);
						;
					} while (0);
			}
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(in);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(out);
		Object generatedMem_output_size_max = this.getMem_output_size_max();
		if (xz_ret.ret == xz_ret.XZ_OK) {
			return n;
		}  else if (xz_ret.ret == xz_ret.XZ_BUF_FULL) {
			return generatedMem_output_size_max;
		} else {
				return -xz_ret.ret;
		} 
	}
	/* vi: set sw=4 ts=4: */
	/* uncompress for busybox -- (c) 2002 Robert Griebl
	 *
	 * based on the original compress42.c source
	 * (see disclaimer below)
	 */
	/* (N)compress42.c - File compression ala IEEE Computer, Mar 1992.
	 *
	 * Authors:
	 *   Spencer W. Thomas   (decvax!harpo!utah-cs!utah-gr!thomas)
	 *   Jim McKie           (decvax!mcvax!jim)
	 *   Steve Davies        (decvax!vax135!petsd!peora!srd)
	 *   Ken Turkowski       (decvax!decwrl!turtlevax!ken)
	 *   James A. Woods      (decvax!ihnp4!ames!jaw)
	 *   Joe Orost           (decvax!vax135!petsd!joe)
	 *   Dave Mack           (csu@alembic.acs.com)
	 *   Peter Jannesen, Network Communication Systems
	 *                       (peter@ncs.nl)
	 *
	 * marc@suse.de : a small security fix for a buffer overflow
	 *
	 * [... History snipped ...]
	 *
	 */
	/* Default input buffer size */
	/* Default output buffer size */
	/* Defines for third byte of header */
	/* Mask for 'number of compresssion bits'       */
	/* Masks 0x20 and 0x40 are free.                */
	/* I think 0x20 should mean that there is       */
	/* a fourth header byte (for expansion).        */
	/* Block compression if table is full and       */
	/* compression rate is dropping flush tables    */
	/* the next two codes should not be changed lightly, as they must not   */
	/* lie within the contiguous general code space.                        */
	/* first free entry */
	/* table clear output code */
	/* initial number of bits/code */
	/* machine variants which require cc -Dmachine:  pdp11, z8000, DOS */
	/* 50% occupancy */
	/* unused */
	/* unused */
	/* unused */
	/*
	 * Decompress stdin to stdout.  This routine adapts to the codes in the
	 * file building the "string" table on-the-fly; requiring no table to
	 * be stored in the compressed file.
	 */
	public int unpack_Z_stream() {
		long total_written = 0;
		long retval = -1;
		Byte stackp;
		int finchar;
		long oldcode;
		long incode;
		int inbits;
		int posbits;
		int outpos;
		int insize;
		int bitmask;
		long free_ent;
		long maxcode;
		long maxmaxcode;
		int n_bits;
		int rsize = 0;
		/* were eating insane amounts of stack - */byte[] inbuf;
		/* bad for some embedded targets */Byte outbuf;
		Byte htab;
		int[] codetab;
		/* Hmm, these were statics - why?! */
		/* user settable max # bits/code *//* = BITS; */int maxbits;
		/* block compress mode -C compatible with 2.0 */
		/* = BLOCK_MODE; */int block_mode;
		if (xstate.check_signature16(.COMPRESS_MAGIC)) {
			return -1;
		} 
		inbuf = /*Error: Function owner not recognized*/calloc(2048 + 64, 1);
		outbuf = /*Error: Function owner not recognized*/calloc(2048 + 2048, 1);
		htab = /*Error: Function owner not recognized*/calloc((1 << 17), /* wasn't zeroed out before, maybe can xmalloc? */1);
		codetab = /*Error: Function owner not recognized*/calloc((1 << 17) * /*Error: sizeof expression not supported yet*/, 1);
		insize = 0;
		Object generatedSrc_fd = this.getSrc_fd();
		if (ModernizedCProgram.full_read(generatedSrc_fd, inbuf, 1) != /* xread isn't good here, we have to return - caller may want
			 * to do some cleanup (e.g. delete incomplete unpacked file etc) */1) {
			do {
				if (ModernizedCProgram.bled_printf != (null)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: short read");
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: short read");
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
				} 
			} while (0);
			;
		} 
		maxbits = inbuf[0] & -1024;
		block_mode = inbuf[0] & -1024;
		maxmaxcode = (-1024 << (maxbits));
		if (maxbits > 16) {
			do {
				if (ModernizedCProgram.bled_printf != (null)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: compressed with %d bits, can only handle 16 bits", maxbits);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: compressed with %d bits, can only handle 16 bits", maxbits);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
				} 
			} while (0);
			;
		} 
		n_bits = 9;
		maxcode = (-1024 << (true)) - 1;
		bitmask = (1 << 9) - 1;
		oldcode = -1;
		finchar = 0;
		outpos = 0;
		posbits = 0 << 3;
		free_ent = ((block_mode) ? 257 : 256/* As above, initialize the first 256 entries in the table. *//*clear_tab_prefixof(); - done by xzalloc */);
		{ 
			int i;
			for (i = 255; i >= 0; --i) {
				((byte)(htab))[i] = (byte)i;
			}
		}
		Object generatedMem_output_size_max = this.getMem_output_size_max();
		if (outpos > 0) {
			retval = xstate.transformer_write(outbuf, outpos);
			if (retval != (ssize_t)outpos) {
				retval = (retval == -28) ? generatedMem_output_size_max : -1;
			} 
			total_written += outpos;
		} 
		retval = total_written + 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(outbuf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(htab);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(codetab);
		return retval;
	}
	public int unpack_none() {
		do {
			if (ModernizedCProgram.bled_printf != (null)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: This compression type is not supported");
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: This compression type is not supported");
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
			} 
		} while (0);
		return -1;
	}
	public int unpack_zip_stream() {
		long n = -14;
		zip_header_t zip_header = new zip_header_t();
		Byte filename = (null);
		Object generatedSrc_fd = this.getSrc_fd();
		Object generatedRaw = zip_header.getRaw();
		Object generatedFormatted = (zip_header).getFormatted();
		Object generatedBytes_out = this.getBytes_out();
		Object generatedCrc32 = this.getCrc32();
		while (1) {
			uint32_t magic = new uint32_t();
			ModernizedCProgram.full_read(generatedSrc_fd, magic, /* Check magic number */4);
			if (magic == /* Central directory? It's at the end, so exit */.ZIP_CDF_MAGIC) {
				break;
			} 
			if (magic != .ZIP_FILEHEADER_MAGIC) {
				do {
					do {
						if (ModernizedCProgram.bled_printf != (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: invalid zip magic %08X", (int)magic);
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: invalid zip magic %08X", (int)magic);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
						} 
					} while (0);
					;
				} while (0);
			} 
			ModernizedCProgram.full_read(generatedSrc_fd, generatedRaw, /* Read the file header */26);
			do {
				generatedFormatted.setVersion((generatedFormatted.getVersion()));
				generatedFormatted.setMethod((generatedFormatted.getMethod()));
				generatedFormatted.setModtime((generatedFormatted.getModtime()));
				generatedFormatted.setModdate((generatedFormatted.getModdate()));
				generatedFormatted.setCrc32((generatedFormatted.getCrc32()));
				generatedFormatted.setCmpsize((generatedFormatted.getCmpsize()));
				generatedFormatted.setUcmpsize((generatedFormatted.getUcmpsize()));
				generatedFormatted.setFilename_len((generatedFormatted.getFilename_len()));
				generatedFormatted.setExtra_len((generatedFormatted.getExtra_len()));
			} while (0);
			if (generatedFormatted.getMethod() != 8) {
				do {
					do {
						if (ModernizedCProgram.bled_printf != (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: zip method method %d is not supported", generatedFormatted.getMethod());
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: zip method method %d is not supported", generatedFormatted.getMethod());
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
						} 
					} while (0);
					;
				} while (0);
			} 
			if (generatedFormatted.getZip_flags() & (true)) {
				do {
					do {
						if (ModernizedCProgram.bled_printf != (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: zip flags 1 and 8 are not supported");
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: zip flags 1 and 8 are not supported");
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
						} 
					} while (0);
					;
				} while (0/* 0x0001 - encrypted */);
			} 
			filename = /*Error: Function owner not recognized*/calloc(generatedFormatted.getFilename_len() + 1, /* Read filename */1);
			ModernizedCProgram.full_read(generatedSrc_fd, filename, generatedFormatted.getFilename_len());
			do {
				if (ModernizedCProgram.bled_printf != (null)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Processing archive file '%s'", filename);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Processing archive file '%s'", filename);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
				} 
			} while (0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(filename);
			ModernizedCProgram.unzip_skip(generatedSrc_fd, generatedFormatted.getExtra_len());
			this.setBytes_in(generatedFormatted.getCmpsize());
			n = xstate.inflate_unzip();
			if (n >= /* Validate decompression */0) {
				if (generatedFormatted.getUcmpsize() != generatedBytes_out) {
					do {
						do {
							if (ModernizedCProgram.bled_printf != (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: bad length");
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: bad length");
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
							} 
						} while (0);
						;
					} while (0);
				}  else if (generatedFormatted.getCrc32() != (generatedCrc32 ^ -1024)) {
					do {
						do {
							if (ModernizedCProgram.bled_printf != (null)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: crc error");
							} else {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: crc error");
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
							} 
						} while (0);
						;
					} while (0);
				} 
			}  else if (n != -28) {
				do {
					do {
						if (ModernizedCProgram.bled_printf != (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: inflate error");
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: inflate error");
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
						} 
					} while (0);
					;
				} while (0);
			} 
		}
	}
	/* Decompress src_fd to dst_fd.  Stops at end of bzip data, not end of file. */
	public int unpack_bz2_stream() {
		long total_written = 0;
		bunzip_data bd = new bunzip_data();
		Byte outbuf;
		int i;
		int nwrote;
		int len;
		if (xstate.check_signature16(.BZIP2_MAGIC)) {
			return -1;
		} 
		outbuf = /*Error: Function owner not recognized*/malloc(4096);
		len = 0;
		Object generatedSrc_fd = this.getSrc_fd();
		Object generatedMem_output_size_max = this.getMem_output_size_max();
		Object generatedHeaderCRC = bd.getHeaderCRC();
		Object generatedTotalCRC = bd.getTotalCRC();
		int generatedInbufCount = bd.getInbufCount();
		int generatedInbufPos = bd.getInbufPos();
		Object[] generatedInbuf = bd.getInbuf();
		while (/* "Process one BZ... stream" loop */1) {
			i = bd.start_bunzip(generatedSrc_fd, outbuf + 2, len);
			if (i == 0) {
				while (/* "Produce some output bytes" loop */1) {
					i = bd.read_bunzip(outbuf, 4096);
					if (i < /* error? */0) {
						break;
					} 
					i = 4096 - /* number of bytes produced */i;
					if (i == /* EOF? */0) {
						break;
					} 
					nwrote = (int)xstate.transformer_write(outbuf, i);
					if (nwrote != i) {
						i = (nwrote == -28) ? (int)generatedMem_output_size_max : ();
						;
					} 
					total_written += i;
				}
			} 
			if (i != () && i != 0) {
				do {
					if (ModernizedCProgram.bled_printf != (null)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: bunzip error %d", i);
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: bunzip error %d", i);
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
					} 
				} while (0);
				break;
			} 
			if (generatedHeaderCRC != generatedTotalCRC) {
				do {
					if (ModernizedCProgram.bled_printf != (null)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: CRC error");
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: CRC error");
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
					} 
				} while (0);
				break;
			} 
			i = /* Successfully unpacked one BZ stream */0/* Do we have "BZ..." after last processed byte?
					 * pbzip2 (parallelized bzip2) produces such files.
					 */;
			len = generatedInbufCount - generatedInbufPos;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(outbuf, generatedInbuf[generatedInbufPos], len);
			if (len < 2) {
				if (ModernizedCProgram.full_read(generatedSrc_fd, outbuf + len, 2 - len) != 2 - len) {
					break;
				} 
				len = 2;
			} 
			if ((uint16_t)outbuf != /* "BZ"? */.BZIP2_MAGIC) {
				break;
			} 
			bd.dealloc_bunzip();
			len -= 2;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(outbuf);
		return i ? i : total_written + 0;
	}
	/* Dumb little test thing, decompress stdin to stdout */
	/* For unzip */
	public int inflate_unzip() {
		long n;
		state_t state = new state_t();
		(state = /*Error: Function owner not recognized*/calloc(/*Error: sizeof expression not supported yet*/, 1));
		Object generatedTo_read = state.getTo_read();
		Object generatedBytes_in = this.getBytes_in();
		(generatedTo_read) = generatedBytes_in//	bytebuffer_max = 0x8000;;//	bytebuffer_max = 0x8000;
		int generatedBytebuffer_offset = state.getBytebuffer_offset();
		(generatedBytebuffer_offset) = 4;
		Byte generatedBytebuffer = state.getBytebuffer();
		(generatedBytebuffer) = /*Error: Function owner not recognized*/malloc(-1024);
		n = ModernizedCProgram.inflate_unzip_internal(state, xstate);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((generatedBytebuffer));
		Object generatedGunzip_crc = state.getGunzip_crc();
		this.setCrc32((generatedGunzip_crc));
		Object generatedGunzip_bytes_out = state.getGunzip_bytes_out();
		this.setBytes_out((generatedGunzip_bytes_out));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(state);
		return n/* For gunzip */;
	}
	public int unpack_gz_stream() {
		uint32_t v32 = new uint32_t();
		long total;
		long n;
		state_t state = new state_t();
		if (xstate.check_signature16(.GZIP_MAGIC)) {
			return -1;
		} 
		total = 0;
		(state = /*Error: Function owner not recognized*/calloc(/*Error: sizeof expression not supported yet*/, 1));
		Object generatedTo_read = state.getTo_read();
		(generatedTo_read) = -1//	bytebuffer_max = 0x8000;;//	bytebuffer_max = 0x8000;
		Byte generatedBytebuffer = state.getBytebuffer();
		(generatedBytebuffer) = /*Error: Function owner not recognized*/malloc(-1024);
		int generatedGunzip_src_fd = state.getGunzip_src_fd();
		Object generatedSrc_fd = this.getSrc_fd();
		(generatedGunzip_src_fd) = generatedSrc_fd;
		n = ModernizedCProgram.inflate_unzip_internal(state, xstate);
		Object generatedMem_output_size_max = this.getMem_output_size_max();
		if (n < 0) {
			total = (n == -28) ? generatedMem_output_size_max : n;
			;
		} 
		total += n;
		if (!state.top_up(8)) {
			do {
				if (ModernizedCProgram.bled_printf != (null)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: corrupted data");
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: corrupted data");
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
				} 
			} while (0);
			total = -1;
			;
		} 
		v32 = /* Validate decompression - crc */state.buffer_read_le_u32();
		Object generatedGunzip_crc = state.getGunzip_crc();
		if ((~(generatedGunzip_crc)) != v32) {
			do {
				if (ModernizedCProgram.bled_printf != (null)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: crc error");
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: crc error");
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
				} 
			} while (0);
			total = -1;
			;
		} 
		v32 = /* Validate decompression - size */state.buffer_read_le_u32();
		Object generatedGunzip_bytes_out = state.getGunzip_bytes_out();
		if ((uint32_t)(generatedGunzip_bytes_out) != v32) {
			do {
				if (ModernizedCProgram.bled_printf != (null)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: incorrect length");
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: incorrect length");
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
				} 
			} while (0);
			total = -1;
		} 
		if (!state.top_up(2)) {
			;
		} 
		int generatedBytebuffer_offset = state.getBytebuffer_offset();
		if ((generatedBytebuffer)[(generatedBytebuffer_offset)] == -1024 && (generatedBytebuffer)[(generatedBytebuffer_offset) + 1] == -1024) {
			(generatedBytebuffer_offset) += 2;
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(state);
		return total;
	}
	/* vi: set sw=4 ts=4: */
	/*
	 * Licensed under GPLv2 or later, see file LICENSE in this source tree.
	 */
	public void init_transformer_state() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(xstate, 0, /*Error: sizeof expression not supported yet*/);
	}
	public int check_signature16(int magic16) {
		Object generatedCheck_signature = this.getCheck_signature();
		Object generatedSrc_fd = this.getSrc_fd();
		if (generatedCheck_signature) {
			uint16_t magic2 = new uint16_t();
			if (ModernizedCProgram.full_read(generatedSrc_fd, magic2, 2) != 2 || magic2 != magic16) {
				do {
					if (ModernizedCProgram.bled_printf != (null)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: invalid magic");
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: invalid magic");
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
					} 
				} while (0/* possible future extension *//* possible future extension */);
				return -1;
			} 
		} 
		return 0;
	}
	public Object transformer_write(Object buf, Object bufsize) {
		ssize_t nwrote = new ssize_t();
		Object generatedMem_output_size_max = this.getMem_output_size_max();
		Object generatedMem_output_size = this.getMem_output_size();
		Byte generatedMem_output_buf = this.getMem_output_buf();
		int generatedDst_fd = this.getDst_fd();
		if (generatedMem_output_size_max != 0) {
			size_t pos = generatedMem_output_size;
			nwrote = bufsize;
			if ((pos + bufsize) > generatedMem_output_size_max) {
				bufsize = generatedMem_output_size_max - pos;
				nwrote = -28;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedMem_output_buf + pos, buf, bufsize);
			generatedMem_output_size += bufsize;
		} else {
				nwrote = /*Error: Function owner not recognized*/_write(generatedDst_fd, buf, (int)bufsize);
				if (nwrote != (ssize_t)bufsize) {
					do {
						if (ModernizedCProgram.bled_printf != (null)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: write error - %d bytes written but %d expected", (int)nwrote, (int)bufsize);
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: write error - %d bytes written but %d expected", (int)nwrote, (int)bufsize);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
						} 
					} while (0);
					nwrote = -1;
					;
				} 
		} 
	}
	public Object xtransformer_write(Object buf, Object bufsize) {
		ssize_t nwrote = xstate.transformer_write(buf, bufsize);
		if (nwrote != (ssize_t)bufsize) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/longjmp(ModernizedCProgram.bb_error_jmp, 1);
		} 
		return nwrote;
	}
	public int unpack_lzma_stream() {
		long total_written = 0;
		lzma_header_t header = new lzma_header_t();
		int lc;
		int pb;
		int lp;
		uint32_t pos_state_mask = new uint32_t();
		uint32_t literal_pos_mask = new uint32_t();
		uint16_t[] p = new uint16_t();
		rc_t rc = new rc_t();
		int i;
		uint8_t[] buffer = new uint8_t();
		uint8_t previous_byte = 0;
		size_t buffer_pos = 0;
		size_t global_pos = 0;
		ssize_t nwrote = new ssize_t();
		int len = 0;
		int state = 0;
		uint32_t rep0 = 1;
		uint32_t rep1 = 1;
		uint32_t rep2 = 1;
		uint32_t rep3 = 1;
		Object generatedSrc_fd = this.getSrc_fd();
		Object generatedPos = header.getPos();
		if (ModernizedCProgram.full_read(generatedSrc_fd, header, /*Error: sizeof expression not supported yet*/) != /*Error: sizeof expression not supported yet*/ || generatedPos >= (9 * 5 * 5)) {
			do {
				if (ModernizedCProgram.bled_printf != (null)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bled_printf("Error: bad lzma header");
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: bad lzma header");
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
				} 
			} while (0);
			return -1;
		} 
		i = generatedPos / 9;
		lc = generatedPos % 9;
		pb = i / 5;
		lp = i % 5;
		pos_state_mask = (1 << pb) - 1;
		literal_pos_mask = (1 << lp) - 1/* Example values from linux-3.3.4.tar.lzma:
			 * dict_size: 64M, dst_size: 2^64-1
			 */;
		Object generatedDict_size = header.getDict_size();
		header.setDict_size((generatedDict_size));
		Object generatedDst_size = header.getDst_size();
		header.setDst_size((generatedDst_size));
		if (generatedDict_size == 0) {
			generatedDict_size++;
		} 
		buffer = /*Error: Function owner not recognized*/malloc((size_t)(((generatedDst_size) < (generatedDict_size)) ? (generatedDst_size) : (generatedDict_size)));
		{ 
			int num_probs;
			num_probs = .LZMA_BASE_SIZE + (.LZMA_LIT_SIZE << (lc + lp));
			p = /*Error: Function owner not recognized*/malloc(num_probs * /*Error: sizeof expression not supported yet*/);
			num_probs += .LZMA_LITERAL - .LZMA_BASE_SIZE;
			for (i = 0; i < num_probs; i++) {
				p[i] = (1 << 11) >> 1;
			}
		}
		rc = ModernizedCProgram.rc_init(generatedSrc_fd);
	}
	public Object getCheck_signature() {
		return check_signature;
	}
	public void setCheck_signature(Object newCheck_signature) {
		check_signature = newCheck_signature;
	}
	public int getDst_fd() {
		return dst_fd;
	}
	public void setDst_fd(int newDst_fd) {
		dst_fd = newDst_fd;
	}
	public Object getMem_output_size_max() {
		return mem_output_size_max;
	}
	public void setMem_output_size_max(Object newMem_output_size_max) {
		mem_output_size_max = newMem_output_size_max;
	}
	public Object getMem_output_size() {
		return mem_output_size;
	}
	public void setMem_output_size(Object newMem_output_size) {
		mem_output_size = newMem_output_size;
	}
	public Byte getMem_output_buf() {
		return mem_output_buf;
	}
	public void setMem_output_buf(Byte newMem_output_buf) {
		mem_output_buf = newMem_output_buf;
	}
	public Object getBytes_out() {
		return bytes_out;
	}
	public void setBytes_out(Object newBytes_out) {
		bytes_out = newBytes_out;
	}
	public Object getBytes_in() {
		return bytes_in;
	}
	public void setBytes_in(Object newBytes_in) {
		bytes_in = newBytes_in;
	}
	public Object getCrc32() {
		return crc32;
	}
	public void setCrc32(Object newCrc32) {
		crc32 = newCrc32;
	}
	public Object getMtime() {
		return mtime;
	}
	public void setMtime(Object newMtime) {
		mtime = newMtime;
	}
}
