package application;

public class _CMtCoder {
	private Object blockSize;
	private int numThreadsMax;
	private Object expectedDataSize;
	private ISeqInStream inStream;
	private Object inData;
	private Object inDataSize;
	private ICompressProgress progress;
	private Object allocBig;
	private  mtCallback;
	private Object mtCallbackObject;
	private Object allocatedBufsSize;
	private Object readEvent;
	private Object blocksSemaphore;
	private Object stopReading;
	private Object readRes;
	private Object finishedEvent;
	private Object writeRes;
	private int writeIndex;
	private Object ReadyBlocks;
	private Object numFinishedThreads;
	private int numStartedThreadsLimit;
	private int numStartedThreads;
	private int numBlocksMax;
	private int blockIndex;
	private Object readProcessed;
	private Object cs;
	private int freeBlockHead;
	private Object freeBlockList;
	private  mtProgress;
	private Object blocks;
	private Object threads;
	
	public _CMtCoder(Object blockSize, int numThreadsMax, Object expectedDataSize, ISeqInStream inStream, Object inData, Object inDataSize, ICompressProgress progress, Object allocBig,  mtCallback, Object mtCallbackObject, Object allocatedBufsSize, Object readEvent, Object blocksSemaphore, Object stopReading, Object readRes, Object finishedEvent, Object writeRes, int writeIndex, Object ReadyBlocks, Object numFinishedThreads, int numStartedThreadsLimit, int numStartedThreads, int numBlocksMax, int blockIndex, Object readProcessed, Object cs, int freeBlockHead, Object freeBlockList,  mtProgress, Object blocks, Object threads) {
		setBlockSize(blockSize);
		setNumThreadsMax(numThreadsMax);
		setExpectedDataSize(expectedDataSize);
		setInStream(inStream);
		setInData(inData);
		setInDataSize(inDataSize);
		setProgress(progress);
		setAllocBig(allocBig);
		setMtCallback(mtCallback);
		setMtCallbackObject(mtCallbackObject);
		setAllocatedBufsSize(allocatedBufsSize);
		setReadEvent(readEvent);
		setBlocksSemaphore(blocksSemaphore);
		setStopReading(stopReading);
		setReadRes(readRes);
		setFinishedEvent(finishedEvent);
		setWriteRes(writeRes);
		setWriteIndex(writeIndex);
		setReadyBlocks(ReadyBlocks);
		setNumFinishedThreads(numFinishedThreads);
		setNumStartedThreadsLimit(numStartedThreadsLimit);
		setNumStartedThreads(numStartedThreads);
		setNumBlocksMax(numBlocksMax);
		setBlockIndex(blockIndex);
		setReadProcessed(readProcessed);
		setCs(cs);
		setFreeBlockHead(freeBlockHead);
		setFreeBlockList(freeBlockList);
		setMtProgress(mtProgress);
		setBlocks(blocks);
		setThreads(threads);
	}
	public _CMtCoder() {
	}
	
	public void MtCoder_Construct() {
		int i;
		this.setBlockSize(0);
		this.setNumThreadsMax(0);
		this.setExpectedDataSize((UInt64)(Int64)-1);
		this.setInStream(((Object)0));
		this.setInData(((Object)0));
		this.setInDataSize(0);
		this.setProgress(((Object)0));
		this.setAllocBig(((Object)0));
		this.setMtCallback(((Object)0));
		this.setMtCallbackObject(((Object)0));
		this.setAllocatedBufsSize(0);
		Object generatedReadEvent = this.getReadEvent();
		(generatedReadEvent) = ((Object)0);
		Object generatedBlocksSemaphore = this.getBlocksSemaphore();
		(generatedBlocksSemaphore) = ((Object)0);
		Object generatedThreads = this.getThreads();
		Object generatedStartEvent = t.getStartEvent();
		Object generatedThread = t.getThread();
		for (i = 0; i < 64; i++) {
			CMtCoderThread t = generatedThreads[i];
			t.setMtCoder(p);
			t.setIndex(i);
			t.setInBuf(((Object)0));
			t.setStop(0);
			(generatedStartEvent) = ((Object)0);
			(generatedThread) = ((Object)0);
		}
		Object generatedFinishedEvent = this.getFinishedEvent();
		(generatedFinishedEvent) = ((Object)0);
		Object generatedCs = this.getCs();
		ModernizedCProgram.CriticalSection_Init(generatedCs);
		ModernizedCProgram.CriticalSection_Init(generatedCs);
	}
	public void MtCoder_Free() {
		int i;
		/*
		  p->stopReading = True;
		  if (Event_IsCreated(&p->readEvent))
		    Event_Set(&p->readEvent);
		  */
		Object generatedThreads = this.getThreads();
		for (i = 0; i < 64; i++) {
			generatedThreads[i].MtCoderThread_Destruct();
		}
		Object generatedReadEvent = this.getReadEvent();
		ModernizedCProgram.HandlePtr_Close(generatedReadEvent);
		Object generatedBlocksSemaphore = this.getBlocksSemaphore();
		ModernizedCProgram.HandlePtr_Close(generatedBlocksSemaphore);
		Object generatedFinishedEvent = this.getFinishedEvent();
		ModernizedCProgram.HandlePtr_Close(generatedFinishedEvent);
	}
	public void MtCoder_Destruct() {
		p.MtCoder_Free();
		Object generatedCs = this.getCs();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DeleteCriticalSection(generatedCs);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DeleteCriticalSection(generatedCs);
	}
	public Object MtCoder_Code() {
		int generatedNumThreadsMax = this.getNumThreadsMax();
		int numThreads = generatedNumThreadsMax;
		int numBlocksMax;
		int i;
		SRes res = 0;
		if (numThreads > 64) {
			numThreads = 64;
		} 
		numBlocksMax = ((numThreads) + (numThreads) / 8 + 1);
		Object generatedBlockSize = this.getBlockSize();
		if (generatedBlockSize < ((UInt32)1 << 26)) {
			numBlocksMax++;
		} 
		if (generatedBlockSize < ((UInt32)1 << 24)) {
			numBlocksMax++;
		} 
		if (generatedBlockSize < ((UInt32)1 << 22)) {
			numBlocksMax++;
		} 
		if (numBlocksMax > (((true) + (true) / 8 + 1) + 3)) {
			numBlocksMax = (((true) + (true) / 8 + 1) + 3);
		} 
		Object generatedAllocatedBufsSize = this.getAllocatedBufsSize();
		Object generatedThreads = this.getThreads();
		Object generatedInBuf = t.getInBuf();
		Object generatedAllocBig = this.getAllocBig();
		if (generatedBlockSize != generatedAllocatedBufsSize) {
			for (i = 0; i < 64; i++) {
				CMtCoderThread t = generatedThreads[i];
				if (generatedInBuf) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedAllocBig, generatedInBuf);
					t.setInBuf(((Object)0));
				} 
			}
			this.setAllocatedBufsSize(generatedBlockSize);
		} 
		this.setReadRes(0);
		 generatedMtProgress = this.getMtProgress();
		ICompressProgress generatedProgress = this.getProgress();
		ModernizedCProgram.MtProgress_Init(generatedMtProgress, generatedProgress);
		Object generatedFinishedEvent = this.getFinishedEvent();
		{ 
			if ((ModernizedCProgram.ArEvent_OptCreate_And_Reset(generatedFinishedEvent)) != 0) {
				return 12;
			} 
		}
		;
		Object generatedReadEvent = this.getReadEvent();
		Object generatedBlocksSemaphore = this.getBlocksSemaphore();
		{ 
			{ 
				if ((ModernizedCProgram.ArEvent_OptCreate_And_Reset(generatedReadEvent)) != 0) {
					return 12;
				} 
			}
			;
			if (((generatedBlocksSemaphore) != ((Object)0))) {
				{ 
					if ((ModernizedCProgram.HandlePtr_Close(generatedBlocksSemaphore)) != 0) {
						return 12;
					} 
				}
				;
			} 
			{ 
				if ((ModernizedCProgram.Semaphore_Create(generatedBlocksSemaphore, numBlocksMax, numBlocksMax)) != 0) {
					return 12;
				} 
			}
			;
		}
		Object generatedFreeBlockList = this.getFreeBlockList();
		for (i = 0; i < (((true) + (true) / 8 + 1) + 3) - 1; i++) {
			generatedFreeBlockList[i] = i + 1;
		}
		generatedFreeBlockList[(((true) + (true) / 8 + 1) + 3) - 1] = (int)(int)-1;
		this.setFreeBlockHead(0);
		this.setReadProcessed(0);
		this.setBlockIndex(0);
		this.setNumBlocksMax(numBlocksMax);
		this.setStopReading(0);
		this.setWriteIndex(0);
		this.setWriteRes(0);
		Object generatedReadyBlocks = this.getReadyBlocks();
		for (i = 0; i < (((true) + (true) / 8 + 1) + 3); i++) {
			generatedReadyBlocks[i] = 0;
		}
		this.setNumFinishedThreads(0);
		this.setNumStartedThreadsLimit(numThreads);
		this.setNumStartedThreads(0)// for (i = 0; i < numThreads; i++);// for (i = 0; i < numThreads; i++)
		int generatedNumStartedThreads = this.getNumStartedThreads();
		{ 
			CMtCoderThread nextThread = generatedThreads[generatedNumStartedThreads++];
			{ 
				int __result__ = (nextThread.MtCoderThread_CreateAndStart());
				if (__result__ != 0) {
					return __result__;
				} 
			}
			;
		}
		{ 
			if ((ModernizedCProgram.Event_Set(generatedReadEvent)) != 0) {
				return 12;
			} 
		}
		{ 
			WRes wres = ModernizedCProgram.Handle_WaitObject((generatedFinishedEvent));
			res = (wres ? ((HRESULT)(((wres) & -1024) | (7 << 16) | -1024)) : 0);
		}
		Object generatedReadRes = this.getReadRes();
		if (res == 0) {
			res = generatedReadRes;
		} 
		Object generatedRes = generatedMtProgress.getRes();
		if (res == 0) {
			res = generatedRes;
		} 
		Object generatedWriteRes = this.getWriteRes();
		if (res == 0) {
			res = generatedWriteRes;
		} 
		if (res != 0) {
			p.MtCoder_Free();
		} 
		return res;
	}
	public Object getBlockSize() {
		return blockSize;
	}
	public void setBlockSize(Object newBlockSize) {
		blockSize = newBlockSize;
	}
	public int getNumThreadsMax() {
		return numThreadsMax;
	}
	public void setNumThreadsMax(int newNumThreadsMax) {
		numThreadsMax = newNumThreadsMax;
	}
	public Object getExpectedDataSize() {
		return expectedDataSize;
	}
	public void setExpectedDataSize(Object newExpectedDataSize) {
		expectedDataSize = newExpectedDataSize;
	}
	public ISeqInStream getInStream() {
		return inStream;
	}
	public void setInStream(ISeqInStream newInStream) {
		inStream = newInStream;
	}
	public Object getInData() {
		return inData;
	}
	public void setInData(Object newInData) {
		inData = newInData;
	}
	public Object getInDataSize() {
		return inDataSize;
	}
	public void setInDataSize(Object newInDataSize) {
		inDataSize = newInDataSize;
	}
	public ICompressProgress getProgress() {
		return progress;
	}
	public void setProgress(ICompressProgress newProgress) {
		progress = newProgress;
	}
	public Object getAllocBig() {
		return allocBig;
	}
	public void setAllocBig(Object newAllocBig) {
		allocBig = newAllocBig;
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
	public Object getReadEvent() {
		return readEvent;
	}
	public void setReadEvent(Object newReadEvent) {
		readEvent = newReadEvent;
	}
	public Object getBlocksSemaphore() {
		return blocksSemaphore;
	}
	public void setBlocksSemaphore(Object newBlocksSemaphore) {
		blocksSemaphore = newBlocksSemaphore;
	}
	public Object getStopReading() {
		return stopReading;
	}
	public void setStopReading(Object newStopReading) {
		stopReading = newStopReading;
	}
	public Object getReadRes() {
		return readRes;
	}
	public void setReadRes(Object newReadRes) {
		readRes = newReadRes;
	}
	public Object getFinishedEvent() {
		return finishedEvent;
	}
	public void setFinishedEvent(Object newFinishedEvent) {
		finishedEvent = newFinishedEvent;
	}
	public Object getWriteRes() {
		return writeRes;
	}
	public void setWriteRes(Object newWriteRes) {
		writeRes = newWriteRes;
	}
	public int getWriteIndex() {
		return writeIndex;
	}
	public void setWriteIndex(int newWriteIndex) {
		writeIndex = newWriteIndex;
	}
	public Object getReadyBlocks() {
		return ReadyBlocks;
	}
	public void setReadyBlocks(Object newReadyBlocks) {
		ReadyBlocks = newReadyBlocks;
	}
	public Object getNumFinishedThreads() {
		return numFinishedThreads;
	}
	public void setNumFinishedThreads(Object newNumFinishedThreads) {
		numFinishedThreads = newNumFinishedThreads;
	}
	public int getNumStartedThreadsLimit() {
		return numStartedThreadsLimit;
	}
	public void setNumStartedThreadsLimit(int newNumStartedThreadsLimit) {
		numStartedThreadsLimit = newNumStartedThreadsLimit;
	}
	public int getNumStartedThreads() {
		return numStartedThreads;
	}
	public void setNumStartedThreads(int newNumStartedThreads) {
		numStartedThreads = newNumStartedThreads;
	}
	public int getNumBlocksMax() {
		return numBlocksMax;
	}
	public void setNumBlocksMax(int newNumBlocksMax) {
		numBlocksMax = newNumBlocksMax;
	}
	public int getBlockIndex() {
		return blockIndex;
	}
	public void setBlockIndex(int newBlockIndex) {
		blockIndex = newBlockIndex;
	}
	public Object getReadProcessed() {
		return readProcessed;
	}
	public void setReadProcessed(Object newReadProcessed) {
		readProcessed = newReadProcessed;
	}
	public Object getCs() {
		return cs;
	}
	public void setCs(Object newCs) {
		cs = newCs;
	}
	public int getFreeBlockHead() {
		return freeBlockHead;
	}
	public void setFreeBlockHead(int newFreeBlockHead) {
		freeBlockHead = newFreeBlockHead;
	}
	public Object getFreeBlockList() {
		return freeBlockList;
	}
	public void setFreeBlockList(Object newFreeBlockList) {
		freeBlockList = newFreeBlockList;
	}
	public  getMtProgress() {
		return mtProgress;
	}
	public void setMtProgress( newMtProgress) {
		mtProgress = newMtProgress;
	}
	public Object getBlocks() {
		return blocks;
	}
	public void setBlocks(Object newBlocks) {
		blocks = newBlocks;
	}
	public Object getThreads() {
		return threads;
	}
	public void setThreads(Object newThreads) {
		threads = newThreads;
	}
}
/* input variables */
