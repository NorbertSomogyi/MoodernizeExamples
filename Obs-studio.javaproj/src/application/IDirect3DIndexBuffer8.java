package application;

public class IDirect3DIndexBuffer8 {
	private IDirect3DIndexBuffer8Vtbl lpVtbl;
	
	public IDirect3DIndexBuffer8(IDirect3DIndexBuffer8Vtbl lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IDirect3DIndexBuffer8() {
	}
	
	public IDirect3DIndexBuffer8Vtbl getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(IDirect3DIndexBuffer8Vtbl newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
