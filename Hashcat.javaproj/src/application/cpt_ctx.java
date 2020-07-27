package application;

public class cpt_ctx {
	private boolean enabled;
	private cpt[] cpt_buf;
	private int cpt_pos;
	private Object cpt_start;
	private Object cpt_total;
	
	public cpt_ctx(boolean enabled, cpt[] cpt_buf, int cpt_pos, Object cpt_start, Object cpt_total) {
		setEnabled(enabled);
		setCpt_buf(cpt_buf);
		setCpt_pos(cpt_pos);
		setCpt_start(cpt_start);
		setCpt_total(cpt_total);
	}
	public cpt_ctx() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public cpt[] getCpt_buf() {
		return cpt_buf;
	}
	public void setCpt_buf(cpt[] newCpt_buf) {
		cpt_buf = newCpt_buf;
	}
	public int getCpt_pos() {
		return cpt_pos;
	}
	public void setCpt_pos(int newCpt_pos) {
		cpt_pos = newCpt_pos;
	}
	public Object getCpt_start() {
		return cpt_start;
	}
	public void setCpt_start(Object newCpt_start) {
		cpt_start = newCpt_start;
	}
	public Object getCpt_total() {
		return cpt_total;
	}
	public void setCpt_total(Object newCpt_total) {
		cpt_total = newCpt_total;
	}
}
