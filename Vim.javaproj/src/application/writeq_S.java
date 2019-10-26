package application;

public class writeq_S {
	private growarray wq_ga;
	private writeq_S wq_next;
	private writeq_S wq_prev;
	
	public writeq_S(growarray wq_ga, writeq_S wq_next, writeq_S wq_prev) {
		setWq_ga(wq_ga);
		setWq_next(wq_next);
		setWq_prev(wq_prev);
	}
	public writeq_S() {
	}
	
	public growarray getWq_ga() {
		return wq_ga;
	}
	public void setWq_ga(growarray newWq_ga) {
		wq_ga = newWq_ga;
	}
	public writeq_S getWq_next() {
		return wq_next;
	}
	public void setWq_next(writeq_S newWq_next) {
		wq_next = newWq_next;
	}
	public writeq_S getWq_prev() {
		return wq_prev;
	}
	public void setWq_prev(writeq_S newWq_prev) {
		wq_prev = newWq_prev;
	}
}
