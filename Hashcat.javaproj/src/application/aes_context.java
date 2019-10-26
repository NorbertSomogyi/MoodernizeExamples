package application;

/* AES context.  */
public class aes_context {
	private int bits;
	private Object rek;
	private Object rdk;
	
	public aes_context(int bits, Object rek, Object rdk) {
		setBits(bits);
		setRek(rek);
		setRdk(rdk);
	}
	public aes_context() {
	}
	
	public int getBits() {
		return bits;
	}
	public void setBits(int newBits) {
		bits = newBits;
	}
	public Object getRek() {
		return rek;
	}
	public void setRek(Object newRek) {
		rek = newRek;
	}
	public Object getRdk() {
		return rdk;
	}
	public void setRdk(Object newRdk) {
		rdk = newRdk;
	}
}
