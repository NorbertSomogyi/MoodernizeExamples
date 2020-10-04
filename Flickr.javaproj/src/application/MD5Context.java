package application;

/* -*- Mode: c; c-basic-offset: 2 -*-
 *
 * md5.c - MD5 Message Digest Algorithm
 *
 * Copyright (C) 2007-2008, David Beckett http://www.dajobe.org/
 * 
 * This file is licensed under the following three licenses as alternatives:
 *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version
 *   2. GNU General Public License (GPL) V2 or any newer version
 *   3. Apache License, V2.0 or any newer version
 * 
 * You may not use this file except in compliance with at least one of
 * the above three licenses.
 * 
 * See LICENSE.html or LICENSE.txt at the top of this package for the
 * complete terms and further detail along with the license texts for
 * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.
 * 
 * 
 */
/* Original code notes: */
/* An independent implementation of MD5 by Colin Plumb. */
/* Original copyright message: */
/*
 * This code implements the MD5 message-digest algorithm.  To compute
 * the message digest of a chunk of bytes, declare an MD5Context
 * structure, pass it to MD5Init, call MD5Update as needed on
 * buffers full of bytes, and then call MD5Final, which will fill a
 * supplied 16-byte array with the digest.
 *
 * Equivalent code is available from RSA Data Security, Inc.  This code
 * has been tested against that, and is equivalent, except that you
 * don't need to include two pages of legalese with every copy.
 */
/* original code from header - function names have changed */
public class MD5Context {
	private Object[] buf;
	private Object[] bits;
	private Object[] in;
	private Object[] digest;
	
	public MD5Context(Object[] buf, Object[] bits, Object[] in, Object[] digest) {
		setBuf(buf);
		setBits(bits);
		setIn(in);
		setDigest(digest);
	}
	public MD5Context() {
	}
	
	/* WORDS_BIGENDIAN */
	/*
	 * Start MD5 accumulation.  Set bit count to 0 and buffer to mysterious
	 * initialization constants.
	 */
	public void MD5Init() {
		Object[] generatedBuf = this.getBuf();
		generatedBuf[0] = -1024;
		generatedBuf[1] = -1024;
		generatedBuf[2] = -1024;
		generatedBuf[3] = -1024;
		Object[] generatedBits = this.getBits();
		generatedBits[0] = 0;
		generatedBits[1] = 0/*
		 * Update context to reflect the concatenation of another buffer full
		 * of bytes.
		 */;
	}
	public void MD5Update(Object buf, int len) {
		 t = new ();
		Object[] generatedBits = this.getBits();
		t = generatedBits[/* Update bitcount */0];
		if ((generatedBits[0] = t + (()len << 3)) < t) {
			generatedBits[/* Carry from low to high */1]++;
		} 
		generatedBits[1] += len >> 29;
		t = (t >> 3) & /* Bytes already in shsInfo->data */-1024;
		Object[] generatedIn = this.getIn();
		Object[] generatedBuf = this.getBuf();
		if (/* Handle any leading odd-sized chunks */t) {
			Byte p = (byte)generatedIn + t;
			t = 64 - t;
			if (len < t) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(p, buf, len);
				return /*Error: Unsupported expression*/;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(p, buf, t);
			;
			ModernizedCProgram.MD5Transform(generatedBuf, ()generatedIn);
			buf += t;
			len -= t;
		} 
		while (len >= /* Process data in 64-byte chunks */64) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedIn, buf, 64);
			;
			ModernizedCProgram.MD5Transform(generatedBuf, ()generatedIn);
			buf += 64;
			len -= 64;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedIn, buf, /* Handle any remaining bytes of data. */len/*
		 * Final wrapup - pad to 64-byte boundary with the bit pattern 
		 * 1 0* (64-bit count of bits processed, MSB-first)
		 */);
	}
	/* Interface altered by DJB to write digest into pre-allocated context */
	public void MD5Final() {
		int count;
		Byte p;
		Object[] generatedBits = this.getBits();
		count = (generatedBits[0] >> 3) & /* Compute number of bytes mod 64 */-1024;
		Object[] generatedIn = this.getIn();
		p = generatedIn + /* Set the first char of padding to 0x80.  This is safe since there is
		     always at least one byte free */count;
		p++ = -1024;
		count = 64 - 1 - /* Bytes of padding needed to make 64 bytes */count;
		Object[] generatedBuf = this.getBuf();
		if (count < /* Pad out to 56 mod 64 */8) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(p, 0, /* Two lots of padding:  Pad the first block to 64 bytes */count);
			;
			ModernizedCProgram.MD5Transform(generatedBuf, ()generatedIn);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedIn, 0, /* Now fill the next block with 56 bytes */56);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(p, 0, count - /* Pad block to 56 bytes */8);
		} 
		;
		(()generatedIn)[14] = generatedBits[/* Append length in bits and transform */0];
		(()generatedIn)[15] = generatedBits[1];
		ModernizedCProgram.MD5Transform(generatedBuf, ()generatedIn);
		;
		Object[] generatedDigest = this.getDigest();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedDigest, generatedBuf, 16/* The four core functions - F1 is optimized somewhat */)/* #define F1(x, y, z) (x & y | ~x & z) */;/* #define F1(x, y, z) (x & y | ~x & z) */
	}
	public Object[] getBuf() {
		return buf;
	}
	public void setBuf(Object[] newBuf) {
		buf = newBuf;
	}
	public Object[] getBits() {
		return bits;
	}
	public void setBits(Object[] newBits) {
		bits = newBits;
	}
	public Object[] getIn() {
		return in;
	}
	public void setIn(Object[] newIn) {
		in = newIn;
	}
	public Object[] getDigest() {
		return digest;
	}
	public void setDigest(Object[] newDigest) {
		digest = newDigest;
	}
}
