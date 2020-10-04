package application;

public class XzEnc_CreateToXzProps_Normalize {
	
	
	private static Object XzEnc_Create(Object alloc, Object allocBig) {
		CXzEnc p = (CXzEnc)/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, /*Error: Unsupported expression*/);
		if (!p) {
			return (null);
		} 
		p.XzEnc_Construct();
		Object generatedXzProps = p.getXzProps();
		generatedXzProps.XzProps_Init();
		generatedXzProps.XzProps_Normalize();
		p.setExpectedDataSize((UInt64)(Int64)-1);
		p.setAlloc(alloc);
		p.setAllocBig(allocBig);
		return p;
	}
	private static void XzEnc_Construct() {
		int i;
		Object generatedXzIndex = this.getXzIndex();
		generatedXzIndex.XzEncIndex_Construct();
		Object generatedLzmaf_Items = this.getLzmaf_Items();
		for (i = 0; i < 64; i++) {
			generatedLzmaf_Items[i].Lzma2WithFilters_Construct();
		}
		this.setMtCoder_WasConstructed(0);
		Object generatedOutBufs = this.getOutBufs();
		{ 
			for (i = 0; i < (((true) + (true) / 8 + 1) + 3); i++) {
				generatedOutBufs[i] = (null);
			}
			this.setOutBufSize(0);
		}
	}
	public static void XzEncIndex_Construct() {
		this.setNumBlocks(0);
		this.setSize(0);
		this.setAllocated(0);
		this.setBlocks((null));
	}
	private static void XzProps_Init() {
		this.setCheckId(1);
		this.setBlockSize(0);
		this.setNumBlockThreads_Reduced(-1);
		this.setNumBlockThreads_Max(-1);
		this.setNumTotalThreads(-1);
		this.setReduceSize((UInt64)(Int64)-1);
		this.setForceWriteSizesInHeader(0)// p->forceWriteSizesInHeader = 1;;// p->forceWriteSizesInHeader = 1;
		Object generatedFilterProps = this.getFilterProps();
		generatedFilterProps.XzFilterProps_Init();
		Object generatedLzma2Props = this.getLzma2Props();
		generatedLzma2Props.Lzma2EncProps_Init();
	}
	public static void XzProps_Normalize() {
		Object generatedBlockSize = this.getBlockSize();
		Object generatedReduceSize = this.getReduceSize();
		Object generatedLzma2Props = this.getLzma2Props();
		Object generatedNumTotalThreads = this.getNumTotalThreads();
		Object generatedNumBlockThreads_Reduced = tp.getNumBlockThreads_Reduced();
		Object generatedNumBlockThreads_Max = tp.getNumBlockThreads_Max();
		Object generatedLzmaProps = lzma2.getLzmaProps();
		if (generatedBlockSize == ((UInt64)(Int64)-1)) {
			generatedLzma2Props.getLzmaProps().setReduceSize(generatedReduceSize);
			this.setNumBlockThreads_Reduced(1);
			this.setNumBlockThreads_Max(1);
			if (generatedLzma2Props.getNumTotalThreads() <= 0) {
				generatedLzma2Props.setNumTotalThreads(generatedNumTotalThreads);
			} 
			return /*Error: Unsupported expression*/;
		} else {
				CLzma2EncProps lzma2 = generatedLzma2Props;
				if (generatedBlockSize == 0) {
					generatedLzma2Props.getLzmaProps().setReduceSize(generatedReduceSize);
					if (generatedBlockSize == ((UInt64)(Int64)-1)) {
						this.setBlockSize(((UInt64)(Int64)-1));
						this.setNumBlockThreads_Reduced(1);
						this.setNumBlockThreads_Max(1);
						if (generatedNumTotalThreads <= 0) {
							generatedLzma2Props.setNumTotalThreads(generatedNumTotalThreads);
						} 
					} else {
							CLzma2EncProps tp = generatedLzma2Props;
							if (generatedNumTotalThreads <= 0) {
								tp.setNumTotalThreads(generatedNumTotalThreads);
							} 
							tp.Lzma2EncProps_Normalize();
							this.setBlockSize(generatedBlockSize);
							this.setNumBlockThreads_Reduced(generatedNumBlockThreads_Reduced);
							this.setNumBlockThreads_Max(generatedNumBlockThreads_Max);
							if (generatedBlockSize == 0) {
								lzma2.setBlockSize(generatedBlockSize);
							} 
							if (generatedReduceSize > generatedBlockSize && generatedBlockSize != ((UInt64)(Int64)-1)) {
								generatedLzmaProps.setReduceSize(generatedBlockSize);
							} 
							lzma2.setNumBlockThreads_Reduced(1);
							lzma2.setNumBlockThreads_Max(1);
							return /*Error: Unsupported expression*/;
					} 
				} else {
						generatedLzmaProps.setReduceSize(generatedReduceSize);
						{ 
							UInt64 r = generatedReduceSize;
							if (r > generatedBlockSize || r == (UInt64)(Int64)-1) {
								r = generatedBlockSize;
							} 
							generatedLzmaProps.setReduceSize(r);
						}
						if (generatedBlockSize == 0) {
							lzma2.setBlockSize(((UInt64)(Int64)-1));
						}  else if (generatedBlockSize > generatedBlockSize && generatedBlockSize != ((UInt64)(Int64)-1)) {
							lzma2.setBlockSize(generatedBlockSize);
						} 
						p.XzEncProps_Normalize_Fixed();
				} 
		} 
	}
	/* we normalize xzProps properties, but we normalize only some of CXzProps::lzma2Props properties.
	     Lzma2Enc_SetProps() will normalize lzma2Props later. */
}
