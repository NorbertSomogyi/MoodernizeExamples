package application;

public class select_ws_wait_data {
	private Object handle;
	private Object event;
	
	public select_ws_wait_data(Object handle, Object event) {
		setHandle(handle);
		setEvent(event);
	}
	public select_ws_wait_data() {
	}
	
	public Object getHandle() {
		return handle;
	}
	public void setHandle(Object newHandle) {
		handle = newHandle;
	}
	public Object getEvent() {
		return event;
	}
	public void setEvent(Object newEvent) {
		event = newEvent;
	}
}
