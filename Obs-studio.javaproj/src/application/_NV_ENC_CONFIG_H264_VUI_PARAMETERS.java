package application;

/**
 * \struct _NV_ENC_CONFIG_H264_VUI_PARAMETERS
 * H264 Video Usability Info parameters
 */
public class _NV_ENC_CONFIG_H264_VUI_PARAMETERS {
	private Object overscanInfoPresentFlag;
	private Object overscanInfo;
	private Object videoSignalTypePresentFlag;
	private Object videoFormat;
	private Object videoFullRangeFlag;
	private Object colourDescriptionPresentFlag;
	private Object colourPrimaries;
	private Object transferCharacteristics;
	private Object colourMatrix;
	private Object chromaSampleLocationFlag;
	private Object chromaSampleLocationTop;
	private Object chromaSampleLocationBot;
	private Object bitstreamRestrictionFlag;
	private Object reserved;
	
	public _NV_ENC_CONFIG_H264_VUI_PARAMETERS(Object overscanInfoPresentFlag, Object overscanInfo, Object videoSignalTypePresentFlag, Object videoFormat, Object videoFullRangeFlag, Object colourDescriptionPresentFlag, Object colourPrimaries, Object transferCharacteristics, Object colourMatrix, Object chromaSampleLocationFlag, Object chromaSampleLocationTop, Object chromaSampleLocationBot, Object bitstreamRestrictionFlag, Object reserved) {
		setOverscanInfoPresentFlag(overscanInfoPresentFlag);
		setOverscanInfo(overscanInfo);
		setVideoSignalTypePresentFlag(videoSignalTypePresentFlag);
		setVideoFormat(videoFormat);
		setVideoFullRangeFlag(videoFullRangeFlag);
		setColourDescriptionPresentFlag(colourDescriptionPresentFlag);
		setColourPrimaries(colourPrimaries);
		setTransferCharacteristics(transferCharacteristics);
		setColourMatrix(colourMatrix);
		setChromaSampleLocationFlag(chromaSampleLocationFlag);
		setChromaSampleLocationTop(chromaSampleLocationTop);
		setChromaSampleLocationBot(chromaSampleLocationBot);
		setBitstreamRestrictionFlag(bitstreamRestrictionFlag);
		setReserved(reserved);
	}
	public _NV_ENC_CONFIG_H264_VUI_PARAMETERS() {
	}
	
	public Object getOverscanInfoPresentFlag() {
		return overscanInfoPresentFlag;
	}
	public void setOverscanInfoPresentFlag(Object newOverscanInfoPresentFlag) {
		overscanInfoPresentFlag = newOverscanInfoPresentFlag;
	}
	public Object getOverscanInfo() {
		return overscanInfo;
	}
	public void setOverscanInfo(Object newOverscanInfo) {
		overscanInfo = newOverscanInfo;
	}
	public Object getVideoSignalTypePresentFlag() {
		return videoSignalTypePresentFlag;
	}
	public void setVideoSignalTypePresentFlag(Object newVideoSignalTypePresentFlag) {
		videoSignalTypePresentFlag = newVideoSignalTypePresentFlag;
	}
	public Object getVideoFormat() {
		return videoFormat;
	}
	public void setVideoFormat(Object newVideoFormat) {
		videoFormat = newVideoFormat;
	}
	public Object getVideoFullRangeFlag() {
		return videoFullRangeFlag;
	}
	public void setVideoFullRangeFlag(Object newVideoFullRangeFlag) {
		videoFullRangeFlag = newVideoFullRangeFlag;
	}
	public Object getColourDescriptionPresentFlag() {
		return colourDescriptionPresentFlag;
	}
	public void setColourDescriptionPresentFlag(Object newColourDescriptionPresentFlag) {
		colourDescriptionPresentFlag = newColourDescriptionPresentFlag;
	}
	public Object getColourPrimaries() {
		return colourPrimaries;
	}
	public void setColourPrimaries(Object newColourPrimaries) {
		colourPrimaries = newColourPrimaries;
	}
	public Object getTransferCharacteristics() {
		return transferCharacteristics;
	}
	public void setTransferCharacteristics(Object newTransferCharacteristics) {
		transferCharacteristics = newTransferCharacteristics;
	}
	public Object getColourMatrix() {
		return colourMatrix;
	}
	public void setColourMatrix(Object newColourMatrix) {
		colourMatrix = newColourMatrix;
	}
	public Object getChromaSampleLocationFlag() {
		return chromaSampleLocationFlag;
	}
	public void setChromaSampleLocationFlag(Object newChromaSampleLocationFlag) {
		chromaSampleLocationFlag = newChromaSampleLocationFlag;
	}
	public Object getChromaSampleLocationTop() {
		return chromaSampleLocationTop;
	}
	public void setChromaSampleLocationTop(Object newChromaSampleLocationTop) {
		chromaSampleLocationTop = newChromaSampleLocationTop;
	}
	public Object getChromaSampleLocationBot() {
		return chromaSampleLocationBot;
	}
	public void setChromaSampleLocationBot(Object newChromaSampleLocationBot) {
		chromaSampleLocationBot = newChromaSampleLocationBot;
	}
	public Object getBitstreamRestrictionFlag() {
		return bitstreamRestrictionFlag;
	}
	public void setBitstreamRestrictionFlag(Object newBitstreamRestrictionFlag) {
		bitstreamRestrictionFlag = newBitstreamRestrictionFlag;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}
