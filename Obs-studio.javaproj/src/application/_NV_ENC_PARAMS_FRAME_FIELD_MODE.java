package application;

// =========================================================================================
// =========================================================================================
// GUID
// _WIN32
// =========================================================================================
// Encode Codec GUIDS supported by the NvEncodeAPI interface.
// =========================================================================================
// {6BC82762-4E63-4ca4-AA85-1E50F321F6BF}
// {790CDC88-4522-4d7b-9425-BDA9975F7603}
// =========================================================================================
// *   Encode Profile GUIDS supported by the NvEncodeAPI interface.
// =========================================================================================
// {BFD6F8E7-233C-4341-8B3E-4818523803F4}
// {0727BCAA-78C4-4c83-8C2F-EF3DFF267C6A}
// {60B5C1D4-67FE-4790-94D5-C4726D7B6E6D}
// {E7CBC309-4F7A-4b89-AF2A-D537C92BE310}
// {7AC663CB-A598-4960-B844-339B261A7D52}
// {40847BF5-33F7-4601-9084-E8FE3C1DB8B7}
// {CE788D20-AAA9-4318-92BB-AC7E858C8D36}
// {B405AFAC-F32B-417B-89C4-9ABEED3E5978}
// {AEC1BD87-E85B-48f2-84C3-98BCA6285072}
// {B514C39A-B55B-40fa-878F-F1253B4DFDEC}
// {fa4d2b6c-3a5b-411a-8018-0a3f5e3c9be5}
// For HEVC Main 444 8 bit and HEVC Main 444 10 bit profiles only
// {51ec32b5-1b4c-453c-9cbd-b616bd621341}
// =========================================================================================
// *   Preset GUIDS supported by the NvEncodeAPI interface.
// =========================================================================================
// {B2DFB705-4EBD-4C49-9B5F-24A777D3E587}
// {60E4C59F-E846-4484-A56D-CD45BE9FDDF6}
// {34DBA71D-A77B-4B8F-9C3E-B6D5DA24C012}
// {82E3E450-BDBB-4e40-989C-82A90DF9EF32}
// {49DF21C5-6DFA-4feb-9787-6ACC9EFFB726}
// {C5F733B9-EA97-4cf9-BEC2-BF78A74FD105}
// {67082A44-4BAD-48FA-98EA-93056D150A58}
// {D5BFB716-C604-44e7-9BB8-DEA5510FC3AC}
// {149998E7-2364-411d-82EF-179888093409}
/**
 * Input frame encode modes
 */
public enum _NV_ENC_PARAMS_FRAME_FIELD_MODE {
	NV_ENC_PARAMS_FRAME_FIELD_MODE_FRAME, 
	NV_ENC_PARAMS_FRAME_FIELD_MODE_FIELD, 
	NV_ENC_PARAMS_FRAME_FIELD_MODE_MBAFF
}
