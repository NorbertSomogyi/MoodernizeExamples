package application;

public class index_entry_offset {
	private int offset;
	private int nr;
	
	public index_entry_offset(int offset, int nr) {
		setOffset(offset);
		setNr(nr);
	}
	public index_entry_offset() {
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
