package application;

public class odf12 {
	private Object iterations;
	private Object iv;
	private Object checksum;
	private Object encrypted_data;
	
	public odf12(Object iterations, Object iv, Object checksum, Object encrypted_data) {
		setIterations(iterations);
		setIv(iv);
		setChecksum(checksum);
		setEncrypted_data(encrypted_data);
	}
	public odf12() {
	}
	
	public Object getIterations() {
		return iterations;
	}
	public void setIterations(Object newIterations) {
		iterations = newIterations;
	}
	public Object getIv() {
		return iv;
	}
	public void setIv(Object newIv) {
		iv = newIv;
	}
	public Object getChecksum() {
		return checksum;
	}
	public void setChecksum(Object newChecksum) {
		checksum = newChecksum;
	}
	public Object getEncrypted_data() {
		return encrypted_data;
	}
	public void setEncrypted_data(Object newEncrypted_data) {
		encrypted_data = newEncrypted_data;
	}
}
