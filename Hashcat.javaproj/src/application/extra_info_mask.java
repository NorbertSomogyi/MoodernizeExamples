package application;

public class extra_info_mask {
	private Object pos;
	private Object[] out_buf;
	private Object out_len;
	
	public extra_info_mask(Object pos, Object[] out_buf, Object out_len) {
		setPos(pos);
		setOut_buf(out_buf);
		setOut_len(out_len);
	}
	public extra_info_mask() {
	}
	
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public Object[] getOut_buf() {
		return out_buf;
	}
	public void setOut_buf(Object[] newOut_buf) {
		out_buf = newOut_buf;
	}
	public Object getOut_len() {
		return out_len;
	}
	public void setOut_len(Object newOut_len) {
		out_len = newOut_len;
	}
}
