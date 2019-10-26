package application;

// source parameter swizzle
// pixel-shader swizzle ops
// source parameter modifiers
public enum _D3DSHADER_PARAM_SRCMOD_TYPE {
	D3DSPSM_NONE, 
	D3DSPSM_NEG, 
	D3DSPSM_BIAS, 
	D3DSPSM_BIASNEG, 
	D3DSPSM_SIGN, 
	D3DSPSM_SIGNNEG, 
	D3DSPSM_COMP, 
	D3DSPSM_X2, 
	D3DSPSM_X2NEG, 
	D3DSPSM_DZ, 
	D3DSPSM_DW, 
	D3DSPSM_FORCE_DWORD
}
// nop
// negate
// bias
// bias and negate
// sign
// sign and negate
// complement
// *2
// *2 and negate
// divide through by z component 
// divide through by w component
// force 32-bit size enum
// pixel shader version token
// vertex shader version token
