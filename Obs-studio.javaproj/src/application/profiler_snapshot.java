package application;

//#define TRACK_OVERHEAD
public class profiler_snapshot {
	private  roots;
	
	public profiler_snapshot( roots) {
		setRoots(roots);
	}
	public profiler_snapshot() {
	}
	
	public void profile_print_func(Object intro, Object print) {
		dstr indent_buffer = new dstr(0);
		dstr output_buffer = new dstr(0);
		boolean free_snapshot = !snap;
		profiler_snapshot profiler_snapshot = new profiler_snapshot();
		if (!snap) {
			snap = profiler_snapshot.profile_snapshot_create();
		} 
		ModernizedCProgram.blog(LOG_INFO, "%s", intro);
		 generatedRoots = this.getRoots();
		Object generatedNum = generatedRoots.getNum();
		Object generatedArray = generatedRoots.getArray();
		for (size_t i = 0;
		 i < generatedNum; i++) {
			.print(generatedArray[i], indent_buffer, output_buffer, 0, 0, 0);
		}
		ModernizedCProgram.blog(LOG_INFO, "=================================================");
		if (free_snapshot) {
			snap.profile_snapshot_free();
		} 
		output_buffer.dstr_free();
		indent_buffer.dstr_free();
	}
	public void profiler_print() {
		snap.profile_print_func("== Profiler Results =============================", profile_print_entry);
	}
	public void profiler_print_time_between_calls() {
		snap.profile_print_func("== Profiler Time Between Calls ==================", profile_print_entry_expected);
	}
	public profiler_snapshot profile_snapshot_create() {
		profiler_snapshot_t snap = ModernizedCProgram.bzalloc();
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.root_mutex);
		 generatedRoots = snap.getRoots();
		Object generatedArray = generatedRoots.getArray();
		Object generatedDa = generatedRoots.getDa();
		Object generatedNum = root_entries.getNum();
		generatedDa.darray_reserve(, generatedNum);
		for (size_t i = 0;
		 i < generatedNum; i++) {
			ModernizedCProgram.pthread_mutex_lock(generatedArray[i].getMutex());
			ModernizedCProgram.add_entry_to_snapshot(generatedArray[i].getEntry(), generatedDa.darray_push_back_new());
			ModernizedCProgram.pthread_mutex_unlock(generatedArray[i].getMutex());
		}
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.root_mutex);
		for (size_t i = 0;
		 i < generatedNum; i++) {
			generatedArray[i].sort_snapshot_entry();
		}
		return snap;
	}
	public void profile_snapshot_free() {
		if (!snap) {
			return ;
		} 
		 generatedRoots = this.getRoots();
		Object generatedNum = generatedRoots.getNum();
		Object generatedArray = generatedRoots.getArray();
		for (size_t i = 0;
		 i < generatedNum; i++) {
			generatedArray[i].free_snapshot_entry();
		}
		Object generatedDa = generatedRoots.getDa();
		generatedDa.darray_free();
		ModernizedCProgram.bfree(snap);
	}
	public Object profiler_snapshot_num_roots() {
		 generatedRoots = this.getRoots();
		Object generatedNum = generatedRoots.getNum();
		return snap ? generatedNum : 0;
	}
	public void profiler_snapshot_enumerate_roots(Object func, Object context) {
		if (!snap) {
			return ;
		} 
		 generatedRoots = this.getRoots();
		Object generatedNum = generatedRoots.getNum();
		Object generatedArray = generatedRoots.getArray();
		for (size_t i = 0;
		 i < generatedNum; i++) {
			if (!ModernizedCProgram.func(context, generatedArray[i])) {
				break;
			} 
		}
	}
	public void profiler_snapshot_filter_roots(Object func, Object data) {
		 generatedRoots = this.getRoots();
		Object generatedNum = generatedRoots.getNum();
		Object generatedArray = generatedRoots.getArray();
		Object generatedDa = generatedRoots.getDa();
		for (size_t i = 0;
		 i < generatedNum; ) {
			boolean remove = false;
			boolean res = ModernizedCProgram.func(data, generatedArray[i].getName(), remove);
			if (remove) {
				generatedArray[i].free_snapshot_entry();
				generatedDa.darray_erase(, i);
			} 
			if (!ModernizedCProgram.res) {
				break;
			} 
			if (!remove) {
				i += 1;
			} 
		}
	}
	public  getRoots() {
		return roots;
	}
	public void setRoots( newRoots) {
		roots = newRoots;
	}
}
