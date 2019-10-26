package application;

public class xz_buf {
	private Object in;
	private Object in_pos;
	private Object in_size;
	private Object out;
	private Object out_pos;
	private Object out_size;
	
	public xz_buf(Object in, Object in_pos, Object in_size, Object out, Object out_pos, Object out_size) {
		setIn(in);
		setIn_pos(in_pos);
		setIn_size(in_size);
		setOut(out);
		setOut_pos(out_pos);
		setOut_size(out_size);
	}
	public xz_buf() {
	}
	
	public Object getIn() {
		return in;
	}
	public void setIn(Object newIn) {
		in = newIn;
	}
	public Object getIn_pos() {
		return in_pos;
	}
	public void setIn_pos(Object newIn_pos) {
		in_pos = newIn_pos;
	}
	public Object getIn_size() {
		return in_size;
	}
	public void setIn_size(Object newIn_size) {
		in_size = newIn_size;
	}
	public Object getOut() {
		return out;
	}
	public void setOut(Object newOut) {
		out = newOut;
	}
	public Object getOut_pos() {
		return out_pos;
	}
	public void setOut_pos(Object newOut_pos) {
		out_pos = newOut_pos;
	}
	public Object getOut_size() {
		return out_size;
	}
	public void setOut_size(Object newOut_size) {
		out_size = newOut_size;
	}
}
