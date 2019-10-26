package application;

public class IDirect3DVolumeTexture8 {
	private IDirect3DVolumeTexture8Vtbl lpVtbl;
	
	public IDirect3DVolumeTexture8(IDirect3DVolumeTexture8Vtbl lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IDirect3DVolumeTexture8() {
	}
	
	public IDirect3DVolumeTexture8Vtbl getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(IDirect3DVolumeTexture8Vtbl newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
