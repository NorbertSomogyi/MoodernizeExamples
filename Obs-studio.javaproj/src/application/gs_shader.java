package application;

public class gs_shader {
	private Object device;
	private gs_shader_type type;
	private Object obj;
	private gs_shader_param viewproj;
	private gs_shader_param world;
	private Object ;
	private Object ;
	private Object ;
	
	public gs_shader(Object device, gs_shader_type type, Object obj, gs_shader_param viewproj, gs_shader_param world, Object,  Object,  Object ) {
		setDevice(device);
		setType(type);
		setObj(obj);
		setViewproj(viewproj);
		setWorld(world);
		set();
		set();
		set();
	}
	public gs_shader() {
	}
	
	public gs_shader gs_vertexshader_create_from_file(Object file, Byte error_string) {
		if (!(ModernizedCProgram.gs_valid("gs_vertexshader_create_from_file") && ModernizedCProgram.gs_obj_valid(file, "gs_vertexshader_create_from_file", "file"))) {
			return ((Object)0);
		} 
		byte file_string;
		gs_shader_t shader = ((Object)0);
		file_string = ModernizedCProgram.os_quick_read_utf8_file(file);
		if (!file_string) {
			ModernizedCProgram.blog(LOG_ERROR, "Could not load vertex shader file '%s'", file);
			return ((Object)0);
		} 
		gs_shader gs_shader = new gs_shader();
		shader = gs_shader.gs_vertexshader_create(file_string, file, error_string);
		ModernizedCProgram.bfree(file_string);
		return shader;
	}
	public gs_shader gs_pixelshader_create_from_file(Object file, Byte error_string) {
		byte file_string;
		gs_shader_t shader = ((Object)0);
		if (!(ModernizedCProgram.gs_valid("gs_pixelshader_create_from_file") && ModernizedCProgram.gs_obj_valid(file, "gs_pixelshader_create_from_file", "file"))) {
			return ((Object)0);
		} 
		file_string = ModernizedCProgram.os_quick_read_utf8_file(file);
		if (!file_string) {
			ModernizedCProgram.blog(LOG_ERROR, "Could not load pixel shader file '%s'", file);
			return ((Object)0);
		} 
		gs_shader gs_shader = new gs_shader();
		shader = gs_shader.gs_pixelshader_create(file_string, file, error_string);
		ModernizedCProgram.bfree(file_string);
		return shader;
	}
	public gs_shader gs_vertexshader_create(Object shader, Object file, Byte error_string) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_vertexshader_create") && ModernizedCProgram.gs_obj_valid(shader, "gs_vertexshader_create", "shader"))) {
			return ((Object)0);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, shader, file, error_string);
	}
	public gs_shader gs_pixelshader_create(Object shader, Object file, Byte error_string) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_pixelshader_create") && ModernizedCProgram.gs_obj_valid(shader, "gs_pixelshader_create", "shader"))) {
			return ((Object)0);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, shader, file, error_string);
	}
	public void gs_load_vertexshader() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_load_vertexshader")) {
			return /*Error: Unsupported expression*/;
		} 
		gs_device generatedDevice = graphics.getDevice();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, vertshader);
	}
	public void gs_load_pixelshader() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_load_pixelshader")) {
			return /*Error: Unsupported expression*/;
		} 
		gs_device generatedDevice = graphics.getDevice();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, pixelshader);
	}
	public gs_shader gs_get_vertex_shader() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_get_vertex_shader")) {
			return ((Object)0);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice);
	}
	public gs_shader gs_get_pixel_shader() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_get_pixel_shader")) {
			return ((Object)0);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice);
	}
	public void gs_shader_destroy() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_shader_destroy")) {
			return /*Error: Unsupported expression*/;
		} 
		if (!shader) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(shader);
		 i = new ();
		if (!shader) {
			return /*Error: Unsupported expression*/;
		} 
		shader.remove_program_references();
		for (i = 0; i < this.getAttribs().getNum(); i++) {
			this.getAttribs().getArray() + i.shader_attrib_free();
		}
		for (i = 0; i < this.getSamplers().getNum(); i++) {
			this.getSamplers().getArray()[i].gs_samplerstate_destroy();
		}
		for (i = 0; i < this.getParams().getNum(); i++) {
			this.getParams().getArray() + i.shader_param_free();
		}
		if (this.getObj()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glDeleteShader(this.getObj());
			ModernizedCProgram.gl_success("glDeleteShader");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(this.getSamplers());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(this.getParams());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(this.getAttribs());
		ModernizedCProgram.bfree(shader);
	}
	public Object gl_add_param(Object var, Object texture_id) {
		gs_shader_param param = new gs_shader_param(0);
		param.setArray_count(var.getArray_count());
		param.setName(ModernizedCProgram.bstrdup(var.getName()));
		param.setShader(shader);
		param.setType(ModernizedCProgram.get_shader_param_type(var.getType()));
		gs_shader_param_type generatedType = param.getType();
		if (generatedType == GS_SHADER_PARAM_TEXTURE) {
			param.setSampler_id(var.getGl_sampler_id());
			param.setTexture_id((texture_id)++);
		} else {
				param.setChanged(true);
		} 
		Object generatedDef_value = param.getDef_value();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_move(generatedDef_value, var.getDefault_val());
		Object generatedCur_value = param.getCur_value();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_copy(generatedCur_value, generatedDef_value);
		Object generatedParams = this.getParams();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedParams, param);
		return true;
	}
	public void gl_add_sampler(Object sampler) {
		 new_sampler = new ();
		gs_sampler_info info = new gs_sampler_info();
		ModernizedCProgram.shader_sampler_convert(sampler, info);
		Object generatedDevice = this.getDevice();
		new_sampler = ModernizedCProgram.device_samplerstate_create(generatedDevice, info);
		Object generatedSamplers = this.getSamplers();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedSamplers, new_sampler);
	}
	public gs_shader shader_create(Object device, gs_shader_type type, Object shader_str, Object file, Byte error_string) {
		gs_shader shader = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		gl_shader_parser glsp = new gl_shader_parser();
		 success = true;
		shader.setDevice(device);
		shader.setType(gs_shader_type.type);
		glsp.gl_shader_parser_init(gs_shader_type.type);
		if (!glsp.gl_shader_parse(shader_str, file)) {
			success = false;
		} else {
				success = ModernizedCProgram.gl_shader_init(shader, glsp, file, error_string);
		} 
		if (!success) {
			shader.gs_shader_destroy();
			shader = NULL;
		} 
		glsp.gl_shader_parser_free();
		return shader;
	}
	public void remove_program_references() {
		Object generatedDevice = this.getDevice();
		gs_program program = generatedDevice.getFirst_program();
		gs_program generatedNext = program.getNext();
		gs_shader_type generatedType = this.getType();
		gs_shader generatedVertex_shader = program.getVertex_shader();
		gs_shader generatedPixel_shader = program.getPixel_shader();
		while (program) {
			gs_program next = generatedNext;
			 destroy = false;
			if (generatedType == GS_SHADER_VERTEX && generatedVertex_shader == shader) {
				destroy = true;
			}  else if (generatedType == GS_SHADER_PIXEL && generatedPixel_shader == shader) {
				destroy = true;
			} 
			if (destroy) {
				program.gs_program_destroy();
			} 
			program = next;
		}
	}
	public Object getDevice() {
		return device;
	}
	public void setDevice(Object newDevice) {
		device = newDevice;
	}
	public gs_shader_type getType() {
		return type;
	}
	public void setType(gs_shader_type newType) {
		type = newType;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object newObj) {
		obj = newObj;
	}
	public gs_shader_param getViewproj() {
		return viewproj;
	}
	public void setViewproj(gs_shader_param newViewproj) {
		viewproj = newViewproj;
	}
	public gs_shader_param getWorld() {
		return world;
	}
	public void setWorld(gs_shader_param newWorld) {
		world = newWorld;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
