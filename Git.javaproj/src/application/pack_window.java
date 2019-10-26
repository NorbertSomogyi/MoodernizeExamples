package application;

public class pack_window {
	private pack_window next;
	private Byte base;
	private Object offset;
	private Object len;
	private int last_used;
	private int inuse_cnt;
	
	public pack_window(pack_window next, Byte base, Object offset, Object len, int last_used, int inuse_cnt) {
		setNext(next);
		setBase(base);
		setOffset(offset);
		setLen(len);
		setLast_used(last_used);
		setInuse_cnt(inuse_cnt);
	}
	public pack_window() {
	}
	
	public int in_window(Object offset) {
		Object generatedOffset = this.getOffset();
		off_t win_off = generatedOffset;
		Object generatedLen = this.getLen();
		return win_off <= offset && (offset + ModernizedCProgram.the_repository.getHash_algo().getRawsz()) <= (win_off + generatedLen);
	}
	/* We must promise at least one full hash after the
		 * offset is available from this window, otherwise the offset
		 * is not actually in this window and a different window (which
		 * has that one hash excess) must be used.  This is to support
		 * the object header and delta base parsing routines below.
		 */
	public void unuse_pack() {
		pack_window w = w_cursor;
		int generatedInuse_cnt = w.getInuse_cnt();
		if (w) {
			generatedInuse_cnt--;
			w_cursor = ((Object)0);
		} 
	}
	public pack_window getNext() {
		return next;
	}
	public void setNext(pack_window newNext) {
		next = newNext;
	}
	public Byte getBase() {
		return base;
	}
	public void setBase(Byte newBase) {
		base = newBase;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public int getLast_used() {
		return last_used;
	}
	public void setLast_used(int newLast_used) {
		last_used = newLast_used;
	}
	public int getInuse_cnt() {
		return inuse_cnt;
	}
	public void setInuse_cnt(int newInuse_cnt) {
		inuse_cnt = newInuse_cnt;
	}
}
