package application;

// Struct used by those that are using an item in a list.
public class listwatch_S {
	private listitem_S lw_item;
	private listwatch_S lw_next;
	
	public listwatch_S(listitem_S lw_item, listwatch_S lw_next) {
		setLw_item(lw_item);
		setLw_next(lw_next);
	}
	public listwatch_S() {
	}
	
	public listitem_S getLw_item() {
		return lw_item;
	}
	public void setLw_item(listitem_S newLw_item) {
		lw_item = newLw_item;
	}
	public listwatch_S getLw_next() {
		return lw_next;
	}
	public void setLw_next(listwatch_S newLw_next) {
		lw_next = newLw_next;
	}
}
