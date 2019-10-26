package application;

public class commit_array {
	private commit commits;
	private int nr;
	private int alloc;
	
	public commit_array(commit commits, int nr, int alloc) {
		setCommits(commits);
		setNr(nr);
		setAlloc(alloc);
	}
	public commit_array() {
	}
	
	public commit getCommits() {
		return commits;
	}
	public void setCommits(commit newCommits) {
		commits = newCommits;
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
}
