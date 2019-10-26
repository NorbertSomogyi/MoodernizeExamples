package application;

public class ADLODPerformanceLevel {
	private int iEngineClock;
	private int iMemoryClock;
	private int iVddc;
	
	public ADLODPerformanceLevel(int iEngineClock, int iMemoryClock, int iVddc) {
		setIEngineClock(iEngineClock);
		setIMemoryClock(iMemoryClock);
		setIVddc(iVddc);
	}
	public ADLODPerformanceLevel() {
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
}
