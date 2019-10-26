package application;

public class _cl_mem_android_native_buffer_host_ptr {
	private _cl_mem_ext_host_ptr ext_host_ptr;
	private Object anb_ptr;
	
	public _cl_mem_android_native_buffer_host_ptr(_cl_mem_ext_host_ptr ext_host_ptr, Object anb_ptr) {
		setExt_host_ptr(ext_host_ptr);
		setAnb_ptr(anb_ptr);
	}
	public _cl_mem_android_native_buffer_host_ptr() {
	}
	
	public _cl_mem_ext_host_ptr getExt_host_ptr() {
		return ext_host_ptr;
	}
	public void setExt_host_ptr(_cl_mem_ext_host_ptr newExt_host_ptr) {
		ext_host_ptr = newExt_host_ptr;
	}
	public Object getAnb_ptr() {
		return anb_ptr;
	}
	public void setAnb_ptr(Object newAnb_ptr) {
		anb_ptr = newAnb_ptr;
	}
}
/* Type of external memory allocation. */
