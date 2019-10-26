package application;

/* Fetch multiple remotes in parallel */
public class parallel_fetch_state {
	private Object argv;
	private string_list remotes;
	private int next;
	private int result;
	
	public parallel_fetch_state(Object argv, string_list remotes, int next, int result) {
		setArgv(argv);
		setRemotes(remotes);
		setNext(next);
		setResult(result);
	}
	public parallel_fetch_state() {
	}
	
	public Object getArgv() {
		return argv;
	}
	public void setArgv(Object newArgv) {
		argv = newArgv;
	}
	public string_list getRemotes() {
		return remotes;
	}
	public void setRemotes(string_list newRemotes) {
		remotes = newRemotes;
	}
	public int getNext() {
		return next;
	}
	public void setNext(int newNext) {
		next = newNext;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int newResult) {
		result = newResult;
	}
}
