package application;

public class threadcache_t {
	private int mymspace;
	private long threadid;
	private int mallocs;
	private int frees;
	private int successes;
	private Object freeInCache;
	private Object bins;
	
	public threadcache_t(int mymspace, long threadid, int mallocs, int frees, int successes, Object freeInCache, Object bins) {
		setMymspace(mymspace);
		setThreadid(threadid);
		setMallocs(mallocs);
		setFrees(frees);
		setSuccesses(successes);
		setFreeInCache(freeInCache);
		setBins(bins);
	}
	public threadcache_t() {
	}
	
	public threadcache_t AllocCache(nedpool_t p) {
		threadcache tc = 0;
		int n;
		int end;
		win32_mlock_t generatedMutex = p.getMutex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win32_acquire_lock(generatedMutex);
		Object generatedCaches = p.getCaches();
		for (n = 0; n < 256 && generatedCaches[n]; n++) {
			;
		}
		if (256 == n) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win32_release_lock(generatedMutex);
			return 0;
		} 
		Object generatedM = p.getM();
		tc = generatedCaches[n] = (threadcache)/*Error: Function owner not recognized*/mspace_calloc(generatedM[0], 1, /*Error: Unsupported expression*/);
		if (!tc) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win32_release_lock(generatedMutex);
			return 0;
		} 
		tc.setThreadid((long)(size_t)/*Error: Function owner not recognized*/win32_getcurrentthreadid());
		for (end = 0; generatedM[end]; end++) {
			;
		}
		long generatedThreadid = tc.getThreadid();
		tc.setMymspace(generatedThreadid % end);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win32_release_lock(generatedMutex);
		Object generatedMycache = p.getMycache();
		if ((!/*Error: Function owner not recognized*/TlsSetValue(generatedMycache, (Object)(size_t)(n + 1)))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/abort();
		} 
		return tc;
	}
	public int getMymspace() {
		return mymspace;
	}
	public void setMymspace(int newMymspace) {
		mymspace = newMymspace;
	}
	public long getThreadid() {
		return threadid;
	}
	public void setThreadid(long newThreadid) {
		threadid = newThreadid;
	}
	public int getMallocs() {
		return mallocs;
	}
	public void setMallocs(int newMallocs) {
		mallocs = newMallocs;
	}
	public int getFrees() {
		return frees;
	}
	public void setFrees(int newFrees) {
		frees = newFrees;
	}
	public int getSuccesses() {
		return successes;
	}
	public void setSuccesses(int newSuccesses) {
		successes = newSuccesses;
	}
	public Object getFreeInCache() {
		return freeInCache;
	}
	public void setFreeInCache(Object newFreeInCache) {
		freeInCache = newFreeInCache;
	}
	public Object getBins() {
		return bins;
	}
	public void setBins(Object newBins) {
		bins = newBins;
	}
}
