package application;

public class Curl_send_buffer {
	private Object buffer;
	private Object size_max;
	private Object size_used;
	
	public Curl_send_buffer(Object buffer, Object size_max, Object size_used) {
		setBuffer(buffer);
		setSize_max(size_max);
		setSize_used(size_used);
	}
	public Curl_send_buffer() {
	}
	
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
	}
	public Object getSize_max() {
		return size_max;
	}
	public void setSize_max(Object newSize_max) {
		size_max = newSize_max;
	}
	public Object getSize_used() {
		return size_used;
	}
	public void setSize_used(Object newSize_used) {
		size_used = newSize_used;
	}
}
