package application;

/*
 * LZMA2 decoder
 *
 * Authors: Lasse Collin <lasse.collin@tukaani.org>
 *          Igor Pavlov <http://7-zip.org/>
 *
 * This file has been put into the public domain.
 * You can do whatever you want with this file.
 */
/*
 * Range decoder initialization eats the first five bytes of each LZMA chunk.
 */
/*
 * Minimum number of usable input buffer to safely decode one LZMA symbol.
 * The worst case is that we decode 22 bits using probabilities and 26
 * direct bits. This may decode at maximum of 20 bytes of input. However,
 * lzma_main() does an extra normalization before returning, thus we
 * need to put 21 here.
 */
/*
 * Dictionary (history buffer)
 *
 * These are always true:
 *    start <= pos <= full <= end
 *    pos <= limit <= end
 *
 * In multi-call mode, also these are true:
 *    end == size
 *    size <= size_max
 *    allocated <= size
 *
 * Most of these variables are size_t to support single-call mode,
 * in which the dictionary variables address the actual output
 * buffer directly.
 */
public class dictionary {
	private Object buf;
	private Object start;
	private Object pos;
	private Object full;
	private Object limit;
	private Object end;
	private Object size;
	private Object size_max;
	private Object allocated;
	private xz_mode mode;
	
	public dictionary(Object buf, Object start, Object pos, Object full, Object limit, Object end, Object size, Object size_max, Object allocated, xz_mode mode) {
		setBuf(buf);
		setStart(start);
		setPos(pos);
		setFull(full);
		setLimit(limit);
		setEnd(end);
		setSize(size);
		setSize_max(size_max);
		setAllocated(allocated);
		setMode(mode);
	}
	public dictionary() {
	}
	
	/* Set dictionary write limit */
	public void dict_limit(Object out_max) {
		Object generatedEnd = this.getEnd();
		Object generatedPos = this.getPos();
		if (generatedEnd - generatedPos <= out_max) {
			this.setLimit(generatedEnd);
		} else {
				this.setLimit(generatedPos + out_max);
		} 
	}
	public void dict_put(Object byte) {
		Object generatedBuf = this.getBuf();
		Object generatedPos = this.getPos();
		generatedBuf[generatedPos++] = byte;
		Object generatedFull = this.getFull();
		if (generatedFull < generatedPos) {
			this.setFull(generatedPos);
		} 
	}
	public boolean dict_repeat(Object len, Object dist) {
		size_t back = new size_t();
		uint32_t left = new uint32_t();
		Object generatedFull = this.getFull();
		Object generatedSize = this.getSize();
		if (dist >= generatedFull || dist >= generatedSize) {
			return 0;
		} 
		Object generatedLimit = this.getLimit();
		Object generatedPos = this.getPos();
		left = (uint32_t)((generatedLimit - generatedPos) < (len) ? (generatedLimit - generatedPos) : (len));
		len -= left;
		back = generatedPos - dist - 1;
		Object generatedEnd = this.getEnd();
		if (dist >= generatedPos) {
			back += generatedEnd;
		} 
		Object generatedBuf = this.getBuf();
		do {
			generatedBuf[generatedPos++] = generatedBuf[back++];
			if (back == generatedEnd) {
				back = 0;
			} 
		} while (--left > 0);
		if (generatedFull < generatedPos) {
			this.setFull(generatedPos);
		} 
		return 1;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
	public Object getStart() {
		return start;
	}
	public void setStart(Object newStart) {
		start = newStart;
	}
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public Object getFull() {
		return full;
	}
	public void setFull(Object newFull) {
		full = newFull;
	}
	public Object getLimit() {
		return limit;
	}
	public void setLimit(Object newLimit) {
		limit = newLimit;
	}
	public Object getEnd() {
		return end;
	}
	public void setEnd(Object newEnd) {
		end = newEnd;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getSize_max() {
		return size_max;
	}
	public void setSize_max(Object newSize_max) {
		size_max = newSize_max;
	}
	public Object getAllocated() {
		return allocated;
	}
	public void setAllocated(Object newAllocated) {
		allocated = newAllocated;
	}
	public xz_mode getMode() {
		return mode;
	}
	public void setMode(xz_mode newMode) {
		mode = newMode;
	}
}
/* Beginning of the history buffer */
