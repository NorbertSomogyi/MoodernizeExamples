package application;

/* LzFind.h -- Match finder for LZ algorithms
2017-06-10 : Igor Pavlov : Public domain */
public class _CMatchFinder {
	private Object buffer;
	private Object pos;
	private Object posLimit;
	private Object streamPos;
	private Object lenLimit;
	private Object cyclicBufferPos;
	private Object cyclicBufferSize;
	private Object streamEndWasReached;
	private Object btMode;
	private Object bigHash;
	private Object directInput;
	private Object matchMaxLen;
	private Object[] hash;
	private Object[] son;
	private Object hashMask;
	private Object cutValue;
	private Object bufferBase;
	private ISeqInStream stream;
	private Object blockSize;
	private Object keepSizeBefore;
	private Object keepSizeAfter;
	private Object numHashBytes;
	private Object directInputRem;
	private Object historySize;
	private Object fixedHashSize;
	private Object hashSizeSum;
	private Object result;
	private Object crc;
	private Object numRefs;
	private Object expectedDataSize;
	
	public _CMatchFinder(Object buffer, Object pos, Object posLimit, Object streamPos, Object lenLimit, Object cyclicBufferPos, Object cyclicBufferSize, Object streamEndWasReached, Object btMode, Object bigHash, Object directInput, Object matchMaxLen, Object[] hash, Object[] son, Object hashMask, Object cutValue, Object bufferBase, ISeqInStream stream, Object blockSize, Object keepSizeBefore, Object keepSizeAfter, Object numHashBytes, Object directInputRem, Object historySize, Object fixedHashSize, Object hashSizeSum, Object result, Object crc, Object numRefs, Object expectedDataSize) {
		setBuffer(buffer);
		setPos(pos);
		setPosLimit(posLimit);
		setStreamPos(streamPos);
		setLenLimit(lenLimit);
		setCyclicBufferPos(cyclicBufferPos);
		setCyclicBufferSize(cyclicBufferSize);
		setStreamEndWasReached(streamEndWasReached);
		setBtMode(btMode);
		setBigHash(bigHash);
		setDirectInput(directInput);
		setMatchMaxLen(matchMaxLen);
		setHash(hash);
		setSon(son);
		setHashMask(hashMask);
		setCutValue(cutValue);
		setBufferBase(bufferBase);
		setStream(stream);
		setBlockSize(blockSize);
		setKeepSizeBefore(keepSizeBefore);
		setKeepSizeAfter(keepSizeAfter);
		setNumHashBytes(numHashBytes);
		setDirectInputRem(directInputRem);
		setHistorySize(historySize);
		setFixedHashSize(fixedHashSize);
		setHashSizeSum(hashSizeSum);
		setResult(result);
		setCrc(crc);
		setNumRefs(numRefs);
		setExpectedDataSize(expectedDataSize);
	}
	public _CMatchFinder() {
	}
	
	/* LzFind.c -- Match finder for LZ algorithms
	2018-07-08 : Igor Pavlov : Public domain */
	/* it must be power of 2 */
	public void LzInWindow_Free(Object alloc) {
		Object generatedDirectInput = this.getDirectInput();
		Object generatedBufferBase = this.getBufferBase();
		if (!generatedDirectInput) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedBufferBase);
			this.setBufferBase(((Object)0));
		} 
	}
	/* keepSizeBefore + keepSizeAfter + keepSizeReserv must be < 4G) */
	public int LzInWindow_Create(Object keepSizeReserv, Object alloc) {
		Object generatedKeepSizeBefore = this.getKeepSizeBefore();
		Object generatedKeepSizeAfter = this.getKeepSizeAfter();
		UInt32 blockSize = generatedKeepSizeBefore + generatedKeepSizeAfter + keepSizeReserv;
		Object generatedDirectInput = this.getDirectInput();
		if (generatedDirectInput) {
			this.setBlockSize(blockSize);
			return 1;
		} 
		Object generatedBufferBase = this.getBufferBase();
		Object generatedBlockSize = this.getBlockSize();
		if (!generatedBufferBase || generatedBlockSize != blockSize) {
			p.LzInWindow_Free(alloc);
			this.setBlockSize(blockSize);
			this.setBufferBase((Byte)/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, (size_t)blockSize));
		} 
		return (generatedBufferBase != ((Object)0));
	}
	public Object MatchFinder_GetPointerToCurrentPos() {
		Object generatedBuffer = this.getBuffer();
		return generatedBuffer;
	}
	public Object MatchFinder_GetNumAvailableBytes() {
		Object generatedStreamPos = this.getStreamPos();
		Object generatedPos = this.getPos();
		return generatedStreamPos - generatedPos;
	}
	public void MatchFinder_ReduceOffsets(Object subValue) {
		Object generatedPosLimit = this.getPosLimit();
		generatedPosLimit -= subValue;
		Object generatedPos = this.getPos();
		generatedPos -= subValue;
		Object generatedStreamPos = this.getStreamPos();
		generatedStreamPos -= subValue;
	}
	public void MatchFinder_ReadBlock() {
		Object generatedStreamEndWasReached = this.getStreamEndWasReached();
		Object generatedResult = this.getResult();
		if (generatedStreamEndWasReached || generatedResult != 0) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedDirectInput = this.getDirectInput();
		Object generatedStreamPos = this.getStreamPos();
		Object generatedPos = this.getPos();
		Object generatedDirectInputRem = this.getDirectInputRem();
		if (generatedDirectInput) {
			UInt32 curSize = -1024 - (generatedStreamPos - generatedPos);
			if (curSize > generatedDirectInputRem) {
				curSize = (UInt32)generatedDirectInputRem;
			} 
			generatedDirectInputRem -= curSize;
			generatedStreamPos += curSize;
			if (generatedDirectInputRem == 0) {
				this.setStreamEndWasReached(1);
			} 
			return /*Error: Unsupported expression*/;
		} 
		Object generatedBuffer = this.getBuffer();
		Object generatedBufferBase = this.getBufferBase();
		Object generatedBlockSize = this.getBlockSize();
		ISeqInStream generatedStream = this.getStream();
		Object generatedKeepSizeAfter = this.getKeepSizeAfter();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			Byte dest = generatedBuffer + (generatedStreamPos - generatedPos);
			size_t size = (generatedBufferBase + generatedBlockSize - dest);
			if (ModernizedCProgram.size == 0) {
				return /*Error: Unsupported expression*/;
			} 
			this.setResult(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedStream, dest, ModernizedCProgram.size));
			if (generatedResult != 0) {
				return /*Error: Unsupported expression*/;
			} 
			if (ModernizedCProgram.size == 0) {
				this.setStreamEndWasReached(1);
				return /*Error: Unsupported expression*/;
			} 
			generatedStreamPos += (UInt32)ModernizedCProgram.size;
			if (generatedStreamPos - generatedPos > generatedKeepSizeAfter) {
				return /*Error: Unsupported expression*/;
			} 
		}
	}
	public void MatchFinder_MoveBlock() {
		Object generatedBufferBase = this.getBufferBase();
		Object generatedBuffer = this.getBuffer();
		Object generatedKeepSizeBefore = this.getKeepSizeBefore();
		Object generatedStreamPos = this.getStreamPos();
		Object generatedPos = this.getPos();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(generatedBufferBase, generatedBuffer - generatedKeepSizeBefore, (size_t)(generatedStreamPos - generatedPos) + generatedKeepSizeBefore);
		this.setBuffer(generatedBufferBase + generatedKeepSizeBefore);
	}
	public int MatchFinder_NeedMove() {
		Object generatedDirectInput = this.getDirectInput();
		if (generatedDirectInput) {
			return 0;
		} 
		Object generatedBufferBase = this.getBufferBase();
		Object generatedBlockSize = this.getBlockSize();
		Object generatedBuffer = this.getBuffer();
		Object generatedKeepSizeAfter = this.getKeepSizeAfter();
		return ((size_t)(generatedBufferBase + generatedBlockSize - generatedBuffer) <= generatedKeepSizeAfter);
	}
	public void MatchFinder_ReadIfRequired() {
		Object generatedStreamEndWasReached = this.getStreamEndWasReached();
		if (generatedStreamEndWasReached) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedKeepSizeAfter = this.getKeepSizeAfter();
		Object generatedStreamPos = this.getStreamPos();
		Object generatedPos = this.getPos();
		if (generatedKeepSizeAfter >= generatedStreamPos - generatedPos) {
			p.MatchFinder_ReadBlock();
		} 
	}
	public void MatchFinder_CheckAndMoveAndRead() {
		if (p.MatchFinder_NeedMove()) {
			p.MatchFinder_MoveBlock();
		} 
		p.MatchFinder_ReadBlock();
	}
	public void MatchFinder_SetDefaultSettings() {
		this.setCutValue(32);
		this.setBtMode(1);
		this.setNumHashBytes(4);
		this.setBigHash(0);
	}
	public void MatchFinder_Construct() {
		int i;
		this.setBufferBase(((Object)0));
		this.setDirectInput(0);
		this.setHash(((Object)0));
		this.setExpectedDataSize((UInt64)(Int64)-1);
		p.MatchFinder_SetDefaultSettings();
		Object generatedCrc = this.getCrc();
		for (i = 0; i < 256; i++) {
			UInt32 r = (UInt32)i;
			int j;
			for (j = 0; j < 8; j++) {
				r = (r >> 1) ^ (-1024 & ((UInt32)0 - (r & 1)));
			}
			generatedCrc[i] = r;
		}
	}
	public void MatchFinder_FreeThisClassMemory(Object alloc) {
		Object[] generatedHash = this.getHash();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedHash);
		this.setHash(((Object)0));
	}
	public void MatchFinder_Free(Object alloc) {
		p.MatchFinder_FreeThisClassMemory(alloc);
		p.LzInWindow_Free(alloc);
	}
	public int MatchFinder_Create(Object historySize, Object keepAddBufferBefore, Object matchMaxLen, Object keepAddBufferAfter, Object alloc) {
		UInt32 sizeReserv = new UInt32();
		if (historySize > ((UInt32)7 << 29)) {
			p.MatchFinder_Free(alloc);
			return 0;
		} 
		sizeReserv = historySize >> 1;
		if (historySize >= ((UInt32)3 << 30)) {
			sizeReserv = historySize >> 3;
		}  else if (historySize >= ((UInt32)2 << 30)) {
			sizeReserv = historySize >> 2;
		} 
		sizeReserv += (keepAddBufferBefore + matchMaxLen + keepAddBufferAfter) / 2 + (1 << 19);
		this.setKeepSizeBefore(historySize + keepAddBufferBefore + 1);
		this.setKeepSizeAfter(matchMaxLen + keepAddBufferAfter);
		Object generatedNumHashBytes = this.getNumHashBytes();
		Object generatedExpectedDataSize = this.getExpectedDataSize();
		Object generatedFixedHashSize = this.getFixedHashSize();
		Object generatedBtMode = this.getBtMode();
		Object[] generatedHash = this.getHash();
		Object generatedNumRefs = this.getNumRefs();
		Object generatedHashSizeSum = this.getHashSizeSum();
		if (p.LzInWindow_Create(sizeReserv, /* we need one additional byte, since we use MoveBlock after pos++ and before dictionary using */alloc)) {
			UInt32 newCyclicBufferSize = historySize + 1;
			UInt32 hs = new UInt32();
			this.setMatchMaxLen(matchMaxLen);
			{ 
				this.setFixedHashSize(0);
				if (generatedNumHashBytes == 2) {
					hs = (1 << 16) - 1;
				} else {
						hs = historySize;
						if (hs > generatedExpectedDataSize) {
							hs = (UInt32)generatedExpectedDataSize;
						} 
						if (hs != 0) {
							hs--;
						} 
						hs |=  (hs >> 1);
						hs |=  (hs >> 2);
						hs |=  (hs >> 4);
						hs |=  (hs >> 8);
						hs >>=  1;
						hs |=  /* don't change it! It's required for Deflate */-1024;
						if (hs > (1 << 24)) {
							if (generatedNumHashBytes == 3) {
								hs = (1 << 24) - 1;
							} else {
									hs >>=  1/* if (bigHash) mode, GetHeads4b() in LzFindMt.c needs (hs >= ((1 << 24) - 1))) */;
							} 
						} 
				} 
				this.setHashMask(hs);
				hs++;
				if (generatedNumHashBytes > 2) {
					generatedFixedHashSize += (1 << 10);
				} 
				if (generatedNumHashBytes > 3) {
					generatedFixedHashSize += (1 << 16);
				} 
				if (generatedNumHashBytes > 4) {
					generatedFixedHashSize += (1 << 20);
				} 
				hs += generatedFixedHashSize;
			}
			{ 
				size_t newSize = new size_t();
				size_t numSons = new size_t();
				this.setHistorySize(historySize);
				this.setHashSizeSum(hs);
				this.setCyclicBufferSize(newCyclicBufferSize);
				numSons = newCyclicBufferSize;
				if (generatedBtMode) {
					numSons <<=  1;
				} 
				newSize = hs + numSons;
				if (generatedHash && generatedNumRefs == newSize) {
					return 1;
				} 
				p.MatchFinder_FreeThisClassMemory(alloc);
				this.setNumRefs(newSize);
				this.setHash(ModernizedCProgram.AllocRefs(newSize, alloc));
				if (generatedHash) {
					this.setSon(generatedHash + generatedHashSizeSum);
					return 1;
				} 
			}
		} 
		p.MatchFinder_Free(alloc);
		return 0;
	}
	public void MatchFinder_SetLimits() {
		Object generatedPos = this.getPos();
		UInt32 limit = ((UInt32)-1024) - generatedPos;
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		UInt32 limit2 = generatedCyclicBufferSize - generatedCyclicBufferPos;
		if (limit2 < limit) {
			limit = limit2;
		} 
		Object generatedStreamPos = this.getStreamPos();
		limit2 = generatedStreamPos - generatedPos;
		Object generatedKeepSizeAfter = this.getKeepSizeAfter();
		if (limit2 <= generatedKeepSizeAfter) {
			if (limit2 > 0) {
				limit2 = 1;
			} 
		} else {
				limit2 -= generatedKeepSizeAfter;
		} 
		if (limit2 < limit) {
			limit = limit2;
		} 
		Object generatedMatchMaxLen = this.getMatchMaxLen();
		{ 
			UInt32 lenLimit = generatedStreamPos - generatedPos;
			if (lenLimit > generatedMatchMaxLen) {
				lenLimit = generatedMatchMaxLen;
			} 
			this.setLenLimit(lenLimit);
		}
		this.setPosLimit(generatedPos + limit);
	}
	public void MatchFinder_Init_LowHash() {
		size_t i = new size_t();
		Object[] generatedHash = this.getHash();
		CLzRef items = generatedHash;
		Object generatedFixedHashSize = this.getFixedHashSize();
		size_t numItems = generatedFixedHashSize;
		for (i = 0; i < numItems; i++) {
			items[i] = 0;
		}
	}
	public void MatchFinder_Init_HighHash() {
		size_t i = new size_t();
		Object[] generatedHash = this.getHash();
		Object generatedFixedHashSize = this.getFixedHashSize();
		CLzRef items = generatedHash + generatedFixedHashSize;
		Object generatedHashMask = this.getHashMask();
		size_t numItems = (size_t)generatedHashMask + 1;
		for (i = 0; i < numItems; i++) {
			items[i] = 0;
		}
	}
	public void MatchFinder_Init_3(int readData) {
		this.setCyclicBufferPos(0);
		Object generatedBufferBase = this.getBufferBase();
		this.setBuffer(generatedBufferBase);
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		this.setPos(this.setStreamPos(generatedCyclicBufferSize));
		this.setResult(0);
		this.setStreamEndWasReached(0);
		if (readData) {
			p.MatchFinder_ReadBlock();
		} 
		p.MatchFinder_SetLimits();
	}
	public void MatchFinder_Init() {
		p.MatchFinder_Init_HighHash();
		p.MatchFinder_Init_LowHash();
		p.MatchFinder_Init_3(1);
	}
	public Object MatchFinder_GetSubValue() {
		Object generatedPos = this.getPos();
		Object generatedHistorySize = this.getHistorySize();
		return (generatedPos - generatedHistorySize - 1) & (~(UInt32)((1 << 10) - 1));
	}
	public void MatchFinder_Normalize() {
		UInt32 subValue = p.MatchFinder_GetSubValue();
		Object[] generatedHash = this.getHash();
		Object generatedNumRefs = this.getNumRefs();
		ModernizedCProgram.MatchFinder_Normalize3(subValue, generatedHash, generatedNumRefs);
		p.MatchFinder_ReduceOffsets(subValue);
	}
	public void MatchFinder_CheckLimits() {
		Object generatedPos = this.getPos();
		if (generatedPos == ((UInt32)-1024)) {
			p.MatchFinder_Normalize();
		} 
		Object generatedStreamEndWasReached = this.getStreamEndWasReached();
		Object generatedKeepSizeAfter = this.getKeepSizeAfter();
		Object generatedStreamPos = this.getStreamPos();
		if (!generatedStreamEndWasReached && generatedKeepSizeAfter == generatedStreamPos - generatedPos) {
			p.MatchFinder_CheckAndMoveAndRead();
		} 
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		if (generatedCyclicBufferPos == generatedCyclicBufferSize) {
			this.setCyclicBufferPos(0);
		} 
		p/*
		  (lenLimit > maxLen)
		*/.MatchFinder_SetLimits();
	}
	public void MatchFinder_MovePos() {
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		++generatedCyclicBufferPos;
		Object generatedBuffer = this.getBuffer();
		generatedBuffer++;
		Object generatedPos = this.getPos();
		Object generatedPosLimit = this.getPosLimit();
		if (++generatedPos == generatedPosLimit) {
			p.MatchFinder_CheckLimits();
		} 
		;
	}
	public Object Bt2_MatchFinder_GetMatches(Object distances) {
		int offset;
		int lenLimit;
		UInt32 hv = new UInt32();
		Byte cur = new Byte();
		UInt32 curMatch = new UInt32();
		Object generatedLenLimit = this.getLenLimit();
		lenLimit = (int)generatedLenLimit;
		{ 
			if (lenLimit < 2) {
				p.MatchFinder_MovePos();
				return 0;
			} 
		}
		Object generatedBuffer = this.getBuffer();
		cur = generatedBuffer;
		hv = cur[0] | ((UInt32)cur[1] << 8);
		;
		Object[] generatedHash = this.getHash();
		curMatch = generatedHash[hv];
		Object generatedPos = this.getPos();
		generatedHash[hv] = generatedPos;
		offset = 0;
		Object[] generatedSon = this.getSon();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		Object generatedCutValue = this.getCutValue();
		offset = (int)(ModernizedCProgram.GetMatchesSpec1((UInt32)lenLimit, curMatch, generatedPos, generatedBuffer, generatedSon, generatedCyclicBufferPos, generatedCyclicBufferSize, generatedCutValue, distances + offset, (UInt32)1) - distances);
		++generatedCyclicBufferPos;
		generatedBuffer++;
		Object generatedPosLimit = this.getPosLimit();
		if (++generatedPos == generatedPosLimit) {
			p.MatchFinder_CheckLimits();
		} 
		return (UInt32)offset;
		;
	}
	public Object Bt3Zip_MatchFinder_GetMatches(Object distances) {
		int offset;
		int lenLimit;
		UInt32 hv = new UInt32();
		Byte cur = new Byte();
		UInt32 curMatch = new UInt32();
		Object generatedLenLimit = this.getLenLimit();
		lenLimit = (int)generatedLenLimit;
		{ 
			if (lenLimit < 3) {
				p.MatchFinder_MovePos();
				return 0;
			} 
		}
		Object generatedBuffer = this.getBuffer();
		cur = generatedBuffer;
		Object generatedCrc = this.getCrc();
		hv = ((cur[2] | ((UInt32)cur[0] << 8)) ^ generatedCrc[cur[1]]) & -1024;
		;
		Object[] generatedHash = this.getHash();
		curMatch = generatedHash[hv];
		Object generatedPos = this.getPos();
		generatedHash[hv] = generatedPos;
		offset = 0;
		Object[] generatedSon = this.getSon();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		Object generatedCutValue = this.getCutValue();
		offset = (int)(ModernizedCProgram.GetMatchesSpec1((UInt32)lenLimit, curMatch, generatedPos, generatedBuffer, generatedSon, generatedCyclicBufferPos, generatedCyclicBufferSize, generatedCutValue, distances + offset, (UInt32)2) - distances);
		++generatedCyclicBufferPos;
		generatedBuffer++;
		Object generatedPosLimit = this.getPosLimit();
		if (++generatedPos == generatedPosLimit) {
			p.MatchFinder_CheckLimits();
		} 
		return (UInt32)offset;
		;
	}
	public Object Bt3_MatchFinder_GetMatches(Object[] distances) {
		UInt32 h2 = new UInt32();
		UInt32 d2 = new UInt32();
		UInt32 pos = new UInt32();
		int maxLen;
		int offset;
		UInt32 hash = new UInt32();
		int lenLimit;
		UInt32 hv = new UInt32();
		Byte cur = new Byte();
		UInt32 curMatch = new UInt32();
		Object generatedLenLimit = this.getLenLimit();
		lenLimit = (int)generatedLenLimit;
		{ 
			if (lenLimit < 3) {
				p.MatchFinder_MovePos();
				return 0;
			} 
		}
		Object generatedBuffer = this.getBuffer();
		cur = generatedBuffer;
		Object generatedCrc = this.getCrc();
		Object generatedHashMask = this.getHashMask();
		{ 
			UInt32 temp = generatedCrc[cur[0]] ^ cur[1];
			h2 = temp & ((1 << 10) - 1);
			hv = (temp ^ ((UInt32)cur[2] << 8)) & generatedHashMask;
		}
		;
		Object[] generatedHash = this.getHash();
		hash = generatedHash;
		Object generatedPos = this.getPos();
		pos = generatedPos;
		d2 = pos - hash[h2];
		curMatch = (hash + ((1 << 10)))[hv];
		hash[h2] = pos;
		(hash + ((1 << 10)))[hv] = pos;
		maxLen = 2;
		offset = 0;
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		Object[] generatedSon = this.getSon();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedCutValue = this.getCutValue();
		Object generatedPosLimit = this.getPosLimit();
		if (d2 < generatedCyclicBufferSize && (cur - d2) == cur) {
			{ 
				ptrdiff_t diff = (ptrdiff_t)0 - d2;
				Byte c = cur + maxLen;
				Byte lim = cur + lenLimit;
				for (; c != lim; c++) {
					if ((c + diff) != c) {
						break;
					} 
				}
				maxLen = (int)(c - cur);
			}
			distances[0] = (UInt32)maxLen;
			distances[1] = d2 - 1;
			offset = 2;
			if (maxLen == lenLimit) {
				ModernizedCProgram.SkipMatchesSpec((UInt32)lenLimit, curMatch, generatedPos, generatedBuffer, generatedSon, generatedCyclicBufferPos, generatedCyclicBufferSize, generatedCutValue);
				++generatedCyclicBufferPos;
				generatedBuffer++;
				if (++generatedPos == generatedPosLimit) {
					p.MatchFinder_CheckLimits();
				} 
				return (UInt32)offset;
				;
			} 
		} 
		offset = (int)(ModernizedCProgram.GetMatchesSpec1((UInt32)lenLimit, curMatch, generatedPos, generatedBuffer, generatedSon, generatedCyclicBufferPos, generatedCyclicBufferSize, generatedCutValue, distances + offset, (UInt32)maxLen) - distances);
		++generatedCyclicBufferPos;
		generatedBuffer++;
		if (++generatedPos == generatedPosLimit) {
			p.MatchFinder_CheckLimits();
		} 
		return (UInt32)offset;
		;
	}
	public Object Bt4_MatchFinder_GetMatches(Object[] distances) {
		UInt32 h2 = new UInt32();
		UInt32 h3 = new UInt32();
		UInt32 d2 = new UInt32();
		UInt32 d3 = new UInt32();
		UInt32 pos = new UInt32();
		int maxLen;
		int offset;
		UInt32 hash = new UInt32();
		int lenLimit;
		UInt32 hv = new UInt32();
		Byte cur = new Byte();
		UInt32 curMatch = new UInt32();
		Object generatedLenLimit = this.getLenLimit();
		lenLimit = (int)generatedLenLimit;
		{ 
			if (lenLimit < 4) {
				p.MatchFinder_MovePos();
				return 0;
			} 
		}
		Object generatedBuffer = this.getBuffer();
		cur = generatedBuffer;
		Object generatedCrc = this.getCrc();
		Object generatedHashMask = this.getHashMask();
		{ 
			UInt32 temp = generatedCrc[cur[0]] ^ cur[1];
			h2 = temp & ((1 << 10) - 1);
			temp ^=  ((UInt32)cur[2] << 8);
			h3 = temp & ((1 << 16) - 1);
			hv = (temp ^ (generatedCrc[cur[3]] << 5)) & generatedHashMask;
		}
		;
		Object[] generatedHash = this.getHash();
		hash = generatedHash;
		Object generatedPos = this.getPos();
		pos = generatedPos;
		d2 = pos - hash[h2];
		d3 = pos - (hash + ((1 << 10)))[h3];
		curMatch = (hash + ((1 << 10) + (1 << 16)))[hv];
		hash[h2] = pos;
		(hash + ((1 << 10)))[h3] = pos;
		(hash + ((1 << 10) + (1 << 16)))[hv] = pos;
		maxLen = 0;
		offset = 0;
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		if (d2 < generatedCyclicBufferSize && (cur - d2) == cur) {
			maxLen = 2;
			distances[0] = 2;
			distances[1] = d2 - 1;
			offset = 2;
		} 
		if (d2 != d3 && d3 < generatedCyclicBufferSize && (cur - d3) == cur) {
			maxLen = 3;
			distances[(size_t)offset + 1] = d3 - 1;
			offset += 2;
			d2 = d3;
		} 
		Object[] generatedSon = this.getSon();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedCutValue = this.getCutValue();
		Object generatedPosLimit = this.getPosLimit();
		if (offset != 0) {
			{ 
				ptrdiff_t diff = (ptrdiff_t)0 - d2;
				Byte c = cur + maxLen;
				Byte lim = cur + lenLimit;
				for (; c != lim; c++) {
					if ((c + diff) != c) {
						break;
					} 
				}
				maxLen = (int)(c - cur);
			}
			distances[(size_t)offset - 2] = (UInt32)maxLen;
			if (maxLen == lenLimit) {
				ModernizedCProgram.SkipMatchesSpec((UInt32)lenLimit, curMatch, generatedPos, generatedBuffer, generatedSon, generatedCyclicBufferPos, generatedCyclicBufferSize, generatedCutValue);
				++generatedCyclicBufferPos;
				generatedBuffer++;
				if (++generatedPos == generatedPosLimit) {
					p.MatchFinder_CheckLimits();
				} 
				return (UInt32)offset;
				;
			} 
		} 
		if (maxLen < 3) {
			maxLen = 3;
		} 
		offset = (int)(ModernizedCProgram.GetMatchesSpec1((UInt32)lenLimit, curMatch, generatedPos, generatedBuffer, generatedSon, generatedCyclicBufferPos, generatedCyclicBufferSize, generatedCutValue, distances + offset, (UInt32)maxLen) - distances);
		++generatedCyclicBufferPos;
		generatedBuffer++;
		if (++generatedPos == generatedPosLimit) {
			p.MatchFinder_CheckLimits();
		} 
		return (UInt32)offset/*
		static UInt32 Bt5_MatchFinder_GetMatches(CMatchFinder *p, UInt32 *distances)
		{
		  UInt32 h2, h3, h4, d2, d3, d4, maxLen, offset, pos;
		  UInt32 *hash;
		  GET_MATCHES_HEADER(5)
		
		  HASH5_CALC;
		
		  hash = p->hash;
		  pos = p->pos;
		
		  d2 = pos - hash                  [h2];
		  d3 = pos - (hash + kFix3HashSize)[h3];
		  d4 = pos - (hash + kFix4HashSize)[h4];
		
		  curMatch = (hash + kFix5HashSize)[hv];
		
		  hash                  [h2] = pos;
		  (hash + kFix3HashSize)[h3] = pos;
		  (hash + kFix4HashSize)[h4] = pos;
		  (hash + kFix5HashSize)[hv] = pos;
		
		  maxLen = 0;
		  offset = 0;
		
		  if (d2 < p->cyclicBufferSize && *(cur - d2) == *cur)
		  {
		    distances[0] = maxLen = 2;
		    distances[1] = d2 - 1;
		    offset = 2;
		    if (*(cur - d2 + 2) == cur[2])
		      distances[0] = maxLen = 3;
		    else if (d3 < p->cyclicBufferSize && *(cur - d3) == *cur)
		    {
		      distances[2] = maxLen = 3;
		      distances[3] = d3 - 1;
		      offset = 4;
		      d2 = d3;
		    }
		  }
		  else if (d3 < p->cyclicBufferSize && *(cur - d3) == *cur)
		  {
		    distances[0] = maxLen = 3;
		    distances[1] = d3 - 1;
		    offset = 2;
		    d2 = d3;
		  }
		  
		  if (d2 != d4 && d4 < p->cyclicBufferSize
		      && *(cur - d4) == *cur
		      && *(cur - d4 + 3) == *(cur + 3))
		  {
		    maxLen = 4;
		    distances[(size_t)offset + 1] = d4 - 1;
		    offset += 2;
		    d2 = d4;
		  }
		  
		  if (offset != 0)
		  {
		    UPDATE_maxLen
		    distances[(size_t)offset - 2] = maxLen;
		    if (maxLen == lenLimit)
		    {
		      SkipMatchesSpec(lenLimit, curMatch, MF_PARAMS(p));
		      MOVE_POS_RET;
		    }
		  }
		
		  if (maxLen < 4)
		    maxLen = 4;
		  
		  GET_MATCHES_FOOTER(offset, maxLen)
		}
		*/;
		;
	}
	public Object Hc4_MatchFinder_GetMatches(Object[] distances) {
		UInt32 h2 = new UInt32();
		UInt32 h3 = new UInt32();
		UInt32 d2 = new UInt32();
		UInt32 d3 = new UInt32();
		UInt32 pos = new UInt32();
		int maxLen;
		int offset;
		UInt32 hash = new UInt32();
		int lenLimit;
		UInt32 hv = new UInt32();
		Byte cur = new Byte();
		UInt32 curMatch = new UInt32();
		Object generatedLenLimit = this.getLenLimit();
		lenLimit = (int)generatedLenLimit;
		{ 
			if (lenLimit < 4) {
				p.MatchFinder_MovePos();
				return 0;
			} 
		}
		Object generatedBuffer = this.getBuffer();
		cur = generatedBuffer;
		Object generatedCrc = this.getCrc();
		Object generatedHashMask = this.getHashMask();
		{ 
			UInt32 temp = generatedCrc[cur[0]] ^ cur[1];
			h2 = temp & ((1 << 10) - 1);
			temp ^=  ((UInt32)cur[2] << 8);
			h3 = temp & ((1 << 16) - 1);
			hv = (temp ^ (generatedCrc[cur[3]] << 5)) & generatedHashMask;
		}
		;
		Object[] generatedHash = this.getHash();
		hash = generatedHash;
		Object generatedPos = this.getPos();
		pos = generatedPos;
		d2 = pos - hash[h2];
		d3 = pos - (hash + ((1 << 10)))[h3];
		curMatch = (hash + ((1 << 10) + (1 << 16)))[hv];
		hash[h2] = pos;
		(hash + ((1 << 10)))[h3] = pos;
		(hash + ((1 << 10) + (1 << 16)))[hv] = pos;
		maxLen = 0;
		offset = 0;
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		if (d2 < generatedCyclicBufferSize && (cur - d2) == cur) {
			maxLen = 2;
			distances[0] = 2;
			distances[1] = d2 - 1;
			offset = 2;
		} 
		if (d2 != d3 && d3 < generatedCyclicBufferSize && (cur - d3) == cur) {
			maxLen = 3;
			distances[(size_t)offset + 1] = d3 - 1;
			offset += 2;
			d2 = d3;
		} 
		Object[] generatedSon = this.getSon();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedPosLimit = this.getPosLimit();
		if (offset != 0) {
			{ 
				ptrdiff_t diff = (ptrdiff_t)0 - d2;
				Byte c = cur + maxLen;
				Byte lim = cur + lenLimit;
				for (; c != lim; c++) {
					if ((c + diff) != c) {
						break;
					} 
				}
				maxLen = (int)(c - cur);
			}
			distances[(size_t)offset - 2] = (UInt32)maxLen;
			if (maxLen == lenLimit) {
				generatedSon[generatedCyclicBufferPos] = curMatch;
				++generatedCyclicBufferPos;
				generatedBuffer++;
				if (++generatedPos == generatedPosLimit) {
					p.MatchFinder_CheckLimits();
				} 
				return (UInt32)offset;
				;
			} 
		} 
		if (maxLen < 3) {
			maxLen = 3;
		} 
		Object generatedCutValue = this.getCutValue();
		offset = (int)(ModernizedCProgram.Hc_GetMatchesSpec(lenLimit, curMatch, generatedPos, generatedBuffer, generatedSon, generatedCyclicBufferPos, generatedCyclicBufferSize, generatedCutValue, distances + offset, maxLen) - (distances));
		++generatedCyclicBufferPos;
		generatedBuffer++;
		if (++generatedPos == generatedPosLimit) {
			p.MatchFinder_CheckLimits();
		} 
		return (UInt32)offset/*
		static UInt32 Hc5_MatchFinder_GetMatches(CMatchFinder *p, UInt32 *distances)
		{
		  UInt32 h2, h3, h4, d2, d3, d4, maxLen, offset, pos
		  UInt32 *hash;
		  GET_MATCHES_HEADER(5)
		
		  HASH5_CALC;
		
		  hash = p->hash;
		  pos = p->pos;
		  
		  d2 = pos - hash                  [h2];
		  d3 = pos - (hash + kFix3HashSize)[h3];
		  d4 = pos - (hash + kFix4HashSize)[h4];
		
		  curMatch = (hash + kFix5HashSize)[hv];
		
		  hash                  [h2] = pos;
		  (hash + kFix3HashSize)[h3] = pos;
		  (hash + kFix4HashSize)[h4] = pos;
		  (hash + kFix5HashSize)[hv] = pos;
		
		  maxLen = 0;
		  offset = 0;
		
		  if (d2 < p->cyclicBufferSize && *(cur - d2) == *cur)
		  {
		    distances[0] = maxLen = 2;
		    distances[1] = d2 - 1;
		    offset = 2;
		    if (*(cur - d2 + 2) == cur[2])
		      distances[0] = maxLen = 3;
		    else if (d3 < p->cyclicBufferSize && *(cur - d3) == *cur)
		    {
		      distances[2] = maxLen = 3;
		      distances[3] = d3 - 1;
		      offset = 4;
		      d2 = d3;
		    }
		  }
		  else if (d3 < p->cyclicBufferSize && *(cur - d3) == *cur)
		  {
		    distances[0] = maxLen = 3;
		    distances[1] = d3 - 1;
		    offset = 2;
		    d2 = d3;
		  }
		  
		  if (d2 != d4 && d4 < p->cyclicBufferSize
		      && *(cur - d4) == *cur
		      && *(cur - d4 + 3) == *(cur + 3))
		  {
		    maxLen = 4;
		    distances[(size_t)offset + 1] = d4 - 1;
		    offset += 2;
		    d2 = d4;
		  }
		  
		  if (offset != 0)
		  {
		    UPDATE_maxLen
		    distances[(size_t)offset - 2] = maxLen;
		    if (maxLen == lenLimit)
		    {
		      p->son[p->cyclicBufferPos] = curMatch;
		      MOVE_POS_RET;
		    }
		  }
		  
		  if (maxLen < 4)
		    maxLen = 4;
		
		  offset = (UInt32)(Hc_GetMatchesSpec(lenLimit, curMatch, MF_PARAMS(p),
		      distances + offset, maxLen) - (distances));
		  MOVE_POS_RET
		}
		*/;
	}
	public Object Hc3Zip_MatchFinder_GetMatches(Object distances) {
		int offset;
		int lenLimit;
		UInt32 hv = new UInt32();
		Byte cur = new Byte();
		UInt32 curMatch = new UInt32();
		Object generatedLenLimit = this.getLenLimit();
		lenLimit = (int)generatedLenLimit;
		{ 
			if (lenLimit < 3) {
				p.MatchFinder_MovePos();
				return 0;
			} 
		}
		Object generatedBuffer = this.getBuffer();
		cur = generatedBuffer;
		Object generatedCrc = this.getCrc();
		hv = ((cur[2] | ((UInt32)cur[0] << 8)) ^ generatedCrc[cur[1]]) & -1024;
		;
		Object[] generatedHash = this.getHash();
		curMatch = generatedHash[hv];
		Object generatedPos = this.getPos();
		generatedHash[hv] = generatedPos;
		Object[] generatedSon = this.getSon();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		Object generatedCutValue = this.getCutValue();
		offset = (int)(ModernizedCProgram.Hc_GetMatchesSpec(lenLimit, curMatch, generatedPos, generatedBuffer, generatedSon, generatedCyclicBufferPos, generatedCyclicBufferSize, generatedCutValue, distances, 2) - (distances));
		++generatedCyclicBufferPos;
		generatedBuffer++;
		Object generatedPosLimit = this.getPosLimit();
		if (++generatedPos == generatedPosLimit) {
			p.MatchFinder_CheckLimits();
		} 
		return (UInt32)offset;
	}
	public void Bt2_MatchFinder_Skip(Object num) {
		Object generatedLenLimit = this.getLenLimit();
		Object generatedBuffer = this.getBuffer();
		Object[] generatedHash = this.getHash();
		Object generatedPos = this.getPos();
		Object[] generatedSon = this.getSon();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		Object generatedCutValue = this.getCutValue();
		Object generatedPosLimit = this.getPosLimit();
		do {
			int lenLimit;
			UInt32 hv = new UInt32();
			Byte cur = new Byte();
			UInt32 curMatch = new UInt32();
			lenLimit = (int)generatedLenLimit;
			{ 
				if (lenLimit < 2) {
					p.MatchFinder_MovePos();
					continue;
				} 
			}
			cur = generatedBuffer;
			hv = cur[0] | ((UInt32)cur[1] << 8);
			;
			curMatch = generatedHash[hv];
			generatedHash[hv] = generatedPos;
			ModernizedCProgram.SkipMatchesSpec((UInt32)lenLimit, curMatch, generatedPos, generatedBuffer, generatedSon, generatedCyclicBufferPos, generatedCyclicBufferSize, generatedCutValue);
			++generatedCyclicBufferPos;
			generatedBuffer++;
			if (++generatedPos == generatedPosLimit) {
				p.MatchFinder_CheckLimits();
			} 
			;
		} while (--num != 0);
	}
	public void Bt3Zip_MatchFinder_Skip(Object num) {
		Object generatedLenLimit = this.getLenLimit();
		Object generatedBuffer = this.getBuffer();
		Object generatedCrc = this.getCrc();
		Object[] generatedHash = this.getHash();
		Object generatedPos = this.getPos();
		Object[] generatedSon = this.getSon();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		Object generatedCutValue = this.getCutValue();
		Object generatedPosLimit = this.getPosLimit();
		do {
			int lenLimit;
			UInt32 hv = new UInt32();
			Byte cur = new Byte();
			UInt32 curMatch = new UInt32();
			lenLimit = (int)generatedLenLimit;
			{ 
				if (lenLimit < 3) {
					p.MatchFinder_MovePos();
					continue;
				} 
			}
			cur = generatedBuffer;
			hv = ((cur[2] | ((UInt32)cur[0] << 8)) ^ generatedCrc[cur[1]]) & -1024;
			;
			curMatch = generatedHash[hv];
			generatedHash[hv] = generatedPos;
			ModernizedCProgram.SkipMatchesSpec((UInt32)lenLimit, curMatch, generatedPos, generatedBuffer, generatedSon, generatedCyclicBufferPos, generatedCyclicBufferSize, generatedCutValue);
			++generatedCyclicBufferPos;
			generatedBuffer++;
			if (++generatedPos == generatedPosLimit) {
				p.MatchFinder_CheckLimits();
			} 
			;
		} while (--num != 0);
	}
	public void Bt3_MatchFinder_Skip(Object num) {
		Object generatedLenLimit = this.getLenLimit();
		Object generatedBuffer = this.getBuffer();
		Object generatedCrc = this.getCrc();
		Object generatedHashMask = this.getHashMask();
		Object[] generatedHash = this.getHash();
		Object generatedPos = this.getPos();
		Object[] generatedSon = this.getSon();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		Object generatedCutValue = this.getCutValue();
		Object generatedPosLimit = this.getPosLimit();
		do {
			UInt32 h2 = new UInt32();
			UInt32 hash = new UInt32();
			int lenLimit;
			UInt32 hv = new UInt32();
			Byte cur = new Byte();
			UInt32 curMatch = new UInt32();
			lenLimit = (int)generatedLenLimit;
			{ 
				if (lenLimit < 3) {
					p.MatchFinder_MovePos();
					continue;
				} 
			}
			cur = generatedBuffer;
			{ 
				UInt32 temp = generatedCrc[cur[0]] ^ cur[1];
				h2 = temp & ((1 << 10) - 1);
				hv = (temp ^ ((UInt32)cur[2] << 8)) & generatedHashMask;
			}
			;
			hash = generatedHash;
			curMatch = (hash + ((1 << 10)))[hv];
			hash[h2] = (hash + ((1 << 10)))[hv] = generatedPos;
			ModernizedCProgram.SkipMatchesSpec((UInt32)lenLimit, curMatch, generatedPos, generatedBuffer, generatedSon, generatedCyclicBufferPos, generatedCyclicBufferSize, generatedCutValue);
			++generatedCyclicBufferPos;
			generatedBuffer++;
			if (++generatedPos == generatedPosLimit) {
				p.MatchFinder_CheckLimits();
			} 
			;
		} while (--num != 0);
	}
	public void Bt4_MatchFinder_Skip(Object num) {
		Object generatedLenLimit = this.getLenLimit();
		Object generatedBuffer = this.getBuffer();
		Object generatedCrc = this.getCrc();
		Object generatedHashMask = this.getHashMask();
		Object[] generatedHash = this.getHash();
		Object generatedPos = this.getPos();
		Object[] generatedSon = this.getSon();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		Object generatedCutValue = this.getCutValue();
		Object generatedPosLimit = this.getPosLimit();
		do {
			UInt32 h2 = new UInt32();
			UInt32 h3 = new UInt32();
			UInt32 hash = new UInt32();
			int lenLimit;
			UInt32 hv = new UInt32();
			Byte cur = new Byte();
			UInt32 curMatch = new UInt32();
			lenLimit = (int)generatedLenLimit;
			{ 
				if (lenLimit < 4) {
					p.MatchFinder_MovePos();
					continue;
				} 
			}
			cur = generatedBuffer;
			{ 
				UInt32 temp = generatedCrc[cur[0]] ^ cur[1];
				h2 = temp & ((1 << 10) - 1);
				temp ^=  ((UInt32)cur[2] << 8);
				h3 = temp & ((1 << 16) - 1);
				hv = (temp ^ (generatedCrc[cur[3]] << 5)) & generatedHashMask;
			}
			;
			hash = generatedHash;
			curMatch = (hash + ((1 << 10) + (1 << 16)))[hv];
			hash[h2] = (hash + ((1 << 10)))[h3] = (hash + ((1 << 10) + (1 << 16)))[hv] = generatedPos;
			ModernizedCProgram.SkipMatchesSpec((UInt32)lenLimit, curMatch, generatedPos, generatedBuffer, generatedSon, generatedCyclicBufferPos, generatedCyclicBufferSize, generatedCutValue);
			++generatedCyclicBufferPos;
			generatedBuffer++;
			if (++generatedPos == generatedPosLimit) {
				p.MatchFinder_CheckLimits();
			} 
			;
		} while (--num != 0/*
		static void Bt5_MatchFinder_Skip(CMatchFinder *p, UInt32 num)
		{
		  do
		  {
		    UInt32 h2, h3, h4;
		    UInt32 *hash;
		    SKIP_HEADER(5)
		    HASH5_CALC;
		    hash = p->hash;
		    curMatch = (hash + kFix5HashSize)[hv];
		    hash                  [h2] =
		    (hash + kFix3HashSize)[h3] =
		    (hash + kFix4HashSize)[h4] =
		    (hash + kFix5HashSize)[hv] = p->pos;
		    SKIP_FOOTER
		  }
		  while (--num != 0);
		}
		*/);
	}
	public void Hc4_MatchFinder_Skip(Object num) {
		Object generatedLenLimit = this.getLenLimit();
		Object generatedBuffer = this.getBuffer();
		Object generatedCrc = this.getCrc();
		Object generatedHashMask = this.getHashMask();
		Object[] generatedHash = this.getHash();
		Object generatedPos = this.getPos();
		Object[] generatedSon = this.getSon();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedPosLimit = this.getPosLimit();
		do {
			UInt32 h2 = new UInt32();
			UInt32 h3 = new UInt32();
			UInt32 hash = new UInt32();
			int lenLimit;
			UInt32 hv = new UInt32();
			Byte cur = new Byte();
			UInt32 curMatch = new UInt32();
			lenLimit = (int)generatedLenLimit;
			{ 
				if (lenLimit < 4) {
					p.MatchFinder_MovePos();
					continue;
				} 
			}
			cur = generatedBuffer;
			{ 
				UInt32 temp = generatedCrc[cur[0]] ^ cur[1];
				h2 = temp & ((1 << 10) - 1);
				temp ^=  ((UInt32)cur[2] << 8);
				h3 = temp & ((1 << 16) - 1);
				hv = (temp ^ (generatedCrc[cur[3]] << 5)) & generatedHashMask;
			}
			;
			hash = generatedHash;
			curMatch = (hash + ((1 << 10) + (1 << 16)))[hv];
			hash[h2] = (hash + ((1 << 10)))[h3] = (hash + ((1 << 10) + (1 << 16)))[hv] = generatedPos;
			generatedSon[generatedCyclicBufferPos] = curMatch;
			++generatedCyclicBufferPos;
			generatedBuffer++;
			if (++generatedPos == generatedPosLimit) {
				p.MatchFinder_CheckLimits();
			} 
		} while (--num != 0/*
		static void Hc5_MatchFinder_Skip(CMatchFinder *p, UInt32 num)
		{
		  do
		  {
		    UInt32 h2, h3, h4;
		    UInt32 *hash;
		    SKIP_HEADER(5)
		    HASH5_CALC;
		    hash = p->hash;
		    curMatch = hash + kFix5HashSize)[hv];
		    hash                  [h2] =
		    (hash + kFix3HashSize)[h3] =
		    (hash + kFix4HashSize)[h4] =
		    (hash + kFix5HashSize)[hv] = p->pos;
		    p->son[p->cyclicBufferPos] = curMatch;
		    MOVE_POS
		  }
		  while (--num != 0);
		}
		*/);
	}
	public void Hc3Zip_MatchFinder_Skip(Object num) {
		Object generatedLenLimit = this.getLenLimit();
		Object generatedBuffer = this.getBuffer();
		Object generatedCrc = this.getCrc();
		Object[] generatedHash = this.getHash();
		Object generatedPos = this.getPos();
		Object[] generatedSon = this.getSon();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedPosLimit = this.getPosLimit();
		do {
			int lenLimit;
			UInt32 hv = new UInt32();
			Byte cur = new Byte();
			UInt32 curMatch = new UInt32();
			lenLimit = (int)generatedLenLimit;
			{ 
				if (lenLimit < 3) {
					p.MatchFinder_MovePos();
					continue;
				} 
			}
			cur = generatedBuffer;
			hv = ((cur[2] | ((UInt32)cur[0] << 8)) ^ generatedCrc[cur[1]]) & -1024;
			;
			curMatch = generatedHash[hv];
			generatedHash[hv] = generatedPos;
			generatedSon[generatedCyclicBufferPos] = curMatch;
			++generatedCyclicBufferPos;
			generatedBuffer++;
			if (++generatedPos == generatedPosLimit) {
				p.MatchFinder_CheckLimits();
			} 
		} while (--num != 0);
	}
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
	}
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public Object getPosLimit() {
		return posLimit;
	}
	public void setPosLimit(Object newPosLimit) {
		posLimit = newPosLimit;
	}
	public Object getStreamPos() {
		return streamPos;
	}
	public void setStreamPos(Object newStreamPos) {
		streamPos = newStreamPos;
	}
	public Object getLenLimit() {
		return lenLimit;
	}
	public void setLenLimit(Object newLenLimit) {
		lenLimit = newLenLimit;
	}
	public Object getCyclicBufferPos() {
		return cyclicBufferPos;
	}
	public void setCyclicBufferPos(Object newCyclicBufferPos) {
		cyclicBufferPos = newCyclicBufferPos;
	}
	public Object getCyclicBufferSize() {
		return cyclicBufferSize;
	}
	public void setCyclicBufferSize(Object newCyclicBufferSize) {
		cyclicBufferSize = newCyclicBufferSize;
	}
	public Object getStreamEndWasReached() {
		return streamEndWasReached;
	}
	public void setStreamEndWasReached(Object newStreamEndWasReached) {
		streamEndWasReached = newStreamEndWasReached;
	}
	public Object getBtMode() {
		return btMode;
	}
	public void setBtMode(Object newBtMode) {
		btMode = newBtMode;
	}
	public Object getBigHash() {
		return bigHash;
	}
	public void setBigHash(Object newBigHash) {
		bigHash = newBigHash;
	}
	public Object getDirectInput() {
		return directInput;
	}
	public void setDirectInput(Object newDirectInput) {
		directInput = newDirectInput;
	}
	public Object getMatchMaxLen() {
		return matchMaxLen;
	}
	public void setMatchMaxLen(Object newMatchMaxLen) {
		matchMaxLen = newMatchMaxLen;
	}
	public Object[] getHash() {
		return hash;
	}
	public void setHash(Object[] newHash) {
		hash = newHash;
	}
	public Object[] getSon() {
		return son;
	}
	public void setSon(Object[] newSon) {
		son = newSon;
	}
	public Object getHashMask() {
		return hashMask;
	}
	public void setHashMask(Object newHashMask) {
		hashMask = newHashMask;
	}
	public Object getCutValue() {
		return cutValue;
	}
	public void setCutValue(Object newCutValue) {
		cutValue = newCutValue;
	}
	public Object getBufferBase() {
		return bufferBase;
	}
	public void setBufferBase(Object newBufferBase) {
		bufferBase = newBufferBase;
	}
	public ISeqInStream getStream() {
		return stream;
	}
	public void setStream(ISeqInStream newStream) {
		stream = newStream;
	}
	public Object getBlockSize() {
		return blockSize;
	}
	public void setBlockSize(Object newBlockSize) {
		blockSize = newBlockSize;
	}
	public Object getKeepSizeBefore() {
		return keepSizeBefore;
	}
	public void setKeepSizeBefore(Object newKeepSizeBefore) {
		keepSizeBefore = newKeepSizeBefore;
	}
	public Object getKeepSizeAfter() {
		return keepSizeAfter;
	}
	public void setKeepSizeAfter(Object newKeepSizeAfter) {
		keepSizeAfter = newKeepSizeAfter;
	}
	public Object getNumHashBytes() {
		return numHashBytes;
	}
	public void setNumHashBytes(Object newNumHashBytes) {
		numHashBytes = newNumHashBytes;
	}
	public Object getDirectInputRem() {
		return directInputRem;
	}
	public void setDirectInputRem(Object newDirectInputRem) {
		directInputRem = newDirectInputRem;
	}
	public Object getHistorySize() {
		return historySize;
	}
	public void setHistorySize(Object newHistorySize) {
		historySize = newHistorySize;
	}
	public Object getFixedHashSize() {
		return fixedHashSize;
	}
	public void setFixedHashSize(Object newFixedHashSize) {
		fixedHashSize = newFixedHashSize;
	}
	public Object getHashSizeSum() {
		return hashSizeSum;
	}
	public void setHashSizeSum(Object newHashSizeSum) {
		hashSizeSum = newHashSizeSum;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object newResult) {
		result = newResult;
	}
	public Object getCrc() {
		return crc;
	}
	public void setCrc(Object newCrc) {
		crc = newCrc;
	}
	public Object getNumRefs() {
		return numRefs;
	}
	public void setNumRefs(Object newNumRefs) {
		numRefs = newNumRefs;
	}
	public Object getExpectedDataSize() {
		return expectedDataSize;
	}
	public void setExpectedDataSize(Object newExpectedDataSize) {
		expectedDataSize = newExpectedDataSize;
	}
}
