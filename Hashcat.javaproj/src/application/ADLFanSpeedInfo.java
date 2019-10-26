package application;

public class ADLFanSpeedInfo {
	private int iSize;
	private int iFlags;
	private int iMinPercent;
	private int iMaxPercent;
	private int iMinRPM;
	private int iMaxRPM;
	
	public ADLFanSpeedInfo(int iSize, int iFlags, int iMinPercent, int iMaxPercent, int iMinRPM, int iMaxRPM) {
		setISize(iSize);
		setIFlags(iFlags);
		setIMinPercent(iMinPercent);
		setIMaxPercent(iMaxPercent);
		setIMinRPM(iMinRPM);
		setIMaxRPM(iMaxRPM);
	}
	public ADLFanSpeedInfo() {
	}
	
	public int getISize() {
		return iSize;
	}
	public void setISize(int newISize) {
		iSize = newISize;
	}
	public int getIFlags() {
		return iFlags;
	}
	public void setIFlags(int newIFlags) {
		iFlags = newIFlags;
	}
	public int getIMinPercent() {
		return iMinPercent;
	}
	public void setIMinPercent(int newIMinPercent) {
		iMinPercent = newIMinPercent;
	}
	public int getIMaxPercent() {
		return iMaxPercent;
	}
	public void setIMaxPercent(int newIMaxPercent) {
		iMaxPercent = newIMaxPercent;
	}
	public int getIMinRPM() {
		return iMinRPM;
	}
	public void setIMinRPM(int newIMinRPM) {
		iMinRPM = newIMinRPM;
	}
	public int getIMaxRPM() {
		return iMaxRPM;
	}
	public void setIMaxRPM(int newIMaxRPM) {
		iMaxRPM = newIMaxRPM;
	}
}
