package application;

public class typeahead_st {
	private int numchars;
	private byte firstchar;
	private byte reserved0;
	private long reserved1;
	
	public typeahead_st(int numchars, byte firstchar, byte reserved0, long reserved1) {
		setNumchars(numchars);
		setFirstchar(firstchar);
		setReserved0(reserved0);
		setReserved1(reserved1);
	}
	public typeahead_st() {
	}
	
	public int getNumchars() {
		return numchars;
	}
	public void setNumchars(int newNumchars) {
		numchars = newNumchars;
	}
	public byte getFirstchar() {
		return firstchar;
	}
	public void setFirstchar(byte newFirstchar) {
		firstchar = newFirstchar;
	}
	public byte getReserved0() {
		return reserved0;
	}
	public void setReserved0(byte newReserved0) {
		reserved0 = newReserved0;
	}
	public long getReserved1() {
		return reserved1;
	}
	public void setReserved1(long newReserved1) {
		reserved1 = newReserved1;
	}
}
