package application;

public class cmdnames {
	private int alloc;
	private int cnt;
	private cmdname names;
	
	public cmdnames(int alloc, int cnt, cmdname names) {
		setAlloc(alloc);
		setCnt(cnt);
		setNames(names);
	}
	public cmdnames() {
	}
	
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int newCnt) {
		cnt = newCnt;
	}
	public cmdname getNames() {
		return names;
	}
	public void setNames(cmdname newNames) {
		names = newNames;
	}
}
