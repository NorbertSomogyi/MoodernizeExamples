package application;

public enum nvmlReturn_enum {
	NVML_SUCCESS, 
	NVML_ERROR_UNINITIALIZED, 
	NVML_ERROR_INVALID_ARGUMENT, 
	NVML_ERROR_NOT_SUPPORTED, 
	NVML_ERROR_NO_PERMISSION, 
	NVML_ERROR_ALREADY_INITIALIZED, 
	NVML_ERROR_NOT_FOUND, 
	NVML_ERROR_INSUFFICIENT_SIZE, 
	NVML_ERROR_INSUFFICIENT_POWER, 
	NVML_ERROR_DRIVER_NOT_LOADED, 
	NVML_ERROR_TIMEOUT, 
	NVML_ERROR_UNKNOWN
}
// The operation was successful
// NVML was not first initialized with nvmlInit()
// A supplied argument is invalid
// The requested operation is not available on target device
// The current user does not have permission for operation
// Deprecated: Multiple initializations are now allowed through ref counting
// A query to find an object was unsuccessful
