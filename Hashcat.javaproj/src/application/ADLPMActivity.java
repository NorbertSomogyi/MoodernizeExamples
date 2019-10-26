package application;

public class ADLPMActivity {
	private int iSize;
	private int iEngineClock;
	private int iMemoryClock;
	private int iVddc;
	private int iActivityPercent;
	private int iCurrentPerformanceLevel;
	private int iCurrentBusSpeed;
	private int iCurrentBusLanes;
	private int iMaximumBusLanes;
	private int iReserved;
	
	public ADLPMActivity(int iSize, int iEngineClock, int iMemoryClock, int iVddc, int iActivityPercent, int iCurrentPerformanceLevel, int iCurrentBusSpeed, int iCurrentBusLanes, int iMaximumBusLanes, int iReserved) {
		setISize(iSize);
		setIEngineClock(iEngineClock);
		setIMemoryClock(iMemoryClock);
		setIVddc(iVddc);
		setIActivityPercent(iActivityPercent);
		setICurrentPerformanceLevel(iCurrentPerformanceLevel);
		setICurrentBusSpeed(iCurrentBusSpeed);
		setICurrentBusLanes(iCurrentBusLanes);
		setIMaximumBusLanes(iMaximumBusLanes);
		setIReserved(iReserved);
	}
	public ADLPMActivity() {
	}
	
	public int getISize() {
		return iSize;
	}
	public void setISize(int newISize) {
		iSize = newISize;
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
	public int getIVddc() {
		return iVddc;
	}
	public void setIVddc(int newIVddc) {
		iVddc = newIVddc;
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
	public int getIReserved() {
		return iReserved;
	}
	public void setIReserved(int newIReserved) {
		iReserved = newIReserved;
	}
}
