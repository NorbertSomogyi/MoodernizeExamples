package application;

public class button_data {
	private Object callback;
	
	public button_data(Object callback) {
		setCallback(callback);
	}
	public button_data() {
	}
	
	public Object getCallback() {
		return callback;
	}
	public void setCallback(Object newCallback) {
		callback = newCallback;
	}
}
