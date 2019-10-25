package application;

/* this is a clone of 'struct tm' but with all fields we don't need or use
   cut out */
public class my_tm {
	private int tm_sec;
	private int tm_min;
	private int tm_hour;
	private int tm_mday;
	private int tm_mon;
	private int tm_year;
	
	public my_tm(int tm_sec, int tm_min, int tm_hour, int tm_mday, int tm_mon, int tm_year) {
		setTm_sec(tm_sec);
		setTm_min(tm_min);
		setTm_hour(tm_hour);
		setTm_mday(tm_mday);
		setTm_mon(tm_mon);
		setTm_year(tm_year);
	}
	public my_tm() {
	}
	
	public int getTm_sec() {
		return tm_sec;
	}
	public void setTm_sec(int newTm_sec) {
		tm_sec = newTm_sec;
	}
	public int getTm_min() {
		return tm_min;
	}
	public void setTm_min(int newTm_min) {
		tm_min = newTm_min;
	}
	public int getTm_hour() {
		return tm_hour;
	}
	public void setTm_hour(int newTm_hour) {
		tm_hour = newTm_hour;
	}
	public int getTm_mday() {
		return tm_mday;
	}
	public void setTm_mday(int newTm_mday) {
		tm_mday = newTm_mday;
	}
	public int getTm_mon() {
		return tm_mon;
	}
	public void setTm_mon(int newTm_mon) {
		tm_mon = newTm_mon;
	}
	public int getTm_year() {
		return tm_year;
	}
	public void setTm_year(int newTm_year) {
		tm_year = newTm_year;
	}
}
