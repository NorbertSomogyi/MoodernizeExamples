package application;

public class xdlgroup {
	private long start;
	private long end;
	
	public xdlgroup(long start, long end) {
		setStart(start);
		setEnd(end);
	}
	public xdlgroup() {
	}
	
	public long getStart() {
		return start;
	}
	public void setStart(long newStart) {
		start = newStart;
	}
	public long getEnd() {
		return end;
	}
	public void setEnd(long newEnd) {
		end = newEnd;
	}
}
/*
	 * The index of the first changed line in the group, or the index of
	 * the unchanged line above which the (empty) group is located.
	 */
