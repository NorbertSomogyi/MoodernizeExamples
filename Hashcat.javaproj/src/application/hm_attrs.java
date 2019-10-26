package application;

public class hm_attrs {
	private Object adl;
	private Object nvml;
	private Object nvapi;
	private Object sysfs;
	private int od_version;
	private boolean buslanes_get_supported;
	private boolean corespeed_get_supported;
	private boolean fanspeed_get_supported;
	private boolean fanpolicy_get_supported;
	private boolean memoryspeed_get_supported;
	private boolean temperature_get_supported;
	private boolean threshold_shutdown_get_supported;
	private boolean threshold_slowdown_get_supported;
	private boolean throttle_get_supported;
	private boolean utilization_get_supported;
	
	public hm_attrs(Object adl, Object nvml, Object nvapi, Object sysfs, int od_version, boolean buslanes_get_supported, boolean corespeed_get_supported, boolean fanspeed_get_supported, boolean fanpolicy_get_supported, boolean memoryspeed_get_supported, boolean temperature_get_supported, boolean threshold_shutdown_get_supported, boolean threshold_slowdown_get_supported, boolean throttle_get_supported, boolean utilization_get_supported) {
		setAdl(adl);
		setNvml(nvml);
		setNvapi(nvapi);
		setSysfs(sysfs);
		setOd_version(od_version);
		setBuslanes_get_supported(buslanes_get_supported);
		setCorespeed_get_supported(corespeed_get_supported);
		setFanspeed_get_supported(fanspeed_get_supported);
		setFanpolicy_get_supported(fanpolicy_get_supported);
		setMemoryspeed_get_supported(memoryspeed_get_supported);
		setTemperature_get_supported(temperature_get_supported);
		setThreshold_shutdown_get_supported(threshold_shutdown_get_supported);
		setThreshold_slowdown_get_supported(threshold_slowdown_get_supported);
		setThrottle_get_supported(throttle_get_supported);
		setUtilization_get_supported(utilization_get_supported);
	}
	public hm_attrs() {
	}
	
	public Object getAdl() {
		return adl;
	}
	public void setAdl(Object newAdl) {
		adl = newAdl;
	}
	public Object getNvml() {
		return nvml;
	}
	public void setNvml(Object newNvml) {
		nvml = newNvml;
	}
	public Object getNvapi() {
		return nvapi;
	}
	public void setNvapi(Object newNvapi) {
		nvapi = newNvapi;
	}
	public Object getSysfs() {
		return sysfs;
	}
	public void setSysfs(Object newSysfs) {
		sysfs = newSysfs;
	}
	public int getOd_version() {
		return od_version;
	}
	public void setOd_version(int newOd_version) {
		od_version = newOd_version;
	}
	public boolean getBuslanes_get_supported() {
		return buslanes_get_supported;
	}
	public void setBuslanes_get_supported(boolean newBuslanes_get_supported) {
		buslanes_get_supported = newBuslanes_get_supported;
	}
	public boolean getCorespeed_get_supported() {
		return corespeed_get_supported;
	}
	public void setCorespeed_get_supported(boolean newCorespeed_get_supported) {
		corespeed_get_supported = newCorespeed_get_supported;
	}
	public boolean getFanspeed_get_supported() {
		return fanspeed_get_supported;
	}
	public void setFanspeed_get_supported(boolean newFanspeed_get_supported) {
		fanspeed_get_supported = newFanspeed_get_supported;
	}
	public boolean getFanpolicy_get_supported() {
		return fanpolicy_get_supported;
	}
	public void setFanpolicy_get_supported(boolean newFanpolicy_get_supported) {
		fanpolicy_get_supported = newFanpolicy_get_supported;
	}
	public boolean getMemoryspeed_get_supported() {
		return memoryspeed_get_supported;
	}
	public void setMemoryspeed_get_supported(boolean newMemoryspeed_get_supported) {
		memoryspeed_get_supported = newMemoryspeed_get_supported;
	}
	public boolean getTemperature_get_supported() {
		return temperature_get_supported;
	}
	public void setTemperature_get_supported(boolean newTemperature_get_supported) {
		temperature_get_supported = newTemperature_get_supported;
	}
	public boolean getThreshold_shutdown_get_supported() {
		return threshold_shutdown_get_supported;
	}
	public void setThreshold_shutdown_get_supported(boolean newThreshold_shutdown_get_supported) {
		threshold_shutdown_get_supported = newThreshold_shutdown_get_supported;
	}
	public boolean getThreshold_slowdown_get_supported() {
		return threshold_slowdown_get_supported;
	}
	public void setThreshold_slowdown_get_supported(boolean newThreshold_slowdown_get_supported) {
		threshold_slowdown_get_supported = newThreshold_slowdown_get_supported;
	}
	public boolean getThrottle_get_supported() {
		return throttle_get_supported;
	}
	public void setThrottle_get_supported(boolean newThrottle_get_supported) {
		throttle_get_supported = newThrottle_get_supported;
	}
	public boolean getUtilization_get_supported() {
		return utilization_get_supported;
	}
	public void setUtilization_get_supported(boolean newUtilization_get_supported) {
		utilization_get_supported = newUtilization_get_supported;
	}
}
