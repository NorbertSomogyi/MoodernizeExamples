package application;

/******************************************
* cl_nv_device_attribute_query extension *
******************************************/
/* cl_nv_device_attribute_query extension - no extension #define since it has no functions */
/*********************************
* cl_amd_device_attribute_query *
*********************************/
/*********************************
* cl_arm_printf extension
*********************************/
/***********************************
* cl_ext_device_fission extension
***********************************/
/* cl_device_partition_property_ext */
/* clDeviceGetInfo selectors */
/* error codes */
/* CL_AFFINITY_DOMAINs */
/* cl_device_partition_property_ext list terminators */
/***********************************
 * cl_ext_migrate_memobject extension definitions
 ***********************************/
/*********************************
* cl_qcom_ext_host_ptr extension
*********************************/
public class _cl_mem_ext_host_ptr {
	private Object allocation_type;
	private Object host_cache_policy;
	
	public _cl_mem_ext_host_ptr(Object allocation_type, Object host_cache_policy) {
		setAllocation_type(allocation_type);
		setHost_cache_policy(host_cache_policy);
	}
	public _cl_mem_ext_host_ptr() {
	}
	
	public Object getAllocation_type() {
		return allocation_type;
	}
	public void setAllocation_type(Object newAllocation_type) {
		allocation_type = newAllocation_type;
	}
	public Object getHost_cache_policy() {
		return host_cache_policy;
	}
	public void setHost_cache_policy(Object newHost_cache_policy) {
		host_cache_policy = newHost_cache_policy;
	}
}
/* Type of external memory allocation. */
