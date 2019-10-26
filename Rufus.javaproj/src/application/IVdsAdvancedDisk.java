package application;

public class IVdsAdvancedDisk {
	private Object lpVtbl;
	
	public IVdsAdvancedDisk(Object lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IVdsAdvancedDisk() {
	}
	
	public Object getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(Object newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
