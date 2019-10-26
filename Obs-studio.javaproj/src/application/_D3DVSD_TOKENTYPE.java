package application;

public enum _D3DVSD_TOKENTYPE {
	D3DVSD_TOKEN_NOP, 
	D3DVSD_TOKEN_STREAM, 
	D3DVSD_TOKEN_STREAMDATA, 
	D3DVSD_TOKEN_TESSELLATOR, 
	D3DVSD_TOKEN_CONSTMEM, 
	D3DVSD_TOKEN_EXT, 
	D3DVSD_TOKEN_END, 
	D3DVSD_FORCE_DWORD
}
// NOP or extension
// stream selector
// stream data definition (map to vertex input memory)
// vertex input memory from tessellator
// constant memory from shader
// extension
// end-of-array (requires all DWORD bits to be 1)
// force 32-bit size enum
// macros for generation of CreateVertexShader Declaration token array
// Set current stream
// _StreamNumber [0..(MaxStreams-1)] stream to get data from
//
// Set tessellator stream
//
// bind single vertex register to vertex element from vertex stream
//
// _VertexRegister [0..15] address of the vertex register
// _Type [D3DVSDT_*] dimensionality and arithmetic data type
// Skip _DWORDCount DWORDs in vertex
//
