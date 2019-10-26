package application;

/* -------------------------------------------------------- */
/* -------------------------------------------------------- */
/* clang-format off */
/* clang-format on */
/* -------------------------------------------------------- */
public class expander_data {
	private obs_source context;
	private Object envelope_buf;
	private Object envelope_buf_len;
	private double ratio;
	private double threshold;
	private double attack_gain;
	private double release_gain;
	private double output_gain;
	private Object num_channels;
	private Object sample_rate;
	private Object envelope;
	private double slope;
	private int detector;
	private Object runave;
	private Object is_gate;
	private Object runaverage;
	private Object runaverage_len;
	private Object gaindB;
	private Object gaindB_len;
	private Object gaindB_buf;
	private Double env_in;
	private Object env_in_len;
	
	public expander_data(obs_source context, Object envelope_buf, Object envelope_buf_len, double ratio, double threshold, double attack_gain, double release_gain, double output_gain, Object num_channels, Object sample_rate, Object envelope, double slope, int detector, Object runave, Object is_gate, Object runaverage, Object runaverage_len, Object gaindB, Object gaindB_len, Object gaindB_buf, Double env_in, Object env_in_len) {
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
		setDetector(detector);
		setRunave(runave);
		setIs_gate(is_gate);
		setRunaverage(runaverage);
		setRunaverage_len(runaverage_len);
		setGaindB(gaindB);
		setGaindB_len(gaindB_len);
		setGaindB_buf(gaindB_buf);
		setEnv_in(env_in);
		setEnv_in_len(env_in_len);
	}
	public expander_data() {
	}
	
	public void resize_runaverage_buffer(Object len) {
		this.setRunaverage_len(len);
		Object generatedRunaverage = this.getRunaverage();
		Object generatedRunaverage_len = this.getRunaverage_len();
		for (int i = 0;
		 i < MAX_AUDIO_CHANNELS; i++) {
			generatedRunaverage[i] = ModernizedCProgram.brealloc(generatedRunaverage[i], generatedRunaverage_len * );
		}
	}
	public void resize_env_in_buffer(Object len) {
		this.setEnv_in_len(len);
		Double generatedEnv_in = this.getEnv_in();
		Object generatedEnv_in_len = this.getEnv_in_len();
		this.setEnv_in(ModernizedCProgram.brealloc(generatedEnv_in, generatedEnv_in_len * ));
	}
	public void resize_gaindB_buffer(Object len) {
		this.setGaindB_len(len);
		Object generatedGaindB = this.getGaindB();
		Object generatedGaindB_len = this.getGaindB_len();
		for (int i = 0;
		 i < MAX_AUDIO_CHANNELS; i++) {
			generatedGaindB[i] = ModernizedCProgram.brealloc(generatedGaindB[i], generatedGaindB_len * );
		}
	}
	// gain stage and ballistics in dB domain
	public void process_expansion(Double samples, Object num_samples) {
		double generatedAttack_gain = this.getAttack_gain();
		double attack_gain = generatedAttack_gain;
		double generatedRelease_gain = this.getRelease_gain();
		double release_gain = generatedRelease_gain;
		Object generatedGaindB_len = this.getGaindB_len();
		if (generatedGaindB_len < num_samples) {
			cd.resize_gaindB_buffer(num_samples);
		} 
		Object generatedGaindB = this.getGaindB();
		for (int i = 0;
		 i < MAX_AUDIO_CHANNELS; i++) {
			.memset(generatedGaindB[i], 0, num_samples * );
		}
		Object generatedNum_channels = this.getNum_channels();
		Object generatedEnvelope_buf = this.getEnvelope_buf();
		double generatedThreshold = this.getThreshold();
		double generatedSlope = this.getSlope();
		Object generatedGaindB_buf = this.getGaindB_buf();
		double generatedOutput_gain = this.getOutput_gain();
		for ( chan = 0;
		 chan < generatedNum_channels; chan++) {
			for ( i = 0;
			 i < num_samples; ++i) {
				double env_db = ModernizedCProgram.mul_to_db(generatedEnvelope_buf[chan][i]);
				double gain = generatedThreshold - env_db > 0.0 ? .fmaxf(generatedSlope * (generatedThreshold - env_db), -60.0) : 0.0;
				if (i > 0) {
					if (gain > generatedGaindB[chan][i - 1]) {
						generatedGaindB[chan][i] = attack_gain * generatedGaindB[chan][i - 1] + (1.0 - attack_gain) * gain;
					} else {
							generatedGaindB[chan][i] = release_gain * generatedGaindB[chan][i - 1] + (1.0 - release_gain) * gain;
					} 
				} else {
						if (gain > generatedGaindB_buf[chan]) {
							generatedGaindB[chan][i] = attack_gain * generatedGaindB_buf[chan] + (1.0 - attack_gain) * gain;
						} else {
								generatedGaindB[chan][i] = release_gain * generatedGaindB_buf[chan] + (1.0 - release_gain) * gain;
						} 
				} 
				gain = ModernizedCProgram.db_to_mul(.fminf(0, generatedGaindB[chan][i]));
				if (samples[chan]) {
					samples[chan][i] *= gain * generatedOutput_gain;
				} 
			}
			generatedGaindB_buf[chan] = generatedGaindB[chan][num_samples - 1];
		}
	}
	public obs_source getContext() {
		return context;
	}
	public void setContext(obs_source newContext) {
		context = newContext;
	}
	public Object getEnvelope_buf() {
		return envelope_buf;
	}
	public void setEnvelope_buf(Object newEnvelope_buf) {
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
	public Object getEnvelope() {
		return envelope;
	}
	public void setEnvelope(Object newEnvelope) {
		envelope = newEnvelope;
	}
	public double getSlope() {
		return slope;
	}
	public void setSlope(double newSlope) {
		slope = newSlope;
	}
	public int getDetector() {
		return detector;
	}
	public void setDetector(int newDetector) {
		detector = newDetector;
	}
	public Object getRunave() {
		return runave;
	}
	public void setRunave(Object newRunave) {
		runave = newRunave;
	}
	public Object getIs_gate() {
		return is_gate;
	}
	public void setIs_gate(Object newIs_gate) {
		is_gate = newIs_gate;
	}
	public Object getRunaverage() {
		return runaverage;
	}
	public void setRunaverage(Object newRunaverage) {
		runaverage = newRunaverage;
	}
	public Object getRunaverage_len() {
		return runaverage_len;
	}
	public void setRunaverage_len(Object newRunaverage_len) {
		runaverage_len = newRunaverage_len;
	}
	public Object getGaindB() {
		return gaindB;
	}
	public void setGaindB(Object newGaindB) {
		gaindB = newGaindB;
	}
	public Object getGaindB_len() {
		return gaindB_len;
	}
	public void setGaindB_len(Object newGaindB_len) {
		gaindB_len = newGaindB_len;
	}
	public Object getGaindB_buf() {
		return gaindB_buf;
	}
	public void setGaindB_buf(Object newGaindB_buf) {
		gaindB_buf = newGaindB_buf;
	}
	public Double getEnv_in() {
		return env_in;
	}
	public void setEnv_in(Double newEnv_in) {
		env_in = newEnv_in;
	}
	public Object getEnv_in_len() {
		return env_in_len;
	}
	public void setEnv_in_len(Object newEnv_in_len) {
		env_in_len = newEnv_in_len;
	}
}
