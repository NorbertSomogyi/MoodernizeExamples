package application;

public class gs_program {
	private Object device;
	private Object obj;
	private gs_shader vertex_shader;
	private gs_shader pixel_shader;
	private Object ;
	private gs_program prev_next;
	private gs_program next;
	
	public gs_program(Object device, Object obj, gs_shader vertex_shader, gs_shader pixel_shader, Object,  gs_program prev_next, gs_program next) {
		setDevice(device);
		setObj(obj);
		setVertex_shader(vertex_shader);
		setPixel_shader(pixel_shader);
		set();
		setPrev_next(prev_next);
		setNext(next);
	}
	public gs_program() {
	}
	
	public gs_program find_program(Object device) {
		gs_program program = device.getFirst_program();
		gs_shader generatedVertex_shader = program.getVertex_shader();
		gs_shader generatedPixel_shader = program.getPixel_shader();
		gs_program generatedNext = program.getNext();
		while (program) {
			if (generatedVertex_shader == device.getCur_vertex_shader() && generatedPixel_shader == device.getCur_pixel_shader()) {
				return program;
			} 
			program = generatedNext;
		}
		return NULL;
	}
	public gs_program get_shader_program(gs_device device) {
		gs_program gs_program = new gs_program();
		gs_program program = gs_program.find_program(device);
		gs_program gs_program = new gs_program();
		if (!program) {
			program = gs_program.gs_program_create(device);
		} 
		return program;
	}
	public void program_update_params() {
		Object generatedParams = this.getParams();
		for ( i = 0;
		 i < generatedParams.getNum(); i++) {
			program_param pp = generatedParams.getArray() + i;
			ModernizedCProgram.program_set_param_data(program, pp);
		}
	}
	public Object assign_program_attribs() {
		gs_shader generatedVertex_shader = this.getVertex_shader();
		gs_shader shader = generatedVertex_shader;
		Object generatedAttribs = shader.getAttribs();
		for ( i = 0;
		 i < generatedAttribs.getNum(); i++) {
			shader_attrib attrib = generatedAttribs.getArray() + i;
			if (!ModernizedCProgram.assign_program_attrib(program, attrib)) {
				return false;
			} 
		}
		return true;
	}
	public Object assign_program_params() {
		gs_shader generatedVertex_shader = this.getVertex_shader();
		if (!ModernizedCProgram.assign_program_shader_params(program, generatedVertex_shader)) {
			return false;
		} 
		gs_shader generatedPixel_shader = this.getPixel_shader();
		if (!ModernizedCProgram.assign_program_shader_params(program, generatedPixel_shader)) {
			return false;
		} 
		return true;
	}
	public gs_program gs_program_create(gs_device device) {
		gs_program program = ModernizedCProgram.bzalloc(/*Error: sizeof expression not supported yet*/);
		int linked = false;
		program.setDevice(device);
		Object generatedCur_vertex_shader = device.getCur_vertex_shader();
		program.setVertex_shader(generatedCur_vertex_shader);
		Object generatedCur_pixel_shader = device.getCur_pixel_shader();
		program.setPixel_shader(generatedCur_pixel_shader);
		program.setObj(/*Error: Function owner not recognized*/glCreateProgram());
		if (!ModernizedCProgram.gl_success("glCreateProgram")) {
			;
		} 
		Object generatedObj = program.getObj();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glAttachShader(generatedObj, generatedObj);
		if (!ModernizedCProgram.gl_success("glAttachShader (vertex)")) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glAttachShader(generatedObj, generatedObj);
		if (!ModernizedCProgram.gl_success("glAttachShader (pixel)")) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glLinkProgram(generatedObj);
		if (!ModernizedCProgram.gl_success("glLinkProgram")) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glGetProgramiv(generatedObj, GL_LINK_STATUS, linked);
		if (!ModernizedCProgram.gl_success("glGetProgramiv")) {
			;
		} 
		if (linked == GL_FALSE) {
			ModernizedCProgram.print_link_errors(generatedObj);
			;
		} 
		if (!program.assign_program_attribs()) {
			;
		} 
		if (!program.assign_program_params()) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glDetachShader(generatedObj, generatedObj);
		ModernizedCProgram.gl_success("glDetachShader (vertex)");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glDetachShader(generatedObj, generatedObj);
		ModernizedCProgram.gl_success("glDetachShader (pixel)");
		gs_program generatedFirst_program = device.getFirst_program();
		program.setNext(generatedFirst_program);
		program.setPrev_next(generatedFirst_program);
		device.setFirst_program(program);
		gs_program generatedNext = program.getNext();
		if (generatedNext) {
			generatedNext.setPrev_next(generatedNext);
		} 
		return program;
		ModernizedCProgram.gl_success("glDetachShader (pixel)");
		ModernizedCProgram.gl_success("glDetachShader (vertex)");
		return NULL;
	}
	public void gs_program_destroy() {
		if (!program) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedDevice = this.getDevice();
		if (generatedDevice.getCur_program() == program) {
			generatedDevice.setCur_program(0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glUseProgram(0);
			ModernizedCProgram.gl_success("glUseProgram (zero)");
		} 
		Object generatedAttribs = this.getAttribs();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedAttribs);
		Object generatedParams = this.getParams();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedParams);
		gs_program generatedNext = this.getNext();
		gs_program generatedPrev_next = this.getPrev_next();
		if (generatedNext) {
			generatedNext.setPrev_next(generatedPrev_next);
		} 
		if (generatedPrev_next) {
			generatedPrev_next = generatedNext;
		} 
		Object generatedObj = this.getObj();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glDeleteProgram(generatedObj);
		ModernizedCProgram.gl_success("glDeleteProgram");
		ModernizedCProgram.bfree(program);
	}
	public Object getDevice() {
		return device;
	}
	public void setDevice(Object newDevice) {
		device = newDevice;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object newObj) {
		obj = newObj;
	}
	public gs_shader getVertex_shader() {
		return vertex_shader;
	}
	public void setVertex_shader(gs_shader newVertex_shader) {
		vertex_shader = newVertex_shader;
	}
	public gs_shader getPixel_shader() {
		return pixel_shader;
	}
	public void setPixel_shader(gs_shader newPixel_shader) {
		pixel_shader = newPixel_shader;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public gs_program getPrev_next() {
		return prev_next;
	}
	public void setPrev_next(gs_program newPrev_next) {
		prev_next = newPrev_next;
	}
	public gs_program getNext() {
		return next;
	}
	public void setNext(gs_program newNext) {
		next = newNext;
	}
}
