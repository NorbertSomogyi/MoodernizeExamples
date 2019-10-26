package application;

/** Timestamp (ECMA 167r3 1/7.3) */
public class udf_timestamp_s {
	private Object type_tz;
	private Object year;
	private Object month;
	private Object day;
	private Object hour;
	private Object minute;
	private Object second;
	private Object centiseconds;
	private Object hundreds_of_microseconds;
	private Object microseconds;
	
	public udf_timestamp_s(Object type_tz, Object year, Object month, Object day, Object hour, Object minute, Object second, Object centiseconds, Object hundreds_of_microseconds, Object microseconds) {
		setType_tz(type_tz);
		setYear(year);
		setMonth(month);
		setDay(day);
		setHour(hour);
		setMinute(minute);
		setSecond(second);
		setCentiseconds(centiseconds);
		setHundreds_of_microseconds(hundreds_of_microseconds);
		setMicroseconds(microseconds);
	}
	public udf_timestamp_s() {
	}
	
	public Object getType_tz() {
		return type_tz;
	}
	public void setType_tz(Object newType_tz) {
		type_tz = newType_tz;
	}
	public Object getYear() {
		return year;
	}
	public void setYear(Object newYear) {
		year = newYear;
	}
	public Object getMonth() {
		return month;
	}
	public void setMonth(Object newMonth) {
		month = newMonth;
	}
	public Object getDay() {
		return day;
	}
	public void setDay(Object newDay) {
		day = newDay;
	}
	public Object getHour() {
		return hour;
	}
	public void setHour(Object newHour) {
		hour = newHour;
	}
	public Object getMinute() {
		return minute;
	}
	public void setMinute(Object newMinute) {
		minute = newMinute;
	}
	public Object getSecond() {
		return second;
	}
	public void setSecond(Object newSecond) {
		second = newSecond;
	}
	public Object getCentiseconds() {
		return centiseconds;
	}
	public void setCentiseconds(Object newCentiseconds) {
		centiseconds = newCentiseconds;
	}
	public Object getHundreds_of_microseconds() {
		return hundreds_of_microseconds;
	}
	public void setHundreds_of_microseconds(Object newHundreds_of_microseconds) {
		hundreds_of_microseconds = newHundreds_of_microseconds;
	}
	public Object getMicroseconds() {
		return microseconds;
	}
	public void setMicroseconds(Object newMicroseconds) {
		microseconds = newMicroseconds;
	}
}
/** Type and Time Zone (ECMA 167r3 1/7.3.1) 

    Imagine the below enum values as \#define'd values rather than
    distinct values of an enum.
*/
