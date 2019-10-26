package application;

public class _GPU_DEVICE {
	private Object cb;
	private Object DeviceName;
	private Object DeviceString;
	private Object Flags;
	private tagRECT rcVirtualScreen;
	
	public _GPU_DEVICE(Object cb, Object DeviceName, Object DeviceString, Object Flags, tagRECT rcVirtualScreen) {
		setCb(cb);
		setDeviceName(DeviceName);
		setDeviceString(DeviceString);
		setFlags(Flags);
		setRcVirtualScreen(rcVirtualScreen);
	}
	public _GPU_DEVICE() {
	}
	
	public Object getCb() {
		return cb;
	}
	public void setCb(Object newCb) {
		cb = newCb;
	}
	public Object getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(Object newDeviceName) {
		DeviceName = newDeviceName;
	}
	public Object getDeviceString() {
		return DeviceString;
	}
	public void setDeviceString(Object newDeviceString) {
		DeviceString = newDeviceString;
	}
	public Object getFlags() {
		return Flags;
	}
	public void setFlags(Object newFlags) {
		Flags = newFlags;
	}
	public tagRECT getRcVirtualScreen() {
		return rcVirtualScreen;
	}
	public void setRcVirtualScreen(tagRECT newRcVirtualScreen) {
		rcVirtualScreen = newRcVirtualScreen;
	}
}
