package application;

public class last_object {
	private strbuf data;
	private Object offset;
	private int depth;
	private int no_swap;
	
	public last_object(strbuf data, Object offset, int depth, int no_swap) {
		setData(data);
		setOffset(offset);
		setDepth(depth);
		setNo_swap(no_swap);
	}
	public last_object() {
	}
	
	public strbuf getData() {
		return data;
	}
	public void setData(strbuf newData) {
		data = newData;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int newDepth) {
		depth = newDepth;
	}
	public int getNo_swap() {
		return no_swap;
	}
	public void setNo_swap(int newNo_swap) {
		no_swap = newNo_swap;
	}
}
