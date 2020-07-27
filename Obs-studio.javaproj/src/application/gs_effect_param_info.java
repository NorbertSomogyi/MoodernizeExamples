package application;

public class gs_effect_param_info {
	private Object name;
	private gs_shader_param_type type;
	
	public gs_effect_param_info(Object name, gs_shader_param_type type) {
		setName(name);
		setType(type);
	}
	public gs_effect_param_info() {
	}
	
	public void gs_effect_get_param_info(Object param) {
		if (!param) {
			return /*Error: Unsupported expression*/;
		} 
		this.setName(param.getName());
		this.setType(param.getType());
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public gs_shader_param_type getType() {
		return type;
	}
	public void setType(gs_shader_param_type newType) {
		type = newType;
	}
}
