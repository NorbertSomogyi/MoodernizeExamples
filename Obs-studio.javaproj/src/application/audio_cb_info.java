package application;

public class audio_cb_info {
	private Object callback;
	private Object param;
	
	public audio_cb_info(Object callback, Object param) {
		setCallback(callback);
		setParam(param);
	}
	public audio_cb_info() {
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
