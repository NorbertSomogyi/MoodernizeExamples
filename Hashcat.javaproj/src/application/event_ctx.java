package application;

public class event_ctx {
	private Object old_buf;
	private Object old_len;
	private int old_cnt;
	private Object msg_buf;
	private Object msg_len;
	private boolean msg_newline;
	private Object prev_len;
	private Object mux_event;
	
	public event_ctx(Object old_buf, Object old_len, int old_cnt, Object msg_buf, Object msg_len, boolean msg_newline, Object prev_len, Object mux_event) {
		setOld_buf(old_buf);
		setOld_len(old_len);
		setOld_cnt(old_cnt);
		setMsg_buf(msg_buf);
		setMsg_len(msg_len);
		setMsg_newline(msg_newline);
		setPrev_len(prev_len);
		setMux_event(mux_event);
	}
	public event_ctx() {
	}
	
	public Object getOld_buf() {
		return old_buf;
	}
	public void setOld_buf(Object newOld_buf) {
		old_buf = newOld_buf;
	}
	public Object getOld_len() {
		return old_len;
	}
	public void setOld_len(Object newOld_len) {
		old_len = newOld_len;
	}
	public int getOld_cnt() {
		return old_cnt;
	}
	public void setOld_cnt(int newOld_cnt) {
		old_cnt = newOld_cnt;
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
	public boolean getMsg_newline() {
		return msg_newline;
	}
	public void setMsg_newline(boolean newMsg_newline) {
		msg_newline = newMsg_newline;
	}
	public Object getPrev_len() {
		return prev_len;
	}
	public void setPrev_len(Object newPrev_len) {
		prev_len = newPrev_len;
	}
	public Object getMux_event() {
		return mux_event;
	}
	public void setMux_event(Object newMux_event) {
		mux_event = newMux_event;
	}
}
