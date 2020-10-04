package application;

public class XzDecMt_DestroyToXzDecMt_FreeOutBufs {
	
	
	private static void XzDecMt_Destroy(Object pp) {
		CXzDecMt p = (CXzDecMt)pp;
		p.XzDecMt_FreeSt();
		Object generatedMtc_WasConstructed = p.getMtc_WasConstructed();
		Object generatedMtc = p.getMtc();
		if (generatedMtc_WasConstructed) {
			generatedMtc.MtDec_Destruct();
			p.setMtc_WasConstructed(0);
		} 
		Object generatedCoders = p.getCoders();
		Object generatedDec_created = t.getDec_created();
		Object generatedDec = t.getDec();
		{ 
			int i;
			for (i = 0; i < 32; i++) {
				CXzDecMtThread t = generatedCoders[i];
				if (generatedDec_created) {
					generatedDec.XzUnpacker_Free();
					t.setDec_created(0);
				} 
			}
		}
		p.XzDecMt_FreeOutBufs();
		Object generatedAlignOffsetAlloc = p.getAlignOffsetAlloc();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAlignOffsetAlloc.getBaseAlloc(), pp);
	}
	private static void XzDecMt_FreeSt() {
		Object generatedDec = this.getDec();
		generatedDec.XzUnpacker_Free();
		Object generatedOutBuf = this.getOutBuf();
		Object generatedAllocMid = this.getAllocMid();
		if (generatedOutBuf) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAllocMid, generatedOutBuf);
			this.setOutBuf((null));
		} 
		this.setOutBufSize(0);
		Object generatedInBuf = this.getInBuf();
		if (generatedInBuf) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAllocMid, generatedInBuf);
			this.setInBuf((null));
		} 
		this.setInBufSize(0);
	}
	private static void XzUnpacker_Free() {
		Object generatedDecoder = this.getDecoder();
		generatedDecoder.MixCoder_Free();
	}
	private static void MixCoder_Free() {
		int i;
		this.setNumCoders(0);
		Object generatedCoders = this.getCoders();
		Object generatedP = sc.getP();
		Object generatedAlloc = this.getAlloc();
		for (i = 0; i < 4; i++) {
			IStateCoder sc = generatedCoders[i];
			if (generatedP) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedP, generatedAlloc);
				sc.setP((null));
			} 
		}
		Object generatedBuf = this.getBuf();
		if (generatedBuf) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAlloc, generatedBuf);
			this.setBuf((null));
		} 
	}
	private static void XzDecMt_FreeOutBufs() {
		int i;
		Object generatedCoders = this.getCoders();
		Object generatedOutBuf = coder.getOutBuf();
		Object generatedAllocMid = this.getAllocMid();
		for (i = 0; i < 32; i++) {
			CXzDecMtThread coder = generatedCoders[i];
			if (generatedOutBuf) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAllocMid, generatedOutBuf);
				coder.setOutBuf((null));
				coder.setOutBufSize(0);
			} 
		}
		this.setUnpackBlockMaxSize(0);
	}
}
