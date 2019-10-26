package application;

public class zip_extra_mtime {
	private Object magic;
	private Object extra_size;
	private Object flags;
	private Object mtime;
	private Object _end;
	
	public zip_extra_mtime(Object magic, Object extra_size, Object flags, Object mtime, Object _end) {
		setMagic(magic);
		setExtra_size(extra_size);
		setFlags(flags);
		setMtime(mtime);
		set_end(_end);
	}
	public zip_extra_mtime() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getExtra_size() {
		return extra_size;
	}
	public void setExtra_size(Object newExtra_size) {
		extra_size = newExtra_size;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
	public Object getMtime() {
		return mtime;
	}
	public void setMtime(Object newMtime) {
		mtime = newMtime;
	}
	public Object get_end() {
		return _end;
	}
	public void set_end(Object new_end) {
		_end = new_end;
	}
}
