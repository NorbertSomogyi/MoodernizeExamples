package application;

public class gs_monitor_info {
	private int rotation_degrees;
	private long x;
	private long y;
	private long cx;
	private long cy;
	
	public gs_monitor_info(int rotation_degrees, long x, long y, long cx, long cy) {
		setRotation_degrees(rotation_degrees);
		setX(x);
		setY(y);
		setCx(cx);
		setCy(cy);
	}
	public gs_monitor_info() {
	}
	
	public Object gs_get_duplicator_monitor_info(int monitor_idx) {
		if (!(ModernizedCProgram.gs_valid("gs_get_duplicator_monitor_info") && ModernizedCProgram.gs_obj_valid(monitor_info, "gs_get_duplicator_monitor_info", "monitor_info"))) {
			return false;
		} 
		if (!thread_graphics.getExports().getDevice_get_duplicator_monitor_info()) {
			return false;
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(thread_graphics.getDevice(), monitor_idx, monitor_info);
	}
	public int getRotation_degrees() {
		return rotation_degrees;
	}
	public void setRotation_degrees(int newRotation_degrees) {
		rotation_degrees = newRotation_degrees;
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
	public long getCx() {
		return cx;
	}
	public void setCx(long newCx) {
		cx = newCx;
	}
	public long getCy() {
		return cy;
	}
	public void setCy(long newCy) {
		cy = newCy;
	}
}
