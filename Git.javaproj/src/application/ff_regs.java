package application;

public class ff_regs {
	private int nr;
	private ff_reg array;
	
	public ff_regs(int nr, ff_reg array) {
		setNr(nr);
		setArray(array);
	}
	public ff_regs() {
	}
	
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public ff_reg getArray() {
		return array;
	}
	public void setArray(ff_reg newArray) {
		array = newArray;
	}
}
