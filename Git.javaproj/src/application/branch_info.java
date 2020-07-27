package application;

public class branch_info {
	private Byte remote_name;
	private string_list merge;
	private  rebase;
	
	public branch_info(Byte remote_name, string_list merge,  rebase) {
		setRemote_name(remote_name);
		setMerge(merge);
		setRebase(rebase);
	}
	public branch_info() {
	}
	
	public void setup_branch_path() {
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		buf.strbuf_branchname(ModernizedCProgram.branch.getName(), (1 << 0));
		byte[] generatedBuf = buf.getBuf();
		if (/*Error: Function owner not recognized*/strcmp(generatedBuf, ModernizedCProgram.branch.getName())) {
			ModernizedCProgram.branch.setName(ModernizedCProgram.xstrdup(generatedBuf));
		} 
		buf.strbuf_splice(0, 0, "refs/heads/", 11);
		ModernizedCProgram.branch.setPath(buf.strbuf_detach(((Object)0)));
	}
	public int merge_working_tree(Object opts, branch_info new_branch_info, Integer writeout_error) {
		int ret;
		lock_file lock_file = new lock_file(((Object)0));
		tree new_tree = new tree();
		ModernizedCProgram.repo_hold_locked_index(ModernizedCProgram.the_repository, (lock_file), (true));
		if (ModernizedCProgram.the_repository.repo_read_index_preload((((Object)0)), 0) < 0) {
			return ();
		} 
		ModernizedCProgram.the_index.resolve_undo_clear_index();
		Object generatedCommit = new_branch_info.getCommit();
		tree tree = new tree();
		if (opts.getNew_orphan_branch() && opts.getOrphan_from_empty_tree()) {
			if (generatedCommit) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\checkout.c", 657, "'switch --orphan' should never accept a commit as starting point");
			} 
			new_tree = tree.parse_tree_indirect(ModernizedCProgram.the_repository.getHash_algo().getEmpty_tree());
		} else {
				new_tree = /*Error: Function owner not recognized*/repo_get_commit_tree(ModernizedCProgram.the_repository, generatedCommit);
		} 
		dir_struct generatedDir = topts.getDir();
		 generatedFlags = generatedDir.getFlags();
		Object generatedBuffer = tree.getBuffer();
		long generatedSize = tree.getSize();
		byte[] generatedBuf = sb.getBuf();
		tree tree = new tree();
		Object generatedName = this.getName();
		strbuf generatedObuf = o.getObuf();
		if (opts.getDiscard_changes()) {
			ret = new_tree.reset_tree(opts, 1, writeout_error);
			if (ret) {
				return ret;
			} 
		} else {
				tree_desc[] trees = new tree_desc();
				tree tree = new tree();
				unpack_trees_options topts = new unpack_trees_options();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(topts, 0, /*Error: sizeof expression not supported yet*/);
				topts.setHead_idx(-1);
				topts.setSrc_index(ModernizedCProgram.the_index);
				topts.setDst_index(ModernizedCProgram.the_index);
				topts.setup_unpack_trees_porcelain("checkout");
				ModernizedCProgram.the_index.refresh_index((true), ((Object)0), ((Object)0), ((Object)0));
				if (ModernizedCProgram.unmerged_index(ModernizedCProgram.the_index)) {
					();
					return 1;
				} 
				topts.setInitial_checkout(/* 2-way merge to the new branch */ModernizedCProgram.the_index.is_index_unborn());
				topts.setUpdate(1);
				topts.setMerge(1);
				topts.setQuiet(opts.getMerge() && generatedCommit);
				topts.setVerbose_update(opts.getShow_progress());
				topts.setFn(ModernizedCProgram.twoway_merge);
				if (opts.getOverwrite_ignore()) {
					topts.setDir(ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/));
					generatedFlags |=  .DIR_SHOW_IGNORED;
					generatedDir.setup_standard_excludes();
				} 
				tree = tree.parse_tree_indirect(generatedCommit ? generatedCommit.getObject().getOid() : ModernizedCProgram.the_repository.getHash_algo().getEmpty_tree());
				ModernizedCProgram.trees[0].init_tree_desc(generatedBuffer, generatedSize);
				new_tree.parse_tree();
				tree = new_tree;
				ModernizedCProgram.trees[1].init_tree_desc(generatedBuffer, generatedSize);
				ret = ModernizedCProgram.unpack_trees(2, ModernizedCProgram.trees, topts);
				topts.clear_unpack_trees_porcelain();
				if (ret == -1/*
							 * Unpack couldn't do a trivial merge; either
							 * give up or do a real merge, depending on
							 * whether the merge flag was used.
							 */) {
					tree work = new tree();
					tree old_tree = new tree();
					merge_options o = new merge_options();
					strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
					strbuf old_commit_shortname = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
					if (!opts.getMerge()) {
						return 1/*
									 * Without old_branch_info->commit, the below is the same as
									 * the two-tree unpack we already tried and failed.
									 */;
					} 
					if (!generatedCommit) {
						return 1;
					} 
					ModernizedCProgram.old_tree = /*Error: Function owner not recognized*/repo_get_commit_tree(ModernizedCProgram.the_repository, generatedCommit);
					if (ModernizedCProgram.repo_index_has_changes(ModernizedCProgram.the_repository, ModernizedCProgram.old_tree, sb)) {
						ModernizedCProgram.die(ModernizedCProgram._("cannot continue with staged changes in the following files:\n%s"), generatedBuf);
					} 
					sb/* Do more real merge *//*
								 * We update the index fully, then write the
								 * tree from the index, then merge the new
								 * branch with the current tree, with the old
								 * branch as the base. Then we reset the index
								 * (but not the working tree) to the new
								 * branch, leaving the working tree as the
								 * merged version, but skipping unmerged
								 * entries in the index.
								 */.strbuf_release();
					ModernizedCProgram.add_files_to_cache(((Object)0), ((Object)0), 0/*
								 * NEEDSWORK: carrying over local changes
								 * when branches have different end-of-line
								 * normalization (or clean+smudge rules) is
								 * a pain; plumb in an option to set
								 * o.renormalize?
								 */);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/init_merge_options(o, ModernizedCProgram.the_repository);
					o.setVerbosity(0);
					work = tree.write_in_core_index_as_tree(ModernizedCProgram.the_repository);
					ret = new_tree.reset_tree(opts, 1, writeout_error);
					if (ret) {
						return ret;
					} 
					o.setAncestor(generatedName);
					if (generatedName == ((Object)0)) {
						old_commit_shortname.strbuf_add_unique_abbrev(generatedCommit.getObject().getOid(), ModernizedCProgram.default_abbrev);
						o.setAncestor(generatedBuf);
					} 
					o.setBranch1(generatedName);
					o.setBranch2("local");
					ret = o.merge_trees(new_tree, work, ModernizedCProgram.old_tree);
					if (ret < 0) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\checkout.c", 778, (true)));
					} 
					ret = new_tree.reset_tree(opts, 0, writeout_error);
					generatedObuf.strbuf_release();
					old_commit_shortname.strbuf_release();
					if (ret) {
						return ret;
					} 
				} 
		} 
		cache_tree cache_tree = new cache_tree();
		if (!(ModernizedCProgram.the_index.getCache_tree())) {
			(ModernizedCProgram.the_index.getCache_tree()) = cache_tree.cache_tree();
		} 
		if (!(ModernizedCProgram.the_index.getCache_tree()).cache_tree_fully_valid()) {
			ModernizedCProgram.the_index.cache_tree_update(8 | 16);
		} 
		if (ModernizedCProgram.write_locked_index(ModernizedCProgram.the_index, lock_file, (1 << 0))) {
			ModernizedCProgram.die(ModernizedCProgram._("unable to write new index file"));
		} 
		if (!opts.getDiscard_changes() && !opts.getQuiet() && generatedCommit) {
			generatedCommit.getObject().show_local_changes(opts.getDiff_options());
		} 
		return 0;
	}
	public void report_tracking() {
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		Object generatedName = this.getName();
		branch branch = /*Error: Function owner not recognized*/branch_get(generatedName);
		if (!/*Error: Function owner not recognized*/format_tracking_info(branch, sb, ahead_behind_flags.AHEAD_BEHIND_FULL)) {
			return /*Error: Unsupported expression*/;
		} 
		byte[] generatedBuf = sb.getBuf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(generatedBuf, (_iob[1]));
		sb.strbuf_release();
	}
	public void update_refs_for_switch(Object opts, branch_info new_branch_info) {
		strbuf msg = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte old_desc;
		byte reflog_msg;
		Object generatedName = new_branch_info.getName();
		if (opts.getNew_branch()) {
			if (opts.getNew_orphan_branch()) {
				byte refname;
				refname = ModernizedCProgram.mkpathdup("refs/heads/%s", opts.getNew_orphan_branch());
				if (opts.getNew_branch_log() && !ModernizedCProgram.should_autocreate_reflog(refname)) {
					int ret;
					strbuf err = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
					ret = ModernizedCProgram.err.safe_create_reflog(refname, 1);
					if (ret) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), ModernizedCProgram._("Can not do reflog for '%s': %s\n"), opts.getNew_orphan_branch(), ModernizedCProgram.err.getBuf());
						ModernizedCProgram.err.strbuf_release();
						ModernizedCProgram.free(refname);
						return /*Error: Unsupported expression*/;
					} 
					ModernizedCProgram.err.strbuf_release();
				} 
				ModernizedCProgram.free(refname);
			} else {
					ModernizedCProgram.the_repository.create_branch(opts.getNew_branch(), generatedName, opts.getNew_branch_force() ? 1 : 0, opts.getNew_branch_force() ? 1 : 0, opts.getNew_branch_log(), opts.getQuiet(), opts.getTrack());
			} 
			new_branch_info.setName(opts.getNew_branch());
			new_branch_info.setup_branch_path();
		} 
		old_desc = generatedName;
		Object generatedCommit = this.getCommit();
		if (!old_desc && generatedCommit) {
			old_desc = ModernizedCProgram.oid_to_hex(generatedCommit.getObject().getOid());
		} 
		reflog_msg = /*Error: Function owner not recognized*/getenv("GIT_REFLOG_ACTION");
		if (!reflog_msg) {
			msg.strbuf_addf("checkout: moving from %s to %s", old_desc ? old_desc : "(invalid)", generatedName);
		} else {
				msg.strbuf_insert(0, reflog_msg, /*Error: Function owner not recognized*/strlen(reflog_msg));
		} 
		Object generatedPath = new_branch_info.getPath();
		byte[] generatedBuf = msg.getBuf();
		if (!/*Error: Function owner not recognized*/strcmp(generatedName, "HEAD") && !generatedPath && !opts.getForce_detach()) {
		}  else if (opts.getForce_detach() || !generatedPath) {
			ModernizedCProgram.update_ref(generatedBuf, "HEAD", generatedCommit.getObject().getOid(), ((Object)0), (1 << 0), action_on_err.UPDATE_REFS_DIE_ON_ERR);
			if (!opts.getQuiet()) {
				if (generatedPath && ModernizedCProgram.advice_detached_head && !opts.getForce_detach()) {
					ModernizedCProgram.detach_advice(generatedName);
				} 
				generatedCommit.describe_detached_head(ModernizedCProgram._("HEAD is now at"));
			} 
		}  else if (generatedPath) {
			if (ModernizedCProgram.create_symref("HEAD", generatedPath, generatedBuf) < 0) {
				ModernizedCProgram.die(ModernizedCProgram._("unable to update HEAD"));
			} 
			if (!opts.getQuiet()) {
				if (generatedPath && !/*Error: Function owner not recognized*/strcmp(generatedPath, generatedPath)) {
					if (opts.getNew_branch_force()) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), ModernizedCProgram._("Reset branch '%s'\n"), generatedName);
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), ModernizedCProgram._("Already on '%s'\n"), generatedName);
					} 
				}  else if (opts.getNew_branch()) {
					if (opts.getBranch_exists()) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), ModernizedCProgram._("Switched to and reset branch '%s'\n"), generatedName);
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), ModernizedCProgram._("Switched to a new branch '%s'\n"), generatedName);
					} 
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), ModernizedCProgram._("Switched to branch '%s'\n"), generatedName);
				} 
			} 
			if (generatedPath && generatedName) {
				if (!ModernizedCProgram.ref_exists(generatedPath) && ModernizedCProgram.reflog_exists(generatedPath)) {
					ModernizedCProgram.delete_reflog(generatedPath);
				} 
			} 
		} 
		ModernizedCProgram.the_repository.remove_branch_state(!opts.getQuiet());
		msg.strbuf_release();
		if (!opts.getQuiet() && (generatedPath || (!opts.getForce_detach() && !/*Error: Function owner not recognized*/strcmp(generatedName, "HEAD")))) {
			new_branch_info.report_tracking();
		} 
	}
	public int switch_branches(Object opts) {
		int ret = 0;
		branch_info old_branch_info = new branch_info();
		Object path_to_free;
		object_id rev = new object_id();
		int flag;
		int writeout_error = 0;
		int do_merge = 1;
		ModernizedCProgram.trace2_cmd_mode_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\checkout.c", 1025, ("branch"));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(old_branch_info, 0, /*Error: sizeof expression not supported yet*/);
		old_branch_info.setPath(path_to_free = rev.resolve_refdup("HEAD", 0, flag));
		Object generatedPath = old_branch_info.getPath();
		if (generatedPath) {
			old_branch_info.setCommit(/*Error: Function owner not recognized*/lookup_commit_reference_gently(ModernizedCProgram.the_repository, rev, 1));
		} 
		if (!(flag & -1024)) {
			old_branch_info.setPath(((Object)0));
		} 
		Object generatedName = old_branch_info.getName();
		if (generatedPath) {
			ModernizedCProgram.skip_prefix(generatedPath, "refs/heads/", generatedName);
		} 
		if (opts.getNew_orphan_branch() && opts.getOrphan_from_empty_tree()) {
			if (generatedName) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\checkout.c", 1039, "'switch --orphan' should never accept a commit as starting point");
			} 
			this.setCommit(((Object)0));
			this.setName("(empty)");
			do_merge = 1;
		} 
		Object generatedCommit = old_branch_info.getCommit();
		if (!generatedName) {
			this.setName("HEAD");
			this.setCommit(generatedCommit);
			if (!generatedCommit) {
				ModernizedCProgram.die(ModernizedCProgram._("You are on a branch yet to be born"));
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/parse_commit_or_die(generatedCommit);
			if (opts.getOnly_merge_on_switching_branches()) {
				do_merge = 0;
			} 
		} 
		if (do_merge) {
			ret = old_branch_info.merge_working_tree(opts, new_branch_info, writeout_error);
			if (ret) {
				ModernizedCProgram.free(path_to_free);
				return ret;
			} 
		} 
		if (!opts.getQuiet() && !generatedPath && generatedCommit && generatedCommit != generatedCommit) {
			generatedCommit.orphaned_commit_warning(generatedCommit);
		} 
		old_branch_info.update_refs_for_switch(opts, new_branch_info);
		ret = generatedCommit.post_checkout_hook(generatedCommit, 1);
		ModernizedCProgram.free(path_to_free);
		return ret || writeout_error;
	}
	public Byte getRemote_name() {
		return remote_name;
	}
	public void setRemote_name(Byte newRemote_name) {
		remote_name = newRemote_name;
	}
	public string_list getMerge() {
		return merge;
	}
	public void setMerge(string_list newMerge) {
		merge = newMerge;
	}
	public  getRebase() {
		return rebase;
	}
	public void setRebase( newRebase) {
		rebase = newRebase;
	}
}
