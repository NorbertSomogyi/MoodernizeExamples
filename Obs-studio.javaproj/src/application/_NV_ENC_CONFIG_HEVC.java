package application;

public class _NV_ENC_CONFIG_HEVC {
	private Object level;
	private Object tier;
	private _NV_ENC_HEVC_CUSIZE minCUSize;
	private _NV_ENC_HEVC_CUSIZE maxCUSize;
	private Object useConstrainedIntraPred;
	private Object disableDeblockAcrossSliceBoundary;
	private Object outputBufferingPeriodSEI;
	private Object outputPictureTimingSEI;
	private Object outputAUD;
	private Object enableLTR;
	private Object disableSPSPPS;
	private Object repeatSPSPPS;
	private Object enableIntraRefresh;
	private Object chromaFormatIDC;
	private Object pixelBitDepthMinus8;
	private Object reserved;
	private Object idrPeriod;
	private Object intraRefreshPeriod;
	private Object intraRefreshCnt;
	private Object maxNumRefFramesInDPB;
	private Object ltrNumFrames;
	private Object vpsId;
	private Object spsId;
	private Object ppsId;
	private Object sliceMode;
	private Object sliceModeData;
	private Object maxTemporalLayersMinus1;
	private Object hevcVUIParameters;
	private Object ltrTrustMode;
	private Object reserved1;
	private Object reserved2;
	
	public _NV_ENC_CONFIG_HEVC(Object level, Object tier, _NV_ENC_HEVC_CUSIZE minCUSize, _NV_ENC_HEVC_CUSIZE maxCUSize, Object useConstrainedIntraPred, Object disableDeblockAcrossSliceBoundary, Object outputBufferingPeriodSEI, Object outputPictureTimingSEI, Object outputAUD, Object enableLTR, Object disableSPSPPS, Object repeatSPSPPS, Object enableIntraRefresh, Object chromaFormatIDC, Object pixelBitDepthMinus8, Object reserved, Object idrPeriod, Object intraRefreshPeriod, Object intraRefreshCnt, Object maxNumRefFramesInDPB, Object ltrNumFrames, Object vpsId, Object spsId, Object ppsId, Object sliceMode, Object sliceModeData, Object maxTemporalLayersMinus1, Object hevcVUIParameters, Object ltrTrustMode, Object reserved1, Object reserved2) {
		setLevel(level);
		setTier(tier);
		setMinCUSize(minCUSize);
		setMaxCUSize(maxCUSize);
		setUseConstrainedIntraPred(useConstrainedIntraPred);
		setDisableDeblockAcrossSliceBoundary(disableDeblockAcrossSliceBoundary);
		setOutputBufferingPeriodSEI(outputBufferingPeriodSEI);
		setOutputPictureTimingSEI(outputPictureTimingSEI);
		setOutputAUD(outputAUD);
		setEnableLTR(enableLTR);
		setDisableSPSPPS(disableSPSPPS);
		setRepeatSPSPPS(repeatSPSPPS);
		setEnableIntraRefresh(enableIntraRefresh);
		setChromaFormatIDC(chromaFormatIDC);
		setPixelBitDepthMinus8(pixelBitDepthMinus8);
		setReserved(reserved);
		setIdrPeriod(idrPeriod);
		setIntraRefreshPeriod(intraRefreshPeriod);
		setIntraRefreshCnt(intraRefreshCnt);
		setMaxNumRefFramesInDPB(maxNumRefFramesInDPB);
		setLtrNumFrames(ltrNumFrames);
		setVpsId(vpsId);
		setSpsId(spsId);
		setPpsId(ppsId);
		setSliceMode(sliceMode);
		setSliceModeData(sliceModeData);
		setMaxTemporalLayersMinus1(maxTemporalLayersMinus1);
		setHevcVUIParameters(hevcVUIParameters);
		setLtrTrustMode(ltrTrustMode);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public _NV_ENC_CONFIG_HEVC() {
	}
	
	public Object getLevel() {
		return level;
	}
	public void setLevel(Object newLevel) {
		level = newLevel;
	}
	public Object getTier() {
		return tier;
	}
	public void setTier(Object newTier) {
		tier = newTier;
	}
	public _NV_ENC_HEVC_CUSIZE getMinCUSize() {
		return minCUSize;
	}
	public void setMinCUSize(_NV_ENC_HEVC_CUSIZE newMinCUSize) {
		minCUSize = newMinCUSize;
	}
	public _NV_ENC_HEVC_CUSIZE getMaxCUSize() {
		return maxCUSize;
	}
	public void setMaxCUSize(_NV_ENC_HEVC_CUSIZE newMaxCUSize) {
		maxCUSize = newMaxCUSize;
	}
	public Object getUseConstrainedIntraPred() {
		return useConstrainedIntraPred;
	}
	public void setUseConstrainedIntraPred(Object newUseConstrainedIntraPred) {
		useConstrainedIntraPred = newUseConstrainedIntraPred;
	}
	public Object getDisableDeblockAcrossSliceBoundary() {
		return disableDeblockAcrossSliceBoundary;
	}
	public void setDisableDeblockAcrossSliceBoundary(Object newDisableDeblockAcrossSliceBoundary) {
		disableDeblockAcrossSliceBoundary = newDisableDeblockAcrossSliceBoundary;
	}
	public Object getOutputBufferingPeriodSEI() {
		return outputBufferingPeriodSEI;
	}
	public void setOutputBufferingPeriodSEI(Object newOutputBufferingPeriodSEI) {
		outputBufferingPeriodSEI = newOutputBufferingPeriodSEI;
	}
	public Object getOutputPictureTimingSEI() {
		return outputPictureTimingSEI;
	}
	public void setOutputPictureTimingSEI(Object newOutputPictureTimingSEI) {
		outputPictureTimingSEI = newOutputPictureTimingSEI;
	}
	public Object getOutputAUD() {
		return outputAUD;
	}
	public void setOutputAUD(Object newOutputAUD) {
		outputAUD = newOutputAUD;
	}
	public Object getEnableLTR() {
		return enableLTR;
	}
	public void setEnableLTR(Object newEnableLTR) {
		enableLTR = newEnableLTR;
	}
	public Object getDisableSPSPPS() {
		return disableSPSPPS;
	}
	public void setDisableSPSPPS(Object newDisableSPSPPS) {
		disableSPSPPS = newDisableSPSPPS;
	}
	public Object getRepeatSPSPPS() {
		return repeatSPSPPS;
	}
	public void setRepeatSPSPPS(Object newRepeatSPSPPS) {
		repeatSPSPPS = newRepeatSPSPPS;
	}
	public Object getEnableIntraRefresh() {
		return enableIntraRefresh;
	}
	public void setEnableIntraRefresh(Object newEnableIntraRefresh) {
		enableIntraRefresh = newEnableIntraRefresh;
	}
	public Object getChromaFormatIDC() {
		return chromaFormatIDC;
	}
	public void setChromaFormatIDC(Object newChromaFormatIDC) {
		chromaFormatIDC = newChromaFormatIDC;
	}
	public Object getPixelBitDepthMinus8() {
		return pixelBitDepthMinus8;
	}
	public void setPixelBitDepthMinus8(Object newPixelBitDepthMinus8) {
		pixelBitDepthMinus8 = newPixelBitDepthMinus8;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getIdrPeriod() {
		return idrPeriod;
	}
	public void setIdrPeriod(Object newIdrPeriod) {
		idrPeriod = newIdrPeriod;
	}
	public Object getIntraRefreshPeriod() {
		return intraRefreshPeriod;
	}
	public void setIntraRefreshPeriod(Object newIntraRefreshPeriod) {
		intraRefreshPeriod = newIntraRefreshPeriod;
	}
	public Object getIntraRefreshCnt() {
		return intraRefreshCnt;
	}
	public void setIntraRefreshCnt(Object newIntraRefreshCnt) {
		intraRefreshCnt = newIntraRefreshCnt;
	}
	public Object getMaxNumRefFramesInDPB() {
		return maxNumRefFramesInDPB;
	}
	public void setMaxNumRefFramesInDPB(Object newMaxNumRefFramesInDPB) {
		maxNumRefFramesInDPB = newMaxNumRefFramesInDPB;
	}
	public Object getLtrNumFrames() {
		return ltrNumFrames;
	}
	public void setLtrNumFrames(Object newLtrNumFrames) {
		ltrNumFrames = newLtrNumFrames;
	}
	public Object getVpsId() {
		return vpsId;
	}
	public void setVpsId(Object newVpsId) {
		vpsId = newVpsId;
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
	public Object getMaxTemporalLayersMinus1() {
		return maxTemporalLayersMinus1;
	}
	public void setMaxTemporalLayersMinus1(Object newMaxTemporalLayersMinus1) {
		maxTemporalLayersMinus1 = newMaxTemporalLayersMinus1;
	}
	public Object getHevcVUIParameters() {
		return hevcVUIParameters;
	}
	public void setHevcVUIParameters(Object newHevcVUIParameters) {
		hevcVUIParameters = newHevcVUIParameters;
	}
	public Object getLtrTrustMode() {
		return ltrTrustMode;
	}
	public void setLtrTrustMode(Object newLtrTrustMode) {
		ltrTrustMode = newLtrTrustMode;
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
