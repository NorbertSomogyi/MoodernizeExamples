package application;

/*
 * The object type is stored in 3 bits.
 */
/** Returns the object, with potentially excess memory allocated. **/
public class object {
	private int parsed;
	private int type;
	private int flags;
	private object_id oid;
	
	public object(int parsed, int type, int flags, object_id oid) {
		setParsed(parsed);
		setType(type);
		setFlags(flags);
		setOid(oid);
	}
	public object() {
	}
	
	public void mark_object(Object mark) {
		ModernizedCProgram.idnums.add_decoration(object, ModernizedCProgram.mark_to_ptr(mark));
		data.update_progress();
		object parent = data/*
			 * The only case data is NULL or type is OBJ_ANY is when
			 * mark_object_reachable() calls us.  All the callers of
			 * that function has non-NULL obj hence ...
			 */;
		if (!obj) {
			ModernizedCProgram.printf_ln(ModernizedCProgram._(/* ... these references to parent->fld are safe here */"broken link from %7s %s"), parent.printable_type(), parent.describe_object());
			ModernizedCProgram.printf_ln(ModernizedCProgram._("broken link from %7s %s"), (ModernizedCProgram.type == object_type.OBJ_ANY ? ModernizedCProgram._("unknown") : ModernizedCProgram.type_name(ModernizedCProgram.type)), ModernizedCProgram._("unknown"));
			ModernizedCProgram.errors_found |=  2;
			return 1;
		} 
		int generatedType = obj.getType();
		if (ModernizedCProgram.type != object_type.OBJ_ANY && generatedType != ModernizedCProgram.type) {
			parent.objerror(ModernizedCProgram._(/* ... and the reference to parent is safe here */"wrong object type in link"));
		} 
		int generatedFlags = obj.getFlags();
		if (generatedFlags & -1024) {
			return 0;
		} 
		generatedFlags |=  -1024;
		object_id generatedOid = obj.getOid();
		if (ModernizedCProgram.is_promisor_object(generatedOid)) {
			return 0;
		} 
		if (!(generatedFlags & -1024)) {
			if (parent && !ModernizedCProgram.the_repository.repo_has_object_file(generatedOid)) {
				ModernizedCProgram.printf_ln(ModernizedCProgram._("broken link from %7s %s\n              to %7s %s"), parent.printable_type(), parent.describe_object(), obj.printable_type(), obj.describe_object());
				ModernizedCProgram.errors_found |=  2;
			} 
			return 1;
		} 
		ModernizedCProgram.add_object_array(obj, ((Object)0), ModernizedCProgram.pending);
		return 0;
	}
	public void mark_next_object() {
		object.mark_object(++ModernizedCProgram.last_idnum);
	}
	public int get_object_mark() {
		Object decoration = ModernizedCProgram.idnums.lookup_decoration(object);
		if (!decoration) {
			return 0;
		} 
		return ModernizedCProgram.ptr_to_mark(decoration);
	}
	public void add_fetch_request() {
		transfer_request request = new transfer_request();
		ModernizedCProgram.check_locks();
		object_id generatedOid = this.getOid();
		Object generatedHash = generatedOid.getHash();
		if (ModernizedCProgram.remote_dir_exists[generatedHash[0]] == -1) {
			ModernizedCProgram.get_remote_object_list(generatedHash[0]);
		} 
		int generatedFlags = this.getFlags();
		if (generatedFlags & ((-1024 << 16) | (-1024 << 18))) {
			return ;
		} 
		generatedFlags |=  (-1024 << 18);
		request = ModernizedCProgram.xmalloc();
		request.setObj(obj);
		request.setUrl(((Object)0));
		request.setLock(((Object)0));
		request.setHeaders(((Object)0));
		request.setState(transfer_state.NEED_FETCH);
		request.setNext(ModernizedCProgram.request_queue_head);
		ModernizedCProgram.request_queue_head = request;
	}
	public void finish_object__ma() {
		int generatedType = this.getType();
		object_id generatedOid = this.getOid();
		switch (missing_action.arg_missing_action) {
		case missing_action.MA_ALLOW_ANY:
				return ;
		case missing_action.MA_ALLOW_PROMISOR:
				if (ModernizedCProgram.is_promisor_object(generatedOid)) {
					return ;
				} 
				ModernizedCProgram.die("unexpected missing %s object '%s'", ModernizedCProgram.type_name(generatedType), ModernizedCProgram.oid_to_hex(generatedOid));
				return ;
		case missing_action.MA_PRINT:
				ModernizedCProgram.missing_objects.oidset_insert(generatedOid);
				return ;
		case missing_action.MA_ERROR:
				ModernizedCProgram.die("missing %s object '%s'", ModernizedCProgram.type_name(generatedType), ModernizedCProgram.oid_to_hex(generatedOid));
				return ;
		default:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\rev-list.c", 236, "unhandled missing_action");
				return ;
		}
	}
	/*
		 * Whether or not we try to dynamically fetch missing objects
		 * from the server, we currently DO NOT have the object.  We
		 * can either print, allow (ignore), or conditionally allow
		 * (ignore) them.
		 */
	public int finish_object(Object name, Object cb_data) {
		rev_list_info info = cb_data;
		object_id generatedOid = this.getOid();
		if (ModernizedCProgram.oid_object_info_extended(ModernizedCProgram.the_repository, generatedOid, ((Object)0), 0) < 0) {
			obj.finish_object__ma();
			return 1;
		} 
		rev_info generatedRevs = info.getRevs();
		int generatedVerify_objects = generatedRevs.getVerify_objects();
		int generatedParsed = this.getParsed();
		int generatedType = this.getType();
		object object = new object();
		if (generatedVerify_objects && !generatedParsed && generatedType != object_type.OBJ_COMMIT) {
			object.parse_object(ModernizedCProgram.the_repository, generatedOid);
		} 
		return 0;
	}
	public void show_object(Object name, Object cb_data) {
		rev_list_info info = cb_data;
		if (obj.finish_object(name, cb_data)) {
			return ;
		} 
		ModernizedCProgram.progress.display_progress(++ModernizedCProgram.progress_counter);
		int generatedFlags = info.getFlags();
		if (generatedFlags & (1 << 1)) {
			return ;
		} 
		object_id generatedOid = this.getOid();
		if (ModernizedCProgram.arg_show_object_names) {
			ModernizedCProgram.show_object_with_name((_iob[1]), obj, name);
		} else {
				.printf("%s\n", ModernizedCProgram.oid_to_hex(generatedOid));
		} 
		bitmap base = data;
		object_id generatedOid = object.getOid();
		base.bitmap_set(ModernizedCProgram.find_object_pos(generatedOid));
		object.mark_as_seen();
		ModernizedCProgram.add_preferred_base_object(name);
		object_id generatedOid = this.getOid();
		int generatedType = this.getType();
		ModernizedCProgram.add_object_entry(generatedOid, generatedType, name, 0);
		int generatedFlags = this.getFlags();
		generatedFlags |=  (-1024 << 20);
		if (ModernizedCProgram.use_delta_islands) {
			byte p;
			int depth;
			object_entry ent = new object_entry();
			ModernizedCProgram.depth = name ? 1 : /* the empty string is a root tree, which is depth 0 */0;
			for (p = .strchr(name, (byte)'/'); p; p = .strchr(p + 1, (byte)'/')) {
				ModernizedCProgram.depth++;
			}
			ent = .packlist_find(ModernizedCProgram.to_pack, generatedOid);
			if (ent && ModernizedCProgram.depth > ModernizedCProgram.oe_tree_depth(ModernizedCProgram.to_pack, ent)) {
				ModernizedCProgram.oe_set_tree_depth(ModernizedCProgram.to_pack, ent, ModernizedCProgram.depth);
			} 
		} 
		bitmap_show_data data = data_;
		int bitmap_pos;
		bitmap_index generatedBitmap_git = data.getBitmap_git();
		object_id generatedOid = object.getOid();
		bitmap_pos = generatedBitmap_git.bitmap_position(generatedOid);
		if (bitmap_pos < 0) {
			bitmap_pos = ModernizedCProgram.ext_index_add_object(generatedBitmap_git, object, name);
		} 
		bitmap generatedBase = data.getBase();
		generatedBase.bitmap_set(bitmap_pos);
	}
	public void mark_as_seen() {
		do {
			if ((ModernizedCProgram.seen_objects_nr + 1) > ModernizedCProgram.seen_objects_alloc) {
				if ((((ModernizedCProgram.seen_objects_alloc) + 16) * 3 / 2) < (ModernizedCProgram.seen_objects_nr + 1)) {
					ModernizedCProgram.seen_objects_alloc = (ModernizedCProgram.seen_objects_nr + 1);
				} else {
						ModernizedCProgram.seen_objects_alloc = (((ModernizedCProgram.seen_objects_alloc) + 16) * 3 / 2);
				} 
				(ModernizedCProgram.seen_objects) = ModernizedCProgram.xrealloc((ModernizedCProgram.seen_objects), ModernizedCProgram.st_mult(, (ModernizedCProgram.seen_objects_alloc)));
			} 
		} while (0);
		ModernizedCProgram.seen_objects[ModernizedCProgram.seen_objects_nr++] = object;
	}
	public void add_name_decoration(decoration_type type, Object name) {
		name_decoration res = new name_decoration();
		Object generatedName = ((res)).getName();
		do {
			size_t flex_array_len_ = (.strlen(name));
			((res)) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
			.memcpy((Object)generatedName, ((name)), flex_array_len_);
		} while (0);
		res.setType(decoration_type.type);
		res.setNext(ModernizedCProgram.name_decoration.add_decoration(obj, res));
	}
	public void show_object__ma_allow_any(Object name, Object data) {
		((missing_action.arg_missing_action == missing_action.MA_ALLOW_ANY) ? (Object)0 : ._assert("arg_missing_action == MA_ALLOW_ANY", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\pack-objects.c", 2794/*
			 * Quietly ignore ALL missing objects.  This avoids problems with
			 * staging them now and getting an odd error later.
			 */));
		object_id generatedOid = this.getOid();
		if (!ModernizedCProgram.the_repository.repo_has_object_file(generatedOid)) {
			return ;
		} 
		obj.show_object(name, data);
	}
	public void show_object__ma_allow_promisor(Object name, Object data) {
		((missing_action.arg_missing_action == missing_action.MA_ALLOW_PROMISOR) ? (Object)0 : ._assert("arg_missing_action == MA_ALLOW_PROMISOR", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\pack-objects.c", 2808/*
			 * Quietly ignore EXPECTED missing objects.  This avoids problems with
			 * staging them now and getting an odd error later.
			 */));
		object_id generatedOid = this.getOid();
		if (!ModernizedCProgram.the_repository.repo_has_object_file(generatedOid) && ModernizedCProgram.is_promisor_object(generatedOid)) {
			return ;
		} 
		obj.show_object(name, data);
	}
	public void record_recent_object(Object name, Object data) {
		object_id generatedOid = this.getOid();
		ModernizedCProgram.recent_objects.oid_array_append(generatedOid);
	}
	public object repo_peel_to_type(repository r, Object name, int namelen, object_type expected_type) {
		if (name && !namelen) {
			namelen = .strlen(name);
		} 
		int generatedParsed = this.getParsed();
		object_id generatedOid = this.getOid();
		object object = new object();
		int generatedType = this.getType();
		while (1) {
			if (!o || (!generatedParsed && !object.parse_object(r, generatedOid))) {
				return ((Object)0);
			} 
			if (object_type.expected_type == object_type.OBJ_ANY || generatedType == object_type.expected_type) {
				return o;
			} 
			if (generatedType == object_type.OBJ_TAG) {
				o = ((tag)o).getTagged();
			}  else if (generatedType == object_type.OBJ_COMMIT) {
				o = (.repo_get_commit_tree(r, ((commit)o)).getObject());
			} else {
					if (name) {
						();
					} 
					return ((Object)0);
			} 
		}
	}
	public void test_show_object(Object name, Object data) {
		bitmap_test_data tdata = data;
		int bitmap_pos;
		bitmap_index generatedBitmap_git = tdata.getBitmap_git();
		object_id generatedOid = this.getOid();
		bitmap_pos = generatedBitmap_git.bitmap_position(generatedOid);
		if (bitmap_pos < 0) {
			ModernizedCProgram.die("Object not in bitmap: %s\n", ModernizedCProgram.oid_to_hex(generatedOid));
		} 
		bitmap generatedBase = tdata.getBase();
		generatedBase.bitmap_set(bitmap_pos);
		progress generatedPrg = tdata.getPrg();
		Object generatedSeen = tdata.getSeen();
		generatedPrg.display_progress(++generatedSeen);
	}
	public object get_indexed_object(int idx) {
		return ModernizedCProgram.the_repository.getParsed_objects().getParsed_object_pool()[idx];
	}
	public void insert_obj_hash(object hash, int size) {
		object_id generatedOid = this.getOid();
		int j = ModernizedCProgram.hash_obj(generatedOid, size);
		while (hash[j]) {
			j++;
			if (j >= size) {
				j = 0;
			} 
		}
		hash[j] = obj/*
		 * Look up the record for the given sha1 in the hash map stored in
		 * obj_hash.  Return NULL if it was not found.
		 */;
	}
	public object lookup_object(repository r, Object oid) {
		int i;
		int first;
		object obj = new object();
		parsed_object_pool generatedParsed_objects = r.getParsed_objects();
		object generatedObj_hash = generatedParsed_objects.getObj_hash();
		if (!generatedObj_hash) {
			return ((Object)0);
		} 
		int generatedObj_hash_size = generatedParsed_objects.getObj_hash_size();
		first = i = ModernizedCProgram.hash_obj(oid, generatedObj_hash_size);
		object_id generatedOid = obj.getOid();
		while ((obj = generatedObj_hash[i]) != ((Object)0)) {
			if (ModernizedCProgram.oideq(oid, generatedOid)) {
				break;
			} 
			i++;
			if (i == generatedObj_hash_size) {
				i = 0;
			} 
		}
		if (obj && i != first/*
				 * Move object to where we started to look for it so
				 * that we do not need to walk the hash table the next
				 * time we look for it.
				 */) {
			do {
				Object _swap_a_ptr = (generatedObj_hash[i]);
				Object _swap_b_ptr = (generatedObj_hash[first]);
				byte[] _swap_buffer = new byte[];
				.memcpy(_swap_buffer, _swap_a_ptr, );
				.memcpy(_swap_a_ptr, _swap_b_ptr,  + ( - 1));
				.memcpy(_swap_b_ptr, _swap_buffer, );
			} while (0);
		} 
		return obj/*
		 * Increase the size of the hash map stored in obj_hash to the next
		 * power of 2 (but at least 32).  Copy the existing values to the new
		 * hash map.
		 */;
	}
	public object lookup_unknown_object(Object oid) {
		object object = new object();
		object obj = object.lookup_object(ModernizedCProgram.the_repository, oid);
		if (!obj) {
			obj = ModernizedCProgram.the_repository.create_object(oid, ModernizedCProgram.the_repository.alloc_object_node());
		} 
		return obj;
	}
	public object parse_object_buffer(repository r, Object oid, object_type type, long size, Object buffer, int eaten_p) {
		object obj = new object();
		eaten_p = 0;
		obj = ((Object)0);
		blob blob = new blob();
		object generatedObject = blob.getObject();
		tree tree = new tree();
		Object generatedBuffer = tree.getBuffer();
		int generatedParsed = generatedObject.getParsed();
		if (object_type.type == object_type.OBJ_BLOB) {
			blob blob = blob.lookup_blob(r, oid);
			if (blob) {
				if (blob.parse_blob_buffer(buffer, size)) {
					return ((Object)0);
				} 
				obj = generatedObject;
			} 
		}  else if (object_type.type == object_type.OBJ_TREE) {
			tree tree = tree.lookup_tree(r, oid);
			if (tree) {
				obj = generatedObject;
				if (!generatedBuffer) {
					generatedObject.setParsed(0);
				} 
				if (!generatedParsed) {
					if (tree.parse_tree_buffer(buffer, size)) {
						return ((Object)0);
					} 
					eaten_p = 1;
				} 
			} 
		}  else if (object_type.type == object_type.OBJ_COMMIT) {
			commit commit = .lookup_commit(r, oid);
			if (commit) {
				if (.parse_commit_buffer(r, commit, buffer, size, 1)) {
					return ((Object)0);
				} 
				if (!.get_cached_commit_buffer(r, commit, ((Object)0))) {
					.set_commit_buffer(r, commit, buffer, size);
					eaten_p = 1;
				} 
				obj = generatedObject;
			} 
		}  else if (object_type.type == object_type.OBJ_TAG) {
			tag tag = .lookup_tag(r, oid);
			if (tag) {
				if (.parse_tag_buffer(r, tag, buffer, size)) {
					return ((Object)0);
				} 
				obj = generatedObject;
			} 
		} else {
				ModernizedCProgram.warning(ModernizedCProgram._("object %s has unknown type id %d"), ModernizedCProgram.oid_to_hex(oid), object_type.type);
				obj = ((Object)0);
		} 
		return obj;
	}
	public object parse_object_or_die(Object oid, Object name) {
		object object = new object();
		object o = object.parse_object(ModernizedCProgram.the_repository, oid);
		if (o) {
			return o;
		} 
		ModernizedCProgram.die(ModernizedCProgram._("unable to parse object: %s"), name ? name : ModernizedCProgram.oid_to_hex(oid));
	}
	public object parse_object(repository r, Object oid) {
		long size;
		object_type type;
		int eaten;
		object_id repl = r.lookup_replace_object(oid);
		Object buffer;
		object obj = new object();
		object object = new object();
		obj = object.lookup_object(r, oid);
		int generatedParsed = obj.getParsed();
		if (obj && generatedParsed) {
			return obj;
		} 
		int generatedType = obj.getType();
		blob blob = new blob();
		if ((obj && generatedType == object_type.OBJ_BLOB && r.repo_has_object_file(oid)) || (!obj && r.repo_has_object_file(oid) && r.oid_object_info(oid, ((Object)0)) == object_type.OBJ_BLOB)) {
			if (ModernizedCProgram.check_object_signature(repl, ((Object)0), 0, ((Object)0)) < 0) {
				();
				return ((Object)0);
			} 
			blob.lookup_blob(r, oid).parse_blob_buffer(((Object)0), 0);
			return object.lookup_object(r, oid);
		} 
		buffer = r.repo_read_object_file(oid, object_type.type, size);
		object object = new object();
		if (buffer) {
			if (ModernizedCProgram.check_object_signature(repl, buffer, size, ModernizedCProgram.type_name(object_type.type)) < 0) {
				ModernizedCProgram.free(buffer);
				();
				return ((Object)0);
			} 
			obj = object.parse_object_buffer(r, oid, object_type.type, size, buffer, eaten);
			if (!eaten) {
				ModernizedCProgram.free(buffer);
			} 
			return obj;
		} 
		return ((Object)0);
	}
	public object object_array_pop(object_array array) {
		object ret = new object();
		int generatedNr = array.getNr();
		if (!generatedNr) {
			return ((Object)0);
		} 
		object_array_entry generatedObjects = array.getObjects();
		ret = generatedObjects[generatedNr - 1].getItem();
		generatedObjects[generatedNr - 1].object_array_release_entry();
		generatedNr--;
		return ret;
	}
	public void show_local_changes(Object opts) {
		rev_info rev = new rev_info();
		ModernizedCProgram.repo_init_revisions(ModernizedCProgram.the_repository, rev, ((Object)/* I think we want full paths, even if we're in a subdirectory. */0));
		diff_options generatedDiffopt = rev.getDiffopt();
		generatedDiffopt.setFlags(opts.getFlags());
		int generatedOutput_format = generatedDiffopt.getOutput_format();
		generatedOutput_format |=  -1024;
		.diff_setup_done(generatedDiffopt);
		ModernizedCProgram.add_pending_object(rev, head, ((Object)0));
		rev.run_diff_index(0);
	}
	public void add_object_buffer(Byte buffer, long size) {
		obj_buffer obj = new obj_buffer();
		obj = ModernizedCProgram.xcalloc(1, );
		obj.setBuffer(buffer);
		obj.setSize(size);
		object_id generatedOid = this.getOid();
		if (ModernizedCProgram.obj_decorate.add_decoration(object, obj)) {
			ModernizedCProgram.die("object %s tried to add buffer twice!", ModernizedCProgram.oid_to_hex(generatedOid));
		} 
	}
	public object get_reference(rev_info revs, Object name, Object oid, int flags) {
		object object = new object();
		/*
			 * If the repository has commit graphs, repo_parse_commit() avoids
			 * reading the object buffer, so use it whenever possible.
			 */
		repository generatedRepo = revs.getRepo();
		object object = new object();
		if (generatedRepo.oid_object_info(oid, ((Object)0)) == object_type.OBJ_COMMIT) {
			commit c = .lookup_commit(generatedRepo, oid);
			if (!ModernizedCProgram.repo_parse_commit(generatedRepo, c)) {
				object = (object)c;
			} else {
					object = ((Object)0);
			} 
		} else {
				object = object.parse_object(generatedRepo, oid);
		} 
		int generatedIgnore_missing = revs.getIgnore_missing();
		int generatedExclude_promisor_objects = revs.getExclude_promisor_objects();
		if (!object) {
			if (generatedIgnore_missing) {
				return object;
			} 
			if (generatedExclude_promisor_objects && ModernizedCProgram.is_promisor_object(oid)) {
				return ((Object)0);
			} 
			ModernizedCProgram.die("bad object %s", name);
		} 
		int generatedFlags = object.getFlags();
		generatedFlags |=  flags;
		return object;
	}
	public Object describe_object() {
		strbuf[] bufs = new strbuf[]{new strbuf(, , ), new strbuf(, , ), new strbuf(, , ), new strbuf(, , )};
		int b = 0;
		strbuf buf = new strbuf();
		byte name = ((Object)0);
		if (ModernizedCProgram.name_objects) {
			name = ModernizedCProgram.fsck_walk_options.getObject_names().lookup_decoration(obj);
		} 
		buf = bufs + b;
		b = (b + 1) % ( /  + ( - 1));
		buf.strbuf_setlen(0);
		object_id generatedOid = this.getOid();
		buf.strbuf_addstr(ModernizedCProgram.oid_to_hex(generatedOid));
		if (name) {
			buf.strbuf_addf(" (%s)", name);
		} 
		byte generatedBuf = buf.getBuf();
		return generatedBuf;
	}
	public Object printable_type() {
		byte ret;
		int generatedType = this.getType();
		object_id generatedOid = this.getOid();
		if (generatedType == object_type.OBJ_NONE) {
			object_type type = ModernizedCProgram.the_repository.oid_object_info(generatedOid, ((Object)0));
			if (object_type.type > 0) {
				ModernizedCProgram.object_as_type(ModernizedCProgram.the_repository, obj, object_type.type, 0);
			} 
		} 
		ret = ModernizedCProgram.type_name(generatedType);
		if (!ret) {
			ret = ModernizedCProgram._("unknown");
		} 
		return ret;
	}
	public int objerror(Object err) {
		ModernizedCProgram.errors_found |=  1;
		(_iob[2]).fprintf_ln(ModernizedCProgram._(/* TRANSLATORS: e.g. error in tree 01bfda: <more explanation> */"error in %s %s: %s"), obj.printable_type(), obj.describe_object(), err);
		return -1;
	}
	public void mark_object_reachable() {
		obj.mark_object(object_type.OBJ_ANY, ((Object)0), ((Object)0));
	}
	public int traverse_one_object() {
		int result = .fsck_walk(obj, obj, ModernizedCProgram.fsck_walk_options);
		int generatedType = this.getType();
		if (generatedType == object_type.OBJ_TREE) {
			tree tree = (tree)obj;
			tree.free_tree_buffer();
		} 
		return result;
	}
	public void check_reachable_object() {
		int generatedFlags = this.getFlags();
		object_id generatedOid = this.getOid();
		if (!(generatedFlags & -1024)) {
			if (ModernizedCProgram.is_promisor_object(generatedOid)) {
				return ;
			} 
			if (ModernizedCProgram.has_object_pack(generatedOid)) {
				return ;
			} 
			ModernizedCProgram.printf_ln(ModernizedCProgram._("missing %s %s"), obj.printable_type(), obj.describe_object());
			ModernizedCProgram.errors_found |=  2;
			return ;
		} 
	}
	/*
		 * We obviously want the object to be parsed,
		 * except if it was in a pack-file and we didn't
		 * do a full fsck
		 */
	/*
	 * Check a single unreachable object
	 */
	public void check_unreachable_object() {
		int generatedFlags = this.getFlags();
		if (!(generatedFlags & -1024)) {
			return ;
		} 
		if (ModernizedCProgram.show_unreachable) {
			ModernizedCProgram.printf_ln(ModernizedCProgram._("unreachable %s %s"), obj.printable_type(), obj.describe_object());
			return ;
		} 
		int generatedType = this.getType();
		Object generated_file = (f).get_file();
		object_id generatedOid = this.getOid();
		if (!(generatedFlags & -1024)) {
			if (ModernizedCProgram.show_dangling) {
				ModernizedCProgram.printf_ln(ModernizedCProgram._("dangling %s %s"), obj.printable_type(), obj.describe_object());
			} 
			if (ModernizedCProgram.write_lost_and_found) {
				byte filename = ModernizedCProgram.git_pathdup("lost-found/%s/%s", generatedType == object_type.OBJ_COMMIT ? "commit" : "other", obj.describe_object());
				FILE f = new FILE();
				if (ModernizedCProgram.safe_create_leading_directories_const(filename)) {
					();
					ModernizedCProgram.free(filename);
					return ;
				} 
				f = ModernizedCProgram.xfopen(filename, "w");
				if (generatedType == object_type.OBJ_BLOB) {
					if (((Object)0).stream_blob_to_fd((generated_file), generatedOid, 1)) {
						ModernizedCProgram.die_errno(ModernizedCProgram._("could not write '%s'"), filename);
					} 
				} else {
						.fprintf(f, "%s\n", obj.describe_object());
				} 
				if (.fclose(f)) {
					ModernizedCProgram.die_errno(ModernizedCProgram._("could not finish '%s'"), filename);
				} 
				ModernizedCProgram.free(filename);
			} 
			return ;
		} 
	}
	/*
		 * Missing unreachable object? Ignore it. It's not like
		 * we miss it (since it can't be reached), nor do we want
		 * to complain about it being unreachable (since it does
		 * not exist).
		 */
	public int fsck_obj(Object buffer, long size) {
		int err;
		int generatedFlags = this.getFlags();
		if (generatedFlags & -1024) {
			return 0;
		} 
		generatedFlags |=  -1024;
		if (ModernizedCProgram.verbose) {
			(_iob[2]).fprintf_ln(ModernizedCProgram._("Checking %s %s"), obj.printable_type(), obj.describe_object());
		} 
		if (.fsck_walk(obj, ((Object)0), ModernizedCProgram.fsck_obj_options)) {
			obj.objerror(ModernizedCProgram._("broken links"));
		} 
		err = .fsck_object(obj, buffer, size, ModernizedCProgram.fsck_obj_options);
		if (err) {
			;
		} 
		int generatedType = this.getType();
		commit_list generatedParents = commit.getParents();
		object generatedObject = commit.getObject();
		if (generatedType == object_type.OBJ_COMMIT) {
			commit commit = (commit)obj;
			if (!generatedParents && ModernizedCProgram.show_root) {
				ModernizedCProgram.printf_ln(ModernizedCProgram._("root %s"), generatedObject.describe_object());
			} 
		} 
		Object generatedTagged = tag.getTagged();
		Object generatedTag = tag.getTag();
		if (generatedType == object_type.OBJ_TAG) {
			tag tag = (tag)obj;
			if (ModernizedCProgram.show_tags && generatedTagged) {
				ModernizedCProgram.printf_ln(ModernizedCProgram._("tagged %s %s (%s) in %s"), generatedTagged.printable_type(), generatedTagged.describe_object(), generatedTag, generatedObject.describe_object());
			} 
		} 
		if (generatedType == object_type.OBJ_COMMIT) {
			.free_commit_buffer(ModernizedCProgram.the_repository.getParsed_objects(), (commit)obj);
		} 
		return err;
	}
	public int getParsed() {
		return parsed;
	}
	public void setParsed(int newParsed) {
		parsed = newParsed;
	}
	public int getType() {
		return type;
	}
	public void setType(int newType) {
		type = newType;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
}
/*
		 * name or NULL.  If non-NULL, the memory pointed to
		 * is owned by this object *except* if it points at
		 * object_array_slopbuf, which is a static copy of the
		 * empty string.
		 */
/*
 * This can be used to see if we have heard of the object before, but
 * it can return "yes we have, and here is a half-initialised object"
 * for an object that we haven't loaded/parsed yet.
 *
 * When parsing a commit to create an in-core commit object, its
 * parents list holds commit objects that represent its parents, but
 * they are expected to be lazily initialized and do not know what
 * their trees or parents are yet.  When this function returns such a
 * half-initialised objects, the caller is expected to initialize them
 * by calling parse_object() on them.
 */
/*
 * Like parse_object, but will die() instead of returning NULL. If the
 * "name" parameter is not NULL, it is included in the error message
 * (otherwise, the hex object ID is given).
 */
/* Given the result of read_sha1_file(), returns the object after
 * parsing it.  eaten_p indicates if the object has a borrowed copy
 * of buffer and the caller should not free() it.
 */
