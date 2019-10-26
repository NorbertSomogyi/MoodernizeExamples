package application;

public class DIR {
	private dirent dd_dir;
	private Object dd_handle;
	private int dd_stat;
	
	public DIR(dirent dd_dir, Object dd_handle, int dd_stat) {
		setDd_dir(dd_dir);
		setDd_handle(dd_handle);
		setDd_stat(dd_stat);
	}
	public DIR() {
	}
	
	public dirent getDd_dir() {
		return dd_dir;
	}
	public void setDd_dir(dirent newDd_dir) {
		dd_dir = newDd_dir;
	}
	public Object getDd_handle() {
		return dd_handle;
	}
	public void setDd_handle(Object newDd_handle) {
		dd_handle = newDd_handle;
	}
	public int getDd_stat() {
		return dd_stat;
	}
	public void setDd_stat(int newDd_stat) {
		dd_stat = newDd_stat;
	}
}
