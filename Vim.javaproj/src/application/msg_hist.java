package application;

public class msg_hist {
	private msg_hist next;
	private Object msg;
	private int attr;
	
	public msg_hist(msg_hist next, Object msg, int attr) {
		setNext(next);
		setMsg(msg);
		setAttr(attr);
	}
	public msg_hist() {
	}
	
	public msg_hist getNext() {
		return next;
	}
	public void setNext(msg_hist newNext) {
		next = newNext;
	}
	public Object getMsg() {
		return msg;
	}
	public void setMsg(Object newMsg) {
		msg = newMsg;
	}
	public int getAttr() {
		return attr;
	}
	public void setAttr(int newAttr) {
		attr = newAttr;
	}
}
