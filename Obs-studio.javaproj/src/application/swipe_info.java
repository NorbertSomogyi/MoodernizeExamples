package application;

public class swipe_info {
	private obs_source source;
	private Object effect;
	private Object a_param;
	private Object b_param;
	private Object swipe_param;
	private vec2 dir;
	private Object swipe_in;
	
	public swipe_info(obs_source source, Object effect, Object a_param, Object b_param, Object swipe_param, vec2 dir, Object swipe_in) {
		setSource(source);
		setEffect(effect);
		setA_param(a_param);
		setB_param(b_param);
		setSwipe_param(swipe_param);
		setDir(dir);
		setSwipe_in(swipe_in);
	}
	public swipe_info() {
	}
	
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Object getEffect() {
		return effect;
	}
	public void setEffect(Object newEffect) {
		effect = newEffect;
	}
	public Object getA_param() {
		return a_param;
	}
	public void setA_param(Object newA_param) {
		a_param = newA_param;
	}
	public Object getB_param() {
		return b_param;
	}
	public void setB_param(Object newB_param) {
		b_param = newB_param;
	}
	public Object getSwipe_param() {
		return swipe_param;
	}
	public void setSwipe_param(Object newSwipe_param) {
		swipe_param = newSwipe_param;
	}
	public vec2 getDir() {
		return dir;
	}
	public void setDir(vec2 newDir) {
		dir = newDir;
	}
	public Object getSwipe_in() {
		return swipe_in;
	}
	public void setSwipe_in(Object newSwipe_in) {
		swipe_in = newSwipe_in;
	}
}
