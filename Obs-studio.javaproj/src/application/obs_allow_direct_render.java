package application;

/**
 * Used with obs_source_process_filter to specify whether the filter should
 * render the source directly with the specified effect, or whether it should
 * render it to a texture
 */
public enum obs_allow_direct_render {
	OBS_NO_DIRECT_RENDERING, 
	OBS_ALLOW_DIRECT_RENDERING
}
/**
 * Draws the filter.
 *
 * Before calling this function, first call obs_source_process_filter_begin and
 * then set the effect parameters, and then call this function to finalize the
 * filter.
 */
