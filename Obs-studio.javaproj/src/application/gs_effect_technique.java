package application;

/* ------------------------------------------------------------------------- */
public class gs_effect_technique {
	private Byte name;
	private effect_section section;
	private gs_effect effect;
	private Object ;
	
	public gs_effect_technique(Byte name, effect_section section, gs_effect effect, Object ) {
		setName(name);
		setSection(section);
		setEffect(effect);
		set();
	}
	public gs_effect_technique() {
	}
	
	public void effect_technique_init() {
		.memset(t, 0, );
	}
	public void effect_technique_free() {
		 i = new ();
		Object generatedPasses = this.getPasses();
		for (i = 0; i < generatedPasses.getNum(); i++) {
			generatedPasses.getArray() + i.effect_pass_free();
		}
		.da_free(generatedPasses);
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
	}
	public gs_effect_technique gs_effect_get_technique(Object effect, Object name) {
		if (!effect) {
			return ((Object)0);
		} 
		Byte generatedName = tech.getName();
		for ( i = 0;
		 i < effect.getTechniques().getNum(); i++) {
			gs_effect_technique tech = effect.getTechniques().getArray() + i;
			if (.strcmp(generatedName, name) == 0) {
				return tech;
			} 
		}
		return ((Object)0);
	}
	public gs_effect_technique gs_effect_get_current_technique(Object effect) {
		if (!effect) {
			return ((Object)0);
		} 
		return effect.getCur_technique();
	}
	public Object gs_technique_begin() {
		if (!tech) {
			return 0;
		} 
		gs_effect generatedEffect = this.getEffect();
		generatedEffect.setCur_technique(tech);
		graphics_subsystem generatedGraphics = generatedEffect.getGraphics();
		generatedGraphics.setCur_effect(generatedEffect);
		Object generatedPasses = this.getPasses();
		return generatedPasses.getNum();
	}
	public void gs_technique_end() {
		if (!tech) {
			return ;
		} 
		gs_effect generatedEffect = this.getEffect();
		gs_effect effect = generatedEffect;
		Object generatedParams = effect.getParams();
		gs_effect_param params = generatedParams.getArray();
		 i = new ();
		((Object)0).gs_load_vertexshader();
		((Object)0).gs_load_pixelshader();
		generatedEffect.setCur_technique(((Object)0));
		graphics_subsystem generatedGraphics = generatedEffect.getGraphics();
		generatedGraphics.setCur_effect(((Object)0));
		for (i = 0; i < generatedParams.getNum(); i++) {
			gs_effect_param param = params + i;
			.da_free(ModernizedCProgram.param.getCur_val());
			ModernizedCProgram.param.setChanged(false);
			if (ModernizedCProgram.param.getNext_sampler()) {
				ModernizedCProgram.param.setNext_sampler(((Object)0));
			} 
		}
	}
	public Object gs_technique_begin_pass(Object idx) {
		gs_effect_pass passes = new gs_effect_pass();
		gs_effect_pass cur_pass = new gs_effect_pass();
		Object generatedPasses = this.getPasses();
		if (!tech || idx >= generatedPasses.getNum()) {
			return false;
		} 
		passes = generatedPasses.getArray();
		cur_pass = passes + idx;
		gs_effect generatedEffect = this.getEffect();
		generatedEffect.setCur_pass(cur_pass);
		gs_shader generatedVertshader = cur_pass.getVertshader();
		generatedVertshader.gs_load_vertexshader();
		gs_shader generatedPixelshader = cur_pass.getPixelshader();
		generatedPixelshader.gs_load_pixelshader();
		generatedEffect.upload_parameters(false);
		return true;
	}
	public Object gs_technique_begin_pass_by_name(Object name) {
		if (!tech) {
			return false;
		} 
		Object generatedPasses = this.getPasses();
		Byte generatedName = pass.getName();
		for ( i = 0;
		 i < generatedPasses.getNum(); i++) {
			gs_effect_pass pass = generatedPasses.getArray() + i;
			if (.strcmp(generatedName, name) == 0) {
				tech.gs_technique_begin_pass(i);
				return true;
			} 
		}
		return false;
	}
	public void gs_technique_end_pass() {
		if (!tech) {
			return ;
		} 
		gs_effect generatedEffect = this.getEffect();
		gs_effect_pass generatedCur_pass = generatedEffect.getCur_pass();
		gs_effect_pass pass = generatedCur_pass;
		if (!pass) {
			return ;
		} 
		Object generatedVertshader_params = pass.getVertshader_params();
		generatedVertshader_params.getDa().clear_tex_params();
		Object generatedPixelshader_params = pass.getPixelshader_params();
		generatedPixelshader_params.getDa().clear_tex_params();
		generatedEffect.setCur_pass(((Object)0));
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
	public gs_effect getEffect() {
		return effect;
	}
	public void setEffect(gs_effect newEffect) {
		effect = newEffect;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
