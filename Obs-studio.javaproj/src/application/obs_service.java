package application;

public class obs_service {
	private obs_context_data context;
	private obs_service_info info;
	private obs_weak_service control;
	private Object owns_info_id;
	private Object active;
	private Object destroy;
	private obs_output output;
	
	public obs_service(obs_context_data context, obs_service_info info, obs_weak_service control, Object owns_info_id, Object active, Object destroy, obs_output output) {
		setContext(context);
		setInfo(info);
		setControl(control);
		setOwns_info_id(owns_info_id);
		setActive(active);
		setDestroy(destroy);
		setOutput(output);
	}
	public obs_service() {
	}
	
	public obs_service obs_output_get_service(Object output) {
		return ModernizedCProgram.obs_object_valid(output, "obs_output_get_service", "output") ? output.getService() : NULL;
	}
	public obs_service obs_get_service_by_name(Object name) {
		if (!ModernizedCProgram.obs) {
			return NULL;
		} 
		return ModernizedCProgram.get_context_by_name(ModernizedCProgram.obs.getData().getFirst_service(), name, ModernizedCProgram.obs.getData().getServices_mutex(), obs_service_addref_safe_);
	}
	public Object obs_hotkey_register_service(Object name, Object description, Object func, Object data) {
		if (!service || !ModernizedCProgram.lock()) {
			return (~(obs_hotkey_id)0);
		} 
		obs_weak_service obs_weak_service = new obs_weak_service();
		obs_context_data generatedContext = this.getContext();
		obs_hotkey_id id = generatedContext.obs_hotkey_register_internal(obs_hotkey_registerer_type.OBS_HOTKEY_REGISTERER_SERVICE, obs_weak_service.obs_service_get_weak_service(service), name, description, func, data);
		ModernizedCProgram.unlock();
		return id;
	}
	public Object obs_hotkey_pair_register_service(Object name0, Object description0, Object name1, Object description1, Object func0, Object func1, Object data0, Object data1) {
		if (!service) {
			return (~(obs_hotkey_pair_id)0);
		} 
		obs_context_data generatedContext = this.getContext();
		return generatedContext.register_hotkey_pair_internal(obs_hotkey_registerer_type.OBS_HOTKEY_REGISTERER_SERVICE, service, weak_service_ref, name0, description0, name1, description1, func0, func1, data0, data1);
	}
	public obs_service obs_service_create_internal(Object id, Object name, obs_data settings, obs_data hotkey_data, Object private) {
		obs_service_info info = id.find_service();
		obs_service service = new obs_service();
		if (!info) {
			ModernizedCProgram.blog(LOG_ERROR, "Service '%s' not found", id);
			return NULL;
		} 
		service = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		obs_context_data generatedContext = service.getContext();
		if (!ModernizedCProgram.obs_context_data_init(generatedContext, obs_obj_type.OBS_OBJ_TYPE_SERVICE, settings, name, hotkey_data, private)) {
			ModernizedCProgram.bfree(service);
			return NULL;
		} 
		service.setInfo(info);
		obs_data generatedSettings = generatedContext.getSettings();
		generatedContext.setData(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedSettings, service));
		Object[] generatedData = generatedContext.getData();
		if (!generatedData) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to create service '%s'!", name);
		} 
		service.setControl(ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/));
		obs_weak_service generatedControl = service.getControl();
		generatedControl.setService(service);
		generatedContext.obs_context_data_insert(generatedData.getServices_mutex(), generatedData.getFirst_service());
		ModernizedCProgram.blog(LOG_DEBUG, "service '%s' (%s) created", name, id);
		return service;
	}
	public obs_service obs_service_create(Object id, Object name, obs_data settings, obs_data hotkey_data) {
		obs_service obs_service = new obs_service();
		return obs_service.obs_service_create_internal(id, name, settings, hotkey_data, false);
	}
	public obs_service obs_service_create_private(Object id, Object name, obs_data settings) {
		obs_service obs_service = new obs_service();
		return obs_service.obs_service_create_internal(id, name, settings, NULL, true);
	}
	public void actually_destroy_service() {
		obs_context_data generatedContext = this.getContext();
		Object[] generatedData = generatedContext.getData();
		if (generatedData) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData);
		} 
		obs_output generatedOutput = this.getOutput();
		if (generatedOutput) {
			generatedOutput.setService(NULL);
		} 
		Byte generatedName = generatedContext.getName();
		ModernizedCProgram.blog(LOG_DEBUG, "service '%s' destroyed", generatedName);
		generatedContext.obs_context_data_free();
		Object generatedOwns_info_id = this.getOwns_info_id();
		obs_service_info generatedInfo = this.getInfo();
		Object generatedId = generatedInfo.getId();
		if (generatedOwns_info_id) {
			ModernizedCProgram.bfree((Object)generatedId);
		} 
		ModernizedCProgram.bfree(service);
	}
	public void obs_service_destroy() {
		obs_context_data generatedContext = this.getContext();
		Object generatedActive = this.getActive();
		if (service) {
			generatedContext.obs_context_data_remove();
			this.setDestroy(true);
			if (!generatedActive) {
				service.actually_destroy_service();
			} 
		} 
	}
	public void obs_service_activate() {
		if (!ModernizedCProgram.obs_object_valid(service, "obs_service_activate", "service")) {
			return /*Error: Unsupported expression*/;
		} 
		obs_output generatedOutput = this.getOutput();
		if (!generatedOutput) {
			ModernizedCProgram.blog(LOG_WARNING, "obs_service_deactivate: service '%s' is not assigned to an output", ModernizedCProgram.obs_service_get_name(service));
			return /*Error: Unsupported expression*/;
		} 
		Object generatedActive = this.getActive();
		if (generatedActive) {
			return /*Error: Unsupported expression*/;
		} 
		obs_service_info generatedInfo = this.getInfo();
		Object generatedActivate = generatedInfo.getActivate();
		obs_context_data generatedContext = this.getContext();
		Object[] generatedData = generatedContext.getData();
		obs_data generatedSettings = generatedContext.getSettings();
		if (generatedActivate) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, generatedSettings);
		} 
		this.setActive(true);
	}
	public void obs_service_deactivate(Object remove) {
		if (!ModernizedCProgram.obs_object_valid(service, "obs_service_deactivate", "service")) {
			return /*Error: Unsupported expression*/;
		} 
		obs_output generatedOutput = this.getOutput();
		if (!generatedOutput) {
			ModernizedCProgram.blog(LOG_WARNING, "obs_service_deactivate: service '%s' is not assigned to an output", ModernizedCProgram.obs_service_get_name(service));
			return /*Error: Unsupported expression*/;
		} 
		Object generatedActive = this.getActive();
		if (!generatedActive) {
			return /*Error: Unsupported expression*/;
		} 
		obs_service_info generatedInfo = this.getInfo();
		Object generatedDeactivate = generatedInfo.getDeactivate();
		obs_context_data generatedContext = this.getContext();
		Object[] generatedData = generatedContext.getData();
		if (generatedDeactivate) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData);
		} 
		this.setActive(false);
		Object generatedDestroy = this.getDestroy();
		if (generatedDestroy) {
			service.actually_destroy_service();
		}  else if (remove) {
			this.setOutput(NULL);
		} 
	}
	public void obs_service_addref() {
		if (!service) {
			return /*Error: Unsupported expression*/;
		} 
		obs_weak_service generatedControl = this.getControl();
		obs_weak_ref generatedRef = generatedControl.getRef();
		generatedRef.obs_ref_addref();
	}
	public void obs_service_release() {
		if (!service) {
			return /*Error: Unsupported expression*/;
		} 
		obs_weak_service generatedControl = this.getControl();
		obs_weak_service_t control = generatedControl;
		obs_weak_ref generatedRef = control.getRef();
		if (generatedRef.obs_ref_release()) {
			service.obs_service_destroy();
			control.obs_weak_service_release();
		} 
		// The order of operations is important here since// get_context_by_name in obs.c relies on weak refs
	}
	public obs_service obs_service_get_ref() {
		if (!service) {
			return NULL;
		} 
		obs_weak_service generatedControl = this.getControl();
		obs_service obs_service = new obs_service();
		return obs_service.obs_weak_service_get_service(generatedControl);
	}
	public obs_service obs_weak_service_get_service(obs_weak_service weak) {
		if (!weak) {
			return NULL;
		} 
		obs_weak_ref generatedRef = weak.getRef();
		obs_service generatedService = weak.getService();
		if (generatedRef.obs_weak_ref_get_ref()) {
			return generatedService;
		} 
		return NULL;
	}
	public Object obs_service_get_type_data() {
		obs_service_info generatedInfo = this.getInfo();
		Object generatedType_data = generatedInfo.getType_data();
		return ModernizedCProgram.obs_object_valid(service, "obs_service_get_type_data", "service") ? generatedType_data : NULL;
	}
	public obs_context_data getContext() {
		return context;
	}
	public void setContext(obs_context_data newContext) {
		context = newContext;
	}
	public obs_service_info getInfo() {
		return info;
	}
	public void setInfo(obs_service_info newInfo) {
		info = newInfo;
	}
	public obs_weak_service getControl() {
		return control;
	}
	public void setControl(obs_weak_service newControl) {
		control = newControl;
	}
	public Object getOwns_info_id() {
		return owns_info_id;
	}
	public void setOwns_info_id(Object newOwns_info_id) {
		owns_info_id = newOwns_info_id;
	}
	public Object getActive() {
		return active;
	}
	public void setActive(Object newActive) {
		active = newActive;
	}
	public Object getDestroy() {
		return destroy;
	}
	public void setDestroy(Object newDestroy) {
		destroy = newDestroy;
	}
	public obs_output getOutput() {
		return output;
	}
	public void setOutput(obs_output newOutput) {
		output = newOutput;
	}
}
