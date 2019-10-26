package application;

/**
 * Event registration/unregistration parameters.
 */
public class _NV_ENC_EVENT_PARAMS {
	private Object version;
	private Object reserved;
	private Object completionEvent;
	private Object reserved1;
	private Object reserved2;
	
	public _NV_ENC_EVENT_PARAMS(Object version, Object reserved, Object completionEvent, Object reserved1, Object reserved2) {
		setVersion(version);
		setReserved(reserved);
		setCompletionEvent(completionEvent);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public _NV_ENC_EVENT_PARAMS() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getCompletionEvent() {
		return completionEvent;
	}
	public void setCompletionEvent(Object newCompletionEvent) {
		completionEvent = newCompletionEvent;
	}
	public Object getReserved1() {
		return reserved1;
	}
	public void setReserved1(Object newReserved1) {
		reserved1 = newReserved1;
	}
	public Object getReserved2() {
		return reserved2;
	}
	public void setReserved2(Object newReserved2) {
		reserved2 = newReserved2;
	}
}
