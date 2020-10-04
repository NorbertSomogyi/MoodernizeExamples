package application;

public class BMK_sanityCheckToXXH64_update {
	
	
	private static void BMK_sanityCheck() {
		U32 prime = -1024;
		BYTE[] sanityBuffer = new BYTE();
		U32 byteGen = prime;
		int i;
		for (i = 0; i < 101; i++) {
			sanityBuffer[i] = (BYTE)(byteGen >> 24);
			byteGen *= byteGen;
		}
		ModernizedCProgram.BMK_testSequence((null), 0, 0, -1024);
		ModernizedCProgram.BMK_testSequence((null), 0, prime, -1024);
		ModernizedCProgram.BMK_testSequence(sanityBuffer, 1, 0, -1024);
		ModernizedCProgram.BMK_testSequence(sanityBuffer, 1, prime, -1024);
		ModernizedCProgram.BMK_testSequence(sanityBuffer, 14, 0, -1024);
		ModernizedCProgram.BMK_testSequence(sanityBuffer, 14, prime, -1024);
		ModernizedCProgram.BMK_testSequence(sanityBuffer, 101, 0, -1024);
		ModernizedCProgram.BMK_testSequence(sanityBuffer, 101, prime, -1024);
		ModernizedCProgram.BMK_testSequence64((null), 0, 0, -1024);
		ModernizedCProgram.BMK_testSequence64((null), 0, prime, -1024);
		ModernizedCProgram.BMK_testSequence64(sanityBuffer, 1, 0, -1024);
		ModernizedCProgram.BMK_testSequence64(sanityBuffer, 1, prime, -1024);
		ModernizedCProgram.BMK_testSequence64(sanityBuffer, 14, 0, -1024);
		ModernizedCProgram.BMK_testSequence64(sanityBuffer, 14, prime, -1024);
		ModernizedCProgram.BMK_testSequence64(sanityBuffer, 101, 0, -1024);
		ModernizedCProgram.BMK_testSequence64(sanityBuffer, 101, prime, -1024);
		do {
			if (ModernizedCProgram.g_displayLevel >= 3) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "\r%70s\r", "");
			} 
		} while (/* Clean display line */0);
		do {
			if (ModernizedCProgram.g_displayLevel >= 3) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Sanity check -- all tests ok\n");
			} 
		} while (0/* ********************************************************
		*  File Hashing
		**********************************************************/);
	}
	private static void BMK_testSequence(Object sequence, Object len, Object seed, Object Nresult) {
		XXH32_state_t state = new XXH32_state_t();
		U32 Dresult = new U32();
		size_t pos = new size_t();
		Dresult = ModernizedCProgram.XXH32(sequence, len, seed);
		ModernizedCProgram.BMK_checkResult(Dresult, Nresult);
		state.XXH32_reset(seed);
		state.XXH32_update(sequence, len);
		Dresult = ModernizedCProgram.XXH32_digest(state);
		ModernizedCProgram.BMK_checkResult(Dresult, Nresult);
		state.XXH32_reset(seed);
		for (pos = 0; pos < len; pos++) {
			state.XXH32_update(((byte)sequence) + pos, 1);
		}
		Dresult = ModernizedCProgram.XXH32_digest(state);
		ModernizedCProgram.BMK_checkResult(Dresult, Nresult);
	}
	private static void BMK_checkResult(Object r1, Object r2) {
		int nbTests = 1;
		if (r1 == r2) {
			do {
				if (ModernizedCProgram.g_displayLevel >= 3) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "\rTest%3i : %08X == %08X   ok   ", nbTests, r1, r2);
				} 
			} while (0);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "\rERROR : Test%3i : %08X <> %08X   !!!!!   \n", nbTests, r1, r2);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		nbTests++;
	}
	private static  XXH32_update(Object input, Object len) {
		XXH_endianess endian_detected = (XXH_endianess)ModernizedCProgram.XXH_isLittleEndian();
		if ((endian_detected == .XXH_littleEndian) || false) {
			return state_in.XXH32_update_endian(input, len, .XXH_littleEndian);
		} else {
				return state_in.XXH32_update_endian(input, len, .XXH_bigEndian);
		} 
	}
	private static void BMK_testSequence64(Object sentence, Object len, Object seed, Object Nresult) {
		XXH64_state_t state = new XXH64_state_t();
		U64 Dresult = new U64();
		size_t pos = new size_t();
		Dresult = ModernizedCProgram.XXH64(sentence, len, seed);
		ModernizedCProgram.BMK_checkResult64(Dresult, Nresult);
		state.XXH64_reset(seed);
		state.XXH64_update(sentence, len);
		Dresult = ModernizedCProgram.XXH64_digest(state);
		ModernizedCProgram.BMK_checkResult64(Dresult, Nresult);
		state.XXH64_reset(seed);
		for (pos = 0; pos < len; pos++) {
			state.XXH64_update(((byte)sentence) + pos, 1);
		}
		Dresult = ModernizedCProgram.XXH64_digest(state);
		ModernizedCProgram.BMK_checkResult64(Dresult, Nresult);
	}
	private static void BMK_checkResult64(Object r1, Object r2) {
		int nbTests = 1;
		if (r1 != r2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "\rERROR : Test%3i : 64-bit values non equals   !!!!!   \n", nbTests);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "\r %08X%08X != %08X%08X \n", (U32)(r1 >> 32), (U32)r1, (U32)(r2 >> 32), (U32)r2);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		nbTests++;
	}
	public static  XXH64_update(Object input, Object len) {
		XXH_endianess endian_detected = (XXH_endianess)ModernizedCProgram.XXH_isLittleEndian();
		if ((endian_detected == .XXH_littleEndian) || false) {
			return state_in.XXH64_update_endian(input, len, .XXH_littleEndian);
		} else {
				return state_in.XXH64_update_endian(input, len, .XXH_bigEndian);
		} 
	}
}
