package application;

public class gladGLversionStruct {
	private int major;
	private int minor;
	
	public gladGLversionStruct(int major, int minor) {
		setMajor(major);
		setMinor(minor);
	}
	public gladGLversionStruct() {
	}
	
	public int getMajor() {
		return major;
	}
	public void setMajor(int newMajor) {
		major = newMajor;
	}
	public int getMinor() {
		return minor;
	}
	public void setMinor(int newMinor) {
		minor = newMinor;
	}
}
