package application;

public class object_stat {
	private int delta_depth;
	private int base_object_no;
	
	public object_stat(int delta_depth, int base_object_no) {
		setDelta_depth(delta_depth);
		setBase_object_no(base_object_no);
	}
	public object_stat() {
	}
	
	public int getDelta_depth() {
		return delta_depth;
	}
	public void setDelta_depth(int newDelta_depth) {
		delta_depth = newDelta_depth;
	}
	public int getBase_object_no() {
		return base_object_no;
	}
	public void setBase_object_no(int newBase_object_no) {
		base_object_no = newBase_object_no;
	}
}
