package application;

/* clang-format off */
/* clang-format on */
public class duplicator_capture {
	private obs_source source;
	private int monitor;
	private Object capture_cursor;
	private Object showing;
	private long x;
	private long y;
	private int rot;
	private Object width;
	private Object height;
	private Object duplicator;
	private double reset_timeout;
	private cursor_data cursor_data;
	
	public duplicator_capture(obs_source source, int monitor, Object capture_cursor, Object showing, long x, long y, int rot, Object width, Object height, Object duplicator, double reset_timeout, cursor_data cursor_data) {
		setSource(source);
		setMonitor(monitor);
		setCapture_cursor(capture_cursor);
		setShowing(showing);
		setX(x);
		setY(y);
		setRot(rot);
		setWidth(width);
		setHeight(height);
		setDuplicator(duplicator);
		setReset_timeout(reset_timeout);
		setCursor_data(cursor_data);
	}
	public duplicator_capture() {
	}
	
	public void reset_capture_data() {
		gs_monitor_info monitor_info = new gs_monitor_info(0);
		Object generatedDuplicator = this.getDuplicator();
		gs_texture gs_texture = new gs_texture();
		 texture = gs_texture.gs_duplicator_get_texture(generatedDuplicator);
		int generatedMonitor = this.getMonitor();
		monitor_info.gs_get_duplicator_monitor_info(generatedMonitor);
		this.setWidth(ModernizedCProgram.gs_texture_get_width(texture));
		this.setHeight(ModernizedCProgram.gs_texture_get_height(texture));
		Object generatedGs_monitor_info = monitor_info.getGs_monitor_info();
		this.setX(generatedGs_monitor_info);
		this.setY(generatedGs_monitor_info);
		this.setRot(generatedGs_monitor_info);
	}
	public void free_capture_data() {
		Object generatedDuplicator = this.getDuplicator();
		generatedDuplicator.gs_duplicator_destroy();
		cursor_data generatedCursor_data = this.getCursor_data();
		generatedCursor_data.cursor_data_free();
		this.setDuplicator(((Object)0));
		this.setWidth(0);
		this.setHeight(0);
		this.setX(0);
		this.setY(0);
		this.setRot(0);
		this.setReset_timeout(0.0);
	}
	public void draw_cursor() {
		cursor_data generatedCursor_data = this.getCursor_data();
		long generatedX = this.getX();
		long generatedY = this.getY();
		int generatedRot = this.getRot();
		Object generatedWidth = this.getWidth();
		Object generatedHeight = this.getHeight();
		generatedCursor_data.cursor_draw(-generatedX, -generatedY, 1.0, 1.0, generatedRot % 180 == 0 ? generatedWidth : generatedHeight, generatedRot % 180 == 0 ? generatedHeight : generatedWidth);
		HICON icon = new HICON();
		ICONINFO ii = new ICONINFO();
		tagCURSORINFO generatedCi = this.getCi();
		CURSORINFO ci = generatedCi;
		int generatedX = this.getX();
		int generatedY = this.getY();
		POINT win_pos = new POINT(generatedX, generatedY);
		Object generatedFlags = generatedCi.getFlags();
		if (!(generatedFlags & -1024)) {
			return ;
		} 
		Object generatedHCursor = generatedCi.getHCursor();
		icon = .CopyIcon(generatedHCursor);
		if (!icon) {
			return ;
		} 
		Object generatedXHotspot = ii.getXHotspot();
		Object generatedYHotspot = ii.getYHotspot();
		Object generatedHbmColor = ii.getHbmColor();
		Object generatedHbmMask = ii.getHbmMask();
		if (.GetIconInfo(icon, ii)) {
			POINT pos = new POINT();
			if (window) {
				.ClientToScreen(window, win_pos);
			} 
			pos.setX(generatedX - (int)generatedXHotspot - generatedX);
			pos.setY(generatedY - (int)generatedYHotspot - generatedY);
			.DrawIconEx(hdc, generatedX, generatedY, icon, 0, 0, 0, ((Object)0), 3);
			.DeleteObject(generatedHbmColor);
			.DeleteObject(generatedHbmMask);
		} 
		.DestroyIcon(icon);
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public int getMonitor() {
		return monitor;
	}
	public void setMonitor(int newMonitor) {
		monitor = newMonitor;
	}
	public Object getCapture_cursor() {
		return capture_cursor;
	}
	public void setCapture_cursor(Object newCapture_cursor) {
		capture_cursor = newCapture_cursor;
	}
	public Object getShowing() {
		return showing;
	}
	public void setShowing(Object newShowing) {
		showing = newShowing;
	}
	public long getX() {
		return x;
	}
	public void setX(long newX) {
		x = newX;
	}
	public long getY() {
		return y;
	}
	public void setY(long newY) {
		y = newY;
	}
	public int getRot() {
		return rot;
	}
	public void setRot(int newRot) {
		rot = newRot;
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
	public Object getDuplicator() {
		return duplicator;
	}
	public void setDuplicator(Object newDuplicator) {
		duplicator = newDuplicator;
	}
	public double getReset_timeout() {
		return reset_timeout;
	}
	public void setReset_timeout(double newReset_timeout) {
		reset_timeout = newReset_timeout;
	}
	public cursor_data getCursor_data() {
		return cursor_data;
	}
	public void setCursor_data(cursor_data newCursor_data) {
		cursor_data = newCursor_data;
	}
}
