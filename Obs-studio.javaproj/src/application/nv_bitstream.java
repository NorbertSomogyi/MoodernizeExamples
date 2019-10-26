package application;

/* ========================================================================= */
/* Bitstream Buffer                                                          */
public class nv_bitstream {
	private Object ptr;
	private Object event;
	
	public nv_bitstream(Object ptr, Object event) {
		setPtr(ptr);
		setEvent(event);
	}
	public nv_bitstream() {
	}
	
	public Object getPtr() {
		return ptr;
	}
	public void setPtr(Object newPtr) {
		ptr = newPtr;
	}
	public Object getEvent() {
		return event;
	}
	public void setEvent(Object newEvent) {
		event = newEvent;
	}
}
