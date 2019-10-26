package application;

public enum sockmode {
	PASSIVE_LISTEN, 
	PASSIVE_CONNECT, 
	ACTIVE, 
	ACTIVE_DISCONNECT
}
/* as a server waiting for connections */
/* as a server, connected to a client */
/* as a client, connected to a server */
/* as a client, disconnected from server */
/* do-nothing macro replacement for systems which lack siginterrupt() */
/* vars used to keep around previous signal handlers */
