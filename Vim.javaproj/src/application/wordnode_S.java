package application;

public class wordnode_S {
	private  wn_u1;
	private  wn_u2;
	private wordnode_S wn_child;
	private wordnode_S wn_sibling;
	private int wn_refs;
	private Object wn_byte;
	private Object wn_affixID;
	private Object wn_flags;
	private int wn_region;
	
	public wordnode_S( wn_u1,  wn_u2, wordnode_S wn_child, wordnode_S wn_sibling, int wn_refs, Object wn_byte, Object wn_affixID, Object wn_flags, int wn_region) {
		setWn_u1(wn_u1);
		setWn_u2(wn_u2);
		setWn_child(wn_child);
		setWn_sibling(wn_sibling);
		setWn_refs(wn_refs);
		setWn_byte(wn_byte);
		setWn_affixID(wn_affixID);
		setWn_flags(wn_flags);
		setWn_region(wn_region);
	}
	public wordnode_S() {
	}
	
	public wordnode_S wordtree_alloc(spellinfo_S spin) {
		return (wordnode_T)spin.getroom(, 1/*
		 * Store a word in the tree(s).
		 * Always store it in the case-folded tree.  For a keep-case word this is
		 * useful when the word can also be used with all caps (no WF_FIXCAP flag) and
		 * used to find suggestions.
		 * For a keep-case word also store it in the keep-case tree.
		 * When "pfxlist" is not NULL store the word for each postponed prefix ID and
		 * compound flag.
		 */);
	}
	public wordnode_S get_wordnode(spellinfo_S spin) {
		wordnode_T n = new wordnode_T();
		wordnode_S generatedSi_first_free = spin.getSi_first_free();
		wordnode_S generatedWn_child = n.getWn_child();
		long generatedSi_free_count = spin.getSi_free_count();
		if (generatedSi_first_free == ((Object)0)) {
			n = (wordnode_T)spin.getroom(, 1);
		} else {
				n = generatedSi_first_free;
				spin.setSi_first_free(generatedWn_child);
				.memset((n), (false), ());
				--generatedSi_free_count;
		} 
		return n/*
		 * Decrement the reference count on a node (which is the head of a list of
		 * siblings).  If the reference count becomes zero free the node and its
		 * siblings.
		 * Returns the number of nodes actually freed.
		 */;
	}
	public int node_equal(wordnode_S n2) {
		wordnode_T p1 = new wordnode_T();
		wordnode_T p2 = new wordnode_T();
		Object generatedWn_byte = p1.getWn_byte();
		Object generatedWn_flags = p1.getWn_flags();
		int generatedWn_region = p1.getWn_region();
		Object generatedWn_affixID = p1.getWn_affixID();
		wordnode_S generatedWn_child = p1.getWn_child();
		for (; p1 != ((Object)0) && p2 != ((Object)0); ) {
			if (generatedWn_byte != generatedWn_byte || (generatedWn_byte == (byte)'\000' ? (generatedWn_flags != generatedWn_flags || generatedWn_region != generatedWn_region || generatedWn_affixID != generatedWn_affixID) : (generatedWn_child != generatedWn_child))) {
				break;
			} 
		}
		return p1 == ((Object)0) && p2 == ((Object)0);
	}
	public void clear_node() {
		wordnode_T np = new wordnode_T();
		 generatedWn_u1 = np.getWn_u1();
		 generatedWn_u2 = np.getWn_u2();
		Object generatedWn_byte = np.getWn_byte();
		wordnode_S generatedWn_child = np.getWn_child();
		wordnode_S generatedWn_sibling = np.getWn_sibling();
		if (node != ((Object)0)) {
			for (np = node; np != ((Object)0); np = generatedWn_sibling) {
				generatedWn_u1.setIndex(0);
				generatedWn_u2.setWnode(((Object)0));
				if (generatedWn_byte != (byte)'\000') {
					generatedWn_child.clear_node();
				} 
			}
		} 
	}
	public  getWn_u1() {
		return wn_u1;
	}
	public void setWn_u1( newWn_u1) {
		wn_u1 = newWn_u1;
	}
	public  getWn_u2() {
		return wn_u2;
	}
	public void setWn_u2( newWn_u2) {
		wn_u2 = newWn_u2;
	}
	public wordnode_S getWn_child() {
		return wn_child;
	}
	public void setWn_child(wordnode_S newWn_child) {
		wn_child = newWn_child;
	}
	public wordnode_S getWn_sibling() {
		return wn_sibling;
	}
	public void setWn_sibling(wordnode_S newWn_sibling) {
		wn_sibling = newWn_sibling;
	}
	public int getWn_refs() {
		return wn_refs;
	}
	public void setWn_refs(int newWn_refs) {
		wn_refs = newWn_refs;
	}
	public Object getWn_byte() {
		return wn_byte;
	}
	public void setWn_byte(Object newWn_byte) {
		wn_byte = newWn_byte;
	}
	public Object getWn_affixID() {
		return wn_affixID;
	}
	public void setWn_affixID(Object newWn_affixID) {
		wn_affixID = newWn_affixID;
	}
	public Object getWn_flags() {
		return wn_flags;
	}
	public void setWn_flags(Object newWn_flags) {
		wn_flags = newWn_flags;
	}
	public int getWn_region() {
		return wn_region;
	}
	public void setWn_region(int newWn_region) {
		wn_region = newWn_region;
	}
}
