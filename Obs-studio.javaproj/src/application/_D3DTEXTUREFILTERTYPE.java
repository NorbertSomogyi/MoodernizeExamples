package application;

// COLOROP only
// Bump mapping
// per pixel env map perturbation
// with luminance channel
// This can do either diffuse or specular bump mapping with correct input.
// Performs the function (Arg1.R*Arg2.R + Arg1.G*Arg2.G + Arg1.B*Arg2.B)
// where each component has been scaled and offset to make it signed.
// The result is replicated into all four (including alpha) channels.
// This is a valid COLOROP only.
// Triadic ops
// Arg0 + Arg1*Arg2
// (Arg0)*Arg1 + (1-Arg0)*Arg2
// mask for arg selector
// select diffuse color (read only)
// select stage destination register (read/write)
// select texture color (read only)
// select D3DRS_TEXTUREFACTOR (read only)
// select specular color (read only)
// select temporary register color (read/write)
// take 1.0 - x (read modifier)
// replicate alpha to color components (read modifier)
//
// Values for D3DTSS_***FILTER texture stage states
//
public enum _D3DTEXTUREFILTERTYPE {
	D3DTEXF_NONE, 
	D3DTEXF_POINT, 
	D3DTEXF_LINEAR, 
	D3DTEXF_ANISOTROPIC, 
	D3DTEXF_FLATCUBIC, 
	D3DTEXF_GAUSSIANCUBIC, 
	D3DTEXF_FORCE_DWORD
}
// filtering disabled (valid for mip filter only)
// nearest
// linear interpolation
// anisotropic
// cubic
// different cubic kernel
// force 32-bit size enum
//-------------------------------------------------------------------
// Flexible vertex format bits
//
// 4 reserved bits
//---------------------------------------------------------------------
// Vertex Shaders
//
