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
	
	public void Curl_auth_cleanup_ntlm() {
		Object generatedTarget_info = this.getTarget_info();
		do {
			.Curl_cfree((generatedTarget_info));
			(generatedTarget_info) = ((Object)0);
		} while (/* Free the target info */0);
		this.setTarget_info_len(/* Reset any variables */0/* USE_NTLM && !USE_WINDOWS_SSPI */);
	}
	public Object Curl_ntlm_core_mk_ntlmv2_resp(Byte ntlmv2hash, Byte challenge_client, byte ntresp, int ntresp_len) {
		int len = 0;
		byte ptr = ((Object)0);
		byte[] hmac_output = new byte[(true)];
		 tw = new ();
		 result = CURLE_OK/* Calculate the timestamp */;
		tw = (().time(((Object)0)) + .CURL_OFF_T_C(-1024)) * 10000000;
		int generatedTarget_info_len = this.getTarget_info_len();
		len = (true) + (44 - 16 + generatedTarget_info_len + /* Calculate the response len */4);
		ptr = .Curl_ccalloc(1, /* Allocate the response */len);
		if (!ptr) {
			return CURLE_OUT_OF_MEMORY;
		} 
		ModernizedCProgram.curl_msnprintf((byte)ptr + (true), (44 - 16 + generatedTarget_info_len + /* Create the BLOB structure */4), /* NTLMv2_BLOB_SIGNATURE */"%c%c%c%c%c%c%c%c", "\x01\x01\x00\x00"[0], "\x01\x01\x00\x00"[/* Reserved = 0 */1], "\x01\x01\x00\x00"[2], "\x01\x01\x00\x00"[3], 0, 0, 0, 0);
		ModernizedCProgram.Curl_write64_le(tw, ptr + 24);
		.memcpy(ptr + 32, challenge_client, 8);
		Object generatedTarget_info = this.getTarget_info();
		.memcpy(ptr + 44, generatedTarget_info, generatedTarget_info_len);
		Object generatedNonce = this.getNonce();
		.memcpy(ptr + 8, generatedNonce[0], /* Concatenate the Type 2 challenge with the BLOB and do HMAC MD5 */8);
		result = ModernizedCProgram.hmac_md5(ntlmv2hash, (true), ptr + 8, (44 - 16 + generatedTarget_info_len + 4) + 8, hmac_output);
		if (result) {
			.Curl_cfree(ptr);
			return result;
		} 
		.memcpy(ptr, hmac_output, (/* Concatenate the HMAC MD5 output  with the BLOB */true));
		ntresp = /* Return the response */ptr;
		ntresp_len = len;
		return result/*
		 * Curl_ntlm_core_mk_lmv2_resp()
		 *
		 * This creates the LMv2 response as used in the ntlm type-3 message.
		 *
		 * Parameters:
		 *
		 * ntlmv2hash        [in] - The ntlmv2 hash (16 bytes)
		 * challenge_client  [in] - The client nonce (8 bytes)
		 * challenge_client  [in] - The server challenge (8 bytes)
		 * lmresp           [out] - The LMv2 response (24 bytes)
		 *
		 * Returns CURLE_OK on success.
		 */;
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
