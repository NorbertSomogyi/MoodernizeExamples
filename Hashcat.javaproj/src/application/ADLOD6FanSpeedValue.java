package application;

public class ADLOD6FanSpeedValue {
	private int iSpeedType;
	private int iFanSpeed;
	private int iExtValue;
	private int iExtMask;
	
	public ADLOD6FanSpeedValue(int iSpeedType, int iFanSpeed, int iExtValue, int iExtMask) {
		setISpeedType(iSpeedType);
		setIFanSpeed(iFanSpeed);
		setIExtValue(iExtValue);
		setIExtMask(iExtMask);
	}
	public ADLOD6FanSpeedValue() {
	}
	
	public int getISpeedType() {
		return iSpeedType;
	}
	public void setISpeedType(int newISpeedType) {
		iSpeedType = newISpeedType;
	}
	public int getIFanSpeed() {
		return iFanSpeed;
	}
	public void setIFanSpeed(int newIFanSpeed) {
		iFanSpeed = newIFanSpeed;
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
