package application;

/*
 * .xz Stream decoder
 *
 * Author: Lasse Collin <lasse.collin@tukaani.org>
 *
 * This file has been put into the public domain.
 * You can do whatever you want with this file.
 */
/* Hash used to validate the Index field */
public class xz_dec_hash {
	private Object unpadded;
	private Object uncompressed;
	private Object crc32;
	
	public xz_dec_hash(Object unpadded, Object uncompressed, Object crc32) {
		setUnpadded(unpadded);
		setUncompressed(uncompressed);
		setCrc32(crc32);
	}
	public xz_dec_hash() {
	}
	
	public Object getUnpadded() {
		return unpadded;
	}
	public void setUnpadded(Object newUnpadded) {
		unpadded = newUnpadded;
	}
	public Object getUncompressed() {
		return uncompressed;
	}
	public void setUncompressed(Object newUncompressed) {
		uncompressed = newUncompressed;
	}
	public Object getCrc32() {
		return crc32;
	}
	public void setCrc32(Object newCrc32) {
		crc32 = newCrc32;
	}
}
