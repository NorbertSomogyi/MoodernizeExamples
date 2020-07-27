package application;

public class obs_weak_source {
	private obs_weak_ref ref;
	private obs_source source;
	
	public obs_weak_source(obs_weak_ref ref, obs_source source) {
		setRef(ref);
		setSource(source);
	}
	public obs_weak_source() {
	}
	
	public void obs_weak_source_addref() {
		if (!weak) {
			return /*Error: Unsupported expression*/;
		} 
		obs_weak_ref generatedRef = this.getRef();
		generatedRef.obs_weak_ref_addref();
	}
	public void obs_weak_source_release() {
		if (!weak) {
			return /*Error: Unsupported expression*/;
		} 
		obs_weak_ref generatedRef = this.getRef();
		if (generatedRef.obs_weak_ref_release()) {
			ModernizedCProgram.bfree(weak);
		} 
	}
	public obs_weak_source obs_source_get_weak_source(obs_source source) {
		if (!source) {
			return NULL;
		} 
		obs_weak_source generatedControl = source.getControl();
		obs_weak_source_t weak = generatedControl;
		weak.obs_weak_source_addref();
		return weak;
	}
	public obs_weak_ref getRef() {
		return ref;
	}
	public void setRef(obs_weak_ref newRef) {
		ref = newRef;
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
}
