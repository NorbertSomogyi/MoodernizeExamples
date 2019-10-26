package application;

/* Generic numeric progress meter */
public class ext2fs_numeric_progress_struct {
	private Object max;
	private int log_max;
	private int skip_progress;
	
	public ext2fs_numeric_progress_struct(Object max, int log_max, int skip_progress) {
		setMax(max);
		setLog_max(log_max);
		setSkip_progress(skip_progress);
	}
	public ext2fs_numeric_progress_struct() {
	}
	
	public Object getMax() {
		return max;
	}
	public void setMax(Object newMax) {
		max = newMax;
	}
	public int getLog_max() {
		return log_max;
	}
	public void setLog_max(int newLog_max) {
		log_max = newLog_max;
	}
	public int getSkip_progress() {
		return skip_progress;
	}
	public void setSkip_progress(int newSkip_progress) {
		skip_progress = newSkip_progress;
	}
}
/*
 * 64-bit bitmap support
 */
