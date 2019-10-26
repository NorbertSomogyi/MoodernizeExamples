package application;

// An input argument is not large enough
// A device's external power cables are not properly attached
// NVIDIA driver is not loaded
// User provided timeout passed
// An internal driver error occurred
public enum nvmlClockType_enum {
	NVML_CLOCK_GRAPHICS, 
	NVML_CLOCK_SM, 
	NVML_CLOCK_MEM
}
