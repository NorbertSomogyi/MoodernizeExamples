package application;

public class audio_monitor {
	private obs_source source;
	private Object queue;
	private Object buffers;
	private Object mutex;
	private circlebuf empty_buffers;
	private circlebuf new_data;
	private Object resampler;
	private Object buffer_size;
	private Object wait_size;
	private Object channels;
	private Object active;
	private Object paused;
	private Object ignore;
	
	public audio_monitor(obs_source source, Object queue, Object buffers, Object mutex, circlebuf empty_buffers, circlebuf new_data, Object resampler, Object buffer_size, Object wait_size, Object channels, Object active, Object paused, Object ignore) {
		setSource(source);
		setQueue(queue);
		setBuffers(buffers);
		setMutex(mutex);
		setEmpty_buffers(empty_buffers);
		setNew_data(new_data);
		setResampler(resampler);
		setBuffer_size(buffer_size);
		setWait_size(wait_size);
		setChannels(channels);
		setActive(active);
		setPaused(paused);
		setIgnore(ignore);
	}
	public audio_monitor() {
	}
	
	public Object fill_buffer() {
		 buf = new ();
		 stat = new ();
		circlebuf generatedNew_data = this.getNew_data();
		Object generatedCirclebuf = generatedNew_data.getCirclebuf();
		Object generatedBuffer_size = this.getBuffer_size();
		if (generatedCirclebuf < generatedBuffer_size) {
			return false;
		} 
		circlebuf generatedEmpty_buffers = this.getEmpty_buffers();
		generatedEmpty_buffers.circlebuf_pop_front(buf, /*Error: sizeof expression not supported yet*/);
		generatedNew_data.circlebuf_pop_front(buf.getMAudioData(), generatedBuffer_size);
		buf.setMAudioDataByteSize(generatedBuffer_size);
		Object generatedQueue = this.getQueue();
		stat = /*Error: Function owner not recognized*/AudioQueueEnqueueBuffer(generatedQueue, buf, 0, NULL);
		if (!ModernizedCProgram.success_(stat, __FUNCTION__, "AudioQueueEnqueueBuffer")) {
			ModernizedCProgram.blog(LOG_WARNING, "%s: %s", __FUNCTION__, "Failed to enqueue buffer");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/AudioQueueStop(generatedQueue, false);
		} 
		return true;
	}
	public void audio_monitor_free() {
		obs_source generatedSource = this.getSource();
		if (generatedSource) {
			generatedSource.obs_source_remove_audio_capture_callback(on_audio_playback, monitor);
		} 
		Object generatedActive = this.getActive();
		Object generatedQueue = this.getQueue();
		if (generatedActive) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/AudioQueueStop(generatedQueue, true);
		} 
		Object generatedBuffers = this.getBuffers();
		for ( i = 0;
		 i < 3; i++) {
			if (generatedBuffers[i]) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/AudioQueueFreeBuffer(generatedQueue, generatedBuffers[i]);
			} 
		}
		if (generatedQueue) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/AudioQueueDispose(generatedQueue, true);
		} 
		Object generatedResampler = this.getResampler();
		generatedResampler.audio_resampler_destroy();
		circlebuf generatedEmpty_buffers = this.getEmpty_buffers();
		generatedEmpty_buffers.circlebuf_free();
		circlebuf generatedNew_data = this.getNew_data();
		generatedNew_data.circlebuf_free();
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
		Object generatedIgnore = this.getIgnore();
		if (generatedIgnore) {
			return /*Error: Unsupported expression*/;
		} 
		obs_source generatedSource = this.getSource();
		if (generatedSource) {
			generatedSource.obs_source_remove_audio_capture_callback(on_audio_playback, monitor);
		} 
		Object generatedClient = this.getClient();
		if (generatedClient) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedClient);
		} 
		Object generatedDevice = this.getDevice();
		do {
			if (generatedDevice) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDevice);
			} 
		} while (false);
		do {
			if (generatedClient) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedClient);
			} 
		} while (false);
		Object generatedRender = this.getRender();
		do {
			if (generatedRender) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedRender);
			} 
		} while (false);
		Object generatedResampler = this.getResampler();
		generatedResampler.audio_resampler_destroy();
		Object generatedDelay_buffer = this.getDelay_buffer();
		generatedDelay_buffer.circlebuf_free();
		Object generatedBuf = this.getBuf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedBuf);
		Object generatedIgnore = this.getIgnore();
		if (generatedIgnore) {
			return /*Error: Unsupported expression*/;
		} 
		obs_source generatedSource = this.getSource();
		if (generatedSource) {
			generatedSource.obs_source_remove_audio_capture_callback(on_audio_playback, monitor);
		} 
		Object generatedResampler = this.getResampler();
		generatedResampler.audio_resampler_destroy();
		circlebuf generatedNew_data = this.getNew_data();
		generatedNew_data.circlebuf_free();
		Object generatedStream = this.getStream();
		if (generatedStream) {
			monitor.pulseaudio_stop_playback();
		} 
		ModernizedCProgram.pulseaudio_unref();
		Object generatedDevice = this.getDevice();
		ModernizedCProgram.bfree(generatedDevice);
	}
	public void audio_monitor_init_final() {
		Object generatedIgnore = this.getIgnore();
		if (generatedIgnore) {
			return /*Error: Unsupported expression*/;
		} 
		obs_source generatedSource = this.getSource();
		generatedSource.obs_source_add_audio_capture_callback(on_audio_playback, monitor);
		Object generatedIgnore = this.getIgnore();
		if (generatedIgnore) {
			return /*Error: Unsupported expression*/;
		} 
		obs_source generatedSource = this.getSource();
		obs_source_info generatedInfo = generatedSource.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		this.setSource_has_video((generatedOutput_flags & (1 << 0)) != 0);
		generatedSource.obs_source_add_audio_capture_callback(on_audio_playback, monitor);
		Object generatedIgnore = this.getIgnore();
		if (generatedIgnore) {
			return /*Error: Unsupported expression*/;
		} 
		obs_source generatedSource = this.getSource();
		generatedSource.obs_source_add_audio_capture_callback(on_audio_playback, monitor);
		Object generatedStream = this.getStream();
		ModernizedCProgram.pulseaudio_write_callback(generatedStream, pulseaudio_stream_write, (Object)monitor);
		ModernizedCProgram.pulseaudio_set_underflow_callback(generatedStream, pulseaudio_underflow, (Object)monitor);
	}
	public audio_monitor audio_monitor_create(obs_source source) {
		audio_monitor monitor = ModernizedCProgram.bzalloc(/*Error: sizeof expression not supported yet*/);
		if (!ModernizedCProgram.audio_monitor_init(monitor, source)) {
			;
		} 
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(ModernizedCProgram.obs.getAudio().getMonitors(), monitor);
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
		monitor.audio_monitor_init_final();
		return monitor;
		ModernizedCProgram.bfree(monitor);
		return NULL;
		audio_monitor monitor = new audio_monitor(0);
		audio_monitor out = new audio_monitor();
		if (!ModernizedCProgram.audio_monitor_init(monitor, source)) {
			;
		} 
		out = ModernizedCProgram.bmemdup(monitor, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(ModernizedCProgram.obs.getAudio().getMonitors(), out);
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
		out.audio_monitor_init_final();
		return out;
		return ((Object)0);
		audio_monitor monitor = new audio_monitor(0);
		audio_monitor out = new audio_monitor();
		if (!ModernizedCProgram.audio_monitor_init(monitor, source)) {
			;
		} 
		out = ModernizedCProgram.bmemdup(monitor, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(ModernizedCProgram.obs.getAudio().getMonitors(), out);
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
		out.audio_monitor_init_final();
		return out;
		return NULL;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(source);
		return NULL;
	}
	public void audio_monitor_reset() {
		 success = new ();
		obs_source generatedSource = this.getSource();
		obs_source_t source = generatedSource;
		monitor.audio_monitor_free();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(monitor, 0, /*Error: sizeof expression not supported yet*/);
		success = ModernizedCProgram.audio_monitor_init(monitor, source);
		if (success) {
			monitor.audio_monitor_init_final();
		} 
		audio_monitor new_monitor = new audio_monitor(0);
		 success = new ();
		Object generatedPlayback_mutex = this.getPlayback_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedPlayback_mutex);
		obs_source generatedSource = this.getSource();
		success = ModernizedCProgram.audio_monitor_init(new_monitor, generatedSource);
		ModernizedCProgram.pthread_mutex_unlock(generatedPlayback_mutex);
		if (success) {
			obs_source_t source = generatedSource;
			monitor.audio_monitor_free();
			monitor = new_monitor;
			monitor.audio_monitor_init_final();
		} else {
				new_monitor.audio_monitor_free();
		} 
		audio_monitor new_monitor = new audio_monitor(0);
		 success = new ();
		monitor.audio_monitor_free();
		Object generatedPlayback_mutex = this.getPlayback_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedPlayback_mutex);
		obs_source generatedSource = this.getSource();
		success = ModernizedCProgram.audio_monitor_init(new_monitor, generatedSource);
		ModernizedCProgram.pthread_mutex_unlock(generatedPlayback_mutex);
		if (success) {
			monitor = new_monitor;
			monitor.audio_monitor_init_final();
		} else {
				new_monitor.audio_monitor_free();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(monitor);
	}
	public void audio_monitor_destroy() {
		if (monitor) {
			monitor.audio_monitor_free();
			ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_erase_item(ModernizedCProgram.obs.getAudio().getMonitors(), monitor);
			ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
			ModernizedCProgram.bfree(monitor);
		} 
		if (monitor) {
			monitor.audio_monitor_free();
			ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_erase_item(ModernizedCProgram.obs.getAudio().getMonitors(), monitor);
			ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
			ModernizedCProgram.bfree(monitor);
		} 
		if (monitor) {
			monitor.audio_monitor_free();
			ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_erase_item(ModernizedCProgram.obs.getAudio().getMonitors(), monitor);
			ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
			ModernizedCProgram.bfree(monitor);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(monitor);
	}
	/* #define DEBUG_AUDIO */
	public Object process_audio_delay(Double data, Object frames, Object ts, Object pad) {
		obs_source generatedSource = this.getSource();
		obs_source_t s = generatedSource;
		Object generatedLast_frame_ts = s.getLast_frame_ts();
		 last_frame_ts = generatedLast_frame_ts;
		 cur_time = ModernizedCProgram.os_gettime_ns();
		 front_ts = new ();
		 cur_ts = new ();
		 diff = new ();
		Object generatedChannels = this.getChannels();
		 blocksize = generatedChannels * /*Error: Unsupported expression*/;
		Object generatedLast_recv_time = this.getLast_recv_time();
		Object generatedDelay_buffer = this.getDelay_buffer();
		if (cur_time - generatedLast_recv_time > /* cut off audio if long-since leftover audio in delay buffer */1000000000) {
			generatedDelay_buffer.circlebuf_free();
		} 
		this.setLast_recv_time(cur_time);
		Object generatedSync_offset = generatedSource.getSync_offset();
		ts += generatedSync_offset;
		generatedDelay_buffer.circlebuf_push_back(ts, /*Error: sizeof expression not supported yet*/);
		generatedDelay_buffer.circlebuf_push_back(frames, /*Error: sizeof expression not supported yet*/);
		generatedDelay_buffer.circlebuf_push_back(data, frames * blocksize);
		Object generatedPrev_video_ts = this.getPrev_video_ts();
		Object generatedTime_since_prev = this.getTime_since_prev();
		Object generatedSample_rate = this.getSample_rate();
		if (!generatedPrev_video_ts) {
			this.setPrev_video_ts(last_frame_ts);
		}  else if (generatedPrev_video_ts == last_frame_ts) {
			generatedTime_since_prev += (uint64_t) * frames * -1024 / ()generatedSample_rate;
		} else {
				this.setTime_since_prev(0);
		} 
		Object generatedBuf = this.getBuf();
		while (generatedDelay_buffer.getCirclebuf() != 0) {
			size_t size = new size_t();
			 bad_diff = new ();
			generatedDelay_buffer.circlebuf_peek_front(cur_ts, /*Error: sizeof expression not supported yet*/);
			front_ts = cur_ts - (()pad * -1024 / ()generatedSample_rate);
			diff = ()front_ts - ()last_frame_ts;
			bad_diff = !last_frame_ts || /*Error: Function owner not recognized*/llabs(diff) > -1024 || generatedTime_since_prev > -1024;
			if (!bad_diff && diff > /* delay audio if rushing */75000000) {
				return false;
			} 
			generatedDelay_buffer.circlebuf_pop_front(((Object)0), /*Error: sizeof expression not supported yet*/);
			generatedDelay_buffer.circlebuf_pop_front(frames, /*Error: sizeof expression not supported yet*/);
			size = frames * blocksize;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_resize(generatedBuf, size);
			generatedDelay_buffer.circlebuf_pop_front(generatedBuf.getArray(), size);
			if (!bad_diff && diff < -/* cut audio if dragging */75000000 && generatedDelay_buffer.getCirclebuf() > 0) {
				continue;
			} 
			data = generatedBuf.getArray();
			return true;
		}
		return false;
	}
	public void pulseaudio_stop_playback() {
		Object generatedStream = this.getStream();
		if (generatedStream) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pa_stream_disconnect(generatedStream);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pa_stream_unref(generatedStream);
			this.setStream(NULL);
		} 
		Object generatedDevice = this.getDevice();
		ModernizedCProgram.blog(LOG_INFO, "pulse-am: Stopped Monitoring in '%s'", generatedDevice);
		Object generatedPackets = this.getPackets();
		Object generatedFrames = this.getFrames();
		ModernizedCProgram.blog(LOG_INFO, "pulse-am: Got %u packets with %I64u frames", generatedPackets, generatedFrames);
		this.setPackets(0);
		this.setFrames(0);
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Object getQueue() {
		return queue;
	}
	public void setQueue(Object newQueue) {
		queue = newQueue;
	}
	public Object getBuffers() {
		return buffers;
	}
	public void setBuffers(Object newBuffers) {
		buffers = newBuffers;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public circlebuf getEmpty_buffers() {
		return empty_buffers;
	}
	public void setEmpty_buffers(circlebuf newEmpty_buffers) {
		empty_buffers = newEmpty_buffers;
	}
	public circlebuf getNew_data() {
		return new_data;
	}
	public void setNew_data(circlebuf newNew_data) {
		new_data = newNew_data;
	}
	public Object getResampler() {
		return resampler;
	}
	public void setResampler(Object newResampler) {
		resampler = newResampler;
	}
	public Object getBuffer_size() {
		return buffer_size;
	}
	public void setBuffer_size(Object newBuffer_size) {
		buffer_size = newBuffer_size;
	}
	public Object getWait_size() {
		return wait_size;
	}
	public void setWait_size(Object newWait_size) {
		wait_size = newWait_size;
	}
	public Object getChannels() {
		return channels;
	}
	public void setChannels(Object newChannels) {
		channels = newChannels;
	}
	public Object getActive() {
		return active;
	}
	public void setActive(Object newActive) {
		active = newActive;
	}
	public Object getPaused() {
		return paused;
	}
	public void setPaused(Object newPaused) {
		paused = newPaused;
	}
	public Object getIgnore() {
		return ignore;
	}
	public void setIgnore(Object newIgnore) {
		ignore = newIgnore;
	}
}
