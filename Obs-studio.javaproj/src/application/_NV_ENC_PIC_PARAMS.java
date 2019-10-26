package application;

public class _NV_ENC_PIC_PARAMS {
	private Object version;
	private Object inputWidth;
	private Object inputHeight;
	private Object inputPitch;
	private Object encodePicFlags;
	private Object frameIdx;
	private Object inputTimeStamp;
	private Object inputDuration;
	private Object inputBuffer;
	private Object outputBitstream;
	private Object completionEvent;
	private _NV_ENC_BUFFER_FORMAT bufferFmt;
	private _NV_ENC_PIC_STRUCT pictureStruct;
	private _NV_ENC_PIC_TYPE pictureType;
	private _NV_ENC_CODEC_PIC_PARAMS codecPicParams;
	private Object meHintCountsPerBlock;
	private _NVENC_EXTERNAL_ME_HINT meExternalHints;
	private Object reserved1;
	private Object reserved2;
	private Object qpDeltaMap;
	private Object qpDeltaMapSize;
	private Object reservedBitFields;
	private Object meHintRefPicDist;
	private Object reserved3;
	private Object reserved4;
	
	public _NV_ENC_PIC_PARAMS(Object version, Object inputWidth, Object inputHeight, Object inputPitch, Object encodePicFlags, Object frameIdx, Object inputTimeStamp, Object inputDuration, Object inputBuffer, Object outputBitstream, Object completionEvent, _NV_ENC_BUFFER_FORMAT bufferFmt, _NV_ENC_PIC_STRUCT pictureStruct, _NV_ENC_PIC_TYPE pictureType, _NV_ENC_CODEC_PIC_PARAMS codecPicParams, Object meHintCountsPerBlock, _NVENC_EXTERNAL_ME_HINT meExternalHints, Object reserved1, Object reserved2, Object qpDeltaMap, Object qpDeltaMapSize, Object reservedBitFields, Object meHintRefPicDist, Object reserved3, Object reserved4) {
		setVersion(version);
		setInputWidth(inputWidth);
		setInputHeight(inputHeight);
		setInputPitch(inputPitch);
		setEncodePicFlags(encodePicFlags);
		setFrameIdx(frameIdx);
		setInputTimeStamp(inputTimeStamp);
		setInputDuration(inputDuration);
		setInputBuffer(inputBuffer);
		setOutputBitstream(outputBitstream);
		setCompletionEvent(completionEvent);
		setBufferFmt(bufferFmt);
		setPictureStruct(pictureStruct);
		setPictureType(pictureType);
		setCodecPicParams(codecPicParams);
		setMeHintCountsPerBlock(meHintCountsPerBlock);
		setMeExternalHints(meExternalHints);
		setReserved1(reserved1);
		setReserved2(reserved2);
		setQpDeltaMap(qpDeltaMap);
		setQpDeltaMapSize(qpDeltaMapSize);
		setReservedBitFields(reservedBitFields);
		setMeHintRefPicDist(meHintRefPicDist);
		setReserved3(reserved3);
		setReserved4(reserved4);
	}
	public _NV_ENC_PIC_PARAMS() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getInputWidth() {
		return inputWidth;
	}
	public void setInputWidth(Object newInputWidth) {
		inputWidth = newInputWidth;
	}
	public Object getInputHeight() {
		return inputHeight;
	}
	public void setInputHeight(Object newInputHeight) {
		inputHeight = newInputHeight;
	}
	public Object getInputPitch() {
		return inputPitch;
	}
	public void setInputPitch(Object newInputPitch) {
		inputPitch = newInputPitch;
	}
	public Object getEncodePicFlags() {
		return encodePicFlags;
	}
	public void setEncodePicFlags(Object newEncodePicFlags) {
		encodePicFlags = newEncodePicFlags;
	}
	public Object getFrameIdx() {
		return frameIdx;
	}
	public void setFrameIdx(Object newFrameIdx) {
		frameIdx = newFrameIdx;
	}
	public Object getInputTimeStamp() {
		return inputTimeStamp;
	}
	public void setInputTimeStamp(Object newInputTimeStamp) {
		inputTimeStamp = newInputTimeStamp;
	}
	public Object getInputDuration() {
		return inputDuration;
	}
	public void setInputDuration(Object newInputDuration) {
		inputDuration = newInputDuration;
	}
	public Object getInputBuffer() {
		return inputBuffer;
	}
	public void setInputBuffer(Object newInputBuffer) {
		inputBuffer = newInputBuffer;
	}
	public Object getOutputBitstream() {
		return outputBitstream;
	}
	public void setOutputBitstream(Object newOutputBitstream) {
		outputBitstream = newOutputBitstream;
	}
	public Object getCompletionEvent() {
		return completionEvent;
	}
	public void setCompletionEvent(Object newCompletionEvent) {
		completionEvent = newCompletionEvent;
	}
	public _NV_ENC_BUFFER_FORMAT getBufferFmt() {
		return bufferFmt;
	}
	public void setBufferFmt(_NV_ENC_BUFFER_FORMAT newBufferFmt) {
		bufferFmt = newBufferFmt;
	}
	public _NV_ENC_PIC_STRUCT getPictureStruct() {
		return pictureStruct;
	}
	public void setPictureStruct(_NV_ENC_PIC_STRUCT newPictureStruct) {
		pictureStruct = newPictureStruct;
	}
	public _NV_ENC_PIC_TYPE getPictureType() {
		return pictureType;
	}
	public void setPictureType(_NV_ENC_PIC_TYPE newPictureType) {
		pictureType = newPictureType;
	}
	public _NV_ENC_CODEC_PIC_PARAMS getCodecPicParams() {
		return codecPicParams;
	}
	public void setCodecPicParams(_NV_ENC_CODEC_PIC_PARAMS newCodecPicParams) {
		codecPicParams = newCodecPicParams;
	}
	public Object getMeHintCountsPerBlock() {
		return meHintCountsPerBlock;
	}
	public void setMeHintCountsPerBlock(Object newMeHintCountsPerBlock) {
		meHintCountsPerBlock = newMeHintCountsPerBlock;
	}
	public _NVENC_EXTERNAL_ME_HINT getMeExternalHints() {
		return meExternalHints;
	}
	public void setMeExternalHints(_NVENC_EXTERNAL_ME_HINT newMeExternalHints) {
		meExternalHints = newMeExternalHints;
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
	public Object getQpDeltaMap() {
		return qpDeltaMap;
	}
	public void setQpDeltaMap(Object newQpDeltaMap) {
		qpDeltaMap = newQpDeltaMap;
	}
	public Object getQpDeltaMapSize() {
		return qpDeltaMapSize;
	}
	public void setQpDeltaMapSize(Object newQpDeltaMapSize) {
		qpDeltaMapSize = newQpDeltaMapSize;
	}
	public Object getReservedBitFields() {
		return reservedBitFields;
	}
	public void setReservedBitFields(Object newReservedBitFields) {
		reservedBitFields = newReservedBitFields;
	}
	public Object getMeHintRefPicDist() {
		return meHintRefPicDist;
	}
	public void setMeHintRefPicDist(Object newMeHintRefPicDist) {
		meHintRefPicDist = newMeHintRefPicDist;
	}
	public Object getReserved3() {
		return reserved3;
	}
	public void setReserved3(Object newReserved3) {
		reserved3 = newReserved3;
	}
	public Object getReserved4() {
		return reserved4;
	}
	public void setReserved4(Object newReserved4) {
		reserved4 = newReserved4;
	}
}
