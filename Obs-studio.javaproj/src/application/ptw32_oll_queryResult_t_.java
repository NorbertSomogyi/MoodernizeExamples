package application;

public class ptw32_oll_queryResult_t_ {
	private Object nonZero;
	private Object open;
	
	public ptw32_oll_queryResult_t_(Object nonZero, Object open) {
		setNonZero(nonZero);
		setOpen(open);
	}
	public ptw32_oll_queryResult_t_() {
	}
	
	public ptw32_oll_queryResult_t_ ptw32_oll_Query(ptw32_oll_csnzi_t_ csnziPtr) {
		ptw32_oll_queryResult_t query = new ptw32_oll_queryResult_t();
		ptw32_oll_snziRoot_t_ generatedProxyRoot = csnziPtr.getProxyRoot();
		ptw32_oll_snziRoot_t proxy = generatedProxyRoot;
		ptw32_oll_counter_t_ generatedCounter = proxy.getCounter();
		Object generatedInternal = generatedCounter.getInternal();
		query.setNonZero((generatedInternal.getCount() > 0));
		query.setOpen((generatedInternal.getState() == .ptw32_oll_snziRoot_open));
		return query/*
		 * Returns whether the Arrive operation that returned
		 * the ticket succeeded.
		 */;
	}
	public Object getNonZero() {
		return nonZero;
	}
	public void setNonZero(Object newNonZero) {
		nonZero = newNonZero;
	}
	public Object getOpen() {
		return open;
	}
	public void setOpen(Object newOpen) {
		open = newOpen;
	}
}
