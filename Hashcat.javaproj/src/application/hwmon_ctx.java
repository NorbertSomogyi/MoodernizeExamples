package application;

public class hwmon_ctx {
	private boolean enabled;
	private Object hm_adl;
	private Object hm_nvml;
	private Object hm_nvapi;
	private Object hm_sysfs;
	private hm_attrs hm_device;
	private struct_ADLOD6MemClockState od_clock_mem_status;
	
	public hwmon_ctx(boolean enabled, Object hm_adl, Object hm_nvml, Object hm_nvapi, Object hm_sysfs, hm_attrs hm_device, struct_ADLOD6MemClockState od_clock_mem_status) {
		setEnabled(enabled);
		setHm_adl(hm_adl);
		setHm_nvml(hm_nvml);
		setHm_nvapi(hm_nvapi);
		setHm_sysfs(hm_sysfs);
		setHm_device(hm_device);
		setOd_clock_mem_status(od_clock_mem_status);
	}
	public hwmon_ctx() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public Object getHm_adl() {
		return hm_adl;
	}
	public void setHm_adl(Object newHm_adl) {
		hm_adl = newHm_adl;
	}
	public Object getHm_nvml() {
		return hm_nvml;
	}
	public void setHm_nvml(Object newHm_nvml) {
		hm_nvml = newHm_nvml;
	}
	public Object getHm_nvapi() {
		return hm_nvapi;
	}
	public void setHm_nvapi(Object newHm_nvapi) {
		hm_nvapi = newHm_nvapi;
	}
	public Object getHm_sysfs() {
		return hm_sysfs;
	}
	public void setHm_sysfs(Object newHm_sysfs) {
		hm_sysfs = newHm_sysfs;
	}
	public hm_attrs getHm_device() {
		return hm_device;
	}
	public void setHm_device(hm_attrs newHm_device) {
		hm_device = newHm_device;
	}
	public struct_ADLOD6MemClockState getOd_clock_mem_status() {
		return od_clock_mem_status;
	}
	public void setOd_clock_mem_status(struct_ADLOD6MemClockState newOd_clock_mem_status) {
		od_clock_mem_status = newOd_clock_mem_status;
	}
}
