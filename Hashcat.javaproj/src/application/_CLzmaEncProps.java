package application;

/*  LzmaEnc.h -- LZMA Encoder
2017-07-27 : Igor Pavlov : Public domain */
public class _CLzmaEncProps {
	private int level;
	private Object dictSize;
	private int lc;
	private int lp;
	private int pb;
	private int algo;
	private int fb;
	private int btMode;
	private int numHashBytes;
	private Object mc;
	private int writeEndMark;
	private int numThreads;
	private Object reduceSize;
	
	public _CLzmaEncProps(int level, Object dictSize, int lc, int lp, int pb, int algo, int fb, int btMode, int numHashBytes, Object mc, int writeEndMark, int numThreads, Object reduceSize) {
		setLevel(level);
		setDictSize(dictSize);
		setLc(lc);
		setLp(lp);
		setPb(pb);
		setAlgo(algo);
		setFb(fb);
		setBtMode(btMode);
		setNumHashBytes(numHashBytes);
		setMc(mc);
		setWriteEndMark(writeEndMark);
		setNumThreads(numThreads);
		setReduceSize(reduceSize);
	}
	public _CLzmaEncProps() {
	}
	
	/* LzmaEnc.c -- LZMA Encoder
	2019-01-10: Igor Pavlov : Public domain */
	/* #define SHOW_STAT */
	/* #define SHOW_STAT2 */
	/* #define kLzmaMaxHistorySize ((UInt32)7 << 29) */
	public void LzmaEncProps_Init() {
		this.setLevel(5);
		this.setDictSize(this.setMc(0));
		this.setReduceSize((UInt64)(Int64)-1);
		this.setLc(this.setLp(this.setPb(this.setAlgo(this.setFb(this.setBtMode(this.setNumHashBytes(this.setNumThreads(-1))))))));
		this.setWriteEndMark(0);
	}
	public void LzmaEncProps_Normalize() {
		int generatedLevel = this.getLevel();
		int level = generatedLevel;
		if (level < 0) {
			level = 5;
		} 
		this.setLevel(level);
		Object generatedDictSize = this.getDictSize();
		if (generatedDictSize == 0) {
			this.setDictSize((level <= 5 ? (1 << (level * 2 + 14)) : (level <= 7 ? (1 << 25) : (1 << 26))));
		} 
		Object generatedReduceSize = this.getReduceSize();
		if (generatedDictSize > generatedReduceSize) {
			int i;
			UInt32 reduceSize = (UInt32)generatedReduceSize;
			for (i = 11; i <= 30; i++) {
				if (reduceSize <= ((UInt32)2 << i)) {
					this.setDictSize(((UInt32)2 << i));
					break;
				} 
				if (reduceSize <= ((UInt32)3 << i)) {
					this.setDictSize(((UInt32)3 << i));
					break;
				} 
			}
		} 
		int generatedLc = this.getLc();
		if (generatedLc < 0) {
			this.setLc(3);
		} 
		int generatedLp = this.getLp();
		if (generatedLp < 0) {
			this.setLp(0);
		} 
		int generatedPb = this.getPb();
		if (generatedPb < 0) {
			this.setPb(2);
		} 
		int generatedAlgo = this.getAlgo();
		if (generatedAlgo < 0) {
			this.setAlgo((level < 5 ? 0 : 1));
		} 
		int generatedFb = this.getFb();
		if (generatedFb < 0) {
			this.setFb((level < 7 ? 32 : 64));
		} 
		int generatedBtMode = this.getBtMode();
		if (generatedBtMode < 0) {
			this.setBtMode((generatedAlgo == 0 ? 0 : 1));
		} 
		int generatedNumHashBytes = this.getNumHashBytes();
		if (generatedNumHashBytes < 0) {
			this.setNumHashBytes(4);
		} 
		Object generatedMc = this.getMc();
		if (generatedMc == 0) {
			this.setMc((16 + (generatedFb >> 1)) >> (generatedBtMode ? 0 : 1));
		} 
		int generatedNumThreads = this.getNumThreads();
		if (generatedNumThreads < 0) {
			this.setNumThreads(((generatedBtMode && generatedAlgo) ? 2 : 1));
		} 
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int newLevel) {
		level = newLevel;
	}
	public Object getDictSize() {
		return dictSize;
	}
	public void setDictSize(Object newDictSize) {
		dictSize = newDictSize;
	}
	public int getLc() {
		return lc;
	}
	public void setLc(int newLc) {
		lc = newLc;
	}
	public int getLp() {
		return lp;
	}
	public void setLp(int newLp) {
		lp = newLp;
	}
	public int getPb() {
		return pb;
	}
	public void setPb(int newPb) {
		pb = newPb;
	}
	public int getAlgo() {
		return algo;
	}
	public void setAlgo(int newAlgo) {
		algo = newAlgo;
	}
	public int getFb() {
		return fb;
	}
	public void setFb(int newFb) {
		fb = newFb;
	}
	public int getBtMode() {
		return btMode;
	}
	public void setBtMode(int newBtMode) {
		btMode = newBtMode;
	}
	public int getNumHashBytes() {
		return numHashBytes;
	}
	public void setNumHashBytes(int newNumHashBytes) {
		numHashBytes = newNumHashBytes;
	}
	public Object getMc() {
		return mc;
	}
	public void setMc(Object newMc) {
		mc = newMc;
	}
	public int getWriteEndMark() {
		return writeEndMark;
	}
	public void setWriteEndMark(int newWriteEndMark) {
		writeEndMark = newWriteEndMark;
	}
	public int getNumThreads() {
		return numThreads;
	}
	public void setNumThreads(int newNumThreads) {
		numThreads = newNumThreads;
	}
	public Object getReduceSize() {
		return reduceSize;
	}
	public void setReduceSize(Object newReduceSize) {
		reduceSize = newReduceSize;
	}
}
