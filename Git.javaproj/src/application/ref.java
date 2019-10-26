package application;

/* when renaming */
/* Used for protocol v2 in order to retrieve refs from a remote */
/* Return refs which no longer exist on remote */
public class ref {
	private ref next;
	private object_id old_oid;
	private object_id new_oid;
	private object_id old_oid_expect;
	private Byte symref;
	private int force;
	private int forced_update;
	private int expect_old_sha1;
	private int exact_oid;
	private int deletion;
	private  match_status;
	private  fetch_head_status;
	private  status;
	private Byte remote_status;
	private ref peer_ref;
	private Object name;
	
	public ref(ref next, object_id old_oid, object_id new_oid, object_id old_oid_expect, Byte symref, int force, int forced_update, int expect_old_sha1, int exact_oid, int deletion,  match_status,  fetch_head_status,  status, Byte remote_status, ref peer_ref, Object name) {
		setNext(next);
		setOld_oid(old_oid);
		setNew_oid(new_oid);
		setOld_oid_expect(old_oid_expect);
		setSymref(symref);
		setForce(force);
		setForced_update(forced_update);
		setExpect_old_sha1(expect_old_sha1);
		setExact_oid(exact_oid);
		setDeletion(deletion);
		setMatch_status(match_status);
		setFetch_head_status(fetch_head_status);
		setStatus(status);
		setRemote_status(remote_status);
		setPeer_ref(peer_ref);
		setName(name);
	}
	public ref() {
	}
	
	public int http_fetch_ref(Object base) {
		http_get_options options = new http_get_options(0);
		byte url;
		strbuf buffer = new strbuf(, , );
		int ret = -1;
		options.setNo_cache(1);
		Object generatedName = this.getName();
		url = ModernizedCProgram.quote_ref_url(base, generatedName);
		Object generatedLen = buffer.getLen();
		byte generatedBuf = buffer.getBuf();
		object_id generatedOld_oid = this.getOld_oid();
		if (ModernizedCProgram.http_get_strbuf(url, buffer, options) == 0) {
			buffer.strbuf_rtrim();
			if (generatedLen == ModernizedCProgram.the_repository.getHash_algo().getHexsz()) {
				ret = generatedOld_oid.get_oid_hex(generatedBuf);
			}  else if (ModernizedCProgram.starts_with(generatedBuf, "ref: ")) {
				this.setSymref(ModernizedCProgram.xstrdup(generatedBuf + 5));
				ret = 0;
			} 
		} 
		buffer.strbuf_release();
		ModernizedCProgram.free(url);
		return ret;
	}
	public void annotate_refs_with_symref_info() {
		string_list symref = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		byte feature_list = ModernizedCProgram.server_capabilities_v1;
		while (feature_list) {
			int len;
			byte val;
			val = ModernizedCProgram.parse_feature_value(feature_list, "symref", ModernizedCProgram.len);
			if (!val) {
				break;
			} 
			symref.parse_one_symref_info(val, ModernizedCProgram.len);
			feature_list = val + 1;
		}
		symref.string_list_sort();
		Object generatedName = this.getName();
		string_list_item string_list_item = new string_list_item();
		Object generatedUtil = item.getUtil();
		ref generatedNext = this.getNext();
		for (; ref; ref = generatedNext) {
			string_list_item item = new string_list_item();
			item = string_list_item.string_list_lookup(symref, generatedName);
			if (!item) {
				continue;
			} 
			this.setSymref(ModernizedCProgram.xstrdup((byte)generatedUtil));
		}
		symref.string_list_clear(0);
	}
	public ref get_remote_heads(packet_reader reader, int flags, oid_array extra_have, oid_array shallow_points) {
		ref orig_list = ModernizedCProgram.list;
		int len = 0;
		get_remote_heads_state state = get_remote_heads_state.EXPECTING_FIRST_REF;
		ModernizedCProgram.list = ((Object)0);
		int generatedPktlen = reader.getPktlen();
		Object generatedLine = reader.getLine();
		while (get_remote_heads_state.state != get_remote_heads_state.EXPECTING_DONE) {
			switch (reader.packet_reader_read()) {
			case packet_read_status.PACKET_READ_FLUSH:
					get_remote_heads_state.state = get_remote_heads_state.EXPECTING_DONE;
					break;
			case packet_read_status.PACKET_READ_EOF:
					ModernizedCProgram.die_initial_contact(1);
			case packet_read_status.PACKET_READ_DELIM:
					ModernizedCProgram.die(ModernizedCProgram._("invalid packet"));
			case packet_read_status.PACKET_READ_NORMAL:
					len = generatedPktlen;
					break;
			}
			switch (get_remote_heads_state.state) {
			case get_remote_heads_state.EXPECTING_FIRST_REF:
					ModernizedCProgram.process_capabilities(generatedLine, len);
					if (ModernizedCProgram.process_dummy_ref(generatedLine)) {
						get_remote_heads_state.state = get_remote_heads_state.EXPECTING_SHALLOW;
						break;
					} 
					get_remote_heads_state.state = get_remote_heads_state.EXPECTING_REF;
			case get_remote_heads_state.EXPECTING_DONE:
					break;
			case /* fallthrough */get_remote_heads_state.EXPECTING_SHALLOW:
					if (shallow_points.process_shallow(generatedLine, len)) {
						break;
					} 
					ModernizedCProgram.die(ModernizedCProgram._("protocol error: unexpected '%s'"), generatedLine);
			case /* fallthrough */get_remote_heads_state.EXPECTING_REF:
					if (ModernizedCProgram.process_ref(generatedLine, len, ModernizedCProgram.list, flags, extra_have)) {
						break;
					} 
					get_remote_heads_state.state = get_remote_heads_state.EXPECTING_SHALLOW;
			}
		}
		orig_list.annotate_refs_with_symref_info();
		return ModernizedCProgram.list;
	}
	/* Returns 1 when a valid ref has been added to `list`, 0 otherwise */
	public int process_ref_v2(Object line) {
		int ret = 1;
		int i = 0;
		object_id old_oid = new object_id();
		ref ref = new ref();
		string_list line_sections = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		byte end;
		/*
			 * Ref lines have a number of fields which are space deliminated.  The
			 * first field is the OID of the ref.  The second field is the ref
			 * name.  Subsequent fields (symref-target and peeled) are optional and
			 * don't have a particular order.
			 */
		if (line_sections.string_list_split(line, (byte)' ', -1) < 2) {
			ret = 0;
			;
		} 
		string_list_item generatedItems = line_sections.getItems();
		if (old_oid.parse_oid_hex(generatedItems[i++].getString(), end) || end) {
			ret = 0;
			;
		} 
		ref = .alloc_ref(generatedItems[i++].getString());
		object_id generatedOld_oid = ref.getOld_oid();
		generatedOld_oid.oidcpy(old_oid);
		ModernizedCProgram.list = ref;
		ref generatedNext = ref.getNext();
		ModernizedCProgram.list = generatedNext;
		int generatedNr = line_sections.getNr();
		Object generatedName = ref.getName();
		for (; i < generatedNr; i++) {
			byte arg = generatedItems[i].getString();
			if (ModernizedCProgram.skip_prefix(arg, "symref-target:", arg)) {
				ref.setSymref(ModernizedCProgram.xstrdup(arg));
			} 
			if (ModernizedCProgram.skip_prefix(arg, "peeled:", arg)) {
				object_id peeled_oid = new object_id();
				byte peeled_name;
				ref peeled = new ref();
				if (peeled_oid.parse_oid_hex(arg, end) || end) {
					ret = 0;
					;
				} 
				peeled_name = ModernizedCProgram.xstrfmt("%s^{}", generatedName);
				peeled = .alloc_ref(peeled_name);
				generatedOld_oid.oidcpy(peeled_oid);
				ModernizedCProgram.list = peeled;
				ModernizedCProgram.list = generatedNext;
				ModernizedCProgram.free(peeled_name);
			} 
		}
		return ret;
	}
	public ref get_remote_refs(int fd_out, packet_reader reader, int for_push, Object ref_prefixes, Object server_options) {
		int i;
		ModernizedCProgram.list = ((Object)0);
		if (ModernizedCProgram.server_supports_v2("ls-refs", 1)) {
			ModernizedCProgram.packet_write_fmt(fd_out, "command=ls-refs\n");
		} 
		if (ModernizedCProgram.server_supports_v2("agent", 0)) {
			ModernizedCProgram.packet_write_fmt(fd_out, "agent=%s", ModernizedCProgram.git_user_agent_sanitized());
		} 
		if (server_options && server_options.getNr() && ModernizedCProgram.server_supports_v2("server-option", 1)) {
			for (i = 0; i < server_options.getNr(); i++) {
				ModernizedCProgram.packet_write_fmt(fd_out, "server-option=%s", server_options.getItems()[i].getString());
			}
		} 
		ModernizedCProgram.packet_delim(fd_out);
		if (!/* When pushing we don't want to request the peeled tags */for_push) {
			ModernizedCProgram.packet_write_fmt(fd_out, "peel\n");
		} 
		ModernizedCProgram.packet_write_fmt(fd_out, "symrefs\n");
		for (i = 0; ref_prefixes && i < ref_prefixes.getArgc(); i++) {
			ModernizedCProgram.packet_write_fmt(fd_out, "ref-prefix %s\n", ref_prefixes.getArgv()[i]);
		}
		ModernizedCProgram.packet_flush(fd_out);
		Object generatedLine = reader.getLine();
		while (reader.packet_reader_read() == /* Process response from server */packet_read_status.PACKET_READ_NORMAL) {
			if (!ModernizedCProgram.list.process_ref_v2(generatedLine)) {
				ModernizedCProgram.die(ModernizedCProgram._("invalid ls-refs response: %s"), generatedLine);
			} 
		}
		packet_read_status generatedStatus = reader.getStatus();
		if (generatedStatus != packet_read_status.PACKET_READ_FLUSH) {
			ModernizedCProgram.die(ModernizedCProgram._("expected flush after ref listing"));
		} 
		return ModernizedCProgram.list;
	}
	public int fetch_refs(Object remote_name) {
		remote remote = new remote();
		transport transport = new transport();
		int original_fetch_if_missing = ModernizedCProgram.fetch_if_missing;
		int res;
		ModernizedCProgram.fetch_if_missing = 0;
		remote = .remote_get(remote_name);
		Object generatedUrl = remote.getUrl();
		if (!generatedUrl[0]) {
			ModernizedCProgram.die(ModernizedCProgram._("Remote with no URL"));
		} 
		transport transport = new transport();
		transport = transport.transport_get(remote, generatedUrl[0]);
		transport.transport_set_option("from-promisor", "1");
		transport.transport_set_option("no-dependents", "1");
		res = ModernizedCProgram.transport_fetch_refs(transport, ref);
		ModernizedCProgram.fetch_if_missing = original_fetch_if_missing;
		return res;
		int ret = ref_map.check_exist_and_connected();
		if (ret) {
			ModernizedCProgram.trace2_region_enter_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fetch.c", 1089, ("fetch"), ("fetch_refs"), (ModernizedCProgram.the_repository));
			ret = ModernizedCProgram.transport_fetch_refs(transport, ref_map);
			ModernizedCProgram.trace2_region_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fetch.c", 1091, ("fetch"), ("fetch_refs"), (ModernizedCProgram.the_repository));
		} 
		if (!ret/*
				 * Keep the new pack's ".keep" file around to allow the caller
				 * time to update refs to reference the new objects.
				 */) {
			return 0;
		} 
		transport.transport_unlock_pack();
		return ret;
	}
	public void find_non_local_tags(Object refs, ref tail) {
		hashmap existing_refs = new hashmap();
		hashmap remote_refs = new hashmap();
		oidset fetch_oids = new oidset(new oidset(0));
		string_list remote_refs_list = new string_list(((Object)0), 0, 0, 0, ((Object)0));
		string_list_item remote_ref_item = new string_list_item();
		ref ref = new ref();
		refname_hash_entry item = ((Object)0);
		existing_refs.refname_hash_init();
		remote_refs.refname_hash_init();
		ModernizedCProgram.create_fetch_oidset(head, fetch_oids);
		ModernizedCProgram.for_each_ref(add_one_refname, existing_refs);
		object_id generatedOid = item.getOid();
		refname_hash_entry refname_hash_entry = new refname_hash_entry();
		string_list_item string_list_item = new string_list_item();
		for (ref = refs; ref; ref = ref.getNext()) {
			if (!ModernizedCProgram.starts_with(ref.getName(), "refs/tags/")) {
				continue;
			} 
			if (ModernizedCProgram.ends_with(ref.getName(), "^{}")) {
				if (item && !ModernizedCProgram.the_repository.repo_has_object_file_with_flags(ref.getOld_oid(), 8) && !ModernizedCProgram.oidset_contains(fetch_oids, ref.getOld_oid()) && !ModernizedCProgram.the_repository.repo_has_object_file_with_flags(generatedOid, 8) && !ModernizedCProgram.oidset_contains(fetch_oids, generatedOid)) {
					item.clear_item();
				} 
				item = ((Object)0);
				continue;
			} 
			if (item && !ModernizedCProgram.the_repository.repo_has_object_file_with_flags(generatedOid, 8) && !ModernizedCProgram.oidset_contains(fetch_oids, generatedOid)) {
				item.clear_item();
			} 
			item = ((Object)0);
			if (remote_refs.refname_hash_exists(ref.getName()) || existing_refs.refname_hash_exists(ref.getName())) {
				continue;
			} 
			item = refname_hash_entry.refname_hash_add(remote_refs, ref.getName(), ref.getOld_oid());
			string_list_item.string_list_insert(remote_refs_list, ref.getName());
		}
		existing_refs.hashmap_free_(((size_t)((refname_hash_entry)0).getEnt()));
		;
		if (item && !ModernizedCProgram.the_repository.repo_has_object_file_with_flags(generatedOid, 8) && !ModernizedCProgram.oidset_contains(fetch_oids, generatedOid)) {
			item/*
				 * For all the tags in the remote_refs_list,
				 * add them to the list of refs to be fetched
				 */.clear_item();
		} 
		string_list_item generatedItems = (remote_refs_list).getItems();
		int generatedNr = (remote_refs_list).getNr();
		byte generatedString = remote_ref_item.getString();
		hashmap_entry hashmap_entry = new hashmap_entry();
		int generatedIgnore = item.getIgnore();
		Object generatedRefname = item.getRefname();
		object_id generatedOld_oid = rm.getOld_oid();
		ref generatedNext = rm.getNext();
		for (remote_ref_item = generatedItems; remote_ref_item && remote_ref_item < generatedItems + generatedNr; ++remote_ref_item) {
			byte refname = generatedString;
			ref rm = new ref();
			int hash = ModernizedCProgram.strhash(refname);
			item = (refname_hash_entry)ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get_from_hash(remote_refs, hash, refname), ((size_t)((refname_hash_entry)0).getEnt()));
			if (!item) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fetch.c", 407, "unseen remote ref?");
			} 
			if (generatedIgnore) {
				continue;
			} 
			rm = .alloc_ref(generatedRefname);
			rm.setPeer_ref(.alloc_ref(generatedRefname));
			generatedOld_oid.oidcpy(generatedOid);
			tail = rm;
			tail = generatedNext;
		}
		remote_refs.hashmap_free_(((size_t)((refname_hash_entry)0).getEnt()));
		;
		remote_refs_list.string_list_clear(0);
		fetch_oids.oidset_clear();
	}
	public ref get_ref_map(remote remote, Object remote_refs, refspec rs, int tags, int autotags) {
		int i;
		ref rm = new ref();
		ref ref_map = ((Object)0);
		ref tail = ref_map;
		ref orefs = ((Object)0);
		ref oref_tail = /* opportunistically-updated references: */orefs;
		hashmap existing_refs = new hashmap();
		int generatedNr = rs.getNr();
		refspec_item generatedItems = rs.getItems();
		ref generatedNext = rm.getNext();
		refspec generatedFetch = remote.getFetch();
		Object generatedName = remote.getName();
		if (generatedNr) {
			refspec fetch_refspec = new refspec();
			for (i = 0; i < generatedNr; i++) {
				.get_fetch_map(remote_refs, generatedItems[i], tail, 0);
				if (generatedItems[i].getDst() && generatedItems[i].getDst()[0]) {
					autotags = 1;
				} 
			}
			for (rm = ref_map; rm; rm = generatedNext) {
				rm.setFetch_head_status(.FETCH_HEAD_MERGE/*
						 * For any refs that we happen to be fetching via
						 * command-line arguments, the destination ref might
						 * have been missing or have been different than the
						 * remote-tracking ref that would be derived from the
						 * configured refspec.  In these cases, we want to
						 * take the opportunity to update their configured
						 * remote-tracking reference.  However, we do not want
						 * to mention these entries in FETCH_HEAD at all, as
						 * they would simply be duplicates of existing
						 * entries, so we set them FETCH_HEAD_IGNORE below.
						 *
						 * We compute these entries now, based only on the
						 * refspecs specified on the command line.  But we add
						 * them to the list following the refspecs resulting
						 * from the tags option so that one of the latter,
						 * which has FETCH_HEAD_NOT_FOR_MERGE, is not removed
						 * by ref_remove_duplicates() in favor of one of these
						 * opportunistic entries with FETCH_HEAD_IGNORE.
						 */);
			}
			if (generatedNr) {
				fetch_refspec = ModernizedCProgram.refmap;
			} else {
					fetch_refspec = generatedFetch;
			} 
			for (i = 0; i < generatedNr; i++) {
				.get_fetch_map(ref_map, generatedItems[i], oref_tail, 1);
			}
		}  else if (generatedNr) {
			ModernizedCProgram.die("--refmap option is only meaningful with command-line refspec(s).");
		} else {
				branch branch = .branch_get(((Object)/* Use the defaults */0));
				int has_merge = .branch_has_merge_config(ModernizedCProgram.branch);
				if (remote && (generatedNr || (has_merge && !.strcmp(ModernizedCProgram.branch.getRemote_name(), generatedName)))) {
					for (i = 0; i < generatedNr; i++) {
						.get_fetch_map(remote_refs, generatedItems[i], tail, 0);
						if (generatedItems[i].getDst() && generatedItems[i].getDst()[0]) {
							autotags = 1;
						} 
						if (!i && !has_merge && ref_map && !generatedItems[0].getPattern()) {
							ref_map.setFetch_head_status(.FETCH_HEAD_MERGE/*
										 * if the remote we're fetching from is the same
										 * as given in branch.<name>.remote, we add the
										 * ref given in branch.<name>.merge, too.
										 *
										 * Note: has_merge implies non-NULL branch->remote_name
										 */);
						} 
					}
					if (has_merge && !.strcmp(ModernizedCProgram.branch.getRemote_name(), generatedName)) {
						ModernizedCProgram.add_merge_config(ref_map, remote_refs, ModernizedCProgram.branch, tail);
					} 
				} else {
						ref_map = .get_remote_ref(remote_refs, "HEAD");
						if (!ref_map) {
							ModernizedCProgram.die(ModernizedCProgram._("Couldn't find remote ref HEAD"));
						} 
						ref_map.setFetch_head_status(.FETCH_HEAD_MERGE);
						tail = generatedNext;
				} 
		} 
		if (tags == .TAGS_SET) {
			.get_fetch_map(remote_refs, ModernizedCProgram.tag_refspec, tail, /* also fetch all tags */0);
		}  else if (tags == .TAGS_DEFAULT && autotags) {
			ref_map.find_non_local_tags(remote_refs, tail);
		} 
		tail = /* Now append any refs to be updated opportunistically: */orefs;
		for (rm = orefs; rm; rm = generatedNext) {
			rm.setFetch_head_status(.FETCH_HEAD_IGNORE);
			tail = generatedNext;
		}
		ref_map = .ref_remove_duplicates(ref_map);
		existing_refs.refname_hash_init();
		ModernizedCProgram.for_each_ref(add_one_refname, existing_refs);
		ref generatedPeer_ref = rm.getPeer_ref();
		hashmap_entry hashmap_entry = new hashmap_entry();
		object_id generatedOid = peer_item.getOid();
		object_id generatedOld_oid = generatedPeer_ref.getOld_oid();
		for (rm = ref_map; rm; rm = generatedNext) {
			if (generatedPeer_ref) {
				byte refname = generatedName;
				refname_hash_entry peer_item = new refname_hash_entry();
				int hash = ModernizedCProgram.strhash(refname);
				peer_item = (refname_hash_entry)ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get_from_hash(existing_refs, hash, refname), ((size_t)((refname_hash_entry)0).getEnt()));
				if (peer_item) {
					object_id old_oid = generatedOid;
					generatedOld_oid.oidcpy(old_oid);
				} 
			} 
		}
		existing_refs.hashmap_free_(((size_t)((refname_hash_entry)0).getEnt()));
		;
		return ref_map;
	}
	public int s_update_ref(Object action, int check_old) {
		byte msg;
		byte rla = .getenv("GIT_REFLOG_ACTION");
		ref_transaction transaction = new ref_transaction();
		strbuf err = new strbuf(, , );
		int ret;
		int df_conflict = 0;
		if (ModernizedCProgram.dry_run) {
			return 0;
		} 
		if (!rla) {
			rla = ModernizedCProgram.default_rla.getBuf();
		} 
		msg = ModernizedCProgram.xstrfmt("%s: %s", rla, action);
		ref_transaction ref_transaction = new ref_transaction();
		transaction = ref_transaction.ref_transaction_begin(err);
		Object generatedName = this.getName();
		object_id generatedNew_oid = this.getNew_oid();
		object_id generatedOld_oid = this.getOld_oid();
		if (!transaction || ModernizedCProgram.ref_transaction_update(transaction, generatedName, generatedNew_oid, check_old ? generatedOld_oid : ((Object)0), 0, msg, err)) {
			;
		} 
		ret = ModernizedCProgram.ref_transaction_commit(transaction, err);
		if (ret) {
			df_conflict = (ret == -1);
			;
		} 
		transaction.ref_transaction_free();
		err.strbuf_release();
		ModernizedCProgram.free(msg);
		return 0;
		();
		err.strbuf_release();
		ModernizedCProgram.free(msg);
		return df_conflict ? 2 : 1;
	}
	public void prepare_format_display() {
		ref rm = new ref();
		byte format = "full";
		.git_config_get_string_const("fetch.output", format);
		if (!.strcasecmp(format, "full")) {
			ModernizedCProgram.compact_format = 0;
		}  else if (!.strcasecmp(format, "compact")) {
			ModernizedCProgram.compact_format = 1;
		} else {
				ModernizedCProgram.die(ModernizedCProgram._("configuration fetch.output contains invalid value %s"), format);
		} 
		 generatedStatus = rm.getStatus();
		ref generatedPeer_ref = rm.getPeer_ref();
		Object generatedName = rm.getName();
		ref generatedNext = rm.getNext();
		for (rm = ref_map; rm; rm = generatedNext) {
			if (generatedStatus == .REF_STATUS_REJECT_SHALLOW || !generatedPeer_ref || !.strcmp(generatedName, "HEAD")) {
				continue;
			} 
			ModernizedCProgram.adjust_refcol_width(rm);
		}
	}
	public int store_updated_refs(Object raw_url, Object remote_name, int connectivity_checked) {
		FILE fp = new FILE();
		commit commit = new commit();
		int url_len;
		int i;
		int rc = 0;
		strbuf note = new strbuf(, , );
		byte what;
		byte kind;
		ref rm = new ref();
		byte url;
		byte filename = ModernizedCProgram.dry_run ? "/dev/null" : ModernizedCProgram.the_repository.git_path_fetch_head();
		int want_status;
		int summary_width = ModernizedCProgram.transport_summary_width(ref_map);
		fp = .fopen(filename, "a");
		if (!fp) {
			return ();
		} 
		if (raw_url) {
			url = ModernizedCProgram.transport_anonymize_url(raw_url);
		} else {
				url = ModernizedCProgram.xstrdup("foreign");
		} 
		if (!connectivity_checked) {
			rm = ref_map;
			if (((Object)0).check_connected(iterate_ref_map, rm)) {
				rc = ();
				;
			} 
		} 
		ref_map/*
			 * We do a pass for each fetch_head_status type in their enum order, so
			 * merged entries are written before not-for-merge. That lets readers
			 * use FETCH_HEAD as a refname to refer to the ref to be merged.
			 */.prepare_format_display();
		 generatedStatus = rm.getStatus();
		ref generatedPeer_ref = rm.getPeer_ref();
		Object generatedName = generatedPeer_ref.getName();
		object_id generatedOld_oid = rm.getOld_oid();
		 generatedFetch_head_status = rm.getFetch_head_status();
		object_id generatedNew_oid = ref.getNew_oid();
		int generatedForce = generatedPeer_ref.getForce();
		byte generatedBuf = note.getBuf();
		Object generatedLen = note.getLen();
		ref generatedNext = rm.getNext();
		for (want_status = .FETCH_HEAD_MERGE; want_status <= .FETCH_HEAD_IGNORE; want_status++) {
			for (rm = ref_map; rm; rm = generatedNext) {
				ref ref = ((Object)0);
				byte merge_status_marker = "";
				if (generatedStatus == .REF_STATUS_REJECT_SHALLOW) {
					if (want_status == .FETCH_HEAD_MERGE) {
						ModernizedCProgram.warning(ModernizedCProgram._("reject %s because shallow roots are not allowed to be updated"), generatedPeer_ref ? generatedName : generatedName);
					} 
					continue;
				} 
				commit = .lookup_commit_reference_gently(ModernizedCProgram.the_repository, generatedOld_oid, 1);
				if (!commit) {
					rm.setFetch_head_status(.FETCH_HEAD_NOT_FOR_MERGE);
				} 
				if (generatedFetch_head_status != want_status) {
					continue;
				} 
				if (generatedPeer_ref) {
					ref = .alloc_ref(generatedName);
					generatedOld_oid.oidcpy(generatedOld_oid);
					generatedNew_oid.oidcpy(generatedOld_oid);
					ref.setForce(generatedForce);
				} 
				if (ModernizedCProgram.recurse_submodules != .RECURSE_SUBMODULES_OFF) {
					generatedOld_oid.check_for_new_submodule_commits();
				} 
				if (!.strcmp(generatedName, "HEAD")) {
					kind = "";
					what = "";
				}  else if (ModernizedCProgram.starts_with(generatedName, "refs/heads/")) {
					kind = "branch";
					what = generatedName + 11;
				}  else if (ModernizedCProgram.starts_with(generatedName, "refs/tags/")) {
					kind = "tag";
					what = generatedName + 10;
				}  else if (ModernizedCProgram.starts_with(generatedName, "refs/remotes/")) {
					kind = "remote-tracking branch";
					what = generatedName + 13;
				} else {
						kind = "";
						what = generatedName;
				} 
				url_len = .strlen(url);
				for (i = url_len - 1; url[i] == (byte)'/' && 0 <= i; i--) {
					;
				}
				url_len = i + 1;
				if (4 < i && !.strncmp(".git", url + i - 3, 4)) {
					url_len = i - 3;
				} 
				note.strbuf_setlen(0);
				if (what) {
					if (kind) {
						note.strbuf_addf("%s ", kind);
					} 
					note.strbuf_addf("'%s' of ", what);
				} 
				switch (generatedFetch_head_status) {
				case /* fall-through */.FETCH_HEAD_MERGE:
						.fprintf(fp, "%s\t%s\t%s", ModernizedCProgram.oid_to_hex(generatedOld_oid), merge_status_marker, generatedBuf);
						for (i = 0; i < url_len; ++i) {
							if ((byte)'\n' == url[i]) {
								.fputs("\\n", fp);
							} else {
									.fputc(url[i], fp);
							} 
						}
						.fputc((byte)'\n', fp);
						break;
				case .FETCH_HEAD_NOT_FOR_MERGE:
						merge_status_marker = "not-for-merge";
				default:
						break;
				}
				note.strbuf_setlen(0);
				if (ref) {
					rc |=  ModernizedCProgram.update_local_ref(ref, what, rm, note, summary_width);
					ModernizedCProgram.free(ref);
				} else {
						note.format_display((byte)'*', kind ? kind : "branch", ((Object)0), what ? what : "HEAD", "FETCH_HEAD", summary_width);
				} 
				if (generatedLen) {
					if (ModernizedCProgram.verbosity >= 0 && !ModernizedCProgram.shown_url) {
						.fprintf((_iob[2]), ModernizedCProgram._("From %.*s\n"), url_len, url);
						ModernizedCProgram.shown_url = 1;
					} 
					if (ModernizedCProgram.verbosity >= 0) {
						.fprintf((_iob[2]), " %s\n", generatedBuf);
					} 
				} 
			}
		}
		if (rc & 2) {
			();
		} 
		if (ModernizedCProgram.advice_fetch_show_forced_updates) {
			if (!ModernizedCProgram.fetch_show_forced_updates) {
				ModernizedCProgram.warning(ModernizedCProgram._(ModernizedCProgram.warn_show_forced_updates));
			}  else if (ModernizedCProgram.forced_updates_ms > (10 * 1000)) {
				ModernizedCProgram.warning(ModernizedCProgram._(ModernizedCProgram.warn_time_show_forced_updates), ModernizedCProgram.forced_updates_ms / 1000.0);
			} 
		} 
		ModernizedCProgram.free(url);
		.fclose(fp);
		return rc/*
		 * We would want to bypass the object transfer altogether if
		 * everything we are going to fetch already exists and is connected
		 * locally.
		 */;
	}
	public int check_exist_and_connected() {
		ref rm = ref_map;
		check_connected_options opt = new check_connected_options(0);
		ref r = new ref();
		/*
			 * If we are deepening a shallow clone we already have these
			 * objects reachable.  Running rev-list here will return with
			 * a good (0) exit status and we'll bypass the fetch that we
			 * really need to perform.  Claiming failure now will ensure
			 * we perform the network exchange to deepen our history.
			 */
		if (ModernizedCProgram.deepen) {
			return -1/*
				 * check_connected() allows objects to merely be promised, but
				 * we need all direct targets to exist.
				 */;
		} 
		object_id generatedOld_oid = r.getOld_oid();
		ref generatedNext = r.getNext();
		for (r = rm; r; r = generatedNext) {
			if (!ModernizedCProgram.the_repository.repo_has_object_file(generatedOld_oid)) {
				return -1;
			} 
		}
		opt.setQuiet(1);
		return opt.check_connected(iterate_ref_map, rm);
	}
	public void check_not_current_branch() {
		branch current_branch = .branch_get(((Object)0));
		if (ModernizedCProgram.is_bare_repository() || !current_branch) {
			return ;
		} 
		ref generatedPeer_ref = this.getPeer_ref();
		Object generatedRefname = current_branch.getRefname();
		Object generatedName = generatedPeer_ref.getName();
		ref generatedNext = this.getNext();
		for (; ref_map; ref_map = generatedNext) {
			if (generatedPeer_ref && !.strcmp(generatedRefname, generatedName)) {
				ModernizedCProgram.die(ModernizedCProgram._("Refusing to fetch into current branch %s of non-bare repository"), generatedRefname);
			} 
		}
	}
	public void add_sought_entry(int nr, int alloc, Object name) {
		ref ref = new ref();
		object_id oid = new object_id();
		byte p;
		if (!oid.parse_oid_hex(name, p)) {
			if (p == (byte)' ') {
				name = p + /* <oid> <ref>, find refname */1;
			}  else if (p == (byte)'\0') {
				;
			} else {
					/* <ref>, clear cruft from oid */oid.oidclr();
			} 
		} else {
				/* <ref>, clear cruft from get_oid_hex */oid.oidclr();
		} 
		ref = .alloc_ref(name);
		object_id generatedOld_oid = ref.getOld_oid();
		generatedOld_oid.oidcpy(oid);
		(nr)++;
		do {
			if ((nr) > alloc) {
				if ((((alloc) + 16) * 3 / 2) < (nr)) {
					alloc = (nr);
				} else {
						alloc = (((alloc) + 16) * 3 / 2);
				} 
				(sought) = ModernizedCProgram.xrealloc((sought), ModernizedCProgram.st_mult(, (alloc)));
			} 
		} while (0);
		(sought)[nr - 1] = ref;
	}
	public ref parse_git_refs(discovery heads, int for_push) {
		ref list = ((Object)0);
		packet_reader reader = new packet_reader();
		Byte generatedBuf = heads.getBuf();
		Object generatedLen = heads.getLen();
		reader.packet_reader_init(-1, generatedBuf, generatedLen, (-1024 << 1) | (-1024 << 0) | (-1024 << 2));
		heads.setVersion(reader.discover_version());
		oid_array generatedShallow = heads.getShallow();
		protocol_version generatedVersion = heads.getVersion();
		switch (generatedVersion) {
		case protocol_version.protocol_v1:
		case protocol_version.protocol_unknown_version:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\remote-curl.c", 236, "unknown protocol version");
		case protocol_version.protocol_v0:
				list.get_remote_heads(reader, for_push ? (-1024 << 0) : 0, ((Object)0), generatedShallow);
				break;
		case protocol_version.protocol_v2/*
				 * Do nothing.  This isn't a list of refs but rather a
				 * capability advertisement.  Client would have run
				 * 'stateless-connect' so we'll dump this capability listing
				 * and let them request the refs themselves.
				 */:
				break;
		}
		return list;
	}
	public ref parse_info_refs(discovery heads) {
		byte data;
		byte start;
		byte mid;
		byte ref_name;
		int i = 0;
		ref refs = ((Object)0);
		ref ref = ((Object)0);
		ref last_ref = ((Object)0);
		Byte generatedBuf = heads.getBuf();
		data = generatedBuf;
		start = ((Object)0);
		mid = data;
		Object generatedLen = heads.getLen();
		object_id generatedOld_oid = ref.getOld_oid();
		while (i < generatedLen) {
			if (!start) {
				start = data[i];
			} 
			if (data[i] == (byte)'\t') {
				mid = data[i];
			} 
			if (data[i] == (byte)'\n') {
				if (mid - start != ModernizedCProgram.the_repository.getHash_algo().getHexsz()) {
					ModernizedCProgram.die(ModernizedCProgram._("%sinfo/refs not valid: is this a git repository?"), ModernizedCProgram.transport_anonymize_url(generatedBuf));
				} 
				data[i] = 0;
				ref_name = mid + 1;
				ref = .alloc_ref(ref_name);
				generatedOld_oid.get_oid_hex(start);
				if (!refs) {
					refs = ref;
				} 
				if (last_ref) {
					last_ref.setNext(ref);
				} 
				last_ref = ref;
				start = ((Object)0);
			} 
			i++;
		}
		ref = .alloc_ref("HEAD");
		if (!ref.http_fetch_ref(generatedBuf) && !.resolve_remote_symref(ref, refs)) {
			ref.setNext(refs);
			refs = ref;
		} else {
				ModernizedCProgram.free(ref);
		} 
		return refs;
	}
	public ref get_refs(int for_push) {
		discovery heads = new discovery();
		discovery discovery = new discovery();
		if (for_push) {
			heads = discovery.discover_refs("git-receive-pack", for_push);
		} else {
				heads = discovery.discover_refs("git-upload-pack", for_push);
		} 
		ref generatedRefs = heads.getRefs();
		return generatedRefs;
	}
	public void output_refs() {
		ref posn = new ref();
		Byte generatedSymref = posn.getSymref();
		Object generatedName = posn.getName();
		object_id generatedOld_oid = posn.getOld_oid();
		ref generatedNext = posn.getNext();
		for (posn = refs; posn; posn = generatedNext) {
			if (generatedSymref) {
				.printf("@%s %s\n", generatedSymref, generatedName);
			} else {
					.printf("%s %s\n", ModernizedCProgram.oid_to_hex(generatedOld_oid), generatedName);
			} 
		}
		.printf("\n");
		.fflush((_iob[1]));
	}
	public int fetch_dumb(int nr_heads) {
		walker walker = new walker();
		byte targets;
		int ret;
		int i;
		(targets) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(, (nr_heads)));
		if (ModernizedCProgram.options.getDepth() || ModernizedCProgram.options.getDeepen_since()) {
			ModernizedCProgram.die(ModernizedCProgram._("dumb http transport does not support shallow capabilities"));
		} 
		for (i = 0; i < nr_heads; i++) {
			targets[i] = ModernizedCProgram.xstrdup(ModernizedCProgram.oid_to_hex(to_fetch[i].getOld_oid()));
		}
		walker walker = new walker();
		walker = walker.get_http_walker(ModernizedCProgram.url.getBuf());
		walker.setGet_verbosely(ModernizedCProgram.options.getVerbosity() >= 3);
		walker.setGet_recover(0);
		ret = walker.walker_fetch(nr_heads, targets, ((Object)0), ((Object)0));
		walker.walker_free();
		for (i = 0; i < nr_heads; i++) {
			ModernizedCProgram.free(targets[i]);
		}
		ModernizedCProgram.free(targets);
		return ret ? () : 0;
	}
	public int fetch(int nr_heads) {
		discovery discovery = new discovery();
		discovery d = discovery.discover_refs("git-upload-pack", 0);
		int generatedProto_git = d.getProto_git();
		if (generatedProto_git) {
			return ModernizedCProgram.fetch_git(d, nr_heads, to_fetch);
		} else {
				return to_fetch.fetch_dumb(nr_heads);
		} 
		Object generatedData = transport.getData();
		helper_data data = generatedData;
		int i;
		int count;
		child_process child_process = new child_process();
		child_process.get_helper(transport);
		if (transport.process_connect(0)) {
			transport.do_take_over();
			return .UNRECOGNIZEDFUNCTIONNAME(transport, nr_heads, to_fetch);
		} 
		int generatedGet_refs_list_called = data.getGet_refs_list_called();
		ref ref = new ref();
		if (!generatedGet_refs_list_called) {
			ref.get_refs_list_using_list(transport, 0);
		} 
		count = 0;
		for (i = 0; i < nr_heads; i++) {
			if (!(to_fetch[i].getStatus() & .REF_STATUS_UPTODATE)) {
				count++;
			} 
		}
		if (!count) {
			return 0;
		} 
		int generatedCheck_connectivity = data.getCheck_connectivity();
		git_transport_options generatedTransport_options = data.getTransport_options();
		int generatedCheck_self_contained_and_connected = generatedTransport_options.getCheck_self_contained_and_connected();
		if (generatedCheck_connectivity && generatedCheck_self_contained_and_connected) {
			transport.set_helper_option("check-connectivity", "true");
		} 
		int generatedCloning = transport.getCloning();
		if (generatedCloning) {
			transport.set_helper_option("cloning", "true");
		} 
		int generatedUpdate_shallow = generatedTransport_options.getUpdate_shallow();
		if (generatedUpdate_shallow) {
			transport.set_helper_option("update-shallow", "true");
		} 
		list_objects_filter_options generatedFilter_options = generatedTransport_options.getFilter_options();
		list_objects_filter_choice generatedChoice = generatedFilter_options.getChoice();
		if (generatedChoice) {
			byte spec = generatedFilter_options.expand_list_objects_filter_spec();
			transport.set_helper_option("filter", spec);
		} 
		oid_array generatedNegotiation_tips = generatedTransport_options.getNegotiation_tips();
		if (generatedNegotiation_tips) {
			ModernizedCProgram.warning("Ignoring --negotiation-tip because the protocol does not support it.");
		} 
		int generatedFetch = data.getFetch();
		if (generatedFetch) {
			return ModernizedCProgram.fetch_with_fetch(transport, nr_heads, to_fetch);
		} 
		int generatedImport = data.getImport();
		if (generatedImport) {
			return ModernizedCProgram.fetch_with_import(transport, nr_heads, to_fetch);
		} 
		return -1;
		Object generatedData = walker.getData();
		walker_data data = generatedData;
		alt_base generatedAlt = data.getAlt();
		alt_base altbase = generatedAlt;
		if (!walker.fetch_object(hash)) {
			return 0;
		} 
		Byte generatedBase = generatedAlt.getBase();
		alt_base generatedNext = altbase.getNext();
		while (altbase) {
			if (!ModernizedCProgram.http_fetch_pack(walker, altbase, hash)) {
				return 0;
			} 
			walker.fetch_alternates(generatedBase);
			altbase = generatedNext;
		}
		return ();
	}
	public ref get_refs_from_bundle(transport transport, int for_push, Object ref_prefixes) {
		Object generatedData = transport.getData();
		bundle_transport_data data = generatedData;
		ref result = ((Object)0);
		int i;
		if (for_push) {
			return ((Object)0);
		} 
		data.setGet_refs_from_bundle_called(1);
		int generatedFd = data.getFd();
		if (generatedFd > 0) {
			.close(generatedFd);
		} 
		Object generatedUrl = transport.getUrl();
		bundle_header generatedHeader = data.getHeader();
		data.setFd(.read_bundle_header(generatedUrl, generatedHeader));
		if (generatedFd < 0) {
			ModernizedCProgram.die(ModernizedCProgram._("could not read bundle '%s'"), generatedUrl);
		} 
		ref_list generatedReferences = generatedHeader.getReferences();
		int generatedNr = generatedReferences.getNr();
		ref_list_entry generatedList = generatedReferences.getList();
		Byte generatedName = e.getName();
		object_id generatedOld_oid = ref.getOld_oid();
		object_id generatedOid = e.getOid();
		for (i = 0; i < generatedNr; i++) {
			ref_list_entry e = generatedList + i;
			ref ref = .alloc_ref(generatedName);
			generatedOld_oid.oidcpy(generatedOid);
			ref.setNext(result);
			result = ref;
		}
		return result;
	}
	public ref handshake(transport transport, int for_push, Object ref_prefixes, int must_list_refs) {
		Object generatedData = transport.getData();
		git_transport_data data = generatedData;
		ref refs = ((Object)0);
		packet_reader reader = new packet_reader();
		transport.connect_setup(for_push);
		Object generatedFd = data.getFd();
		reader.packet_reader_init(generatedFd[0], ((Object)0), 0, (-1024 << 1) | (-1024 << 0) | (-1024 << 2));
		data.setVersion(reader.discover_version());
		Object generatedServer_options = transport.getServer_options();
		oid_array generatedExtra_have = data.getExtra_have();
		oid_array generatedShallow = data.getShallow();
		protocol_version generatedVersion = data.getVersion();
		switch (generatedVersion) {
		case protocol_version.protocol_v1:
		case protocol_version.protocol_unknown_version:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\transport.c", 311, "unknown protocol version");
		case protocol_version.protocol_v2:
				if (must_list_refs) {
					refs.get_remote_refs(generatedFd[1], reader, for_push, ref_prefixes, generatedServer_options);
				} 
				break;
		case protocol_version.protocol_v0:
				transport.die_if_server_options();
				refs.get_remote_heads(reader, for_push ? (-1024 << 0) : 0, generatedExtra_have, generatedShallow);
				break;
		}
		data.setGot_remote_heads(1);
		int generatedLine_peeked = reader.getLine_peeked();
		if (generatedLine_peeked) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\transport.c", 316, "buffer must be empty at the end of handshake()");
		} 
		return refs;
	}
	public ref get_refs_via_connect(transport transport, int for_push, Object ref_prefixes) {
		ref ref = new ref();
		return ref.handshake(transport, for_push, ref_prefixes, 1);
	}
	public int push_had_errors() {
		 generatedStatus = this.getStatus();
		ref generatedNext = this.getNext();
		for (; ref; ref = generatedNext) {
			switch (generatedStatus) {
			case .REF_STATUS_NONE:
			case .REF_STATUS_OK:
					break;
			case .REF_STATUS_UPTODATE:
			default:
					return 1;
			}
		}
		return 0;
	}
	public int transport_refs_pushed() {
		 generatedStatus = this.getStatus();
		ref generatedNext = this.getNext();
		for (; ref; ref = generatedNext) {
			switch (generatedStatus) {
			case .REF_STATUS_UPTODATE:
					break;
			case .REF_STATUS_NONE:
			default:
					return 1;
			}
		}
		return 0;
	}
	public void print_ref_status(byte flag, Object summary, ref from, Object msg, int porcelain, int summary_width) {
		Object generatedName = from.getName();
		if (porcelain) {
			if (from) {
				.fprintf((_iob[1]), "%c\t%s:%s\t", flag, generatedName, generatedName);
			} else {
					.fprintf((_iob[1]), "%c\t:%s\t", flag, generatedName);
			} 
			if (msg) {
				.fprintf((_iob[1]), "%s (%s)\n", summary, msg);
			} else {
					.fprintf((_iob[1]), "%s\n", summary);
			} 
		} else {
				byte red = "";
				byte reset = "";
				if (to.push_had_errors()) {
					red = ModernizedCProgram.transport_get_color(color_transport.TRANSPORT_COLOR_REJECTED);
					reset = ModernizedCProgram.transport_get_color(color_transport.TRANSPORT_COLOR_RESET);
				} 
				.fprintf((_iob[2]), " %s%c %-*s%s ", red, flag, summary_width, summary, reset);
				if (from) {
					.fprintf((_iob[2]), "%s -> %s", ModernizedCProgram.prettify_refname(generatedName), ModernizedCProgram.prettify_refname(generatedName));
				} else {
						.fputs(ModernizedCProgram.prettify_refname(generatedName), (_iob[2]));
				} 
				if (msg) {
					.fputs(" (", (_iob[2]));
					.fputs(msg, (_iob[2]));
					.fputc((byte)')', (_iob[2]));
				} 
				.fputc((byte)'\n', (_iob[2]));
		} 
	}
	public void print_ok_ref_status(int porcelain, int summary_width) {
		int generatedDeletion = this.getDeletion();
		object_id generatedOld_oid = this.getOld_oid();
		Object generatedName = this.getName();
		ref generatedPeer_ref = this.getPeer_ref();
		int generatedForced_update = this.getForced_update();
		object_id generatedNew_oid = this.getNew_oid();
		byte generatedBuf = quickref.getBuf();
		if (generatedDeletion) {
			ref.print_ref_status((byte)'-', "[deleted]", ((Object)0), ((Object)0), porcelain, summary_width);
		}  else if (ModernizedCProgram.is_null_oid(generatedOld_oid)) {
			ref.print_ref_status((byte)'*', (ModernizedCProgram.starts_with(generatedName, "refs/tags/") ? "[new tag]" : "[new branch]"), generatedPeer_ref, ((Object)0), porcelain, summary_width);
		} else {
				strbuf quickref = new strbuf(, , );
				byte type;
				byte msg;
				quickref.strbuf_add_unique_abbrev(generatedOld_oid, ModernizedCProgram.default_abbrev);
				if (generatedForced_update) {
					quickref.strbuf_addstr("...");
					ModernizedCProgram.type = (byte)'+';
					ModernizedCProgram.msg = "forced update";
				} else {
						quickref.strbuf_addstr("..");
						ModernizedCProgram.type = (byte)' ';
						ModernizedCProgram.msg = ((Object)0);
				} 
				quickref.strbuf_add_unique_abbrev(generatedNew_oid, ModernizedCProgram.default_abbrev);
				ref.print_ref_status(ModernizedCProgram.type, generatedBuf, generatedPeer_ref, ModernizedCProgram.msg, porcelain, summary_width);
				quickref.strbuf_release();
		} 
	}
	public int print_one_push_status(Object dest, int count, int porcelain, int summary_width) {
		if (!count) {
			byte url = ModernizedCProgram.transport_anonymize_url(dest);
			.fprintf(porcelain ? (_iob[1]) : (_iob[2]), "To %s\n", ModernizedCProgram.url);
			ModernizedCProgram.free(ModernizedCProgram.url);
		} 
		ref generatedPeer_ref = this.getPeer_ref();
		int generatedDeletion = this.getDeletion();
		Byte generatedRemote_status = this.getRemote_status();
		 generatedStatus = this.getStatus();
		switch (generatedStatus) {
		case .REF_STATUS_REJECT_ALREADY_EXISTS:
				ref.print_ref_status((byte)'!', "[rejected]", generatedPeer_ref, "already exists", porcelain, summary_width);
				break;
		case .REF_STATUS_REJECT_NEEDS_FORCE:
				ref.print_ref_status((byte)'!', "[rejected]", generatedPeer_ref, "needs force", porcelain, summary_width);
				break;
		case .REF_STATUS_REJECT_STALE:
				ref.print_ref_status((byte)'!', "[rejected]", generatedPeer_ref, "stale info", porcelain, summary_width);
				break;
		case .REF_STATUS_REJECT_SHALLOW:
				ref.print_ref_status((byte)'!', "[rejected]", generatedPeer_ref, "new shallow roots not allowed", porcelain, summary_width);
				break;
		case .REF_STATUS_REJECT_FETCH_FIRST:
				ref.print_ref_status((byte)'!', "[rejected]", generatedPeer_ref, "fetch first", porcelain, summary_width);
				break;
		case .REF_STATUS_NONE:
				ref.print_ref_status((byte)'X', "[no match]", ((Object)0), ((Object)0), porcelain, summary_width);
				break;
		case .REF_STATUS_UPTODATE:
				ref.print_ref_status((byte)'=', "[up to date]", generatedPeer_ref, ((Object)0), porcelain, summary_width);
				break;
		case .REF_STATUS_REJECT_NODELETE:
				ref.print_ref_status((byte)'!', "[rejected]", ((Object)0), "remote does not support deleting refs", porcelain, summary_width);
				break;
		case .REF_STATUS_EXPECTING_REPORT:
				ref.print_ref_status((byte)'!', "[remote failure]", generatedDeletion ? ((Object)0) : generatedPeer_ref, "remote failed to report status", porcelain, summary_width);
				break;
		case .REF_STATUS_ATOMIC_PUSH_FAILED:
				ref.print_ref_status((byte)'!', "[rejected]", generatedPeer_ref, "atomic push failed", porcelain, summary_width);
				break;
		case .REF_STATUS_OK:
				ref.print_ok_ref_status(porcelain, summary_width);
				break;
		case .REF_STATUS_REJECT_NONFASTFORWARD:
				ref.print_ref_status((byte)'!', "[rejected]", generatedPeer_ref, "non-fast-forward", porcelain, summary_width);
				break;
		case .REF_STATUS_REMOTE_REJECT:
				ref.print_ref_status((byte)'!', "[remote rejected]", generatedDeletion ? ((Object)0) : generatedPeer_ref, generatedRemote_status, porcelain, summary_width);
				break;
		}
		return 1;
	}
	public void transport_print_push_status(Object dest, int verbose, int porcelain, int reject_reasons) {
		ref ref = new ref();
		int n = 0;
		byte head;
		int summary_width = ModernizedCProgram.transport_summary_width(refs);
		if (ModernizedCProgram.transport_color_config() < 0) {
			ModernizedCProgram.warning(ModernizedCProgram._("could not parse transport.color.* config"));
		} 
		head = ((Object)0).resolve_refdup("HEAD", -1024, ((Object)0));
		 generatedStatus = ref.getStatus();
		ref generatedNext = ref.getNext();
		if (verbose) {
			for (ref = refs; ref; ref = generatedNext) {
				if (generatedStatus == .REF_STATUS_UPTODATE) {
					n += ref.print_one_push_status(dest, n, porcelain, summary_width);
				} 
			}
		} 
		for (ref = refs; ref; ref = generatedNext) {
			if (generatedStatus == .REF_STATUS_OK) {
				n += ref.print_one_push_status(dest, n, porcelain, summary_width);
			} 
		}
		reject_reasons = 0;
		Object generatedName = ref.getName();
		for (ref = refs; ref; ref = generatedNext) {
			if (generatedStatus != .REF_STATUS_NONE && generatedStatus != .REF_STATUS_UPTODATE && generatedStatus != .REF_STATUS_OK) {
				n += ref.print_one_push_status(dest, n, porcelain, summary_width);
			} 
			if (generatedStatus == .REF_STATUS_REJECT_NONFASTFORWARD) {
				if (head != ((Object)0) && !.strcmp(head, generatedName)) {
					reject_reasons |=  -1024;
				} else {
						reject_reasons |=  -1024;
				} 
			}  else if (generatedStatus == .REF_STATUS_REJECT_ALREADY_EXISTS) {
				reject_reasons |=  -1024;
			}  else if (generatedStatus == .REF_STATUS_REJECT_FETCH_FIRST) {
				reject_reasons |=  -1024;
			}  else if (generatedStatus == .REF_STATUS_REJECT_NEEDS_FORCE) {
				reject_reasons |=  -1024;
			} 
		}
		ModernizedCProgram.free(head);
	}
	public ref find_remote_branch(Object refs, Object branch) {
		ref ref = new ref();
		strbuf head = new strbuf(, , );
		head.strbuf_addstr("refs/heads/");
		head.strbuf_addstr(branch);
		byte generatedBuf = head.getBuf();
		ref = .find_ref_by_name(refs, generatedBuf);
		head.strbuf_release();
		if (ref) {
			return ref;
		} 
		head.strbuf_addstr("refs/tags/");
		head.strbuf_addstr(branch);
		ref = .find_ref_by_name(refs, generatedBuf);
		head.strbuf_release();
		return ref;
	}
	public ref wanted_peer_refs(Object refs, refspec refspec) {
		ref head = .copy_ref(.find_ref_by_name(refs, "HEAD"));
		ref local_refs = head;
		ref generatedNext = head.getNext();
		ref tail = head ? generatedNext : local_refs;
		ref ref = new ref();
		int generatedNr = refspec.getNr();
		refspec_item generatedItems = refspec.getItems();
		if (ModernizedCProgram.option_single_branch) {
			ref remote_head = ((Object)0);
			if (!ModernizedCProgram.option_branch) {
				remote_head = .guess_remote_head(head, refs, 0);
			} else {
					local_refs = ((Object)0);
					tail = local_refs;
					remote_head = .copy_ref(ref.find_remote_branch(refs, ModernizedCProgram.option_branch));
			} 
			if (!remote_head && ModernizedCProgram.option_branch) {
				ModernizedCProgram.warning(ModernizedCProgram._("Could not find remote branch %s to clone."), ModernizedCProgram.option_branch);
			} else {
					int i;
					for (i = 0; i < generatedNr; i++) {
						.get_fetch_map(remote_head, generatedItems[i], tail, 0);
					}
					.get_fetch_map(remote_head, ModernizedCProgram.tag_refspec, tail, /* if --branch=tag, pull the requested tag explicitly */0);
			} 
		} else {
				int i;
				for (i = 0; i < generatedNr; i++) {
					.get_fetch_map(refs, generatedItems[i], tail, 0);
				}
		} 
		if (!ModernizedCProgram.option_mirror && !ModernizedCProgram.option_single_branch && !ModernizedCProgram.option_no_tags) {
			.get_fetch_map(refs, ModernizedCProgram.tag_refspec, tail, 0);
		} 
		return local_refs;
	}
	public void print_helper_status() {
		strbuf buf = new strbuf(, , );
		 generatedStatus = this.getStatus();
		Object generatedName = this.getName();
		Byte generatedRemote_status = this.getRemote_status();
		byte generatedBuf = buf.getBuf();
		Object generatedLen = buf.getLen();
		ref generatedNext = this.getNext();
		for (; ref; ref = generatedNext) {
			byte msg = ((Object)0);
			byte res;
			switch (generatedStatus) {
			case .REF_STATUS_REJECT_NONFASTFORWARD:
					res = "error";
					ModernizedCProgram.msg = "non-fast forward";
					break;
			case .REF_STATUS_REJECT_STALE:
					res = "error";
					ModernizedCProgram.msg = "stale info";
					break;
			case .REF_STATUS_NONE:
					res = "error";
					ModernizedCProgram.msg = "no match";
					break;
			case .REF_STATUS_REJECT_FETCH_FIRST:
					res = "error";
					ModernizedCProgram.msg = "fetch first";
					break;
			case .REF_STATUS_OK:
					res = "ok";
					break;
			case .REF_STATUS_REJECT_NODELETE:
			case .REF_STATUS_REJECT_NEEDS_FORCE:
					res = "error";
					ModernizedCProgram.msg = "needs force";
					break;
			case .REF_STATUS_EXPECTING_REPORT:
			case .REF_STATUS_UPTODATE:
					res = "ok";
					ModernizedCProgram.msg = "up to date";
					break;
			case .REF_STATUS_REMOTE_REJECT:
					res = "error";
					break;
			case .REF_STATUS_REJECT_ALREADY_EXISTS:
					res = "error";
					ModernizedCProgram.msg = "already exists";
					break;
			default:
					continue;
			}
			buf.strbuf_setlen(0);
			buf.strbuf_addf("%s %s", res, generatedName);
			if (generatedRemote_status) {
				ModernizedCProgram.msg = generatedRemote_status;
			} 
			if (ModernizedCProgram.msg) {
				buf.strbuf_addch((byte)' ');
				buf.quote_two_c_style("", ModernizedCProgram.msg, 0);
			} 
			buf.strbuf_addch((byte)'\n');
			ModernizedCProgram.write_or_die(1, generatedBuf, generatedLen);
		}
		buf.strbuf_release();
	}
	public ref get_refs_list(transport transport, int for_push, Object ref_prefixes) {
		child_process child_process = new child_process();
		child_process.get_helper(transport);
		if (transport.process_connect(for_push)) {
			transport.do_take_over();
			return .UNRECOGNIZEDFUNCTIONNAME(transport, for_push, ref_prefixes);
		} 
		ref ref = new ref();
		return ref.get_refs_list_using_list(transport, for_push);
	}
	public ref get_refs_list_using_list(transport transport, int for_push) {
		Object generatedData = transport.getData();
		helper_data data = generatedData;
		child_process helper = new child_process();
		ref ret = ((Object)0);
		ref tail = ret;
		ref posn = new ref();
		strbuf buf = new strbuf(, , );
		data.setGet_refs_list_called(1);
		child_process child_process = new child_process();
		helper = child_process.get_helper(transport);
		int generatedPush = data.getPush();
		int generatedIn = helper.getIn();
		if (generatedPush && for_push) {
			ModernizedCProgram.write_str_in_full(generatedIn, "list for-push\n");
		} else {
				ModernizedCProgram.write_str_in_full(generatedIn, "list\n");
		} 
		byte generatedBuf = buf.getBuf();
		object_id generatedOld_oid = (tail).getOld_oid();
		 generatedStatus = (tail).getStatus();
		Object generatedName = (tail).getName();
		ref generatedNext = (tail).getNext();
		while (1) {
			byte eov;
			byte eon;
			if (ModernizedCProgram.recvline(data, buf)) {
				.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\transport-helper.c", 1111, (true)));
			} 
			if (!generatedBuf) {
				break;
			} 
			eov = .strchr(generatedBuf, (byte)' ');
			if (!eov) {
				ModernizedCProgram.die(ModernizedCProgram._("malformed response in ref list: %s"), generatedBuf);
			} 
			eon = .strchr(eov + 1, (byte)' ');
			eov = (byte)'\0';
			if (eon) {
				eon = (byte)'\0';
			} 
			tail = .alloc_ref(eov + 1);
			if (generatedBuf[0] == (byte)'@') {
				(tail).setSymref(ModernizedCProgram.xstrdup(generatedBuf + 1));
			}  else if (generatedBuf[0] != (byte)'?') {
				generatedOld_oid.get_oid_hex(generatedBuf);
			} 
			if (eon) {
				if (ModernizedCProgram.has_attribute(eon + 1, "unchanged")) {
					generatedStatus |=  .REF_STATUS_UPTODATE;
					if (generatedOld_oid.read_ref(generatedName) < 0) {
						ModernizedCProgram.die(ModernizedCProgram._("could not read ref %s"), generatedName);
					} 
				} 
			} 
			tail = (generatedNext);
		}
		if (ModernizedCProgram.debug) {
			.fprintf((_iob[2]), "Debug: Read ref listing.\n");
		} 
		buf.strbuf_release();
		for (posn = ret; posn; posn = generatedNext) {
			.resolve_remote_symref(posn, ret);
		}
		return ret;
	}
	public ref getNext() {
		return next;
	}
	public void setNext(ref newNext) {
		next = newNext;
	}
	public object_id getOld_oid() {
		return old_oid;
	}
	public void setOld_oid(object_id newOld_oid) {
		old_oid = newOld_oid;
	}
	public object_id getNew_oid() {
		return new_oid;
	}
	public void setNew_oid(object_id newNew_oid) {
		new_oid = newNew_oid;
	}
	public object_id getOld_oid_expect() {
		return old_oid_expect;
	}
	public void setOld_oid_expect(object_id newOld_oid_expect) {
		old_oid_expect = newOld_oid_expect;
	}
	public Byte getSymref() {
		return symref;
	}
	public void setSymref(Byte newSymref) {
		symref = newSymref;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int newForce) {
		force = newForce;
	}
	public int getForced_update() {
		return forced_update;
	}
	public void setForced_update(int newForced_update) {
		forced_update = newForced_update;
	}
	public int getExpect_old_sha1() {
		return expect_old_sha1;
	}
	public void setExpect_old_sha1(int newExpect_old_sha1) {
		expect_old_sha1 = newExpect_old_sha1;
	}
	public int getExact_oid() {
		return exact_oid;
	}
	public void setExact_oid(int newExact_oid) {
		exact_oid = newExact_oid;
	}
	public int getDeletion() {
		return deletion;
	}
	public void setDeletion(int newDeletion) {
		deletion = newDeletion;
	}
	public  getMatch_status() {
		return match_status;
	}
	public void setMatch_status( newMatch_status) {
		match_status = newMatch_status;
	}
	public  getFetch_head_status() {
		return fetch_head_status;
	}
	public void setFetch_head_status( newFetch_head_status) {
		fetch_head_status = newFetch_head_status;
	}
	public  getStatus() {
		return status;
	}
	public void setStatus( newStatus) {
		status = newStatus;
	}
	public Byte getRemote_status() {
		return remote_status;
	}
	public void setRemote_status(Byte newRemote_status) {
		remote_status = newRemote_status;
	}
	public ref getPeer_ref() {
		return peer_ref;
	}
	public void setPeer_ref(ref newPeer_ref) {
		peer_ref = newPeer_ref;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
/*
 * For the given remote, reads the refspec's src and sets the other fields.
 */
/*
 * Find refs from a list which are likely to be pointed to by the given HEAD
 * ref. If 'all' is false, returns the most likely ref; otherwise, returns a
 * list of all candidate refs. If no match is found (or 'head' is NULL),
 * returns NULL. All returns are newly allocated and should be freed.
 */
/*
 * Compare-and-swap
 */
