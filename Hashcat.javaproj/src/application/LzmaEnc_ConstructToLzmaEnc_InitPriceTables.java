package application;

public class LzmaEnc_ConstructToLzmaEnc_InitPriceTables {
	
	
	private static void LzmaEnc_Construct() {
		Object generatedRc = this.getRc();
		generatedRc.RangeEnc_Construct();
		Object generatedMatchFinderBase = this.getMatchFinderBase();
		generatedMatchFinderBase.MatchFinder_Construct();
		Object generatedMatchFinderMt = this.getMatchFinderMt();
		generatedMatchFinderMt.MatchFinderMt_Construct();
		generatedMatchFinderMt.setMatchFinder(generatedMatchFinderBase);
		{ 
			CLzmaEncProps props = new CLzmaEncProps();
			props.LzmaEncProps_Init();
			ModernizedCProgram.LzmaEnc_SetProps(p, props);
		}
		Object generatedG_FastPos = this.getG_FastPos();
		ModernizedCProgram.LzmaEnc_FastPosInit(generatedG_FastPos);
		Object generatedProbPrices = this.getProbPrices();
		ModernizedCProgram.LzmaEnc_InitPriceTables(generatedProbPrices);
		this.setLitProbs((null));
		Object generatedSaveState = this.getSaveState();
		generatedSaveState.setLitProbs((null));
	}
	private static void RangeEnc_Construct() {
		this.setOutStream((null));
		this.setBufBase((null));
	}
	/* #define kNumLogBits (11 + sizeof(size_t) / 8 * 3) */
	private static void LzmaEnc_FastPosInit(Object[] g_FastPos) {
		int slot;
		g_FastPos[0] = 0;
		g_FastPos[1] = 1;
		g_FastPos += 2;
		for (slot = 2; slot < (9 + /*Error: Unsupported expression*/ / 2) * 2; slot++) {
			size_t k = ((size_t)1 << ((slot >> 1) - 1));
			size_t j = new size_t();
			for (j = 0; j < k; j++) {
				g_FastPos[j] = (Byte)slot;
			}
			g_FastPos += k/* we can use ((limit - pos) >> 31) only if (pos < ((UInt32)1 << 31)) *//*
			#define BSR2_RET(pos, res) { unsigned zz = 6 + ((kNumLogBits - 1) & \
			  (0 - (((((UInt32)1 << (kNumLogBits + 6)) - 1) - pos) >> 31))); \
			  res = p->g_FastPos[pos >> zz] + (zz * 2); }
			*/;
		}
	}
	/*
	#define BSR2_RET(pos, res) { unsigned zz = 6 + ((kNumLogBits - 1) & \
	  (0 - (((((UInt32)1 << (kNumLogBits)) - 1) - (pos >> 6)) >> 31))); \
	  res = p->g_FastPos[pos >> zz] + (zz * 2); }
	*/
	private static void LzmaEnc_InitPriceTables(Object[] ProbPrices) {
		UInt32 i = new UInt32();
		for (i = 0; i < ((1 << 11) >> 4); i++) {
			int kCyclesBits = 4;
			UInt32 w = (i << 4) + (1 << (4 - 1));
			int bitCount = 0;
			int j;
			for (j = 0; j < kCyclesBits; j++) {
				w = w * w;
				bitCount <<=  1;
				while (w >= ((UInt32)1 << 16)) {
					w >>=  1;
					bitCount++;
				}
			}
			ProbPrices[i] = (CProbPrice)((11 << kCyclesBits) - 15 - bitCount);
		}
	}
}
