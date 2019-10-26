package application;

public class gss_ctx_id_t_desc_struct {
	private  sent;
	private int have_krb5;
	private int have_ntlm;
	private Object flags;
	private Object creds;
	
	public gss_ctx_id_t_desc_struct( sent, int have_krb5, int have_ntlm, Object flags, Object creds) {
		setSent(sent);
		setHave_krb5(have_krb5);
		setHave_ntlm(have_ntlm);
		setFlags(flags);
		setCreds(creds);
	}
	public gss_ctx_id_t_desc_struct() {
	}
	
	public  getSent() {
		return sent;
	}
	public void setSent( newSent) {
		sent = newSent;
	}
	public int getHave_krb5() {
		return have_krb5;
	}
	public void setHave_krb5(int newHave_krb5) {
		have_krb5 = newHave_krb5;
	}
	public int getHave_ntlm() {
		return have_ntlm;
	}
	public void setHave_ntlm(int newHave_ntlm) {
		have_ntlm = newHave_ntlm;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
	public Object getCreds() {
		return creds;
	}
	public void setCreds(Object newCreds) {
		creds = newCreds;
	}
}
