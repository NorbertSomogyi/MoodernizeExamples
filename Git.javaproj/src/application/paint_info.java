package application;

public class paint_info {
	private ref_bitmap ref_bitmap;
	private int nr_bits;
	private byte[][] pools;
	private Byte free;
	private Byte end;
	private int pool_count;
	
	public paint_info(ref_bitmap ref_bitmap, int nr_bits, byte[][] pools, Byte free, Byte end, int pool_count) {
		setRef_bitmap(ref_bitmap);
		setNr_bits(nr_bits);
		setPools(pools);
		setFree(free);
		setEnd(end);
		setPool_count(pool_count);
	}
	public paint_info() {
	}
	
	public Object paint_alloc() {
		int generatedNr_bits = this.getNr_bits();
		int nr = (((generatedNr_bits) + (true) - 1) / (true));
		int size = nr * /*Error: Unsupported expression*/;
		Object p;
		int generatedPool_count = this.getPool_count();
		Byte generatedEnd = this.getEnd();
		Byte generatedFree = this.getFree();
		byte[][] generatedPools = this.getPools();
		if (!generatedPool_count || size > generatedEnd - generatedFree) {
			if (size > (512 * 1024)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\shallow.c", 492, "pool size too small for %d in paint_alloc()", size);
			} 
			generatedPool_count++;
			(generatedPools) = ModernizedCProgram.xrealloc((generatedPools), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedPool_count)));
			this.setFree(ModernizedCProgram.xmalloc((512 * 1024)));
			generatedPools[generatedPool_count - 1] = generatedFree;
			this.setEnd(generatedFree + (512 * 1024));
		} 
		p = generatedFree;
		generatedFree += size;
		return p/*
		 * Given a commit SHA-1, walk down to parents until either SEEN,
		 * UNINTERESTING or BOTTOM is hit. Set the id-th bit in ref_bitmap for
		 * all walked commits.
		 */;
	}
	public void paint_down(Object oid, int id) {
		int i;
		int nr;
		commit_list head = ((Object)0);
		int generatedNr_bits = this.getNr_bits();
		int bitmap_nr = (((generatedNr_bits) + (true) - 1) / (true));
		size_t bitmap_size = ModernizedCProgram.st_mult(/*Error: Unsupported expression*/, bitmap_nr);
		commit c = /*Error: Function owner not recognized*/lookup_commit_reference_gently(ModernizedCProgram.the_repository, oid, 1);
		/* to be freed before return */uint32_t tmp = new uint32_t();
		uint32_t bitmap = new uint32_t();
		if (!c) {
			return /*Error: Unsupported expression*/;
		} 
		tmp = ModernizedCProgram.xmalloc(bitmap_size);
		bitmap = info.paint_alloc();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(bitmap, 0, bitmap_size);
		bitmap[id / 32] |=  (-1024 << (id % 32));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert(c, head);
		ref_bitmap generatedRef_bitmap = this.getRef_bitmap();
		object generatedObject = c.getObject();
		int generatedFlags = generatedObject.getFlags();
		object_id generatedOid = generatedObject.getOid();
		commit generatedItem = p.getItem();
		commit_list generatedNext = p.getNext();
		commit_list generatedParents = c.getParents();
		while (head) {
			commit_list p = new commit_list();
			commit c = /*Error: Function owner not recognized*/pop_commit(head);
			uint32_t refs = generatedRef_bitmap.ref_bitmap_at(c);
			if (generatedFlags & ((-1024 << 0) | (-1024 << /* XXX check "UNINTERESTING" from pack bitmaps if available */1))) {
				continue;
			} else {
					generatedFlags |=  (-1024 << 0);
			} 
			if (refs == ((Object)0)) {
				refs = bitmap;
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp, refs, bitmap_size);
					for (i = 0; i < bitmap_nr; i++) {
						tmp[i] |=  bitmap[i];
					}
					if (/*Error: Function owner not recognized*/memcmp(tmp, refs, bitmap_size)) {
						refs = info.paint_alloc();
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(refs, tmp, bitmap_size);
					} 
			} 
			if (generatedFlags & (-1024 << 10)) {
				continue;
			} 
			if (ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, c)) {
				ModernizedCProgram.die("unable to parse commit %s", ModernizedCProgram.oid_to_hex(generatedOid));
			} 
			for (p = generatedParents; p; p = generatedNext) {
				if (generatedFlags & (-1024 << 0)) {
					continue;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert(generatedItem, head);
			}
		}
		nr = ModernizedCProgram.get_max_object_index();
		object object = new object();
		int generatedType = o.getType();
		for (i = 0; i < nr; i++) {
			object o = object.get_indexed_object(i);
			if (o && generatedType == object_type.OBJ_COMMIT) {
				generatedFlags &=  ~(-1024 << 0);
			} 
		}
		ModernizedCProgram.free(tmp);
	}
	public ref_bitmap getRef_bitmap() {
		return ref_bitmap;
	}
	public void setRef_bitmap(ref_bitmap newRef_bitmap) {
		ref_bitmap = newRef_bitmap;
	}
	public int getNr_bits() {
		return nr_bits;
	}
	public void setNr_bits(int newNr_bits) {
		nr_bits = newNr_bits;
	}
	public byte[][] getPools() {
		return pools;
	}
	public void setPools(byte[][] newPools) {
		pools = newPools;
	}
	public Byte getFree() {
		return free;
	}
	public void setFree(Byte newFree) {
		free = newFree;
	}
	public Byte getEnd() {
		return end;
	}
	public void setEnd(Byte newEnd) {
		end = newEnd;
	}
	public int getPool_count() {
		return pool_count;
	}
	public void setPool_count(int newPool_count) {
		pool_count = newPool_count;
	}
}
