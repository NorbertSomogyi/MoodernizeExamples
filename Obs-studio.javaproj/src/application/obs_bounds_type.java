package application;

/**
 * Used with scene items to indicate the type of bounds to use for scene items.
 * Mostly determines how the image will be scaled within those bounds, or
 * whether to use bounds at all.
 */
public enum obs_bounds_type {
	OBS_BOUNDS_NONE, 
	OBS_BOUNDS_STRETCH, 
	OBS_BOUNDS_SCALE_INNER, 
	OBS_BOUNDS_SCALE_OUTER, 
	OBS_BOUNDS_SCALE_TO_WIDTH, 
	OBS_BOUNDS_SCALE_TO_HEIGHT, 
	OBS_BOUNDS_MAX_ONLY
}
/**< no bounds */
/**< stretch (ignores base scale) */
/**< scales to inner rectangle */
/**< scales to outer rectangle */
/**< scales to the width  */
