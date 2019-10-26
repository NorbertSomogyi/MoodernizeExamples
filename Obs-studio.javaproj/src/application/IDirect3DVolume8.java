package application;

public class IDirect3DVolume8 {
	private IDirect3DVolume8Vtbl lpVtbl;
	
	public IDirect3DVolume8(IDirect3DVolume8Vtbl lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IDirect3DVolume8() {
	}
	
	public IDirect3DVolume8Vtbl getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(IDirect3DVolume8Vtbl newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
/****************************************************************************
 * Flags for SetPrivateData method on all D3D8 interfaces
 *
 * The passed pointer is an IUnknown ptr. The SizeOfData argument to SetPrivateData
 * must be set to sizeof(IUnknown*). Direct3D will call AddRef through this
 * pointer and Release when the private data is destroyed. The data will be
 * destroyed when another SetPrivateData with the same GUID is set, when
 * FreePrivateData is called, or when the D3D8 object is freed.
 ****************************************************************************/
/****************************************************************************
 *
 * Parameter for IDirect3D8 Enum and GetCaps8 functions to get the info for
 * the current mode only.
 *
 ****************************************************************************/
/****************************************************************************
 *
 * Flags for IDirect3D8::CreateDevice's BehaviorFlags
 *
 ****************************************************************************/
/****************************************************************************
 *
 * Parameter for IDirect3D8::CreateDevice's iAdapter
 *
 ****************************************************************************/
/****************************************************************************
 *
 * Flags for IDirect3D8::EnumAdapters
 *
 ****************************************************************************/
/****************************************************************************
 *
 * Maximum number of back-buffers supported in DX8
 *
 ****************************************************************************/
/****************************************************************************
 *
 * Flags for IDirect3DDevice8::SetGammaRamp
 *
 ****************************************************************************/
/****************************************************************************
 *
 * Flags for IDirect3DDevice8::SetCursorPosition
 *
 ****************************************************************************/
/****************************************************************************
 *
 * Flags for DrawPrimitive/DrawIndexedPrimitive
 *   Also valid for Begin/BeginIndexed
 *   Also valid for VertexBuffer::CreateVertexBuffer
 ****************************************************************************/
/*
 *  DirectDraw error codes
 */
/*
 * Direct3D Errors
 */
/* (DIRECT3D_VERSION >= 0x0800) */
/* _D3D_H_ */
