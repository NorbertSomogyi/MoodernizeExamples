package application;

public class pthread_rwlock_t_ {
	private Object mtxExclusiveAccess;
	private Object mtxSharedAccessCompleted;
	private Object cndSharedAccessCompleted;
	private int nSharedAccessCount;
	private int nExclusiveAccessCount;
	private int nCompletedSharedAccessCount;
	private int nMagic;
	
	public pthread_rwlock_t_(Object mtxExclusiveAccess, Object mtxSharedAccessCompleted, Object cndSharedAccessCompleted, int nSharedAccessCount, int nExclusiveAccessCount, int nCompletedSharedAccessCount, int nMagic) {
		setMtxExclusiveAccess(mtxExclusiveAccess);
		setMtxSharedAccessCompleted(mtxSharedAccessCompleted);
		setCndSharedAccessCompleted(cndSharedAccessCompleted);
		setNSharedAccessCount(nSharedAccessCount);
		setNExclusiveAccessCount(nExclusiveAccessCount);
		setNCompletedSharedAccessCount(nCompletedSharedAccessCount);
		setNMagic(nMagic);
	}
	public pthread_rwlock_t_() {
	}
	
	public Object getMtxExclusiveAccess() {
		return mtxExclusiveAccess;
	}
	public void setMtxExclusiveAccess(Object newMtxExclusiveAccess) {
		mtxExclusiveAccess = newMtxExclusiveAccess;
	}
	public Object getMtxSharedAccessCompleted() {
		return mtxSharedAccessCompleted;
	}
	public void setMtxSharedAccessCompleted(Object newMtxSharedAccessCompleted) {
		mtxSharedAccessCompleted = newMtxSharedAccessCompleted;
	}
	public Object getCndSharedAccessCompleted() {
		return cndSharedAccessCompleted;
	}
	public void setCndSharedAccessCompleted(Object newCndSharedAccessCompleted) {
		cndSharedAccessCompleted = newCndSharedAccessCompleted;
	}
	public int getNSharedAccessCount() {
		return nSharedAccessCount;
	}
	public void setNSharedAccessCount(int newNSharedAccessCount) {
		nSharedAccessCount = newNSharedAccessCount;
	}
	public int getNExclusiveAccessCount() {
		return nExclusiveAccessCount;
	}
	public void setNExclusiveAccessCount(int newNExclusiveAccessCount) {
		nExclusiveAccessCount = newNExclusiveAccessCount;
	}
	public int getNCompletedSharedAccessCount() {
		return nCompletedSharedAccessCount;
	}
	public void setNCompletedSharedAccessCount(int newNCompletedSharedAccessCount) {
		nCompletedSharedAccessCount = newNCompletedSharedAccessCount;
	}
	public int getNMagic() {
		return nMagic;
	}
	public void setNMagic(int newNMagic) {
		nMagic = newNMagic;
	}
}
