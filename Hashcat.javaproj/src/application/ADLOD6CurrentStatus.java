package application;

public class ADLOD6CurrentStatus {
	private int iEngineClock;
	private int iMemoryClock;
	private int iActivityPercent;
	private int iCurrentPerformanceLevel;
	private int iCurrentBusSpeed;
	private int iCurrentBusLanes;
	private int iMaximumBusLanes;
	private int iExtValue;
	private int iExtMask;
	
	public ADLOD6CurrentStatus(int iEngineClock, int iMemoryClock, int iActivityPercent, int iCurrentPerformanceLevel, int iCurrentBusSpeed, int iCurrentBusLanes, int iMaximumBusLanes, int iExtValue, int iExtMask) {
		setIEngineClock(iEngineClock);
		setIMemoryClock(iMemoryClock);
		setIActivityPercent(iActivityPercent);
		setICurrentPerformanceLevel(iCurrentPerformanceLevel);
		setICurrentBusSpeed(iCurrentBusSpeed);
		setICurrentBusLanes(iCurrentBusLanes);
		setIMaximumBusLanes(iMaximumBusLanes);
		setIExtValue(iExtValue);
		setIExtMask(iExtMask);
	}
	public ADLOD6CurrentStatus() {
	}
	
	public int getIEngineClock() {
		return iEngineClock;
	}
	public void setIEngineClock(int newIEngineClock) {
		iEngineClock = newIEngineClock;
	}
	public int getIMemoryClock() {
		return iMemoryClock;
	}
	public void setIMemoryClock(int newIMemoryClock) {
		iMemoryClock = newIMemoryClock;
	}
	public int getIActivityPercent() {
		return iActivityPercent;
	}
	public void setIActivityPercent(int newIActivityPercent) {
		iActivityPercent = newIActivityPercent;
	}
	public int getICurrentPerformanceLevel() {
		return iCurrentPerformanceLevel;
	}
	public void setICurrentPerformanceLevel(int newICurrentPerformanceLevel) {
		iCurrentPerformanceLevel = newICurrentPerformanceLevel;
	}
	public int getICurrentBusSpeed() {
		return iCurrentBusSpeed;
	}
	public void setICurrentBusSpeed(int newICurrentBusSpeed) {
		iCurrentBusSpeed = newICurrentBusSpeed;
	}
	public int getICurrentBusLanes() {
		return iCurrentBusLanes;
	}
	public void setICurrentBusLanes(int newICurrentBusLanes) {
		iCurrentBusLanes = newICurrentBusLanes;
	}
	public int getIMaximumBusLanes() {
		return iMaximumBusLanes;
	}
	public void setIMaximumBusLanes(int newIMaximumBusLanes) {
		iMaximumBusLanes = newIMaximumBusLanes;
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
