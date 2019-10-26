package application;

public class dictitem16_S {
	private  di_tv;
	private Object di_flags;
	private Object di_key;
	
	public dictitem16_S( di_tv, Object di_flags, Object di_key) {
		setDi_tv(di_tv);
		setDi_flags(di_flags);
		setDi_key(di_key);
	}
	public dictitem16_S() {
	}
	
	public  getDi_tv() {
		return di_tv;
	}
	public void setDi_tv( newDi_tv) {
		di_tv = newDi_tv;
	}
	public Object getDi_flags() {
		return di_flags;
	}
	public void setDi_flags(Object newDi_flags) {
		di_flags = newDi_flags;
	}
	public Object getDi_key() {
		return di_key;
	}
	public void setDi_key(Object newDi_key) {
		di_key = newDi_key;
	}
}
// "di_flags" value: read-only variable
// "di_flags" value: read-only in the sandbox
// "di_flags" value: fixed: no :unlet or remove()
// "di_flags" value: locked variable
