package application;

public class Fortuna_update_seedToFortuna_increment_counter {
	
	
	private static int fortuna_update_seed(Object inout) {
		Object generatedLock = this.getLock();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(generatedLock);
		state.fortuna_reseed((uint8_t)inout, (/* reseed using the provided seed */true));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(generatedLock);
		return state.fortuna_random_data((uint8_t)inout, (/* the seed file must be overwritten by a new seed file */true));
	}
	/*
	 * Corresponds to section 9.4.2.
	 */
	private static void fortuna_reseed(Object seed, Object length) {
		 ctx = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_init(ctx);
		Object generatedGen = this.getGen();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_update(ctx, generatedGen.getKey(), 32);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_update(ctx, seed, length);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_final(ctx, generatedGen.getKey());
		/* if the generator was unseeded, this will mark it as seeded */state.fortuna_increment_counter();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ctx, 0, /*Error: sizeof expression not supported yet*/);
	}
	/**
	 * @brief Fortuna PRNG implementation.
	 *
	 * The MIT License applies to this software. See the included LICENSE.txt file
	 * for more information.
	 */
	/**
	 * @brief Helper to increment the 128-bit counter (see section 9.4).
	 */
	private static void fortuna_increment_counter() {
		Object generatedGen = this.getGen();
		generatedGen.getCounter().getSplit().getL()++;
		if (generatedGen.getCounter().getSplit().getL() == /* on overflow of low, increment high */0) {
			generatedGen.getCounter().getSplit().getH()++;
		} 
	}
}
