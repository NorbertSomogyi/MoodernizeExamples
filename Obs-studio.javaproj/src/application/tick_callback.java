package application;

public class tick_callback {
	private Object tick;
	private Object param;
	
	public tick_callback(Object tick, Object param) {
		setTick(tick);
		setParam(param);
	}
	public tick_callback() {
	}
	
	public Object getTick() {
		return tick;
	}
	public void setTick(Object newTick) {
		tick = newTick;
	}
	public Object getParam() {
		return param;
	}
	public void setParam(Object newParam) {
		param = newParam;
	}
}
