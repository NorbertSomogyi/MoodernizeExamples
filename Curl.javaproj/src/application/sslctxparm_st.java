package application;

/*
 * We use this ZERO_NULL to avoid picky compiler warnings,
 * when assigning a NULL pointer to a function pointer var.
 */
/* This is a context that we pass to all callbacks */
public class sslctxparm_st {
	private Byte p12file;
	private Object pst;
	private Object p12;
	private Object pkey;
	private Object usercert;
	private Object curl;
	private Object errorbio;
	private int accesstype;
	private int verbose;
	
	public sslctxparm_st(Byte p12file, Object pst, Object p12, Object pkey, Object usercert, Object curl, Object errorbio, int accesstype, int verbose) {
		setP12file(p12file);
		setPst(pst);
		setP12(p12);
		setPkey(pkey);
		setUsercert(usercert);
		setCurl(curl);
		setErrorbio(errorbio);
		setAccesstype(accesstype);
		setVerbose(verbose);
	}
	public sslctxparm_st() {
	}
	
	public Byte getP12file() {
		return p12file;
	}
	public void setP12file(Byte newP12file) {
		p12file = newP12file;
	}
	public Object getPst() {
		return pst;
	}
	public void setPst(Object newPst) {
		pst = newPst;
	}
	public Object getP12() {
		return p12;
	}
	public void setP12(Object newP12) {
		p12 = newP12;
	}
	public Object getPkey() {
		return pkey;
	}
	public void setPkey(Object newPkey) {
		pkey = newPkey;
	}
	public Object getUsercert() {
		return usercert;
	}
	public void setUsercert(Object newUsercert) {
		usercert = newUsercert;
	}
	public Object getCurl() {
		return curl;
	}
	public void setCurl(Object newCurl) {
		curl = newCurl;
	}
	public Object getErrorbio() {
		return errorbio;
	}
	public void setErrorbio(Object newErrorbio) {
		errorbio = newErrorbio;
	}
	public int getAccesstype() {
		return accesstype;
	}
	public void setAccesstype(int newAccesstype) {
		accesstype = newAccesstype;
	}
	public int getVerbose() {
		return verbose;
	}
	public void setVerbose(int newVerbose) {
		verbose = newVerbose;
	}
}
