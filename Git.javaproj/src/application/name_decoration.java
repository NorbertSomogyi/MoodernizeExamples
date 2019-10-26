package application;

/* While we can decorate any object with a name, it's only used for commits.. */
public class name_decoration {
	private name_decoration next;
	private int type;
	private Object name;
	
	public name_decoration(name_decoration next, int type, Object name) {
		setNext(next);
		setType(type);
		setName(name);
	}
	public name_decoration() {
	}
	
	public name_decoration getNext() {
		return next;
	}
	public void setNext(name_decoration newNext) {
		next = newNext;
	}
	public int getType() {
		return type;
	}
	public void setType(int newType) {
		type = newType;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
