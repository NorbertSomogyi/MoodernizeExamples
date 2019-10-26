package application;

public class collect_reflog_cb {
	private collected_reflog e;
	private int alloc;
	private int nr;
	private worktree wt;
	
	public collect_reflog_cb(collected_reflog e, int alloc, int nr, worktree wt) {
		setE(e);
		setAlloc(alloc);
		setNr(nr);
		setWt(wt);
	}
	public collect_reflog_cb() {
	}
	
	public collected_reflog getE() {
		return e;
	}
	public void setE(collected_reflog newE) {
		e = newE;
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
	public worktree getWt() {
		return wt;
	}
	public void setWt(worktree newWt) {
		wt = newWt;
	}
}
