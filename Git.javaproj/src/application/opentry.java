package application;

public class opentry {
	private Object str;
	private Object fn;
	
	public opentry(Object str, Object fn) {
		setStr(str);
		setFn(fn);
	}
	public opentry() {
	}
	
	public Object getStr() {
		return str;
	}
	public void setStr(Object newStr) {
		str = newStr;
	}
	public Object getFn() {
		return fn;
	}
	public void setFn(Object newFn) {
		fn = newFn;
	}
}
