package application;

/**
 * \struct _NV_ENC_STAT
 * Encode Stats structure.
 */
public class _NV_ENC_STAT {
	private Object version;
	private Object reserved;
	private Object outputBitStream;
	private Object bitStreamSize;
	private Object picType;
	private Object lastValidByteOffset;
	private Object sliceOffsets;
	private Object picIdx;
	private Object reserved1;
	private Object reserved2;
	
	public _NV_ENC_STAT(Object version, Object reserved, Object outputBitStream, Object bitStreamSize, Object picType, Object lastValidByteOffset, Object sliceOffsets, Object picIdx, Object reserved1, Object reserved2) {
		setVersion(version);
		setReserved(reserved);
		setOutputBitStream(outputBitStream);
		setBitStreamSize(bitStreamSize);
		setPicType(picType);
		setLastValidByteOffset(lastValidByteOffset);
		setSliceOffsets(sliceOffsets);
		setPicIdx(picIdx);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public _NV_ENC_STAT() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getOutputBitStream() {
		return outputBitStream;
	}
	public void setOutputBitStream(Object newOutputBitStream) {
		outputBitStream = newOutputBitStream;
	}
	public Object getBitStreamSize() {
		return bitStreamSize;
	}
	public void setBitStreamSize(Object newBitStreamSize) {
		bitStreamSize = newBitStreamSize;
	}
	public Object getPicType() {
		return picType;
	}
	public void setPicType(Object newPicType) {
		picType = newPicType;
	}
	public Object getLastValidByteOffset() {
		return lastValidByteOffset;
	}
	public void setLastValidByteOffset(Object newLastValidByteOffset) {
		lastValidByteOffset = newLastValidByteOffset;
	}
	public Object getSliceOffsets() {
		return sliceOffsets;
	}
	public void setSliceOffsets(Object newSliceOffsets) {
		sliceOffsets = newSliceOffsets;
	}
	public Object getPicIdx() {
		return picIdx;
	}
	public void setPicIdx(Object newPicIdx) {
		picIdx = newPicIdx;
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
