package application;

/* services */
public class obs_weak_service {
	private obs_weak_ref ref;
	private obs_service service;
	
	public obs_weak_service(obs_weak_ref ref, obs_service service) {
		setRef(ref);
		setService(service);
	}
	public obs_weak_service() {
	}
	
	public void obs_weak_service_addref() {
		if (!weak) {
			return ;
		} 
		obs_weak_ref generatedRef = this.getRef();
		generatedRef.obs_weak_ref_addref();
	}
	public void obs_weak_service_release() {
		if (!weak) {
			return ;
		} 
		obs_weak_ref generatedRef = this.getRef();
		if (generatedRef.obs_weak_ref_release()) {
			ModernizedCProgram.bfree(weak);
		} 
	}
	public obs_weak_service obs_service_get_weak_service(obs_service service) {
		if (!service) {
			return NULL;
		} 
		obs_weak_service generatedControl = service.getControl();
		obs_weak_service_t weak = generatedControl;
		weak.obs_weak_service_addref();
		return weak;
	}
	public obs_weak_ref getRef() {
		return ref;
	}
	public void setRef(obs_weak_ref newRef) {
		ref = newRef;
	}
	public obs_service getService() {
		return service;
	}
	public void setService(obs_service newService) {
		service = newService;
	}
}
