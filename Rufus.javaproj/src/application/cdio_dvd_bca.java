package application;

public class cdio_dvd_bca {
	private Object type;
	private int len;
	private Object value;
	
	public cdio_dvd_bca(Object type, int len, Object value) {
		setType(type);
		setLen(len);
		setValue(value);
	}
	public cdio_dvd_bca() {
	}
	
	public Object getType() {
		return type;
	}
	public void setType(Object newType) {
		type = newType;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object newValue) {
		value = newValue;
	}
}
