package application;

public class merge_parents {
	private int alloc;
	private int nr;
	private merge_parent[] item;
	
	public merge_parents(int alloc, int nr, merge_parent[] item) {
		setAlloc(alloc);
		setNr(nr);
		setItem(item);
	}
	public merge_parents() {
	}
	
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public merge_parent[] getItem() {
		return item;
	}
	public void setItem(merge_parent[] newItem) {
		item = newItem;
	}
}
