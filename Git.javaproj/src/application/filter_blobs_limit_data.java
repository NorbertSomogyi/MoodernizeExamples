package application;

public class filter_blobs_limit_data {
	private long max_bytes;
	
	public filter_blobs_limit_data(long max_bytes) {
		setMax_bytes(max_bytes);
	}
	public filter_blobs_limit_data() {
	}
	
	public long getMax_bytes() {
		return max_bytes;
	}
	public void setMax_bytes(long newMax_bytes) {
		max_bytes = newMax_bytes;
	}
}
