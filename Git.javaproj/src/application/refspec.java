package application;

public class refspec {
	private refspec_item[] items;
	private int alloc;
	private int nr;
	private Object[][] raw;
	private int raw_alloc;
	private int raw_nr;
	private int fetch;
	
	public refspec(refspec_item[] items, int alloc, int nr, Object[][] raw, int raw_alloc, int raw_nr, int fetch) {
		setItems(items);
		setAlloc(alloc);
		setNr(nr);
		setRaw(raw);
		setRaw_alloc(raw_alloc);
		setRaw_nr(raw_nr);
		setFetch(fetch);
	}
	public refspec() {
	}
	
	public void refspec_init(int fetch) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.rs, 0, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.rs.setFetch(fetch);
	}
	public void refspec_append(Object refspec) {
		refspec_item item = new refspec_item();
		item.refspec_item_init_or_die(refspec, ModernizedCProgram.rs.getFetch());
		do {
			if ((ModernizedCProgram.rs.getNr() + 1) > ModernizedCProgram.rs.getAlloc()) {
				if ((((ModernizedCProgram.rs.getAlloc()) + 16) * 3 / 2) < (ModernizedCProgram.rs.getNr() + 1)) {
					ModernizedCProgram.rs.setAlloc((ModernizedCProgram.rs.getNr() + 1));
				} else {
						ModernizedCProgram.rs.setAlloc((((ModernizedCProgram.rs.getAlloc()) + 16) * 3 / 2));
				} 
				(ModernizedCProgram.rs.getItems()) = ModernizedCProgram.xrealloc((ModernizedCProgram.rs.getItems()), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (ModernizedCProgram.rs.getAlloc())));
			} 
		} while (0);
		ModernizedCProgram.rs.getItems()[ModernizedCProgram.rs.getNr()++] = item;
		do {
			if ((ModernizedCProgram.rs.getRaw_nr() + 1) > ModernizedCProgram.rs.getRaw_alloc()) {
				if ((((ModernizedCProgram.rs.getRaw_alloc()) + 16) * 3 / 2) < (ModernizedCProgram.rs.getRaw_nr() + 1)) {
					ModernizedCProgram.rs.setRaw_alloc((ModernizedCProgram.rs.getRaw_nr() + 1));
				} else {
						ModernizedCProgram.rs.setRaw_alloc((((ModernizedCProgram.rs.getRaw_alloc()) + 16) * 3 / 2));
				} 
				(ModernizedCProgram.rs.getRaw()) = ModernizedCProgram.xrealloc((ModernizedCProgram.rs.getRaw()), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (ModernizedCProgram.rs.getRaw_alloc())));
			} 
		} while (0);
		ModernizedCProgram.rs.getRaw()[ModernizedCProgram.rs.getRaw_nr()++] = ModernizedCProgram.xstrdup(refspec);
	}
	public void refspec_appendn(Object[][] refspecs, int nr) {
		int i;
		for (i = 0; i < nr; i++) {
			ModernizedCProgram.rs.refspec_append(refspecs[i]);
		}
	}
	public void refspec_clear() {
		int i;
		for (i = 0; i < ModernizedCProgram.rs.getNr(); i++) {
			ModernizedCProgram.rs.getItems()[i].refspec_item_clear();
		}
		do {
			ModernizedCProgram.free(ModernizedCProgram.rs.getItems());
			(ModernizedCProgram.rs.getItems()) = ((Object)0);
		} while (0);
		ModernizedCProgram.rs.setAlloc(0);
		ModernizedCProgram.rs.setNr(0);
		for (i = 0; i < ModernizedCProgram.rs.getRaw_nr(); i++) {
			ModernizedCProgram.free((byte)ModernizedCProgram.rs.getRaw()[i]);
		}
		do {
			ModernizedCProgram.free(ModernizedCProgram.rs.getRaw());
			(ModernizedCProgram.rs.getRaw()) = ((Object)0);
		} while (0);
		ModernizedCProgram.rs.setRaw_alloc(0);
		ModernizedCProgram.rs.setRaw_nr(0);
		ModernizedCProgram.rs.setFetch(0);
	}
	public refspec_item[] getItems() {
		return items;
	}
	public void setItems(refspec_item[] newItems) {
		items = newItems;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public Object[][] getRaw() {
		return raw;
	}
	public void setRaw(Object[][] newRaw) {
		raw = newRaw;
	}
	public int getRaw_alloc() {
		return raw_alloc;
	}
	public void setRaw_alloc(int newRaw_alloc) {
		raw_alloc = newRaw_alloc;
	}
	public int getRaw_nr() {
		return raw_nr;
	}
	public void setRaw_nr(int newRaw_nr) {
		raw_nr = newRaw_nr;
	}
	public int getFetch() {
		return fetch;
	}
	public void setFetch(int newFetch) {
		fetch = newFetch;
	}
}
