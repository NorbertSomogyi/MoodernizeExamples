package application;

public class _NV_ENC_RC_PARAMS {
	private Object version;
	private _NV_ENC_PARAMS_RC_MODE rateControlMode;
	private _NV_ENC_QP constQP;
	private Object averageBitRate;
	private Object maxBitRate;
	private Object vbvBufferSize;
	private Object vbvInitialDelay;
	private Object enableMinQP;
	private Object enableMaxQP;
	private Object enableInitialRCQP;
	private Object enableAQ;
	private Object reservedBitField1;
	private Object enableLookahead;
	private Object disableIadapt;
	private Object disableBadapt;
	private Object enableTemporalAQ;
	private Object zeroReorderDelay;
	private Object enableNonRefP;
	private Object strictGOPTarget;
	private Object aqStrength;
	private Object reservedBitFields;
	private _NV_ENC_QP minQP;
	private _NV_ENC_QP maxQP;
	private _NV_ENC_QP initialRCQP;
	private Object temporallayerIdxMask;
	private Object temporalLayerQP;
	private Object targetQuality;
	private Object targetQualityLSB;
	private Object lookaheadDepth;
	private Object reserved1;
	private _NV_ENC_QP_MAP_MODE qpMapMode;
	private Object reserved;
	
	public _NV_ENC_RC_PARAMS(Object version, _NV_ENC_PARAMS_RC_MODE rateControlMode, _NV_ENC_QP constQP, Object averageBitRate, Object maxBitRate, Object vbvBufferSize, Object vbvInitialDelay, Object enableMinQP, Object enableMaxQP, Object enableInitialRCQP, Object enableAQ, Object reservedBitField1, Object enableLookahead, Object disableIadapt, Object disableBadapt, Object enableTemporalAQ, Object zeroReorderDelay, Object enableNonRefP, Object strictGOPTarget, Object aqStrength, Object reservedBitFields, _NV_ENC_QP minQP, _NV_ENC_QP maxQP, _NV_ENC_QP initialRCQP, Object temporallayerIdxMask, Object temporalLayerQP, Object targetQuality, Object targetQualityLSB, Object lookaheadDepth, Object reserved1, _NV_ENC_QP_MAP_MODE qpMapMode, Object reserved) {
		setVersion(version);
		setRateControlMode(rateControlMode);
		setConstQP(constQP);
		setAverageBitRate(averageBitRate);
		setMaxBitRate(maxBitRate);
		setVbvBufferSize(vbvBufferSize);
		setVbvInitialDelay(vbvInitialDelay);
		setEnableMinQP(enableMinQP);
		setEnableMaxQP(enableMaxQP);
		setEnableInitialRCQP(enableInitialRCQP);
		setEnableAQ(enableAQ);
		setReservedBitField1(reservedBitField1);
		setEnableLookahead(enableLookahead);
		setDisableIadapt(disableIadapt);
		setDisableBadapt(disableBadapt);
		setEnableTemporalAQ(enableTemporalAQ);
		setZeroReorderDelay(zeroReorderDelay);
		setEnableNonRefP(enableNonRefP);
		setStrictGOPTarget(strictGOPTarget);
		setAqStrength(aqStrength);
		setReservedBitFields(reservedBitFields);
		setMinQP(minQP);
		setMaxQP(maxQP);
		setInitialRCQP(initialRCQP);
		setTemporallayerIdxMask(temporallayerIdxMask);
		setTemporalLayerQP(temporalLayerQP);
		setTargetQuality(targetQuality);
		setTargetQualityLSB(targetQualityLSB);
		setLookaheadDepth(lookaheadDepth);
		setReserved1(reserved1);
		setQpMapMode(qpMapMode);
		setReserved(reserved);
	}
	public _NV_ENC_RC_PARAMS() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public _NV_ENC_PARAMS_RC_MODE getRateControlMode() {
		return rateControlMode;
	}
	public void setRateControlMode(_NV_ENC_PARAMS_RC_MODE newRateControlMode) {
		rateControlMode = newRateControlMode;
	}
	public _NV_ENC_QP getConstQP() {
		return constQP;
	}
	public void setConstQP(_NV_ENC_QP newConstQP) {
		constQP = newConstQP;
	}
	public Object getAverageBitRate() {
		return averageBitRate;
	}
	public void setAverageBitRate(Object newAverageBitRate) {
		averageBitRate = newAverageBitRate;
	}
	public Object getMaxBitRate() {
		return maxBitRate;
	}
	public void setMaxBitRate(Object newMaxBitRate) {
		maxBitRate = newMaxBitRate;
	}
	public Object getVbvBufferSize() {
		return vbvBufferSize;
	}
	public void setVbvBufferSize(Object newVbvBufferSize) {
		vbvBufferSize = newVbvBufferSize;
	}
	public Object getVbvInitialDelay() {
		return vbvInitialDelay;
	}
	public void setVbvInitialDelay(Object newVbvInitialDelay) {
		vbvInitialDelay = newVbvInitialDelay;
	}
	public Object getEnableMinQP() {
		return enableMinQP;
	}
	public void setEnableMinQP(Object newEnableMinQP) {
		enableMinQP = newEnableMinQP;
	}
	public Object getEnableMaxQP() {
		return enableMaxQP;
	}
	public void setEnableMaxQP(Object newEnableMaxQP) {
		enableMaxQP = newEnableMaxQP;
	}
	public Object getEnableInitialRCQP() {
		return enableInitialRCQP;
	}
	public void setEnableInitialRCQP(Object newEnableInitialRCQP) {
		enableInitialRCQP = newEnableInitialRCQP;
	}
	public Object getEnableAQ() {
		return enableAQ;
	}
	public void setEnableAQ(Object newEnableAQ) {
		enableAQ = newEnableAQ;
	}
	public Object getReservedBitField1() {
		return reservedBitField1;
	}
	public void setReservedBitField1(Object newReservedBitField1) {
		reservedBitField1 = newReservedBitField1;
	}
	public Object getEnableLookahead() {
		return enableLookahead;
	}
	public void setEnableLookahead(Object newEnableLookahead) {
		enableLookahead = newEnableLookahead;
	}
	public Object getDisableIadapt() {
		return disableIadapt;
	}
	public void setDisableIadapt(Object newDisableIadapt) {
		disableIadapt = newDisableIadapt;
	}
	public Object getDisableBadapt() {
		return disableBadapt;
	}
	public void setDisableBadapt(Object newDisableBadapt) {
		disableBadapt = newDisableBadapt;
	}
	public Object getEnableTemporalAQ() {
		return enableTemporalAQ;
	}
	public void setEnableTemporalAQ(Object newEnableTemporalAQ) {
		enableTemporalAQ = newEnableTemporalAQ;
	}
	public Object getZeroReorderDelay() {
		return zeroReorderDelay;
	}
	public void setZeroReorderDelay(Object newZeroReorderDelay) {
		zeroReorderDelay = newZeroReorderDelay;
	}
	public Object getEnableNonRefP() {
		return enableNonRefP;
	}
	public void setEnableNonRefP(Object newEnableNonRefP) {
		enableNonRefP = newEnableNonRefP;
	}
	public Object getStrictGOPTarget() {
		return strictGOPTarget;
	}
	public void setStrictGOPTarget(Object newStrictGOPTarget) {
		strictGOPTarget = newStrictGOPTarget;
	}
	public Object getAqStrength() {
		return aqStrength;
	}
	public void setAqStrength(Object newAqStrength) {
		aqStrength = newAqStrength;
	}
	public Object getReservedBitFields() {
		return reservedBitFields;
	}
	public void setReservedBitFields(Object newReservedBitFields) {
		reservedBitFields = newReservedBitFields;
	}
	public _NV_ENC_QP getMinQP() {
		return minQP;
	}
	public void setMinQP(_NV_ENC_QP newMinQP) {
		minQP = newMinQP;
	}
	public _NV_ENC_QP getMaxQP() {
		return maxQP;
	}
	public void setMaxQP(_NV_ENC_QP newMaxQP) {
		maxQP = newMaxQP;
	}
	public _NV_ENC_QP getInitialRCQP() {
		return initialRCQP;
	}
	public void setInitialRCQP(_NV_ENC_QP newInitialRCQP) {
		initialRCQP = newInitialRCQP;
	}
	public Object getTemporallayerIdxMask() {
		return temporallayerIdxMask;
	}
	public void setTemporallayerIdxMask(Object newTemporallayerIdxMask) {
		temporallayerIdxMask = newTemporallayerIdxMask;
	}
	public Object getTemporalLayerQP() {
		return temporalLayerQP;
	}
	public void setTemporalLayerQP(Object newTemporalLayerQP) {
		temporalLayerQP = newTemporalLayerQP;
	}
	public Object getTargetQuality() {
		return targetQuality;
	}
	public void setTargetQuality(Object newTargetQuality) {
		targetQuality = newTargetQuality;
	}
	public Object getTargetQualityLSB() {
		return targetQualityLSB;
	}
	public void setTargetQualityLSB(Object newTargetQualityLSB) {
		targetQualityLSB = newTargetQualityLSB;
	}
	public Object getLookaheadDepth() {
		return lookaheadDepth;
	}
	public void setLookaheadDepth(Object newLookaheadDepth) {
		lookaheadDepth = newLookaheadDepth;
	}
	public Object getReserved1() {
		return reserved1;
	}
	public void setReserved1(Object newReserved1) {
		reserved1 = newReserved1;
	}
	public _NV_ENC_QP_MAP_MODE getQpMapMode() {
		return qpMapMode;
	}
	public void setQpMapMode(_NV_ENC_QP_MAP_MODE newQpMapMode) {
		qpMapMode = newQpMapMode;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}
