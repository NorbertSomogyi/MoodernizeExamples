package application;

/* imap_conn is used for struct connection-oriented data in the connectdata
   struct */
public class imap_conn {
	private pingpong pp;
	private  state;
	private  ssldone;
	private  preauth;
	private SASL sasl;
	private int preftype;
	private int cmdid;
	private Object resptag;
	private  tls_supported;
	private  login_disabled;
	private  ir_supported;
	private Object mailbox;
	private Object mailbox_uidvalidity;
	
	public imap_conn(pingpong pp,  state,  ssldone,  preauth, SASL sasl, int preftype, int cmdid, Object resptag,  tls_supported,  login_disabled,  ir_supported, Object mailbox, Object mailbox_uidvalidity) {
		setPp(pp);
		setState(state);
		setSsldone(ssldone);
		setPreauth(preauth);
		setSasl(sasl);
		setPreftype(preftype);
		setCmdid(cmdid);
		setResptag(resptag);
		setTls_supported(tls_supported);
		setLogin_disabled(login_disabled);
		setIr_supported(ir_supported);
		setMailbox(mailbox);
		setMailbox_uidvalidity(mailbox_uidvalidity);
	}
	public imap_conn() {
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
	public  getPreauth() {
		return preauth;
	}
	public void setPreauth( newPreauth) {
		preauth = newPreauth;
	}
	public SASL getSasl() {
		return sasl;
	}
	public void setSasl(SASL newSasl) {
		sasl = newSasl;
	}
	public int getPreftype() {
		return preftype;
	}
	public void setPreftype(int newPreftype) {
		preftype = newPreftype;
	}
	public int getCmdid() {
		return cmdid;
	}
	public void setCmdid(int newCmdid) {
		cmdid = newCmdid;
	}
	public Object getResptag() {
		return resptag;
	}
	public void setResptag(Object newResptag) {
		resptag = newResptag;
	}
	public  getTls_supported() {
		return tls_supported;
	}
	public void setTls_supported( newTls_supported) {
		tls_supported = newTls_supported;
	}
	public  getLogin_disabled() {
		return login_disabled;
	}
	public void setLogin_disabled( newLogin_disabled) {
		login_disabled = newLogin_disabled;
	}
	public  getIr_supported() {
		return ir_supported;
	}
	public void setIr_supported( newIr_supported) {
		ir_supported = newIr_supported;
	}
	public Object getMailbox() {
		return mailbox;
	}
	public void setMailbox(Object newMailbox) {
		mailbox = newMailbox;
	}
	public Object getMailbox_uidvalidity() {
		return mailbox_uidvalidity;
	}
	public void setMailbox_uidvalidity(Object newMailbox_uidvalidity) {
		mailbox_uidvalidity = newMailbox_uidvalidity;
	}
}
