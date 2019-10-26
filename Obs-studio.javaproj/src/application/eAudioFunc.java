package application;

public enum eAudioFunc {
	eFakeAudioEnum, 
	eMFXAudioCORE_SyncOperation, 
	eMFXAudioENCODE_Query, 
	eMFXAudioENCODE_QueryIOSize, 
	eMFXAudioENCODE_Init, 
	eMFXAudioENCODE_Reset, 
	eMFXAudioENCODE_Close, 
	eMFXAudioENCODE_GetAudioParam, 
	eMFXAudioENCODE_EncodeFrameAsync, 
	eMFXAudioDECODE_Query, 
	eMFXAudioDECODE_DecodeHeader, 
	eMFXAudioDECODE_Init, 
	eMFXAudioDECODE_Reset, 
	eMFXAudioDECODE_Close, 
	eMFXAudioDECODE_QueryIOSize, 
	eMFXAudioDECODE_GetAudioParam, 
	eMFXAudioDECODE_DecodeFrameAsync, 
	eMFXAudioUSER_Register, 
	eMFXAudioUSER_Unregister, 
	eMFXAudioUSER_ProcessFrameAsync, 
	eAudioFuncTotal
}
// declare max buffer length for regsitry key name
