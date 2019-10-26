package application;

public class push_cas {
	private object_id expect;
	private int use_tracking;
	private Byte refname;
	
	public push_cas(object_id expect, int use_tracking, Byte refname) {
		setExpect(expect);
		setUse_tracking(use_tracking);
		setRefname(refname);
	}
	public push_cas() {
	}
	
	public object_id getExpect() {
		return expect;
	}
	public void setExpect(object_id newExpect) {
		expect = newExpect;
	}
	public int getUse_tracking() {
		return use_tracking;
	}
	public void setUse_tracking(int newUse_tracking) {
		use_tracking = newUse_tracking;
	}
	public Byte getRefname() {
		return refname;
	}
	public void setRefname(Byte newRefname) {
		refname = newRefname;
	}
}
