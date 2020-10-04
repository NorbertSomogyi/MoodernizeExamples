package application;

public class pw_pre {
	private Object[] pw_buf;
	private Object pw_len;
	private Object[] base_buf;
	private Object base_len;
	private Object rule_idx;
	
	public pw_pre(Object[] pw_buf, Object pw_len, Object[] base_buf, Object base_len, Object rule_idx) {
		setPw_buf(pw_buf);
		setPw_len(pw_len);
		setBase_buf(base_buf);
		setBase_len(base_len);
		setRule_idx(rule_idx);
	}
	public pw_pre() {
	}
	
	public Object[] getPw_buf() {
		return pw_buf;
	}
	public void setPw_buf(Object[] newPw_buf) {
		pw_buf = newPw_buf;
	}
	public Object getPw_len() {
		return pw_len;
	}
	public void setPw_len(Object newPw_len) {
		pw_len = newPw_len;
	}
	public Object[] getBase_buf() {
		return base_buf;
	}
	public void setBase_buf(Object[] newBase_buf) {
		base_buf = newBase_buf;
	}
	public Object getBase_len() {
		return base_len;
	}
	public void setBase_len(Object newBase_len) {
		base_len = newBase_len;
	}
	public Object getRule_idx() {
		return rule_idx;
	}
	public void setRule_idx(Object newRule_idx) {
		rule_idx = newRule_idx;
	}
}
