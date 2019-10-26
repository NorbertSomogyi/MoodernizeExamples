package application;

/**
 * Context creation flags
 */
public enum CUctx_flags_enum {
	CU_CTX_SCHED_AUTO, 
	CU_CTX_SCHED_SPIN, 
	CU_CTX_SCHED_YIELD, 
	CU_CTX_SCHED_BLOCKING_SYNC, 
	CU_CTX_BLOCKING_SYNC, 
	CU_CTX_SCHED_MASK, 
	CU_CTX_MAP_HOST, 
	CU_CTX_LMEM_RESIZE_TO_MAX, 
	CU_CTX_FLAGS_MASK
}
