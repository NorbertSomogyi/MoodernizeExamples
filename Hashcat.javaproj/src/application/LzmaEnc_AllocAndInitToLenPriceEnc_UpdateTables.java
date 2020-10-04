package application;

public class LzmaEnc_AllocAndInitToLenPriceEnc_UpdateTables {
	
	
	private static Object LzmaEnc_AllocAndInit(Object keepWindowSize, Object alloc, Object allocBig) {
		int i;
		Object generatedDictSize = this.getDictSize();
		for (i = 14 / 2; i < 32; i++) {
			if (generatedDictSize <= ((UInt32)1 << i)) {
				break;
			} 
		}
		this.setDistTableSize(i * 2);
		this.setFinished(0);
		this.setResult(0);
		{ 
			int __result__ = (p.LzmaEnc_Alloc(keepWindowSize, alloc, allocBig));
			if (__result__ != 0) {
				return __result__;
			} 
		}
		;
		p.LzmaEnc_Init();
		p.LzmaEnc_InitPrices();
		this.setNowPos64(0);
		return 0;
	}
	public static void LzmaEnc_InitPrices() {
		Object generatedFastMode = this.getFastMode();
		if (!generatedFastMode) {
			p.FillDistancesPrices();
			p.FillAlignPrices();
		} 
		Object generatedNumFastBytes = this.getNumFastBytes();
		Object generatedRepLenEnc = this.getRepLenEnc();
		Object generatedLenEnc = this.getLenEnc();
		generatedLenEnc.setTableSize(generatedRepLenEnc.setTableSize(generatedNumFastBytes + 1 - 2));
		this.setRepLenEncCounter(64);
		Object generatedPb = this.getPb();
		Object generatedLenProbs = this.getLenProbs();
		Object generatedProbPrices = this.getProbPrices();
		generatedLenEnc.LenPriceEnc_UpdateTables(1 << generatedPb, generatedLenProbs, generatedProbPrices);
		Object generatedRepLenProbs = this.getRepLenProbs();
		generatedRepLenEnc.LenPriceEnc_UpdateTables(1 << generatedPb, generatedRepLenProbs, generatedProbPrices);
	}
	private static void LenPriceEnc_UpdateTables(int numPosStates, Object enc, Object[] ProbPrices) {
		UInt32 b = new UInt32();
		Object generatedPrices = this.getPrices();
		{ 
			int prob = enc.getLow()[0];
			UInt32 a = new UInt32();
			UInt32 c = new UInt32();
			int posState;
			b = ProbPrices[((prob) ^ ((1 << 11) - 1)) >> 4];
			a = ProbPrices[(prob) >> 4];
			c = b + ProbPrices[(enc.getLow()[(1 << 3)]) >> 4];
			for (posState = 0; posState < numPosStates; posState++) {
				UInt32 prices = generatedPrices[posState];
				CLzmaProb probs = enc.getLow() + (posState << (1 + 3));
				ModernizedCProgram.SetPrices_3(probs, a, prices, ProbPrices);
				ModernizedCProgram.SetPrices_3(probs + (1 << 3), c, prices + (1 << 3), ProbPrices/*
				  {
				    unsigned i;
				    UInt32 b;
				    a = GET_PRICEa_0(enc->low[0]);
				    for (i = 0; i < kLenNumLowSymbols; i++)
				      p->prices2[i] = a;
				    a = GET_PRICEa_1(enc->low[0]);
				    b = a + GET_PRICEa_0(enc->low[kLenNumLowSymbols]);
				    for (i = kLenNumLowSymbols; i < kLenNumLowSymbols * 2; i++)
				      p->prices2[i] = b;
				    a += GET_PRICEa_1(enc->low[kLenNumLowSymbols]);
				  }
				  */);
			}
		}
		Object generatedTableSize = this.getTableSize();
		{ 
			int i = generatedTableSize;
			if (i > (1 << 3) * 2) {
				CLzmaProb probs = enc.getHigh();
				UInt32 prices = generatedPrices[0] + (1 << 3) * 2;
				i -= (1 << 3) * 2 - 1;
				i >>=  1;
				b += ProbPrices[((enc.getLow()[(1 << 3)]) ^ ((1 << 11) - 1)) >> 4];
				do {
					int sym = --i + (1 << (8 - 1));
					UInt32 price = b;
					do {
						int bit = sym & 1;
						sym >>=  1;
						price += ProbPrices[((probs[sym]) ^ (int)((-((int)(bit))) & ((1 << 11) - 1))) >> 4];
						;
					} while (sym >= 2);
					{ 
						int prob = probs[(size_t)i + (1 << (8 - 1))];
						prices[(size_t)i * 2] = price + ProbPrices[(prob) >> 4];
						prices[(size_t)i * 2 + 1] = price + ProbPrices[((prob) ^ ((1 << 11) - 1)) >> 4];
					}
				} while (i);
				{ 
					int posState;
					size_t num = (generatedTableSize - (1 << 3) * 2) * /*Error: sizeof expression not supported yet*/;
					for (posState = 1; posState < numPosStates; posState++) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPrices[posState] + (1 << 3) * 2, generatedPrices[0] + (1 << 3) * 2, ModernizedCProgram.num);
					}
				}
			} 
		}
	}
}
