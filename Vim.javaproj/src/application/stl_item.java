package application;

public class stl_item {
	private Object start;
	private int minwid;
	private int maxwid;
	private  type;
	
	public stl_item(Object start, int minwid, int maxwid,  type) {
		setStart(start);
		setMinwid(minwid);
		setMaxwid(maxwid);
		setType(type);
	}
	public stl_item() {
	}
	
	public Object getStart() {
		return start;
	}
	public void setStart(Object newStart) {
		start = newStart;
	}
	public int getMinwid() {
		return minwid;
	}
	public void setMinwid(int newMinwid) {
		minwid = newMinwid;
	}
	public int getMaxwid() {
		return maxwid;
	}
	public void setMaxwid(int newMaxwid) {
		maxwid = newMaxwid;
	}
	public  getType() {
		return type;
	}
	public void setType( newType) {
		type = newType;
	}
}
