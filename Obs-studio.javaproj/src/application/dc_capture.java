package application;

public class dc_capture {
	private Object texture;
	private Object texture_written;
	private int x;
	private int y;
	private Object width;
	private Object height;
	private Object compatibility;
	private Object hdc;
	private Object bmp;
	private Object old_bmp;
	private Object bits;
	private Object capture_cursor;
	private Object cursor_captured;
	private Object cursor_hidden;
	private tagCURSORINFO ci;
	private Object valid;
	
	public dc_capture(Object texture, Object texture_written, int x, int y, Object width, Object height, Object compatibility, Object hdc, Object bmp, Object old_bmp, Object bits, Object capture_cursor, Object cursor_captured, Object cursor_hidden, tagCURSORINFO ci, Object valid) {
		setTexture(texture);
		setTexture_written(texture_written);
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
		setCompatibility(compatibility);
		setHdc(hdc);
		setBmp(bmp);
		setOld_bmp(old_bmp);
		setBits(bits);
		setCapture_cursor(capture_cursor);
		setCursor_captured(cursor_captured);
		setCursor_hidden(cursor_hidden);
		setCi(ci);
		setValid(valid);
	}
	public dc_capture() {
	}
	
	public void init_textures() {
		Object generatedCompatibility = this.getCompatibility();
		Object generatedWidth = this.getWidth();
		Object generatedHeight = this.getHeight();
		gs_texture gs_texture = new gs_texture();
		gs_texture gs_texture = new gs_texture();
		if (generatedCompatibility) {
			this.setTexture(gs_texture.gs_texture_create(generatedWidth, generatedHeight, GS_BGRA, 1, ((Object)0), GS_DYNAMIC));
		} else {
				this.setTexture(gs_texture.gs_texture_create_gdi(generatedWidth, generatedHeight));
		} 
		Object generatedTexture = this.getTexture();
		if (!generatedTexture) {
			ModernizedCProgram.blog(LOG_WARNING, "[dc_capture_init] Failed to create textures");
			return /*Error: Unsupported expression*/;
		} 
		this.setValid(true);
		Object generatedBitstreams = enc.getBitstreams();
		Object generatedBuf_count = enc.getBuf_count();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_reserve(generatedBitstreams, generatedBuf_count);
		Object generatedTextures = enc.getTextures();
		for (size_t i = 0;
		 i < generatedBuf_count; i++) {
			nv_texture texture = new nv_texture();
			if (!ModernizedCProgram.nv_texture_init(enc, texture)) {
				return false;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedTextures, texture);
		}
		return true;
	}
	public void dc_capture_init(int x, int y, Object width, Object height, Object cursor, Object compatibility) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(capture, 0, /*Error: Unsupported expression*/);
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
		this.setCapture_cursor(cursor);
		ModernizedCProgram.obs_enter_graphics();
		if (!ModernizedCProgram.gs_gdi_texture_available()) {
			compatibility = true;
		} 
		this.setCompatibility(compatibility);
		capture.init_textures();
		ModernizedCProgram.obs_leave_graphics();
		Object generatedValid = this.getValid();
		if (!generatedValid) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedBmiHeader = bi.getBmiHeader();
		Object generatedHdc = this.getHdc();
		Object generatedBits = this.getBits();
		Object generatedBmp = this.getBmp();
		if (compatibility) {
			BITMAPINFO bi = new BITMAPINFO(0);
			BITMAPINFOHEADER bih = generatedBmiHeader;
			bih.setBiSize(/*Error: Unsupported expression*/);
			bih.setBiBitCount(32);
			bih.setBiWidth(width);
			bih.setBiHeight(height);
			bih.setBiPlanes(1);
			this.setHdc(/*Error: Function owner not recognized*/CreateCompatibleDC(((Object)0)));
			this.setBmp(/*Error: Function owner not recognized*/CreateDIBSection(generatedHdc, bi, 0, (Object)generatedBits, ((Object)0), 0));
			this.setOld_bmp(/*Error: Function owner not recognized*/SelectObject(generatedHdc, generatedBmp));
		} 
	}
	public void dc_capture_free() {
		Object generatedHdc = this.getHdc();
		Object generatedOld_bmp = this.getOld_bmp();
		Object generatedBmp = this.getBmp();
		if (generatedHdc) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SelectObject(generatedHdc, generatedOld_bmp);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DeleteDC(generatedHdc);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DeleteObject(generatedBmp);
		} 
		ModernizedCProgram.obs_enter_graphics();
		Object generatedTexture = this.getTexture();
		ModernizedCProgram.gs_texture_destroy(generatedTexture);
		ModernizedCProgram.obs_leave_graphics();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(capture, 0, /*Error: Unsupported expression*/);
	}
	public Object dc_capture_get_dc() {
		Object generatedValid = this.getValid();
		if (!generatedValid) {
			return ((Object)0);
		} 
		Object generatedCompatibility = this.getCompatibility();
		Object generatedHdc = this.getHdc();
		Object generatedTexture = this.getTexture();
		if (generatedCompatibility) {
			return generatedHdc;
		} else {
				return generatedTexture.gs_texture_get_dc();
		} 
	}
	public void dc_capture_release_dc() {
		Object generatedCompatibility = this.getCompatibility();
		Object generatedTexture = this.getTexture();
		Object generatedBits = this.getBits();
		Object generatedWidth = this.getWidth();
		if (generatedCompatibility) {
			generatedTexture.gs_texture_set_image(generatedBits, generatedWidth * 4, false);
		} else {
				generatedTexture.gs_texture_release_dc();
		} 
	}
	public void dc_capture_capture(Object window) {
		HDC hdc_target = new HDC();
		HDC hdc = new HDC();
		Object generatedCapture_cursor = this.getCapture_cursor();
		tagCURSORINFO generatedCi = this.getCi();
		if (generatedCapture_cursor) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedCi, 0, /*Error: Unsupported expression*/);
			generatedCi.setCbSize(/*Error: Unsupported expression*/);
			this.setCursor_captured(/*Error: Function owner not recognized*/GetCursorInfo(generatedCi));
		} 
		hdc = capture.dc_capture_get_dc();
		if (!hdc) {
			ModernizedCProgram.blog(LOG_WARNING, "[capture_screen] Failed to get texture DC");
			return /*Error: Unsupported expression*/;
		} 
		hdc_target = /*Error: Function owner not recognized*/GetDC(window);
		Object generatedWidth = this.getWidth();
		Object generatedHeight = this.getHeight();
		int generatedX = this.getX();
		int generatedY = this.getY();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/BitBlt(hdc, 0, 0, generatedWidth, generatedHeight, hdc_target, generatedX, generatedY, -1024);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseDC(((Object)0), hdc_target);
		Object generatedCursor_captured = this.getCursor_captured();
		Object generatedCursor_hidden = this.getCursor_hidden();
		if (generatedCursor_captured && !generatedCursor_hidden) {
			capture.draw_cursor(hdc, window);
		} 
		capture.dc_capture_release_dc();
		this.setTexture_written(true);
	}
	public void draw_texture(Object effect) {
		Object generatedTexture = this.getTexture();
		 texture = generatedTexture;
		gs_effect_technique gs_effect_technique = new gs_effect_technique();
		 tech = gs_effect_technique.gs_effect_get_technique(effect, "Draw");
		gs_effect_param gs_effect_param = new gs_effect_param();
		 image = gs_effect_param.gs_effect_get_param_by_name(effect, "image");
		size_t passes = new size_t();
		ModernizedCProgram.gs_effect_set_texture(image, texture);
		passes = tech.gs_technique_begin();
		Object generatedCompatibility = this.getCompatibility();
		for (size_t i = 0;
		 i < passes; i++) {
			if (tech.gs_technique_begin_pass(i)) {
				if (generatedCompatibility) {
					texture.gs_draw_sprite(GS_FLIP_V, 0, 0);
				} else {
						texture.gs_draw_sprite(0, 0, 0);
				} 
				tech.gs_technique_end_pass();
			} 
		}
		tech.gs_technique_end();
	}
	public void dc_capture_render(Object effect) {
		Object generatedValid = this.getValid();
		Object generatedTexture_written = this.getTexture_written();
		if (generatedValid && generatedTexture_written) {
			capture.draw_texture(effect);
		} 
	}
	public Object getTexture() {
		return texture;
	}
	public void setTexture(Object newTexture) {
		texture = newTexture;
	}
	public Object getTexture_written() {
		return texture_written;
	}
	public void setTexture_written(Object newTexture_written) {
		texture_written = newTexture_written;
	}
	public int getX() {
		return x;
	}
	public void setX(int newX) {
		x = newX;
	}
	public int getY() {
		return y;
	}
	public void setY(int newY) {
		y = newY;
	}
	public Object getWidth() {
		return width;
	}
	public void setWidth(Object newWidth) {
		width = newWidth;
	}
	public Object getHeight() {
		return height;
	}
	public void setHeight(Object newHeight) {
		height = newHeight;
	}
	public Object getCompatibility() {
		return compatibility;
	}
	public void setCompatibility(Object newCompatibility) {
		compatibility = newCompatibility;
	}
	public Object getHdc() {
		return hdc;
	}
	public void setHdc(Object newHdc) {
		hdc = newHdc;
	}
	public Object getBmp() {
		return bmp;
	}
	public void setBmp(Object newBmp) {
		bmp = newBmp;
	}
	public Object getOld_bmp() {
		return old_bmp;
	}
	public void setOld_bmp(Object newOld_bmp) {
		old_bmp = newOld_bmp;
	}
	public Object getBits() {
		return bits;
	}
	public void setBits(Object newBits) {
		bits = newBits;
	}
	public Object getCapture_cursor() {
		return capture_cursor;
	}
	public void setCapture_cursor(Object newCapture_cursor) {
		capture_cursor = newCapture_cursor;
	}
	public Object getCursor_captured() {
		return cursor_captured;
	}
	public void setCursor_captured(Object newCursor_captured) {
		cursor_captured = newCursor_captured;
	}
	public Object getCursor_hidden() {
		return cursor_hidden;
	}
	public void setCursor_hidden(Object newCursor_hidden) {
		cursor_hidden = newCursor_hidden;
	}
	public tagCURSORINFO getCi() {
		return ci;
	}
	public void setCi(tagCURSORINFO newCi) {
		ci = newCi;
	}
	public Object getValid() {
		return valid;
	}
	public void setValid(Object newValid) {
		valid = newValid;
	}
}
