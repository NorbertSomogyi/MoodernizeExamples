package application;

public enum obs_group_type {
	OBS_COMBO_INVALID, 
	OBS_GROUP_NORMAL, 
	OBS_GROUP_CHECKABLE
}
/* ------------------------------------------------------------------------- */
/**
 * Optional callback for when a property is modified.  If the properties
 * need to be refreshed due to changes to the property layout, return true,
 * otherwise return false.
 */
