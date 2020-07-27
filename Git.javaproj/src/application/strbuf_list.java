package application;

public class strbuf_list {
	private strbuf[] items;
	private int nr;
	private int alloc;
	
	public strbuf_list(strbuf[] items, int nr, int alloc) {
		setItems(items);
		setNr(nr);
		setAlloc(alloc);
	}
	public strbuf_list() {
	}
	
	public strbuf[] getItems() {
		return items;
	}
	public void setItems(strbuf[] newItems) {
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
