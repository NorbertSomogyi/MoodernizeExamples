package application;

public class _NVENC_EXTERNAL_ME_HINT_COUNTS_PER_BLOCKTYPE {
	private Object numCandsPerBlk16x16;
	private Object numCandsPerBlk16x8;
	private Object numCandsPerBlk8x16;
	private Object numCandsPerBlk8x8;
	private Object reserved;
	private Object reserved1;
	
	public _NVENC_EXTERNAL_ME_HINT_COUNTS_PER_BLOCKTYPE(Object numCandsPerBlk16x16, Object numCandsPerBlk16x8, Object numCandsPerBlk8x16, Object numCandsPerBlk8x8, Object reserved, Object reserved1) {
		setNumCandsPerBlk16x16(numCandsPerBlk16x16);
		setNumCandsPerBlk16x8(numCandsPerBlk16x8);
		setNumCandsPerBlk8x16(numCandsPerBlk8x16);
		setNumCandsPerBlk8x8(numCandsPerBlk8x8);
		setReserved(reserved);
		setReserved1(reserved1);
	}
	public _NVENC_EXTERNAL_ME_HINT_COUNTS_PER_BLOCKTYPE() {
	}
	
	public Object getNumCandsPerBlk16x16() {
		return numCandsPerBlk16x16;
	}
	public void setNumCandsPerBlk16x16(Object newNumCandsPerBlk16x16) {
		numCandsPerBlk16x16 = newNumCandsPerBlk16x16;
	}
	public Object getNumCandsPerBlk16x8() {
		return numCandsPerBlk16x8;
	}
	public void setNumCandsPerBlk16x8(Object newNumCandsPerBlk16x8) {
		numCandsPerBlk16x8 = newNumCandsPerBlk16x8;
	}
	public Object getNumCandsPerBlk8x16() {
		return numCandsPerBlk8x16;
	}
	public void setNumCandsPerBlk8x16(Object newNumCandsPerBlk8x16) {
		numCandsPerBlk8x16 = newNumCandsPerBlk8x16;
	}
	public Object getNumCandsPerBlk8x8() {
		return numCandsPerBlk8x8;
	}
	public void setNumCandsPerBlk8x8(Object newNumCandsPerBlk8x8) {
		numCandsPerBlk8x8 = newNumCandsPerBlk8x8;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getReserved1() {
		return reserved1;
	}
	public void setReserved1(Object newReserved1) {
		reserved1 = newReserved1;
	}
}
