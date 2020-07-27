package application;

public class profile_call {
	private Object name;
	private Object start_time;
	private Object end_time;
	private Object expected_time_between_calls;
	private  children;
	private profile_call parent;
	
	public profile_call(Object name, Object start_time, Object end_time, Object expected_time_between_calls,  children, profile_call parent) {
		setName(name);
		setStart_time(start_time);
		setEnd_time(end_time);
		setExpected_time_between_calls(expected_time_between_calls);
		setChildren(children);
		setParent(parent);
	}
	public profile_call() {
	}
	
	public void merge_context() {
		pthread_mutex_t mutex = ((Object)0);
		profile_entry entry = ((Object)0);
		profile_call prev_call = ((Object)0);
		if (!ModernizedCProgram.lock_root()) {
			context.free_call_context();
			return /*Error: Unsupported expression*/;
		} 
		Object generatedName = this.getName();
		profile_root_entry profile_root_entry = new profile_root_entry();
		profile_root_entry r_entry = profile_root_entry.get_root_entry(generatedName);
		Object generatedMutex = r_entry.getMutex();
		mutex = generatedMutex;
		profile_entry generatedEntry = r_entry.getEntry();
		entry = generatedEntry;
		profile_call generatedPrev_call = r_entry.getPrev_call();
		prev_call = generatedPrev_call;
		r_entry.setPrev_call(context);
		ModernizedCProgram.pthread_mutex_lock(mutex);
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.root_mutex);
		ModernizedCProgram.merge_call(entry, context, prev_call);
		ModernizedCProgram.pthread_mutex_unlock(mutex);
		prev_call.free_call_context();
	}
	public void free_call_children() {
		if (!call) {
			return /*Error: Unsupported expression*/;
		} 
		 generatedChildren = this.getChildren();
		Object generatedNum = generatedChildren.getNum();
		size_t num = generatedNum;
		Object generatedArray = generatedChildren.getArray();
		for (size_t i = 0;
		 i < num; i++) {
			generatedArray[i].free_call_children();
		}
		Object generatedDa = generatedChildren.getDa();
		generatedDa.darray_free();
	}
	public void free_call_context() {
		context.free_call_children();
		ModernizedCProgram.bfree(context);
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getStart_time() {
		return start_time;
	}
	public void setStart_time(Object newStart_time) {
		start_time = newStart_time;
	}
	public Object getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Object newEnd_time) {
		end_time = newEnd_time;
	}
	public Object getExpected_time_between_calls() {
		return expected_time_between_calls;
	}
	public void setExpected_time_between_calls(Object newExpected_time_between_calls) {
		expected_time_between_calls = newExpected_time_between_calls;
	}
	public  getChildren() {
		return children;
	}
	public void setChildren( newChildren) {
		children = newChildren;
	}
	public profile_call getParent() {
		return parent;
	}
	public void setParent(profile_call newParent) {
		parent = newParent;
	}
}
