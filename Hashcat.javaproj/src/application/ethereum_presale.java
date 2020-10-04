package application;

public class ethereum_presale {
	private Object[] iv;
	private Object[] enc_seed;
	private Object enc_seed_len;
	
	public ethereum_presale(Object[] iv, Object[] enc_seed, Object enc_seed_len) {
		setIv(iv);
		setEnc_seed(enc_seed);
		setEnc_seed_len(enc_seed_len);
	}
	public ethereum_presale() {
	}
	
	public Object[] getIv() {
		return iv;
	}
	public void setIv(Object[] newIv) {
		iv = newIv;
	}
	public Object[] getEnc_seed() {
		return enc_seed;
	}
	public void setEnc_seed(Object[] newEnc_seed) {
		enc_seed = newEnc_seed;
	}
	public Object getEnc_seed_len() {
		return enc_seed_len;
	}
	public void setEnc_seed_len(Object newEnc_seed_len) {
		enc_seed_len = newEnc_seed_len;
	}
}
