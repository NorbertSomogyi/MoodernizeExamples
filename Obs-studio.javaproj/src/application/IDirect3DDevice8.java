package application;

public class IDirect3DDevice8 {
	private IDirect3DDevice8Vtbl lpVtbl;
	
	public IDirect3DDevice8(IDirect3DDevice8Vtbl lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IDirect3DDevice8() {
	}
	
	public IDirect3DDevice8Vtbl getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(IDirect3DDevice8Vtbl newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
