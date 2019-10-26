package application;

public class ref_array_item {
	private object_id objectname;
	private int flag;
	private int kind;
	private Object symref;
	private commit commit;
	private atom_value value;
	private Object refname;
	
	public ref_array_item(object_id objectname, int flag, int kind, Object symref, commit commit, atom_value value, Object refname) {
		setObjectname(objectname);
		setFlag(flag);
		setKind(kind);
		setSymref(symref);
		setCommit(commit);
		setValue(value);
		setRefname(refname);
	}
	public ref_array_item() {
	}
	
	public ref_array_item new_ref_array_item(Object refname, Object oid) {
		ref_array_item ref = new ref_array_item();
		Object generatedRefname = ((ref)).getRefname();
		do {
			size_t flex_array_len_ = (.strlen(refname));
			((ref)) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
			.memcpy((Object)generatedRefname, ((refname)), flex_array_len_);
		} while (0);
		object_id generatedObjectname = ref.getObjectname();
		generatedObjectname.oidcpy(oid);
		return ref;
	}
	public ref_array_item ref_array_push(ref_array array, Object refname, Object oid) {
		ref_array_item ref_array_item = new ref_array_item();
		ref_array_item ref = ref_array_item.new_ref_array_item(refname, oid);
		int generatedNr = array.getNr();
		int generatedAlloc = array.getAlloc();
		ref_array_item generatedItems = array.getItems();
		do {
			if ((generatedNr + 1) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNr + 1)) {
					array.setAlloc((generatedNr + 1));
				} else {
						array.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedItems) = ModernizedCProgram.xrealloc((generatedItems), ModernizedCProgram.st_mult(, (generatedAlloc)));
			} 
		} while (0);
		generatedItems[generatedNr++] = ref;
		return ref;
	}
	/*  Free memory allocated for a ref_array_item */
	public void free_array_item() {
		Object generatedSymref = this.getSymref();
		ModernizedCProgram.free((byte)generatedSymref);
		atom_value generatedValue = this.getValue();
		if (generatedValue) {
			int i;
			for (i = 0; i < ModernizedCProgram.used_atom_cnt; i++) {
				ModernizedCProgram.free((byte)generatedValue[i].getS());
			}
			ModernizedCProgram.free(generatedValue);
		} 
		ModernizedCProgram.free(item);
	}
	public void show_ref_array_item(Object format) {
		strbuf final_buf = new strbuf(, , );
		strbuf error_buf = new strbuf(, , );
		byte generatedBuf = error_buf.getBuf();
		if (ModernizedCProgram.format_ref_array_item(info, format, final_buf, error_buf)) {
			ModernizedCProgram.die("%s", generatedBuf);
		} 
		Object generatedLen = final_buf.getLen();
		.fwrite(generatedBuf, 1, generatedLen, (_iob[1]));
		error_buf.strbuf_release();
		final_buf.strbuf_release();
		.putchar((byte)'\n');
	}
	public object_id getObjectname() {
		return objectname;
	}
	public void setObjectname(object_id newObjectname) {
		objectname = newObjectname;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int newFlag) {
		flag = newFlag;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int newKind) {
		kind = newKind;
	}
	public Object getSymref() {
		return symref;
	}
	public void setSymref(Object newSymref) {
		symref = newSymref;
	}
	public commit getCommit() {
		return commit;
	}
	public void setCommit(commit newCommit) {
		commit = newCommit;
	}
	public atom_value getValue() {
		return value;
	}
	public void setValue(atom_value newValue) {
		value = newValue;
	}
	public Object getRefname() {
		return refname;
	}
	public void setRefname(Object newRefname) {
		refname = newRefname;
	}
}
