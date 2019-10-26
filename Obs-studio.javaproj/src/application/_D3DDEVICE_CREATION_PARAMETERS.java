package application;

/* Creation Parameters */
public class _D3DDEVICE_CREATION_PARAMETERS {
	private Object AdapterOrdinal;
	private _D3DDEVTYPE DeviceType;
	private Object hFocusWindow;
	private Object BehaviorFlags;
	
	public _D3DDEVICE_CREATION_PARAMETERS(Object AdapterOrdinal, _D3DDEVTYPE DeviceType, Object hFocusWindow, Object BehaviorFlags) {
		setAdapterOrdinal(AdapterOrdinal);
		setDeviceType(DeviceType);
		setHFocusWindow(hFocusWindow);
		setBehaviorFlags(BehaviorFlags);
	}
	public _D3DDEVICE_CREATION_PARAMETERS() {
	}
	
	public Object getAdapterOrdinal() {
		return AdapterOrdinal;
	}
	public void setAdapterOrdinal(Object newAdapterOrdinal) {
		AdapterOrdinal = newAdapterOrdinal;
	}
	public _D3DDEVTYPE getDeviceType() {
		return DeviceType;
	}
	public void setDeviceType(_D3DDEVTYPE newDeviceType) {
		DeviceType = newDeviceType;
	}
	public Object getHFocusWindow() {
		return hFocusWindow;
	}
	public void setHFocusWindow(Object newHFocusWindow) {
		hFocusWindow = newHFocusWindow;
	}
	public Object getBehaviorFlags() {
		return BehaviorFlags;
	}
	public void setBehaviorFlags(Object newBehaviorFlags) {
		BehaviorFlags = newBehaviorFlags;
	}
}
