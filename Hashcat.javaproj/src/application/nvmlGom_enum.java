package application;

public enum nvmlGom_enum {
	NVML_GOM_ALL_ON, 
	NVML_GOM_COMPUTE, 
	NVML_GOM_LOW_DP
}
//!< Everything is enabled and running at full speed
//!< Designed for running only compute tasks. Graphics operations
//!< are not allowed
//!< Designed for running graphics applications that don't require
//!< high bandwidth double precision
