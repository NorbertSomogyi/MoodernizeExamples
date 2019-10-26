package application;

public class IDirect3DResource8 {
	private IDirect3DResource8Vtbl lpVtbl;
	
	public IDirect3DResource8(IDirect3DResource8Vtbl lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IDirect3DResource8() {
	}
	
	public IDirect3DResource8Vtbl getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(IDirect3DResource8Vtbl newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
