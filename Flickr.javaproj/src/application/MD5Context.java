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
	private Object buf;
	private Object bits;
	private Object in;
	private Object digest;
	
	public MD5Context(Object buf, Object bits, Object in, Object digest) {
		setBuf(buf);
		setBits(bits);
		setIn(in);
		setDigest(digest);
	}
	public MD5Context() {
	}
	
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
	public Object getBits() {
		return bits;
	}
	public void setBits(Object newBits) {
		bits = newBits;
	}
	public Object getIn() {
		return in;
	}
	public void setIn(Object newIn) {
		in = newIn;
	}
	public Object getDigest() {
		return digest;
	}
	public void setDigest(Object newDigest) {
		digest = newDigest;
	}
}
