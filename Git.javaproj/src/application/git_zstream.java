package application;

public class git_zstream {
	private Object z;
	private long avail_in;
	private long avail_out;
	private long total_in;
	private long total_out;
	private Byte next_in;
	private Byte next_out;
	
	public git_zstream(Object z, long avail_in, long avail_out, long total_in, long total_out, Byte next_in, Byte next_out) {
		setZ(z);
		setAvail_in(avail_in);
		setAvail_out(avail_out);
		setTotal_in(total_in);
		setTotal_out(total_out);
		setNext_in(next_in);
		setNext_out(next_out);
	}
	public git_zstream() {
	}
	
	public int unpack_loose_short_header(Byte map, long mapsize, Object buffer, long bufsiz) {
		.memset(stream, 0, );
		this.setNext_in(map);
		this.setAvail_in(mapsize);
		this.setNext_out(buffer);
		this.setAvail_out(bufsiz);
		stream.git_inflate_init();
		return stream.git_inflate(0);
	}
	public int unpack_loose_header(Byte map, long mapsize, Object buffer, long bufsiz) {
		int status = stream.unpack_loose_short_header(map, mapsize, buffer, bufsiz);
		if (status < Z_OK) {
			return status;
		} 
		Byte generatedNext_out = this.getNext_out();
		if (!.memchr(buffer, (byte)'\0', generatedNext_out - (byte)/* Make sure we have the terminating NUL */buffer)) {
			return -1;
		} 
		return 0;
	}
	public Object unpack_loose_rest(Object buffer, long size, Object oid) {
		int bytes = .strlen(buffer) + 1;
		byte buf = ModernizedCProgram.xmallocz(size);
		long n;
		int status = Z_OK;
		long generatedTotal_out = this.getTotal_out();
		n = generatedTotal_out - bytes;
		if (n > size) {
			n = size;
		} 
		.memcpy(buf, (byte)buffer + bytes, n);
		bytes = n;
		if (bytes <= size/*
				 * The above condition must be (bytes <= size), not
				 * (bytes < size).  In other words, even though we
				 * expect no more output and set avail_out to zero,
				 * the input zlib stream may have bytes that express
				 * "this concludes the stream", and we *do* want to
				 * eat that input.
				 *
				 * Otherwise we would not be able to test that we
				 * consumed all the input to reach the expected size;
				 * we also want to check that zlib tells us that all
				 * went well with status == Z_STREAM_END at the end.
				 */) {
			this.setNext_out(buf + bytes);
			this.setAvail_out(size - bytes);
			while (status == Z_OK) {
				status = stream.git_inflate(Z_FINISH);
			}
		} 
		long generatedAvail_in = this.getAvail_in();
		if (status == Z_STREAM_END && !generatedAvail_in) {
			stream.git_inflate_end();
			return buf;
		} 
		if (status < 0) {
			();
		}  else if (generatedAvail_in) {
			();
		} 
		ModernizedCProgram.free(buf);
		return ((Object)0/*
		 * We used to just use "sscanf()", but that's actually way
		 * too permissive for what we want to check. So do an anal
		 * object header parse by hand.
		 */);
	}
	public int check_stream_oid(Object hdr, long size, Object path, Object expected_oid) {
		git_hash_ctx c = new git_hash_ctx();
		object_id real_oid = new object_id();
		byte[] buf = new byte[4096];
		long total_read;
		int status = Z_OK;
		.UNRECOGNIZEDFUNCTIONNAME(c);
		long generatedTotal_out = this.getTotal_out();
		.UNRECOGNIZEDFUNCTIONNAME(c, hdr, generatedTotal_out);
		total_read = generatedTotal_out - .strlen(hdr) - 1/*
			 * This size comparison must be "<=" to read the final zlib packets;
			 * see the comment in unpack_loose_rest for details.
			 */;
		long generatedAvail_out = this.getAvail_out();
		Byte generatedNext_out = this.getNext_out();
		while (total_read <= size && (status == Z_OK || (status == Z_BUF_ERROR && !generatedAvail_out))) {
			this.setNext_out(buf);
			this.setAvail_out();
			if (size - total_read < generatedAvail_out) {
				this.setAvail_out(size - total_read);
			} 
			status = stream.git_inflate(Z_FINISH);
			.UNRECOGNIZEDFUNCTIONNAME(c, buf, generatedNext_out - buf);
			total_read += generatedNext_out - buf;
		}
		stream.git_inflate_end();
		if (status != Z_STREAM_END) {
			();
			return -1;
		} 
		long generatedAvail_in = this.getAvail_in();
		if (generatedAvail_in) {
			();
			return -1;
		} 
		Object generatedHash = real_oid.getHash();
		.UNRECOGNIZEDFUNCTIONNAME(generatedHash, c);
		if (!ModernizedCProgram.oideq(expected_oid, real_oid)) {
			();
			return -1;
		} 
		return 0;
	}
	public void zlib_pre_call() {
		Byte generatedNext_in = this.getNext_in();
		Object generatedZ = this.getZ();
		generatedZ.setNext_in(generatedNext_in);
		Byte generatedNext_out = this.getNext_out();
		generatedZ.setNext_out(generatedNext_out);
		long generatedTotal_in = this.getTotal_in();
		generatedZ.setTotal_in(generatedTotal_in);
		long generatedTotal_out = this.getTotal_out();
		generatedZ.setTotal_out(generatedTotal_out);
		long generatedAvail_in = this.getAvail_in();
		generatedZ.setAvail_in(ModernizedCProgram.zlib_buf_cap(generatedAvail_in));
		long generatedAvail_out = this.getAvail_out();
		generatedZ.setAvail_out(ModernizedCProgram.zlib_buf_cap(generatedAvail_out));
	}
	public void zlib_post_call() {
		long bytes_consumed;
		long bytes_produced;
		Object generatedZ = this.getZ();
		Byte generatedNext_in = this.getNext_in();
		bytes_consumed = generatedZ.getNext_in() - generatedNext_in;
		Byte generatedNext_out = this.getNext_out();
		bytes_produced = generatedZ.getNext_out() - generatedNext_out;
		long generatedTotal_out = this.getTotal_out();
		if (generatedZ.getTotal_out() != generatedTotal_out + bytes_produced) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\zlib.c", 55, "total_out mismatch");
		} 
		long generatedTotal_in = this.getTotal_in();
		if (generatedZ.getTotal_in() != generatedTotal_in + bytes_consumed) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\zlib.c", 57, "total_in mismatch");
		} 
		this.setTotal_out(generatedTotal_out);
		this.setTotal_in(generatedTotal_in);
		this.setNext_in(generatedNext_in);
		this.setNext_out(generatedNext_out);
		long generatedAvail_in = this.getAvail_in();
		generatedAvail_in -= bytes_consumed;
		long generatedAvail_out = this.getAvail_out();
		generatedAvail_out -= bytes_produced;
	}
	public void git_inflate_init() {
		int status;
		strm.zlib_pre_call();
		Object generatedZ = this.getZ();
		status = .inflateInit(generatedZ);
		strm.zlib_post_call();
		if (status == Z_OK) {
			return ;
		} 
		ModernizedCProgram.die("inflateInit: %s (%s)", ModernizedCProgram.zerr_to_string(status), generatedZ.getMsg() ? generatedZ.getMsg() : "no message");
	}
	public void git_inflate_init_gzip_only() {
		int windowBits = 15 + 16;
		int status;
		strm.zlib_pre_call();
		Object generatedZ = this.getZ();
		status = .inflateInit2(generatedZ, windowBits);
		strm.zlib_post_call();
		if (status == Z_OK) {
			return ;
		} 
		ModernizedCProgram.die("inflateInit2: %s (%s)", ModernizedCProgram.zerr_to_string(status), generatedZ.getMsg() ? generatedZ.getMsg() : "no message");
	}
	/*
		 * Use default 15 bits, +16 is to accept only gzip and to
		 * yield Z_DATA_ERROR when fed zlib format.
		 */
	public void git_inflate_end() {
		int status;
		strm.zlib_pre_call();
		Object generatedZ = this.getZ();
		status = .inflateEnd(generatedZ);
		strm.zlib_post_call();
		if (status == Z_OK) {
			return ;
		} 
		();
	}
	public int git_inflate(int flush) {
		int status;
		Object generatedZ = this.getZ();
		long generatedAvail_in = this.getAvail_in();
		long generatedAvail_out = this.getAvail_out();
		for (; ; ) {
			strm.zlib_pre_call();
			status = .inflate(generatedZ, (generatedZ.getAvail_in() != generatedAvail_in) ? 0 : flush);
			if (status == Z_MEM_ERROR) {
				ModernizedCProgram.die("inflate: out of memory");
			} 
			strm/*
					 * Let zlib work another round, while we can still
					 * make progress.
					 */.zlib_post_call();
			if ((generatedAvail_out && !generatedAvail_out) && (status == Z_OK || status == Z_BUF_ERROR)) {
				continue;
			} 
			break;
		}
		switch (status) {
		case Z_STREAM_END:
				return status;
		case /* Z_BUF_ERROR: normal, needs more space in the output buffer */Z_BUF_ERROR:
		case Z_OK:
		default:
				break;
		}
		();
		return status;
	}
	public long git_deflate_bound(long size) {
		return ((size) + (((size) + 7) >> 3) + (((size) + 63) >> 6) + 11);
	}
	public void git_deflate_init(int level) {
		int status;
		.memset(strm, 0, );
		strm.zlib_pre_call();
		Object generatedZ = this.getZ();
		status = .deflateInit(generatedZ, level);
		strm.zlib_post_call();
		if (status == Z_OK) {
			return ;
		} 
		ModernizedCProgram.die("deflateInit: %s (%s)", ModernizedCProgram.zerr_to_string(status), generatedZ.getMsg() ? generatedZ.getMsg() : "no message");
	}
	public void do_git_deflate_init(int level, int windowBits) {
		int status;
		.memset(strm, 0, );
		strm.zlib_pre_call();
		Object generatedZ = this.getZ();
		status = .deflateInit2(generatedZ, level, Z_DEFLATED, windowBits, 8, Z_DEFAULT_STRATEGY);
		strm.zlib_post_call();
		if (status == Z_OK) {
			return ;
		} 
		ModernizedCProgram.die("deflateInit2: %s (%s)", ModernizedCProgram.zerr_to_string(status), generatedZ.getMsg() ? generatedZ.getMsg() : "no message");
	}
	public void git_deflate_init_gzip(int level) {
		strm.do_git_deflate_init(level, 15 + 16);
	}
	/*
		 * Use default 15 bits, +16 is to generate gzip header/trailer
		 * instead of the zlib wrapper.
		 */
	public void git_deflate_init_raw(int level) {
		strm.do_git_deflate_init(level, -15);
	}
	/*
		 * Use default 15 bits, negate the value to get raw compressed
		 * data without zlib header and trailer.
		 */
	public int git_deflate_abort() {
		int status;
		strm.zlib_pre_call();
		Object generatedZ = this.getZ();
		status = .deflateEnd(generatedZ);
		strm.zlib_post_call();
		return status;
	}
	public void git_deflate_end() {
		int status = strm.git_deflate_abort();
		if (status == Z_OK) {
			return ;
		} 
		();
	}
	public int git_deflate_end_gently() {
		int status;
		strm.zlib_pre_call();
		Object generatedZ = this.getZ();
		status = .deflateEnd(generatedZ);
		strm.zlib_post_call();
		return status;
	}
	public int git_deflate(int flush) {
		int status;
		Object generatedZ = this.getZ();
		long generatedAvail_in = this.getAvail_in();
		long generatedAvail_out = this.getAvail_out();
		for (; ; ) {
			strm.zlib_pre_call();
			status = .deflate(generatedZ, (generatedZ.getAvail_in() != generatedAvail_in) ? 0 : flush);
			if (status == Z_MEM_ERROR) {
				ModernizedCProgram.die("deflate: out of memory");
			} 
			strm/*
					 * Let zlib work another round, while we can still
					 * make progress.
					 */.zlib_post_call();
			if ((generatedAvail_out && !generatedAvail_out) && (status == Z_OK || status == Z_BUF_ERROR)) {
				continue;
			} 
			break;
		}
		switch (status) {
		case Z_OK:
		case /* Z_BUF_ERROR: normal, needs more space in the output buffer */Z_BUF_ERROR:
		case Z_STREAM_END:
				return status;
		default:
				break;
		}
		();
		return status;
	}
	public Object getZ() {
		return z;
	}
	public void setZ(Object newZ) {
		z = newZ;
	}
	public long getAvail_in() {
		return avail_in;
	}
	public void setAvail_in(long newAvail_in) {
		avail_in = newAvail_in;
	}
	public long getAvail_out() {
		return avail_out;
	}
	public void setAvail_out(long newAvail_out) {
		avail_out = newAvail_out;
	}
	public long getTotal_in() {
		return total_in;
	}
	public void setTotal_in(long newTotal_in) {
		total_in = newTotal_in;
	}
	public long getTotal_out() {
		return total_out;
	}
	public void setTotal_out(long newTotal_out) {
		total_out = newTotal_out;
	}
	public Byte getNext_in() {
		return next_in;
	}
	public void setNext_in(Byte newNext_in) {
		next_in = newNext_in;
	}
	public Byte getNext_out() {
		return next_out;
	}
	public void setNext_out(Byte newNext_out) {
		next_out = newNext_out;
	}
}
