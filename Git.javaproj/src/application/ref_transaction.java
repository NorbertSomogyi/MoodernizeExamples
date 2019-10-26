package application;

public class ref_transaction {
	private ref_store ref_store;
	private ref_update updates;
	private Object alloc;
	private Object nr;
	private ref_transaction_state state;
	private Object backend_data;
	
	public ref_transaction(ref_store ref_store, ref_update updates, Object alloc, Object nr, ref_transaction_state state, Object backend_data) {
		setRef_store(ref_store);
		setUpdates(updates);
		setAlloc(alloc);
		setNr(nr);
		setState(state);
		setBackend_data(backend_data);
	}
	public ref_transaction() {
	}
	
	public void update_refs_stdin() {
		strbuf input = new strbuf(, , );
		byte next;
		if (input.strbuf_read(0, 1000) < 0) {
			ModernizedCProgram.die_errno("could not read from stdin");
		} 
		byte generatedBuf = input.getBuf();
		next = generatedBuf;
		Object generatedLen = input.getLen();
		while (next < generatedBuf + generatedLen) {
			if (next == ModernizedCProgram.line_termination) {
				ModernizedCProgram.die("empty command in input");
			}  else if (((ModernizedCProgram.sane_ctype[(byte)(next)] & (true)) != 0)) {
				ModernizedCProgram.die("whitespace before command: %s", next);
			}  else if (ModernizedCProgram.skip_prefix(next, "update ", next)) {
				next = ModernizedCProgram.parse_cmd_update(ModernizedCProgram.transaction, input, next);
			}  else if (ModernizedCProgram.skip_prefix(next, "create ", next)) {
				next = ModernizedCProgram.parse_cmd_create(ModernizedCProgram.transaction, input, next);
			}  else if (ModernizedCProgram.skip_prefix(next, "delete ", next)) {
				next = ModernizedCProgram.parse_cmd_delete(ModernizedCProgram.transaction, input, next);
			}  else if (ModernizedCProgram.skip_prefix(next, "verify ", next)) {
				next = ModernizedCProgram.parse_cmd_verify(ModernizedCProgram.transaction, input, next);
			}  else if (ModernizedCProgram.skip_prefix(next, "option ", next)) {
				next = input.parse_cmd_option(next);
			} else {
					ModernizedCProgram.die("unknown command: %s", next);
			} 
			next++;
		}
		input.strbuf_release();
	}
	public ref_transaction ref_store_transaction_begin(ref_store refs, strbuf err) {
		ref_transaction tr = new ref_transaction();
		((err) ? (Object)0 : ._assert("err", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\refs.c", 1077));
		tr = ModernizedCProgram.xcalloc(1, );
		tr.setRef_transaction(refs);
		return tr;
	}
	public ref_transaction ref_transaction_begin(strbuf err) {
		ref_store ref_store = new ref_store();
		ref_transaction ref_transaction = new ref_transaction();
		return ref_transaction.ref_store_transaction_begin(ref_store.get_main_ref_store(ModernizedCProgram.the_repository), err);
	}
	public void ref_transaction_free() {
		size_t i = new size_t();
		if (!ModernizedCProgram.transaction) {
			return ;
		} 
		switch (ModernizedCProgram.transaction.getRef_transaction()) {
		case REF_TRANSACTION_OPEN:
		case REF_TRANSACTION_PREPARED:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\refs.c", 1102, "free called on a prepared reference transaction");
				break;
		case REF_TRANSACTION_CLOSED/* OK */:
				break;
		default:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\refs.c", 1105, "unexpected reference transaction state");
				break;
		}
		for (i = 0; i < ModernizedCProgram.transaction.getRef_transaction(); i++) {
			ModernizedCProgram.free(ModernizedCProgram.transaction.getRef_transaction()[i].getMsg());
			ModernizedCProgram.free(ModernizedCProgram.transaction.getRef_transaction()[i]);
		}
		ModernizedCProgram.free(ModernizedCProgram.transaction.getRef_transaction());
		ModernizedCProgram.free(ModernizedCProgram.transaction);
	}
	public ref_store getRef_store() {
		return ref_store;
	}
	public void setRef_store(ref_store newRef_store) {
		ref_store = newRef_store;
	}
	public ref_update getUpdates() {
		return updates;
	}
	public void setUpdates(ref_update newUpdates) {
		updates = newUpdates;
	}
	public Object getAlloc() {
		return alloc;
	}
	public void setAlloc(Object newAlloc) {
		alloc = newAlloc;
	}
	public Object getNr() {
		return nr;
	}
	public void setNr(Object newNr) {
		nr = newNr;
	}
	public ref_transaction_state getState() {
		return state;
	}
	public void setState(ref_transaction_state newState) {
		state = newState;
	}
	public Object getBackend_data() {
		return backend_data;
	}
	public void setBackend_data(Object newBackend_data) {
		backend_data = newBackend_data;
	}
}
/*
 * Data structures and functions for the internal use of the refs
 * module. Code outside of the refs module should use only the public
 * functions defined in "refs.h", and should *not* include this file.
 */
/*
 * The following flags can appear in `ref_update::flags`. Their
 * numerical values must not conflict with those of REF_NO_DEREF and
 * REF_FORCE_CREATE_REFLOG, which are also stored in
 * `ref_update::flags`.
 */
/*
 * The reference should be updated to new_oid.
 */
