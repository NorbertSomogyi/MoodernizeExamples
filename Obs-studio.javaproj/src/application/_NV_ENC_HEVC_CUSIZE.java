package application;

/**
     * Indicates Intra Refresh Mode Support.
     * Support added from NvEncodeAPI version 2.0.
     * \n 0 : Intra Refresh Mode not supported.
     * \n 1 : Intra Refresh Mode supported.
     */
/**
     * Indicates Custom VBV Bufer Size support. It can be used for capping frame size.
     * Support added from NvEncodeAPI version 2.0.
     * \n 0 : Custom VBV buffer size specification from client, not supported.
     * \n 1 : Custom VBV buffer size specification from client, supported.
     */
/**
     * Indicates Dynamic Slice Mode Support.
     * Support added from NvEncodeAPI version 2.0.
     * \n 0 : Dynamic Slice Mode not supported.
     * \n 1 : Dynamic Slice Mode supported.
     */
/**
     * Indicates Reference Picture Invalidation Support.
     * Support added from NvEncodeAPI version 2.0.
     * \n 0 : Reference Picture Invalidation not supported.
     * \n 1 : Reference Picture Invalidation supported.
     */
/**
     * Indicates support for PreProcessing.
     * The API return value is a bitmask of the values defined in ::NV_ENC_PREPROC_FLAGS
     */
/**
    * Indicates support Async mode.
    * \n 0 : Async Encode mode not supported.
    * \n 1 : Async Encode mode supported.
    */
/**
     * Maximum MBs per frame supported.
     */
/**
     * Maximum aggregate throughput in MBs per sec.
     */
/**
     * Indicates HW support for YUV444 mode encoding.
     * \n 0 : YUV444 mode encoding not supported.
     * \n 1 : YUV444 mode encoding supported.
     */
/**
     * Indicates HW support for lossless encoding.
     * \n 0 : lossless encoding not supported.
     * \n 1 : lossless encoding supported.
     */
/**
     * Indicates HW support for Sample Adaptive Offset.
     * \n 0 : SAO not supported.
     * \n 1 : SAO encoding supported.
     */
/**
     * Indicates HW support for MEOnly Mode.
     * \n 0 : MEOnly Mode not supported.
     * \n 1 : MEOnly Mode supported for I and P frames.
     * \n 2 : MEOnly Mode supported for I, P and B frames.
     */
/**
     * Indicates HW support for lookahead encoding (enableLookahead=1).
     * \n 0 : Lookahead not supported.
     * \n 1 : Lookahead supported.
     */
/**
     * Indicates HW support for temporal AQ encoding (enableTemporalAQ=1).
     * \n 0 : Temporal AQ not supported.
     * \n 1 : Temporal AQ supported.
     */
/**
     * Indicates HW support for 10 bit encoding.
     * \n 0 : 10 bit encoding not supported.
     * \n 1 : 10 bit encoding supported.
     */
/**
     * Maximum number of Long Term Reference frames supported
     */
/**
     * Indicates HW support for Weighted Predicition.
     * \n 0 : Weighted Predicition not supported.
     * \n 1 : Weighted Predicition supported.
     */
/**
     * On managed (vGPU) platforms (Windows only), this API, in conjunction with other GRID Management APIs, can be used
     * to estimate the residual capacity of the hardware encoder on the GPU as a percentage of the total available encoder capacity.
     * This API can be called at any time; i.e. during the encode session or before opening the encode session.
     * If the available encoder capacity is returned as zero, applications may choose to switch to software encoding
     * and continue to call this API (e.g. polling once per second) until capacity becomes available.
     *
     * On baremetal (non-virtualized GPU) and linux platforms, this API always returns 100.
     */
/**
     * Indicates B as refererence support.
     * \n 0 : B as reference is not supported.
     * \n 1 : each B-Frame as reference is supported.
     * \n 2 : only Middle B-frame as reference is supported.
     */
/**
     * Indicates HW support for Emphasis Level Map based delta QP computation.
     * \n 0 : Emphasis Level Map based delta QP not supported.
     * \n 1 : Emphasis Level Map based delta QP is supported.
     */
/**
     * Reserved - Not to be used by clients.
     */
/**
 *  HEVC CU SIZE
 */
public enum _NV_ENC_HEVC_CUSIZE {
	NV_ENC_HEVC_CUSIZE_AUTOSELECT, 
	NV_ENC_HEVC_CUSIZE_8x8, 
	NV_ENC_HEVC_CUSIZE_16x16, 
	NV_ENC_HEVC_CUSIZE_32x32, 
	NV_ENC_HEVC_CUSIZE_64x64
}
