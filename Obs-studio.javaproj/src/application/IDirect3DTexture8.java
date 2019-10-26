package application;

public class IDirect3DTexture8 {
	private IDirect3DTexture8Vtbl lpVtbl;
	
	public IDirect3DTexture8(IDirect3DTexture8Vtbl lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IDirect3DTexture8() {
	}
	
	public IDirect3DTexture8Vtbl getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(IDirect3DTexture8Vtbl newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
