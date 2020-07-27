package application;

public class obs_weak_output {
	private obs_weak_ref ref;
	private obs_output output;
	
	public obs_weak_output(obs_weak_ref ref, obs_output output) {
		setRef(ref);
		setOutput(output);
	}
	public obs_weak_output() {
	}
	
	public void obs_weak_output_addref() {
		if (!weak) {
			return /*Error: Unsupported expression*/;
		} 
		obs_weak_ref generatedRef = this.getRef();
		generatedRef.obs_weak_ref_addref();
	}
	public void obs_weak_output_release() {
		if (!weak) {
			return /*Error: Unsupported expression*/;
		} 
		obs_weak_ref generatedRef = this.getRef();
		if (generatedRef.obs_weak_ref_release()) {
			ModernizedCProgram.bfree(weak);
		} 
	}
	public obs_weak_output obs_output_get_weak_output(obs_output output) {
		if (!output) {
			return NULL;
		} 
		obs_weak_output generatedControl = output.getControl();
		obs_weak_output_t weak = generatedControl;
		weak.obs_weak_output_addref();
		return weak;
	}
	public obs_weak_ref getRef() {
		return ref;
	}
	public void setRef(obs_weak_ref newRef) {
		ref = newRef;
	}
	public obs_output getOutput() {
		return output;
	}
	public void setOutput(obs_output newOutput) {
		output = newOutput;
	}
}
