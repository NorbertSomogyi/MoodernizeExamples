package application;

public class contains_stack_entry {
	private commit commit;
	private commit_list parents;
	
	public contains_stack_entry(commit commit, commit_list parents) {
		setCommit(commit);
		setParents(parents);
	}
	public contains_stack_entry() {
	}
	
	public commit getCommit() {
		return commit;
	}
	public void setCommit(commit newCommit) {
		commit = newCommit;
	}
	public commit_list getParents() {
		return parents;
	}
	public void setParents(commit_list newParents) {
		parents = newParents;
	}
}
