package application;

public class exclude_list_group {
	private int nr;
	private int alloc;
	private pattern_list pl;
	
	public exclude_list_group(int nr, int alloc, pattern_list pl) {
		setNr(nr);
		setAlloc(alloc);
		setPl(pl);
	}
	public exclude_list_group() {
	}
	
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public pattern_list getPl() {
		return pl;
	}
	public void setPl(pattern_list newPl) {
		pl = newPl;
	}
}
