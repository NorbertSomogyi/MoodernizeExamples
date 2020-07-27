package application;

public class ref_storage_be {
	private ref_storage_be next;
	private Object name;
	private Object init;
	private Object init_db;
	private Object transaction_prepare;
	private Object transaction_finish;
	private Object transaction_abort;
	private Object initial_transaction_commit;
	private Object pack_refs;
	private Object create_symref;
	private Object delete_refs;
	private Object rename_ref;
	private Object copy_ref;
	private Object iterator_begin;
	private Object read_raw_ref;
	private Object reflog_iterator_begin;
	private Object for_each_reflog_ent;
	private Object for_each_reflog_ent_reverse;
	private Object reflog_exists;
	private Object create_reflog;
	private Object delete_reflog;
	private Object reflog_expire;
	
	public ref_storage_be(ref_storage_be next, Object name, Object init, Object init_db, Object transaction_prepare, Object transaction_finish, Object transaction_abort, Object initial_transaction_commit, Object pack_refs, Object create_symref, Object delete_refs, Object rename_ref, Object copy_ref, Object iterator_begin, Object read_raw_ref, Object reflog_iterator_begin, Object for_each_reflog_ent, Object for_each_reflog_ent_reverse, Object reflog_exists, Object create_reflog, Object delete_reflog, Object reflog_expire) {
		setNext(next);
		setName(name);
		setInit(init);
		setInit_db(init_db);
		setTransaction_prepare(transaction_prepare);
		setTransaction_finish(transaction_finish);
		setTransaction_abort(transaction_abort);
		setInitial_transaction_commit(initial_transaction_commit);
		setPack_refs(pack_refs);
		setCreate_symref(create_symref);
		setDelete_refs(delete_refs);
		setRename_ref(rename_ref);
		setCopy_ref(copy_ref);
		setIterator_begin(iterator_begin);
		setRead_raw_ref(read_raw_ref);
		setReflog_iterator_begin(reflog_iterator_begin);
		setFor_each_reflog_ent(for_each_reflog_ent);
		setFor_each_reflog_ent_reverse(for_each_reflog_ent_reverse);
		setReflog_exists(reflog_exists);
		setCreate_reflog(create_reflog);
		setDelete_reflog(delete_reflog);
		setReflog_expire(reflog_expire);
	}
	public ref_storage_be() {
	}
	
	public ref_storage_be find_ref_storage_backend(Object name) {
		ref_storage_be be = new ref_storage_be();
		Object generatedRef_storage_be = be.getRef_storage_be();
		for (be = ModernizedCProgram.refs_backends; be; be = generatedRef_storage_be) {
			if (!/*Error: Function owner not recognized*/strcmp(generatedRef_storage_be, name)) {
				return be;
			} 
		}
		return ((Object)0);
	}
	public ref_storage_be getNext() {
		return next;
	}
	public void setNext(ref_storage_be newNext) {
		next = newNext;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getInit() {
		return init;
	}
	public void setInit(Object newInit) {
		init = newInit;
	}
	public Object getInit_db() {
		return init_db;
	}
	public void setInit_db(Object newInit_db) {
		init_db = newInit_db;
	}
	public Object getTransaction_prepare() {
		return transaction_prepare;
	}
	public void setTransaction_prepare(Object newTransaction_prepare) {
		transaction_prepare = newTransaction_prepare;
	}
	public Object getTransaction_finish() {
		return transaction_finish;
	}
	public void setTransaction_finish(Object newTransaction_finish) {
		transaction_finish = newTransaction_finish;
	}
	public Object getTransaction_abort() {
		return transaction_abort;
	}
	public void setTransaction_abort(Object newTransaction_abort) {
		transaction_abort = newTransaction_abort;
	}
	public Object getInitial_transaction_commit() {
		return initial_transaction_commit;
	}
	public void setInitial_transaction_commit(Object newInitial_transaction_commit) {
		initial_transaction_commit = newInitial_transaction_commit;
	}
	public Object getPack_refs() {
		return pack_refs;
	}
	public void setPack_refs(Object newPack_refs) {
		pack_refs = newPack_refs;
	}
	public Object getCreate_symref() {
		return create_symref;
	}
	public void setCreate_symref(Object newCreate_symref) {
		create_symref = newCreate_symref;
	}
	public Object getDelete_refs() {
		return delete_refs;
	}
	public void setDelete_refs(Object newDelete_refs) {
		delete_refs = newDelete_refs;
	}
	public Object getRename_ref() {
		return rename_ref;
	}
	public void setRename_ref(Object newRename_ref) {
		rename_ref = newRename_ref;
	}
	public Object getCopy_ref() {
		return copy_ref;
	}
	public void setCopy_ref(Object newCopy_ref) {
		copy_ref = newCopy_ref;
	}
	public Object getIterator_begin() {
		return iterator_begin;
	}
	public void setIterator_begin(Object newIterator_begin) {
		iterator_begin = newIterator_begin;
	}
	public Object getRead_raw_ref() {
		return read_raw_ref;
	}
	public void setRead_raw_ref(Object newRead_raw_ref) {
		read_raw_ref = newRead_raw_ref;
	}
	public Object getReflog_iterator_begin() {
		return reflog_iterator_begin;
	}
	public void setReflog_iterator_begin(Object newReflog_iterator_begin) {
		reflog_iterator_begin = newReflog_iterator_begin;
	}
	public Object getFor_each_reflog_ent() {
		return for_each_reflog_ent;
	}
	public void setFor_each_reflog_ent(Object newFor_each_reflog_ent) {
		for_each_reflog_ent = newFor_each_reflog_ent;
	}
	public Object getFor_each_reflog_ent_reverse() {
		return for_each_reflog_ent_reverse;
	}
	public void setFor_each_reflog_ent_reverse(Object newFor_each_reflog_ent_reverse) {
		for_each_reflog_ent_reverse = newFor_each_reflog_ent_reverse;
	}
	public Object getReflog_exists() {
		return reflog_exists;
	}
	public void setReflog_exists(Object newReflog_exists) {
		reflog_exists = newReflog_exists;
	}
	public Object getCreate_reflog() {
		return create_reflog;
	}
	public void setCreate_reflog(Object newCreate_reflog) {
		create_reflog = newCreate_reflog;
	}
	public Object getDelete_reflog() {
		return delete_reflog;
	}
	public void setDelete_reflog(Object newDelete_reflog) {
		delete_reflog = newDelete_reflog;
	}
	public Object getReflog_expire() {
		return reflog_expire;
	}
	public void setReflog_expire(Object newReflog_expire) {
		reflog_expire = newReflog_expire;
	}
}
/*
 * A representation of the reference store for the main repository or
 * a submodule. The ref_store instances for submodules are kept in a
 * linked list.
 */
/*
 * Fill in the generic part of refs and add it to our collection of
 * reference stores.
 */
/* REFS_REFS_INTERNAL_H */
