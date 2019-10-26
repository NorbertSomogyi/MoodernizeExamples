package application;

public class profile_times_table_entry {
	private Object probes;
	private profiler_time_entry entry;
	
	public profile_times_table_entry(Object probes, profiler_time_entry entry) {
		setProbes(probes);
		setEntry(entry);
	}
	public profile_times_table_entry() {
	}
	
	public Object getProbes() {
		return probes;
	}
	public void setProbes(Object newProbes) {
		probes = newProbes;
	}
	public profiler_time_entry getEntry() {
		return entry;
	}
	public void setEntry(profiler_time_entry newEntry) {
		entry = newEntry;
	}
}
