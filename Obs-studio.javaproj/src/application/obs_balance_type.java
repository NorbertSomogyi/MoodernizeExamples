package application;

public enum obs_balance_type {
	OBS_BALANCE_TYPE_SINE_LAW, 
	OBS_BALANCE_TYPE_SQUARE_LAW, 
	OBS_BALANCE_TYPE_LINEAR
}
/**
 * @name Source output flags
 *
 * These flags determine what type of data the source outputs and expects.
 * @{
 */
/**
 * Source has video.
 *
 * Unless SOURCE_ASYNC_VIDEO is specified, the source must include the
 * video_render callback in the source definition structure.
 */
/**
 * Source has audio.
 *
 * Use the obs_source_output_audio function to pass raw audio data, which will
 * be automatically converted and uploaded.  If used with SOURCE_ASYNC_VIDEO,
 * audio will automatically be synced up to the video output.
 */
/** Async video flag (use OBS_SOURCE_ASYNC_VIDEO) */
/**
 * Source passes raw video data via RAM.
 *
 * Use the obs_source_output_video function to pass raw video data, which will
 * be automatically uploaded at the specified timestamp.
 *
 * If this flag is specified, it is not necessary to include the video_render
 * callback.  However, if you wish to use that function as well, you must call
 * obs_source_getframe to get the current frame data, and
 * obs_source_releaseframe to release the data when complete.
 */
/**
 * Source uses custom drawing, rather than a default effect.
 *
 * If this flag is specified, the video_render callback will pass a NULL
 * effect, and effect-based filters will not use direct rendering.
 */
/**
 * Source supports interaction.
 *
 * When this is used, the source will receive interaction events
 * if they provide the necessary callbacks in the source definition structure.
 */
