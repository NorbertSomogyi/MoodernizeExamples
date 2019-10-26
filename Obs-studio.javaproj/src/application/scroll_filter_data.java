package application;

public class scroll_filter_data {
	private obs_source context;
	private Object effect;
	private Object param_add;
	private Object param_mul;
	private Object param_image;
	private vec2 scroll_speed;
	private Object sampler;
	private Object limit_cx;
	private Object limit_cy;
	private Object cx;
	private Object cy;
	private vec2 size_i;
	private vec2 offset;
	
	public scroll_filter_data(obs_source context, Object effect, Object param_add, Object param_mul, Object param_image, vec2 scroll_speed, Object sampler, Object limit_cx, Object limit_cy, Object cx, Object cy, vec2 size_i, vec2 offset) {
		setContext(context);
		setEffect(effect);
		setParam_add(param_add);
		setParam_mul(param_mul);
		setParam_image(param_image);
		setScroll_speed(scroll_speed);
		setSampler(sampler);
		setLimit_cx(limit_cx);
		setLimit_cy(limit_cy);
		setCx(cx);
		setCy(cy);
		setSize_i(size_i);
		setOffset(offset);
	}
	public scroll_filter_data() {
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
	public Object getParam_add() {
		return param_add;
	}
	public void setParam_add(Object newParam_add) {
		param_add = newParam_add;
	}
	public Object getParam_mul() {
		return param_mul;
	}
	public void setParam_mul(Object newParam_mul) {
		param_mul = newParam_mul;
	}
	public Object getParam_image() {
		return param_image;
	}
	public void setParam_image(Object newParam_image) {
		param_image = newParam_image;
	}
	public vec2 getScroll_speed() {
		return scroll_speed;
	}
	public void setScroll_speed(vec2 newScroll_speed) {
		scroll_speed = newScroll_speed;
	}
	public Object getSampler() {
		return sampler;
	}
	public void setSampler(Object newSampler) {
		sampler = newSampler;
	}
	public Object getLimit_cx() {
		return limit_cx;
	}
	public void setLimit_cx(Object newLimit_cx) {
		limit_cx = newLimit_cx;
	}
	public Object getLimit_cy() {
		return limit_cy;
	}
	public void setLimit_cy(Object newLimit_cy) {
		limit_cy = newLimit_cy;
	}
	public Object getCx() {
		return cx;
	}
	public void setCx(Object newCx) {
		cx = newCx;
	}
	public Object getCy() {
		return cy;
	}
	public void setCy(Object newCy) {
		cy = newCy;
	}
	public vec2 getSize_i() {
		return size_i;
	}
	public void setSize_i(vec2 newSize_i) {
		size_i = newSize_i;
	}
	public vec2 getOffset() {
		return offset;
	}
	public void setOffset(vec2 newOffset) {
		offset = newOffset;
	}
}
