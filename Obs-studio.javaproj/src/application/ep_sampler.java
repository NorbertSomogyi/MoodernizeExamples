package application;

/* effect parser sampler data */
public class ep_sampler {
	private Byte name;
	private Object ;
	private Object ;
	private Object written;
	
	public ep_sampler(Byte name, Object,  Object,  Object written) {
		setName(name);
		set();
		set();
		setWritten(written);
	}
	public ep_sampler() {
	}
	
	public void ep_sampler_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(eps, 0, /*Error: Unsupported expression*/);
	}
	public void ep_sampler_free() {
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
	public ep_sampler ep_getsampler(effect_parser ep, Object name) {
		 i = new ();
		Object generatedSamplers = ep.getSamplers();
		for (i = 0; i < generatedSamplers.getNum(); i++) {
			if (/*Error: Function owner not recognized*/strcmp(name, generatedSamplers.getArray()[i].getName()) == 0) {
				return generatedSamplers.getArray() + i;
			} 
		}
		return NULL;
	}
	public ep_sampler ep_getsampler_strref(effect_parser ep, Object ref) {
		 i = new ();
		Object generatedSamplers = ep.getSamplers();
		for (i = 0; i < generatedSamplers.getNum(); i++) {
			if (ModernizedCProgram.strref_cmp(ref, generatedSamplers.getArray()[i].getName()) == 0) {
				return generatedSamplers.getArray() + i;
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
	public Object getWritten() {
		return written;
	}
	public void setWritten(Object newWritten) {
		written = newWritten;
	}
}
