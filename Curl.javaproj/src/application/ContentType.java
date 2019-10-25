package application;

public class ContentType {
	private Object extension;
	private Object type;
	
	public ContentType(Object extension, Object type) {
		setExtension(extension);
		setType(type);
	}
	public ContentType() {
	}
	
	public Object getExtension() {
		return extension;
	}
	public void setExtension(Object newExtension) {
		extension = newExtension;
	}
	public Object getType() {
		return type;
	}
	public void setType(Object newType) {
		type = newType;
	}
}
