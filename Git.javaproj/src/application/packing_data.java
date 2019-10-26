package application;

public class packing_data {
	private repository repo;
	private object_entry objects;
	private Object nr_objects;
	private Object nr_alloc;
	private Object index;
	private Object index_size;
	private Integer in_pack_pos;
	private Long delta_size;
	private packed_git in_pack_by_idx;
	private packed_git in_pack;
	private Object odb_lock;
	private object_entry ext_bases;
	private Object nr_ext;
	private Object alloc_ext;
	private Object oe_size_limit;
	private Object oe_delta_size_limit;
	private Integer tree_depth;
	private Byte layer;
	
	public packing_data(repository repo, object_entry objects, Object nr_objects, Object nr_alloc, Object index, Object index_size, Integer in_pack_pos, Long delta_size, packed_git in_pack_by_idx, packed_git in_pack, Object odb_lock, object_entry ext_bases, Object nr_ext, Object alloc_ext, Object oe_size_limit, Object oe_delta_size_limit, Integer tree_depth, Byte layer) {
		setRepo(repo);
		setObjects(objects);
		setNr_objects(nr_objects);
		setNr_alloc(nr_alloc);
		setIndex(index);
		setIndex_size(index_size);
		setIn_pack_pos(in_pack_pos);
		setDelta_size(delta_size);
		setIn_pack_by_idx(in_pack_by_idx);
		setIn_pack(in_pack);
		setOdb_lock(odb_lock);
		setExt_bases(ext_bases);
		setNr_ext(nr_ext);
		setAlloc_ext(alloc_ext);
		setOe_size_limit(oe_size_limit);
		setOe_delta_size_limit(oe_delta_size_limit);
		setTree_depth(tree_depth);
		setLayer(layer);
	}
	public packing_data() {
	}
	
	public void bitmap_writer_build() {
		double REUSE_BITMAP_THRESHOLD = 0.2;
		int i;
		int reuse_after;
		int need_reset;
		bitmap bitmap = new bitmap();
		bitmap base = bitmap.bitmap_new();
		rev_info revs = new rev_info();
		ModernizedCProgram.writer.setBitmaps(ModernizedCProgram.kh_init_oid_map());
		ModernizedCProgram.writer.setTo_pack(ModernizedCProgram.to_pack);
		progress progress = new progress();
		if (ModernizedCProgram.writer.getShow_progress()) {
			ModernizedCProgram.writer.setProgress(progress.start_progress("Building bitmaps", ModernizedCProgram.writer.getSelected_nr()));
		} 
		ModernizedCProgram.repo_init_revisions(ModernizedCProgram.to_pack.getRepo(), revs, ((Object)0));
		revs.setTag_objects(1);
		revs.setTree_objects(1);
		revs.setBlob_objects(1);
		revs.setNo_walk(0);
		revs.setInclude_check(should_include);
		ModernizedCProgram.reset_revision_walk();
		reuse_after = ModernizedCProgram.writer.getSelected_nr() * REUSE_BITMAP_THRESHOLD;
		need_reset = 0;
		commit generatedCommit = stored.getCommit();
		ewah_bitmap generatedBitmap = stored.getBitmap();
		object_array generatedPending = revs.getPending();
		ewah_bitmap ewah_bitmap = new ewah_bitmap();
		int generatedFlags = stored.getFlags();
		object_id generatedOid = object.getOid();
		for (i = ModernizedCProgram.writer.getSelected_nr() - 1; i >= 0; --i) {
			bitmapped_commit stored = new bitmapped_commit();
			object object = new object();
			khiter_t hash_pos = new khiter_t();
			int hash_ret;
			stored = ModernizedCProgram.writer.getSelected()[i];
			object = (object)generatedCommit;
			if (generatedBitmap == ((Object)0)) {
				if (i < ModernizedCProgram.writer.getSelected_nr() - 1 && (need_reset || !ModernizedCProgram.repo_in_merge_bases(ModernizedCProgram.the_repository, generatedCommit, generatedCommit))) {
					base.bitmap_reset();
					ModernizedCProgram.reset_all_seen();
				} 
				ModernizedCProgram.add_pending_object(revs, object, "");
				revs.setInclude_check_data(base);
				if (revs.prepare_revision_walk()) {
					ModernizedCProgram.die("revision walk setup failed");
				} 
				revs.traverse_commit_list(show_commit, show_object, base);
				generatedPending.object_array_clear();
				stored.setBitmap(ewah_bitmap.bitmap_to_ewah(base));
				need_reset = 0;
			} else {
					need_reset = 1;
			} 
			if (i >= reuse_after) {
				generatedFlags |=  pack_bitmap_flags.BITMAP_FLAG_REUSE;
			} 
			hash_pos = ModernizedCProgram.kh_put_oid_map(ModernizedCProgram.writer.getBitmaps(), generatedOid, hash_ret);
			if (hash_ret == 0) {
				ModernizedCProgram.die("Duplicate entry when writing index: %s", ModernizedCProgram.oid_to_hex(generatedOid));
			} 
			((ModernizedCProgram.writer.getBitmaps()).getVals()[hash_pos]) = stored;
			ModernizedCProgram.writer.getProgress().display_progress(ModernizedCProgram.writer.getSelected_nr() - i);
		}
		base.bitmap_free();
		ModernizedCProgram.writer.getProgress().stop_progress();
		ModernizedCProgram.compute_xor_offsets();
	}
	public void bitmap_writer_reuse_bitmaps() {
		bitmap_index bitmap_git = new bitmap_index();
		bitmap_index bitmap_index = new bitmap_index();
		if (!(bitmap_git = bitmap_index.prepare_bitmap_git(ModernizedCProgram.to_pack.getRepo()))) {
			return ;
		} 
		ModernizedCProgram.writer.setReused(ModernizedCProgram.kh_init_oid_map());
		ModernizedCProgram.rebuild_existing_bitmaps(bitmap_git, ModernizedCProgram.to_pack, ModernizedCProgram.writer.getReused(), ModernizedCProgram.writer.getShow_progress());
	}
	/* Protect access to object database */
	public void packing_data_lock() {
		Object generatedOdb_lock = this.getOdb_lock();
		.pthread_mutex_lock(generatedOdb_lock);
	}
	public void packing_data_unlock() {
		Object generatedOdb_lock = this.getOdb_lock();
		.pthread_mutex_unlock(generatedOdb_lock);
	}
	public long oe_size(Object e) {
		if (e.getSize_valid()) {
			return e.getSize_();
		} 
		return pack.oe_get_size_slow(e);
	}
	public int oe_size_less_than(Object lhs, long rhs) {
		if (lhs.getSize_valid()) {
			return lhs.getSize_() < rhs;
		} 
		Object generatedOe_size_limit = this.getOe_size_limit();
		if (rhs < generatedOe_size_limit) {
			return 0;
		} 
		return pack.oe_get_size_slow(lhs) < rhs;
	}
	public int oe_size_greater_than(Object lhs, long rhs) {
		if (lhs.getSize_valid()) {
			return lhs.getSize_() > rhs;
		} 
		Object generatedOe_size_limit = this.getOe_size_limit();
		if (rhs < generatedOe_size_limit) {
			return 1;
		} 
		return pack.oe_get_size_slow(lhs) > rhs;
	}
	public long oe_delta_size(Object e) {
		if (e.getDelta_size_valid()) {
			return e.getDelta_size_();
		} 
		Long generatedDelta_size = this.getDelta_size();
		object_entry generatedObjects = this.getObjects();
		return generatedDelta_size[e - generatedObjects];
	}
	/*
	 * Protect object list partitioning (e.g. struct thread_param) and
	 * progress_state
	 */
	/*
	 * Access to struct object_entry is unprotected since each thread owns
	 * a portion of the main object list. Just don't access object entries
	 * ahead in the list because they can be stolen and would need
	 * progress_mutex for protection.
	 */
	/*
	 * Return the size of the object without doing any delta
	 * reconstruction (so non-deltas are true object sizes, but deltas
	 * return the size of the delta data).
	 */
	public long oe_get_size_slow(Object e) {
		packed_git p = new packed_git();
		pack_window w_curs = new pack_window();
		byte buf;
		object_type type;
		long used;
		long avail;
		long size;
		if (e.getType_() != object_type.OBJ_OFS_DELTA && e.getType_() != object_type.OBJ_REF_DELTA) {
			ModernizedCProgram.to_pack.packing_data_lock();
			if (ModernizedCProgram.the_repository.oid_object_info(e.getIdx().getOid(), size) < 0) {
				ModernizedCProgram.die(ModernizedCProgram._("unable to get size of %s"), ModernizedCProgram.oid_to_hex(e.getIdx().getOid()));
			} 
			ModernizedCProgram.to_pack.packing_data_unlock();
			return size;
		} 
		packed_git packed_git = new packed_git();
		p = packed_git.oe_in_pack(pack, e);
		if (!p) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\pack-objects.c", 2008, "when e->type is a delta, it must belong to a pack");
		} 
		ModernizedCProgram.to_pack.packing_data_lock();
		w_curs = ((Object)0);
		buf = ModernizedCProgram.use_pack(p, w_curs, e.getIn_pack_offset(), avail);
		used = ModernizedCProgram.unpack_object_header_buffer(buf, avail, object_type.type, size);
		if (used == 0) {
			ModernizedCProgram.die(ModernizedCProgram._("unable to parse object header of %s"), ModernizedCProgram.oid_to_hex(e.getIdx().getOid()));
		} 
		w_curs.unuse_pack();
		ModernizedCProgram.to_pack.packing_data_unlock();
		return size;
	}
	public int compute_pack_layers() {
		uint32_t i = new uint32_t();
		if (!ModernizedCProgram.core_island_name || !ModernizedCProgram.island_marks) {
			return 1;
		} 
		pack_idx_entry generatedIdx = entry.getIdx();
		object_id generatedOid = generatedIdx.getOid();
		for (i = 0; i < ModernizedCProgram.to_pack.getNr_objects(); ++i) {
			object_entry entry = ModernizedCProgram.to_pack.getObjects()[i];
			khiter_t pos = generatedOid.kh_get_oid_map(ModernizedCProgram.island_marks);
			ModernizedCProgram.oe_set_layer(ModernizedCProgram.to_pack, entry, 1);
			if (pos < ((ModernizedCProgram.island_marks).getN_buckets())) {
				island_bitmap bitmap = ((ModernizedCProgram.island_marks).getVals()[pos]);
				if (bitmap.island_bitmap_get(ModernizedCProgram.island_counter_core)) {
					ModernizedCProgram.oe_set_layer(ModernizedCProgram.to_pack, entry, 0);
				} 
			} 
		}
		return 2;
	}
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public object_entry getObjects() {
		return objects;
	}
	public void setObjects(object_entry newObjects) {
		objects = newObjects;
	}
	public Object getNr_objects() {
		return nr_objects;
	}
	public void setNr_objects(Object newNr_objects) {
		nr_objects = newNr_objects;
	}
	public Object getNr_alloc() {
		return nr_alloc;
	}
	public void setNr_alloc(Object newNr_alloc) {
		nr_alloc = newNr_alloc;
	}
	public Object getIndex() {
		return index;
	}
	public void setIndex(Object newIndex) {
		index = newIndex;
	}
	public Object getIndex_size() {
		return index_size;
	}
	public void setIndex_size(Object newIndex_size) {
		index_size = newIndex_size;
	}
	public Integer getIn_pack_pos() {
		return in_pack_pos;
	}
	public void setIn_pack_pos(Integer newIn_pack_pos) {
		in_pack_pos = newIn_pack_pos;
	}
	public Long getDelta_size() {
		return delta_size;
	}
	public void setDelta_size(Long newDelta_size) {
		delta_size = newDelta_size;
	}
	public packed_git getIn_pack_by_idx() {
		return in_pack_by_idx;
	}
	public void setIn_pack_by_idx(packed_git newIn_pack_by_idx) {
		in_pack_by_idx = newIn_pack_by_idx;
	}
	public packed_git getIn_pack() {
		return in_pack;
	}
	public void setIn_pack(packed_git newIn_pack) {
		in_pack = newIn_pack;
	}
	public Object getOdb_lock() {
		return odb_lock;
	}
	public void setOdb_lock(Object newOdb_lock) {
		odb_lock = newOdb_lock;
	}
	public object_entry getExt_bases() {
		return ext_bases;
	}
	public void setExt_bases(object_entry newExt_bases) {
		ext_bases = newExt_bases;
	}
	public Object getNr_ext() {
		return nr_ext;
	}
	public void setNr_ext(Object newNr_ext) {
		nr_ext = newNr_ext;
	}
	public Object getAlloc_ext() {
		return alloc_ext;
	}
	public void setAlloc_ext(Object newAlloc_ext) {
		alloc_ext = newAlloc_ext;
	}
	public Object getOe_size_limit() {
		return oe_size_limit;
	}
	public void setOe_size_limit(Object newOe_size_limit) {
		oe_size_limit = newOe_size_limit;
	}
	public Object getOe_delta_size_limit() {
		return oe_delta_size_limit;
	}
	public void setOe_delta_size_limit(Object newOe_delta_size_limit) {
		oe_delta_size_limit = newOe_delta_size_limit;
	}
	public Integer getTree_depth() {
		return tree_depth;
	}
	public void setTree_depth(Integer newTree_depth) {
		tree_depth = newTree_depth;
	}
	public Byte getLayer() {
		return layer;
	}
	public void setLayer(Byte newLayer) {
		layer = newLayer;
	}
}
