package application;

public class gs_sampler_state {
	private Object device;
	private Object ref;
	private Object min_filter;
	private Object mag_filter;
	private Object address_u;
	private Object address_v;
	private Object address_w;
	private Object max_anisotropy;
	
	public gs_sampler_state(Object device, Object ref, Object min_filter, Object mag_filter, Object address_u, Object address_v, Object address_w, Object max_anisotropy) {
		setDevice(device);
		setRef(ref);
		setMin_filter(min_filter);
		setMag_filter(mag_filter);
		setAddress_u(address_u);
		setAddress_v(address_v);
		setAddress_w(address_w);
		setMax_anisotropy(max_anisotropy);
	}
	public gs_sampler_state() {
	}
	
	public void convert_sampler_info(Object info) {
		 max_anisotropy_max = new ();
		Object generatedMin_filter = this.getMin_filter();
		Object generatedMag_filter = this.getMag_filter();
		ModernizedCProgram.convert_filter(info.getFilter(), generatedMin_filter, generatedMag_filter);
		this.setAddress_u(ModernizedCProgram.convert_address_mode(info.getAddress_u()));
		this.setAddress_v(ModernizedCProgram.convert_address_mode(info.getAddress_v()));
		this.setAddress_w(ModernizedCProgram.convert_address_mode(info.getAddress_w()));
		this.setMax_anisotropy(info.getMax_anisotropy());
		max_anisotropy_max = 1;
		if (ModernizedCProgram.GLAD_GL_EXT_texture_filter_anisotropic) {
			.glGetIntegerv(GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT, max_anisotropy_max);
			ModernizedCProgram.gl_success("glGetIntegerv(GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT)");
		} 
		Object generatedMax_anisotropy = this.getMax_anisotropy();
		if (1 <= generatedMax_anisotropy && generatedMax_anisotropy <= max_anisotropy_max) {
			return ;
		} 
		if (generatedMax_anisotropy < 1) {
			this.setMax_anisotropy(1);
		}  else if (generatedMax_anisotropy > max_anisotropy_max) {
			this.setMax_anisotropy(max_anisotropy_max);
		} 
		ModernizedCProgram.blog(LOG_DEBUG, "convert_sampler_info: 1 <= max_anisotropy <= %d violated, selected: %d, set: %d", max_anisotropy_max, generatedMax_anisotropy, generatedMax_anisotropy);
	}
	public gs_sampler_state gs_samplerstate_create(Object info) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_samplerstate_create") && ModernizedCProgram.gs_obj_valid(info, "gs_samplerstate_create", "info"))) {
			return ((Object)0);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return .UNRECOGNIZEDFUNCTIONNAME(generatedDevice, info);
	}
	public void gs_load_samplerstate(int unit) {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_load_samplerstate")) {
			return ;
		} 
		gs_device generatedDevice = graphics.getDevice();
		.UNRECOGNIZEDFUNCTIONNAME(generatedDevice, samplerstate, unit);
	}
	public Object getDevice() {
		return device;
	}
	public void setDevice(Object newDevice) {
		device = newDevice;
	}
	public Object getRef() {
		return ref;
	}
	public void setRef(Object newRef) {
		ref = newRef;
	}
	public Object getMin_filter() {
		return min_filter;
	}
	public void setMin_filter(Object newMin_filter) {
		min_filter = newMin_filter;
	}
	public Object getMag_filter() {
		return mag_filter;
	}
	public void setMag_filter(Object newMag_filter) {
		mag_filter = newMag_filter;
	}
	public Object getAddress_u() {
		return address_u;
	}
	public void setAddress_u(Object newAddress_u) {
		address_u = newAddress_u;
	}
	public Object getAddress_v() {
		return address_v;
	}
	public void setAddress_v(Object newAddress_v) {
		address_v = newAddress_v;
	}
	public Object getAddress_w() {
		return address_w;
	}
	public void setAddress_w(Object newAddress_w) {
		address_w = newAddress_w;
	}
	public Object getMax_anisotropy() {
		return max_anisotropy;
	}
	public void setMax_anisotropy(Object newMax_anisotropy) {
		max_anisotropy = newMax_anisotropy;
	}
}
