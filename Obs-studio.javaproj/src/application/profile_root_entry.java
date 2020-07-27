package application;

public class profile_root_entry {
	private Object mutex;
	private Object name;
	private profile_entry entry;
	private profile_call prev_call;
	
	public profile_root_entry(Object mutex, Object name, profile_entry entry, profile_call prev_call) {
		setMutex(mutex);
		setName(name);
		setEntry(entry);
		setPrev_call(prev_call);
	}
	public profile_root_entry() {
	}
	
	public profile_root_entry get_root_entry(Object name) {
		profile_root_entry r_entry = ((Object)0);
		Object generatedNum = root_entries.getNum();
		Object generatedArray = root_entries.getArray();
		for (size_t i = 0;
		 i < generatedNum; i++) {
			if (generatedArray[i].getName() == name) {
				r_entry = generatedArray[i];
				break;
			} 
		}
		Object generatedDa = root_entries.getDa();
		Object generatedMutex = r_entry.getMutex();
		profile_entry generatedEntry = r_entry.getEntry();
		if (!r_entry) {
			r_entry = generatedDa.darray_push_back_new(/*Error: sizeof expression not supported yet*/);
			r_entry.setMutex(ModernizedCProgram.bmalloc(/*Error: Unsupported expression*/));
			ModernizedCProgram.pthread_mutex_init(generatedMutex, ((Object)0));
			r_entry.setName(name);
			r_entry.setEntry(ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/));
			generatedEntry.init_entry(name);
		} 
		return r_entry;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public profile_entry getEntry() {
		return entry;
	}
	public void setEntry(profile_entry newEntry) {
		entry = newEntry;
	}
	public profile_call getPrev_call() {
		return prev_call;
	}
	public void setPrev_call(profile_call newPrev_call) {
		prev_call = newPrev_call;
	}
}
