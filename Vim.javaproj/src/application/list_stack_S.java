package application;

public class list_stack_S {
	private listvar_S list;
	private list_stack_S prev;
	
	public list_stack_S(listvar_S list, list_stack_S prev) {
		setList(list);
		setPrev(prev);
	}
	public list_stack_S() {
	}
	
	public listvar_S getList() {
		return list;
	}
	public void setList(listvar_S newList) {
		list = newList;
	}
	public list_stack_S getPrev() {
		return prev;
	}
	public void setPrev(list_stack_S newPrev) {
		prev = newPrev;
	}
}
/*
 * Structure used for iterating over dictionary items.
 * Initialize with dict_iterate_start().
 */
