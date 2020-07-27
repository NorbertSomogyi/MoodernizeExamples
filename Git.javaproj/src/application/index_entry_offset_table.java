package application;

public class index_entry_offset_table {
	private int nr;
	private Object entries;
	
	public index_entry_offset_table(int nr, Object entries) {
		setNr(nr);
		setEntries(entries);
	}
	public index_entry_offset_table() {
	}
	
	public index_entry_offset_table read_ieot_extension(Object mmap, Object mmap_size, Object offset) {
		byte index = ((Object)0);
		uint32_t extsize = new uint32_t();
		uint32_t ext_version = new uint32_t();
		index_entry_offset_table ieot = new index_entry_offset_table();
		int i;
		int nr;
		if (!/* find the IEOT extension */offset) {
			return ((Object)0);
		} 
		while (offset <= mmap_size - ModernizedCProgram.the_repository.getHash_algo().getRawsz() - 8) {
			extsize = /*Error: Function owner not recognized*/get_be32(mmap + offset + 4);
			if ((((mmap + offset)[0] << 24) | ((mmap + offset)[1] << 16) | ((mmap + offset)[2] << 8) | ((mmap + offset)[3])) == -1024) {
				index = mmap + offset + 4 + 4;
				break;
			} 
			offset += 8;
			offset += extsize;
		}
		if (!index) {
			return ((Object)0);
		} 
		ext_version = /*Error: Function owner not recognized*/get_be32(/* validate the version is IEOT_VERSION */index);
		if (ext_version != (true)) {
			();
			return ((Object)0);
		} 
		index += /*Error: Unsupported expression*/;
		nr = (extsize - /*Error: Unsupported expression*/) / (/*Error: Unsupported expression*/ + /*Error: Unsupported expression*//* extension size - version bytes / bytes per entry */);
		if (!nr) {
			();
			return ((Object)0);
		} 
		ieot = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/ + (nr * /*Error: Unsupported expression*/));
		ieot.setNr(nr);
		Object generatedEntries = ieot.getEntries();
		for (i = 0; i < nr; i++) {
			generatedEntries[i].setOffset(/*Error: Function owner not recognized*/get_be32(index));
			index += /*Error: Unsupported expression*/;
			generatedEntries[i].setNr(/*Error: Function owner not recognized*/get_be32(index));
			index += /*Error: Unsupported expression*/;
		}
		return ieot;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public Object getEntries() {
		return entries;
	}
	public void setEntries(Object newEntries) {
		entries = newEntries;
	}
}
