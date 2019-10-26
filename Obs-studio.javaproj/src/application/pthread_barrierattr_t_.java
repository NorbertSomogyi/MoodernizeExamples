package application;

public class pthread_barrierattr_t_ {
	private int pshared;
	
	public pthread_barrierattr_t_(int pshared) {
		setPshared(pshared);
	}
	public pthread_barrierattr_t_() {
	}
	
	public int getPshared() {
		return pshared;
	}
	public void setPshared(int newPshared) {
		pshared = newPshared;
	}
}
