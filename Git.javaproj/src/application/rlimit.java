package application;

public class rlimit {
	private int rlim_cur;
	
	public rlimit(int rlim_cur) {
		setRlim_cur(rlim_cur);
	}
	public rlimit() {
	}
	
	public int getrlimit(int resource) {
		if (resource != 0) {
			(._errno()) = EINVAL;
			return -1;
		} 
		this.setRlim_cur(2048);
		return 0/*
		 * Use mingw specific stat()/lstat()/fstat() implementations on Windows,
		 * including our own struct stat with 64 bit st_size and nanosecond-precision
		 * file times.
		 */;
	}
	public int getRlim_cur() {
		return rlim_cur;
	}
	public void setRlim_cur(int newRlim_cur) {
		rlim_cur = newRlim_cur;
	}
}
