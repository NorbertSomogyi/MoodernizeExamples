package application;

public class old_mutexattr_t_ {
	private int pshared;
	
	public old_mutexattr_t_(int pshared) {
		setPshared(pshared);
	}
	public old_mutexattr_t_() {
	}
	
	public int getPshared() {
		return pshared;
	}
	public void setPshared(int newPshared) {
		pshared = newPshared;
	}
}
