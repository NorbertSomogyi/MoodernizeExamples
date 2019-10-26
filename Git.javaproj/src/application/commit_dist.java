package application;

public class commit_dist {
	private commit commit;
	private int distance;
	
	public commit_dist(commit commit, int distance) {
		setCommit(commit);
		setDistance(distance);
	}
	public commit_dist() {
	}
	
	public commit getCommit() {
		return commit;
	}
	public void setCommit(commit newCommit) {
		commit = newCommit;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int newDistance) {
		distance = newDistance;
	}
}
