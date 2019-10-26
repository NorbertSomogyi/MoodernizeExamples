package application;

/*!
  \brief ISO-9660 shorter-format time structure. See ECMA 9.1.5.

  @see iso9660_dtime
 */
public class iso9660_dtime_s {
	private Object dt_year;
	private Object dt_month;
	private Object dt_day;
	private Object dt_hour;
	private Object dt_minute;
	private Object dt_second;
	private Object dt_gmtoff;
	
	public iso9660_dtime_s(Object dt_year, Object dt_month, Object dt_day, Object dt_hour, Object dt_minute, Object dt_second, Object dt_gmtoff) {
		setDt_year(dt_year);
		setDt_month(dt_month);
		setDt_day(dt_day);
		setDt_hour(dt_hour);
		setDt_minute(dt_minute);
		setDt_second(dt_second);
		setDt_gmtoff(dt_gmtoff);
	}
	public iso9660_dtime_s() {
	}
	
	public Object getDt_year() {
		return dt_year;
	}
	public void setDt_year(Object newDt_year) {
		dt_year = newDt_year;
	}
	public Object getDt_month() {
		return dt_month;
	}
	public void setDt_month(Object newDt_month) {
		dt_month = newDt_month;
	}
	public Object getDt_day() {
		return dt_day;
	}
	public void setDt_day(Object newDt_day) {
		dt_day = newDt_day;
	}
	public Object getDt_hour() {
		return dt_hour;
	}
	public void setDt_hour(Object newDt_hour) {
		dt_hour = newDt_hour;
	}
	public Object getDt_minute() {
		return dt_minute;
	}
	public void setDt_minute(Object newDt_minute) {
		dt_minute = newDt_minute;
	}
	public Object getDt_second() {
		return dt_second;
	}
	public void setDt_second(Object newDt_second) {
		dt_second = newDt_second;
	}
	public Object getDt_gmtoff() {
		return dt_gmtoff;
	}
	public void setDt_gmtoff(Object newDt_gmtoff) {
		dt_gmtoff = newDt_gmtoff;
	}
}
/*!
  \brief ISO-9660 longer-format time structure.

  Section 8.4.26.1 of ECMA 119. All values are encoded as character
  arrays, eg. '1', '9', '5', '5' for the year 1955 (no null terminated
  byte).

  @see iso9660_ltime
 */
