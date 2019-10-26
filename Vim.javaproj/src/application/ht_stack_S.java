package application;

/*
 * Structure used for listeners added with listener_add().
 */
/*
 * structure used for explicit stack while garbage collecting hash tables
 */
public class ht_stack_S {
	private hashtable_S ht;
	private ht_stack_S prev;
	
	public ht_stack_S(hashtable_S ht, ht_stack_S prev) {
		setHt(ht);
		setPrev(prev);
	}
	public ht_stack_S() {
	}
	
	public hashtable_S getHt() {
		return ht;
	}
	public void setHt(hashtable_S newHt) {
		ht = newHt;
	}
	public ht_stack_S getPrev() {
		return prev;
	}
	public void setPrev(ht_stack_S newPrev) {
		prev = newPrev;
	}
}
/*
 * structure used for explicit stack while garbage collecting lists
 */
