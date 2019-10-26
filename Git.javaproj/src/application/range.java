package application;

public class range {
	private long start;
	private long end;
	
	public range(long start, long end) {
		setStart(start);
		setEnd(end);
	}
	public range() {
	}
	
	public int ranges_overlap(range b) {
		long generatedEnd = this.getEnd();
		long generatedStart = b.getStart();
		return !(generatedEnd <= generatedStart || generatedEnd <= generatedStart);
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
