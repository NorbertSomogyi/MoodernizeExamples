package application;

/* clang-format off */
/* clang-format on */
public class mask_filter_data {
	private Object last_time;
	private obs_source context;
	private Object effect;
	private Object target;
	private Object image;
	private vec4 color;
	private Object lock_aspect;
	
	public mask_filter_data(Object last_time, obs_source context, Object effect, Object target, Object image, vec4 color, Object lock_aspect) {
		setLast_time(last_time);
		setContext(context);
		setEffect(effect);
		setTarget(target);
		setImage(image);
		setColor(color);
		setLock_aspect(lock_aspect);
	}
	public mask_filter_data() {
	}
	
	public Object getLast_time() {
		return last_time;
	}
	public void setLast_time(Object newLast_time) {
		last_time = newLast_time;
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
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object newTarget) {
		target = newTarget;
	}
	public Object getImage() {
		return image;
	}
	public void setImage(Object newImage) {
		image = newImage;
	}
	public vec4 getColor() {
		return color;
	}
	public void setColor(vec4 newColor) {
		color = newColor;
	}
	public Object getLock_aspect() {
		return lock_aspect;
	}
	public void setLock_aspect(Object newLock_aspect) {
		lock_aspect = newLock_aspect;
	}
}
