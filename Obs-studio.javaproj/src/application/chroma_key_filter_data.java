package application;

/* clang-format off */
/* clang-format on */
public class chroma_key_filter_data {
	private obs_source context;
	private Object effect;
	private Object color_param;
	private Object contrast_param;
	private Object brightness_param;
	private Object gamma_param;
	private Object pixel_size_param;
	private Object chroma_param;
	private Object similarity_param;
	private Object smoothness_param;
	private Object spill_param;
	private vec4 color;
	private double contrast;
	private double brightness;
	private double gamma;
	private vec2 chroma;
	private double similarity;
	private double smoothness;
	private double spill;
	
	public chroma_key_filter_data(obs_source context, Object effect, Object color_param, Object contrast_param, Object brightness_param, Object gamma_param, Object pixel_size_param, Object chroma_param, Object similarity_param, Object smoothness_param, Object spill_param, vec4 color, double contrast, double brightness, double gamma, vec2 chroma, double similarity, double smoothness, double spill) {
		setContext(context);
		setEffect(effect);
		setColor_param(color_param);
		setContrast_param(contrast_param);
		setBrightness_param(brightness_param);
		setGamma_param(gamma_param);
		setPixel_size_param(pixel_size_param);
		setChroma_param(chroma_param);
		setSimilarity_param(similarity_param);
		setSmoothness_param(smoothness_param);
		setSpill_param(spill_param);
		setColor(color);
		setContrast(contrast);
		setBrightness(brightness);
		setGamma(gamma);
		setChroma(chroma);
		setSimilarity(similarity);
		setSmoothness(smoothness);
		setSpill(spill);
	}
	public chroma_key_filter_data() {
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
	public Object getColor_param() {
		return color_param;
	}
	public void setColor_param(Object newColor_param) {
		color_param = newColor_param;
	}
	public Object getContrast_param() {
		return contrast_param;
	}
	public void setContrast_param(Object newContrast_param) {
		contrast_param = newContrast_param;
	}
	public Object getBrightness_param() {
		return brightness_param;
	}
	public void setBrightness_param(Object newBrightness_param) {
		brightness_param = newBrightness_param;
	}
	public Object getGamma_param() {
		return gamma_param;
	}
	public void setGamma_param(Object newGamma_param) {
		gamma_param = newGamma_param;
	}
	public Object getPixel_size_param() {
		return pixel_size_param;
	}
	public void setPixel_size_param(Object newPixel_size_param) {
		pixel_size_param = newPixel_size_param;
	}
	public Object getChroma_param() {
		return chroma_param;
	}
	public void setChroma_param(Object newChroma_param) {
		chroma_param = newChroma_param;
	}
	public Object getSimilarity_param() {
		return similarity_param;
	}
	public void setSimilarity_param(Object newSimilarity_param) {
		similarity_param = newSimilarity_param;
	}
	public Object getSmoothness_param() {
		return smoothness_param;
	}
	public void setSmoothness_param(Object newSmoothness_param) {
		smoothness_param = newSmoothness_param;
	}
	public Object getSpill_param() {
		return spill_param;
	}
	public void setSpill_param(Object newSpill_param) {
		spill_param = newSpill_param;
	}
	public vec4 getColor() {
		return color;
	}
	public void setColor(vec4 newColor) {
		color = newColor;
	}
	public double getContrast() {
		return contrast;
	}
	public void setContrast(double newContrast) {
		contrast = newContrast;
	}
	public double getBrightness() {
		return brightness;
	}
	public void setBrightness(double newBrightness) {
		brightness = newBrightness;
	}
	public double getGamma() {
		return gamma;
	}
	public void setGamma(double newGamma) {
		gamma = newGamma;
	}
	public vec2 getChroma() {
		return chroma;
	}
	public void setChroma(vec2 newChroma) {
		chroma = newChroma;
	}
	public double getSimilarity() {
		return similarity;
	}
	public void setSimilarity(double newSimilarity) {
		similarity = newSimilarity;
	}
	public double getSmoothness() {
		return smoothness;
	}
	public void setSmoothness(double newSmoothness) {
		smoothness = newSmoothness;
	}
	public double getSpill() {
		return spill;
	}
	public void setSpill(double newSpill) {
		spill = newSpill;
	}
}
