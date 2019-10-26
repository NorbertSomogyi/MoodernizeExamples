package application;

public class stinger_info {
	private obs_source source;
	private obs_source media_source;
	private Object duration_ns;
	private Object duration_frames;
	private Object transition_point_ns;
	private Object transition_point_frame;
	private double transition_point;
	private double transition_a_mul;
	private double transition_b_mul;
	private Object transitioning;
	private Object transition_point_is_frame;
	private int monitoring_type;
	private fade_style fade_style;
	private Object mix_a;
	private Object mix_b;
	
	public stinger_info(obs_source source, obs_source media_source, Object duration_ns, Object duration_frames, Object transition_point_ns, Object transition_point_frame, double transition_point, double transition_a_mul, double transition_b_mul, Object transitioning, Object transition_point_is_frame, int monitoring_type, fade_style fade_style, Object mix_a, Object mix_b) {
		setSource(source);
		setMedia_source(media_source);
		setDuration_ns(duration_ns);
		setDuration_frames(duration_frames);
		setTransition_point_ns(transition_point_ns);
		setTransition_point_frame(transition_point_frame);
		setTransition_point(transition_point);
		setTransition_a_mul(transition_a_mul);
		setTransition_b_mul(transition_b_mul);
		setTransitioning(transitioning);
		setTransition_point_is_frame(transition_point_is_frame);
		setMonitoring_type(monitoring_type);
		setFade_style(fade_style);
		setMix_a(mix_a);
		setMix_b(mix_b);
	}
	public stinger_info() {
	}
	
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public obs_source getMedia_source() {
		return media_source;
	}
	public void setMedia_source(obs_source newMedia_source) {
		media_source = newMedia_source;
	}
	public Object getDuration_ns() {
		return duration_ns;
	}
	public void setDuration_ns(Object newDuration_ns) {
		duration_ns = newDuration_ns;
	}
	public Object getDuration_frames() {
		return duration_frames;
	}
	public void setDuration_frames(Object newDuration_frames) {
		duration_frames = newDuration_frames;
	}
	public Object getTransition_point_ns() {
		return transition_point_ns;
	}
	public void setTransition_point_ns(Object newTransition_point_ns) {
		transition_point_ns = newTransition_point_ns;
	}
	public Object getTransition_point_frame() {
		return transition_point_frame;
	}
	public void setTransition_point_frame(Object newTransition_point_frame) {
		transition_point_frame = newTransition_point_frame;
	}
	public double getTransition_point() {
		return transition_point;
	}
	public void setTransition_point(double newTransition_point) {
		transition_point = newTransition_point;
	}
	public double getTransition_a_mul() {
		return transition_a_mul;
	}
	public void setTransition_a_mul(double newTransition_a_mul) {
		transition_a_mul = newTransition_a_mul;
	}
	public double getTransition_b_mul() {
		return transition_b_mul;
	}
	public void setTransition_b_mul(double newTransition_b_mul) {
		transition_b_mul = newTransition_b_mul;
	}
	public Object getTransitioning() {
		return transitioning;
	}
	public void setTransitioning(Object newTransitioning) {
		transitioning = newTransitioning;
	}
	public Object getTransition_point_is_frame() {
		return transition_point_is_frame;
	}
	public void setTransition_point_is_frame(Object newTransition_point_is_frame) {
		transition_point_is_frame = newTransition_point_is_frame;
	}
	public int getMonitoring_type() {
		return monitoring_type;
	}
	public void setMonitoring_type(int newMonitoring_type) {
		monitoring_type = newMonitoring_type;
	}
	public fade_style getFade_style() {
		return fade_style;
	}
	public void setFade_style(fade_style newFade_style) {
		fade_style = newFade_style;
	}
	public Object getMix_a() {
		return mix_a;
	}
	public void setMix_a(Object newMix_a) {
		mix_a = newMix_a;
	}
	public Object getMix_b() {
		return mix_b;
	}
	public void setMix_b(Object newMix_b) {
		mix_b = newMix_b;
	}
}
