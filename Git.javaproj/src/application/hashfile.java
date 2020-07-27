package application;

/* A SHA1-protected file */
public class hashfile {
	private int fd;
	private int check_fd;
	private int offset;
	private git_hash_ctx ctx;
	private Object total;
	private progress tp;
	private Object name;
	private int do_crc;
	private Object crc32;
	private Object buffer;
	
	public hashfile(int fd, int check_fd, int offset, git_hash_ctx ctx, Object total, progress tp, Object name, int do_crc, Object crc32, Object buffer) {
		setFd(fd);
		setCheck_fd(check_fd);
		setOffset(offset);
		setCtx(ctx);
		setTotal(total);
		setTp(tp);
		setName(name);
		setDo_crc(do_crc);
		setCrc32(crc32);
		setBuffer(buffer);
	}
	public hashfile() {
	}
	
	public Object write_reused_pack() {
		byte[] buffer = new byte[8192];
		off_t to_write = new off_t();
		off_t total = new off_t();
		int fd;
		if (!ModernizedCProgram.reuse_packfile.is_pack_valid()) {
			ModernizedCProgram.die(ModernizedCProgram._("packfile is invalid: %s"), ModernizedCProgram.reuse_packfile.getPack_name());
		} 
		fd = ModernizedCProgram.git_open_cloexec(ModernizedCProgram.reuse_packfile.getPack_name(), 0);
		if (fd < 0) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("unable to open packfile for reuse: %s"), ModernizedCProgram.reuse_packfile.getPack_name());
		} 
		if (/*Error: Function owner not recognized*/lseek(fd, /*Error: Unsupported expression*/, 0) == -1) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("unable to seek in reused packfile"));
		} 
		if (ModernizedCProgram.reuse_packfile_offset < 0) {
			ModernizedCProgram.reuse_packfile_offset = ModernizedCProgram.reuse_packfile.getPack_size() - ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		} 
		total = to_write = ModernizedCProgram.reuse_packfile_offset - /*Error: Unsupported expression*/;
		while (to_write) {
			int read_pack = ModernizedCProgram.xread(fd, buffer, /*Error: sizeof expression not supported yet*/);
			if (read_pack <= 0) {
				ModernizedCProgram.die_errno(ModernizedCProgram._("unable to read from reused packfile"));
			} 
			if (read_pack > to_write) {
				read_pack = to_write;
			} 
			f.hashwrite(buffer, read_pack);
			to_write -= read_pack/*
					 * We don't know the actual number of objects written,
					 * only how many bytes written, how many bytes total, and
					 * how many objects total. So we can fake it by pretending all
					 * objects we are writing are the same size. This gives us a
					 * smooth progress meter, and at the end it matches the true
					 * answer.
					 */;
			ModernizedCProgram.written = ModernizedCProgram.reuse_packfile_objects * (((double)(total - to_write)) / total);
			ModernizedCProgram.progress_state.display_progress(ModernizedCProgram.written);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
		ModernizedCProgram.written = ModernizedCProgram.reuse_packfile_objects;
		ModernizedCProgram.progress_state.display_progress(ModernizedCProgram.written);
		return ModernizedCProgram.reuse_packfile_offset - /*Error: Unsupported expression*/;
	}
	public int write_compressed(Object in, int size) {
		git_zstream stream = new git_zstream();
		int status;
		byte[] outbuf = new byte[4096];
		stream.git_deflate_init(ModernizedCProgram.zlib_compression_level);
		stream.setNext_in(in);
		stream.setAvail_in(size);
		long generatedAvail_out = stream.getAvail_out();
		do {
			stream.setNext_out(outbuf);
			stream.setAvail_out(/*Error: sizeof expression not supported yet*/);
			status = stream.git_deflate(Z_FINISH);
			f.hashwrite(outbuf, /*Error: sizeof expression not supported yet*/ - generatedAvail_out);
		} while (status == Z_OK);
		if (status != Z_STREAM_END) {
			ModernizedCProgram.die(ModernizedCProgram._("unable to deflate appended object (%d)"), status);
		} 
		long generatedTotal_out = stream.getTotal_out();
		size = generatedTotal_out;
		stream.git_deflate_end();
		return size;
	}
	public void fix_unresolved_deltas() {
		ref_delta_entry sorted_by_pos = new ref_delta_entry();
		int i;
		/*
			 * Since many unresolved deltas may well be themselves base objects
			 * for more unresolved deltas, we really want to include the
			 * smallest number of base objects that would cover as much delta
			 * as possible by picking the
			 * trunc deltas first, allowing for other deltas to resolve without
			 * additional base objects.  Since most base objects are to be found
			 * before deltas depending on them, a good heuristic is to start
			 * resolving deltas in the same order as their position in the pack.
			 */
		(sorted_by_pos) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (ModernizedCProgram.nr_ref_deltas)));
		for (i = 0; i < ModernizedCProgram.nr_ref_deltas; i++) {
			sorted_by_pos[i] = ModernizedCProgram.ref_deltas[i];
		}
		ModernizedCProgram.sane_qsort((sorted_by_pos), (ModernizedCProgram.nr_ref_deltas), /*Error: sizeof expression not supported yet*/, delta_pos_compare);
		object_id generatedOid = d.getOid();
		int generatedNr = to_fetch.getNr();
		if (ModernizedCProgram.has_promisor_remote()) {
			oid_array to_fetch = new oid_array(((Object)0), 0, 0, 0);
			for (i = 0; i < ModernizedCProgram.nr_ref_deltas; i++) {
				ref_delta_entry d = sorted_by_pos[i];
				if (!ModernizedCProgram.oid_object_info_extended(ModernizedCProgram.the_repository, generatedOid, ((Object)0), (32 | 8))) {
					continue;
				} 
				to_fetch.oid_array_append(generatedOid);
			}
			if (generatedNr) {
				ModernizedCProgram.the_repository.promisor_remote_get_direct(generatedOid, generatedNr);
			} 
			to_fetch.oid_array_clear();
		} 
		base_data base_data = new base_data();
		int generatedObj_no = d.getObj_no();
		long generatedSize = base_obj.getSize();
		Object generatedData = base_obj.getData();
		Object generatedHash = generatedOid.getHash();
		object_entry object_entry = new object_entry();
		for (i = 0; i < ModernizedCProgram.nr_ref_deltas; i++) {
			ref_delta_entry d = sorted_by_pos[i];
			object_type type;
			base_data base_obj = base_data.alloc_base_data();
			if (ModernizedCProgram.objects[generatedObj_no].getReal_type() != object_type.OBJ_REF_DELTA) {
				continue;
			} 
			base_obj.setData(ModernizedCProgram.the_repository.repo_read_object_file(generatedOid, object_type.type, generatedSize));
			if (!generatedData) {
				continue;
			} 
			if (ModernizedCProgram.check_object_signature(generatedOid, generatedData, generatedSize, ModernizedCProgram.type_name(object_type.type))) {
				ModernizedCProgram.die(ModernizedCProgram._("local object %s is corrupt"), ModernizedCProgram.oid_to_hex(generatedOid));
			} 
			base_obj.setObj(object_entry.append_obj_to_pack(f, generatedHash, generatedData, generatedSize, object_type.type));
			base_obj.find_unresolved_deltas();
			ModernizedCProgram.progress.display_progress(ModernizedCProgram.nr_resolved_deltas);
		}
		ModernizedCProgram.free(sorted_by_pos);
	}
	public Object write_pack_header(Object nr_entries) {
		pack_header hdr = new pack_header();
		hdr.setHdr_signature(/*Error: Function owner not recognized*/htonl(-1024));
		hdr.setHdr_version(/*Error: Function owner not recognized*/htonl(2));
		hdr.setHdr_entries(/*Error: Function owner not recognized*/htonl(nr_entries));
		f.hashwrite(hdr, /*Error: sizeof expression not supported yet*/);
		return /*Error: sizeof expression not supported yet*/;
	}
	public hashfile create_tmp_packfile(Byte pack_tmp_name) {
		strbuf tmpname = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int fd;
		fd = tmpname.odb_mkstemp("pack/tmp_pack_XXXXXX");
		pack_tmp_name = tmpname.strbuf_detach(((Object)0));
		hashfile hashfile = new hashfile();
		return hashfile.hashfd(fd, pack_tmp_name);
	}
	public void hashwrite_u8(Object data) {
		f.hashwrite(data, /*Error: sizeof expression not supported yet*/);
	}
	public void hashwrite_be32(Object data) {
		data = /*Error: Function owner not recognized*/htonl(data);
		f.hashwrite(data, /*Error: sizeof expression not supported yet*/);
	}
	public Object write_midx_header(byte num_chunks, Object num_packs) {
		byte[] byte_values = new byte[4];
		f.hashwrite_be32(-1024);
		byte_values[0] = 1;
		byte_values[1] = 1;
		byte_values[2] = num_chunks;
		byte_values[3] = /* unused */0;
		f.hashwrite(byte_values, /*Error: sizeof expression not supported yet*/);
		f.hashwrite_be32(num_packs);
		return 12;
	}
	public void hashflush() {
		int generatedOffset = this.getOffset();
		int offset = generatedOffset;
		git_hash_ctx generatedCtx = this.getCtx();
		Object generatedBuffer = this.getBuffer();
		if (offset) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCtx, generatedBuffer, offset);
			ModernizedCProgram.flush(f, generatedBuffer, offset);
			this.setOffset(0);
		} 
	}
	public int finalize_hashfile(Byte result, int flags) {
		int fd;
		f.hashflush();
		Object generatedBuffer = this.getBuffer();
		git_hash_ctx generatedCtx = this.getCtx();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedBuffer, generatedCtx);
		if (result) {
			ModernizedCProgram.hashcpy(result, generatedBuffer);
		} 
		if (flags & 4) {
			ModernizedCProgram.flush(f, generatedBuffer, ModernizedCProgram.the_repository.getHash_algo().getRawsz());
		} 
		int generatedFd = this.getFd();
		Object generatedName = this.getName();
		if (flags & 2) {
			ModernizedCProgram.fsync_or_die(generatedFd, generatedName);
		} 
		if (flags & 1) {
			if (/*Error: Function owner not recognized*/close(generatedFd)) {
				ModernizedCProgram.die_errno("%s: sha1 file error on close", generatedName);
			} 
			fd = 0;
		} else {
				fd = generatedFd;
		} 
		int generatedCheck_fd = this.getCheck_fd();
		if (0 <= generatedCheck_fd) {
			byte discard;
			int cnt = ModernizedCProgram.read_in_full(generatedCheck_fd, discard, 1);
			if (cnt < 0) {
				ModernizedCProgram.die_errno("%s: error when reading the tail of sha1 file", generatedName);
			} 
			if (cnt) {
				ModernizedCProgram.die("%s: sha1 file has trailing garbage", generatedName);
			} 
			if (/*Error: Function owner not recognized*/close(generatedCheck_fd)) {
				ModernizedCProgram.die_errno("%s: sha1 file error on close", generatedName);
			} 
		} 
		ModernizedCProgram.free(f);
		return fd;
	}
	public void hashwrite(Object buf, int count) {
		int generatedOffset = this.getOffset();
		Object generatedBuffer = this.getBuffer();
		int generatedDo_crc = this.getDo_crc();
		Object generatedCrc32 = this.getCrc32();
		git_hash_ctx generatedCtx = this.getCtx();
		while (count) {
			int offset = generatedOffset;
			int left = /*Error: sizeof expression not supported yet*/ - ModernizedCProgram.offset;
			int nr = count > left ? left : count;
			Object data;
			if (generatedDo_crc) {
				this.setCrc32(/*Error: Function owner not recognized*/crc32(generatedCrc32, buf, nr));
			} 
			if (nr == /*Error: sizeof expression not supported yet*/) {
				data = /* process full buffer directly without copy */buf;
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBuffer + ModernizedCProgram.offset, buf, nr);
					data = generatedBuffer;
			} 
			count -= nr;
			ModernizedCProgram.offset += nr;
			buf = (byte)buf + nr;
			left -= nr;
			if (!left) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCtx, data, ModernizedCProgram.offset);
				ModernizedCProgram.flush(f, data, ModernizedCProgram.offset);
				ModernizedCProgram.offset = 0;
			} 
			this.setOffset(ModernizedCProgram.offset);
		}
	}
	public hashfile hashfd(int fd, Object name) {
		hashfile hashfile = new hashfile();
		return hashfile.hashfd_throughput(fd, name, ((Object)0));
	}
	public hashfile hashfd_check(Object name) {
		int sink;
		int check;
		hashfile f = new hashfile();
		sink = /*Error: Function owner not recognized*/open("/dev/null", 1);
		if (sink < 0) {
			ModernizedCProgram.die_errno("unable to open /dev/null");
		} 
		check = /*Error: Function owner not recognized*/open(name, 0);
		if (check < 0) {
			ModernizedCProgram.die_errno("unable to open '%s'", name);
		} 
		hashfile hashfile = new hashfile();
		f = hashfile.hashfd(sink, name);
		f.setCheck_fd(check);
		return f;
	}
	public hashfile hashfd_throughput(int fd, Object name, progress tp) {
		hashfile f = ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/);
		f.setFd(fd);
		f.setCheck_fd(-1);
		f.setOffset(0);
		f.setTotal(0);
		f.setTp(tp);
		f.setName(name);
		f.setDo_crc(0);
		git_hash_ctx generatedCtx = f.getCtx();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCtx);
		return f;
	}
	public void crc32_begin() {
		this.setCrc32(/*Error: Function owner not recognized*/crc32(0, ((Object)0), 0));
		this.setDo_crc(1);
	}
	public Object crc32_end() {
		this.setDo_crc(0);
		Object generatedCrc32 = this.getCrc32();
		return generatedCrc32;
	}
	public int getFd() {
		return fd;
	}
	public void setFd(int newFd) {
		fd = newFd;
	}
	public int getCheck_fd() {
		return check_fd;
	}
	public void setCheck_fd(int newCheck_fd) {
		check_fd = newCheck_fd;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int newOffset) {
		offset = newOffset;
	}
	public git_hash_ctx getCtx() {
		return ctx;
	}
	public void setCtx(git_hash_ctx newCtx) {
		ctx = newCtx;
	}
	public Object getTotal() {
		return total;
	}
	public void setTotal(Object newTotal) {
		total = newTotal;
	}
	public progress getTp() {
		return tp;
	}
	public void setTp(progress newTp) {
		tp = newTp;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getDo_crc() {
		return do_crc;
	}
	public void setDo_crc(int newDo_crc) {
		do_crc = newDo_crc;
	}
	public Object getCrc32() {
		return crc32;
	}
	public void setCrc32(Object newCrc32) {
		crc32 = newCrc32;
	}
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
	}
}
