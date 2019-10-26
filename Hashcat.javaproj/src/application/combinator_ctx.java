package application;

public class combinator_ctx {
	private boolean enabled;
	private Byte dict1;
	private Byte dict2;
	private Object combs_mode;
	private Object combs_cnt;
	
	public combinator_ctx(boolean enabled, Byte dict1, Byte dict2, Object combs_mode, Object combs_cnt) {
		setEnabled(enabled);
		setDict1(dict1);
		setDict2(dict2);
		setCombs_mode(combs_mode);
		setCombs_cnt(combs_cnt);
	}
	public combinator_ctx() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public Byte getDict1() {
		return dict1;
	}
	public void setDict1(Byte newDict1) {
		dict1 = newDict1;
	}
	public Byte getDict2() {
		return dict2;
	}
	public void setDict2(Byte newDict2) {
		dict2 = newDict2;
	}
	public Object getCombs_mode() {
		return combs_mode;
	}
	public void setCombs_mode(Object newCombs_mode) {
		combs_mode = newCombs_mode;
	}
	public Object getCombs_cnt() {
		return combs_cnt;
	}
	public void setCombs_cnt(Object newCombs_cnt) {
		combs_cnt = newCombs_cnt;
	}
}
