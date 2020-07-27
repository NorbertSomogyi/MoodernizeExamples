package application;

public class sliding_view {
	private line_buffer file;
	private Object off;
	private Object width;
	private Object max_off;
	private strbuf buf;
	
	public sliding_view(line_buffer file, Object off, Object width, Object max_off, strbuf buf) {
		setFile(file);
		setOff(off);
		setWidth(width);
		setMax_off(max_off);
		setBuf(buf);
	}
	public sliding_view() {
	}
	
	public int move_window(Object off, Object width) {
		off_t file_offset = new off_t();
		((view) ? (Object)0 : /*Error: Function owner not recognized*/_assert("view", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\sliding_window.c", 49));
		Object generatedWidth = this.getWidth();
		strbuf generatedBuf = this.getBuf();
		Object generatedLen = generatedBuf.getLen();
		((generatedWidth <= generatedLen) ? (Object)0 : /*Error: Function owner not recognized*/_assert("view->width <= view->buf.len", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\sliding_window.c", 50));
		Object generatedOff = this.getOff();
		((!ModernizedCProgram.check_offset_overflow(generatedOff, generatedLen)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!check_offset_overflow(view->off, view->buf.len)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\sliding_window.c", 51));
		if (ModernizedCProgram.check_offset_overflow(off, width)) {
			return -1;
		} 
		if (off < generatedOff || off + width < generatedOff + generatedWidth) {
			return ();
		} 
		Object generatedMax_off = this.getMax_off();
		if (generatedMax_off >= 0 && generatedMax_off < off + (off_t)width) {
			return ();
		} 
		file_offset = generatedOff + generatedLen;
		line_buffer generatedFile = this.getFile();
		if (off < file_offset) {
			generatedBuf.strbuf_remove(0, off - generatedOff);
		} else {
				if (generatedFile.skip_or_whine(off - /* Seek ahead to skip the gap. */file_offset)) {
					return -1;
				} 
				generatedBuf.strbuf_setlen(0);
		} 
		if (generatedLen > width) {
			;
		}  else if (ModernizedCProgram.read_to_fill_or_whine(generatedFile, generatedBuf, width)) {
			return -1;
		} 
		this.setOff(off);
		this.setWidth(width);
		return 0;
	}
	public line_buffer getFile() {
		return file;
	}
	public void setFile(line_buffer newFile) {
		file = newFile;
	}
	public Object getOff() {
		return off;
	}
	public void setOff(Object newOff) {
		off = newOff;
	}
	public Object getWidth() {
		return width;
	}
	public void setWidth(Object newWidth) {
		width = newWidth;
	}
	public Object getMax_off() {
		return max_off;
	}
	public void setMax_off(Object newMax_off) {
		max_off = newMax_off;
	}
	public strbuf getBuf() {
		return buf;
	}
	public void setBuf(strbuf newBuf) {
		buf = newBuf;
	}
}
