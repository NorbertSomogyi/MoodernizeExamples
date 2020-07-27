package application;

public class pack_midx_entry {
	private object_id oid;
	private Object pack_int_id;
	private Object pack_mtime;
	private Object offset;
	
	public pack_midx_entry(object_id oid, Object pack_int_id, Object pack_mtime, Object offset) {
		setOid(oid);
		setPack_int_id(pack_int_id);
		setPack_mtime(pack_mtime);
		setOffset(offset);
	}
	public pack_midx_entry() {
	}
	
	public pack_midx_entry get_sorted_entries(multi_pack_index m, pack_info[] info, Object nr_packs, Object nr_objects) {
		uint32_t cur_fanout = new uint32_t();
		uint32_t cur_pack = new uint32_t();
		uint32_t cur_object = new uint32_t();
		uint32_t alloc_fanout = new uint32_t();
		uint32_t alloc_objects = new uint32_t();
		uint32_t total_objects = 0;
		pack_midx_entry entries_by_fanout = ((Object)0);
		pack_midx_entry deduplicated_entries = ((Object)0);
		Object generatedNum_packs = m.getNum_packs();
		uint32_t start_pack = m ? generatedNum_packs : 0;
		for (cur_pack = start_pack; cur_pack < nr_packs; cur_pack++) {
			total_objects += info[cur_pack].getP().getNum_objects();
		}
		alloc_objects = alloc_fanout = total_objects > 3200 ? total_objects / 200 : 16;
		(entries_by_fanout) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (alloc_fanout)));
		(deduplicated_entries) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (alloc_objects)));
		nr_objects = 0;
		Object[] generatedChunk_oid_fanout = m.getChunk_oid_fanout();
		for (cur_fanout = 0; cur_fanout < 256; cur_fanout++) {
			uint32_t nr_fanout = 0;
			if (m) {
				uint32_t start = 0;
				uint32_t end = new uint32_t();
				if (cur_fanout) {
					start = /*Error: Function owner not recognized*/ntohl(generatedChunk_oid_fanout[cur_fanout - 1]);
				} 
				end = /*Error: Function owner not recognized*/ntohl(generatedChunk_oid_fanout[cur_fanout]);
				for (cur_object = start; cur_object < end; cur_object++) {
					do {
						if ((nr_fanout + 1) > alloc_fanout) {
							if ((((alloc_fanout) + 16) * 3 / 2) < (nr_fanout + 1)) {
								alloc_fanout = (nr_fanout + 1);
							} else {
									alloc_fanout = (((alloc_fanout) + 16) * 3 / 2);
							} 
							(entries_by_fanout) = ModernizedCProgram.xrealloc((entries_by_fanout), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (alloc_fanout)));
						} 
					} while (0);
					ModernizedCProgram.nth_midxed_pack_midx_entry(m, entries_by_fanout[nr_fanout], cur_object);
					nr_fanout++;
				}
			} 
			for (cur_pack = start_pack; cur_pack < nr_packs; cur_pack++) {
				uint32_t start = 0;
				uint32_t end = new uint32_t();
				if (cur_fanout) {
					start = info[cur_pack].getP().get_pack_fanout(cur_fanout - 1);
				} 
				end = info[cur_pack].getP().get_pack_fanout(cur_fanout);
				for (cur_object = start; cur_object < end; cur_object++) {
					do {
						if ((nr_fanout + 1) > alloc_fanout) {
							if ((((alloc_fanout) + 16) * 3 / 2) < (nr_fanout + 1)) {
								alloc_fanout = (nr_fanout + 1);
							} else {
									alloc_fanout = (((alloc_fanout) + 16) * 3 / 2);
							} 
							(entries_by_fanout) = ModernizedCProgram.xrealloc((entries_by_fanout), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (alloc_fanout)));
						} 
					} while (0);
					ModernizedCProgram.fill_pack_entry(cur_pack, info[cur_pack].getP(), cur_object, entries_by_fanout[nr_fanout]);
					nr_fanout++;
				}
			}
			ModernizedCProgram.sane_qsort((entries_by_fanout), (nr_fanout), /*Error: sizeof expression not supported yet*/, midx_oid_compare/*
					 * The batch is now sorted by OID and then mtime (descending).
					 * Take only the first duplicate.
					 */);
			for (cur_object = 0; cur_object < nr_fanout; cur_object++) {
				if (cur_object && ModernizedCProgram.oideq(entries_by_fanout[cur_object - 1].getOid(), entries_by_fanout[cur_object].getOid())) {
					continue;
				} 
				do {
					if ((nr_objects + 1) > alloc_objects) {
						if ((((alloc_objects) + 16) * 3 / 2) < (nr_objects + 1)) {
							alloc_objects = (nr_objects + 1);
						} else {
								alloc_objects = (((alloc_objects) + 16) * 3 / 2);
						} 
						(deduplicated_entries) = ModernizedCProgram.xrealloc((deduplicated_entries), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (alloc_objects)));
					} 
				} while (0);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(deduplicated_entries[nr_objects], entries_by_fanout[cur_object], /*Error: Unsupported expression*/);
				(nr_objects)++;
			}
		}
		ModernizedCProgram.free(entries_by_fanout);
		return deduplicated_entries;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public Object getPack_int_id() {
		return pack_int_id;
	}
	public void setPack_int_id(Object newPack_int_id) {
		pack_int_id = newPack_int_id;
	}
	public Object getPack_mtime() {
		return pack_mtime;
	}
	public void setPack_mtime(Object newPack_mtime) {
		pack_mtime = newPack_mtime;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
}
