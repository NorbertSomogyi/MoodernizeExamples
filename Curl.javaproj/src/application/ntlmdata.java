package application;

/* Struct used for GSSAPI (Kerberos V5) authentication */
/* Struct used for NTLM challenge-response authentication */
/* NTLM differs from other authentication schemes
                               because it authenticates connections, not
                               single requests! */
/* NTLM data for proxy */
public class ntlmdata {
	private int flags;
	private Object nonce;
	private Object target_info;
	private int target_info_len;
	
	public ntlmdata(int flags, Object nonce, Object target_info, int target_info_len) {
		setFlags(flags);
		setNonce(nonce);
		setTarget_info(target_info);
		setTarget_info_len(target_info_len);
	}
	public ntlmdata() {
	}
	
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object getNonce() {
		return nonce;
	}
	public void setNonce(Object newNonce) {
		nonce = newNonce;
	}
	public Object getTarget_info() {
		return target_info;
	}
	public void setTarget_info(Object newTarget_info) {
		target_info = newTarget_info;
	}
	public int getTarget_info_len() {
		return target_info_len;
	}
	public void setTarget_info_len(int newTarget_info_len) {
		target_info_len = newTarget_info_len;
	}
}
/* The sslContext is used for the Schannel bindings. The
 * api is available on the Windows 7 SDK and later.
 */
/* used for communication with Samba's winbind daemon helper ntlm_auth */
