package application;

public class ADLODParameters {
	private int iSize;
	private int iNumberOfPerformanceLevels;
	private int iActivityReportingSupported;
	private int iDiscretePerformanceLevels;
	private int iReserved;
	private ADLODParameterRange sEngineClock;
	private ADLODParameterRange sMemoryClock;
	private ADLODParameterRange sVddc;
	
	public ADLODParameters(int iSize, int iNumberOfPerformanceLevels, int iActivityReportingSupported, int iDiscretePerformanceLevels, int iReserved, ADLODParameterRange sEngineClock, ADLODParameterRange sMemoryClock, ADLODParameterRange sVddc) {
		setISize(iSize);
		setINumberOfPerformanceLevels(iNumberOfPerformanceLevels);
		setIActivityReportingSupported(iActivityReportingSupported);
		setIDiscretePerformanceLevels(iDiscretePerformanceLevels);
		setIReserved(iReserved);
		setSEngineClock(sEngineClock);
		setSMemoryClock(sMemoryClock);
		setSVddc(sVddc);
	}
	public ADLODParameters() {
	}
	
	public int getISize() {
		return iSize;
	}
	public void setISize(int newISize) {
		iSize = newISize;
	}
	public int getINumberOfPerformanceLevels() {
		return iNumberOfPerformanceLevels;
	}
	public void setINumberOfPerformanceLevels(int newINumberOfPerformanceLevels) {
		iNumberOfPerformanceLevels = newINumberOfPerformanceLevels;
	}
	public int getIActivityReportingSupported() {
		return iActivityReportingSupported;
	}
	public void setIActivityReportingSupported(int newIActivityReportingSupported) {
		iActivityReportingSupported = newIActivityReportingSupported;
	}
	public int getIDiscretePerformanceLevels() {
		return iDiscretePerformanceLevels;
	}
	public void setIDiscretePerformanceLevels(int newIDiscretePerformanceLevels) {
		iDiscretePerformanceLevels = newIDiscretePerformanceLevels;
	}
	public int getIReserved() {
		return iReserved;
	}
	public void setIReserved(int newIReserved) {
		iReserved = newIReserved;
	}
	public ADLODParameterRange getSEngineClock() {
		return sEngineClock;
	}
	public void setSEngineClock(ADLODParameterRange newSEngineClock) {
		sEngineClock = newSEngineClock;
	}
	public ADLODParameterRange getSMemoryClock() {
		return sMemoryClock;
	}
	public void setSMemoryClock(ADLODParameterRange newSMemoryClock) {
		sMemoryClock = newSMemoryClock;
	}
	public ADLODParameterRange getSVddc() {
		return sVddc;
	}
	public void setSVddc(ADLODParameterRange newSVddc) {
		sVddc = newSVddc;
	}
}
