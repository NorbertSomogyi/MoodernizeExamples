package application;

/* Action type, for progress bar breakdown */
public enum action_type {
	OP_NOOP_WITH_TASKBAR, 
	OP_NOOP, 
	OP_INIT, 
	OP_ANALYZE_MBR, 
	OP_BADBLOCKS, 
	OP_ZERO_MBR, 
	OP_PARTITION, 
	OP_FORMAT, 
	OP_CREATE_FS, 
	OP_FIX_MBR, 
	OP_FILE_COPY, 
	OP_FINALIZE, 
	OP_MAX
}
