package application;

public class opts_commit_graph {
	private Object obj_dir;
	private int reachable;
	private int stdin_packs;
	private int stdin_commits;
	private int append;
	private int split;
	private int shallow;
	private int progress;
	
	public opts_commit_graph(Object obj_dir, int reachable, int stdin_packs, int stdin_commits, int append, int split, int shallow, int progress) {
		setObj_dir(obj_dir);
		setReachable(reachable);
		setStdin_packs(stdin_packs);
		setStdin_commits(stdin_commits);
		setAppend(append);
		setSplit(split);
		setShallow(shallow);
		setProgress(progress);
	}
	public opts_commit_graph() {
	}
	
	public Object getObj_dir() {
		return obj_dir;
	}
	public void setObj_dir(Object newObj_dir) {
		obj_dir = newObj_dir;
	}
	public int getReachable() {
		return reachable;
	}
	public void setReachable(int newReachable) {
		reachable = newReachable;
	}
	public int getStdin_packs() {
		return stdin_packs;
	}
	public void setStdin_packs(int newStdin_packs) {
		stdin_packs = newStdin_packs;
	}
	public int getStdin_commits() {
		return stdin_commits;
	}
	public void setStdin_commits(int newStdin_commits) {
		stdin_commits = newStdin_commits;
	}
	public int getAppend() {
		return append;
	}
	public void setAppend(int newAppend) {
		append = newAppend;
	}
	public int getSplit() {
		return split;
	}
	public void setSplit(int newSplit) {
		split = newSplit;
	}
	public int getShallow() {
		return shallow;
	}
	public void setShallow(int newShallow) {
		shallow = newShallow;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int newProgress) {
		progress = newProgress;
	}
}
