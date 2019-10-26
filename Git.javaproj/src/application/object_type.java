package application;

/*
 * Values in this enum (except those outside the 3 bit range) are part
 * of pack file format. See Documentation/technical/pack-format.txt
 * for more information.
 */
public enum object_type {
	OBJ_BAD, 
	OBJ_NONE, 
	OBJ_COMMIT, 
	OBJ_TREE, 
	OBJ_BLOB, 
	OBJ_TAG, 
	OBJ_OFS_DELTA, 
	OBJ_REF_DELTA, 
	OBJ_ANY, 
	OBJ_MAX
}
