package application;

/*
 * A list used for saving values of "emsg_silent".  Used by ex_try() to save the
 * value of "emsg_silent" if it was non-zero.  When this is done, the CSF_SILENT
 * flag below is set.
 */
public class eslist_elem {
	private int saved_emsg_silent;
	private eslist_elem next;
	
	public eslist_elem(int saved_emsg_silent, eslist_elem next) {
		setSaved_emsg_silent(saved_emsg_silent);
		setNext(next);
	}
	public eslist_elem() {
	}
	
	public int getSaved_emsg_silent() {
		return saved_emsg_silent;
	}
	public void setSaved_emsg_silent(int newSaved_emsg_silent) {
		saved_emsg_silent = newSaved_emsg_silent;
	}
	public eslist_elem getNext() {
		return next;
	}
	public void setNext(eslist_elem newNext) {
		next = newNext;
	}
}
