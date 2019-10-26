package application;

// Values, used with D3DTSS_TEXCOORDINDEX, to specify that the vertex data(position
// and normal in the camera space) should be taken as texture coordinates
// Low 16 bits are used to specify texture coordinate index, to take the WRAP mode from
//
/*
 * Enumerations for COLOROP and ALPHAOP texture blending operations set in
 * texture processing stage controls in D3DTSS.
 */
public enum _D3DTEXTUREOP {
	D3DTOP_DISABLE, 
	D3DTOP_SELECTARG1, 
	D3DTOP_SELECTARG2, 
	D3DTOP_MODULATE, 
	D3DTOP_MODULATE2X, 
	D3DTOP_MODULATE4X, 
	D3DTOP_ADD, 
	D3DTOP_ADDSIGNED, 
	D3DTOP_ADDSIGNED2X, 
	D3DTOP_SUBTRACT, 
	D3DTOP_ADDSMOOTH, 
	D3DTOP_BLENDDIFFUSEALPHA, 
	D3DTOP_BLENDTEXTUREALPHA, 
	D3DTOP_BLENDFACTORALPHA, 
	D3DTOP_BLENDTEXTUREALPHAPM, 
	D3DTOP_BLENDCURRENTALPHA, 
	D3DTOP_PREMODULATE, 
	D3DTOP_MODULATEALPHA_ADDCOLOR, 
	D3DTOP_MODULATECOLOR_ADDALPHA, 
	D3DTOP_MODULATEINVALPHA_ADDCOLOR, 
	D3DTOP_MODULATEINVCOLOR_ADDALPHA, 
	D3DTOP_BUMPENVMAP, 
	D3DTOP_BUMPENVMAPLUMINANCE, 
	D3DTOP_DOTPRODUCT3, 
	D3DTOP_MULTIPLYADD, 
	D3DTOP_LERP, 
	D3DTOP_FORCE_DWORD
}
// Control
// disables stage
// the default
// Modulate
// multiply args together
// multiply and  1 bit
// multiply and  2 bits
// Add
// add arguments together
// add with -0.5 bias
// as above but left  1 bit
// Arg1 - Arg2, with no saturation
// add 2 args, subtract product
// Arg1 + Arg2 - Arg1*Arg2
// = Arg1 + (1-Arg1)*Arg2
// Linear alpha blend: Arg1*(Alpha) + Arg2*(1-Alpha)
// iterated alpha
// texture alpha
// alpha from D3DRS_TEXTUREFACTOR
// Linear alpha blend with pre-multiplied arg1 input: Arg1 + Arg2*(1-Alpha)
// texture alpha
// by alpha of current color
// Specular mapping
// modulate with next texture before use
// Arg1.RGB + Arg1.A*Arg2.RGB
// COLOROP only
// Arg1.RGB*Arg2.RGB + Arg1.A
// COLOROP only
// (1-Arg1.A)*Arg2.RGB + Arg1.RGB
// COLOROP only
// (1-Arg1.RGB)*Arg2.RGB + Arg1.A
