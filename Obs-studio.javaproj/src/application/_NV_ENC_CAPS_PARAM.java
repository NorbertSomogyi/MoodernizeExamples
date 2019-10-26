package application;

public class _NV_ENC_CAPS_PARAM {
	private Object version;
	private _NV_ENC_CAPS capsToQuery;
	private Object reserved;
	
	public _NV_ENC_CAPS_PARAM(Object version, _NV_ENC_CAPS capsToQuery, Object reserved) {
		setVersion(version);
		setCapsToQuery(capsToQuery);
		setReserved(reserved);
	}
	public _NV_ENC_CAPS_PARAM() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public _NV_ENC_CAPS getCapsToQuery() {
		return capsToQuery;
	}
	public void setCapsToQuery(_NV_ENC_CAPS newCapsToQuery) {
		capsToQuery = newCapsToQuery;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}
