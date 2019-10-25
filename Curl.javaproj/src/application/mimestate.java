package application;

/* Readback state tokens. */
/* Mime readback state. */
/* Current state token. */
public enum mimestate {
	MIMESTATE_BEGIN, 
	MIMESTATE_CURLHEADERS, 
	MIMESTATE_USERHEADERS, 
	MIMESTATE_EOH, 
	MIMESTATE_BODY, 
	MIMESTATE_BOUNDARY1, 
	MIMESTATE_BOUNDARY2, 
	MIMESTATE_CONTENT, 
	MIMESTATE_END, 
	MIMESTATE_LAST
}
/* Readback has not yet started. */
/* In curl-generated headers. */
/* In caller's supplied headers. */
/* End of headers. */
/* Placeholder. */
/* In boundary prefix. */
/* In boundary. */
