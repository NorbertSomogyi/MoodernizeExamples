package application;

public class IDirect3D8Vtbl {
	private Object QueryInterface;
	private Object AddRef;
	private Object Release;
	private Object RegisterSoftwareDevice;
	private Object GetAdapterCount;
	private Object GetAdapterIdentifier;
	private Object GetAdapterModeCount;
	private Object EnumAdapterModes;
	private Object GetAdapterDisplayMode;
	private Object CheckDeviceType;
	private Object CheckDeviceFormat;
	private Object CheckDeviceMultiSampleType;
	private Object CheckDepthStencilMatch;
	private Object GetDeviceCaps;
	private Object GetAdapterMonitor;
	private Object CreateDevice;
	
	public IDirect3D8Vtbl(Object QueryInterface, Object AddRef, Object Release, Object RegisterSoftwareDevice, Object GetAdapterCount, Object GetAdapterIdentifier, Object GetAdapterModeCount, Object EnumAdapterModes, Object GetAdapterDisplayMode, Object CheckDeviceType, Object CheckDeviceFormat, Object CheckDeviceMultiSampleType, Object CheckDepthStencilMatch, Object GetDeviceCaps, Object GetAdapterMonitor, Object CreateDevice) {
		setQueryInterface(QueryInterface);
		setAddRef(AddRef);
		setRelease(Release);
		setRegisterSoftwareDevice(RegisterSoftwareDevice);
		setGetAdapterCount(GetAdapterCount);
		setGetAdapterIdentifier(GetAdapterIdentifier);
		setGetAdapterModeCount(GetAdapterModeCount);
		setEnumAdapterModes(EnumAdapterModes);
		setGetAdapterDisplayMode(GetAdapterDisplayMode);
		setCheckDeviceType(CheckDeviceType);
		setCheckDeviceFormat(CheckDeviceFormat);
		setCheckDeviceMultiSampleType(CheckDeviceMultiSampleType);
		setCheckDepthStencilMatch(CheckDepthStencilMatch);
		setGetDeviceCaps(GetDeviceCaps);
		setGetAdapterMonitor(GetAdapterMonitor);
		setCreateDevice(CreateDevice);
	}
	public IDirect3D8Vtbl() {
	}
	
	public Object getQueryInterface() {
		return QueryInterface;
	}
	public void setQueryInterface(Object newQueryInterface) {
		QueryInterface = newQueryInterface;
	}
	public Object getAddRef() {
		return AddRef;
	}
	public void setAddRef(Object newAddRef) {
		AddRef = newAddRef;
	}
	public Object getRelease() {
		return Release;
	}
	public void setRelease(Object newRelease) {
		Release = newRelease;
	}
	public Object getRegisterSoftwareDevice() {
		return RegisterSoftwareDevice;
	}
	public void setRegisterSoftwareDevice(Object newRegisterSoftwareDevice) {
		RegisterSoftwareDevice = newRegisterSoftwareDevice;
	}
	public Object getGetAdapterCount() {
		return GetAdapterCount;
	}
	public void setGetAdapterCount(Object newGetAdapterCount) {
		GetAdapterCount = newGetAdapterCount;
	}
	public Object getGetAdapterIdentifier() {
		return GetAdapterIdentifier;
	}
	public void setGetAdapterIdentifier(Object newGetAdapterIdentifier) {
		GetAdapterIdentifier = newGetAdapterIdentifier;
	}
	public Object getGetAdapterModeCount() {
		return GetAdapterModeCount;
	}
	public void setGetAdapterModeCount(Object newGetAdapterModeCount) {
		GetAdapterModeCount = newGetAdapterModeCount;
	}
	public Object getEnumAdapterModes() {
		return EnumAdapterModes;
	}
	public void setEnumAdapterModes(Object newEnumAdapterModes) {
		EnumAdapterModes = newEnumAdapterModes;
	}
	public Object getGetAdapterDisplayMode() {
		return GetAdapterDisplayMode;
	}
	public void setGetAdapterDisplayMode(Object newGetAdapterDisplayMode) {
		GetAdapterDisplayMode = newGetAdapterDisplayMode;
	}
	public Object getCheckDeviceType() {
		return CheckDeviceType;
	}
	public void setCheckDeviceType(Object newCheckDeviceType) {
		CheckDeviceType = newCheckDeviceType;
	}
	public Object getCheckDeviceFormat() {
		return CheckDeviceFormat;
	}
	public void setCheckDeviceFormat(Object newCheckDeviceFormat) {
		CheckDeviceFormat = newCheckDeviceFormat;
	}
	public Object getCheckDeviceMultiSampleType() {
		return CheckDeviceMultiSampleType;
	}
	public void setCheckDeviceMultiSampleType(Object newCheckDeviceMultiSampleType) {
		CheckDeviceMultiSampleType = newCheckDeviceMultiSampleType;
	}
	public Object getCheckDepthStencilMatch() {
		return CheckDepthStencilMatch;
	}
	public void setCheckDepthStencilMatch(Object newCheckDepthStencilMatch) {
		CheckDepthStencilMatch = newCheckDepthStencilMatch;
	}
	public Object getGetDeviceCaps() {
		return GetDeviceCaps;
	}
	public void setGetDeviceCaps(Object newGetDeviceCaps) {
		GetDeviceCaps = newGetDeviceCaps;
	}
	public Object getGetAdapterMonitor() {
		return GetAdapterMonitor;
	}
	public void setGetAdapterMonitor(Object newGetAdapterMonitor) {
		GetAdapterMonitor = newGetAdapterMonitor;
	}
	public Object getCreateDevice() {
		return CreateDevice;
	}
	public void setCreateDevice(Object newCreateDevice) {
		CreateDevice = newCreateDevice;
	}
}
