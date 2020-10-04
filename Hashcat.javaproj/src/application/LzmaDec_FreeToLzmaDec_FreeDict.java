package application;

public class LzmaDec_FreeToLzmaDec_FreeDict {
	
	
	private static void LzmaDec_Free(Object alloc) {
		p.LzmaDec_FreeProbs(alloc);
		p.LzmaDec_FreeDict(alloc);
	}
	public static void LzmaDec_FreeProbs(Object alloc) {
		Object generatedProbs = this.getProbs();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedProbs);
		this.setProbs((null));
	}
	private static void LzmaDec_FreeDict(Object alloc) {
		Object generatedDic = this.getDic();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedDic);
		this.setDic((null));
	}
}
