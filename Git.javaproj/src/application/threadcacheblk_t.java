package application;

public class threadcacheblk_t {
	private int lastUsed;
	private int size;
	private threadcacheblk_t next;
	private threadcacheblk_t prev;
	
	public threadcacheblk_t(int lastUsed, int size, threadcacheblk_t next, threadcacheblk_t prev) {
		setLastUsed(lastUsed);
		setSize(size);
		setNext(next);
		setPrev(prev);
	}
	public threadcacheblk_t() {
	}
	
	public int getLastUsed() {
		return lastUsed;
	}
	public void setLastUsed(int newLastUsed) {
		lastUsed = newLastUsed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
	public threadcacheblk_t getNext() {
		return next;
	}
	public void setNext(threadcacheblk_t newNext) {
		next = newNext;
	}
	public threadcacheblk_t getPrev() {
		return prev;
	}
	public void setPrev(threadcacheblk_t newPrev) {
		prev = newPrev;
	}
}
/* Keep less than 16 bytes on 32 bit systems and 32 bytes on 64 bit systems */
