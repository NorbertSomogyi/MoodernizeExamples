package application;

public class blake2b_state__ {
	private Object h;
	private Object t;
	private Object f;
	private Object buf;
	private Object buflen;
	private Object outlen;
	private Object last_node;
	
	public blake2b_state__(Object h, Object t, Object f, Object buf, Object buflen, Object outlen, Object last_node) {
		setH(h);
		setT(t);
		setF(f);
		setBuf(buf);
		setBuflen(buflen);
		setOutlen(outlen);
		setLast_node(last_node);
	}
	public blake2b_state__() {
	}
	
	public void blake2b_set_lastnode() {
		Object generatedF = this.getF();
		generatedF[1] = (uint64_t)-1;
	}
	public void blake2b_set_lastblock() {
		Object generatedLast_node = this.getLast_node();
		if (generatedLast_node) {
			S.blake2b_set_lastnode();
		} 
		Object generatedF = this.getF();
		generatedF[0] = (uint64_t)-1;
	}
	public void blake2b_increment_counter(Object inc) {
		Object generatedT = this.getT();
		generatedT[0] += inc;
		generatedT[1] += (generatedT[0] < inc);
	}
	public void blake2b_init0() {
		size_t i = new size_t();
		.memset(S, 0, );
		Object generatedH = this.getH();
		for (i = 0; i < 8; ++i) {
			generatedH[i] = ModernizedCProgram.blake2b_IV[i];
		}
	}
	/* init xors IV with input parameter block */
	public int blake2b_init_param(Object P) {
		uint8_t p = (uint8_t)(P);
		size_t i = new size_t();
		S.blake2b_init0();
		Object generatedH = this.getH();
		for (i = 0; i < 8; ++/* IV XOR ParamBlock */i) {
			generatedH[i] ^=  ModernizedCProgram.load64(p +  * i);
		}
		this.setOutlen(P.getDigest_length());
		return 0;
	}
	public int blake2b_init(Object outlen) {
		blake2b_param[] P = new blake2b_param();
		if ((!outlen) || (outlen > blake2b_constant.BLAKE2B_OUTBYTES)) {
			return -1;
		} 
		P.setDigest_length((uint8_t)outlen);
		P.setKey_length(0);
		P.setFanout(1);
		P.setDepth(1);
		ModernizedCProgram.store32(P.getLeaf_length(), 0);
		ModernizedCProgram.store32(P.getNode_offset(), 0);
		ModernizedCProgram.store32(P.getXof_length(), 0);
		P.setNode_depth(0);
		P.setInner_length(0);
		.memset(P.getReserved(), 0, );
		.memset(P.getSalt(), 0, );
		.memset(P.getPersonal(), 0, );
		return S.blake2b_init_param(P);
	}
	public int blake2b_init_key(Object outlen, Object key, Object keylen) {
		blake2b_param[] P = new blake2b_param();
		if ((!outlen) || (outlen > blake2b_constant.BLAKE2B_OUTBYTES)) {
			return -1;
		} 
		if (!key || !keylen || keylen > blake2b_constant.BLAKE2B_KEYBYTES) {
			return -1;
		} 
		P.setDigest_length((uint8_t)outlen);
		P.setKey_length((uint8_t)keylen);
		P.setFanout(1);
		P.setDepth(1);
		ModernizedCProgram.store32(P.getLeaf_length(), 0);
		ModernizedCProgram.store32(P.getNode_offset(), 0);
		ModernizedCProgram.store32(P.getXof_length(), 0);
		P.setNode_depth(0);
		P.setInner_length(0);
		.memset(P.getReserved(), 0, );
		.memset(P.getSalt(), 0, );
		.memset(P.getPersonal(), 0, );
		if (S.blake2b_init_param(P) < 0) {
			return -1;
		} 
		{ 
			uint8_t[] block = new uint8_t();
			.memset(block, 0, blake2b_constant.BLAKE2B_BLOCKBYTES);
			.memcpy(block, key, keylen);
			S.blake2b_update(block, blake2b_constant.BLAKE2B_BLOCKBYTES);
			ModernizedCProgram.secure_zero_memory(block, /* Burn the key from stack */blake2b_constant.BLAKE2B_BLOCKBYTES);
		}
		return 0;
	}
	public void blake2b_compress(Object block) {
		uint64_t[] m = new uint64_t();
		uint64_t[] v = new uint64_t();
		size_t i = new size_t();
		for (i = 0; i < 16; ++i) {
			m[i] = ModernizedCProgram.load64(block + i * );
		}
		Object generatedH = this.getH();
		for (i = 0; i < 8; ++i) {
			v[i] = generatedH[i];
		}
		v[8] = ModernizedCProgram.blake2b_IV[0];
		v[9] = ModernizedCProgram.blake2b_IV[1];
		v[10] = ModernizedCProgram.blake2b_IV[2];
		v[11] = ModernizedCProgram.blake2b_IV[3];
		Object generatedT = this.getT();
		v[12] = ModernizedCProgram.blake2b_IV[4] ^ generatedT[0];
		v[13] = ModernizedCProgram.blake2b_IV[5] ^ generatedT[1];
		Object generatedF = this.getF();
		v[14] = ModernizedCProgram.blake2b_IV[6] ^ generatedF[0];
		v[15] = ModernizedCProgram.blake2b_IV[7] ^ generatedF[1];
		do {
			do {
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[0][2 * 0 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 32);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 24);
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[0][2 * 0 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 16);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 63);
			} while (0);
			do {
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[0][2 * 1 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 32);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 24);
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[0][2 * 1 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 16);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 63);
			} while (0);
			do {
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[0][2 * 2 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 32);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 24);
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[0][2 * 2 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 16);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 63);
			} while (0);
			do {
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[0][2 * 3 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 32);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 24);
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[0][2 * 3 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 16);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 63);
			} while (0);
			do {
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[0][2 * 4 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 32);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 24);
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[0][2 * 4 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 16);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 63);
			} while (0);
			do {
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[0][2 * 5 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 32);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 24);
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[0][2 * 5 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 16);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 63);
			} while (0);
			do {
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[0][2 * 6 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 32);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 24);
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[0][2 * 6 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 16);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 63);
			} while (0);
			do {
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[0][2 * 7 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 32);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 24);
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[0][2 * 7 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 16);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 63);
			} while (0);
		} while (0);
		do {
			do {
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[1][2 * 0 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 32);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 24);
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[1][2 * 0 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 16);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 63);
			} while (0);
			do {
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[1][2 * 1 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 32);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 24);
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[1][2 * 1 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 16);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 63);
			} while (0);
			do {
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[1][2 * 2 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 32);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 24);
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[1][2 * 2 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 16);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 63);
			} while (0);
			do {
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[1][2 * 3 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 32);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 24);
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[1][2 * 3 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 16);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 63);
			} while (0);
			do {
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[1][2 * 4 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 32);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 24);
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[1][2 * 4 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 16);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 63);
			} while (0);
			do {
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[1][2 * 5 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 32);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 24);
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[1][2 * 5 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 16);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 63);
			} while (0);
			do {
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[1][2 * 6 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 32);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 24);
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[1][2 * 6 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 16);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 63);
			} while (0);
			do {
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[1][2 * 7 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 32);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 24);
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[1][2 * 7 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 16);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 63);
			} while (0);
		} while (0);
		do {
			do {
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[2][2 * 0 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 32);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 24);
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[2][2 * 0 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 16);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 63);
			} while (0);
			do {
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[2][2 * 1 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 32);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 24);
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[2][2 * 1 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 16);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 63);
			} while (0);
			do {
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[2][2 * 2 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 32);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 24);
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[2][2 * 2 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 16);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 63);
			} while (0);
			do {
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[2][2 * 3 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 32);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 24);
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[2][2 * 3 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 16);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 63);
			} while (0);
			do {
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[2][2 * 4 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 32);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 24);
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[2][2 * 4 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 16);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 63);
			} while (0);
			do {
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[2][2 * 5 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 32);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 24);
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[2][2 * 5 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 16);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 63);
			} while (0);
			do {
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[2][2 * 6 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 32);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 24);
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[2][2 * 6 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 16);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 63);
			} while (0);
			do {
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[2][2 * 7 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 32);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 24);
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[2][2 * 7 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 16);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 63);
			} while (0);
		} while (0);
		do {
			do {
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[3][2 * 0 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 32);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 24);
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[3][2 * 0 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 16);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 63);
			} while (0);
			do {
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[3][2 * 1 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 32);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 24);
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[3][2 * 1 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 16);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 63);
			} while (0);
			do {
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[3][2 * 2 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 32);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 24);
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[3][2 * 2 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 16);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 63);
			} while (0);
			do {
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[3][2 * 3 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 32);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 24);
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[3][2 * 3 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 16);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 63);
			} while (0);
			do {
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[3][2 * 4 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 32);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 24);
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[3][2 * 4 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 16);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 63);
			} while (0);
			do {
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[3][2 * 5 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 32);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 24);
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[3][2 * 5 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 16);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 63);
			} while (0);
			do {
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[3][2 * 6 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 32);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 24);
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[3][2 * 6 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 16);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 63);
			} while (0);
			do {
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[3][2 * 7 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 32);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 24);
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[3][2 * 7 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 16);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 63);
			} while (0);
		} while (0);
		do {
			do {
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[4][2 * 0 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 32);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 24);
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[4][2 * 0 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 16);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 63);
			} while (0);
			do {
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[4][2 * 1 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 32);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 24);
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[4][2 * 1 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 16);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 63);
			} while (0);
			do {
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[4][2 * 2 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 32);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 24);
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[4][2 * 2 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 16);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 63);
			} while (0);
			do {
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[4][2 * 3 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 32);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 24);
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[4][2 * 3 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 16);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 63);
			} while (0);
			do {
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[4][2 * 4 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 32);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 24);
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[4][2 * 4 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 16);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 63);
			} while (0);
			do {
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[4][2 * 5 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 32);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 24);
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[4][2 * 5 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 16);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 63);
			} while (0);
			do {
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[4][2 * 6 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 32);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 24);
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[4][2 * 6 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 16);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 63);
			} while (0);
			do {
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[4][2 * 7 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 32);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 24);
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[4][2 * 7 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 16);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 63);
			} while (0);
		} while (0);
		do {
			do {
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[5][2 * 0 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 32);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 24);
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[5][2 * 0 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 16);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 63);
			} while (0);
			do {
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[5][2 * 1 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 32);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 24);
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[5][2 * 1 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 16);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 63);
			} while (0);
			do {
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[5][2 * 2 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 32);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 24);
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[5][2 * 2 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 16);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 63);
			} while (0);
			do {
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[5][2 * 3 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 32);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 24);
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[5][2 * 3 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 16);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 63);
			} while (0);
			do {
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[5][2 * 4 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 32);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 24);
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[5][2 * 4 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 16);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 63);
			} while (0);
			do {
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[5][2 * 5 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 32);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 24);
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[5][2 * 5 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 16);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 63);
			} while (0);
			do {
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[5][2 * 6 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 32);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 24);
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[5][2 * 6 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 16);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 63);
			} while (0);
			do {
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[5][2 * 7 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 32);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 24);
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[5][2 * 7 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 16);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 63);
			} while (0);
		} while (0);
		do {
			do {
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[6][2 * 0 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 32);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 24);
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[6][2 * 0 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 16);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 63);
			} while (0);
			do {
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[6][2 * 1 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 32);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 24);
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[6][2 * 1 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 16);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 63);
			} while (0);
			do {
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[6][2 * 2 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 32);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 24);
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[6][2 * 2 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 16);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 63);
			} while (0);
			do {
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[6][2 * 3 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 32);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 24);
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[6][2 * 3 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 16);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 63);
			} while (0);
			do {
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[6][2 * 4 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 32);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 24);
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[6][2 * 4 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 16);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 63);
			} while (0);
			do {
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[6][2 * 5 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 32);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 24);
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[6][2 * 5 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 16);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 63);
			} while (0);
			do {
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[6][2 * 6 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 32);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 24);
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[6][2 * 6 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 16);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 63);
			} while (0);
			do {
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[6][2 * 7 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 32);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 24);
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[6][2 * 7 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 16);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 63);
			} while (0);
		} while (0);
		do {
			do {
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[7][2 * 0 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 32);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 24);
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[7][2 * 0 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 16);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 63);
			} while (0);
			do {
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[7][2 * 1 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 32);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 24);
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[7][2 * 1 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 16);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 63);
			} while (0);
			do {
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[7][2 * 2 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 32);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 24);
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[7][2 * 2 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 16);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 63);
			} while (0);
			do {
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[7][2 * 3 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 32);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 24);
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[7][2 * 3 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 16);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 63);
			} while (0);
			do {
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[7][2 * 4 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 32);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 24);
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[7][2 * 4 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 16);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 63);
			} while (0);
			do {
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[7][2 * 5 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 32);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 24);
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[7][2 * 5 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 16);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 63);
			} while (0);
			do {
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[7][2 * 6 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 32);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 24);
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[7][2 * 6 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 16);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 63);
			} while (0);
			do {
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[7][2 * 7 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 32);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 24);
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[7][2 * 7 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 16);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 63);
			} while (0);
		} while (0);
		do {
			do {
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[8][2 * 0 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 32);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 24);
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[8][2 * 0 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 16);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 63);
			} while (0);
			do {
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[8][2 * 1 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 32);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 24);
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[8][2 * 1 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 16);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 63);
			} while (0);
			do {
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[8][2 * 2 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 32);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 24);
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[8][2 * 2 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 16);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 63);
			} while (0);
			do {
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[8][2 * 3 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 32);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 24);
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[8][2 * 3 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 16);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 63);
			} while (0);
			do {
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[8][2 * 4 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 32);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 24);
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[8][2 * 4 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 16);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 63);
			} while (0);
			do {
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[8][2 * 5 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 32);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 24);
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[8][2 * 5 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 16);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 63);
			} while (0);
			do {
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[8][2 * 6 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 32);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 24);
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[8][2 * 6 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 16);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 63);
			} while (0);
			do {
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[8][2 * 7 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 32);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 24);
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[8][2 * 7 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 16);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 63);
			} while (0);
		} while (0);
		do {
			do {
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[9][2 * 0 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 32);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 24);
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[9][2 * 0 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 16);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 63);
			} while (0);
			do {
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[9][2 * 1 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 32);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 24);
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[9][2 * 1 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 16);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 63);
			} while (0);
			do {
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[9][2 * 2 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 32);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 24);
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[9][2 * 2 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 16);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 63);
			} while (0);
			do {
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[9][2 * 3 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 32);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 24);
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[9][2 * 3 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 16);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 63);
			} while (0);
			do {
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[9][2 * 4 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 32);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 24);
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[9][2 * 4 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 16);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 63);
			} while (0);
			do {
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[9][2 * 5 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 32);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 24);
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[9][2 * 5 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 16);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 63);
			} while (0);
			do {
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[9][2 * 6 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 32);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 24);
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[9][2 * 6 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 16);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 63);
			} while (0);
			do {
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[9][2 * 7 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 32);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 24);
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[9][2 * 7 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 16);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 63);
			} while (0);
		} while (0);
		do {
			do {
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[10][2 * 0 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 32);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 24);
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[10][2 * 0 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 16);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 63);
			} while (0);
			do {
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[10][2 * 1 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 32);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 24);
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[10][2 * 1 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 16);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 63);
			} while (0);
			do {
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[10][2 * 2 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 32);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 24);
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[10][2 * 2 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 16);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 63);
			} while (0);
			do {
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[10][2 * 3 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 32);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 24);
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[10][2 * 3 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 16);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 63);
			} while (0);
			do {
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[10][2 * 4 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 32);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 24);
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[10][2 * 4 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 16);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 63);
			} while (0);
			do {
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[10][2 * 5 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 32);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 24);
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[10][2 * 5 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 16);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 63);
			} while (0);
			do {
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[10][2 * 6 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 32);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 24);
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[10][2 * 6 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 16);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 63);
			} while (0);
			do {
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[10][2 * 7 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 32);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 24);
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[10][2 * 7 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 16);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 63);
			} while (0);
		} while (0);
		do {
			do {
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[11][2 * 0 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 32);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 24);
				v[0] = v[0] + v[4] + m[ModernizedCProgram.blake2b_sigma[11][2 * 0 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[0], 16);
				v[8] = v[8] + v[12];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[8], 63);
			} while (0);
			do {
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[11][2 * 1 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 32);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 24);
				v[1] = v[1] + v[5] + m[ModernizedCProgram.blake2b_sigma[11][2 * 1 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[1], 16);
				v[9] = v[9] + v[13];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[9], 63);
			} while (0);
			do {
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[11][2 * 2 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 32);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 24);
				v[2] = v[2] + v[6] + m[ModernizedCProgram.blake2b_sigma[11][2 * 2 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[2], 16);
				v[10] = v[10] + v[14];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[10], 63);
			} while (0);
			do {
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[11][2 * 3 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 32);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 24);
				v[3] = v[3] + v[7] + m[ModernizedCProgram.blake2b_sigma[11][2 * 3 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[3], 16);
				v[11] = v[11] + v[15];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[11], 63);
			} while (0);
			do {
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[11][2 * 4 + 0]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 32);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 24);
				v[0] = v[0] + v[5] + m[ModernizedCProgram.blake2b_sigma[11][2 * 4 + 1]];
				v[15] = ModernizedCProgram.rotr64(v[15] ^ v[0], 16);
				v[10] = v[10] + v[15];
				v[5] = ModernizedCProgram.rotr64(v[5] ^ v[10], 63);
			} while (0);
			do {
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[11][2 * 5 + 0]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 32);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 24);
				v[1] = v[1] + v[6] + m[ModernizedCProgram.blake2b_sigma[11][2 * 5 + 1]];
				v[12] = ModernizedCProgram.rotr64(v[12] ^ v[1], 16);
				v[11] = v[11] + v[12];
				v[6] = ModernizedCProgram.rotr64(v[6] ^ v[11], 63);
			} while (0);
			do {
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[11][2 * 6 + 0]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 32);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 24);
				v[2] = v[2] + v[7] + m[ModernizedCProgram.blake2b_sigma[11][2 * 6 + 1]];
				v[13] = ModernizedCProgram.rotr64(v[13] ^ v[2], 16);
				v[8] = v[8] + v[13];
				v[7] = ModernizedCProgram.rotr64(v[7] ^ v[8], 63);
			} while (0);
			do {
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[11][2 * 7 + 0]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 32);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 24);
				v[3] = v[3] + v[4] + m[ModernizedCProgram.blake2b_sigma[11][2 * 7 + 1]];
				v[14] = ModernizedCProgram.rotr64(v[14] ^ v[3], 16);
				v[9] = v[9] + v[14];
				v[4] = ModernizedCProgram.rotr64(v[4] ^ v[9], 63);
			} while (0);
		} while (0);
		for (i = 0; i < 8; ++i) {
			generatedH[i] = generatedH[i] ^ v[i] ^ v[i + 8];
		}
	}
	public int blake2b_update(Object pin, Object inlen) {
		byte in = (byte)pin;
		Object generatedBuflen = this.getBuflen();
		Object generatedBuf = this.getBuf();
		if (inlen > 0) {
			size_t left = generatedBuflen;
			size_t fill = blake2b_constant.BLAKE2B_BLOCKBYTES - left;
			if (inlen > fill) {
				this.setBuflen(0);
				.memcpy(generatedBuf + left, in, /* Fill buffer */fill);
				S.blake2b_increment_counter(blake2b_constant.BLAKE2B_BLOCKBYTES);
				S.blake2b_compress(generatedBuf);
				in += fill;
				inlen -= fill;
				while (inlen > blake2b_constant.BLAKE2B_BLOCKBYTES) {
					S.blake2b_increment_counter(blake2b_constant.BLAKE2B_BLOCKBYTES);
					S.blake2b_compress(in);
					in += blake2b_constant.BLAKE2B_BLOCKBYTES;
					inlen -= blake2b_constant.BLAKE2B_BLOCKBYTES;
				}
			} 
			.memcpy(generatedBuf + generatedBuflen, in, inlen);
			generatedBuflen += inlen;
		} 
		return 0;
	}
	public int blake2b_final(Object out, Object outlen) {
		uint8_t[] buffer = new uint8_t[]{0};
		size_t i = new size_t();
		Object generatedOutlen = this.getOutlen();
		if (out == ((Object)0) || outlen < generatedOutlen) {
			return -1;
		} 
		if (ModernizedCProgram.blake2b_is_lastblock(S)) {
			return -1;
		} 
		Object generatedBuflen = this.getBuflen();
		S.blake2b_increment_counter(generatedBuflen);
		S.blake2b_set_lastblock();
		Object generatedBuf = this.getBuf();
		.memset(generatedBuf + generatedBuflen, 0, blake2b_constant.BLAKE2B_BLOCKBYTES - generatedBuflen);
		S.blake2b_compress(generatedBuf);
		Object generatedH = this.getH();
		for (i = 0; i < 8; ++/* Output full hash to temp buffer */i) {
			ModernizedCProgram.store64(buffer +  * i, generatedH[i]);
		}
		.memcpy(out, buffer, generatedOutlen);
		ModernizedCProgram.secure_zero_memory(buffer, );
		return 0;
	}
	public Object getH() {
		return h;
	}
	public void setH(Object newH) {
		h = newH;
	}
	public Object getT() {
		return t;
	}
	public void setT(Object newT) {
		t = newT;
	}
	public Object getF() {
		return f;
	}
	public void setF(Object newF) {
		f = newF;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
	public Object getBuflen() {
		return buflen;
	}
	public void setBuflen(Object newBuflen) {
		buflen = newBuflen;
	}
	public Object getOutlen() {
		return outlen;
	}
	public void setOutlen(Object newOutlen) {
		outlen = newOutlen;
	}
	public Object getLast_node() {
		return last_node;
	}
	public void setLast_node(Object newLast_node) {
		last_node = newLast_node;
	}
}
