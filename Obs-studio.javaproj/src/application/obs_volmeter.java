package application;

public class obs_volmeter {
	private Object mutex;
	private obs_source source;
	private obs_fader_type type;
	private double cur_db;
	private Object callback_mutex;
	private Object ;
	private obs_peak_meter_type peak_meter_type;
	private int update_ms;
	private Object prev_samples;
	private Object magnitude;
	private Object peak;
	
	public obs_volmeter(Object mutex, obs_source source, obs_fader_type type, double cur_db, Object callback_mutex, Object,  obs_peak_meter_type peak_meter_type, int update_ms, Object prev_samples, Object magnitude, Object peak) {
		setMutex(mutex);
		setSource(source);
		setType(type);
		setCur_db(cur_db);
		setCallback_mutex(callback_mutex);
		set();
		setPeak_meter_type(peak_meter_type);
		setUpdate_ms(update_ms);
		setPrev_samples(prev_samples);
		setMagnitude(magnitude);
		setPeak(peak);
	}
	public obs_volmeter() {
	}
	
	public void signal_levels_updated(Object magnitude, Object peak, Object input_peak) {
		Object generatedCallback_mutex = this.getCallback_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedCallback_mutex);
		Object generatedCallbacks = this.getCallbacks();
		for (size_t i = generatedCallbacks.getNum();
		 i > 0; i--) {
			meter_cb cb = generatedCallbacks.getArray()[i - 1];
			.UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.cb.getParam(), magnitude, peak, input_peak);
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedCallback_mutex);
	}
	public void volmeter_process_peak_last_samples(int channel_nr, Double samples, Object nr_samples) {
		Object generatedPrev_samples = this.getPrev_samples();
		switch (/* Take the last 4 samples that need to be used for the next peak
			 * calculation. If there are less than 4 samples in total the new
			 * samples shift out the old samples. */nr_samples) {
		case 2:
				generatedPrev_samples[channel_nr][0] = generatedPrev_samples[channel_nr][2];
				generatedPrev_samples[channel_nr][1] = generatedPrev_samples[channel_nr][3];
				generatedPrev_samples[channel_nr][2] = samples[nr_samples - 2];
				generatedPrev_samples[channel_nr][3] = samples[nr_samples - 1];
				break;
		case 3:
				generatedPrev_samples[channel_nr][0] = generatedPrev_samples[channel_nr][3];
				generatedPrev_samples[channel_nr][1] = samples[nr_samples - 3];
				generatedPrev_samples[channel_nr][2] = samples[nr_samples - 2];
				generatedPrev_samples[channel_nr][3] = samples[nr_samples - 1];
				break;
		case 0:
				break;
		case 1:
				generatedPrev_samples[channel_nr][0] = generatedPrev_samples[channel_nr][1];
				generatedPrev_samples[channel_nr][1] = generatedPrev_samples[channel_nr][2];
				generatedPrev_samples[channel_nr][2] = generatedPrev_samples[channel_nr][3];
				generatedPrev_samples[channel_nr][3] = samples[nr_samples - 1];
				break;
		default:
				generatedPrev_samples[channel_nr][0] = samples[nr_samples - 4];
				generatedPrev_samples[channel_nr][1] = samples[nr_samples - 3];
				generatedPrev_samples[channel_nr][2] = samples[nr_samples - 2];
				generatedPrev_samples[channel_nr][3] = samples[nr_samples - 1];
		}
	}
	public void volmeter_process_peak(Object data, int nr_channels) {
		int nr_samples = data.getFrames();
		int channel_nr = 0;
		Object generatedPeak = this.getPeak();
		Object generatedPrev_samples = this.getPrev_samples();
		obs_peak_meter_type generatedPeak_meter_type = this.getPeak_meter_type();
		for (int plane_nr = 0;
		 channel_nr < nr_channels; plane_nr++) {
			double samples = (double)data.getData()[plane_nr];
			if (!samples) {
				continue;
			} 
			if ((()samples & -1024) > 0) {
				.printf("Audio plane %i is not aligned %p skipping peak volume measurement.\n", plane_nr, samples);
				generatedPeak[channel_nr] = 1.0;
				channel_nr++;
				continue;
			} 
			__m128 previous_samples = ._mm_loadu_ps(generatedPrev_samples[channel_nr]);
			double peak;
			switch (generatedPeak_meter_type) {
			case obs_peak_meter_type.SAMPLE_PEAK_METER:
			case obs_peak_meter_type.TRUE_PEAK_METER:
					peak = ModernizedCProgram.get_true_peak(previous_samples, samples, nr_samples);
					break;
			default:
					peak = ModernizedCProgram.get_sample_peak(previous_samples, samples, nr_samples);
					break;
			}
			volmeter.volmeter_process_peak_last_samples(channel_nr, samples, nr_samples);
			generatedPeak[channel_nr] = peak;
			channel_nr++;
		}
		for (; channel_nr < MAX_AUDIO_CHANNELS; /* Clear the peak of the channels that have not been handled. */channel_nr++) {
			generatedPeak[channel_nr] = 0.0;
		}
	}
	public void volmeter_process_magnitude(Object data, int nr_channels) {
		size_t nr_samples = data.getFrames();
		int channel_nr = 0;
		Object generatedMagnitude = this.getMagnitude();
		for (int plane_nr = 0;
		 channel_nr < nr_channels; plane_nr++) {
			double samples = (double)data.getData()[plane_nr];
			if (!samples) {
				continue;
			} 
			double sum = 0.0;
			for (size_t i = 0;
			 i < nr_samples; i++) {
				double sample = samples[i];
				sum += sample * sample;
			}
			generatedMagnitude[channel_nr] = .sqrtf(sum / nr_samples);
			channel_nr++;
		}
	}
	public void volmeter_process_audio_data(Object data) {
		int nr_channels = ModernizedCProgram.get_nr_channels_from_audio_data(data);
		volmeter.volmeter_process_peak(data, nr_channels);
		volmeter.volmeter_process_magnitude(data, nr_channels);
	}
	public obs_volmeter obs_volmeter_create(obs_fader_type type) {
		obs_volmeter volmeter = ModernizedCProgram.bzalloc();
		if (!volmeter) {
			return ((Object)0);
		} 
		Object generatedMutex = volmeter.getMutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedMutex);
		Object generatedCallback_mutex = volmeter.getCallback_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedCallback_mutex);
		if (ModernizedCProgram.pthread_mutex_init(generatedMutex, ((Object)0)) != 0) {
			;
		} 
		if (ModernizedCProgram.pthread_mutex_init(generatedCallback_mutex, ((Object)0)) != 0) {
			;
		} 
		volmeter.setType(obs_fader_type.type);
		volmeter.obs_volmeter_set_update_interval(50);
		return volmeter;
		return ((Object)0);
	}
	public void obs_volmeter_destroy() {
		if (!volmeter) {
			return ;
		} 
		volmeter.obs_volmeter_detach_source();
		Object generatedCallbacks = this.getCallbacks();
		.da_free(generatedCallbacks);
		Object generatedCallback_mutex = this.getCallback_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedCallback_mutex);
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
		ModernizedCProgram.bfree(volmeter);
	}
	public void obs_volmeter_detach_source() {
		 sh = new ();
		obs_source_t source = new obs_source_t();
		if (!volmeter) {
			return ;
		} 
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		obs_source generatedSource = this.getSource();
		source = generatedSource;
		this.setSource(((Object)0));
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		if (!source) {
			return ;
		} 
		sh = ModernizedCProgram.obs_source_get_signal_handler(source);
		.signal_handler_disconnect(sh, "volume", volmeter_source_volume_changed, volmeter);
		.signal_handler_disconnect(sh, "destroy", volmeter_source_destroyed, volmeter);
		source.obs_source_remove_audio_capture_callback(volmeter_source_data_received, volmeter);
	}
	public void obs_volmeter_set_peak_meter_type(obs_peak_meter_type peak_meter_type) {
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		this.setPeak_meter_type(obs_peak_meter_type.peak_meter_type);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
	}
	public void obs_volmeter_set_update_interval(Object ms) {
		if (!volmeter || !ms) {
			return ;
		} 
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		this.setUpdate_ms(ms);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
	}
	public int obs_volmeter_get_update_interval() {
		if (!volmeter) {
			return 0;
		} 
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		int generatedUpdate_ms = this.getUpdate_ms();
		int interval = generatedUpdate_ms;
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return interval;
	}
	public int obs_volmeter_get_nr_channels() {
		int source_nr_audio_channels;
		int obs_nr_audio_channels;
		obs_source generatedSource = this.getSource();
		resample_info generatedSample_info = generatedSource.getSample_info();
		Object generatedResample_info = generatedSample_info.getResample_info();
		if (generatedSource) {
			source_nr_audio_channels = ModernizedCProgram.get_audio_channels(generatedResample_info);
		} else {
				source_nr_audio_channels = 1;
		} 
		obs_audio_info audio_info = new obs_audio_info();
		speaker_layout generatedSpeakers = audio_info.getSpeakers();
		if (audio_info.obs_get_audio_info()) {
			obs_nr_audio_channels = ModernizedCProgram.get_audio_channels(generatedSpeakers);
		} else {
				obs_nr_audio_channels = 2;
		} 
		return ((source_nr_audio_channels) < 1 ? 1 : ((source_nr_audio_channels) > obs_nr_audio_channels ? obs_nr_audio_channels : (source_nr_audio_channels)));
	}
	public void obs_volmeter_add_callback(Object callback, Object param) {
		meter_cb cb = new meter_cb(callback, param);
		if (!ModernizedCProgram.obs_object_valid(volmeter, "obs_volmeter_add_callback", "volmeter")) {
			return ;
		} 
		Object generatedCallback_mutex = this.getCallback_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedCallback_mutex);
		Object generatedCallbacks = this.getCallbacks();
		.da_push_back(generatedCallbacks, cb);
		ModernizedCProgram.pthread_mutex_unlock(generatedCallback_mutex);
	}
	public void obs_volmeter_remove_callback(Object callback, Object param) {
		meter_cb cb = new meter_cb(callback, param);
		if (!ModernizedCProgram.obs_object_valid(volmeter, "obs_volmeter_remove_callback", "volmeter")) {
			return ;
		} 
		Object generatedCallback_mutex = this.getCallback_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedCallback_mutex);
		Object generatedCallbacks = this.getCallbacks();
		.da_erase_item(generatedCallbacks, cb);
		ModernizedCProgram.pthread_mutex_unlock(generatedCallback_mutex);
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public obs_fader_type getType() {
		return type;
	}
	public void setType(obs_fader_type newType) {
		type = newType;
	}
	public double getCur_db() {
		return cur_db;
	}
	public void setCur_db(double newCur_db) {
		cur_db = newCur_db;
	}
	public Object getCallback_mutex() {
		return callback_mutex;
	}
	public void setCallback_mutex(Object newCallback_mutex) {
		callback_mutex = newCallback_mutex;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public obs_peak_meter_type getPeak_meter_type() {
		return peak_meter_type;
	}
	public void setPeak_meter_type(obs_peak_meter_type newPeak_meter_type) {
		peak_meter_type = newPeak_meter_type;
	}
	public int getUpdate_ms() {
		return update_ms;
	}
	public void setUpdate_ms(int newUpdate_ms) {
		update_ms = newUpdate_ms;
	}
	public Object getPrev_samples() {
		return prev_samples;
	}
	public void setPrev_samples(Object newPrev_samples) {
		prev_samples = newPrev_samples;
	}
	public Object getMagnitude() {
		return magnitude;
	}
	public void setMagnitude(Object newMagnitude) {
		magnitude = newMagnitude;
	}
	public Object getPeak() {
		return peak;
	}
	public void setPeak(Object newPeak) {
		peak = newPeak;
	}
}
