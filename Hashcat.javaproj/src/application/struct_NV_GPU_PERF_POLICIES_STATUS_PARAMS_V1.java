package application;

public class struct_NV_GPU_PERF_POLICIES_STATUS_PARAMS_V1 {
	private Object version;
	private Object info_value;
	private Object a;
	private Object b;
	private Object throttle;
	private Object[] x;
	
	public struct_NV_GPU_PERF_POLICIES_STATUS_PARAMS_V1(Object version, Object info_value, Object a, Object b, Object throttle, Object[] x) {
		setVersion(version);
		setInfo_value(info_value);
		setA(a);
		setB(b);
		setThrottle(throttle);
		setX(x);
	}
	public struct_NV_GPU_PERF_POLICIES_STATUS_PARAMS_V1() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getInfo_value() {
		return info_value;
	}
	public void setInfo_value(Object newInfo_value) {
		info_value = newInfo_value;
	}
	public Object getA() {
		return a;
	}
	public void setA(Object newA) {
		a = newA;
	}
	public Object getB() {
		return b;
	}
	public void setB(Object newB) {
		b = newB;
	}
	public Object getThrottle() {
		return throttle;
	}
	public void setThrottle(Object newThrottle) {
		throttle = newThrottle;
	}
	public Object[] getX() {
		return x;
	}
	public void setX(Object[] newX) {
		x = newX;
	}
}
// total size (of memset) is always: 1360 = 0x550
