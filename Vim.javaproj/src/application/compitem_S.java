package application;

/* Flag used in compound items. */
public class compitem_S {
	private Object ci_key;
	private int ci_flag;
	private int ci_newID;
	
	public compitem_S(Object ci_key, int ci_flag, int ci_newID) {
		setCi_key(ci_key);
		setCi_flag(ci_flag);
		setCi_newID(ci_newID);
	}
	public compitem_S() {
	}
	
	public Object getCi_key() {
		return ci_key;
	}
	public void setCi_key(Object newCi_key) {
		ci_key = newCi_key;
	}
	public int getCi_flag() {
		return ci_flag;
	}
	public void setCi_flag(int newCi_flag) {
		ci_flag = newCi_flag;
	}
	public int getCi_newID() {
		return ci_newID;
	}
	public void setCi_newID(int newCi_newID) {
		ci_newID = newCi_newID;
	}
}
