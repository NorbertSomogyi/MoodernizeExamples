package application;

public class _NV_ENC_CONFIG {
	private Object version;
	private _GUID profileGUID;
	private Object gopLength;
	private Object frameIntervalP;
	private Object monoChromeEncoding;
	private _NV_ENC_PARAMS_FRAME_FIELD_MODE frameFieldMode;
	private _NV_ENC_MV_PRECISION mvPrecision;
	private _NV_ENC_RC_PARAMS rcParams;
	private _NV_ENC_CODEC_CONFIG encodeCodecConfig;
	private Object reserved;
	private Object reserved2;
	
	public _NV_ENC_CONFIG(Object version, _GUID profileGUID, Object gopLength, Object frameIntervalP, Object monoChromeEncoding, _NV_ENC_PARAMS_FRAME_FIELD_MODE frameFieldMode, _NV_ENC_MV_PRECISION mvPrecision, _NV_ENC_RC_PARAMS rcParams, _NV_ENC_CODEC_CONFIG encodeCodecConfig, Object reserved, Object reserved2) {
		setVersion(version);
		setProfileGUID(profileGUID);
		setGopLength(gopLength);
		setFrameIntervalP(frameIntervalP);
		setMonoChromeEncoding(monoChromeEncoding);
		setFrameFieldMode(frameFieldMode);
		setMvPrecision(mvPrecision);
		setRcParams(rcParams);
		setEncodeCodecConfig(encodeCodecConfig);
		setReserved(reserved);
		setReserved2(reserved2);
	}
	public _NV_ENC_CONFIG() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public _GUID getProfileGUID() {
		return profileGUID;
	}
	public void setProfileGUID(_GUID newProfileGUID) {
		profileGUID = newProfileGUID;
	}
	public Object getGopLength() {
		return gopLength;
	}
	public void setGopLength(Object newGopLength) {
		gopLength = newGopLength;
	}
	public Object getFrameIntervalP() {
		return frameIntervalP;
	}
	public void setFrameIntervalP(Object newFrameIntervalP) {
		frameIntervalP = newFrameIntervalP;
	}
	public Object getMonoChromeEncoding() {
		return monoChromeEncoding;
	}
	public void setMonoChromeEncoding(Object newMonoChromeEncoding) {
		monoChromeEncoding = newMonoChromeEncoding;
	}
	public _NV_ENC_PARAMS_FRAME_FIELD_MODE getFrameFieldMode() {
		return frameFieldMode;
	}
	public void setFrameFieldMode(_NV_ENC_PARAMS_FRAME_FIELD_MODE newFrameFieldMode) {
		frameFieldMode = newFrameFieldMode;
	}
	public _NV_ENC_MV_PRECISION getMvPrecision() {
		return mvPrecision;
	}
	public void setMvPrecision(_NV_ENC_MV_PRECISION newMvPrecision) {
		mvPrecision = newMvPrecision;
	}
	public _NV_ENC_RC_PARAMS getRcParams() {
		return rcParams;
	}
	public void setRcParams(_NV_ENC_RC_PARAMS newRcParams) {
		rcParams = newRcParams;
	}
	public _NV_ENC_CODEC_CONFIG getEncodeCodecConfig() {
		return encodeCodecConfig;
	}
	public void setEncodeCodecConfig(_NV_ENC_CODEC_CONFIG newEncodeCodecConfig) {
		encodeCodecConfig = newEncodeCodecConfig;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getReserved2() {
		return reserved2;
	}
	public void setReserved2(Object newReserved2) {
		reserved2 = newReserved2;
	}
}
