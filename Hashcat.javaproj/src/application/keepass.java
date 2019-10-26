package application;

public class keepass {
	private Object version;
	private Object algorithm;
	private Object keyfile_len;
	private Object keyfile;
	private Object final_random_seed;
	private Object transf_random_seed;
	private Object enc_iv;
	private Object contents_hash;
	private Object contents_len;
	private Object contents;
	private Object expected_bytes;
	
	public keepass(Object version, Object algorithm, Object keyfile_len, Object keyfile, Object final_random_seed, Object transf_random_seed, Object enc_iv, Object contents_hash, Object contents_len, Object contents, Object expected_bytes) {
		setVersion(version);
		setAlgorithm(algorithm);
		setKeyfile_len(keyfile_len);
		setKeyfile(keyfile);
		setFinal_random_seed(final_random_seed);
		setTransf_random_seed(transf_random_seed);
		setEnc_iv(enc_iv);
		setContents_hash(contents_hash);
		setContents_len(contents_len);
		setContents(contents);
		setExpected_bytes(expected_bytes);
	}
	public keepass() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(Object newAlgorithm) {
		algorithm = newAlgorithm;
	}
	public Object getKeyfile_len() {
		return keyfile_len;
	}
	public void setKeyfile_len(Object newKeyfile_len) {
		keyfile_len = newKeyfile_len;
	}
	public Object getKeyfile() {
		return keyfile;
	}
	public void setKeyfile(Object newKeyfile) {
		keyfile = newKeyfile;
	}
	public Object getFinal_random_seed() {
		return final_random_seed;
	}
	public void setFinal_random_seed(Object newFinal_random_seed) {
		final_random_seed = newFinal_random_seed;
	}
	public Object getTransf_random_seed() {
		return transf_random_seed;
	}
	public void setTransf_random_seed(Object newTransf_random_seed) {
		transf_random_seed = newTransf_random_seed;
	}
	public Object getEnc_iv() {
		return enc_iv;
	}
	public void setEnc_iv(Object newEnc_iv) {
		enc_iv = newEnc_iv;
	}
	public Object getContents_hash() {
		return contents_hash;
	}
	public void setContents_hash(Object newContents_hash) {
		contents_hash = newContents_hash;
	}
	public Object getContents_len() {
		return contents_len;
	}
	public void setContents_len(Object newContents_len) {
		contents_len = newContents_len;
	}
	public Object getContents() {
		return contents;
	}
	public void setContents(Object newContents) {
		contents = newContents;
	}
	public Object getExpected_bytes() {
		return expected_bytes;
	}
	public void setExpected_bytes(Object newExpected_bytes) {
		expected_bytes = newExpected_bytes;
	}
}
