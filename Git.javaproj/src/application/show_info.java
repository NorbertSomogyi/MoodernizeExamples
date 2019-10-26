package application;

public class show_info {
	private string_list list;
	private ref_states states;
	private int width;
	private int width2;
	private int any_rebase;
	
	public show_info(string_list list, ref_states states, int width, int width2, int any_rebase) {
		setList(list);
		setStates(states);
		setWidth(width);
		setWidth2(width2);
		setAny_rebase(any_rebase);
	}
	public show_info() {
	}
	
	public string_list getList() {
		return list;
	}
	public void setList(string_list newList) {
		list = newList;
	}
	public ref_states getStates() {
		return states;
	}
	public void setStates(ref_states newStates) {
		states = newStates;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public int getWidth2() {
		return width2;
	}
	public void setWidth2(int newWidth2) {
		width2 = newWidth2;
	}
	public int getAny_rebase() {
		return any_rebase;
	}
	public void setAny_rebase(int newAny_rebase) {
		any_rebase = newAny_rebase;
	}
}
