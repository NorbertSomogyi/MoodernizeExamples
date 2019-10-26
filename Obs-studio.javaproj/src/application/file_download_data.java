package application;

public class file_download_data {
	private Object name;
	private int version;
	
	public file_download_data(Object name, int version) {
		setName(name);
		setVersion(version);
	}
	public file_download_data() {
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
}
