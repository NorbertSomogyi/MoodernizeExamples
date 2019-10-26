package application;

public class meter_cb {
	private Object callback;
	private Object param;
	
	public meter_cb(Object callback, Object param) {
		setCallback(callback);
		setParam(param);
	}
	public meter_cb() {
	}
	
	public Object getCallback() {
		return callback;
	}
	public void setCallback(Object newCallback) {
		callback = newCallback;
	}
	public Object getParam() {
		return param;
	}
	public void setParam(Object newParam) {
		param = newParam;
	}
}
