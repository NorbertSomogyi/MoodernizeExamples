package application;

public class s_xrecord {
	private s_xrecord next;
	private Object ptr;
	private long size;
	private long ha;
	
	public s_xrecord(s_xrecord next, Object ptr, long size, long ha) {
		setNext(next);
		setPtr(ptr);
		setSize(size);
		setHa(ha);
	}
	public s_xrecord() {
	}
	
	public int cmp_recs(Object xpp, s_xrecord r2) {
		long generatedHa = this.getHa();
		Object generatedPtr = this.getPtr();
		long generatedSize = this.getSize();
		return generatedHa == generatedHa && ModernizedCProgram.xdl_recmatch(generatedPtr, generatedSize, generatedPtr, generatedSize, xpp.getFlags());
	}
	public int recs_match(s_xrecord rec2, long flags) {
		long generatedHa = this.getHa();
		Object generatedPtr = this.getPtr();
		long generatedSize = this.getSize();
		return (generatedHa == generatedHa && ModernizedCProgram.xdl_recmatch(generatedPtr, generatedSize, generatedPtr, generatedSize, flags/*
		 * If a line is indented more than this, xget_indent() just returns this value.
		 * This avoids having to do absurd amounts of work for data that are not
		 * human-readable text, and also ensures that the output of xget_indent fits within
		 * an int.
		 */));
	}
	/*
	 * Return the amount of indentation of the specified line, treating TAB as 8
	 * columns. Return -1 if line is empty or contains only whitespace. Clamp the
	 * output value at MAX_INDENT.
	 */
	public int xget_indent() {
		long i;
		int ret = 0;
		long generatedSize = this.getSize();
		Object generatedPtr = this.getPtr();
		for (i = 0; i < generatedSize; i++) {
			byte c = generatedPtr[i];
			if (!(.isspace((byte)(c)))) {
				return ret;
			}  else if (c == (byte)' ') {
				ret += 1;
			}  else if (c == (byte)'\t') {
				ret += 8 - ret % 8/* ignore other whitespace characters */;
			} 
			if (ret >= 200) {
				return 200;
			} 
		}
		return -/* The line contains only whitespace. */1/*
		 * If more than this number of consecutive blank rows are found, just return this
		 * value. This avoids requiring O(N^2) work for pathological cases, and also
		 * ensures that the output of score_split fits in an int.
		 */;
	}
	public s_xrecord getNext() {
		return next;
	}
	public void setNext(s_xrecord newNext) {
		next = newNext;
	}
	public Object getPtr() {
		return ptr;
	}
	public void setPtr(Object newPtr) {
		ptr = newPtr;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
	public long getHa() {
		return ha;
	}
	public void setHa(long newHa) {
		ha = newHa;
	}
}
