package application;

/*
 * An entry on the bitmap index, representing the bitmap for a given
 * commit.
 */
public class stored_bitmap {
	private object_id oid;
	private ewah_bitmap root;
	private stored_bitmap xor;
	private int flags;
	
	public stored_bitmap(object_id oid, ewah_bitmap root, stored_bitmap xor, int flags) {
		setOid(oid);
		setRoot(root);
		setXor(xor);
		setFlags(flags);
	}
	public stored_bitmap() {
	}
	
	public stored_bitmap store_bitmap(bitmap_index index, ewah_bitmap root, Object hash, int flags) {
		stored_bitmap stored = new stored_bitmap();
		khiter_t hash_pos = new khiter_t();
		int ret;
		stored = ModernizedCProgram.xmalloc();
		stored.setRoot(root);
		stored.setXor(xor_with);
		stored.setFlags(flags);
		object_id generatedOid = stored.getOid();
		generatedOid.oidread(hash);
		 generatedBitmaps = index.getBitmaps();
		hash_pos = ModernizedCProgram.kh_put_oid_map(generatedBitmaps, generatedOid, ret/* a 0 return code means the insertion succeeded with no changes,
			 * because the SHA1 already existed on the map. this is bad, there
			 * shouldn't be duplicated commits in the index */);
		if (ret == 0) {
			();
			return ((Object)0);
		} 
		Object generatedVals = (generatedBitmaps).getVals();
		(generatedVals[hash_pos]) = stored;
		return stored;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public ewah_bitmap getRoot() {
		return root;
	}
	public void setRoot(ewah_bitmap newRoot) {
		root = newRoot;
	}
	public stored_bitmap getXor() {
		return xor;
	}
	public void setXor(stored_bitmap newXor) {
		xor = newXor;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
