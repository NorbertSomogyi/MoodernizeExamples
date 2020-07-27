package application;

public class disambiguate_state {
	private int len;
	private Object hex_pfx;
	private object_id bin_pfx;
	private repository repo;
	private Object fn;
	private Object cb_data;
	private object_id candidate;
	private int candidate_exists;
	private int candidate_checked;
	private int candidate_ok;
	private int disambiguate_fn_used;
	private int ambiguous;
	private int always_call_fn;
	
	public disambiguate_state(int len, Object hex_pfx, object_id bin_pfx, repository repo, Object fn, Object cb_data, object_id candidate, int candidate_exists, int candidate_checked, int candidate_ok, int disambiguate_fn_used, int ambiguous, int always_call_fn) {
		setLen(len);
		setHex_pfx(hex_pfx);
		setBin_pfx(bin_pfx);
		setRepo(repo);
		setFn(fn);
		setCb_data(cb_data);
		setCandidate(candidate);
		setCandidate_exists(candidate_exists);
		setCandidate_checked(candidate_checked);
		setCandidate_ok(candidate_ok);
		setDisambiguate_fn_used(disambiguate_fn_used);
		setAmbiguous(ambiguous);
		setAlways_call_fn(always_call_fn);
	}
	public disambiguate_state() {
	}
	
	public void update_candidates(Object current) {
		int generatedAlways_call_fn = this.getAlways_call_fn();
		repository generatedRepo = this.getRepo();
		Object generatedCb_data = this.getCb_data();
		if (generatedAlways_call_fn) {
			this.setAmbiguous(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedRepo, current, generatedCb_data) ? 1 : 0);
			return /*Error: Unsupported expression*/;
		} 
		int generatedCandidate_exists = this.getCandidate_exists();
		object_id generatedCandidate = this.getCandidate();
		if (!generatedCandidate_exists) {
			generatedCandidate.oidcpy(/* this is the first candidate */current);
			this.setCandidate_exists(1);
			return /*Error: Unsupported expression*/;
		}  else if (ModernizedCProgram.oideq(generatedCandidate, current/* the same as what we already have seen */)) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedFn = this.getFn();
		if (!generatedFn) {
			this.setAmbiguous(/* cannot disambiguate between ds->candidate and current */1);
			return /*Error: Unsupported expression*/;
		} 
		int generatedCandidate_checked = this.getCandidate_checked();
		if (!generatedCandidate_checked) {
			this.setCandidate_ok(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedRepo, generatedCandidate, generatedCb_data));
			this.setDisambiguate_fn_used(1);
			this.setCandidate_checked(1);
		} 
		int generatedCandidate_ok = this.getCandidate_ok();
		if (!generatedCandidate_ok) {
			generatedCandidate.oidcpy(/* discard the candidate; we know it does not satisfy fn */current);
			this.setCandidate_checked(0);
			return /*Error: Unsupported expression*/;
		} 
		if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedRepo, current, generatedCb_data)) {
			this.setCandidate_ok(0);
			this.setAmbiguous(1/* otherwise, current can be discarded and candidate is still good */);
		} 
	}
	public void find_short_object_filename() {
		object_directory odb = new object_directory();
		int generatedAmbiguous = this.getAmbiguous();
		object_id generatedBin_pfx = this.getBin_pfx();
		oid_array oid_array = new oid_array();
		int generatedNr = loose_objects.getNr();
		object_id[] generatedOid = loose_objects.getOid();
		int generatedLen = this.getLen();
		Object generatedHash = generatedBin_pfx.getHash();
		object_directory generatedNext = odb.getNext();
		repository generatedRepo = this.getRepo();
		raw_object_store generatedObjects = generatedRepo.getObjects();
		object_directory generatedOdb = generatedObjects.getOdb();
		for (odb = generatedOdb; odb && !generatedAmbiguous; odb = generatedNext) {
			int pos;
			oid_array loose_objects = new oid_array();
			loose_objects = oid_array.odb_loose_cache(odb, generatedBin_pfx);
			pos = loose_objects.oid_array_lookup(generatedBin_pfx);
			if (pos < 0) {
				pos = -1 - pos;
			} 
			while (!generatedAmbiguous && pos < generatedNr) {
				object_id oid = new object_id();
				oid = generatedOid + pos;
				if (!ModernizedCProgram.match_sha(generatedLen, generatedHash, generatedHash)) {
					break;
				} 
				ds.update_candidates(oid);
				pos++;
			}
		}
	}
	public void find_short_packed_object() {
		multi_pack_index m = new multi_pack_index();
		packed_git p = new packed_git();
		int generatedAmbiguous = this.getAmbiguous();
		multi_pack_index generatedNext = m.getNext();
		repository generatedRepo = this.getRepo();
		multi_pack_index multi_pack_index = new multi_pack_index();
		for (m = multi_pack_index.get_multi_pack_index(generatedRepo); m && !generatedAmbiguous; m = generatedNext) {
			ModernizedCProgram.unique_in_midx(m, ds);
		}
		packed_git packed_git = new packed_git();
		for (p = packed_git.get_packed_git(generatedRepo); p && !generatedAmbiguous; p = generatedNext) {
			ModernizedCProgram.unique_in_pack(p, ds);
		}
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public Object getHex_pfx() {
		return hex_pfx;
	}
	public void setHex_pfx(Object newHex_pfx) {
		hex_pfx = newHex_pfx;
	}
	public object_id getBin_pfx() {
		return bin_pfx;
	}
	public void setBin_pfx(object_id newBin_pfx) {
		bin_pfx = newBin_pfx;
	}
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public Object getFn() {
		return fn;
	}
	public void setFn(Object newFn) {
		fn = newFn;
	}
	public Object getCb_data() {
		return cb_data;
	}
	public void setCb_data(Object newCb_data) {
		cb_data = newCb_data;
	}
	public object_id getCandidate() {
		return candidate;
	}
	public void setCandidate(object_id newCandidate) {
		candidate = newCandidate;
	}
	public int getCandidate_exists() {
		return candidate_exists;
	}
	public void setCandidate_exists(int newCandidate_exists) {
		candidate_exists = newCandidate_exists;
	}
	public int getCandidate_checked() {
		return candidate_checked;
	}
	public void setCandidate_checked(int newCandidate_checked) {
		candidate_checked = newCandidate_checked;
	}
	public int getCandidate_ok() {
		return candidate_ok;
	}
	public void setCandidate_ok(int newCandidate_ok) {
		candidate_ok = newCandidate_ok;
	}
	public int getDisambiguate_fn_used() {
		return disambiguate_fn_used;
	}
	public void setDisambiguate_fn_used(int newDisambiguate_fn_used) {
		disambiguate_fn_used = newDisambiguate_fn_used;
	}
	public int getAmbiguous() {
		return ambiguous;
	}
	public void setAmbiguous(int newAmbiguous) {
		ambiguous = newAmbiguous;
	}
	public int getAlways_call_fn() {
		return always_call_fn;
	}
	public void setAlways_call_fn(int newAlways_call_fn) {
		always_call_fn = newAlways_call_fn;
	}
}
