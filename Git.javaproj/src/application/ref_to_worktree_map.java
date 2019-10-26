package application;

public class ref_to_worktree_map {
	private hashmap map;
	private worktree worktrees;
	
	public ref_to_worktree_map(hashmap map, worktree worktrees) {
		setMap(map);
		setWorktrees(worktrees);
	}
	public ref_to_worktree_map() {
	}
	
	public hashmap getMap() {
		return map;
	}
	public void setMap(hashmap newMap) {
		map = newMap;
	}
	public worktree getWorktrees() {
		return worktrees;
	}
	public void setWorktrees(worktree newWorktrees) {
		worktrees = newWorktrees;
	}
}
