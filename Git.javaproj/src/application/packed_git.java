package application;

public class packed_git {
	private packed_git next;
	private list_head mru;
	private pack_window windows;
	private Object pack_size;
	private Object index_data;
	private Object index_size;
	private Object num_objects;
	private Object num_bad_objects;
	private Byte bad_object_sha1;
	private int index_version;
	private Object mtime;
	private int pack_fd;
	private int index;
	private int pack_local;
	private int pack_keep;
	private int pack_keep_in_core;
	private int freshened;
	private int do_not_close;
	private int pack_promisor;
	private int multi_pack_index;
	private Object hash;
	private revindex_entry[] revindex;
	private Object pack_name;
	
	public packed_git(packed_git next, list_head mru, pack_window windows, Object pack_size, Object index_data, Object index_size, Object num_objects, Object num_bad_objects, Byte bad_object_sha1, int index_version, Object mtime, int pack_fd, int index, int pack_local, int pack_keep, int pack_keep_in_core, int freshened, int do_not_close, int pack_promisor, int multi_pack_index, Object hash, revindex_entry[] revindex, Object pack_name) {
		setNext(next);
		setMru(mru);
		setWindows(windows);
		setPack_size(pack_size);
		setIndex_data(index_data);
		setIndex_size(index_size);
		setNum_objects(num_objects);
		setNum_bad_objects(num_bad_objects);
		setBad_object_sha1(bad_object_sha1);
		setIndex_version(index_version);
		setMtime(mtime);
		setPack_fd(pack_fd);
		setIndex(index);
		setPack_local(pack_local);
		setPack_keep(pack_keep);
		setPack_keep_in_core(pack_keep_in_core);
		setFreshened(freshened);
		setDo_not_close(do_not_close);
		setPack_promisor(pack_promisor);
		setMulti_pack_index(multi_pack_index);
		setHash(hash);
		setRevindex(revindex);
		setPack_name(pack_name);
	}
	public packed_git() {
	}
	
	public int mark_packed_unreachable_referents(Object oid, Object pos, Object data) {
		ModernizedCProgram.mark_unreachable_referents(oid);
		return 0/*
		 * Check a single reachable object
		 */;
	}
	public int mark_packed_for_connectivity(Object oid, Object pos, Object data) {
		ModernizedCProgram.mark_object_for_connectivity(oid);
		return 0;
	}
	public int want_found_object(int exclude) {
		if (exclude) {
			return 1;
		} 
		if (ModernizedCProgram.incremental) {
			return 0/*
				 * When asked to do --local (do not include an object that appears in a
				 * pack we borrow from elsewhere) or --honor-pack-keep (do not include
				 * an object that appears in a pack marked with .keep), finding a pack
				 * that matches the criteria is sufficient for us to decide to omit it.
				 * However, even if this pack does not satisfy the criteria, we need to
				 * make sure no copy of this object appears in _any_ pack that makes us
				 * to omit the object, so we need to check all the packs.
				 *
				 * We can however first check whether these options can possible matter;
				 * if they do not matter we know we want the object in generated pack.
				 * Otherwise, we signal "-1" at the end to tell the caller that we do
				 * not know either way, and it needs to check more packs.
				 */;
		} 
		if (!ModernizedCProgram.ignore_packed_keep_on_disk && !ModernizedCProgram.ignore_packed_keep_in_core && (!ModernizedCProgram.local || !ModernizedCProgram.have_non_local_packs)) {
			return 1;
		} 
		int generatedPack_local = this.getPack_local();
		if (ModernizedCProgram.local && !generatedPack_local) {
			return 0;
		} 
		int generatedPack_keep = this.getPack_keep();
		int generatedPack_keep_in_core = this.getPack_keep_in_core();
		if (generatedPack_local && ((ModernizedCProgram.ignore_packed_keep_on_disk && generatedPack_keep) || (ModernizedCProgram.ignore_packed_keep_in_core && generatedPack_keep_in_core))) {
			return 0;
		} 
		return -/* we don't know yet; keep looking for more packs */1/*
		 * Check whether we want the object in the pack (e.g., we do not want
		 * objects found in non-local stores if the "--local" option was used).
		 *
		 * If the caller already knows an existing pack it wants to take the object
		 * from, that is passed in *found_pack and *found_offset; otherwise this
		 * function finds if there is any pack that has the object and returns the pack
		 * and its offset in these variables.
		 */;
	}
	public int want_object_in_pack(Object oid, int exclude, Object found_offset) {
		int want;
		list_head pos = new list_head();
		multi_pack_index m = new multi_pack_index();
		if (!exclude && ModernizedCProgram.local && ModernizedCProgram.has_loose_object_nonlocal(oid)) {
			return 0/*
				 * If we already know the pack object lives in, start checks from that
				 * pack - in the usual case when neither --local was given nor .keep files
				 * are present we will determine the answer right now.
				 */;
		} 
		if (found_pack) {
			want = found_pack.want_found_object(exclude);
			if (want != -1) {
				return want;
			} 
		} 
		packed_git generatedP = e.getP();
		multi_pack_index generatedNext = m.getNext();
		multi_pack_index multi_pack_index = new multi_pack_index();
		for (m = multi_pack_index.get_multi_pack_index(ModernizedCProgram.the_repository); m; m = generatedNext) {
			pack_entry e = new pack_entry();
			if (ModernizedCProgram.fill_midx_entry(ModernizedCProgram.the_repository, oid, e, m)) {
				packed_git p = generatedP;
				off_t offset = new off_t();
				if (p == found_pack) {
					ModernizedCProgram.offset = found_offset;
				} else {
						ModernizedCProgram.offset = p.find_pack_entry_one(oid.getHash());
				} 
				if (ModernizedCProgram.offset) {
					if (!found_pack) {
						if (!p.is_pack_valid()) {
							continue;
						} 
						found_offset = ModernizedCProgram.offset;
						found_pack = p;
					} 
					want = p.want_found_object(exclude);
					if (want != -1) {
						return want;
					} 
				} 
			} 
		}
		list_head list_head = new list_head();
		list_head generatedMru = p.getMru();
		for (pos = generatedNext; pos != (list_head.get_packed_git_mru(ModernizedCProgram.the_repository)); pos = generatedNext) {
			packed_git p = ((packed_git)((byte)(pos) - ((size_t)((packed_git)0).getMru())));
			off_t offset = new off_t();
			if (p == found_pack) {
				ModernizedCProgram.offset = found_offset;
			} else {
					ModernizedCProgram.offset = p.find_pack_entry_one(oid.getHash());
			} 
			if (ModernizedCProgram.offset) {
				if (!found_pack) {
					if (!p.is_pack_valid()) {
						continue;
					} 
					found_offset = ModernizedCProgram.offset;
					found_pack = p;
				} 
				want = p.want_found_object(exclude);
				if (!exclude && want > 0) {
					generatedMru.list_move(list_head.get_packed_git_mru(ModernizedCProgram.the_repository));
				} 
				if (want != -1) {
					return want;
				} 
			} 
		}
		return 1;
	}
	public void create_object_entry(Object oid, object_type type, Object hash, int exclude, int no_try_delta, Object found_offset) {
		object_entry entry = new object_entry();
		entry = /*Error: Function owner not recognized*/packlist_alloc(ModernizedCProgram.to_pack, oid);
		entry.setHash(hash);
		entry.oe_set_type(object_type.type);
		if (exclude) {
			entry.setPreferred_base(1);
		} else {
				ModernizedCProgram.nr_result++;
		} 
		if (found_pack) {
			ModernizedCProgram.oe_set_in_pack(ModernizedCProgram.to_pack, entry, found_pack);
			entry.setIn_pack_offset(found_offset);
		} 
		entry.setNo_try_delta(no_try_delta);
	}
	public int add_object_entry_from_bitmap(Object oid, object_type type, int flags, Object name_hash, Object offset) {
		ModernizedCProgram.progress_state.display_progress(++ModernizedCProgram.nr_seen);
		if (ModernizedCProgram.have_duplicate_entry(oid, 0)) {
			return 0;
		} 
		if (!pack.want_object_in_pack(oid, 0, offset)) {
			return 0;
		} 
		pack.create_object_entry(oid, object_type.type, name_hash, 0, 0, offset);
		return 1;
	}
	public Byte pack_bitmap_filename() {
		size_t len = new size_t();
		Object generatedPack_name = this.getPack_name();
		if (!ModernizedCProgram.strip_suffix(generatedPack_name, ".pack", len)) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\pack-bitmap.c", 258, "pack_name does not end in .pack");
		} 
		return ModernizedCProgram.xstrfmt("%.*s.bitmap", (int)len, generatedPack_name);
	}
	public int add_recent_packed(Object oid, Object pos, Object data) {
		object object = new object();
		object obj = object.lookup_object(ModernizedCProgram.the_repository, oid);
		int generatedFlags = obj.getFlags();
		if (obj && generatedFlags & (-1024 << 0)) {
			return 0;
		} 
		Object generatedMtime = this.getMtime();
		data.add_recent_object(oid, generatedMtime);
		return 0;
	}
	public int mark_object_seen(Object oid, object_type type, int exclude, Object name_hash, Object found_offset) {
		object obj = ModernizedCProgram.the_repository.lookup_object_by_type(oid, object_type.type);
		if (!obj) {
			ModernizedCProgram.die("unable to create object '%s'", ModernizedCProgram.oid_to_hex(oid));
		} 
		int generatedFlags = obj.getFlags();
		generatedFlags |=  (-1024 << 0);
		return 0;
	}
	public packed_git find_base_packs(string_list packs, long limit) {
		packed_git p = new packed_git();
		packed_git base = ((Object)0);
		int generatedPack_local = p.getPack_local();
		Object generatedPack_size = p.getPack_size();
		Object generatedPack_name = p.getPack_name();
		string_list_item string_list_item = new string_list_item();
		packed_git generatedNext = p.getNext();
		packed_git packed_git = new packed_git();
		for (p = packed_git.get_all_packs(ModernizedCProgram.the_repository); p; p = generatedNext) {
			if (!generatedPack_local) {
				continue;
			} 
			if (limit) {
				if (generatedPack_size >= limit) {
					string_list_item.string_list_append(packs, generatedPack_name);
				} 
			}  else if (!base || generatedPack_size < generatedPack_size) {
				base = p;
			} 
		}
		if (base) {
			string_list_item.string_list_append(packs, generatedPack_name);
		} 
		return base;
	}
	public Object estimate_repack_memory() {
		long nr_objects = ModernizedCProgram.the_repository.repo_approximate_object_count();
		size_t os_cache = new size_t();
		size_t heap = new size_t();
		if (!pack || !nr_objects) {
			return 0/*
				 * First we have to scan through at least one pack.
				 * Assume enough room in OS file cache to keep the entire pack
				 * or we may accidentally evict data of other processes from
				 * the cache.
				 */;
		} 
		Object generatedPack_size = this.getPack_size();
		Object generatedIndex_size = this.getIndex_size();
		os_cache = generatedPack_size + generatedIndex_size;
		heap = /*Error: Unsupported expression*/ * /* then pack-objects needs lots more for book keeping */nr_objects/*
			 * internal rev-list --all --objects takes up some memory too,
			 * let's say half of it is for blobs
			 */;
		heap += /*Error: Unsupported expression*/ * nr_objects / 2/*
			 * and the other half is for trees (commits and tags are
			 * usually insignificant)
			 */;
		heap += /*Error: Unsupported expression*/ * nr_objects / 2;
		heap += /*Error: Unsupported expression*/ * /* and then obj_hash[], underestimated in fact */nr_objects;
		heap += /*Error: Unsupported expression*/ * /* revindex is used also */nr_objects/*
			 * read_sha1_file() (either at delta calculation phase, or
			 * writing phase) also fills up the delta base cache
			 */;
		heap += ModernizedCProgram.delta_base_cache_limit;
		heap += /* and of course pack-objects has its own delta cache */ModernizedCProgram.max_delta_cache_size;
		return os_cache + heap;
	}
	public Object sizeof_union(packed_git p2) {
		size_t ret = 0;
		long p1_off = 0;
		long p2_off = 0;
		long p1_step;
		long p2_step;
		byte p1_base;
		byte p2_base;
		int hashsz = ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		Object generatedIndex_data = this.getIndex_data();
		p1_base = generatedIndex_data;
		p2_base = generatedIndex_data;
		int generatedIndex_version = this.getIndex_version();
		p1_base += 256 * 4 + ((generatedIndex_version < 2) ? 4 : 8);
		p2_base += 256 * 4 + ((generatedIndex_version < 2) ? 4 : 8);
		p1_step = hashsz + ((generatedIndex_version < 2) ? 4 : 0);
		p2_step = hashsz + ((generatedIndex_version < 2) ? 4 : 0);
		Object generatedNum_objects = this.getNum_objects();
		while (p1_off < generatedNum_objects * p1_step && p2_off < generatedNum_objects * p2_step) {
			int cmp = ModernizedCProgram.hashcmp(p1_base + p1_off, p2_base + p2_off);
			if (cmp == /* cmp ~ p1 - p2 */0) {
				ret++;
				p1_off += p1_step;
				p2_off += p2_step;
				continue;
			} 
			if (cmp < /* p1 has the object, p2 doesn't */0) {
				p1_off += p1_step;
			} else {
					p2_off += /* p2 has the object, p1 doesn't */p2_step;
			} 
		}
		return ret;
	}
	public int show_object_fast(Object oid, object_type type, int exclude, Object name_hash, Object found_offset) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s\n", ModernizedCProgram.oid_to_hex(oid));
		return 1;
	}
	public int verify_pack_index() {
		off_t index_size = new off_t();
		byte index_base;
		git_hash_ctx ctx = new git_hash_ctx();
		byte[] hash = new byte[32];
		int err = 0;
		if (p.open_pack_index()) {
			return ();
		} 
		Object generatedIndex_size = this.getIndex_size();
		index_size = generatedIndex_size;
		Object generatedIndex_data = this.getIndex_data();
		index_base = generatedIndex_data;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(/* Verify SHA1 sum of the index file */ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ctx, index_base, (int)(index_size - ModernizedCProgram.the_repository.getHash_algo().getRawsz()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(hash, ctx);
		if (!ModernizedCProgram.hasheq(hash, index_base + index_size - ModernizedCProgram.the_repository.getHash_algo().getRawsz())) {
			err = ();
		} 
		return err;
	}
	/*
	 * Ordered list of offsets of objects in the pack.
	 */
	public void create_pack_revindex() {
		Object generatedNum_objects = this.getNum_objects();
		int num_ent = generatedNum_objects;
		int i;
		Object generatedIndex_data = this.getIndex_data();
		byte index = generatedIndex_data;
		int hashsz = ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		revindex_entry[] generatedRevindex = this.getRevindex();
		(generatedRevindex) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (num_ent + 1)));
		index += 4 * 256;
		int generatedIndex_version = this.getIndex_version();
		if (generatedIndex_version > 1) {
			uint32_t off_32 = (uint32_t)(index + 8 + generatedNum_objects * (hashsz + 4));
			uint32_t off_64 = off_32 + generatedNum_objects;
			for (i = 0; i < num_ent; i++) {
				uint32_t off = /*Error: Function owner not recognized*/ntohl(off_32++);
				if (!(off & -1024)) {
					generatedRevindex[i].setOffset(off);
				} else {
						generatedRevindex[i].setOffset(/*Error: Function owner not recognized*/get_be64(off_64));
						off_64 += 2;
				} 
				generatedRevindex[i].setNr(i);
			}
		} else {
				for (i = 0; i < num_ent; i++) {
					uint32_t hl = ((uint32_t)(index + (hashsz + 4) * i));
					generatedRevindex[i].setOffset(/*Error: Function owner not recognized*/ntohl(hl));
					generatedRevindex[i].setNr(i);
				}
		} 
		Object generatedPack_size = this.getPack_size();
		generatedRevindex[num_ent].setOffset(generatedPack_size - /*
			 * This knows the pack format -- the hash trailer
			 * follows immediately after the last object data.
			 */hashsz);
		generatedRevindex[num_ent].setNr(-1);
		generatedRevindex.sort_revindex(num_ent, generatedPack_size);
	}
	public int load_pack_revindex() {
		revindex_entry[] generatedRevindex = this.getRevindex();
		if (!generatedRevindex) {
			if (p.open_pack_index()) {
				return -1;
			} 
			p.create_pack_revindex();
		} 
		return 0;
	}
	public int find_revindex_position(Object ofs) {
		int lo = 0;
		Object generatedNum_objects = this.getNum_objects();
		int hi = generatedNum_objects + 1;
		revindex_entry[] generatedRevindex = this.getRevindex();
		revindex_entry revindex = generatedRevindex;
		do {
			int mi = lo + (hi - lo) / 2;
			if (revindex[mi].getOffset() == ofs) {
				return mi;
			}  else if (ofs < revindex[mi].getOffset()) {
				hi = mi;
			} else {
					lo = mi + 1;
			} 
		} while (lo < hi);
		();
		return -1;
	}
	public packed_git oe_in_pack(Object pack, Object e) {
		if (pack.getIn_pack_by_idx()) {
			return pack.getIn_pack_by_idx()[e.getIn_pack_idx()];
		} else {
				return pack.getIn_pack()[e - pack.getObjects()];
		} 
	}
	public int fetch_and_setup_pack_index(Byte sha1, Object base_url) {
		packed_git new_pack = new packed_git();
		byte tmp_idx = ((Object)0);
		int ret;
		packed_git packed_git = new packed_git();
		if (ModernizedCProgram.has_pack_index(sha1)) {
			new_pack = packed_git.parse_pack_index(sha1, ModernizedCProgram.sha1_pack_index_name(sha1));
			if (!new_pack) {
				return -/* parse_pack_index() already issued error message */1;
			} 
			;
		} 
		tmp_idx = ModernizedCProgram.fetch_pack_index(sha1, base_url);
		if (!tmp_idx) {
			return -1;
		} 
		new_pack = packed_git.parse_pack_index(sha1, tmp_idx);
		if (!new_pack) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(tmp_idx);
			ModernizedCProgram.free(tmp_idx);
			return -/* parse_pack_index() already issued error message */1;
		} 
		ret = new_pack.verify_pack_index();
		if (!ret) {
			new_pack.close_pack_index();
			ret = ModernizedCProgram.finalize_object_file(tmp_idx, ModernizedCProgram.sha1_pack_index_name(sha1));
		} 
		ModernizedCProgram.free(tmp_idx);
		if (ret) {
			return -1;
		} 
		packs_head = new_pack;
		return 0;
	}
	public int http_get_info_packs(Object base_url) {
		http_get_options options = new http_get_options(0);
		int ret = 0;
		byte url;
		byte data;
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		object_id oid = new object_id();
		buf.end_url_with_slash(base_url);
		buf.strbuf_addstr("objects/info/packs");
		url = buf.strbuf_detach(((Object)0));
		options.setNo_cache(1);
		ret = ModernizedCProgram.http_get_strbuf(url, buf, options);
		if (ret != 0) {
			;
		} 
		byte[] generatedBuf = buf.getBuf();
		data = generatedBuf;
		Object generatedHash = oid.getHash();
		while (data) {
			if (ModernizedCProgram.skip_prefix(data, "P pack-", data) && !oid.parse_oid_hex(data, data) && ModernizedCProgram.skip_prefix(data, ".pack", data) && (data == (byte)'\n' || data == (byte)'\0')) {
				packs_head.fetch_and_setup_pack_index(generatedHash, base_url);
			} else {
					data = ModernizedCProgram.gitstrchrnul(data, (byte)'\n');
			} 
			if (data) {
				/* skip past newline */data++;
			} 
		}
		return ret;
	}
	public int check_packed_git_idx(Object path) {
		Object idx_map;
		size_t idx_size = new size_t();
		int fd = ModernizedCProgram.git_open_cloexec(path, 0);
		int ret;
		stat st = new stat();
		int hashsz = ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		if (fd < 0) {
			return -1;
		} 
		if (/*Error: Function owner not recognized*/fstat(fd, st)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
			return -1;
		} 
		Object generatedSt_size = st.getSt_size();
		idx_size = ModernizedCProgram.xsize_t(generatedSt_size);
		if (idx_size < 4 * 256 + hashsz + hashsz) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
			return ();
		} 
		idx_map = ModernizedCProgram.xmmap(((Object)0), idx_size, PROT_READ, MAP_PRIVATE, fd, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
		ret = p.load_idx(path, hashsz, idx_map, idx_size);
		if (ret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/munmap(idx_map, idx_size);
		} 
		return ret;
	}
	public int load_idx(Object path, Object hashsz, Object idx_map, Object idx_size) {
		pack_idx_header hdr = idx_map;
		uint32_t version = new uint32_t();
		uint32_t nr = new uint32_t();
		uint32_t i = new uint32_t();
		uint32_t index = new uint32_t();
		if (idx_size < 4 * 256 + hashsz + hashsz) {
			return ();
		} 
		if (idx_map == ((Object)0)) {
			return ();
		} 
		Object generatedIdx_signature = hdr.getIdx_signature();
		Object generatedIdx_version = hdr.getIdx_version();
		if (generatedIdx_signature == /*Error: Function owner not recognized*/htonl(-1024)) {
			version = /*Error: Function owner not recognized*/ntohl(generatedIdx_version);
			if (version < 2 || version > 2) {
				return ();
			} 
		} else {
				version = 1;
		} 
		nr = 0;
		index = idx_map;
		if (version > 1) {
			index += /* skip index header */2;
		} 
		for (i = 0; i < 256; i++) {
			uint32_t n = /*Error: Function owner not recognized*/ntohl(index[i]);
			if (n < nr) {
				return ();
			} 
			nr = n;
		}
		if (version == 1/*
				 * Total size:
				 *  - 256 index entries 4 bytes each
				 *  - 24-byte entries * nr (object ID + 4-byte offset)
				 *  - hash of the packfile
				 *  - file checksum
				 */) {
			if (idx_size != 4 * 256 + nr * (hashsz + 4) + hashsz + hashsz) {
				return ();
			} 
		}  else if (version == 2/*
				 * Minimum size:
				 *  - 8 bytes of header
				 *  - 256 index entries 4 bytes each
				 *  - object ID entry * nr
				 *  - 4-byte crc entry * nr
				 *  - 4-byte offset entry * nr
				 *  - hash of the packfile
				 *  - file checksum
				 * And after the 4-byte offset table might be a
				 * variable sized table containing 8-byte entries
				 * for offsets larger than 2^31.
				 */) {
			long min_size = 8 + 4 * 256 + nr * (hashsz + 4 + 4) + hashsz + hashsz;
			long max_size = min_size;
			if (nr) {
				max_size += (nr - 1) * 8;
			} 
			if (idx_size < min_size || idx_size > max_size) {
				return ();
			} 
			if (idx_size != min_size/*
					     * make sure we can deal with large pack offsets.
					     * 31-bit signed offset won't be enough, neither
					     * 32-bit unsigned one will be.
					     */ && (/*Error: Unsupported expression*/ <= 4)) {
				return ();
			} 
		} 
		this.setIndex_version(version);
		this.setIndex_data(idx_map);
		this.setIndex_size(idx_size);
		this.setNum_objects(nr);
		return 0;
	}
	public int open_pack_index() {
		byte idx_name;
		size_t len = new size_t();
		int ret;
		Object generatedIndex_data = this.getIndex_data();
		if (generatedIndex_data) {
			return 0;
		} 
		Object generatedPack_name = this.getPack_name();
		if (!ModernizedCProgram.strip_suffix(generatedPack_name, ".pack", len)) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\packfile.c", 200, "pack_name does not end in .pack");
		} 
		idx_name = ModernizedCProgram.xstrfmt("%.*s.idx", (int)len, generatedPack_name);
		ret = p.check_packed_git_idx(idx_name);
		ModernizedCProgram.free(idx_name);
		return ret;
	}
	public Object get_pack_fanout(Object value) {
		Object generatedIndex_data = this.getIndex_data();
		uint32_t level1_ofs = generatedIndex_data;
		if (!level1_ofs) {
			if (p.open_pack_index()) {
				return 0;
			} 
			level1_ofs = generatedIndex_data;
		} 
		int generatedIndex_version = this.getIndex_version();
		if (generatedIndex_version > 1) {
			level1_ofs += 2;
		} 
		return /*Error: Function owner not recognized*/ntohl(level1_ofs[value]);
	}
	public packed_git alloc_packed_git(int extra) {
		packed_git p = ModernizedCProgram.xmalloc(ModernizedCProgram.st_add(/*Error: sizeof expression not supported yet*/, extra));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(p, 0, /*Error: sizeof expression not supported yet*/);
		p.setPack_fd(-1);
		return p;
	}
	public packed_git parse_pack_index(Byte sha1, Object idx_path) {
		byte path = ModernizedCProgram.sha1_pack_name(sha1);
		size_t alloc = ModernizedCProgram.st_add(/*Error: Function owner not recognized*/strlen(path), 1);
		packed_git packed_git = new packed_git();
		packed_git p = packed_git.alloc_packed_git(alloc);
		Object generatedPack_name = p.getPack_name();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPack_name, path, /* includes NUL */alloc);
		Object generatedHash = p.getHash();
		ModernizedCProgram.hashcpy(generatedHash, sha1);
		if (p.check_packed_git_idx(idx_path)) {
			ModernizedCProgram.free(p);
			return ((Object)0);
		} 
		return p;
	}
	public int unuse_one_window() {
		packed_git p = new packed_git();
		packed_git lru_p = ((Object)0);
		pack_window lru_w = ((Object)0);
		pack_window lru_l = ((Object)0);
		if (current) {
			ModernizedCProgram.scan_windows(current, lru_p, lru_w, lru_l);
		} 
		packed_git generatedNext = p.getNext();
		for (p = ModernizedCProgram.the_repository.getObjects().getPacked_git(); p; p = generatedNext) {
			ModernizedCProgram.scan_windows(p, lru_p, lru_w, lru_l);
		}
		Byte generatedBase = lru_w.getBase();
		Object generatedLen = lru_w.getLen();
		if (lru_p) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/munmap(generatedBase, generatedLen);
			ModernizedCProgram.pack_mapped -= generatedLen;
			if (lru_l) {
				lru_l.setNext(generatedNext);
			} else {
					lru_p.setWindows(generatedNext);
			} 
			ModernizedCProgram.free(lru_w);
			ModernizedCProgram.pack_open_windows--;
			return 1;
		} 
		return 0;
	}
	public void close_pack_windows() {
		pack_window generatedWindows = this.getWindows();
		int generatedInuse_cnt = w.getInuse_cnt();
		Object generatedPack_name = this.getPack_name();
		Byte generatedBase = w.getBase();
		Object generatedLen = w.getLen();
		pack_window generatedNext = w.getNext();
		while (generatedWindows) {
			pack_window w = generatedWindows;
			if (generatedInuse_cnt) {
				ModernizedCProgram.die("pack '%s' still has open windows to it", generatedPack_name);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/munmap(generatedBase, generatedLen);
			ModernizedCProgram.pack_mapped -= generatedLen;
			ModernizedCProgram.pack_open_windows--;
			this.setWindows(generatedNext);
			ModernizedCProgram.free(w);
		}
	}
	public int close_pack_fd() {
		int generatedPack_fd = this.getPack_fd();
		if (generatedPack_fd < 0) {
			return 0;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedPack_fd);
		ModernizedCProgram.pack_open_fds--;
		this.setPack_fd(-1);
		return 1;
	}
	public void close_pack_index() {
		Object generatedIndex_data = this.getIndex_data();
		Object generatedIndex_size = this.getIndex_size();
		if (generatedIndex_data) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/munmap((Object)generatedIndex_data, generatedIndex_size);
			this.setIndex_data(((Object)0));
		} 
	}
	public void close_pack() {
		p.close_pack_windows();
		p.close_pack_fd();
		p.close_pack_index();
	}
	public Object pack_basename() {
		Object generatedPack_name = this.getPack_name();
		byte ret = /*Error: Function owner not recognized*/strrchr(generatedPack_name, (byte)'/');
		if (ret) {
			ret = ret + /* skip past slash */1;
		} else {
				ret = generatedPack_name;
		} 
		return ret/*
		 * Do not call this directly as this leaks p->pack_fd on error return;
		 * call open_packed_git() instead.
		 */;
	}
	public int open_packed_git_1() {
		stat st = new stat();
		pack_header hdr = new pack_header();
		byte[] hash = new byte[32];
		byte idx_hash;
		long fd_flag;
		ssize_t read_result = new ssize_t();
		int hashsz = ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		Object generatedIndex_data = this.getIndex_data();
		multi_pack_index generatedNext = m.getNext();
		if (!generatedIndex_data) {
			multi_pack_index m = new multi_pack_index();
			byte pack_name = p.pack_basename();
			for (m = ModernizedCProgram.the_repository.getObjects().getMulti_pack_index(); m; m = generatedNext) {
				if (m.midx_contains_pack(pack_name)) {
					break;
				} 
			}
			if (!m && p.open_pack_index()) {
				return ();
			} 
		} 
		if (!ModernizedCProgram.pack_max_fds) {
			int max_fds = ModernizedCProgram.get_max_fd_limit();
			if (25 < /* Save 3 for stdin/stdout/stderr, 22 for work */max_fds) {
				ModernizedCProgram.pack_max_fds = max_fds - 25;
			} else {
					ModernizedCProgram.pack_max_fds = 1;
			} 
		} 
		while (ModernizedCProgram.pack_max_fds <= ModernizedCProgram.pack_open_fds && ModernizedCProgram.close_one_pack()) {
			;
		}
		Object generatedPack_name = this.getPack_name();
		this.setPack_fd(ModernizedCProgram.git_open_cloexec(generatedPack_name, 0));
		int generatedPack_fd = this.getPack_fd();
		if (generatedPack_fd < 0 || /*Error: Function owner not recognized*/fstat(generatedPack_fd, st)) {
			return -1;
		} 
		ModernizedCProgram.pack_open_fds++;
		Object generatedPack_size = this.getPack_size();
		Object generatedSt_mode = st.getSt_mode();
		Object generatedSt_size = st.getSt_size();
		if (!generatedPack_size) {
			if (!(((generatedSt_mode) & -1024) == -1024)) {
				return ();
			} 
			this.setPack_size(generatedSt_size);
		}  else if (generatedPack_size != generatedSt_size) {
			return ();
		} 
		fd_flag = ModernizedCProgram.fcntl(generatedPack_fd, F_GETFD, 0);
		if (fd_flag < 0) {
			return ();
		} 
		fd_flag |=  FD_CLOEXEC;
		if (ModernizedCProgram.fcntl(generatedPack_fd, F_SETFD, fd_flag) == -1) {
			return ();
		} 
		read_result = ModernizedCProgram.read_in_full(generatedPack_fd, hdr, /*Error: sizeof expression not supported yet*/);
		if (read_result < 0) {
			return ();
		} 
		if (read_result != /*Error: sizeof expression not supported yet*/) {
			return ();
		} 
		Object generatedHdr_signature = hdr.getHdr_signature();
		if (generatedHdr_signature != /*Error: Function owner not recognized*/htonl(-1024)) {
			return ();
		} 
		Object generatedHdr_version = hdr.getHdr_version();
		if (!((generatedHdr_version) == /*Error: Function owner not recognized*/htonl(2) || (generatedHdr_version) == /*Error: Function owner not recognized*/htonl(3))) {
			return ();
		} 
		if (!generatedIndex_data) {
			return 0;
		} 
		Object generatedNum_objects = this.getNum_objects();
		Object generatedHdr_entries = hdr.getHdr_entries();
		if (generatedNum_objects != /*Error: Function owner not recognized*/ntohl(generatedHdr_entries)) {
			return ();
		} 
		if (/*Error: Function owner not recognized*/lseek(generatedPack_fd, generatedPack_size - hashsz, 0) == -1) {
			return ();
		} 
		read_result = ModernizedCProgram.read_in_full(generatedPack_fd, hash, hashsz);
		if (read_result < 0) {
			return ();
		} 
		if (read_result != hashsz) {
			return ();
		} 
		Object generatedIndex_size = this.getIndex_size();
		idx_hash = ((byte)generatedIndex_data) + generatedIndex_size - hashsz * 2;
		if (!ModernizedCProgram.hasheq(hash, idx_hash)) {
			return ();
		} 
		return 0;
	}
	public int open_packed_git() {
		if (!p.open_packed_git_1()) {
			return 0;
		} 
		p.close_pack_fd();
		return -1;
	}
	public packed_git add_packed_git(Object path, Object path_len, int local) {
		stat st = new stat();
		size_t alloc = new size_t();
		packed_git p = new packed_git();
		/*
			 * Make sure a corresponding .pack file exists and that
			 * the index looks sane.
			 */
		if (!ModernizedCProgram.strip_suffix_mem(path, path_len, ".idx")) {
			return ((Object)0/*
				 * ".promisor" is long enough to hold any suffix we're adding (and
				 * the use xsnprintf double-checks that)
				 */);
		} 
		alloc = ModernizedCProgram.st_add(ModernizedCProgram.st_add((path_len), (/*Error: Function owner not recognized*/strlen(".promisor"))), (true));
		packed_git packed_git = new packed_git();
		p = packed_git.alloc_packed_git(alloc);
		Object generatedPack_name = p.getPack_name();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPack_name, path, path_len);
		ModernizedCProgram.xsnprintf(generatedPack_name + path_len, alloc - path_len, ".keep");
		if (!/*Error: Function owner not recognized*/access(generatedPack_name, 0)) {
			p.setPack_keep(1);
		} 
		ModernizedCProgram.xsnprintf(generatedPack_name + path_len, alloc - path_len, ".promisor");
		if (!/*Error: Function owner not recognized*/access(generatedPack_name, 0)) {
			p.setPack_promisor(1);
		} 
		ModernizedCProgram.xsnprintf(generatedPack_name + path_len, alloc - path_len, ".pack");
		Object generatedSt_mode = st.getSt_mode();
		if (/*Error: Function owner not recognized*/stat(generatedPack_name, st) || !(((generatedSt_mode) & -1024) == -1024)) {
			ModernizedCProgram.free(p);
			return ((Object)0);
		} 
		Object generatedSt_size = st.getSt_size();
		p.setPack_size(generatedSt_size);
		p.setPack_local(local);
		Object generatedSt_mtime = st.getSt_mtime();
		p.setMtime(generatedSt_mtime);
		Object generatedHash = p.getHash();
		if (path_len < ModernizedCProgram.the_repository.getHash_algo().getHexsz() || ModernizedCProgram.get_sha1_hex(path + path_len - ModernizedCProgram.the_repository.getHash_algo().getHexsz(), generatedHash)) {
			ModernizedCProgram.hashclr(generatedHash);
		} 
		return p;
	}
	public packed_git get_packed_git(repository r) {
		r.prepare_packed_git();
		raw_object_store generatedObjects = r.getObjects();
		packed_git generatedPacked_git = generatedObjects.getPacked_git();
		return generatedPacked_git;
	}
	public packed_git get_all_packs(repository r) {
		multi_pack_index m = new multi_pack_index();
		r.prepare_packed_git();
		Object generatedNum_packs = m.getNum_packs();
		multi_pack_index generatedNext = m.getNext();
		raw_object_store generatedObjects = r.getObjects();
		multi_pack_index generatedMulti_pack_index = generatedObjects.getMulti_pack_index();
		for (m = generatedMulti_pack_index; m; m = generatedNext) {
			uint32_t i = new uint32_t();
			for (i = 0; i < generatedNum_packs; i++) {
				ModernizedCProgram.prepare_midx_pack(r, m, i);
			}
		}
		packed_git generatedPacked_git = generatedObjects.getPacked_git();
		return generatedPacked_git;
	}
	public void mark_bad_packed_object(Object sha1) {
		int i;
		int hashsz = ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		Object generatedNum_bad_objects = this.getNum_bad_objects();
		Byte generatedBad_object_sha1 = this.getBad_object_sha1();
		for (i = 0; i < generatedNum_bad_objects; i++) {
			if (ModernizedCProgram.hasheq(sha1, generatedBad_object_sha1 + hashsz * i)) {
				return /*Error: Unsupported expression*/;
			} 
		}
		this.setBad_object_sha1(ModernizedCProgram.xrealloc(generatedBad_object_sha1, ModernizedCProgram.st_mult(32, ModernizedCProgram.st_add(generatedNum_bad_objects, 1))));
		ModernizedCProgram.hashcpy(generatedBad_object_sha1 + hashsz * generatedNum_bad_objects, sha1);
		generatedNum_bad_objects++;
	}
	public int pack_entry_hash(Object base_offset) {
		int hash;
		hash = (int)(intptr_t)p + (int)base_offset;
		hash += (hash >> 8) + (hash >> 16);
		return hash;
	}
	public int in_delta_base_cache(Object base_offset) {
		delta_base_cache_entry delta_base_cache_entry = new delta_base_cache_entry();
		return !!delta_base_cache_entry.get_delta_base_cache_entry(p, base_offset/*
		 * Remove the entry from the cache, but do _not_ free the associated
		 * entry data. The caller takes ownership of the "data" buffer, and
		 * should copy out any fields it wants before detaching.
		 */);
	}
	public void add_delta_base_cache(Object base_offset, Object base, long base_size, object_type type) {
		delta_base_cache_entry ent = ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/);
		list_head lru = new list_head();
		list_head tmp = new list_head();
		ModernizedCProgram.delta_base_cached += base_size;
		for (; lru != (ModernizedCProgram.delta_base_cache_lru); ) {
			delta_base_cache_entry f = ((delta_base_cache_entry)((byte)(lru) - ((size_t)((delta_base_cache_entry)0).getLru())));
			if (ModernizedCProgram.delta_base_cached <= ModernizedCProgram.delta_base_cache_limit) {
				break;
			} 
			f.release_delta_base_cache();
		}
		delta_base_cache_key generatedKey = ent.getKey();
		generatedKey.setP(p);
		generatedKey.setBase_offset(base_offset);
		ent.setType(object_type.type);
		ent.setData(base);
		ent.setSize(base_size);
		list_head generatedLru = ent.getLru();
		generatedLru.list_add_tail(ModernizedCProgram.delta_base_cache_lru);
		if (!ModernizedCProgram.delta_base_cache.getCmpfn()) {
			ModernizedCProgram.delta_base_cache.hashmap_init(delta_base_cache_hash_cmp, ((Object)0), 0);
		} 
		hashmap_entry generatedEnt = ent.getEnt();
		generatedEnt.hashmap_entry_init(p.pack_entry_hash(base_offset));
		ModernizedCProgram.hashmap_add(ModernizedCProgram.delta_base_cache, generatedEnt);
	}
	public void write_pack_access_log(Object obj_offset) {
		trace_key pack_access = new trace_key("GIT_TRACE_PACK_ACCESS", 0, 0, 0);
		Object generatedPack_name = this.getPack_name();
		do {
			if (pack_access.trace_pass_fl()) {
				pack_access.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\packfile.c", 1609, "%s %llu\n", generatedPack_name, (uintmax_t)obj_offset);
			} 
		} while (0);
	}
	public Object nth_packed_object_sha1(Object n) {
		Object generatedIndex_data = this.getIndex_data();
		byte index = generatedIndex_data;
		int hashsz = ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		if (!index) {
			if (p.open_pack_index()) {
				return ((Object)0);
			} 
			index = generatedIndex_data;
		} 
		Object generatedNum_objects = this.getNum_objects();
		if (n >= generatedNum_objects) {
			return ((Object)0);
		} 
		index += 4 * 256;
		int generatedIndex_version = this.getIndex_version();
		if (generatedIndex_version == 1) {
			return index + (hashsz + 4) * n + 4;
		} else {
				index += 8;
				return index + hashsz * n;
		} 
	}
	public Object find_pack_entry_one(Object sha1) {
		Object generatedIndex_data = this.getIndex_data();
		byte index = generatedIndex_data;
		object_id oid = new object_id();
		uint32_t result = new uint32_t();
		if (!index) {
			if (p.open_pack_index()) {
				return 0;
			} 
		} 
		Object generatedHash = oid.getHash();
		ModernizedCProgram.hashcpy(generatedHash, sha1);
		if (ModernizedCProgram.bsearch_pack(oid, p, result)) {
			return ModernizedCProgram.nth_packed_object_offset(p, result);
		} 
		return 0;
	}
	public int is_pack_valid() {
		int generatedPack_fd = this.getPack_fd();
		if (generatedPack_fd != -/* An already open pack is known to be valid. */1) {
			return 1/* If the pack has one window completely covering the
				 * file size, the pack is known to be valid even if
				 * the descriptor is not currently open.
				 */;
		} 
		pack_window generatedWindows = this.getWindows();
		Object generatedOffset = w.getOffset();
		Object generatedLen = w.getLen();
		Object generatedPack_size = this.getPack_size();
		if (generatedWindows) {
			pack_window w = generatedWindows;
			if (!generatedOffset && generatedLen == generatedPack_size) {
				return 1;
			} 
		} 
		return !/* Force the pack to open to prove its valid. */p.open_packed_git();
	}
	public packed_git find_sha1_pack(Object sha1) {
		packed_git p = new packed_git();
		packed_git generatedNext = p.getNext();
		for (p = packs; p; p = generatedNext) {
			if (p.find_pack_entry_one(sha1)) {
				return p;
			} 
		}
		return ((Object)0);
	}
	public int for_each_object_in_pack(Object cb, Object data, for_each_object_flags flags) {
		uint32_t i = new uint32_t();
		int r = 0;
		if (for_each_object_flags.flags & for_each_object_flags.FOR_EACH_OBJECT_PACK_ORDER) {
			if (p.load_pack_revindex()) {
				return -1;
			} 
		} 
		Object generatedNum_objects = this.getNum_objects();
		revindex_entry[] generatedRevindex = this.getRevindex();
		for (i = 0; i < generatedNum_objects; i++) {
			uint32_t pos = new uint32_t();
			object_id oid = new object_id();
			if (for_each_object_flags.flags & for_each_object_flags.FOR_EACH_OBJECT_PACK_ORDER) {
				pos = generatedRevindex[i].getNr();
			} else {
					pos = i;
			} 
			if (!ModernizedCProgram.nth_packed_object_oid(oid, p, pos)) {
				return ();
			} 
			r = /*Error: Function owner not recognized*/cb(oid, p, pos, data);
			if (r) {
				break;
			} 
		}
		return r;
	}
	public int add_promisor_object(Object oid, Object pos, Object set_) {
		oidset set = set_;
		object object = new object();
		object obj = object.parse_object(ModernizedCProgram.the_repository, oid);
		if (!obj) {
			return 1;
		} 
		set.oidset_insert(oid/*
			 * If this is a tree, commit, or tag, the objects it refers
			 * to are also promisor objects. (Blobs refer to no objects->)
			 */);
		int generatedType = obj.getType();
		Object generatedBuffer = tree.getBuffer();
		long generatedSize = tree.getSize();
		object_id generatedOid = entry.getOid();
		commit_list generatedParents = commit.getParents();
		commit_list generatedNext = parents.getNext();
		if (generatedType == object_type.OBJ_TREE) {
			tree tree = (tree)obj;
			tree_desc desc = new tree_desc();
			name_entry entry = new name_entry();
			if (desc.init_tree_desc_gently(generatedBuffer, generatedSize)) {
				return 0;
			} 
			while (ModernizedCProgram.tree_entry_gently(desc, entry)) {
				set.oidset_insert(generatedOid);
			}
		}  else if (generatedType == object_type.OBJ_COMMIT) {
			commit commit = (commit)obj;
			commit_list parents = generatedParents;
			set.oidset_insert(/*Error: Function owner not recognized*/get_commit_tree_oid(commit));
			for (; parents; parents = generatedNext) {
				set.oidset_insert(generatedOid);
			}
		}  else if (generatedType == object_type.OBJ_TAG) {
			tag tag = (tag)obj;
			set.oidset_insert(/*Error: Function owner not recognized*/get_tagged_oid(tag));
		} 
		return 0;
	}
	public int write_oid(Object oid, Object pos, Object data) {
		child_process cmd = data;
		int generatedIn = cmd.getIn();
		if (generatedIn == -1) {
			if (cmd.start_command()) {
				ModernizedCProgram.die(ModernizedCProgram._("could not start pack-objects to repack promisor objects"));
			} 
		} 
		ModernizedCProgram.xwrite(generatedIn, ModernizedCProgram.oid_to_hex(oid), ModernizedCProgram.the_repository.getHash_algo().getHexsz());
		ModernizedCProgram.xwrite(generatedIn, "\n", 1);
		return 0;
	}
	public int collect_packed_object(Object oid, Object pos, Object data) {
		data.oid_array_append(oid);
		return 0;
	}
	public int batch_unordered_packed(Object oid, Object pos, Object data) {
		return ModernizedCProgram.batch_unordered_object(oid, data);
	}
	public packed_git getNext() {
		return next;
	}
	public void setNext(packed_git newNext) {
		next = newNext;
	}
	public list_head getMru() {
		return mru;
	}
	public void setMru(list_head newMru) {
		mru = newMru;
	}
	public pack_window getWindows() {
		return windows;
	}
	public void setWindows(pack_window newWindows) {
		windows = newWindows;
	}
	public Object getPack_size() {
		return pack_size;
	}
	public void setPack_size(Object newPack_size) {
		pack_size = newPack_size;
	}
	public Object getIndex_data() {
		return index_data;
	}
	public void setIndex_data(Object newIndex_data) {
		index_data = newIndex_data;
	}
	public Object getIndex_size() {
		return index_size;
	}
	public void setIndex_size(Object newIndex_size) {
		index_size = newIndex_size;
	}
	public Object getNum_objects() {
		return num_objects;
	}
	public void setNum_objects(Object newNum_objects) {
		num_objects = newNum_objects;
	}
	public Object getNum_bad_objects() {
		return num_bad_objects;
	}
	public void setNum_bad_objects(Object newNum_bad_objects) {
		num_bad_objects = newNum_bad_objects;
	}
	public Byte getBad_object_sha1() {
		return bad_object_sha1;
	}
	public void setBad_object_sha1(Byte newBad_object_sha1) {
		bad_object_sha1 = newBad_object_sha1;
	}
	public int getIndex_version() {
		return index_version;
	}
	public void setIndex_version(int newIndex_version) {
		index_version = newIndex_version;
	}
	public Object getMtime() {
		return mtime;
	}
	public void setMtime(Object newMtime) {
		mtime = newMtime;
	}
	public int getPack_fd() {
		return pack_fd;
	}
	public void setPack_fd(int newPack_fd) {
		pack_fd = newPack_fd;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int newIndex) {
		index = newIndex;
	}
	public int getPack_local() {
		return pack_local;
	}
	public void setPack_local(int newPack_local) {
		pack_local = newPack_local;
	}
	public int getPack_keep() {
		return pack_keep;
	}
	public void setPack_keep(int newPack_keep) {
		pack_keep = newPack_keep;
	}
	public int getPack_keep_in_core() {
		return pack_keep_in_core;
	}
	public void setPack_keep_in_core(int newPack_keep_in_core) {
		pack_keep_in_core = newPack_keep_in_core;
	}
	public int getFreshened() {
		return freshened;
	}
	public void setFreshened(int newFreshened) {
		freshened = newFreshened;
	}
	public int getDo_not_close() {
		return do_not_close;
	}
	public void setDo_not_close(int newDo_not_close) {
		do_not_close = newDo_not_close;
	}
	public int getPack_promisor() {
		return pack_promisor;
	}
	public void setPack_promisor(int newPack_promisor) {
		pack_promisor = newPack_promisor;
	}
	public int getMulti_pack_index() {
		return multi_pack_index;
	}
	public void setMulti_pack_index(int newMulti_pack_index) {
		multi_pack_index = newMulti_pack_index;
	}
	public Object getHash() {
		return hash;
	}
	public void setHash(Object newHash) {
		hash = newHash;
	}
	public revindex_entry[] getRevindex() {
		return revindex;
	}
	public void setRevindex(revindex_entry[] newRevindex) {
		revindex = newRevindex;
	}
	public Object getPack_name() {
		return pack_name;
	}
	public void setPack_name(Object newPack_name) {
		pack_name = newPack_name;
	}
}
/* A most-recently-used ordered version of the packed_git list. */
