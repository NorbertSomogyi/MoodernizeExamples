package application;

/* -------------------------------------------------------- */
/* -------------------------------------------------------- */
/* clang-format off */
/* clang-format on */
/* -------------------------------------------------------- */
public class limiter_data {
	private obs_source context;
	private Double envelope_buf;
	private Object envelope_buf_len;
	private double threshold;
	private double attack_gain;
	private double release_gain;
	private double output_gain;
	private Object num_channels;
	private Object sample_rate;
	private double envelope;
	private double slope;
	
	public limiter_data(obs_source context, Double envelope_buf, Object envelope_buf_len, double threshold, double attack_gain, double release_gain, double output_gain, Object num_channels, Object sample_rate, double envelope, double slope) {
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
