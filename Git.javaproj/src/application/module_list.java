package application;

public class module_list {
	private Object[][] entries;
	private int alloc;
	private int nr;
	
	public module_list(Object[][] entries, int alloc, int nr) {
		setEntries(entries);
		setAlloc(alloc);
		setNr(nr);
	}
	public module_list() {
	}
	
	public void module_list_active() {
		int i;
		module_list active_modules = new module_list(((Object)0), 0, 0);
		int generatedNr = active_modules.getNr();
		int generatedAlloc = active_modules.getAlloc();
		Object[][] generatedEntries = active_modules.getEntries();
		for (i = 0; i < ModernizedCProgram.list.getNr(); i++) {
			cache_entry ce = ModernizedCProgram.list.getEntries()[i];
			if (!ModernizedCProgram.the_repository.is_submodule_active(ce.getName())) {
				continue;
			} 
			do {
				if ((generatedNr + 1) > generatedAlloc) {
					if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNr + 1)) {
						active_modules.setAlloc((generatedNr + 1));
					} else {
							active_modules.setAlloc((((generatedAlloc) + 16) * 3 / 2));
					} 
					(generatedEntries) = ModernizedCProgram.xrealloc((generatedEntries), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedAlloc)));
				} 
			} while (0);
			generatedEntries[generatedNr++] = ce;
		}
		ModernizedCProgram.free(generatedEntries);
		ModernizedCProgram.list = active_modules;
	}
	public Object[][] getEntries() {
		return entries;
	}
	public void setEntries(Object[][] newEntries) {
		entries = newEntries;
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
}
