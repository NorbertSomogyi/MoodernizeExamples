package application;

public enum obs_base_effect {
	OBS_EFFECT_DEFAULT, 
	OBS_EFFECT_DEFAULT_RECT, 
	OBS_EFFECT_OPAQUE, 
	OBS_EFFECT_SOLID, 
	OBS_EFFECT_BICUBIC, 
	OBS_EFFECT_LANCZOS, 
	OBS_EFFECT_BILINEAR_LOWRES, 
	OBS_EFFECT_PREMULTIPLIED_ALPHA, 
	OBS_EFFECT_REPEAT, 
	OBS_EFFECT_AREA
}
/**< RGB/YUV */
/**< RGB/YUV (using texture_rect) */
/**< RGB/YUV (alpha set to 1.0) */
/**< RGB/YUV (solid color only) */
/**< Bicubic downscale */
/**< Lanczos downscale */
/**< Bilinear low resolution downscale */
