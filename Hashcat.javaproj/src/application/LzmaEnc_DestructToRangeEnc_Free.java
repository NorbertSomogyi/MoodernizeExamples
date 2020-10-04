package application;

public class LzmaEnc_DestructToRangeEnc_Free {
	
	
	public static void LzmaEnc_Destruct(Object alloc, Object allocBig) {
		Object generatedMatchFinderMt = this.getMatchFinderMt();
		generatedMatchFinderMt.MatchFinderMt_Destruct(allocBig);
		Object generatedMatchFinderBase = this.getMatchFinderBase();
		generatedMatchFinderBase.MatchFinder_Free(allocBig);
		p.LzmaEnc_FreeLits(alloc);
		Object generatedRc = this.getRc();
		generatedRc.RangeEnc_Free(alloc);
	}
	private static void LzmaEnc_FreeLits(Object alloc) {
		Object generatedLitProbs = this.getLitProbs();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedLitProbs);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedLitProbs);
		this.setLitProbs((null));
		Object generatedSaveState = this.getSaveState();
		generatedSaveState.setLitProbs((null));
	}
	private static void RangeEnc_Free(Object alloc) {
		Object generatedBufBase = this.getBufBase();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedBufBase);
		this.setBufBase(0);
	}
}
