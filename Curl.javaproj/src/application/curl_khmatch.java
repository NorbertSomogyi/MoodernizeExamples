package application;

/* not for use, only a marker for last-in-list */
/* this is the set of status codes pass in to the callback */
/* libcurl's view on the keys */
public enum curl_khmatch {
	CURLKHMATCH_OK, 
	CURLKHMATCH_MISMATCH, 
	CURLKHMATCH_MISSING, 
	CURLKHMATCH_LAST
}
/* match */
/* host found, key mismatch! */
/* no matching host/key found */
/* not for use, only a marker for last-in-list */
/* custom pointer passed from app */
/* parameter for the CURLOPT_USE_SSL option */
/* do not attempt to use SSL */
/* try using SSL, proceed anyway otherwise */
/* SSL for the control connection or fail */
/* SSL for all communication or fail */
/* not an option, never use */
/* Definition of bits for the CURLOPT_SSL_OPTIONS argument: */
/* - ALLOW_BEAST tells libcurl to allow the BEAST SSL vulnerability in the
   name of improving interoperability with older servers. Some SSL libraries
   have introduced work-arounds for this flaw but those work-arounds sometimes
   make the SSL communication fail. To regain functionality with those broken
   servers, a user can this way allow the vulnerability back. */
/* - NO_REVOKE tells libcurl to disable certificate revocation checks for those
   SSL backends where such behavior is present. */
/* The default connection attempt delay in milliseconds for happy eyeballs.
   CURLOPT_HAPPY_EYEBALLS_TIMEOUT_MS.3 and happy-eyeballs-timeout-ms.d document
   this value, keep them in sync. */
/* The default connection upkeep interval in milliseconds. */
/* define this to test if your app builds with all
                          the obsolete stuff removed! */
/* Backwards compatibility with older names */
/* These are scheduled to disappear by 2009 */
/* Backwards compatibility with older names */
/* These are scheduled to disappear by 2009 */
/*!CURL_NO_OLDIES*/
/* parameter for the CURLOPT_FTP_SSL_CCC option */
/* do not send CCC */
/* Let the server initiate the shutdown */
/* Initiate the shutdown */
/* not an option, never use */
/* parameter for the CURLOPT_FTPSSLAUTH option */
/* let libcurl decide */
/* use "AUTH SSL" */
/* use "AUTH TLS" */
/* not an option, never use */
/* parameter for the CURLOPT_FTP_CREATE_MISSING_DIRS option */
/* do NOT create missing dirs! */
/* (FTP/SFTP) if CWD fails, try MKD and then CWD
                               again if MKD succeeded, for SFTP this does
                               similar magic */
/* (FTP only) if CWD fails, try MKD and then CWD
                               again even if MKD failed! */
/* not an option, never use */
/* parameter for the CURLOPT_FTP_FILEMETHOD option */
/* let libcurl pick */
/* single CWD operation for each path part */
/* no CWD at all */
/* one CWD to full dir, then work on file */
/* not an option, never use */
