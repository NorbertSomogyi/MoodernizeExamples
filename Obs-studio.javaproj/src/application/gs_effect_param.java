package application;

/* ------------------------------------------------------------------------- */
public class gs_effect_param {
	private Byte name;
	private effect_section section;
	private gs_shader_param_type type;
	private Object changed;
	private gs_effect effect;
	private gs_sampler_state next_sampler;
	private Object ;
	
	public gs_effect_param(Byte name, effect_section section, gs_shader_param_type type, Object changed, gs_effect effect, gs_sampler_state next_sampler, Object ) {
		setName(name);
		setSection(section);
		setType(type);
		setChanged(changed);
		setEffect(effect);
		setNext_sampler(next_sampler);
		set();
	}
	public gs_effect_param() {
	}
	
	public void effect_param_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.param, 0, /*Error: Unsupported expression*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(ModernizedCProgram.param.getAnnotations());
	}
	public void effect_param_free() {
		ModernizedCProgram.bfree(ModernizedCProgram.param.getName())//bfree(param->full_name);;//bfree(param->full_name);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(ModernizedCProgram.param.getCur_val());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(ModernizedCProgram.param.getDefault_val());
		 i = new ();
		for (i = 0; i < ModernizedCProgram.param.getAnnotations().getNum(); i++) {
			ModernizedCProgram.param.getAnnotations().getArray() + i.effect_param_free();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(ModernizedCProgram.param.getAnnotations());
	}
	public gs_effect_param gs_effect_get_param_by_idx(Object effect, Object param) {
		if (!effect) {
			return ((Object)0);
		} 
		gs_effect_param params = effect.getParams().getArray();
		if (param >= effect.getParams().getNum()) {
			return ((Object)0);
		} 
		return params + param;
	}
	public gs_effect_param gs_effect_get_param_by_name(Object effect, Object name) {
		if (!effect) {
			return ((Object)0);
		} 
		gs_effect_param params = effect.getParams().getArray();
		for ( i = 0;
		 i < effect.getParams().getNum(); i++) {
			gs_effect_param param = params + i;
			if (/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.param.getName(), name) == 0) {
				return ModernizedCProgram.param;
			} 
		}
		return ((Object)0);
	}
	public gs_effect_param gs_param_get_annotation_by_idx(Object param, Object annotation) {
		if (!param) {
			return ((Object)0);
		} 
		gs_effect_param params = param.getAnnotations().getArray();
		if (annotation > param.getAnnotations().getNum()) {
			return ((Object)0);
		} 
		return params + annotation;
	}
	public gs_effect_param gs_param_get_annotation_by_name(Object param, Object name) {
		if (!param) {
			return ((Object)0);
		} 
		gs_effect_param params = param.getAnnotations().getArray();
		Byte generatedName = g_param.getName();
		for ( i = 0;
		 i < param.getAnnotations().getNum(); i++) {
			gs_effect_param g_param = params + i;
			if (/*Error: Function owner not recognized*/strcmp(generatedName, name) == 0) {
				return g_param;
			} 
		}
		return ((Object)0);
	}
	public gs_effect_param gs_effect_get_viewproj_matrix(Object effect) {
		return effect ? effect.getView_proj() : ((Object)0);
	}
	public gs_effect_param gs_effect_get_world_matrix(Object effect) {
		return effect ? effect.getWorld() : ((Object)0);
	}
	public void effect_setval_inline(Object data, Object size) {
		 size_changed = new ();
		if (!ModernizedCProgram.param) {
			ModernizedCProgram.blog(LOG_ERROR, "effect_setval_inline: invalid param");
			return /*Error: Unsupported expression*/;
		} 
		if (!data) {
			ModernizedCProgram.blog(LOG_ERROR, "effect_setval_inline: invalid data");
			return /*Error: Unsupported expression*/;
		} 
		size_changed = ModernizedCProgram.param.getCur_val().getNum() != size;
		if (size_changed) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_resize(ModernizedCProgram.param.getCur_val(), size);
		} 
		if (size_changed || /*Error: Function owner not recognized*/memcmp(ModernizedCProgram.param.getCur_val().getArray(), data, size) != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.param.getCur_val().getArray(), data, size);
			ModernizedCProgram.param.setChanged(true);
		} 
	}
	public void effect_getval_inline(Object data, Object size) {
		if (!ModernizedCProgram.param) {
			ModernizedCProgram.blog(LOG_ERROR, "effect_getval_inline: invalid param");
			return /*Error: Unsupported expression*/;
		} 
		if (!data) {
			ModernizedCProgram.blog(LOG_ERROR, "effect_getval_inline: invalid data");
			return /*Error: Unsupported expression*/;
		} 
		 bytes = (((size) < (ModernizedCProgram.param.getCur_val().getNum())) ? (size) : (ModernizedCProgram.param.getCur_val().getNum()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(data, ModernizedCProgram.param.getCur_val().getArray(), bytes);
	}
	public void effect_getdefaultval_inline(Object data, Object size) {
		if (!ModernizedCProgram.param) {
			ModernizedCProgram.blog(LOG_ERROR, "effect_getdefaultval_inline: invalid param");
			return /*Error: Unsupported expression*/;
		} 
		if (!data) {
			ModernizedCProgram.blog(LOG_ERROR, "effect_getdefaultval_inline: invalid data");
			return /*Error: Unsupported expression*/;
		} 
		 bytes = (((size) < (ModernizedCProgram.param.getDefault_val().getNum())) ? (size) : (ModernizedCProgram.param.getDefault_val().getNum()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(data, ModernizedCProgram.param.getDefault_val().getArray(), bytes);
	}
	public void gs_effect_set_bool(Object val) {
		int b_val = (int)val;
		ModernizedCProgram.param.effect_setval_inline(b_val, /*Error: Unsupported expression*/);
	}
	public void gs_effect_set_float(double val) {
		ModernizedCProgram.param.effect_setval_inline(val, /*Error: Unsupported expression*/);
	}
	public void gs_effect_set_int(int val) {
		ModernizedCProgram.param.effect_setval_inline(val, /*Error: Unsupported expression*/);
	}
	public void gs_effect_set_matrix4(Object val) {
		ModernizedCProgram.param.effect_setval_inline(val, /*Error: Unsupported expression*/);
	}
	public void gs_effect_set_vec2(Object val) {
		ModernizedCProgram.param.effect_setval_inline(val, /*Error: Unsupported expression*/);
	}
	public void gs_effect_set_vec3(Object val) {
		ModernizedCProgram.param.effect_setval_inline(val, /*Error: Unsupported expression*/ * 3);
	}
	public void gs_effect_set_vec4(Object val) {
		ModernizedCProgram.param.effect_setval_inline(val, /*Error: Unsupported expression*/);
	}
	public void gs_effect_set_color(Object argb) {
		vec4 v_color = new vec4();
		v_color.vec4_from_bgra(argb);
		ModernizedCProgram.param.effect_setval_inline(v_color, /*Error: Unsupported expression*/);
	}
	public void gs_effect_set_val(Object val, Object size) {
		ModernizedCProgram.param.effect_setval_inline(val, size);
	}
	public Object gs_effect_get_val() {
		if (!ModernizedCProgram.param) {
			ModernizedCProgram.blog(LOG_ERROR, "gs_effect_get_val: invalid param");
			return ((Object)0);
		} 
		 size = ModernizedCProgram.param.getCur_val().getNum();
		Object data;
		if (size) {
			data = (Object)ModernizedCProgram.bzalloc(size);
		} else {
				return ((Object)0);
		} 
		ModernizedCProgram.param.effect_getval_inline(data, size);
		return data;
	}
	public Object gs_effect_get_val_size() {
		return ModernizedCProgram.param ? ModernizedCProgram.param.getCur_val().getNum() : 0;
	}
	public Object gs_effect_get_default_val() {
		if (!ModernizedCProgram.param) {
			ModernizedCProgram.blog(LOG_ERROR, "gs_effect_get_default_val: invalid param");
			return ((Object)0);
		} 
		 size = ModernizedCProgram.param.getDefault_val().getNum();
		Object data;
		if (size) {
			data = (Object)ModernizedCProgram.bzalloc(size);
		} else {
				return ((Object)0);
		} 
		ModernizedCProgram.param.effect_getdefaultval_inline(data, size);
		return data;
	}
	public Object gs_effect_get_default_val_size() {
		return ModernizedCProgram.param ? ModernizedCProgram.param.getDefault_val().getNum() : 0;
	}
	public void gs_effect_set_default() {
		ModernizedCProgram.param.effect_setval_inline(ModernizedCProgram.param.getDefault_val().getArray(), ModernizedCProgram.param.getDefault_val().getNum());
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public effect_section getSection() {
		return section;
	}
	public void setSection(effect_section newSection) {
		section = newSection;
	}
	public gs_shader_param_type getType() {
		return type;
	}
	public void setType(gs_shader_param_type newType) {
		type = newType;
	}
	public Object getChanged() {
		return changed;
	}
	public void setChanged(Object newChanged) {
		changed = newChanged;
	}
	public gs_effect getEffect() {
		return effect;
	}
	public void setEffect(gs_effect newEffect) {
		effect = newEffect;
	}
	public gs_sampler_state getNext_sampler() {
		return next_sampler;
	}
	public void setNext_sampler(gs_sampler_state newNext_sampler) {
		next_sampler = newNext_sampler;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
