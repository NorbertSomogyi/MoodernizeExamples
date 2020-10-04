package application;

public class Lzma2Enc_CreateToLzma2EncProps_Normalize {
	
	
	private static Object Lzma2Enc_Create(Object alloc, Object allocBig) {
		CLzma2Enc p = (CLzma2Enc)/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, /*Error: Unsupported expression*/);
		if (!p) {
			return (null);
		} 
		Object generatedProps = p.getProps();
		generatedProps.Lzma2EncProps_Init();
		generatedProps.Lzma2EncProps_Normalize();
		p.setExpectedDataSize((UInt64)(Int64)-1);
		p.setTempBufLzma((null));
		p.setAlloc(alloc);
		p.setAllocBig(allocBig);
		Object generatedCoders = p.getCoders();
		{ 
			int i;
			for (i = 0; i < 64; i++) {
				generatedCoders[i].setEnc((null));
			}
		}
		p.setMtCoder_WasConstructed(0);
		Object generatedOutBufs = p.getOutBufs();
		{ 
			int i;
			for (i = 0; i < (((true) + (true) / 8 + 1) + 3); i++) {
				generatedOutBufs[i] = (null);
			}
			p.setOutBufSize(0);
		}
		return p;
	}
	/* ---------- Lzma2 Props ---------- */
	public static void Lzma2EncProps_Init() {
		Object generatedLzmaProps = this.getLzmaProps();
		generatedLzmaProps.LzmaEncProps_Init();
		this.setBlockSize(0);
		this.setNumBlockThreads_Reduced(-1);
		this.setNumBlockThreads_Max(-1);
		this.setNumTotalThreads(-1);
	}
	public static void Lzma2EncProps_Normalize() {
		UInt64 fileSize = new UInt64();
		int t1;
		int t1n;
		int t2;
		int t2r;
		int t3;
		Object generatedLzmaProps = this.getLzmaProps();
		int generatedNumThreads = lzmaProps.getNumThreads();
		{ 
			CLzmaEncProps lzmaProps = generatedLzmaProps;
			lzmaProps.LzmaEncProps_Normalize();
			t1n = generatedNumThreads;
		}
		t1 = generatedNumThreads;
		Object generatedNumBlockThreads_Max = this.getNumBlockThreads_Max();
		t2 = generatedNumBlockThreads_Max;
		Object generatedNumTotalThreads = this.getNumTotalThreads();
		t3 = generatedNumTotalThreads;
		if (t2 > 64) {
			t2 = 64;
		} 
		if (t3 <= 0) {
			if (t2 <= 0) {
				t2 = 1;
			} 
			t3 = t1n * t2;
		}  else if (t2 <= 0) {
			t2 = t3 / t1n;
			if (t2 == 0) {
				t1 = 1;
				t2 = t3;
			} 
			if (t2 > 64) {
				t2 = 64;
			} 
		}  else if (t1 <= 0) {
			t1 = t3 / t2;
			if (t1 == 0) {
				t1 = 1;
			} 
		} else {
				t3 = t1n * t2;
		} 
		generatedLzmaProps.setNumThreads(t1);
		t2r = t2;
		fileSize = generatedLzmaProps.getReduceSize();
		Object generatedBlockSize = this.getBlockSize();
		if (generatedBlockSize != ((UInt64)(Int64)-1) && generatedBlockSize != 0 && (generatedBlockSize < fileSize || fileSize == (UInt64)(Int64)-1)) {
			generatedLzmaProps.setReduceSize(generatedBlockSize);
		} 
		generatedLzmaProps.LzmaEncProps_Normalize();
		generatedLzmaProps.setReduceSize(fileSize);
		t1 = generatedNumThreads;
		if (generatedBlockSize == ((UInt64)(Int64)-1)) {
			t2r = t2 = 1;
			t3 = t1;
		}  else if (generatedBlockSize == 0 && t2 <= 1) {
			this.setBlockSize(((UInt64)(Int64)-/* if there is no block multi-threading, we use SOLID block */1));
		} else {
				if (generatedBlockSize == 0) {
					UInt32 kMinSize = (UInt32)1 << 20;
					UInt32 kMaxSize = (UInt32)1 << 28;
					UInt32 dictSize = generatedLzmaProps.getDictSize();
					UInt64 blockSize = (UInt64)dictSize << 2;
					if (blockSize < kMinSize) {
						blockSize = kMinSize;
					} 
					if (blockSize > kMaxSize) {
						blockSize = kMaxSize;
					} 
					if (blockSize < dictSize) {
						blockSize = dictSize;
					} 
					blockSize += (kMinSize - 1);
					blockSize &=  ~(UInt64)(kMinSize - 1);
					this.setBlockSize(blockSize);
				} 
				if (t2 > 1 && fileSize != (UInt64)(Int64)-1) {
					UInt64 numBlocks = fileSize / generatedBlockSize;
					if (numBlocks * generatedBlockSize != fileSize) {
						numBlocks++;
					} 
					if (numBlocks < (int)t2) {
						t2r = (int)numBlocks;
						if (t2r == 0) {
							t2r = 1;
						} 
						t3 = t1 * t2r;
					} 
				} 
		} 
		this.setNumBlockThreads_Max(t2);
		this.setNumBlockThreads_Reduced(t2r);
		this.setNumTotalThreads(t3);
	}
}
