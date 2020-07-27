package application;

public class gs_shader_param {
	private gs_shader_param_type type;
	private Byte name;
	private Object shader;
	private Object next_sampler;
	private Object texture_id;
	private Object sampler_id;
	private int array_count;
	private gs_texture texture;
	private Object changed;
	
	public gs_shader_param(gs_shader_param_type type, Byte name, Object shader, Object next_sampler, Object texture_id, Object sampler_id, int array_count, gs_texture texture, Object changed) {
		setType(type);
		setName(name);
		setShader(shader);
		setNext_sampler(next_sampler);
		setTexture_id(texture_id);
		setSampler_id(sampler_id);
		setArray_count(array_count);
		setTexture(texture);
		setChanged(changed);
	}
	public gs_shader_param() {
	}
	
	public gs_shader_param gs_shader_get_param_by_idx(gs_shader shader, Object param) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_get_param_by_idx") && ModernizedCProgram.gs_obj_valid(shader, "gs_shader_get_param_by_idx", "shader"))) {
			return ((Object)0);
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(shader, param);
		((param < shader.getParams().getNum()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("param < shader->params.num", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\gl-shader.c", 362));
		return shader.getParams().getArray() + param;
	}
	public gs_shader_param gs_shader_get_param_by_name(gs_shader shader, Object name) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_get_param_by_name") && ModernizedCProgram.gs_obj_valid(shader, "gs_shader_get_param_by_name", "shader") && ModernizedCProgram.gs_obj_valid(name, "gs_shader_get_param_by_name", "name"))) {
			return ((Object)0);
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(shader, name);
		 i = new ();
		for (i = 0; i < shader.getParams().getNum(); i++) {
			gs_shader_param param = shader.getParams().getArray() + i;
			if (/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.param.getName(), name) == 0) {
				return ModernizedCProgram.param;
			} 
		}
		return NULL;
	}
	public gs_shader_param gs_shader_get_viewproj_matrix(Object shader) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_get_viewproj_matrix") && ModernizedCProgram.gs_obj_valid(shader, "gs_shader_get_viewproj_matrix", "shader"))) {
			return ((Object)0);
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(shader);
		return shader.getViewproj();
	}
	public gs_shader_param gs_shader_get_world_matrix(Object shader) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_get_world_matrix") && ModernizedCProgram.gs_obj_valid(shader, "gs_shader_get_world_matrix", "shader"))) {
			return ((Object)0);
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(shader);
		return shader.getWorld();
	}
	public void gs_shader_set_bool(Object val) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_set_bool") && ModernizedCProgram.gs_obj_valid(ModernizedCProgram.param, "gs_shader_set_bool", "param"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.param, val);
		int int_val = val;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_copy_array(ModernizedCProgram.param.getCur_value(), int_val, /*Error: sizeof expression not supported yet*/);
	}
	public void gs_shader_set_float(double val) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_set_float") && ModernizedCProgram.gs_obj_valid(ModernizedCProgram.param, "gs_shader_set_float", "param"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.param, val);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_copy_array(ModernizedCProgram.param.getCur_value(), val, /*Error: sizeof expression not supported yet*/);
	}
	public void gs_shader_set_int(int val) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_set_int") && ModernizedCProgram.gs_obj_valid(ModernizedCProgram.param, "gs_shader_set_int", "param"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.param, val);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_copy_array(ModernizedCProgram.param.getCur_value(), val, /*Error: sizeof expression not supported yet*/);
	}
	public void gs_shader_set_matrix3(Object val) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_set_matrix3") && ModernizedCProgram.gs_obj_valid(ModernizedCProgram.param, "gs_shader_set_matrix3", "param") && ModernizedCProgram.gs_obj_valid(val, "gs_shader_set_matrix3", "val"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.param, val);
		matrix4 mat = new matrix4();
		mat.matrix4_from_matrix3(val);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_copy_array(ModernizedCProgram.param.getCur_value(), mat, /*Error: sizeof expression not supported yet*/);
	}
	public void gs_shader_set_matrix4(Object val) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_set_matrix4") && ModernizedCProgram.gs_obj_valid(ModernizedCProgram.param, "gs_shader_set_matrix4", "param") && ModernizedCProgram.gs_obj_valid(val, "gs_shader_set_matrix4", "val"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.param, val);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_copy_array(ModernizedCProgram.param.getCur_value(), val, /*Error: sizeof expression not supported yet*/);
	}
	public void gs_shader_set_vec2(Object val) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_set_vec2") && ModernizedCProgram.gs_obj_valid(ModernizedCProgram.param, "gs_shader_set_vec2", "param") && ModernizedCProgram.gs_obj_valid(val, "gs_shader_set_vec2", "val"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.param, val);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_copy_array(ModernizedCProgram.param.getCur_value(), val.getPtr(), /*Error: sizeof expression not supported yet*/);
	}
	public void gs_shader_set_vec3(Object val) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_set_vec3") && ModernizedCProgram.gs_obj_valid(ModernizedCProgram.param, "gs_shader_set_vec3", "param") && ModernizedCProgram.gs_obj_valid(val, "gs_shader_set_vec3", "val"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.param, val);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_copy_array(ModernizedCProgram.param.getCur_value(), val.getPtr(), /*Error: sizeof expression not supported yet*/);
	}
	public void gs_shader_set_vec4(Object val) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_set_vec4") && ModernizedCProgram.gs_obj_valid(ModernizedCProgram.param, "gs_shader_set_vec4", "param") && ModernizedCProgram.gs_obj_valid(val, "gs_shader_set_vec4", "val"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.param, val);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_copy_array(ModernizedCProgram.param.getCur_value(), val.getPtr(), /*Error: sizeof expression not supported yet*/);
	}
	public void gs_shader_set_val(Object val, Object size) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_set_val") && ModernizedCProgram.gs_obj_valid(ModernizedCProgram.param, "gs_shader_set_val", "param") && ModernizedCProgram.gs_obj_valid(val, "gs_shader_set_val", "val"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.param, val, size);
		int count = ModernizedCProgram.param.getArray_count();
		 expected_size = 0;
		if (!count) {
			count = 1;
		} 
		switch (()ModernizedCProgram.param.getType()) {
		case GS_SHADER_PARAM_INT4:
				expected_size = /*Error: Unsupported expression*/ * 4;
				break;
		case GS_SHADER_PARAM_INT:
				expected_size = /*Error: Unsupported expression*/;
				break;
		case GS_SHADER_PARAM_MATRIX4X4:
				expected_size = /*Error: Unsupported expression*/ * 4 * 4;
				break;
		case GS_SHADER_PARAM_VEC4:
				expected_size = /*Error: Unsupported expression*/ * 4;
				break;
		case GS_SHADER_PARAM_VEC2:
				expected_size = /*Error: Unsupported expression*/ * 2;
				break;
		case GS_SHADER_PARAM_FLOAT:
				expected_size = /*Error: Unsupported expression*/;
				break;
		case GS_SHADER_PARAM_INT3:
				expected_size = /*Error: Unsupported expression*/ * 3;
				break;
		case GS_SHADER_PARAM_INT2:
				expected_size = /*Error: Unsupported expression*/ * 2;
				break;
		case GS_SHADER_PARAM_TEXTURE:
				expected_size = /*Error: Unsupported expression*/;
				break;
		case GS_SHADER_PARAM_VEC3:
				expected_size = /*Error: Unsupported expression*/ * 3;
				break;
		case GS_SHADER_PARAM_BOOL:
		default:
				expected_size = 0;
		}
		expected_size *= count;
		if (!expected_size) {
			return /*Error: Unsupported expression*/;
		} 
		if (expected_size != size) {
			ModernizedCProgram.blog(LOG_ERROR, "gs_shader_set_val (GL): Size of shader param does not match the size of the input");
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.param.getType() == GS_SHADER_PARAM_TEXTURE) {
			ModernizedCProgram.gs_shader_set_texture(ModernizedCProgram.param, ()val);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_copy_array(ModernizedCProgram.param.getCur_value(), val, size);
		} 
	}
	public void gs_shader_set_default() {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_shader_set_default") && ModernizedCProgram.gs_obj_valid(ModernizedCProgram.param, "gs_shader_set_default", "param"))) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.param);
		ModernizedCProgram.param.gs_shader_set_val(ModernizedCProgram.param.getDef_value().getArray(), ModernizedCProgram.param.getDef_value().getNum());
	}
	public gs_shader_param get_texture_param(Object device, int unit) {
		gs_shader shader = device.getCur_pixel_shader();
		 i = new ();
		Object generatedParams = shader.getParams();
		for (i = 0; i < generatedParams.getNum(); i++) {
			gs_shader_param param = generatedParams.getArray() + i;
			if (ModernizedCProgram.param.getType() == GS_SHADER_PARAM_TEXTURE) {
				if (ModernizedCProgram.param.getTexture_id() == unit) {
					return ModernizedCProgram.param;
				} 
			} 
		}
		return NULL;
	}
	/******************************************************************************
	    Copyright (C) 2013 by Hugh Bailey <obs.jim@gmail.com>
	
	    This program is free software: you can redistribute it and/or modify
	    it under the terms of the GNU General Public License as published by
	    the Free Software Foundation, either version 2 of the License, or
	    (at your option) any later version.
	
	    This program is distributed in the hope that it will be useful,
	    but WITHOUT ANY WARRANTY; without even the implied warranty of
	    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	    GNU General Public License for more details.
	
	    You should have received a copy of the GNU General Public License
	    along with this program.  If not, see <http://www.gnu.org/licenses/>.
	******************************************************************************/
	public void shader_param_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.param, 0, /*Error: Unsupported expression*/);
	}
	public void shader_param_free() {
		ModernizedCProgram.bfree(ModernizedCProgram.param.getName());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(ModernizedCProgram.param.getCur_value());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(ModernizedCProgram.param.getDef_value());
	}
	public gs_shader_param_type getType() {
		return type;
	}
	public void setType(gs_shader_param_type newType) {
		type = newType;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Object getShader() {
		return shader;
	}
	public void setShader(Object newShader) {
		shader = newShader;
	}
	public Object getNext_sampler() {
		return next_sampler;
	}
	public void setNext_sampler(Object newNext_sampler) {
		next_sampler = newNext_sampler;
	}
	public Object getTexture_id() {
		return texture_id;
	}
	public void setTexture_id(Object newTexture_id) {
		texture_id = newTexture_id;
	}
	public Object getSampler_id() {
		return sampler_id;
	}
	public void setSampler_id(Object newSampler_id) {
		sampler_id = newSampler_id;
	}
	public int getArray_count() {
		return array_count;
	}
	public void setArray_count(int newArray_count) {
		array_count = newArray_count;
	}
	public gs_texture getTexture() {
		return texture;
	}
	public void setTexture(gs_texture newTexture) {
		texture = newTexture;
	}
	public Object getChanged() {
		return changed;
	}
	public void setChanged(Object newChanged) {
		changed = newChanged;
	}
}
