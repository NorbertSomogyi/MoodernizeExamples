package application;

public class video_data {
	private Object data;
	private Object linesize;
	private Object timestamp;
	
	public video_data(Object data, Object linesize, Object timestamp) {
		setData(data);
		setLinesize(linesize);
		setTimestamp(timestamp);
	}
	public video_data() {
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getLinesize() {
		return linesize;
	}
	public void setLinesize(Object newLinesize) {
		linesize = newLinesize;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
}
