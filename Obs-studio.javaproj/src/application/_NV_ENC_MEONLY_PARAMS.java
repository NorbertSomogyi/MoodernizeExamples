package application;

/**
 * \struct _NV_ENC_MEONLY_PARAMS
 * MEOnly parameters that need to be sent on a per motion estimation basis.
 * NV_ENC_MEONLY_PARAMS::meExternalHints is supported for H264 only.
 */
public class _NV_ENC_MEONLY_PARAMS {
	private Object version;
	private Object inputWidth;
	private Object inputHeight;
	private Object inputBuffer;
	private Object referenceFrame;
	private Object mvBuffer;
	private _NV_ENC_BUFFER_FORMAT bufferFmt;
	private Object completionEvent;
	private Object viewID;
	private Object meHintCountsPerBlock;
	private _NVENC_EXTERNAL_ME_HINT meExternalHints;
	private Object reserved1;
	private Object reserved2;
	
	public _NV_ENC_MEONLY_PARAMS(Object version, Object inputWidth, Object inputHeight, Object inputBuffer, Object referenceFrame, Object mvBuffer, _NV_ENC_BUFFER_FORMAT bufferFmt, Object completionEvent, Object viewID, Object meHintCountsPerBlock, _NVENC_EXTERNAL_ME_HINT meExternalHints, Object reserved1, Object reserved2) {
		setVersion(version);
		setInputWidth(inputWidth);
		setInputHeight(inputHeight);
		setInputBuffer(inputBuffer);
		setReferenceFrame(referenceFrame);
		setMvBuffer(mvBuffer);
		setBufferFmt(bufferFmt);
		setCompletionEvent(completionEvent);
		setViewID(viewID);
		setMeHintCountsPerBlock(meHintCountsPerBlock);
		setMeExternalHints(meExternalHints);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public _NV_ENC_MEONLY_PARAMS() {
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
	public Object getInputBuffer() {
		return inputBuffer;
	}
	public void setInputBuffer(Object newInputBuffer) {
		inputBuffer = newInputBuffer;
	}
	public Object getReferenceFrame() {
		return referenceFrame;
	}
	public void setReferenceFrame(Object newReferenceFrame) {
		referenceFrame = newReferenceFrame;
	}
	public Object getMvBuffer() {
		return mvBuffer;
	}
	public void setMvBuffer(Object newMvBuffer) {
		mvBuffer = newMvBuffer;
	}
	public _NV_ENC_BUFFER_FORMAT getBufferFmt() {
		return bufferFmt;
	}
	public void setBufferFmt(_NV_ENC_BUFFER_FORMAT newBufferFmt) {
		bufferFmt = newBufferFmt;
	}
	public Object getCompletionEvent() {
		return completionEvent;
	}
	public void setCompletionEvent(Object newCompletionEvent) {
		completionEvent = newCompletionEvent;
	}
	public Object getViewID() {
		return viewID;
	}
	public void setViewID(Object newViewID) {
		viewID = newViewID;
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
}
