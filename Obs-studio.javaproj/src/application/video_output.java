package application;

public class video_output {
	private video_output_info info;
	private Object thread;
	private Object data_mutex;
	private Object stop;
	private Object update_semaphore;
	private Object frame_time;
	private Object skipped_frames;
	private Object total_frames;
	private Object initialized;
	private Object input_mutex;
	private Object ;
	private Object available_frames;
	private Object first_added;
	private Object last_added;
	private Object cache;
	private Object raw_active;
	private Object gpu_refs;
	
	public video_output(video_output_info info, Object thread, Object data_mutex, Object stop, Object update_semaphore, Object frame_time, Object skipped_frames, Object total_frames, Object initialized, Object input_mutex, Object,  Object available_frames, Object first_added, Object last_added, Object cache, Object raw_active, Object gpu_refs) {
		setInfo(info);
		setThread(thread);
		setData_mutex(data_mutex);
		setStop(stop);
		setUpdate_semaphore(update_semaphore);
		setFrame_time(frame_time);
		setSkipped_frames(skipped_frames);
		setTotal_frames(total_frames);
		setInitialized(initialized);
		setInput_mutex(input_mutex);
		set();
		setAvailable_frames(available_frames);
		setFirst_added(first_added);
		setLast_added(last_added);
		setCache(cache);
		setRaw_active(raw_active);
		setGpu_refs(gpu_refs);
	}
	public video_output() {
	}
	
	public Object video_output_cur_frame() {
		cached_frame_info frame_info = new cached_frame_info();
		 complete = new ();
		 skipped = new ();
		Object generatedData_mutex = this.getData_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedData_mutex);
		Object generatedCache = this.getCache();
		Object generatedFirst_added = this.getFirst_added();
		frame_info = generatedCache[generatedFirst_added];
		ModernizedCProgram.pthread_mutex_unlock(generatedData_mutex);
		Object generatedInput_mutex = this.getInput_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedInput_mutex);
		Object generatedInputs = this.getInputs();
		video_data generatedFrame = frame_info.getFrame();
		Object generatedParam = input.getParam();
		for ( i = 0;
		 i < generatedInputs.getNum(); i++) {
			video_input input = generatedInputs.getArray() + i;
			video_data frame = generatedFrame;
			if (ModernizedCProgram.scale_video_output(input, frame)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedParam, frame);
			} 
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedInput_mutex);
		ModernizedCProgram.pthread_mutex_lock(generatedData_mutex);
		Object generatedTimestamp = generatedFrame.getTimestamp();
		Object generatedFrame_time = this.getFrame_time();
		generatedTimestamp += generatedFrame_time;
		int generatedCount = frame_info.getCount();
		complete = --generatedCount == 0;
		int generatedSkipped = frame_info.getSkipped();
		skipped = generatedSkipped > 0;
		video_output_info generatedInfo = this.getInfo();
		Object generatedCache_size = generatedInfo.getCache_size();
		Object generatedAvailable_frames = this.getAvailable_frames();
		Object generatedSkipped_frames = this.getSkipped_frames();
		if (complete) {
			if (++generatedFirst_added == generatedCache_size) {
				this.setFirst_added(0);
			} 
			if (++generatedAvailable_frames == generatedCache_size) {
				this.setLast_added(generatedFirst_added);
			} 
		}  else if (skipped) {
			--generatedSkipped;
			ModernizedCProgram.os_atomic_inc_long(generatedSkipped_frames);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedData_mutex);
		return /* -------------------------------- */complete;
	}
	public void init_cache() {
		video_output_info generatedInfo = this.getInfo();
		Object generatedCache_size = generatedInfo.getCache_size();
		if (generatedCache_size > 16) {
			generatedInfo.setCache_size(16);
		} 
		Object generatedCache = this.getCache();
		video_format generatedFormat = generatedInfo.getFormat();
		Object generatedWidth = generatedInfo.getWidth();
		Object generatedHeight = generatedInfo.getHeight();
		for ( i = 0;
		 i < generatedCache_size; i++) {
			video_frame frame = new video_frame();
			frame = (video_frame)generatedCache[i];
			frame.video_frame_init(generatedFormat, generatedWidth, generatedHeight);
		}
		this.setAvailable_frames(generatedCache_size);
	}
	public void video_output_close() {
		if (!video) {
			return /*Error: Unsupported expression*/;
		} 
		video.video_output_stop();
		Object generatedInputs = this.getInputs();
		for ( i = 0;
		 i < generatedInputs.getNum(); i++) {
			generatedInputs.getArray()[i].video_input_free();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedInputs);
		video_output_info generatedInfo = this.getInfo();
		Object generatedCache_size = generatedInfo.getCache_size();
		Object generatedCache = this.getCache();
		for ( i = 0;
		 i < generatedCache_size; i++) {
			(video_frame)generatedCache[i].video_frame_free();
		}
		Object generatedUpdate_semaphore = this.getUpdate_semaphore();
		generatedUpdate_semaphore.os_sem_destroy();
		Object generatedData_mutex = this.getData_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedData_mutex);
		Object generatedInput_mutex = this.getInput_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedInput_mutex);
		ModernizedCProgram.bfree(video);
	}
	public void reset_frames() {
		Object generatedSkipped_frames = this.getSkipped_frames();
		ModernizedCProgram.os_atomic_set_long(generatedSkipped_frames, 0);
		Object generatedTotal_frames = this.getTotal_frames();
		ModernizedCProgram.os_atomic_set_long(generatedTotal_frames, 0);
	}
	public Object video_output_connect(Object conversion, Object callback, Object param) {
		 success = false;
		if (!video || !callback) {
			return false;
		} 
		Object generatedInput_mutex = this.getInput_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedInput_mutex);
		video_output_info generatedInfo = this.getInfo();
		video_format generatedFormat = generatedInfo.getFormat();
		video_scale_info generatedConversion = input.getConversion();
		Object generatedWidth = generatedInfo.getWidth();
		Object generatedHeight = generatedInfo.getHeight();
		Object generatedInputs = this.getInputs();
		Object generatedGpu_refs = this.getGpu_refs();
		Object generatedRaw_active = this.getRaw_active();
		if (ModernizedCProgram.video_get_input_idx(video, callback, param) == DARRAY_INVALID) {
			video_input input = new video_input();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(input, 0, /*Error: sizeof expression not supported yet*/);
			input.setCallback(callback);
			input.setParam(param);
			if (conversion) {
				input.setConversion(conversion);
			} else {
					generatedConversion.setFormat(generatedFormat);
					generatedConversion.setWidth(generatedWidth);
					generatedConversion.setHeight(generatedHeight);
			} 
			if (generatedWidth == 0) {
				generatedConversion.setWidth(generatedWidth);
			} 
			if (generatedHeight == 0) {
				generatedConversion.setHeight(generatedHeight);
			} 
			success = ModernizedCProgram.video_input_init(input, video);
			if (success) {
				if (generatedInputs.getNum() == 0) {
					if (!ModernizedCProgram.os_atomic_load_long(generatedGpu_refs)) {
						video.reset_frames();
					} 
					ModernizedCProgram.os_atomic_set_bool(generatedRaw_active, true);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedInputs, input);
			} 
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedInput_mutex);
		return success;
	}
	public void log_skipped() {
		Object generatedSkipped_frames = this.getSkipped_frames();
		long skipped = ModernizedCProgram.os_atomic_load_long(generatedSkipped_frames);
		Object generatedTotal_frames = this.getTotal_frames();
		double percentage_skipped = (double)skipped / (double)ModernizedCProgram.os_atomic_load_long(generatedTotal_frames) * 100.0;
		if (skipped) {
			ModernizedCProgram.blog(LOG_INFO, "Video stopped, number of skipped frames due to encoding lag: %ld/%ld (%0.1f%%)", generatedSkipped_frames, generatedTotal_frames, percentage_skipped);
		} 
	}
	public void video_output_disconnect(Object callback, Object param) {
		if (!video || !callback) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedInput_mutex = this.getInput_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedInput_mutex);
		 idx = ModernizedCProgram.video_get_input_idx(video, callback, param);
		Object generatedInputs = this.getInputs();
		Object generatedRaw_active = this.getRaw_active();
		Object generatedGpu_refs = this.getGpu_refs();
		if (idx != DARRAY_INVALID) {
			generatedInputs.getArray() + idx.video_input_free();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_erase(generatedInputs, idx);
			if (generatedInputs.getNum() == 0) {
				ModernizedCProgram.os_atomic_set_bool(generatedRaw_active, false);
				if (!ModernizedCProgram.os_atomic_load_long(generatedGpu_refs)) {
					video.log_skipped();
				} 
			} 
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedInput_mutex);
	}
	public void video_output_unlock_frame() {
		if (!video) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedData_mutex = this.getData_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedData_mutex);
		Object generatedAvailable_frames = this.getAvailable_frames();
		generatedAvailable_frames--;
		Object generatedUpdate_semaphore = this.getUpdate_semaphore();
		generatedUpdate_semaphore.os_sem_post();
		ModernizedCProgram.pthread_mutex_unlock(generatedData_mutex);
	}
	public void video_output_stop() {
		Object thread_ret;
		if (!video) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedInitialized = this.getInitialized();
		Object generatedUpdate_semaphore = this.getUpdate_semaphore();
		Object generatedThread = this.getThread();
		if (generatedInitialized) {
			this.setInitialized(false);
			this.setStop(true);
			generatedUpdate_semaphore.os_sem_post();
			ModernizedCProgram.pthread_join(generatedThread, thread_ret);
		} 
	}
	public Object video_output_stopped() {
		if (!video) {
			return true;
		} 
		Object generatedStop = this.getStop();
		return generatedStop;
	}
	public void video_output_inc_texture_encoders() {
		Object generatedGpu_refs = this.getGpu_refs();
		Object generatedRaw_active = this.getRaw_active();
		if (ModernizedCProgram.os_atomic_inc_long(generatedGpu_refs) == 1 && !ModernizedCProgram.os_atomic_load_bool(generatedRaw_active)) {
			video.reset_frames();
		} 
	}
	public void video_output_dec_texture_encoders() {
		Object generatedGpu_refs = this.getGpu_refs();
		Object generatedRaw_active = this.getRaw_active();
		if (ModernizedCProgram.os_atomic_dec_long(generatedGpu_refs) == 0 && !ModernizedCProgram.os_atomic_load_bool(generatedRaw_active)) {
			video.log_skipped();
		} 
	}
	public void video_output_inc_texture_frames() {
		Object generatedTotal_frames = this.getTotal_frames();
		ModernizedCProgram.os_atomic_inc_long(generatedTotal_frames);
	}
	public void video_output_inc_texture_skipped_frames() {
		Object generatedSkipped_frames = this.getSkipped_frames();
		ModernizedCProgram.os_atomic_inc_long(generatedSkipped_frames);
	}
	public video_output_info getInfo() {
		return info;
	}
	public void setInfo(video_output_info newInfo) {
		info = newInfo;
	}
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
	public Object getData_mutex() {
		return data_mutex;
	}
	public void setData_mutex(Object newData_mutex) {
		data_mutex = newData_mutex;
	}
	public Object getStop() {
		return stop;
	}
	public void setStop(Object newStop) {
		stop = newStop;
	}
	public Object getUpdate_semaphore() {
		return update_semaphore;
	}
	public void setUpdate_semaphore(Object newUpdate_semaphore) {
		update_semaphore = newUpdate_semaphore;
	}
	public Object getFrame_time() {
		return frame_time;
	}
	public void setFrame_time(Object newFrame_time) {
		frame_time = newFrame_time;
	}
	public Object getSkipped_frames() {
		return skipped_frames;
	}
	public void setSkipped_frames(Object newSkipped_frames) {
		skipped_frames = newSkipped_frames;
	}
	public Object getTotal_frames() {
		return total_frames;
	}
	public void setTotal_frames(Object newTotal_frames) {
		total_frames = newTotal_frames;
	}
	public Object getInitialized() {
		return initialized;
	}
	public void setInitialized(Object newInitialized) {
		initialized = newInitialized;
	}
	public Object getInput_mutex() {
		return input_mutex;
	}
	public void setInput_mutex(Object newInput_mutex) {
		input_mutex = newInput_mutex;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object getAvailable_frames() {
		return available_frames;
	}
	public void setAvailable_frames(Object newAvailable_frames) {
		available_frames = newAvailable_frames;
	}
	public Object getFirst_added() {
		return first_added;
	}
	public void setFirst_added(Object newFirst_added) {
		first_added = newFirst_added;
	}
	public Object getLast_added() {
		return last_added;
	}
	public void setLast_added(Object newLast_added) {
		last_added = newLast_added;
	}
	public Object getCache() {
		return cache;
	}
	public void setCache(Object newCache) {
		cache = newCache;
	}
	public Object getRaw_active() {
		return raw_active;
	}
	public void setRaw_active(Object newRaw_active) {
		raw_active = newRaw_active;
	}
	public Object getGpu_refs() {
		return gpu_refs;
	}
	public void setGpu_refs(Object newGpu_refs) {
		gpu_refs = newGpu_refs;
	}
}
