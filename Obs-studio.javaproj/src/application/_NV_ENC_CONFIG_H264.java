package application;

public class _NV_ENC_CONFIG_H264 {
	private Object enableTemporalSVC;
	private Object enableStereoMVC;
	private Object hierarchicalPFrames;
	private Object hierarchicalBFrames;
	private Object outputBufferingPeriodSEI;
	private Object outputPictureTimingSEI;
	private Object outputAUD;
	private Object disableSPSPPS;
	private Object outputFramePackingSEI;
	private Object outputRecoveryPointSEI;
	private Object enableIntraRefresh;
	private Object enableConstrainedEncoding;
	private Object repeatSPSPPS;
	private Object enableVFR;
	private Object enableLTR;
	private Object qpPrimeYZeroTransformBypassFlag;
	private Object useConstrainedIntraPred;
	private Object reservedBitFields;
	private Object level;
	private Object idrPeriod;
	private Object separateColourPlaneFlag;
	private Object disableDeblockingFilterIDC;
	private Object numTemporalLayers;
	private Object spsId;
	private Object ppsId;
	private _NV_ENC_H264_ADAPTIVE_TRANSFORM_MODE adaptiveTransformMode;
	private _NV_ENC_H264_FMO_MODE fmoMode;
	private _NV_ENC_H264_BDIRECT_MODE bdirectMode;
	private _NV_ENC_H264_ENTROPY_CODING_MODE entropyCodingMode;
	private _NV_ENC_STEREO_PACKING_MODE stereoMode;
	private Object intraRefreshPeriod;
	private Object intraRefreshCnt;
	private Object maxNumRefFrames;
	private Object sliceMode;
	private Object sliceModeData;
	private _NV_ENC_CONFIG_H264_VUI_PARAMETERS h264VUIParameters;
	private Object ltrNumFrames;
	private Object ltrTrustMode;
	private Object chromaFormatIDC;
	private Object maxTemporalLayers;
	private _NV_ENC_BFRAME_REF_MODE useBFramesAsRef;
	private Object reserved1;
	private Object reserved2;
	
	public _NV_ENC_CONFIG_H264(Object enableTemporalSVC, Object enableStereoMVC, Object hierarchicalPFrames, Object hierarchicalBFrames, Object outputBufferingPeriodSEI, Object outputPictureTimingSEI, Object outputAUD, Object disableSPSPPS, Object outputFramePackingSEI, Object outputRecoveryPointSEI, Object enableIntraRefresh, Object enableConstrainedEncoding, Object repeatSPSPPS, Object enableVFR, Object enableLTR, Object qpPrimeYZeroTransformBypassFlag, Object useConstrainedIntraPred, Object reservedBitFields, Object level, Object idrPeriod, Object separateColourPlaneFlag, Object disableDeblockingFilterIDC, Object numTemporalLayers, Object spsId, Object ppsId, _NV_ENC_H264_ADAPTIVE_TRANSFORM_MODE adaptiveTransformMode, _NV_ENC_H264_FMO_MODE fmoMode, _NV_ENC_H264_BDIRECT_MODE bdirectMode, _NV_ENC_H264_ENTROPY_CODING_MODE entropyCodingMode, _NV_ENC_STEREO_PACKING_MODE stereoMode, Object intraRefreshPeriod, Object intraRefreshCnt, Object maxNumRefFrames, Object sliceMode, Object sliceModeData, _NV_ENC_CONFIG_H264_VUI_PARAMETERS h264VUIParameters, Object ltrNumFrames, Object ltrTrustMode, Object chromaFormatIDC, Object maxTemporalLayers, _NV_ENC_BFRAME_REF_MODE useBFramesAsRef, Object reserved1, Object reserved2) {
		setEnableTemporalSVC(enableTemporalSVC);
		setEnableStereoMVC(enableStereoMVC);
		setHierarchicalPFrames(hierarchicalPFrames);
		setHierarchicalBFrames(hierarchicalBFrames);
		setOutputBufferingPeriodSEI(outputBufferingPeriodSEI);
		setOutputPictureTimingSEI(outputPictureTimingSEI);
		setOutputAUD(outputAUD);
		setDisableSPSPPS(disableSPSPPS);
		setOutputFramePackingSEI(outputFramePackingSEI);
		setOutputRecoveryPointSEI(outputRecoveryPointSEI);
		setEnableIntraRefresh(enableIntraRefresh);
		setEnableConstrainedEncoding(enableConstrainedEncoding);
		setRepeatSPSPPS(repeatSPSPPS);
		setEnableVFR(enableVFR);
		setEnableLTR(enableLTR);
		setQpPrimeYZeroTransformBypassFlag(qpPrimeYZeroTransformBypassFlag);
		setUseConstrainedIntraPred(useConstrainedIntraPred);
		setReservedBitFields(reservedBitFields);
		setLevel(level);
		setIdrPeriod(idrPeriod);
		setSeparateColourPlaneFlag(separateColourPlaneFlag);
		setDisableDeblockingFilterIDC(disableDeblockingFilterIDC);
		setNumTemporalLayers(numTemporalLayers);
		setSpsId(spsId);
		setPpsId(ppsId);
		setAdaptiveTransformMode(adaptiveTransformMode);
		setFmoMode(fmoMode);
		setBdirectMode(bdirectMode);
		setEntropyCodingMode(entropyCodingMode);
		setStereoMode(stereoMode);
		setIntraRefreshPeriod(intraRefreshPeriod);
		setIntraRefreshCnt(intraRefreshCnt);
		setMaxNumRefFrames(maxNumRefFrames);
		setSliceMode(sliceMode);
		setSliceModeData(sliceModeData);
		setH264VUIParameters(h264VUIParameters);
		setLtrNumFrames(ltrNumFrames);
		setLtrTrustMode(ltrTrustMode);
		setChromaFormatIDC(chromaFormatIDC);
		setMaxTemporalLayers(maxTemporalLayers);
		setUseBFramesAsRef(useBFramesAsRef);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public _NV_ENC_CONFIG_H264() {
	}
	
	public Object getEnableTemporalSVC() {
		return enableTemporalSVC;
	}
	public void setEnableTemporalSVC(Object newEnableTemporalSVC) {
		enableTemporalSVC = newEnableTemporalSVC;
	}
	public Object getEnableStereoMVC() {
		return enableStereoMVC;
	}
	public void setEnableStereoMVC(Object newEnableStereoMVC) {
		enableStereoMVC = newEnableStereoMVC;
	}
	public Object getHierarchicalPFrames() {
		return hierarchicalPFrames;
	}
	public void setHierarchicalPFrames(Object newHierarchicalPFrames) {
		hierarchicalPFrames = newHierarchicalPFrames;
	}
	public Object getHierarchicalBFrames() {
		return hierarchicalBFrames;
	}
	public void setHierarchicalBFrames(Object newHierarchicalBFrames) {
		hierarchicalBFrames = newHierarchicalBFrames;
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
	public Object getDisableSPSPPS() {
		return disableSPSPPS;
	}
	public void setDisableSPSPPS(Object newDisableSPSPPS) {
		disableSPSPPS = newDisableSPSPPS;
	}
	public Object getOutputFramePackingSEI() {
		return outputFramePackingSEI;
	}
	public void setOutputFramePackingSEI(Object newOutputFramePackingSEI) {
		outputFramePackingSEI = newOutputFramePackingSEI;
	}
	public Object getOutputRecoveryPointSEI() {
		return outputRecoveryPointSEI;
	}
	public void setOutputRecoveryPointSEI(Object newOutputRecoveryPointSEI) {
		outputRecoveryPointSEI = newOutputRecoveryPointSEI;
	}
	public Object getEnableIntraRefresh() {
		return enableIntraRefresh;
	}
	public void setEnableIntraRefresh(Object newEnableIntraRefresh) {
		enableIntraRefresh = newEnableIntraRefresh;
	}
	public Object getEnableConstrainedEncoding() {
		return enableConstrainedEncoding;
	}
	public void setEnableConstrainedEncoding(Object newEnableConstrainedEncoding) {
		enableConstrainedEncoding = newEnableConstrainedEncoding;
	}
	public Object getRepeatSPSPPS() {
		return repeatSPSPPS;
	}
	public void setRepeatSPSPPS(Object newRepeatSPSPPS) {
		repeatSPSPPS = newRepeatSPSPPS;
	}
	public Object getEnableVFR() {
		return enableVFR;
	}
	public void setEnableVFR(Object newEnableVFR) {
		enableVFR = newEnableVFR;
	}
	public Object getEnableLTR() {
		return enableLTR;
	}
	public void setEnableLTR(Object newEnableLTR) {
		enableLTR = newEnableLTR;
	}
	public Object getQpPrimeYZeroTransformBypassFlag() {
		return qpPrimeYZeroTransformBypassFlag;
	}
	public void setQpPrimeYZeroTransformBypassFlag(Object newQpPrimeYZeroTransformBypassFlag) {
		qpPrimeYZeroTransformBypassFlag = newQpPrimeYZeroTransformBypassFlag;
	}
	public Object getUseConstrainedIntraPred() {
		return useConstrainedIntraPred;
	}
	public void setUseConstrainedIntraPred(Object newUseConstrainedIntraPred) {
		useConstrainedIntraPred = newUseConstrainedIntraPred;
	}
	public Object getReservedBitFields() {
		return reservedBitFields;
	}
	public void setReservedBitFields(Object newReservedBitFields) {
		reservedBitFields = newReservedBitFields;
	}
	public Object getLevel() {
		return level;
	}
	public void setLevel(Object newLevel) {
		level = newLevel;
	}
	public Object getIdrPeriod() {
		return idrPeriod;
	}
	public void setIdrPeriod(Object newIdrPeriod) {
		idrPeriod = newIdrPeriod;
	}
	public Object getSeparateColourPlaneFlag() {
		return separateColourPlaneFlag;
	}
	public void setSeparateColourPlaneFlag(Object newSeparateColourPlaneFlag) {
		separateColourPlaneFlag = newSeparateColourPlaneFlag;
	}
	public Object getDisableDeblockingFilterIDC() {
		return disableDeblockingFilterIDC;
	}
	public void setDisableDeblockingFilterIDC(Object newDisableDeblockingFilterIDC) {
		disableDeblockingFilterIDC = newDisableDeblockingFilterIDC;
	}
	public Object getNumTemporalLayers() {
		return numTemporalLayers;
	}
	public void setNumTemporalLayers(Object newNumTemporalLayers) {
		numTemporalLayers = newNumTemporalLayers;
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
	public _NV_ENC_H264_ADAPTIVE_TRANSFORM_MODE getAdaptiveTransformMode() {
		return adaptiveTransformMode;
	}
	public void setAdaptiveTransformMode(_NV_ENC_H264_ADAPTIVE_TRANSFORM_MODE newAdaptiveTransformMode) {
		adaptiveTransformMode = newAdaptiveTransformMode;
	}
	public _NV_ENC_H264_FMO_MODE getFmoMode() {
		return fmoMode;
	}
	public void setFmoMode(_NV_ENC_H264_FMO_MODE newFmoMode) {
		fmoMode = newFmoMode;
	}
	public _NV_ENC_H264_BDIRECT_MODE getBdirectMode() {
		return bdirectMode;
	}
	public void setBdirectMode(_NV_ENC_H264_BDIRECT_MODE newBdirectMode) {
		bdirectMode = newBdirectMode;
	}
	public _NV_ENC_H264_ENTROPY_CODING_MODE getEntropyCodingMode() {
		return entropyCodingMode;
	}
	public void setEntropyCodingMode(_NV_ENC_H264_ENTROPY_CODING_MODE newEntropyCodingMode) {
		entropyCodingMode = newEntropyCodingMode;
	}
	public _NV_ENC_STEREO_PACKING_MODE getStereoMode() {
		return stereoMode;
	}
	public void setStereoMode(_NV_ENC_STEREO_PACKING_MODE newStereoMode) {
		stereoMode = newStereoMode;
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
	public Object getMaxNumRefFrames() {
		return maxNumRefFrames;
	}
	public void setMaxNumRefFrames(Object newMaxNumRefFrames) {
		maxNumRefFrames = newMaxNumRefFrames;
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
	public _NV_ENC_CONFIG_H264_VUI_PARAMETERS getH264VUIParameters() {
		return h264VUIParameters;
	}
	public void setH264VUIParameters(_NV_ENC_CONFIG_H264_VUI_PARAMETERS newH264VUIParameters) {
		h264VUIParameters = newH264VUIParameters;
	}
	public Object getLtrNumFrames() {
		return ltrNumFrames;
	}
	public void setLtrNumFrames(Object newLtrNumFrames) {
		ltrNumFrames = newLtrNumFrames;
	}
	public Object getLtrTrustMode() {
		return ltrTrustMode;
	}
	public void setLtrTrustMode(Object newLtrTrustMode) {
		ltrTrustMode = newLtrTrustMode;
	}
	public Object getChromaFormatIDC() {
		return chromaFormatIDC;
	}
	public void setChromaFormatIDC(Object newChromaFormatIDC) {
		chromaFormatIDC = newChromaFormatIDC;
	}
	public Object getMaxTemporalLayers() {
		return maxTemporalLayers;
	}
	public void setMaxTemporalLayers(Object newMaxTemporalLayers) {
		maxTemporalLayers = newMaxTemporalLayers;
	}
	public _NV_ENC_BFRAME_REF_MODE getUseBFramesAsRef() {
		return useBFramesAsRef;
	}
	public void setUseBFramesAsRef(_NV_ENC_BFRAME_REF_MODE newUseBFramesAsRef) {
		useBFramesAsRef = newUseBFramesAsRef;
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
