package application;

public class program_param {
	private Object obj;
	private gs_shader_param param;
	
	public program_param(Object obj, gs_shader_param param) {
		setObj(obj);
		setParam(param);
	}
	public program_param() {
	}
	
	public Object validate_param(Object expected_size) {
		gs_shader_param generatedParam = this.getParam();
		Object generatedCur_value = generatedParam.getCur_value();
		Byte generatedName = generatedParam.getName();
		if (generatedCur_value.getNum() != expected_size) {
			ModernizedCProgram.blog(LOG_ERROR, "Parameter '%s' set to invalid size %u, expected %u", generatedName, (int)generatedCur_value.getNum(), (int)expected_size);
			return false;
		} 
		return true;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object newObj) {
		obj = newObj;
	}
	public gs_shader_param getParam() {
		return param;
	}
	public void setParam(gs_shader_param newParam) {
		param = newParam;
	}
}
