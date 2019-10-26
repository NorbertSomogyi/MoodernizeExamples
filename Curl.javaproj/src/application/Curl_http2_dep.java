package application;

public class Curl_http2_dep {
	private Curl_http2_dep next;
	private Curl_easy data;
	
	public Curl_http2_dep(Curl_http2_dep next, Curl_easy data) {
		setNext(next);
		setData(data);
	}
	public Curl_http2_dep() {
	}
	
	public Curl_http2_dep getNext() {
		return next;
	}
	public void setNext(Curl_http2_dep newNext) {
		next = newNext;
	}
	public Curl_easy getData() {
		return data;
	}
	public void setData(Curl_easy newData) {
		data = newData;
	}
}
