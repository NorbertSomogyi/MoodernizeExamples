package application;

/**
	 * @brief Logarithmic fader
	 */
/**
 * @brief Peak meter types
 */
public enum obs_peak_meter_type {
	SAMPLE_PEAK_METER, 
	TRUE_PEAK_METER
}
/**
	 * @brief A simple peak meter measuring the maximum of all samples.
	 *
	 * This was a very common type of peak meter used for audio, but
	 * is not very accurate with regards to further audio processing.
	 */
/**
	 * @brief An accurate peak meter measure the maximum of inter-samples.
	 *
	 * This meter is more computational intensive due to 4x oversampling
	 * to determine the true peak to an accuracy of +/- 0.5 dB.
	 */
/**
 * @brief Set the update interval for the volume meter
 * @param volmeter pointer to the volume meter object
 * @param ms update interval in ms
 *
 * This sets the update interval in milliseconds that should be processed before
 * the resulting values are emitted by the levels_updated signal. The resulting
 * number of audio samples is rounded to an integer.
 *
 * Please note that due to way obs does receive audio data from the sources
 * this is no hard guarantee for the timing of the signal itself. When the
 * volume meter receives a chunk of data that is multiple the size of the sample
 * interval, all data will be sampled and the values updated accordingly, but
 * only the signal for the last segment is actually emitted.
 * On the other hand data might be received in a way that will cause the signal
 * to be emitted in shorter intervals than specified here under some
 * circumstances.
 */
