package application;

public class notes_tree {
	private int_node root;
	private non_note first_non_note;
	private non_note prev_non_note;
	private Byte ref;
	private byte update_ref;
	private Object combine_notes;
	private int initialized;
	private int dirty;
	
	public notes_tree(int_node root, non_note first_non_note, non_note prev_non_note, Byte ref, byte update_ref, Object combine_notes, int initialized, int dirty) {
		setRoot(root);
		setFirst_non_note(first_non_note);
		setPrev_non_note(prev_non_note);
		setRef(ref);
		setUpdate_ref(update_ref);
		setCombine_notes(combine_notes);
		setInitialized(initialized);
		setDirty(dirty);
	}
	public notes_tree() {
	}
	
	public notes_tree init_notes_check(Object subcommand, int flags) {
		notes_tree t = new notes_tree();
		byte ref;
		.init_notes(((Object)0), ((Object)0), ((Object)0), flags);
		t = default_notes_tree;
		byte generatedUpdate_ref = t.getUpdate_ref();
		Byte generatedRef = t.getRef();
		ref = (flags & 2) ? generatedUpdate_ref : generatedRef;
		if (!ModernizedCProgram.starts_with(ref, "refs/notes/"/*
				 * TRANSLATORS: the first %s will be replaced by a git
				 * notes command: 'add', 'merge', 'remove', etc.
				 */)) {
			ModernizedCProgram.die(ModernizedCProgram._("refusing to %s notes in %s (outside of refs/notes/)"), subcommand, ref);
		} 
		return t;
	}
	public int remove_one_note(Object name, int flag) {
		int status;
		object_id oid = new object_id();
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, name, oid)) {
			return ();
		} 
		Object generatedHash = oid.getHash();
		status = .remove_note(t, generatedHash);
		if (status) {
			.fprintf((_iob[2]), ModernizedCProgram._("Object %s has no note\n"), name);
		} else {
				.fprintf((_iob[2]), ModernizedCProgram._("Removing note for object %s\n"), name);
		} 
		return (flag & 1) ? 0 : status;
	}
	public int_node getRoot() {
		return root;
	}
	public void setRoot(int_node newRoot) {
		root = newRoot;
	}
	public non_note getFirst_non_note() {
		return first_non_note;
	}
	public void setFirst_non_note(non_note newFirst_non_note) {
		first_non_note = newFirst_non_note;
	}
	public non_note getPrev_non_note() {
		return prev_non_note;
	}
	public void setPrev_non_note(non_note newPrev_non_note) {
		prev_non_note = newPrev_non_note;
	}
	public Byte getRef() {
		return ref;
	}
	public void setRef(Byte newRef) {
		ref = newRef;
	}
	public byte getUpdate_ref() {
		return update_ref;
	}
	public void setUpdate_ref(byte newUpdate_ref) {
		update_ref = newUpdate_ref;
	}
	public Object getCombine_notes() {
		return combine_notes;
	}
	public void setCombine_notes(Object newCombine_notes) {
		combine_notes = newCombine_notes;
	}
	public int getInitialized() {
		return initialized;
	}
	public void setInitialized(int newInitialized) {
		initialized = newInitialized;
	}
	public int getDirty() {
		return dirty;
	}
	public void setDirty(int newDirty) {
		dirty = newDirty;
	}
}
/*
 * Add all refs that match 'glob' to the 'list'.
 */
