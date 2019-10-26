package application;

// load data into vertex shader constant memory
//
// _ConstantAddress [0..95] - address of constant array to begin filling data
// _Count [0..15] - number of constant vectors to load (4 DWORDs each)
// followed by 4*_Count DWORDS of data
//
// enable tessellator generated normals
//
// _VertexRegisterIn  [0..15] address of vertex register whose input stream
//                            will be used in normal computation
// _VertexRegisterOut [0..15] address of vertex register to output the normal to
//
// enable tessellator generated surface parameters
//
// _VertexRegister [0..15] address of vertex register to output parameters
//
// Generates END token
//
// Generates NOP token
// bit declarations for _Type fields
// 1D float expanded to (value, 0., 0., 1.)
// 2D float expanded to (value, value, 0., 1.)
// 3D float expanded to (value, value, value, 1.)
// 4D float
// 4D packed unsigned bytes mapped to 0. to 1. range
// Input is in D3DCOLOR format (ARGB) expanded to (R, G, B, A)
// 4D unsigned byte
// 2D signed short expanded to (value, value, 0., 1.)
// 4D signed short
// assignments of vertex input registers for fixed function vertex shader
//
// Maximum supported number of texture coordinate sets
//
// Instruction Token Bit Definitions
//
public enum _D3DSHADER_INSTRUCTION_OPCODE_TYPE {
	D3DSIO_NOP, 
	D3DSIO_MOV, 
	D3DSIO_ADD, 
	D3DSIO_SUB, 
	D3DSIO_MAD, 
	D3DSIO_MUL, 
	D3DSIO_RCP, 
	D3DSIO_RSQ, 
	D3DSIO_DP3, 
	D3DSIO_DP4, 
	D3DSIO_MIN, 
	D3DSIO_MAX, 
	D3DSIO_SLT, 
	D3DSIO_SGE, 
	D3DSIO_EXP, 
	D3DSIO_LOG, 
	D3DSIO_LIT, 
	D3DSIO_DST, 
	D3DSIO_LRP, 
	D3DSIO_FRC, 
	D3DSIO_M4x4, 
	D3DSIO_M4x3, 
	D3DSIO_M3x4, 
	D3DSIO_M3x3, 
	D3DSIO_M3x2, 
	D3DSIO_TEXCOORD, 
	D3DSIO_TEXKILL, 
	D3DSIO_TEX, 
	D3DSIO_TEXBEM, 
	D3DSIO_TEXBEML, 
	D3DSIO_TEXREG2AR, 
	D3DSIO_TEXREG2GB, 
	D3DSIO_TEXM3x2PAD, 
	D3DSIO_TEXM3x2TEX, 
	D3DSIO_TEXM3x3PAD, 
	D3DSIO_TEXM3x3TEX, 
	D3DSIO_TEXM3x3DIFF, 
	D3DSIO_TEXM3x3SPEC, 
	D3DSIO_TEXM3x3VSPEC, 
	D3DSIO_EXPP, 
	D3DSIO_LOGP, 
	D3DSIO_CND, 
	D3DSIO_DEF, 
	D3DSIO_TEXREG2RGB, 
	D3DSIO_TEXDP3TEX, 
	D3DSIO_TEXM3x2DEPTH, 
	D3DSIO_TEXDP3, 
	D3DSIO_TEXM3x3, 
	D3DSIO_TEXDEPTH, 
	D3DSIO_CMP, 
	D3DSIO_BEM, 
	D3DSIO_PHASE, 
	D3DSIO_COMMENT, 
	D3DSIO_END, 
	D3DSIO_FORCE_DWORD
}
// PS/VS
// PS/VS
// PS/VS
// PS
// PS/VS
// PS/VS
// VS
// VS
// PS/VS
// PS/VS
// VS
// VS
// VS
// VS
// VS
// VS
// VS
// VS
// PS
// VS
// VS
// VS
// VS
// VS
// VS
// PS
// PS
// PS
// PS
// PS
// PS
// PS
// PS
// PS
// PS
// PS
// PS
// PS
// PS
// VS
