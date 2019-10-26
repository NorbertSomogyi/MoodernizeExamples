package application;

public class ADLODPerformanceLevels {
	private int iSize;
	private int iReserved;
	private Object aLevels;
	
	public ADLODPerformanceLevels(int iSize, int iReserved, Object aLevels) {
		setISize(iSize);
		setIReserved(iReserved);
		setALevels(aLevels);
	}
	public ADLODPerformanceLevels() {
	}
	
	public int getISize() {
		return iSize;
	}
	public void setISize(int newISize) {
		iSize = newISize;
	}
	public int getIReserved() {
		return iReserved;
	}
	public void setIReserved(int newIReserved) {
		iReserved = newIReserved;
	}
	public Object getALevels() {
		return aLevels;
	}
	public void setALevels(Object newALevels) {
		aLevels = newALevels;
	}
}
