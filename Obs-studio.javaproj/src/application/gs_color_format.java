package application;

public enum gs_color_format {
	GS_UNKNOWN, 
	GS_A8, 
	GS_R8, 
	GS_RGBA, 
	GS_BGRX, 
	GS_BGRA, 
	GS_R10G10B10A2, 
	GS_RGBA16, 
	GS_R16, 
	GS_RGBA16F, 
	GS_RGBA32F, 
	GS_RG16F, 
	GS_RG32F, 
	GS_R16F, 
	GS_R32F, 
	GS_DXT1, 
	GS_DXT3, 
	GS_DXT5, 
	GS_R8G8
}
/**
 * Draws a 2D sprite
 *
 *   If width or height is 0, the width or height of the texture will be used.
 * The flip value specifies whether the texture should be flipped on the U or V
 * axis with GS_FLIP_U and GS_FLIP_V.
 */
