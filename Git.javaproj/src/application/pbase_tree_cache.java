package application;

public class pbase_tree_cache {
	private object_id oid;
	private int ref;
	private int temporary;
	private Object tree_data;
	private long tree_size;
	
	public pbase_tree_cache(object_id oid, int ref, int temporary, Object tree_data, long tree_size) {
		setOid(oid);
		setRef(ref);
		setTemporary(temporary);
		setTree_data(tree_data);
		setTree_size(tree_size);
	}
	public pbase_tree_cache() {
	}
	
	public pbase_tree_cache pbase_tree_get(Object oid) {
		pbase_tree_cache ent = new pbase_tree_cache();
		pbase_tree_cache nent = new pbase_tree_cache();
		Object data;
		long size;
		object_type type;
		int neigh;
		int my_ix = ModernizedCProgram.pbase_tree_cache_ix(oid);
		int available_ix = -1/* pbase-tree-cache acts as a limited hashtable.
			 * your object will be found at your index or within a few
			 * slots after that slot if it is cached.
			 */;
		object_id generatedOid = ent.getOid();
		int generatedRef = ent.getRef();
		for (neigh = 0; neigh < 8; neigh++) {
			ent = ModernizedCProgram.pbase_tree_cache[my_ix];
			if (ent && ModernizedCProgram.oideq(generatedOid, oid)) {
				generatedRef++;
				return ent;
			}  else if (((available_ix < 0) && (!ent || !generatedRef)) || ((0 <= available_ix) && (!ent && ModernizedCProgram.pbase_tree_cache[available_ix]))) {
				available_ix = my_ix;
			} 
			if (!ent) {
				break;
			} 
			my_ix = ModernizedCProgram.pbase_tree_cache_ix_incr(my_ix);
		}
		data = ModernizedCProgram.the_repository.repo_read_object_file(oid, object_type.type, /* Did not find one.  Either we got a bogus request or
			 * we need to read and perhaps cache.
			 */size);
		if (!data) {
			return ((Object)0);
		} 
		if (object_type.type != object_type.OBJ_TREE) {
			ModernizedCProgram.free(data);
			return ((Object)0);
		} 
		if (available_ix < /* We need to either cache or return a throwaway copy */0) {
			ent = ((Object)0);
		} else {
				ent = ModernizedCProgram.pbase_tree_cache[available_ix];
				my_ix = available_ix;
		} 
		Object generatedTree_data = ent.getTree_data();
		if (!ent) {
			nent = ModernizedCProgram.xmalloc();
			nent.setTemporary((available_ix < 0));
		} else {
				ModernizedCProgram.free(generatedTree_data);
				nent = ent;
		} 
		generatedOid.oidcpy(oid);
		nent.setTree_data(data);
		nent.setTree_size(size);
		nent.setRef(1);
		int generatedTemporary = nent.getTemporary();
		if (!generatedTemporary) {
			ModernizedCProgram.pbase_tree_cache[my_ix] = nent;
		} 
		return nent;
	}
	public void pbase_tree_put() {
		int generatedTemporary = this.getTemporary();
		int generatedRef = this.getRef();
		if (!generatedTemporary) {
			generatedRef--;
			return ;
		} 
		Object generatedTree_data = this.getTree_data();
		ModernizedCProgram.free(generatedTree_data);
		ModernizedCProgram.free(cache);
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int newRef) {
		ref = newRef;
	}
	public int getTemporary() {
		return temporary;
	}
	public void setTemporary(int newTemporary) {
		temporary = newTemporary;
	}
	public Object getTree_data() {
		return tree_data;
	}
	public void setTree_data(Object newTree_data) {
		tree_data = newTree_data;
	}
	public long getTree_size() {
		return tree_size;
	}
	public void setTree_size(long newTree_size) {
		tree_size = newTree_size;
	}
}
