package application;

/**
 * \struct _NV_ENC_RECONFIGURE_PARAMS
 * Encode Session Reconfigured parameters.
 */
public class _NV_ENC_RECONFIGURE_PARAMS {
	private Object version;
	private _NV_ENC_INITIALIZE_PARAMS reInitEncodeParams;
	private Object resetEncoder;
	private Object forceIDR;
	private Object reserved;
	
	public _NV_ENC_RECONFIGURE_PARAMS(Object version, _NV_ENC_INITIALIZE_PARAMS reInitEncodeParams, Object resetEncoder, Object forceIDR, Object reserved) {
		setVersion(version);
		setReInitEncodeParams(reInitEncodeParams);
		setResetEncoder(resetEncoder);
		setForceIDR(forceIDR);
		setReserved(reserved);
	}
	public _NV_ENC_RECONFIGURE_PARAMS() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public _NV_ENC_INITIALIZE_PARAMS getReInitEncodeParams() {
		return reInitEncodeParams;
	}
	public void setReInitEncodeParams(_NV_ENC_INITIALIZE_PARAMS newReInitEncodeParams) {
		reInitEncodeParams = newReInitEncodeParams;
	}
	public Object getResetEncoder() {
		return resetEncoder;
	}
	public void setResetEncoder(Object newResetEncoder) {
		resetEncoder = newResetEncoder;
	}
	public Object getForceIDR() {
		return forceIDR;
	}
	public void setForceIDR(Object newForceIDR) {
		forceIDR = newForceIDR;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}
