package application;

public class file_update_data {
	private Object name;
	private int version;
	private Object newer;
	private Object found;
	
	public file_update_data(Object name, int version, Object newer, Object found) {
		setName(name);
		setVersion(version);
		setNewer(newer);
		setFound(found);
	}
	public file_update_data() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int newVersion) {
		version = newVersion;
	}
	public Object getNewer() {
		return newer;
	}
	public void setNewer(Object newNewer) {
		newer = newNewer;
	}
	public Object getFound() {
		return found;
	}
	public void setFound(Object newFound) {
		found = newFound;
	}
}
