package application;

/* setup for this session */
public class ssl_primary_config {
	private long version;
	private long version_max;
	private Object CApath;
	private Object CAfile;
	private Object clientcert;
	private Object random_file;
	private Object egdsocket;
	private Object cipher_list;
	private Object cipher_list13;
	private Object pinned_key;
	private Object verifypeer;
	private Object verifyhost;
	private Object verifystatus;
	private Object sessionid;
	
	public ssl_primary_config(long version, long version_max, Object CApath, Object CAfile, Object clientcert, Object random_file, Object egdsocket, Object cipher_list, Object cipher_list13, Object pinned_key, Object verifypeer, Object verifyhost, Object verifystatus, Object sessionid) {
		setVersion(version);
		setVersion_max(version_max);
		setCApath(CApath);
		setCAfile(CAfile);
		setClientcert(clientcert);
		setRandom_file(random_file);
		setEgdsocket(egdsocket);
		setCipher_list(cipher_list);
		setCipher_list13(cipher_list13);
		setPinned_key(pinned_key);
		setVerifypeer(verifypeer);
		setVerifyhost(verifyhost);
		setVerifystatus(verifystatus);
		setSessionid(sessionid);
	}
	public ssl_primary_config() {
	}
	
	public long getVersion() {
		return version;
	}
	public void setVersion(long newVersion) {
		version = newVersion;
	}
	public long getVersion_max() {
		return version_max;
	}
	public void setVersion_max(long newVersion_max) {
		version_max = newVersion_max;
	}
	public Object getCApath() {
		return CApath;
	}
	public void setCApath(Object newCApath) {
		CApath = newCApath;
	}
	public Object getCAfile() {
		return CAfile;
	}
	public void setCAfile(Object newCAfile) {
		CAfile = newCAfile;
	}
	public Object getClientcert() {
		return clientcert;
	}
	public void setClientcert(Object newClientcert) {
		clientcert = newClientcert;
	}
	public Object getRandom_file() {
		return random_file;
	}
	public void setRandom_file(Object newRandom_file) {
		random_file = newRandom_file;
	}
	public Object getEgdsocket() {
		return egdsocket;
	}
	public void setEgdsocket(Object newEgdsocket) {
		egdsocket = newEgdsocket;
	}
	public Object getCipher_list() {
		return cipher_list;
	}
	public void setCipher_list(Object newCipher_list) {
		cipher_list = newCipher_list;
	}
	public Object getCipher_list13() {
		return cipher_list13;
	}
	public void setCipher_list13(Object newCipher_list13) {
		cipher_list13 = newCipher_list13;
	}
	public Object getPinned_key() {
		return pinned_key;
	}
	public void setPinned_key(Object newPinned_key) {
		pinned_key = newPinned_key;
	}
	public Object getVerifypeer() {
		return verifypeer;
	}
	public void setVerifypeer(Object newVerifypeer) {
		verifypeer = newVerifypeer;
	}
	public Object getVerifyhost() {
		return verifyhost;
	}
	public void setVerifyhost(Object newVerifyhost) {
		verifyhost = newVerifyhost;
	}
	public Object getVerifystatus() {
		return verifystatus;
	}
	public void setVerifystatus(Object newVerifystatus) {
		verifystatus = newVerifystatus;
	}
	public Object getSessionid() {
		return sessionid;
	}
	public void setSessionid(Object newSessionid) {
		sessionid = newSessionid;
	}
}
