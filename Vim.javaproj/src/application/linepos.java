package application;

public class linepos {
	private Object start;
	private Object end;
	
	public linepos(Object start, Object end) {
		setStart(start);
		setEnd(end);
	}
	public linepos() {
	}
	
	public Object getStart() {
		return start;
	}
	public void setStart(Object newStart) {
		start = newStart;
	}
	public Object getEnd() {
		return end;
	}
	public void setEnd(Object newEnd) {
		end = newEnd;
	}
}
