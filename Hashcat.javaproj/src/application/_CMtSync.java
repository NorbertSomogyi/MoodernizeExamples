package application;

/* LzFindMt.h -- multithreaded Match finder for LZ algorithms
2018-07-04 : Igor Pavlov : Public domain */
public class _CMtSync {
	private Object wasCreated;
	private Object needStart;
	private Object exit;
	private Object stopWriting;
	private Object thread;
	private Object canStart;
	private Object wasStarted;
	private Object wasStopped;
	private Object freeSemaphore;
	private Object filledSemaphore;
	private Object csWasInitialized;
	private Object csWasEntered;
	private Object cs;
	private Object numProcessedBlocks;
	
	public _CMtSync(Object wasCreated, Object needStart, Object exit, Object stopWriting, Object thread, Object canStart, Object wasStarted, Object wasStopped, Object freeSemaphore, Object filledSemaphore, Object csWasInitialized, Object csWasEntered, Object cs, Object numProcessedBlocks) {
		setWasCreated(wasCreated);
		setNeedStart(needStart);
		setExit(exit);
		setStopWriting(stopWriting);
		setThread(thread);
		setCanStart(canStart);
		setWasStarted(wasStarted);
		setWasStopped(wasStopped);
		setFreeSemaphore(freeSemaphore);
		setFilledSemaphore(filledSemaphore);
		setCsWasInitialized(csWasInitialized);
		setCsWasEntered(csWasEntered);
		setCs(cs);
		setNumProcessedBlocks(numProcessedBlocks);
	}
	public _CMtSync() {
	}
	
	/* LzFindMt.c -- multithreaded Match finder for LZ algorithms
	2018-12-29 : Igor Pavlov : Public domain */
	public void MtSync_Construct() {
		this.setWasCreated(0);
		this.setCsWasInitialized(0);
		this.setCsWasEntered(0);
		Object generatedThread = this.getThread();
		(generatedThread) = (null);
		Object generatedCanStart = this.getCanStart();
		(generatedCanStart) = (null);
		Object generatedWasStarted = this.getWasStarted();
		(generatedWasStarted) = (null);
		Object generatedWasStopped = this.getWasStopped();
		(generatedWasStopped) = (null);
		Object generatedFreeSemaphore = this.getFreeSemaphore();
		(generatedFreeSemaphore) = (null);
		Object generatedFilledSemaphore = this.getFilledSemaphore();
		(generatedFilledSemaphore) = (null);
	}
	public void MtSync_GetNextBlock() {
		Object generatedNeedStart = this.getNeedStart();
		Object generatedWasStarted = this.getWasStarted();
		Object generatedWasStopped = this.getWasStopped();
		Object generatedCanStart = this.getCanStart();
		Object generatedCs = this.getCs();
		Object generatedNumProcessedBlocks = this.getNumProcessedBlocks();
		Object generatedFreeSemaphore = this.getFreeSemaphore();
		if (generatedNeedStart) {
			this.setNumProcessedBlocks(1);
			this.setNeedStart(0);
			this.setStopWriting(0);
			this.setExit(0);
			ModernizedCProgram.Event_Reset(generatedWasStarted);
			ModernizedCProgram.Event_Reset(generatedWasStopped);
			ModernizedCProgram.Event_Set(generatedCanStart);
			ModernizedCProgram.Handle_WaitObject((generatedWasStarted));
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LeaveCriticalSection(generatedCs);
				this.setCsWasEntered(0);
				generatedNumProcessedBlocks++;
				ModernizedCProgram.Semaphore_Release1(generatedFreeSemaphore);
		} 
		Object generatedFilledSemaphore = this.getFilledSemaphore();
		ModernizedCProgram.Handle_WaitObject((generatedFilledSemaphore));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnterCriticalSection(generatedCs);
		this.setCsWasEntered(1);
	}
	/* MtSync_StopWriting must be called if Writing was started */
	public void MtSync_StopWriting() {
		Object generatedNumProcessedBlocks = this.getNumProcessedBlocks();
		UInt32 myNumBlocks = generatedNumProcessedBlocks;
		Object generatedThread = this.getThread();
		Object generatedNeedStart = this.getNeedStart();
		if (!((generatedThread) != (null)) || generatedNeedStart) {
			return /*Error: Unsupported expression*/;
		} 
		this.setStopWriting(1);
		Object generatedCsWasEntered = this.getCsWasEntered();
		Object generatedCs = this.getCs();
		if (generatedCsWasEntered) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LeaveCriticalSection(generatedCs);
			this.setCsWasEntered(0);
		} 
		Object generatedFreeSemaphore = this.getFreeSemaphore();
		ModernizedCProgram.Semaphore_Release1(generatedFreeSemaphore);
		Object generatedWasStopped = this.getWasStopped();
		ModernizedCProgram.Handle_WaitObject((generatedWasStopped));
		Object generatedFilledSemaphore = this.getFilledSemaphore();
		while (myNumBlocks++ != generatedNumProcessedBlocks) {
			ModernizedCProgram.Handle_WaitObject((generatedFilledSemaphore));
			ModernizedCProgram.Semaphore_Release1(generatedFreeSemaphore);
		}
		this.setNeedStart(1);
	}
	public void MtSync_Destruct() {
		Object generatedThread = this.getThread();
		Object generatedNeedStart = this.getNeedStart();
		Object generatedCanStart = this.getCanStart();
		if (((generatedThread) != (null))) {
			p.MtSync_StopWriting();
			this.setExit(1);
			if (generatedNeedStart) {
				ModernizedCProgram.Event_Set(generatedCanStart);
			} 
			ModernizedCProgram.Handle_WaitObject((generatedThread));
			ModernizedCProgram.HandlePtr_Close(generatedThread);
		} 
		Object generatedCsWasInitialized = this.getCsWasInitialized();
		Object generatedCs = this.getCs();
		if (generatedCsWasInitialized) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DeleteCriticalSection(generatedCs);
			this.setCsWasInitialized(0);
		} 
		ModernizedCProgram.HandlePtr_Close(generatedCanStart);
		Object generatedWasStarted = this.getWasStarted();
		ModernizedCProgram.HandlePtr_Close(generatedWasStarted);
		Object generatedWasStopped = this.getWasStopped();
		ModernizedCProgram.HandlePtr_Close(generatedWasStopped);
		Object generatedFreeSemaphore = this.getFreeSemaphore();
		ModernizedCProgram.HandlePtr_Close(generatedFreeSemaphore);
		Object generatedFilledSemaphore = this.getFilledSemaphore();
		ModernizedCProgram.HandlePtr_Close(generatedFilledSemaphore);
		this.setWasCreated(0);
	}
	public Object MtSync_Create2(Object startAddress, Object obj, Object numBlocks) {
		Object generatedWasCreated = this.getWasCreated();
		if (generatedWasCreated) {
			return 0;
		} 
		Object generatedCs = this.getCs();
		{ 
			if ((ModernizedCProgram.CriticalSection_Init(generatedCs)) != 0) {
				return 12;
			} 
		}
		;
		this.setCsWasInitialized(1);
		Object generatedCanStart = this.getCanStart();
		{ 
			if ((ModernizedCProgram.AutoResetEvent_CreateNotSignaled(generatedCanStart)) != 0) {
				return 12;
			} 
		}
		;
		Object generatedWasStarted = this.getWasStarted();
		{ 
			if ((ModernizedCProgram.AutoResetEvent_CreateNotSignaled(generatedWasStarted)) != 0) {
				return 12;
			} 
		}
		;
		Object generatedWasStopped = this.getWasStopped();
		{ 
			if ((ModernizedCProgram.AutoResetEvent_CreateNotSignaled(generatedWasStopped)) != 0) {
				return 12;
			} 
		}
		;
		Object generatedFreeSemaphore = this.getFreeSemaphore();
		{ 
			if ((ModernizedCProgram.Semaphore_Create(generatedFreeSemaphore, numBlocks, numBlocks)) != 0) {
				return 12;
			} 
		}
		;
		Object generatedFilledSemaphore = this.getFilledSemaphore();
		{ 
			if ((ModernizedCProgram.Semaphore_Create(generatedFilledSemaphore, 0, numBlocks)) != 0) {
				return 12;
			} 
		}
		;
		this.setNeedStart(1);
		Object generatedThread = this.getThread();
		{ 
			if ((ModernizedCProgram.Thread_Create(generatedThread, startAddress, obj)) != 0) {
				return 12;
			} 
		}
		;
		this.setWasCreated(1);
		return 0;
	}
	public Object MtSync_Create(Object startAddress, Object obj, Object numBlocks) {
		SRes res = p.MtSync_Create2(startAddress, obj, numBlocks);
		if (res != 0) {
			p.MtSync_Destruct();
		} 
		return res;
	}
	public void MtSync_Init() {
		this.setNeedStart(1);
	}
	public Object getWasCreated() {
		return wasCreated;
	}
	public void setWasCreated(Object newWasCreated) {
		wasCreated = newWasCreated;
	}
	public Object getNeedStart() {
		return needStart;
	}
	public void setNeedStart(Object newNeedStart) {
		needStart = newNeedStart;
	}
	public Object getExit() {
		return exit;
	}
	public void setExit(Object newExit) {
		exit = newExit;
	}
	public Object getStopWriting() {
		return stopWriting;
	}
	public void setStopWriting(Object newStopWriting) {
		stopWriting = newStopWriting;
	}
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
	public Object getCanStart() {
		return canStart;
	}
	public void setCanStart(Object newCanStart) {
		canStart = newCanStart;
	}
	public Object getWasStarted() {
		return wasStarted;
	}
	public void setWasStarted(Object newWasStarted) {
		wasStarted = newWasStarted;
	}
	public Object getWasStopped() {
		return wasStopped;
	}
	public void setWasStopped(Object newWasStopped) {
		wasStopped = newWasStopped;
	}
	public Object getFreeSemaphore() {
		return freeSemaphore;
	}
	public void setFreeSemaphore(Object newFreeSemaphore) {
		freeSemaphore = newFreeSemaphore;
	}
	public Object getFilledSemaphore() {
		return filledSemaphore;
	}
	public void setFilledSemaphore(Object newFilledSemaphore) {
		filledSemaphore = newFilledSemaphore;
	}
	public Object getCsWasInitialized() {
		return csWasInitialized;
	}
	public void setCsWasInitialized(Object newCsWasInitialized) {
		csWasInitialized = newCsWasInitialized;
	}
	public Object getCsWasEntered() {
		return csWasEntered;
	}
	public void setCsWasEntered(Object newCsWasEntered) {
		csWasEntered = newCsWasEntered;
	}
	public Object getCs() {
		return cs;
	}
	public void setCs(Object newCs) {
		cs = newCs;
	}
	public Object getNumProcessedBlocks() {
		return numProcessedBlocks;
	}
	public void setNumProcessedBlocks(Object newNumProcessedBlocks) {
		numProcessedBlocks = newNumProcessedBlocks;
	}
}
