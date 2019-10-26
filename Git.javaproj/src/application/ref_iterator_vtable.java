package application;

public class ref_iterator_vtable {
	private Object advance;
	private Object peel;
	private Object abort;
	
	public ref_iterator_vtable(Object advance, Object peel, Object abort) {
		setAdvance(advance);
		setPeel(peel);
		setAbort(abort);
	}
	public ref_iterator_vtable() {
	}
	
	public Object getAdvance() {
		return advance;
	}
	public void setAdvance(Object newAdvance) {
		advance = newAdvance;
	}
	public Object getPeel() {
		return peel;
	}
	public void setPeel(Object newPeel) {
		peel = newPeel;
	}
	public Object getAbort() {
		return abort;
	}
	public void setAbort(Object newAbort) {
		abort = newAbort;
	}
}
/*
	 * Does this `ref_iterator` iterate over references in order
	 * by refname?
	 */
/*
 * Base class destructor for ref_iterators. Destroy the ref_iterator
 * part of iter and shallow-free the object. This is meant to be
 * called only by the destructors of derived classes.
 */
