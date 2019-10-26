package application;

public class source_enum_data {
	private Object enum_callback;
	private Object param;
	
	public source_enum_data(Object enum_callback, Object param) {
		setEnum_callback(enum_callback);
		setParam(param);
	}
	public source_enum_data() {
	}
	
	public Object getEnum_callback() {
		return enum_callback;
	}
	public void setEnum_callback(Object newEnum_callback) {
		enum_callback = newEnum_callback;
	}
	public Object getParam() {
		return param;
	}
	public void setParam(Object newParam) {
		param = newParam;
	}
}
