package application;

public class region {
	private int begin1;
	private int end1;
	private int begin2;
	private int end2;
	
	public region(int begin1, int end1, int begin2, int end2) {
		setBegin1(begin1);
		setEnd1(end1);
		setBegin2(begin2);
		setEnd2(end2);
	}
	public region() {
	}
	
	public int getBegin1() {
		return begin1;
	}
	public void setBegin1(int newBegin1) {
		begin1 = newBegin1;
	}
	public int getEnd1() {
		return end1;
	}
	public void setEnd1(int newEnd1) {
		end1 = newEnd1;
	}
	public int getBegin2() {
		return begin2;
	}
	public void setBegin2(int newBegin2) {
		begin2 = newBegin2;
	}
	public int getEnd2() {
		return end2;
	}
	public void setEnd2(int newEnd2) {
		end2 = newEnd2;
	}
}
