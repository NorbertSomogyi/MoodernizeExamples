package application;

public class slide_info {
	private obs_source source;
	private Object effect;
	private Object a_param;
	private Object b_param;
	private Object tex_a_dir_param;
	private Object tex_b_dir_param;
	private vec2 dir;
	private Object slide_in;
	
	public slide_info(obs_source source, Object effect, Object a_param, Object b_param, Object tex_a_dir_param, Object tex_b_dir_param, vec2 dir, Object slide_in) {
		setSource(source);
		setEffect(effect);
		setA_param(a_param);
		setB_param(b_param);
		setTex_a_dir_param(tex_a_dir_param);
		setTex_b_dir_param(tex_b_dir_param);
		setDir(dir);
		setSlide_in(slide_in);
	}
	public slide_info() {
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
	public Object getTex_a_dir_param() {
		return tex_a_dir_param;
	}
	public void setTex_a_dir_param(Object newTex_a_dir_param) {
		tex_a_dir_param = newTex_a_dir_param;
	}
	public Object getTex_b_dir_param() {
		return tex_b_dir_param;
	}
	public void setTex_b_dir_param(Object newTex_b_dir_param) {
		tex_b_dir_param = newTex_b_dir_param;
	}
	public vec2 getDir() {
		return dir;
	}
	public void setDir(vec2 newDir) {
		dir = newDir;
	}
	public Object getSlide_in() {
		return slide_in;
	}
	public void setSlide_in(Object newSlide_in) {
		slide_in = newSlide_in;
	}
}
