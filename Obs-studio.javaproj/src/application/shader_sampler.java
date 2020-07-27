package application;

/* ------------------------------------------------------------------------- */
public class shader_sampler {
	private Byte name;
	private Object ;
	private Object ;
	
	public shader_sampler(Byte name, Object,  Object ) {
		setName(name);
		set();
		set();
	}
	public shader_sampler() {
	}
	
	public void shader_sampler_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ss, 0, /*Error: Unsupported expression*/);
	}
	public void shader_sampler_free() {
		 i = new ();
		Object generatedStates = this.getStates();
		for (i = 0; i < generatedStates.getNum(); i++) {
			ModernizedCProgram.bfree(generatedStates.getArray()[i]);
		}
		Object generatedValues = this.getValues();
		for (i = 0; i < generatedValues.getNum(); i++) {
			ModernizedCProgram.bfree(generatedValues.getArray()[i]);
		}
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedStates);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedValues);
	}
	public shader_sampler shader_parser_getsampler(shader_parser sp, Object sampler_name) {
		 i = new ();
		Object generatedSamplers = sp.getSamplers();
		Byte generatedName = sampler.getName();
		for (i = 0; i < generatedSamplers.getNum(); i++) {
			shader_sampler sampler = generatedSamplers.getArray() + i;
			if (/*Error: Function owner not recognized*/strcmp(generatedName, sampler_name) == 0) {
				return sampler;
			} 
		}
		return NULL;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
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
