package application;

public class audio_output_data {
	private Object data;
	
	public audio_output_data(Object data) {
		setData(data);
	}
	public audio_output_data() {
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
