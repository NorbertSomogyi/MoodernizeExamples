package application;

public class log_info {
	private commit commit;
	private commit parent;
	
	public log_info(commit commit, commit parent) {
		setCommit(commit);
		setParent(parent);
	}
	public log_info() {
	}
	
	public commit getCommit() {
		return commit;
	}
	public void setCommit(commit newCommit) {
		commit = newCommit;
	}
	public commit getParent() {
		return parent;
	}
	public void setParent(commit newParent) {
		parent = newParent;
	}
}
