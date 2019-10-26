package application;

public class audio_output {
	private audio_output_info info;
	private Object block_size;
	private Object channels;
	private Object planes;
	private Object thread;
	private Object stop_event;
	private Object initialized;
	private Object input_cb;
	private Object input_param;
	private Object input_mutex;
	private Object mixes;
	
	public audio_output(audio_output_info info, Object block_size, Object channels, Object planes, Object thread, Object stop_event, Object initialized, Object input_cb, Object input_param, Object input_mutex, Object mixes) {
		setInfo(info);
		setBlock_size(block_size);
		setChannels(channels);
		setPlanes(planes);
		setThread(thread);
		setStop_event(stop_event);
		setInitialized(initialized);
		setInput_cb(input_cb);
		setInput_param(input_param);
		setInput_mutex(input_mutex);
		setMixes(mixes);
	}
	public audio_output() {
	}
	
	public void do_audio_output(Object mix_idx, Object timestamp, Object frames) {
		Object generatedMixes = this.getMixes();
		audio_mix mix = generatedMixes[mix_idx];
		audio_data data = new audio_data();
		Object generatedInput_mutex = this.getInput_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedInput_mutex);
		Object generatedInputs = mix.getInputs();
		Object generatedPlanes = this.getPlanes();
		Object generatedData = data.getData();
		Object generatedBuffer = mix.getBuffer();
		Object generatedParam = input.getParam();
		for ( i = generatedInputs.getNum();
		 i > 0; i--) {
			audio_input input = generatedInputs.getArray() + (i - 1);
			for ( i = 0;
			 i < generatedPlanes; i++) {
				generatedData[i] = (uint8_t)generatedBuffer[i];
			}
			data.setFrames(frames);
			data.setTimestamp(timestamp);
			if (ModernizedCProgram.resample_audio_output(input, data)) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedParam, mix_idx, data);
			} 
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedInput_mutex);
	}
	public void clamp_audio_output(Object bytes) {
		 float_size = bytes / ;
		Object generatedMixes = this.getMixes();
		Object generatedInputs = mix.getInputs();
		Object generatedPlanes = this.getPlanes();
		Object generatedBuffer = mix.getBuffer();
		for ( mix_idx = 0;
		 mix_idx < 6; mix_idx++) {
			audio_mix mix = generatedMixes[mix_idx];
			if (!generatedInputs.getNum()) {
				continue;
			} 
			for ( plane = 0;
			 plane < generatedPlanes; plane++) {
				double mix_data = generatedBuffer[plane];
				double mix_end = mix_data[float_size];
				while (mix_data < mix_end) {
					double val = mix_data;
					val = (val > 1.0) ? 1.0 : val;
					val = (val < -1.0) ? -1.0 : val;
					(mix_data++) = val;
				}
			}
		}
	}
	public void input_and_output(Object audio_time, Object prev_time) {
		Object generatedBlock_size = this.getBlock_size();
		 bytes = 1024 * generatedBlock_size;
		audio_output_data[] data = new audio_output_data();
		uint32_t active_mixes = 0;
		uint64_t new_ts = 0;
		 success = new ();
		.memset(data, 0, );
		Object generatedInput_mutex = this.getInput_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedInput_mutex);
		Object generatedMixes = this.getMixes();
		for ( i = 0;
		 i < 6; i++) {
			if (generatedMixes[i].getInputs().getNum()) {
				active_mixes |=  (1 << i);
			} 
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedInput_mutex);
		Object generatedBuffer = mix.getBuffer();
		Object generatedPlanes = this.getPlanes();
		for ( mix_idx = 0;
		 mix_idx < 6; /* clear mix buffers */mix_idx++) {
			audio_mix mix = generatedMixes[mix_idx];
			.memset(generatedBuffer[0], 0, 1024 * 8 * );
			for ( i = 0;
			 i < generatedPlanes; i++) {
				data[mix_idx].getData()[i] = generatedBuffer[i];
			}
		}
		Object generatedInput_param = this.getInput_param();
		success = .UNRECOGNIZEDFUNCTIONNAME(generatedInput_param, prev_time, /* get new audio data */audio_time, new_ts, active_mixes, data);
		if (!success) {
			return ;
		} 
		audio.clamp_audio_output(/* clamps audio data to -1.0..1.0 */bytes);
		for ( i = 0;
		 i < 6; /* output */i++) {
			audio.do_audio_output(i, new_ts, 1024);
		}
	}
	public Object audio_output_connect(Object mi, Object conversion, Object callback, Object param) {
		 success = false;
		if (!audio || mi >= 6) {
			return false;
		} 
		Object generatedInput_mutex = this.getInput_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedInput_mutex);
		Object generatedMixes = this.getMixes();
		audio_output_info generatedInfo = this.getInfo();
		audio_format generatedFormat = generatedInfo.getFormat();
		audio_convert_info generatedConversion = input.getConversion();
		speaker_layout generatedSpeakers = generatedInfo.getSpeakers();
		Object generatedSamples_per_sec = generatedInfo.getSamples_per_sec();
		Object generatedInputs = mix.getInputs();
		if (ModernizedCProgram.audio_get_input_idx(audio, mi, callback, param) == DARRAY_INVALID) {
			audio_mix mix = generatedMixes[mi];
			audio_input input = new audio_input();
			input.setCallback(callback);
			input.setParam(param);
			if (conversion) {
				input.setConversion(conversion);
			} else {
					generatedConversion.setFormat(generatedFormat);
					generatedConversion.setSpeakers(generatedSpeakers);
					generatedConversion.setSamples_per_sec(generatedSamples_per_sec);
			} 
			if (generatedFormat == audio_format.AUDIO_FORMAT_UNKNOWN) {
				generatedConversion.setFormat(generatedFormat);
			} 
			if (generatedSpeakers == speaker_layout.SPEAKERS_UNKNOWN) {
				generatedConversion.setSpeakers(generatedSpeakers);
			} 
			if (generatedSamples_per_sec == 0) {
				generatedConversion.setSamples_per_sec(generatedSamples_per_sec);
			} 
			success = ModernizedCProgram.audio_input_init(input, audio);
			if (success) {
				.da_push_back(generatedInputs, input);
			} 
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedInput_mutex);
		return success;
	}
	public void audio_output_disconnect(Object mix_idx, Object callback, Object param) {
		if (!audio || mix_idx >= 6) {
			return ;
		} 
		Object generatedInput_mutex = this.getInput_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedInput_mutex);
		 idx = ModernizedCProgram.audio_get_input_idx(audio, mix_idx, callback, param);
		Object generatedMixes = this.getMixes();
		Object generatedInputs = mix.getInputs();
		if (idx != DARRAY_INVALID) {
			audio_mix mix = generatedMixes[mix_idx];
			generatedInputs.getArray() + idx.audio_input_free();
			.da_erase(generatedInputs, idx);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedInput_mutex);
	}
	public void audio_output_close() {
		Object thread_ret;
		if (!audio) {
			return ;
		} 
		Object generatedInitialized = this.getInitialized();
		Object generatedStop_event = this.getStop_event();
		Object generatedThread = this.getThread();
		if (generatedInitialized) {
			generatedStop_event.os_event_signal();
			ModernizedCProgram.pthread_join(generatedThread, thread_ret);
		} 
		Object generatedMixes = this.getMixes();
		Object generatedInputs = mix.getInputs();
		for ( mix_idx = 0;
		 mix_idx < 6; mix_idx++) {
			audio_mix mix = generatedMixes[mix_idx];
			for ( i = 0;
			 i < generatedInputs.getNum(); i++) {
				generatedInputs.getArray() + i.audio_input_free();
			}
			.da_free(generatedInputs);
		}
		generatedStop_event.os_event_destroy();
		ModernizedCProgram.bfree(audio);
	}
	public audio_output_info getInfo() {
		return info;
	}
	public void setInfo(audio_output_info newInfo) {
		info = newInfo;
	}
	public Object getBlock_size() {
		return block_size;
	}
	public void setBlock_size(Object newBlock_size) {
		block_size = newBlock_size;
	}
	public Object getChannels() {
		return channels;
	}
	public void setChannels(Object newChannels) {
		channels = newChannels;
	}
	public Object getPlanes() {
		return planes;
	}
	public void setPlanes(Object newPlanes) {
		planes = newPlanes;
	}
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
	public Object getStop_event() {
		return stop_event;
	}
	public void setStop_event(Object newStop_event) {
		stop_event = newStop_event;
	}
	public Object getInitialized() {
		return initialized;
	}
	public void setInitialized(Object newInitialized) {
		initialized = newInitialized;
	}
	public Object getInput_cb() {
		return input_cb;
	}
	public void setInput_cb(Object newInput_cb) {
		input_cb = newInput_cb;
	}
	public Object getInput_param() {
		return input_param;
	}
	public void setInput_param(Object newInput_param) {
		input_param = newInput_param;
	}
	public Object getInput_mutex() {
		return input_mutex;
	}
	public void setInput_mutex(Object newInput_mutex) {
		input_mutex = newInput_mutex;
	}
	public Object getMixes() {
		return mixes;
	}
	public void setMixes(Object newMixes) {
		mixes = newMixes;
	}
}
