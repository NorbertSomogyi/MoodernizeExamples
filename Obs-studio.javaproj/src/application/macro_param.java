package application;

/* ------------------------------------------------------------------------- */
public class macro_param {
	private cf_token name;
	private  tokens;
	
	public macro_param(cf_token name,  tokens) {
		setName(name);
		setTokens(tokens);
	}
	public macro_param() {
	}
	
	public void macro_param_init() {
		ModernizedCProgram.param.getName().cf_token_clear();
		ModernizedCProgram.param.getTokens().getDa().darray_init();
	}
	public void macro_param_free() {
		ModernizedCProgram.param.getName().cf_token_clear();
		ModernizedCProgram.param.getTokens().getDa().darray_free();
	}
	public macro_param get_macro_param(Object params, Object name) {
		size_t i = new size_t();
		if (!params) {
			return ((Object)0);
		} 
		for (i = 0; i < params.getParams().getNum(); i++) {
			macro_param param = params.getParams().getArray() + i;
			if (ModernizedCProgram.strref_cmp_strref(ModernizedCProgram.param.getName().getStr(), name) == 0) {
				return ModernizedCProgram.param;
			} 
		}
		return ((Object)0);
	}
	public cf_token getName() {
		return name;
	}
	public void setName(cf_token newName) {
		name = newName;
	}
	public  getTokens() {
		return tokens;
	}
	public void setTokens( newTokens) {
		tokens = newTokens;
	}
}
