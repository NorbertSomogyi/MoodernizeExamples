package application;

/*
 * To test:
 *
 * 00/10/01/11 timeouts set
 * 0/1         during connect
 * T           various values on the timeouts
 * N           various values of now
 */
public class timetest {
	private int now_s;
	private int now_us;
	private int timeout_ms;
	private int connecttimeout_ms;
	private  connecting;
	private Object result;
	private Object comment;
	
	public timetest(int now_s, int now_us, int timeout_ms, int connecttimeout_ms,  connecting, Object result, Object comment) {
		setNow_s(now_s);
		setNow_us(now_us);
		setTimeout_ms(timeout_ms);
		setConnecttimeout_ms(connecttimeout_ms);
		setConnecting(connecting);
		setResult(result);
		setComment(comment);
	}
	public timetest() {
	}
	
	public int getNow_s() {
		return now_s;
	}
	public void setNow_s(int newNow_s) {
		now_s = newNow_s;
	}
	public int getNow_us() {
		return now_us;
	}
	public void setNow_us(int newNow_us) {
		now_us = newNow_us;
	}
	public int getTimeout_ms() {
		return timeout_ms;
	}
	public void setTimeout_ms(int newTimeout_ms) {
		timeout_ms = newTimeout_ms;
	}
	public int getConnecttimeout_ms() {
		return connecttimeout_ms;
	}
	public void setConnecttimeout_ms(int newConnecttimeout_ms) {
		connecttimeout_ms = newConnecttimeout_ms;
	}
	public  getConnecting() {
		return connecting;
	}
	public void setConnecting( newConnecting) {
		connecting = newConnecting;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object newResult) {
		result = newResult;
	}
	public Object getComment() {
		return comment;
	}
	public void setComment(Object newComment) {
		comment = newComment;
	}
}
