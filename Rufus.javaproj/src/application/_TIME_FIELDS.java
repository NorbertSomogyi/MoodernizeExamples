package application;

public class _TIME_FIELDS {
	private int Year;
	private int Month;
	private int Day;
	private int Hour;
	private int Minute;
	private int Second;
	private int Milliseconds;
	private int Weekday;
	
	public _TIME_FIELDS(int Year, int Month, int Day, int Hour, int Minute, int Second, int Milliseconds, int Weekday) {
		setYear(Year);
		setMonth(Month);
		setDay(Day);
		setHour(Hour);
		setMinute(Minute);
		setSecond(Second);
		setMilliseconds(Milliseconds);
		setWeekday(Weekday);
	}
	public _TIME_FIELDS() {
	}
	
	public int getYear() {
		return Year;
	}
	public void setYear(int newYear) {
		Year = newYear;
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int newMonth) {
		Month = newMonth;
	}
	public int getDay() {
		return Day;
	}
	public void setDay(int newDay) {
		Day = newDay;
	}
	public int getHour() {
		return Hour;
	}
	public void setHour(int newHour) {
		Hour = newHour;
	}
	public int getMinute() {
		return Minute;
	}
	public void setMinute(int newMinute) {
		Minute = newMinute;
	}
	public int getSecond() {
		return Second;
	}
	public void setSecond(int newSecond) {
		Second = newSecond;
	}
	public int getMilliseconds() {
		return Milliseconds;
	}
	public void setMilliseconds(int newMilliseconds) {
		Milliseconds = newMilliseconds;
	}
	public int getWeekday() {
		return Weekday;
	}
	public void setWeekday(int newWeekday) {
		Weekday = newWeekday;
	}
}
