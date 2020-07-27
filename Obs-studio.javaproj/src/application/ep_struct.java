package application;

/* effect parser struct data */
public class ep_struct {
	private Byte name;
	private Object ;
	private Object written;
	
	public ep_struct(Byte name, Object,  Object written) {
		setName(name);
		set();
		setWritten(written);
	}
	public ep_struct() {
	}
	
	public Object ep_struct_mapped() {
		Object generatedVars = this.getVars();
		if (generatedVars.getNum() > 0) {
			return generatedVars.getArray()[0].getMapping() != NULL;
		} 
		return false;
	}
	public void ep_struct_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(eps, 0, /*Error: Unsupported expression*/);
	}
	public void ep_struct_free() {
		 i = new ();
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
		Object generatedVars = this.getVars();
		for (i = 0; i < generatedVars.getNum(); i++) {
			generatedVars.getArray() + i.ep_var_free();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedVars);
	}
	public ep_struct ep_getstruct(effect_parser ep, Object name) {
		 i = new ();
		Object generatedStructs = ep.getStructs();
		for (i = 0; i < generatedStructs.getNum(); i++) {
			if (/*Error: Function owner not recognized*/strcmp(name, generatedStructs.getArray()[i].getName()) == 0) {
				return generatedStructs.getArray() + i;
			} 
		}
		return NULL;
	}
	public ep_struct ep_getstruct_strref(effect_parser ep, Object ref) {
		 i = new ();
		Object generatedStructs = ep.getStructs();
		for (i = 0; i < generatedStructs.getNum(); i++) {
			if (ModernizedCProgram.strref_cmp(ref, generatedStructs.getArray()[i].getName()) == 0) {
				return generatedStructs.getArray() + i;
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
	public Object getWritten() {
		return written;
	}
	public void setWritten(Object newWritten) {
		written = newWritten;
	}
}
