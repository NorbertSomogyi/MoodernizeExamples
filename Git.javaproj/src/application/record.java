package application;

public class record {
	private int ptr;
	private int cnt;
	private record next;
	
	public record(int ptr, int cnt, record next) {
		setPtr(ptr);
		setCnt(cnt);
		setNext(next);
	}
	public record() {
	}
	
	public int getPtr() {
		return ptr;
	}
	public void setPtr(int newPtr) {
		ptr = newPtr;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int newCnt) {
		cnt = newCnt;
	}
	public record getNext() {
		return next;
	}
	public void setNext(record newNext) {
		next = newNext;
	}
}
