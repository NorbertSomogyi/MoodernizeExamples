package application;

/*
 * Copyright (C) 2005 Junio C Hamano
 */
public class combine_diff_path {
	private combine_diff_path next;
	private byte[] path;
	private int mode;
	private object_id oid;
	private Object parent;
	
	public combine_diff_path(combine_diff_path next, byte[] path, int mode, object_id oid, Object parent) {
		setNext(next);
		setPath(path);
		setMode(mode);
		setOid(oid);
		setParent(parent);
	}
	public combine_diff_path() {
	}
	
	public combine_diff_path intersect_paths(int n, int num_parent, int combined_all_paths) {
		diff_queue_struct q = ModernizedCProgram.diff_queued_diff;
		combine_diff_path p = new combine_diff_path();
		combine_diff_path tail = curr;
		int i;
		int j;
		int cmp;
		int generatedNr = q.getNr();
		diff_filepair[][] generatedQueue = q.getQueue();
		Object generatedParent = p.getParent();
		byte[] generatedPath = p.getPath();
		object_id generatedOid = p.getOid();
		combine_diff_path generatedNext = p.getNext();
		if (!n) {
			for (i = 0; i < generatedNr; i++) {
				int len;
				byte path;
				if (/*Error: Function owner not recognized*/diff_unmodified_pair(generatedQueue[i])) {
					continue;
				} 
				ModernizedCProgram.path = generatedQueue[i].getTwo().getPath();
				ModernizedCProgram.len = /*Error: Function owner not recognized*/strlen(ModernizedCProgram.path);
				p = ModernizedCProgram.xmalloc(ModernizedCProgram.st_add(ModernizedCProgram.st_add(ModernizedCProgram.st_add(((/*Error: Unsupported expression*/)), (((ModernizedCProgram.len)))), ((true))), (ModernizedCProgram.st_mult(/*Error: Unsupported expression*/, (num_parent)))));
				p.setPath((byte)(generatedParent[num_parent]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPath, ModernizedCProgram.path, ModernizedCProgram.len);
				generatedPath[ModernizedCProgram.len] = 0;
				p.setNext(((Object)0));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedParent, 0, /*Error: sizeof expression not supported yet*/ * num_parent);
				generatedOid.oidcpy(generatedOid);
				p.setMode(generatedQueue[i].getTwo().getMode());
				generatedOid.oidcpy(generatedOid);
				generatedParent[n].setMode(generatedQueue[i].getOne().getMode());
				generatedParent[n].setStatus(generatedQueue[i].getStatus());
				if (combined_all_paths && ModernizedCProgram.filename_changed(generatedParent[n].getStatus())) {
					generatedPath.strbuf_init(0);
					generatedPath.strbuf_addstr(generatedPath);
				} 
				tail = p;
				tail = generatedNext;
			}
			return curr/*
				 * paths in curr (linked list) and q->queue[] (array) are
				 * both sorted in the tree order.
				 */;
		} 
		i = 0;
		while ((p = tail) != ((Object)0)) {
			cmp = ((i >= generatedNr) ? -1 : ModernizedCProgram.compare_paths(p, generatedQueue[i].getTwo()));
			if (cmp < 0) {
				tail = generatedNext;
				for (j = 0; j < num_parent; j++) {
					if (combined_all_paths && ModernizedCProgram.filename_changed(generatedParent[j].getStatus())) {
						generatedPath.strbuf_release();
					} 
				}
				ModernizedCProgram.free(p);
				continue;
			} 
			if (cmp > 0) {
				/* q->queue[i] not in p->path; skip it */i++;
				continue;
			} 
			generatedOid.oidcpy(generatedOid);
			generatedParent[n].setMode(generatedQueue[i].getOne().getMode());
			generatedParent[n].setStatus(generatedQueue[i].getStatus());
			if (combined_all_paths && ModernizedCProgram.filename_changed(generatedParent[n].getStatus())) {
				generatedPath.strbuf_addstr(generatedPath);
			} 
			tail = generatedNext;
			i++;
		}
		return curr;
	}
	public combine_diff_path find_paths_generic(Object oid, Object parents, diff_options opt, int combined_all_paths) {
		combine_diff_path paths = ((Object)0);
		int i;
		int num_parent = parents.getNr();
		int generatedOutput_format = opt.getOutput_format();
		int output_format = generatedOutput_format;
		Object generatedOrderfile = opt.getOrderfile();
		byte orderfile = generatedOrderfile;
		opt.setOutput_format(-1024);
		opt.setOrderfile(((Object)/* tell diff_tree to emit paths in sorted (=tree) order */0));
		for (i = 0; i < num_parent; /* D(A,P1...Pn) = D(A,P1) ^ ... ^ D(A,Pn)  (wrt paths) */i/*
				 * show stat against the first parent even when doing
				 * combined diff.
				 */++) {
			int stat_opt = output_format & (-1024 | -1024 | -1024 | -1024 | -1024);
			if (i == 0 && stat_opt) {
				opt.setOutput_format(stat_opt);
			} else {
					opt.setOutput_format(-1024);
			} 
			opt.diff_tree_oid(parents.getOid()[i], oid, "");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diffcore_std(opt);
			paths = paths.intersect_paths(i, num_parent, combined_all_paths);
			if (generatedOutput_format != /* if showing diff, show it in requested order */-1024 && orderfile) {
				ModernizedCProgram.diffcore_order(orderfile);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_flush(opt);
		}
		opt.setOutput_format(output_format);
		opt.setOrderfile(orderfile);
		return paths/*
		 * find set of paths that everybody touches, assuming diff is run without
		 * rename/copy detection, etc, comparing all trees simultaneously (= faster).
		 */;
	}
	public combine_diff_path find_paths_multitree(Object oid, Object parents, diff_options opt) {
		int i;
		int nparent = parents.getNr();
		object_id parents_oid = new object_id();
		combine_diff_path paths_head = new combine_diff_path();
		strbuf base = new strbuf();
		(parents_oid) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (nparent)));
		for (i = 0; i < nparent; i++) {
			parents_oid[i] = parents.getOid()[i];
		}
		paths_head.setNext(((Object)/* fake list head, so worker can assume it is non-NULL */0));
		base.strbuf_init(260);
		paths_head.diff_tree_paths(oid, parents_oid, nparent, base, opt);
		base.strbuf_release();
		ModernizedCProgram.free(parents_oid);
		combine_diff_path generatedNext = paths_head.getNext();
		return generatedNext;
	}
	public combine_diff_path path_appendnew(int nparent, Object base, Object path, int pathlen, int mode, Object oid) {
		combine_diff_path p = new combine_diff_path();
		size_t len = ModernizedCProgram.st_add(base.getLen(), pathlen);
		size_t alloclen = ModernizedCProgram.st_add(ModernizedCProgram.st_add(ModernizedCProgram.st_add(((/*Error: Unsupported expression*/)), (((len)))), ((true))), (ModernizedCProgram.st_mult(/*Error: Unsupported expression*/, (nparent))));
		combine_diff_path generatedNext = this.getNext();
		p = generatedNext;
		if (p && (alloclen > (intptr_t)generatedNext)) {
			do {
				ModernizedCProgram.free(p);
				(p) = ((Object)0);
			} while (0);
		} 
		if (!p) {
			p = ModernizedCProgram.xmalloc(alloclen/*
					 * until we go to it next round, .next holds how many bytes we
					 * allocated (for faster realloc - we don't need copying old data).
					 */);
			p.setNext((combine_diff_path)(intptr_t)alloclen);
		} 
		this.setNext(p);
		Object generatedParent = p.getParent();
		p.setPath((byte)(generatedParent[nparent]));
		byte[] generatedPath = p.getPath();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPath, base.getBuf(), base.getLen());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPath + base.getLen(), path, pathlen);
		generatedPath[len] = 0;
		p.setMode(mode);
		object_id generatedOid = p.getOid();
		generatedOid.oidcpy(oid ? oid : ModernizedCProgram.null_oid);
		return p/*
		 * new path should be added to combine diff
		 *
		 * 3 cases on how/when it should be called and behaves:
		 *
		 *	 t, !tp		-> path added, all parents lack it
		 *	!t,  tp		-> path removed from all parents
		 *	 t,  tp		-> path modified/added
		 *			   (M for tp[i]=tp[imin], A otherwise)
		 */;
	}
	public combine_diff_path emit_path(strbuf base, diff_options opt, int nparent, tree_desc t, tree_desc[] tp, int imin) {
		int mode;
		byte path;
		object_id oid = new object_id();
		int pathlen;
		Object generatedLen = base.getLen();
		int old_baselen = generatedLen;
		int i;
		int isdir;
		int recurse = 0;
		int emitthis = 1;
		((t || tp) ? (Object)0 : /*Error: Function owner not recognized*/_assert("t || tp", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\tree-diff.c", /* at least something has to be valid */192));
		name_entry generatedEntry = t.getEntry();
		if (t) {
			oid = t.tree_entry_extract(path, /* path present in resulting tree */mode);
			pathlen = ModernizedCProgram.tree_entry_len(generatedEntry);
			isdir = (((mode) & -1024) == -1024/*
					 * a path was removed - take path from imin parent. Also take
					 * mode from that parent, to decide on recursion(1).
					 *
					 * 1) all modes for tp[i]=tp[imin] should be the same wrt
					 *    S_ISDIR, thanks to base_name_compare().
					 */);
		} else {
				tp[imin].tree_entry_extract(path, mode);
				pathlen = ModernizedCProgram.tree_entry_len(generatedEntry);
				isdir = (((mode) & -1024) == -1024);
				oid = ((Object)0);
				mode = 0;
		} 
		diff_flags generatedFlags = opt.getFlags();
		int generatedRecursive = generatedFlags.getRecursive();
		int generatedTree_in_recursive = generatedFlags.getTree_in_recursive();
		if (generatedRecursive && isdir) {
			recurse = 1;
			emitthis = generatedTree_in_recursive;
		} 
		int generatedMode = generatedEntry.getMode();
		Object generatedParent = this.getParent();
		object_id generatedOid = generatedEntry.getOid();
		Object generatedPathchange = opt.getPathchange();
		if (emitthis) {
			int keep;
			combine_diff_path pprev = p;
			p = p.path_appendnew(nparent, base, path, pathlen, mode, oid);
			for (i = 0; i < nparent; ++i/*
						 * tp[i] is valid, if present and if tp[i]==tp[imin] -
						 * otherwise, we should ignore it.
						 */) {
				int tpi_valid = tp && !(generatedMode & -1024);
				object_id oid_i = new object_id();
				int mode_i;
				generatedParent[i].setStatus(!t ? (byte)'D' : tpi_valid ? (byte)'M' : (byte)'A');
				if (tpi_valid) {
					oid_i = generatedOid;
					mode_i = generatedMode;
				} else {
						oid_i = ModernizedCProgram.null_oid;
						mode_i = 0;
				} 
				generatedParent[i].setMode(mode_i);
				generatedOid.oidcpy(oid_i);
			}
			ModernizedCProgram.keep = 1;
			if (generatedPathchange) {
				ModernizedCProgram.keep = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(opt, p/*
						 * If a path was filtered or consumed - we don't need to add it
						 * to the list and can reuse its memory, leaving it as
						 * pre-allocated element on the tail.
						 *
						 * On the other hand, if path needs to be kept, we need to
						 * correct its .next to NULL, as it was pre-initialized to how
						 * much memory was allocated.
						 *
						 * see path_appendnew() for details.
						 */);
			} 
			if (!ModernizedCProgram.keep) {
				p = pprev;
			} else {
					this.setNext(((Object)0));
			} 
		} 
		if (recurse) {
			object_id parents_oid = new object_id();
			do {
				if ((nparent) <= 2) {
					(parents_oid) = (ModernizedCProgram.xmalloc((nparent) * /*Error: sizeof expression not supported yet*/));
				} else {
						((parents_oid)) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (nparent)));
				} 
			} while (0);
			for (i = 0; i < nparent; ++i) {
				int tpi_valid = tp && !(generatedMode & /* same rule as in emitthis */-1024);
				parents_oid[i] = tpi_valid ? generatedOid : ((Object)0);
			}
			base.strbuf_add(path, pathlen);
			base.strbuf_addch((byte)'/');
			p = p.ll_diff_tree_paths(oid, parents_oid, nparent, base, opt);
			do {
				if ((nparent) > 2) {
					ModernizedCProgram.free((parents_oid));
				} 
			} while (0);
		} 
		base.strbuf_setlen(old_baselen);
		return p;
	}
	public combine_diff_path ll_diff_tree_paths(Object oid, Object[][] parents_oid, int nparent, strbuf base, diff_options opt) {
		tree_desc t = new tree_desc();
		tree_desc tp = new tree_desc();
		Object ttree;
		Object tptree;
		int i;
		do {
			if ((nparent) <= 2) {
				(tp) = (ModernizedCProgram.xmalloc((nparent) * /*Error: sizeof expression not supported yet*/));
			} else {
					((tp)) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (nparent)));
			} 
		} while (0);
		do {
			if ((nparent) <= 2) {
				(tptree) = (ModernizedCProgram.xmalloc((nparent) * /*Error: sizeof expression not supported yet*/));
			} else {
					((tptree)) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (nparent)));
			} 
		} while (0/*
			 * load parents first, as they are probably already cached.
			 *
			 * ( log_tree_diff() parses commit->parent before calling here via
			 *   diff_tree_oid(parent, commit) )
			 */);
		repository generatedRepo = opt.getRepo();
		for (i = 0; i < nparent; ++i) {
			tptree[i] = ModernizedCProgram.fill_tree_descriptor(generatedRepo, tp[i], parents_oid[i]);
		}
		ttree = ModernizedCProgram.fill_tree_descriptor(generatedRepo, t, oid);
		diff_flags generatedFlags = opt.getFlags();
		int generatedRecursive = generatedFlags.getRecursive();
		pathspec generatedPathspec = opt.getPathspec();
		generatedPathspec.setRecursive(generatedRecursive);
		int generatedNr = generatedPathspec.getNr();
		int generatedSize = t.getSize();
		int generatedFind_copies_harder = generatedFlags.getFind_copies_harder();
		name_entry generatedEntry = t.getEntry();
		object_id generatedOid = generatedEntry.getOid();
		int generatedMode = generatedEntry.getMode();
		ModernizedCProgram.free(ttree);
		for (i = nparent - 1; i >= 0; i--) {
			ModernizedCProgram.free(tptree[i]);
		}
		do {
			if ((nparent) > 2) {
				ModernizedCProgram.free((tptree));
			} 
		} while (0);
		do {
			if ((nparent) > 2) {
				ModernizedCProgram.free((tp));
			} 
		} while (0);
		return p;
	}
	public combine_diff_path diff_tree_paths(Object oid, Object parents_oid, int nparent, strbuf base, diff_options opt) {
		p = p.ll_diff_tree_paths(oid, parents_oid, nparent, base, opt/*
			 * free pre-allocated last element, if any
			 * (see path_appendnew() for details about why)
			 */);
		combine_diff_path generatedNext = this.getNext();
		do {
			ModernizedCProgram.free(generatedNext);
			(generatedNext) = ((Object)0);
		} while (0);
		return p/*
		 * Does it look like the resulting diff might be due to a rename?
		 *  - single entry
		 *  - not a valid previous file
		 */;
	}
	public combine_diff_path getNext() {
		return next;
	}
	public void setNext(combine_diff_path newNext) {
		next = newNext;
	}
	public byte[] getPath() {
		return path;
	}
	public void setPath(byte[] newPath) {
		path = newPath;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public Object getParent() {
		return parent;
	}
	public void setParent(Object newParent) {
		parent = newParent;
	}
}
