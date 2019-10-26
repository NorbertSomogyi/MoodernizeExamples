package application;

public class grep_source {
	private Byte name;
	private grep_source_type type;
	private Object identifier;
	private Byte buf;
	private long size;
	private Byte path;
	private userdiff_driver driver;
	
	public grep_source(Byte name, grep_source_type type, Object identifier, Byte buf, long size, Byte path, userdiff_driver driver) {
		setName(name);
		setType(type);
		setIdentifier(identifier);
		setBuf(buf);
		setSize(size);
		setPath(path);
		setDriver(driver);
	}
	public grep_source() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public grep_source_type getType() {
		return type;
	}
	public void setType(grep_source_type newType) {
		type = newType;
	}
	public Object getIdentifier() {
		return identifier;
	}
	public void setIdentifier(Object newIdentifier) {
		identifier = newIdentifier;
	}
	public Byte getBuf() {
		return buf;
	}
	public void setBuf(Byte newBuf) {
		buf = newBuf;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public userdiff_driver getDriver() {
		return driver;
	}
	public void setDriver(userdiff_driver newDriver) {
		driver = newDriver;
	}
}
