package application;

public class IDirect3DVertexBuffer8 {
	private IDirect3DVertexBuffer8Vtbl lpVtbl;
	
	public IDirect3DVertexBuffer8(IDirect3DVertexBuffer8Vtbl lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IDirect3DVertexBuffer8() {
	}
	
	public IDirect3DVertexBuffer8Vtbl getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(IDirect3DVertexBuffer8Vtbl newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
