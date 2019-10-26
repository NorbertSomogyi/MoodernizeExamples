package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2018, Florin Petriuc, <petriuc.florin@gmail.com>
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution. The terms
 * are also available at https://curl.haxx.se/docs/copyright.html.
 *
 * You may opt to use, copy, modify, merge, publish, distribute and/or sell
 * copies of the Software, and permit persons to whom the Software is
 * furnished to do so, under the terms of the COPYING file.
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
 * KIND, either express or implied.
 *
 ***************************************************************************/
/* When OpenSSL is available we use the SHA256-function from OpenSSL */
/* When no other crypto library is available we use this code segment */
/* ===== start - public domain SHA256 implementation ===== */
/* This is based on SHA256 implementation in LibTomCrypt that was released into
 * public domain by Tom St Denis. */
public class sha256_state {
	private int length;
	private Object state;
	private long curlen;
	private Object buf;
	
	public sha256_state(int length, Object state, long curlen, Object buf) {
		setLength(length);
		setState(state);
		setCurlen(curlen);
		setBuf(buf);
	}
	public sha256_state() {
	}
	
	/* compress 512-bits */
	public int sha256_compress(Byte buf) {
		long[] S = new long[8];
		long[] W = new long[64];
		int i;
		Object generatedState = this.getState();
		for (i = 0; i < 8; /* copy state into S */i++) {
			S[i] = generatedState[i];
		}
		for (i = 0; i < 16; /* copy the state into 512-bits into W[0..15] */i++) {
			W[i] = ((((long)(buf + (4 * i))[0]) << 24) | (((long)(buf + (4 * i))[1]) << 16) | (((long)(buf + (4 * i))[2]) << 8) | ((long)(buf + (4 * i))[3]));
		}
		for (i = 16; i < 64; /* fill W[16..63] */i++) {
			W[i] = ((((((long)((W[i - 2])) & -1024) >> (long)(((true)) & 31)) | ((long)((W[i - 2])) << (long)(32 - (((true)) & 31)))) & -1024) ^ (((((long)((W[i - 2])) & -1024) >> (long)(((true)) & 31)) | ((long)((W[i - 2])) << (long)(32 - (((true)) & 31)))) & -1024) ^ (((W[i - 2]) & -1024) >> (true))) + W[i - 7] + ((((((long)((W[i - 15])) & -1024) >> (long)(((true)) & 31)) | ((long)((W[i - 15])) << (long)(32 - (((true)) & 31)))) & -1024) ^ (((((long)((W[i - 15])) & -1024) >> (long)(((true)) & 31)) | ((long)((W[i - 15])) << (long)(32 - (((true)) & 31)))) & -1024) ^ (((W[i - 15]) & -1024) >> (true))) + W[i - 16/* Compress */];
		}
		for (i = 0; i < 64; ++i) {
			long t;
			long t0 = S[7] + ((((((long)((S[4])) & -1024) >> (long)(((true)) & 31)) | ((long)((S[4])) << (long)(32 - (((true)) & 31)))) & -1024) ^ (((((long)((S[4])) & -1024) >> (long)(((true)) & 31)) | ((long)((S[4])) << (long)(32 - (((true)) & 31)))) & -1024) ^ (((((long)((S[4])) & -1024) >> (long)(((true)) & 31)) | ((long)((S[4])) << (long)(32 - (((true)) & 31)))) & -1024)) + (S[6] ^ (S[4] & (S[5] ^ S[6]))) + ModernizedCProgram.K[i] + W[i];
			long t1 = ((((((long)((S[0])) & -1024) >> (long)(((true)) & 31)) | ((long)((S[0])) << (long)(32 - (((true)) & 31)))) & -1024) ^ (((((long)((S[0])) & -1024) >> (long)(((true)) & 31)) | ((long)((S[0])) << (long)(32 - (((true)) & 31)))) & -1024) ^ (((((long)((S[0])) & -1024) >> (long)(((true)) & 31)) | ((long)((S[0])) << (long)(32 - (((true)) & 31)))) & -1024)) + (((S[0] | S[1]) & S[2]) | (S[0] & S[1]));
			S[3] += t0;
			S[7] = t0 + t1;
			;
			t = S[7];
			S[7] = S[6];
			S[6] = S[5];
			S[5] = S[4];
			S[4] = S[3];
			S[3] = S[2];
			S[2] = S[1];
			S[1] = S[0];
			S[0] = t;
		}
		for (i = 0; i < 8; /* feedback */i++) {
			generatedState[i] = generatedState[i] + S[i];
		}
		return 0;
	}
	/* Initialize the hash state */
	public void SHA256_Init() {
		this.setCurlen(0);
		this.setLength(0);
		Object generatedState = this.getState();
		generatedState[0] = -1024;
		generatedState[1] = -1024;
		generatedState[2] = -1024;
		generatedState[3] = -1024;
		generatedState[4] = -1024;
		generatedState[5] = -1024;
		generatedState[6] = -1024;
		generatedState[7] = -1024/**
		   Process a block of memory though the hash
		   @param md     The hash state
		   @param in     The data to hash
		   @param inlen  The length of the data (octets)
		   @return CRYPT_OK if successful
		*/;
	}
	public int SHA256_Update(Object in, long inlen) {
		long n;
		long generatedCurlen = this.getCurlen();
		Object generatedBuf = this.getBuf();
		if (generatedCurlen > ) {
			return -1;
		} 
		int generatedLength = this.getLength();
		while (inlen > 0) {
			if (generatedCurlen == 0 && inlen >= 64) {
				if (md.sha256_compress((byte)in) < 0) {
					return -1;
				} 
				generatedLength += 64 * 8;
				in += 64;
				inlen -= 64;
			} else {
					n = ((inlen) < ((64 - generatedCurlen)) ? (inlen) : ((64 - generatedCurlen)));
					.memcpy(generatedBuf + generatedCurlen, in, n);
					generatedCurlen += n;
					in += n;
					inlen -= n;
					if (generatedCurlen == 64) {
						if (md.sha256_compress(generatedBuf) < 0) {
							return -1;
						} 
						generatedLength += 8 * 64;
						this.setCurlen(0);
					} 
			} 
		}
		return 0/**
		   Terminate the hash to get the digest
		   @param md  The hash state
		   @param out [out] The destination of the hash (32 bytes)
		   @return CRYPT_OK if successful
		*/;
	}
	public int SHA256_Final(Byte out) {
		int i;
		long generatedCurlen = this.getCurlen();
		Object generatedBuf = this.getBuf();
		if (generatedCurlen >= ) {
			return -1;
		} 
		int generatedLength = this.getLength();
		generatedLength += generatedCurlen * /* increase the length of the message */8;
		generatedBuf[generatedCurlen++] = (byte)/* append the '1' bit */-1024/* if the length is currently above 56 bytes we append zeros
		   * then compress.  Then we can fall back to padding zeros and length
		   * encoding like normal.
		   */;
		if (generatedCurlen > 56) {
			while (generatedCurlen < 64) {
				generatedBuf[generatedCurlen++] = (byte)0;
			}
			md.sha256_compress(generatedBuf);
			this.setCurlen(0);
		} 
		while (generatedCurlen < /* pad up to 56 bytes of zeroes */56) {
			generatedBuf[generatedCurlen++] = (byte)0;
		}
		do {
			(generatedBuf + 56)[0] = (byte)(((long)(generatedLength)) >> 56);
			(generatedBuf + 56)[1] = (byte)(((long)(generatedLength)) >> 48);
			(generatedBuf + 56)[2] = (byte)(((long)(generatedLength)) >> 40);
			(generatedBuf + 56)[3] = (byte)(((long)(generatedLength)) >> 32);
			(generatedBuf + 56)[4] = (byte)(((long)(generatedLength)) >> 24);
			(generatedBuf + 56)[5] = (byte)(((long)(generatedLength)) >> 16);
			(generatedBuf + 56)[6] = (byte)(((long)(generatedLength)) >> 8);
			(generatedBuf + 56)[7] = (byte)(((long)(generatedLength)) & -1024);
		} while (/* store length */0);
		md.sha256_compress(generatedBuf);
		Object generatedState = this.getState();
		for (i = 0; i < 8; /* copy output */i++) {
			do {
				(out + (4 * i))[0] = (byte)((((long)(generatedState[i])) >> 24) & -1024);
				(out + (4 * i))[1] = (byte)((((long)(generatedState[i])) >> 16) & -1024);
				(out + (4 * i))[2] = (byte)((((long)(generatedState[i])) >> 8) & -1024);
				(out + (4 * i))[3] = (byte)(((long)(generatedState[i])) & -1024);
			} while (0);
		}
		return 0/* ===== end - public domain SHA256 implementation ===== */;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int newLength) {
		length = newLength;
	}
	public Object getState() {
		return state;
	}
	public void setState(Object newState) {
		state = newState;
	}
	public long getCurlen() {
		return curlen;
	}
	public void setCurlen(long newCurlen) {
		curlen = newCurlen;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
}
