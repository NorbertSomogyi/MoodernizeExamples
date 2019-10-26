package application;

public class menu_item {
	private byte hotkey;
	private Object title;
	private int selected;
	private Object fn;
	
	public menu_item(byte hotkey, Object title, int selected, Object fn) {
		setHotkey(hotkey);
		setTitle(title);
		setSelected(selected);
		setFn(fn);
	}
	public menu_item() {
	}
	
	public byte getHotkey() {
		return hotkey;
	}
	public void setHotkey(byte newHotkey) {
		hotkey = newHotkey;
	}
	public Object getTitle() {
		return title;
	}
	public void setTitle(Object newTitle) {
		title = newTitle;
	}
	public int getSelected() {
		return selected;
	}
	public void setSelected(int newSelected) {
		selected = newSelected;
	}
	public Object getFn() {
		return fn;
	}
	public void setFn(Object newFn) {
		fn = newFn;
	}
}
