package application;

public enum _NvAPI_Status {
	NVAPI_OK, 
	NVAPI_ERROR, 
	NVAPI_LIBRARY_NOT_FOUND, 
	NVAPI_NO_IMPLEMENTATION, 
	NVAPI_API_NOT_INITIALIZED, 
	NVAPI_INVALID_ARGUMENT, 
	NVAPI_NVIDIA_DEVICE_NOT_FOUND, 
	NVAPI_END_ENUMERATION, 
	NVAPI_INVALID_HANDLE, 
	NVAPI_INCOMPATIBLE_STRUCT_VERSION, 
	NVAPI_HANDLE_INVALIDATED, 
	NVAPI_OPENGL_CONTEXT_NOT_CURRENT, 
	NVAPI_INVALID_POINTER, 
	NVAPI_NO_GL_EXPERT, 
	NVAPI_INSTRUMENTATION_DISABLED, 
	NVAPI_NO_GL_NSIGHT, 
	NVAPI_EXPECTED_LOGICAL_GPU_HANDLE, 
	NVAPI_EXPECTED_PHYSICAL_GPU_HANDLE, 
	NVAPI_EXPECTED_DISPLAY_HANDLE, 
	NVAPI_INVALID_COMBINATION, 
	NVAPI_NOT_SUPPORTED, 
	NVAPI_PORTID_NOT_FOUND, 
	NVAPI_EXPECTED_UNATTACHED_DISPLAY_HANDLE, 
	NVAPI_INVALID_PERF_LEVEL, 
	NVAPI_DEVICE_BUSY, 
	NVAPI_NV_PERSIST_FILE_NOT_FOUND, 
	NVAPI_PERSIST_DATA_NOT_FOUND, 
	NVAPI_EXPECTED_TV_DISPLAY, 
	NVAPI_EXPECTED_TV_DISPLAY_ON_DCONNECTOR, 
	NVAPI_NO_ACTIVE_SLI_TOPOLOGY, 
	NVAPI_SLI_RENDERING_MODE_NOTALLOWED, 
	NVAPI_EXPECTED_DIGITAL_FLAT_PANEL, 
	NVAPI_ARGUMENT_EXCEED_MAX_SIZE, 
	NVAPI_DEVICE_SWITCHING_NOT_ALLOWED, 
	NVAPI_TESTING_CLOCKS_NOT_SUPPORTED, 
	NVAPI_UNKNOWN_UNDERSCAN_CONFIG, 
	NVAPI_TIMEOUT_RECONFIGURING_GPU_TOPO, 
	NVAPI_DATA_NOT_FOUND, 
	NVAPI_EXPECTED_ANALOG_DISPLAY, 
	NVAPI_NO_VIDLINK, 
	NVAPI_REQUIRES_REBOOT, 
	NVAPI_INVALID_HYBRID_MODE, 
	NVAPI_MIXED_TARGET_TYPES, 
	NVAPI_SYSWOW64_NOT_SUPPORTED, 
	NVAPI_IMPLICIT_SET_GPU_TOPOLOGY_CHANGE_NOT_ALLOWED, 
	NVAPI_REQUEST_USER_TO_CLOSE_NON_MIGRATABLE_APPS, 
	NVAPI_OUT_OF_MEMORY, 
	NVAPI_WAS_STILL_DRAWING, 
	NVAPI_FILE_NOT_FOUND, 
	NVAPI_TOO_MANY_UNIQUE_STATE_OBJECTS, 
	NVAPI_INVALID_CALL, 
	NVAPI_D3D10_1_LIBRARY_NOT_FOUND, 
	NVAPI_FUNCTION_NOT_FOUND, 
	NVAPI_INVALID_USER_PRIVILEGE, 
	NVAPI_EXPECTED_NON_PRIMARY_DISPLAY_HANDLE, 
	NVAPI_EXPECTED_COMPUTE_GPU_HANDLE, 
	NVAPI_STEREO_NOT_INITIALIZED, 
	NVAPI_STEREO_REGISTRY_ACCESS_FAILED, 
	NVAPI_STEREO_REGISTRY_PROFILE_TYPE_NOT_SUPPORTED, 
	NVAPI_STEREO_REGISTRY_VALUE_NOT_SUPPORTED, 
	NVAPI_STEREO_NOT_ENABLED, 
	NVAPI_STEREO_NOT_TURNED_ON, 
	NVAPI_STEREO_INVALID_DEVICE_INTERFACE, 
	NVAPI_STEREO_PARAMETER_OUT_OF_RANGE, 
	NVAPI_STEREO_FRUSTUM_ADJUST_MODE_NOT_SUPPORTED, 
	NVAPI_TOPO_NOT_POSSIBLE, 
	NVAPI_MODE_CHANGE_FAILED, 
	NVAPI_D3D11_LIBRARY_NOT_FOUND, 
	NVAPI_INVALID_ADDRESS, 
	NVAPI_STRING_TOO_SMALL, 
	NVAPI_MATCHING_DEVICE_NOT_FOUND, 
	NVAPI_DRIVER_RUNNING, 
	NVAPI_DRIVER_NOTRUNNING, 
	NVAPI_ERROR_DRIVER_RELOAD_REQUIRED, 
	NVAPI_SET_NOT_ALLOWED, 
	NVAPI_ADVANCED_DISPLAY_TOPOLOGY_REQUIRED, 
	NVAPI_SETTING_NOT_FOUND, 
	NVAPI_SETTING_SIZE_TOO_LARGE, 
	NVAPI_TOO_MANY_SETTINGS_IN_PROFILE, 
	NVAPI_PROFILE_NOT_FOUND, 
	NVAPI_PROFILE_NAME_IN_USE, 
	NVAPI_PROFILE_NAME_EMPTY, 
	NVAPI_EXECUTABLE_NOT_FOUND, 
	NVAPI_EXECUTABLE_ALREADY_IN_USE, 
	NVAPI_DATATYPE_MISMATCH, 
	NVAPI_PROFILE_REMOVED, 
	NVAPI_UNREGISTERED_RESOURCE, 
	NVAPI_ID_OUT_OF_RANGE, 
	NVAPI_DISPLAYCONFIG_VALIDATION_FAILED, 
	NVAPI_DPMST_CHANGED, 
	NVAPI_INSUFFICIENT_BUFFER, 
	NVAPI_ACCESS_DENIED, 
	NVAPI_MOSAIC_NOT_ACTIVE, 
	NVAPI_SHARE_RESOURCE_RELOCATED, 
	NVAPI_REQUEST_USER_TO_DISABLE_DWM, 
	NVAPI_D3D_DEVICE_LOST, 
	NVAPI_INVALID_CONFIGURATION, 
	NVAPI_STEREO_HANDSHAKE_NOT_DONE, 
	NVAPI_EXECUTABLE_PATH_IS_AMBIGUOUS, 
	NVAPI_DEFAULT_STEREO_PROFILE_IS_NOT_DEFINED, 
	NVAPI_DEFAULT_STEREO_PROFILE_DOES_NOT_EXIST, 
	NVAPI_CLUSTER_ALREADY_EXISTS, 
	NVAPI_DPMST_DISPLAY_ID_EXPECTED, 
	NVAPI_INVALID_DISPLAY_ID, 
	NVAPI_STREAM_IS_OUT_OF_SYNC, 
	NVAPI_INCOMPATIBLE_AUDIO_DRIVER, 
	NVAPI_VALUE_ALREADY_SET, 
	NVAPI_TIMEOUT, 
	NVAPI_GPU_WORKSTATION_FEATURE_INCOMPLETE, 
	NVAPI_STEREO_INIT_ACTIVATION_NOT_DONE, 
	NVAPI_SYNC_NOT_ACTIVE, 
	NVAPI_SYNC_MASTER_NOT_FOUND, 
	NVAPI_INVALID_SYNC_TOPOLOGY, 
	NVAPI_ECID_SIGN_ALGO_UNSUPPORTED, 
	NVAPI_ECID_KEY_VERIFICATION_FAILED, 
	NVAPI_FIRMWARE_OUT_OF_DATE, 
	NVAPI_FIRMWARE_REVISION_NOT_SUPPORTED
}
// Success. Request is completed.
// Generic error
// NVAPI support library cannot be loaded.
// not implemented in current driver installation
// NvAPI_Initialize has not been called (successfully)
// The argument/parameter value is not valid or NULL.
// No NVIDIA display driver, or NVIDIA GPU driving a display, was found.
// No more items to enumerate
// Invalid handle
// An argument's structure version is not supported
// The handle is no longer valid (likely due to GPU or display re-configuration)
// No NVIDIA OpenGL context is current (but needs to be)
// An invalid pointer, usually NULL, was passed as a parameter
// OpenGL Expert is not supported by the current drivers
// OpenGL Expert is supported, but driver instrumentation is currently disabled
// OpenGL does not support Nsight
// Expected a logical GPU handle for one or more parameters
// Expected a physical GPU handle for one or more parameters
// Expected an NV display handle for one or more parameters
// The combination of parameters is not valid.
// Requested feature is not supported in the selected GPU
// No port ID was found for the I2C transaction
// Expected an unattached display handle as one of the input parameters.
// Invalid perf level
// Device is busy; request not fulfilled
// NV persist file is not found
// NV persist data is not found
// Expected a TV output display
// Expected a TV output on the D Connector - HDTV_EIAJ4120.
// SLI is not active on this device.
// Setup of SLI rendering mode is not possible right now.
// Expected a digital flat panel.
// Argument exceeds the expected size.
// Inhibit is ON due to one of the flags in NV_GPU_DISPLAY_CHANGE_INHIBIT or SLI active.
// Testing of clocks is not supported.
// The specified underscan config is from an unknown source (e.g. INF)
// Timeout while reconfiguring GPUs
// Requested data was not found
// Expected an analog display
// No SLI video bridge is present
// NVAPI requires a reboot for the settings to take effect
// The function is not supported with the current Hybrid mode.
// The target types are not all the same
// The function is not supported from 32-bit on a 64-bit system.
// There is no implicit GPU topology active. Use NVAPI_SetHybridMode to change topology.
// Prompt the user to close all non-migratable applications.
// Could not allocate sufficient memory to complete the call.
// The previous operation that is transferring information to or from this surface is incomplete.
// The file was not found.
// There are too many unique instances of a particular type of state object.
// The method call is invalid. For example, a method's parameter may not be a valid pointer.
// d3d10_1.dll cannot be loaded.
// Couldn't find the function in the loaded DLL.
// Current User is not Admin.
// The handle corresponds to GDIPrimary.
// Setting Physx GPU requires that the GPU is compute-capable.
// The Stereo part of NVAPI failed to initialize completely. Check if the stereo driver is installed.
// Access to stereo-related registry keys or values has failed.
// The given registry profile type is not supported.
