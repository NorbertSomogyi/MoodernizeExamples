package application;

public class backend_ctx {
	private boolean enabled;
	private Object ocl;
	private Object cuda;
	private Object nvrtc;
	private Object backend_device_from_cuda;
	private Object backend_device_from_opencl;
	private Object backend_device_from_opencl_platform;
	private int backend_devices_cnt;
	private int backend_devices_active;
	private int cuda_devices_cnt;
	private int cuda_devices_active;
	private int opencl_devices_cnt;
	private int opencl_devices_active;
	private Object backend_devices_filter;
	private hc_device_param[] devices_param;
	private Object hardware_power_all;
	private Object kernel_power_all;
	private Object kernel_power_final;
	private double target_msec;
	private boolean need_adl;
	private boolean need_nvml;
	private boolean need_nvapi;
	private boolean need_sysfs;
	private int comptime;
	private int force_jit_compilation;
	private int nvrtc_driver_version;
	private int cuda_driver_version;
	private Object opencl_platforms;
	private Object opencl_platforms_cnt;
	private Object[][] opencl_platforms_devices;
	private Object opencl_platforms_devices_cnt;
	private byte[][] opencl_platforms_name;
	private byte[][] opencl_platforms_vendor;
	private Object opencl_platforms_vendor_id;
	private byte[][] opencl_platforms_version;
	private Object opencl_device_types_filter;
	
	public backend_ctx(boolean enabled, Object ocl, Object cuda, Object nvrtc, Object backend_device_from_cuda, Object backend_device_from_opencl, Object backend_device_from_opencl_platform, int backend_devices_cnt, int backend_devices_active, int cuda_devices_cnt, int cuda_devices_active, int opencl_devices_cnt, int opencl_devices_active, Object backend_devices_filter, hc_device_param[] devices_param, Object hardware_power_all, Object kernel_power_all, Object kernel_power_final, double target_msec, boolean need_adl, boolean need_nvml, boolean need_nvapi, boolean need_sysfs, int comptime, int force_jit_compilation, int nvrtc_driver_version, int cuda_driver_version, Object opencl_platforms, Object opencl_platforms_cnt, Object[][] opencl_platforms_devices, Object opencl_platforms_devices_cnt, byte[][] opencl_platforms_name, byte[][] opencl_platforms_vendor, Object opencl_platforms_vendor_id, byte[][] opencl_platforms_version, Object opencl_device_types_filter) {
		setEnabled(enabled);
		setOcl(ocl);
		setCuda(cuda);
		setNvrtc(nvrtc);
		setBackend_device_from_cuda(backend_device_from_cuda);
		setBackend_device_from_opencl(backend_device_from_opencl);
		setBackend_device_from_opencl_platform(backend_device_from_opencl_platform);
		setBackend_devices_cnt(backend_devices_cnt);
		setBackend_devices_active(backend_devices_active);
		setCuda_devices_cnt(cuda_devices_cnt);
		setCuda_devices_active(cuda_devices_active);
		setOpencl_devices_cnt(opencl_devices_cnt);
		setOpencl_devices_active(opencl_devices_active);
		setBackend_devices_filter(backend_devices_filter);
		setDevices_param(devices_param);
		setHardware_power_all(hardware_power_all);
		setKernel_power_all(kernel_power_all);
		setKernel_power_final(kernel_power_final);
		setTarget_msec(target_msec);
		setNeed_adl(need_adl);
		setNeed_nvml(need_nvml);
		setNeed_nvapi(need_nvapi);
		setNeed_sysfs(need_sysfs);
		setComptime(comptime);
		setForce_jit_compilation(force_jit_compilation);
		setNvrtc_driver_version(nvrtc_driver_version);
		setCuda_driver_version(cuda_driver_version);
		setOpencl_platforms(opencl_platforms);
		setOpencl_platforms_cnt(opencl_platforms_cnt);
		setOpencl_platforms_devices(opencl_platforms_devices);
		setOpencl_platforms_devices_cnt(opencl_platforms_devices_cnt);
		setOpencl_platforms_name(opencl_platforms_name);
		setOpencl_platforms_vendor(opencl_platforms_vendor);
		setOpencl_platforms_vendor_id(opencl_platforms_vendor_id);
		setOpencl_platforms_version(opencl_platforms_version);
		setOpencl_device_types_filter(opencl_device_types_filter);
	}
	public backend_ctx() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public Object getOcl() {
		return ocl;
	}
	public void setOcl(Object newOcl) {
		ocl = newOcl;
	}
	public Object getCuda() {
		return cuda;
	}
	public void setCuda(Object newCuda) {
		cuda = newCuda;
	}
	public Object getNvrtc() {
		return nvrtc;
	}
	public void setNvrtc(Object newNvrtc) {
		nvrtc = newNvrtc;
	}
	public Object getBackend_device_from_cuda() {
		return backend_device_from_cuda;
	}
	public void setBackend_device_from_cuda(Object newBackend_device_from_cuda) {
		backend_device_from_cuda = newBackend_device_from_cuda;
	}
	public Object getBackend_device_from_opencl() {
		return backend_device_from_opencl;
	}
	public void setBackend_device_from_opencl(Object newBackend_device_from_opencl) {
		backend_device_from_opencl = newBackend_device_from_opencl;
	}
	public Object getBackend_device_from_opencl_platform() {
		return backend_device_from_opencl_platform;
	}
	public void setBackend_device_from_opencl_platform(Object newBackend_device_from_opencl_platform) {
		backend_device_from_opencl_platform = newBackend_device_from_opencl_platform;
	}
	public int getBackend_devices_cnt() {
		return backend_devices_cnt;
	}
	public void setBackend_devices_cnt(int newBackend_devices_cnt) {
		backend_devices_cnt = newBackend_devices_cnt;
	}
	public int getBackend_devices_active() {
		return backend_devices_active;
	}
	public void setBackend_devices_active(int newBackend_devices_active) {
		backend_devices_active = newBackend_devices_active;
	}
	public int getCuda_devices_cnt() {
		return cuda_devices_cnt;
	}
	public void setCuda_devices_cnt(int newCuda_devices_cnt) {
		cuda_devices_cnt = newCuda_devices_cnt;
	}
	public int getCuda_devices_active() {
		return cuda_devices_active;
	}
	public void setCuda_devices_active(int newCuda_devices_active) {
		cuda_devices_active = newCuda_devices_active;
	}
	public int getOpencl_devices_cnt() {
		return opencl_devices_cnt;
	}
	public void setOpencl_devices_cnt(int newOpencl_devices_cnt) {
		opencl_devices_cnt = newOpencl_devices_cnt;
	}
	public int getOpencl_devices_active() {
		return opencl_devices_active;
	}
	public void setOpencl_devices_active(int newOpencl_devices_active) {
		opencl_devices_active = newOpencl_devices_active;
	}
	public Object getBackend_devices_filter() {
		return backend_devices_filter;
	}
	public void setBackend_devices_filter(Object newBackend_devices_filter) {
		backend_devices_filter = newBackend_devices_filter;
	}
	public hc_device_param[] getDevices_param() {
		return devices_param;
	}
	public void setDevices_param(hc_device_param[] newDevices_param) {
		devices_param = newDevices_param;
	}
	public Object getHardware_power_all() {
		return hardware_power_all;
	}
	public void setHardware_power_all(Object newHardware_power_all) {
		hardware_power_all = newHardware_power_all;
	}
	public Object getKernel_power_all() {
		return kernel_power_all;
	}
	public void setKernel_power_all(Object newKernel_power_all) {
		kernel_power_all = newKernel_power_all;
	}
	public Object getKernel_power_final() {
		return kernel_power_final;
	}
	public void setKernel_power_final(Object newKernel_power_final) {
		kernel_power_final = newKernel_power_final;
	}
	public double getTarget_msec() {
		return target_msec;
	}
	public void setTarget_msec(double newTarget_msec) {
		target_msec = newTarget_msec;
	}
	public boolean getNeed_adl() {
		return need_adl;
	}
	public void setNeed_adl(boolean newNeed_adl) {
		need_adl = newNeed_adl;
	}
	public boolean getNeed_nvml() {
		return need_nvml;
	}
	public void setNeed_nvml(boolean newNeed_nvml) {
		need_nvml = newNeed_nvml;
	}
	public boolean getNeed_nvapi() {
		return need_nvapi;
	}
	public void setNeed_nvapi(boolean newNeed_nvapi) {
		need_nvapi = newNeed_nvapi;
	}
	public boolean getNeed_sysfs() {
		return need_sysfs;
	}
	public void setNeed_sysfs(boolean newNeed_sysfs) {
		need_sysfs = newNeed_sysfs;
	}
	public int getComptime() {
		return comptime;
	}
	public void setComptime(int newComptime) {
		comptime = newComptime;
	}
	public int getForce_jit_compilation() {
		return force_jit_compilation;
	}
	public void setForce_jit_compilation(int newForce_jit_compilation) {
		force_jit_compilation = newForce_jit_compilation;
	}
	public int getNvrtc_driver_version() {
		return nvrtc_driver_version;
	}
	public void setNvrtc_driver_version(int newNvrtc_driver_version) {
		nvrtc_driver_version = newNvrtc_driver_version;
	}
	public int getCuda_driver_version() {
		return cuda_driver_version;
	}
	public void setCuda_driver_version(int newCuda_driver_version) {
		cuda_driver_version = newCuda_driver_version;
	}
	public Object getOpencl_platforms() {
		return opencl_platforms;
	}
	public void setOpencl_platforms(Object newOpencl_platforms) {
		opencl_platforms = newOpencl_platforms;
	}
	public Object getOpencl_platforms_cnt() {
		return opencl_platforms_cnt;
	}
	public void setOpencl_platforms_cnt(Object newOpencl_platforms_cnt) {
		opencl_platforms_cnt = newOpencl_platforms_cnt;
	}
	public Object[][] getOpencl_platforms_devices() {
		return opencl_platforms_devices;
	}
	public void setOpencl_platforms_devices(Object[][] newOpencl_platforms_devices) {
		opencl_platforms_devices = newOpencl_platforms_devices;
	}
	public Object getOpencl_platforms_devices_cnt() {
		return opencl_platforms_devices_cnt;
	}
	public void setOpencl_platforms_devices_cnt(Object newOpencl_platforms_devices_cnt) {
		opencl_platforms_devices_cnt = newOpencl_platforms_devices_cnt;
	}
	public byte[][] getOpencl_platforms_name() {
		return opencl_platforms_name;
	}
	public void setOpencl_platforms_name(byte[][] newOpencl_platforms_name) {
		opencl_platforms_name = newOpencl_platforms_name;
	}
	public byte[][] getOpencl_platforms_vendor() {
		return opencl_platforms_vendor;
	}
	public void setOpencl_platforms_vendor(byte[][] newOpencl_platforms_vendor) {
		opencl_platforms_vendor = newOpencl_platforms_vendor;
	}
	public Object getOpencl_platforms_vendor_id() {
		return opencl_platforms_vendor_id;
	}
	public void setOpencl_platforms_vendor_id(Object newOpencl_platforms_vendor_id) {
		opencl_platforms_vendor_id = newOpencl_platforms_vendor_id;
	}
	public byte[][] getOpencl_platforms_version() {
		return opencl_platforms_version;
	}
	public void setOpencl_platforms_version(byte[][] newOpencl_platforms_version) {
		opencl_platforms_version = newOpencl_platforms_version;
	}
	public Object getOpencl_device_types_filter() {
		return opencl_device_types_filter;
	}
	public void setOpencl_device_types_filter(Object newOpencl_device_types_filter) {
		opencl_device_types_filter = newOpencl_device_types_filter;
	}
}
