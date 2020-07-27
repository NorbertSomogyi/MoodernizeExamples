package application;

/* -------------------------------------------------------- */
/* -------------------------------------------------------- */
/* clang-format off */
/* clang-format on */
/* -------------------------------------------------------- */
public class limiter_data {
	private obs_source context;
	private double[] envelope_buf;
	private Object envelope_buf_len;
	private double threshold;
	private double attack_gain;
	private double release_gain;
	private double output_gain;
	private Object num_channels;
	private Object sample_rate;
	private double envelope;
	private double slope;
	
	public limiter_data(obs_source context, double[] envelope_buf, Object envelope_buf_len, double threshold, double attack_gain, double release_gain, double output_gain, Object num_channels, Object sample_rate, double envelope, double slope) {
		setContext(context);
		setEnvelope_buf(envelope_buf);
		setEnvelope_buf_len(envelope_buf_len);
		setThreshold(threshold);
		setAttack_gain(attack_gain);
		setRelease_gain(release_gain);
		setOutput_gain(output_gain);
		setNum_channels(num_channels);
		setSample_rate(sample_rate);
		setEnvelope(envelope);
		setSlope(slope);
	}
	public limiter_data() {
	}
	
	/* -------------------------------------------------------- */
	public void resize_env_buffer(Object len) {
		this.setEnvelope_buf_len(len);
		double[] generatedEnvelope_buf = this.getEnvelope_buf();
		this.setEnvelope_buf(ModernizedCProgram.brealloc(generatedEnvelope_buf, len * /*Error: Unsupported expression*/));
		this.setEnvelope_buf_len(len);
		double[] generatedEnvelope_buf = this.getEnvelope_buf();
		this.setEnvelope_buf(ModernizedCProgram.brealloc(generatedEnvelope_buf, len * /*Error: Unsupported expression*/));
		Object generatedNum_channels = this.getNum_channels();
		Object generatedSidechain_buf = this.getSidechain_buf();
		for ( i = 0;
		 i < generatedNum_channels; i++) {
			generatedSidechain_buf[i] = ModernizedCProgram.brealloc(generatedSidechain_buf[i], len * /*Error: Unsupported expression*/);
		}
		this.setEnvelope_buf_len(len);
		Object generatedEnvelope_buf = this.getEnvelope_buf();
		Object generatedEnvelope_buf_len = this.getEnvelope_buf_len();
		for (int i = 0;
		 i < MAX_AUDIO_CHANNELS; i++) {
			generatedEnvelope_buf[i] = ModernizedCProgram.brealloc(generatedEnvelope_buf[i], generatedEnvelope_buf_len * /*Error: Unsupported expression*/);
		}
	}
	public void analyze_envelope(double[][] samples, Object num_samples) {
		Object generatedEnvelope_buf_len = this.getEnvelope_buf_len();
		if (generatedEnvelope_buf_len < num_samples) {
			cd.resize_env_buffer(num_samples);
		} 
		double generatedAttack_gain = this.getAttack_gain();
		double attack_gain = generatedAttack_gain;
		double generatedRelease_gain = this.getRelease_gain();
		double release_gain = generatedRelease_gain;
		double[] generatedEnvelope_buf = this.getEnvelope_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedEnvelope_buf, 0, num_samples * /*Error: sizeof expression not supported yet*/);
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
				double env_in = /*Error: Function owner not recognized*/fabsf(samples[chan][i]);
				if (env < env_in) {
					env = env_in + attack_gain * (env - env_in);
				} else {
						env = env_in + release_gain * (env - env_in);
				} 
				envelope_buf[i] = /*Error: Function owner not recognized*/fmaxf(envelope_buf[i], env);
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
		double[] generatedEnvelope_buf = this.getEnvelope_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedEnvelope_buf, 0, num_samples * /*Error: sizeof expression not supported yet*/);
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
				double env_in = /*Error: Function owner not recognized*/fabsf(samples[chan][i]);
				if (env < env_in) {
					env = env_in + attack_gain * (env - env_in);
				} else {
						env = env_in + release_gain * (env - env_in);
				} 
				envelope_buf[i] = /*Error: Function owner not recognized*/fmaxf(envelope_buf[i], env);
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
		// 10 ms RMS windowdouble rmscoef = /*Error: Function owner not recognized*/exp2f(-100.0 / generatedSample_rate);
		Object generatedEnvelope_buf = this.getEnvelope_buf();
		Object generatedRunaverage = this.getRunaverage();
		for (int i = 0;
		 i < MAX_AUDIO_CHANNELS; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedEnvelope_buf[i], 0, num_samples * /*Error: sizeof expression not supported yet*/);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedRunaverage[i], 0, num_samples * /*Error: sizeof expression not supported yet*/);
		}
		double[] generatedEnv_in = this.getEnv_in();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedEnv_in, 0, num_samples * /*Error: sizeof expression not supported yet*/);
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
				runave[0] = rmscoef * generatedRunave[chan] + (1 - rmscoef) * /*Error: Function owner not recognized*/powf(samples[chan][0], 2.0);
				env_in[0] = /*Error: Function owner not recognized*/sqrtf(/*Error: Function owner not recognized*/fmaxf(runave[0], 0));
				for (uint32_t i = 1;
				 i < num_samples; ++i) {
					runave[i] = rmscoef * runave[i - 1] + (1 - rmscoef) * /*Error: Function owner not recognized*/powf(samples[chan][i], 2.0);
					env_in[i] = /*Error: Function owner not recognized*/sqrtf(runave[i]);
				}
			}  else if (generatedDetector == .PEAK_DETECT) {
				for (uint32_t i = 0;
				 i < num_samples; ++i) {
					runave[i] = /*Error: Function owner not recognized*/powf(samples[chan][i], 2);
					env_in[i] = /*Error: Function owner not recognized*/fabsf(samples[chan][i]);
				}
			} 
			generatedRunave[chan] = runave[num_samples - 1];
			for (uint32_t i = 0;
			 i < num_samples; ++i) {
				envelope_buf[i] = /*Error: Function owner not recognized*/fmaxf(envelope_buf[i], env_in[i]);
			}
			generatedEnvelope[chan] = generatedEnvelope_buf[chan][num_samples - 1];
		}
	}
	public obs_source getContext() {
		return context;
	}
	public void setContext(obs_source newContext) {
		context = newContext;
	}
	public double[] getEnvelope_buf() {
		return envelope_buf;
	}
	public void setEnvelope_buf(double[] newEnvelope_buf) {
		envelope_buf = newEnvelope_buf;
	}
	public Object getEnvelope_buf_len() {
		return envelope_buf_len;
	}
	public void setEnvelope_buf_len(Object newEnvelope_buf_len) {
		envelope_buf_len = newEnvelope_buf_len;
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
}
