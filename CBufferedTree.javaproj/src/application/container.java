package application;

public class container {
	private Object payload_first;
	private Object payload_size;
	private Object child;
	
	public container(Object payload_first, Object payload_size, Object child) {
		setPayload_first(payload_first);
		setPayload_size(payload_size);
		setChild(child);
	}
	public container() {
	}
	
	public Object getPayload_first() {
		return payload_first;
	}
	public void setPayload_first(Object newPayload_first) {
		payload_first = newPayload_first;
	}
	public Object getPayload_size() {
		return payload_size;
	}
	public void setPayload_size(Object newPayload_size) {
		payload_size = newPayload_size;
	}
	public Object getChild() {
		return child;
	}
	public void setChild(Object newChild) {
		child = newChild;
	}
}
