package application;

public class join_S {
	private Object s;
	private Object tofree;
	
	public join_S(Object s, Object tofree) {
		setS(s);
		setTofree(tofree);
	}
	public join_S() {
	}
	
	public Object getS() {
		return s;
	}
	public void setS(Object newS) {
		s = newS;
	}
	public Object getTofree() {
		return tofree;
	}
	public void setTofree(Object newTofree) {
		tofree = newTofree;
	}
}
