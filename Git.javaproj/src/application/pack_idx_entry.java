package application;

public class pack_idx_entry {
	private object_id oid;
	private Object crc32;
	private Object offset;
	
	public pack_idx_entry(object_id oid, Object crc32, Object offset) {
		setOid(oid);
		setCrc32(crc32);
		setOffset(offset);
	}
	public pack_idx_entry() {
	}
	
	public void bitmap_writer_finish(Object index_nr, Object filename, Object options) {
		uint16_t default_version = 1;
		uint16_t flags = pack_bitmap_opts.BITMAP_OPT_FULL_DAG;
		strbuf tmp_file = new strbuf(, , );
		hashfile f = new hashfile();
		bitmap_disk_header header = new bitmap_disk_header();
		int fd = tmp_file.odb_mkstemp("pack/tmp_bitmap_XXXXXX");
		byte generatedBuf = tmp_file.getBuf();
		hashfile hashfile = new hashfile();
		f = hashfile.hashfd(fd, generatedBuf);
		Object generatedMagic = header.getMagic();
		.memcpy(generatedMagic, ModernizedCProgram.BITMAP_IDX_SIGNATURE, );
		header.setVersion(.htons(default_version));
		header.setOptions(.htons(flags | options));
		header.setEntry_count(.htonl(ModernizedCProgram.writer.getSelected_nr()));
		Object generatedChecksum = header.getChecksum();
		ModernizedCProgram.hashcpy(generatedChecksum, ModernizedCProgram.writer.getPack_checksum());
		f.hashwrite(header,  - 32 + ModernizedCProgram.the_repository.getHash_algo().getRawsz());
		ModernizedCProgram.dump_bitmap(f, ModernizedCProgram.writer.getCommits());
		ModernizedCProgram.dump_bitmap(f, ModernizedCProgram.writer.getTrees());
		ModernizedCProgram.dump_bitmap(f, ModernizedCProgram.writer.getBlobs());
		ModernizedCProgram.dump_bitmap(f, ModernizedCProgram.writer.getTags());
		ModernizedCProgram.write_selected_commits_v1(f, index, index_nr);
		if (options & pack_bitmap_opts.BITMAP_OPT_HASH_CACHE) {
			ModernizedCProgram.write_hash_cache(f, index, index_nr);
		} 
		f.finalize_hashfile(((Object)0), 4 | 2 | 1);
		if (ModernizedCProgram.adjust_shared_perm(generatedBuf)) {
			ModernizedCProgram.die_errno("unable to make temporary bitmap file readable");
		} 
		if (.rename(generatedBuf, filename)) {
			ModernizedCProgram.die_errno("unable to rename temporary bitmap file to '%s'", filename);
		} 
		tmp_file.strbuf_release();
	}
	public Object write_idx_file(Object index_name, int nr_objects, Object opts, Object sha1) {
		hashfile f = new hashfile();
		pack_idx_entry sorted_by_sha = new pack_idx_entry();
		pack_idx_entry list = new pack_idx_entry();
		pack_idx_entry last = new pack_idx_entry();
		off_t last_obj_offset = 0;
		uint32_t[] array = new uint32_t();
		int i;
		int fd;
		uint32_t index_version = new uint32_t();
		if (nr_objects) {
			sorted_by_sha = ModernizedCProgram.objects;
			list = sorted_by_sha;
			last = sorted_by_sha + nr_objects;
			for (i = 0; i < nr_objects; ++i) {
				if (ModernizedCProgram.objects[i].getOffset() > last_obj_offset) {
					last_obj_offset = ModernizedCProgram.objects[i].getOffset();
				} 
			}
			ModernizedCProgram.sane_qsort((sorted_by_sha), (nr_objects), , sha1_compare);
		} else {
				sorted_by_sha = list = last = ((Object)0);
		} 
		hashfile hashfile = new hashfile();
		hashfile hashfile = new hashfile();
		if (opts.getFlags() & 1) {
			((index_name) ? (Object)0 : ._assert("index_name", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\pack-write.c", 70));
			f = hashfile.hashfd_check(index_name);
		} else {
				if (!index_name) {
					strbuf tmp_file = new strbuf(, , );
					fd = tmp_file.odb_mkstemp("pack/tmp_idx_XXXXXX");
					index_name = tmp_file.strbuf_detach(((Object)0));
				} else {
						.unlink(index_name);
						fd = .open(index_name, -1024 | -1024 | 1, 600);
						if (fd < 0) {
							ModernizedCProgram.die_errno("unable to create '%s'", index_name);
						} 
				} 
				f = hashfile.hashfd(fd, index_name);
		} 
		index_version = ModernizedCProgram.need_large_offset(last_obj_offset, opts) ? 2 : opts.getVersion();
		if (index_version >= /* index versions 2 and above need a header */2) {
			pack_idx_header hdr = new pack_idx_header();
			hdr.setIdx_signature(.htonl(-1024));
			hdr.setIdx_version(.htonl(index_version));
			f.hashwrite(hdr, );
		} 
		object_id generatedOid = obj.getOid();
		Object generatedHash = generatedOid.getHash();
		for (i = 0; i < 256; i++) {
			pack_idx_entry next = list;
			while (next < last) {
				pack_idx_entry obj = next;
				if (generatedHash[0] != i) {
					break;
				} 
				next++;
			}
			array[i] = .htonl(next - sorted_by_sha);
			list = next;
		}
		f.hashwrite(array, 256 * 4/*
			 * Write the actual SHA1 entries..
			 */);
		list = sorted_by_sha;
		Object generatedOffset = obj.getOffset();
		for (i = 0; i < nr_objects; i++) {
			pack_idx_entry obj = list++;
			if (index_version < 2) {
				uint32_t offset = .htonl(generatedOffset);
				f.hashwrite(ModernizedCProgram.offset, 4);
			} 
			f.hashwrite(generatedHash, ModernizedCProgram.the_repository.getHash_algo().getRawsz());
			if ((opts.getFlags() & 2) && (i && ModernizedCProgram.oideq(generatedOid, generatedOid))) {
				ModernizedCProgram.die("The same object %s appears twice in the pack", ModernizedCProgram.oid_to_hex(generatedOid));
			} 
		}
		Object generatedCrc32 = obj.getCrc32();
		if (index_version >= 2) {
			int nr_large_offset = 0;
			list = /* write the crc32 table */sorted_by_sha;
			for (i = 0; i < nr_objects; i++) {
				pack_idx_entry obj = list++;
				uint32_t crc32_val = .htonl(generatedCrc32);
				f.hashwrite(crc32_val, 4);
			}
			list = /* write the 32-bit offset table */sorted_by_sha;
			for (i = 0; i < nr_objects; i++) {
				pack_idx_entry obj = list++;
				uint32_t offset = new uint32_t();
				ModernizedCProgram.offset = (ModernizedCProgram.need_large_offset(generatedOffset, opts) ? (-1024 | nr_large_offset++) : generatedOffset);
				ModernizedCProgram.offset = .htonl(ModernizedCProgram.offset);
				f.hashwrite(ModernizedCProgram.offset, 4);
			}
			list = /* write the large offset table */sorted_by_sha;
			while (nr_large_offset) {
				pack_idx_entry obj = list++;
				uint64_t offset = generatedOffset;
				uint32_t[] split = new uint32_t();
				if (!ModernizedCProgram.need_large_offset(ModernizedCProgram.offset, opts)) {
					continue;
				} 
				split[0] = .htonl(ModernizedCProgram.offset >> 32);
				split[1] = .htonl(ModernizedCProgram.offset & -1024);
				f.hashwrite(split, 8);
				nr_large_offset--;
			}
		} 
		f.hashwrite(sha1, ModernizedCProgram.the_repository.getHash_algo().getRawsz());
		f.finalize_hashfile(((Object)0), 4 | 1 | ((opts.getFlags() & 1) ? 0 : 2));
		return index_name;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public Object getCrc32() {
		return crc32;
	}
	public void setCrc32(Object newCrc32) {
		crc32 = newCrc32;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
}
