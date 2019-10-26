package application;

public class cached_frame_info {
	private video_data frame;
	private int skipped;
	private int count;
	
	public cached_frame_info(video_data frame, int skipped, int count) {
		setFrame(frame);
		setSkipped(skipped);
		setCount(count);
	}
	public cached_frame_info() {
	}
	
	public video_data getFrame() {
		return frame;
	}
	public void setFrame(video_data newFrame) {
		frame = newFrame;
	}
	public int getSkipped() {
		return skipped;
	}
	public void setSkipped(int newSkipped) {
		skipped = newSkipped;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
}
