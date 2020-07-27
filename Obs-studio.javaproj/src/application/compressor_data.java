package application;

/* -------------------------------------------------------- */
/* -------------------------------------------------------- */
/* clang-format off */
/* clang-format on */
/* -------------------------------------------------------- */
public class compressor_data {
	private obs_source context;
	private double[] envelope_buf;
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
	
	public compressor_data(obs_source context, double[] envelope_buf, Object envelope_buf_len, double ratio, double threshold, double attack_gain, double release_gain, double output_gain, Object num_channels, Object sample_rate, double envelope, double slope, Object sidechain_update_mutex, Object sidechain_check_time, obs_weak_source weak_sidechain, Byte sidechain_name, Object sidechain_mutex, Object sidechain_data, Object sidechain_buf, Object max_sidechain_frames) {
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
		 data_size = generatedEnvelope_buf_len * /*Error: Unsupported expression*/;
		if (!data_size) {
			return /*Error: Unsupported expression*/;
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
		return /*Error: Unsupported expression*/;
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
		double[] generatedEnvelope_buf = this.getEnvelope_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedEnvelope_buf, 0, num_samples * /*Error: sizeof expression not supported yet*/);
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
				double env_in = /*Error: Function owner not recognized*/fabsf(sidechain_buf[chan][i]);
				if (env < env_in) {
					env = env_in + attack_gain * (env - env_in);
				} else {
						env = env_in + release_gain * (env - env_in);
				} 
				envelope_buf[i] = /*Error: Function owner not recognized*/fmaxf(envelope_buf[i], env);
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
