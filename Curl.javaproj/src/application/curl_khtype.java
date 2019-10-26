package application;

/* Used for CURLOPT_SOCKS5_AUTH to stay terminologically correct */
/* all types supported by the server */
/* none allowed, silly but complete */
/* public/private key files */
/* password */
/* host key files */
/* keyboard interactive */
/* agent (ssh-agent, pageant...) */
/* gssapi (kerberos, ...) */
/* no delegation (default) */
/* if permitted by policy */
/* delegate always */
public enum curl_khtype {
	CURLKHTYPE_UNKNOWN, 
	CURLKHTYPE_RSA1, 
	CURLKHTYPE_RSA, 
	CURLKHTYPE_DSS, 
	CURLKHTYPE_ECDSA, 
	CURLKHTYPE_ED25519
}
