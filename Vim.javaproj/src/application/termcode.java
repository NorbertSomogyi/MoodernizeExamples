package application;

public class termcode {
	private Object name;
	private Object code;
	private int len;
	private int modlen;
	
	public termcode(Object name, Object code, int len, int modlen) {
		setName(name);
		setCode(code);
		setLen(len);
		setModlen(modlen);
	}
	public termcode() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getCode() {
		return code;
	}
	public void setCode(Object newCode) {
		code = newCode;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public int getModlen() {
		return modlen;
	}
	public void setModlen(int newModlen) {
		modlen = newModlen;
	}
}
