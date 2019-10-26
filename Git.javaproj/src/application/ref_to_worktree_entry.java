package application;

public class ref_to_worktree_entry {
	private hashmap_entry ent;
	private worktree wt;
	
	public ref_to_worktree_entry(hashmap_entry ent, worktree wt) {
		setEnt(ent);
		setWt(wt);
	}
	public ref_to_worktree_entry() {
	}
	
	public hashmap_entry getEnt() {
		return ent;
	}
	public void setEnt(hashmap_entry newEnt) {
		ent = newEnt;
	}
	public worktree getWt() {
		return wt;
	}
	public void setWt(worktree newWt) {
		wt = newWt;
	}
}
