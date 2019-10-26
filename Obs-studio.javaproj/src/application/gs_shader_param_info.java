package application;

public class gs_shader_param_info {
	private gs_shader_param_type type;
	private Object name;
	
	public gs_shader_param_info(gs_shader_param_type type, Object name) {
		setType(type);
		setName(name);
	}
	public gs_shader_param_info() {
	}
	
	public gs_shader_param_type getType() {
		return type;
	}
	public void setType(gs_shader_param_type newType) {
		type = newType;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
