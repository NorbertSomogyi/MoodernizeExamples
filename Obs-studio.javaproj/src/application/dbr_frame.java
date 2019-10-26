package application;

//#define TEST_FRAMEDROPS
//#define TEST_FRAMEDROPS_WITH_BITRATE_SHORTCUTS
public class dbr_frame {
	private Object send_beg;
	private Object send_end;
	private Object size;
	
	public dbr_frame(Object send_beg, Object send_end, Object size) {
		setSend_beg(send_beg);
		setSend_end(send_end);
		setSize(size);
	}
	public dbr_frame() {
	}
	
	public Object getSend_beg() {
		return send_beg;
	}
	public void setSend_beg(Object newSend_beg) {
		send_beg = newSend_beg;
	}
	public Object getSend_end() {
		return send_end;
	}
	public void setSend_end(Object newSend_end) {
		send_end = newSend_end;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
