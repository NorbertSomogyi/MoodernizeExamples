package application;

//
//
public class _FAT_DATE {
	private Object Day;
	private Object Month;
	private Object Year;
	private Object Value;
	
	public _FAT_DATE(Object Day, Object Month, Object Year, Object Value) {
		setDay(Day);
		setMonth(Month);
		setYear(Year);
		setValue(Value);
	}
	public _FAT_DATE() {
	}
	
	public Object getDay() {
		return Day;
	}
	public void setDay(Object newDay) {
		Day = newDay;
	}
	public Object getMonth() {
		return Month;
	}
	public void setMonth(Object newMonth) {
		Month = newMonth;
	}
	public Object getYear() {
		return Year;
	}
	public void setYear(Object newYear) {
		Year = newYear;
	}
	public Object getValue() {
		return Value;
	}
	public void setValue(Object newValue) {
		Value = newValue;
	}
}
