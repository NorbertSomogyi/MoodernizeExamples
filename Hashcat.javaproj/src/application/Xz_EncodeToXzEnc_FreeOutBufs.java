package application;

public class Xz_EncodeToXzEnc_FreeOutBufs {
	
	
	private static Object Xz_Encode(ISeqOutStream outStream, ISeqInStream inStream, Object props, ICompressProgress progress) {
		SRes res = new SRes();
		CXzEncHandle xz = ModernizedCProgram.XzEnc_Create(ModernizedCProgram.g_Alloc, ModernizedCProgram.g_BigAlloc);
		if (!xz) {
			return 2;
		} 
		res = ModernizedCProgram.XzEnc_SetProps(xz, props);
		if (res == 0) {
			res = ModernizedCProgram.XzEnc_Encode(xz, outStream, inStream, progress);
		} 
		ModernizedCProgram.XzEnc_Destroy(xz);
		return res;
	}
	private static void XzEnc_Destroy(Object pp) {
		CXzEnc p = (CXzEnc)pp;
		Object generatedAlloc = p.getAlloc();
		p.XzEnc_Free(generatedAlloc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAlloc, p);
	}
	private static void XzEnc_Free(Object alloc) {
		int i;
		Object generatedXzIndex = this.getXzIndex();
		generatedXzIndex.XzEncIndex_Free(alloc);
		Object generatedLzmaf_Items = this.getLzmaf_Items();
		for (i = 0; i < 64; i++) {
			generatedLzmaf_Items[i].Lzma2WithFilters_Free(alloc);
		}
		Object generatedMtCoder_WasConstructed = this.getMtCoder_WasConstructed();
		Object generatedMtCoder = this.getMtCoder();
		if (generatedMtCoder_WasConstructed) {
			generatedMtCoder.MtCoder_Destruct();
			this.setMtCoder_WasConstructed(0);
		} 
		p.XzEnc_FreeOutBufs();
	}
	public static void XzEncIndex_Free(Object alloc) {
		Object generatedBlocks = this.getBlocks();
		if (generatedBlocks) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedBlocks);
			this.setBlocks((null));
		} 
		this.setNumBlocks(0);
		this.setSize(0);
		this.setAllocated(0);
	}
	private static void XzEnc_FreeOutBufs() {
		int i;
		Object generatedOutBufs = this.getOutBufs();
		Object generatedAlloc = this.getAlloc();
		for (i = 0; i < (((true) + (true) / 8 + 1) + 3); i++) {
			if (generatedOutBufs[i]) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAlloc, generatedOutBufs[i]);
				generatedOutBufs[i] = (null);
			} 
		}
		this.setOutBufSize(0);
	}
}
