package application;

/// \endcond
/** @} */
/* END ENCODE_FUNC */
/**
 * \ingroup ENCODER_STRUCTURE
 * NV_ENCODE_API_FUNCTION_LIST
 */
public class _NV_ENCODE_API_FUNCTION_LIST {
	private Object version;
	private Object reserved;
	private Object nvEncOpenEncodeSession;
	private Object nvEncGetEncodeGUIDCount;
	private Object nvEncGetEncodeProfileGUIDCount;
	private Object nvEncGetEncodeProfileGUIDs;
	private Object nvEncGetEncodeGUIDs;
	private Object nvEncGetInputFormatCount;
	private Object nvEncGetInputFormats;
	private Object nvEncGetEncodeCaps;
	private Object nvEncGetEncodePresetCount;
	private Object nvEncGetEncodePresetGUIDs;
	private Object nvEncGetEncodePresetConfig;
	private Object nvEncInitializeEncoder;
	private Object nvEncCreateInputBuffer;
	private Object nvEncDestroyInputBuffer;
	private Object nvEncCreateBitstreamBuffer;
	private Object nvEncDestroyBitstreamBuffer;
	private Object nvEncEncodePicture;
	private Object nvEncLockBitstream;
	private Object nvEncUnlockBitstream;
	private Object nvEncLockInputBuffer;
	private Object nvEncUnlockInputBuffer;
	private Object nvEncGetEncodeStats;
	private Object nvEncGetSequenceParams;
	private Object nvEncRegisterAsyncEvent;
	private Object nvEncUnregisterAsyncEvent;
	private Object nvEncMapInputResource;
	private Object nvEncUnmapInputResource;
	private Object nvEncDestroyEncoder;
	private Object nvEncInvalidateRefFrames;
	private Object nvEncOpenEncodeSessionEx;
	private Object nvEncRegisterResource;
	private Object nvEncUnregisterResource;
	private Object nvEncReconfigureEncoder;
	private Object reserved1;
	private Object nvEncCreateMVBuffer;
	private Object nvEncDestroyMVBuffer;
	private Object nvEncRunMotionEstimationOnly;
	private Object reserved2;
	
	public _NV_ENCODE_API_FUNCTION_LIST(Object version, Object reserved, Object nvEncOpenEncodeSession, Object nvEncGetEncodeGUIDCount, Object nvEncGetEncodeProfileGUIDCount, Object nvEncGetEncodeProfileGUIDs, Object nvEncGetEncodeGUIDs, Object nvEncGetInputFormatCount, Object nvEncGetInputFormats, Object nvEncGetEncodeCaps, Object nvEncGetEncodePresetCount, Object nvEncGetEncodePresetGUIDs, Object nvEncGetEncodePresetConfig, Object nvEncInitializeEncoder, Object nvEncCreateInputBuffer, Object nvEncDestroyInputBuffer, Object nvEncCreateBitstreamBuffer, Object nvEncDestroyBitstreamBuffer, Object nvEncEncodePicture, Object nvEncLockBitstream, Object nvEncUnlockBitstream, Object nvEncLockInputBuffer, Object nvEncUnlockInputBuffer, Object nvEncGetEncodeStats, Object nvEncGetSequenceParams, Object nvEncRegisterAsyncEvent, Object nvEncUnregisterAsyncEvent, Object nvEncMapInputResource, Object nvEncUnmapInputResource, Object nvEncDestroyEncoder, Object nvEncInvalidateRefFrames, Object nvEncOpenEncodeSessionEx, Object nvEncRegisterResource, Object nvEncUnregisterResource, Object nvEncReconfigureEncoder, Object reserved1, Object nvEncCreateMVBuffer, Object nvEncDestroyMVBuffer, Object nvEncRunMotionEstimationOnly, Object reserved2) {
		setVersion(version);
		setReserved(reserved);
		setNvEncOpenEncodeSession(nvEncOpenEncodeSession);
		setNvEncGetEncodeGUIDCount(nvEncGetEncodeGUIDCount);
		setNvEncGetEncodeProfileGUIDCount(nvEncGetEncodeProfileGUIDCount);
		setNvEncGetEncodeProfileGUIDs(nvEncGetEncodeProfileGUIDs);
		setNvEncGetEncodeGUIDs(nvEncGetEncodeGUIDs);
		setNvEncGetInputFormatCount(nvEncGetInputFormatCount);
		setNvEncGetInputFormats(nvEncGetInputFormats);
		setNvEncGetEncodeCaps(nvEncGetEncodeCaps);
		setNvEncGetEncodePresetCount(nvEncGetEncodePresetCount);
		setNvEncGetEncodePresetGUIDs(nvEncGetEncodePresetGUIDs);
		setNvEncGetEncodePresetConfig(nvEncGetEncodePresetConfig);
		setNvEncInitializeEncoder(nvEncInitializeEncoder);
		setNvEncCreateInputBuffer(nvEncCreateInputBuffer);
		setNvEncDestroyInputBuffer(nvEncDestroyInputBuffer);
		setNvEncCreateBitstreamBuffer(nvEncCreateBitstreamBuffer);
		setNvEncDestroyBitstreamBuffer(nvEncDestroyBitstreamBuffer);
		setNvEncEncodePicture(nvEncEncodePicture);
		setNvEncLockBitstream(nvEncLockBitstream);
		setNvEncUnlockBitstream(nvEncUnlockBitstream);
		setNvEncLockInputBuffer(nvEncLockInputBuffer);
		setNvEncUnlockInputBuffer(nvEncUnlockInputBuffer);
		setNvEncGetEncodeStats(nvEncGetEncodeStats);
		setNvEncGetSequenceParams(nvEncGetSequenceParams);
		setNvEncRegisterAsyncEvent(nvEncRegisterAsyncEvent);
		setNvEncUnregisterAsyncEvent(nvEncUnregisterAsyncEvent);
		setNvEncMapInputResource(nvEncMapInputResource);
		setNvEncUnmapInputResource(nvEncUnmapInputResource);
		setNvEncDestroyEncoder(nvEncDestroyEncoder);
		setNvEncInvalidateRefFrames(nvEncInvalidateRefFrames);
		setNvEncOpenEncodeSessionEx(nvEncOpenEncodeSessionEx);
		setNvEncRegisterResource(nvEncRegisterResource);
		setNvEncUnregisterResource(nvEncUnregisterResource);
		setNvEncReconfigureEncoder(nvEncReconfigureEncoder);
		setReserved1(reserved1);
		setNvEncCreateMVBuffer(nvEncCreateMVBuffer);
		setNvEncDestroyMVBuffer(nvEncDestroyMVBuffer);
		setNvEncRunMotionEstimationOnly(nvEncRunMotionEstimationOnly);
		setReserved2(reserved2);
	}
	public _NV_ENCODE_API_FUNCTION_LIST() {
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
	public Object getNvEncOpenEncodeSession() {
		return nvEncOpenEncodeSession;
	}
	public void setNvEncOpenEncodeSession(Object newNvEncOpenEncodeSession) {
		nvEncOpenEncodeSession = newNvEncOpenEncodeSession;
	}
	public Object getNvEncGetEncodeGUIDCount() {
		return nvEncGetEncodeGUIDCount;
	}
	public void setNvEncGetEncodeGUIDCount(Object newNvEncGetEncodeGUIDCount) {
		nvEncGetEncodeGUIDCount = newNvEncGetEncodeGUIDCount;
	}
	public Object getNvEncGetEncodeProfileGUIDCount() {
		return nvEncGetEncodeProfileGUIDCount;
	}
	public void setNvEncGetEncodeProfileGUIDCount(Object newNvEncGetEncodeProfileGUIDCount) {
		nvEncGetEncodeProfileGUIDCount = newNvEncGetEncodeProfileGUIDCount;
	}
	public Object getNvEncGetEncodeProfileGUIDs() {
		return nvEncGetEncodeProfileGUIDs;
	}
	public void setNvEncGetEncodeProfileGUIDs(Object newNvEncGetEncodeProfileGUIDs) {
		nvEncGetEncodeProfileGUIDs = newNvEncGetEncodeProfileGUIDs;
	}
	public Object getNvEncGetEncodeGUIDs() {
		return nvEncGetEncodeGUIDs;
	}
	public void setNvEncGetEncodeGUIDs(Object newNvEncGetEncodeGUIDs) {
		nvEncGetEncodeGUIDs = newNvEncGetEncodeGUIDs;
	}
	public Object getNvEncGetInputFormatCount() {
		return nvEncGetInputFormatCount;
	}
	public void setNvEncGetInputFormatCount(Object newNvEncGetInputFormatCount) {
		nvEncGetInputFormatCount = newNvEncGetInputFormatCount;
	}
	public Object getNvEncGetInputFormats() {
		return nvEncGetInputFormats;
	}
	public void setNvEncGetInputFormats(Object newNvEncGetInputFormats) {
		nvEncGetInputFormats = newNvEncGetInputFormats;
	}
	public Object getNvEncGetEncodeCaps() {
		return nvEncGetEncodeCaps;
	}
	public void setNvEncGetEncodeCaps(Object newNvEncGetEncodeCaps) {
		nvEncGetEncodeCaps = newNvEncGetEncodeCaps;
	}
	public Object getNvEncGetEncodePresetCount() {
		return nvEncGetEncodePresetCount;
	}
	public void setNvEncGetEncodePresetCount(Object newNvEncGetEncodePresetCount) {
		nvEncGetEncodePresetCount = newNvEncGetEncodePresetCount;
	}
	public Object getNvEncGetEncodePresetGUIDs() {
		return nvEncGetEncodePresetGUIDs;
	}
	public void setNvEncGetEncodePresetGUIDs(Object newNvEncGetEncodePresetGUIDs) {
		nvEncGetEncodePresetGUIDs = newNvEncGetEncodePresetGUIDs;
	}
	public Object getNvEncGetEncodePresetConfig() {
		return nvEncGetEncodePresetConfig;
	}
	public void setNvEncGetEncodePresetConfig(Object newNvEncGetEncodePresetConfig) {
		nvEncGetEncodePresetConfig = newNvEncGetEncodePresetConfig;
	}
	public Object getNvEncInitializeEncoder() {
		return nvEncInitializeEncoder;
	}
	public void setNvEncInitializeEncoder(Object newNvEncInitializeEncoder) {
		nvEncInitializeEncoder = newNvEncInitializeEncoder;
	}
	public Object getNvEncCreateInputBuffer() {
		return nvEncCreateInputBuffer;
	}
	public void setNvEncCreateInputBuffer(Object newNvEncCreateInputBuffer) {
		nvEncCreateInputBuffer = newNvEncCreateInputBuffer;
	}
	public Object getNvEncDestroyInputBuffer() {
		return nvEncDestroyInputBuffer;
	}
	public void setNvEncDestroyInputBuffer(Object newNvEncDestroyInputBuffer) {
		nvEncDestroyInputBuffer = newNvEncDestroyInputBuffer;
	}
	public Object getNvEncCreateBitstreamBuffer() {
		return nvEncCreateBitstreamBuffer;
	}
	public void setNvEncCreateBitstreamBuffer(Object newNvEncCreateBitstreamBuffer) {
		nvEncCreateBitstreamBuffer = newNvEncCreateBitstreamBuffer;
	}
	public Object getNvEncDestroyBitstreamBuffer() {
		return nvEncDestroyBitstreamBuffer;
	}
	public void setNvEncDestroyBitstreamBuffer(Object newNvEncDestroyBitstreamBuffer) {
		nvEncDestroyBitstreamBuffer = newNvEncDestroyBitstreamBuffer;
	}
	public Object getNvEncEncodePicture() {
		return nvEncEncodePicture;
	}
	public void setNvEncEncodePicture(Object newNvEncEncodePicture) {
		nvEncEncodePicture = newNvEncEncodePicture;
	}
	public Object getNvEncLockBitstream() {
		return nvEncLockBitstream;
	}
	public void setNvEncLockBitstream(Object newNvEncLockBitstream) {
		nvEncLockBitstream = newNvEncLockBitstream;
	}
	public Object getNvEncUnlockBitstream() {
		return nvEncUnlockBitstream;
	}
	public void setNvEncUnlockBitstream(Object newNvEncUnlockBitstream) {
		nvEncUnlockBitstream = newNvEncUnlockBitstream;
	}
	public Object getNvEncLockInputBuffer() {
		return nvEncLockInputBuffer;
	}
	public void setNvEncLockInputBuffer(Object newNvEncLockInputBuffer) {
		nvEncLockInputBuffer = newNvEncLockInputBuffer;
	}
	public Object getNvEncUnlockInputBuffer() {
		return nvEncUnlockInputBuffer;
	}
	public void setNvEncUnlockInputBuffer(Object newNvEncUnlockInputBuffer) {
		nvEncUnlockInputBuffer = newNvEncUnlockInputBuffer;
	}
	public Object getNvEncGetEncodeStats() {
		return nvEncGetEncodeStats;
	}
	public void setNvEncGetEncodeStats(Object newNvEncGetEncodeStats) {
		nvEncGetEncodeStats = newNvEncGetEncodeStats;
	}
	public Object getNvEncGetSequenceParams() {
		return nvEncGetSequenceParams;
	}
	public void setNvEncGetSequenceParams(Object newNvEncGetSequenceParams) {
		nvEncGetSequenceParams = newNvEncGetSequenceParams;
	}
	public Object getNvEncRegisterAsyncEvent() {
		return nvEncRegisterAsyncEvent;
	}
	public void setNvEncRegisterAsyncEvent(Object newNvEncRegisterAsyncEvent) {
		nvEncRegisterAsyncEvent = newNvEncRegisterAsyncEvent;
	}
	public Object getNvEncUnregisterAsyncEvent() {
		return nvEncUnregisterAsyncEvent;
	}
	public void setNvEncUnregisterAsyncEvent(Object newNvEncUnregisterAsyncEvent) {
		nvEncUnregisterAsyncEvent = newNvEncUnregisterAsyncEvent;
	}
	public Object getNvEncMapInputResource() {
		return nvEncMapInputResource;
	}
	public void setNvEncMapInputResource(Object newNvEncMapInputResource) {
		nvEncMapInputResource = newNvEncMapInputResource;
	}
	public Object getNvEncUnmapInputResource() {
		return nvEncUnmapInputResource;
	}
	public void setNvEncUnmapInputResource(Object newNvEncUnmapInputResource) {
		nvEncUnmapInputResource = newNvEncUnmapInputResource;
	}
	public Object getNvEncDestroyEncoder() {
		return nvEncDestroyEncoder;
	}
	public void setNvEncDestroyEncoder(Object newNvEncDestroyEncoder) {
		nvEncDestroyEncoder = newNvEncDestroyEncoder;
	}
	public Object getNvEncInvalidateRefFrames() {
		return nvEncInvalidateRefFrames;
	}
	public void setNvEncInvalidateRefFrames(Object newNvEncInvalidateRefFrames) {
		nvEncInvalidateRefFrames = newNvEncInvalidateRefFrames;
	}
	public Object getNvEncOpenEncodeSessionEx() {
		return nvEncOpenEncodeSessionEx;
	}
	public void setNvEncOpenEncodeSessionEx(Object newNvEncOpenEncodeSessionEx) {
		nvEncOpenEncodeSessionEx = newNvEncOpenEncodeSessionEx;
	}
	public Object getNvEncRegisterResource() {
		return nvEncRegisterResource;
	}
	public void setNvEncRegisterResource(Object newNvEncRegisterResource) {
		nvEncRegisterResource = newNvEncRegisterResource;
	}
	public Object getNvEncUnregisterResource() {
		return nvEncUnregisterResource;
	}
	public void setNvEncUnregisterResource(Object newNvEncUnregisterResource) {
		nvEncUnregisterResource = newNvEncUnregisterResource;
	}
	public Object getNvEncReconfigureEncoder() {
		return nvEncReconfigureEncoder;
	}
	public void setNvEncReconfigureEncoder(Object newNvEncReconfigureEncoder) {
		nvEncReconfigureEncoder = newNvEncReconfigureEncoder;
	}
	public Object getReserved1() {
		return reserved1;
	}
	public void setReserved1(Object newReserved1) {
		reserved1 = newReserved1;
	}
	public Object getNvEncCreateMVBuffer() {
		return nvEncCreateMVBuffer;
	}
	public void setNvEncCreateMVBuffer(Object newNvEncCreateMVBuffer) {
		nvEncCreateMVBuffer = newNvEncCreateMVBuffer;
	}
	public Object getNvEncDestroyMVBuffer() {
		return nvEncDestroyMVBuffer;
	}
	public void setNvEncDestroyMVBuffer(Object newNvEncDestroyMVBuffer) {
		nvEncDestroyMVBuffer = newNvEncDestroyMVBuffer;
	}
	public Object getNvEncRunMotionEstimationOnly() {
		return nvEncRunMotionEstimationOnly;
	}
	public void setNvEncRunMotionEstimationOnly(Object newNvEncRunMotionEstimationOnly) {
		nvEncRunMotionEstimationOnly = newNvEncRunMotionEstimationOnly;
	}
	public Object getReserved2() {
		return reserved2;
	}
	public void setReserved2(Object newReserved2) {
		reserved2 = newReserved2;
	}
}
