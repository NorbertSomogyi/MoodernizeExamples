package application;

public class commit_stack {
	private commit items;
	private Object nr;
	private Object alloc;
	
	public commit_stack(commit items, Object nr, Object alloc) {
		setItems(items);
		setNr(nr);
		setAlloc(alloc);
	}
	public commit_stack() {
	}
	
	public void commit_stack_clear() {
		commit generatedItems = this.getItems();
		do {
			ModernizedCProgram.free(generatedItems);
			(generatedItems) = ((Object)0);
		} while (0);
		this.setNr(this.setAlloc(0));
	}
	public commit getItems() {
		return items;
	}
	public void setItems(commit newItems) {
		items = newItems;
	}
	public Object getNr() {
		return nr;
	}
	public void setNr(Object newNr) {
		nr = newNr;
	}
	public Object getAlloc() {
		return alloc;
	}
	public void setAlloc(Object newAlloc) {
		alloc = newAlloc;
	}
}
