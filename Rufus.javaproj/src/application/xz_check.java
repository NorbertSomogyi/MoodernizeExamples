package application;

/*
 * Definitions for handling the .xz file format
 *
 * Author: Lasse Collin <lasse.collin@tukaani.org>
 *
 * This file has been put into the public domain.
 * You can do whatever you want with this file.
 */
/*
 * See the .xz file format specification at
 * http://tukaani.org/xz/xz-file-format.txt
 * to understand the container format.
 */
/*
 * Variable-length integer can hold a 63-bit unsigned integer or a special
 * value indicating that the value is unknown.
 *
 * Experimental: vli_type can be defined to uint32_t to save a few bytes
 * in code size (no effect on speed). Doing so limits the uncompressed and
 * compressed size of the file to less than 256 MiB and may also weaken
 * error detection slightly.
 */
/* Maximum encoded size of a VLI */
/* Integrity Check types */
public enum xz_check {
	XZ_CHECK_NONE, 
	XZ_CHECK_CRC32, 
	XZ_CHECK_CRC64, 
	XZ_CHECK_SHA256
}
