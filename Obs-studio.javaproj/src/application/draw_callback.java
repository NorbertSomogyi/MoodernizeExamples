package application;

public class draw_callback {
	private Object draw;
	private Object param;
	
	public draw_callback(Object draw, Object param) {
		setDraw(draw);
		setParam(param);
	}
	public draw_callback() {
	}
	
	public Object getDraw() {
		return draw;
	}
	public void setDraw(Object newDraw) {
		draw = newDraw;
	}
	public Object getParam() {
		return param;
	}
	public void setParam(Object newParam) {
		param = newParam;
	}
}
