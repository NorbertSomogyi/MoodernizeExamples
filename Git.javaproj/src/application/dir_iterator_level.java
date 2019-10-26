package application;

public class dir_iterator_level {
	private  dir;
	private Object prefix_len;
	
	public dir_iterator_level( dir, Object prefix_len) {
		setDir(dir);
		setPrefix_len(prefix_len);
	}
	public dir_iterator_level() {
	}
	
	public  getDir() {
		return dir;
	}
	public void setDir( newDir) {
		dir = newDir;
	}
	public Object getPrefix_len() {
		return prefix_len;
	}
	public void setPrefix_len(Object newPrefix_len) {
		prefix_len = newPrefix_len;
	}
}
