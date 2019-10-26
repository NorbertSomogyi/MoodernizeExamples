package application;

/* clang-format off */
/* clang-format on */
public class noise_gate_data {
	private obs_source context;
	private double sample_rate_i;
	private Object channels;
	private double open_threshold;
	private double close_threshold;
	private double decay_rate;
	private double attack_rate;
	private double release_rate;
	private double hold_time;
	private Object is_open;
	private double attenuation;
	private double level;
	private double held_time;
	
	public noise_gate_data(obs_source context, double sample_rate_i, Object channels, double open_threshold, double close_threshold, double decay_rate, double attack_rate, double release_rate, double hold_time, Object is_open, double attenuation, double level, double held_time) {
		setContext(context);
		setSample_rate_i(sample_rate_i);
		setChannels(channels);
		setOpen_threshold(open_threshold);
		setClose_threshold(close_threshold);
		setDecay_rate(decay_rate);
		setAttack_rate(attack_rate);
		setRelease_rate(release_rate);
		setHold_time(hold_time);
		setIs_open(is_open);
		setAttenuation(attenuation);
		setLevel(level);
		setHeld_time(held_time);
	}
	public noise_gate_data() {
	}
	
	public obs_source getContext() {
		return context;
	}
	public void setContext(obs_source newContext) {
		context = newContext;
	}
	public double getSample_rate_i() {
		return sample_rate_i;
	}
	public void setSample_rate_i(double newSample_rate_i) {
		sample_rate_i = newSample_rate_i;
	}
	public Object getChannels() {
		return channels;
	}
	public void setChannels(Object newChannels) {
		channels = newChannels;
	}
	public double getOpen_threshold() {
		return open_threshold;
	}
	public void setOpen_threshold(double newOpen_threshold) {
		open_threshold = newOpen_threshold;
	}
	public double getClose_threshold() {
		return close_threshold;
	}
	public void setClose_threshold(double newClose_threshold) {
		close_threshold = newClose_threshold;
	}
	public double getDecay_rate() {
		return decay_rate;
	}
	public void setDecay_rate(double newDecay_rate) {
		decay_rate = newDecay_rate;
	}
	public double getAttack_rate() {
		return attack_rate;
	}
	public void setAttack_rate(double newAttack_rate) {
		attack_rate = newAttack_rate;
	}
	public double getRelease_rate() {
		return release_rate;
	}
	public void setRelease_rate(double newRelease_rate) {
		release_rate = newRelease_rate;
	}
	public double getHold_time() {
		return hold_time;
	}
	public void setHold_time(double newHold_time) {
		hold_time = newHold_time;
	}
	public Object getIs_open() {
		return is_open;
	}
	public void setIs_open(Object newIs_open) {
		is_open = newIs_open;
	}
	public double getAttenuation() {
		return attenuation;
	}
	public void setAttenuation(double newAttenuation) {
		attenuation = newAttenuation;
	}
	public double getLevel() {
		return level;
	}
	public void setLevel(double newLevel) {
		level = newLevel;
	}
	public double getHeld_time() {
		return held_time;
	}
	public void setHeld_time(double newHeld_time) {
		held_time = newHeld_time;
	}
}
