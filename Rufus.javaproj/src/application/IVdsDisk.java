package application;

public class IVdsDisk {
	private Object lpVtbl;
	
	public IVdsDisk(Object lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IVdsDisk() {
	}
	
	public Object getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(Object newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
