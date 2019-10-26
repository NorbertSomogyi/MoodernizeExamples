package application;

public class seven_zip_hook {
	private Object ukey;
	private Object hook_success;
	
	public seven_zip_hook(Object ukey, Object hook_success) {
		setUkey(ukey);
		setHook_success(hook_success);
	}
	public seven_zip_hook() {
	}
	
	public Object getUkey() {
		return ukey;
	}
	public void setUkey(Object newUkey) {
		ukey = newUkey;
	}
	public Object getHook_success() {
		return hook_success;
	}
	public void setHook_success(Object newHook_success) {
		hook_success = newHook_success;
	}
}
