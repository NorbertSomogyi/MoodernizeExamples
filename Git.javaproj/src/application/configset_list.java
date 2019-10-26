package application;

public class configset_list {
	private configset_list_item items;
	private int nr;
	private int alloc;
	
	public configset_list(configset_list_item items, int nr, int alloc) {
		setItems(items);
		setNr(nr);
		setAlloc(alloc);
	}
	public configset_list() {
	}
	
	public configset_list_item getItems() {
		return items;
	}
	public void setItems(configset_list_item newItems) {
		items = newItems;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
}
