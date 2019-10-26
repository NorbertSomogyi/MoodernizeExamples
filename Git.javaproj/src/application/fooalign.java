package application;

public class fooalign {
	private byte c;
	private fooround u;
	
	public fooalign(byte c, fooround u) {
		setC(c);
		setU(u);
	}
	public fooalign() {
	}
	
	public byte getC() {
		return c;
	}
	public void setC(byte newC) {
		c = newC;
	}
	public fooround getU() {
		return u;
	}
	public void setU(fooround newU) {
		u = newU;
	}
}
