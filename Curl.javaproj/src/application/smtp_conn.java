package application;

/* smtp_conn is used for struct connection-oriented data in the connectdata
   struct */
public class smtp_conn {
	private pingpong pp;
	private  state;
	private  ssldone;
	private Byte domain;
	private SASL sasl;
	private  tls_supported;
	private  size_supported;
	private  auth_supported;
	
	public smtp_conn(pingpong pp,  state,  ssldone, Byte domain, SASL sasl,  tls_supported,  size_supported,  auth_supported) {
		setPp(pp);
		setState(state);
		setSsldone(ssldone);
		setDomain(domain);
		setSasl(sasl);
		setTls_supported(tls_supported);
		setSize_supported(size_supported);
		setAuth_supported(auth_supported);
	}
	public smtp_conn() {
	}
	
	public pingpong getPp() {
		return pp;
	}
	public void setPp(pingpong newPp) {
		pp = newPp;
	}
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
	public  getSsldone() {
		return ssldone;
	}
	public void setSsldone( newSsldone) {
		ssldone = newSsldone;
	}
	public Byte getDomain() {
		return domain;
	}
	public void setDomain(Byte newDomain) {
		domain = newDomain;
	}
	public SASL getSasl() {
		return sasl;
	}
	public void setSasl(SASL newSasl) {
		sasl = newSasl;
	}
	public  getTls_supported() {
		return tls_supported;
	}
	public void setTls_supported( newTls_supported) {
		tls_supported = newTls_supported;
	}
	public  getSize_supported() {
		return size_supported;
	}
	public void setSize_supported( newSize_supported) {
		size_supported = newSize_supported;
	}
	public  getAuth_supported() {
		return auth_supported;
	}
	public void setAuth_supported( newAuth_supported) {
		auth_supported = newAuth_supported;
	}
}
