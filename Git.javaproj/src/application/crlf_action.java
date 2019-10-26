package application;

/*
 * convert.c - convert a file when checking it out and checking it in.
 *
 * This should use the pathname to decide on whether it wants to do some
 * more interesting conversions (automatic gzip/unzip, general format
 * conversions etc etc), but by default it just does automatic CRLF<->LF
 * translation when the "text" attribute or "auto_crlf" option is set.
 */
/* Stat bits: When BIN is set, the txt bits are unset */
/* What attr says */
/* When no attr is set, use core.autocrlf */
public enum crlf_action {
	CRLF_UNDEFINED, 
	CRLF_BINARY, 
	CRLF_TEXT, 
	CRLF_TEXT_INPUT, 
	CRLF_TEXT_CRLF, 
	CRLF_AUTO, 
	CRLF_AUTO_INPUT, 
	CRLF_AUTO_CRLF
}
