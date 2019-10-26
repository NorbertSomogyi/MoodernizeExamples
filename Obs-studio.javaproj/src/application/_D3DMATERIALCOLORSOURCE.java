package application;

// BOOL - set to do FSAA with multisample buffer
// DWORD - per-sample enable/disable
// Sets whether patch edges will use float style tessellation
// Number of segments per edge when drawing patches
// DEBUG ONLY - token to debug monitor
// per-channel write enable
// float tween factor
// D3DBLENDOP setting
// NPatch position interpolation order. D3DORDER_LINEAR or D3DORDER_CUBIC (default)
// NPatch normal interpolation order. D3DORDER_LINEAR (default) or D3DORDER_QUADRATIC
// Values for material source
public enum _D3DMATERIALCOLORSOURCE {
	D3DMCS_MATERIAL, 
	D3DMCS_COLOR1, 
	D3DMCS_COLOR2, 
	D3DMCS_FORCE_DWORD
}
// Color from material is used
// Diffuse vertex color is used
// Specular vertex color is used
// force 32-bit size enum
// Bias to apply to the texture coordinate set to apply a wrap to.
