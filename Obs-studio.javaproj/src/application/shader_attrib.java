package application;

public class shader_attrib {
	private Byte name;
	private Object index;
	private attrib_type type;
	
	public shader_attrib(Byte name, Object index, attrib_type type) {
		setName(name);
		setIndex(index);
		setType(type);
	}
	public shader_attrib() {
	}
	
	public void shader_attrib_free() {
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Object getIndex() {
		return index;
	}
	public void setIndex(Object newIndex) {
		index = newIndex;
	}
	public attrib_type getType() {
		return type;
	}
	public void setType(attrib_type newType) {
		type = newType;
	}
}
