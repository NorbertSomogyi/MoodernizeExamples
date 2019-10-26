package application;

public class obs_audio_data {
	private Object data;
	private Object frames;
	private Object timestamp;
	
	public obs_audio_data(Object data, Object frames, Object timestamp) {
		setData(data);
		setFrames(frames);
		setTimestamp(timestamp);
	}
	public obs_audio_data() {
	}
	
	public obs_audio_data noise_gate_filter_audio(Object data) {
		noise_gate_data ng = data;
		Object generatedData = this.getData();
		double adata = (double)generatedData;
		double generatedClose_threshold = ng.getClose_threshold();
		double close_threshold = generatedClose_threshold;
		double generatedOpen_threshold = ng.getOpen_threshold();
		double open_threshold = generatedOpen_threshold;
		double generatedSample_rate_i = ng.getSample_rate_i();
		double sample_rate_i = generatedSample_rate_i;
		double generatedRelease_rate = ng.getRelease_rate();
		double release_rate = generatedRelease_rate;
		double generatedAttack_rate = ng.getAttack_rate();
		double attack_rate = generatedAttack_rate;
		double generatedDecay_rate = ng.getDecay_rate();
		double decay_rate = generatedDecay_rate;
		double generatedHold_time = ng.getHold_time();
		double hold_time = generatedHold_time;
		Object generatedChannels = ng.getChannels();
		 channels = generatedChannels;
		Object generatedFrames = this.getFrames();
		Object generatedIs_open = ng.getIs_open();
		double generatedLevel = ng.getLevel();
		double generatedAttenuation = ng.getAttenuation();
		double generatedHeld_time = ng.getHeld_time();
		for ( i = 0;
		 i < generatedFrames; i++) {
			double cur_level = .fabsf(adata[0][i]);
			for ( j = 0;
			 j < channels; j++) {
				cur_level = .fmaxf(cur_level, .fabsf(adata[j][i]));
			}
			if (cur_level > open_threshold && !generatedIs_open) {
				ng.setIs_open(true);
			} 
			if (generatedLevel < close_threshold && generatedIs_open) {
				ng.setHeld_time(0.0);
				ng.setIs_open(false);
			} 
			ng.setLevel(.fmaxf(generatedLevel, cur_level) - decay_rate);
			if (generatedIs_open) {
				ng.setAttenuation(.fminf(1.0, generatedAttenuation + attack_rate));
			} else {
					generatedHeld_time += sample_rate_i;
					if (generatedHeld_time > hold_time) {
						ng.setAttenuation(.fmaxf(0.0, generatedAttenuation - release_rate));
					} 
			} 
			for ( c = 0;
			 c < channels; c++) {
				adata[c][i] *= generatedAttenuation;
			}
		}
		return audio;
	}
	public obs_audio_data compressor_filter_audio(Object data) {
		compressor_data cd = data;
		Object generatedFrames = this.getFrames();
		uint32_t num_samples = generatedFrames;
		if (num_samples == 0) {
			return audio;
		} 
		Object generatedData = this.getData();
		double samples = (double)generatedData;
		Object generatedSidechain_update_mutex = cd.getSidechain_update_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedSidechain_update_mutex);
		obs_weak_source generatedWeak_sidechain = cd.getWeak_sidechain();
		obs_weak_source_t weak_sidechain = generatedWeak_sidechain;
		ModernizedCProgram.pthread_mutex_unlock(generatedSidechain_update_mutex);
		if (weak_sidechain) {
			cd.analyze_sidechain(num_samples);
		} else {
				cd.analyze_envelope(samples, num_samples);
		} 
		ModernizedCProgram.process_compression(cd, samples, num_samples);
		return audio;
	}
	public obs_audio_data limiter_filter_audio(Object data) {
		limiter_data cd = data;
		Object generatedFrames = this.getFrames();
		uint32_t num_samples = generatedFrames;
		if (num_samples == 0) {
			return audio;
		} 
		Object generatedData = this.getData();
		double samples = (double)generatedData;
		cd.analyze_envelope(samples, num_samples);
		ModernizedCProgram.process_compression(cd, samples, num_samples);
		return audio;
	}
	public void free_audio_packet() {
		Object generatedData = this.getData();
		for ( i = 0;
		 i < MAX_AV_PLANES; i++) {
			ModernizedCProgram.bfree(generatedData[i]);
		}
		.memset(audio, 0, );
	}
	public obs_audio_data expander_filter_audio(Object data) {
		expander_data cd = data;
		Object generatedFrames = this.getFrames();
		uint32_t num_samples = generatedFrames;
		if (num_samples == 0) {
			return audio;
		} 
		Object generatedData = this.getData();
		double samples = (double)generatedData;
		cd.analyze_envelope(samples, num_samples);
		cd.process_expansion(samples, num_samples);
		return audio;
	}
	public obs_audio_data invert_polarity_filter_audio(Object unused) {
		Object generatedData = this.getData();
		double adata = (double)generatedData;
		Object generatedFrames = this.getFrames();
		for ( c = 0;
		 c < MAX_AV_PLANES; c++) {
			double channel_data = adata[c];
			double channel_end = channel_data + generatedFrames;
			if (!channel_data) {
				break;
			} 
			while (channel_data < channel_end) {
				(channel_data++) *= -1.0;
			}
		}
		.UNUSED_PARAMETER(unused);
		return audio;
	}
	public obs_audio_data noise_suppress_filter_audio(Object data) {
		noise_suppress_data ng = data;
		ng_audio_info info = new ng_audio_info();
		Object generatedFrames = ng.getFrames();
		 segment_size = generatedFrames * ;
		 out_size = new ();
		Object generatedStates = ng.getStates();
		if (!generatedStates[0]) {
			return audio/* -----------------------------------------------
				 * if timestamp has dramatically changed, consider it a new stream of
				 * audio data.  clear all circular buffers to prevent old audio data
				 * from being processed as part of the new data. */;
		} 
		Object generatedLast_timestamp = ng.getLast_timestamp();
		Object generatedTimestamp = this.getTimestamp();
		if (generatedLast_timestamp) {
			int64_t diff = .llabs((int64_t)generatedLast_timestamp - (int64_t)generatedTimestamp);
			if (diff > -1024) {
				ng.reset_data();
			} 
		} 
		ng.setLast_timestamp(generatedTimestamp);
		info.setFrames(generatedFrames);
		info.setTimestamp(generatedTimestamp);
		circlebuf generatedInfo_buffer = ng.getInfo_buffer();
		generatedInfo_buffer.circlebuf_push_back(info, );
		Object generatedChannels = ng.getChannels();
		Object generatedInput_buffers = ng.getInput_buffers();
		Object generatedData = this.getData();
		for ( i = 0;
		 i < generatedChannels; /* -----------------------------------------------
			 * push back current audio data to input circlebuf */i++) {
			generatedInput_buffers[i].circlebuf_push_back(generatedData[i], generatedFrames * );
		}
		while (generatedInput_buffers[0].getCirclebuf() >= /* -----------------------------------------------
			 * pop/process each 10ms segments, push back to output circlebuf */segment_size) {
			ModernizedCProgram.process(ng/* -----------------------------------------------
				 * peek front of info circlebuf, check to see if we have enough to
				 * pop the expected packet size, if not, return null */);
		}
		.memset(info, 0, );
		generatedInfo_buffer.circlebuf_peek_front(info, );
		out_size = generatedFrames * ;
		Object generatedOutput_buffers = ng.getOutput_buffers();
		if (generatedOutput_buffers[0].getCirclebuf() < out_size) {
			return NULL/* -----------------------------------------------
				 * if there's enough audio data buffered in the output circlebuf,
				 * pop and return a packet */;
		} 
		generatedInfo_buffer.circlebuf_pop_front(NULL, );
		Object generatedOutput_data = ng.getOutput_data();
		.da_resize(generatedOutput_data, out_size * generatedChannels);
		for ( i = 0;
		 i < generatedChannels; i++) {
			generatedData[i] = (uint8_t)generatedOutput_data.getArray()[i * out_size];
			generatedOutput_buffers[i].circlebuf_pop_front(generatedData[i], out_size);
		}
		obs_audio_data generatedOutput_audio = ng.getOutput_audio();
		generatedOutput_audio.setFrames(generatedFrames);
		generatedOutput_audio.setTimestamp(generatedTimestamp);
		return generatedOutput_audio;
	}
	public obs_audio_data filter_async_audio(obs_source source) {
		 i = new ();
		Object generatedFilters = source.getFilters();
		Object generatedEnabled = filter.getEnabled();
		obs_context_data generatedContext = filter.getContext();
		Object generatedData = generatedContext.getData();
		obs_source_info generatedInfo = filter.getInfo();
		Object generatedFilter_audio = generatedInfo.getFilter_audio();
		for (i = generatedFilters.getNum(); i > 0; i--) {
			obs_source filter = generatedFilters.getArray()[i - 1];
			if (!generatedEnabled) {
				continue;
			} 
			if (generatedData && generatedFilter_audio) {
				in = .UNRECOGNIZEDFUNCTIONNAME(generatedData, in);
				if (!in) {
					return NULL;
				} 
			} 
		}
		return in;
	}
	public obs_audio_data gain_filter_audio(Object data) {
		gain_data gf = data;
		Object generatedChannels = gf.getChannels();
		 channels = generatedChannels;
		Object generatedData = this.getData();
		double adata = (double)generatedData;
		double generatedMultiple = gf.getMultiple();
		double multiple = generatedMultiple;
		Object generatedFrames = this.getFrames();
		for ( c = 0;
		 c < channels; c++) {
			if (generatedData[c]) {
				for ( i = 0;
				 i < generatedFrames; i++) {
					adata[c][i] *= multiple;
				}
			} 
		}
		return audio;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getFrames() {
		return frames;
	}
	public void setFrames(Object newFrames) {
		frames = newFrames;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
}
