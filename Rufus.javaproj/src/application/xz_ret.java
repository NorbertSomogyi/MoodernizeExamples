package application;

public enum xz_ret {
	XZ_OK, 
	XZ_STREAM_END, 
	XZ_UNSUPPORTED_CHECK, 
	XZ_MEM_ERROR, 
	XZ_MEMLIMIT_ERROR, 
	XZ_FORMAT_ERROR, 
	XZ_OPTIONS_ERROR, 
	XZ_DATA_ERROR, 
	XZ_BUF_ERROR, 
	XZ_BUF_FULL
}
/**
 * struct xz_buf - Passing input and output buffers to XZ code
 * @in:         Beginning of the input buffer. This may be NULL if and only
 *              if in_pos is equal to in_size.
 * @in_pos:     Current position in the input buffer. This must not exceed
 *              in_size.
 * @in_size:    Size of the input buffer
 * @out:        Beginning of the output buffer. This may be NULL if and only
 *              if out_pos is equal to out_size.
 * @out_pos:    Current position in the output buffer. This must not exceed
 *              out_size.
 * @out_size:   Size of the output buffer
 *
 * Only the contents of the output buffer from out[out_pos] onward, and
 * the variables in_pos and out_pos are modified by the XZ code.
 */
/**
 * xz_dec_reset() - Reset an already allocated decoder state
 * @s:          Decoder state allocated using xz_dec_init()
 *
 * This function can be used to reset the multi-call decoder state without
 * freeing and reallocating memory with xz_dec_end() and xz_dec_init().
 *
 * In single-call mode, xz_dec_reset() is always called in the beginning of
 * xz_dec_run(). Thus, explicit call to xz_dec_reset() is useful only in
 * multi-call mode.
 */
