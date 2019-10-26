package application;

/**
 * \struct _NV_ENC_LOCK_INPUT_BUFFER
 * Uncompressed Input Buffer lock parameters.
 */
public class _NV_ENC_LOCK_INPUT_BUFFER {
	private Object version;
	private Object doNotWait;
	private Object reservedBitFields;
	private Object inputBuffer;
	private Object bufferDataPtr;
	private Object pitch;
	private Object reserved1;
	private Object reserved2;
	
	public _NV_ENC_LOCK_INPUT_BUFFER(Object version, Object doNotWait, Object reservedBitFields, Object inputBuffer, Object bufferDataPtr, Object pitch, Object reserved1, Object reserved2) {
		setVersion(version);
		setDoNotWait(doNotWait);
		setReservedBitFields(reservedBitFields);
		setInputBuffer(inputBuffer);
		setBufferDataPtr(bufferDataPtr);
		setPitch(pitch);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public _NV_ENC_LOCK_INPUT_BUFFER() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getDoNotWait() {
		return doNotWait;
	}
	public void setDoNotWait(Object newDoNotWait) {
		doNotWait = newDoNotWait;
	}
	public Object getReservedBitFields() {
		return reservedBitFields;
	}
	public void setReservedBitFields(Object newReservedBitFields) {
		reservedBitFields = newReservedBitFields;
	}
	public Object getInputBuffer() {
		return inputBuffer;
	}
	public void setInputBuffer(Object newInputBuffer) {
		inputBuffer = newInputBuffer;
	}
	public Object getBufferDataPtr() {
		return bufferDataPtr;
	}
	public void setBufferDataPtr(Object newBufferDataPtr) {
		bufferDataPtr = newBufferDataPtr;
	}
	public Object getPitch() {
		return pitch;
	}
	public void setPitch(Object newPitch) {
		pitch = newPitch;
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
