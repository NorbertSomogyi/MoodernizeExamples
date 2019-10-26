package application;

/* -------------------------------------------------------- */
/* -------------------------------------------------------- */
/* clang-format off */
/* clang-format on */
/* -------------------------------------------------------- */
public class compressor_data {
	private obs_source context;
	private Double envelope_buf;
	private Object envelope_buf_len;
	private double ratio;
	private double threshold;
	private double attack_gain;
	private double release_gain;
	private double output_gain;
	private Object num_channels;
	private Object sample_rate;
	private double envelope;
	private double slope;
	private Object sidechain_update_mutex;
	private Object sidechain_check_time;
	private obs_weak_source weak_sidechain;
	private Byte sidechain_name;
	private Object sidechain_mutex;
	private Object sidechain_data;
	private Object sidechain_buf;
	private Object max_sidechain_frames;
	
	public compressor_data(obs_source context, Double envelope_buf, Object envelope_buf_len, double ratio, double threshold, double attack_gain, double release_gain, double output_gain, Object num_channels, Object sample_rate, double envelope, double slope, Object sidechain_update_mutex, Object sidechain_check_time, obs_weak_source weak_sidechain, Byte sidechain_name, Object sidechain_mutex, Object sidechain_data, Object sidechain_buf, Object max_sidechain_frames) {
		setContext(context);
		setEnvelope_buf(envelope_buf);
		setEnvelope_buf_len(envelope_buf_len);
		setRatio(ratio);
		setThreshold(threshold);
		setAttack_gain(attack_gain);
		setRelease_gain(release_gain);
		setOutput_gain(output_gain);
		setNum_channels(num_channels);
		setSample_rate(sample_rate);
		setEnvelope(envelope);
		setSlope(slope);
		setSidechain_update_mutex(sidechain_update_mutex);
		setSidechain_check_time(sidechain_check_time);
		setWeak_sidechain(weak_sidechain);
		setSidechain_name(sidechain_name);
		setSidechain_mutex(sidechain_mutex);
		setSidechain_data(sidechain_data);
		setSidechain_buf(sidechain_buf);
		setMax_sidechain_frames(max_sidechain_frames);
	}
	public compressor_data() {
	}
	
	public void get_sidechain_data(Object num_samples) {
		Object generatedEnvelope_buf_len = this.getEnvelope_buf_len();
		 data_size = generatedEnvelope_buf_len * ;
		if (!data_size) {
			return ;
		} 
		Object generatedSidechain_mutex = this.getSidechain_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedSidechain_mutex);
		Object generatedMax_sidechain_frames = this.getMax_sidechain_frames();
		if (generatedMax_sidechain_frames < num_samples) {
			this.setMax_sidechain_frames(num_samples);
		} 
		Object generatedSidechain_data = this.getSidechain_data();
		if (generatedSidechain_data[0].getCirclebuf() < data_size) {
			ModernizedCProgram.pthread_mutex_unlock(generatedSidechain_mutex);
			;
		} 
		Object generatedNum_channels = this.getNum_channels();
		Object generatedSidechain_buf = this.getSidechain_buf();
		for ( i = 0;
		 i < generatedNum_channels; i++) {
			generatedSidechain_data[i].circlebuf_pop_front(generatedSidechain_buf[i], data_size);
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedSidechain_mutex);
		return ;
	}
	public void resize_env_buffer(Object len) {
		this.setEnvelope_buf_len(len);
		Double generatedEnvelope_buf = this.getEnvelope_buf();
		this.setEnvelope_buf(ModernizedCProgram.brealloc(generatedEnvelope_buf, len * ));
		Object generatedNum_channels = this.getNum_channels();
		Object generatedSidechain_buf = this.getSidechain_buf();
		for ( i = 0;
		 i < generatedNum_channels; i++) {
			generatedSidechain_buf[i] = ModernizedCProgram.brealloc(generatedSidechain_buf[i], len * );
		}
		this.setEnvelope_buf_len(len);
		Double generatedEnvelope_buf = this.getEnvelope_buf();
		this.setEnvelope_buf(ModernizedCProgram.brealloc(generatedEnvelope_buf, len * ));
		this.setEnvelope_buf_len(len);
		Object generatedEnvelope_buf = this.getEnvelope_buf();
		Object generatedEnvelope_buf_len = this.getEnvelope_buf_len();
		for (int i = 0;
		 i < MAX_AUDIO_CHANNELS; i++) {
			generatedEnvelope_buf[i] = ModernizedCProgram.brealloc(generatedEnvelope_buf[i], generatedEnvelope_buf_len * );
		}
	}
	public void analyze_envelope(Double samples, Object num_samples) {
		Object generatedEnvelope_buf_len = this.getEnvelope_buf_len();
		if (generatedEnvelope_buf_len < num_samples) {
			cd.resize_env_buffer(num_samples);
		} 
		double generatedAttack_gain = this.getAttack_gain();
		double attack_gain = generatedAttack_gain;
		double generatedRelease_gain = this.getRelease_gain();
		double release_gain = generatedRelease_gain;
		Double generatedEnvelope_buf = this.getEnvelope_buf();
		.memset(generatedEnvelope_buf, 0, num_samples * );
		Object generatedNum_channels = this.getNum_channels();
		double generatedEnvelope = this.getEnvelope();
		for ( chan = 0;
		 chan < generatedNum_channels; ++chan) {
			if (!samples[chan]) {
				continue;
			} 
			double envelope_buf = generatedEnvelope_buf;
			double env = generatedEnvelope;
			for (uint32_t i = 0;
			 i < num_samples; ++i) {
				double env_in = .fabsf(samples[chan][i]);
				if (env < env_in) {
					env = env_in + attack_gain * (env - env_in);
				} else {
						env = env_in + release_gain * (env - env_in);
				} 
				envelope_buf[i] = .fmaxf(envelope_buf[i], env);
			}
		}
		this.setEnvelope(generatedEnvelope_buf[num_samples - 1]);
		Object generatedEnvelope_buf_len = this.getEnvelope_buf_len();
		if (generatedEnvelope_buf_len < num_samples) {
			cd.resize_env_buffer(num_samples);
		} 
		double generatedAttack_gain = this.getAttack_gain();
		double attack_gain = generatedAttack_gain;
		double generatedRelease_gain = this.getRelease_gain();
		double release_gain = generatedRelease_gain;
		Double generatedEnvelope_buf = this.getEnvelope_buf();
		.memset(generatedEnvelope_buf, 0, num_samples * );
		Object generatedNum_channels = this.getNum_channels();
		double generatedEnvelope = this.getEnvelope();
		for ( chan = 0;
		 chan < generatedNum_channels; ++chan) {
			if (!samples[chan]) {
				continue;
			} 
			double envelope_buf = generatedEnvelope_buf;
			double env = generatedEnvelope;
			for (uint32_t i = 0;
			 i < num_samples; ++i) {
				double env_in = .fabsf(samples[chan][i]);
				if (env < env_in) {
					env = env_in + attack_gain * (env - env_in);
				} else {
						env = env_in + release_gain * (env - env_in);
				} 
				envelope_buf[i] = .fmaxf(envelope_buf[i], env);
			}
		}
		this.setEnvelope(generatedEnvelope_buf[num_samples - 1]);
		Object generatedEnvelope_buf_len = this.getEnvelope_buf_len();
		if (generatedEnvelope_buf_len < num_samples) {
			cd.resize_env_buffer(num_samples);
		} 
		Object generatedRunaverage_len = this.getRunaverage_len();
		if (generatedRunaverage_len < num_samples) {
			cd.resize_runaverage_buffer(num_samples);
		} 
		Object generatedEnv_in_len = this.getEnv_in_len();
		if (generatedEnv_in_len < num_samples) {
			cd.resize_env_in_buffer(num_samples);
		} 
		Object generatedSample_rate = this.getSample_rate();
		// 10 ms RMS windowdouble rmscoef = .exp2f(-100.0 / generatedSample_rate);
		Object generatedEnvelope_buf = this.getEnvelope_buf();
		Object generatedRunaverage = this.getRunaverage();
		for (int i = 0;
		 i < MAX_AUDIO_CHANNELS; i++) {
			.memset(generatedEnvelope_buf[i], 0, num_samples * );
			.memset(generatedRunaverage[i], 0, num_samples * );
		}
		Double generatedEnv_in = this.getEnv_in();
		.memset(generatedEnv_in, 0, num_samples * );
		Object generatedNum_channels = this.getNum_channels();
		int generatedDetector = this.getDetector();
		Object generatedRunave = this.getRunave();
		Object generatedEnvelope = this.getEnvelope();
		for ( chan = 0;
		 chan < generatedNum_channels; ++chan) {
			if (!samples[chan]) {
				continue;
			} 
			double envelope_buf = generatedEnvelope_buf[chan];
			double runave = generatedRunaverage[chan];
			double env_in = generatedEnv_in;
			if (generatedDetector == .RMS_DETECT) {
				runave[0] = rmscoef * generatedRunave[chan] + (1 - rmscoef) * .powf(samples[chan][0], 2.0);
				env_in[0] = .sqrtf(.fmaxf(runave[0], 0));
				for (uint32_t i = 1;
				 i < num_samples; ++i) {
					runave[i] = rmscoef * runave[i - 1] + (1 - rmscoef) * .powf(samples[chan][i], 2.0);
					env_in[i] = .sqrtf(runave[i]);
				}
			}  else if (generatedDetector == .PEAK_DETECT) {
				for (uint32_t i = 0;
				 i < num_samples; ++i) {
					runave[i] = .powf(samples[chan][i], 2);
					env_in[i] = .fabsf(samples[chan][i]);
				}
			} 
			generatedRunave[chan] = runave[num_samples - 1];
			for (uint32_t i = 0;
			 i < num_samples; ++i) {
				envelope_buf[i] = .fmaxf(envelope_buf[i], env_in[i]);
			}
			generatedEnvelope[chan] = generatedEnvelope_buf[chan][num_samples - 1];
		}
	}
	public void analyze_sidechain(Object num_samples) {
		Object generatedEnvelope_buf_len = this.getEnvelope_buf_len();
		if (generatedEnvelope_buf_len < num_samples) {
			cd.resize_env_buffer(num_samples);
		} 
		cd.get_sidechain_data(num_samples);
		double generatedAttack_gain = this.getAttack_gain();
		double attack_gain = generatedAttack_gain;
		double generatedRelease_gain = this.getRelease_gain();
		double release_gain = generatedRelease_gain;
		Object generatedSidechain_buf = this.getSidechain_buf();
		double sidechain_buf = generatedSidechain_buf;
		Double generatedEnvelope_buf = this.getEnvelope_buf();
		.memset(generatedEnvelope_buf, 0, num_samples * );
		Object generatedNum_channels = this.getNum_channels();
		double generatedEnvelope = this.getEnvelope();
		for ( chan = 0;
		 chan < generatedNum_channels; ++chan) {
			if (!sidechain_buf[chan]) {
				continue;
			} 
			double envelope_buf = generatedEnvelope_buf;
			double env = generatedEnvelope;
			for (uint32_t i = 0;
			 i < num_samples; ++i) {
				double env_in = .fabsf(sidechain_buf[chan][i]);
				if (env < env_in) {
					env = env_in + attack_gain * (env - env_in);
				} else {
						env = env_in + release_gain * (env - env_in);
				} 
				envelope_buf[i] = .fmaxf(envelope_buf[i], env);
			}
		}
		this.setEnvelope(generatedEnvelope_buf[num_samples - 1]);
	}
	public obs_source getContext() {
		return context;
	}
	public void setContext(obs_source newContext) {
		context = newContext;
	}
	public Double getEnvelope_buf() {
		return envelope_buf;
	}
	public void setEnvelope_buf(Double newEnvelope_buf) {
		envelope_buf = newEnvelope_buf;
	}
	public Object getEnvelope_buf_len() {
		return envelope_buf_len;
	}
	public void setEnvelope_buf_len(Object newEnvelope_buf_len) {
		envelope_buf_len = newEnvelope_buf_len;
	}
	public double getRatio() {
		return ratio;
	}
	public void setRatio(double newRatio) {
		ratio = newRatio;
	}
	public double getThreshold() {
		return threshold;
	}
	public void setThreshold(double newThreshold) {
		threshold = newThreshold;
	}
	public double getAttack_gain() {
		return attack_gain;
	}
	public void setAttack_gain(double newAttack_gain) {
		attack_gain = newAttack_gain;
	}
	public double getRelease_gain() {
		return release_gain;
	}
	public void setRelease_gain(double newRelease_gain) {
		release_gain = newRelease_gain;
	}
	public double getOutput_gain() {
		return output_gain;
	}
	public void setOutput_gain(double newOutput_gain) {
		output_gain = newOutput_gain;
	}
	public Object getNum_channels() {
		return num_channels;
	}
	public void setNum_channels(Object newNum_channels) {
		num_channels = newNum_channels;
	}
	public Object getSample_rate() {
		return sample_rate;
	}
	public void setSample_rate(Object newSample_rate) {
		sample_rate = newSample_rate;
	}
	public double getEnvelope() {
		return envelope;
	}
	public void setEnvelope(double newEnvelope) {
		envelope = newEnvelope;
	}
	public double getSlope() {
		return slope;
	}
	public void setSlope(double newSlope) {
		slope = newSlope;
	}
	public Object getSidechain_update_mutex() {
		return sidechain_update_mutex;
	}
	public void setSidechain_update_mutex(Object newSidechain_update_mutex) {
		sidechain_update_mutex = newSidechain_update_mutex;
	}
	public Object getSidechain_check_time() {
		return sidechain_check_time;
	}
	public void setSidechain_check_time(Object newSidechain_check_time) {
		sidechain_check_time = newSidechain_check_time;
	}
	public obs_weak_source getWeak_sidechain() {
		return weak_sidechain;
	}
	public void setWeak_sidechain(obs_weak_source newWeak_sidechain) {
		weak_sidechain = newWeak_sidechain;
	}
	public Byte getSidechain_name() {
		return sidechain_name;
	}
	public void setSidechain_name(Byte newSidechain_name) {
		sidechain_name = newSidechain_name;
	}
	public Object getSidechain_mutex() {
		return sidechain_mutex;
	}
	public void setSidechain_mutex(Object newSidechain_mutex) {
		sidechain_mutex = newSidechain_mutex;
	}
	public Object getSidechain_data() {
		return sidechain_data;
	}
	public void setSidechain_data(Object newSidechain_data) {
		sidechain_data = newSidechain_data;
	}
	public Object getSidechain_buf() {
		return sidechain_buf;
	}
	public void setSidechain_buf(Object newSidechain_buf) {
		sidechain_buf = newSidechain_buf;
	}
	public Object getMax_sidechain_frames() {
		return max_sidechain_frames;
	}
	public void setMax_sidechain_frames(Object newMax_sidechain_frames) {
		max_sidechain_frames = newMax_sidechain_frames;
	}
}
