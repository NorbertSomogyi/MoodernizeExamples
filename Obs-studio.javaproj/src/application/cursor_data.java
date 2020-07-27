package application;

public class cursor_data {
	private Object texture;
	private Object current_cursor;
	private Object cursor_pos;
	private long x_hotspot;
	private long y_hotspot;
	private Object visible;
	private Object last_cx;
	private Object last_cy;
	private Object ;
	
	public cursor_data(Object texture, Object current_cursor, Object cursor_pos, long x_hotspot, long y_hotspot, Object visible, Object last_cx, Object last_cy, Object ) {
		setTexture(texture);
		setCurrent_cursor(current_cursor);
		setCursor_pos(cursor_pos);
		setX_hotspot(x_hotspot);
		setY_hotspot(y_hotspot);
		setVisible(visible);
		setLast_cx(last_cx);
		setLast_cy(last_cy);
		set();
	}
	public cursor_data() {
	}
	
	public Object get_cached_texture(Object cx, Object cy) {
		cached_cursor cc = new cached_cursor();
		Object generatedCx = pcc.getCx();
		Object generatedCy = pcc.getCy();
		Object generatedTexture = pcc.getTexture();
		for (size_t i = 0;
		 i < ModernizedCProgram.data.getCached_textures().getNum(); i++) {
			cached_cursor pcc = ModernizedCProgram.data.getCached_textures().getArray()[i];
			if (generatedCx == cx && generatedCy == cy) {
				return generatedTexture;
			} 
		}
		gs_texture gs_texture = new gs_texture();
		cc.setTexture(gs_texture.gs_texture_create(cx, cy, GS_BGRA, 1, ((Object)0), GS_DYNAMIC));
		cc.setCx(cx);
		cc.setCy(cy);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(ModernizedCProgram.data.getCached_textures(), cc);
		return generatedTexture;
	}
	public Object cursor_capture_icon(Object icon) {
		uint8_t bitmap = new uint8_t();
		uint32_t height = new uint32_t();
		uint32_t width = new uint32_t();
		ICONINFO ii = new ICONINFO();
		if (!icon) {
			return false;
		} 
		if (!/*Error: Function owner not recognized*/GetIconInfo(icon, ii)) {
			return false;
		} 
		bitmap = ii.cursor_capture_icon_bitmap(width, height);
		Object generatedXHotspot = ii.getXHotspot();
		Object generatedYHotspot = ii.getYHotspot();
		if (bitmap) {
			if (ModernizedCProgram.data.getLast_cx() != width || ModernizedCProgram.data.getLast_cy() != height) {
				ModernizedCProgram.data.setTexture(ModernizedCProgram.data.get_cached_texture(width, height));
				ModernizedCProgram.data.setLast_cx(width);
				ModernizedCProgram.data.setLast_cy(height);
			} 
			ModernizedCProgram.data.getTexture().gs_texture_set_image(bitmap, width * 4, false);
			ModernizedCProgram.bfree(bitmap);
			ModernizedCProgram.data.setX_hotspot(generatedXHotspot);
			ModernizedCProgram.data.setY_hotspot(generatedYHotspot);
		} 
		Object generatedHbmColor = ii.getHbmColor();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DeleteObject(generatedHbmColor);
		Object generatedHbmMask = ii.getHbmMask();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DeleteObject(generatedHbmMask);
		return !!ModernizedCProgram.data.getTexture();
	}
	public void cursor_capture() {
		CURSORINFO ci = new CURSORINFO(0);
		HICON icon = new HICON();
		ci.setCbSize(/*Error: sizeof expression not supported yet*/);
		if (!/*Error: Function owner not recognized*/GetCursorInfo(ci)) {
			ModernizedCProgram.data.setVisible(false);
			return /*Error: Unsupported expression*/;
		} 
		Object generatedPtScreenPos = ci.getPtScreenPos();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.data.getCursor_pos(), generatedPtScreenPos, /*Error: sizeof expression not supported yet*/);
		Object generatedHCursor = ci.getHCursor();
		if (ModernizedCProgram.data.getCurrent_cursor() == generatedHCursor) {
			return /*Error: Unsupported expression*/;
		} 
		icon = /*Error: Function owner not recognized*/CopyIcon(generatedHCursor);
		ModernizedCProgram.data.setVisible(ModernizedCProgram.data.cursor_capture_icon(icon));
		ModernizedCProgram.data.setCurrent_cursor(generatedHCursor);
		Object generatedFlags = ci.getFlags();
		if ((generatedFlags & -1024) == 0) {
			ModernizedCProgram.data.setVisible(false);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DestroyIcon(icon);
	}
	public void cursor_draw(long x_offset, long y_offset, double x_scale, double y_scale, long width, long height) {
		long x = ModernizedCProgram.data.getCursor_pos().getX() + x_offset;
		long y = ModernizedCProgram.data.getCursor_pos().getY() + y_offset;
		long x_draw = x - ModernizedCProgram.data.getX_hotspot();
		long y_draw = y - ModernizedCProgram.data.getY_hotspot();
		if (x < 0 || x > width || y < 0 || y > height) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.data.getVisible() && !!ModernizedCProgram.data.getTexture()) {
			ModernizedCProgram.gs_blend_state_push();
			ModernizedCProgram.gs_blend_function(GS_BLEND_SRCALPHA, GS_BLEND_INVSRCALPHA);
			ModernizedCProgram.gs_enable_color(true, true, true, false);
			ModernizedCProgram.gs_matrix_push();
			ModernizedCProgram.gs_matrix_scale3f(x_scale, y_scale, 1.0);
			ModernizedCProgram.obs_source_draw(ModernizedCProgram.data.getTexture(), x_draw, y_draw, 0, 0, false);
			ModernizedCProgram.gs_matrix_pop();
			ModernizedCProgram.gs_enable_color(true, true, true, true);
			ModernizedCProgram.gs_blend_state_pop();
		} 
	}
	public void cursor_data_free() {
		Object generatedTexture = pcc.getTexture();
		for (size_t i = 0;
		 i < ModernizedCProgram.data.getCached_textures().getNum(); i++) {
			cached_cursor pcc = ModernizedCProgram.data.getCached_textures().getArray()[i];
			ModernizedCProgram.gs_texture_destroy(generatedTexture);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(ModernizedCProgram.data.getCached_textures());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.data, 0, /*Error: sizeof expression not supported yet*/);
	}
	public Object getTexture() {
		return texture;
	}
	public void setTexture(Object newTexture) {
		texture = newTexture;
	}
	public Object getCurrent_cursor() {
		return current_cursor;
	}
	public void setCurrent_cursor(Object newCurrent_cursor) {
		current_cursor = newCurrent_cursor;
	}
	public Object getCursor_pos() {
		return cursor_pos;
	}
	public void setCursor_pos(Object newCursor_pos) {
		cursor_pos = newCursor_pos;
	}
	public long getX_hotspot() {
		return x_hotspot;
	}
	public void setX_hotspot(long newX_hotspot) {
		x_hotspot = newX_hotspot;
	}
	public long getY_hotspot() {
		return y_hotspot;
	}
	public void setY_hotspot(long newY_hotspot) {
		y_hotspot = newY_hotspot;
	}
	public Object getVisible() {
		return visible;
	}
	public void setVisible(Object newVisible) {
		visible = newVisible;
	}
	public Object getLast_cx() {
		return last_cx;
	}
	public void setLast_cx(Object newLast_cx) {
		last_cx = newLast_cx;
	}
	public Object getLast_cy() {
		return last_cy;
	}
	public void setLast_cy(Object newLast_cy) {
		last_cy = newLast_cy;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
