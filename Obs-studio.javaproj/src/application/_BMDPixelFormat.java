package application;

public enum _BMDPixelFormat {
	bmdFormat8BitYUV, 
	bmdFormat10BitYUV, 
	bmdFormat8BitARGB, 
	bmdFormat8BitBGRA, 
	bmdFormat10BitRGB, 
	bmdFormat12BitRGB, 
	bmdFormat12BitRGBLE, 
	bmdFormat10BitRGBXLE, 
	bmdFormat10BitRGBX, 
	bmdFormatH265, 
	bmdFormatDNxHR, 
	bmdFormat12BitRAWGRBG, 
	bmdFormat12BitRAWJPEG
}
// Big-endian RGB 10-bit per component with SMPTE video levels (64-960). Packed as 2:10:10:10
// Big-endian RGB 12-bit per component with full range (0-4095). Packed as 12-bit per component
// Little-endian RGB 12-bit per component with full range (0-4095). Packed as 12-bit per component
// Little-endian 10-bit RGB with SMPTE video levels (64-940)
// Big-endian 10-bit RGB with SMPTE video levels (64-940)
// High Efficiency Video Coding (HEVC/h.265)
