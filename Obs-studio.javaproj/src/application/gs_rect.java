package application;

public class gs_rect {
	private int x;
	private int y;
	private int cx;
	private int cy;
	
	public gs_rect(int x, int y, int cx, int cy) {
		setX(x);
		setY(y);
		setCx(cx);
		setCy(cy);
	}
	public gs_rect() {
	}
	
	public void gs_get_viewport() {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_get_viewport") && ModernizedCProgram.gs_obj_valid(rect, "gs_get_viewport", "rect"))) {
			return ;
		} 
		gs_device generatedDevice = graphics.getDevice();
		.UNRECOGNIZEDFUNCTIONNAME(generatedDevice, rect);
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
	public int getCx() {
		return cx;
	}
	public void setCx(int newCx) {
		cx = newCx;
	}
	public int getCy() {
		return cy;
	}
	public void setCy(int newCy) {
		cy = newCy;
	}
}
