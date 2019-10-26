package application;

public enum CUfunction_attribute_enum {
	CU_FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK, 
	CU_FUNC_ATTRIBUTE_SHARED_SIZE_BYTES, 
	CU_FUNC_ATTRIBUTE_CONST_SIZE_BYTES, 
	CU_FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES, 
	CU_FUNC_ATTRIBUTE_NUM_REGS, 
	CU_FUNC_ATTRIBUTE_PTX_VERSION, 
	CU_FUNC_ATTRIBUTE_BINARY_VERSION, 
	CU_FUNC_ATTRIBUTE_CACHE_MODE_CA, 
	CU_FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES, 
	CU_FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT, 
	CU_FUNC_ATTRIBUTE_MAX
}
/**
     * The maximum number of threads per block, beyond which a launch of the
     * function would fail. This number depends on both the function and the
     * device on which the function is currently loaded.
     */
