package application;

/* encoders  */
public class obs_weak_encoder {
	private obs_weak_ref ref;
	private obs_encoder encoder;
	
	public obs_weak_encoder(obs_weak_ref ref, obs_encoder encoder) {
		setRef(ref);
		setEncoder(encoder);
	}
	public obs_weak_encoder() {
	}
	
	public void obs_weak_encoder_addref() {
		if (!weak) {
			return /*Error: Unsupported expression*/;
		} 
		obs_weak_ref generatedRef = this.getRef();
		generatedRef.obs_weak_ref_addref();
	}
	public void obs_weak_encoder_release() {
		if (!weak) {
			return /*Error: Unsupported expression*/;
		} 
		obs_weak_ref generatedRef = this.getRef();
		if (generatedRef.obs_weak_ref_release()) {
			ModernizedCProgram.bfree(weak);
		} 
	}
	public obs_weak_encoder obs_encoder_get_weak_encoder(obs_encoder encoder) {
		if (!encoder) {
			return NULL;
		} 
		obs_weak_encoder generatedControl = encoder.getControl();
		obs_weak_encoder_t weak = generatedControl;
		weak.obs_weak_encoder_addref();
		return weak;
	}
	public obs_weak_ref getRef() {
		return ref;
	}
	public void setRef(obs_weak_ref newRef) {
		ref = newRef;
	}
	public obs_encoder getEncoder() {
		return encoder;
	}
	public void setEncoder(obs_encoder newEncoder) {
		encoder = newEncoder;
	}
}
