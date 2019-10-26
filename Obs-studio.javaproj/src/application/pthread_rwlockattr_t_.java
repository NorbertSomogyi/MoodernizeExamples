package application;

public class pthread_rwlockattr_t_ {
	private int pshared;
	
	public pthread_rwlockattr_t_(int pshared) {
		setPshared(pshared);
	}
	public pthread_rwlockattr_t_() {
	}
	
	public int getPshared() {
		return pshared;
	}
	public void setPshared(int newPshared) {
		pshared = newPshared;
	}
}
