package application;

public class snapshot_record {
	private Object start;
	private Object len;
	
	public snapshot_record(Object start, Object len) {
		setStart(start);
		setLen(len);
	}
	public snapshot_record() {
	}
	
	public Object getStart() {
		return start;
	}
	public void setStart(Object newStart) {
		start = newStart;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
}
