package application;

public class thread_data {
	private Object pthread;
	private index_state index;
	private pathspec pathspec;
	private progress_data progress;
	private int offset;
	private int nr;
	
	public thread_data(Object pthread, index_state index, pathspec pathspec, progress_data progress, int offset, int nr) {
		setPthread(pthread);
		setIndex(index);
		setPathspec(pathspec);
		setProgress(progress);
		setOffset(offset);
		setNr(nr);
	}
	public thread_data() {
	}
	
	public Object getPthread() {
		return pthread;
	}
	public void setPthread(Object newPthread) {
		pthread = newPthread;
	}
	public index_state getIndex() {
		return index;
	}
	public void setIndex(index_state newIndex) {
		index = newIndex;
	}
	public pathspec getPathspec() {
		return pathspec;
	}
	public void setPathspec(pathspec newPathspec) {
		pathspec = newPathspec;
	}
	public progress_data getProgress() {
		return progress;
	}
	public void setProgress(progress_data newProgress) {
		progress = newProgress;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int newOffset) {
		offset = newOffset;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
}
