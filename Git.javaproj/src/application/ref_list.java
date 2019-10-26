package application;

public class ref_list {
	private int nr;
	private int alloc;
	private ref_list_entry list;
	
	public ref_list(int nr, int alloc, ref_list_entry list) {
		setNr(nr);
		setAlloc(alloc);
		setList(list);
	}
	public ref_list() {
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
	public ref_list_entry getList() {
		return list;
	}
	public void setList(ref_list_entry newList) {
		list = newList;
	}
}
