package application;

/*
 * The list of defined filters for list-objects.
 */
public enum list_objects_filter_choice {
	LOFC_DISABLED, 
	LOFC_BLOB_NONE, 
	LOFC_BLOB_LIMIT, 
	LOFC_TREE_DEPTH, 
	LOFC_SPARSE_OID, 
	LOFC_COMBINE, 
	LOFC__COUNT
}
/*
	 * Choice is LOFC_DISABLED because "--no-filter" was requested.
	 */
