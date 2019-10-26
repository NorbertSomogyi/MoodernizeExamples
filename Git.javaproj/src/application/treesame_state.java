package application;

public class treesame_state {
	private int nparents;
	private Object treesame;
	
	public treesame_state(int nparents, Object treesame) {
		setNparents(nparents);
		setTreesame(treesame);
	}
	public treesame_state() {
	}
	
	public treesame_state initialise_treesame(rev_info revs, commit commit) {
		commit_list generatedParents = commit.getParents();
		int n = .commit_list_count(generatedParents);
		treesame_state st = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(, n));
		st.setNparents(n);
		decoration generatedTreesame = revs.getTreesame();
		object generatedObject = commit.getObject();
		generatedTreesame.add_decoration(generatedObject, st);
		return st/*
		 * Must be called immediately after removing the nth_parent from a commit's
		 * parent list, if we are maintaining the per-parent treesame[] decoration.
		 * This does not recalculate the master TREESAME flag - update_treesame()
		 * should be called to update it after a sequence of treesame[] modifications
		 * that may have affected it.
		 */;
	}
	public int getNparents() {
		return nparents;
	}
	public void setNparents(int newNparents) {
		nparents = newNparents;
	}
	public Object getTreesame() {
		return treesame;
	}
	public void setTreesame(Object newTreesame) {
		treesame = newTreesame;
	}
}
