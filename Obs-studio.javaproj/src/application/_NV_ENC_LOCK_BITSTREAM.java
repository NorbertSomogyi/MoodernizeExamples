package application;

/**
 * \struct _NV_ENC_LOCK_BITSTREAM
 * Bitstream buffer lock parameters.
 */
public class _NV_ENC_LOCK_BITSTREAM {
	private Object version;
	private Object doNotWait;
	private Object ltrFrame;
	private Object reservedBitFields;
	private Object outputBitstream;
	private Object sliceOffsets;
	private Object frameIdx;
	private Object hwEncodeStatus;
	private Object numSlices;
	private Object bitstreamSizeInBytes;
	private Object outputTimeStamp;
	private Object outputDuration;
	private Object bitstreamBufferPtr;
	private _NV_ENC_PIC_TYPE pictureType;
	private _NV_ENC_PIC_STRUCT pictureStruct;
	private Object frameAvgQP;
	private Object frameSatd;
	private Object ltrFrameIdx;
	private Object ltrFrameBitmap;
	private Object reserved;
	private Object reserved2;
	
	public _NV_ENC_LOCK_BITSTREAM(Object version, Object doNotWait, Object ltrFrame, Object reservedBitFields, Object outputBitstream, Object sliceOffsets, Object frameIdx, Object hwEncodeStatus, Object numSlices, Object bitstreamSizeInBytes, Object outputTimeStamp, Object outputDuration, Object bitstreamBufferPtr, _NV_ENC_PIC_TYPE pictureType, _NV_ENC_PIC_STRUCT pictureStruct, Object frameAvgQP, Object frameSatd, Object ltrFrameIdx, Object ltrFrameBitmap, Object reserved, Object reserved2) {
		setVersion(version);
		setDoNotWait(doNotWait);
		setLtrFrame(ltrFrame);
		setReservedBitFields(reservedBitFields);
		setOutputBitstream(outputBitstream);
		setSliceOffsets(sliceOffsets);
		setFrameIdx(frameIdx);
		setHwEncodeStatus(hwEncodeStatus);
		setNumSlices(numSlices);
		setBitstreamSizeInBytes(bitstreamSizeInBytes);
		setOutputTimeStamp(outputTimeStamp);
		setOutputDuration(outputDuration);
		setBitstreamBufferPtr(bitstreamBufferPtr);
		setPictureType(pictureType);
		setPictureStruct(pictureStruct);
		setFrameAvgQP(frameAvgQP);
		setFrameSatd(frameSatd);
		setLtrFrameIdx(ltrFrameIdx);
		setLtrFrameBitmap(ltrFrameBitmap);
		setReserved(reserved);
		setReserved2(reserved2);
	}
	public _NV_ENC_LOCK_BITSTREAM() {
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
	public Object getLtrFrame() {
		return ltrFrame;
	}
	public void setLtrFrame(Object newLtrFrame) {
		ltrFrame = newLtrFrame;
	}
	public Object getReservedBitFields() {
		return reservedBitFields;
	}
	public void setReservedBitFields(Object newReservedBitFields) {
		reservedBitFields = newReservedBitFields;
	}
	public Object getOutputBitstream() {
		return outputBitstream;
	}
	public void setOutputBitstream(Object newOutputBitstream) {
		outputBitstream = newOutputBitstream;
	}
	public Object getSliceOffsets() {
		return sliceOffsets;
	}
	public void setSliceOffsets(Object newSliceOffsets) {
		sliceOffsets = newSliceOffsets;
	}
	public Object getFrameIdx() {
		return frameIdx;
	}
	public void setFrameIdx(Object newFrameIdx) {
		frameIdx = newFrameIdx;
	}
	public Object getHwEncodeStatus() {
		return hwEncodeStatus;
	}
	public void setHwEncodeStatus(Object newHwEncodeStatus) {
		hwEncodeStatus = newHwEncodeStatus;
	}
	public Object getNumSlices() {
		return numSlices;
	}
	public void setNumSlices(Object newNumSlices) {
		numSlices = newNumSlices;
	}
	public Object getBitstreamSizeInBytes() {
		return bitstreamSizeInBytes;
	}
	public void setBitstreamSizeInBytes(Object newBitstreamSizeInBytes) {
		bitstreamSizeInBytes = newBitstreamSizeInBytes;
	}
	public Object getOutputTimeStamp() {
		return outputTimeStamp;
	}
	public void setOutputTimeStamp(Object newOutputTimeStamp) {
		outputTimeStamp = newOutputTimeStamp;
	}
	public Object getOutputDuration() {
		return outputDuration;
	}
	public void setOutputDuration(Object newOutputDuration) {
		outputDuration = newOutputDuration;
	}
	public Object getBitstreamBufferPtr() {
		return bitstreamBufferPtr;
	}
	public void setBitstreamBufferPtr(Object newBitstreamBufferPtr) {
		bitstreamBufferPtr = newBitstreamBufferPtr;
	}
	public _NV_ENC_PIC_TYPE getPictureType() {
		return pictureType;
	}
	public void setPictureType(_NV_ENC_PIC_TYPE newPictureType) {
		pictureType = newPictureType;
	}
	public _NV_ENC_PIC_STRUCT getPictureStruct() {
		return pictureStruct;
	}
	public void setPictureStruct(_NV_ENC_PIC_STRUCT newPictureStruct) {
		pictureStruct = newPictureStruct;
	}
	public Object getFrameAvgQP() {
		return frameAvgQP;
	}
	public void setFrameAvgQP(Object newFrameAvgQP) {
		frameAvgQP = newFrameAvgQP;
	}
	public Object getFrameSatd() {
		return frameSatd;
	}
	public void setFrameSatd(Object newFrameSatd) {
		frameSatd = newFrameSatd;
	}
	public Object getLtrFrameIdx() {
		return ltrFrameIdx;
	}
	public void setLtrFrameIdx(Object newLtrFrameIdx) {
		ltrFrameIdx = newLtrFrameIdx;
	}
	public Object getLtrFrameBitmap() {
		return ltrFrameBitmap;
	}
	public void setLtrFrameBitmap(Object newLtrFrameBitmap) {
		ltrFrameBitmap = newLtrFrameBitmap;
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
