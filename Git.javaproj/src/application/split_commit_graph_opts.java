package application;

public class split_commit_graph_opts {
	private int size_multiple;
	private int max_commits;
	private Object expire_time;
	
	public split_commit_graph_opts(int size_multiple, int max_commits, Object expire_time) {
		setSize_multiple(size_multiple);
		setMax_commits(max_commits);
		setExpire_time(expire_time);
	}
	public split_commit_graph_opts() {
	}
	
	public int getSize_multiple() {
		return size_multiple;
	}
	public void setSize_multiple(int newSize_multiple) {
		size_multiple = newSize_multiple;
	}
	public int getMax_commits() {
		return max_commits;
	}
	public void setMax_commits(int newMax_commits) {
		max_commits = newMax_commits;
	}
	public Object getExpire_time() {
		return expire_time;
	}
	public void setExpire_time(Object newExpire_time) {
		expire_time = newExpire_time;
	}
}
