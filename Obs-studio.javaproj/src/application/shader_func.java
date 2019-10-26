package application;

/* ------------------------------------------------------------------------- */
public class shader_func {
	private Byte name;
	private Byte return_type;
	private Byte mapping;
	private Object ;
	private cf_token start;
	private cf_token end;
	
	public shader_func(Byte name, Byte return_type, Byte mapping, Object,  cf_token start, cf_token end) {
		setName(name);
		setReturn_type(return_type);
		setMapping(mapping);
		set();
		setStart(start);
		setEnd(end);
	}
	public shader_func() {
	}
	
	public void shader_func_init(Byte return_type, Byte name) {
		Object generatedParams = this.getParams();
		.da_init(generatedParams);
		this.setReturn_type(return_type);
		this.setMapping(NULL);
		this.setName(name);
		this.setStart(NULL);
		this.setEnd(NULL);
	}
	public void shader_func_free() {
		 i = new ();
		Object generatedParams = this.getParams();
		for (i = 0; i < generatedParams.getNum(); i++) {
			generatedParams.getArray() + i.shader_var_free();
		}
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
		Byte generatedReturn_type = this.getReturn_type();
		ModernizedCProgram.bfree(generatedReturn_type);
		Byte generatedMapping = this.getMapping();
		ModernizedCProgram.bfree(generatedMapping);
		.da_free(generatedParams);
	}
	public shader_func shader_parser_getfunc(shader_parser sp, Object func_name) {
		 i = new ();
		Object generatedFuncs = sp.getFuncs();
		Byte generatedName = func.getName();
		for (i = 0; i < generatedFuncs.getNum(); i++) {
			shader_func func = generatedFuncs.getArray() + i;
			if (.strcmp(generatedName, func_name) == 0) {
				return func;
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
	public Byte getReturn_type() {
		return return_type;
	}
	public void setReturn_type(Byte newReturn_type) {
		return_type = newReturn_type;
	}
	public Byte getMapping() {
		return mapping;
	}
	public void setMapping(Byte newMapping) {
		mapping = newMapping;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public cf_token getStart() {
		return start;
	}
	public void setStart(cf_token newStart) {
		start = newStart;
	}
	public cf_token getEnd() {
		return end;
	}
	public void setEnd(cf_token newEnd) {
		end = newEnd;
	}
}
