package application;

/* this structure is at the root of the linked list, and tracks statistics */
public class mem_zone {
	private mem_item first;
	private Object total;
	private Object highwater;
	private Object limit;
	private int notlifo;
	private int rogue;
	
	public mem_zone(mem_item first, Object total, Object highwater, Object limit, int notlifo, int rogue) {
		setFirst(first);
		setTotal(total);
		setHighwater(highwater);
		setLimit(limit);
		setNotlifo(notlifo);
		setRogue(rogue);
	}
	public mem_zone() {
	}
	
	public mem_item getFirst() {
		return first;
	}
	public void setFirst(mem_item newFirst) {
		first = newFirst;
	}
	public Object getTotal() {
		return total;
	}
	public void setTotal(Object newTotal) {
		total = newTotal;
	}
	public Object getHighwater() {
		return highwater;
	}
	public void setHighwater(Object newHighwater) {
		highwater = newHighwater;
	}
	public Object getLimit() {
		return limit;
	}
	public void setLimit(Object newLimit) {
		limit = newLimit;
	}
	public int getNotlifo() {
		return notlifo;
	}
	public void setNotlifo(int newNotlifo) {
		notlifo = newNotlifo;
	}
	public int getRogue() {
		return rogue;
	}
	public void setRogue(int newRogue) {
		rogue = newRogue;
	}
}
