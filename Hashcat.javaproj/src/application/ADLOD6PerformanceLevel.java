package application;

public class ADLOD6PerformanceLevel {
	private int iEngineClock;
	private int iMemoryClock;
	
	public ADLOD6PerformanceLevel(int iEngineClock, int iMemoryClock) {
		setIEngineClock(iEngineClock);
		setIMemoryClock(iMemoryClock);
	}
	public ADLOD6PerformanceLevel() {
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
}
