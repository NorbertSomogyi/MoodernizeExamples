package application;

public class IVdsPack {
	private Object lpVtbl;
	
	public IVdsPack(Object lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IVdsPack() {
	}
	
	public Object getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(Object newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
