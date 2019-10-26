package application;

public class bag_t_ {
	private int threadnum;
	private int started;
	
	public bag_t_(int threadnum, int started) {
		setThreadnum(threadnum);
		setStarted(started);
	}
	public bag_t_() {
	}
	
	public int getThreadnum() {
		return threadnum;
	}
	public void setThreadnum(int newThreadnum) {
		threadnum = newThreadnum;
	}
	public int getStarted() {
		return started;
	}
	public void setStarted(int newStarted) {
		started = newStarted;
	}
}
