package application;

public class ref_states {
	private remote remote;
	private string_list new_refs;
	private string_list stale;
	private string_list tracked;
	private string_list heads;
	private string_list push;
	private int queried;
	
	public ref_states(remote remote, string_list new_refs, string_list stale, string_list tracked, string_list heads, string_list push, int queried) {
		setRemote(remote);
		setNew_refs(new_refs);
		setStale(stale);
		setTracked(tracked);
		setHeads(heads);
		setPush(push);
		setQueried(queried);
	}
	public ref_states() {
	}
	
	public int get_ref_states(Object remote_refs) {
		ref fetch_map = ((Object)0);
		ref tail = fetch_map;
		ref ref = new ref();
		ref stale_refs = new ref();
		int i;
		remote generatedRemote = this.getRemote();
		refspec generatedFetch = generatedRemote.getFetch();
		int generatedNr = generatedFetch.getNr();
		refspec_item generatedItems = generatedFetch.getItems();
		Object generatedRaw = generatedFetch.getRaw();
		for (i = 0; i < generatedNr; i++) {
			if (.get_fetch_map(remote_refs, generatedItems[i], tail, 1)) {
				ModernizedCProgram.die(ModernizedCProgram._("Could not get fetch map for refspec %s"), generatedRaw[i]);
			} 
		}
		string_list generatedNew_refs = this.getNew_refs();
		generatedNew_refs.setStrdup_strings(1);
		string_list generatedTracked = this.getTracked();
		generatedTracked.setStrdup_strings(1);
		string_list generatedStale = this.getStale();
		generatedStale.setStrdup_strings(1);
		ref generatedPeer_ref = ref.getPeer_ref();
		Object generatedName = generatedPeer_ref.getName();
		ref generatedNext = ref.getNext();
		for (ref = fetch_map; ref; ref = generatedNext) {
			if (!generatedPeer_ref || !ModernizedCProgram.ref_exists(generatedName)) {
				generatedNew_refs.string_list_append(ModernizedCProgram.abbrev_ref((generatedName), "refs/heads/"));
			} else {
					generatedTracked.string_list_append(ModernizedCProgram.abbrev_ref((generatedName), "refs/heads/"));
			} 
		}
		stale_refs = .get_stale_heads(generatedFetch, fetch_map);
		for (ref = stale_refs; ref; ref = generatedNext) {
			string_list_item item = generatedStale.string_list_append(ModernizedCProgram.abbrev_ref((generatedName), "refs/heads/"));
			item.setUtil(ModernizedCProgram.xstrdup(generatedName));
		}
		.free_refs(stale_refs);
		.free_refs(fetch_map);
		generatedNew_refs.string_list_sort();
		generatedTracked.string_list_sort();
		generatedStale.string_list_sort();
		return 0;
	}
	public int get_push_ref_states(Object remote_refs) {
		remote generatedRemote = this.getRemote();
		remote remote = generatedRemote;
		ref ref = new ref();
		ref local_refs = new ref();
		ref push_map = new ref();
		int generatedMirror = remote.getMirror();
		if (generatedMirror) {
			return 0;
		} 
		local_refs = .get_local_heads();
		push_map = .copy_ref_list(remote_refs);
		refspec generatedPush = remote.getPush();
		.match_push_refs(local_refs, push_map, generatedPush, match_refs_flags.MATCH_REFS_NONE);
		generatedPush.setStrdup_strings(1);
		ref generatedPeer_ref = ref.getPeer_ref();
		object_id generatedNew_oid = ref.getNew_oid();
		Object generatedName = generatedPeer_ref.getName();
		Object generatedUtil = item.getUtil();
		int generatedForce = ref.getForce();
		object_id generatedOld_oid = ref.getOld_oid();
		ref generatedNext = ref.getNext();
		for (ref = push_map; ref; ref = generatedNext) {
			string_list_item item = new string_list_item();
			push_info info = new push_info();
			if (!generatedPeer_ref) {
				continue;
			} 
			generatedNew_oid.oidcpy(generatedNew_oid);
			item = generatedPush.string_list_append(ModernizedCProgram.abbrev_ref((generatedName), "refs/heads/"));
			item.setUtil(ModernizedCProgram.xcalloc(1, ));
			info = generatedUtil;
			info.setForced(generatedForce);
			info.setDest(ModernizedCProgram.xstrdup(ModernizedCProgram.abbrev_ref((generatedName), "refs/heads/")));
			if (ModernizedCProgram.is_null_oid(generatedNew_oid)) {
				info.setStatus(.PUSH_STATUS_DELETE);
			}  else if (ModernizedCProgram.oideq(generatedOld_oid, generatedNew_oid)) {
				info.setStatus(.PUSH_STATUS_UPTODATE);
			}  else if (ModernizedCProgram.is_null_oid(generatedOld_oid)) {
				info.setStatus(.PUSH_STATUS_CREATE);
			}  else if (ModernizedCProgram.the_repository.repo_has_object_file(generatedOld_oid) && ModernizedCProgram.ref_newer(generatedNew_oid, generatedOld_oid)) {
				info.setStatus(.PUSH_STATUS_FASTFORWARD);
			} else {
					info.setStatus(.PUSH_STATUS_OUTOFDATE);
			} 
		}
		.free_refs(local_refs);
		.free_refs(push_map);
		return 0;
	}
	public int get_push_ref_states_noquery() {
		int i;
		remote generatedRemote = this.getRemote();
		remote remote = generatedRemote;
		string_list_item item = new string_list_item();
		push_info info = new push_info();
		int generatedMirror = remote.getMirror();
		if (generatedMirror) {
			return 0;
		} 
		string_list generatedPush = this.getPush();
		generatedPush.setStrdup_strings(1);
		int generatedNr = generatedPush.getNr();
		byte generatedString = item.getString();
		if (!generatedNr) {
			item = generatedPush.string_list_append(ModernizedCProgram._("(matching)"));
			info = item.setUtil(ModernizedCProgram.xcalloc(1, ));
			info.setStatus(.PUSH_STATUS_NOTQUERIED);
			info.setDest(ModernizedCProgram.xstrdup(generatedString));
		} 
		string_list_item generatedItems = generatedPush.getItems();
		for (i = 0; i < generatedNr; i++) {
			refspec_item spec = generatedItems[i];
			if (spec.getMatching()) {
				item = generatedPush.string_list_append(ModernizedCProgram._("(matching)"));
			}  else if (.strlen(spec.getSrc())) {
				item = generatedPush.string_list_append(spec.getSrc());
			} else {
					item = generatedPush.string_list_append(ModernizedCProgram._("(delete)"));
			} 
			info = item.setUtil(ModernizedCProgram.xcalloc(1, ));
			info.setForced(spec.getForce());
			info.setStatus(.PUSH_STATUS_NOTQUERIED);
			info.setDest(ModernizedCProgram.xstrdup(spec.getDst() ? spec.getDst() : generatedString));
		}
		return 0;
	}
	public int get_head_names(Object remote_refs) {
		ref ref = new ref();
		ref matches = new ref();
		ref fetch_map = ((Object)0);
		ref fetch_map_tail = fetch_map;
		refspec_item refspec = new refspec_item();
		refspec.setForce(0);
		refspec.setPattern(1);
		refspec.setSrc(refspec.setDst("refs/heads/*"));
		string_list generatedHeads = this.getHeads();
		generatedHeads.setStrdup_strings(1);
		.get_fetch_map(remote_refs, refspec, fetch_map_tail, 0);
		matches = .guess_remote_head(.find_ref_by_name(remote_refs, "HEAD"), fetch_map, 1);
		Object generatedName = ref.getName();
		ref generatedNext = ref.getNext();
		for (ref = matches; ref; ref = generatedNext) {
			generatedHeads.string_list_append(ModernizedCProgram.abbrev_ref((generatedName), "refs/heads/"));
		}
		.free_refs(fetch_map);
		.free_refs(matches);
		return 0;
	}
	public void free_remote_ref_states() {
		string_list generatedNew_refs = this.getNew_refs();
		generatedNew_refs.string_list_clear(0);
		string_list generatedStale = this.getStale();
		generatedStale.string_list_clear(1);
		string_list generatedTracked = this.getTracked();
		generatedTracked.string_list_clear(0);
		string_list generatedHeads = this.getHeads();
		generatedHeads.string_list_clear(0);
		string_list generatedPush = this.getPush();
		generatedPush.string_list_clear_func(clear_push_info);
	}
	public int get_remote_ref_states(Object name, int query) {
		transport transport = new transport();
		ref remote_refs = new ref();
		this.setRemote(.remote_get(name));
		remote generatedRemote = this.getRemote();
		if (!generatedRemote) {
			return ();
		} 
		ModernizedCProgram.read_branches();
		int generatedUrl_nr = generatedRemote.getUrl_nr();
		Object generatedUrl = generatedRemote.getUrl();
		transport transport = new transport();
		string_list generatedTracked = this.getTracked();
		if (query) {
			transport = transport.transport_get(generatedRemote, generatedUrl_nr > 0 ? generatedUrl[0] : ((Object)0));
			remote_refs = transport.transport_get_remote_refs(((Object)0));
			transport.transport_disconnect();
			this.setQueried(1);
			if (query & (1 << 0)) {
				states.get_ref_states(remote_refs);
			} 
			if (query & (1 << 1)) {
				states.get_head_names(remote_refs);
			} 
			if (query & (1 << 2)) {
				states.get_push_ref_states(remote_refs);
			} 
		} else {
				ModernizedCProgram.for_each_ref(append_ref_to_tracked_list, states);
				generatedTracked.string_list_sort();
				states.get_push_ref_states_noquery();
		} 
		return 0;
	}
	public remote getRemote() {
		return remote;
	}
	public void setRemote(remote newRemote) {
		remote = newRemote;
	}
	public string_list getNew_refs() {
		return new_refs;
	}
	public void setNew_refs(string_list newNew_refs) {
		new_refs = newNew_refs;
	}
	public string_list getStale() {
		return stale;
	}
	public void setStale(string_list newStale) {
		stale = newStale;
	}
	public string_list getTracked() {
		return tracked;
	}
	public void setTracked(string_list newTracked) {
		tracked = newTracked;
	}
	public string_list getHeads() {
		return heads;
	}
	public void setHeads(string_list newHeads) {
		heads = newHeads;
	}
	public string_list getPush() {
		return push;
	}
	public void setPush(string_list newPush) {
		push = newPush;
	}
	public int getQueried() {
		return queried;
	}
	public void setQueried(int newQueried) {
		queried = newQueried;
	}
}
