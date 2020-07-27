package application;

public class ref_update {
	private object_id new_oid;
	private object_id old_oid;
	private int flags;
	private Object backend_data;
	private int type;
	private Byte msg;
	private ref_update parent_update;
	private Object refname;
	
	public ref_update(object_id new_oid, object_id old_oid, int flags, Object backend_data, int type, Byte msg, ref_update parent_update, Object refname) {
		setNew_oid(new_oid);
		setOld_oid(old_oid);
		setFlags(flags);
		setBackend_data(backend_data);
		setType(type);
		setMsg(msg);
		setParent_update(parent_update);
		setRefname(refname);
	}
	public ref_update() {
	}
	
	public Object original_update_refname() {
		ref_update generatedParent_update = this.getParent_update();
		while (generatedParent_update) {
			update = generatedParent_update;
		}
		Object generatedRefname = this.getRefname();
		return generatedRefname;
	}
	public ref_update ref_transaction_add_update(ref_transaction transaction, Object refname, int flags, Object new_oid, Object old_oid, Object msg) {
		ref_update update = new ref_update();
		Object generatedRef_transaction = transaction.getRef_transaction();
		if (generatedRef_transaction != REF_TRANSACTION_OPEN) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\refs.c", 1127, "update called for transaction that is not open");
		} 
		Object generatedRef_update = ((update)).getRef_update();
		do {
			size_t flex_array_len_ = (/*Error: Function owner not recognized*/strlen(refname));
			((update)) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((/*Error: sizeof expression not supported yet*/), (flex_array_len_)), (true)));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((Object)generatedRef_update, ((refname)), flex_array_len_);
		} while (0);
		do {
			if ((generatedRef_transaction + 1) > generatedRef_transaction) {
				if ((((generatedRef_transaction) + 16) * 3 / 2) < (generatedRef_transaction + 1)) {
					transaction.setRef_transaction((generatedRef_transaction + 1));
				} else {
						transaction.setRef_transaction((((generatedRef_transaction) + 16) * 3 / 2));
				} 
				(generatedRef_transaction) = ModernizedCProgram.xrealloc((generatedRef_transaction), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedRef_transaction)));
			} 
		} while (0);
		generatedRef_transaction[generatedRef_transaction++] = update;
		update.setRef_update(flags);
		if (flags & REF_HAVE_NEW) {
			generatedRef_update.oidcpy(new_oid);
		} 
		if (flags & REF_HAVE_OLD) {
			generatedRef_update.oidcpy(old_oid);
		} 
		update.setRef_update(ModernizedCProgram.xstrdup_or_null(msg));
		return update;
	}
	public object_id getNew_oid() {
		return new_oid;
	}
	public void setNew_oid(object_id newNew_oid) {
		new_oid = newNew_oid;
	}
	public object_id getOld_oid() {
		return old_oid;
	}
	public void setOld_oid(object_id newOld_oid) {
		old_oid = newOld_oid;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object getBackend_data() {
		return backend_data;
	}
	public void setBackend_data(Object newBackend_data) {
		backend_data = newBackend_data;
	}
	public int getType() {
		return type;
	}
	public void setType(int newType) {
		type = newType;
	}
	public Byte getMsg() {
		return msg;
	}
	public void setMsg(Byte newMsg) {
		msg = newMsg;
	}
	public ref_update getParent_update() {
		return parent_update;
	}
	public void setParent_update(ref_update newParent_update) {
		parent_update = newParent_update;
	}
	public Object getRefname() {
		return refname;
	}
	public void setRefname(Object newRefname) {
		refname = newRefname;
	}
}
/*
	 * If (flags & REF_HAVE_NEW), set the reference to this value
	 * (or delete it, if `new_oid` is `null_oid`).
	 */
