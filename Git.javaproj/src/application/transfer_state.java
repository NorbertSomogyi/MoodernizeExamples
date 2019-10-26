package application;

public enum transfer_state {
	NEED_FETCH, 
	RUN_FETCH_LOOSE, 
	RUN_FETCH_PACKED, 
	NEED_PUSH, 
	RUN_MKCOL, 
	RUN_PUT, 
	RUN_MOVE, 
	ABORTED, 
	COMPLETE
}
