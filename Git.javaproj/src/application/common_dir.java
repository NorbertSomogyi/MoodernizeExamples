package application;

public class common_dir {
	private int ignore_garbage;
	private int is_dir;
	private int exclude;
	private Object dirname;
	
	public common_dir(int ignore_garbage, int is_dir, int exclude, Object dirname) {
		setIgnore_garbage(ignore_garbage);
		setIs_dir(is_dir);
		setExclude(exclude);
		setDirname(dirname);
	}
	public common_dir() {
	}
	
	public int getIgnore_garbage() {
		return ignore_garbage;
	}
	public void setIgnore_garbage(int newIgnore_garbage) {
		ignore_garbage = newIgnore_garbage;
	}
	public int getIs_dir() {
		return is_dir;
	}
	public void setIs_dir(int newIs_dir) {
		is_dir = newIs_dir;
	}
	public int getExclude() {
		return exclude;
	}
	public void setExclude(int newExclude) {
		exclude = newExclude;
	}
	public Object getDirname() {
		return dirname;
	}
	public void setDirname(Object newDirname) {
		dirname = newDirname;
	}
}
