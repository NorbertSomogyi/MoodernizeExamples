package application;

public class fade_to_color_info {
	private obs_source source;
	private Object effect;
	private Object ep_tex;
	private Object ep_swp;
	private Object ep_color;
	private vec4 color;
	private double switch_point;
	
	public fade_to_color_info(obs_source source, Object effect, Object ep_tex, Object ep_swp, Object ep_color, vec4 color, double switch_point) {
		setSource(source);
		setEffect(effect);
		setEp_tex(ep_tex);
		setEp_swp(ep_swp);
		setEp_color(ep_color);
		setColor(color);
		setSwitch_point(switch_point);
	}
	public fade_to_color_info() {
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
	public Object getEp_tex() {
		return ep_tex;
	}
	public void setEp_tex(Object newEp_tex) {
		ep_tex = newEp_tex;
	}
	public Object getEp_swp() {
		return ep_swp;
	}
	public void setEp_swp(Object newEp_swp) {
		ep_swp = newEp_swp;
	}
	public Object getEp_color() {
		return ep_color;
	}
	public void setEp_color(Object newEp_color) {
		ep_color = newEp_color;
	}
	public vec4 getColor() {
		return color;
	}
	public void setColor(vec4 newColor) {
		color = newColor;
	}
	public double getSwitch_point() {
		return switch_point;
	}
	public void setSwitch_point(double newSwitch_point) {
		switch_point = newSwitch_point;
	}
}
