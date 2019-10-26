package application;

public class interval {
	private Object first;
	private Object last;
	
	public interval(Object first, Object last) {
		setFirst(first);
		setLast(last);
	}
	public interval() {
	}
	
	public Object getFirst() {
		return first;
	}
	public void setFirst(Object newFirst) {
		first = newFirst;
	}
	public Object getLast() {
		return last;
	}
	public void setLast(Object newLast) {
		last = newLast;
	}
}
