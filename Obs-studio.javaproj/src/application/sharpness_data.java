package application;

public class sharpness_data {
	private obs_source context;
	private Object effect;
	private Object sharpness_param;
	private Object texture_width;
	private Object texture_height;
	private double sharpness;
	private double texwidth;
	private double texheight;
	
	public sharpness_data(obs_source context, Object effect, Object sharpness_param, Object texture_width, Object texture_height, double sharpness, double texwidth, double texheight) {
		setContext(context);
		setEffect(effect);
		setSharpness_param(sharpness_param);
		setTexture_width(texture_width);
		setTexture_height(texture_height);
		setSharpness(sharpness);
		setTexwidth(texwidth);
		setTexheight(texheight);
	}
	public sharpness_data() {
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
	public Object getSharpness_param() {
		return sharpness_param;
	}
	public void setSharpness_param(Object newSharpness_param) {
		sharpness_param = newSharpness_param;
	}
	public Object getTexture_width() {
		return texture_width;
	}
	public void setTexture_width(Object newTexture_width) {
		texture_width = newTexture_width;
	}
	public Object getTexture_height() {
		return texture_height;
	}
	public void setTexture_height(Object newTexture_height) {
		texture_height = newTexture_height;
	}
	public double getSharpness() {
		return sharpness;
	}
	public void setSharpness(double newSharpness) {
		sharpness = newSharpness;
	}
	public double getTexwidth() {
		return texwidth;
	}
	public void setTexwidth(double newTexwidth) {
		texwidth = newTexwidth;
	}
	public double getTexheight() {
		return texheight;
	}
	public void setTexheight(double newTexheight) {
		texheight = newTexheight;
	}
}
