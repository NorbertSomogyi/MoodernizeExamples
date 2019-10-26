package application;

public class posix_glob_info {
	private os_glob_info base;
	private Object gl;
	
	public posix_glob_info(os_glob_info base, Object gl) {
		setBase(base);
		setGl(gl);
	}
	public posix_glob_info() {
	}
	
	public os_glob_info getBase() {
		return base;
	}
	public void setBase(os_glob_info newBase) {
		base = newBase;
	}
	public Object getGl() {
		return gl;
	}
	public void setGl(Object newGl) {
		gl = newGl;
	}
}
