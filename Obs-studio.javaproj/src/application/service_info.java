package application;

/* GNOME 2.26 - 3.4 sessopm mamager */
public class service_info {
	private Object name;
	private Object path;
	private Object uninhibit;
	
	public service_info(Object name, Object path, Object uninhibit) {
		setName(name);
		setPath(path);
		setUninhibit(uninhibit);
	}
	public service_info() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
	public Object getUninhibit() {
		return uninhibit;
	}
	public void setUninhibit(Object newUninhibit) {
		uninhibit = newUninhibit;
	}
}
