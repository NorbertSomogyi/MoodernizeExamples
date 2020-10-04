package application;

public class pw {
	private Object[] i;
	private Object pw_len;
	
	public pw(Object[] i, Object pw_len) {
		setI(i);
		setPw_len(pw_len);
	}
	public pw() {
	}
	
	public Object[] getI() {
		return i;
	}
	public void setI(Object[] newI) {
		i = newI;
	}
	public Object getPw_len() {
		return pw_len;
	}
	public void setPw_len(Object newPw_len) {
		pw_len = newPw_len;
	}
}
