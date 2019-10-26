package application;

/* MinGW is currently missing all the VDS COM stuff */
public class IVdsServiceLoader {
	private Object lpVtbl;
	
	public IVdsServiceLoader(Object lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IVdsServiceLoader() {
	}
	
	public Object getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(Object newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
