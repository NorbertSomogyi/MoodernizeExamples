package application;

// used to store input position when a BACK was encountered, so that we now if
// we made any progress since the last time.
public class backpos_S {
	private Object bp_scan;
	private  bp_pos;
	
	public backpos_S(Object bp_scan,  bp_pos) {
		setBp_scan(bp_scan);
		setBp_pos(bp_pos);
	}
	public backpos_S() {
	}
	
	public Object getBp_scan() {
		return bp_scan;
	}
	public void setBp_scan(Object newBp_scan) {
		bp_scan = newBp_scan;
	}
	public  getBp_pos() {
		return bp_pos;
	}
	public void setBp_pos( newBp_pos) {
		bp_pos = newBp_pos;
	}
}
