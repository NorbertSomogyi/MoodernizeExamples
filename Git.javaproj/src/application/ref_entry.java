package application;

public class ref_entry {
	private byte flag;
	private  u;
	private Object name;
	
	public ref_entry(byte flag,  u, Object name) {
		setFlag(flag);
		setU(u);
		setName(name);
	}
	public ref_entry() {
	}
	
	public ref_entry create_ref_entry(Object refname, Object oid, int flag) {
		ref_entry ref = new ref_entry();
		Object generatedName = ((ref)).getName();
		do {
			size_t flex_array_len_ = (/*Error: Function owner not recognized*/strlen(refname));
			((ref)) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((/*Error: sizeof expression not supported yet*/), (flex_array_len_)), (true)));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((Object)generatedName, ((refname)), flex_array_len_);
		} while (0);
		 generatedU = ref.getU();
		Object generatedValue = generatedU.getValue();
		generatedValue.getOid().oidcpy(oid);
		ref.setFlag(flag);
		return ref;
	}
	public void free_ref_entry() {
		byte generatedFlag = this.getFlag();
		 generatedU = this.getU();
		Object generatedSubdir = generatedU.getSubdir();
		if (generatedFlag & -1024/*
				 * Do not use get_ref_dir() here, as that might
				 * trigger the reading of loose refs.
				 */) {
			generatedSubdir.clear_ref_dir();
		} 
		ModernizedCProgram.free(entry);
	}
	public ref_entry create_dir_entry(ref_cache cache, Object dirname, Object len, int incomplete) {
		ref_entry direntry = new ref_entry();
		Object generatedName = (direntry).getName();
		do {
			size_t flex_array_len_ = (len);
			(direntry) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((/*Error: sizeof expression not supported yet*/), (flex_array_len_)), (true)));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((Object)generatedName, (dirname), flex_array_len_);
		} while (0);
		 generatedU = direntry.getU();
		Object generatedSubdir = generatedU.getSubdir();
		generatedSubdir.setCache(cache);
		direntry.setFlag(-1024 | (incomplete ? -1024 : 0));
		return direntry;
	}
	public ref_entry find_ref_entry(ref_dir dir, Object refname) {
		int entry_index;
		ref_entry entry = new ref_entry();
		dir = dir.find_containing_dir(refname, 0);
		if (!dir) {
			return ((Object)0);
		} 
		entry_index = dir.search_ref_dir(refname, /*Error: Function owner not recognized*/strlen(refname));
		if (entry_index == -1) {
			return ((Object)0);
		} 
		ref_entry[][] generatedEntries = dir.getEntries();
		entry = generatedEntries[entry_index];
		byte generatedFlag = entry.getFlag();
		return (generatedFlag & -1024) ? ((Object)0) : entry;
	}
	public byte getFlag() {
		return flag;
	}
	public void setFlag(byte newFlag) {
		flag = newFlag;
	}
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
/*
 * Bit values for ref_entry::flag.  REF_ISSYMREF=0x01,
 * REF_ISPACKED=0x02, REF_ISBROKEN=0x04 and REF_BAD_NAME=0x08 are
 * public values; see refs.h.
 */
/* ref_entry represents a directory of references */
/*
 * Entry has not yet been read from disk (used only for REF_DIR
 * entries representing loose references)
 */
/*
 * A ref_entry represents either a reference or a "subdirectory" of
 * references.
 *
 * Each directory in the reference namespace is represented by a
 * ref_entry with (flags & REF_DIR) set and containing a subdir member
 * that holds the entries in that directory that have been read so
 * far.  If (flags & REF_INCOMPLETE) is set, then the directory and
 * its subdirectories haven't been read yet.  REF_INCOMPLETE is only
 * used for loose reference directories.
 *
 * References are represented by a ref_entry with (flags & REF_DIR)
 * unset and a value member that describes the reference's value.  The
 * flag member is at the ref_entry level, but it is also needed to
 * interpret the contents of the value field (in other words, a
 * ref_value object is not very much use without the enclosing
 * ref_entry).
 *
 * Reference names cannot end with slash and directories' names are
 * always stored with a trailing slash (except for the top-level
 * directory, which is always denoted by "").  This has two nice
 * consequences: (1) when the entries in each subdir are sorted
 * lexicographically by name (as they usually are), the references in
 * a whole tree can be generated in lexicographic order by traversing
 * the tree in left-to-right, depth-first order; (2) the names of
 * references and subdirectories cannot conflict, and therefore the
 * presence of an empty subdirectory does not block the creation of a
 * similarly-named reference.  (The fact that reference names with the
 * same leading components can conflict *with each other* is a
 * separate issue that is regulated by refs_verify_refname_available().)
 *
 * Please note that the name field contains the fully-qualified
 * reference (or subdirectory) name.  Space could be saved by only
 * storing the relative names.  But that would require the full names
 * to be generated on the fly when iterating in do_for_each_ref(), and
 * would break callback functions, who have always been able to assume
 * that the name strings that they are passed will not be freed during
 * the iteration.
 */
/*
 * Start iterating over references in `cache`. If `prefix` is
 * specified, only include references whose names start with that
 * prefix. If `prime_dir` is true, then fill any incomplete
 * directories before beginning the iteration. The output is ordered
 * by refname.
 */
