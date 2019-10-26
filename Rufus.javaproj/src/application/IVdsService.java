package application;

public class IVdsService {
	private Object lpVtbl;
	
	public IVdsService(Object lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IVdsService() {
	}
	
	public Object getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(Object newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
