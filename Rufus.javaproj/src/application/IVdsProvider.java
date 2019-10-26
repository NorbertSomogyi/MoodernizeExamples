package application;

public class IVdsProvider {
	private Object lpVtbl;
	
	public IVdsProvider(Object lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IVdsProvider() {
	}
	
	public Object getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(Object newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
