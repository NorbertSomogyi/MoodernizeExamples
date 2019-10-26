package application;

public class diffgrep_cb {
	private re_pattern_buffer regexp;
	private int hit;
	
	public diffgrep_cb(re_pattern_buffer regexp, int hit) {
		setRegexp(regexp);
		setHit(hit);
	}
	public diffgrep_cb() {
	}
	
	public re_pattern_buffer getRegexp() {
		return regexp;
	}
	public void setRegexp(re_pattern_buffer newRegexp) {
		regexp = newRegexp;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int newHit) {
		hit = newHit;
	}
}
