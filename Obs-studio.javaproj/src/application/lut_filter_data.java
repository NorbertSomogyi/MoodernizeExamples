package application;

/* clang-format off */
/* clang-format on */
public class lut_filter_data {
	private obs_source context;
	private Object effect;
	private Object target;
	private Object image;
	private Byte file;
	private double clut_amount;
	
	public lut_filter_data(obs_source context, Object effect, Object target, Object image, Byte file, double clut_amount) {
		setContext(context);
		setEffect(effect);
		setTarget(target);
		setImage(image);
		setFile(file);
		setClut_amount(clut_amount);
	}
	public lut_filter_data() {
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
	public Byte getFile() {
		return file;
	}
	public void setFile(Byte newFile) {
		file = newFile;
	}
	public double getClut_amount() {
		return clut_amount;
	}
	public void setClut_amount(double newClut_amount) {
		clut_amount = newClut_amount;
	}
}
