package application;

/* this is the set of return values expected from the curl_sshkeycallback
   callback */
public enum curl_khstat {
	CURLKHSTAT_FINE_ADD_TO_FILE, 
	CURLKHSTAT_FINE, 
	CURLKHSTAT_REJECT, 
	CURLKHSTAT_DEFER, 
	CURLKHSTAT_LAST
}
/* reject the connection, return an error */
/* do not accept it, but we can't answer right now so
                        this causes a CURLE_DEFER error but otherwise the
                        connection will be left intact etc */
