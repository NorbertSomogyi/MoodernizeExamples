package application;

/**
 * \struct _NV_ENC_SEI_PAYLOAD
 *  User SEI message
 */
public class _NV_ENC_SEI_PAYLOAD {
	private Object payloadSize;
	private Object payloadType;
	private Object payload;
	
	public _NV_ENC_SEI_PAYLOAD(Object payloadSize, Object payloadType, Object payload) {
		setPayloadSize(payloadSize);
		setPayloadType(payloadType);
		setPayload(payload);
	}
	public _NV_ENC_SEI_PAYLOAD() {
	}
	
	public Object getPayloadSize() {
		return payloadSize;
	}
	public void setPayloadSize(Object newPayloadSize) {
		payloadSize = newPayloadSize;
	}
	public Object getPayloadType() {
		return payloadType;
	}
	public void setPayloadType(Object newPayloadType) {
		payloadType = newPayloadType;
	}
	public Object getPayload() {
		return payload;
	}
	public void setPayload(Object newPayload) {
		payload = newPayload;
	}
}
