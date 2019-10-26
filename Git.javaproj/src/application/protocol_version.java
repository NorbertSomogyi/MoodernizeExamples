package application;

public enum protocol_version {
	protocol_unknown_version, 
	protocol_v0, 
	protocol_v1, 
	protocol_v2
}
/*
 * Used by a server to determine which protocol version should be used based on
 * a client's request, communicated via the 'GIT_PROTOCOL' environment variable
 * by setting appropriate values for the key 'version'.  If a client doesn't
 * request a particular protocol version, a default of 'protocol_v0' will be
 * used.
 */
/*
 * Used by a client to determine which protocol version the server is speaking
 * based on the server's initial response.
 */
/* PROTOCOL_H */
