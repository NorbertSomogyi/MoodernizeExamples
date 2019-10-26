package application;

public class bar_progress_hist {
	private Object pos;
	private Object times;
	private Object bytes;
	private Object total_time;
	private Object total_bytes;
	
	public bar_progress_hist(Object pos, Object times, Object bytes, Object total_time, Object total_bytes) {
		setPos(pos);
		setTimes(times);
		setBytes(bytes);
		setTotal_time(total_time);
		setTotal_bytes(total_bytes);
	}
	public bar_progress_hist() {
	}
	
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public Object getTimes() {
		return times;
	}
	public void setTimes(Object newTimes) {
		times = newTimes;
	}
	public Object getBytes() {
		return bytes;
	}
	public void setBytes(Object newBytes) {
		bytes = newBytes;
	}
	public Object getTotal_time() {
		return total_time;
	}
	public void setTotal_time(Object newTotal_time) {
		total_time = newTotal_time;
	}
	public Object getTotal_bytes() {
		return total_bytes;
	}
	public void setTotal_bytes(Object newTotal_bytes) {
		total_bytes = newTotal_bytes;
	}
}
