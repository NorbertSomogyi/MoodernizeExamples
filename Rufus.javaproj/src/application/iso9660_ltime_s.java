package application;

public class iso9660_ltime_s {
	private Object[] lt_year;
	private Object[] lt_month;
	private Object[] lt_day;
	private Object[] lt_hour;
	private Object[] lt_minute;
	private Object[] lt_second;
	private Object[] lt_hsecond;
	private Object lt_gmtoff;
	
	public iso9660_ltime_s(Object[] lt_year, Object[] lt_month, Object[] lt_day, Object[] lt_hour, Object[] lt_minute, Object[] lt_second, Object[] lt_hsecond, Object lt_gmtoff) {
		setLt_year(lt_year);
		setLt_month(lt_month);
		setLt_day(lt_day);
		setLt_hour(lt_hour);
		setLt_minute(lt_minute);
		setLt_second(lt_second);
		setLt_hsecond(lt_hsecond);
		setLt_gmtoff(lt_gmtoff);
	}
	public iso9660_ltime_s() {
	}
	
	public Object[] getLt_year() {
		return lt_year;
	}
	public void setLt_year(Object[] newLt_year) {
		lt_year = newLt_year;
	}
	public Object[] getLt_month() {
		return lt_month;
	}
	public void setLt_month(Object[] newLt_month) {
		lt_month = newLt_month;
	}
	public Object[] getLt_day() {
		return lt_day;
	}
	public void setLt_day(Object[] newLt_day) {
		lt_day = newLt_day;
	}
	public Object[] getLt_hour() {
		return lt_hour;
	}
	public void setLt_hour(Object[] newLt_hour) {
		lt_hour = newLt_hour;
	}
	public Object[] getLt_minute() {
		return lt_minute;
	}
	public void setLt_minute(Object[] newLt_minute) {
		lt_minute = newLt_minute;
	}
	public Object[] getLt_second() {
		return lt_second;
	}
	public void setLt_second(Object[] newLt_second) {
		lt_second = newLt_second;
	}
	public Object[] getLt_hsecond() {
		return lt_hsecond;
	}
	public void setLt_hsecond(Object[] newLt_hsecond) {
		lt_hsecond = newLt_hsecond;
	}
	public Object getLt_gmtoff() {
		return lt_gmtoff;
	}
	public void setLt_gmtoff(Object newLt_gmtoff) {
		lt_gmtoff = newLt_gmtoff;
	}
}
