package application;

/* c-family preprocessor definition */
public class cf_def {
	private cf_token name;
	private  params;
	private  tokens;
	private boolean macro;
	
	public cf_def(cf_token name,  params,  tokens, boolean macro) {
		setName(name);
		setParams(params);
		setTokens(tokens);
		setMacro(macro);
	}
	public cf_def() {
	}
	
	public cf_def cf_preprocess_get_def(cf_preprocessor pp, Object def_name) {
		size_t idx = pp.cf_preprocess_get_def_idx(def_name);
		if (idx == ((size_t)-1)) {
			return ((Object)0);
		} 
		 generatedDefines = pp.getDefines();
		Object generatedArray = generatedDefines.getArray();
		return generatedArray + idx;
	}
	public void cf_def_init() {
		cf_token generatedName = this.getName();
		generatedName.cf_token_clear();
		 generatedParams = this.getParams();
		Object generatedDa = generatedParams.getDa();
		generatedDa.darray_init();
		generatedDa.darray_init();
		this.setMacro(0);
	}
	public void cf_def_free() {
		cf_token generatedName = this.getName();
		generatedName.cf_token_clear();
		 generatedParams = this.getParams();
		Object generatedDa = generatedParams.getDa();
		generatedDa.darray_free();
		generatedDa.darray_free();
	}
	public cf_token getName() {
		return name;
	}
	public void setName(cf_token newName) {
		name = newName;
	}
	public  getParams() {
		return params;
	}
	public void setParams( newParams) {
		params = newParams;
	}
	public  getTokens() {
		return tokens;
	}
	public void setTokens( newTokens) {
		tokens = newTokens;
	}
	public boolean getMacro() {
		return macro;
	}
	public void setMacro(boolean newMacro) {
		macro = newMacro;
	}
}
