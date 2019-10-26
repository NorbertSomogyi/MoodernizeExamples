package application;

public class video_input {
	private video_scale_info conversion;
	private video_scaler scaler;
	private Object frame;
	private int cur_frame;
	private Object callback;
	private Object param;
	
	public video_input(video_scale_info conversion, video_scaler scaler, Object frame, int cur_frame, Object callback, Object param) {
		setConversion(conversion);
		setScaler(scaler);
		setFrame(frame);
		setCur_frame(cur_frame);
		setCallback(callback);
		setParam(param);
	}
	public video_input() {
	}
	
	public void video_input_free() {
		Object generatedFrame = this.getFrame();
		for ( i = 0;
		 i < 3; i++) {
			generatedFrame[i].video_frame_free();
		}
		video_scaler generatedScaler = this.getScaler();
		generatedScaler.video_scaler_destroy();
	}
	public video_scale_info getConversion() {
		return conversion;
	}
	public void setConversion(video_scale_info newConversion) {
		conversion = newConversion;
	}
	public video_scaler getScaler() {
		return scaler;
	}
	public void setScaler(video_scaler newScaler) {
		scaler = newScaler;
	}
	public Object getFrame() {
		return frame;
	}
	public void setFrame(Object newFrame) {
		frame = newFrame;
	}
	public int getCur_frame() {
		return cur_frame;
	}
	public void setCur_frame(int newCur_frame) {
		cur_frame = newCur_frame;
	}
	public Object getCallback() {
		return callback;
	}
	public void setCallback(Object newCallback) {
		callback = newCallback;
	}
	public Object getParam() {
		return param;
	}
	public void setParam(Object newParam) {
		param = newParam;
	}
}
