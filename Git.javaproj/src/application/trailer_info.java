package application;

public class trailer_info {
	private int blank_line_before_trailer;
	private Object trailer_start;
	private Object trailer_end;
	private byte[][] trailers;
	private Object trailer_nr;
	
	public trailer_info(int blank_line_before_trailer, Object trailer_start, Object trailer_end, byte[][] trailers, Object trailer_nr) {
		setBlank_line_before_trailer(blank_line_before_trailer);
		setTrailer_start(trailer_start);
		setTrailer_end(trailer_end);
		setTrailers(trailers);
		setTrailer_nr(trailer_nr);
	}
	public trailer_info() {
	}
	
	public void trailer_info_get(Object str, Object opts) {
		int patch_start;
		int trailer_end;
		int trailer_start;
		strbuf trailer_lines = new strbuf();
		strbuf ptr = new strbuf();
		byte trailer_strings = ((Object)0);
		size_t nr = 0;
		size_t alloc = 0;
		byte last = ((Object)0);
		ModernizedCProgram.ensure_configured();
		if (opts.getNo_divider()) {
			patch_start = /*Error: Function owner not recognized*/strlen(str);
		} else {
				patch_start = ModernizedCProgram.find_patch_start(str);
		} 
		trailer_end = ModernizedCProgram.find_trailer_end(str, patch_start);
		trailer_start = ModernizedCProgram.find_trailer_start(str, trailer_end);
		strbuf strbuf = new strbuf();
		trailer_lines = strbuf.strbuf_split_buf(str + trailer_start, trailer_end - trailer_start, (byte)'\n', 0);
		byte[] generatedBuf = (ptr).getBuf();
		for (ptr = trailer_lines; ptr; ptr++) {
			if (last && ((ModernizedCProgram.sane_ctype[(byte)(generatedBuf[0])] & (true)) != 0)) {
				strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
				sb.strbuf_attach(last, /*Error: Function owner not recognized*/strlen(last), /*Error: Function owner not recognized*/strlen(last));
				sb.strbuf_addbuf(ptr);
				last = sb.strbuf_detach(((Object)0));
				continue;
			} 
			do {
				if ((nr + 1) > alloc) {
					if ((((alloc) + 16) * 3 / 2) < (nr + 1)) {
						alloc = (nr + 1);
					} else {
							alloc = (((alloc) + 16) * 3 / 2);
					} 
					(trailer_strings) = ModernizedCProgram.xrealloc((trailer_strings), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (alloc)));
				} 
			} while (0);
			trailer_strings[nr] = ptr.strbuf_detach(((Object)0));
			last = ModernizedCProgram.find_separator(trailer_strings[nr], ModernizedCProgram.separators) >= 1 ? trailer_strings[nr] : ((Object)0);
			nr++;
		}
		trailer_lines.strbuf_list_free();
		this.setBlank_line_before_trailer(ModernizedCProgram.ends_with_blank_line(str, trailer_start));
		this.setTrailer_start(str + trailer_start);
		this.setTrailer_end(str + trailer_end);
		this.setTrailers(trailer_strings);
		this.setTrailer_nr(nr);
	}
	public void trailer_info_release() {
		size_t i = new size_t();
		Object generatedTrailer_nr = this.getTrailer_nr();
		byte[][] generatedTrailers = this.getTrailers();
		for (i = 0; i < generatedTrailer_nr; i++) {
			ModernizedCProgram.free(generatedTrailers[i]);
		}
		ModernizedCProgram.free(generatedTrailers);
	}
	public int getBlank_line_before_trailer() {
		return blank_line_before_trailer;
	}
	public void setBlank_line_before_trailer(int newBlank_line_before_trailer) {
		blank_line_before_trailer = newBlank_line_before_trailer;
	}
	public Object getTrailer_start() {
		return trailer_start;
	}
	public void setTrailer_start(Object newTrailer_start) {
		trailer_start = newTrailer_start;
	}
	public Object getTrailer_end() {
		return trailer_end;
	}
	public void setTrailer_end(Object newTrailer_end) {
		trailer_end = newTrailer_end;
	}
	public byte[][] getTrailers() {
		return trailers;
	}
	public void setTrailers(byte[][] newTrailers) {
		trailers = newTrailers;
	}
	public Object getTrailer_nr() {
		return trailer_nr;
	}
	public void setTrailer_nr(Object newTrailer_nr) {
		trailer_nr = newTrailer_nr;
	}
}
/*
	 * True if there is a blank line before the location pointed to by
	 * trailer_start.
	 */
