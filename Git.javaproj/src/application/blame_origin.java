package application;

/*
 * One blob in a commit that is being suspected
 */
/* the commit that introduced this group into the final image */
public class blame_origin {
	private int refcnt;
	private blame_origin previous;
	private blame_origin next;
	private commit commit;
	private blame_entry suspects;
	private Object file;
	private int num_lines;
	private Object fingerprints;
	private object_id blob_oid;
	private int mode;
	private byte guilty;
	private Object path;
	
	public blame_origin(int refcnt, blame_origin previous, blame_origin next, commit commit, blame_entry suspects, Object file, int num_lines, Object fingerprints, object_id blob_oid, int mode, byte guilty, Object path) {
		setRefcnt(refcnt);
		setPrevious(previous);
		setNext(next);
		setCommit(commit);
		setSuspects(suspects);
		setFile(file);
		setNum_lines(num_lines);
		setFingerprints(fingerprints);
		setBlob_oid(blob_oid);
		setMode(mode);
		setGuilty(guilty);
		setPath(path);
	}
	public blame_origin() {
	}
	
	public blame_origin blame_suspects_at_peek(blame_suspects s, Object c, int add_if_missing) {
		int nth_slab;
		int nth_slot;
		int generatedSlab_size = s.getSlab_size();
		nth_slab = c.getIndex() / generatedSlab_size;
		nth_slot = c.getIndex() % generatedSlab_size;
		int generatedSlab_count = s.getSlab_count();
		blame_origin generatedSlab = s.getSlab();
		if (generatedSlab_count <= nth_slab) {
			int i;
			if (!add_if_missing) {
				return ((Object)0);
			} 
			(generatedSlab) = ModernizedCProgram.xrealloc((generatedSlab), ModernizedCProgram.st_mult(, (nth_slab + 1)));
			for (i = generatedSlab_count; i <= nth_slab; i++) {
				generatedSlab[i] = ((Object)0);
			}
			s.setSlab_count(nth_slab + 1);
		} 
		int generatedStride = s.getStride();
		if (!generatedSlab[nth_slab]) {
			if (!add_if_missing) {
				return ((Object)0);
			} 
			generatedSlab[nth_slab] = ModernizedCProgram.xcalloc(generatedSlab_size,  * generatedStride);
		} 
		return generatedSlab[nth_slab][nth_slot * generatedStride];
	}
	public blame_origin blame_suspects_at(blame_suspects s, Object c) {
		blame_origin blame_origin = new blame_origin();
		return blame_origin.blame_suspects_at_peek(s, c, 1);
	}
	public blame_origin blame_suspects_peek(blame_suspects s, Object c) {
		blame_origin blame_origin = new blame_origin();
		return blame_origin.blame_suspects_at_peek(s, c, 0);
	}
	public blame_origin get_blame_suspects(commit commit) {
		blame_origin result = new blame_origin();
		blame_origin blame_origin = new blame_origin();
		result = blame_origin.blame_suspects_peek(ModernizedCProgram.blame_suspects, commit);
		return result ? result : ((Object)0);
	}
	public void blame_origin_decref() {
		int generatedRefcnt = this.getRefcnt();
		blame_origin generatedPrevious = this.getPrevious();
		Object generatedFile = this.getFile();
		blame_origin generatedNext = p.getNext();
		commit generatedCommit = this.getCommit();
		blame_origin blame_origin = new blame_origin();
		if (o && --generatedRefcnt <= 0) {
			blame_origin p = new blame_origin();
			blame_origin l = ((Object)0);
			if (generatedPrevious) {
				generatedPrevious.blame_origin_decref();
			} 
			ModernizedCProgram.free(generatedFile.getPtr());
			for (p = blame_origin.get_blame_suspects(generatedCommit); p; ) {
				if (p == o) {
					if (l) {
						l.setNext(generatedNext);
					} else {
							ModernizedCProgram.set_blame_suspects(generatedCommit, generatedNext);
					} 
					ModernizedCProgram.free(o);
					return ;
				} 
			}
			ModernizedCProgram.die("internal error in blame_origin_decref"/*
			 * Given a commit and a path in it, create a new origin structure.
			 * The callers that add blame to the scoreboard should use
			 * get_origin() to obtain shared, refcounted copy instead of calling
			 * this function directly.
			 */);
		} 
	}
	public blame_origin make_origin(commit commit, Object path) {
		blame_origin o = new blame_origin();
		Object generatedPath = ((o)).getPath();
		do {
			size_t flex_array_len_ = (.strlen(path));
			((o)) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
			.memcpy((Object)generatedPath, ((path)), flex_array_len_);
		} while (0);
		o.setCommit(commit);
		o.setRefcnt(1);
		blame_origin blame_origin = new blame_origin();
		o.setNext(blame_origin.get_blame_suspects(commit));
		ModernizedCProgram.set_blame_suspects(commit, o);
		return o/*
		 * Locate an existing origin or create a new one.
		 * This moves the origin to front position in the commit util list.
		 */;
	}
	public blame_origin get_origin(commit commit, Object path) {
		blame_origin o = new blame_origin();
		blame_origin l = new blame_origin();
		Object generatedPath = o.getPath();
		blame_origin generatedNext = o.getNext();
		blame_origin blame_origin = new blame_origin();
		for (; o; ) {
			if (!.strcmp(generatedPath, path)) {
				if (/* bump to front */l) {
					l.setNext(generatedNext);
					o.setNext(blame_origin.get_blame_suspects(commit));
					ModernizedCProgram.set_blame_suspects(commit, o);
				} 
				return o.blame_origin_incref();
			} 
		}
		blame_origin blame_origin = new blame_origin();
		return blame_origin.make_origin(commit, path);
	}
	public Integer fuzzy_find_matching_lines(blame_origin target, int tlno, int parent_slno, int same, int parent_len) {
		int start_a = /* We use the terminology "A" for the left hand side of the diff AKA
			 * parent, and "B" for the right hand side of the diff AKA target. */parent_slno;
		int length_a = parent_len;
		int start_b = tlno;
		int length_b = same - tlno;
		line_number_mapping map_line_number_in_b_to_a = new line_number_mapping(start_a, length_a, start_b, length_b);
		Object generatedFingerprints = this.getFingerprints();
		fingerprint fingerprints_a = generatedFingerprints;
		fingerprint fingerprints_b = generatedFingerprints;
		int i;
		int result;
		int second_best_result;
		int certainties;
		int similarities;
		int similarity_count;
		/*
			 * max_search_distance_a means that given a line in B, compare it to
			 * the line in A that is closest to its position, and the lines in A
			 * that are no greater than max_search_distance_a lines away from the
			 * closest line in A.
			 *
			 * max_search_distance_b is an upper bound on the greatest possible
			 * distance between lines in B such that they will both be compared
			 * with the same line in A according to max_search_distance_a.
			 */
		int max_search_distance_a = 10;
		int max_search_distance_b;
		if (length_a <= 0) {
			return ((Object)0);
		} 
		if (max_search_distance_a >= length_a) {
			max_search_distance_a = length_a ? length_a - 1 : 0;
		} 
		max_search_distance_b = ((2 * max_search_distance_a + 1) * length_b - 1) / length_a;
		result = ModernizedCProgram.xcalloc(, length_b);
		second_best_result = ModernizedCProgram.xcalloc(, length_b);
		certainties = ModernizedCProgram.xcalloc(, length_b);
		similarity_count = length_b * (max_search_distance_a * 2 + /* See get_similarity() for details of similarities. */1);
		similarities = ModernizedCProgram.xcalloc(, similarity_count);
		for (i = 0; i < length_b; ++i) {
			result[i] = -1;
			second_best_result[i] = -1;
			certainties[i] = -1;
		}
		for (i = 0; i < similarity_count; ++i) {
			similarities[i] = -1;
		}
		fingerprints_a + start_a.fuzzy_find_matching_lines_recurse(start_a, start_b, length_a, length_b, fingerprints_b + start_b, similarities, certainties, second_best_result, result, max_search_distance_a, max_search_distance_b, map_line_number_in_b_to_a);
		ModernizedCProgram.free(similarities);
		ModernizedCProgram.free(certainties);
		ModernizedCProgram.free(second_best_result);
		return result;
	}
	public void fill_origin_fingerprints() {
		int line_starts;
		Object generatedFingerprints = this.getFingerprints();
		if (generatedFingerprints) {
			return ;
		} 
		Object generatedFile = this.getFile();
		this.setNum_lines(ModernizedCProgram.find_line_starts(line_starts, generatedFile.getPtr(), generatedFile.getSize()));
		int generatedNum_lines = this.getNum_lines();
		this.setFingerprints(ModernizedCProgram.xcalloc(, generatedNum_lines));
		generatedFingerprints.get_line_fingerprints(generatedFile.getPtr(), line_starts, 0, generatedNum_lines);
		ModernizedCProgram.free(line_starts);
	}
	public void drop_origin_fingerprints() {
		Object generatedFingerprints = this.getFingerprints();
		int generatedNum_lines = this.getNum_lines();
		if (generatedFingerprints) {
			generatedFingerprints.free_line_fingerprints(generatedNum_lines);
			this.setNum_lines(0);
			do {
				ModernizedCProgram.free(generatedFingerprints);
				(generatedFingerprints) = ((Object)0);
			} while (0/*
			 * Given an origin, prepare mmfile_t structure to be used by the
			 * diff machinery
			 */);
		} 
	}
	public void drop_origin_blob() {
		Object generatedFile = this.getFile();
		do {
			ModernizedCProgram.free(generatedFile.getPtr());
			(generatedFile.getPtr()) = ((Object)0);
		} while (0);
		o/*
		 * Any merge of blames happens on lists of blames that arrived via
		 * different parents in a single suspect.  In this case, we want to
		 * sort according to the suspect line numbers as opposed to the final
		 * image line numbers.  The function body is somewhat longish because
		 * it avoids unnecessary writes.
		 */.drop_origin_fingerprints();
	}
	public blame_origin find_origin(repository r, commit parent) {
		blame_origin porigin = new blame_origin();
		diff_options diff_opts = new diff_options();
		byte[] paths = new byte[2];
		Object generatedPath = porigin.getPath();
		blame_origin generatedNext = porigin.getNext();
		blame_origin blame_origin = new blame_origin();
		for (porigin = blame_origin.get_blame_suspects(parent); porigin; porigin = generatedNext) {
			if (!.strcmp(generatedPath, generatedPath)) {
				return porigin/* See if the origin->path is different between parent
					 * and origin first.  Most of the time they are the
					 * same and diff-tree is fairly efficient about this.
					 */.blame_origin_incref();
			} 
		}
		.repo_diff_setup(r, diff_opts);
		diff_flags generatedFlags = diff_opts.getFlags();
		generatedFlags.setRecursive(1);
		diff_opts.setDetect_rename(0);
		diff_opts.setOutput_format(-1024);
		paths[0] = generatedPath;
		paths[1] = ((Object)0);
		pathspec generatedPathspec = diff_opts.getPathspec();
		generatedPathspec.parse_pathspec(((1 << 0) | (1 << 1) | (1 << 2) | (1 << 3) | (1 << 4) | (1 << 5) | (1 << 6)) & ~(1 << 2), (1 << 6), "", paths);
		.diff_setup_done(diff_opts);
		commit generatedCommit = this.getCommit();
		object generatedObject = generatedCommit.getObject();
		object_id generatedOid = generatedObject.getOid();
		if (ModernizedCProgram.is_null_oid(generatedOid)) {
			diff_opts.do_diff_cache(.get_commit_tree_oid(parent));
		} else {
				diff_opts.diff_tree_oid(.get_commit_tree_oid(parent), .get_commit_tree_oid(generatedCommit), "");
		} 
		.diffcore_std(diff_opts);
		blame_origin blame_origin = new blame_origin();
		object_id generatedBlob_oid = porigin.getBlob_oid();
		int generatedMode = this.getMode();
		byte generatedStatus = p.getStatus();
		if (!ModernizedCProgram.diff_queued_diff.getNr()) {
			porigin = blame_origin.get_origin(parent, generatedPath);
			generatedBlob_oid.oidcpy(generatedBlob_oid);
			porigin.setMode(generatedMode);
		} else {
				int i;
				diff_filepair p = ((Object)0);
				for (i = 0; i < ModernizedCProgram.diff_queued_diff.getNr(); i++) {
					byte name;
					p = ModernizedCProgram.diff_queued_diff.getQueue()[i];
					name = generatedPath ? generatedPath : generatedPath;
					if (!.strcmp(name, generatedPath)) {
						break;
					} 
				}
				if (!p) {
					ModernizedCProgram.die("internal error in blame::find_origin");
				} 
				switch (generatedStatus) {
				case (byte)'T'/* Did not exist in parent, or type changed */:
						break;
				case (byte)'A':
				case (byte)'M':
						porigin = blame_origin.get_origin(parent, generatedPath);
						generatedBlob_oid.oidcpy(generatedOid);
						porigin.setMode(generatedMode);
						break;
				default:
						ModernizedCProgram.die("internal error in blame::find_origin (%c)", generatedStatus);
				}
		} 
		.diff_flush(diff_opts);
		generatedPathspec.clear_pathspec();
		return porigin/*
		 * We have an origin -- find the path that corresponds to it in its
		 * parent and return an origin structure to represent it.
		 */;
	}
	public blame_origin find_rename(repository r, commit parent) {
		blame_origin porigin = ((Object)0);
		diff_options diff_opts = new diff_options();
		int i;
		.repo_diff_setup(r, diff_opts);
		diff_flags generatedFlags = diff_opts.getFlags();
		generatedFlags.setRecursive(1);
		diff_opts.setDetect_rename(1);
		diff_opts.setOutput_format(-1024);
		Object generatedPath = this.getPath();
		diff_opts.setSingle_follow(generatedPath);
		.diff_setup_done(diff_opts);
		commit generatedCommit = this.getCommit();
		object generatedObject = generatedCommit.getObject();
		object_id generatedOid = generatedObject.getOid();
		if (ModernizedCProgram.is_null_oid(generatedOid)) {
			diff_opts.do_diff_cache(.get_commit_tree_oid(parent));
		} else {
				diff_opts.diff_tree_oid(.get_commit_tree_oid(parent), .get_commit_tree_oid(generatedCommit), "");
		} 
		.diffcore_std(diff_opts);
		byte generatedStatus = p.getStatus();
		blame_origin blame_origin = new blame_origin();
		object_id generatedBlob_oid = porigin.getBlob_oid();
		diff_filespec generatedOne = p.getOne();
		int generatedMode = generatedOne.getMode();
		for (i = 0; i < ModernizedCProgram.diff_queued_diff.getNr(); i++) {
			diff_filepair p = ModernizedCProgram.diff_queued_diff.getQueue()[i];
			if ((generatedStatus == (byte)'R' || generatedStatus == (byte)'C') && !.strcmp(generatedPath, generatedPath)) {
				porigin = blame_origin.get_origin(parent, generatedPath);
				generatedBlob_oid.oidcpy(generatedOid);
				porigin.setMode(generatedMode);
				break;
			} 
		}
		.diff_flush(diff_opts);
		pathspec generatedPathspec = diff_opts.getPathspec();
		generatedPathspec.clear_pathspec();
		return porigin/*
		 * Append a new blame entry to a given output queue.
		 */;
	}
	public blame_origin blame_origin_incref() {
		int generatedRefcnt = this.getRefcnt();
		if (o) {
			generatedRefcnt++;
		} 
		return o;
	}
	public int getRefcnt() {
		return refcnt;
	}
	public void setRefcnt(int newRefcnt) {
		refcnt = newRefcnt;
	}
	public blame_origin getPrevious() {
		return previous;
	}
	public void setPrevious(blame_origin newPrevious) {
		previous = newPrevious;
	}
	public blame_origin getNext() {
		return next;
	}
	public void setNext(blame_origin newNext) {
		next = newNext;
	}
	public commit getCommit() {
		return commit;
	}
	public void setCommit(commit newCommit) {
		commit = newCommit;
	}
	public blame_entry getSuspects() {
		return suspects;
	}
	public void setSuspects(blame_entry newSuspects) {
		suspects = newSuspects;
	}
	public Object getFile() {
		return file;
	}
	public void setFile(Object newFile) {
		file = newFile;
	}
	public int getNum_lines() {
		return num_lines;
	}
	public void setNum_lines(int newNum_lines) {
		num_lines = newNum_lines;
	}
	public Object getFingerprints() {
		return fingerprints;
	}
	public void setFingerprints(Object newFingerprints) {
		fingerprints = newFingerprints;
	}
	public object_id getBlob_oid() {
		return blob_oid;
	}
	public void setBlob_oid(object_id newBlob_oid) {
		blob_oid = newBlob_oid;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
	public byte getGuilty() {
		return guilty;
	}
	public void setGuilty(byte newGuilty) {
		guilty = newGuilty;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
}
/* origins are put in a list linked via `next' hanging off the
	 * corresponding commit's util field in order to make finding
	 * them fast.  The presence in this chain does not count
	 * towards the origin's reference count.  It is tempting to
	 * let it count as long as the commit is pending examination,
	 * but even under circumstances where the commit will be
	 * present multiple times in the priority queue of unexamined
	 * commits, processing the first instance will not leave any
	 * work requiring the origin data for the second instance.  An
	 * interspersed commit changing that would have to be
	 * preexisting with a different ancestry and with the same
	 * commit date in order to wedge itself between two instances
	 * of the same commit in the priority queue _and_ produce
	 * blame entries relevant for it.  While we don't want to let
	 * us get tripped up by this case, it certainly does not seem
	 * worth optimizing for.
	 */
/* the line number of the first line of this group in the
	 * suspect's file; internally all line numbers are 0 based.
	 */
/* BLAME_H */
