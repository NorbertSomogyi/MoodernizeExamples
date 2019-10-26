package application;

public class packed_ref_store {
	private ref_store base;
	private int store_flags;
	private Byte path;
	private snapshot snapshot;
	private lock_file lock;
	private tempfile tempfile;
	
	public packed_ref_store(ref_store base, int store_flags, Byte path, snapshot snapshot, lock_file lock, tempfile tempfile) {
		setBase(base);
		setStore_flags(store_flags);
		setPath(path);
		setSnapshot(snapshot);
		setLock(lock);
		setTempfile(tempfile);
	}
	public packed_ref_store() {
	}
	
	public packed_ref_store packed_downcast(ref_store ref_store, int required_flags, Object caller) {
		packed_ref_store refs = new packed_ref_store();
		Object generatedBe = ref_store.getBe();
		if (generatedBe != ModernizedCProgram.refs_be_packed) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\packed-backend.c", 225, "ref_store is type \"%s\" not \"packed\" in %s", generatedBe.getName(), caller);
		} 
		refs = (packed_ref_store)ref_store;
		int generatedStore_flags = refs.getStore_flags();
		if ((generatedStore_flags & required_flags) != required_flags) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\packed-backend.c", 231, "unallowed operation (%s), requires %x, has %x\n", caller, required_flags, generatedStore_flags);
		} 
		return refs;
	}
	public void clear_snapshot() {
		snapshot generatedSnapshot = this.getSnapshot();
		if (generatedSnapshot) {
			snapshot snapshot = generatedSnapshot;
			this.setSnapshot(((Object)0));
			snapshot.release_snapshot();
		} 
	}
	public void validate_snapshot() {
		snapshot generatedSnapshot = this.getSnapshot();
		stat_validity generatedValidity = generatedSnapshot.getValidity();
		Byte generatedPath = this.getPath();
		if (generatedSnapshot && !generatedValidity.stat_validity_check(generatedPath)) {
			refs/*
			 * Get the `snapshot` for the specified packed_ref_store, creating and
			 * populating it if it hasn't been read before or if the file has been
			 * changed (according to its `validity` field) since it was last read.
			 * On the other hand, if we hold the lock, then assume that the file
			 * hasn't been changed out from under us, so skip the extra `stat()`
			 * call in `stat_validity_check()`. This function does *not* increase
			 * the snapshot's reference count on behalf of the caller.
			 */.clear_snapshot();
		} 
	}
	public ref_store getBase() {
		return base;
	}
	public void setBase(ref_store newBase) {
		base = newBase;
	}
	public int getStore_flags() {
		return store_flags;
	}
	public void setStore_flags(int newStore_flags) {
		store_flags = newStore_flags;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public snapshot getSnapshot() {
		return snapshot;
	}
	public void setSnapshot(snapshot newSnapshot) {
		snapshot = newSnapshot;
	}
	public lock_file getLock() {
		return lock;
	}
	public void setLock(lock_file newLock) {
		lock = newLock;
	}
	public tempfile getTempfile() {
		return tempfile;
	}
	public void setTempfile(tempfile newTempfile) {
		tempfile = newTempfile;
	}
}
/*
 * A `snapshot` represents one snapshot of a `packed-refs` file.
 *
 * Normally, this will be a mmapped view of the contents of the
 * `packed-refs` file at the time the snapshot was created. However,
 * if the `packed-refs` file was not sorted, this might point at heap
 * memory holding the contents of the `packed-refs` file with its
 * records sorted by refname.
 *
 * `snapshot` instances are reference counted (via
 * `acquire_snapshot()` and `release_snapshot()`). This is to prevent
 * an instance from disappearing while an iterator is still iterating
 * over it. Instances are garbage collected when their `referrers`
 * count goes to zero.
 *
 * The most recent `snapshot`, if available, is referenced by the
 * `packed_ref_store`. Its freshness is checked whenever
 * `get_snapshot()` is called; if the existing snapshot is obsolete, a
 * new snapshot is taken.
 */
