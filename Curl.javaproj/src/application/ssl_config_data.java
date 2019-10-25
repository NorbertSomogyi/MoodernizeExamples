package application;

/* user defined SSL stuff */
/* user defined SSL stuff for proxy */
public class ssl_config_data {
	private ssl_primary_config primary;
	private long certverifyresult;
	private Object CRLfile;
	private Object issuercert;
	private Object fsslctx;
	private Object fsslctxp;
	private Object cert;
	private Object cert_type;
	private Object key;
	private Object key_type;
	private Object key_passwd;
	private Object certinfo;
	private Object falsestart;
	private Object enable_beast;
	private Object no_revoke;
	
	public ssl_config_data(ssl_primary_config primary, long certverifyresult, Object CRLfile, Object issuercert, Object fsslctx, Object fsslctxp, Object cert, Object cert_type, Object key, Object key_type, Object key_passwd, Object certinfo, Object falsestart, Object enable_beast, Object no_revoke) {
		setPrimary(primary);
		setCertverifyresult(certverifyresult);
		setCRLfile(CRLfile);
		setIssuercert(issuercert);
		setFsslctx(fsslctx);
		setFsslctxp(fsslctxp);
		setCert(cert);
		setCert_type(cert_type);
		setKey(key);
		setKey_type(key_type);
		setKey_passwd(key_passwd);
		setCertinfo(certinfo);
		setFalsestart(falsestart);
		setEnable_beast(enable_beast);
		setNo_revoke(no_revoke);
	}
	public ssl_config_data() {
	}
	
	public ssl_primary_config getPrimary() {
		return primary;
	}
	public void setPrimary(ssl_primary_config newPrimary) {
		primary = newPrimary;
	}
	public long getCertverifyresult() {
		return certverifyresult;
	}
	public void setCertverifyresult(long newCertverifyresult) {
		certverifyresult = newCertverifyresult;
	}
	public Object getCRLfile() {
		return CRLfile;
	}
	public void setCRLfile(Object newCRLfile) {
		CRLfile = newCRLfile;
	}
	public Object getIssuercert() {
		return issuercert;
	}
	public void setIssuercert(Object newIssuercert) {
		issuercert = newIssuercert;
	}
	public Object getFsslctx() {
		return fsslctx;
	}
	public void setFsslctx(Object newFsslctx) {
		fsslctx = newFsslctx;
	}
	public Object getFsslctxp() {
		return fsslctxp;
	}
	public void setFsslctxp(Object newFsslctxp) {
		fsslctxp = newFsslctxp;
	}
	public Object getCert() {
		return cert;
	}
	public void setCert(Object newCert) {
		cert = newCert;
	}
	public Object getCert_type() {
		return cert_type;
	}
	public void setCert_type(Object newCert_type) {
		cert_type = newCert_type;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
	public Object getKey_type() {
		return key_type;
	}
	public void setKey_type(Object newKey_type) {
		key_type = newKey_type;
	}
	public Object getKey_passwd() {
		return key_passwd;
	}
	public void setKey_passwd(Object newKey_passwd) {
		key_passwd = newKey_passwd;
	}
	public Object getCertinfo() {
		return certinfo;
	}
	public void setCertinfo(Object newCertinfo) {
		certinfo = newCertinfo;
	}
	public Object getFalsestart() {
		return falsestart;
	}
	public void setFalsestart(Object newFalsestart) {
		falsestart = newFalsestart;
	}
	public Object getEnable_beast() {
		return enable_beast;
	}
	public void setEnable_beast(Object newEnable_beast) {
		enable_beast = newEnable_beast;
	}
	public Object getNo_revoke() {
		return no_revoke;
	}
	public void setNo_revoke(Object newNo_revoke) {
		no_revoke = newNo_revoke;
	}
}
