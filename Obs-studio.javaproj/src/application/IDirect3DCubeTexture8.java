package application;

public class IDirect3DCubeTexture8 {
	private IDirect3DCubeTexture8Vtbl lpVtbl;
	
	public IDirect3DCubeTexture8(IDirect3DCubeTexture8Vtbl lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IDirect3DCubeTexture8() {
	}
	
	public IDirect3DCubeTexture8Vtbl getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(IDirect3DCubeTexture8Vtbl newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
