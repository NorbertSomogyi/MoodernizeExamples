package application;

public class parsed_object_pool {
	private object obj_hash;
	private int nr_objs;
	private int obj_hash_size;
	private alloc_state blob_state;
	private alloc_state tree_state;
	private alloc_state commit_state;
	private alloc_state tag_state;
	private alloc_state object_state;
	private int commit_count;
	private commit_graft grafts;
	private int grafts_alloc;
	private int grafts_nr;
	private int is_shallow;
	private stat_validity shallow_stat;
	private Byte alternate_shallow_file;
	private int commit_graft_prepared;
	private buffer_slab buffer_slab;
	
	public parsed_object_pool(object obj_hash, int nr_objs, int obj_hash_size, alloc_state blob_state, alloc_state tree_state, alloc_state commit_state, alloc_state tag_state, alloc_state object_state, int commit_count, commit_graft grafts, int grafts_alloc, int grafts_nr, int is_shallow, stat_validity shallow_stat, Byte alternate_shallow_file, int commit_graft_prepared, buffer_slab buffer_slab) {
		setObj_hash(obj_hash);
		setNr_objs(nr_objs);
		setObj_hash_size(obj_hash_size);
		setBlob_state(blob_state);
		setTree_state(tree_state);
		setCommit_state(commit_state);
		setTag_state(tag_state);
		setObject_state(object_state);
		setCommit_count(commit_count);
		setGrafts(grafts);
		setGrafts_alloc(grafts_alloc);
		setGrafts_nr(grafts_nr);
		setIs_shallow(is_shallow);
		setShallow_stat(shallow_stat);
		setAlternate_shallow_file(alternate_shallow_file);
		setCommit_graft_prepared(commit_graft_prepared);
		setBuffer_slab(buffer_slab);
	}
	public parsed_object_pool() {
	}
	
	public parsed_object_pool parsed_object_pool_new() {
		parsed_object_pool o = ModernizedCProgram.xmalloc();
		.memset(o, 0, );
		alloc_state alloc_state = new alloc_state();
		o.setBlob_state(alloc_state.allocate_alloc_state());
		o.setTree_state(alloc_state.allocate_alloc_state());
		o.setCommit_state(alloc_state.allocate_alloc_state());
		o.setTag_state(alloc_state.allocate_alloc_state());
		o.setObject_state(alloc_state.allocate_alloc_state());
		o.setIs_shallow(-1);
		stat_validity generatedShallow_stat = o.getShallow_stat();
		o.setShallow_stat(ModernizedCProgram.xcalloc(1, ));
		o.setBuffer_slab(.allocate_commit_buffer_slab());
		return o;
	}
	public void parsed_object_pool_clear() {
		int i;
		int generatedObj_hash_size = this.getObj_hash_size();
		object generatedObj_hash = this.getObj_hash();
		int generatedType = obj.getType();
		for (i = 0; i < generatedObj_hash_size; i++) {
			object obj = generatedObj_hash[i];
			if (!obj) {
				continue;
			} 
			if (generatedType == object_type.OBJ_TREE) {
				(tree)obj.free_tree_buffer();
			}  else if (generatedType == object_type.OBJ_COMMIT) {
				.release_commit_memory(o, (commit)obj);
			}  else if (generatedType == object_type.OBJ_TAG) {
				.release_tag_memory((tag)obj);
			} 
		}
		do {
			ModernizedCProgram.free(generatedObj_hash);
			(generatedObj_hash) = ((Object)0);
		} while (0);
		this.setObj_hash_size(0);
		buffer_slab generatedBuffer_slab = this.getBuffer_slab();
		.free_commit_buffer_slab(generatedBuffer_slab);
		this.setBuffer_slab(((Object)0));
		alloc_state generatedBlob_state = this.getBlob_state();
		generatedBlob_state.clear_alloc_state();
		alloc_state generatedTree_state = this.getTree_state();
		generatedTree_state.clear_alloc_state();
		alloc_state generatedCommit_state = this.getCommit_state();
		generatedCommit_state.clear_alloc_state();
		alloc_state generatedTag_state = this.getTag_state();
		generatedTag_state.clear_alloc_state();
		alloc_state generatedObject_state = this.getObject_state();
		generatedObject_state.clear_alloc_state();
		stat_validity generatedShallow_stat = this.getShallow_stat();
		generatedShallow_stat.stat_validity_clear();
		do {
			ModernizedCProgram.free(generatedBlob_state);
			(generatedBlob_state) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(generatedTree_state);
			(generatedTree_state) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(generatedCommit_state);
			(generatedCommit_state) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(generatedTag_state);
			(generatedTag_state) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(generatedObject_state);
			(generatedObject_state) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(generatedShallow_stat);
			(generatedShallow_stat) = ((Object)0);
		} while (0);
	}
	/*
		 * As objects are allocated in slabs (see alloc.c), we do
		 * not need to free each object, but each slab instead.
		 *
		 * Before doing so, we need to free any additional memory
		 * the objects may hold.
		 */
	public object getObj_hash() {
		return obj_hash;
	}
	public void setObj_hash(object newObj_hash) {
		obj_hash = newObj_hash;
	}
	public int getNr_objs() {
		return nr_objs;
	}
	public void setNr_objs(int newNr_objs) {
		nr_objs = newNr_objs;
	}
	public int getObj_hash_size() {
		return obj_hash_size;
	}
	public void setObj_hash_size(int newObj_hash_size) {
		obj_hash_size = newObj_hash_size;
	}
	public alloc_state getBlob_state() {
		return blob_state;
	}
	public void setBlob_state(alloc_state newBlob_state) {
		blob_state = newBlob_state;
	}
	public alloc_state getTree_state() {
		return tree_state;
	}
	public void setTree_state(alloc_state newTree_state) {
		tree_state = newTree_state;
	}
	public alloc_state getCommit_state() {
		return commit_state;
	}
	public void setCommit_state(alloc_state newCommit_state) {
		commit_state = newCommit_state;
	}
	public alloc_state getTag_state() {
		return tag_state;
	}
	public void setTag_state(alloc_state newTag_state) {
		tag_state = newTag_state;
	}
	public alloc_state getObject_state() {
		return object_state;
	}
	public void setObject_state(alloc_state newObject_state) {
		object_state = newObject_state;
	}
	public int getCommit_count() {
		return commit_count;
	}
	public void setCommit_count(int newCommit_count) {
		commit_count = newCommit_count;
	}
	public commit_graft getGrafts() {
		return grafts;
	}
	public void setGrafts(commit_graft newGrafts) {
		grafts = newGrafts;
	}
	public int getGrafts_alloc() {
		return grafts_alloc;
	}
	public void setGrafts_alloc(int newGrafts_alloc) {
		grafts_alloc = newGrafts_alloc;
	}
	public int getGrafts_nr() {
		return grafts_nr;
	}
	public void setGrafts_nr(int newGrafts_nr) {
		grafts_nr = newGrafts_nr;
	}
	public int getIs_shallow() {
		return is_shallow;
	}
	public void setIs_shallow(int newIs_shallow) {
		is_shallow = newIs_shallow;
	}
	public stat_validity getShallow_stat() {
		return shallow_stat;
	}
	public void setShallow_stat(stat_validity newShallow_stat) {
		shallow_stat = newShallow_stat;
	}
	public Byte getAlternate_shallow_file() {
		return alternate_shallow_file;
	}
	public void setAlternate_shallow_file(Byte newAlternate_shallow_file) {
		alternate_shallow_file = newAlternate_shallow_file;
	}
	public int getCommit_graft_prepared() {
		return commit_graft_prepared;
	}
	public void setCommit_graft_prepared(int newCommit_graft_prepared) {
		commit_graft_prepared = newCommit_graft_prepared;
	}
	public buffer_slab getBuffer_slab() {
		return buffer_slab;
	}
	public void setBuffer_slab(buffer_slab newBuffer_slab) {
		buffer_slab = newBuffer_slab;
	}
}
