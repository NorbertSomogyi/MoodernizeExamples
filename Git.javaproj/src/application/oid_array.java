package application;

public class oid_array {
	private object_id oid;
	private int nr;
	private int alloc;
	private int sorted;
	
	public oid_array(object_id oid, int nr, int alloc, int sorted) {
		setOid(oid);
		setNr(nr);
		setAlloc(alloc);
		setSorted(sorted);
	}
	public oid_array() {
	}
	
	public Byte join_sha1_array_hex(byte delim) {
		strbuf joined_hexs = new strbuf(, , );
		int i;
		int generatedNr = this.getNr();
		object_id generatedOid = this.getOid();
		for (i = 0; i < generatedNr; i++) {
			joined_hexs.strbuf_addstr(ModernizedCProgram.oid_to_hex(generatedOid + i));
			if (i + 1 < generatedNr) {
				joined_hexs.strbuf_addch(delim);
			} 
		}
		return joined_hexs.strbuf_detach(((Object)0/*
		 * In this function, passing a not NULL skipped_first is very special.
		 * It means that we want to know if the first commit in the list is
		 * skipped because we will want to test a commit away from it if it is
		 * indeed skipped.
		 * So if the first commit is skipped, we cannot take the shortcut to
		 * just "return list" when we find the first non skipped commit, we
		 * have to return a fully filtered list.
		 *
		 * We use (*skipped_first == -1) to mean "it has been found that the
		 * first commit is not skipped". In this case *skipped_first is set back
		 * to 0 just before the function returns.
		 */));
	}
	public oid_array submodule_commits(string_list submodules, Object name) {
		string_list_item item = new string_list_item();
		string_list_item string_list_item = new string_list_item();
		item = string_list_item.string_list_insert(submodules, name);
		Object generatedUtil = item.getUtil();
		if (generatedUtil) {
			return (oid_array)generatedUtil;
		} 
		item.setUtil(ModernizedCProgram.xcalloc(1, /* NEEDSWORK: should we have oid_array_init()? */));
		return (oid_array)generatedUtil;
	}
	public int process_shallow(Object line, int len) {
		byte arg;
		object_id old_oid = new object_id();
		if (!ModernizedCProgram.skip_prefix(line, "shallow ", arg)) {
			return 0;
		} 
		if (old_oid.get_oid_hex(arg)) {
			ModernizedCProgram.die(ModernizedCProgram._("protocol error: expected shallow sha-1, got '%s'"), arg);
		} 
		if (!shallow_points) {
			ModernizedCProgram.die(ModernizedCProgram._("repository on the other end cannot be shallow"));
		} 
		shallow_points.oid_array_append(old_oid);
		ModernizedCProgram.check_no_capabilities(line, len);
		return 1;
	}
	public Object match_points_at(Object oid, Object refname) {
		object_id tagged_oid = ((Object)0);
		object obj = new object();
		if (points_at.oid_array_lookup(oid) >= 0) {
			return oid;
		} 
		object object = new object();
		obj = object.parse_object(ModernizedCProgram.the_repository, oid);
		if (!obj) {
			ModernizedCProgram.die(ModernizedCProgram._("malformed object at '%s'"), refname);
		} 
		int generatedType = obj.getType();
		if (generatedType == object_type.OBJ_TAG) {
			tagged_oid = .get_tagged_oid((tag)obj);
		} 
		if (tagged_oid && points_at.oid_array_lookup(tagged_oid) >= 0) {
			return tagged_oid;
		} 
		return ((Object)0/*
		 * Allocate space for a new ref_array_item and copy the name and oid to it.
		 *
		 * Callers can then fill in other struct members at their leisure.
		 */);
	}
	public void oid_array_append(Object oid) {
		int generatedNr = this.getNr();
		int generatedAlloc = this.getAlloc();
		object_id generatedOid = this.getOid();
		do {
			if ((generatedNr + 1) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNr + 1)) {
					this.setAlloc((generatedNr + 1));
				} else {
						this.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedOid) = ModernizedCProgram.xrealloc((generatedOid), ModernizedCProgram.st_mult(, (generatedAlloc)));
			} 
		} while (0);
		generatedOid[generatedNr++].oidcpy(oid);
		this.setSorted(0);
	}
	public void oid_array_sort() {
		object_id generatedOid = this.getOid();
		int generatedNr = this.getNr();
		ModernizedCProgram.sane_qsort((generatedOid), (generatedNr), , void_hashcmp);
		this.setSorted(1);
	}
	public int oid_array_lookup(Object oid) {
		int generatedSorted = this.getSorted();
		if (!generatedSorted) {
			array.oid_array_sort();
		} 
		object_id generatedOid = this.getOid();
		int generatedNr = this.getNr();
		return ModernizedCProgram.sha1_pos(oid.getHash(), generatedOid, generatedNr, sha1_access);
	}
	public void oid_array_clear() {
		object_id generatedOid = this.getOid();
		do {
			ModernizedCProgram.free(generatedOid);
			(generatedOid) = ((Object)0);
		} while (0);
		this.setNr(0);
		this.setAlloc(0);
		this.setSorted(0);
	}
	public int oid_array_for_each(Object fn, Object data) {
		int i;
		int generatedNr = this.getNr();
		object_id generatedOid = this.getOid();
		for (i = 0; i < generatedNr; /* No oid_array_sort() here! See the api-oid-array.txt docs! */i++) {
			int ret = .fn(generatedOid + i, data);
			if (ret) {
				return ret;
			} 
		}
		return 0;
	}
	public int oid_array_for_each_unique(Object fn, Object data) {
		int i;
		int generatedSorted = this.getSorted();
		if (!generatedSorted) {
			array.oid_array_sort();
		} 
		int generatedNr = this.getNr();
		object_id generatedOid = this.getOid();
		for (i = 0; i < generatedNr; i++) {
			int ret;
			if (i > 0 && ModernizedCProgram.oideq(generatedOid + i, generatedOid + i - 1)) {
				continue;
			} 
			ret = .fn(generatedOid + i, data);
			if (ret) {
				return ret;
			} 
		}
		return 0;
	}
	public void oid_array_filter(Object want, Object cb_data) {
		int generatedNr = this.getNr();
		int nr = generatedNr;
		int src;
		int dst;
		object_id generatedOid = this.getOid();
		object_id oids = generatedOid;
		for (src = dst = 0; src < nr; src++) {
			if (.want(oids[src], cb_data)) {
				if (src != dst) {
					oids[dst].oidcpy(oids[src]);
				} 
				dst++;
			} 
		}
		this.setNr(dst);
	}
	public void get_merge_heads() {
		byte filename = ModernizedCProgram.the_repository.git_path_fetch_head();
		FILE fp = new FILE();
		strbuf sb = new strbuf(, , );
		object_id oid = new object_id();
		fp = ModernizedCProgram.xfopen(filename, "r");
		byte generatedBuf = sb.getBuf();
		while (ModernizedCProgram.strbuf_getline_lf(sb, fp) != (true)) {
			byte p;
			if (oid.parse_oid_hex(generatedBuf, p)) {
				continue;
			} 
			if (ModernizedCProgram.starts_with(p, "\tnot-for-merge\t")) {
				continue;
			} 
			merge_heads.oid_array_append(oid);
		}
		.fclose(fp);
		sb/**
		 * Used by die_no_merge_candidates() as a for_each_remote() callback to
		 * retrieve the name of the remote if the repository only has one remote.
		 */.strbuf_release();
	}
	public oid_array odb_loose_cache(object_directory odb, Object oid) {
		int subdir_nr = oid.getHash()[0];
		strbuf buf = new strbuf(, , );
		Object generatedLoose_objects_subdir_seen = odb.getLoose_objects_subdir_seen();
		if (subdir_nr < 0 || subdir_nr >= ( /  + ( - 1))) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\sha1-file.c", 2328, "subdir_nr out of range");
		} 
		Object generatedLoose_objects_cache = odb.getLoose_objects_cache();
		if (generatedLoose_objects_subdir_seen[subdir_nr]) {
			return generatedLoose_objects_cache[subdir_nr];
		} 
		Byte generatedPath = odb.getPath();
		buf.strbuf_addstr(generatedPath);
		buf.for_each_file_in_obj_subdir(subdir_nr, append_loose_object, ((Object)0), ((Object)0), generatedLoose_objects_cache[subdir_nr]);
		generatedLoose_objects_subdir_seen[subdir_nr] = 1;
		buf.strbuf_release();
		return generatedLoose_objects_cache[subdir_nr];
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public int getSorted() {
		return sorted;
	}
	public void setSorted(int newSorted) {
		sorted = newSorted;
	}
}
