package application;

public class blk_SHA256_CTX {
	private Object state;
	private Object size;
	private Object offset;
	private Object buf;
	
	public blk_SHA256_CTX(Object state, Object size, Object offset, Object buf) {
		setState(state);
		setSize(size);
		setOffset(offset);
		setBuf(buf);
	}
	public blk_SHA256_CTX() {
	}
	
	public void blk_SHA256_Init() {
		ModernizedCProgram.ctx.setOffset(0);
		ModernizedCProgram.ctx.setSize(0);
		ModernizedCProgram.ctx.getState()[0] = -1024;
		ModernizedCProgram.ctx.getState()[1] = -1024;
		ModernizedCProgram.ctx.getState()[2] = -1024;
		ModernizedCProgram.ctx.getState()[3] = -1024;
		ModernizedCProgram.ctx.getState()[4] = -1024;
		ModernizedCProgram.ctx.getState()[5] = -1024;
		ModernizedCProgram.ctx.getState()[6] = -1024;
		ModernizedCProgram.ctx.getState()[7] = -1024;
	}
	public void blk_SHA256_Transform(Object buf) {
		uint32_t[] S = new uint32_t();
		uint32_t[] W = new uint32_t();
		uint32_t t0 = new uint32_t();
		uint32_t t1 = new uint32_t();
		int i;
		for (i = 0; i < 8; /* copy state into S */i++) {
			S[i] = ModernizedCProgram.ctx.getState()[i];
		}
		for (i = 0; i < 16; ) {
			W[i] = .get_be32(buf);
		}
		for (i = 16; i < 64; /* fill W[16..63] */i++) {
			W[i] = ModernizedCProgram.gamma1(W[i - 2]) + W[i - 7] + ModernizedCProgram.gamma0(W[i - 15]) + W[i - 16];
		}
		t0 = S[7] + ModernizedCProgram.sigma1(S[4]) + ModernizedCProgram.ch(S[4], S[5], S[6]) + -1024 + W[0];
		t1 = ModernizedCProgram.sigma0(S[0]) + ModernizedCProgram.maj(S[0], S[1], S[2]);
		S[3] += t0;
		S[7] = t0 + t1;
		;
		t0 = S[6] + ModernizedCProgram.sigma1(S[3]) + ModernizedCProgram.ch(S[3], S[4], S[5]) + -1024 + W[1];
		t1 = ModernizedCProgram.sigma0(S[7]) + ModernizedCProgram.maj(S[7], S[0], S[1]);
		S[2] += t0;
		S[6] = t0 + t1;
		;
		t0 = S[5] + ModernizedCProgram.sigma1(S[2]) + ModernizedCProgram.ch(S[2], S[3], S[4]) + -1024 + W[2];
		t1 = ModernizedCProgram.sigma0(S[6]) + ModernizedCProgram.maj(S[6], S[7], S[0]);
		S[1] += t0;
		S[5] = t0 + t1;
		;
		t0 = S[4] + ModernizedCProgram.sigma1(S[1]) + ModernizedCProgram.ch(S[1], S[2], S[3]) + -1024 + W[3];
		t1 = ModernizedCProgram.sigma0(S[5]) + ModernizedCProgram.maj(S[5], S[6], S[7]);
		S[0] += t0;
		S[4] = t0 + t1;
		;
		t0 = S[3] + ModernizedCProgram.sigma1(S[0]) + ModernizedCProgram.ch(S[0], S[1], S[2]) + -1024 + W[4];
		t1 = ModernizedCProgram.sigma0(S[4]) + ModernizedCProgram.maj(S[4], S[5], S[6]);
		S[7] += t0;
		S[3] = t0 + t1;
		;
		t0 = S[2] + ModernizedCProgram.sigma1(S[7]) + ModernizedCProgram.ch(S[7], S[0], S[1]) + -1024 + W[5];
		t1 = ModernizedCProgram.sigma0(S[3]) + ModernizedCProgram.maj(S[3], S[4], S[5]);
		S[6] += t0;
		S[2] = t0 + t1;
		;
		t0 = S[1] + ModernizedCProgram.sigma1(S[6]) + ModernizedCProgram.ch(S[6], S[7], S[0]) + -1024 + W[6];
		t1 = ModernizedCProgram.sigma0(S[2]) + ModernizedCProgram.maj(S[2], S[3], S[4]);
		S[5] += t0;
		S[1] = t0 + t1;
		;
		t0 = S[0] + ModernizedCProgram.sigma1(S[5]) + ModernizedCProgram.ch(S[5], S[6], S[7]) + -1024 + W[7];
		t1 = ModernizedCProgram.sigma0(S[1]) + ModernizedCProgram.maj(S[1], S[2], S[3]);
		S[4] += t0;
		S[0] = t0 + t1;
		;
		t0 = S[7] + ModernizedCProgram.sigma1(S[4]) + ModernizedCProgram.ch(S[4], S[5], S[6]) + -1024 + W[8];
		t1 = ModernizedCProgram.sigma0(S[0]) + ModernizedCProgram.maj(S[0], S[1], S[2]);
		S[3] += t0;
		S[7] = t0 + t1;
		;
		t0 = S[6] + ModernizedCProgram.sigma1(S[3]) + ModernizedCProgram.ch(S[3], S[4], S[5]) + -1024 + W[9];
		t1 = ModernizedCProgram.sigma0(S[7]) + ModernizedCProgram.maj(S[7], S[0], S[1]);
		S[2] += t0;
		S[6] = t0 + t1;
		;
		t0 = S[5] + ModernizedCProgram.sigma1(S[2]) + ModernizedCProgram.ch(S[2], S[3], S[4]) + -1024 + W[10];
		t1 = ModernizedCProgram.sigma0(S[6]) + ModernizedCProgram.maj(S[6], S[7], S[0]);
		S[1] += t0;
		S[5] = t0 + t1;
		;
		t0 = S[4] + ModernizedCProgram.sigma1(S[1]) + ModernizedCProgram.ch(S[1], S[2], S[3]) + -1024 + W[11];
		t1 = ModernizedCProgram.sigma0(S[5]) + ModernizedCProgram.maj(S[5], S[6], S[7]);
		S[0] += t0;
		S[4] = t0 + t1;
		;
		t0 = S[3] + ModernizedCProgram.sigma1(S[0]) + ModernizedCProgram.ch(S[0], S[1], S[2]) + -1024 + W[12];
		t1 = ModernizedCProgram.sigma0(S[4]) + ModernizedCProgram.maj(S[4], S[5], S[6]);
		S[7] += t0;
		S[3] = t0 + t1;
		;
		t0 = S[2] + ModernizedCProgram.sigma1(S[7]) + ModernizedCProgram.ch(S[7], S[0], S[1]) + -1024 + W[13];
		t1 = ModernizedCProgram.sigma0(S[3]) + ModernizedCProgram.maj(S[3], S[4], S[5]);
		S[6] += t0;
		S[2] = t0 + t1;
		;
		t0 = S[1] + ModernizedCProgram.sigma1(S[6]) + ModernizedCProgram.ch(S[6], S[7], S[0]) + -1024 + W[14];
		t1 = ModernizedCProgram.sigma0(S[2]) + ModernizedCProgram.maj(S[2], S[3], S[4]);
		S[5] += t0;
		S[1] = t0 + t1;
		;
		t0 = S[0] + ModernizedCProgram.sigma1(S[5]) + ModernizedCProgram.ch(S[5], S[6], S[7]) + -1024 + W[15];
		t1 = ModernizedCProgram.sigma0(S[1]) + ModernizedCProgram.maj(S[1], S[2], S[3]);
		S[4] += t0;
		S[0] = t0 + t1;
		;
		t0 = S[7] + ModernizedCProgram.sigma1(S[4]) + ModernizedCProgram.ch(S[4], S[5], S[6]) + -1024 + W[16];
		t1 = ModernizedCProgram.sigma0(S[0]) + ModernizedCProgram.maj(S[0], S[1], S[2]);
		S[3] += t0;
		S[7] = t0 + t1;
		;
		t0 = S[6] + ModernizedCProgram.sigma1(S[3]) + ModernizedCProgram.ch(S[3], S[4], S[5]) + -1024 + W[17];
		t1 = ModernizedCProgram.sigma0(S[7]) + ModernizedCProgram.maj(S[7], S[0], S[1]);
		S[2] += t0;
		S[6] = t0 + t1;
		;
		t0 = S[5] + ModernizedCProgram.sigma1(S[2]) + ModernizedCProgram.ch(S[2], S[3], S[4]) + -1024 + W[18];
		t1 = ModernizedCProgram.sigma0(S[6]) + ModernizedCProgram.maj(S[6], S[7], S[0]);
		S[1] += t0;
		S[5] = t0 + t1;
		;
		t0 = S[4] + ModernizedCProgram.sigma1(S[1]) + ModernizedCProgram.ch(S[1], S[2], S[3]) + -1024 + W[19];
		t1 = ModernizedCProgram.sigma0(S[5]) + ModernizedCProgram.maj(S[5], S[6], S[7]);
		S[0] += t0;
		S[4] = t0 + t1;
		;
		t0 = S[3] + ModernizedCProgram.sigma1(S[0]) + ModernizedCProgram.ch(S[0], S[1], S[2]) + -1024 + W[20];
		t1 = ModernizedCProgram.sigma0(S[4]) + ModernizedCProgram.maj(S[4], S[5], S[6]);
		S[7] += t0;
		S[3] = t0 + t1;
		;
		t0 = S[2] + ModernizedCProgram.sigma1(S[7]) + ModernizedCProgram.ch(S[7], S[0], S[1]) + -1024 + W[21];
		t1 = ModernizedCProgram.sigma0(S[3]) + ModernizedCProgram.maj(S[3], S[4], S[5]);
		S[6] += t0;
		S[2] = t0 + t1;
		;
		t0 = S[1] + ModernizedCProgram.sigma1(S[6]) + ModernizedCProgram.ch(S[6], S[7], S[0]) + -1024 + W[22];
		t1 = ModernizedCProgram.sigma0(S[2]) + ModernizedCProgram.maj(S[2], S[3], S[4]);
		S[5] += t0;
		S[1] = t0 + t1;
		;
		t0 = S[0] + ModernizedCProgram.sigma1(S[5]) + ModernizedCProgram.ch(S[5], S[6], S[7]) + -1024 + W[23];
		t1 = ModernizedCProgram.sigma0(S[1]) + ModernizedCProgram.maj(S[1], S[2], S[3]);
		S[4] += t0;
		S[0] = t0 + t1;
		;
		t0 = S[7] + ModernizedCProgram.sigma1(S[4]) + ModernizedCProgram.ch(S[4], S[5], S[6]) + -1024 + W[24];
		t1 = ModernizedCProgram.sigma0(S[0]) + ModernizedCProgram.maj(S[0], S[1], S[2]);
		S[3] += t0;
		S[7] = t0 + t1;
		;
		t0 = S[6] + ModernizedCProgram.sigma1(S[3]) + ModernizedCProgram.ch(S[3], S[4], S[5]) + -1024 + W[25];
		t1 = ModernizedCProgram.sigma0(S[7]) + ModernizedCProgram.maj(S[7], S[0], S[1]);
		S[2] += t0;
		S[6] = t0 + t1;
		;
		t0 = S[5] + ModernizedCProgram.sigma1(S[2]) + ModernizedCProgram.ch(S[2], S[3], S[4]) + -1024 + W[26];
		t1 = ModernizedCProgram.sigma0(S[6]) + ModernizedCProgram.maj(S[6], S[7], S[0]);
		S[1] += t0;
		S[5] = t0 + t1;
		;
		t0 = S[4] + ModernizedCProgram.sigma1(S[1]) + ModernizedCProgram.ch(S[1], S[2], S[3]) + -1024 + W[27];
		t1 = ModernizedCProgram.sigma0(S[5]) + ModernizedCProgram.maj(S[5], S[6], S[7]);
		S[0] += t0;
		S[4] = t0 + t1;
		;
		t0 = S[3] + ModernizedCProgram.sigma1(S[0]) + ModernizedCProgram.ch(S[0], S[1], S[2]) + -1024 + W[28];
		t1 = ModernizedCProgram.sigma0(S[4]) + ModernizedCProgram.maj(S[4], S[5], S[6]);
		S[7] += t0;
		S[3] = t0 + t1;
		;
		t0 = S[2] + ModernizedCProgram.sigma1(S[7]) + ModernizedCProgram.ch(S[7], S[0], S[1]) + -1024 + W[29];
		t1 = ModernizedCProgram.sigma0(S[3]) + ModernizedCProgram.maj(S[3], S[4], S[5]);
		S[6] += t0;
		S[2] = t0 + t1;
		;
		t0 = S[1] + ModernizedCProgram.sigma1(S[6]) + ModernizedCProgram.ch(S[6], S[7], S[0]) + -1024 + W[30];
		t1 = ModernizedCProgram.sigma0(S[2]) + ModernizedCProgram.maj(S[2], S[3], S[4]);
		S[5] += t0;
		S[1] = t0 + t1;
		;
		t0 = S[0] + ModernizedCProgram.sigma1(S[5]) + ModernizedCProgram.ch(S[5], S[6], S[7]) + -1024 + W[31];
		t1 = ModernizedCProgram.sigma0(S[1]) + ModernizedCProgram.maj(S[1], S[2], S[3]);
		S[4] += t0;
		S[0] = t0 + t1;
		;
		t0 = S[7] + ModernizedCProgram.sigma1(S[4]) + ModernizedCProgram.ch(S[4], S[5], S[6]) + -1024 + W[32];
		t1 = ModernizedCProgram.sigma0(S[0]) + ModernizedCProgram.maj(S[0], S[1], S[2]);
		S[3] += t0;
		S[7] = t0 + t1;
		;
		t0 = S[6] + ModernizedCProgram.sigma1(S[3]) + ModernizedCProgram.ch(S[3], S[4], S[5]) + -1024 + W[33];
		t1 = ModernizedCProgram.sigma0(S[7]) + ModernizedCProgram.maj(S[7], S[0], S[1]);
		S[2] += t0;
		S[6] = t0 + t1;
		;
		t0 = S[5] + ModernizedCProgram.sigma1(S[2]) + ModernizedCProgram.ch(S[2], S[3], S[4]) + -1024 + W[34];
		t1 = ModernizedCProgram.sigma0(S[6]) + ModernizedCProgram.maj(S[6], S[7], S[0]);
		S[1] += t0;
		S[5] = t0 + t1;
		;
		t0 = S[4] + ModernizedCProgram.sigma1(S[1]) + ModernizedCProgram.ch(S[1], S[2], S[3]) + -1024 + W[35];
		t1 = ModernizedCProgram.sigma0(S[5]) + ModernizedCProgram.maj(S[5], S[6], S[7]);
		S[0] += t0;
		S[4] = t0 + t1;
		;
		t0 = S[3] + ModernizedCProgram.sigma1(S[0]) + ModernizedCProgram.ch(S[0], S[1], S[2]) + -1024 + W[36];
		t1 = ModernizedCProgram.sigma0(S[4]) + ModernizedCProgram.maj(S[4], S[5], S[6]);
		S[7] += t0;
		S[3] = t0 + t1;
		;
		t0 = S[2] + ModernizedCProgram.sigma1(S[7]) + ModernizedCProgram.ch(S[7], S[0], S[1]) + -1024 + W[37];
		t1 = ModernizedCProgram.sigma0(S[3]) + ModernizedCProgram.maj(S[3], S[4], S[5]);
		S[6] += t0;
		S[2] = t0 + t1;
		;
		t0 = S[1] + ModernizedCProgram.sigma1(S[6]) + ModernizedCProgram.ch(S[6], S[7], S[0]) + -1024 + W[38];
		t1 = ModernizedCProgram.sigma0(S[2]) + ModernizedCProgram.maj(S[2], S[3], S[4]);
		S[5] += t0;
		S[1] = t0 + t1;
		;
		t0 = S[0] + ModernizedCProgram.sigma1(S[5]) + ModernizedCProgram.ch(S[5], S[6], S[7]) + -1024 + W[39];
		t1 = ModernizedCProgram.sigma0(S[1]) + ModernizedCProgram.maj(S[1], S[2], S[3]);
		S[4] += t0;
		S[0] = t0 + t1;
		;
		t0 = S[7] + ModernizedCProgram.sigma1(S[4]) + ModernizedCProgram.ch(S[4], S[5], S[6]) + -1024 + W[40];
		t1 = ModernizedCProgram.sigma0(S[0]) + ModernizedCProgram.maj(S[0], S[1], S[2]);
		S[3] += t0;
		S[7] = t0 + t1;
		;
		t0 = S[6] + ModernizedCProgram.sigma1(S[3]) + ModernizedCProgram.ch(S[3], S[4], S[5]) + -1024 + W[41];
		t1 = ModernizedCProgram.sigma0(S[7]) + ModernizedCProgram.maj(S[7], S[0], S[1]);
		S[2] += t0;
		S[6] = t0 + t1;
		;
		t0 = S[5] + ModernizedCProgram.sigma1(S[2]) + ModernizedCProgram.ch(S[2], S[3], S[4]) + -1024 + W[42];
		t1 = ModernizedCProgram.sigma0(S[6]) + ModernizedCProgram.maj(S[6], S[7], S[0]);
		S[1] += t0;
		S[5] = t0 + t1;
		;
		t0 = S[4] + ModernizedCProgram.sigma1(S[1]) + ModernizedCProgram.ch(S[1], S[2], S[3]) + -1024 + W[43];
		t1 = ModernizedCProgram.sigma0(S[5]) + ModernizedCProgram.maj(S[5], S[6], S[7]);
		S[0] += t0;
		S[4] = t0 + t1;
		;
		t0 = S[3] + ModernizedCProgram.sigma1(S[0]) + ModernizedCProgram.ch(S[0], S[1], S[2]) + -1024 + W[44];
		t1 = ModernizedCProgram.sigma0(S[4]) + ModernizedCProgram.maj(S[4], S[5], S[6]);
		S[7] += t0;
		S[3] = t0 + t1;
		;
		t0 = S[2] + ModernizedCProgram.sigma1(S[7]) + ModernizedCProgram.ch(S[7], S[0], S[1]) + -1024 + W[45];
		t1 = ModernizedCProgram.sigma0(S[3]) + ModernizedCProgram.maj(S[3], S[4], S[5]);
		S[6] += t0;
		S[2] = t0 + t1;
		;
		t0 = S[1] + ModernizedCProgram.sigma1(S[6]) + ModernizedCProgram.ch(S[6], S[7], S[0]) + -1024 + W[46];
		t1 = ModernizedCProgram.sigma0(S[2]) + ModernizedCProgram.maj(S[2], S[3], S[4]);
		S[5] += t0;
		S[1] = t0 + t1;
		;
		t0 = S[0] + ModernizedCProgram.sigma1(S[5]) + ModernizedCProgram.ch(S[5], S[6], S[7]) + -1024 + W[47];
		t1 = ModernizedCProgram.sigma0(S[1]) + ModernizedCProgram.maj(S[1], S[2], S[3]);
		S[4] += t0;
		S[0] = t0 + t1;
		;
		t0 = S[7] + ModernizedCProgram.sigma1(S[4]) + ModernizedCProgram.ch(S[4], S[5], S[6]) + -1024 + W[48];
		t1 = ModernizedCProgram.sigma0(S[0]) + ModernizedCProgram.maj(S[0], S[1], S[2]);
		S[3] += t0;
		S[7] = t0 + t1;
		;
		t0 = S[6] + ModernizedCProgram.sigma1(S[3]) + ModernizedCProgram.ch(S[3], S[4], S[5]) + -1024 + W[49];
		t1 = ModernizedCProgram.sigma0(S[7]) + ModernizedCProgram.maj(S[7], S[0], S[1]);
		S[2] += t0;
		S[6] = t0 + t1;
		;
		t0 = S[5] + ModernizedCProgram.sigma1(S[2]) + ModernizedCProgram.ch(S[2], S[3], S[4]) + -1024 + W[50];
		t1 = ModernizedCProgram.sigma0(S[6]) + ModernizedCProgram.maj(S[6], S[7], S[0]);
		S[1] += t0;
		S[5] = t0 + t1;
		;
		t0 = S[4] + ModernizedCProgram.sigma1(S[1]) + ModernizedCProgram.ch(S[1], S[2], S[3]) + -1024 + W[51];
		t1 = ModernizedCProgram.sigma0(S[5]) + ModernizedCProgram.maj(S[5], S[6], S[7]);
		S[0] += t0;
		S[4] = t0 + t1;
		;
		t0 = S[3] + ModernizedCProgram.sigma1(S[0]) + ModernizedCProgram.ch(S[0], S[1], S[2]) + -1024 + W[52];
		t1 = ModernizedCProgram.sigma0(S[4]) + ModernizedCProgram.maj(S[4], S[5], S[6]);
		S[7] += t0;
		S[3] = t0 + t1;
		;
		t0 = S[2] + ModernizedCProgram.sigma1(S[7]) + ModernizedCProgram.ch(S[7], S[0], S[1]) + -1024 + W[53];
		t1 = ModernizedCProgram.sigma0(S[3]) + ModernizedCProgram.maj(S[3], S[4], S[5]);
		S[6] += t0;
		S[2] = t0 + t1;
		;
		t0 = S[1] + ModernizedCProgram.sigma1(S[6]) + ModernizedCProgram.ch(S[6], S[7], S[0]) + -1024 + W[54];
		t1 = ModernizedCProgram.sigma0(S[2]) + ModernizedCProgram.maj(S[2], S[3], S[4]);
		S[5] += t0;
		S[1] = t0 + t1;
		;
		t0 = S[0] + ModernizedCProgram.sigma1(S[5]) + ModernizedCProgram.ch(S[5], S[6], S[7]) + -1024 + W[55];
		t1 = ModernizedCProgram.sigma0(S[1]) + ModernizedCProgram.maj(S[1], S[2], S[3]);
		S[4] += t0;
		S[0] = t0 + t1;
		;
		t0 = S[7] + ModernizedCProgram.sigma1(S[4]) + ModernizedCProgram.ch(S[4], S[5], S[6]) + -1024 + W[56];
		t1 = ModernizedCProgram.sigma0(S[0]) + ModernizedCProgram.maj(S[0], S[1], S[2]);
		S[3] += t0;
		S[7] = t0 + t1;
		;
		t0 = S[6] + ModernizedCProgram.sigma1(S[3]) + ModernizedCProgram.ch(S[3], S[4], S[5]) + -1024 + W[57];
		t1 = ModernizedCProgram.sigma0(S[7]) + ModernizedCProgram.maj(S[7], S[0], S[1]);
		S[2] += t0;
		S[6] = t0 + t1;
		;
		t0 = S[5] + ModernizedCProgram.sigma1(S[2]) + ModernizedCProgram.ch(S[2], S[3], S[4]) + -1024 + W[58];
		t1 = ModernizedCProgram.sigma0(S[6]) + ModernizedCProgram.maj(S[6], S[7], S[0]);
		S[1] += t0;
		S[5] = t0 + t1;
		;
		t0 = S[4] + ModernizedCProgram.sigma1(S[1]) + ModernizedCProgram.ch(S[1], S[2], S[3]) + -1024 + W[59];
		t1 = ModernizedCProgram.sigma0(S[5]) + ModernizedCProgram.maj(S[5], S[6], S[7]);
		S[0] += t0;
		S[4] = t0 + t1;
		;
		t0 = S[3] + ModernizedCProgram.sigma1(S[0]) + ModernizedCProgram.ch(S[0], S[1], S[2]) + -1024 + W[60];
		t1 = ModernizedCProgram.sigma0(S[4]) + ModernizedCProgram.maj(S[4], S[5], S[6]);
		S[7] += t0;
		S[3] = t0 + t1;
		;
		t0 = S[2] + ModernizedCProgram.sigma1(S[7]) + ModernizedCProgram.ch(S[7], S[0], S[1]) + -1024 + W[61];
		t1 = ModernizedCProgram.sigma0(S[3]) + ModernizedCProgram.maj(S[3], S[4], S[5]);
		S[6] += t0;
		S[2] = t0 + t1;
		;
		t0 = S[1] + ModernizedCProgram.sigma1(S[6]) + ModernizedCProgram.ch(S[6], S[7], S[0]) + -1024 + W[62];
		t1 = ModernizedCProgram.sigma0(S[2]) + ModernizedCProgram.maj(S[2], S[3], S[4]);
		S[5] += t0;
		S[1] = t0 + t1;
		;
		t0 = S[0] + ModernizedCProgram.sigma1(S[5]) + ModernizedCProgram.ch(S[5], S[6], S[7]) + -1024 + W[63];
		t1 = ModernizedCProgram.sigma0(S[1]) + ModernizedCProgram.maj(S[1], S[2], S[3]);
		S[4] += t0;
		S[0] = t0 + t1;
		;
		for (i = 0; i < 8; i++) {
			ModernizedCProgram.ctx.getState()[i] += S[i];
		}
	}
	public void blk_SHA256_Update(Object data, Object len) {
		int len_buf = ModernizedCProgram.ctx.getSize() & 63;
		ModernizedCProgram.ctx.getSize() += len;
		if (/* Read the data into buf and process blocks as they get full */len_buf) {
			int left = 64 - len_buf;
			if (len < left) {
				left = len;
			} 
			.memcpy(len_buf + ModernizedCProgram.ctx.getBuf(), data, left);
			len_buf = (len_buf + left) & 63;
			len -= left;
			data = ((byte)data + left);
			if (len_buf) {
				return ;
			} 
			ModernizedCProgram.ctx.blk_SHA256_Transform(ModernizedCProgram.ctx.getBuf());
		} 
		while (len >= 64) {
			ModernizedCProgram.ctx.blk_SHA256_Transform(data);
			data = ((byte)data + 64);
			len -= 64;
		}
		if (len) {
			.memcpy(ModernizedCProgram.ctx.getBuf(), data, len);
		} 
	}
	public void blk_SHA256_Final(Byte digest) {
		byte[] pad = new byte[]{-1024};
		int[] padlen = new int[2];
		int i;
		padlen[0] = .htonl((uint32_t)(ModernizedCProgram.ctx.getSize() >> /* Pad with a binary 1 (ie 0x80), then zeroes, then length */29));
		padlen[1] = .htonl((uint32_t)(ModernizedCProgram.ctx.getSize() << 3));
		i = ModernizedCProgram.ctx.getSize() & 63;
		ModernizedCProgram.ctx.blk_SHA256_Update(pad, 1 + (63 & (55 - i)));
		ModernizedCProgram.ctx.blk_SHA256_Update(padlen, 8);
		for (i = 0; i < 8; ) {
			.put_be32(digest, ModernizedCProgram.ctx.getState()[i]);
		}
	}
	public Object getState() {
		return state;
	}
	public void setState(Object newState) {
		state = newState;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
}
