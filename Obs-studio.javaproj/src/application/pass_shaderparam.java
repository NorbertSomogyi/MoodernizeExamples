package application;

/* ------------------------------------------------------------------------- */
public class pass_shaderparam {
	private gs_effect_param eparam;
	private gs_shader_param sparam;
	
	public pass_shaderparam(gs_effect_param eparam, gs_shader_param sparam) {
		setEparam(eparam);
		setSparam(sparam);
	}
	public pass_shaderparam() {
	}
	
	public gs_effect_param getEparam() {
		return eparam;
	}
	public void setEparam(gs_effect_param newEparam) {
		eparam = newEparam;
	}
	public gs_shader_param getSparam() {
		return sparam;
	}
	public void setSparam(gs_shader_param newSparam) {
		sparam = newSparam;
	}
}
