package application;

public class fade_info {
	private obs_source source;
	private Object effect;
	private Object a_param;
	private Object b_param;
	private Object fade_param;
	
	public fade_info(obs_source source, Object effect, Object a_param, Object b_param, Object fade_param) {
		setSource(source);
		setEffect(effect);
		setA_param(a_param);
		setB_param(b_param);
		setFade_param(fade_param);
	}
	public fade_info() {
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
	public Object getFade_param() {
		return fade_param;
	}
	public void setFade_param(Object newFade_param) {
		fade_param = newFade_param;
	}
}
