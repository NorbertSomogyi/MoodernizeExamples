package application;

public class graphics_subsystem {
	private Object module;
	private gs_device device;
	private gs_exports exports;
	private Object ;
	private Object ;
	private Object cur_matrix;
	private matrix4 projection;
	private gs_effect cur_effect;
	private gs_vertex_buffer sprite_buffer;
	private Object using_immediate;
	private gs_vb_data vbd;
	private gs_vertex_buffer immediate_vertbuffer;
	private Object ;
	private Object ;
	private Object ;
	private Object effect_mutex;
	private gs_effect first_effect;
	private Object mutex;
	private Object ref;
	private blend_state cur_blend_state;
	private Object ;
	
	public graphics_subsystem(Object module, gs_device device, gs_exports exports, Object,  Object,  Object cur_matrix, matrix4 projection, gs_effect cur_effect, gs_vertex_buffer sprite_buffer, Object using_immediate, gs_vb_data vbd, gs_vertex_buffer immediate_vertbuffer, Object,  Object,  Object,  Object effect_mutex, gs_effect first_effect, Object mutex, Object ref, blend_state cur_blend_state, Object ) {
		setModule(module);
		setDevice(device);
		setExports(exports);
		set();
		set();
		setCur_matrix(cur_matrix);
		setProjection(projection);
		setCur_effect(cur_effect);
		setSprite_buffer(sprite_buffer);
		setUsing_immediate(using_immediate);
		setVbd(vbd);
		setImmediate_vertbuffer(immediate_vertbuffer);
		set();
		set();
		set();
		setEffect_mutex(effect_mutex);
		setFirst_effect(first_effect);
		setMutex(mutex);
		setRef(ref);
		setCur_blend_state(cur_blend_state);
		set();
	}
	public graphics_subsystem() {
	}
	
	public Object graphics_init_immediate_vb() {
		gs_vb_data vbd = new gs_vb_data();
		gs_vb_data gs_vb_data = new gs_vb_data();
		vbd = gs_vb_data.gs_vbdata_create();
		vbd.setNum(512);
		vbd.setPoints(ModernizedCProgram.bmalloc(/*Error: Unsupported expression*/ * 512));
		vbd.setNormals(ModernizedCProgram.bmalloc(/*Error: Unsupported expression*/ * 512));
		vbd.setColors(ModernizedCProgram.bmalloc(/*Error: Unsupported expression*/ * 512));
		vbd.setNum_tex(1);
		vbd.setTvarray(ModernizedCProgram.bmalloc(/*Error: Unsupported expression*/));
		gs_tvertarray[] generatedTvarray = vbd.getTvarray();
		generatedTvarray[0].setWidth(2);
		generatedTvarray[0].setArray(ModernizedCProgram.bmalloc(/*Error: Unsupported expression*/ * 512));
		gs_device generatedDevice = this.getDevice();
		this.setImmediate_vertbuffer(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, vbd, (1 << 1)));
		gs_vertex_buffer generatedImmediate_vertbuffer = this.getImmediate_vertbuffer();
		if (!generatedImmediate_vertbuffer) {
			return false;
		} 
		return true;
	}
	public Object graphics_init_sprite_vb() {
		gs_vb_data vbd = new gs_vb_data();
		gs_vb_data gs_vb_data = new gs_vb_data();
		vbd = gs_vb_data.gs_vbdata_create();
		vbd.setNum(4);
		vbd.setPoints(ModernizedCProgram.bmalloc(/*Error: Unsupported expression*/ * 4));
		vbd.setNum_tex(1);
		vbd.setTvarray(ModernizedCProgram.bmalloc(/*Error: Unsupported expression*/));
		gs_tvertarray[] generatedTvarray = vbd.getTvarray();
		generatedTvarray[0].setWidth(2);
		generatedTvarray[0].setArray(ModernizedCProgram.bmalloc(/*Error: Unsupported expression*/ * 4));
		vec3 generatedPoints = vbd.getPoints();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedPoints, 0, /*Error: Unsupported expression*/ * 4);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedTvarray[0].getArray(), 0, /*Error: Unsupported expression*/ * 4);
		gs_device generatedDevice = this.getDevice();
		this.setSprite_buffer(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, vbd, (1 << 1)));
		gs_vertex_buffer generatedSprite_buffer = this.getSprite_buffer();
		if (!generatedSprite_buffer) {
			return false;
		} 
		return true;
	}
	public Object graphics_init() {
		matrix4 top_mat = new matrix4();
		top_mat.matrix4_identity();
		Object generatedMatrix_stack = this.getMatrix_stack();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedMatrix_stack, top_mat);
		gs_device generatedDevice = this.getDevice();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice);
		if (!graphics.graphics_init_immediate_vb()) {
			return false;
		} 
		if (!graphics.graphics_init_sprite_vb()) {
			return false;
		} 
		Object generatedMutex = this.getMutex();
		if (ModernizedCProgram.pthread_mutex_init(generatedMutex, ((Object)0)) != 0) {
			return false;
		} 
		Object generatedEffect_mutex = this.getEffect_mutex();
		if (ModernizedCProgram.pthread_mutex_init(generatedEffect_mutex, ((Object)0)) != 0) {
			return false;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, gs_blend_type.GS_BLEND_SRCALPHA, gs_blend_type.GS_BLEND_INVSRCALPHA, gs_blend_type.GS_BLEND_ONE, gs_blend_type.GS_BLEND_INVSRCALPHA);
		blend_state generatedCur_blend_state = this.getCur_blend_state();
		generatedCur_blend_state.setEnabled(true);
		generatedCur_blend_state.setSrc_c(gs_blend_type.GS_BLEND_SRCALPHA);
		generatedCur_blend_state.setDest_c(gs_blend_type.GS_BLEND_INVSRCALPHA);
		generatedCur_blend_state.setSrc_a(gs_blend_type.GS_BLEND_ONE);
		generatedCur_blend_state.setDest_a(gs_blend_type.GS_BLEND_INVSRCALPHA);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice);
		ModernizedCProgram.gs_init_image_deps();
		return true;
	}
	public int gs_create(Object module, Object adapter) {
		int errcode = -1;
		graphics_t graphics = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		Object generatedMutex = graphics.getMutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedMutex);
		Object generatedEffect_mutex = graphics.getEffect_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedEffect_mutex);
		graphics.setModule(ModernizedCProgram.os_dlopen(module));
		Object generatedModule = graphics.getModule();
		if (!generatedModule) {
			errcode = -2;
			;
		} 
		gs_exports generatedExports = graphics.getExports();
		if (!generatedExports.load_graphics_imports(generatedModule, module)) {
			;
		} 
		gs_device generatedDevice = graphics.getDevice();
		errcode = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, adapter);
		if (errcode != 0) {
			;
		} 
		if (!graphics.graphics_init()) {
			errcode = -1;
			;
		} 
		pgraphics = graphics;
		return errcode;
		return errcode;
	}
	public void gs_destroy() {
		if (!ModernizedCProgram.gs_obj_valid(graphics, "gs_destroy", "graphics")) {
			return /*Error: Unsupported expression*/;
		} 
		while (thread_graphics) {
			ModernizedCProgram.gs_leave_context();
		}
		gs_device generatedDevice = this.getDevice();
		gs_effect generatedFirst_effect = this.getFirst_effect();
		gs_effect generatedNext = effect.getNext();
		gs_vertex_buffer generatedSprite_buffer = this.getSprite_buffer();
		gs_vertex_buffer generatedImmediate_vertbuffer = this.getImmediate_vertbuffer();
		if (generatedDevice) {
			gs_effect effect = generatedFirst_effect;
			thread_graphics = graphics;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice);
			while (effect) {
				gs_effect next = generatedNext;
				effect.gs_effect_actually_destroy();
				effect = next;
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedSprite_buffer);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedImmediate_vertbuffer);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice);
			thread_graphics = ((Object)0);
		} 
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
		Object generatedEffect_mutex = this.getEffect_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedEffect_mutex);
		Object generatedMatrix_stack = this.getMatrix_stack();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedMatrix_stack);
		Object generatedViewport_stack = this.getViewport_stack();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedViewport_stack);
		Object generatedBlend_state_stack = this.getBlend_state_stack();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedBlend_state_stack);
		Object generatedModule = this.getModule();
		if (generatedModule) {
			ModernizedCProgram.os_dlclose(generatedModule);
		} 
		ModernizedCProgram.bfree(graphics);
		ModernizedCProgram.gs_free_image_deps();
	}
	public void gs_enter_context() {
		if (!ModernizedCProgram.gs_obj_valid(graphics, "gs_enter_context", "graphics")) {
			return /*Error: Unsupported expression*/;
		} 
		 is_current = thread_graphics == graphics;
		if (thread_graphics && !is_current) {
			while (thread_graphics) {
				ModernizedCProgram.gs_leave_context();
			}
		} 
		Object generatedMutex = this.getMutex();
		gs_device generatedDevice = this.getDevice();
		if (!is_current) {
			ModernizedCProgram.pthread_mutex_lock(generatedMutex);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice);
			thread_graphics = graphics;
		} 
		Object generatedRef = this.getRef();
		ModernizedCProgram.os_atomic_inc_long(generatedRef);
	}
	public graphics_subsystem gs_get_context() {
		return thread_graphics;
	}
	public void reset_immediate_arrays() {
		Object generatedVerts = this.getVerts();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(generatedVerts);
		Object generatedNorms = this.getNorms();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(generatedNorms);
		Object generatedColors = this.getColors();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(generatedColors);
		Object generatedTexverts = this.getTexverts();
		for (size_t i = 0;
		 i < 16; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(generatedTexverts[i]);
		}
	}
	public Object validvertsize(Object num, Object name) {
		Object generatedUsing_immediate = this.getUsing_immediate();
		if (generatedUsing_immediate && num == 512) {
			ModernizedCProgram.blog(LOG_ERROR, "%s: tried to use over %u for immediate rendering", name, 512);
			return false;
		} 
		return true;
	}
	public Object getModule() {
		return module;
	}
	public void setModule(Object newModule) {
		module = newModule;
	}
	public gs_device getDevice() {
		return device;
	}
	public void setDevice(gs_device newDevice) {
		device = newDevice;
	}
	public gs_exports getExports() {
		return exports;
	}
	public void setExports(gs_exports newExports) {
		exports = newExports;
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
	public Object getCur_matrix() {
		return cur_matrix;
	}
	public void setCur_matrix(Object newCur_matrix) {
		cur_matrix = newCur_matrix;
	}
	public matrix4 getProjection() {
		return projection;
	}
	public void setProjection(matrix4 newProjection) {
		projection = newProjection;
	}
	public gs_effect getCur_effect() {
		return cur_effect;
	}
	public void setCur_effect(gs_effect newCur_effect) {
		cur_effect = newCur_effect;
	}
	public gs_vertex_buffer getSprite_buffer() {
		return sprite_buffer;
	}
	public void setSprite_buffer(gs_vertex_buffer newSprite_buffer) {
		sprite_buffer = newSprite_buffer;
	}
	public Object getUsing_immediate() {
		return using_immediate;
	}
	public void setUsing_immediate(Object newUsing_immediate) {
		using_immediate = newUsing_immediate;
	}
	public gs_vb_data getVbd() {
		return vbd;
	}
	public void setVbd(gs_vb_data newVbd) {
		vbd = newVbd;
	}
	public gs_vertex_buffer getImmediate_vertbuffer() {
		return immediate_vertbuffer;
	}
	public void setImmediate_vertbuffer(gs_vertex_buffer newImmediate_vertbuffer) {
		immediate_vertbuffer = newImmediate_vertbuffer;
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
	public Object getEffect_mutex() {
		return effect_mutex;
	}
	public void setEffect_mutex(Object newEffect_mutex) {
		effect_mutex = newEffect_mutex;
	}
	public gs_effect getFirst_effect() {
		return first_effect;
	}
	public void setFirst_effect(gs_effect newFirst_effect) {
		first_effect = newFirst_effect;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public Object getRef() {
		return ref;
	}
	public void setRef(Object newRef) {
		ref = newRef;
	}
	public blend_state getCur_blend_state() {
		return cur_blend_state;
	}
	public void setCur_blend_state(blend_state newCur_blend_state) {
		cur_blend_state = newCur_blend_state;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
