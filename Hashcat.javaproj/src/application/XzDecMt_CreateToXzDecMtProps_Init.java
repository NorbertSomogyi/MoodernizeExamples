package application;

public class XzDecMt_CreateToXzDecMtProps_Init {
	
	
	private static Object XzDecMt_Create(Object alloc, Object allocMid) {
		CXzDecMt p = (CXzDecMt)/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, /*Error: Unsupported expression*/);
		if (!p) {
			return (null);
		} 
		Object generatedAlignOffsetAlloc = p.getAlignOffsetAlloc();
		generatedAlignOffsetAlloc.AlignOffsetAlloc_CreateVTable();
		generatedAlignOffsetAlloc.setBaseAlloc(alloc);
		generatedAlignOffsetAlloc.setNumAlignBits(7);
		generatedAlignOffsetAlloc.setOffset(0);
		p.setAllocMid(allocMid);
		p.setOutBuf((null));
		p.setOutBufSize(0);
		p.setInBuf((null));
		p.setInBufSize(0);
		Object generatedDec = p.getDec();
		generatedDec.XzUnpacker_Construct(generatedAlignOffsetAlloc.getVt());
		p.setUnpackBlockMaxSize(0);
		Object generatedProps = p.getProps();
		generatedProps.XzDecMtProps_Init();
		p.setMtc_WasConstructed(0);
		Object generatedCoders = p.getCoders();
		{ 
			int i;
			for (i = 0; i < 32; i++) {
				CXzDecMtThread coder = generatedCoders[i];
				coder.setDec_created(0);
				coder.setOutBuf((null));
				coder.setOutBufSize(0);
			}
		}
		return p;
	}
	public static void AlignOffsetAlloc_CreateVTable() {
		Object generatedVt = this.getVt();
		generatedVt.setAlloc(AlignOffsetAlloc_Alloc);
		generatedVt.setFree(AlignOffsetAlloc_Free);
	}
	private static void XzUnpacker_Construct(Object alloc) {
		Object generatedDecoder = this.getDecoder();
		generatedDecoder.MixCoder_Construct(alloc);
		this.setOutBuf((null));
		this.setOutBufSize(0);
		p.XzUnpacker_Init();
	}
	private static void XzDecMtProps_Init() {
		this.setInBufSize_ST(1 << 18);
		this.setOutStep_ST(1 << 20);
		this.setIgnoreErrors(0);
		this.setNumThreads(1);
		this.setInBufSize_MT(1 << 18);
		this.setMemUseMax(/*Error: Unsupported expression*/ << 28);
	}
}
