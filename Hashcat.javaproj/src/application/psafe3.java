package application;

public class psafe3 {
	private Object signature;
	private Object salt_buf;
	private Object iterations;
	private Object hash_buf;
	
	public psafe3(Object signature, Object salt_buf, Object iterations, Object hash_buf) {
		setSignature(signature);
		setSalt_buf(salt_buf);
		setIterations(iterations);
		setHash_buf(hash_buf);
	}
	public psafe3() {
	}
	
	public Object getSignature() {
		return signature;
	}
	public void setSignature(Object newSignature) {
		signature = newSignature;
	}
	public Object getSalt_buf() {
		return salt_buf;
	}
	public void setSalt_buf(Object newSalt_buf) {
		salt_buf = newSalt_buf;
	}
	public Object getIterations() {
		return iterations;
	}
	public void setIterations(Object newIterations) {
		iterations = newIterations;
	}
	public Object getHash_buf() {
		return hash_buf;
	}
	public void setHash_buf(Object newHash_buf) {
		hash_buf = newHash_buf;
	}
}
