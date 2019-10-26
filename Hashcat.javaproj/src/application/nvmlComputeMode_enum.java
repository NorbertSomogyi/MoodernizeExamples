package application;

public enum nvmlComputeMode_enum {
	NVML_COMPUTEMODE_DEFAULT, 
	NVML_COMPUTEMODE_EXCLUSIVE_THREAD, 
	NVML_COMPUTEMODE_PROHIBITED, 
	NVML_COMPUTEMODE_EXCLUSIVE_PROCESS, 
	NVML_COMPUTEMODE_COUNT
}
//!< Default compute mode -- multiple contexts per device
//!< Compute-exclusive-thread mode -- only one context per device, usable from one thread at a time
//!< Compute-prohibited mode -- no contexts per device
//!< Compute-exclusive-process mode -- only one context per device, usable from multiple threads at a time
// Keep this last
