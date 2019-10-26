package application;

public class IVdsSwProvider {
	private Object lpVtbl;
	
	public IVdsSwProvider(Object lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IVdsSwProvider() {
	}
	
	public Object getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(Object newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
