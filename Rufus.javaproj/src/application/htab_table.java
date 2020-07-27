package application;

public class htab_table {
	private htab_entry[] table;
	private Object size;
	private Object filled;
	
	public htab_table(htab_entry[] table, Object size, Object filled) {
		setTable(table);
		setSize(size);
		setFilled(filled);
	}
	public htab_table() {
	}
	
	public Object htab_create(Object nel) {
		if (htab == ((Object)0)) {
			return 0;
		} 
		htab_entry[] generatedTable = this.getTable();
		if (generatedTable != ((Object)0)) {
			ModernizedCProgram._uprintf("warning: htab_create() was called with a non empty table");
			return 0;
		} 
		// Change nel to the first prime number not smaller as nel.// Change nel to the first prime number not smaller as nel.nel |=  1;
		while (!ModernizedCProgram.isprime(nel)) {
			nel += 2;
		}
		this.setSize(nel);
		this.setFilled(0);
		Object generatedSize = this.getSize();
		// allocate memory and zero out.// allocate memory and zero out.this.setTable((htab_entry)/*Error: Function owner not recognized*/calloc(generatedSize + 1, /*Error: Unsupported expression*/));
		if (generatedTable == ((Object)0)) {
			ModernizedCProgram._uprintf("could not allocate space for hash table\n");
			return 0;
		} 
		return 1;
	}
	/* After using the hash table it has to be destroyed.  */
	public void htab_destroy() {
		size_t i = new size_t();
		htab_entry[] generatedTable = this.getTable();
		if ((htab == ((Object)0)) || (generatedTable == ((Object)0))) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedSize = this.getSize();
		for (i = 0; i < generatedSize + 1; i++) {
			if (generatedTable[i].getUsed()) {
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)generatedTable[i].getStr());
					generatedTable[i].setStr(((Object)0));
				} while (0);
			} 
		}
		this.setFilled(0);
		this.setSize(0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)generatedTable);
			this.setTable(((Object)0));
		} while (0);
		this.setTable(((Object)0/*
		 * This is the search function. It uses double hashing with open addressing.
		 * We use a trick to speed up the lookup. The table is created with one
		 * more element available. This enables us to use the index zero special.
		 * This index will never be used because we store the first hash index in
		 * the field used where zero means not used. Every other value means used.
		 * The used field can be used as a first fast comparison for equality of
		 * the stored and the parameter value. This helps to prevent unnecessary
		 * expensive calls of strcmp.
		 */));
	}
	public Object htab_hash(Byte str) {
		uint32_t hval = new uint32_t();
		uint32_t hval2 = new uint32_t();
		uint32_t idx = new uint32_t();
		uint32_t r = 0;
		int c;
		byte sz = str;
		htab_entry[] generatedTable = this.getTable();
		if ((htab == ((Object)0)) || (generatedTable == ((Object)0)) || (str == ((Object)0))) {
			return 0;
		} 
		// shown to produce half the collisions as djb2's).// See http://www.cse.yorku.ca/~oz/hash.htmlwhile ((c = sz++) != 0) {
			r = c + (r << 6) + (r << 16) - r;
		}
		if (r == 0) {
			++r;
		} 
		Object generatedSize = this.getSize();
		// compute table hash: simply take the modulus// compute table hash: simply take the modulushval = r % generatedSize;
		if (hval == 0) {
			++hval;
		} 
		// Try the first index// Try the first indexidx = hval;
		if (generatedTable[idx].getUsed()) {
			if ((generatedTable[idx].getUsed() == hval) && (/*Error: Function owner not recognized*/strcmp(((str == ((Object)0)) ? "<NULL>" : str), ((generatedTable[idx].getStr() == ((Object)0)) ? "<NULL>" : generatedTable[idx].getStr())) == 0)) {
				return idx;
			} 
			hval2 = 1 + hval % (generatedSize - 2);
			do {
				if (idx <= hval2) {
					idx = ((uint32_t)generatedSize) + idx - hval2;
				} else {
						idx -= hval2;
				} 
				if (idx == hval) {
					break;
				} 
				if ((generatedTable[idx].getUsed() == hval) && (/*Error: Function owner not recognized*/strcmp(((str == ((Object)0)) ? "<NULL>" : str), ((generatedTable[idx].getStr() == ((Object)0)) ? "<NULL>" : generatedTable[idx].getStr())) == 0)) {
					return idx;
				} 
			} while (generatedTable[idx].getUsed());
		} 
		Object generatedFilled = this.getFilled();
		// If the table is full return an errorif (generatedFilled >= generatedSize) {
			ModernizedCProgram._uprintf("hash table is full (%d entries)", generatedSize);
			return 0;
		} 
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)generatedTable[idx].getStr());
			generatedTable[idx].setStr(((Object)0));
		} while (0);
		generatedTable[idx].setUsed(hval);
		generatedTable[idx].setStr((byte)/*Error: Function owner not recognized*/malloc(((((byte)str) == ((Object)0)) ? 0 : /*Error: Function owner not recognized*/strlen(str)) + 1));
		if (generatedTable[idx].getStr() == ((Object)0)) {
			ModernizedCProgram._uprintf("could not duplicate string for hash table\n");
			return 0;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedTable[idx].getStr(), str, ((((byte)str) == ((Object)0)) ? 0 : /*Error: Function owner not recognized*/strlen(str)) + 1);
		++generatedFilled;
		return idx;
	}
	public htab_entry[] getTable() {
		return table;
	}
	public void setTable(htab_entry[] newTable) {
		table = newTable;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getFilled() {
		return filled;
	}
	public void setFilled(Object newFilled) {
		filled = newFilled;
	}
}
