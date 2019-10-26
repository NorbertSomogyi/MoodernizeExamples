package application;

/* The end-points specified by the end user */
public class rev_cmdline_info {
	private int nr;
	private int alloc;
	private rev_cmdline_entry rev;
	
	public rev_cmdline_info(int nr, int alloc, rev_cmdline_entry rev) {
		setNr(nr);
		setAlloc(alloc);
		setRev(rev);
	}
	public rev_cmdline_info() {
	}
	
	public void get_tags_and_duplicates() {
		int i;
		int generatedNr = this.getNr();
		rev_cmdline_entry generatedRev = this.getRev();
		int generatedFlags = e.getFlags();
		Object generatedName = e.getName();
		commit commit = new commit();
		object generatedItem = e.getItem();
		int generatedType = generatedItem.getType();
		object generatedObject = commit.getObject();
		object_id generatedOid = generatedObject.getOid();
		for (i = 0; i < generatedNr; i++) {
			rev_cmdline_entry e = generatedRev + i;
			object_id oid = new object_id();
			commit commit = new commit();
			byte full_name;
			if (generatedFlags & (-1024 << 1)) {
				continue;
			} 
			if (oid.dwim_ref(generatedName, .strlen(generatedName), full_name) != 1) {
				continue;
			} 
			if (generatedNr) {
				byte private;
				private = .apply_refspecs(ModernizedCProgram.refspecs, full_name);
				if (private) {
					ModernizedCProgram.free(full_name);
					full_name = private;
				} 
			} 
			commit = commit.get_commit(e, full_name);
			if (!commit) {
				ModernizedCProgram.warning("%s: Unexpected object of type %s, skipping.", generatedName, ModernizedCProgram.type_name(generatedType));
				continue;
			} 
			switch (generatedType) {
			case object_type.OBJ_BLOB:
					ModernizedCProgram.export_blob(generatedOid);
					continue;
			case object_type.OBJ_COMMIT:
					break;
			default:
					ModernizedCProgram.warning("Tag points to object of unexpected type %s, skipping.", ModernizedCProgram.type_name(generatedType));
					continue;
			}
			if (generatedType != object_type.OBJ_TAG) {
				ModernizedCProgram.extra_refs.string_list_append(full_name).setUtil(commit);
			} 
			if (!ModernizedCProgram.revision_sources.revision_sources_at(commit)) {
				ModernizedCProgram.revision_sources.revision_sources_at(commit) = full_name;
			} 
		}
		ModernizedCProgram.extra_refs.string_list_sort();
		ModernizedCProgram.extra_refs.string_list_remove_duplicates(0);
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public rev_cmdline_entry getRev() {
		return rev;
	}
	public void setRev(rev_cmdline_entry newRev) {
		rev = newRev;
	}
}
