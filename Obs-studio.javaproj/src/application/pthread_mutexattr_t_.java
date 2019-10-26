package application;

public class pthread_mutexattr_t_ {
	private int pshared;
	private int kind;
	private int robustness;
	
	public pthread_mutexattr_t_(int pshared, int kind, int robustness) {
		setPshared(pshared);
		setKind(kind);
		setRobustness(robustness);
	}
	public pthread_mutexattr_t_() {
	}
	
	public int getPshared() {
		return pshared;
	}
	public void setPshared(int newPshared) {
		pshared = newPshared;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int newKind) {
		kind = newKind;
	}
	public int getRobustness() {
		return robustness;
	}
	public void setRobustness(int newRobustness) {
		robustness = newRobustness;
	}
}
