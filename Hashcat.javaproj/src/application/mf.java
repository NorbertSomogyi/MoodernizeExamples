package application;

public class mf {
	private Object mf_buf;
	private int mf_len;
	
	public mf(Object mf_buf, int mf_len) {
		setMf_buf(mf_buf);
		setMf_len(mf_len);
	}
	public mf() {
	}
	
	public Object getMf_buf() {
		return mf_buf;
	}
	public void setMf_buf(Object newMf_buf) {
		mf_buf = newMf_buf;
	}
	public int getMf_len() {
		return mf_len;
	}
	public void setMf_len(int newMf_len) {
		mf_len = newMf_len;
	}
}
