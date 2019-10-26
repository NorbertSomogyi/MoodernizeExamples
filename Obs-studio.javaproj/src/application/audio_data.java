package application;

public class audio_data {
	private Object data;
	private Object frames;
	private Object timestamp;
	
	public audio_data(Object data, Object frames, Object timestamp) {
		setData(data);
		setFrames(frames);
		setTimestamp(timestamp);
	}
	public audio_data() {
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
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
}
