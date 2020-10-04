package application;

// The given registry value is not supported.
// Stereo is not enabled and the function needed it to execute completely.
// Stereo is not turned on and the function needed it to execute completely.
// Invalid device interface.
// Separation percentage or JPEG image capture quality is out of [0-100] range.
// The given frustum adjust mode is not supported.
// The mosaic topology is not possible given the current state of the hardware.
// An attempt to do a display resolution mode change has failed.
// d3d11.dll/d3d11_beta.dll cannot be loaded.
// Address is outside of valid range.
// The pre-allocated string is too small to hold the result.
// The input does not match any of the available devices.
// Driver is running.
// Driver is not running.
// A driver reload is required to apply these settings.
// Intended setting is not allowed.
// Information can't be returned due to "advanced display topology".
// Setting is not found.
// Setting size is too large.
// There are too many settings for a profile.
// Profile is not found.
// Profile name is duplicated.
// Profile name is empty.
// Application not found in the Profile.
// Application already exists in the other profile.
// Data Type mismatch
// The profile passed as parameter has been removed and is no longer valid.
// An unregistered resource was passed as a parameter.
// The DisplayId corresponds to a display which is not within the normal outputId range.
// Display topology is not valid so the driver cannot do a mode set on this configuration.
// Display Port Multi-Stream topology has been changed.
// Input buffer is insufficient to hold the contents.
// No access to the caller.
// The requested action cannot be performed without Mosaic being enabled.
// The surface is relocated away from video memory.
// The user should disable DWM before calling NvAPI.
// D3D device status is D3DERR_DEVICELOST or D3DERR_DEVICENOTRESET - the user has to reset the device.
// The requested action cannot be performed in the current state.
// Call failed as stereo handshake not completed.
// The path provided was too short to determine the correct NVDRS_APPLICATION
// Default stereo profile is not currently defined
// Default stereo profile does not exist
// A cluster is already defined with the given configuration.
// The input display id is not that of a multi stream enabled connector or a display device in a multi stream topology
// The input display id is not valid or the monitor associated to it does not support the current operation
// While playing secure audio stream, stream goes out of sync
// Older audio driver version than required
// Value already set, setting again not allowed.
// Requested operation timed out
// The requested workstation feature set has incomplete driver internal allocation resources
// Call failed because InitActivation was not called.
// The requested action cannot be performed without Sync being enabled.
// The requested action cannot be performed without Sync Master being enabled.
// Invalid displays passed in the NV_GSYNC_DISPLAY pointer.
// The specified signing algorithm is not supported. Either an incorrect value was entered or the current installed driver/hardware does not support the input value.
// The encrypted public key verification has failed.
// The device's firmware is out of date.
// The device's firmware is not supported.
public class struct_NV_GPU_PERF_POLICIES_INFO_PARAMS_V1 {
	private Object version;
	private Object a;
	private Object info_value;
	private Object[] x;
	
	public struct_NV_GPU_PERF_POLICIES_INFO_PARAMS_V1(Object version, Object a, Object info_value, Object[] x) {
		setVersion(version);
		setA(a);
		setInfo_value(info_value);
		setX(x);
	}
	public struct_NV_GPU_PERF_POLICIES_INFO_PARAMS_V1() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getA() {
		return a;
	}
	public void setA(Object newA) {
		a = newA;
	}
	public Object getInfo_value() {
		return info_value;
	}
	public void setInfo_value(Object newInfo_value) {
		info_value = newInfo_value;
	}
	public Object[] getX() {
		return x;
	}
	public void setX(Object[] newX) {
		x = newX;
	}
}
// total size (of memset) is always: 76 = 0x4c
