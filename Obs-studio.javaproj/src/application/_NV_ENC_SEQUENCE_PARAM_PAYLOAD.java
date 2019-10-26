package application;

/**
 * \struct _NV_ENC_SEQUENCE_PARAM_PAYLOAD
 * Sequence and picture paramaters payload.
 */
public class _NV_ENC_SEQUENCE_PARAM_PAYLOAD {
	private Object version;
	private Object inBufferSize;
	private Object spsId;
	private Object ppsId;
	private Object spsppsBuffer;
	private Object outSPSPPSPayloadSize;
	private Object reserved;
	private Object reserved2;
	
	public _NV_ENC_SEQUENCE_PARAM_PAYLOAD(Object version, Object inBufferSize, Object spsId, Object ppsId, Object spsppsBuffer, Object outSPSPPSPayloadSize, Object reserved, Object reserved2) {
		setVersion(version);
		setInBufferSize(inBufferSize);
		setSpsId(spsId);
		setPpsId(ppsId);
		setSpsppsBuffer(spsppsBuffer);
		setOutSPSPPSPayloadSize(outSPSPPSPayloadSize);
		setReserved(reserved);
		setReserved2(reserved2);
	}
	public _NV_ENC_SEQUENCE_PARAM_PAYLOAD() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getInBufferSize() {
		return inBufferSize;
	}
	public void setInBufferSize(Object newInBufferSize) {
		inBufferSize = newInBufferSize;
	}
	public Object getSpsId() {
		return spsId;
	}
	public void setSpsId(Object newSpsId) {
		spsId = newSpsId;
	}
	public Object getPpsId() {
		return ppsId;
	}
	public void setPpsId(Object newPpsId) {
		ppsId = newPpsId;
	}
	public Object getSpsppsBuffer() {
		return spsppsBuffer;
	}
	public void setSpsppsBuffer(Object newSpsppsBuffer) {
		spsppsBuffer = newSpsppsBuffer;
	}
	public Object getOutSPSPPSPayloadSize() {
		return outSPSPPSPayloadSize;
	}
	public void setOutSPSPPSPayloadSize(Object newOutSPSPPSPayloadSize) {
		outSPSPPSPayloadSize = newOutSPSPPSPayloadSize;
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
