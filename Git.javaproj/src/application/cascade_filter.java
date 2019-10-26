package application;

public class cascade_filter {
	private stream_filter filter;
	private stream_filter one;
	private stream_filter two;
	private Object buf;
	private int end;
	private int ptr;
	
	public cascade_filter(stream_filter filter, stream_filter one, stream_filter two, Object buf, int end, int ptr) {
		setFilter(filter);
		setOne(one);
		setTwo(two);
		setBuf(buf);
		setEnd(end);
		setPtr(ptr);
	}
	public cascade_filter() {
	}
	
	public stream_filter getFilter() {
		return filter;
	}
	public void setFilter(stream_filter newFilter) {
		filter = newFilter;
	}
	public stream_filter getOne() {
		return one;
	}
	public void setOne(stream_filter newOne) {
		one = newOne;
	}
	public stream_filter getTwo() {
		return two;
	}
	public void setTwo(stream_filter newTwo) {
		two = newTwo;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int newEnd) {
		end = newEnd;
	}
	public int getPtr() {
		return ptr;
	}
	public void setPtr(int newPtr) {
		ptr = newPtr;
	}
}
