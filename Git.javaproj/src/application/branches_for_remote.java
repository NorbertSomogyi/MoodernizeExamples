package application;

public class branches_for_remote {
	private remote remote;
	private string_list branches;
	private string_list skipped;
	private known_remotes keep;
	
	public branches_for_remote(remote remote, string_list branches, string_list skipped, known_remotes keep) {
		setRemote(remote);
		setBranches(branches);
		setSkipped(skipped);
		setKeep(keep);
	}
	public branches_for_remote() {
	}
	
	public remote getRemote() {
		return remote;
	}
	public void setRemote(remote newRemote) {
		remote = newRemote;
	}
	public string_list getBranches() {
		return branches;
	}
	public void setBranches(string_list newBranches) {
		branches = newBranches;
	}
	public string_list getSkipped() {
		return skipped;
	}
	public void setSkipped(string_list newSkipped) {
		skipped = newSkipped;
	}
	public known_remotes getKeep() {
		return keep;
	}
	public void setKeep(known_remotes newKeep) {
		keep = newKeep;
	}
}
