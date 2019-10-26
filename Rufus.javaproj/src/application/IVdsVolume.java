package application;

public class IVdsVolume {
	private Object lpVtbl;
	
	public IVdsVolume(Object lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IVdsVolume() {
	}
	
	public Object getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(Object newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
