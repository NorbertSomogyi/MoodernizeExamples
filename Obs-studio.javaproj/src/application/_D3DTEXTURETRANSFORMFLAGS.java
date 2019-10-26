package application;

// blending using D3DRS_TWEENFACTOR
// one matrix is used with weight 1.0
// force 32-bit size enum
public enum _D3DTEXTURETRANSFORMFLAGS {
	D3DTTFF_DISABLE, 
	D3DTTFF_COUNT1, 
	D3DTTFF_COUNT2, 
	D3DTTFF_COUNT3, 
	D3DTTFF_COUNT4, 
	D3DTTFF_PROJECTED, 
	D3DTTFF_FORCE_DWORD
}
// texture coordinates are passed directly
// rasterizer should expect 1-D texture coords
// rasterizer should expect 2-D texture coords
// rasterizer should expect 3-D texture coords
// rasterizer should expect 4-D texture coords
// texcoords to be divided by COUNTth element
// Macros to set texture coordinate format bits in the FVF id
// Two floating point values
// One floating point value
