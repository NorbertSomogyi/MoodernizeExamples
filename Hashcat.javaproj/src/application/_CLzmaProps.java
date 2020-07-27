package application;

/* LzmaDec.h -- LZMA Decoder
2018-04-21 : Igor Pavlov : Public domain */
/* #define _LZMA_PROB32 */
/* _LZMA_PROB32 can increase the speed on some CPUs,
   but memory usage for CLzmaDec::probs will be doubled in that case */
/* ---------- LZMA Properties ---------- */
public class _CLzmaProps {
	private Object lc;
	private Object lp;
	private Object pb;
	private Object _pad_;
	private Object dicSize;
	
	public _CLzmaProps(Object lc, Object lp, Object pb, Object _pad_, Object dicSize) {
		setLc(lc);
		setLp(lp);
		setPb(pb);
		set_pad_(_pad_);
		setDicSize(dicSize);
	}
	public _CLzmaProps() {
	}
	
	public Object LzmaProps_Decode(Object[] data, int size) {
		UInt32 dicSize = new UInt32();
		Byte d = new Byte();
		if (size < 5) {
			return 4;
		} else {
				dicSize = data[1] | ((UInt32)data[2] << 8) | ((UInt32)data[3] << 16) | ((UInt32)data[4] << 24);
		} 
		if (dicSize < (1 << 12)) {
			dicSize = (1 << 12);
		} 
		this.setDicSize(dicSize);
		d = data[0];
		if (d >= (9 * 5 * 5)) {
			return 4;
		} 
		this.setLc((Byte)(d % 9));
		d /= 9;
		this.setPb((Byte)(d / 5));
		this.setLp((Byte)(d % 5));
		return 0;
	}
	public Object getLc() {
		return lc;
	}
	public void setLc(Object newLc) {
		lc = newLc;
	}
	public Object getLp() {
		return lp;
	}
	public void setLp(Object newLp) {
		lp = newLp;
	}
	public Object getPb() {
		return pb;
	}
	public void setPb(Object newPb) {
		pb = newPb;
	}
	public Object get_pad_() {
		return _pad_;
	}
	public void set_pad_(Object new_pad_) {
		_pad_ = new_pad_;
	}
	public Object getDicSize() {
		return dicSize;
	}
	public void setDicSize(Object newDicSize) {
		dicSize = newDicSize;
	}
}
