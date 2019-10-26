package application;

/*
 * XZ decompressor
 *
 * Authors: Lasse Collin <lasse.collin@tukaani.org>
 *          Igor Pavlov <http://7-zip.org/>
 *
 * This file has been put into the public domain.
 * You can do whatever you want with this file.
 */
/* In Linux, this is used to make extern functions static when needed. */
/* In Linux, this is used to mark the functions with __init when needed. */
/**
 * enum xz_mode - Operation mode
 *
 * @XZ_SINGLE:              Single-call mode. This uses less RAM than
 *                          than multi-call modes, because the LZMA2
 *                          dictionary doesn't need to be allocated as
 *                          part of the decoder state. All required data
 *                          structures are allocated at initialization,
 *                          so xz_dec_run() cannot return XZ_MEM_ERROR.
 * @XZ_PREALLOC:            Multi-call mode with preallocated LZMA2
 *                          dictionary buffer. All data structures are
 *                          allocated at initialization, so xz_dec_run()
 *                          cannot return XZ_MEM_ERROR.
 * @XZ_DYNALLOC:            Multi-call mode. The LZMA2 dictionary is
 *                          allocated once the required size has been
 *                          parsed from the stream headers. If the
 *                          allocation fails, xz_dec_run() will return
 *                          XZ_MEM_ERROR.
 *
 * It is possible to enable support only for a subset of the above
 * modes at compile time by defining XZ_DEC_SINGLE, XZ_DEC_PREALLOC,
 * or XZ_DEC_DYNALLOC. The xz_dec kernel module is always compiled
 * with support for all operation modes, but the preboot code may
 * be built with fewer features to minimize code size.
 */
public enum xz_mode {
	XZ_SINGLE, 
	XZ_PREALLOC, 
	XZ_DYNALLOC
}
/**
 * enum xz_ret - Return codes
 * @XZ_OK:                  Everything is OK so far. More input or more
 *                          output space is required to continue. This
 *                          return code is possible only in multi-call mode
 *                          (XZ_PREALLOC or XZ_DYNALLOC).
 * @XZ_STREAM_END:          Operation finished successfully.
 * @XZ_UNSUPPORTED_CHECK:   Integrity check type is not supported. Decoding
 *                          is still possible in multi-call mode by simply
 *                          calling xz_dec_run() again.
 *                          Note that this return value is used only if
 *                          XZ_DEC_ANY_CHECK was defined at build time,
 *                          which is not used in the kernel. Unsupported
 *                          check types return XZ_OPTIONS_ERROR if
 *                          XZ_DEC_ANY_CHECK was not defined at build time.
 * @XZ_MEM_ERROR:           Allocating memory failed. This return code is
 *                          possible only if the decoder was initialized
 *                          with XZ_DYNALLOC. The amount of memory that was
 *                          tried to be allocated was no more than the
 *                          dict_max argument given to xz_dec_init().
 * @XZ_MEMLIMIT_ERROR:      A bigger LZMA2 dictionary would be needed than
 *                          allowed by the dict_max argument given to
 *                          xz_dec_init(). This return value is possible
 *                          only in multi-call mode (XZ_PREALLOC or
 *                          XZ_DYNALLOC); the single-call mode (XZ_SINGLE)
 *                          ignores the dict_max argument.
 * @XZ_FORMAT_ERROR:        File format was not recognized (wrong magic
 *                          bytes).
 * @XZ_OPTIONS_ERROR:       This implementation doesn't support the requested
 *                          compression options. In the decoder this means
 *                          that the header CRC32 matches, but the header
 *                          itself specifies something that we don't support.
 * @XZ_DATA_ERROR:          Compressed data is corrupt.
 * @XZ_BUF_ERROR:           Cannot make any progress. Details are slightly
 *                          different between multi-call and single-call
 *                          mode; more information below.
 *
 * In multi-call mode, XZ_BUF_ERROR is returned when two consecutive calls
 * to XZ code cannot consume any input and cannot produce any new output.
 * This happens when there is no new input available, or the output buffer
 * is full while at least one output byte is still pending. Assuming your
 * code is not buggy, you can get this error only when decoding a compressed
 * stream that is truncated or otherwise corrupt.
 *
 * In single-call mode, XZ_BUF_ERROR is returned only when the output buffer
 * is too small or the compressed input is corrupt in a way that makes the
 * decoder produce more output than the caller expected. When it is
 * (relatively) clear that the compressed input is truncated, XZ_DATA_ERROR
 * is used instead of XZ_BUF_ERROR.
 */
/**
 * xz_dec_run() - Run the XZ decoder
 * @s:          Decoder state allocated using xz_dec_init()
 * @b:          Input and output buffers
 *
 * The possible return values depend on build options and operation mode.
 * See enum xz_ret for details.
 *
 * Note that if an error occurs in single-call mode (return value is not
 * XZ_STREAM_END), b->in_pos and b->out_pos are not modified and the
 * contents of the output buffer from b->out[b->out_pos] onward are
 * undefined. This is true even after XZ_BUF_ERROR, because with some filter
 * chains, there may be a second pass over the output buffer, and this pass
 * cannot be properly done if the output buffer is truncated. Thus, you
 * cannot give the single-call decoder a too small buffer and then expect to
 * get that amount valid data from the beginning of the stream. You must use
 * the multi-call decoder if you don't want to uncompress the whole stream.
 */
