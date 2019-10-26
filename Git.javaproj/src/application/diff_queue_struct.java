package application;

public class diff_queue_struct {
	private diff_filepair queue;
	private int alloc;
	private int nr;
	
	public diff_queue_struct(diff_filepair queue, int alloc, int nr) {
		setQueue(queue);
		setAlloc(alloc);
		setNr(nr);
	}
	public diff_queue_struct() {
	}
	
	public void move_diff_queue(diff_queue_struct src) {
		((src != dst) ? (Object)0 : ._assert("src != dst", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\line-log.c", 787));
		.memcpy(dst, src, );
		do {
			(src).setQueue(((Object)0));
			(src).setNr((src).setAlloc(0));
		} while (0);
	}
	public void free_diffqueues(int n) {
		int i;
		int j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < dq[i].getNr(); j++) {
				.diff_free_filepair(dq[i].getQueue()[j]);
			}
		}
		ModernizedCProgram.free(dq);
	}
	public diff_filepair getQueue() {
		return queue;
	}
	public void setQueue(diff_filepair newQueue) {
		queue = newQueue;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
}
