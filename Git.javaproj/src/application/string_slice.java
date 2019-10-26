package application;

public class string_slice {
	private Object len;
	private Object str;
	
	public string_slice(Object len, Object str) {
		setLen(len);
		setStr(str);
	}
	public string_slice() {
	}
	
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Object getStr() {
		return str;
	}
	public void setStr(Object newStr) {
		str = newStr;
	}
}
