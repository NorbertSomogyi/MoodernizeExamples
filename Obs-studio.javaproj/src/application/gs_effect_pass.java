package application;

public class gs_effect_pass {
	private Byte name;
	private effect_section section;
	private gs_shader vertshader;
	private gs_shader pixelshader;
	private Object ;
	private Object ;
	
	public gs_effect_pass(Byte name, effect_section section, gs_shader vertshader, gs_shader pixelshader, Object,  Object ) {
		setName(name);
		setSection(section);
		setVertshader(vertshader);
		setPixelshader(pixelshader);
		set();
		set();
	}
	public gs_effect_pass() {
	}
	
	public void effect_pass_init() {
		.memset(pass, 0, );
	}
	public void effect_pass_free() {
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
		Object generatedVertshader_params = this.getVertshader_params();
		.da_free(generatedVertshader_params);
		Object generatedPixelshader_params = this.getPixelshader_params();
		.da_free(generatedPixelshader_params);
		gs_shader generatedVertshader = this.getVertshader();
		ModernizedCProgram.gs_shader_destroy(generatedVertshader);
		gs_shader generatedPixelshader = this.getPixelshader();
		ModernizedCProgram.gs_shader_destroy(generatedPixelshader);
	}
	public gs_effect_pass gs_technique_get_pass_by_idx(Object technique, Object pass) {
		if (!technique) {
			return ((Object)0);
		} 
		gs_effect_pass passes = technique.getPasses().getArray();
		if (pass > technique.getPasses().getNum()) {
			return ((Object)0);
		} 
		return passes + pass;
	}
	public gs_effect_pass gs_technique_get_pass_by_name(Object technique, Object name) {
		if (!technique) {
			return ((Object)0);
		} 
		gs_effect_pass passes = technique.getPasses().getArray();
		Byte generatedName = g_pass.getName();
		for ( i = 0;
		 i < technique.getPasses().getNum(); i++) {
			gs_effect_pass g_pass = passes + i;
			if (.strcmp(generatedName, name) == 0) {
				return g_pass;
			} 
		}
		return ((Object)0);
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
	public gs_shader getVertshader() {
		return vertshader;
	}
	public void setVertshader(gs_shader newVertshader) {
		vertshader = newVertshader;
	}
	public gs_shader getPixelshader() {
		return pixelshader;
	}
	public void setPixelshader(gs_shader newPixelshader) {
		pixelshader = newPixelshader;
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
