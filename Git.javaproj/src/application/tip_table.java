package application;

public class tip_table {
	private tip_table_entry table;
	private int nr;
	private int alloc;
	private int sorted;
	
	public tip_table(tip_table_entry table, int nr, int alloc, int sorted) {
		setTable(table);
		setNr(nr);
		setAlloc(alloc);
		setSorted(sorted);
	}
	public tip_table() {
	}
	
	public tip_table_entry getTable() {
		return table;
	}
	public void setTable(tip_table_entry newTable) {
		table = newTable;
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
	public int getSorted() {
		return sorted;
	}
	public void setSorted(int newSorted) {
		sorted = newSorted;
	}
}
