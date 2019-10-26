package application;

public class _NV_ENC_CREATE_MV_BUFFER {
	private Object version;
	private Object mvBuffer;
	private Object reserved1;
	private Object reserved2;
	
	public _NV_ENC_CREATE_MV_BUFFER(Object version, Object mvBuffer, Object reserved1, Object reserved2) {
		setVersion(version);
		setMvBuffer(mvBuffer);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public _NV_ENC_CREATE_MV_BUFFER() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getMvBuffer() {
		return mvBuffer;
	}
	public void setMvBuffer(Object newMvBuffer) {
		mvBuffer = newMvBuffer;
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
