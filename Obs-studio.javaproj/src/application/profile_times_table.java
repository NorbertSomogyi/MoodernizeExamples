package application;

public class profile_times_table {
	private Object size;
	private Object occupied;
	private Object max_probe_count;
	private profile_times_table_entry[] entries;
	private Object old_start_index;
	private Object old_occupied;
	private profile_times_table_entry[] old_entries;
	
	public profile_times_table(Object size, Object occupied, Object max_probe_count, profile_times_table_entry[] entries, Object old_start_index, Object old_occupied, profile_times_table_entry[] old_entries) {
		setSize(size);
		setOccupied(occupied);
		setMax_probe_count(max_probe_count);
		setEntries(entries);
		setOld_start_index(old_start_index);
		setOld_occupied(old_occupied);
		setOld_entries(old_entries);
	}
	public profile_times_table() {
	}
	
	public void update_max_probes(Object val) {
		Object generatedMax_probe_count = this.getMax_probe_count();
		this.setMax_probe_count(generatedMax_probe_count < val ? val : generatedMax_probe_count);
	}
	public void add_hashmap_entry(Object usec, Object count) {
		size_t probes = 1;
		Object generatedSize = this.getSize();
		size_t start = usec % generatedSize;
		profile_times_table_entry[] generatedEntries = this.getEntries();
		Object generatedProbes = entry.getProbes();
		profiler_time_entry generatedEntry = entry.getEntry();
		Object generatedOccupied = this.getOccupied();
		Object generatedTime_delta = generatedEntry.getTime_delta();
		Object generatedCount = generatedEntry.getCount();
		for (; /*Error: Unsupported expression*/; probes += 1) {
			size_t idx = (start + probes) % generatedSize;
			profile_times_table_entry entry = generatedEntries[idx];
			if (!generatedProbes) {
				entry.setProbes(probes);
				generatedEntry.setTime_delta(usec);
				generatedEntry.setCount(count);
				generatedOccupied += 1;
				map.update_max_probes(probes);
				return /*Error: Unsupported expression*/;
			} 
			if (generatedTime_delta == usec) {
				generatedCount += count;
				return /*Error: Unsupported expression*/;
			} 
			if (generatedProbes >= probes) {
				continue;
			} 
			if (generatedOccupied / (double)generatedSize > 0.7) {
				map.grow_hashmap(usec, count);
				return /*Error: Unsupported expression*/;
			} 
			size_t old_probes = generatedProbes;
			uint64_t old_count = generatedCount;
			uint64_t old_usec = generatedTime_delta;
			entry.setProbes(probes);
			generatedEntry.setCount(count);
			generatedEntry.setTime_delta(usec);
			map.update_max_probes(probes);
			probes = old_probes;
			count = old_count;
			usec = old_usec;
			start = usec % generatedSize;
		}
	}
	public void init_hashmap(Object size) {
		this.setSize(size);
		this.setOccupied(0);
		this.setMax_probe_count(0);
		this.setEntries(ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/ * size));
		this.setOld_start_index(0);
		this.setOld_occupied(0);
		this.setOld_entries(((Object)0));
	}
	public void migrate_old_entries(boolean limit_items) {
		profile_times_table_entry[] generatedOld_entries = this.getOld_entries();
		if (!generatedOld_entries) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedOld_occupied = this.getOld_occupied();
		if (!generatedOld_occupied) {
			ModernizedCProgram.bfree(generatedOld_entries);
			this.setOld_entries(((Object)0));
			return /*Error: Unsupported expression*/;
		} 
		Object generatedOld_start_index = this.getOld_start_index();
		Object generatedProbes = entry.getProbes();
		profiler_time_entry generatedEntry = entry.getEntry();
		Object generatedTime_delta = generatedEntry.getTime_delta();
		Object generatedCount = generatedEntry.getCount();
		for (size_t i = 0;
		 !limit_items || i < 8; ) {
			if (!generatedOld_occupied) {
				return /*Error: Unsupported expression*/;
			} 
			profile_times_table_entry entry = generatedOld_entries[generatedOld_start_index];
			if (!generatedProbes) {
				continue;
			} 
			map.add_hashmap_entry(generatedTime_delta, generatedCount);
			generatedOld_occupied -= 1;
		}
	}
	public void grow_hashmap(Object usec, Object count) {
		map.migrate_old_entries(0);
		Object generatedSize = this.getSize();
		size_t old_size = generatedSize;
		Object generatedOccupied = this.getOccupied();
		size_t old_occupied = generatedOccupied;
		profile_times_table_entry[] generatedEntries = this.getEntries();
		profile_times_table_entry entries = generatedEntries;
		map.init_hashmap((old_size * 2 < 16) ? 16 : (old_size * 2));
		this.setOld_occupied(old_occupied);
		this.setOld_entries(entries);
		map.add_hashmap_entry(usec, count);
	}
	public void free_hashmap() {
		this.setSize(0);
		profile_times_table_entry[] generatedEntries = this.getEntries();
		ModernizedCProgram.bfree(generatedEntries);
		this.setEntries(((Object)0));
		profile_times_table_entry[] generatedOld_entries = this.getOld_entries();
		ModernizedCProgram.bfree(generatedOld_entries);
		this.setOld_entries(((Object)0));
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getOccupied() {
		return occupied;
	}
	public void setOccupied(Object newOccupied) {
		occupied = newOccupied;
	}
	public Object getMax_probe_count() {
		return max_probe_count;
	}
	public void setMax_probe_count(Object newMax_probe_count) {
		max_probe_count = newMax_probe_count;
	}
	public profile_times_table_entry[] getEntries() {
		return entries;
	}
	public void setEntries(profile_times_table_entry[] newEntries) {
		entries = newEntries;
	}
	public Object getOld_start_index() {
		return old_start_index;
	}
	public void setOld_start_index(Object newOld_start_index) {
		old_start_index = newOld_start_index;
	}
	public Object getOld_occupied() {
		return old_occupied;
	}
	public void setOld_occupied(Object newOld_occupied) {
		old_occupied = newOld_occupied;
	}
	public profile_times_table_entry[] getOld_entries() {
		return old_entries;
	}
	public void setOld_entries(profile_times_table_entry[] newOld_entries) {
		old_entries = newOld_entries;
	}
}
