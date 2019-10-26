package application;

public class ADLFanSpeedValue {
	private int iSize;
	private int iSpeedType;
	private int iFanSpeed;
	private int iFlags;
	
	public ADLFanSpeedValue(int iSize, int iSpeedType, int iFanSpeed, int iFlags) {
		setISize(iSize);
		setISpeedType(iSpeedType);
		setIFanSpeed(iFanSpeed);
		setIFlags(iFlags);
	}
	public ADLFanSpeedValue() {
	}
	
	public int getISize() {
		return iSize;
	}
	public void setISize(int newISize) {
		iSize = newISize;
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
	public int getIFlags() {
		return iFlags;
	}
	public void setIFlags(int newIFlags) {
		iFlags = newIFlags;
	}
}
