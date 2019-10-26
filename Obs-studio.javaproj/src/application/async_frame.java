package application;

/* sources  */
public class async_frame {
	private obs_source_frame frame;
	private long unused_count;
	private Object used;
	
	public async_frame(obs_source_frame frame, long unused_count, Object used) {
		setFrame(frame);
		setUnused_count(unused_count);
		setUsed(used);
	}
	public async_frame() {
	}
	
	public obs_source_frame getFrame() {
		return frame;
	}
	public void setFrame(obs_source_frame newFrame) {
		frame = newFrame;
	}
	public long getUnused_count() {
		return unused_count;
	}
	public void setUnused_count(long newUnused_count) {
		unused_count = newUnused_count;
	}
	public Object getUsed() {
		return used;
	}
	public void setUsed(Object newUsed) {
		used = newUsed;
	}
}
