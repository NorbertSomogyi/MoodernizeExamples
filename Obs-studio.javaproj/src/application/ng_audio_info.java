package application;

public class ng_audio_info {
	private Object frames;
	private Object timestamp;
	
	public ng_audio_info(Object frames, Object timestamp) {
		setFrames(frames);
		setTimestamp(timestamp);
	}
	public ng_audio_info() {
	}
	
	public Object getFrames() {
		return frames;
	}
	public void setFrames(Object newFrames) {
		frames = newFrames;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
}
