package application;

public class sigaction {
	private Object sa_handler;
	private int sa_flags;
	
	public sigaction(Object sa_handler, int sa_flags) {
		setSa_handler(sa_handler);
		setSa_flags(sa_flags);
	}
	public sigaction() {
	}
	
	public Object getSa_handler() {
		return sa_handler;
	}
	public void setSa_handler(Object newSa_handler) {
		sa_handler = newSa_handler;
	}
	public int getSa_flags() {
		return sa_flags;
	}
	public void setSa_flags(int newSa_flags) {
		sa_flags = newSa_flags;
	}
}
