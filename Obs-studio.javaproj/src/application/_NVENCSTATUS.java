package application;

public enum _NVENCSTATUS {
	NV_ENC_SUCCESS, 
	NV_ENC_ERR_NO_ENCODE_DEVICE, 
	NV_ENC_ERR_UNSUPPORTED_DEVICE, 
	NV_ENC_ERR_INVALID_ENCODERDEVICE, 
	NV_ENC_ERR_INVALID_DEVICE, 
	NV_ENC_ERR_DEVICE_NOT_EXIST, 
	NV_ENC_ERR_INVALID_PTR, 
	NV_ENC_ERR_INVALID_EVENT, 
	NV_ENC_ERR_INVALID_PARAM, 
	NV_ENC_ERR_INVALID_CALL, 
	NV_ENC_ERR_OUT_OF_MEMORY, 
	NV_ENC_ERR_ENCODER_NOT_INITIALIZED, 
	NV_ENC_ERR_UNSUPPORTED_PARAM, 
	NV_ENC_ERR_LOCK_BUSY, 
	NV_ENC_ERR_NOT_ENOUGH_BUFFER, 
	NV_ENC_ERR_INVALID_VERSION, 
	NV_ENC_ERR_MAP_FAILED, 
	NV_ENC_ERR_NEED_MORE_INPUT, 
	NV_ENC_ERR_ENCODER_BUSY, 
	NV_ENC_ERR_EVENT_NOT_REGISTERD, 
	NV_ENC_ERR_GENERIC, 
	NV_ENC_ERR_INCOMPATIBLE_CLIENT_KEY, 
	NV_ENC_ERR_UNIMPLEMENTED, 
	NV_ENC_ERR_RESOURCE_REGISTER_FAILED, 
	NV_ENC_ERR_RESOURCE_NOT_REGISTERED, 
	NV_ENC_ERR_RESOURCE_NOT_MAPPED
}
/**
     * This indicates that API call returned with no errors.
     */
/**
     * This indicates that no encode capable devices were detected.
     */
/**
     * This indicates that devices pass by the client is not supported.
     */
/**
     * This indicates that the encoder device supplied by the client is not
     * valid.
     */
/**
     * This indicates that device passed to the API call is invalid.
     */
/**
     * This indicates that device passed to the API call is no longer available and
     * needs to be reinitialized. The clients need to destroy the current encoder
     * session by freeing the allocated input output buffers and destroying the device
     * and create a new encoding session.
     */
/**
     * This indicates that one or more of the pointers passed to the API call
     * is invalid.
     */
/**
     * This indicates that completion event passed in ::NvEncEncodePicture() call
     * is invalid.
     */
/**
     * This indicates that one or more of the parameter passed to the API call
     * is invalid.
     */
/**
     * This indicates that an API call was made in wrong sequence/order.
     */
/**
     * This indicates that the API call failed because it was unable to allocate
     * enough memory to perform the requested operation.
     */
/**
     * This indicates that the encoder has not been initialized with
     * ::NvEncInitializeEncoder() or that initialization has failed.
     * The client cannot allocate input or output buffers or do any encoding
     * related operation before successfully initializing the encoder.
     */
/**
     * This indicates that an unsupported parameter was passed by the client.
     */
/**
     * This indicates that the ::NvEncLockBitstream() failed to lock the output
     * buffer. This happens when the client makes a non blocking lock call to
     * access the output bitstream by passing NV_ENC_LOCK_BITSTREAM::doNotWait flag.
     * This is not a fatal error and client should retry the same operation after
     * few milliseconds.
     */
