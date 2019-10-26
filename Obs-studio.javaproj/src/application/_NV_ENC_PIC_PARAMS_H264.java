package application;

/**
 * \struct _NV_ENC_PIC_PARAMS_H264
 * H264 specific enc pic params. sent on a per frame basis.
 */
public class _NV_ENC_PIC_PARAMS_H264 {
	private Object displayPOCSyntax;
	private Object reserved3;
	private Object refPicFlag;
	private Object colourPlaneId;
	private Object forceIntraRefreshWithFrameCnt;
	private Object constrainedFrame;
	private Object sliceModeDataUpdate;
	private Object ltrMarkFrame;
	private Object ltrUseFrames;
	private Object reservedBitFields;
	private Object sliceTypeData;
	private Object sliceTypeArrayCnt;
	private Object seiPayloadArrayCnt;
	private _NV_ENC_SEI_PAYLOAD seiPayloadArray;
	private Object sliceMode;
	private Object sliceModeData;
	private Object ltrMarkFrameIdx;
	private Object ltrUseFrameBitmap;
	private Object ltrUsageMode;
	private Object reserved;
	private Object reserved2;
	
	public _NV_ENC_PIC_PARAMS_H264(Object displayPOCSyntax, Object reserved3, Object refPicFlag, Object colourPlaneId, Object forceIntraRefreshWithFrameCnt, Object constrainedFrame, Object sliceModeDataUpdate, Object ltrMarkFrame, Object ltrUseFrames, Object reservedBitFields, Object sliceTypeData, Object sliceTypeArrayCnt, Object seiPayloadArrayCnt, _NV_ENC_SEI_PAYLOAD seiPayloadArray, Object sliceMode, Object sliceModeData, Object ltrMarkFrameIdx, Object ltrUseFrameBitmap, Object ltrUsageMode, Object reserved, Object reserved2) {
		setDisplayPOCSyntax(displayPOCSyntax);
		setReserved3(reserved3);
		setRefPicFlag(refPicFlag);
		setColourPlaneId(colourPlaneId);
		setForceIntraRefreshWithFrameCnt(forceIntraRefreshWithFrameCnt);
		setConstrainedFrame(constrainedFrame);
		setSliceModeDataUpdate(sliceModeDataUpdate);
		setLtrMarkFrame(ltrMarkFrame);
		setLtrUseFrames(ltrUseFrames);
		setReservedBitFields(reservedBitFields);
		setSliceTypeData(sliceTypeData);
		setSliceTypeArrayCnt(sliceTypeArrayCnt);
		setSeiPayloadArrayCnt(seiPayloadArrayCnt);
		setSeiPayloadArray(seiPayloadArray);
		setSliceMode(sliceMode);
		setSliceModeData(sliceModeData);
		setLtrMarkFrameIdx(ltrMarkFrameIdx);
		setLtrUseFrameBitmap(ltrUseFrameBitmap);
		setLtrUsageMode(ltrUsageMode);
		setReserved(reserved);
		setReserved2(reserved2);
	}
	public _NV_ENC_PIC_PARAMS_H264() {
	}
	
	public Object getDisplayPOCSyntax() {
		return displayPOCSyntax;
	}
	public void setDisplayPOCSyntax(Object newDisplayPOCSyntax) {
		displayPOCSyntax = newDisplayPOCSyntax;
	}
	public Object getReserved3() {
		return reserved3;
	}
	public void setReserved3(Object newReserved3) {
		reserved3 = newReserved3;
	}
	public Object getRefPicFlag() {
		return refPicFlag;
	}
	public void setRefPicFlag(Object newRefPicFlag) {
		refPicFlag = newRefPicFlag;
	}
	public Object getColourPlaneId() {
		return colourPlaneId;
	}
	public void setColourPlaneId(Object newColourPlaneId) {
		colourPlaneId = newColourPlaneId;
	}
	public Object getForceIntraRefreshWithFrameCnt() {
		return forceIntraRefreshWithFrameCnt;
	}
	public void setForceIntraRefreshWithFrameCnt(Object newForceIntraRefreshWithFrameCnt) {
		forceIntraRefreshWithFrameCnt = newForceIntraRefreshWithFrameCnt;
	}
	public Object getConstrainedFrame() {
		return constrainedFrame;
	}
	public void setConstrainedFrame(Object newConstrainedFrame) {
		constrainedFrame = newConstrainedFrame;
	}
	public Object getSliceModeDataUpdate() {
		return sliceModeDataUpdate;
	}
	public void setSliceModeDataUpdate(Object newSliceModeDataUpdate) {
		sliceModeDataUpdate = newSliceModeDataUpdate;
	}
	public Object getLtrMarkFrame() {
		return ltrMarkFrame;
	}
	public void setLtrMarkFrame(Object newLtrMarkFrame) {
		ltrMarkFrame = newLtrMarkFrame;
	}
	public Object getLtrUseFrames() {
		return ltrUseFrames;
	}
	public void setLtrUseFrames(Object newLtrUseFrames) {
		ltrUseFrames = newLtrUseFrames;
	}
	public Object getReservedBitFields() {
		return reservedBitFields;
	}
	public void setReservedBitFields(Object newReservedBitFields) {
		reservedBitFields = newReservedBitFields;
	}
	public Object getSliceTypeData() {
		return sliceTypeData;
	}
	public void setSliceTypeData(Object newSliceTypeData) {
		sliceTypeData = newSliceTypeData;
	}
	public Object getSliceTypeArrayCnt() {
		return sliceTypeArrayCnt;
	}
	public void setSliceTypeArrayCnt(Object newSliceTypeArrayCnt) {
		sliceTypeArrayCnt = newSliceTypeArrayCnt;
	}
	public Object getSeiPayloadArrayCnt() {
		return seiPayloadArrayCnt;
	}
	public void setSeiPayloadArrayCnt(Object newSeiPayloadArrayCnt) {
		seiPayloadArrayCnt = newSeiPayloadArrayCnt;
	}
	public _NV_ENC_SEI_PAYLOAD getSeiPayloadArray() {
		return seiPayloadArray;
	}
	public void setSeiPayloadArray(_NV_ENC_SEI_PAYLOAD newSeiPayloadArray) {
		seiPayloadArray = newSeiPayloadArray;
	}
	public Object getSliceMode() {
		return sliceMode;
	}
	public void setSliceMode(Object newSliceMode) {
		sliceMode = newSliceMode;
	}
	public Object getSliceModeData() {
		return sliceModeData;
	}
	public void setSliceModeData(Object newSliceModeData) {
		sliceModeData = newSliceModeData;
	}
	public Object getLtrMarkFrameIdx() {
		return ltrMarkFrameIdx;
	}
	public void setLtrMarkFrameIdx(Object newLtrMarkFrameIdx) {
		ltrMarkFrameIdx = newLtrMarkFrameIdx;
	}
	public Object getLtrUseFrameBitmap() {
		return ltrUseFrameBitmap;
	}
	public void setLtrUseFrameBitmap(Object newLtrUseFrameBitmap) {
		ltrUseFrameBitmap = newLtrUseFrameBitmap;
	}
	public Object getLtrUsageMode() {
		return ltrUsageMode;
	}
	public void setLtrUsageMode(Object newLtrUsageMode) {
		ltrUsageMode = newLtrUsageMode;
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
