package application;

public class ADLOD6FanSpeedInfo {
	private int iSpeedType;
	private int iFanSpeedPercent;
	private int iFanSpeedRPM;
	private int iExtValue;
	private int iExtMask;
	
	public ADLOD6FanSpeedInfo(int iSpeedType, int iFanSpeedPercent, int iFanSpeedRPM, int iExtValue, int iExtMask) {
		setISpeedType(iSpeedType);
		setIFanSpeedPercent(iFanSpeedPercent);
		setIFanSpeedRPM(iFanSpeedRPM);
		setIExtValue(iExtValue);
		setIExtMask(iExtMask);
	}
	public ADLOD6FanSpeedInfo() {
	}
	
	public int getISpeedType() {
		return iSpeedType;
	}
	public void setISpeedType(int newISpeedType) {
		iSpeedType = newISpeedType;
	}
	public int getIFanSpeedPercent() {
		return iFanSpeedPercent;
	}
	public void setIFanSpeedPercent(int newIFanSpeedPercent) {
		iFanSpeedPercent = newIFanSpeedPercent;
	}
	public int getIFanSpeedRPM() {
		return iFanSpeedRPM;
	}
	public void setIFanSpeedRPM(int newIFanSpeedRPM) {
		iFanSpeedRPM = newIFanSpeedRPM;
	}
	public int getIExtValue() {
		return iExtValue;
	}
	public void setIExtValue(int newIExtValue) {
		iExtValue = newIExtValue;
	}
	public int getIExtMask() {
		return iExtMask;
	}
	public void setIExtMask(int newIExtMask) {
		iExtMask = newIExtMask;
	}
}
