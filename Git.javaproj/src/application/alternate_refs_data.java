package application;

public class alternate_refs_data {
	private Object fn;
	private Object data;
	
	public alternate_refs_data(Object fn, Object data) {
		setFn(fn);
		setData(data);
	}
	public alternate_refs_data() {
	}
	
	public Object getFn() {
		return fn;
	}
	public void setFn(Object newFn) {
		fn = newFn;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
