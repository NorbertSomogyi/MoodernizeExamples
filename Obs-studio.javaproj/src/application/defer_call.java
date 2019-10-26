package application;

public class defer_call {
	private Object call;
	private Object cb;
	
	public defer_call(Object call, Object cb) {
		setCall(call);
		setCb(cb);
	}
	public defer_call() {
	}
	
	public Object getCall() {
		return call;
	}
	public void setCall(Object newCall) {
		call = newCall;
	}
	public Object getCb() {
		return cb;
	}
	public void setCb(Object newCb) {
		cb = newCb;
	}
}
