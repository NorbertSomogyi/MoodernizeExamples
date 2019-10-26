package application;

public class crop_filter_data {
	private obs_source context;
	private Object effect;
	private Object param_mul;
	private Object param_add;
	private int left;
	private int right;
	private int top;
	private int bottom;
	private int abs_cx;
	private int abs_cy;
	private int width;
	private int height;
	private Object absolute;
	private vec2 mul_val;
	private vec2 add_val;
	
	public crop_filter_data(obs_source context, Object effect, Object param_mul, Object param_add, int left, int right, int top, int bottom, int abs_cx, int abs_cy, int width, int height, Object absolute, vec2 mul_val, vec2 add_val) {
		setContext(context);
		setEffect(effect);
		setParam_mul(param_mul);
		setParam_add(param_add);
		setLeft(left);
		setRight(right);
		setTop(top);
		setBottom(bottom);
		setAbs_cx(abs_cx);
		setAbs_cy(abs_cy);
		setWidth(width);
		setHeight(height);
		setAbsolute(absolute);
		setMul_val(mul_val);
		setAdd_val(add_val);
	}
	public crop_filter_data() {
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
	public Object getParam_mul() {
		return param_mul;
	}
	public void setParam_mul(Object newParam_mul) {
		param_mul = newParam_mul;
	}
	public Object getParam_add() {
		return param_add;
	}
	public void setParam_add(Object newParam_add) {
		param_add = newParam_add;
	}
	public int getLeft() {
		return left;
	}
	public void setLeft(int newLeft) {
		left = newLeft;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int newRight) {
		right = newRight;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int newTop) {
		top = newTop;
	}
	public int getBottom() {
		return bottom;
	}
	public void setBottom(int newBottom) {
		bottom = newBottom;
	}
	public int getAbs_cx() {
		return abs_cx;
	}
	public void setAbs_cx(int newAbs_cx) {
		abs_cx = newAbs_cx;
	}
	public int getAbs_cy() {
		return abs_cy;
	}
	public void setAbs_cy(int newAbs_cy) {
		abs_cy = newAbs_cy;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public Object getAbsolute() {
		return absolute;
	}
	public void setAbsolute(Object newAbsolute) {
		absolute = newAbsolute;
	}
	public vec2 getMul_val() {
		return mul_val;
	}
	public void setMul_val(vec2 newMul_val) {
		mul_val = newMul_val;
	}
	public vec2 getAdd_val() {
		return add_val;
	}
	public void setAdd_val(vec2 newAdd_val) {
		add_val = newAdd_val;
	}
}
