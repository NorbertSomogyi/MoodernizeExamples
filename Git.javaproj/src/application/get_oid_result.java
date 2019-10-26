package application;

public enum get_oid_result {
	FOUND, 
	MISSING_OBJECT, 
	SHORT_NAME_AMBIGUOUS, 
	DANGLING_SYMLINK, 
	SYMLINK_LOOP, 
	NOT_DIR
}
