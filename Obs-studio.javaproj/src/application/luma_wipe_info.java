package application;

/* clang-format off */
/* clang-format on */
public class luma_wipe_info {
	private obs_source source;
	private Object effect;
	private Object ep_a_tex;
	private Object ep_b_tex;
	private Object ep_l_tex;
	private Object ep_progress;
	private Object ep_invert;
	private Object ep_softness;
	private Object luma_image;
	private Object invert_luma;
	private double softness;
	private obs_data wipes_list;
	
	public luma_wipe_info(obs_source source, Object effect, Object ep_a_tex, Object ep_b_tex, Object ep_l_tex, Object ep_progress, Object ep_invert, Object ep_softness, Object luma_image, Object invert_luma, double softness, obs_data wipes_list) {
		setSource(source);
		setEffect(effect);
		setEp_a_tex(ep_a_tex);
		setEp_b_tex(ep_b_tex);
		setEp_l_tex(ep_l_tex);
		setEp_progress(ep_progress);
		setEp_invert(ep_invert);
		setEp_softness(ep_softness);
		setLuma_image(luma_image);
		setInvert_luma(invert_luma);
		setSoftness(softness);
		setWipes_list(wipes_list);
	}
	public luma_wipe_info() {
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
	public Object getEp_a_tex() {
		return ep_a_tex;
	}
	public void setEp_a_tex(Object newEp_a_tex) {
		ep_a_tex = newEp_a_tex;
	}
	public Object getEp_b_tex() {
		return ep_b_tex;
	}
	public void setEp_b_tex(Object newEp_b_tex) {
		ep_b_tex = newEp_b_tex;
	}
	public Object getEp_l_tex() {
		return ep_l_tex;
	}
	public void setEp_l_tex(Object newEp_l_tex) {
		ep_l_tex = newEp_l_tex;
	}
	public Object getEp_progress() {
		return ep_progress;
	}
	public void setEp_progress(Object newEp_progress) {
		ep_progress = newEp_progress;
	}
	public Object getEp_invert() {
		return ep_invert;
	}
	public void setEp_invert(Object newEp_invert) {
		ep_invert = newEp_invert;
	}
	public Object getEp_softness() {
		return ep_softness;
	}
	public void setEp_softness(Object newEp_softness) {
		ep_softness = newEp_softness;
	}
	public Object getLuma_image() {
		return luma_image;
	}
	public void setLuma_image(Object newLuma_image) {
		luma_image = newLuma_image;
	}
	public Object getInvert_luma() {
		return invert_luma;
	}
	public void setInvert_luma(Object newInvert_luma) {
		invert_luma = newInvert_luma;
	}
	public double getSoftness() {
		return softness;
	}
	public void setSoftness(double newSoftness) {
		softness = newSoftness;
	}
	public obs_data getWipes_list() {
		return wipes_list;
	}
	public void setWipes_list(obs_data newWipes_list) {
		wipes_list = newWipes_list;
	}
}
