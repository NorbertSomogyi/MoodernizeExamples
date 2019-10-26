package application;

/* clang-format off */
/* clang-format on */
public class scale_filter_data {
	private obs_source context;
	private Object effect;
	private Object image_param;
	private Object dimension_param;
	private Object dimension_i_param;
	private Object undistort_factor_param;
	private vec2 dimension;
	private vec2 dimension_i;
	private double undistort_factor;
	private int cx_in;
	private int cy_in;
	private int cx_out;
	private int cy_out;
	private obs_scale_type sampling;
	private Object point_sampler;
	private Object aspect_ratio_only;
	private Object target_valid;
	private Object valid;
	private Object undistort;
	private Object upscale;
	private Object base_canvas_resolution;
	
	public scale_filter_data(obs_source context, Object effect, Object image_param, Object dimension_param, Object dimension_i_param, Object undistort_factor_param, vec2 dimension, vec2 dimension_i, double undistort_factor, int cx_in, int cy_in, int cx_out, int cy_out, obs_scale_type sampling, Object point_sampler, Object aspect_ratio_only, Object target_valid, Object valid, Object undistort, Object upscale, Object base_canvas_resolution) {
		setContext(context);
		setEffect(effect);
		setImage_param(image_param);
		setDimension_param(dimension_param);
		setDimension_i_param(dimension_i_param);
		setUndistort_factor_param(undistort_factor_param);
		setDimension(dimension);
		setDimension_i(dimension_i);
		setUndistort_factor(undistort_factor);
		setCx_in(cx_in);
		setCy_in(cy_in);
		setCx_out(cx_out);
		setCy_out(cy_out);
		setSampling(sampling);
		setPoint_sampler(point_sampler);
		setAspect_ratio_only(aspect_ratio_only);
		setTarget_valid(target_valid);
		setValid(valid);
		setUndistort(undistort);
		setUpscale(upscale);
		setBase_canvas_resolution(base_canvas_resolution);
	}
	public scale_filter_data() {
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
	public Object getImage_param() {
		return image_param;
	}
	public void setImage_param(Object newImage_param) {
		image_param = newImage_param;
	}
	public Object getDimension_param() {
		return dimension_param;
	}
	public void setDimension_param(Object newDimension_param) {
		dimension_param = newDimension_param;
	}
	public Object getDimension_i_param() {
		return dimension_i_param;
	}
	public void setDimension_i_param(Object newDimension_i_param) {
		dimension_i_param = newDimension_i_param;
	}
	public Object getUndistort_factor_param() {
		return undistort_factor_param;
	}
	public void setUndistort_factor_param(Object newUndistort_factor_param) {
		undistort_factor_param = newUndistort_factor_param;
	}
	public vec2 getDimension() {
		return dimension;
	}
	public void setDimension(vec2 newDimension) {
		dimension = newDimension;
	}
	public vec2 getDimension_i() {
		return dimension_i;
	}
	public void setDimension_i(vec2 newDimension_i) {
		dimension_i = newDimension_i;
	}
	public double getUndistort_factor() {
		return undistort_factor;
	}
	public void setUndistort_factor(double newUndistort_factor) {
		undistort_factor = newUndistort_factor;
	}
	public int getCx_in() {
		return cx_in;
	}
	public void setCx_in(int newCx_in) {
		cx_in = newCx_in;
	}
	public int getCy_in() {
		return cy_in;
	}
	public void setCy_in(int newCy_in) {
		cy_in = newCy_in;
	}
	public int getCx_out() {
		return cx_out;
	}
	public void setCx_out(int newCx_out) {
		cx_out = newCx_out;
	}
	public int getCy_out() {
		return cy_out;
	}
	public void setCy_out(int newCy_out) {
		cy_out = newCy_out;
	}
	public obs_scale_type getSampling() {
		return sampling;
	}
	public void setSampling(obs_scale_type newSampling) {
		sampling = newSampling;
	}
	public Object getPoint_sampler() {
		return point_sampler;
	}
	public void setPoint_sampler(Object newPoint_sampler) {
		point_sampler = newPoint_sampler;
	}
	public Object getAspect_ratio_only() {
		return aspect_ratio_only;
	}
	public void setAspect_ratio_only(Object newAspect_ratio_only) {
		aspect_ratio_only = newAspect_ratio_only;
	}
	public Object getTarget_valid() {
		return target_valid;
	}
	public void setTarget_valid(Object newTarget_valid) {
		target_valid = newTarget_valid;
	}
	public Object getValid() {
		return valid;
	}
	public void setValid(Object newValid) {
		valid = newValid;
	}
	public Object getUndistort() {
		return undistort;
	}
	public void setUndistort(Object newUndistort) {
		undistort = newUndistort;
	}
	public Object getUpscale() {
		return upscale;
	}
	public void setUpscale(Object newUpscale) {
		upscale = newUpscale;
	}
	public Object getBase_canvas_resolution() {
		return base_canvas_resolution;
	}
	public void setBase_canvas_resolution(Object newBase_canvas_resolution) {
		base_canvas_resolution = newBase_canvas_resolution;
	}
}
