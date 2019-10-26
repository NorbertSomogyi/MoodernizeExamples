package application;

/* clang-format off */
/* clang-format on */
public class luma_key_filter_data {
	private obs_source context;
	private Object effect;
	private Object luma_max_param;
	private Object luma_min_param;
	private Object luma_max_smooth_param;
	private Object luma_min_smooth_param;
	private double luma_max;
	private double luma_min;
	private double luma_max_smooth;
	private double luma_min_smooth;
	
	public luma_key_filter_data(obs_source context, Object effect, Object luma_max_param, Object luma_min_param, Object luma_max_smooth_param, Object luma_min_smooth_param, double luma_max, double luma_min, double luma_max_smooth, double luma_min_smooth) {
		setContext(context);
		setEffect(effect);
		setLuma_max_param(luma_max_param);
		setLuma_min_param(luma_min_param);
		setLuma_max_smooth_param(luma_max_smooth_param);
		setLuma_min_smooth_param(luma_min_smooth_param);
		setLuma_max(luma_max);
		setLuma_min(luma_min);
		setLuma_max_smooth(luma_max_smooth);
		setLuma_min_smooth(luma_min_smooth);
	}
	public luma_key_filter_data() {
	}
	
	public obs_source getContext() {
		return context;
	}
	public void setContext(obs_source newContext) {
		context = newContext;
	}
	public Object getEffect() {
		return effect;
	}
	public void setEffect(Object newEffect) {
		effect = newEffect;
	}
	public Object getLuma_max_param() {
		return luma_max_param;
	}
	public void setLuma_max_param(Object newLuma_max_param) {
		luma_max_param = newLuma_max_param;
	}
	public Object getLuma_min_param() {
		return luma_min_param;
	}
	public void setLuma_min_param(Object newLuma_min_param) {
		luma_min_param = newLuma_min_param;
	}
	public Object getLuma_max_smooth_param() {
		return luma_max_smooth_param;
	}
	public void setLuma_max_smooth_param(Object newLuma_max_smooth_param) {
		luma_max_smooth_param = newLuma_max_smooth_param;
	}
	public Object getLuma_min_smooth_param() {
		return luma_min_smooth_param;
	}
	public void setLuma_min_smooth_param(Object newLuma_min_smooth_param) {
		luma_min_smooth_param = newLuma_min_smooth_param;
	}
	public double getLuma_max() {
		return luma_max;
	}
	public void setLuma_max(double newLuma_max) {
		luma_max = newLuma_max;
	}
	public double getLuma_min() {
		return luma_min;
	}
	public void setLuma_min(double newLuma_min) {
		luma_min = newLuma_min;
	}
	public double getLuma_max_smooth() {
		return luma_max_smooth;
	}
	public void setLuma_max_smooth(double newLuma_max_smooth) {
		luma_max_smooth = newLuma_max_smooth;
	}
	public double getLuma_min_smooth() {
		return luma_min_smooth;
	}
	public void setLuma_min_smooth(double newLuma_min_smooth) {
		luma_min_smooth = newLuma_min_smooth;
	}
}
