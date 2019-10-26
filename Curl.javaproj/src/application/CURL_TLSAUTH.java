package application;

public enum CURL_TLSAUTH {
	CURL_TLSAUTH_NONE, 
	CURL_TLSAUTH_SRP, 
	CURL_TLSAUTH_LAST
}
/* never use, keep last */
/* symbols to use with CURLOPT_POSTREDIR.
   CURL_REDIR_POST_301, CURL_REDIR_POST_302 and CURL_REDIR_POST_303
   can be bitwise ORed so that CURL_REDIR_POST_301 | CURL_REDIR_POST_302
   | CURL_REDIR_POST_303 == CURL_REDIR_POST_ALL */
