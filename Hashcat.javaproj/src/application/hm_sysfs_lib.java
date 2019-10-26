package application;

public class hm_sysfs_lib {
	private Object lib;
	
	public hm_sysfs_lib(Object lib) {
		setLib(lib);
	}
	public hm_sysfs_lib() {
	}
	
	public Object getLib() {
		return lib;
	}
	public void setLib(Object newLib) {
		lib = newLib;
	}
}
// currently not using libudev, because it can only read values, not set them, so using /sys instead
