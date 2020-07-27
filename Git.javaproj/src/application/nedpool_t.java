package application;

public class nedpool_t {
	private win32_mlock_t mutex;
	private Object uservalue;
	private int threads;
	private Object caches;
	private Object mycache;
	private Object m;
	
	public nedpool_t(win32_mlock_t mutex, Object uservalue, int threads, Object caches, Object mycache, Object m) {
		setMutex(mutex);
		setUservalue(uservalue);
		setThreads(threads);
		setCaches(caches);
		setMycache(mycache);
		setM(m);
	}
	public nedpool_t() {
	}
	
	public void DestroyCaches() {
		Object generatedCaches = this.getCaches();
		int generatedFrees = tc.getFrees();
		Object generatedFreeInCache = tc.getFreeInCache();
		if (generatedCaches) {
			threadcache tc = new threadcache();
			int n;
			for (n = 0; n < 256; n++) {
				if ((tc = generatedCaches[n])) {
					generatedFrees++;
					ModernizedCProgram.RemoveCacheEntries(p, tc, 0);
					if (!(!generatedFreeInCache)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/abort();
					} 
					tc.setMymspace(-1);
					tc.setThreadid(0);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mspace_free(0, tc);
					generatedCaches[n] = 0;
				} 
			}
		} 
	}
	public int InitPool(Object capacity, int threads) {
		((Object)(ModernizedCProgram.mparams.getMagic() != 0 || ModernizedCProgram.init_mparams()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win32_acquire_lock(malloc_global_mutex);
		;
		int generatedThreads = this.getThreads();
		if (generatedThreads) {
			;
		} 
		if (()) {
			;
		} 
		if (()) {
			;
		} 
		Object generatedM = this.getM();
		if (!(generatedM[0] = (mstate)/*Error: Function owner not recognized*/create_mspace(capacity, 1))) {
			;
		} 
		generatedM[0].setExtp(p);
		this.setThreads((threads < 1 || threads > 16) ? 16 : threads);
		;
		return 1;
		p.DestroyCaches();
		if (generatedM[0]) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/destroy_mspace(generatedM[0]);
			generatedM[0] = 0;
		} 
		Object generatedMycache = this.getMycache();
		if (generatedMycache) {
			if ((!/*Error: Function owner not recognized*/TlsFree(generatedMycache))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/abort();
			} 
			this.setMycache(0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win32_release_lock(malloc_global_mutex);
		;
		return 0;
	}
	public nedpool_t nedcreatepool(Object capacity, int threads) {
		nedpool ret = new nedpool();
		if (!(ret = (nedpool)0.nedpcalloc(1, /*Error: Unsupported expression*/))) {
			return 0;
		} 
		if (!ret.InitPool(capacity, threads)) {
			0.nedpfree(ret);
			return 0;
		} 
		return ret;
	}
	public void neddestroypool() {
		int n;
		win32_mlock_t generatedMutex = this.getMutex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win32_acquire_lock(generatedMutex);
		p.DestroyCaches();
		Object generatedM = this.getM();
		for (n = 0; generatedM[n]; n++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/destroy_mspace(generatedM[n]);
			generatedM[n] = 0;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win32_release_lock(generatedMutex);
		Object generatedMycache = this.getMycache();
		if ((!/*Error: Function owner not recognized*/TlsFree(generatedMycache))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/abort();
		} 
		0.nedpfree(p);
	}
	public void nedpsetvalue(Object v) {
		if (!p) {
			p = ModernizedCProgram.syspool;
			if (!ModernizedCProgram.syspool.getThreads()) {
				ModernizedCProgram.syspool.InitPool(0, -1);
			} 
		} 
		this.setUservalue(v);
	}
	public Object nedgetvalue(Object mem) {
		nedpool np = 0;
		mchunkptr mcp = ((mchunkptr)((byte)(mem) - ((/*Error: Unsupported expression*/) << 1)));
		mstate fm = new mstate();
		if (!((((size_t)((((Object)((byte)(mcp) + ((/*Error: Unsupported expression*/) << 1))))) & ((((size_t)-1024) - ((size_t)1)))) == 0)) && mcp.getHead() != (((((size_t)1)) | (((size_t)2))) | (/*Error: Unsupported expression*/))) {
			return 0;
		} 
		if (!((mcp).getHead() & (((size_t)2)))) {
			return 0;
		} 
		if (!((((mchunkptr)(((byte)(mcp)) + ((mcp).getHead() & ~((((size_t)1)) | (((size_t)2)) | (((size_t)4)))))).getHead()) & (((size_t)1)))) {
			return 0;
		} 
		if (!(!((mcp).getHead() & (((size_t)1))) && ((mcp).getPrev_foot() & (((size_t)1)))) && !((mcp).getHead() & (((size_t)1)))) {
			if (((mchunkptr)(((byte)(((mchunkptr)(((byte)(mcp)) - ((mcp).getPrev_foot()))))) + ((((mchunkptr)(((byte)(mcp)) - ((mcp).getPrev_foot())))).getHead() & ~((((size_t)1)) | (((size_t)2)) | (((size_t)4)))))) != mcp) {
				return 0;
			} 
		} 
		fm = ((mstate)(((mchunkptr)((byte)(mcp) + (((mcp).getHead() & ~(((((size_t)1)) | (((size_t)2)) | (((size_t)4)))))))).getPrev_foot() ^ ModernizedCProgram.mparams.getMagic()));
		if (!((fm).getMagic() == ModernizedCProgram.mparams.getMagic())) {
			return 0;
		} 
		if (!((byte)(mcp) >= (fm).getLeast_addr())) {
			return 0;
		} 
		if (!fm.getExtp()) {
			return 0;
		} 
		np = (nedpool)fm.getExtp();
		if (p) {
			p = np;
		} 
		Object generatedUservalue = np.getUservalue();
		return generatedUservalue;
	}
	public void neddisablethreadcache() {
		int mycache;
		if (!p) {
			p = ModernizedCProgram.syspool;
			if (!ModernizedCProgram.syspool.getThreads()) {
				ModernizedCProgram.syspool.InitPool(0, -1);
			} 
		} 
		Object generatedMycache = this.getMycache();
		mycache = (int)(size_t)ModernizedCProgram.ChkedTlsGetValue(generatedMycache);
		Object generatedCaches = this.getCaches();
		int generatedSuccesses = tc.getSuccesses();
		int generatedMallocs = tc.getMallocs();
		int generatedFrees = tc.getFrees();
		int generatedMymspace = tc.getMymspace();
		Object generatedFreeInCache = tc.getFreeInCache();
		if (!mycache) {
			if ((!/*Error: Function owner not recognized*/TlsSetValue(generatedMycache, (Object)-1))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/abort();
			} 
		}  else if (mycache > 0) {
			threadcache tc = generatedCaches[mycache - /* Set to last used mspace */1];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Threadcache utilisation: %lf%% in cache with %lf%% lost to other threads\n", 100.0 * generatedSuccesses / generatedMallocs, 100.0 * ((double)generatedMallocs - generatedFrees) / generatedMallocs);
			if ((!/*Error: Function owner not recognized*/TlsSetValue(generatedMycache, (Object)(size_t)(-generatedMymspace)))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/abort();
			} 
			generatedFrees++;
			ModernizedCProgram.RemoveCacheEntries(p, tc, 0);
			if (!(!generatedFreeInCache)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/abort();
			} 
			tc.setMymspace(-1);
			tc.setThreadid(0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mspace_free(0, generatedCaches[mycache - 1]);
			generatedCaches[mycache - 1] = 0;
		} 
	}
	public Object nedpmalloc(Object size) {
		Object ret = 0;
		threadcache tc = new threadcache();
		int mymspace;
		ModernizedCProgram.GetThreadCache(p, tc, mymspace, size);
		if (tc && size <= 8192) {
			ret = ModernizedCProgram.threadcache_malloc(p, tc, /* Use the thread cache */size);
		} 
		if (!ret) {
			do {
				mstate m = ModernizedCProgram.GetMSpace((p), (tc), (mymspace), (size));
				ret = /*Error: Function owner not recognized*/mspace_malloc(m, size);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win32_release_lock(m.getMutex());
			} while (/* Use this thread's mspace */0);
		} 
		return ret;
	}
	public Object nedpcalloc(Object no, Object size) {
		size_t rsize = size * no;
		Object ret = 0;
		threadcache tc = new threadcache();
		int mymspace;
		ModernizedCProgram.GetThreadCache(p, tc, mymspace, rsize);
		if (tc && rsize <= 8192) {
			if ((ret = ModernizedCProgram.threadcache_malloc(p, tc, /* Use the thread cache */rsize))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ret, 0, rsize);
			} 
		} 
		if (!ret) {
			do {
				mstate m = ModernizedCProgram.GetMSpace((p), (tc), (mymspace), (rsize));
				ret = /*Error: Function owner not recognized*/mspace_calloc(m, 1, rsize);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win32_release_lock(m.getMutex());
			} while (/* Use this thread's mspace */0);
		} 
		return ret;
	}
	public Object nedprealloc(Object mem, Object size) {
		Object ret = 0;
		threadcache tc = new threadcache();
		int mymspace;
		if (!mem) {
			return p.nedpmalloc(size);
		} 
		ModernizedCProgram.GetThreadCache(p, tc, mymspace, size);
		if (tc && size && size <= 8192) {
			size_t memsize = ModernizedCProgram.nedblksize(/* Use the thread cache */mem);
			if (!(memsize)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/abort();
			} 
			if ((ret = ModernizedCProgram.threadcache_malloc(p, tc, size))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ret, mem, memsize < size ? memsize : size);
				if (memsize <= 8192) {
					ModernizedCProgram.threadcache_free(p, tc, mymspace, mem, memsize);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mspace_free(0, mem);
				} 
			} 
		} 
		if (!ret/* Reallocs always happen in the mspace they happened in, so skip
				locking the preferred mspace for this thread */) {
			ret = /*Error: Function owner not recognized*/mspace_realloc(0, mem, size);
		} 
		return ret;
	}
	public void nedpfree(Object mem) {
		threadcache tc = new threadcache();
		int mymspace;
		size_t memsize = new size_t();
		if (!(mem)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/abort();
		} 
		ModernizedCProgram.GetThreadCache(p, tc, mymspace, 0);
		memsize = ModernizedCProgram.nedblksize(mem);
		if (!(memsize)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/abort();
		} 
		if (mem && tc && memsize <= (8192 + (((/*Error: Unsupported expression*/) << 1)))) {
			ModernizedCProgram.threadcache_free(p, tc, mymspace, mem, memsize);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mspace_free(0, mem);
		} 
	}
	/* Frees always happen in the mspace they happened in, so skip
		locking the preferred mspace for this thread */
	public Object nedpmemalign(Object alignment, Object bytes) {
		Object ret;
		threadcache tc = new threadcache();
		int mymspace;
		ModernizedCProgram.GetThreadCache(p, tc, mymspace, bytes);
		{ 
			do {
				mstate m = ModernizedCProgram.GetMSpace((p), (tc), (mymspace), (bytes));
				ret = /*Error: Function owner not recognized*/mspace_memalign(m, alignment, bytes);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win32_release_lock(m.getMutex());
			} while (/* Use this thread's mspace */0);
		}
		return ret;
	}
	public int nedpmallopt(int parno, int value) {
		return /*Error: Function owner not recognized*/mspace_mallopt(parno, value);
	}
	public int nedpmalloc_trim(Object pad) {
		int n;
		int ret = 0;
		if (!p) {
			p = ModernizedCProgram.syspool;
			if (!ModernizedCProgram.syspool.getThreads()) {
				ModernizedCProgram.syspool.InitPool(0, -1);
			} 
		} 
		Object generatedM = this.getM();
		for (n = 0; generatedM[n]; n++) {
			ret += /*Error: Function owner not recognized*/mspace_trim(generatedM[n], pad);
		}
		return ret;
	}
	public void nedpmalloc_stats() {
		int n;
		if (!p) {
			p = ModernizedCProgram.syspool;
			if (!ModernizedCProgram.syspool.getThreads()) {
				ModernizedCProgram.syspool.InitPool(0, -1);
			} 
		} 
		Object generatedM = this.getM();
		for (n = 0; generatedM[n]; n++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mspace_malloc_stats(generatedM[n]);
		}
	}
	public Object nedpmalloc_footprint() {
		size_t ret = 0;
		int n;
		if (!p) {
			p = ModernizedCProgram.syspool;
			if (!ModernizedCProgram.syspool.getThreads()) {
				ModernizedCProgram.syspool.InitPool(0, -1);
			} 
		} 
		Object generatedM = this.getM();
		for (n = 0; generatedM[n]; n++) {
			ret += /*Error: Function owner not recognized*/mspace_footprint(generatedM[n]);
		}
		return ret;
	}
	public Object nedpindependent_calloc(Object elemsno, Object elemsize, Object chunks) {
		Object ret;
		threadcache tc = new threadcache();
		int mymspace;
		ModernizedCProgram.GetThreadCache(p, tc, mymspace, elemsize);
		do {
			mstate m = ModernizedCProgram.GetMSpace((p), (tc), (mymspace), (elemsno * elemsize));
			ret = /*Error: Function owner not recognized*/mspace_independent_calloc(m, elemsno, elemsize, chunks);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win32_release_lock(m.getMutex());
		} while (0);
		return ret;
	}
	public Object nedpindependent_comalloc(Object elems, Object[] sizes, Object chunks) {
		Object ret;
		threadcache tc = new threadcache();
		int mymspace;
		size_t i = new size_t();
		size_t adjustedsizes = (size_t)/*Error: Function owner not recognized*/__builtin_alloca((elems * /*Error: Unsupported expression*/));
		if (!adjustedsizes) {
			return 0;
		} 
		for (i = 0; i < elems; i++) {
			adjustedsizes[i] = sizes[i] < /*Error: Unsupported expression*/ ? /*Error: Unsupported expression*/ : sizes[i];
		}
		ModernizedCProgram.GetThreadCache(p, tc, mymspace, 0);
		do {
			mstate m = ModernizedCProgram.GetMSpace((p), (tc), (mymspace), (false));
			ret = /*Error: Function owner not recognized*/mspace_independent_comalloc(m, elems, adjustedsizes, chunks);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win32_release_lock(m.getMutex());
		} while (0);
		return ret;
	}
	public win32_mlock_t getMutex() {
		return mutex;
	}
	public void setMutex(win32_mlock_t newMutex) {
		mutex = newMutex;
	}
	public Object getUservalue() {
		return uservalue;
	}
	public void setUservalue(Object newUservalue) {
		uservalue = newUservalue;
	}
	public int getThreads() {
		return threads;
	}
	public void setThreads(int newThreads) {
		threads = newThreads;
	}
	public Object getCaches() {
		return caches;
	}
	public void setCaches(Object newCaches) {
		caches = newCaches;
	}
	public Object getMycache() {
		return mycache;
	}
	public void setMycache(Object newMycache) {
		mycache = newMycache;
	}
	public Object getM() {
		return m;
	}
	public void setM(Object newM) {
		m = newM;
	}
}
