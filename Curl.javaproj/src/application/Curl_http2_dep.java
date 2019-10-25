package application;

public class Curl_http2_dep {
	private Object next;
	private Object data;
	
	public Curl_http2_dep(Object next, Object data) {
		setNext(next);
		setData(data);
	}
	public Curl_http2_dep() {
	}
	
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
