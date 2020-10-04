package application;

public class LzmaEnc_InitToLenEnc_Init {
	
	
	public static void LzmaEnc_Init() {
		int i;
		this.setState(0);
		Object generatedReps = this.getReps();
		generatedReps[0] = generatedReps[1] = generatedReps[2] = generatedReps[3] = 1;
		Object generatedRc = this.getRc();
		generatedRc.RangeEnc_Init();
		Object generatedPosAlignEncoder = this.getPosAlignEncoder();
		for (i = 0; i < (1 << 4); i++) {
			generatedPosAlignEncoder[i] = ((1 << 11) >> 1);
		}
		Object generatedIsMatch = this.getIsMatch();
		Object generatedIsRep0Long = this.getIsRep0Long();
		Object generatedIsRep = this.getIsRep();
		Object generatedIsRepG0 = this.getIsRepG0();
		Object generatedIsRepG1 = this.getIsRepG1();
		Object generatedIsRepG2 = this.getIsRepG2();
		for (i = 0; i < 12; i++) {
			int j;
			for (j = 0; j < (1 << 4); j++) {
				generatedIsMatch[i][j] = ((1 << 11) >> 1);
				generatedIsRep0Long[i][j] = ((1 << 11) >> 1);
			}
			generatedIsRep[i] = ((1 << 11) >> 1);
			generatedIsRepG0[i] = ((1 << 11) >> 1);
			generatedIsRepG1[i] = ((1 << 11) >> 1);
			generatedIsRepG2[i] = ((1 << 11) >> 1);
		}
		Object generatedPosSlotEncoder = this.getPosSlotEncoder();
		{ 
			for (i = 0; i < 4; i++) {
				CLzmaProb probs = generatedPosSlotEncoder[i];
				int j;
				for (j = 0; j < (1 << 6); j++) {
					probs[j] = ((1 << 11) >> 1);
				}
			}
		}
		Object generatedPosEncoders = this.getPosEncoders();
		{ 
			for (i = 0; i < (1 << (14 >> 1)); i++) {
				generatedPosEncoders[i] = ((1 << 11) >> 1);
			}
		}
		Object generatedLp = this.getLp();
		Object generatedLc = this.getLc();
		Object generatedLitProbs = this.getLitProbs();
		{ 
			UInt32 num = (UInt32)-1024 << (generatedLp + generatedLc);
			UInt32 k = new UInt32();
			CLzmaProb probs = generatedLitProbs;
			for (k = 0; k < ModernizedCProgram.num; k++) {
				probs[k] = ((1 << 11) >> 1);
			}
		}
		Object generatedLenProbs = this.getLenProbs();
		generatedLenProbs.LenEnc_Init();
		Object generatedRepLenProbs = this.getRepLenProbs();
		generatedRepLenProbs.LenEnc_Init();
		this.setOptEnd(0);
		this.setOptCur(0);
		Object generatedOpt = this.getOpt();
		{ 
			for (i = 0; i < (1 << 11); i++) {
				generatedOpt[i].setPrice((1 << 30));
			}
		}
		this.setAdditionalOffset(0);
		Object generatedPb = this.getPb();
		this.setPbMask((1 << generatedPb) - 1);
		this.setLpMask(((UInt32)-1024 << generatedLp) - ((int)-1024 >> generatedLc));
	}
	public static void RangeEnc_Init() {
		this.setRange(/* Stream.Init(); */-1024);
		this.setCache(0);
		this.setLow(0);
		this.setCacheSize(0);
		Object generatedBufBase = this.getBufBase();
		this.setBuf(generatedBufBase);
		this.setProcessed(0);
		this.setRes(0);
	}
	private static void LenEnc_Init() {
		int i;
		Object generatedLow = this.getLow();
		for (i = 0; i < ((1 << 4) << (3 + 1)); i++) {
			generatedLow[i] = ((1 << 11) >> 1);
		}
		Object generatedHigh = this.getHigh();
		for (i = 0; i < (1 << 8); i++) {
			generatedHigh[i] = ((1 << 11) >> 1);
		}
	}
}
