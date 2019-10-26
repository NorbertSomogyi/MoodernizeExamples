package application;

public class hook_info {
	private capture_type type;
	private Object window;
	private Object format;
	private Object cx;
	private Object cy;
	private Object base_cx;
	private Object base_cy;
	private Object pitch;
	private Object map_id;
	private Object map_size;
	private boolean flip;
	private Object frame_interval;
	private boolean use_scale;
	private boolean force_shmem;
	private boolean capture_overlay;
	private graphics_offsets offsets;
	
	public hook_info(capture_type type, Object window, Object format, Object cx, Object cy, Object base_cx, Object base_cy, Object pitch, Object map_id, Object map_size, boolean flip, Object frame_interval, boolean use_scale, boolean force_shmem, boolean capture_overlay, graphics_offsets offsets) {
		setType(type);
		setWindow(window);
		setFormat(format);
		setCx(cx);
		setCy(cy);
		setBase_cx(base_cx);
		setBase_cy(base_cy);
		setPitch(pitch);
		setMap_id(map_id);
		setMap_size(map_size);
		setFlip(flip);
		setFrame_interval(frame_interval);
		setUse_scale(use_scale);
		setForce_shmem(force_shmem);
		setCapture_overlay(capture_overlay);
		setOffsets(offsets);
	}
	public hook_info() {
	}
	
	public capture_type getType() {
		return type;
	}
	public void setType(capture_type newType) {
		type = newType;
	}
	public Object getWindow() {
		return window;
	}
	public void setWindow(Object newWindow) {
		window = newWindow;
	}
	public Object getFormat() {
		return format;
	}
	public void setFormat(Object newFormat) {
		format = newFormat;
	}
	public Object getCx() {
		return cx;
	}
	public void setCx(Object newCx) {
		cx = newCx;
	}
	public Object getCy() {
		return cy;
	}
	public void setCy(Object newCy) {
		cy = newCy;
	}
	public Object getBase_cx() {
		return base_cx;
	}
	public void setBase_cx(Object newBase_cx) {
		base_cx = newBase_cx;
	}
	public Object getBase_cy() {
		return base_cy;
	}
	public void setBase_cy(Object newBase_cy) {
		base_cy = newBase_cy;
	}
	public Object getPitch() {
		return pitch;
	}
	public void setPitch(Object newPitch) {
		pitch = newPitch;
	}
	public Object getMap_id() {
		return map_id;
	}
	public void setMap_id(Object newMap_id) {
		map_id = newMap_id;
	}
	public Object getMap_size() {
		return map_size;
	}
	public void setMap_size(Object newMap_size) {
		map_size = newMap_size;
	}
	public boolean getFlip() {
		return flip;
	}
	public void setFlip(boolean newFlip) {
		flip = newFlip;
	}
	public Object getFrame_interval() {
		return frame_interval;
	}
	public void setFrame_interval(Object newFrame_interval) {
		frame_interval = newFrame_interval;
	}
	public boolean getUse_scale() {
		return use_scale;
	}
	public void setUse_scale(boolean newUse_scale) {
		use_scale = newUse_scale;
	}
	public boolean getForce_shmem() {
		return force_shmem;
	}
	public void setForce_shmem(boolean newForce_shmem) {
		force_shmem = newForce_shmem;
	}
	public boolean getCapture_overlay() {
		return capture_overlay;
	}
	public void setCapture_overlay(boolean newCapture_overlay) {
		capture_overlay = newCapture_overlay;
	}
	public graphics_offsets getOffsets() {
		return offsets;
	}
	public void setOffsets(graphics_offsets newOffsets) {
		offsets = newOffsets;
	}
}
/* capture info */
