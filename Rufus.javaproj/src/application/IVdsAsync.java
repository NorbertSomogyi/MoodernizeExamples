package application;

public class IVdsAsync {
	private Object lpVtbl;
	
	public IVdsAsync(Object lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IVdsAsync() {
	}
	
	public Object getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(Object newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
