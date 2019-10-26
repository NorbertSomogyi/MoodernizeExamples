package application;

public class ADLOD6Capabilities {
	private int iCapabilities;
	private int iSupportedStates;
	private int iNumberOfPerformanceLevels;
	private ADLOD6ParameterRange sEngineClockRange;
	private ADLOD6ParameterRange sMemoryClockRange;
	private int iExtValue;
	private int iExtMask;
	
	public ADLOD6Capabilities(int iCapabilities, int iSupportedStates, int iNumberOfPerformanceLevels, ADLOD6ParameterRange sEngineClockRange, ADLOD6ParameterRange sMemoryClockRange, int iExtValue, int iExtMask) {
		setICapabilities(iCapabilities);
		setISupportedStates(iSupportedStates);
		setINumberOfPerformanceLevels(iNumberOfPerformanceLevels);
		setSEngineClockRange(sEngineClockRange);
		setSMemoryClockRange(sMemoryClockRange);
		setIExtValue(iExtValue);
		setIExtMask(iExtMask);
	}
	public ADLOD6Capabilities() {
	}
	
	public int getICapabilities() {
		return iCapabilities;
	}
	public void setICapabilities(int newICapabilities) {
		iCapabilities = newICapabilities;
	}
	public int getISupportedStates() {
		return iSupportedStates;
	}
	public void setISupportedStates(int newISupportedStates) {
		iSupportedStates = newISupportedStates;
	}
	public int getINumberOfPerformanceLevels() {
		return iNumberOfPerformanceLevels;
	}
	public void setINumberOfPerformanceLevels(int newINumberOfPerformanceLevels) {
		iNumberOfPerformanceLevels = newINumberOfPerformanceLevels;
	}
	public ADLOD6ParameterRange getSEngineClockRange() {
		return sEngineClockRange;
	}
	public void setSEngineClockRange(ADLOD6ParameterRange newSEngineClockRange) {
		sEngineClockRange = newSEngineClockRange;
	}
	public ADLOD6ParameterRange getSMemoryClockRange() {
		return sMemoryClockRange;
	}
	public void setSMemoryClockRange(ADLOD6ParameterRange newSMemoryClockRange) {
		sMemoryClockRange = newSMemoryClockRange;
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
