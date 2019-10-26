package application;

public class alloc_state {
	private int count;
	private int nr;
	private Object p;
	private Object slabs;
	private int slab_nr;
	private int slab_alloc;
	
	public alloc_state(int count, int nr, Object p, Object slabs, int slab_nr, int slab_alloc) {
		setCount(count);
		setNr(nr);
		setP(p);
		setSlabs(slabs);
		setSlab_nr(slab_nr);
		setSlab_alloc(slab_alloc);
	}
	public alloc_state() {
	}
	
	public alloc_state allocate_alloc_state() {
		return ModernizedCProgram.xcalloc(1, );
	}
	public void clear_alloc_state() {
		int generatedSlab_nr = this.getSlab_nr();
		Object generatedSlabs = this.getSlabs();
		while (generatedSlab_nr > 0) {
			generatedSlab_nr--;
			ModernizedCProgram.free(generatedSlabs[generatedSlab_nr]);
		}
		do {
			ModernizedCProgram.free(generatedSlabs);
			(generatedSlabs) = ((Object)0);
		} while (0);
	}
	public Object alloc_node(Object node_size) {
		Object ret;
		int generatedNr = this.getNr();
		int generatedSlab_nr = this.getSlab_nr();
		int generatedSlab_alloc = this.getSlab_alloc();
		Object generatedSlabs = this.getSlabs();
		Object generatedP = this.getP();
		if (!generatedNr) {
			this.setNr(1024);
			this.setP(ModernizedCProgram.xmalloc(1024 * node_size));
			do {
				if ((generatedSlab_nr + 1) > generatedSlab_alloc) {
					if ((((generatedSlab_alloc) + 16) * 3 / 2) < (generatedSlab_nr + 1)) {
						this.setSlab_alloc((generatedSlab_nr + 1));
					} else {
							this.setSlab_alloc((((generatedSlab_alloc) + 16) * 3 / 2));
					} 
					(generatedSlabs) = ModernizedCProgram.xrealloc((generatedSlabs), ModernizedCProgram.st_mult(, (generatedSlab_alloc)));
				} 
			} while (0);
			generatedSlabs[generatedSlab_nr++] = generatedP;
		} 
		generatedNr--;
		int generatedCount = this.getCount();
		generatedCount++;
		ret = generatedP;
		this.setP((byte)generatedP + node_size);
		.memset(ret, 0, node_size);
		return ret;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public Object getP() {
		return p;
	}
	public void setP(Object newP) {
		p = newP;
	}
	public Object getSlabs() {
		return slabs;
	}
	public void setSlabs(Object newSlabs) {
		slabs = newSlabs;
	}
	public int getSlab_nr() {
		return slab_nr;
	}
	public void setSlab_nr(int newSlab_nr) {
		slab_nr = newSlab_nr;
	}
	public int getSlab_alloc() {
		return slab_alloc;
	}
	public void setSlab_alloc(int newSlab_alloc) {
		slab_alloc = newSlab_alloc;
	}
}
