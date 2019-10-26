package application;

/**
 * Encoder capabilities enumeration.
 */
public enum _NV_ENC_CAPS {
	NV_ENC_CAPS_NUM_MAX_BFRAMES, 
	NV_ENC_CAPS_SUPPORTED_RATECONTROL_MODES, 
	NV_ENC_CAPS_SUPPORT_FIELD_ENCODING, 
	NV_ENC_CAPS_SUPPORT_MONOCHROME, 
	NV_ENC_CAPS_SUPPORT_FMO, 
	NV_ENC_CAPS_SUPPORT_QPELMV, 
	NV_ENC_CAPS_SUPPORT_BDIRECT_MODE, 
	NV_ENC_CAPS_SUPPORT_CABAC, 
	NV_ENC_CAPS_SUPPORT_ADAPTIVE_TRANSFORM, 
	NV_ENC_CAPS_SUPPORT_RESERVED, 
	NV_ENC_CAPS_NUM_MAX_TEMPORAL_LAYERS, 
	NV_ENC_CAPS_SUPPORT_HIERARCHICAL_PFRAMES, 
	NV_ENC_CAPS_SUPPORT_HIERARCHICAL_BFRAMES, 
	NV_ENC_CAPS_LEVEL_MAX, 
	NV_ENC_CAPS_LEVEL_MIN, 
	NV_ENC_CAPS_SEPARATE_COLOUR_PLANE, 
	NV_ENC_CAPS_WIDTH_MAX, 
	NV_ENC_CAPS_HEIGHT_MAX, 
	NV_ENC_CAPS_SUPPORT_TEMPORAL_SVC, 
	NV_ENC_CAPS_SUPPORT_DYN_RES_CHANGE, 
	NV_ENC_CAPS_SUPPORT_DYN_BITRATE_CHANGE, 
	NV_ENC_CAPS_SUPPORT_DYN_FORCE_CONSTQP, 
	NV_ENC_CAPS_SUPPORT_DYN_RCMODE_CHANGE, 
	NV_ENC_CAPS_SUPPORT_SUBFRAME_READBACK, 
	NV_ENC_CAPS_SUPPORT_CONSTRAINED_ENCODING, 
	NV_ENC_CAPS_SUPPORT_INTRA_REFRESH, 
	NV_ENC_CAPS_SUPPORT_CUSTOM_VBV_BUF_SIZE, 
	NV_ENC_CAPS_SUPPORT_DYNAMIC_SLICE_MODE, 
	NV_ENC_CAPS_SUPPORT_REF_PIC_INVALIDATION, 
	NV_ENC_CAPS_PREPROC_SUPPORT, 
	NV_ENC_CAPS_ASYNC_ENCODE_SUPPORT, 
	NV_ENC_CAPS_MB_NUM_MAX, 
	NV_ENC_CAPS_MB_PER_SEC_MAX, 
	NV_ENC_CAPS_SUPPORT_YUV444_ENCODE, 
	NV_ENC_CAPS_SUPPORT_LOSSLESS_ENCODE, 
	NV_ENC_CAPS_SUPPORT_SAO, 
	NV_ENC_CAPS_SUPPORT_MEONLY_MODE, 
	NV_ENC_CAPS_SUPPORT_LOOKAHEAD, 
	NV_ENC_CAPS_SUPPORT_TEMPORAL_AQ, 
	NV_ENC_CAPS_SUPPORT_10BIT_ENCODE, 
	NV_ENC_CAPS_NUM_MAX_LTR_FRAMES, 
	NV_ENC_CAPS_SUPPORT_WEIGHTED_PREDICTION, 
	NV_ENC_CAPS_DYNAMIC_QUERY_ENCODER_CAPACITY, 
	NV_ENC_CAPS_SUPPORT_BFRAME_REF_MODE, 
	NV_ENC_CAPS_SUPPORT_EMPHASIS_LEVEL_MAP, 
	NV_ENC_CAPS_EXPOSED_COUNT
}
/**
     * Maximum number of B-Frames supported.
     */
/**
     * Rate control modes supported.
     * \n The API return value is a bitmask of the values in NV_ENC_PARAMS_RC_MODE.
     */
/**
     * Indicates HW support for field mode encoding.
     * \n 0 : Interlaced mode encoding is not supported.
     * \n 1 : Interlaced field mode encoding is supported.
     * \n 2 : Interlaced frame encoding and field mode encoding are both supported.
     */
/**
     * Indicates HW support for monochrome mode encoding.
     * \n 0 : Monochrome mode not supported.
     * \n 1 : Monochrome mode supported.
     */
/**
     * Indicates HW support for FMO.
     * \n 0 : FMO not supported.
     * \n 1 : FMO supported.
     */
/**
     * Indicates HW capability for Quarter pel motion estimation.
     * \n 0 : QuarterPel Motion Estimation not supported.
     * \n 1 : QuarterPel Motion Estimation supported.
     */
/**
     * H.264 specific. Indicates HW support for BDirect modes.
     * \n 0 : BDirect mode encoding not supported.
     * \n 1 : BDirect mode encoding supported.
     */
/**
     * H264 specific. Indicates HW support for CABAC entropy coding mode.
     * \n 0 : CABAC entropy coding not supported.
     * \n 1 : CABAC entropy coding supported.
     */
/**
     * Indicates HW support for Adaptive Transform.
     * \n 0 : Adaptive Transform not supported.
     * \n 1 : Adaptive Transform supported.
     */
/**
     * Reserved enum field.
     */
/**
     * Indicates HW support for encoding Temporal layers.
     * \n 0 : Encoding Temporal layers not supported.
     * \n 1 : Encoding Temporal layers supported.
     */
/**
     * Indicates HW support for Hierarchical P frames.
     * \n 0 : Hierarchical P frames not supported.
     * \n 1 : Hierarchical P frames supported.
     */
/**
     * Indicates HW support for Hierarchical B frames.
     * \n 0 : Hierarchical B frames not supported.
     * \n 1 : Hierarchical B frames supported.
     */
/**
     * Maximum Encoding level supported (See ::NV_ENC_LEVEL for details).
     */
/**
     * Minimum Encoding level supported (See ::NV_ENC_LEVEL for details).
     */
/**
     * Indicates HW support for separate colour plane encoding.
     * \n 0 : Separate colour plane encoding not supported.
     * \n 1 : Separate colour plane encoding supported.
     */
/**
     * Maximum output width supported.
     */
/**
     * Maximum output height supported.
     */
/**
     * Indicates Temporal Scalability Support.
     * \n 0 : Temporal SVC encoding not supported.
     * \n 1 : Temporal SVC encoding supported.
     */
/**
     * Indicates Dynamic Encode Resolution Change Support.
     * Support added from NvEncodeAPI version 2.0.
     * \n 0 : Dynamic Encode Resolution Change not supported.
     * \n 1 : Dynamic Encode Resolution Change supported.
     */
/**
     * Indicates Dynamic Encode Bitrate Change Support.
     * Support added from NvEncodeAPI version 2.0.
     * \n 0 : Dynamic Encode bitrate change not supported.
     * \n 1 : Dynamic Encode bitrate change supported.
     */
/**
     * Indicates Forcing Constant QP On The Fly Support.
     * Support added from NvEncodeAPI version 2.0.
     * \n 0 : Forcing constant QP on the fly not supported.
     * \n 1 : Forcing constant QP on the fly supported.
     */
/**
     * Indicates Dynamic rate control mode Change Support.
     * \n 0 : Dynamic rate control mode change not supported.
     * \n 1 : Dynamic rate control mode change supported.
     */
/**
     * Indicates Subframe readback support for slice-based encoding.
     * \n 0 : Subframe readback not supported.
     * \n 1 : Subframe readback supported.
     */
/**
     * Indicates Constrained Encoding mode support.
     * Support added from NvEncodeAPI version 2.0.
     * \n 0 : Constrained encoding mode not supported.
     * \n 1 : Constarined encoding mode supported.
     * If this mode is supported client can enable this during initialisation.
     * Client can then force a picture to be coded as constrained picture where
     * each slice in a constrained picture will have constrained_intra_pred_flag set to 1
     * and disable_deblocking_filter_idc will be set to 2 and prediction vectors for inter
     * macroblocks in each slice will be restricted to the slice region.
     */
