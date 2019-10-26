package application;

public class ADLOD6StateInfo {
	private int iNumberOfPerformanceLevels;
	private int iExtValue;
	private int iExtMask;
	private Object aLevels;
	
	public ADLOD6StateInfo(int iNumberOfPerformanceLevels, int iExtValue, int iExtMask, Object aLevels) {
		setINumberOfPerformanceLevels(iNumberOfPerformanceLevels);
		setIExtValue(iExtValue);
		setIExtMask(iExtMask);
		setALevels(aLevels);
	}
	public ADLOD6StateInfo() {
	}
	
	public int getINumberOfPerformanceLevels() {
		return iNumberOfPerformanceLevels;
	}
	public void setINumberOfPerformanceLevels(int newINumberOfPerformanceLevels) {
		iNumberOfPerformanceLevels = newINumberOfPerformanceLevels;
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
	public Object getALevels() {
		return aLevels;
	}
	public void setALevels(Object newALevels) {
		aLevels = newALevels;
	}
}
