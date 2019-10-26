package application;

/* for handling kCoreClassEvent:kOpenDocuments:keyAEPosition typeChar */
public class SelectionRange {
	private int unused1;
	private int lineNum;
	private long startRange;
	private long endRange;
	private long unused2;
	private long theDate;
	
	public SelectionRange(int unused1, int lineNum, long startRange, long endRange, long unused2, long theDate) {
		setUnused1(unused1);
		setLineNum(lineNum);
		setStartRange(startRange);
		setEndRange(endRange);
		setUnused2(unused2);
		setTheDate(theDate);
	}
	public SelectionRange() {
	}
	
	public int getUnused1() {
		return unused1;
	}
	public void setUnused1(int newUnused1) {
		unused1 = newUnused1;
	}
	public int getLineNum() {
		return lineNum;
	}
	public void setLineNum(int newLineNum) {
		lineNum = newLineNum;
	}
	public long getStartRange() {
		return startRange;
	}
	public void setStartRange(long newStartRange) {
		startRange = newStartRange;
	}
	public long getEndRange() {
		return endRange;
	}
	public void setEndRange(long newEndRange) {
		endRange = newEndRange;
	}
	public long getUnused2() {
		return unused2;
	}
	public void setUnused2(long newUnused2) {
		unused2 = newUnused2;
	}
	public long getTheDate() {
		return theDate;
	}
	public void setTheDate(long newTheDate) {
		theDate = newTheDate;
	}
}
