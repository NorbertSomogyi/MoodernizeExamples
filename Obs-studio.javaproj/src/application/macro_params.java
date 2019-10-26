package application;

/* ------------------------------------------------------------------------- */
public class macro_params {
	private  params;
	
	public macro_params( params) {
		setParams(params);
	}
	public macro_params() {
	}
	
	public void macro_params_init() {
		 generatedParams = this.getParams();
		Object generatedDa = generatedParams.getDa();
		generatedDa.darray_init();
	}
	public void macro_params_free() {
		size_t i = new size_t();
		 generatedParams = this.getParams();
		Object generatedNum = generatedParams.getNum();
		Object generatedArray = generatedParams.getArray();
		for (i = 0; i < generatedNum; i++) {
			generatedArray + i.macro_param_free();
		}
		Object generatedDa = generatedParams.getDa();
		generatedDa.darray_free();
	}
	public  getParams() {
		return params;
	}
	public void setParams( newParams) {
		params = newParams;
	}
}
/*
 * collects tokens for a macro parameter
 *
 * note that it is important to make sure that any usage of function calls
 * within a macro parameter is preserved, example MACRO(func(1, 2), 3), do not
 * let it stop on the comma at "1,"
 */
