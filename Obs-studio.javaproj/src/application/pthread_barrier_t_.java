package application;

public class pthread_barrier_t_ {
	private int nCurrentBarrierHeight;
	private int nInitialBarrierHeight;
	private int pshared;
	private Object semBarrierBreeched;
	private Object lock;
	private ptw32_mcs_node_t_ proxynode;
	
	public pthread_barrier_t_(int nCurrentBarrierHeight, int nInitialBarrierHeight, int pshared, Object semBarrierBreeched, Object lock, ptw32_mcs_node_t_ proxynode) {
		setNCurrentBarrierHeight(nCurrentBarrierHeight);
		setNInitialBarrierHeight(nInitialBarrierHeight);
		setPshared(pshared);
		setSemBarrierBreeched(semBarrierBreeched);
		setLock(lock);
		setProxynode(proxynode);
	}
	public pthread_barrier_t_() {
	}
	
	public int getNCurrentBarrierHeight() {
		return nCurrentBarrierHeight;
	}
	public void setNCurrentBarrierHeight(int newNCurrentBarrierHeight) {
		nCurrentBarrierHeight = newNCurrentBarrierHeight;
	}
	public int getNInitialBarrierHeight() {
		return nInitialBarrierHeight;
	}
	public void setNInitialBarrierHeight(int newNInitialBarrierHeight) {
		nInitialBarrierHeight = newNInitialBarrierHeight;
	}
	public int getPshared() {
		return pshared;
	}
	public void setPshared(int newPshared) {
		pshared = newPshared;
	}
	public Object getSemBarrierBreeched() {
		return semBarrierBreeched;
	}
	public void setSemBarrierBreeched(Object newSemBarrierBreeched) {
		semBarrierBreeched = newSemBarrierBreeched;
	}
	public Object getLock() {
		return lock;
	}
	public void setLock(Object newLock) {
		lock = newLock;
	}
	public ptw32_mcs_node_t_ getProxynode() {
		return proxynode;
	}
	public void setProxynode(ptw32_mcs_node_t_ newProxynode) {
		proxynode = newProxynode;
	}
}
