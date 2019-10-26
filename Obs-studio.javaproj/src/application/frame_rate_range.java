package application;

public class frame_rate_range {
	private media_frames_per_second min_time;
	private media_frames_per_second max_time;
	
	public frame_rate_range(media_frames_per_second min_time, media_frames_per_second max_time) {
		setMin_time(min_time);
		setMax_time(max_time);
	}
	public frame_rate_range() {
	}
	
	public media_frames_per_second getMin_time() {
		return min_time;
	}
	public void setMin_time(media_frames_per_second newMin_time) {
		min_time = newMin_time;
	}
	public media_frames_per_second getMax_time() {
		return max_time;
	}
	public void setMax_time(media_frames_per_second newMax_time) {
		max_time = newMax_time;
	}
}
