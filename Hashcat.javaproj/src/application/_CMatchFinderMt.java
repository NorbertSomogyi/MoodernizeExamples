package application;

public class _CMatchFinderMt {
	private Object pointerToCurPos;
	private Object btBuf;
	private Object btBufPos;
	private Object btBufPosLimit;
	private Object lzPos;
	private Object btNumAvailBytes;
	private Object hash;
	private Object fixedHashSize;
	private Object historySize;
	private Object crc;
	private Object MixMatchesFunc;
	private _CMtSync btSync;
	private Object btDummy;
	private Object hashBuf;
	private Object hashBufPos;
	private Object hashBufPosLimit;
	private Object hashNumAvail;
	private Object son;
	private Object matchMaxLen;
	private Object numHashBytes;
	private Object pos;
	private Object buffer;
	private Object cyclicBufferPos;
	private Object cyclicBufferSize;
	private Object cutValue;
	private _CMtSync hashSync;
	private Object GetHeadsFunc;
	private _CMatchFinder MatchFinder;
	
	public _CMatchFinderMt(Object pointerToCurPos, Object btBuf, Object btBufPos, Object btBufPosLimit, Object lzPos, Object btNumAvailBytes, Object hash, Object fixedHashSize, Object historySize, Object crc, Object MixMatchesFunc, _CMtSync btSync, Object btDummy, Object hashBuf, Object hashBufPos, Object hashBufPosLimit, Object hashNumAvail, Object son, Object matchMaxLen, Object numHashBytes, Object pos, Object buffer, Object cyclicBufferPos, Object cyclicBufferSize, Object cutValue, _CMtSync hashSync, Object GetHeadsFunc, _CMatchFinder MatchFinder) {
		setPointerToCurPos(pointerToCurPos);
		setBtBuf(btBuf);
		setBtBufPos(btBufPos);
		setBtBufPosLimit(btBufPosLimit);
		setLzPos(lzPos);
		setBtNumAvailBytes(btNumAvailBytes);
		setHash(hash);
		setFixedHashSize(fixedHashSize);
		setHistorySize(historySize);
		setCrc(crc);
		setMixMatchesFunc(MixMatchesFunc);
		setBtSync(btSync);
		setBtDummy(btDummy);
		setHashBuf(hashBuf);
		setHashBufPos(hashBufPos);
		setHashBufPosLimit(hashBufPosLimit);
		setHashNumAvail(hashNumAvail);
		setSon(son);
		setMatchMaxLen(matchMaxLen);
		setNumHashBytes(numHashBytes);
		setPos(pos);
		setBuffer(buffer);
		setCyclicBufferPos(cyclicBufferPos);
		setCyclicBufferSize(cyclicBufferSize);
		setCutValue(cutValue);
		setHashSync(hashSync);
		setGetHeadsFunc(GetHeadsFunc);
		setMatchFinder(MatchFinder);
	}
	public _CMatchFinderMt() {
	}
	
	public void HashThreadFunc() {
		_CMtSync generatedHashSync = this.getHashSync();
		CMtSync p = generatedHashSync;
		Object generatedCanStart = p.getCanStart();
		Object generatedWasStarted = p.getWasStarted();
		_CMatchFinder generatedMatchFinder = this.getMatchFinder();
		Object generatedExit = p.getExit();
		Object generatedStopWriting = p.getStopWriting();
		Object generatedWasStopped = p.getWasStopped();
		_CMtSync generatedBtSync = this.getBtSync();
		Object generatedCs = generatedBtSync.getCs();
		Object generatedBuffer = (mf).getBuffer();
		Object generatedPointerToCurPos = this.getPointerToCurPos();
		Object generatedFreeSemaphore = p.getFreeSemaphore();
		Object generatedPos = mf.getPos();
		Object generatedHistorySize = mf.getHistorySize();
		Object generatedHash = mf.getHash();
		Object generatedFixedHashSize = mf.getFixedHashSize();
		Object generatedHashMask = mf.getHashMask();
		Object generatedHashBuf = this.getHashBuf();
		Object generatedStreamPos = mf.getStreamPos();
		Object generatedNumHashBytes = mf.getNumHashBytes();
		Object generatedCrc = mf.getCrc();
		Object generatedFilledSemaphore = p.getFilledSemaphore();
		for (; ; ) {
			UInt32 numProcessedBlocks = 0;
			ModernizedCProgram.Handle_WaitObject((generatedCanStart));
			ModernizedCProgram.Event_Set(generatedWasStarted);
			generatedMatchFinder.MatchFinder_Init_HighHash();
			for (; ; ) {
				if (generatedExit) {
					return ;
				} 
				if (generatedStopWriting) {
					p.setNumProcessedBlocks(numProcessedBlocks);
					ModernizedCProgram.Event_Set(generatedWasStopped);
					break;
				} 
				{ 
					CMatchFinder mf = generatedMatchFinder;
					if (mf.MatchFinder_NeedMove()) {
						.EnterCriticalSection(generatedCs);
						.EnterCriticalSection(generatedCs);
						{ 
							Byte beforePtr = (generatedBuffer);
							ptrdiff_t offset = new ptrdiff_t();
							mf.MatchFinder_MoveBlock();
							offset = beforePtr - (generatedBuffer);
							generatedPointerToCurPos -= offset;
							generatedBuffer -= offset;
						}
						.LeaveCriticalSection(generatedCs);
						.LeaveCriticalSection(generatedCs);
						continue;
					} 
					ModernizedCProgram.Handle_WaitObject((generatedFreeSemaphore));
					mf.MatchFinder_ReadIfRequired();
					if (generatedPos > (-1024 - (1 << 13))) {
						UInt32 subValue = (generatedPos - generatedHistorySize - 1);
						mf.MatchFinder_ReduceOffsets(subValue);
						ModernizedCProgram.MatchFinder_Normalize3(subValue, generatedHash + generatedFixedHashSize, (size_t)generatedHashMask + 1);
					} 
					{ 
						UInt32 heads = generatedHashBuf + ((numProcessedBlocks++) & ((1 << 3) - 1)) * (1 << 13);
						UInt32 num = generatedStreamPos - generatedPos;
						heads[0] = 2;
						heads[1] = ModernizedCProgram.num;
						if (ModernizedCProgram.num >= generatedNumHashBytes) {
							ModernizedCProgram.num = ModernizedCProgram.num - generatedNumHashBytes + 1;
							if (ModernizedCProgram.num > (1 << 13) - 2) {
								ModernizedCProgram.num = (1 << 13) - 2;
							} 
							.UNRECOGNIZEDFUNCTIONNAME(generatedBuffer, generatedPos, generatedHash + generatedFixedHashSize, generatedHashMask, heads + 2, ModernizedCProgram.num, generatedCrc);
							heads[0] = 2 + ModernizedCProgram.num;
						} 
						generatedPos += ModernizedCProgram.num;
						generatedBuffer += ModernizedCProgram.num;
					}
				}
				ModernizedCProgram.Semaphore_Release1(generatedFilledSemaphore);
			}
		}
	}
	public void MatchFinderMt_GetNextBlock_Hash() {
		_CMtSync generatedHashSync = this.getHashSync();
		generatedHashSync.MtSync_GetNextBlock();
		Object generatedNumProcessedBlocks = generatedHashSync.getNumProcessedBlocks();
		this.setHashBufPosLimit(this.setHashBufPos(((generatedNumProcessedBlocks - 1) & ((1 << 3) - 1)) * (1 << 13)));
		Object generatedHashBufPosLimit = this.getHashBufPosLimit();
		Object generatedHashBuf = this.getHashBuf();
		Object generatedHashBufPos = this.getHashBufPos();
		generatedHashBufPosLimit += generatedHashBuf[generatedHashBufPos++];
		this.setHashNumAvail(generatedHashBuf[generatedHashBufPos++]);
	}
	public void BtGetMatches(Object distances) {
		UInt32 numProcessed = 0;
		UInt32 curPos = 2;
		Object generatedMatchMaxLen = this.getMatchMaxLen();
		//  * 2UInt32 limit = (1 << 14) - (generatedMatchMaxLen * 2);
		Object generatedHashNumAvail = this.getHashNumAvail();
		distances[1] = generatedHashNumAvail;
		Object generatedHashBufPos = this.getHashBufPos();
		Object generatedHashBufPosLimit = this.getHashBufPosLimit();
		Object generatedNumHashBytes = this.getNumHashBytes();
		Object generatedPos = this.getPos();
		Object generatedCyclicBufferPos = this.getCyclicBufferPos();
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		Object generatedBuffer = this.getBuffer();
		Object generatedSon = this.getSon();
		Object generatedCutValue = this.getCutValue();
		Object generatedHashBuf = this.getHashBuf();
		while (curPos < limit) {
			if (generatedHashBufPos == generatedHashBufPosLimit) {
				p.MatchFinderMt_GetNextBlock_Hash();
				distances[1] = numProcessed + generatedHashNumAvail;
				if (generatedHashNumAvail >= generatedNumHashBytes) {
					continue;
				} 
				distances[0] = curPos + generatedHashNumAvail;
				distances += curPos;
				for (; generatedHashNumAvail != 0; generatedHashNumAvail--) {
					distances++ = 0;
				}
				return ;
			} 
			{ 
				UInt32 size = generatedHashBufPosLimit - generatedHashBufPos;
				UInt32 lenLimit = generatedMatchMaxLen;
				UInt32 pos = generatedPos;
				UInt32 cyclicBufferPos = generatedCyclicBufferPos;
				if (lenLimit >= generatedHashNumAvail) {
					lenLimit = generatedHashNumAvail;
				} 
				{ 
					UInt32 size2 = generatedHashNumAvail - lenLimit + 1;
					if (size2 < ModernizedCProgram.size) {
						ModernizedCProgram.size = size2;
					} 
					size2 = generatedCyclicBufferSize - cyclicBufferPos;
					if (size2 < ModernizedCProgram.size) {
						ModernizedCProgram.size = size2;
					} 
				}
				{ 
					UInt32 posRes = new UInt32();
					curPos = (UInt32)(ModernizedCProgram.GetMatchesSpecN(lenLimit, pos, generatedBuffer, generatedSon, cyclicBufferPos, generatedCyclicBufferSize, generatedCutValue, distances + curPos, generatedNumHashBytes - 1, generatedHashBuf + generatedHashBufPos, distances + limit, ModernizedCProgram.size, posRes) - distances);
					generatedHashBufPos += posRes - pos;
					cyclicBufferPos += posRes - pos;
					generatedBuffer += posRes - pos;
					pos = posRes;
				}
				numProcessed += pos - generatedPos;
				generatedHashNumAvail -= pos - generatedPos;
				this.setPos(pos);
				if (cyclicBufferPos == generatedCyclicBufferSize) {
					cyclicBufferPos = 0;
				} 
				this.setCyclicBufferPos(cyclicBufferPos);
			}
		}
		distances[0] = curPos;
	}
	public void BtFillBlock(Object globalBlockIndex) {
		_CMtSync generatedHashSync = this.getHashSync();
		CMtSync sync = generatedHashSync;
		Object generatedNeedStart = sync.getNeedStart();
		Object generatedCs = sync.getCs();
		if (!generatedNeedStart) {
			.EnterCriticalSection(generatedCs);
			sync.setCsWasEntered(1);
		} 
		Object generatedBtBuf = this.getBtBuf();
		p.BtGetMatches(generatedBtBuf + (globalBlockIndex & ((1 << 6) - 1)) * (1 << 14));
		Object generatedPos = this.getPos();
		Object generatedCyclicBufferSize = this.getCyclicBufferSize();
		Object generatedSon = this.getSon();
		if (generatedPos > -1024 - (1 << 14)) {
			UInt32 subValue = generatedPos - generatedCyclicBufferSize;
			ModernizedCProgram.MatchFinder_Normalize3(subValue, generatedSon, (size_t)generatedCyclicBufferSize * 2);
			generatedPos -= subValue;
		} 
		if (!generatedNeedStart) {
			.LeaveCriticalSection(generatedCs);
			sync.setCsWasEntered(0);
		} 
	}
	public void BtThreadFunc() {
		_CMtSync generatedBtSync = this.getBtSync();
		CMtSync p = generatedBtSync;
		Object generatedCanStart = p.getCanStart();
		Object generatedWasStarted = p.getWasStarted();
		Object generatedExit = p.getExit();
		Object generatedStopWriting = p.getStopWriting();
		_CMtSync generatedHashSync = this.getHashSync();
		Object generatedWasStopped = p.getWasStopped();
		Object generatedFreeSemaphore = p.getFreeSemaphore();
		Object generatedFilledSemaphore = p.getFilledSemaphore();
		for (; ; ) {
			UInt32 blockIndex = 0;
			ModernizedCProgram.Handle_WaitObject((generatedCanStart));
			ModernizedCProgram.Event_Set(generatedWasStarted);
			for (; ; ) {
				if (generatedExit) {
					return ;
				} 
				if (generatedStopWriting) {
					p.setNumProcessedBlocks(blockIndex);
					generatedHashSync.MtSync_StopWriting();
					ModernizedCProgram.Event_Set(generatedWasStopped);
					break;
				} 
				ModernizedCProgram.Handle_WaitObject((generatedFreeSemaphore));
				mt.BtFillBlock(blockIndex++);
				ModernizedCProgram.Semaphore_Release1(generatedFilledSemaphore);
			}
		}
	}
	public void MatchFinderMt_Construct() {
		this.setHashBuf(((Object)0));
		_CMtSync generatedHashSync = this.getHashSync();
		generatedHashSync.MtSync_Construct();
		_CMtSync generatedBtSync = this.getBtSync();
		generatedBtSync.MtSync_Construct();
	}
	public void MatchFinderMt_FreeMem(Object alloc) {
		Object generatedHashBuf = this.getHashBuf();
		.UNRECOGNIZEDFUNCTIONNAME(alloc, generatedHashBuf);
		this.setHashBuf(((Object)0));
	}
	public void MatchFinderMt_Destruct(Object alloc) {
		_CMtSync generatedHashSync = this.getHashSync();
		generatedHashSync.MtSync_Destruct();
		_CMtSync generatedBtSync = this.getBtSync();
		generatedBtSync.MtSync_Destruct();
		p.MatchFinderMt_FreeMem(alloc);
	}
	public Object MatchFinderMt_Create(Object historySize, Object keepAddBufferBefore, Object matchMaxLen, Object keepAddBufferAfter, Object alloc) {
		_CMatchFinder generatedMatchFinder = this.getMatchFinder();
		CMatchFinder mf = generatedMatchFinder;
		this.setHistorySize(historySize);
		if ((1 << 14) <= matchMaxLen * 4) {
			return 5;
		} 
		Object generatedHashBuf = this.getHashBuf();
		if (!generatedHashBuf) {
			this.setHashBuf((UInt32).UNRECOGNIZEDFUNCTIONNAME(alloc, (((1 << 13) * (1 << 3)) + ((1 << 14) * (1 << 6))) * ));
			if (!generatedHashBuf) {
				return 2;
			} 
			this.setBtBuf(generatedHashBuf + ((1 << 13) * (1 << 3)));
		} 
		keepAddBufferBefore += (((1 << 13) * (1 << 3)) + ((1 << 14) * (1 << 6)));
		keepAddBufferAfter += (1 << 13);
		if (!mf.MatchFinder_Create(historySize, keepAddBufferBefore, matchMaxLen, keepAddBufferAfter, alloc)) {
			return 2;
		} 
		_CMtSync generatedHashSync = this.getHashSync();
		{ 
			int __result__ = (generatedHashSync.MtSync_Create(HashThreadFunc2, p, (1 << 3)));
			if (__result__ != 0) {
				return __result__;
			} 
		}
		;
		_CMtSync generatedBtSync = this.getBtSync();
		{ 
			int __result__ = (generatedBtSync.MtSync_Create(BtThreadFunc2, p, (1 << 6)));
			if (__result__ != 0) {
				return __result__;
			} 
		}
		;
		return 0;
	}
	/* Call it after ReleaseStream / SetStream */
	public void MatchFinderMt_Init() {
		_CMatchFinder generatedMatchFinder = this.getMatchFinder();
		CMatchFinder mf = generatedMatchFinder;
		this.setBtBufPos(this.setBtBufPosLimit(0));
		this.setHashBufPos(this.setHashBufPosLimit(0));
		mf.MatchFinder_Init_3(/* Init without data reading. We don't want to read data in this thread */0);
		mf.MatchFinder_Init_LowHash();
		Object generatedBuffer = (mf).getBuffer();
		this.setPointerToCurPos((generatedBuffer));
		this.setBtNumAvailBytes(0);
		Object generatedHistorySize = this.getHistorySize();
		this.setLzPos(generatedHistorySize + 1);
		Object generatedHash = mf.getHash();
		this.setHash(generatedHash);
		Object generatedFixedHashSize = mf.getFixedHashSize();
		this.setFixedHashSize(generatedFixedHashSize);
		Object generatedCrc = mf.getCrc();
		this.setCrc(generatedCrc);
		Object generatedSon = mf.getSon();
		this.setSon(generatedSon);
		Object generatedMatchMaxLen = mf.getMatchMaxLen();
		this.setMatchMaxLen(generatedMatchMaxLen);
		Object generatedNumHashBytes = mf.getNumHashBytes();
		this.setNumHashBytes(generatedNumHashBytes);
		Object generatedPos = mf.getPos();
		this.setPos(generatedPos);
		this.setBuffer(generatedBuffer);
		Object generatedCyclicBufferPos = mf.getCyclicBufferPos();
		this.setCyclicBufferPos(generatedCyclicBufferPos);
		Object generatedCyclicBufferSize = mf.getCyclicBufferSize();
		this.setCyclicBufferSize(generatedCyclicBufferSize);
		Object generatedCutValue = mf.getCutValue();
		this.setCutValue(generatedCutValue);
	}
	/* ReleaseStream is required to finish multithreading */
	public void MatchFinderMt_ReleaseStream() {
		_CMtSync generatedBtSync = this.getBtSync();
		generatedBtSync.MtSync_StopWriting();
	}
	public void MatchFinderMt_Normalize() {
		Object generatedLzPos = this.getLzPos();
		Object generatedHistorySize = this.getHistorySize();
		Object generatedHash = this.getHash();
		Object generatedFixedHashSize = this.getFixedHashSize();
		ModernizedCProgram.MatchFinder_Normalize3(generatedLzPos - generatedHistorySize - 1, generatedHash, generatedFixedHashSize);
		this.setLzPos(generatedHistorySize + 1);
	}
	public void MatchFinderMt_GetNextBlock_Bt() {
		UInt32 blockIndex = new UInt32();
		_CMtSync generatedBtSync = this.getBtSync();
		generatedBtSync.MtSync_GetNextBlock();
		Object generatedNumProcessedBlocks = generatedBtSync.getNumProcessedBlocks();
		blockIndex = ((generatedNumProcessedBlocks - 1) & ((1 << 6) - 1));
		this.setBtBufPosLimit(this.setBtBufPos(blockIndex * (1 << 14)));
		Object generatedBtBufPosLimit = this.getBtBufPosLimit();
		Object generatedBtBuf = this.getBtBuf();
		Object generatedBtBufPos = this.getBtBufPos();
		generatedBtBufPosLimit += generatedBtBuf[generatedBtBufPos++];
		this.setBtNumAvailBytes(generatedBtBuf[generatedBtBufPos++]);
		Object generatedLzPos = this.getLzPos();
		if (generatedLzPos >= -1024 - (1 << 14)) {
			p.MatchFinderMt_Normalize();
		} 
	}
	public Object MatchFinderMt_GetPointerToCurrentPos() {
		Object generatedPointerToCurPos = this.getPointerToCurPos();
		return generatedPointerToCurPos;
	}
	public Object MatchFinderMt_GetNumAvailableBytes() {
		Object generatedBtBufPos = this.getBtBufPos();
		Object generatedBtBufPosLimit = this.getBtBufPosLimit();
		if (generatedBtBufPos == generatedBtBufPosLimit) {
			p.MatchFinderMt_GetNextBlock_Bt();
		} 
		;
		Object generatedBtNumAvailBytes = this.getBtNumAvailBytes();
		return generatedBtNumAvailBytes;
	}
	public Object MixMatches2(Object matchMinPos, Object distances) {
		UInt32 h2 = new UInt32();
		UInt32 curMatch2 = new UInt32();
		Object generatedHash = this.getHash();
		UInt32 hash = generatedHash;
		Object generatedPointerToCurPos = this.getPointerToCurPos();
		Byte cur = generatedPointerToCurPos;
		Object generatedLzPos = this.getLzPos();
		UInt32 lzPos = generatedLzPos;
		Object generatedCrc = this.getCrc();
		h2 = (generatedCrc[cur[0]] ^ cur[1]) & ((1 << 10) - 1);
		curMatch2 = hash[h2];
		hash[h2] = lzPos;
		if (curMatch2 >= matchMinPos) {
			if (cur[(ptrdiff_t)curMatch2 - lzPos] == cur[0]) {
				distances++ = 2;
				distances++ = lzPos - curMatch2 - 1;
			} 
		} 
		return distances;
	}
	public Object MixMatches3(Object matchMinPos, Object distances) {
		UInt32 h2 = new UInt32();
		UInt32 h3 = new UInt32();
		UInt32 curMatch2 = new UInt32();
		UInt32 curMatch3 = new UInt32();
		Object generatedHash = this.getHash();
		UInt32 hash = generatedHash;
		Object generatedPointerToCurPos = this.getPointerToCurPos();
		Byte cur = generatedPointerToCurPos;
		Object generatedLzPos = this.getLzPos();
		UInt32 lzPos = generatedLzPos;
		Object generatedCrc = this.getCrc();
		{ 
			UInt32 temp = generatedCrc[cur[0]] ^ cur[1];
			h2 = temp & ((1 << 10) - 1);
			h3 = (temp ^ ((UInt32)cur[2] << 8)) & ((1 << 16) - 1);
		}
		curMatch2 = hash[h2];
		curMatch3 = (hash + ((1 << 10)))[h3];
		hash[h2] = lzPos;
		(hash + ((1 << 10)))[h3] = lzPos;
		if (curMatch2 >= matchMinPos && cur[(ptrdiff_t)curMatch2 - lzPos] == cur[0]) {
			distances[1] = lzPos - curMatch2 - 1;
			if (cur[(ptrdiff_t)curMatch2 - lzPos + 2] == cur[2]) {
				distances[0] = 3;
				return distances + 2;
			} 
			distances[0] = 2;
			distances += 2;
		} 
		if (curMatch3 >= matchMinPos && cur[(ptrdiff_t)curMatch3 - lzPos] == cur[0]) {
			distances++ = 3;
			distances++ = lzPos - curMatch3 - 1;
		} 
		return distances/*
		static UInt32 *MixMatches4(CMatchFinderMt *p, UInt32 matchMinPos, UInt32 *distances)
		{
		  UInt32 h2, h3, h4, curMatch2, curMatch3, curMatch4;
		  UInt32 *hash = p->hash;
		  const Byte *cur = p->pointerToCurPos;
		  UInt32 lzPos = p->lzPos;
		  MT_HASH4_CALC
		      
		  curMatch2 = hash[                h2];
		  curMatch3 = (hash + kFix3HashSize)[h3];
		  curMatch4 = (hash + kFix4HashSize)[h4];
		  
		  hash[                h2] = lzPos;
		  (hash + kFix3HashSize)[h3] = lzPos;
		  (hash + kFix4HashSize)[h4] = lzPos;
		
		  if (curMatch2 >= matchMinPos && cur[(ptrdiff_t)curMatch2 - lzPos] == cur[0])
		  {
		    distances[1] = lzPos - curMatch2 - 1;
		    if (cur[(ptrdiff_t)curMatch2 - lzPos + 2] == cur[2])
		    {
		      distances[0] = (cur[(ptrdiff_t)curMatch2 - lzPos + 3] == cur[3]) ? 4 : 3;
		      return distances + 2;
		    }
		    distances[0] = 2;
		    distances += 2;
		  }
		  
		  if (curMatch3 >= matchMinPos && cur[(ptrdiff_t)curMatch3 - lzPos] == cur[0])
		  {
		    distances[1] = lzPos - curMatch3 - 1;
		    if (cur[(ptrdiff_t)curMatch3 - lzPos + 3] == cur[3])
		    {
		      distances[0] = 4;
		      return distances + 2;
		    }
		    distances[0] = 3;
		    distances += 2;
		  }
		
		  if (curMatch4 >= matchMinPos)
		    if (
		      cur[(ptrdiff_t)curMatch4 - lzPos] == cur[0] &&
		      cur[(ptrdiff_t)curMatch4 - lzPos + 3] == cur[3]
		      )
		    {
		      *distances++ = 4;
		      *distances++ = lzPos - curMatch4 - 1;
		    }
		  
		  return distances;
		}
		*/;
	}
	public Object MatchFinderMt2_GetMatches(Object distances) {
		Object generatedBtBuf = this.getBtBuf();
		Object generatedBtBufPos = this.getBtBufPos();
		UInt32 btBuf = generatedBtBuf + generatedBtBufPos;
		UInt32 len = btBuf++;
		generatedBtBufPos += 1 + len;
		Object generatedBtNumAvailBytes = this.getBtNumAvailBytes();
		generatedBtNumAvailBytes--;
		{ 
			UInt32 i = new UInt32();
			for (i = 0; i < len; i += 2) {
				UInt32 v0 = btBuf[0];
				UInt32 v1 = btBuf[1];
				btBuf += 2;
				distances[0] = v0;
				distances[1] = v1;
				distances += 2;
			}
		}
		Object generatedLzPos = this.getLzPos();
		generatedLzPos++;
		Object generatedPointerToCurPos = this.getPointerToCurPos();
		generatedPointerToCurPos++;
		return len;
	}
	public Object MatchFinderMt_GetMatches(Object distances) {
		Object generatedBtBuf = this.getBtBuf();
		Object generatedBtBufPos = this.getBtBufPos();
		UInt32 btBuf = generatedBtBuf + generatedBtBufPos;
		UInt32 len = btBuf++;
		generatedBtBufPos += 1 + len;
		Object generatedBtNumAvailBytes = this.getBtNumAvailBytes();
		Object generatedLzPos = this.getLzPos();
		Object generatedHistorySize = this.getHistorySize();
		if (len == 0) {
			if (generatedBtNumAvailBytes-- >= /* change for bt5 ! */4) {
				len = (UInt32)(.UNRECOGNIZEDFUNCTIONNAME(p, generatedLzPos - generatedHistorySize, distances) - (distances));
			} 
		} else {
				UInt32 distances2 = new UInt32();
				generatedBtNumAvailBytes--;
				distances2 = .UNRECOGNIZEDFUNCTIONNAME(p, generatedLzPos - btBuf[1], distances);
				do {
					UInt32 v0 = btBuf[0];
					UInt32 v1 = btBuf[1];
					btBuf += 2;
					distances2[0] = v0;
					distances2[1] = v1;
					distances2 += 2;
				} while ((len -= 2) != 0);
				len = (UInt32)(distances2 - (distances));
		} 
		generatedLzPos++;
		Object generatedPointerToCurPos = this.getPointerToCurPos();
		generatedPointerToCurPos++;
		return len;
	}
	public void MatchFinderMt0_Skip(Object num) {
		Object generatedBtBufPos = this.getBtBufPos();
		Object generatedBtBufPosLimit = this.getBtBufPosLimit();
		Object generatedBtNumAvailBytes = this.getBtNumAvailBytes();
		Object generatedLzPos = this.getLzPos();
		Object generatedPointerToCurPos = this.getPointerToCurPos();
		Object generatedBtBuf = this.getBtBuf();
		do {
			if (generatedBtBufPos == generatedBtBufPosLimit) {
				p.MatchFinderMt_GetNextBlock_Bt();
			} 
			{ 
				generatedBtNumAvailBytes--;
			}
			generatedLzPos++;
			generatedPointerToCurPos++;
			generatedBtBufPos += generatedBtBuf[generatedBtBufPos] + 1;
		} while (--num != 0);
	}
	public void MatchFinderMt2_Skip(Object num) {
		Object generatedBtBufPos = this.getBtBufPos();
		Object generatedBtBufPosLimit = this.getBtBufPosLimit();
		Object generatedBtNumAvailBytes = this.getBtNumAvailBytes();
		Object generatedPointerToCurPos = this.getPointerToCurPos();
		Object generatedHash = this.getHash();
		Object generatedCrc = this.getCrc();
		Object generatedLzPos = this.getLzPos();
		Object generatedBtBuf = this.getBtBuf();
		do {
			if (generatedBtBufPos == generatedBtBufPosLimit) {
				p.MatchFinderMt_GetNextBlock_Bt();
			} 
			if (generatedBtNumAvailBytes-- >= (true)) {
				Byte cur = generatedPointerToCurPos;
				UInt32 hash = generatedHash;
				UInt32 h2 = new UInt32();
				h2 = (generatedCrc[cur[0]] ^ cur[1]) & ((1 << 10) - 1);
				hash[h2] = generatedLzPos;
			} 
			generatedLzPos++;
			generatedPointerToCurPos++;
			generatedBtBufPos += generatedBtBuf[generatedBtBufPos] + 1;
		} while (--num != 0);
	}
	public void MatchFinderMt3_Skip(Object num) {
		Object generatedBtBufPos = this.getBtBufPos();
		Object generatedBtBufPosLimit = this.getBtBufPosLimit();
		Object generatedBtNumAvailBytes = this.getBtNumAvailBytes();
		Object generatedPointerToCurPos = this.getPointerToCurPos();
		Object generatedHash = this.getHash();
		Object generatedCrc = this.getCrc();
		Object generatedLzPos = this.getLzPos();
		Object generatedBtBuf = this.getBtBuf();
		do {
			if (generatedBtBufPos == generatedBtBufPosLimit) {
				p.MatchFinderMt_GetNextBlock_Bt();
			} 
			if (generatedBtNumAvailBytes-- >= (true)) {
				Byte cur = generatedPointerToCurPos;
				UInt32 hash = generatedHash;
				UInt32 h2 = new UInt32();
				UInt32 h3 = new UInt32();
				{ 
					UInt32 temp = generatedCrc[cur[0]] ^ cur[1];
					h2 = temp & ((1 << 10) - 1);
					h3 = (temp ^ ((UInt32)cur[2] << 8)) & ((1 << 16) - 1);
				}
				(hash + ((1 << 10)))[h3] = hash[h2] = generatedLzPos;
			} 
			generatedLzPos++;
			generatedPointerToCurPos++;
			generatedBtBufPos += generatedBtBuf[generatedBtBufPos] + 1;
		} while (--num != 0/*
		static void MatchFinderMt4_Skip(CMatchFinderMt *p, UInt32 num)
		{
		  SKIP_HEADER_MT(4)
		      UInt32 h2, h3, h4;
		      MT_HASH4_CALC
		      (hash + kFix4HashSize)[h4] =
		      (hash + kFix3HashSize)[h3] =
		      hash[                h2] =
		        p->lzPos;
		  SKIP_FOOTER_MT
		}
		*/);
	}
	public Object getPointerToCurPos() {
		return pointerToCurPos;
	}
	public void setPointerToCurPos(Object newPointerToCurPos) {
		pointerToCurPos = newPointerToCurPos;
	}
	public Object getBtBuf() {
		return btBuf;
	}
	public void setBtBuf(Object newBtBuf) {
		btBuf = newBtBuf;
	}
	public Object getBtBufPos() {
		return btBufPos;
	}
	public void setBtBufPos(Object newBtBufPos) {
		btBufPos = newBtBufPos;
	}
	public Object getBtBufPosLimit() {
		return btBufPosLimit;
	}
	public void setBtBufPosLimit(Object newBtBufPosLimit) {
		btBufPosLimit = newBtBufPosLimit;
	}
	public Object getLzPos() {
		return lzPos;
	}
	public void setLzPos(Object newLzPos) {
		lzPos = newLzPos;
	}
	public Object getBtNumAvailBytes() {
		return btNumAvailBytes;
	}
	public void setBtNumAvailBytes(Object newBtNumAvailBytes) {
		btNumAvailBytes = newBtNumAvailBytes;
	}
	public Object getHash() {
		return hash;
	}
	public void setHash(Object newHash) {
		hash = newHash;
	}
	public Object getFixedHashSize() {
		return fixedHashSize;
	}
	public void setFixedHashSize(Object newFixedHashSize) {
		fixedHashSize = newFixedHashSize;
	}
	public Object getHistorySize() {
		return historySize;
	}
	public void setHistorySize(Object newHistorySize) {
		historySize = newHistorySize;
	}
	public Object getCrc() {
		return crc;
	}
	public void setCrc(Object newCrc) {
		crc = newCrc;
	}
	public Object getMixMatchesFunc() {
		return MixMatchesFunc;
	}
	public void setMixMatchesFunc(Object newMixMatchesFunc) {
		MixMatchesFunc = newMixMatchesFunc;
	}
	public _CMtSync getBtSync() {
		return btSync;
	}
	public void setBtSync(_CMtSync newBtSync) {
		btSync = newBtSync;
	}
	public Object getBtDummy() {
		return btDummy;
	}
	public void setBtDummy(Object newBtDummy) {
		btDummy = newBtDummy;
	}
	public Object getHashBuf() {
		return hashBuf;
	}
	public void setHashBuf(Object newHashBuf) {
		hashBuf = newHashBuf;
	}
	public Object getHashBufPos() {
		return hashBufPos;
	}
	public void setHashBufPos(Object newHashBufPos) {
		hashBufPos = newHashBufPos;
	}
	public Object getHashBufPosLimit() {
		return hashBufPosLimit;
	}
	public void setHashBufPosLimit(Object newHashBufPosLimit) {
		hashBufPosLimit = newHashBufPosLimit;
	}
	public Object getHashNumAvail() {
		return hashNumAvail;
	}
	public void setHashNumAvail(Object newHashNumAvail) {
		hashNumAvail = newHashNumAvail;
	}
	public Object getSon() {
		return son;
	}
	public void setSon(Object newSon) {
		son = newSon;
	}
	public Object getMatchMaxLen() {
		return matchMaxLen;
	}
	public void setMatchMaxLen(Object newMatchMaxLen) {
		matchMaxLen = newMatchMaxLen;
	}
	public Object getNumHashBytes() {
		return numHashBytes;
	}
	public void setNumHashBytes(Object newNumHashBytes) {
		numHashBytes = newNumHashBytes;
	}
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
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
	public Object getCutValue() {
		return cutValue;
	}
	public void setCutValue(Object newCutValue) {
		cutValue = newCutValue;
	}
	public _CMtSync getHashSync() {
		return hashSync;
	}
	public void setHashSync(_CMtSync newHashSync) {
		hashSync = newHashSync;
	}
	public Object getGetHeadsFunc() {
		return GetHeadsFunc;
	}
	public void setGetHeadsFunc(Object newGetHeadsFunc) {
		GetHeadsFunc = newGetHeadsFunc;
	}
	public _CMatchFinder getMatchFinder() {
		return MatchFinder;
	}
	public void setMatchFinder(_CMatchFinder newMatchFinder) {
		MatchFinder = newMatchFinder;
	}
}
