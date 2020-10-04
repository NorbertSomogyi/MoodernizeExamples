package application;

public class _CMtDec {
	private Object inBufSize;
	private int numThreadsMax;
	private int numThreadsMax_2;
	private ISeqInStream inStream;
	private ICompressProgress progress;
	private Object alloc;
	private  mtCallback;
	private Object mtCallbackObject;
	private Object allocatedBufsSize;
	private Object exitThread;
	private Object exitThreadWRes;
	private Object blockIndex;
	private Object isAllocError;
	private Object overflow;
	private Object threadingErrorSRes;
	private Object needContinue;
	private Object readRes;
	private Object codeRes;
	private Object wasInterrupted;
	private int numStartedThreads_Limit;
	private int numStartedThreads;
	private Object crossBlock;
	private Object crossStart;
	private Object crossEnd;
	private Object readProcessed;
	private Object readWasFinished;
	private Object inProcessed;
	private int filledThreadStart;
	private int numFilledThreads;
	private Object needInterrupt;
	private Object interruptIndex;
	private  mtProgress;
	private Object[] threads;
	
	public _CMtDec(Object inBufSize, int numThreadsMax, int numThreadsMax_2, ISeqInStream inStream, ICompressProgress progress, Object alloc,  mtCallback, Object mtCallbackObject, Object allocatedBufsSize, Object exitThread, Object exitThreadWRes, Object blockIndex, Object isAllocError, Object overflow, Object threadingErrorSRes, Object needContinue, Object readRes, Object codeRes, Object wasInterrupted, int numStartedThreads_Limit, int numStartedThreads, Object crossBlock, Object crossStart, Object crossEnd, Object readProcessed, Object readWasFinished, Object inProcessed, int filledThreadStart, int numFilledThreads, Object needInterrupt, Object interruptIndex,  mtProgress, Object[] threads) {
		setInBufSize(inBufSize);
		setNumThreadsMax(numThreadsMax);
		setNumThreadsMax_2(numThreadsMax_2);
		setInStream(inStream);
		setProgress(progress);
		setAlloc(alloc);
		setMtCallback(mtCallback);
		setMtCallbackObject(mtCallbackObject);
		setAllocatedBufsSize(allocatedBufsSize);
		setExitThread(exitThread);
		setExitThreadWRes(exitThreadWRes);
		setBlockIndex(blockIndex);
		setIsAllocError(isAllocError);
		setOverflow(overflow);
		setThreadingErrorSRes(threadingErrorSRes);
		setNeedContinue(needContinue);
		setReadRes(readRes);
		setCodeRes(codeRes);
		setWasInterrupted(wasInterrupted);
		setNumStartedThreads_Limit(numStartedThreads_Limit);
		setNumStartedThreads(numStartedThreads);
		setCrossBlock(crossBlock);
		setCrossStart(crossStart);
		setCrossEnd(crossEnd);
		setReadProcessed(readProcessed);
		setReadWasFinished(readWasFinished);
		setInProcessed(inProcessed);
		setFilledThreadStart(filledThreadStart);
		setNumFilledThreads(numFilledThreads);
		setNeedInterrupt(needInterrupt);
		setInterruptIndex(interruptIndex);
		setMtProgress(mtProgress);
		setThreads(threads);
	}
	public _CMtDec() {
	}
	
	public void MtDec_CloseThreads() {
		int i;
		Object[] generatedThreads = this.getThreads();
		for (i = 0; i < 32; i++) {
			generatedThreads[i].MtDecThread_CloseThread();
		}
	}
	public Object MtDec_GetError_Spec(Object interruptIndex, Object wasInterrupted) {
		SRes res = new SRes();
		 generatedMtProgress = this.getMtProgress();
		Object generatedCs = generatedMtProgress.getCs();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnterCriticalSection(generatedCs);
		Object generatedNeedInterrupt = this.getNeedInterrupt();
		Object generatedInterruptIndex = this.getInterruptIndex();
		wasInterrupted = (generatedNeedInterrupt && interruptIndex > generatedInterruptIndex);
		Object generatedRes = generatedMtProgress.getRes();
		res = generatedRes;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LeaveCriticalSection(generatedCs);
		return res;
	}
	public Object MtDec_Progress_GetError_Spec(Object inSize, Object outSize, Object interruptIndex, Object wasInterrupted) {
		SRes res = new SRes();
		 generatedMtProgress = this.getMtProgress();
		Object generatedCs = generatedMtProgress.getCs();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnterCriticalSection(generatedCs);
		Object generatedTotalInSize = generatedMtProgress.getTotalInSize();
		generatedTotalInSize += inSize;
		Object generatedTotalOutSize = generatedMtProgress.getTotalOutSize();
		generatedTotalOutSize += outSize;
		Object generatedRes = generatedMtProgress.getRes();
		Object generatedProgress = generatedMtProgress.getProgress();
		if (generatedRes == 0 && generatedProgress) {
			if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedProgress, generatedTotalInSize, generatedTotalOutSize) != 0) {
				generatedMtProgress.setRes(10);
			} 
		} 
		Object generatedNeedInterrupt = this.getNeedInterrupt();
		Object generatedInterruptIndex = this.getInterruptIndex();
		wasInterrupted = (generatedNeedInterrupt && interruptIndex > generatedInterruptIndex);
		res = generatedRes;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LeaveCriticalSection(generatedCs);
		return res;
	}
	public void MtDec_Interrupt(Object interruptIndex) {
		 generatedMtProgress = this.getMtProgress();
		Object generatedCs = generatedMtProgress.getCs();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnterCriticalSection(generatedCs);
		Object generatedNeedInterrupt = this.getNeedInterrupt();
		Object generatedInterruptIndex = this.getInterruptIndex();
		if (!generatedNeedInterrupt || interruptIndex < generatedInterruptIndex) {
			this.setInterruptIndex(interruptIndex);
			this.setNeedInterrupt(1);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LeaveCriticalSection(generatedCs);
	}
	public Object MtDec_GetCrossBuff() {
		Object generatedCrossBlock = this.getCrossBlock();
		Byte cr = generatedCrossBlock;
		Object generatedAlloc = this.getAlloc();
		Object generatedInBufSize = this.getInBufSize();
		if (!cr) {
			cr = (Byte)/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAlloc, /*Error: Unsupported expression*/ + generatedInBufSize);
			if (!cr) {
				return (null);
			} 
			this.setCrossBlock(cr);
		} 
		return ((Byte)(cr) + /*Error: Unsupported expression*//*
		  ThreadFunc2() returns:
		  0      - in all normal cases (even for stream error or memory allocation error)
		  (!= 0) - WRes error return by system threading function
		*/);
	}
	public int MtDec_PrepareRead() {
		Object generatedCrossBlock = this.getCrossBlock();
		Object generatedCrossStart = this.getCrossStart();
		Object generatedCrossEnd = this.getCrossEnd();
		Object generatedAlloc = this.getAlloc();
		if (generatedCrossBlock && generatedCrossStart == generatedCrossEnd) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAlloc, generatedCrossBlock);
			this.setCrossBlock((null));
		} 
		int generatedNumStartedThreads = this.getNumStartedThreads();
		int generatedNumFilledThreads = this.getNumFilledThreads();
		int generatedFilledThreadStart = this.getFilledThreadStart();
		Object[] generatedThreads = this.getThreads();
		{ 
			int i;
			for (i = 0; i < 32; i++) {
				if (i > generatedNumStartedThreads || generatedNumFilledThreads <= (i >= generatedFilledThreadStart ? i - generatedFilledThreadStart : i + generatedNumStartedThreads - generatedFilledThreadStart)) {
					generatedThreads[i].MtDecThread_FreeInBufs();
				} 
			}
		}
		return (generatedNumFilledThreads != 0) || (generatedCrossStart != generatedCrossEnd);
	}
	public Object MtDec_Read(Object inLim) {
		int generatedNumFilledThreads = this.getNumFilledThreads();
		Object[] generatedThreads = this.getThreads();
		int generatedFilledThreadStart = this.getFilledThreadStart();
		Object generatedInBuf = t.getInBuf();
		Object generatedAlloc = this.getAlloc();
		Object generatedInDataSize = t.getInDataSize();
		int generatedNumStartedThreads = this.getNumStartedThreads();
		Object generatedInDataSize_Start = t.getInDataSize_Start();
		Object generatedInBufSize = this.getInBufSize();
		while (generatedNumFilledThreads != 0) {
			CMtDecThread t = generatedThreads[generatedFilledThreadStart];
			if (inLim != 0) {
				{ 
					Object link = generatedInBuf;
					Object next = ((CMtDecBufLink)link).getNext();
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAlloc, link);
					t.setInBuf(next);
				}
				if (generatedInDataSize == 0) {
					t.MtDecThread_FreeInBufs();
					if (--generatedNumFilledThreads == 0) {
						break;
					} 
					if (++generatedFilledThreadStart == generatedNumStartedThreads) {
						this.setFilledThreadStart(0);
					} 
					t = generatedThreads[generatedFilledThreadStart];
				} 
			} 
			{ 
				size_t lim = generatedInDataSize_Start;
				if (lim != 0) {
					t.setInDataSize_Start(0);
				} else {
						UInt64 rem = generatedInDataSize;
						lim = generatedInBufSize;
						if (lim > rem) {
							lim = (size_t)rem;
						} 
				} 
				generatedInDataSize -= lim;
				inLim = lim;
				return (Byte)((Byte)(generatedInBuf) + /*Error: Unsupported expression*/);
			}
		}
		Object generatedCrossEnd = this.getCrossEnd();
		Object generatedCrossStart = this.getCrossStart();
		Object generatedCrossBlock = this.getCrossBlock();
		{ 
			size_t crossSize = generatedCrossEnd - generatedCrossStart;
			if (crossSize != 0) {
				Byte data = ((Byte)(generatedCrossBlock) + /*Error: Unsupported expression*/) + generatedCrossStart;
				inLim = crossSize;
				this.setCrossStart(0);
				this.setCrossEnd(0);
				return data;
			} 
			inLim = 0;
			if (generatedCrossBlock) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAlloc, generatedCrossBlock);
				this.setCrossBlock((null));
			} 
			return (null);
		}
	}
	public void MtDec_Construct() {
		int i;
		this.setInBufSize((size_t)1 << 18);
		this.setNumThreadsMax(0);
		this.setInStream((null))// p->inData = NULL;;// p->inData = NULL;
		// p->inDataSize = 0;// p->inDataSize = 0;this.setCrossBlock((null));
		this.setCrossStart(0);
		this.setCrossEnd(0);
		this.setNumFilledThreads(0);
		this.setProgress((null));
		this.setAlloc((null));
		this.setMtCallback((null));
		this.setMtCallbackObject((null));
		this.setAllocatedBufsSize(0);
		Object[] generatedThreads = this.getThreads();
		Object generatedCanRead = t.getCanRead();
		Object generatedCanWrite = t.getCanWrite();
		Object generatedThread = t.getThread();
		for (i = 0; i < 32; i++) {
			CMtDecThread t = generatedThreads[i];
			t.setMtDec(p);
			t.setIndex(i);
			t.setInBuf((null));
			(generatedCanRead) = (null);
			(generatedCanWrite) = (null);
			(generatedThread) = (null);
		}
		 generatedMtProgress = this.getMtProgress();
		Object generatedCs = generatedMtProgress.getCs();
		// Event_Construct(&p->finishedEvent);// Event_Construct(&p->finishedEvent);ModernizedCProgram.CriticalSection_Init(generatedCs);
	}
	public void MtDec_Free() {
		int i;
		this.setExitThread(1);
		Object[] generatedThreads = this.getThreads();
		for (i = 0; i < 32; i++) {
			generatedThreads[i].MtDecThread_Destruct();
		}
		Object generatedCrossBlock = this.getCrossBlock();
		Object generatedAlloc = this.getAlloc();
		if (generatedCrossBlock) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAlloc, generatedCrossBlock);
			this.setCrossBlock((null));
		} 
	}
	public void MtDec_Destruct() {
		p.MtDec_Free();
		 generatedMtProgress = this.getMtProgress();
		Object generatedCs = generatedMtProgress.getCs();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DeleteCriticalSection(generatedCs);
	}
	public Object MtDec_Code() {
		int i;
		this.setInProcessed(0);
		// it must be larger than not_defined index (0)// it must be larger than not_defined index (0)this.setBlockIndex(1);
		this.setIsAllocError(0);
		this.setOverflow(0);
		this.setThreadingErrorSRes(0);
		this.setNeedContinue(1);
		this.setReadWasFinished(0);
		this.setNeedInterrupt(0);
		this.setInterruptIndex((UInt64)(Int64)-1);
		this.setReadProcessed(0);
		this.setReadRes(0);
		this.setCodeRes(0);
		this.setWasInterrupted(0);
		this.setCrossStart(0);
		this.setCrossEnd(0);
		this.setFilledThreadStart(0);
		this.setNumFilledThreads(0);
		int generatedNumThreadsMax = this.getNumThreadsMax();
		{ 
			int numThreads = generatedNumThreadsMax;
			if (numThreads > 32) {
				numThreads = 32;
			} 
			this.setNumStartedThreads_Limit(numThreads);
			this.setNumStartedThreads(0);
		}
		Object generatedInBufSize = this.getInBufSize();
		Object generatedAllocatedBufsSize = this.getAllocatedBufsSize();
		Object[] generatedThreads = this.getThreads();
		Object generatedInBuf = t.getInBuf();
		Object generatedCrossBlock = this.getCrossBlock();
		Object generatedAlloc = this.getAlloc();
		if (generatedInBufSize != generatedAllocatedBufsSize) {
			for (i = 0; i < 32; i++) {
				CMtDecThread t = generatedThreads[i];
				if (generatedInBuf) {
					t.MtDecThread_FreeInBufs();
				} 
			}
			if (generatedCrossBlock) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAlloc, generatedCrossBlock);
				this.setCrossBlock((null));
			} 
			this.setAllocatedBufsSize(generatedInBufSize);
		} 
		 generatedMtProgress = this.getMtProgress();
		ICompressProgress generatedProgress = this.getProgress();
		ModernizedCProgram.MtProgress_Init(generatedMtProgress, generatedProgress);
		// RINOK_THREAD(ArEvent_OptCreate_And_Reset(&p->finishedEvent));// RINOK_THREAD(ArEvent_OptCreate_And_Reset(&p->finishedEvent));this.setExitThread(0);
		this.setExitThreadWRes(0);
		int generatedNumStartedThreads = this.getNumStartedThreads();
		Object generatedCanWrite = nextThread.getCanWrite();
		Object generatedCanRead = nextThread.getCanRead();
		Object generatedIsAllocError = this.getIsAllocError();
		Object generatedThreadingErrorSRes = this.getThreadingErrorSRes();
		Object generatedOverflow = this.getOverflow();
		Object generatedNeedContinue = this.getNeedContinue();
		{ 
			WRes wres = new WRes();
			WRes sres = new WRes();
			CMtDecThread nextThread = generatedThreads[generatedNumStartedThreads++];
			wres = nextThread.MtDecThread_CreateEvents();
			if (wres == 0) {
				wres = ModernizedCProgram.Event_Set(generatedCanWrite);
				if (wres == 0) {
					wres = ModernizedCProgram.Event_Set(generatedCanRead);
					if (wres == 0) {
						wres = ModernizedCProgram.ThreadFunc(nextThread);
						if (wres != 0) {
							this.setNeedContinue(0);
							p.MtDec_CloseThreads();
						} 
					} 
				} 
			} 
			sres = (wres ? ((HRESULT)(((wres) & -1024) | (7 << 16) | -1024)) : 0);
			if (sres != 0) {
				this.setThreadingErrorSRes(sres);
			} 
			if (generatedIsAllocError || generatedThreadingErrorSRes != 0 || generatedOverflow) {
			} else {
					this.setNeedContinue(0);
			} 
			if (generatedNeedContinue) {
				return 0;
			} 
			return sres;
		}
	}
	public Object getInBufSize() {
		return inBufSize;
	}
	public void setInBufSize(Object newInBufSize) {
		inBufSize = newInBufSize;
	}
	public int getNumThreadsMax() {
		return numThreadsMax;
	}
	public void setNumThreadsMax(int newNumThreadsMax) {
		numThreadsMax = newNumThreadsMax;
	}
	public int getNumThreadsMax_2() {
		return numThreadsMax_2;
	}
	public void setNumThreadsMax_2(int newNumThreadsMax_2) {
		numThreadsMax_2 = newNumThreadsMax_2;
	}
	public ISeqInStream getInStream() {
		return inStream;
	}
	public void setInStream(ISeqInStream newInStream) {
		inStream = newInStream;
	}
	public ICompressProgress getProgress() {
		return progress;
	}
	public void setProgress(ICompressProgress newProgress) {
		progress = newProgress;
	}
	public Object getAlloc() {
		return alloc;
	}
	public void setAlloc(Object newAlloc) {
		alloc = newAlloc;
	}
	public  getMtCallback() {
		return mtCallback;
	}
	public void setMtCallback( newMtCallback) {
		mtCallback = newMtCallback;
	}
	public Object getMtCallbackObject() {
		return mtCallbackObject;
	}
	public void setMtCallbackObject(Object newMtCallbackObject) {
		mtCallbackObject = newMtCallbackObject;
	}
	public Object getAllocatedBufsSize() {
		return allocatedBufsSize;
	}
	public void setAllocatedBufsSize(Object newAllocatedBufsSize) {
		allocatedBufsSize = newAllocatedBufsSize;
	}
	public Object getExitThread() {
		return exitThread;
	}
	public void setExitThread(Object newExitThread) {
		exitThread = newExitThread;
	}
	public Object getExitThreadWRes() {
		return exitThreadWRes;
	}
	public void setExitThreadWRes(Object newExitThreadWRes) {
		exitThreadWRes = newExitThreadWRes;
	}
	public Object getBlockIndex() {
		return blockIndex;
	}
	public void setBlockIndex(Object newBlockIndex) {
		blockIndex = newBlockIndex;
	}
	public Object getIsAllocError() {
		return isAllocError;
	}
	public void setIsAllocError(Object newIsAllocError) {
		isAllocError = newIsAllocError;
	}
	public Object getOverflow() {
		return overflow;
	}
	public void setOverflow(Object newOverflow) {
		overflow = newOverflow;
	}
	public Object getThreadingErrorSRes() {
		return threadingErrorSRes;
	}
	public void setThreadingErrorSRes(Object newThreadingErrorSRes) {
		threadingErrorSRes = newThreadingErrorSRes;
	}
	public Object getNeedContinue() {
		return needContinue;
	}
	public void setNeedContinue(Object newNeedContinue) {
		needContinue = newNeedContinue;
	}
	public Object getReadRes() {
		return readRes;
	}
	public void setReadRes(Object newReadRes) {
		readRes = newReadRes;
	}
	public Object getCodeRes() {
		return codeRes;
	}
	public void setCodeRes(Object newCodeRes) {
		codeRes = newCodeRes;
	}
	public Object getWasInterrupted() {
		return wasInterrupted;
	}
	public void setWasInterrupted(Object newWasInterrupted) {
		wasInterrupted = newWasInterrupted;
	}
	public int getNumStartedThreads_Limit() {
		return numStartedThreads_Limit;
	}
	public void setNumStartedThreads_Limit(int newNumStartedThreads_Limit) {
		numStartedThreads_Limit = newNumStartedThreads_Limit;
	}
	public int getNumStartedThreads() {
		return numStartedThreads;
	}
	public void setNumStartedThreads(int newNumStartedThreads) {
		numStartedThreads = newNumStartedThreads;
	}
	public Object getCrossBlock() {
		return crossBlock;
	}
	public void setCrossBlock(Object newCrossBlock) {
		crossBlock = newCrossBlock;
	}
	public Object getCrossStart() {
		return crossStart;
	}
	public void setCrossStart(Object newCrossStart) {
		crossStart = newCrossStart;
	}
	public Object getCrossEnd() {
		return crossEnd;
	}
	public void setCrossEnd(Object newCrossEnd) {
		crossEnd = newCrossEnd;
	}
	public Object getReadProcessed() {
		return readProcessed;
	}
	public void setReadProcessed(Object newReadProcessed) {
		readProcessed = newReadProcessed;
	}
	public Object getReadWasFinished() {
		return readWasFinished;
	}
	public void setReadWasFinished(Object newReadWasFinished) {
		readWasFinished = newReadWasFinished;
	}
	public Object getInProcessed() {
		return inProcessed;
	}
	public void setInProcessed(Object newInProcessed) {
		inProcessed = newInProcessed;
	}
	public int getFilledThreadStart() {
		return filledThreadStart;
	}
	public void setFilledThreadStart(int newFilledThreadStart) {
		filledThreadStart = newFilledThreadStart;
	}
	public int getNumFilledThreads() {
		return numFilledThreads;
	}
	public void setNumFilledThreads(int newNumFilledThreads) {
		numFilledThreads = newNumFilledThreads;
	}
	public Object getNeedInterrupt() {
		return needInterrupt;
	}
	public void setNeedInterrupt(Object newNeedInterrupt) {
		needInterrupt = newNeedInterrupt;
	}
	public Object getInterruptIndex() {
		return interruptIndex;
	}
	public void setInterruptIndex(Object newInterruptIndex) {
		interruptIndex = newInterruptIndex;
	}
	public  getMtProgress() {
		return mtProgress;
	}
	public void setMtProgress( newMtProgress) {
		mtProgress = newMtProgress;
	}
	public Object[] getThreads() {
		return threads;
	}
	public void setThreads(Object[] newThreads) {
		threads = newThreads;
	}
}
/* input variables */
