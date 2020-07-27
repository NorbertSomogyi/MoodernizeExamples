package application;

public class branch {
	private branch table_next_branch;
	private branch active_next_branch;
	private Object name;
	private tree_entry branch_tree;
	private Object last_commit;
	private Object num_notes;
	private int active;
	private int delete;
	private int pack_id;
	private object_id oid;
	
	public branch(branch table_next_branch, branch active_next_branch, Object name, tree_entry branch_tree, Object last_commit, Object num_notes, int active, int delete, int pack_id, object_id oid) {
		setTable_next_branch(table_next_branch);
		setActive_next_branch(active_next_branch);
		setName(name);
		setBranch_tree(branch_tree);
		setLast_commit(last_commit);
		setNum_notes(num_notes);
		setActive(active);
		setDelete(delete);
		setPack_id(pack_id);
		setOid(oid);
	}
	public branch() {
	}
	
	public branch lookup_branch(Object name) {
		int hc = ModernizedCProgram.hc_str(name, /*Error: Function owner not recognized*/strlen(name)) % ModernizedCProgram.branch_table_sz;
		branch b = new branch();
		Object generatedName = b.getName();
		branch generatedTable_next_branch = b.getTable_next_branch();
		for (b = ModernizedCProgram.branch_table[hc]; b; b = generatedTable_next_branch) {
			if (!/*Error: Function owner not recognized*/strcmp(name, generatedName)) {
				return b;
			} 
		}
		return ((Object)0);
	}
	public branch new_branch(Object name) {
		int hc = ModernizedCProgram.hc_str(name, /*Error: Function owner not recognized*/strlen(name)) % ModernizedCProgram.branch_table_sz;
		branch branch = new branch();
		branch b = branch.lookup_branch(name);
		if (b) {
			ModernizedCProgram.die("Invalid attempt to create duplicate branch: %s", name);
		} 
		if (ModernizedCProgram.check_refname_format(name, 1)) {
			ModernizedCProgram.die("Branch name doesn't conform to GIT standards: %s", name);
		} 
		b = ModernizedCProgram.fi_mem_pool.mem_pool_calloc(1, /*Error: Unsupported expression*/);
		b.setName(ModernizedCProgram.pool_strdup(name));
		b.setTable_next_branch(ModernizedCProgram.branch_table[hc]);
		tree_entry generatedBranch_tree = b.getBranch_tree();
		Object generatedVersions = generatedBranch_tree.getVersions();
		generatedVersions[0].setMode(-1024);
		generatedVersions[1].setMode(-1024);
		b.setNum_notes(0);
		b.setActive(0);
		b.setPack_id(((1 << 16) - 1));
		ModernizedCProgram.branch_table[hc] = b;
		ModernizedCProgram.branch_count++;
		return b;
	}
	public int update_branch() {
		byte msg = "fast-import";
		ref_transaction transaction = new ref_transaction();
		object_id old_oid = new object_id();
		strbuf err = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		object_id generatedOid = this.getOid();
		int generatedDelete = this.getDelete();
		Object generatedName = this.getName();
		if (ModernizedCProgram.is_null_oid(generatedOid)) {
			if (generatedDelete) {
				ModernizedCProgram.delete_ref(((Object)0), generatedName, ((Object)0), 0);
			} 
			return 0;
		} 
		if (old_oid.read_ref(generatedName)) {
			old_oid.oidclr();
		} 
		if (!ModernizedCProgram.force_update && !ModernizedCProgram.is_null_oid(old_oid)) {
			commit old_cmit = new commit();
			commit new_cmit = new commit();
			old_cmit = /*Error: Function owner not recognized*/lookup_commit_reference_gently(ModernizedCProgram.the_repository, old_oid, 0);
			new_cmit = /*Error: Function owner not recognized*/lookup_commit_reference_gently(ModernizedCProgram.the_repository, generatedOid, 0);
			if (!old_cmit || !new_cmit) {
				return ();
			} 
			if (!ModernizedCProgram.repo_in_merge_bases(ModernizedCProgram.the_repository, old_cmit, new_cmit)) {
				ModernizedCProgram.warning("Not updating %s (new tip %s does not contain %s)", generatedName, ModernizedCProgram.oid_to_hex(generatedOid), ModernizedCProgram.oid_to_hex(old_oid));
				return -1;
			} 
		} 
		ref_transaction ref_transaction = new ref_transaction();
		transaction = ref_transaction.ref_transaction_begin(err);
		if (!transaction || ModernizedCProgram.ref_transaction_update(transaction, generatedName, generatedOid, old_oid, 0, msg, err) || ModernizedCProgram.ref_transaction_commit(transaction, err)) {
			transaction.ref_transaction_free();
			();
			err.strbuf_release();
			return -1;
		} 
		transaction.ref_transaction_free();
		err.strbuf_release();
		return 0;
	}
	public void load_branch() {
		tree_entry generatedBranch_tree = this.getBranch_tree();
		generatedBranch_tree.load_tree();
		int generatedActive = this.getActive();
		if (!generatedActive) {
			this.setActive(1);
			this.setActive_next_branch(ModernizedCProgram.active_branches);
			ModernizedCProgram.active_branches = b;
			ModernizedCProgram.cur_active_branches++;
			ModernizedCProgram.branch_load_count++;
		} 
	}
	public void file_change_m(Object p) {
		strbuf uq = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte endp;
		object_entry oe = new object_entry();
		object_id oid = new object_id();
		uint16_t mode = new uint16_t();
		uint16_t inline_data = 0;
		p = ModernizedCProgram.get_mode(p, mode);
		if (!p) {
			ModernizedCProgram.die("Corrupt mode: %s", ModernizedCProgram.command_buf.getBuf());
		} 
		switch (mode) {
		case -1024:
		case S_IFLNK:
		case 160000/* ok */:
				break;
		case -1024 | 644:
		case -1024 | 755:
		case 755:
				mode |=  -1024;
		case 644:
		default:
				ModernizedCProgram.die("Corrupt mode: %s", ModernizedCProgram.command_buf.getBuf());
		}
		object_entry object_entry = new object_entry();
		pack_idx_entry generatedIdx = oe.getIdx();
		object_id generatedOid = generatedIdx.getOid();
		object_entry object_entry = new object_entry();
		if (p == (byte)':') {
			oe = object_entry.find_mark(ModernizedCProgram.parse_mark_ref_space(p));
			oid.oidcpy(generatedOid);
		}  else if (ModernizedCProgram.skip_prefix(p, "inline ", p)) {
			inline_data = 1;
			oe = ((Object)/* not used with inline_data, but makes gcc happy */0);
		} else {
				if (oid.parse_oid_hex(p, p)) {
					ModernizedCProgram.die("Invalid dataref: %s", ModernizedCProgram.command_buf.getBuf());
				} 
				oe = object_entry.find_object(oid);
				if (p++ != (byte)' ') {
					ModernizedCProgram.die("Missing space after SHA1: %s", ModernizedCProgram.command_buf.getBuf());
				} 
		} 
		uq.strbuf_setlen(0);
		byte[] generatedBuf = uq.getBuf();
		if (!uq.unquote_c_style(p, endp)) {
			if (endp) {
				ModernizedCProgram.die("Garbage after path in: %s", ModernizedCProgram.command_buf.getBuf());
			} 
			p = generatedBuf;
		} 
		tree_entry generatedBranch_tree = this.getBranch_tree();
		if ((((mode) & -1024) == -1024) && ModernizedCProgram.is_empty_tree_oid(oid) && /* Git does not track empty, non-toplevel directories. */p) {
			generatedBranch_tree.tree_content_remove(p, ((Object)0), 0);
			return /*Error: Unsupported expression*/;
		} 
		byte generatedType = oe.getType();
		if ((((mode) & -1024) == 160000)) {
			if (inline_data) {
				ModernizedCProgram.die("Git links cannot be specified 'inline': %s", generatedBuf);
			}  else if (oe) {
				if (generatedType != object_type.OBJ_COMMIT) {
					ModernizedCProgram.die("Not a commit (actually a %s): %s", ModernizedCProgram.type_name(generatedType), generatedBuf);
				} 
			} 
		}  else if (inline_data) {
			if ((((mode) & -1024) == -1024)) {
				ModernizedCProgram.die("Directories cannot be specified 'inline': %s", generatedBuf);
			} 
			if (p != generatedBuf) {
				uq.strbuf_addstr(p);
				p = generatedBuf;
			} 
			while (ModernizedCProgram.read_next_command() != (true)) {
				byte v;
				if (ModernizedCProgram.skip_prefix(generatedBuf, "cat-blob ", v)) {
					ModernizedCProgram.parse_cat_blob(v);
				} else {
						ModernizedCProgram.parse_and_store_blob(ModernizedCProgram.last_blob, oid, 0);
						break;
				} 
			}
		} else {
				object_type expected = (((mode) & -1024) == -1024) ? object_type.OBJ_TREE : object_type.OBJ_BLOB;
				object_type type = oe ? generatedType : ModernizedCProgram.the_repository.oid_object_info(oid, ((Object)0));
				if (object_type.type < 0) {
					ModernizedCProgram.die("%s not found: %s", (((mode) & -1024) == -1024) ? "Tree" : "Blob", generatedBuf);
				} 
				if (object_type.type != object_type.expected) {
					ModernizedCProgram.die("Not a %s (actually a %s): %s", ModernizedCProgram.type_name(object_type.expected), ModernizedCProgram.type_name(object_type.type), generatedBuf);
				} 
		} 
		if (!p) {
			ModernizedCProgram.tree_content_replace(generatedBranch_tree, oid, mode, ((Object)0));
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.tree_content_set(generatedBranch_tree, p, oid, mode, ((Object)0));
	}
	public void file_change_d(Object p) {
		strbuf uq = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte endp;
		uq.strbuf_setlen(0);
		byte[] generatedBuf = uq.getBuf();
		if (!uq.unquote_c_style(p, endp)) {
			if (endp) {
				ModernizedCProgram.die("Garbage after path in: %s", ModernizedCProgram.command_buf.getBuf());
			} 
			p = generatedBuf;
		} 
		tree_entry generatedBranch_tree = this.getBranch_tree();
		generatedBranch_tree.tree_content_remove(p, ((Object)0), 1);
	}
	public void file_change_cr(Object s, int rename) {
		byte d;
		strbuf s_uq = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf d_uq = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte endp;
		tree_entry leaf = new tree_entry();
		s_uq.strbuf_setlen(0);
		if (!s_uq.unquote_c_style(s, endp)) {
			if (endp != (byte)' ') {
				ModernizedCProgram.die("Missing space after source: %s", ModernizedCProgram.command_buf.getBuf());
			} 
		} else {
				endp = /*Error: Function owner not recognized*/strchr(s, (byte)' ');
				if (!endp) {
					ModernizedCProgram.die("Missing space after source: %s", ModernizedCProgram.command_buf.getBuf());
				} 
				s_uq.strbuf_add(s, endp - s);
		} 
		byte[] generatedBuf = s_uq.getBuf();
		s = generatedBuf;
		endp++;
		if (!endp) {
			ModernizedCProgram.die("Missing dest: %s", generatedBuf);
		} 
		d = endp;
		d_uq.strbuf_setlen(0);
		if (!d_uq.unquote_c_style(d, endp)) {
			if (endp) {
				ModernizedCProgram.die("Garbage after dest in: %s", generatedBuf);
			} 
			d = generatedBuf;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(leaf, 0, /*Error: sizeof expression not supported yet*/);
		tree_entry generatedBranch_tree = this.getBranch_tree();
		if (rename) {
			generatedBranch_tree.tree_content_remove(s, leaf, 1);
		} else {
				generatedBranch_tree.tree_content_get(s, leaf, 1);
		} 
		Object generatedVersions = leaf.getVersions();
		if (!generatedVersions[1].getMode()) {
			ModernizedCProgram.die("Path %s not in branch", s);
		} 
		tree_content generatedTree = leaf.getTree();
		if (!/* C "path/to/subdir" "" */d) {
			ModernizedCProgram.tree_content_replace(generatedBranch_tree, generatedVersions[1].getOid(), generatedVersions[1].getMode(), generatedTree);
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.tree_content_set(generatedBranch_tree, d, generatedVersions[1].getOid(), generatedVersions[1].getMode(), generatedTree);
	}
	public void note_change_n(Object p, Byte old_fanout) {
		strbuf uq = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		object_entry oe = new object_entry();
		branch s = new branch();
		object_id oid = new object_id();
		object_id commit_oid = new object_id();
		byte[] path = new byte[32 * 3];
		uint16_t inline_data = 0;
		byte new_fanout;
		/*
			 * When loading a branch, we don't traverse its tree to count the real
			 * number of notes (too expensive to do this for all non-note refs).
			 * This means that recently loaded notes refs might incorrectly have
			 * b->num_notes == 0, and consequently, old_fanout might be wrong.
			 *
			 * Fix this by traversing the tree and counting the number of notes
			 * when b->num_notes == 0. If the notes tree is truly empty, the
			 * calculation should not take long.
			 */
		Object generatedNum_notes = this.getNum_notes();
		tree_entry generatedBranch_tree = this.getBranch_tree();
		if (generatedNum_notes == 0 && old_fanout == 0) {
			this.setNum_notes(generatedBranch_tree.change_note_fanout(/* Invoke change_note_fanout() in "counting mode". */-1024));
			old_fanout = ModernizedCProgram.convert_num_notes_to_fanout(generatedNum_notes);
		} 
		object_entry object_entry = new object_entry();
		pack_idx_entry generatedIdx = oe.getIdx();
		object_id generatedOid = generatedIdx.getOid();
		object_entry object_entry = new object_entry();
		if (p == /* Now parse the notemodify command. *//* <dataref> or 'inline' */(byte)':') {
			oe = object_entry.find_mark(ModernizedCProgram.parse_mark_ref_space(p));
			oid.oidcpy(generatedOid);
		}  else if (ModernizedCProgram.skip_prefix(p, "inline ", p)) {
			inline_data = 1;
			oe = ((Object)/* not used with inline_data, but makes gcc happy */0);
		} else {
				if (oid.parse_oid_hex(p, p)) {
					ModernizedCProgram.die("Invalid dataref: %s", ModernizedCProgram.command_buf.getBuf());
				} 
				oe = object_entry.find_object(oid);
				if (p++ != (byte)' ') {
					ModernizedCProgram.die("Missing space after SHA1: %s", ModernizedCProgram.command_buf.getBuf());
				} 
		} 
		branch branch = new branch();
		s = branch.lookup_branch(/* <commit-ish> */p);
		byte generatedType = commit_oe.getType();
		if (s) {
			if (ModernizedCProgram.is_null_oid(generatedOid)) {
				ModernizedCProgram.die("Can't add a note on empty branch.");
			} 
			commit_oid.oidcpy(generatedOid);
		}  else if (p == (byte)':') {
			uintmax_t commit_mark = ModernizedCProgram.parse_mark_ref_eol(p);
			object_entry commit_oe = object_entry.find_mark(commit_mark);
			if (generatedType != object_type.OBJ_COMMIT) {
				ModernizedCProgram.die("Mark :%llu not a commit", commit_mark);
			} 
			commit_oid.oidcpy(generatedOid);
		}  else if (!ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, p, commit_oid)) {
			long size;
			byte buf = ModernizedCProgram.read_object_with_reference(ModernizedCProgram.the_repository, commit_oid, ModernizedCProgram.commit_type, size, commit_oid);
			if (!ModernizedCProgram.buf || size < ModernizedCProgram.the_repository.getHash_algo().getHexsz() + 6) {
				ModernizedCProgram.die("Not a valid commit: %s", p);
			} 
			ModernizedCProgram.free(ModernizedCProgram.buf);
		} else {
				ModernizedCProgram.die("Invalid ref name or SHA1 expression: %s", p);
		} 
		byte[] generatedBuf = uq.getBuf();
		if (inline_data) {
			if (p != generatedBuf) {
				uq.strbuf_addstr(p);
				p = generatedBuf;
			} 
			ModernizedCProgram.read_next_command();
			ModernizedCProgram.parse_and_store_blob(ModernizedCProgram.last_blob, oid, 0);
		}  else if (oe) {
			if (generatedType != object_type.OBJ_BLOB) {
				ModernizedCProgram.die("Not a blob (actually a %s): %s", ModernizedCProgram.type_name(generatedType), generatedBuf);
			} 
		}  else if (!ModernizedCProgram.is_null_oid(oid)) {
			object_type type = ModernizedCProgram.the_repository.oid_object_info(oid, ((Object)0));
			if (object_type.type < 0) {
				ModernizedCProgram.die("Blob not found: %s", generatedBuf);
			} 
			if (object_type.type != object_type.OBJ_BLOB) {
				ModernizedCProgram.die("Not a blob (actually a %s): %s", ModernizedCProgram.type_name(object_type.type), generatedBuf);
			} 
		} 
		ModernizedCProgram.construct_path_with_fanout(ModernizedCProgram.oid_to_hex(commit_oid), old_fanout, path);
		if (generatedBranch_tree.tree_content_remove(path, ((Object)0), 0)) {
			generatedNum_notes--;
		} 
		if (ModernizedCProgram.is_null_oid(oid)) {
			return /*Error: Unsupported expression*/;
		} 
		generatedNum_notes++;
		new_fanout = ModernizedCProgram.convert_num_notes_to_fanout(generatedNum_notes);
		ModernizedCProgram.construct_path_with_fanout(ModernizedCProgram.oid_to_hex(commit_oid), new_fanout, path);
		ModernizedCProgram.tree_content_set(generatedBranch_tree, path, oid, -1024 | 644, ((Object)0));
	}
	public void file_change_deleteall() {
		tree_entry generatedBranch_tree = this.getBranch_tree();
		tree_content generatedTree = generatedBranch_tree.getTree();
		generatedTree.release_tree_content_recursive();
		Object generatedVersions = generatedBranch_tree.getVersions();
		generatedVersions[0].getOid().oidclr();
		generatedVersions[1].getOid().oidclr();
		generatedBranch_tree.load_tree();
		this.setNum_notes(0);
	}
	public void parse_from_commit(Byte buf, long size) {
		object_id generatedOid = this.getOid();
		if (!buf || size < ModernizedCProgram.the_repository.getHash_algo().getHexsz() + 6) {
			ModernizedCProgram.die("Not a valid commit: %s", ModernizedCProgram.oid_to_hex(generatedOid));
		} 
		if (/*Error: Function owner not recognized*/memcmp("tree ", buf, 5) || generatedOid.get_oid_hex(buf + 5)) {
			ModernizedCProgram.die("The commit %s is corrupt", ModernizedCProgram.oid_to_hex(generatedOid));
		} 
		generatedOid.oidcpy(generatedOid);
	}
	public void parse_from_existing() {
		object_id generatedOid = this.getOid();
		if (ModernizedCProgram.is_null_oid(generatedOid)) {
			generatedOid.oidclr();
			generatedOid.oidclr();
		} else {
				long size;
				byte buf;
				ModernizedCProgram.buf = ModernizedCProgram.read_object_with_reference(ModernizedCProgram.the_repository, generatedOid, ModernizedCProgram.commit_type, size, generatedOid);
				b.parse_from_commit(ModernizedCProgram.buf, size);
				ModernizedCProgram.free(ModernizedCProgram.buf);
		} 
	}
	public int parse_objectish(Object objectish) {
		branch s = new branch();
		object_id oid = new object_id();
		tree_entry generatedBranch_tree = this.getBranch_tree();
		Object generatedVersions = generatedBranch_tree.getVersions();
		oid.oidcpy(generatedVersions[1].getOid());
		branch branch = new branch();
		s = branch.lookup_branch(objectish);
		Object generatedName = this.getName();
		object_id generatedOid = this.getOid();
		object_entry object_entry = new object_entry();
		byte generatedType = oe.getType();
		Object generatedPack_id = oe.getPack_id();
		if (b == s) {
			ModernizedCProgram.die("Can't create a branch from itself: %s", generatedName);
		}  else if (s) {
			object_id t = generatedVersions[1].getOid();
			generatedOid.oidcpy(generatedOid);
			generatedOid.oidcpy(t);
			generatedOid.oidcpy(t);
		}  else if (objectish == (byte)':') {
			uintmax_t idnum = ModernizedCProgram.parse_mark_ref_eol(objectish);
			object_entry oe = object_entry.find_mark(idnum);
			if (generatedType != object_type.OBJ_COMMIT) {
				ModernizedCProgram.die("Mark :%llu not a commit", idnum);
			} 
			if (!ModernizedCProgram.oideq(generatedOid, generatedOid)) {
				generatedOid.oidcpy(generatedOid);
				if (generatedPack_id != ((1 << 16) - 1)) {
					long size;
					byte buf = oe.gfi_unpack_entry(size);
					b.parse_from_commit(ModernizedCProgram.buf, size);
					ModernizedCProgram.free(ModernizedCProgram.buf);
				} else {
						b.parse_from_existing();
				} 
			} 
		}  else if (!ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, objectish, generatedOid)) {
			b.parse_from_existing();
			if (ModernizedCProgram.is_null_oid(generatedOid)) {
				this.setDelete(1);
			} 
		} else {
				ModernizedCProgram.die("Invalid ref name or SHA1 expression: %s", objectish);
		} 
		tree_content generatedTree = generatedBranch_tree.getTree();
		if (generatedTree && !ModernizedCProgram.oideq(oid, generatedOid)) {
			generatedTree.release_tree_content_recursive();
			generatedBranch_tree.setTree(((Object)0));
		} 
		ModernizedCProgram.read_next_command();
		return 1;
	}
	public int parse_from() {
		byte from;
		if (!ModernizedCProgram.skip_prefix(ModernizedCProgram.command_buf.getBuf(), "from ", from)) {
			return 0;
		} 
		return b.parse_objectish(from);
	}
	public int parse_objectish_with_prefix(Object prefix) {
		byte base;
		if (!ModernizedCProgram.skip_prefix(ModernizedCProgram.command_buf.getBuf(), prefix, base)) {
			return 0;
		} 
		return b.parse_objectish(base);
	}
	public void parse_ls(Object p) {
		tree_entry root = ((Object)0);
		tree_entry leaf = new tree_entry(((Object)0));
		tree_entry generatedBranch_tree = this.getBranch_tree();
		object_entry object_entry = new object_entry();
		tree_entry tree_entry = new tree_entry();
		Object generatedVersions = root.getVersions();
		pack_idx_entry generatedIdx = e.getIdx();
		object_id generatedOid = generatedIdx.getOid();
		if (p == /* ls SP (<tree-ish> SP)? <path> */(byte)'"') {
			if (!b) {
				ModernizedCProgram.die("Not in a commit: %s", ModernizedCProgram.command_buf.getBuf());
			} 
			root = generatedBranch_tree;
		} else {
				object_entry e = object_entry.parse_treeish_dataref(p);
				root = tree_entry.new_tree_entry();
				generatedVersions[1].getOid().oidcpy(generatedOid);
				if (!ModernizedCProgram.is_null_oid(generatedOid)) {
					generatedVersions[1].setMode(-1024);
				} 
				root.load_tree();
		} 
		byte[] generatedBuf = uq.getBuf();
		if (p == (byte)'"') {
			strbuf uq = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			byte endp;
			uq.strbuf_setlen(0);
			if (uq.unquote_c_style(p, endp)) {
				ModernizedCProgram.die("Invalid path: %s", ModernizedCProgram.command_buf.getBuf());
			} 
			if (endp) {
				ModernizedCProgram.die("Garbage after path in: %s", ModernizedCProgram.command_buf.getBuf());
			} 
			p = generatedBuf;
		} 
		root.tree_content_get(p, leaf, 1/*
			 * A directory in preparation would have a sha1 of zero
			 * until it is saved.  Save, for simplicity.
			 */);
		if ((((generatedVersions[1].getMode()) & -1024) == -1024)) {
			leaf.store_tree();
		} 
		Object generatedHash = generatedOid.getHash();
		ModernizedCProgram.print_ls(generatedVersions[1].getMode(), generatedHash, p);
		tree_content generatedTree = leaf.getTree();
		if (generatedTree) {
			generatedTree.release_tree_content_recursive();
		} 
		if (!b || root != generatedBranch_tree) {
			root.release_tree_entry();
		} 
	}
	public branch getTable_next_branch() {
		return table_next_branch;
	}
	public void setTable_next_branch(branch newTable_next_branch) {
		table_next_branch = newTable_next_branch;
	}
	public branch getActive_next_branch() {
		return active_next_branch;
	}
	public void setActive_next_branch(branch newActive_next_branch) {
		active_next_branch = newActive_next_branch;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public tree_entry getBranch_tree() {
		return branch_tree;
	}
	public void setBranch_tree(tree_entry newBranch_tree) {
		branch_tree = newBranch_tree;
	}
	public Object getLast_commit() {
		return last_commit;
	}
	public void setLast_commit(Object newLast_commit) {
		last_commit = newLast_commit;
	}
	public Object getNum_notes() {
		return num_notes;
	}
	public void setNum_notes(Object newNum_notes) {
		num_notes = newNum_notes;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int newActive) {
		active = newActive;
	}
	public int getDelete() {
		return delete;
	}
	public void setDelete(int newDelete) {
		delete = newDelete;
	}
	public int getPack_id() {
		return pack_id;
	}
	public void setPack_id(int newPack_id) {
		pack_id = newPack_id;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
}
