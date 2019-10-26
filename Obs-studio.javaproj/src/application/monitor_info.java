package application;

public class monitor_info {
	private int cur_id;
	private int desired_id;
	private int id;
	private tagRECT rect;
	
	public monitor_info(int cur_id, int desired_id, int id, tagRECT rect) {
		setCur_id(cur_id);
		setDesired_id(desired_id);
		setId(id);
		setRect(rect);
	}
	public monitor_info() {
	}
	
	public int getCur_id() {
		return cur_id;
	}
	public void setCur_id(int newCur_id) {
		cur_id = newCur_id;
	}
	public int getDesired_id() {
		return desired_id;
	}
	public void setDesired_id(int newDesired_id) {
		desired_id = newDesired_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public tagRECT getRect() {
		return rect;
	}
	public void setRect(tagRECT newRect) {
		rect = newRect;
	}
}
