package application;

public class dummy_context {
	private Object hwnd;
	private Object hrc;
	private Object hdc;
	
	public dummy_context(Object hwnd, Object hrc, Object hdc) {
		setHwnd(hwnd);
		setHrc(hrc);
		setHdc(hdc);
	}
	public dummy_context() {
	}
	
	public Object gl_dummy_context_init() {
		PIXELFORMATDESCRIPTOR pfd = new PIXELFORMATDESCRIPTOR();
		int format_index;
		if (!ModernizedCProgram.gl_register_dummy_window_class()) {
			return false;
		} 
		this.setHwnd(ModernizedCProgram.gl_create_dummy_window());
		Object generatedHwnd = this.getHwnd();
		if (!generatedHwnd) {
			return false;
		} 
		this.setHdc(/*Error: Function owner not recognized*/GetDC(generatedHwnd));
		pfd.init_dummy_pixel_format();
		Object generatedHdc = this.getHdc();
		format_index = /*Error: Function owner not recognized*/ChoosePixelFormat(generatedHdc, pfd);
		if (!format_index) {
			ModernizedCProgram.blog(LOG_ERROR, "Dummy ChoosePixelFormat failed, %lu", /*Error: Function owner not recognized*/GetLastError());
			return false;
		} 
		if (!/*Error: Function owner not recognized*/SetPixelFormat(generatedHdc, format_index, pfd)) {
			ModernizedCProgram.blog(LOG_ERROR, "Dummy SetPixelFormat failed, %lu", /*Error: Function owner not recognized*/GetLastError());
			return false;
		} 
		this.setHrc(ModernizedCProgram.gl_init_basic_context(generatedHdc));
		Object generatedHrc = this.getHrc();
		if (!generatedHrc) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to initialize dummy context");
			return false;
		} 
		return true;
	}
	public void gl_dummy_context_free() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wglMakeCurrent(((Object)0), ((Object)0));
		Object generatedHrc = this.getHrc();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/wglDeleteContext(generatedHrc);
		Object generatedHwnd = this.getHwnd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DestroyWindow(generatedHwnd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(dummy, 0, /*Error: Unsupported expression*/);
	}
	public Object getHwnd() {
		return hwnd;
	}
	public void setHwnd(Object newHwnd) {
		hwnd = newHwnd;
	}
	public Object getHrc() {
		return hrc;
	}
	public void setHrc(Object newHrc) {
		hrc = newHrc;
	}
	public Object getHdc() {
		return hdc;
	}
	public void setHdc(Object newHdc) {
		hdc = newHdc;
	}
}
