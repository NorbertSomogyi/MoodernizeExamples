package application;

/*==========================================================================;
 *
 *  Copyright (C) Microsoft Corporation.  All Rights Reserved.
 *
 *  File:   d3d8.h
 *  Content:    Direct3D include file
 *
 ****************************************************************************/
//DIRECT3D_VERSION
// include this file content only if compiling for DX8 interfaces
/* This identifier is passed to Direct3DCreate8 in order to ensure that an
 * application was built against the correct header files. This number is
 * incremented whenever a header (or other) change would require applications
 * to be rebuilt. If the version doesn't match, Direct3DCreate8 will fail.
 * (The number itself has no meaning.)*/
/*
 * Interface IID's
 */
/* IID_IDirect3D8 */
/* {1DD9E8DA-1C77-4d40-B0CF-98FEFDFF9512} */
/* IID_IDirect3DDevice8 */
/* {7385E5DF-8FE8-41D5-86B6-D7B48547B6CF} */
/* IID_IDirect3DResource8 */
/* {1B36BB7B-09B7-410a-B445-7D1430D7B33F} */
/* IID_IDirect3DBaseTexture8 */
/* {B4211CFA-51B9-4a9f-AB78-DB99B2BB678E} */
/* IID_IDirect3DTexture8 */
/* {E4CDD575-2866-4f01-B12E-7EECE1EC9358} */
/* IID_IDirect3DCubeTexture8 */
/* {3EE5B968-2ACA-4c34-8BB5-7E0C3D19B750} */
/* IID_IDirect3DVolumeTexture8 */
/* {4B8AAAFA-140F-42ba-9131-597EAFAA2EAD} */
/* IID_IDirect3DVertexBuffer8 */
/* {8AEEEAC7-05F9-44d4-B591-000B0DF1CB95} */
/* IID_IDirect3DIndexBuffer8 */
/* {0E689C9A-053D-44a0-9D92-DB0E3D750F86} */
/* IID_IDirect3DSurface8 */
/* {B96EEBCA-B326-4ea5-882F-2FF5BAE021DD} */
/* IID_IDirect3DVolume8 */
/* {BD7349F5-14F1-42e4-9C79-972380DB40C0} */
/* IID_IDirect3DSwapChain8 */
/* {928C088B-76B9-4C6B-A536-A590853876CD} */
public class IDirect3D8 {
	private IDirect3D8Vtbl lpVtbl;
	
	public IDirect3D8(IDirect3D8Vtbl lpVtbl) {
		setLpVtbl(lpVtbl);
	}
	public IDirect3D8() {
	}
	
	public IDirect3D8Vtbl getLpVtbl() {
		return lpVtbl;
	}
	public void setLpVtbl(IDirect3D8Vtbl newLpVtbl) {
		lpVtbl = newLpVtbl;
	}
}
