package application;

public class IDirect3DBaseTexture8 {
	private IDirect3DBaseTexture8Vtbl lpVtbl;
	
	public IDirect3DBaseTexture8(IDirect3DBaseTexture8Vtbl lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IDirect3DBaseTexture8() {
	}
	
	public IDirect3DBaseTexture8Vtbl getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(IDirect3DBaseTexture8Vtbl newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
