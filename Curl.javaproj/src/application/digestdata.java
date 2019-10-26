package application;

/* Struct used for Digest challenge-response authentication */
/* state data for host Digest auth */
/* state data for proxy Digest auth */
public class digestdata {
	private Byte nonce;
	private Byte cnonce;
	private Byte realm;
	private int algo;
	private Byte opaque;
	private Byte qop;
	private Byte algorithm;
	private int nc;
	private Object stale;
	private Object userhash;
	
	public digestdata(Byte nonce, Byte cnonce, Byte realm, int algo, Byte opaque, Byte qop, Byte algorithm, int nc, Object stale, Object userhash) {
		setNonce(nonce);
		setCnonce(cnonce);
		setRealm(realm);
		setAlgo(algo);
		setOpaque(opaque);
		setQop(qop);
		setAlgorithm(algorithm);
		setNc(nc);
		setStale(stale);
		setUserhash(userhash);
	}
	public digestdata() {
	}
	
	public Object Curl_auth_decode_digest_http_message(Object chlg) {
		bool before = /* got a nonce before */0;
		bool foundAuth = 0;
		bool foundAuthInt = 0;
		byte token = ((Object)0);
		byte tmp = ((Object)0);
		Byte generatedNonce = this.getNonce();
		if (generatedNonce) {
			before = 1;
		} 
		/* Clean up any former leftovers and initialise to defaults */digest.Curl_auth_digest_cleanup();
		Byte generatedRealm = this.getRealm();
		Byte generatedOpaque = this.getOpaque();
		Byte generatedQop = this.getQop();
		Byte generatedAlgorithm = this.getAlgorithm();
		for (; ; ) {
			byte[] value = new byte[DIGEST_MAX_VALUE_LENGTH];
			byte[] content = new byte[DIGEST_MAX_CONTENT_LENGTH];
			while (chlg && (ModernizedCProgram.Curl_isspace((int)((byte)/* Pass all additional spaces here */chlg)))) {
				chlg++;
			}
			if (ModernizedCProgram.Curl_auth_digest_get_pair(chlg, value, content, /* Extract a value=content pair */chlg)) {
				if (ModernizedCProgram.Curl_strcasecompare(value, "nonce")) {
					.Curl_cfree(generatedNonce);
					this.setNonce(.Curl_cstrdup(content));
					if (!generatedNonce) {
						return CURLE_OUT_OF_MEMORY;
					} 
				}  else if (ModernizedCProgram.Curl_strcasecompare(value, "stale")) {
					if (ModernizedCProgram.Curl_strcasecompare(content, "true")) {
						this.setStale(1);
						this.setNc(/* we make a new nonce now */1);
					} 
				}  else if (ModernizedCProgram.Curl_strcasecompare(value, "realm")) {
					.Curl_cfree(generatedRealm);
					this.setRealm(.Curl_cstrdup(content));
					if (!generatedRealm) {
						return CURLE_OUT_OF_MEMORY;
					} 
				}  else if (ModernizedCProgram.Curl_strcasecompare(value, "opaque")) {
					.Curl_cfree(generatedOpaque);
					this.setOpaque(.Curl_cstrdup(content));
					if (!generatedOpaque) {
						return CURLE_OUT_OF_MEMORY;
					} 
				}  else if (ModernizedCProgram.Curl_strcasecompare(value, "qop")) {
					byte tok_buf = ((Object)0/* Tokenize the list and choose auth if possible, use a temporary
					           clone of the buffer since strtok_r() ruins it */);
					tmp = .Curl_cstrdup(content);
					if (!tmp) {
						return CURLE_OUT_OF_MEMORY;
					} 
					token = ModernizedCProgram.Curl_strtok_r(tmp, ",", tok_buf);
					while (token != ((Object)0)) {
						if (ModernizedCProgram.Curl_strcasecompare(token, "auth")) {
							foundAuth = 1;
						}  else if (ModernizedCProgram.Curl_strcasecompare(token, "auth-int")) {
							foundAuthInt = 1;
						} 
						token = ModernizedCProgram.Curl_strtok_r(((Object)0), ",", tok_buf);
					}
					.Curl_cfree(tmp);
					if (/* Select only auth or auth-int. Otherwise, ignore */foundAuth) {
						.Curl_cfree(generatedQop);
						this.setQop(.Curl_cstrdup("auth"));
						if (!generatedQop) {
							return CURLE_OUT_OF_MEMORY;
						} 
					}  else if (foundAuthInt) {
						.Curl_cfree(generatedQop);
						this.setQop(.Curl_cstrdup("auth-int"));
						if (!generatedQop) {
							return CURLE_OUT_OF_MEMORY;
						} 
					} 
				}  else if (ModernizedCProgram.Curl_strcasecompare(value, "algorithm")) {
					.Curl_cfree(generatedAlgorithm);
					this.setAlgorithm(.Curl_cstrdup(content));
					if (!generatedAlgorithm) {
						return CURLE_OUT_OF_MEMORY;
					} 
					if (ModernizedCProgram.Curl_strcasecompare(content, "MD5-sess")) {
						this.setAlgo(CURLDIGESTALGO_MD5SESS);
					}  else if (ModernizedCProgram.Curl_strcasecompare(content, "MD5")) {
						this.setAlgo(CURLDIGESTALGO_MD5);
					}  else if (ModernizedCProgram.Curl_strcasecompare(content, "SHA-256")) {
						this.setAlgo(CURLDIGESTALGO_SHA256);
					}  else if (ModernizedCProgram.Curl_strcasecompare(content, "SHA-256-SESS")) {
						this.setAlgo(CURLDIGESTALGO_SHA256SESS);
					}  else if (ModernizedCProgram.Curl_strcasecompare(content, "SHA-512-256")) {
						this.setAlgo(CURLDIGESTALGO_SHA512_256);
					}  else if (ModernizedCProgram.Curl_strcasecompare(content, "SHA-512-256-SESS")) {
						this.setAlgo(CURLDIGESTALGO_SHA512_256SESS);
					} else {
							return CURLE_BAD_CONTENT_ENCODING;
					} 
				}  else if (ModernizedCProgram.Curl_strcasecompare(value, "userhash")) {
					if (ModernizedCProgram.Curl_strcasecompare(content, "true")) {
						this.setUserhash(1/* Unknown specifier, ignore it! */);
					} 
				} 
			} else {
					break;
			} 
			while (chlg && (ModernizedCProgram.Curl_isspace((int)((byte)/* Pass all additional spaces here */chlg)))) {
				chlg++;
			}
			if ((byte)',' == /* Allow the list to be comma-separated */chlg) {
				chlg++;
			} 
		}
		Object generatedStale = this.getStale();
		if (before && !generatedStale) {
			return CURLE_BAD_CONTENT_ENCODING;
		} 
		if (!generatedNonce) {
			return CURLE_BAD_CONTENT_ENCODING;
		} 
		return CURLE_OK/*
		 * _Curl_auth_create_digest_http_message()
		 *
		 * This is used to generate a HTTP DIGEST response message ready for sending
		 * to the recipient.
		 *
		 * Parameters:
		 *
		 * data    [in]     - The session handle.
		 * userp   [in]     - The user name.
		 * passwdp [in]     - The user's password.
		 * request [in]     - The HTTP request.
		 * uripath [in]     - The path of the HTTP uri.
		 * digest  [in/out] - The digest data struct being used and modified.
		 * outptr  [in/out] - The address where a pointer to newly allocated memory
		 *                    holding the result will be stored upon completion.
		 * outlen  [out]    - The length of the output message.
		 *
		 * Returns CURLE_OK on success.
		 */;
	}
	public void Curl_auth_digest_cleanup() {
		Byte generatedNonce = this.getNonce();
		do {
			.Curl_cfree((generatedNonce));
			(generatedNonce) = ((Object)0);
		} while (0);
		Byte generatedCnonce = this.getCnonce();
		do {
			.Curl_cfree((generatedCnonce));
			(generatedCnonce) = ((Object)0);
		} while (0);
		Byte generatedRealm = this.getRealm();
		do {
			.Curl_cfree((generatedRealm));
			(generatedRealm) = ((Object)0);
		} while (0);
		Byte generatedOpaque = this.getOpaque();
		do {
			.Curl_cfree((generatedOpaque));
			(generatedOpaque) = ((Object)0);
		} while (0);
		Byte generatedQop = this.getQop();
		do {
			.Curl_cfree((generatedQop));
			(generatedQop) = ((Object)0);
		} while (0);
		Byte generatedAlgorithm = this.getAlgorithm();
		do {
			.Curl_cfree((generatedAlgorithm));
			(generatedAlgorithm) = ((Object)0);
		} while (0);
		this.setNc(0);
		this.setAlgo(/* default algorithm */CURLDIGESTALGO_MD5);
		this.setStale(/* default means normal, not stale */0);
		this.setUserhash(0/* !USE_WINDOWS_SSPI *//* CURL_DISABLE_CRYPTO_AUTH */);
	}
	public Byte getNonce() {
		return nonce;
	}
	public void setNonce(Byte newNonce) {
		nonce = newNonce;
	}
	public Byte getCnonce() {
		return cnonce;
	}
	public void setCnonce(Byte newCnonce) {
		cnonce = newCnonce;
	}
	public Byte getRealm() {
		return realm;
	}
	public void setRealm(Byte newRealm) {
		realm = newRealm;
	}
	public int getAlgo() {
		return algo;
	}
	public void setAlgo(int newAlgo) {
		algo = newAlgo;
	}
	public Byte getOpaque() {
		return opaque;
	}
	public void setOpaque(Byte newOpaque) {
		opaque = newOpaque;
	}
	public Byte getQop() {
		return qop;
	}
	public void setQop(Byte newQop) {
		qop = newQop;
	}
	public Byte getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(Byte newAlgorithm) {
		algorithm = newAlgorithm;
	}
	public int getNc() {
		return nc;
	}
	public void setNc(int newNc) {
		nc = newNc;
	}
	public Object getStale() {
		return stale;
	}
	public void setStale(Object newStale) {
		stale = newStale;
	}
	public Object getUserhash() {
		return userhash;
	}
	public void setUserhash(Object newUserhash) {
		userhash = newUserhash;
	}
}
/* copy of user/passwd used to make the identity for http_context.
     either may be NULL. */
