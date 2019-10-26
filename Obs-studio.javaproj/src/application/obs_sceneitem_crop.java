package application;

public class obs_sceneitem_crop {
	private int left;
	private int top;
	private int right;
	private int bottom;
	
	public obs_sceneitem_crop(int left, int top, int right, int bottom) {
		setLeft(left);
		setTop(top);
		setRight(right);
		setBottom(bottom);
	}
	public obs_sceneitem_crop() {
	}
	
	public void obs_sceneitem_get_crop(Object item) {
		if (!ModernizedCProgram.obs_object_valid(item, "obs_sceneitem_get_crop", "item")) {
			return ;
		} 
		if (!ModernizedCProgram.obs_object_valid(crop, "obs_sceneitem_get_crop", "crop")) {
			return ;
		} 
		.memcpy(crop, item.getCrop(), );
	}
	public int getLeft() {
		return left;
	}
	public void setLeft(int newLeft) {
		left = newLeft;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int newTop) {
		top = newTop;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int newRight) {
		right = newRight;
	}
	public int getBottom() {
		return bottom;
	}
	public void setBottom(int newBottom) {
		bottom = newBottom;
	}
}
