package application;

public class contains_stack {
	private int nr;
	private int alloc;
	private contains_stack_entry contains_stack;
	
	public contains_stack(int nr, int alloc, contains_stack_entry contains_stack) {
		setNr(nr);
		setAlloc(alloc);
		setContains_stack(contains_stack);
	}
	public contains_stack() {
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
	public contains_stack_entry getContains_stack() {
		return contains_stack;
	}
	public void setContains_stack(contains_stack_entry newContains_stack) {
		contains_stack = newContains_stack;
	}
}
