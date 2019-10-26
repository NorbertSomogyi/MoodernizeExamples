package application;

/**
 * The speaker layout describes where the speakers are located in the room.
 * For OBS it dictates:
 *  *  how many channels are available and
 *  *  which channels are used for which speakers.
 *
 * Standard channel layouts where retrieved from ffmpeg documentation at:
 *     https://trac.ffmpeg.org/wiki/AudioChannelManipulation
 */
public enum speaker_layout {
	SPEAKERS_UNKNOWN, 
	SPEAKERS_MONO, 
	SPEAKERS_STEREO, 
	SPEAKERS_2POINT1, 
	SPEAKERS_4POINT0, 
	SPEAKERS_4POINT1, 
	SPEAKERS_5POINT1, 
	SPEAKERS_7POINT1
}
/**< Unknown setting, fallback is stereo. */
/**< Channels: MONO */
/**< Channels: FL, FR */
