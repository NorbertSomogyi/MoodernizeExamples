package application;

public class complete_reflogs {
	private Byte ref;
	private Object short_ref;
	private reflog_info[] items;
	private int nr;
	private int alloc;
	
	public complete_reflogs(Byte ref, Object short_ref, reflog_info[] items, int nr, int alloc) {
		setRef(ref);
		setShort_ref(short_ref);
		setItems(items);
		setNr(nr);
		setAlloc(alloc);
	}
	public complete_reflogs() {
	}
	
	public void free_complete_reflog() {
		int i;
		if (!array) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedNr = this.getNr();
		reflog_info[] generatedItems = this.getItems();
		for (i = 0; i < generatedNr; i++) {
			ModernizedCProgram.free(generatedItems[i].getEmail());
			ModernizedCProgram.free(generatedItems[i].getMessage());
		}
		ModernizedCProgram.free(generatedItems);
		Byte generatedRef = this.getRef();
		ModernizedCProgram.free(generatedRef);
		ModernizedCProgram.free(array);
	}
	public complete_reflogs read_complete_reflog(Object ref) {
		complete_reflogs reflogs = ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/);
		reflogs.setRef(ModernizedCProgram.xstrdup(ref));
		ModernizedCProgram.for_each_reflog_ent(ref, read_one_reflog, reflogs);
		int generatedNr = reflogs.getNr();
		if (generatedNr == 0) {
			byte name;
			Object name_to_free;
			name = name_to_free = ((Object)0).resolve_refdup(ref, -1024, ((Object)0));
			if (name) {
				ModernizedCProgram.for_each_reflog_ent(name, read_one_reflog, reflogs);
				ModernizedCProgram.free(name_to_free);
			} 
		} 
		if (generatedNr == 0) {
			byte refname = ModernizedCProgram.xstrfmt("refs/%s", ref);
			ModernizedCProgram.for_each_reflog_ent(refname, read_one_reflog, reflogs);
			if (generatedNr == 0) {
				ModernizedCProgram.free(refname);
				refname = ModernizedCProgram.xstrfmt("refs/heads/%s", ref);
				ModernizedCProgram.for_each_reflog_ent(refname, read_one_reflog, reflogs);
			} 
			ModernizedCProgram.free(refname);
		} 
		return reflogs;
	}
	public int get_reflog_recno_by_time(Object timestamp) {
		int i;
		reflog_info[] generatedItems = this.getItems();
		int generatedNr = this.getNr();
		for (i = generatedNr - 1; i >= 0; i--) {
			if (timestamp >= generatedItems[i].getTimestamp()) {
				return i;
			} 
		}
		return -1;
	}
	public Byte getRef() {
		return ref;
	}
	public void setRef(Byte newRef) {
		ref = newRef;
	}
	public Object getShort_ref() {
		return short_ref;
	}
	public void setShort_ref(Object newShort_ref) {
		short_ref = newShort_ref;
	}
	public reflog_info[] getItems() {
		return items;
	}
	public void setItems(reflog_info[] newItems) {
		items = newItems;
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
}
