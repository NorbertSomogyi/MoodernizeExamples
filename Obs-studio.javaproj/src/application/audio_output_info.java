package application;

public class audio_output_info {
	private Object name;
	private Object samples_per_sec;
	private audio_format format;
	private speaker_layout speakers;
	private Object input_callback;
	private Object input_param;
	
	public audio_output_info(Object name, Object samples_per_sec, audio_format format, speaker_layout speakers, Object input_callback, Object input_param) {
		setName(name);
		setSamples_per_sec(samples_per_sec);
		setFormat(format);
		setSpeakers(speakers);
		setInput_callback(input_callback);
		setInput_param(input_param);
	}
	public audio_output_info() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
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
	public Object getInput_callback() {
		return input_callback;
	}
	public void setInput_callback(Object newInput_callback) {
		input_callback = newInput_callback;
	}
	public Object getInput_param() {
		return input_param;
	}
	public void setInput_param(Object newInput_param) {
		input_param = newInput_param;
	}
}
