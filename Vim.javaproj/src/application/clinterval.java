package application;

public class clinterval {
	private int first;
	private int last;
	private int class;
	
	public clinterval(int first, int last, int class) {
		setFirst(first);
		setLast(last);
		setClass(class);
	}
	public clinterval() {
	}
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int newFirst) {
		first = newFirst;
	}
	public int getLast() {
		return last;
	}
	public void setLast(int newLast) {
		last = newLast;
	}
	public int getClass() {
		return class;
	}
	public void setClass(int newClass) {
		class = newClass;
	}
}
