package application;

public class device_name_info {
	private Object id;
	private Byte name;
	
	public device_name_info(Object id, Byte name) {
		setId(id);
		setName(name);
	}
	public device_name_info() {
	}
	
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
}
