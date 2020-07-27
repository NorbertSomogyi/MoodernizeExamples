package application;

public class gs_swap_chain {
	private Object device;
	private gl_windowinfo wi;
	private gs_init_data info;
	
	public gs_swap_chain(Object device, gl_windowinfo wi, gs_init_data info) {
		setDevice(device);
		setWi(wi);
		setInfo(info);
	}
	public gs_swap_chain() {
	}
	
	public Object gl_platform_init_swapchain() {
		Object generatedDevice = this.getDevice();
		 display = generatedDevice.getPlat().getDisplay();
		 xcb_conn = /*Error: Function owner not recognized*/XGetXCBConnection(display);
		 wid = /*Error: Function owner not recognized*/xcb_generate_id(xcb_conn);
		gs_init_data generatedInfo = this.getInfo();
		Object generatedGs_init_data = generatedInfo.getGs_init_data();
		 parent = generatedGs_init_data.getId();
		 geometry = ModernizedCProgram.get_window_geometry(xcb_conn, parent);
		 status = false;
		int screen_num;
		int visual;
		 fb_config = new ();
		if (!geometry) {
			;
		} 
		screen_num = ModernizedCProgram.get_screen_num_from_root(xcb_conn, geometry.getRoot());
		if (screen_num == -1) {
			;
		} 
		{ 
			int num_configs;
			fb_config = /*Error: Function owner not recognized*/glXChooseFBConfig(display, screen_num, ModernizedCProgram.ctx_visual_attribs, num_configs);
			if (!fb_config || !num_configs) {
				ModernizedCProgram.blog(LOG_ERROR, "Failed to find FBConfig!");
				;
			} 
		}
		{ 
			int error = /*Error: Function owner not recognized*/glXGetFBConfigAttrib(display, fb_config[/* ...then fetch matching visual info for xcb. */0], GLX_VISUAL_ID, visual);
			if (error) {
				ModernizedCProgram.blog(LOG_ERROR, "Bad call to GetFBConfigAttrib!");
				;
			} 
		}
		 colormap = /*Error: Function owner not recognized*/xcb_generate_id(xcb_conn);
		 mask = XCB_CW_BORDER_PIXEL | XCB_CW_COLORMAP;
		[] mask_values = new []{0, colormap, 0};
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/xcb_create_colormap(xcb_conn, XCB_COLORMAP_ALLOC_NONE, colormap, parent, visual);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/xcb_create_window(xcb_conn, 24, wid, parent, 0, /* Hardcoded? */0, geometry.getWidth(), geometry.getHeight(), 0, 0, visual, mask, mask_values);
		gl_windowinfo generatedWi = this.getWi();
		generatedWi.setConfig(fb_config[0]);
		generatedWi.setWindow(wid);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/xcb_map_window(xcb_conn, wid);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/XFree(fb_config);
		status = true;
		;
		return status;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(swap);
		return true;
	}
	public void gl_platform_cleanup_swapchain() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(swap/* Really nothing to clean up? */);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(swap);
	}
	public gs_swap_chain gs_swapchain_create(Object data) {
		gs_init_data new_data = data;
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_swapchain_create") && ModernizedCProgram.gs_obj_valid(data, "gs_swapchain_create", "data"))) {
			return ((Object)0);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, new_data);
	}
	public void gs_load_swapchain() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_load_swapchain")) {
			return /*Error: Unsupported expression*/;
		} 
		gs_device generatedDevice = graphics.getDevice();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice, swapchain);
	}
	public void gs_swapchain_destroy() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_swapchain_destroy")) {
			return /*Error: Unsupported expression*/;
		} 
		if (!swapchain) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(swapchain);
		if (!swapchain) {
			return /*Error: Unsupported expression*/;
		} 
		if (this.getDevice().getCur_swap() == swapchain) {
			ModernizedCProgram.device_load_swapchain(this.getDevice(), NULL);
		} 
		swapchain.gl_platform_cleanup_swapchain();
		this.getWi().gl_windowinfo_destroy();
		ModernizedCProgram.bfree(swapchain);
	}
	public Object getDevice() {
		return device;
	}
	public void setDevice(Object newDevice) {
		device = newDevice;
	}
	public gl_windowinfo getWi() {
		return wi;
	}
	public void setWi(gl_windowinfo newWi) {
		wi = newWi;
	}
	public gs_init_data getInfo() {
		return info;
	}
	public void setInfo(gs_init_data newInfo) {
		info = newInfo;
	}
}
