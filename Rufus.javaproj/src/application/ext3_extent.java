package application;

public class ext3_extent {
	private Object ee_block;
	private Object ee_len;
	private Object ee_start_hi;
	private Object ee_start;
	
	public ext3_extent(Object ee_block, Object ee_len, Object ee_start_hi, Object ee_start) {
		setEe_block(ee_block);
		setEe_len(ee_len);
		setEe_start_hi(ee_start_hi);
		setEe_start(ee_start);
	}
	public ext3_extent() {
	}
	
	public Object getEe_block() {
		return ee_block;
	}
	public void setEe_block(Object newEe_block) {
		ee_block = newEe_block;
	}
	public Object getEe_len() {
		return ee_len;
	}
	public void setEe_len(Object newEe_len) {
		ee_len = newEe_len;
	}
	public Object getEe_start_hi() {
		return ee_start_hi;
	}
	public void setEe_start_hi(Object newEe_start_hi) {
		ee_start_hi = newEe_start_hi;
	}
	public Object getEe_start() {
		return ee_start;
	}
	public void setEe_start(Object newEe_start) {
		ee_start = newEe_start;
	}
}
