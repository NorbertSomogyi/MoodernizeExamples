package application;

public class hashcat_user {
	private int outer_threads_cnt;
	private Object[] outer_threads;
	
	public hashcat_user(int outer_threads_cnt, Object[] outer_threads) {
		setOuter_threads_cnt(outer_threads_cnt);
		setOuter_threads(outer_threads);
	}
	public hashcat_user() {
	}
	
	public int getOuter_threads_cnt() {
		return outer_threads_cnt;
	}
	public void setOuter_threads_cnt(int newOuter_threads_cnt) {
		outer_threads_cnt = newOuter_threads_cnt;
	}
	public Object[] getOuter_threads() {
		return outer_threads;
	}
	public void setOuter_threads(Object[] newOuter_threads) {
		outer_threads = newOuter_threads;
	}
}
// use this for context specific data
