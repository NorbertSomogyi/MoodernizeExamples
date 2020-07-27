package application;

public class decoration {
	private Object name;
	private int size;
	private int nr;
	private decoration_entry[] entries;
	
	public decoration(Object name, int size, int nr, decoration_entry[] entries) {
		setName(name);
		setSize(size);
		setNr(nr);
		setEntries(entries);
	}
	public decoration() {
	}
	
	public Object insert_decoration(Object base, Object decoration) {
		int generatedSize = this.getSize();
		int size = generatedSize;
		decoration_entry[] generatedEntries = this.getEntries();
		decoration_entry entries = generatedEntries;
		int j = ModernizedCProgram.hash_obj(base, size);
		while (entries[j].getBase()) {
			if (entries[j].getBase() == base) {
				Object old = entries[j].getDecoration();
				entries[j].setDecoration(decoration);
				return old;
			} 
			if (++j >= size) {
				j = 0;
			} 
		}
		entries[j].setBase(base);
		entries[j].setDecoration(decoration);
		int generatedNr = this.getNr();
		generatedNr++;
		return ((Object)0);
	}
	public void grow_decoration() {
		int i;
		int generatedSize = this.getSize();
		int old_size = generatedSize;
		decoration_entry[] generatedEntries = this.getEntries();
		decoration_entry old_entries = generatedEntries;
		this.setSize((old_size + 1000) * 3 / 2);
		this.setEntries(ModernizedCProgram.xcalloc(generatedSize, /*Error: Unsupported expression*/));
		this.setNr(0);
		for (i = 0; i < old_size; i++) {
			object base = old_entries[i].getBase();
			Object decoration = old_entries[i].getDecoration();
			if (!decoration) {
				continue;
			} 
			n.insert_decoration(base, decoration);
		}
		ModernizedCProgram.free(old_entries);
	}
	public Object add_decoration(Object obj, Object decoration) {
		int generatedNr = this.getNr();
		int nr = generatedNr + 1;
		int generatedSize = this.getSize();
		if (nr > generatedSize * 2 / 3) {
			n.grow_decoration();
		} 
		return n.insert_decoration(obj, decoration);
	}
	public Object lookup_decoration(Object obj) {
		int j;
		int generatedSize = this.getSize();
		if (!generatedSize) {
			return ((Object)0);
		} 
		j = ModernizedCProgram.hash_obj(obj, generatedSize);
		decoration_entry[] generatedEntries = this.getEntries();
		Object generatedBase = ref.getBase();
		Object generatedDecoration = ref.getDecoration();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			decoration_entry ref = generatedEntries + j;
			if (generatedBase == obj) {
				return generatedDecoration;
			} 
			if (!generatedBase) {
				return ((Object)0);
			} 
			if (++j == generatedSize) {
				j = 0;
			} 
		}
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public decoration_entry[] getEntries() {
		return entries;
	}
	public void setEntries(decoration_entry[] newEntries) {
		entries = newEntries;
	}
}
/*
	 * Not used by the decoration mechanism. Clients may use this for
	 * whatever they want.
	 */
