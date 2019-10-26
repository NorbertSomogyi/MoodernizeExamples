package application;

/* Affix header from ".aff" file.  Used for af_pref and af_suff. */
public class affheader_S {
	private Object ah_key;
	private int ah_flag;
	private int ah_newID;
	private int ah_combine;
	private int ah_follows;
	private affentry_S ah_first;
	
	public affheader_S(Object ah_key, int ah_flag, int ah_newID, int ah_combine, int ah_follows, affentry_S ah_first) {
		setAh_key(ah_key);
		setAh_flag(ah_flag);
		setAh_newID(ah_newID);
		setAh_combine(ah_combine);
		setAh_follows(ah_follows);
		setAh_first(ah_first);
	}
	public affheader_S() {
	}
	
	public Object getAh_key() {
		return ah_key;
	}
	public void setAh_key(Object newAh_key) {
		ah_key = newAh_key;
	}
	public int getAh_flag() {
		return ah_flag;
	}
	public void setAh_flag(int newAh_flag) {
		ah_flag = newAh_flag;
	}
	public int getAh_newID() {
		return ah_newID;
	}
	public void setAh_newID(int newAh_newID) {
		ah_newID = newAh_newID;
	}
	public int getAh_combine() {
		return ah_combine;
	}
	public void setAh_combine(int newAh_combine) {
		ah_combine = newAh_combine;
	}
	public int getAh_follows() {
		return ah_follows;
	}
	public void setAh_follows(int newAh_follows) {
		ah_follows = newAh_follows;
	}
	public affentry_S getAh_first() {
		return ah_first;
	}
	public void setAh_first(affentry_S newAh_first) {
		ah_first = newAh_first;
	}
}
