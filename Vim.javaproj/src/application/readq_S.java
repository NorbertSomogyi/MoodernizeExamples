package application;

public class readq_S {
	private Object rq_buffer;
	private Object rq_buflen;
	private readq_S rq_next;
	private readq_S rq_prev;
	
	public readq_S(Object rq_buffer, Object rq_buflen, readq_S rq_next, readq_S rq_prev) {
		setRq_buffer(rq_buffer);
		setRq_buflen(rq_buflen);
		setRq_next(rq_next);
		setRq_prev(rq_prev);
	}
	public readq_S() {
	}
	
	public Object getRq_buffer() {
		return rq_buffer;
	}
	public void setRq_buffer(Object newRq_buffer) {
		rq_buffer = newRq_buffer;
	}
	public Object getRq_buflen() {
		return rq_buflen;
	}
	public void setRq_buflen(Object newRq_buflen) {
		rq_buflen = newRq_buflen;
	}
	public readq_S getRq_next() {
		return rq_next;
	}
	public void setRq_next(readq_S newRq_next) {
		rq_next = newRq_next;
	}
	public readq_S getRq_prev() {
		return rq_prev;
	}
	public void setRq_prev(readq_S newRq_prev) {
		rq_prev = newRq_prev;
	}
}
