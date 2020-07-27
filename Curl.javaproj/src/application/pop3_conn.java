package application;

/* pop3_conn is used for struct connection-oriented data in the connectdata
   struct */
public class pop3_conn {
	private pingpong pp;
	private  state;
	private  ssldone;
	private Object eob;
	private Object strip;
	private SASL sasl;
	private int authtypes;
	private int preftype;
	private byte[] apoptimestamp;
	private  tls_supported;
	
	public pop3_conn(pingpong pp,  state,  ssldone, Object eob, Object strip, SASL sasl, int authtypes, int preftype, byte[] apoptimestamp,  tls_supported) {
		setPp(pp);
		setState(state);
		setSsldone(ssldone);
		setEob(eob);
		setStrip(strip);
		setSasl(sasl);
		setAuthtypes(authtypes);
		setPreftype(preftype);
		setApoptimestamp(apoptimestamp);
		setTls_supported(tls_supported);
	}
	public pop3_conn() {
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
	public Object getEob() {
		return eob;
	}
	public void setEob(Object newEob) {
		eob = newEob;
	}
	public Object getStrip() {
		return strip;
	}
	public void setStrip(Object newStrip) {
		strip = newStrip;
	}
	public SASL getSasl() {
		return sasl;
	}
	public void setSasl(SASL newSasl) {
		sasl = newSasl;
	}
	public int getAuthtypes() {
		return authtypes;
	}
	public void setAuthtypes(int newAuthtypes) {
		authtypes = newAuthtypes;
	}
	public int getPreftype() {
		return preftype;
	}
	public void setPreftype(int newPreftype) {
		preftype = newPreftype;
	}
	public byte[] getApoptimestamp() {
		return apoptimestamp;
	}
	public void setApoptimestamp(byte[] newApoptimestamp) {
		apoptimestamp = newApoptimestamp;
	}
	public  getTls_supported() {
		return tls_supported;
	}
	public void setTls_supported( newTls_supported) {
		tls_supported = newTls_supported;
	}
}
