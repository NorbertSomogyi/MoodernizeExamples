package application;

public class ikepsk {
	private Object nr_buf;
	private Object nr_len;
	private Object msg_buf;
	private Object msg_len;
	
	public ikepsk(Object nr_buf, Object nr_len, Object msg_buf, Object msg_len) {
		setNr_buf(nr_buf);
		setNr_len(nr_len);
		setMsg_buf(msg_buf);
		setMsg_len(msg_len);
	}
	public ikepsk() {
	}
	
	public Object getNr_buf() {
		return nr_buf;
	}
	public void setNr_buf(Object newNr_buf) {
		nr_buf = newNr_buf;
	}
	public Object getNr_len() {
		return nr_len;
	}
	public void setNr_len(Object newNr_len) {
		nr_len = newNr_len;
	}
	public Object getMsg_buf() {
		return msg_buf;
	}
	public void setMsg_buf(Object newMsg_buf) {
		msg_buf = newMsg_buf;
	}
	public Object getMsg_len() {
		return msg_len;
	}
	public void setMsg_len(Object newMsg_len) {
		msg_len = newMsg_len;
	}
}
