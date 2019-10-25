package application;

/* expect 100 continue state */
public enum expect100 {
	EXP100_SEND_DATA, 
	EXP100_AWAITING_CONTINUE, 
	EXP100_SENDING_REQUEST, 
	EXP100_FAILED
}
/* enough waiting, just send the body now */
/* waiting for the 100 Continue header */
/* still sending the request but will wait for
                                 the 100 header once done with the request */
