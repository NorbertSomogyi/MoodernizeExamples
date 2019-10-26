package application;

// used for STAR, PLUS and BRACE_SIMPLE matching
public class regstar_S {
	private int nextb;
	private int nextb_ic;
	private long count;
	private long minval;
	private long maxval;
	
	public regstar_S(int nextb, int nextb_ic, long count, long minval, long maxval) {
		setNextb(nextb);
		setNextb_ic(nextb_ic);
		setCount(count);
		setMinval(minval);
		setMaxval(maxval);
	}
	public regstar_S() {
	}
	
	public int getNextb() {
		return nextb;
	}
	public void setNextb(int newNextb) {
		nextb = newNextb;
	}
	public int getNextb_ic() {
		return nextb_ic;
	}
	public void setNextb_ic(int newNextb_ic) {
		nextb_ic = newNextb_ic;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long newCount) {
		count = newCount;
	}
	public long getMinval() {
		return minval;
	}
	public void setMinval(long newMinval) {
		minval = newMinval;
	}
	public long getMaxval() {
		return maxval;
	}
	public void setMaxval(long newMaxval) {
		maxval = newMaxval;
	}
}
