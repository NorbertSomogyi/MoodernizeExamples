package application;

public class _frame_of_nalus_t {
	private Object nalus;
	private int total;
	private int complete_frame;
	
	public _frame_of_nalus_t(Object nalus, int total, int complete_frame) {
		setNalus(nalus);
		setTotal(total);
		setComplete_frame(complete_frame);
	}
	public _frame_of_nalus_t() {
	}
	
	public Object getNalus() {
		return nalus;
	}
	public void setNalus(Object newNalus) {
		nalus = newNalus;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int newTotal) {
		total = newTotal;
	}
	public int getComplete_frame() {
		return complete_frame;
	}
	public void setComplete_frame(int newComplete_frame) {
		complete_frame = newComplete_frame;
	}
}
