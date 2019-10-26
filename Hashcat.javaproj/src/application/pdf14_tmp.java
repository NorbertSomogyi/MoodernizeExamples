package application;

public class pdf14_tmp {
	private Object digest;
	private Object out;
	
	public pdf14_tmp(Object digest, Object out) {
		setDigest(digest);
		setOut(out);
	}
	public pdf14_tmp() {
	}
	
	public Object getDigest() {
		return digest;
	}
	public void setDigest(Object newDigest) {
		digest = newDigest;
	}
	public Object getOut() {
		return out;
	}
	public void setOut(Object newOut) {
		out = newOut;
	}
}
