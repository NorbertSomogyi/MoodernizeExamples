package application;

/** Some other unspecified factor is reducing the clocks */
/** Bit mask representing no clocks throttling
 *
 * Clocks are as high as possible.
 * */
/*
 * End of declarations from nvml.h
 **/
public class hm_nvml_lib {
	private Object lib;
	private Object nvmlErrorString;
	private Object nvmlInit;
	private Object nvmlShutdown;
	private Object nvmlDeviceGetCount;
	private Object nvmlDeviceGetName;
	private Object nvmlDeviceGetHandleByIndex;
	private Object nvmlDeviceGetTemperature;
	private Object nvmlDeviceGetFanSpeed;
	private Object nvmlDeviceGetUtilizationRates;
	private Object nvmlDeviceGetClockInfo;
	private Object nvmlDeviceGetTemperatureThreshold;
	private Object nvmlDeviceGetCurrPcieLinkGeneration;
	private Object nvmlDeviceGetCurrPcieLinkWidth;
	private Object nvmlDeviceGetCurrentClocksThrottleReasons;
	private Object nvmlDeviceGetSupportedClocksThrottleReasons;
	private Object nvmlDeviceGetPciInfo;
	
	public hm_nvml_lib(Object lib, Object nvmlErrorString, Object nvmlInit, Object nvmlShutdown, Object nvmlDeviceGetCount, Object nvmlDeviceGetName, Object nvmlDeviceGetHandleByIndex, Object nvmlDeviceGetTemperature, Object nvmlDeviceGetFanSpeed, Object nvmlDeviceGetUtilizationRates, Object nvmlDeviceGetClockInfo, Object nvmlDeviceGetTemperatureThreshold, Object nvmlDeviceGetCurrPcieLinkGeneration, Object nvmlDeviceGetCurrPcieLinkWidth, Object nvmlDeviceGetCurrentClocksThrottleReasons, Object nvmlDeviceGetSupportedClocksThrottleReasons, Object nvmlDeviceGetPciInfo) {
		setLib(lib);
		setNvmlErrorString(nvmlErrorString);
		setNvmlInit(nvmlInit);
		setNvmlShutdown(nvmlShutdown);
		setNvmlDeviceGetCount(nvmlDeviceGetCount);
		setNvmlDeviceGetName(nvmlDeviceGetName);
		setNvmlDeviceGetHandleByIndex(nvmlDeviceGetHandleByIndex);
		setNvmlDeviceGetTemperature(nvmlDeviceGetTemperature);
		setNvmlDeviceGetFanSpeed(nvmlDeviceGetFanSpeed);
		setNvmlDeviceGetUtilizationRates(nvmlDeviceGetUtilizationRates);
		setNvmlDeviceGetClockInfo(nvmlDeviceGetClockInfo);
		setNvmlDeviceGetTemperatureThreshold(nvmlDeviceGetTemperatureThreshold);
		setNvmlDeviceGetCurrPcieLinkGeneration(nvmlDeviceGetCurrPcieLinkGeneration);
		setNvmlDeviceGetCurrPcieLinkWidth(nvmlDeviceGetCurrPcieLinkWidth);
		setNvmlDeviceGetCurrentClocksThrottleReasons(nvmlDeviceGetCurrentClocksThrottleReasons);
		setNvmlDeviceGetSupportedClocksThrottleReasons(nvmlDeviceGetSupportedClocksThrottleReasons);
		setNvmlDeviceGetPciInfo(nvmlDeviceGetPciInfo);
	}
	public hm_nvml_lib() {
	}
	
	public Object getLib() {
		return lib;
	}
	public void setLib(Object newLib) {
		lib = newLib;
	}
	public Object getNvmlErrorString() {
		return nvmlErrorString;
	}
	public void setNvmlErrorString(Object newNvmlErrorString) {
		nvmlErrorString = newNvmlErrorString;
	}
	public Object getNvmlInit() {
		return nvmlInit;
	}
	public void setNvmlInit(Object newNvmlInit) {
		nvmlInit = newNvmlInit;
	}
	public Object getNvmlShutdown() {
		return nvmlShutdown;
	}
	public void setNvmlShutdown(Object newNvmlShutdown) {
		nvmlShutdown = newNvmlShutdown;
	}
	public Object getNvmlDeviceGetCount() {
		return nvmlDeviceGetCount;
	}
	public void setNvmlDeviceGetCount(Object newNvmlDeviceGetCount) {
		nvmlDeviceGetCount = newNvmlDeviceGetCount;
	}
	public Object getNvmlDeviceGetName() {
		return nvmlDeviceGetName;
	}
	public void setNvmlDeviceGetName(Object newNvmlDeviceGetName) {
		nvmlDeviceGetName = newNvmlDeviceGetName;
	}
	public Object getNvmlDeviceGetHandleByIndex() {
		return nvmlDeviceGetHandleByIndex;
	}
	public void setNvmlDeviceGetHandleByIndex(Object newNvmlDeviceGetHandleByIndex) {
		nvmlDeviceGetHandleByIndex = newNvmlDeviceGetHandleByIndex;
	}
	public Object getNvmlDeviceGetTemperature() {
		return nvmlDeviceGetTemperature;
	}
	public void setNvmlDeviceGetTemperature(Object newNvmlDeviceGetTemperature) {
		nvmlDeviceGetTemperature = newNvmlDeviceGetTemperature;
	}
	public Object getNvmlDeviceGetFanSpeed() {
		return nvmlDeviceGetFanSpeed;
	}
	public void setNvmlDeviceGetFanSpeed(Object newNvmlDeviceGetFanSpeed) {
		nvmlDeviceGetFanSpeed = newNvmlDeviceGetFanSpeed;
	}
	public Object getNvmlDeviceGetUtilizationRates() {
		return nvmlDeviceGetUtilizationRates;
	}
	public void setNvmlDeviceGetUtilizationRates(Object newNvmlDeviceGetUtilizationRates) {
		nvmlDeviceGetUtilizationRates = newNvmlDeviceGetUtilizationRates;
	}
	public Object getNvmlDeviceGetClockInfo() {
		return nvmlDeviceGetClockInfo;
	}
	public void setNvmlDeviceGetClockInfo(Object newNvmlDeviceGetClockInfo) {
		nvmlDeviceGetClockInfo = newNvmlDeviceGetClockInfo;
	}
	public Object getNvmlDeviceGetTemperatureThreshold() {
		return nvmlDeviceGetTemperatureThreshold;
	}
	public void setNvmlDeviceGetTemperatureThreshold(Object newNvmlDeviceGetTemperatureThreshold) {
		nvmlDeviceGetTemperatureThreshold = newNvmlDeviceGetTemperatureThreshold;
	}
	public Object getNvmlDeviceGetCurrPcieLinkGeneration() {
		return nvmlDeviceGetCurrPcieLinkGeneration;
	}
	public void setNvmlDeviceGetCurrPcieLinkGeneration(Object newNvmlDeviceGetCurrPcieLinkGeneration) {
		nvmlDeviceGetCurrPcieLinkGeneration = newNvmlDeviceGetCurrPcieLinkGeneration;
	}
	public Object getNvmlDeviceGetCurrPcieLinkWidth() {
		return nvmlDeviceGetCurrPcieLinkWidth;
	}
	public void setNvmlDeviceGetCurrPcieLinkWidth(Object newNvmlDeviceGetCurrPcieLinkWidth) {
		nvmlDeviceGetCurrPcieLinkWidth = newNvmlDeviceGetCurrPcieLinkWidth;
	}
	public Object getNvmlDeviceGetCurrentClocksThrottleReasons() {
		return nvmlDeviceGetCurrentClocksThrottleReasons;
	}
	public void setNvmlDeviceGetCurrentClocksThrottleReasons(Object newNvmlDeviceGetCurrentClocksThrottleReasons) {
		nvmlDeviceGetCurrentClocksThrottleReasons = newNvmlDeviceGetCurrentClocksThrottleReasons;
	}
	public Object getNvmlDeviceGetSupportedClocksThrottleReasons() {
		return nvmlDeviceGetSupportedClocksThrottleReasons;
	}
	public void setNvmlDeviceGetSupportedClocksThrottleReasons(Object newNvmlDeviceGetSupportedClocksThrottleReasons) {
		nvmlDeviceGetSupportedClocksThrottleReasons = newNvmlDeviceGetSupportedClocksThrottleReasons;
	}
	public Object getNvmlDeviceGetPciInfo() {
		return nvmlDeviceGetPciInfo;
	}
	public void setNvmlDeviceGetPciInfo(Object newNvmlDeviceGetPciInfo) {
		nvmlDeviceGetPciInfo = newNvmlDeviceGetPciInfo;
	}
}
