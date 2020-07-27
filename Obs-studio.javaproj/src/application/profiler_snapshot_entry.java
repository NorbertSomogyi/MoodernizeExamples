package application;

public class profiler_snapshot_entry {
	private Object name;
	private  times;
	private Object min_time;
	private Object max_time;
	private Object overall_count;
	private  times_between_calls;
	private Object expected_time_between_calls;
	private Object min_time_between_calls;
	private Object max_time_between_calls;
	private Object overall_between_calls_count;
	private  children;
	
	public profiler_snapshot_entry(Object name,  times, Object min_time, Object max_time, Object overall_count,  times_between_calls, Object expected_time_between_calls, Object min_time_between_calls, Object max_time_between_calls, Object overall_between_calls_count,  children) {
		setName(name);
		setTimes(times);
		setMin_time(min_time);
		setMax_time(max_time);
		setOverall_count(overall_count);
		setTimes_between_calls(times_between_calls);
		setExpected_time_between_calls(expected_time_between_calls);
		setMin_time_between_calls(min_time_between_calls);
		setMax_time_between_calls(max_time_between_calls);
		setOverall_between_calls_count(overall_between_calls_count);
		setChildren(children);
	}
	public profiler_snapshot_entry() {
	}
	
	public void sort_snapshot_entry() {
		 generatedTimes = this.getTimes();
		Object generatedArray = generatedTimes.getArray();
		Object generatedNum = generatedTimes.getNum();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsort(generatedArray, generatedNum, /*Error: Unsupported expression*/, profiler_time_entry_compare);
		Object generatedExpected_time_between_calls = this.getExpected_time_between_calls();
		if (generatedExpected_time_between_calls) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsort(generatedArray, generatedNum, /*Error: Unsupported expression*/, profiler_time_entry_compare);
		} 
		for (size_t i = 0;
		 i < generatedNum; i++) {
			generatedArray[i].sort_snapshot_entry();
		}
	}
	public void free_snapshot_entry() {
		 generatedChildren = this.getChildren();
		Object generatedNum = generatedChildren.getNum();
		Object generatedArray = generatedChildren.getArray();
		for (size_t i = 0;
		 i < generatedNum; i++) {
			generatedArray[i].free_snapshot_entry();
		}
		Object generatedDa = generatedChildren.getDa();
		generatedDa.darray_free();
		generatedDa.darray_free();
		generatedDa.darray_free();
	}
	public Object profiler_snapshot_num_children() {
		 generatedChildren = this.getChildren();
		Object generatedNum = generatedChildren.getNum();
		return entry ? generatedNum : 0;
	}
	public void profiler_snapshot_enumerate_children(Object func, Object context) {
		if (!entry) {
			return /*Error: Unsupported expression*/;
		} 
		 generatedChildren = this.getChildren();
		Object generatedNum = generatedChildren.getNum();
		Object generatedArray = generatedChildren.getArray();
		for (size_t i = 0;
		 i < generatedNum; i++) {
			if (!ModernizedCProgram.func(context, generatedArray[i])) {
				break;
			} 
		}
	}
	public Object profiler_snapshot_entry_name() {
		Object generatedName = this.getName();
		return entry ? generatedName : ((Object)0);
	}
	public  profiler_snapshot_entry_times() {
		 generatedTimes = this.getTimes();
		return entry ? generatedTimes : ((Object)0);
	}
	public Object profiler_snapshot_entry_overall_count() {
		Object generatedOverall_count = this.getOverall_count();
		return entry ? generatedOverall_count : 0;
	}
	public Object profiler_snapshot_entry_min_time() {
		Object generatedMin_time = this.getMin_time();
		return entry ? generatedMin_time : 0;
	}
	public Object profiler_snapshot_entry_max_time() {
		Object generatedMax_time = this.getMax_time();
		return entry ? generatedMax_time : 0;
	}
	public  profiler_snapshot_entry_times_between_calls() {
		 generatedTimes_between_calls = this.getTimes_between_calls();
		return entry ? generatedTimes_between_calls : ((Object)0);
	}
	public Object profiler_snapshot_entry_expected_time_between_calls() {
		Object generatedExpected_time_between_calls = this.getExpected_time_between_calls();
		return entry ? generatedExpected_time_between_calls : 0;
	}
	public Object profiler_snapshot_entry_min_time_between_calls() {
		Object generatedMin_time_between_calls = this.getMin_time_between_calls();
		return entry ? generatedMin_time_between_calls : 0;
	}
	public Object profiler_snapshot_entry_max_time_between_calls() {
		Object generatedMax_time_between_calls = this.getMax_time_between_calls();
		return entry ? generatedMax_time_between_calls : 0;
	}
	public Object profiler_snapshot_entry_overall_between_calls_count() {
		Object generatedOverall_between_calls_count = this.getOverall_between_calls_count();
		return entry ? generatedOverall_between_calls_count : 0;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public  getTimes() {
		return times;
	}
	public void setTimes( newTimes) {
		times = newTimes;
	}
	public Object getMin_time() {
		return min_time;
	}
	public void setMin_time(Object newMin_time) {
		min_time = newMin_time;
	}
	public Object getMax_time() {
		return max_time;
	}
	public void setMax_time(Object newMax_time) {
		max_time = newMax_time;
	}
	public Object getOverall_count() {
		return overall_count;
	}
	public void setOverall_count(Object newOverall_count) {
		overall_count = newOverall_count;
	}
	public  getTimes_between_calls() {
		return times_between_calls;
	}
	public void setTimes_between_calls( newTimes_between_calls) {
		times_between_calls = newTimes_between_calls;
	}
	public Object getExpected_time_between_calls() {
		return expected_time_between_calls;
	}
	public void setExpected_time_between_calls(Object newExpected_time_between_calls) {
		expected_time_between_calls = newExpected_time_between_calls;
	}
	public Object getMin_time_between_calls() {
		return min_time_between_calls;
	}
	public void setMin_time_between_calls(Object newMin_time_between_calls) {
		min_time_between_calls = newMin_time_between_calls;
	}
	public Object getMax_time_between_calls() {
		return max_time_between_calls;
	}
	public void setMax_time_between_calls(Object newMax_time_between_calls) {
		max_time_between_calls = newMax_time_between_calls;
	}
	public Object getOverall_between_calls_count() {
		return overall_between_calls_count;
	}
	public void setOverall_between_calls_count(Object newOverall_between_calls_count) {
		overall_between_calls_count = newOverall_between_calls_count;
	}
	public  getChildren() {
		return children;
	}
	public void setChildren( newChildren) {
		children = newChildren;
	}
}
