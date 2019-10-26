package application;

public class ff_reg {
	private re_pattern_buffer re;
	private int negate;
	
	public ff_reg(re_pattern_buffer re, int negate) {
		setRe(re);
		setNegate(negate);
	}
	public ff_reg() {
	}
	
	public re_pattern_buffer getRe() {
		return re;
	}
	public void setRe(re_pattern_buffer newRe) {
		re = newRe;
	}
	public int getNegate() {
		return negate;
	}
	public void setNegate(int newNegate) {
		negate = newNegate;
	}
}
