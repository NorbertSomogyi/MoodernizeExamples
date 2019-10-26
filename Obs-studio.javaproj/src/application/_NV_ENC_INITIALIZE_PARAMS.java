package application;

/**
 * \struct _NV_ENC_INITIALIZE_PARAMS
 * Encode Session Initialization parameters.
 */
public class _NV_ENC_INITIALIZE_PARAMS {
	private Object version;
	private _GUID encodeGUID;
	private _GUID presetGUID;
	private Object encodeWidth;
	private Object encodeHeight;
	private Object darWidth;
	private Object darHeight;
	private Object frameRateNum;
	private Object frameRateDen;
	private Object enableEncodeAsync;
	private Object enablePTD;
	private Object reportSliceOffsets;
	private Object enableSubFrameWrite;
	private Object enableExternalMEHints;
	private Object enableMEOnlyMode;
	private Object enableWeightedPrediction;
	private Object reservedBitFields;
	private Object privDataSize;
	private Object privData;
	private _NV_ENC_CONFIG encodeConfig;
	private Object maxEncodeWidth;
	private Object maxEncodeHeight;
	private Object maxMEHintCountsPerBlock;
	private Object reserved;
	private Object reserved2;
	
	public _NV_ENC_INITIALIZE_PARAMS(Object version, _GUID encodeGUID, _GUID presetGUID, Object encodeWidth, Object encodeHeight, Object darWidth, Object darHeight, Object frameRateNum, Object frameRateDen, Object enableEncodeAsync, Object enablePTD, Object reportSliceOffsets, Object enableSubFrameWrite, Object enableExternalMEHints, Object enableMEOnlyMode, Object enableWeightedPrediction, Object reservedBitFields, Object privDataSize, Object privData, _NV_ENC_CONFIG encodeConfig, Object maxEncodeWidth, Object maxEncodeHeight, Object maxMEHintCountsPerBlock, Object reserved, Object reserved2) {
		setVersion(version);
		setEncodeGUID(encodeGUID);
		setPresetGUID(presetGUID);
		setEncodeWidth(encodeWidth);
		setEncodeHeight(encodeHeight);
		setDarWidth(darWidth);
		setDarHeight(darHeight);
		setFrameRateNum(frameRateNum);
		setFrameRateDen(frameRateDen);
		setEnableEncodeAsync(enableEncodeAsync);
		setEnablePTD(enablePTD);
		setReportSliceOffsets(reportSliceOffsets);
		setEnableSubFrameWrite(enableSubFrameWrite);
		setEnableExternalMEHints(enableExternalMEHints);
		setEnableMEOnlyMode(enableMEOnlyMode);
		setEnableWeightedPrediction(enableWeightedPrediction);
		setReservedBitFields(reservedBitFields);
		setPrivDataSize(privDataSize);
		setPrivData(privData);
		setEncodeConfig(encodeConfig);
		setMaxEncodeWidth(maxEncodeWidth);
		setMaxEncodeHeight(maxEncodeHeight);
		setMaxMEHintCountsPerBlock(maxMEHintCountsPerBlock);
		setReserved(reserved);
		setReserved2(reserved2);
	}
	public _NV_ENC_INITIALIZE_PARAMS() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public _GUID getEncodeGUID() {
		return encodeGUID;
	}
	public void setEncodeGUID(_GUID newEncodeGUID) {
		encodeGUID = newEncodeGUID;
	}
	public _GUID getPresetGUID() {
		return presetGUID;
	}
	public void setPresetGUID(_GUID newPresetGUID) {
		presetGUID = newPresetGUID;
	}
	public Object getEncodeWidth() {
		return encodeWidth;
	}
	public void setEncodeWidth(Object newEncodeWidth) {
		encodeWidth = newEncodeWidth;
	}
	public Object getEncodeHeight() {
		return encodeHeight;
	}
	public void setEncodeHeight(Object newEncodeHeight) {
		encodeHeight = newEncodeHeight;
	}
	public Object getDarWidth() {
		return darWidth;
	}
	public void setDarWidth(Object newDarWidth) {
		darWidth = newDarWidth;
	}
	public Object getDarHeight() {
		return darHeight;
	}
	public void setDarHeight(Object newDarHeight) {
		darHeight = newDarHeight;
	}
	public Object getFrameRateNum() {
		return frameRateNum;
	}
	public void setFrameRateNum(Object newFrameRateNum) {
		frameRateNum = newFrameRateNum;
	}
	public Object getFrameRateDen() {
		return frameRateDen;
	}
	public void setFrameRateDen(Object newFrameRateDen) {
		frameRateDen = newFrameRateDen;
	}
	public Object getEnableEncodeAsync() {
		return enableEncodeAsync;
	}
	public void setEnableEncodeAsync(Object newEnableEncodeAsync) {
		enableEncodeAsync = newEnableEncodeAsync;
	}
	public Object getEnablePTD() {
		return enablePTD;
	}
	public void setEnablePTD(Object newEnablePTD) {
		enablePTD = newEnablePTD;
	}
	public Object getReportSliceOffsets() {
		return reportSliceOffsets;
	}
	public void setReportSliceOffsets(Object newReportSliceOffsets) {
		reportSliceOffsets = newReportSliceOffsets;
	}
	public Object getEnableSubFrameWrite() {
		return enableSubFrameWrite;
	}
	public void setEnableSubFrameWrite(Object newEnableSubFrameWrite) {
		enableSubFrameWrite = newEnableSubFrameWrite;
	}
	public Object getEnableExternalMEHints() {
		return enableExternalMEHints;
	}
	public void setEnableExternalMEHints(Object newEnableExternalMEHints) {
		enableExternalMEHints = newEnableExternalMEHints;
	}
	public Object getEnableMEOnlyMode() {
		return enableMEOnlyMode;
	}
	public void setEnableMEOnlyMode(Object newEnableMEOnlyMode) {
		enableMEOnlyMode = newEnableMEOnlyMode;
	}
	public Object getEnableWeightedPrediction() {
		return enableWeightedPrediction;
	}
	public void setEnableWeightedPrediction(Object newEnableWeightedPrediction) {
		enableWeightedPrediction = newEnableWeightedPrediction;
	}
	public Object getReservedBitFields() {
		return reservedBitFields;
	}
	public void setReservedBitFields(Object newReservedBitFields) {
		reservedBitFields = newReservedBitFields;
	}
	public Object getPrivDataSize() {
		return privDataSize;
	}
	public void setPrivDataSize(Object newPrivDataSize) {
		privDataSize = newPrivDataSize;
	}
	public Object getPrivData() {
		return privData;
	}
	public void setPrivData(Object newPrivData) {
		privData = newPrivData;
	}
	public _NV_ENC_CONFIG getEncodeConfig() {
		return encodeConfig;
	}
	public void setEncodeConfig(_NV_ENC_CONFIG newEncodeConfig) {
		encodeConfig = newEncodeConfig;
	}
	public Object getMaxEncodeWidth() {
		return maxEncodeWidth;
	}
	public void setMaxEncodeWidth(Object newMaxEncodeWidth) {
		maxEncodeWidth = newMaxEncodeWidth;
	}
	public Object getMaxEncodeHeight() {
		return maxEncodeHeight;
	}
	public void setMaxEncodeHeight(Object newMaxEncodeHeight) {
		maxEncodeHeight = newMaxEncodeHeight;
	}
	public Object getMaxMEHintCountsPerBlock() {
		return maxMEHintCountsPerBlock;
	}
	public void setMaxMEHintCountsPerBlock(Object newMaxMEHintCountsPerBlock) {
		maxMEHintCountsPerBlock = newMaxMEHintCountsPerBlock;
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
