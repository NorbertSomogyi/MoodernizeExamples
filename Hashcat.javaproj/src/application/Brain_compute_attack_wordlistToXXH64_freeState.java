package application;

public class Brain_compute_attack_wordlistToXXH64_freeState {
	
	
	private static Object brain_compute_attack_wordlist(Object filename) {
		XXH64_state_t state = ModernizedCProgram.XXH64_createState();
		state.XXH64_reset(0);
		byte[] buf = new byte[8192];
		HCFILE fp = new HCFILE();
		fp.hc_fopen(filename, "rb");
		while (!fp.hc_feof()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(buf, 0, /*Error: sizeof expression not supported yet*/);
			size_t nread = fp.hc_fread(buf, 1, 8192);
			state.XXH64_update(buf, nread);
		}
		fp.hc_fclose();
		u64 hash = ModernizedCProgram.XXH64_digest(state);
		state.XXH64_freeState();
		return hash;
	}
	public static  XXH64_reset(int seed) {
		/* using a local state to memcpy() in order to avoid strict-aliasing warnings */XXH64_state_t state = new XXH64_state_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(state, 0, /*Error: sizeof expression not supported yet*/);
		state.setV1(seed + ModernizedCProgram.PRIME64_1 + ModernizedCProgram.PRIME64_2);
		state.setV2(seed + ModernizedCProgram.PRIME64_2);
		state.setV3(seed + 0);
		state.setV4(seed - ModernizedCProgram.PRIME64_1);
		Object generatedReserved = state.getReserved();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(statePtr, state, /*Error: sizeof expression not supported yet*/ - /*Error: sizeof expression not supported yet*/);
		return .XXH_OK;
	}
	public static  XXH64_freeState() {
		ModernizedCProgram.XXH_free(statePtr);
		return .XXH_OK;
	}
}
