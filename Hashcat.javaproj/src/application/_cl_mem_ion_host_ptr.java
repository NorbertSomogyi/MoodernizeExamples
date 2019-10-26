package application;

/*********************************
* cl_qcom_ion_host_ptr extension
*********************************/
public class _cl_mem_ion_host_ptr {
	private _cl_mem_ext_host_ptr ext_host_ptr;
	private int ion_filedesc;
	private Object ion_hostptr;
	
	public _cl_mem_ion_host_ptr(_cl_mem_ext_host_ptr ext_host_ptr, int ion_filedesc, Object ion_hostptr) {
		setExt_host_ptr(ext_host_ptr);
		setIon_filedesc(ion_filedesc);
		setIon_hostptr(ion_hostptr);
	}
	public _cl_mem_ion_host_ptr() {
	}
	
	public _cl_mem_ext_host_ptr getExt_host_ptr() {
		return ext_host_ptr;
	}
	public void setExt_host_ptr(_cl_mem_ext_host_ptr newExt_host_ptr) {
		ext_host_ptr = newExt_host_ptr;
	}
	public int getIon_filedesc() {
		return ion_filedesc;
	}
	public void setIon_filedesc(int newIon_filedesc) {
		ion_filedesc = newIon_filedesc;
	}
	public Object getIon_hostptr() {
		return ion_hostptr;
	}
	public void setIon_hostptr(Object newIon_hostptr) {
		ion_hostptr = newIon_hostptr;
	}
}
/* Type of external memory allocation. */
