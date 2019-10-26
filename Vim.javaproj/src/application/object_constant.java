package application;

public class object_constant {
	private Byte name;
	private Object valObject;
	
	public object_constant(Byte name, Object valObject) {
		setName(name);
		setValObject(valObject);
	}
	public object_constant() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Object getValObject() {
		return valObject;
	}
	public void setValObject(Object newValObject) {
		valObject = newValObject;
	}
}
