package application;

public class gl_windowinfo {
	private Object config;
	private Object window;
	private int screen;
	
	public gl_windowinfo(Object config, Object window, int screen) {
		setConfig(config);
		setWindow(window);
		setScreen(screen);
	}
	public gl_windowinfo() {
	}
	
	public gl_windowinfo gl_windowinfo_create(Object info) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(info);
		return ModernizedCProgram.bmalloc(/*Error: Unsupported expression*/);
		gl_windowinfo gl_windowinfo = new gl_windowinfo();
		gl_windowinfo wi = gl_windowinfo.gl_windowinfo_bare(info);
		PIXELFORMATDESCRIPTOR pfd = new PIXELFORMATDESCRIPTOR();
		int pixel_format;
		if (!wi) {
			return ((Object)0);
		} 
		Object generatedHdc = wi.getHdc();
		if (!pfd.gl_getpixelformat(generatedHdc, info, pixel_format)) {
			;
		} 
		if (!pfd.gl_setpixelformat(generatedHdc, pixel_format)) {
			;
		} 
		return wi;
		wi.gl_windowinfo_destroy();
		return ((Object)0);
	}
	public void gl_windowinfo_destroy() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(info);
		ModernizedCProgram.bfree(info);
		Object generatedHdc = wi.getHdc();
		Object generatedHwnd = wi.getHwnd();
		if (wi) {
			if (generatedHdc) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseDC(generatedHwnd, generatedHdc);
			} 
			ModernizedCProgram.bfree(wi);
		} 
	}
	public gl_windowinfo gl_windowinfo_bare(Object info) {
		gl_windowinfo wi = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		wi.setHwnd(info.getWindow().getHwnd());
		Object generatedHwnd = wi.getHwnd();
		wi.setHdc(/*Error: Function owner not recognized*/GetDC(generatedHwnd));
		Object generatedHdc = wi.getHdc();
		if (!generatedHdc) {
			ModernizedCProgram.blog(LOG_ERROR, "Unable to get device context from window");
			ModernizedCProgram.bfree(wi);
			return ((Object)0);
		} 
		return wi;
	}
	public Object getConfig() {
		return config;
	}
	public void setConfig(Object newConfig) {
		config = newConfig;
	}
	public Object getWindow() {
		return window;
	}
	public void setWindow(Object newWindow) {
		window = newWindow;
	}
	public int getScreen() {
		return screen;
	}
	public void setScreen(int newScreen) {
		screen = newScreen;
	}
}
/* We store this value since we can fetch a lot
	 * of information not only concerning the config
	 * but the visual, and various other settings
	 * for the context.
	 */
