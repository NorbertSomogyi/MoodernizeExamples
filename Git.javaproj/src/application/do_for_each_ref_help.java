package application;

public class do_for_each_ref_help {
	private Object fn;
	private Object cb_data;
	
	public do_for_each_ref_help(Object fn, Object cb_data) {
		setFn(fn);
		setCb_data(cb_data);
	}
	public do_for_each_ref_help() {
	}
	
	public Object getFn() {
		return fn;
	}
	public void setFn(Object newFn) {
		fn = newFn;
	}
	public Object getCb_data() {
		return cb_data;
	}
	public void setCb_data(Object newCb_data) {
		cb_data = newCb_data;
	}
}
