package application;

/* Type describing list of immutable strings,
   implemented using a dynamic array.  */
public class string_list_ty {
	private Object[][] item;
	private Object nitems;
	private Object nitems_max;
	
	public string_list_ty(Object[][] item, Object nitems, Object nitems_max) {
		setItem(item);
		setNitems(nitems);
		setNitems_max(nitems_max);
	}
	public string_list_ty() {
	}
	
	public Object[][] getItem() {
		return item;
	}
	public void setItem(Object[][] newItem) {
		item = newItem;
	}
	public Object getNitems() {
		return nitems;
	}
	public void setNitems(Object newNitems) {
		nitems = newNitems;
	}
	public Object getNitems_max() {
		return nitems_max;
	}
	public void setNitems_max(Object newNitems_max) {
		nitems_max = newNitems_max;
	}
}
