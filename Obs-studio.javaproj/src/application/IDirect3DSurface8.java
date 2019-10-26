package application;

public class IDirect3DSurface8 {
	private IDirect3DSurface8Vtbl lpVtbl;
	
	public IDirect3DSurface8(IDirect3DSurface8Vtbl lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IDirect3DSurface8() {
	}
	
	public IDirect3DSurface8Vtbl getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(IDirect3DSurface8Vtbl newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
