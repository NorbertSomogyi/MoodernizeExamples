package application;

public class IEnumVdsObject {
	private Object lpVtbl;
	
	public IEnumVdsObject(Object lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IEnumVdsObject() {
	}
	
	public Object getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(Object newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
