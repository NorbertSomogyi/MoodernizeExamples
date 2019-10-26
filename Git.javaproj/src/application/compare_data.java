package application;

public class compare_data {
	private object_entry entry;
	private git_istream st;
	private Byte buf;
	private long buf_size;
	
	public compare_data(object_entry entry, git_istream st, Byte buf, long buf_size) {
		setEntry(entry);
		setSt(st);
		setBuf(buf);
		setBuf_size(buf_size);
	}
	public compare_data() {
	}
	
	public object_entry getEntry() {
		return entry;
	}
	public void setEntry(object_entry newEntry) {
		entry = newEntry;
	}
	public git_istream getSt() {
		return st;
	}
	public void setSt(git_istream newSt) {
		st = newSt;
	}
	public Byte getBuf() {
		return buf;
	}
	public void setBuf(Byte newBuf) {
		buf = newBuf;
	}
	public long getBuf_size() {
		return buf_size;
	}
	public void setBuf_size(long newBuf_size) {
		buf_size = newBuf_size;
	}
}
