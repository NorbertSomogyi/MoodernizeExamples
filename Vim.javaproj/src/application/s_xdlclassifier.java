package application;

public class s_xdlclassifier {
	private int hbits;
	private long hsize;
	private s_xdlclass[][] rchash;
	private s_chastore ncha;
	private s_xdlclass[][] rcrecs;
	private long alloc;
	private long count;
	private long flags;
	
	public s_xdlclassifier(int hbits, long hsize, s_xdlclass[][] rchash, s_chastore ncha, s_xdlclass[][] rcrecs, long alloc, long count, long flags) {
		setHbits(hbits);
		setHsize(hsize);
		setRchash(rchash);
		setNcha(ncha);
		setRcrecs(rcrecs);
		setAlloc(alloc);
		setCount(count);
		setFlags(flags);
	}
	public s_xdlclassifier() {
	}
	
	public int xdl_init_classifier(long size, long flags) {
		this.setFlags(flags);
		this.setHbits(ModernizedCProgram.xdl_hashbits((int)size));
		int generatedHbits = this.getHbits();
		this.setHsize(1 << generatedHbits);
		s_chastore generatedNcha = this.getNcha();
		if (generatedNcha.xdl_cha_init(/*Error: Unsupported expression*/, size / 4 + 1) < 0) {
			return -1;
		} 
		long generatedHsize = this.getHsize();
		if (!(this.setRchash((xdlclass_t)ModernizedCProgram.lalloc((generatedHsize * /*Error: Unsupported expression*/), 1)))) {
			generatedNcha.xdl_cha_free();
			return -1;
		} 
		s_xdlclass[][] generatedRchash = this.getRchash();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedRchash, 0, generatedHsize * /*Error: Unsupported expression*/);
		this.setAlloc(size);
		long generatedAlloc = this.getAlloc();
		if (!(this.setRcrecs((xdlclass_t)ModernizedCProgram.lalloc((generatedAlloc * /*Error: Unsupported expression*/), 1)))) {
			ModernizedCProgram.vim_free(generatedRchash);
			generatedNcha.xdl_cha_free();
			return -1;
		} 
		this.setCount(0);
		return 0;
	}
	public void xdl_free_classifier() {
		s_xdlclass[][] generatedRcrecs = this.getRcrecs();
		ModernizedCProgram.vim_free(generatedRcrecs);
		s_xdlclass[][] generatedRchash = this.getRchash();
		ModernizedCProgram.vim_free(generatedRchash);
		s_chastore generatedNcha = this.getNcha();
		generatedNcha.xdl_cha_free();
	}
	public int getHbits() {
		return hbits;
	}
	public void setHbits(int newHbits) {
		hbits = newHbits;
	}
	public long getHsize() {
		return hsize;
	}
	public void setHsize(long newHsize) {
		hsize = newHsize;
	}
	public s_xdlclass[][] getRchash() {
		return rchash;
	}
	public void setRchash(s_xdlclass[][] newRchash) {
		rchash = newRchash;
	}
	public s_chastore getNcha() {
		return ncha;
	}
	public void setNcha(s_chastore newNcha) {
		ncha = newNcha;
	}
	public s_xdlclass[][] getRcrecs() {
		return rcrecs;
	}
	public void setRcrecs(s_xdlclass[][] newRcrecs) {
		rcrecs = newRcrecs;
	}
	public long getAlloc() {
		return alloc;
	}
	public void setAlloc(long newAlloc) {
		alloc = newAlloc;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long newCount) {
		count = newCount;
	}
	public long getFlags() {
		return flags;
	}
	public void setFlags(long newFlags) {
		flags = newFlags;
	}
}
