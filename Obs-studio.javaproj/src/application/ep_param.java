package application;

/* effect parser param data */
public class ep_param {
	private Byte type;
	private Byte name;
	private Object ;
	private gs_effect_param param;
	private Object is_const;
	private Object is_property;
	private Object is_uniform;
	private Object is_texture;
	private Object written;
	private int writeorder;
	private int array_count;
	private Object ;
	
	public ep_param(Byte type, Byte name, Object,  gs_effect_param param, Object is_const, Object is_property, Object is_uniform, Object is_texture, Object written, int writeorder, int array_count, Object ) {
		setType(type);
		setName(name);
		set();
		setParam(param);
		setIs_const(is_const);
		setIs_property(is_property);
		setIs_uniform(is_uniform);
		setIs_texture(is_texture);
		setWritten(written);
		setWriteorder(writeorder);
		setArray_count(array_count);
		set();
	}
	public ep_param() {
	}
	
	public void ep_param_init(Byte type, Byte name, Object is_property, Object is_const, Object is_uniform) {
		this.setType(type);
		this.setName(name);
		this.setIs_property(is_property);
		this.setIs_const(is_const);
		this.setIs_uniform(is_uniform);
		Byte generatedType = this.getType();
		this.setIs_texture((ModernizedCProgram.astrcmp_n(generatedType, "texture", 7) == 0));
		this.setWritten(false);
		this.setWriteorder(false);
		this.setArray_count(0);
		Object generatedDefault_val = this.getDefault_val();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(generatedDefault_val);
		Object generatedProperties = this.getProperties();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(generatedProperties);
		Object generatedAnnotations = this.getAnnotations();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(generatedAnnotations);
	}
	public void ep_param_free() {
		Byte generatedType = this.getType();
		ModernizedCProgram.bfree(generatedType);
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
		Object generatedDefault_val = this.getDefault_val();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedDefault_val);
		Object generatedProperties = this.getProperties();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedProperties);
		Object generatedAnnotations = this.getAnnotations();
		for ( i = 0;
		 i < generatedAnnotations.getNum(); i++) {
			generatedAnnotations.getArray() + i.ep_param_free();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedAnnotations);
	}
	public ep_param ep_getparam(effect_parser ep, Object name) {
		 i = new ();
		Object generatedParams = ep.getParams();
		for (i = 0; i < generatedParams.getNum(); i++) {
			if (/*Error: Function owner not recognized*/strcmp(name, generatedParams.getArray()[i].getName()) == 0) {
				return generatedParams.getArray() + i;
			} 
		}
		return NULL;
	}
	public ep_param ep_getannotation(Object name) {
		 i = new ();
		for (i = 0; i < ModernizedCProgram.param.getAnnotations().getNum(); i++) {
			if (/*Error: Function owner not recognized*/strcmp(name, ModernizedCProgram.param.getAnnotations().getArray()[i].getName()) == 0) {
				return ModernizedCProgram.param.getAnnotations().getArray() + i;
			} 
		}
		return NULL;
	}
	public ep_param ep_getparam_strref(effect_parser ep, Object ref) {
		 i = new ();
		Object generatedParams = ep.getParams();
		for (i = 0; i < generatedParams.getNum(); i++) {
			if (ModernizedCProgram.strref_cmp(ref, generatedParams.getArray()[i].getName()) == 0) {
				return generatedParams.getArray() + i;
			} 
		}
		return NULL;
	}
	public Byte getType() {
		return type;
	}
	public void setType(Byte newType) {
		type = newType;
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
	public gs_effect_param getParam() {
		return param;
	}
	public void setParam(gs_effect_param newParam) {
		param = newParam;
	}
	public Object getIs_const() {
		return is_const;
	}
	public void setIs_const(Object newIs_const) {
		is_const = newIs_const;
	}
	public Object getIs_property() {
		return is_property;
	}
	public void setIs_property(Object newIs_property) {
		is_property = newIs_property;
	}
	public Object getIs_uniform() {
		return is_uniform;
	}
	public void setIs_uniform(Object newIs_uniform) {
		is_uniform = newIs_uniform;
	}
	public Object getIs_texture() {
		return is_texture;
	}
	public void setIs_texture(Object newIs_texture) {
		is_texture = newIs_texture;
	}
	public Object getWritten() {
		return written;
	}
	public void setWritten(Object newWritten) {
		written = newWritten;
	}
	public int getWriteorder() {
		return writeorder;
	}
	public void setWriteorder(int newWriteorder) {
		writeorder = newWriteorder;
	}
	public int getArray_count() {
		return array_count;
	}
	public void setArray_count(int newArray_count) {
		array_count = newArray_count;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
