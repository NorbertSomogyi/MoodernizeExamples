package application;

/* This is a highly simplified version from libtomcrypt */
public class hash_state {
	private sha512_state sha512;
	
	public hash_state(sha512_state sha512) {
		setSha512(sha512);
	}
	public hash_state() {
	}
	
	public void sha512_compress(Object buf) {
		[] S = new ();
		[] W = new ();
		 t0 = new ();
		 t1 = new ();
		int i;
		sha512_state generatedSha512 = this.getSha512();
		Object generatedState = generatedSha512.getState();
		for (i = 0; i < 8; /* copy state into S */i++) {
			S[i] = generatedState[i];
		}
		for (i = 0; i < 16; /* copy the state into 1024-bits into W[0..15] */i++) {
			do {
				W[i] = ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((buf + (8 * i))[0] & 255)) << 56) | ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((buf + (8 * i))[1] & 255)) << 48) | ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((buf + (8 * i))[2] & 255)) << 40) | ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((buf + (8 * i))[3] & 255)) << 32) | ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((buf + (8 * i))[4] & 255)) << 24) | ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((buf + (8 * i))[5] & 255)) << 16) | ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((buf + (8 * i))[6] & 255)) << 8) | ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((buf + (8 * i))[7] & 255)));
			} while (0);
		}
		for (i = 16; i < 80; /* fill W[16..79] */i++) {
			W[i] = ((((((W[i - 2]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(19) & 63)) | ((W[i - 2]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((W[i - 2]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(61) & 63)) | ((W[i - 2]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((W[i - 2]) & -1024) >> (()6))) + W[i - 7] + ((((((W[i - 15]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(1) & 63)) | ((W[i - 15]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((W[i - 15]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(8) & 63)) | ((W[i - 15]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((W[i - 15]) & -1024) >> (()7))) + W[i - 16];
		}
		for (i = 0; i < 80; i += 8) {
			t0 = S[7] + ((((((S[4]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(14) & 63)) | ((S[4]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[4]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(18) & 63)) | ((S[4]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[4]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(41) & 63)) | ((S[4]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (S[6] ^ (S[4] & (S[5] ^ S[6]))) + ModernizedCProgram.K[i + 0] + W[i + 0];
			t1 = ((((((S[0]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(28) & 63)) | ((S[0]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[0]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(34) & 63)) | ((S[0]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[0]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(39) & 63)) | ((S[0]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (((S[0] | S[1]) & S[2]) | (S[0] & S[1]));
			S[3] += t0;
			S[7] = t0 + t1;
			;
			t0 = S[6] + ((((((S[3]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(14) & 63)) | ((S[3]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[3]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(18) & 63)) | ((S[3]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[3]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(41) & 63)) | ((S[3]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (S[5] ^ (S[3] & (S[4] ^ S[5]))) + ModernizedCProgram.K[i + 1] + W[i + 1];
			t1 = ((((((S[7]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(28) & 63)) | ((S[7]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[7]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(34) & 63)) | ((S[7]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[7]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(39) & 63)) | ((S[7]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (((S[7] | S[0]) & S[1]) | (S[7] & S[0]));
			S[2] += t0;
			S[6] = t0 + t1;
			;
			t0 = S[5] + ((((((S[2]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(14) & 63)) | ((S[2]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[2]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(18) & 63)) | ((S[2]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[2]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(41) & 63)) | ((S[2]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (S[4] ^ (S[2] & (S[3] ^ S[4]))) + ModernizedCProgram.K[i + 2] + W[i + 2];
			t1 = ((((((S[6]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(28) & 63)) | ((S[6]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[6]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(34) & 63)) | ((S[6]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[6]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(39) & 63)) | ((S[6]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (((S[6] | S[7]) & S[0]) | (S[6] & S[7]));
			S[1] += t0;
			S[5] = t0 + t1;
			;
			t0 = S[4] + ((((((S[1]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(14) & 63)) | ((S[1]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[1]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(18) & 63)) | ((S[1]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[1]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(41) & 63)) | ((S[1]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (S[3] ^ (S[1] & (S[2] ^ S[3]))) + ModernizedCProgram.K[i + 3] + W[i + 3];
			t1 = ((((((S[5]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(28) & 63)) | ((S[5]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[5]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(34) & 63)) | ((S[5]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[5]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(39) & 63)) | ((S[5]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (((S[5] | S[6]) & S[7]) | (S[5] & S[6]));
			S[0] += t0;
			S[4] = t0 + t1;
			;
			t0 = S[3] + ((((((S[0]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(14) & 63)) | ((S[0]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[0]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(18) & 63)) | ((S[0]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[0]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(41) & 63)) | ((S[0]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (S[2] ^ (S[0] & (S[1] ^ S[2]))) + ModernizedCProgram.K[i + 4] + W[i + 4];
			t1 = ((((((S[4]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(28) & 63)) | ((S[4]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[4]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(34) & 63)) | ((S[4]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[4]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(39) & 63)) | ((S[4]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (((S[4] | S[5]) & S[6]) | (S[4] & S[5]));
			S[7] += t0;
			S[3] = t0 + t1;
			;
			t0 = S[2] + ((((((S[7]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(14) & 63)) | ((S[7]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[7]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(18) & 63)) | ((S[7]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[7]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(41) & 63)) | ((S[7]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (S[1] ^ (S[7] & (S[0] ^ S[1]))) + ModernizedCProgram.K[i + 5] + W[i + 5];
			t1 = ((((((S[3]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(28) & 63)) | ((S[3]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[3]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(34) & 63)) | ((S[3]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[3]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(39) & 63)) | ((S[3]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (((S[3] | S[4]) & S[5]) | (S[3] & S[4]));
			S[6] += t0;
			S[2] = t0 + t1;
			;
			t0 = S[1] + ((((((S[6]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(14) & 63)) | ((S[6]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[6]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(18) & 63)) | ((S[6]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[6]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(41) & 63)) | ((S[6]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (S[0] ^ (S[6] & (S[7] ^ S[0]))) + ModernizedCProgram.K[i + 6] + W[i + 6];
			t1 = ((((((S[2]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(28) & 63)) | ((S[2]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[2]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(34) & 63)) | ((S[2]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[2]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(39) & 63)) | ((S[2]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (((S[2] | S[3]) & S[4]) | (S[2] & S[3]));
			S[5] += t0;
			S[1] = t0 + t1;
			;
			t0 = S[0] + ((((((S[5]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(14) & 63)) | ((S[5]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[5]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(18) & 63)) | ((S[5]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[5]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(41) & 63)) | ((S[5]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (S[7] ^ (S[5] & (S[6] ^ S[7]))) + ModernizedCProgram.K[i + 7] + W[i + 7];
			t1 = ((((((S[1]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(28) & 63)) | ((S[1]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[1]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(34) & 63)) | ((S[1]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024) ^ (((((S[1]) & -1024) >> (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(39) & 63)) | ((S[1]) << (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(64 - ((true) & 63))))) & -1024)) + (((S[1] | S[2]) & S[3]) | (S[1] & S[2]));
			S[4] += t0;
			S[0] = t0 + t1;
			;
		}
		for (i = 0; i < 8; /* feedback */i++) {
			generatedState[i] = generatedState[i] + S[i];
		}
	}
	public void sha512_init() {
		sha512_state generatedSha512 = this.getSha512();
		generatedSha512.setCurlen(0);
		generatedSha512.setLength(0);
		Object generatedState = generatedSha512.getState();
		generatedState[0] = -1024;
		generatedState[1] = -1024;
		generatedState[2] = -1024;
		generatedState[3] = -1024;
		generatedState[4] = -1024;
		generatedState[5] = -1024;
		generatedState[6] = -1024;
		generatedState[7] = -1024;
	}
	public void sha512_done(Byte out) {
		int i;
		sha512_state generatedSha512 = this.getSha512();
		Object generatedLength = generatedSha512.getLength();
		long generatedCurlen = generatedSha512.getCurlen();
		generatedLength += generatedCurlen * /* increase the length of the message */8;
		Object generatedBuf = generatedSha512.getBuf();
		generatedBuf[generatedCurlen++] = (byte)/* append the '1' bit */-1024/* if the length is currently above 112 bytes we append zeros then
			 * compress. Then we can fall back to padding zeros and length encoding
			 * like normal. */;
		if (generatedCurlen > 112) {
			while (generatedCurlen < 128) {
				generatedBuf[generatedCurlen++] = (byte)0;
			}
			md.sha512_compress(generatedBuf);
			generatedSha512.setCurlen(0);
		} 
		while (generatedCurlen < /* pad upto 120 bytes of zeroes note: that from 112 to 120 is the 64 MSB
			 * of the length. We assume that you won't hash > 2^64 bits of data. */120) {
			generatedBuf[generatedCurlen++] = (byte)0;
		}
		do {
			(generatedBuf + 120)[0] = (byte)(((generatedLength) >> 56) & 255);
			(generatedBuf + 120)[1] = (byte)(((generatedLength) >> 48) & 255);
			(generatedBuf + 120)[2] = (byte)(((generatedLength) >> 40) & 255);
			(generatedBuf + 120)[3] = (byte)(((generatedLength) >> 32) & 255);
			(generatedBuf + 120)[4] = (byte)(((generatedLength) >> 24) & 255);
			(generatedBuf + 120)[5] = (byte)(((generatedLength) >> 16) & 255);
			(generatedBuf + 120)[6] = (byte)(((generatedLength) >> 8) & 255);
			(generatedBuf + 120)[7] = (byte)((generatedLength) & 255);
		} while (/* store length */0);
		md.sha512_compress(generatedBuf);
		Object generatedState = generatedSha512.getState();
		for (i = 0; i < 8; /* copy output */i++) {
			do {
				(out + (8 * i))[0] = (byte)(((generatedState[i]) >> 56) & 255);
				(out + (8 * i))[1] = (byte)(((generatedState[i]) >> 48) & 255);
				(out + (8 * i))[2] = (byte)(((generatedState[i]) >> 40) & 255);
				(out + (8 * i))[3] = (byte)(((generatedState[i]) >> 32) & 255);
				(out + (8 * i))[4] = (byte)(((generatedState[i]) >> 24) & 255);
				(out + (8 * i))[5] = (byte)(((generatedState[i]) >> 16) & 255);
				(out + (8 * i))[6] = (byte)(((generatedState[i]) >> 8) & 255);
				(out + (8 * i))[7] = (byte)((generatedState[i]) & 255);
			} while (0);
		}
	}
	public void sha512_process(Object in, long inlen) {
		long n;
		sha512_state generatedSha512 = this.getSha512();
		long generatedCurlen = generatedSha512.getCurlen();
		Object generatedLength = generatedSha512.getLength();
		Object generatedBuf = generatedSha512.getBuf();
		while (inlen > 0) {
			if (generatedCurlen == 0 && inlen >= 128) {
				md.sha512_compress(in);
				generatedLength += 128 * 8;
				in += 128;
				inlen -= 128;
			} else {
					n = (((inlen) < ((128 - generatedCurlen))) ? (inlen) : ((128 - generatedCurlen)));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBuf + generatedCurlen, in, (size_t)n);
					generatedCurlen += n;
					in += n;
					inlen -= n;
					if (generatedCurlen == 128) {
						md.sha512_compress(generatedBuf);
						generatedLength += 128 * 8;
						generatedSha512.setCurlen(0);
					} 
			} 
		}
	}
	public sha512_state getSha512() {
		return sha512;
	}
	public void setSha512(sha512_state newSha512) {
		sha512 = newSha512;
	}
}
