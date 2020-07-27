package application;

public class in_pack {
	private int alloc;
	private int nr;
	private in_pack_object[] array;
	
	public in_pack(int alloc, int nr, in_pack_object[] array) {
		setAlloc(alloc);
		setNr(nr);
		setArray(array);
	}
	public in_pack() {
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
	public in_pack_object[] getArray() {
		return array;
	}
	public void setArray(in_pack_object[] newArray) {
		array = newArray;
	}
}
