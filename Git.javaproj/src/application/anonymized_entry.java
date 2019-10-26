package application;

public class anonymized_entry {
	private hashmap_entry hash;
	private Object orig;
	private Object orig_len;
	private Object anon;
	private Object anon_len;
	
	public anonymized_entry(hashmap_entry hash, Object orig, Object orig_len, Object anon, Object anon_len) {
		setHash(hash);
		setOrig(orig);
		setOrig_len(orig_len);
		setAnon(anon);
		setAnon_len(anon_len);
	}
	public anonymized_entry() {
	}
	
	public hashmap_entry getHash() {
		return hash;
	}
	public void setHash(hashmap_entry newHash) {
		hash = newHash;
	}
	public Object getOrig() {
		return orig;
	}
	public void setOrig(Object newOrig) {
		orig = newOrig;
	}
	public Object getOrig_len() {
		return orig_len;
	}
	public void setOrig_len(Object newOrig_len) {
		orig_len = newOrig_len;
	}
	public Object getAnon() {
		return anon;
	}
	public void setAnon(Object newAnon) {
		anon = newAnon;
	}
	public Object getAnon_len() {
		return anon_len;
	}
	public void setAnon_len(Object newAnon_len) {
		anon_len = newAnon_len;
	}
}
