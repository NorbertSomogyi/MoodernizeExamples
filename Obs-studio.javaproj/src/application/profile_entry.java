package application;

public class profile_entry {
	private Object name;
	private profile_times_table times;
	private Object expected_time_between_calls;
	private profile_times_table times_between_calls;
	private  children;
	
	public profile_entry(Object name, profile_times_table times, Object expected_time_between_calls, profile_times_table times_between_calls,  children) {
		setName(name);
		setTimes(times);
		setExpected_time_between_calls(expected_time_between_calls);
		setTimes_between_calls(times_between_calls);
		setChildren(children);
	}
	public profile_entry() {
	}
	
	public profile_entry init_entry(Object name) {
		this.setName(name);
		profile_times_table generatedTimes = this.getTimes();
		generatedTimes.init_hashmap(1);
		this.setExpected_time_between_calls(0);
		profile_times_table generatedTimes_between_calls = this.getTimes_between_calls();
		generatedTimes_between_calls.init_hashmap(1);
		return entry;
	}
	public profile_entry get_child(Object name) {
		 generatedChildren = this.getChildren();
		Object generatedNum = generatedChildren.getNum();
		size_t num = generatedNum;
		Object generatedArray = generatedChildren.getArray();
		Object generatedName = child.getName();
		for (size_t i = 0;
		 i < num; i++) {
			profile_entry child = generatedArray[i];
			if (generatedName == name) {
				return child;
			} 
		}
		Object generatedDa = generatedChildren.getDa();
		return generatedDa.darray_push_back_new().init_entry(name);
	}
	public void free_profile_entry() {
		 generatedChildren = this.getChildren();
		Object generatedNum = generatedChildren.getNum();
		Object generatedArray = generatedChildren.getArray();
		for (size_t i = 0;
		 i < generatedNum; i++) {
			generatedArray[i].free_profile_entry();
		}
		profile_times_table generatedTimes = this.getTimes();
		generatedTimes.free_hashmap();
		profile_times_table generatedTimes_between_calls = this.getTimes_between_calls();
		generatedTimes_between_calls.free_hashmap();
		Object generatedDa = generatedChildren.getDa();
		generatedDa.darray_free();
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public profile_times_table getTimes() {
		return times;
	}
	public void setTimes(profile_times_table newTimes) {
		times = newTimes;
	}
	public Object getExpected_time_between_calls() {
		return expected_time_between_calls;
	}
	public void setExpected_time_between_calls(Object newExpected_time_between_calls) {
		expected_time_between_calls = newExpected_time_between_calls;
	}
	public profile_times_table getTimes_between_calls() {
		return times_between_calls;
	}
	public void setTimes_between_calls(profile_times_table newTimes_between_calls) {
		times_between_calls = newTimes_between_calls;
	}
	public  getChildren() {
		return children;
	}
	public void setChildren( newChildren) {
		children = newChildren;
	}
}
