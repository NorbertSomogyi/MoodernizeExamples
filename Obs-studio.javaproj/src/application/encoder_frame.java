package application;

/** Encoder input frame */
public class encoder_frame {
	private Object data;
	private Object linesize;
	private Object frames;
	private Object pts;
	
	public encoder_frame(Object data, Object linesize, Object frames, Object pts) {
		setData(data);
		setLinesize(linesize);
		setFrames(frames);
		setPts(pts);
	}
	public encoder_frame() {
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
	public Object getFrames() {
		return frames;
	}
	public void setFrames(Object newFrames) {
		frames = newFrames;
	}
	public Object getPts() {
		return pts;
	}
	public void setPts(Object newPts) {
		pts = newPts;
	}
}
