package application;

public class cdio_dvd_manufact {
	private Object type;
	private Object layer_num;
	private int len;
	private Object value;
	
	public cdio_dvd_manufact(Object type, Object layer_num, int len, Object value) {
		setType(type);
		setLayer_num(layer_num);
		setLen(len);
		setValue(value);
	}
	public cdio_dvd_manufact() {
	}
	
	public Object getType() {
		return type;
	}
	public void setType(Object newType) {
		type = newType;
	}
	public Object getLayer_num() {
		return layer_num;
	}
	public void setLayer_num(Object newLayer_num) {
		layer_num = newLayer_num;
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
