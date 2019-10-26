package application;

/* last in list */
/* These enums are for use with the CURLOPT_NETRC option. */
public enum CURL_NETRC_OPTION {
	CURL_NETRC_IGNORED, 
	CURL_NETRC_OPTIONAL, 
	CURL_NETRC_REQUIRED, 
	CURL_NETRC_LAST
}
/* The .netrc will never be read.
                           * This is the default. */
/* A user:password in the URL will be preferred
                           * to one in the .netrc. */
/* A user:password in the URL will be ignored.
                           * Unless one is set programmatically, the .netrc
                           * will be queried. */
