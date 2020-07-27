package application;

public class attr_item {
	private attr_item next;
	private Byte fname;
	private int mode;
	private Object time;
	
	public attr_item(attr_item next, Byte fname, int mode, Object time) {
		setNext(next);
		setFname(fname);
		setMode(mode);
		setTime(time);
	}
	public attr_item() {
	}
	
	/* push file attributes */
	public void push_attr(Byte fname, int mode, Object time) {
		attr_item item = new attr_item();
		item = (attr_item)/*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/);
		if (item == ((Object)0)) {
			ModernizedCProgram.error("Out of memory");
		} 
		item.setFname(/*Error: Function owner not recognized*/strdup(fname));
		item.setMode(mode);
		item.setTime(time);
		item.setNext(list);
		list = item;
	}
	/* restore file attributes */
	public void restore_attr() {
		attr_item item = new attr_item();
		attr_item prev = new attr_item();
		Byte generatedFname = item.getFname();
		Object generatedTime = item.getTime();
		int generatedMode = item.getMode();
		attr_item generatedNext = item.getNext();
		for (item = list; item != ((Object)0); /*Error: Unsupported expression*/) {
			ModernizedCProgram.setfiletime(generatedFname, generatedTime);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/chmod(generatedFname, generatedMode);
			prev = item;
			item = generatedNext;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(prev);
		}
		list = ((Object)0/* match regular expression */);
	}
	public attr_item getNext() {
		return next;
	}
	public void setNext(attr_item newNext) {
		next = newNext;
	}
	public Byte getFname() {
		return fname;
	}
	public void setFname(Byte newFname) {
		fname = newFname;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
	public Object getTime() {
		return time;
	}
	public void setTime(Object newTime) {
		time = newTime;
	}
}
