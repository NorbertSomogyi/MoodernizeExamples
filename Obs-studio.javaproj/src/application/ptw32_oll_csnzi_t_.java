package application;

public class ptw32_oll_csnzi_t_ {
	private ptw32_oll_snziRoot_t_ proxyRoot;
	private Object leafs;
	
	public ptw32_oll_csnzi_t_(ptw32_oll_snziRoot_t_ proxyRoot, Object leafs) {
		setProxyRoot(proxyRoot);
		setLeafs(leafs);
	}
	public ptw32_oll_csnzi_t_() {
	}
	
	public void ptw32_oll_Open() {
		this.setProxyRoot(ModernizedCProgram.ptw32_oll_snziRoot_openAndZero/*
		 * Opens a C-SNZI object while atomically performing count
		 * arrivals. Requires C-SNZI state to be CLOSED and
		 * the surplus to be zero.
		 */);
	}
	public void ptw32_oll_OpenWithArrivals(Object count, Object close) {
		ptw32_oll_snziRoot_t_ generatedProxyRoot = this.getProxyRoot();
		ptw32_oll_counter_t_ generatedCounter = generatedProxyRoot.getCounter();
		Object generatedInternal = generatedCounter.getInternal();
		generatedInternal.setCount(count);
		generatedInternal.setState((close ? .ptw32_oll_snziRoot_closed : .ptw32_oll_snziRoot_open/*
		 * Closes a C-SNZI object. Returns true iff the C-SNZI
		 * state changed from OPEN to CLOSED and the surplus is
		 * zero.
		 */));
	}
	public Object ptw32_oll_Close() {
		ptw32_oll_snziRoot_t newProxy = new ptw32_oll_snziRoot_t();
		ptw32_oll_snziRoot_t oldProxy = new ptw32_oll_snziRoot_t();
		ptw32_oll_counter_t_ generatedCounter = oldProxy.getCounter();
		Object generatedWord = generatedCounter.getWord();
		ptw32_oll_snziRoot_t_ generatedProxyRoot = this.getProxyRoot();
		Object generatedInternal = generatedCounter.getInternal();
		do {
			oldProxy = generatedProxyRoot;
			if (generatedInternal.getState() != .ptw32_oll_snziRoot_open) {
				return .PTW32_FALSE;
			} 
			newProxy = oldProxy;
			generatedInternal.setState(.ptw32_oll_snziRoot_closed);
		} while (/*Error: Unsupported expression*/ != (size_t)generatedWord);
		return (generatedWord == generatedWord);
	}
	public Object ptw32_oll_CloseIfEmpty() {
		ptw32_oll_snziRoot_t newProxy = new ptw32_oll_snziRoot_t();
		ptw32_oll_snziRoot_t oldProxy = new ptw32_oll_snziRoot_t();
		ptw32_oll_counter_t_ generatedCounter = oldProxy.getCounter();
		Object generatedWord = generatedCounter.getWord();
		ptw32_oll_snziRoot_t_ generatedProxyRoot = this.getProxyRoot();
		do {
			oldProxy = generatedProxyRoot;
			if (generatedWord != generatedWord) {
				return .PTW32_FALSE;
			} 
			newProxy = ModernizedCProgram.ptw32_oll_snziRoot_closedAndZero;
		} while (/*Error: Unsupported expression*/ != (size_t)generatedWord);
		return .PTW32_TRUE/*
		 * Returns whether the C-SNZI has a nonzero surplus and
		 * whether the C-SNZI is open.
		 * "nonZero" doesn't appear to be used anywhere in the algorithms.
		 */;
	}
	public ptw32_oll_snziRoot_t_ getProxyRoot() {
		return proxyRoot;
	}
	public void setProxyRoot(ptw32_oll_snziRoot_t_ newProxyRoot) {
		proxyRoot = newProxyRoot;
	}
	public Object getLeafs() {
		return leafs;
	}
	public void setLeafs(Object newLeafs) {
		leafs = newLeafs;
	}
}
