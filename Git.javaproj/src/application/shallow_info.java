package application;

public class shallow_info {
	private oid_array shallow;
	private Integer ours;
	private int nr_ours;
	private Integer theirs;
	private int nr_theirs;
	private oid_array ref;
	private Object used_shallow;
	private int need_reachability_test;
	private int reachable;
	private int shallow_ref;
	private commit commits;
	private int nr_commits;
	
	public shallow_info(oid_array shallow, Integer ours, int nr_ours, Integer theirs, int nr_theirs, oid_array ref, Object used_shallow, int need_reachability_test, int reachable, int shallow_ref, commit commits, int nr_commits) {
		setShallow(shallow);
		setOurs(ours);
		setNr_ours(nr_ours);
		setTheirs(theirs);
		setNr_theirs(nr_theirs);
		setRef(ref);
		setUsed_shallow(used_shallow);
		setNeed_reachability_test(need_reachability_test);
		setReachable(reachable);
		setShallow_ref(shallow_ref);
		setCommits(commits);
		setNr_commits(nr_commits);
	}
	public shallow_info() {
	}
	
	public Object unpack_with_sideband() {
		async muxer = new async();
		byte ret;
		if (!ModernizedCProgram.use_sideband) {
			return ModernizedCProgram.unpack(0, si);
		} 
		.use_keepalive = .KEEPALIVE_AFTER_NUL;
		.memset(muxer, 0, );
		muxer.setProc(copy_to_sideband);
		muxer.setIn(-1);
		if (muxer.start_async()) {
			return ((Object)0);
		} 
		int generatedIn = muxer.getIn();
		ret = ModernizedCProgram.unpack(generatedIn, si);
		muxer.finish_async();
		return ret;
	}
	public void prepare_shallow_update() {
		oid_array generatedRef = this.getRef();
		int generatedNr = generatedRef.getNr();
		int i;
		int j;
		int k;
		int bitmap_size = (((generatedNr) + (true) - 1) / (true));
		Object generatedUsed_shallow = this.getUsed_shallow();
		(generatedUsed_shallow) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(, (generatedNr)));
		si.assign_shallow_commits_to_refs(generatedUsed_shallow, ((Object)0));
		int generatedNeed_reachability_test = this.getNeed_reachability_test();
		this.setNeed_reachability_test(ModernizedCProgram.xcalloc(generatedNr, ));
		int generatedReachable = this.getReachable();
		this.setReachable(ModernizedCProgram.xcalloc(generatedNr, ));
		int generatedShallow_ref = this.getShallow_ref();
		this.setShallow_ref(ModernizedCProgram.xcalloc(generatedNr, ));
		int generatedNr_ours = this.getNr_ours();
		Integer generatedOurs = this.getOurs();
		for (i = 0; i < generatedNr_ours; i++) {
			generatedNeed_reachability_test[generatedOurs[i]] = 1;
		}
		for (i = 0; i < generatedNr; i++) {
			if (!generatedUsed_shallow[i]) {
				continue;
			} 
			for (j = 0; j < bitmap_size; j++) {
				if (!generatedUsed_shallow[i][j]) {
					continue;
				} 
				generatedNeed_reachability_test[i]++;
				for (k = 0; k < 32; k++) {
					if (generatedUsed_shallow[i][j] & (-1024 << k)) {
						generatedShallow_ref[j * 32 + k/*
								 * true for those associated with some refs and belong
								 * in "ours" list aka "step 7 not done yet"
								 */]++;
					} 
				}
			}
			generatedNeed_reachability_test[i] = generatedNeed_reachability_test[i] > 1/*
				 * keep hooks happy by forcing a temporary shallow file via
				 * env variable because we can't add --shallow-file to every
				 * command. check_connected() will be done with
				 * true .git/shallow though.
				 */;
		}
		.setenv("GIT_SHALLOW_FILE", ModernizedCProgram.alt_shallow_file, 1);
	}
	public void clear_shallow_info() {
		Integer generatedOurs = this.getOurs();
		ModernizedCProgram.free(generatedOurs);
		Integer generatedTheirs = this.getTheirs();
		ModernizedCProgram.free(generatedTheirs);
	}
	/* Step 4, remove non-existent ones in "theirs" after getting the pack */
	public void remove_nonexistent_theirs_shallow() {
		oid_array generatedShallow = this.getShallow();
		object_id generatedOid = generatedShallow.getOid();
		object_id oid = generatedOid;
		int i;
		int dst;
		do {
			if (ModernizedCProgram.trace_shallow.trace_pass_fl()) {
				ModernizedCProgram.trace_shallow.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\shallow.c", 462, "shallow: remove_nonexistent_theirs_shallow\n");
			} 
		} while (0);
		int generatedNr_theirs = this.getNr_theirs();
		Integer generatedTheirs = this.getTheirs();
		for (i = dst = 0; i < generatedNr_theirs; i++) {
			if (i != dst) {
				generatedTheirs[dst] = generatedTheirs[i];
			} 
			if (ModernizedCProgram.the_repository.repo_has_object_file(oid + generatedTheirs[i])) {
				dst++;
			} 
		}
		this.setNr_theirs(dst);
	}
	public void assign_shallow_commits_to_refs(Object used, Integer ref_status) {
		oid_array generatedShallow = this.getShallow();
		object_id generatedOid = generatedShallow.getOid();
		object_id oid = generatedOid;
		oid_array generatedRef = this.getRef();
		oid_array ref = generatedRef;
		int i;
		int nr;
		int shallow;
		int nr_shallow = 0;
		paint_info pi = new paint_info();
		do {
			if (ModernizedCProgram.trace_shallow.trace_pass_fl()) {
				ModernizedCProgram.trace_shallow.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\shallow.c", 614, "shallow: assign_shallow_commits_to_refs\n");
			} 
		} while (0);
		int generatedNr_ours = this.getNr_ours();
		int generatedNr_theirs = this.getNr_theirs();
		(shallow) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(, (generatedNr_ours + generatedNr_theirs)));
		Integer generatedOurs = this.getOurs();
		for (i = 0; i < generatedNr_ours; i++) {
			shallow[nr_shallow++] = generatedOurs[i];
		}
		Integer generatedTheirs = this.getTheirs();
		for (i = 0; i < generatedNr_theirs; i++) {
			shallow[nr_shallow++] = generatedTheirs[i/*
				 * Prepare the commit graph to track what refs can reach what
				 * (new) shallow commits.
				 */];
		}
		nr = ModernizedCProgram.get_max_object_index();
		object object = new object();
		int generatedType = o.getType();
		int generatedFlags = o.getFlags();
		for (i = 0; i < nr; i++) {
			object o = object.get_indexed_object(i);
			if (!o || generatedType != object_type.OBJ_COMMIT) {
				continue;
			} 
			generatedFlags &=  ~((-1024 << 1) | (-1024 << 10) | (-1024 << 0));
		}
		.memset(pi, 0, );
		ref_bitmap generatedRef_bitmap = pi.getRef_bitmap();
		generatedRef_bitmap.init_ref_bitmap();
		int generatedNr = ref.getNr();
		pi.setNr_bits(generatedNr);
		ModernizedCProgram.head_ref(mark_uninteresting, ((Object)0));
		ModernizedCProgram.for_each_ref(mark_uninteresting, ((Object)0));
		for (i = 0; i < nr_shallow; /* Mark potential bottoms so we won't go out of bound */i++) {
			commit c = .lookup_commit(ModernizedCProgram.the_repository, oid[shallow[i]]);
			generatedFlags |=  (-1024 << 10);
		}
		for (i = 0; i < generatedNr; i++) {
			pi.paint_down(generatedOid + i, i);
		}
		int generatedNr_bits = pi.getNr_bits();
		if (used) {
			int bitmap_size = (((generatedNr_bits) + (true) - 1) / (true)) * ;
			.memset(used, 0,  * generatedNr);
			for (i = 0; i < nr_shallow; i++) {
				commit c = .lookup_commit(ModernizedCProgram.the_repository, oid[shallow[i]]);
				uint32_t map = generatedRef_bitmap.ref_bitmap_at(c);
				if (map) {
					used[shallow[i]] = ModernizedCProgram.xmemdupz(map, bitmap_size/*
							 * unreachable shallow commits are not removed from
							 * "ours" and "theirs". The user is supposed to run
							 * step 7 on every ref separately and not trust "ours"
							 * and "theirs" any more.
							 */);
				} 
			}
		} else {
				ModernizedCProgram.post_assign_shallow(info, generatedRef_bitmap, ref_status);
		} 
		generatedRef_bitmap.clear_ref_bitmap();
		int generatedPool_count = pi.getPool_count();
		Byte generatedPools = pi.getPools();
		for (i = 0; i < generatedPool_count; i++) {
			ModernizedCProgram.free(generatedPools[i]);
		}
		ModernizedCProgram.free(generatedPools);
		ModernizedCProgram.free(shallow);
	}
	/* (Delayed) step 7, reachability test at commit level */
	public int delayed_reachability_test(int c) {
		int generatedNeed_reachability_test = this.getNeed_reachability_test();
		oid_array generatedShallow = this.getShallow();
		object_id generatedOid = generatedShallow.getOid();
		commit generatedCommits = this.getCommits();
		int generatedNr = ca.getNr();
		int generatedReachable = this.getReachable();
		int generatedNr_commits = this.getNr_commits();
		if (generatedNeed_reachability_test[c]) {
			commit commit = .lookup_commit(ModernizedCProgram.the_repository, generatedOid[c]);
			if (!generatedCommits) {
				commit_array ca = new commit_array();
				.memset(ca, 0, );
				ModernizedCProgram.head_ref(add_ref, ca);
				ModernizedCProgram.for_each_ref(add_ref, ca);
				this.setCommits(generatedCommits);
				this.setNr_commits(generatedNr);
			} 
			generatedReachable[c] = ModernizedCProgram.repo_in_merge_bases_many(ModernizedCProgram.the_repository, commit, generatedNr_commits, generatedCommits);
			generatedNeed_reachability_test[c] = 0;
		} 
		return generatedReachable[c];
	}
	public oid_array getShallow() {
		return shallow;
	}
	public void setShallow(oid_array newShallow) {
		shallow = newShallow;
	}
	public Integer getOurs() {
		return ours;
	}
	public void setOurs(Integer newOurs) {
		ours = newOurs;
	}
	public int getNr_ours() {
		return nr_ours;
	}
	public void setNr_ours(int newNr_ours) {
		nr_ours = newNr_ours;
	}
	public Integer getTheirs() {
		return theirs;
	}
	public void setTheirs(Integer newTheirs) {
		theirs = newTheirs;
	}
	public int getNr_theirs() {
		return nr_theirs;
	}
	public void setNr_theirs(int newNr_theirs) {
		nr_theirs = newNr_theirs;
	}
	public oid_array getRef() {
		return ref;
	}
	public void setRef(oid_array newRef) {
		ref = newRef;
	}
	public Object getUsed_shallow() {
		return used_shallow;
	}
	public void setUsed_shallow(Object newUsed_shallow) {
		used_shallow = newUsed_shallow;
	}
	public int getNeed_reachability_test() {
		return need_reachability_test;
	}
	public void setNeed_reachability_test(int newNeed_reachability_test) {
		need_reachability_test = newNeed_reachability_test;
	}
	public int getReachable() {
		return reachable;
	}
	public void setReachable(int newReachable) {
		reachable = newReachable;
	}
	public int getShallow_ref() {
		return shallow_ref;
	}
	public void setShallow_ref(int newShallow_ref) {
		shallow_ref = newShallow_ref;
	}
	public commit getCommits() {
		return commits;
	}
	public void setCommits(commit newCommits) {
		commits = newCommits;
	}
	public int getNr_commits() {
		return nr_commits;
	}
	public void setNr_commits(int newNr_commits) {
		nr_commits = newNr_commits;
	}
}
