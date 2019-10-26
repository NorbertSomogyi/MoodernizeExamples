package application;

/**
     * This indicates that the size of the user buffer passed by the client is
     * insufficient for the requested operation.
     */
/**
     * This indicates that an invalid struct version was used by the client.
     */
/**
     * This indicates that ::NvEncMapInputResource() API failed to map the client
     * provided input resource.
     */
/**
     * This indicates encode driver requires more input buffers to produce an output
     * bitstream. If this error is returned from ::NvEncEncodePicture() API, this
     * is not a fatal error. If the client is encoding with B frames then,
     * ::NvEncEncodePicture() API might be buffering the input frame for re-ordering.
     *
     * A client operating in synchronous mode cannot call ::NvEncLockBitstream()
     * API on the output bitstream buffer if ::NvEncEncodePicture() returned the
     * ::NV_ENC_ERR_NEED_MORE_INPUT error code.
     * The client must continue providing input frames until encode driver returns
     * ::NV_ENC_SUCCESS. After receiving ::NV_ENC_SUCCESS status the client can call
     * ::NvEncLockBitstream() API on the output buffers in the same order in which
     * it has called ::NvEncEncodePicture().
     */
/**
     * This indicates that the HW encoder is busy encoding and is unable to encode
     * the input. The client should call ::NvEncEncodePicture() again after few
     * milliseconds.
     */
/**
     * This indicates that the completion event passed in ::NvEncEncodePicture()
     * API has not been registered with encoder driver using ::NvEncRegisterAsyncEvent().
     */
/**
     * This indicates that an unknown internal error has occurred.
     */
/**
     * This indicates that the client is attempting to use a feature
     * that is not available for the license type for the current system.
     */
/**
     * This indicates that the client is attempting to use a feature
     * that is not implemented for the current version.
     */
/**
     * This indicates that the ::NvEncRegisterResource API failed to register the resource.
     */
/**
     * This indicates that the client is attempting to unregister a resource
     * that has not been successfully registered.
     */
/**
     * This indicates that the client is attempting to unmap a resource
     * that has not been successfully mapped.
     */
/**
 * Encode Picture encode flags.
 */
public enum _NV_ENC_PIC_FLAGS {
	NV_ENC_PIC_FLAG_FORCEINTRA, 
	NV_ENC_PIC_FLAG_FORCEIDR, 
	NV_ENC_PIC_FLAG_OUTPUT_SPSPPS, 
	NV_ENC_PIC_FLAG_EOS
}
