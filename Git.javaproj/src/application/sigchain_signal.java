package application;

public class sigchain_signal {
	private Object[] old;
	private int n;
	private int alloc;
	
	public sigchain_signal(Object[] old, int n, int alloc) {
		setOld(old);
		setN(n);
		setAlloc(alloc);
	}
	public sigchain_signal() {
	}
	
	public Object[] getOld() {
		return old;
	}
	public void setOld(Object[] newOld) {
		old = newOld;
	}
	public int getN() {
		return n;
	}
	public void setN(int newN) {
		n = newN;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
}
