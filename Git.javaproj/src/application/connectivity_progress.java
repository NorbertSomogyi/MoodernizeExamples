package application;

public class connectivity_progress {
	private progress progress;
	private long count;
	
	public connectivity_progress(progress progress, long count) {
		setProgress(progress);
		setCount(count);
	}
	public connectivity_progress() {
	}
	
	public void update_progress() {
		long generatedCount = this.getCount();
		generatedCount++;
		progress generatedProgress = this.getProgress();
		if ((generatedCount & 1023) == 0) {
			generatedProgress.display_progress(generatedCount);
		} 
	}
	public progress getProgress() {
		return progress;
	}
	public void setProgress(progress newProgress) {
		progress = newProgress;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long newCount) {
		count = newCount;
	}
}
