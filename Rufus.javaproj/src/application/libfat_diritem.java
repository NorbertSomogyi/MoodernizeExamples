package application;

public class libfat_diritem {
	private Object[] name;
	private Object size;
	private Object attributes;
	
	public libfat_diritem(Object[] name, Object size, Object attributes) {
		setName(name);
		setSize(size);
		setAttributes(attributes);
	}
	public libfat_diritem() {
	}
	
	public Object[] getName() {
		return name;
	}
	public void setName(Object[] newName) {
		name = newName;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getAttributes() {
		return attributes;
	}
	public void setAttributes(Object newAttributes) {
		attributes = newAttributes;
	}
}
