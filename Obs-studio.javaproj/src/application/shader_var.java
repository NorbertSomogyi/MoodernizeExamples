package application;

public class shader_var {
	private Byte type;
	private Byte name;
	private Byte mapping;
	private shader_var_type var_type;
	private int array_count;
	private Object gl_sampler_id;
	
	public shader_var(Byte type, Byte name, Byte mapping, shader_var_type var_type, int array_count, Object gl_sampler_id) {
		setType(type);
		setName(name);
		setMapping(mapping);
		setVar_type(var_type);
		setArray_count(array_count);
		setGl_sampler_id(gl_sampler_id);
	}
	public shader_var() {
	}
	
	public shader_var sp_getparam(gl_shader_parser glsp, Object token) {
		 i = new ();
		shader_parser generatedParser = glsp.getParser();
		Object generatedShader_parser = generatedParser.getShader_parser();
		for (i = 0; i < generatedShader_parser.getNum(); i++) {
			shader_var param = generatedShader_parser.getArray() + i;
			if (ModernizedCProgram.strref_cmp(token.getStr(), ModernizedCProgram.param.getShader_var()) == 0) {
				return ModernizedCProgram.param;
			} 
		}
		return NULL;
	}
	public void shader_var_init() {
		.memset(sv, 0, );
	}
	public void shader_var_init_param(Byte type, Byte name, Object is_uniform, Object is_const) {
		if (is_uniform) {
			this.setVar_type(shader_var_type.SHADER_VAR_UNIFORM);
		}  else if (is_const) {
			this.setVar_type(shader_var_type.SHADER_VAR_CONST);
		} else {
				this.setVar_type(shader_var_type.SHADER_VAR_NONE);
		} 
		this.setType(type);
		this.setName(name);
		this.setMapping(NULL);
		this.setArray_count(0);
		this.setGl_sampler_id((ModernizedCProgram.size_t) - 1);
		Object generatedDefault_val = this.getDefault_val();
		.da_init(generatedDefault_val);
	}
	public void shader_var_free() {
		Byte generatedType = this.getType();
		ModernizedCProgram.bfree(generatedType);
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
		Byte generatedMapping = this.getMapping();
		ModernizedCProgram.bfree(generatedMapping);
		Object generatedDefault_val = this.getDefault_val();
		.da_free(generatedDefault_val);
	}
	public shader_var shader_parser_getparam(shader_parser sp, Object param_name) {
		 i = new ();
		Object generatedParams = sp.getParams();
		for (i = 0; i < generatedParams.getNum(); i++) {
			shader_var param = generatedParams.getArray() + i;
			if (.strcmp(ModernizedCProgram.param.getName(), param_name) == 0) {
				return ModernizedCProgram.param;
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
	public Byte getMapping() {
		return mapping;
	}
	public void setMapping(Byte newMapping) {
		mapping = newMapping;
	}
	public shader_var_type getVar_type() {
		return var_type;
	}
	public void setVar_type(shader_var_type newVar_type) {
		var_type = newVar_type;
	}
	public int getArray_count() {
		return array_count;
	}
	public void setArray_count(int newArray_count) {
		array_count = newArray_count;
	}
	public Object getGl_sampler_id() {
		return gl_sampler_id;
	}
	public void setGl_sampler_id(Object newGl_sampler_id) {
		gl_sampler_id = newGl_sampler_id;
	}
}
