package application;

public class sync_cb {
	private Object prefix;
	private int flags;
	
	public sync_cb(Object prefix, int flags) {
		setPrefix(prefix);
		setFlags(flags);
	}
	public sync_cb() {
	}
	
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
