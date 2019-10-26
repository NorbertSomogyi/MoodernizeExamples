package application;

/* UDP */
/*****************************************************************************
*                              GLOBAL VARIABLES                              *
*****************************************************************************/
public class errmsg {
	private int e_code;
	private Object e_msg;
	
	public errmsg(int e_code, Object e_msg) {
		setE_code(e_code);
		setE_msg(e_msg);
	}
	public errmsg() {
	}
	
	public int getE_code() {
		return e_code;
	}
	public void setE_code(int newE_code) {
		e_code = newE_code;
	}
	public Object getE_msg() {
		return e_msg;
	}
	public void setE_msg(Object newE_msg) {
		e_msg = newE_msg;
	}
}
