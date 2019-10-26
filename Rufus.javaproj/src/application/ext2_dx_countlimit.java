package application;

public class ext2_dx_countlimit {
	private Object limit;
	private Object count;
	
	public ext2_dx_countlimit(Object limit, Object count) {
		setLimit(limit);
		setCount(count);
	}
	public ext2_dx_countlimit() {
	}
	
	public Object getLimit() {
		return limit;
	}
	public void setLimit(Object newLimit) {
		limit = newLimit;
	}
	public Object getCount() {
		return count;
	}
	public void setCount(Object newCount) {
		count = newCount;
	}
}
