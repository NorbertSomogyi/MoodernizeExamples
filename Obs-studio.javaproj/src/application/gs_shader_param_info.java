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
	
	public void gs_shader_get_param_info(Object param) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_get_param_info") && ModernizedCProgram.gs_obj_valid(param, "gs_shader_get_param_info", "param") && ModernizedCProgram.gs_obj_valid(info, "gs_shader_get_param_info", "info"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(param, info);
		this.setType(param.getType());
		this.setName(param.getName());
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
