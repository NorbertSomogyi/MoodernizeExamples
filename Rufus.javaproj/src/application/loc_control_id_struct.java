package application;

public class loc_control_id_struct {
	private Object name;
	private Object id;
	
	public loc_control_id_struct(Object name, Object id) {
		setName(name);
		setId(id);
	}
	public loc_control_id_struct() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
}
