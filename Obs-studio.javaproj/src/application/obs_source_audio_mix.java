package application;

/**
 * Source composites sub-sources
 *
 * When used specifies that the source composites one or more sub-sources.
 * Sources that render sub-sources must implement the audio_render callback
 * in order to perform custom mixing of sub-sources.
 *
 * This capability flag is always set for transitions.
 */
/**
 * Source should not be fully duplicated
 *
 * When this is used, specifies that the source should not be fully duplicated,
 * and should prefer to duplicate via holding references rather than full
 * duplication.
 */
/**
 * Source is deprecated and should not be used
 */
/**
 * Source cannot have its audio monitored
 *
 * Specifies that this source may cause a feedback loop if audio is monitored
 * with a device selected as desktop audio.
 *
 * This is used primarily with desktop audio capture sources.
 */
/**
 * Source type is currently disabled and should not be shown to the user
 */
/**
 * Source should enable monitoring by default.  Monitoring should be set by the
 * frontend if this flag is set.
 */
/** Used internally for audio submixing */
/** @} */
public class obs_source_audio_mix {
	private Object output;
	
	public obs_source_audio_mix(Object output) {
		setOutput(output);
	}
	public obs_source_audio_mix() {
	}
	
	public Object fade_to_color_audio_render(Object data, Object ts_out, Object mixers, Object channels, Object sample_rate) {
		fade_to_color_info fade_to_color = data;
		obs_source generatedSource = fade_to_color.getSource();
		return ModernizedCProgram.obs_transition_audio_render(generatedSource, ts_out, audio, mixers, channels, sample_rate, mix_a, mix_b);
	}
	public void obs_source_get_audio_mix(Object source) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_get_audio_mix", "source")) {
			return /*Error: Unsupported expression*/;
		} 
		if (!ModernizedCProgram.obs_object_valid(audio, "audio", "audio")) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedOutput = this.getOutput();
		for ( mix = 0;
		 mix < MAX_AUDIO_MIXES; mix++) {
			for ( ch = 0;
			 ch < MAX_AUDIO_CHANNELS; ch++) {
				generatedOutput[mix].getAudio_output_data()[ch] = source.getAudio_output_buf()[mix][ch];
			}
		}
	}
	public Object scene_audio_render(Object data, Object ts_out, Object mixers, Object channels, Object sample_rate) {
		 timestamp = 0;
		double buf = NULL;
		obs_source_audio_mix child_audio = new obs_source_audio_mix();
		obs_scene scene = data;
		obs_scene_item item = new obs_scene_item();
		Object generatedAudio_mutex = scene.getAudio_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_mutex);
		obs_scene_item generatedFirst_item = scene.getFirst_item();
		item = generatedFirst_item;
		obs_source generatedSource = item.getSource();
		Object generatedVisible = item.getVisible();
		obs_scene_item generatedNext = item.getNext();
		while (item) {
			if (!ModernizedCProgram.obs_source_audio_pending(generatedSource) && generatedVisible) {
				 source_ts = ModernizedCProgram.obs_source_get_audio_timestamp(generatedSource);
				if (source_ts && (!timestamp || source_ts < timestamp)) {
					timestamp = source_ts;
				} 
			} 
			item = generatedNext;
		}
		if (!timestamp/* just process all pending audio actions if no audio playing,
				 * otherwise audio actions will just never be processed */) {
			item = generatedFirst_item;
			while (item) {
				item.process_all_audio_actions(sample_rate);
				item = generatedNext;
			}
			ModernizedCProgram.pthread_mutex_unlock(generatedAudio_mutex);
			return false;
		} 
		item = generatedFirst_item;
		Object generatedOutput = this.getOutput();
		while (item) {
			 source_ts = new ();
			 pos = new ();
			 count = new ();
			 apply_buf = new ();
			apply_buf = item.apply_scene_item_volume(buf, timestamp, sample_rate);
			if (ModernizedCProgram.obs_source_audio_pending(generatedSource)) {
				item = generatedNext;
				continue;
			} 
			source_ts = ModernizedCProgram.obs_source_get_audio_timestamp(generatedSource);
			if (!source_ts) {
				item = generatedNext;
				continue;
			} 
			pos = ()ModernizedCProgram.ns_to_audio_frames(sample_rate, source_ts - timestamp);
			count = AUDIO_OUTPUT_FRAMES - pos;
			if (!apply_buf && !generatedVisible) {
				item = generatedNext;
				continue;
			} 
			child_audio.obs_source_get_audio_mix(generatedSource);
			for ( mix = 0;
			 mix < MAX_AUDIO_MIXES; mix++) {
				if ((mixers & (1 << mix)) == 0) {
					continue;
				} 
				for ( ch = 0;
				 ch < channels; ch++) {
					double out = generatedOutput[mix].getAudio_output_data()[ch];
					double in = generatedOutput[mix].getAudio_output_data()[ch];
					if (apply_buf) {
						ModernizedCProgram.mix_audio_with_buf(out, in, buf, pos, count);
					} else {
							ModernizedCProgram.mix_audio(out, in, pos, count);
					} 
				}
			}
			item = generatedNext;
		}
		ts_out = timestamp;
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_mutex);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(buf);
		return true;
	}
	public Object stinger_audio_render(Object data, Object ts_out, Object mixers, Object channels, Object sample_rate) {
		stinger_info s = data;
		 ts = 0;
		obs_source generatedMedia_source = s.getMedia_source();
		if (!ModernizedCProgram.obs_source_audio_pending(generatedMedia_source)) {
			ts = ModernizedCProgram.obs_source_get_audio_timestamp(generatedMedia_source);
			if (!ts) {
				return false;
			} 
		} 
		obs_source generatedSource = s.getSource();
		Object generatedMix_a = s.getMix_a();
		Object generatedMix_b = s.getMix_b();
		 success = ModernizedCProgram.obs_transition_audio_render(generatedSource, ts_out, audio, mixers, channels, sample_rate, generatedMix_a, generatedMix_b);
		if (!ts) {
			return success;
		} 
		if (!ts_out || ts < ts_out) {
			ts_out = ts;
		} 
		obs_source_audio_mix child_audio = new obs_source_audio_mix();
		child_audio.obs_source_get_audio_mix(generatedMedia_source);
		Object generatedOutput = this.getOutput();
		for ( mix = 0;
		 mix < MAX_AUDIO_MIXES; mix++) {
			if ((mixers & (1 << mix)) == 0) {
				continue;
			} 
			for ( ch = 0;
			 ch < channels; ch++) {
				double out = generatedOutput[mix].getAudio_output_data()[ch];
				double in = generatedOutput[mix].getAudio_output_data()[ch];
				double end = in + AUDIO_OUTPUT_FRAMES;
				while (in < end) {
					(out++) += (in++);
				}
			}
		}
		return true;
	}
	public Object slide_audio_render(Object data, Object ts_out, Object mixers, Object channels, Object sample_rate) {
		slide_info slide = data;
		obs_source generatedSource = slide.getSource();
		return ModernizedCProgram.obs_transition_audio_render(generatedSource, ts_out, audio, mixers, channels, sample_rate, mix_a, mix_b);
	}
	public Object ss_audio_render(Object data, Object ts_out, Object mixers, Object channels, Object sample_rate) {
		slideshow ss = data;
		obs_source obs_source = new obs_source();
		obs_source_t transition = obs_source.get_transition(ss);
		 success = new ();
		if (!transition) {
			return false;
		} 
		success = ModernizedCProgram.ss_audio_render_(transition, ts_out, audio_output, mixers, channels, sample_rate);
		transition.obs_source_release();
		return success;
	}
	public Object cut_audio_render(Object data, Object ts_out, Object mixers, Object channels, Object sample_rate) {
		cut_info cut = data;
		obs_source generatedSource = cut.getSource();
		return ModernizedCProgram.obs_transition_audio_render(generatedSource, ts_out, audio, mixers, channels, sample_rate, mix_a, mix_b);
	}
	public Object swipe_audio_render(Object data, Object ts_out, Object mixers, Object channels, Object sample_rate) {
		swipe_info swipe = data;
		obs_source generatedSource = swipe.getSource();
		return ModernizedCProgram.obs_transition_audio_render(generatedSource, ts_out, audio, mixers, channels, sample_rate, mix_a, mix_b);
	}
	public Object luma_wipe_audio_render(Object data, Object ts_out, Object mixers, Object channels, Object sample_rate) {
		luma_wipe_info lwipe = data;
		obs_source generatedSource = lwipe.getSource();
		return ModernizedCProgram.obs_transition_audio_render(generatedSource, ts_out, audio, mixers, channels, sample_rate, mix_a, mix_b);
	}
	public Object fade_audio_render(Object data, Object ts_out, Object mixers, Object channels, Object sample_rate) {
		fade_info fade = data;
		obs_source generatedSource = fade.getSource();
		return ModernizedCProgram.obs_transition_audio_render(generatedSource, ts_out, audio, mixers, channels, sample_rate, mix_a, mix_b);
	}
	public Object getOutput() {
		return output;
	}
	public void setOutput(Object newOutput) {
		output = newOutput;
	}
}
/**
	 * Called to enumerate all active and inactive sources being used
	 * within this source.  If this callback isn't implemented,
	 * enum_active_sources will be called instead.
	 *
	 * This is typically used if a source can have inactive child sources.
	 *
	 * @param  data           Filter data
	 * @param  enum_callback  Enumeration callback
	 * @param  param          User data to pass to callback
	 */
