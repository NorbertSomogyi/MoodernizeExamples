package application;

/*
 * A data structure that associates Git objects to void pointers. See
 * t/helper/test-example-decorate.c for a demonstration of how to use these
 * functions.
 */
/*
 * An entry in the data structure.
 */
public class decoration_entry {
	private Object base;
	private Object decoration;
	
	public decoration_entry(Object base, Object decoration) {
		setBase(base);
		setDecoration(decoration);
	}
	public decoration_entry() {
	}
	
	public Object getBase() {
		return base;
	}
	public void setBase(Object newBase) {
		base = newBase;
	}
	public Object getDecoration() {
		return decoration;
	}
	public void setDecoration(Object newDecoration) {
		decoration = newDecoration;
	}
}
/*
 * Add an association from the given object to the given pointer (which may be
 * NULL), returning the previously associated pointer. If there is no previous
 * association, this function returns NULL.
 */
