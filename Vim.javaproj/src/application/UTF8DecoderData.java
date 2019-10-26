package application;

public class UTF8DecoderData {
	private int bytes_remaining;
	private int bytes_total;
	private int this_cp;
	
	public UTF8DecoderData(int bytes_remaining, int bytes_total, int this_cp) {
		setBytes_remaining(bytes_remaining);
		setBytes_total(bytes_total);
		setThis_cp(this_cp);
	}
	public UTF8DecoderData() {
	}
	
	public int getBytes_remaining() {
		return bytes_remaining;
	}
	public void setBytes_remaining(int newBytes_remaining) {
		bytes_remaining = newBytes_remaining;
	}
	public int getBytes_total() {
		return bytes_total;
	}
	public void setBytes_total(int newBytes_total) {
		bytes_total = newBytes_total;
	}
	public int getThis_cp() {
		return this_cp;
	}
	public void setThis_cp(int newThis_cp) {
		this_cp = newThis_cp;
	}
}
// number of bytes remaining in this codepoint
