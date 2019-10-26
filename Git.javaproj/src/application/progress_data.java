package application;

/*
 * Copyright (C) 2008 Linus Torvalds
 */
/*
 * Mostly randomly chosen maximum thread counts: we
 * cap the parallelism to 20 threads, and we want
 * to have at least 500 lstat's per thread for it to
 * be worth starting a thread.
 */
public class progress_data {
	private long n;
	private progress progress;
	private Object mutex;
	
	public progress_data(long n, progress progress, Object mutex) {
		setN(n);
		setProgress(progress);
		setMutex(mutex);
	}
	public progress_data() {
	}
	
	public long getN() {
		return n;
	}
	public void setN(long newN) {
		n = newN;
	}
	public progress getProgress() {
		return progress;
	}
	public void setProgress(progress newProgress) {
		progress = newProgress;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
}
