package application;

/* Struct used for Digest challenge-response authentication */
/* state data for host Digest auth */
/* state data for proxy Digest auth */
public class digestdata {
	private Object nonce;
	private Object cnonce;
	private Object realm;
	private int algo;
	private Object opaque;
	private Object qop;
	private Object algorithm;
	private int nc;
	private Object stale;
	private Object userhash;
	
	public digestdata(Object nonce, Object cnonce, Object realm, int algo, Object opaque, Object qop, Object algorithm, int nc, Object stale, Object userhash) {
		setNonce(nonce);
		setCnonce(cnonce);
		setRealm(realm);
		setAlgo(algo);
		setOpaque(opaque);
		setQop(qop);
		setAlgorithm(algorithm);
		setNc(nc);
		setStale(stale);
		setUserhash(userhash);
	}
	public digestdata() {
	}
	
	public Object getNonce() {
		return nonce;
	}
	public void setNonce(Object newNonce) {
		nonce = newNonce;
	}
	public Object getCnonce() {
		return cnonce;
	}
	public void setCnonce(Object newCnonce) {
		cnonce = newCnonce;
	}
	public Object getRealm() {
		return realm;
	}
	public void setRealm(Object newRealm) {
		realm = newRealm;
	}
	public int getAlgo() {
		return algo;
	}
	public void setAlgo(int newAlgo) {
		algo = newAlgo;
	}
	public Object getOpaque() {
		return opaque;
	}
	public void setOpaque(Object newOpaque) {
		opaque = newOpaque;
	}
	public Object getQop() {
		return qop;
	}
	public void setQop(Object newQop) {
		qop = newQop;
	}
	public Object getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(Object newAlgorithm) {
		algorithm = newAlgorithm;
	}
	public int getNc() {
		return nc;
	}
	public void setNc(int newNc) {
		nc = newNc;
	}
	public Object getStale() {
		return stale;
	}
	public void setStale(Object newStale) {
		stale = newStale;
	}
	public Object getUserhash() {
		return userhash;
	}
	public void setUserhash(Object newUserhash) {
		userhash = newUserhash;
	}
}
/* copy of user/passwd used to make the identity for http_context.
     either may be NULL. */
