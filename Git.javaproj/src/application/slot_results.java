package application;

/*
 * We detect based on the cURL version if multi-transfer is
 * usable in this implementation and define this symbol accordingly.
 * This shouldn't be set by the Makefile or by the user (e.g. via CFLAGS).
 */
/* nothing */
/* nothing */
/*
 * CURLOPT_USE_SSL was known as CURLOPT_FTP_SSL up to 7.16.4,
 * and the constants were known as CURLFTPSSL_*
*/
public class slot_results {
	private Object curl_result;
	private long http_code;
	private long auth_avail;
	private long http_connectcode;
	
	public slot_results(Object curl_result, long http_code, long auth_avail, long http_connectcode) {
		setCurl_result(curl_result);
		setHttp_code(http_code);
		setAuth_avail(auth_avail);
		setHttp_connectcode(http_connectcode);
	}
	public slot_results() {
	}
	
	public int handle_curl_result() {
		Object generatedCurl_result = this.getCurl_result();
		long generatedHttp_code = this.getHttp_code();
		ModernizedCProgram.normalize_curl_result(generatedCurl_result, generatedHttp_code, ModernizedCProgram.curl_errorstr, );
		long generatedHttp_connectcode = this.getHttp_connectcode();
		if (generatedCurl_result == CURLE_OK) {
			.credential_approve(ModernizedCProgram.http_auth);
			if (ModernizedCProgram.proxy_auth.getPassword()) {
				.credential_approve(ModernizedCProgram.proxy_auth);
			} 
			return 0;
		}  else if (ModernizedCProgram.missing__target(generatedHttp_code, generatedCurl_result)) {
			return 1;
		}  else if (generatedHttp_code == 401) {
			if (ModernizedCProgram.http_auth.getUsername() && ModernizedCProgram.http_auth.getPassword()) {
				.credential_reject(ModernizedCProgram.http_auth);
				return 5;
			} else {
					return 4;
			} 
		} else {
				if (generatedHttp_connectcode == 407) {
					.credential_reject(ModernizedCProgram.proxy_auth);
				} 
				return 2;
		} 
	}
	public Object getCurl_result() {
		return curl_result;
	}
	public void setCurl_result(Object newCurl_result) {
		curl_result = newCurl_result;
	}
	public long getHttp_code() {
		return http_code;
	}
	public void setHttp_code(long newHttp_code) {
		http_code = newHttp_code;
	}
	public long getAuth_avail() {
		return auth_avail;
	}
	public void setAuth_avail(long newAuth_avail) {
		auth_avail = newAuth_avail;
	}
	public long getHttp_connectcode() {
		return http_connectcode;
	}
	public void setHttp_connectcode(long newHttp_connectcode) {
		http_connectcode = newHttp_connectcode;
	}
}
