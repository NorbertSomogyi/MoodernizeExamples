package application;

public class pbase_tree {
	private pbase_tree next;
	private pbase_tree_cache pcache;
	
	public pbase_tree(pbase_tree next, pbase_tree_cache pcache) {
		setNext(next);
		setPcache(pcache);
	}
	public pbase_tree() {
	}
	
	public pbase_tree getNext() {
		return next;
	}
	public void setNext(pbase_tree newNext) {
		next = newNext;
	}
	public pbase_tree_cache getPcache() {
		return pcache;
	}
	public void setPcache(pbase_tree_cache newPcache) {
		pcache = newPcache;
	}
}
/* This is a phony "cache" entry; we are not
	 * going to evict it or find it through _get()
	 * mechanism -- this is for the toplevel node that
	 * would almost always change with any commit.
	 */
