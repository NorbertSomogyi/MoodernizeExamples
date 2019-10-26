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
	
	public void my_timegm(Object t) {
		int[] month_days_cumulative = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		int month;
		int year;
		int leap_days;
		int generatedTm_year = this.getTm_year();
		year = generatedTm_year;
		int generatedTm_mon = this.getTm_mon();
		month = generatedTm_mon;
		if (month < 0) {
			year += (11 - month) / 12;
			month = 11 - (11 - month) % 12;
		}  else if (month >= 12) {
			year -= month / 12;
			month = month % 12;
		} 
		leap_days = year - (generatedTm_mon <= 1);
		leap_days = ((leap_days / 4) - (leap_days / 100) + (leap_days / 400) - (1969 / 4) + (1969 / 100) - (1969 / 400));
		int generatedTm_mday = this.getTm_mday();
		int generatedTm_hour = this.getTm_hour();
		int generatedTm_min = this.getTm_min();
		int generatedTm_sec = this.getTm_sec();
		t = ((((time_t)(year - 1970) * 365 + leap_days + month_days_cumulative[month] + generatedTm_mday - 1) * 24 + generatedTm_hour) * 60 + generatedTm_min) * 60 + generatedTm_sec;
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
