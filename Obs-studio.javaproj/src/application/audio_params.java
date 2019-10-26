package application;

public class audio_params {
	private Byte name;
	private int abitrate;
	private int sample_rate;
	private int channels;
	
	public audio_params(Byte name, int abitrate, int sample_rate, int channels) {
		setName(name);
		setAbitrate(abitrate);
		setSample_rate(sample_rate);
		setChannels(channels);
	}
	public audio_params() {
	}
	
	public boolean get_audio_params(Integer argc, Byte argv) {
		Byte generatedName = this.getName();
		if (!ModernizedCProgram.get_opt_str(argc, argv, generatedName, "audio track name")) {
			return 0;
		} 
		int generatedAbitrate = this.getAbitrate();
		if (!ModernizedCProgram.get_opt_int(argc, argv, generatedAbitrate, "audio bitrate")) {
			return 0;
		} 
		int generatedSample_rate = this.getSample_rate();
		if (!ModernizedCProgram.get_opt_int(argc, argv, generatedSample_rate, "audio sample rate")) {
			return 0;
		} 
		int generatedChannels = this.getChannels();
		if (!ModernizedCProgram.get_opt_int(argc, argv, generatedChannels, "audio channels")) {
			return 0;
		} 
		return 1;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public int getAbitrate() {
		return abitrate;
	}
	public void setAbitrate(int newAbitrate) {
		abitrate = newAbitrate;
	}
	public int getSample_rate() {
		return sample_rate;
	}
	public void setSample_rate(int newSample_rate) {
		sample_rate = newSample_rate;
	}
	public int getChannels() {
		return channels;
	}
	public void setChannels(int newChannels) {
		channels = newChannels;
	}
}
