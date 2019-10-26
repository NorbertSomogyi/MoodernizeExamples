package application;

/* contents of a pointer block */
public class pointer_block {
	private Object pb_id;
	private Object pb_count;
	private Object pb_count_max;
	private Object pb_pointer;
	
	public pointer_block(Object pb_id, Object pb_count, Object pb_count_max, Object pb_pointer) {
		setPb_id(pb_id);
		setPb_count(pb_count);
		setPb_count_max(pb_count_max);
		setPb_pointer(pb_pointer);
	}
	public pointer_block() {
	}
	
	public Object getPb_id() {
		return pb_id;
	}
	public void setPb_id(Object newPb_id) {
		pb_id = newPb_id;
	}
	public Object getPb_count() {
		return pb_count;
	}
	public void setPb_count(Object newPb_count) {
		pb_count = newPb_count;
	}
	public Object getPb_count_max() {
		return pb_count_max;
	}
	public void setPb_count_max(Object newPb_count_max) {
		pb_count_max = newPb_count_max;
	}
	public Object getPb_pointer() {
		return pb_pointer;
	}
	public void setPb_pointer(Object newPb_pointer) {
		pb_pointer = newPb_pointer;
	}
}
