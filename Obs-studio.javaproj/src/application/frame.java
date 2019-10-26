package application;

public class frame {
	private Object render;
	private Object ts;
	
	public frame(Object render, Object ts) {
		setRender(render);
		setTs(ts);
	}
	public frame() {
	}
	
	public Object getRender() {
		return render;
	}
	public void setRender(Object newRender) {
		render = newRender;
	}
	public Object getTs() {
		return ts;
	}
	public void setTs(Object newTs) {
		ts = newTs;
	}
}
