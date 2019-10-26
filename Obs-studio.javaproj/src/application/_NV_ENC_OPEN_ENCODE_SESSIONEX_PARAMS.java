package application;

/**
 * Encoder Session Creation parameters
 */
public class _NV_ENC_OPEN_ENCODE_SESSIONEX_PARAMS {
	private Object version;
	private _NV_ENC_DEVICE_TYPE deviceType;
	private Object device;
	private Object reserved;
	private Object apiVersion;
	private Object reserved1;
	private Object reserved2;
	
	public _NV_ENC_OPEN_ENCODE_SESSIONEX_PARAMS(Object version, _NV_ENC_DEVICE_TYPE deviceType, Object device, Object reserved, Object apiVersion, Object reserved1, Object reserved2) {
		setVersion(version);
		setDeviceType(deviceType);
		setDevice(device);
		setReserved(reserved);
		setApiVersion(apiVersion);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public _NV_ENC_OPEN_ENCODE_SESSIONEX_PARAMS() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public _NV_ENC_DEVICE_TYPE getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(_NV_ENC_DEVICE_TYPE newDeviceType) {
		deviceType = newDeviceType;
	}
	public Object getDevice() {
		return device;
	}
	public void setDevice(Object newDevice) {
		device = newDevice;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getApiVersion() {
		return apiVersion;
	}
	public void setApiVersion(Object newApiVersion) {
		apiVersion = newApiVersion;
	}
	public Object getReserved1() {
		return reserved1;
	}
	public void setReserved1(Object newReserved1) {
		reserved1 = newReserved1;
	}
	public Object getReserved2() {
		return reserved2;
	}
	public void setReserved2(Object newReserved2) {
		reserved2 = newReserved2;
	}
}
