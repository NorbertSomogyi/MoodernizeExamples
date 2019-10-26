package application;

public class ref_array {
	private int nr;
	private int alloc;
	private ref_array_item items;
	private rev_info revs;
	
	public ref_array(int nr, int alloc, ref_array_item items, rev_info revs) {
		setNr(nr);
		setAlloc(alloc);
		setItems(items);
		setRevs(revs);
	}
	public ref_array() {
	}
	
	/* Free all memory allocated for ref_array */
	public void ref_array_clear() {
		int i;
		int generatedNr = this.getNr();
		ref_array_item generatedItems = this.getItems();
		for (i = 0; i < generatedNr; i++) {
			generatedItems[i].free_array_item();
		}
		do {
			ModernizedCProgram.free(generatedItems);
			(generatedItems) = ((Object)0);
		} while (0);
		this.setNr(this.setAlloc(0));
		for (i = 0; i < ModernizedCProgram.used_atom_cnt; i++) {
			ModernizedCProgram.free((byte)used_atom[i].getName());
		}
		do {
			ModernizedCProgram.free(used_atom);
			(used_atom) = ((Object)0);
		} while (0);
		ModernizedCProgram.used_atom_cnt = 0;
		worktree generatedWorktrees = ref_to_worktree_map.getWorktrees();
		hashmap generatedMap = ref_to_worktree_map.getMap();
		if (generatedWorktrees) {
			(generatedMap).hashmap_free_(((size_t)((ref_to_worktree_entry)0).getEnt()));
			;
			.free_worktrees(generatedWorktrees);
			ref_to_worktree_map.setWorktrees(((Object)0));
		} 
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
	public ref_array_item getItems() {
		return items;
	}
	public void setItems(ref_array_item newItems) {
		items = newItems;
	}
	public rev_info getRevs() {
		return revs;
	}
	public void setRevs(rev_info newRevs) {
		revs = newRevs;
	}
}
