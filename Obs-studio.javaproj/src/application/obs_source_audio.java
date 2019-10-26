package application;

public class obs_source_audio {
	private Object data;
	private Object frames;
	private speaker_layout speakers;
	private audio_format format;
	private Object samples_per_sec;
	private Object timestamp;
	
	public obs_source_audio(Object data, Object frames, speaker_layout speakers, audio_format format, Object samples_per_sec, Object timestamp) {
		setData(data);
		setFrames(frames);
		setSpeakers(speakers);
		setFormat(format);
		setSamples_per_sec(samples_per_sec);
		setTimestamp(timestamp);
	}
	public obs_source_audio() {
	}
	
	public void get_audio(Object opaque) {
		ffmpeg_source s = opaque;
		obs_source generatedSource = s.getSource();
		generatedSource.obs_source_output_audio(a);
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getFrames() {
		return frames;
	}
	public void setFrames(Object newFrames) {
		frames = newFrames;
	}
	public speaker_layout getSpeakers() {
		return speakers;
	}
	public void setSpeakers(speaker_layout newSpeakers) {
		speakers = newSpeakers;
	}
	public audio_format getFormat() {
		return format;
	}
	public void setFormat(audio_format newFormat) {
		format = newFormat;
	}
	public Object getSamples_per_sec() {
		return samples_per_sec;
	}
	public void setSamples_per_sec(Object newSamples_per_sec) {
		samples_per_sec = newSamples_per_sec;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
}
