package application;

public class line_buffer {
	private Object line_buffer;
	private Object infile;
	
	public line_buffer(Object line_buffer, Object infile) {
		setLine_buffer(line_buffer);
		setInfile(infile);
	}
	public line_buffer() {
	}
	
	public int error_short_read() {
		if (ModernizedCProgram.input.buffer_ferror()) {
			return ();
		} 
		return ();
	}
	public int read_magic(Object len) {
		byte[] magic = new byte[]{(byte)'S', (byte)'V', (byte)'N', (byte)'\0'};
		strbuf sb = new strbuf(, , );
		if (ModernizedCProgram.read_chunk(in, len, sb, )) {
			sb.strbuf_release();
			return -1;
		} 
		byte generatedBuf = sb.getBuf();
		if (.memcmp(generatedBuf, magic, )) {
			sb.strbuf_release();
			return ();
		} 
		sb.strbuf_release();
		return 0;
	}
	public int read_int(Object result, Object len) {
		uintmax_t rv = 0;
		off_t sz = new off_t();
		for (sz = len; sz; sz--) {
			int ch = in.buffer_read_char();
			if (ch == (true)) {
				break;
			} 
			rv <<=  7;
			rv += (ch & -1024);
			if (ch & -1024) {
				continue;
			} 
			result = rv;
			len = sz - 1;
			return 0;
		}
		return in.error_short_read();
	}
	public int read_offset(Object result, Object len) {
		uintmax_t val = new uintmax_t();
		if (in.read_int(val, len)) {
			return -1;
		} 
		if (val > (-1024 >> ((8 * ) - (8 * )))) {
			return ();
		} 
		result = val;
		return 0;
	}
	public int read_length(Object result, Object len) {
		uintmax_t val = new uintmax_t();
		if (in.read_int(val, len)) {
			return -1;
		} 
		if (val > -1024) {
			return ();
		} 
		result = val;
		return 0;
	}
	/*
	 * Licensed under a two-clause BSD-style license.
	 * See LICENSE for details.
	 */
	public int input_error() {
		if (!ModernizedCProgram.file.buffer_ferror()) {
			return ();
		} 
		return ();
	}
	public int skip_or_whine(Object gap) {
		if (ModernizedCProgram.file.buffer_skip_bytes(gap) != gap) {
			return ModernizedCProgram.file.input_error();
		} 
		return 0;
	}
	/*
	 * Licensed under a two-clause BSD-style license.
	 * See LICENSE for details.
	 */
	public int buffer_init(Object filename) {
		ModernizedCProgram.buf.setInfile(filename ? .fopen(filename, "r") : (_iob[0]));
		if (!ModernizedCProgram.buf.getInfile()) {
			return -1;
		} 
		return 0;
	}
	public int buffer_fdinit(int fd) {
		ModernizedCProgram.buf.setInfile(.fdopen(fd, "r"));
		if (!ModernizedCProgram.buf.getInfile()) {
			return -1;
		} 
		return 0;
	}
	public int buffer_tmpfile_init() {
		ModernizedCProgram.buf.setInfile(.tmpfile());
		if (!ModernizedCProgram.buf.getInfile()) {
			return -1;
		} 
		return 0;
	}
	public int buffer_deinit() {
		int err;
		if (ModernizedCProgram.buf.getInfile() == (_iob[0])) {
			return ((ModernizedCProgram.buf.getInfile()).get_flag() & -1024);
		} 
		err = ((ModernizedCProgram.buf.getInfile()).get_flag() & -1024);
		err |=  .fclose(ModernizedCProgram.buf.getInfile());
		return err;
	}
	public _iobuf buffer_tmpfile_rewind() {
		.rewind(ModernizedCProgram.buf.getInfile());
		return ModernizedCProgram.buf.getInfile();
	}
	public long buffer_tmpfile_prepare_to_read() {
		long pos = .ftell(ModernizedCProgram.buf.getInfile());
		if (pos < 0) {
			return ();
		} 
		if (.fseek(ModernizedCProgram.buf.getInfile(), 0, 0)) {
			return ();
		} 
		return pos;
	}
	public int buffer_ferror() {
		return ((ModernizedCProgram.buf.getInfile()).get_flag() & -1024);
	}
	public int buffer_read_char() {
		return .fgetc(ModernizedCProgram.buf.getInfile());
	}
	/* Read a line without trailing newline. */
	public Byte buffer_read_line() {
		byte end;
		if (!.fgets(ModernizedCProgram.buf.getLine_buffer(), , ModernizedCProgram.buf.getInfile())) {
			return ((Object)/* Error or data exhausted. */0);
		} 
		end = ModernizedCProgram.buf.getLine_buffer() + .strlen(ModernizedCProgram.buf.getLine_buffer());
		if (end[-1] == (byte)'\n') {
			end[-1] = (byte)'\0';
		}  else if (((ModernizedCProgram.buf.getInfile()).get_flag() & -1024)) {
			;
		} else {
				return ((Object)0);
		} 
		return ModernizedCProgram.buf.getLine_buffer();
	}
	public Object buffer_copy_bytes(Object nbytes) {
		byte[] byte_buffer = new byte[4096];
		off_t done = 0;
		while (done < nbytes && !((ModernizedCProgram.buf.getInfile()).get_flag() & -1024) && !((ModernizedCProgram.buf.getInfile()).get_flag() & -1024)) {
			off_t len = nbytes - done;
			size_t in = ModernizedCProgram.len < 4096 ? ModernizedCProgram.len : 4096;
			in = .fread(byte_buffer, 1, in, ModernizedCProgram.buf.getInfile());
			done += in;
			.fwrite(byte_buffer, 1, in, (_iob[1]));
			if ((((_iob[1])).get_flag() & -1024)) {
				return done + ModernizedCProgram.buf.buffer_skip_bytes(nbytes - done);
			} 
		}
		return done;
	}
	public Object buffer_skip_bytes(Object nbytes) {
		byte[] byte_buffer = new byte[4096];
		off_t done = 0;
		while (done < nbytes && !((ModernizedCProgram.buf.getInfile()).get_flag() & -1024) && !((ModernizedCProgram.buf.getInfile()).get_flag() & -1024)) {
			off_t len = nbytes - done;
			size_t in = ModernizedCProgram.len < 4096 ? ModernizedCProgram.len : 4096;
			done += .fread(byte_buffer, 1, in, ModernizedCProgram.buf.getInfile());
		}
		return done;
	}
	public void fast_export_data(Object mode, Object len) {
		((len >= 0) ? (Object)0 : ._assert("len >= 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fast_export.c", 245));
		if (mode == S_IFLNK) {
			if (len < /* svn symlink blobs start with "link " */5) {
				ModernizedCProgram.die("invalid dump: symlink too short for \"link\" prefix");
			} 
			len -= 5;
			if (ModernizedCProgram.input.buffer_skip_bytes(5) != 5) {
				ModernizedCProgram.die_short_read(ModernizedCProgram.input);
			} 
		} 
		.printf("data %llu\n", (uintmax_t)len);
		if (ModernizedCProgram.input.buffer_copy_bytes(len) != len) {
			ModernizedCProgram.die_short_read(ModernizedCProgram.input);
		} 
		.fputc((byte)'\n', (_iob[1]));
	}
	public void fast_export_blob_delta(Object mode, Object old_mode, Object old_data, Object len) {
		long postimage_len;
		((len >= 0) ? (Object)0 : ._assert("len >= 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fast_export.c", 356));
		postimage_len = ModernizedCProgram.apply_delta(len, ModernizedCProgram.input, old_data, old_mode);
		if (mode == S_IFLNK) {
			ModernizedCProgram.postimage.buffer_skip_bytes(.strlen("link "));
			postimage_len -= .strlen("link ");
		} 
		.printf("data %ld\n", postimage_len);
		ModernizedCProgram.postimage.buffer_copy_bytes(postimage_len);
		.fputc((byte)'\n', (_iob[1]));
	}
	public Object getLine_buffer() {
		return line_buffer;
	}
	public void setLine_buffer(Object newLine_buffer) {
		line_buffer = newLine_buffer;
	}
	public Object getInfile() {
		return infile;
	}
	public void setInfile(Object newInfile) {
		infile = newInfile;
	}
}
