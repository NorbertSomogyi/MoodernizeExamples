package application;

/* Append a null-terminated string to an SMB message */
/* SMB is mostly little endian */
/* SMB request state */
public enum smb_req_state {
	SMB_REQUESTING, 
	SMB_TREE_CONNECT, 
	SMB_OPEN, 
	SMB_DOWNLOAD, 
	SMB_UPLOAD, 
	SMB_CLOSE, 
	SMB_TREE_DISCONNECT, 
	SMB_DONE
}
