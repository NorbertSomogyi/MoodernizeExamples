package application;

public class unpacked {
	private object_entry entry;
	private Object data;
	private delta_index index;
	private int depth;
	
	public unpacked(object_entry entry, Object data, delta_index index, int depth) {
		setEntry(entry);
		setData(data);
		setIndex(index);
		setDepth(depth);
	}
	public unpacked() {
	}
	
	public int try_delta(unpacked src, int max_depth, Long mem_usage) {
		object_entry generatedEntry = this.getEntry();
		object_entry trg_entry = generatedEntry;
		object_entry src_entry = generatedEntry;
		long trg_size;
		long src_size;
		long delta_size;
		long sizediff;
		long max_size;
		long sz;
		int ref_depth;
		object_type type;
		Object delta_buf;
		if (ModernizedCProgram.oe_type(trg_entry) != ModernizedCProgram.oe_type(/* Don't bother doing diffs between different types */src_entry)) {
			return -1/*
				 * We do not bother to try a delta that we discarded on an
				 * earlier try, but only when reusing delta data.  Note that
				 * src_entry that is marked as the preferred_base should always
				 * be considered, as even if we produce a suboptimal delta against
				 * it, we will still save the transfer cost, as we already know
				 * the other side has it and we won't send src_entry at all.
				 */;
		} 
		packed_git packed_git = new packed_git();
		Object generatedPreferred_base = src_entry.getPreferred_base();
		Object generatedIn_pack_type = trg_entry.getIn_pack_type();
		if (ModernizedCProgram.reuse_delta && packed_git.oe_in_pack(ModernizedCProgram.to_pack, trg_entry) && packed_git.oe_in_pack(ModernizedCProgram.to_pack, trg_entry) == packed_git.oe_in_pack(ModernizedCProgram.to_pack, src_entry) && !generatedPreferred_base && generatedIn_pack_type != object_type.OBJ_REF_DELTA && generatedIn_pack_type != object_type.OBJ_OFS_DELTA) {
			return 0;
		} 
		int generatedDepth = src.getDepth();
		if (generatedDepth >= /* Let's not bust the allowed depth. */max_depth) {
			return 0;
		} 
		trg_size = ModernizedCProgram.to_pack.oe_size(/* Now some size filtering heuristics. */trg_entry);
		object_entry object_entry = new object_entry();
		if (!object_entry.oe_delta(ModernizedCProgram.to_pack, trg_entry)) {
			max_size = trg_size / 2 - ModernizedCProgram.the_repository.getHash_algo().getRawsz();
			ref_depth = 1;
		} else {
				max_size = ModernizedCProgram.to_pack.oe_delta_size(trg_entry);
				ref_depth = generatedDepth;
		} 
		max_size = (uint64_t)max_size * (max_depth - generatedDepth) / (max_depth - ref_depth + 1);
		if (max_size == 0) {
			return 0;
		} 
		src_size = ModernizedCProgram.to_pack.oe_size(src_entry);
		sizediff = src_size < trg_size ? trg_size - src_size : 0;
		if (sizediff >= max_size) {
			return 0;
		} 
		if (trg_size < src_size / 32) {
			return 0;
		} 
		pack_idx_entry generatedIdx = generatedEntry.getIdx();
		object_id generatedOid = generatedIdx.getOid();
		if (!ModernizedCProgram.in_same_island(generatedOid, generatedOid)) {
			return 0;
		} 
		Object generatedData = this.getData();
		if (!generatedData) {
			ModernizedCProgram.to_pack.packing_data_lock();
			this.setData(ModernizedCProgram.the_repository.repo_read_object_file(generatedOid, object_type.type, sz));
			ModernizedCProgram.to_pack.packing_data_unlock();
			if (!generatedData) {
				ModernizedCProgram.die(ModernizedCProgram._("object %s cannot be read"), ModernizedCProgram.oid_to_hex(generatedOid));
			} 
			if (sz != trg_size) {
				ModernizedCProgram.die(ModernizedCProgram._("object %s inconsistent object length (%llu vs %llu)"), ModernizedCProgram.oid_to_hex(generatedOid), (uintmax_t)sz, (uintmax_t)trg_size);
			} 
			mem_usage += sz;
		} 
		if (!generatedData) {
			ModernizedCProgram.to_pack.packing_data_lock();
			src.setData(ModernizedCProgram.the_repository.repo_read_object_file(generatedOid, object_type.type, sz));
			ModernizedCProgram.to_pack.packing_data_unlock();
			if (!generatedData) {
				if (generatedPreferred_base) {
					int warned = 0;
					if (!warned++) {
						ModernizedCProgram.warning(ModernizedCProgram._("object %s cannot be read"), ModernizedCProgram.oid_to_hex(generatedOid));
					} 
					return 0;
				} 
				ModernizedCProgram.die(ModernizedCProgram._("object %s cannot be read"), ModernizedCProgram.oid_to_hex(generatedOid));
			} 
			if (sz != src_size) {
				ModernizedCProgram.die(ModernizedCProgram._("object %s inconsistent object length (%llu vs %llu)"), ModernizedCProgram.oid_to_hex(generatedOid), (uintmax_t)sz, (uintmax_t)src_size);
			} 
			mem_usage += sz;
		} 
		delta_index generatedIndex = src.getIndex();
		delta_index delta_index = new delta_index();
		if (!generatedIndex) {
			src.setIndex(delta_index.create_delta_index(generatedData, src_size));
			if (!generatedIndex) {
				int warned = 0;
				if (!warned++) {
					ModernizedCProgram.warning(ModernizedCProgram._("suboptimal pack - out of memory"));
				} 
				return 0;
			} 
			mem_usage += generatedIndex.sizeof_delta_index();
		} 
		delta_buf = ModernizedCProgram.create_delta(generatedIndex, generatedData, trg_size, delta_size, max_size);
		if (!delta_buf) {
			return 0;
		} 
		if (object_entry.oe_delta(ModernizedCProgram.to_pack, trg_entry)) {
			if (delta_size == ModernizedCProgram.to_pack.oe_delta_size(/* Prefer only shallower same-sized deltas. */trg_entry) && generatedDepth + 1 >= generatedDepth) {
				ModernizedCProgram.free(delta_buf);
				return 0/*
					 * Handle memory allocation outside of the cache
					 * accounting lock.  Compiler will optimize the strangeness
					 * away when NO_PTHREADS is defined.
					 */;
			} 
		} 
		Object generatedDelta_data = trg_entry.getDelta_data();
		ModernizedCProgram.free(generatedDelta_data);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pthread_mutex_lock(ModernizedCProgram.cache_mutex);
		if (generatedDelta_data) {
			ModernizedCProgram.delta_cache_size -= ModernizedCProgram.to_pack.oe_delta_size(trg_entry);
			trg_entry.setDelta_data(((Object)0));
		} 
		if (ModernizedCProgram.delta_cacheable(src_size, trg_size, delta_size)) {
			ModernizedCProgram.delta_cache_size += delta_size;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pthread_mutex_unlock(ModernizedCProgram.cache_mutex);
			trg_entry.setDelta_data(ModernizedCProgram.xrealloc(delta_buf, delta_size));
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pthread_mutex_unlock(ModernizedCProgram.cache_mutex);
				ModernizedCProgram.free(delta_buf);
		} 
		ModernizedCProgram.oe_set_delta(ModernizedCProgram.to_pack, trg_entry, src_entry);
		ModernizedCProgram.oe_set_delta_size(ModernizedCProgram.to_pack, trg_entry, delta_size);
		this.setDepth(generatedDepth + 1);
		return 1;
	}
	public long free_unpacked() {
		delta_index generatedIndex = this.getIndex();
		long freed_mem = generatedIndex.sizeof_delta_index();
		generatedIndex.free_delta_index();
		this.setIndex(((Object)0));
		Object generatedData = this.getData();
		object_entry generatedEntry = this.getEntry();
		if (generatedData) {
			freed_mem += ModernizedCProgram.to_pack.oe_size(generatedEntry);
			do {
				ModernizedCProgram.free(generatedData);
				(generatedData) = ((Object)0);
			} while (0);
		} 
		this.setEntry(((Object)0));
		this.setDepth(0);
		return freed_mem;
	}
	public object_entry getEntry() {
		return entry;
	}
	public void setEntry(object_entry newEntry) {
		entry = newEntry;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public delta_index getIndex() {
		return index;
	}
	public void setIndex(delta_index newIndex) {
		index = newIndex;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int newDepth) {
		depth = newDepth;
	}
}
