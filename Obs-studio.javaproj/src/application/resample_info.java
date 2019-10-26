package application;

public class resample_info {
	private Object samples_per_sec;
	private audio_format format;
	private speaker_layout speakers;
	
	public resample_info(Object samples_per_sec, audio_format format, speaker_layout speakers) {
		setSamples_per_sec(samples_per_sec);
		setFormat(format);
		setSpeakers(speakers);
	}
	public resample_info() {
	}
	
	public Object getSamples_per_sec() {
		return samples_per_sec;
	}
	public void setSamples_per_sec(Object newSamples_per_sec) {
		samples_per_sec = newSamples_per_sec;
	}
	public audio_format getFormat() {
		return format;
	}
	public void setFormat(audio_format newFormat) {
		format = newFormat;
	}
	public speaker_layout getSpeakers() {
		return speakers;
	}
	public void setSpeakers(speaker_layout newSpeakers) {
		speakers = newSpeakers;
	}
}
