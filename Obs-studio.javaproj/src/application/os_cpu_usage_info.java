package application;

public class os_cpu_usage_info {
	private time_data last_time;
	private time_data last_sys_time;
	private time_data last_user_time;
	private Object core_count;
	
	public os_cpu_usage_info(time_data last_time, time_data last_sys_time, time_data last_user_time, Object core_count) {
		setLast_time(last_time);
		setLast_sys_time(last_sys_time);
		setLast_user_time(last_user_time);
		setCore_count(core_count);
	}
	public os_cpu_usage_info() {
	}
	
	public os_cpu_usage_info os_cpu_usage_info_start() {
		os_cpu_usage_info info = ModernizedCProgram.bzalloc(/*Error: sizeof expression not supported yet*/);
		SYSTEM_INFO si = new SYSTEM_INFO();
		FILETIME dummy = new FILETIME();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetSystemInfo(si);
		time_data generatedLast_time = info.getLast_time();
		Object generatedFt = generatedLast_time.getFt();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetSystemTimeAsFileTime(generatedFt);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetProcessTimes(/*Error: Function owner not recognized*/GetCurrentProcess(), dummy, dummy, generatedFt, generatedFt);
		Object generatedDwNumberOfProcessors = si.getDwNumberOfProcessors();
		info.setCore_count(generatedDwNumberOfProcessors);
		return info;
		os_cpu_usage_info info = ModernizedCProgram.bmalloc(/*Error: sizeof expression not supported yet*/);
		tms time_sample = new tms();
		info.setLast_cpu_time(/*Error: Function owner not recognized*/times(time_sample));
		Object generatedTms = time_sample.getTms();
		info.setLast_sys_time(generatedTms);
		info.setLast_user_time(generatedTms);
		info.setCore_count(/*Error: Function owner not recognized*/sysconf(_SC_NPROCESSORS_ONLN));
		return info;
	}
	public double os_cpu_usage_info_query() {
		Object cur_time;
		Object cur_sys_time;
		Object cur_user_time;
		FILETIME dummy = new FILETIME();
		double percent;
		if (!info) {
			return 0.0;
		} 
		Object generatedFt = cur_time.getFt();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetSystemTimeAsFileTime(generatedFt);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetProcessTimes(/*Error: Function owner not recognized*/GetCurrentProcess(), dummy, dummy, generatedFt, generatedFt);
		Object generatedVal = cur_sys_time.getVal();
		percent = (double)(generatedVal - generatedVal + (generatedVal - generatedVal));
		percent /= (double)(generatedVal - generatedVal);
		Object generatedCore_count = this.getCore_count();
		percent /= (double)generatedCore_count;
		time_data generatedLast_time = this.getLast_time();
		generatedLast_time.setVal(generatedVal);
		time_data generatedLast_sys_time = this.getLast_sys_time();
		generatedLast_sys_time.setVal(generatedVal);
		time_data generatedLast_user_time = this.getLast_user_time();
		generatedLast_user_time.setVal(generatedVal);
		return percent * 100.0;
		tms time_sample = new tms();
		clock_t cur_cpu_time = new clock_t();
		double percent;
		if (!info) {
			return 0.0;
		} 
		cur_cpu_time = /*Error: Function owner not recognized*/times(time_sample);
		Object generatedLast_cpu_time = this.getLast_cpu_time();
		Object generatedTms = time_sample.getTms();
		time_data generatedLast_sys_time = this.getLast_sys_time();
		time_data generatedLast_user_time = this.getLast_user_time();
		if (cur_cpu_time <= generatedLast_cpu_time || generatedTms < generatedLast_sys_time || generatedTms < generatedLast_user_time) {
			return 0.0;
		} 
		percent = (double)(generatedTms - generatedLast_sys_time + (generatedTms - generatedLast_user_time));
		percent /= (double)(cur_cpu_time - generatedLast_cpu_time);
		Object generatedCore_count = this.getCore_count();
		percent /= (double)generatedCore_count;
		this.setLast_cpu_time(cur_cpu_time);
		this.setLast_sys_time(generatedTms);
		this.setLast_user_time(generatedTms);
		return percent * 100.0;
	}
	public void os_cpu_usage_info_destroy() {
		if (info) {
			ModernizedCProgram.bfree(info);
		} 
		if (info) {
			ModernizedCProgram.bfree(info);
		} 
	}
	public time_data getLast_time() {
		return last_time;
	}
	public void setLast_time(time_data newLast_time) {
		last_time = newLast_time;
	}
	public time_data getLast_sys_time() {
		return last_sys_time;
	}
	public void setLast_sys_time(time_data newLast_sys_time) {
		last_sys_time = newLast_sys_time;
	}
	public time_data getLast_user_time() {
		return last_user_time;
	}
	public void setLast_user_time(time_data newLast_user_time) {
		last_user_time = newLast_user_time;
	}
	public Object getCore_count() {
		return core_count;
	}
	public void setCore_count(Object newCore_count) {
		core_count = newCore_count;
	}
}
