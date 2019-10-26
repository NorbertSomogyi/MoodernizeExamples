package application;

public class brain_server_db_short {
	private brain_server_hash_short short_buf;
	private Object short_cnt;
	
	public brain_server_db_short(brain_server_hash_short short_buf, Object short_cnt) {
		setShort_buf(short_buf);
		setShort_cnt(short_cnt);
	}
	public brain_server_db_short() {
	}
	
	public brain_server_hash_short getShort_buf() {
		return short_buf;
	}
	public void setShort_buf(brain_server_hash_short newShort_buf) {
		short_buf = newShort_buf;
	}
	public Object getShort_cnt() {
		return short_cnt;
	}
	public void setShort_cnt(Object newShort_cnt) {
		short_cnt = newShort_cnt;
	}
}
