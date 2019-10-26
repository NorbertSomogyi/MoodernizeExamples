package application;

/* core */
public class obs_vframe_info {
	private Object timestamp;
	private int count;
	
	public obs_vframe_info(Object timestamp, int count) {
		setTimestamp(timestamp);
		setCount(count);
	}
	public obs_vframe_info() {
	}
	
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
}
