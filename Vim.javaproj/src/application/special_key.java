package application;

public class special_key {
	private Object key_sym;
	private Object code0;
	private Object code1;
	
	public special_key(Object key_sym, Object code0, Object code1) {
		setKey_sym(key_sym);
		setCode0(code0);
		setCode1(code1);
	}
	public special_key() {
	}
	
	public Object getKey_sym() {
		return key_sym;
	}
	public void setKey_sym(Object newKey_sym) {
		key_sym = newKey_sym;
	}
	public Object getCode0() {
		return code0;
	}
	public void setCode0(Object newCode0) {
		code0 = newCode0;
	}
	public Object getCode1() {
		return code1;
	}
	public void setCode1(Object newCode1) {
		code1 = newCode1;
	}
}
