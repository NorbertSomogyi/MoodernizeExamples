package application;

/* effect parser function data */
public class ep_func {
	private Byte name;
	private Byte ret_type;
	private Byte mapping;
	private dstr contents;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	private Object ;
	private Object written;
	
	public ep_func(Byte name, Byte ret_type, Byte mapping, dstr contents, Object,  Object,  Object,  Object,  Object,  Object written) {
		setName(name);
		setRet_type(ret_type);
		setMapping(mapping);
		setContents(contents);
		set();
		set();
		set();
		set();
		set();
		setWritten(written);
	}
	public ep_func() {
	}
	
	public void ep_func_init(Byte ret_type, Byte name) {
		.memset(epf, 0, );
		this.setName(name);
		this.setRet_type(ret_type);
	}
	public void ep_func_free() {
		 i = new ();
		Object generatedParam_vars = this.getParam_vars();
		for (i = 0; i < generatedParam_vars.getNum(); i++) {
			generatedParam_vars.getArray() + i.ep_var_free();
		}
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
		Byte generatedRet_type = this.getRet_type();
		ModernizedCProgram.bfree(generatedRet_type);
		Byte generatedMapping = this.getMapping();
		ModernizedCProgram.bfree(generatedMapping);
		dstr generatedContents = this.getContents();
		generatedContents.dstr_free();
		.da_free(generatedParam_vars);
		Object generatedFunc_deps = this.getFunc_deps();
		.da_free(generatedFunc_deps);
		Object generatedStruct_deps = this.getStruct_deps();
		.da_free(generatedStruct_deps);
		Object generatedParam_deps = this.getParam_deps();
		.da_free(generatedParam_deps);
		Object generatedSampler_deps = this.getSampler_deps();
		.da_free(generatedSampler_deps);
	}
	public ep_func ep_getfunc(effect_parser ep, Object name) {
		 i = new ();
		Object generatedFuncs = ep.getFuncs();
		for (i = 0; i < generatedFuncs.getNum(); i++) {
			if (.strcmp(name, generatedFuncs.getArray()[i].getName()) == 0) {
				return generatedFuncs.getArray() + i;
			} 
		}
		return NULL;
	}
	public ep_func ep_getfunc_strref(effect_parser ep, Object ref) {
		 i = new ();
		Object generatedFuncs = ep.getFuncs();
		for (i = 0; i < generatedFuncs.getNum(); i++) {
			if (ModernizedCProgram.strref_cmp(ref, generatedFuncs.getArray()[i].getName()) == 0) {
				return generatedFuncs.getArray() + i;
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
	public Byte getRet_type() {
		return ret_type;
	}
	public void setRet_type(Byte newRet_type) {
		ret_type = newRet_type;
	}
	public Byte getMapping() {
		return mapping;
	}
	public void setMapping(Byte newMapping) {
		mapping = newMapping;
	}
	public dstr getContents() {
		return contents;
	}
	public void setContents(dstr newContents) {
		contents = newContents;
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
