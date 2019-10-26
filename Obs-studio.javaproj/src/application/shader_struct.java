package application;

public class shader_struct {
	private Byte name;
	private Object ;
	
	public shader_struct(Byte name, Object ) {
		setName(name);
		set();
	}
	public shader_struct() {
	}
	
	public void shader_struct_init() {
		.memset(ss, 0, );
	}
	public void shader_struct_free() {
		 i = new ();
		Object generatedVars = this.getVars();
		for (i = 0; i < generatedVars.getNum(); i++) {
			generatedVars.getArray() + i.shader_var_free();
		}
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
		.da_free(generatedVars);
	}
	public shader_struct shader_parser_getstruct(shader_parser sp, Object struct_name) {
		 i = new ();
		Object generatedStructs = sp.getStructs();
		Byte generatedName = st.getName();
		for (i = 0; i < generatedStructs.getNum(); i++) {
			shader_struct st = generatedStructs.getArray() + i;
			if (.strcmp(generatedName, struct_name) == 0) {
				return st;
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
}
