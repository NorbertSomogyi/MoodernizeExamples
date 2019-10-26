package application;

public class gl_platform {
	private Object display;
	private Object context;
	private Object pbuffer;
	
	public gl_platform(Object display, Object context, Object pbuffer) {
		setDisplay(display);
		setContext(context);
		setPbuffer(pbuffer);
	}
	public gl_platform() {
	}
	
	public Object gl_context_create() {
		Object generatedDisplay = this.getDisplay();
		 display = generatedDisplay;
		int frame_buf_config_count = 0;
		 config = ((Object)0);
		 context = new ();
		 success = false;
		if (!ModernizedCProgram.GLAD_GLX_ARB_create_context) {
			ModernizedCProgram.blog(LOG_ERROR, "ARB_GLX_create_context not supported!");
			return false;
		} 
		config = .glXChooseFBConfig(display, .DefaultScreen(display), ModernizedCProgram.ctx_visual_attribs, frame_buf_config_count);
		if (!config) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to create OpenGL frame buffer config");
			return false;
		} 
		context = .glXCreateContextAttribsARB(display, config[0], ((Object)0), true, ModernizedCProgram.ctx_attribs);
		if (!context) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to create OpenGL context.");
			;
		} 
		this.setContext(context);
		this.setDisplay(display);
		this.setPbuffer(.glXCreatePbuffer(display, config[0], ModernizedCProgram.ctx_pbuffer_attribs));
		Object generatedPbuffer = this.getPbuffer();
		if (!generatedPbuffer) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to create OpenGL pbuffer");
			;
		} 
		success = true;
		.XSync(display, false);
		return success;
	}
	public void gl_context_destroy() {
		Object generatedDisplay = this.getDisplay();
		 display = generatedDisplay;
		.glXMakeContextCurrent(display, None, None, ((Object)0));
		Object generatedContext = this.getContext();
		.glXDestroyContext(display, generatedContext);
		ModernizedCProgram.bfree(plat);
	}
	public gl_platform gl_platform_create(Object device, Object adapter) {
		gl_platform plat = ModernizedCProgram.bmalloc(/* There's some trickery here... we're mixing libX11, xcb, and GLX
			   For an explanation see here: http://xcb.freedesktop.org/MixingCalls/
			   Essentially, GLX requires Xlib. Everything else we use xcb. */);
		 display = ModernizedCProgram.open_windowless_display();
		if (!display) {
			;
		} 
		.XSetEventQueueOwner(display, XCBOwnsEventQueue);
		.XSetErrorHandler(x_error_handler);
		device.setPlat(/* We assume later that cur_swap is already set. */plat);
		plat.setDisplay(display);
		if (!plat.gl_context_create()) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to create context!");
			;
		} 
		Object generatedDisplay = plat.getDisplay();
		Object generatedPbuffer = plat.getPbuffer();
		Object generatedContext = plat.getContext();
		if (!.glXMakeContextCurrent(generatedDisplay, generatedPbuffer, generatedPbuffer, generatedContext)) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to make context current.");
			;
		} 
		if (!ModernizedCProgram.gladLoadGL()) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to load OpenGL entry functions.");
			;
		} 
		;
		plat = ((Object)0);
		return plat;
		gl_platform plat = ModernizedCProgram.bzalloc();
		dummy_context dummy = new dummy_context();
		gs_init_data info = new gs_init_data(0);
		int pixel_format;
		PIXELFORMATDESCRIPTOR pfd = new PIXELFORMATDESCRIPTOR();
		.memset(dummy, 0, );
		ModernizedCProgram.init_dummy_swap_info(info);
		if (!dummy.gl_dummy_context_init()) {
			;
		} 
		Object generatedHdc = dummy.getHdc();
		if (!generatedHdc.gl_init_extensions()) {
			;
		} 
		if (!ModernizedCProgram.register_dummy_class()) {
			return false;
		} 
		if (!plat.create_dummy_window()) {
			return false;
		} 
		if (!/* you have to have a dummy context open before you can actually
			 * use wglChoosePixelFormatARB */pfd.gl_getpixelformat(generatedHdc, info, pixel_format)) {
			;
		} 
		dummy.gl_dummy_context_free();
		if (!ModernizedCProgram.init_default_swap(plat, device, pixel_format, pfd)) {
			;
		} 
		plat.setHrc(ModernizedCProgram.gl_init_context(generatedHdc));
		Object generatedHrc = plat.getHrc();
		if (!generatedHrc) {
			;
		} 
		if (!ModernizedCProgram.gladLoadGL()) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to initialize OpenGL entry functions.");
			;
		} 
		.UNUSED_PARAMETER(adapter);
		return plat;
		plat.gl_platform_destroy();
		dummy.gl_dummy_context_free();
		return ((Object)0);
	}
	public void gl_platform_destroy() {
		if (!/* In what case would platform be invalid here? */plat) {
			return ;
		} 
		plat.gl_context_destroy();
		Object generatedHrc = this.getHrc();
		Object generatedWindow = this.getWindow();
		if (plat) {
			if (generatedHrc) {
				.wglMakeCurrent(((Object)0), ((Object)0));
				.wglDeleteContext(generatedHrc);
			} 
			if (generatedWindow.getHdc()) {
				.ReleaseDC(generatedWindow.getHwnd(), generatedWindow.getHdc());
			} 
			if (generatedWindow.getHwnd()) {
				.DestroyWindow(generatedWindow.getHwnd());
			} 
			ModernizedCProgram.bfree(plat);
		} 
	}
	public Object create_dummy_window() {
		Object generatedWindow = this.getWindow();
		generatedWindow.setHwnd(.CreateWindowExA(0, "Dummy GL Window Class", "OpenGL Dummy Window", -1024, 0, 0, 1, 1, ((Object)0), ((Object)0), .GetModuleHandleW(((Object)0)), ((Object)0)));
		if (!generatedWindow.getHwnd()) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to create dummy GL window, %lu", .GetLastError());
			return false;
		} 
		generatedWindow.setHdc(.GetDC(generatedWindow.getHwnd()));
		if (!generatedWindow.getHdc()) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to get dummy GL window DC (%lu)", .GetLastError());
			return false;
		} 
		return true;
	}
	public Object getDisplay() {
		return display;
	}
	public void setDisplay(Object newDisplay) {
		display = newDisplay;
	}
	public Object getContext() {
		return context;
	}
	public void setContext(Object newContext) {
		context = newContext;
	}
	public Object getPbuffer() {
		return pbuffer;
	}
	public void setPbuffer(Object newPbuffer) {
		pbuffer = newPbuffer;
	}
}
