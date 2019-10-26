package application;

public class notes_merge_options {
	private repository repo;
	private Object local_ref;
	private Object remote_ref;
	private strbuf commit_msg;
	private int verbosity;
	private notes_merge_strategy strategy;
	private int has_worktree;
	
	public notes_merge_options(repository repo, Object local_ref, Object remote_ref, strbuf commit_msg, int verbosity, notes_merge_strategy strategy, int has_worktree) {
		setRepo(repo);
		setLocal_ref(local_ref);
		setRemote_ref(remote_ref);
		setCommit_msg(commit_msg);
		setVerbosity(verbosity);
		setStrategy(strategy);
		setHas_worktree(has_worktree);
	}
	public notes_merge_options() {
	}
	
	public int merge_abort() {
		int ret = 0/*
			 * Remove .git/NOTES_MERGE_PARTIAL and .git/NOTES_MERGE_REF, and call
			 * notes_merge_abort() to remove .git/NOTES_MERGE_WORKTREE.
			 */;
		if (ModernizedCProgram.delete_ref(((Object)0), "NOTES_MERGE_PARTIAL", ((Object)0), 0)) {
			ret += ();
		} 
		if (ModernizedCProgram.delete_ref(((Object)0), "NOTES_MERGE_REF", ((Object)0), (1 << 0))) {
			ret += ();
		} 
		if (o.notes_merge_abort()) {
			ret += ();
		} 
		return ret;
	}
	public int merge_commit() {
		strbuf msg = new strbuf(, , );
		object_id oid = new object_id();
		object_id parent_oid = new object_id();
		notes_tree t = new notes_tree();
		commit partial = new commit();
		pretty_print_context pretty_ctx = new pretty_print_context();
		Object local_ref_to_free;
		int ret;
		/*
			 * Read partial merge result from .git/NOTES_MERGE_PARTIAL,
			 * and target notes ref from .git/NOTES_MERGE_REF.
			 */
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "NOTES_MERGE_PARTIAL", oid)) {
			ModernizedCProgram.die(ModernizedCProgram._("failed to read ref NOTES_MERGE_PARTIAL"));
		}  else if (!(partial = .lookup_commit_reference(ModernizedCProgram.the_repository, oid))) {
			ModernizedCProgram.die(ModernizedCProgram._("could not find commit from NOTES_MERGE_PARTIAL."));
		}  else if (ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, partial)) {
			ModernizedCProgram.die(ModernizedCProgram._("could not parse commit from NOTES_MERGE_PARTIAL."));
		} 
		commit_list generatedParents = partial.getParents();
		commit generatedItem = generatedParents.getItem();
		object generatedObject = generatedItem.getObject();
		object_id generatedOid = generatedObject.getOid();
		if (generatedParents) {
			parent_oid.oidcpy(generatedOid);
		} else {
				parent_oid.oidclr();
		} 
		t = ModernizedCProgram.xcalloc(1, );
		.init_notes(t, "NOTES_MERGE_PARTIAL", ModernizedCProgram.combine_notes_overwrite, 0);
		this.setLocal_ref(local_ref_to_free = oid.resolve_refdup("NOTES_MERGE_REF", 0, ((Object)0)));
		Object generatedLocal_ref = this.getLocal_ref();
		if (!generatedLocal_ref) {
			ModernizedCProgram.die(ModernizedCProgram._("failed to resolve NOTES_MERGE_REF"));
		} 
		if (ModernizedCProgram.notes_merge_commit(o, t, partial, oid)) {
			ModernizedCProgram.die(ModernizedCProgram._("failed to finalize notes merge"));
		} 
		.memset(pretty_ctx, 0, );
		ModernizedCProgram.repo_format_commit_message(ModernizedCProgram.the_repository, partial, "%s", msg, pretty_ctx);
		msg.strbuf_trim();
		msg.strbuf_insert(0, "notes: ", 7);
		byte generatedBuf = msg.getBuf();
		ModernizedCProgram.update_ref(generatedBuf, generatedLocal_ref, oid, ModernizedCProgram.is_null_oid(parent_oid) ? ((Object)0) : parent_oid, 0, action_on_err.UPDATE_REFS_DIE_ON_ERR);
		.free_notes(t);
		msg.strbuf_release();
		ret = o.merge_abort();
		ModernizedCProgram.free(local_ref_to_free);
		return ret;
	}
	public void check_notes_merge_worktree() {
		int generatedHas_worktree = this.getHas_worktree();
		if (!generatedHas_worktree) {
			if (ModernizedCProgram.file_exists(ModernizedCProgram.git_path("NOTES_MERGE_WORKTREE")) && !ModernizedCProgram.is_empty_dir(ModernizedCProgram.git_path("NOTES_MERGE_WORKTREE"))) {
				if (ModernizedCProgram.advice_resolve_conflict) {
					ModernizedCProgram.die(ModernizedCProgram._("You have not concluded your previous notes merge (%s exists).\nPlease, use 'git notes merge --commit' or 'git notes merge --abort' to commit/abort the previous merge before you start a new notes merge."), ModernizedCProgram.git_path("NOTES_MERGE_*"));
				} else {
						ModernizedCProgram.die(ModernizedCProgram._("You have not concluded your notes merge (%s exists)."), ModernizedCProgram.git_path("NOTES_MERGE_*"));
				} 
			} 
			if (ModernizedCProgram.safe_create_leading_directories_const(ModernizedCProgram.git_path("NOTES_MERGE_WORKTREE/.test"))) {
				ModernizedCProgram.die_errno("unable to create directory %s", ModernizedCProgram.git_path("NOTES_MERGE_WORKTREE"));
			} 
			this.setHas_worktree(1);
		}  else if (!ModernizedCProgram.file_exists(ModernizedCProgram.git_path("NOTES_MERGE_WORKTREE"))) {
			ModernizedCProgram.die(/* NOTES_MERGE_WORKTREE should already be established */"missing '%s'. This should not happen", ModernizedCProgram.git_path("NOTES_MERGE_WORKTREE"));
		} 
	}
	public int notes_merge_abort() {
		strbuf buf = new strbuf(, , );
		int ret;
		buf.git_path_buf("NOTES_MERGE_WORKTREE");
		int generatedVerbosity = this.getVerbosity();
		byte generatedBuf = buf.getBuf();
		if (generatedVerbosity >= 3) {
			.printf("Removing notes merge worktree at %s/*\n", generatedBuf);
		} 
		ret = buf.remove_dir_recursively(4);
		buf.strbuf_release();
		return ret;
	}
	/*
		 * Remove all files within .git/NOTES_MERGE_WORKTREE. We do not remove
		 * the .git/NOTES_MERGE_WORKTREE directory itself, since it might be
		 * the current working directory of the user.
		 */
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public Object getLocal_ref() {
		return local_ref;
	}
	public void setLocal_ref(Object newLocal_ref) {
		local_ref = newLocal_ref;
	}
	public Object getRemote_ref() {
		return remote_ref;
	}
	public void setRemote_ref(Object newRemote_ref) {
		remote_ref = newRemote_ref;
	}
	public strbuf getCommit_msg() {
		return commit_msg;
	}
	public void setCommit_msg(strbuf newCommit_msg) {
		commit_msg = newCommit_msg;
	}
	public int getVerbosity() {
		return verbosity;
	}
	public void setVerbosity(int newVerbosity) {
		verbosity = newVerbosity;
	}
	public notes_merge_strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(notes_merge_strategy newStrategy) {
		strategy = newStrategy;
	}
	public int getHas_worktree() {
		return has_worktree;
	}
	public void setHas_worktree(int newHas_worktree) {
		has_worktree = newHas_worktree;
	}
}
/*
 * Merge notes from o->remote_ref into o->local_ref
 *
 * The given notes_tree 'local_tree' must be the notes_tree referenced by the
 * o->local_ref. This is the notes_tree in which the object-level merge is
 * performed.
 *
 * The commits given by the two refs are merged, producing one of the following
 * outcomes:
 *
 * 1. The merge trivially results in an existing commit (e.g. fast-forward or
 *    already-up-to-date). 'local_tree' is untouched, the OID of the result
 *    is written into 'result_oid' and 0 is returned.
 * 2. The merge successfully completes, producing a merge commit. local_tree
 *    contains the updated notes tree, the OID of the resulting commit is
 *    written into 'result_oid', and 1 is returned.
 * 3. The merge results in conflicts. This is similar to #2 in that the
 *    partial merge result (i.e. merge result minus the unmerged entries)
 *    are stored in 'local_tree', and the OID or the resulting commit
 *    (to be amended when the conflicts have been resolved) is written into
 *    'result_oid'. The unmerged entries are written into the
 *    .git/NOTES_MERGE_WORKTREE directory with conflict markers.
 *    -1 is returned.
 *
 * Both o->local_ref and o->remote_ref must be given (non-NULL), but either ref
 * (although not both) may refer to a non-existing notes ref, in which case
 * that notes ref is interpreted as an empty notes tree, and the merge
 * trivially results in what the other ref points to.
 */
