package application;

public class ext_t {
	private Object count;
	private Object filename;
	private Object extension;
	private Object description;
	
	public ext_t(Object count, Object filename, Object extension, Object description) {
		setCount(count);
		setFilename(filename);
		setExtension(extension);
		setDescription(description);
	}
	public ext_t() {
	}
	
	public Object getCount() {
		return count;
	}
	public void setCount(Object newCount) {
		count = newCount;
	}
	public Object getFilename() {
		return filename;
	}
	public void setFilename(Object newFilename) {
		filename = newFilename;
	}
	public Object getExtension() {
		return extension;
	}
	public void setExtension(Object newExtension) {
		extension = newExtension;
	}
	public Object getDescription() {
		return description;
	}
	public void setDescription(Object newDescription) {
		description = newDescription;
	}
}
