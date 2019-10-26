package application;

public class os_proc_memory_usage {
	private Object resident_size;
	private Object virtual_size;
	
	public os_proc_memory_usage(Object resident_size, Object virtual_size) {
		setResident_size(resident_size);
		setVirtual_size(virtual_size);
	}
	public os_proc_memory_usage() {
	}
	
	public boolean os_get_proc_memory_usage() {
		PROCESS_MEMORY_COUNTERS pmc = new PROCESS_MEMORY_COUNTERS();
		if (!pmc.os_get_proc_memory_usage_internal()) {
			return 0;
		} 
		Object generatedWorkingSetSize = pmc.getWorkingSetSize();
		this.setResident_size(generatedWorkingSetSize);
		Object generatedPagefileUsage = pmc.getPagefileUsage();
		this.setVirtual_size(generatedPagefileUsage);
		return 1;
		statm_t statm = new statm_t();
		if (!statm.os_get_proc_memory_usage_internal()) {
			return 0;
		} 
		Object generatedResident_size = statm.getResident_size();
		this.setResident_size(generatedResident_size);
		Object generatedVirtual_size = statm.getVirtual_size();
		this.setVirtual_size(generatedVirtual_size);
		return 1;
	}
	public Object getResident_size() {
		return resident_size;
	}
	public void setResident_size(Object newResident_size) {
		resident_size = newResident_size;
	}
	public Object getVirtual_size() {
		return virtual_size;
	}
	public void setVirtual_size(Object newVirtual_size) {
		virtual_size = newVirtual_size;
	}
}
