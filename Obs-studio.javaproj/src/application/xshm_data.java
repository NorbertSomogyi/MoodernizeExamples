package application;

/*
Copyright (C) 2014 by Leonhard Oelke <leonhard@in-verted.de>

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
public class xshm_data {
	private obs_source source;
	private Object xcb;
	private Object xcb_screen;
	private  xshm;
	private  cursor;
	private Byte server;
	private Object screen_id;
	private Object x_org;
	private Object y_org;
	private Object width;
	private Object height;
	private Object texture;
	private Object show_cursor;
	private Object use_xinerama;
	private Object use_randr;
	private Object advanced;
	
	public xshm_data(obs_source source, Object xcb, Object xcb_screen,  xshm,  cursor, Byte server, Object screen_id, Object x_org, Object y_org, Object width, Object height, Object texture, Object show_cursor, Object use_xinerama, Object use_randr, Object advanced) {
		setSource(source);
		setXcb(xcb);
		setXcb_screen(xcb_screen);
		setXshm(xshm);
		setCursor(cursor);
		setServer(server);
		setScreen_id(screen_id);
		setX_org(x_org);
		setY_org(y_org);
		setWidth(width);
		setHeight(height);
		setTexture(texture);
		setShow_cursor(show_cursor);
		setUse_xinerama(use_xinerama);
		setUse_randr(use_randr);
		setAdvanced(advanced);
	}
	public xshm_data() {
	}
	
	public void xshm_resize_texture() {
		if (ModernizedCProgram.data.getTexture()) {
			ModernizedCProgram.gs_texture_destroy(ModernizedCProgram.data.getTexture());
		} 
		gs_texture gs_texture = new gs_texture();
		ModernizedCProgram.data.setTexture(gs_texture.gs_texture_create(ModernizedCProgram.data.getWidth(), ModernizedCProgram.data.getHeight(), GS_BGRA, 1, ((Object)0), GS_DYNAMIC/**
		 * Check if the xserver supports all the extensions we need
		 */));
	}
	public Object xshm_update_geometry() {
		int_fast32_t old_width = ModernizedCProgram.data.getWidth();
		int_fast32_t old_height = ModernizedCProgram.data.getHeight();
		if (ModernizedCProgram.data.getUse_randr()) {
			if (ModernizedCProgram.randr_screen_geo(ModernizedCProgram.data.getXcb(), ModernizedCProgram.data.getScreen_id(), ModernizedCProgram.data.getX_org(), ModernizedCProgram.data.getY_org(), ModernizedCProgram.data.getWidth(), ModernizedCProgram.data.getHeight(), ModernizedCProgram.data.getXcb_screen()) < 0) {
				return -1;
			} 
		}  else if (ModernizedCProgram.data.getUse_xinerama()) {
			if (ModernizedCProgram.xinerama_screen_geo(ModernizedCProgram.data.getXcb(), ModernizedCProgram.data.getScreen_id(), ModernizedCProgram.data.getX_org(), ModernizedCProgram.data.getY_org(), ModernizedCProgram.data.getWidth(), ModernizedCProgram.data.getHeight()) < 0) {
				return -1;
			} 
			ModernizedCProgram.data.setXcb_screen(ModernizedCProgram.xcb_get_screen(ModernizedCProgram.data.getXcb(), 0));
		} else {
				ModernizedCProgram.data.setX_org(0);
				ModernizedCProgram.data.setY_org(0);
				if (ModernizedCProgram.x11_screen_geo(ModernizedCProgram.data.getXcb(), ModernizedCProgram.data.getScreen_id(), ModernizedCProgram.data.getWidth(), ModernizedCProgram.data.getHeight()) < 0) {
					return -1;
				} 
				ModernizedCProgram.data.setXcb_screen(ModernizedCProgram.xcb_get_screen(ModernizedCProgram.data.getXcb(), ModernizedCProgram.data.getScreen_id()));
		} 
		if (!ModernizedCProgram.data.getWidth() || !ModernizedCProgram.data.getHeight()) {
			ModernizedCProgram.blog(LOG_ERROR, "xshm-input: Failed to get geometry");
			return -1;
		} 
		ModernizedCProgram.blog(LOG_INFO, "xshm-input: Geometry %dx%d @ %d,%d", ModernizedCProgram.data.getWidth(), ModernizedCProgram.data.getHeight(), ModernizedCProgram.data.getX_org(), ModernizedCProgram.data.getY_org());
		if (old_width == ModernizedCProgram.data.getWidth() && old_height == ModernizedCProgram.data.getHeight()) {
			return 0;
		} 
		return 1/**
		 * Returns the name of the plugin
		 */;
	}
	public void xshm_capture_stop() {
		ModernizedCProgram.obs_enter_graphics();
		if (ModernizedCProgram.data.getTexture()) {
			ModernizedCProgram.gs_texture_destroy(ModernizedCProgram.data.getTexture());
			ModernizedCProgram.data.setTexture(((Object)0));
		} 
		if (ModernizedCProgram.data.getCursor()) {
			ModernizedCProgram.data.getCursor().xcb_xcursor_destroy();
			ModernizedCProgram.data.setCursor(((Object)0));
		} 
		ModernizedCProgram.obs_leave_graphics();
		if (ModernizedCProgram.data.getXshm()) {
			ModernizedCProgram.data.getXshm().xshm_xcb_detach();
			ModernizedCProgram.data.setXshm(((Object)0));
		} 
		if (ModernizedCProgram.data.getXcb()) {
			.xcb_disconnect(ModernizedCProgram.data.getXcb());
			ModernizedCProgram.data.setXcb(((Object)0));
		} 
		if (ModernizedCProgram.data.getServer()) {
			ModernizedCProgram.bfree(ModernizedCProgram.data.getServer());
			ModernizedCProgram.data.setServer(((Object)0));
		} 
	}
	/**
	 * Start the capture
	 */
	public void xshm_capture_start() {
		byte server = (ModernizedCProgram.data.getAdvanced() && ModernizedCProgram.data.getServer()) ? ModernizedCProgram.data.getServer() : ((Object)0);
		ModernizedCProgram.data.setXcb(.xcb_connect(server, ((Object)0)));
		if (!ModernizedCProgram.data.getXcb() || .xcb_connection_has_error(ModernizedCProgram.data.getXcb())) {
			ModernizedCProgram.blog(LOG_ERROR, "xshm-input: Unable to open X display !");
			;
		} 
		if (!ModernizedCProgram.xshm_check_extensions(ModernizedCProgram.data.getXcb())) {
			;
		} 
		ModernizedCProgram.data.setUse_randr(ModernizedCProgram.randr_is_active(ModernizedCProgram.data.getXcb()) ? true : false);
		ModernizedCProgram.data.setUse_xinerama(ModernizedCProgram.xinerama_is_active(ModernizedCProgram.data.getXcb()) ? true : false);
		if (ModernizedCProgram.data.xshm_update_geometry() < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "xshm-input: failed to update geometry !");
			;
		} 
		ModernizedCProgram.data.setXshm(ModernizedCProgram.xshm_xcb_attach(ModernizedCProgram.data.getXcb(), ModernizedCProgram.data.getWidth(), ModernizedCProgram.data.getHeight()));
		if (!ModernizedCProgram.data.getXshm()) {
			ModernizedCProgram.blog(LOG_ERROR, "xshm-input: failed to attach shm !");
			;
		} 
		ModernizedCProgram.data.setCursor(ModernizedCProgram.xcb_xcursor_init(ModernizedCProgram.data.getXcb()));
		ModernizedCProgram.data.getCursor().xcb_xcursor_offset(ModernizedCProgram.data.getX_org(), ModernizedCProgram.data.getY_org());
		ModernizedCProgram.obs_enter_graphics();
		ModernizedCProgram.data.xshm_resize_texture();
		ModernizedCProgram.obs_leave_graphics();
		return ;
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Object getXcb() {
		return xcb;
	}
	public void setXcb(Object newXcb) {
		xcb = newXcb;
	}
	public Object getXcb_screen() {
		return xcb_screen;
	}
	public void setXcb_screen(Object newXcb_screen) {
		xcb_screen = newXcb_screen;
	}
	public  getXshm() {
		return xshm;
	}
	public void setXshm( newXshm) {
		xshm = newXshm;
	}
	public  getCursor() {
		return cursor;
	}
	public void setCursor( newCursor) {
		cursor = newCursor;
	}
	public Byte getServer() {
		return server;
	}
	public void setServer(Byte newServer) {
		server = newServer;
	}
	public Object getScreen_id() {
		return screen_id;
	}
	public void setScreen_id(Object newScreen_id) {
		screen_id = newScreen_id;
	}
	public Object getX_org() {
		return x_org;
	}
	public void setX_org(Object newX_org) {
		x_org = newX_org;
	}
	public Object getY_org() {
		return y_org;
	}
	public void setY_org(Object newY_org) {
		y_org = newY_org;
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
	public Object getTexture() {
		return texture;
	}
	public void setTexture(Object newTexture) {
		texture = newTexture;
	}
	public Object getShow_cursor() {
		return show_cursor;
	}
	public void setShow_cursor(Object newShow_cursor) {
		show_cursor = newShow_cursor;
	}
	public Object getUse_xinerama() {
		return use_xinerama;
	}
	public void setUse_xinerama(Object newUse_xinerama) {
		use_xinerama = newUse_xinerama;
	}
	public Object getUse_randr() {
		return use_randr;
	}
	public void setUse_randr(Object newUse_randr) {
		use_randr = newUse_randr;
	}
	public Object getAdvanced() {
		return advanced;
	}
	public void setAdvanced(Object newAdvanced) {
		advanced = newAdvanced;
	}
}
