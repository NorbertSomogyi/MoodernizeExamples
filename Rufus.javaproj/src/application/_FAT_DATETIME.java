package application;

//
//
public class _FAT_DATETIME {
	private _FAT_TIME Time;
	private _FAT_DATE Date;
	private Object Value;
	
	public _FAT_DATETIME(_FAT_TIME Time, _FAT_DATE Date, Object Value) {
		setTime(Time);
		setDate(Date);
		setValue(Value);
	}
	public _FAT_DATETIME() {
	}
	
	public _FAT_TIME getTime() {
		return Time;
	}
	public void setTime(_FAT_TIME newTime) {
		Time = newTime;
	}
	public _FAT_DATE getDate() {
		return Date;
	}
	public void setDate(_FAT_DATE newDate) {
		Date = newDate;
	}
	public Object getValue() {
		return Value;
	}
	public void setValue(Object newValue) {
		Value = newValue;
	}
}
