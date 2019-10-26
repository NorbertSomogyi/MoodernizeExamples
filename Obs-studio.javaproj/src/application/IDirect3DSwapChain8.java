package application;

public class IDirect3DSwapChain8 {
	private IDirect3DSwapChain8Vtbl lpVtbl;
	
	public IDirect3DSwapChain8(IDirect3DSwapChain8Vtbl lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IDirect3DSwapChain8() {
	}
	
	public IDirect3DSwapChain8Vtbl getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(IDirect3DSwapChain8Vtbl newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
