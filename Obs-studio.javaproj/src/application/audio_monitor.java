package application;

public class audio_monitor {
	private obs_source source;
	private Object device;
	private Object client;
	private Object render;
	private Object last_recv_time;
	private Object prev_video_ts;
	private Object time_since_prev;
	private Object resampler;
	private Object sample_rate;
	private Object channels;
	private Object source_has_video;
	private Object ignore;
	private Object lowest_audio_offset;
	private circlebuf delay_buffer;
	private Object delay_size;
	private Object ;
	private Object playback_mutex;
	
	public audio_monitor(obs_source source, Object device, Object client, Object render, Object last_recv_time, Object prev_video_ts, Object time_since_prev, Object resampler, Object sample_rate, Object channels, Object source_has_video, Object ignore, Object lowest_audio_offset, circlebuf delay_buffer, Object delay_size, Object,  Object playback_mutex) {
		setSource(source);
		setDevice(device);
		setClient(client);
		setRender(render);
		setLast_recv_time(last_recv_time);
		setPrev_video_ts(prev_video_ts);
		setTime_since_prev(time_since_prev);
		setResampler(resampler);
		setSample_rate(sample_rate);
		setChannels(channels);
		setSource_has_video(source_has_video);
		setIgnore(ignore);
		setLowest_audio_offset(lowest_audio_offset);
		setDelay_buffer(delay_buffer);
		setDelay_size(delay_size);
		set();
		setPlayback_mutex(playback_mutex);
	}
	public audio_monitor() {
	}
	
	/* #define DEBUG_AUDIO */
	public Object process_audio_delay(double data, Object frames, Object ts, Object pad) {
		obs_source generatedSource = this.getSource();
		obs_source_t s = generatedSource;
		Object generatedLast_frame_ts = s.getLast_frame_ts();
		 last_frame_ts = generatedLast_frame_ts;
		 cur_time = ModernizedCProgram.os_gettime_ns();
		 front_ts = new ();
		 cur_ts = new ();
		 diff = new ();
		Object generatedChannels = this.getChannels();
		 blocksize = generatedChannels * ;
		Object generatedLast_recv_time = this.getLast_recv_time();
		circlebuf generatedDelay_buffer = this.getDelay_buffer();
		if (cur_time - generatedLast_recv_time > /* cut off audio if long-since leftover audio in delay buffer */1000000000) {
			generatedDelay_buffer.circlebuf_free();
		} 
		this.setLast_recv_time(cur_time);
		Object generatedSync_offset = generatedSource.getSync_offset();
		ts += generatedSync_offset;
		generatedDelay_buffer.circlebuf_push_back(ts, );
		generatedDelay_buffer.circlebuf_push_back(frames, );
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
		Object generatedCirclebuf = generatedDelay_buffer.getCirclebuf();
		Object generatedBuf = this.getBuf();
		while (generatedCirclebuf != 0) {
			size_t size = new size_t();
			 bad_diff = new ();
			generatedDelay_buffer.circlebuf_peek_front(cur_ts, );
			front_ts = cur_ts - (()pad * -1024 / ()generatedSample_rate);
			diff = ()front_ts - ()last_frame_ts;
			bad_diff = !last_frame_ts || .llabs(diff) > -1024 || generatedTime_since_prev > -1024;
			if (!bad_diff && diff > /* delay audio if rushing */75000000) {
				return false;
			} 
			generatedDelay_buffer.circlebuf_pop_front(((Object)0), );
			generatedDelay_buffer.circlebuf_pop_front(frames, );
			size = frames * blocksize;
			.da_resize(generatedBuf, size);
			generatedDelay_buffer.circlebuf_pop_front(generatedBuf.getArray(), size);
			if (!bad_diff && diff < -/* cut audio if dragging */75000000 && generatedCirclebuf > 0) {
				continue;
			} 
			data = generatedBuf.getArray();
			return true;
		}
		return false;
	}
	public void audio_monitor_free() {
		Object generatedIgnore = this.getIgnore();
		if (generatedIgnore) {
			return ;
		} 
		obs_source generatedSource = this.getSource();
		if (generatedSource) {
			generatedSource.obs_source_remove_audio_capture_callback(on_audio_playback, monitor);
		} 
		Object generatedClient = this.getClient();
		if (generatedClient) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedClient);
		} 
		Object generatedDevice = this.getDevice();
		do {
			if (generatedDevice) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedDevice);
			} 
		} while (false);
		do {
			if (generatedClient) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedClient);
			} 
		} while (false);
		Object generatedRender = this.getRender();
		do {
			if (generatedRender) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedRender);
			} 
		} while (false);
		Object generatedResampler = this.getResampler();
		generatedResampler.audio_resampler_destroy();
		circlebuf generatedDelay_buffer = this.getDelay_buffer();
		generatedDelay_buffer.circlebuf_free();
		Object generatedBuf = this.getBuf();
		.da_free(generatedBuf);
		obs_source generatedSource = this.getSource();
		if (generatedSource) {
			generatedSource.obs_source_remove_audio_capture_callback(on_audio_playback, monitor);
		} 
		Object generatedActive = this.getActive();
		Object generatedQueue = this.getQueue();
		if (generatedActive) {
			.AudioQueueStop(generatedQueue, true);
		} 
		Object generatedBuffers = this.getBuffers();
		for ( i = 0;
		 i < 3; i++) {
			if (generatedBuffers[i]) {
				.AudioQueueFreeBuffer(generatedQueue, generatedBuffers[i]);
			} 
		}
		if (generatedQueue) {
			.AudioQueueDispose(generatedQueue, true);
		} 
		Object generatedResampler = this.getResampler();
		generatedResampler.audio_resampler_destroy();
		Object generatedEmpty_buffers = this.getEmpty_buffers();
		generatedEmpty_buffers.circlebuf_free();
		Object generatedNew_data = this.getNew_data();
		generatedNew_data.circlebuf_free();
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
		Object generatedIgnore = this.getIgnore();
		if (generatedIgnore) {
			return ;
		} 
		obs_source generatedSource = this.getSource();
		if (generatedSource) {
			generatedSource.obs_source_remove_audio_capture_callback(on_audio_playback, monitor);
		} 
		Object generatedResampler = this.getResampler();
		generatedResampler.audio_resampler_destroy();
		Object generatedNew_data = this.getNew_data();
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
			return ;
		} 
		obs_source generatedSource = this.getSource();
		obs_source_info generatedInfo = generatedSource.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		this.setSource_has_video((generatedOutput_flags & (1 << 0)) != 0);
		generatedSource.obs_source_add_audio_capture_callback(on_audio_playback, monitor);
		Object generatedIgnore = this.getIgnore();
		if (generatedIgnore) {
			return ;
		} 
		obs_source generatedSource = this.getSource();
		generatedSource.obs_source_add_audio_capture_callback(on_audio_playback, monitor);
		Object generatedIgnore = this.getIgnore();
		if (generatedIgnore) {
			return ;
		} 
		obs_source generatedSource = this.getSource();
		generatedSource.obs_source_add_audio_capture_callback(on_audio_playback, monitor);
		Object generatedStream = this.getStream();
		ModernizedCProgram.pulseaudio_write_callback(generatedStream, pulseaudio_stream_write, (Object)monitor);
		ModernizedCProgram.pulseaudio_set_underflow_callback(generatedStream, pulseaudio_underflow, (Object)monitor);
	}
	public audio_monitor audio_monitor_create(obs_source source) {
		audio_monitor monitor = new audio_monitor(0);
		audio_monitor out = new audio_monitor();
		if (!ModernizedCProgram.audio_monitor_init(monitor, source)) {
			;
		} 
		out = ModernizedCProgram.bmemdup(monitor, );
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
		.da_push_back(ModernizedCProgram.obs.getAudio().getMonitors(), out);
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
		out.audio_monitor_init_final();
		return out;
		return ((Object)0);
		audio_monitor monitor = ModernizedCProgram.bzalloc();
		if (!ModernizedCProgram.audio_monitor_init(monitor, source)) {
			;
		} 
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
		.da_push_back(ModernizedCProgram.obs.getAudio().getMonitors(), monitor);
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
		monitor.audio_monitor_init_final();
		return monitor;
		ModernizedCProgram.bfree(monitor);
		return NULL;
		.UNUSED_PARAMETER(source);
		return NULL;
		audio_monitor monitor = new audio_monitor(0);
		audio_monitor out = new audio_monitor();
		if (!ModernizedCProgram.audio_monitor_init(monitor, source)) {
			;
		} 
		out = ModernizedCProgram.bmemdup(monitor, );
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
		.da_push_back(ModernizedCProgram.obs.getAudio().getMonitors(), out);
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
		out.audio_monitor_init_final();
		return out;
		return NULL;
	}
	public void audio_monitor_reset() {
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
		 success = new ();
		obs_source generatedSource = this.getSource();
		obs_source_t source = generatedSource;
		monitor.audio_monitor_free();
		.memset(monitor, 0, );
		success = ModernizedCProgram.audio_monitor_init(monitor, source);
		if (success) {
			monitor.audio_monitor_init_final();
		} 
		.UNUSED_PARAMETER(monitor);
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
	}
	public void audio_monitor_destroy() {
		if (monitor) {
			monitor.audio_monitor_free();
			ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
			.da_erase_item(ModernizedCProgram.obs.getAudio().getMonitors(), monitor);
			ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
			ModernizedCProgram.bfree(monitor);
		} 
		if (monitor) {
			monitor.audio_monitor_free();
			ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
			.da_erase_item(ModernizedCProgram.obs.getAudio().getMonitors(), monitor);
			ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
			ModernizedCProgram.bfree(monitor);
		} 
		.UNUSED_PARAMETER(monitor);
		if (monitor) {
			monitor.audio_monitor_free();
			ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
			.da_erase_item(ModernizedCProgram.obs.getAudio().getMonitors(), monitor);
			ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getAudio().getMonitoring_mutex());
			ModernizedCProgram.bfree(monitor);
		} 
	}
	public Object fill_buffer() {
		 buf = new ();
		 stat = new ();
		Object generatedNew_data = this.getNew_data();
		Object generatedBuffer_size = this.getBuffer_size();
		if (generatedNew_data.getCirclebuf() < generatedBuffer_size) {
			return false;
		} 
		Object generatedEmpty_buffers = this.getEmpty_buffers();
		generatedEmpty_buffers.circlebuf_pop_front(buf, );
		generatedNew_data.circlebuf_pop_front(buf.getMAudioData(), generatedBuffer_size);
		buf.setMAudioDataByteSize(generatedBuffer_size);
		Object generatedQueue = this.getQueue();
		stat = .AudioQueueEnqueueBuffer(generatedQueue, buf, 0, NULL);
		if (!ModernizedCProgram.success_(stat, __FUNCTION__, "AudioQueueEnqueueBuffer")) {
			ModernizedCProgram.blog(LOG_WARNING, "%s: %s", __FUNCTION__, "Failed to enqueue buffer");
			.AudioQueueStop(generatedQueue, false);
		} 
		return true;
	}
	public void pulseaudio_stop_playback() {
		Object generatedStream = this.getStream();
		if (generatedStream) {
			.pa_stream_disconnect(generatedStream);
			.pa_stream_unref(generatedStream);
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
	public Object getDevice() {
		return device;
	}
	public void setDevice(Object newDevice) {
		device = newDevice;
	}
	public Object getClient() {
		return client;
	}
	public void setClient(Object newClient) {
		client = newClient;
	}
	public Object getRender() {
		return render;
	}
	public void setRender(Object newRender) {
		render = newRender;
	}
	public Object getLast_recv_time() {
		return last_recv_time;
	}
	public void setLast_recv_time(Object newLast_recv_time) {
		last_recv_time = newLast_recv_time;
	}
	public Object getPrev_video_ts() {
		return prev_video_ts;
	}
	public void setPrev_video_ts(Object newPrev_video_ts) {
		prev_video_ts = newPrev_video_ts;
	}
	public Object getTime_since_prev() {
		return time_since_prev;
	}
	public void setTime_since_prev(Object newTime_since_prev) {
		time_since_prev = newTime_since_prev;
	}
	public Object getResampler() {
		return resampler;
	}
	public void setResampler(Object newResampler) {
		resampler = newResampler;
	}
	public Object getSample_rate() {
		return sample_rate;
	}
	public void setSample_rate(Object newSample_rate) {
		sample_rate = newSample_rate;
	}
	public Object getChannels() {
		return channels;
	}
	public void setChannels(Object newChannels) {
		channels = newChannels;
	}
	public Object getSource_has_video() {
		return source_has_video;
	}
	public void setSource_has_video(Object newSource_has_video) {
		source_has_video = newSource_has_video;
	}
	public Object getIgnore() {
		return ignore;
	}
	public void setIgnore(Object newIgnore) {
		ignore = newIgnore;
	}
	public Object getLowest_audio_offset() {
		return lowest_audio_offset;
	}
	public void setLowest_audio_offset(Object newLowest_audio_offset) {
		lowest_audio_offset = newLowest_audio_offset;
	}
	public circlebuf getDelay_buffer() {
		return delay_buffer;
	}
	public void setDelay_buffer(circlebuf newDelay_buffer) {
		delay_buffer = newDelay_buffer;
	}
	public Object getDelay_size() {
		return delay_size;
	}
	public void setDelay_size(Object newDelay_size) {
		delay_size = newDelay_size;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object getPlayback_mutex() {
		return playback_mutex;
	}
	public void setPlayback_mutex(Object newPlayback_mutex) {
		playback_mutex = newPlayback_mutex;
	}
}
