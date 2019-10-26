package application;

public class rev_cmdline_entry {
	private object item;
	private Object name;
	private  whence;
	private int flags;
	
	public rev_cmdline_entry(object item, Object name,  whence, int flags) {
		setItem(item);
		setName(name);
		setWhence(whence);
		setFlags(flags);
	}
	public rev_cmdline_entry() {
	}
	
	public object getItem() {
		return item;
	}
	public void setItem(object newItem) {
		item = newItem;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public  getWhence() {
		return whence;
	}
	public void setWhence( newWhence) {
		whence = newWhence;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
