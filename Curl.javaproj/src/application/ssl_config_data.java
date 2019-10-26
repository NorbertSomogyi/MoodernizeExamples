package application;

/* user defined SSL stuff */
/* user defined SSL stuff for proxy */
public class ssl_config_data {
	private ssl_primary_config primary;
	private long certverifyresult;
	private Byte CRLfile;
	private Byte issuercert;
	private Object fsslctx;
	private Object fsslctxp;
	private Byte cert;
	private Byte cert_type;
	private Byte key;
	private Byte key_type;
	private Byte key_passwd;
	private Object certinfo;
	private Object falsestart;
	private Object enable_beast;
	private Object no_revoke;
	
	public ssl_config_data(ssl_primary_config primary, long certverifyresult, Byte CRLfile, Byte issuercert, Object fsslctx, Object fsslctxp, Byte cert, Byte cert_type, Byte key, Byte key_type, Byte key_passwd, Object certinfo, Object falsestart, Object enable_beast, Object no_revoke) {
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
	public Byte getCRLfile() {
		return CRLfile;
	}
	public void setCRLfile(Byte newCRLfile) {
		CRLfile = newCRLfile;
	}
	public Byte getIssuercert() {
		return issuercert;
	}
	public void setIssuercert(Byte newIssuercert) {
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
	public Byte getCert() {
		return cert;
	}
	public void setCert(Byte newCert) {
		cert = newCert;
	}
	public Byte getCert_type() {
		return cert_type;
	}
	public void setCert_type(Byte newCert_type) {
		cert_type = newCert_type;
	}
	public Byte getKey() {
		return key;
	}
	public void setKey(Byte newKey) {
		key = newKey;
	}
	public Byte getKey_type() {
		return key_type;
	}
	public void setKey_type(Byte newKey_type) {
		key_type = newKey_type;
	}
	public Byte getKey_passwd() {
		return key_passwd;
	}
	public void setKey_passwd(Byte newKey_passwd) {
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
