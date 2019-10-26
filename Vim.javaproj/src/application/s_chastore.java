package application;

public class s_chastore {
	private s_chanode head;
	private s_chanode tail;
	private long isize;
	private long nsize;
	private s_chanode ancur;
	private s_chanode sncur;
	private long scurr;
	
	public s_chastore(s_chanode head, s_chanode tail, long isize, long nsize, s_chanode ancur, s_chanode sncur, long scurr) {
		setHead(head);
		setTail(tail);
		setIsize(isize);
		setNsize(nsize);
		setAncur(ancur);
		setSncur(sncur);
		setScurr(scurr);
	}
	public s_chastore() {
	}
	
	public int xdl_cha_init(long isize, long icount) {
		this.setHead(this.setTail(((Object)0)));
		this.setIsize(isize);
		this.setNsize(icount * isize);
		this.setAncur(this.setSncur(((Object)0)));
		this.setScurr(0);
		return 0;
	}
	public void xdl_cha_free() {
		chanode_t cur = new chanode_t();
		chanode_t tmp = new chanode_t();
		s_chanode generatedNext = cur.getNext();
		s_chanode generatedHead = this.getHead();
		for (cur = generatedHead; (tmp = cur) != ((Object)0); ) {
			cur = generatedNext;
			ModernizedCProgram.vim_free(tmp);
		}
	}
	public Object xdl_cha_alloc() {
		chanode_t ancur = new chanode_t();
		Object data;
		s_chanode generatedAncur = this.getAncur();
		long generatedIcurr = ancur.getIcurr();
		long generatedNsize = this.getNsize();
		s_chanode generatedTail = this.getTail();
		s_chanode generatedHead = this.getHead();
		if (!(ancur = generatedAncur) || generatedIcurr == generatedNsize) {
			if (!(ancur = (chanode_t)ModernizedCProgram.lalloc(( + generatedNsize), 1))) {
				return ((Object)0);
			} 
			ancur.setIcurr(0);
			ancur.setNext(((Object)0));
			if (generatedTail) {
				generatedTail.setNext(ancur);
			} 
			if (!generatedHead) {
				this.setHead(ancur);
			} 
			this.setTail(ancur);
			this.setAncur(ancur);
		} 
		data = (byte)ancur +  + generatedIcurr;
		long generatedIsize = this.getIsize();
		generatedIcurr += generatedIsize;
		return data;
	}
	public s_chanode getHead() {
		return head;
	}
	public void setHead(s_chanode newHead) {
		head = newHead;
	}
	public s_chanode getTail() {
		return tail;
	}
	public void setTail(s_chanode newTail) {
		tail = newTail;
	}
	public long getIsize() {
		return isize;
	}
	public void setIsize(long newIsize) {
		isize = newIsize;
	}
	public long getNsize() {
		return nsize;
	}
	public void setNsize(long newNsize) {
		nsize = newNsize;
	}
	public s_chanode getAncur() {
		return ancur;
	}
	public void setAncur(s_chanode newAncur) {
		ancur = newAncur;
	}
	public s_chanode getSncur() {
		return sncur;
	}
	public void setSncur(s_chanode newSncur) {
		sncur = newSncur;
	}
	public long getScurr() {
		return scurr;
	}
	public void setScurr(long newScurr) {
		scurr = newScurr;
	}
}
