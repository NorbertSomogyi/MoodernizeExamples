package application;

public class blame_scoreboard {
	private commit final;
	private prio_queue commits;
	private repository repo;
	private rev_info revs;
	private Object path;
	private Object final_buf;
	private long final_buf_size;
	private blame_entry ent;
	private oidset ignore_list;
	private int num_lines;
	private Integer lineno;
	private int num_read_blob;
	private int num_get_patch;
	private int num_commits;
	private int move_score;
	private int copy_score;
	private Object contents_from;
	private int reverse;
	private int show_root;
	private int xdl_opts;
	private int no_whole_file_rename;
	private int debug;
	private Object on_sanity_fail;
	private Object found_guilty_entry;
	private Object found_guilty_entry_data;
	
	public blame_scoreboard(commit final, prio_queue commits, repository repo, rev_info revs, Object path, Object final_buf, long final_buf_size, blame_entry ent, oidset ignore_list, int num_lines, Integer lineno, int num_read_blob, int num_get_patch, int num_commits, int move_score, int copy_score, Object contents_from, int reverse, int show_root, int xdl_opts, int no_whole_file_rename, int debug, Object on_sanity_fail, Object found_guilty_entry, Object found_guilty_entry_data) {
		setFinal(final);
		setCommits(commits);
		setRepo(repo);
		setRevs(revs);
		setPath(path);
		setFinal_buf(final_buf);
		setFinal_buf_size(final_buf_size);
		setEnt(ent);
		setIgnore_list(ignore_list);
		setNum_lines(num_lines);
		setLineno(lineno);
		setNum_read_blob(num_read_blob);
		setNum_get_patch(num_get_patch);
		setNum_commits(num_commits);
		setMove_score(move_score);
		setCopy_score(copy_score);
		setContents_from(contents_from);
		setReverse(reverse);
		setShow_root(show_root);
		setXdl_opts(xdl_opts);
		setNo_whole_file_rename(no_whole_file_rename);
		setDebug(debug);
		setOn_sanity_fail(on_sanity_fail);
		setFound_guilty_entry(found_guilty_entry);
		setFound_guilty_entry_data(found_guilty_entry_data);
	}
	public blame_scoreboard() {
	}
	
	public void blame_sort_final() {
		blame_entry generatedEnt = this.getEnt();
		this.setEnt(ModernizedCProgram.llist_mergesort(generatedEnt, get_next_blame, set_next_blame, compare_blame_final));
	}
	public void sanity_check_refcnt() {
		int baa = 0;
		blame_entry ent = new blame_entry();
		blame_origin generatedSuspect = ent.getSuspect();
		int generatedRefcnt = generatedSuspect.getRefcnt();
		Object generatedPath = generatedSuspect.getPath();
		commit generatedCommit = generatedSuspect.getCommit();
		object generatedObject = generatedCommit.getObject();
		object_id generatedOid = generatedObject.getOid();
		blame_entry generatedNext = ent.getNext();
		blame_entry generatedEnt = this.getEnt();
		for (ent = generatedEnt; ent; ent = generatedNext) {
			if (generatedRefcnt <= /* Nobody should have zero or negative refcnt */0) {
				.fprintf((_iob[2]), "%s in %s has negative refcnt %d\n", generatedPath, ModernizedCProgram.oid_to_hex(generatedOid), generatedRefcnt);
				baa = 1;
			} 
		}
		if (baa) {
			.UNRECOGNIZEDFUNCTIONNAME(sb, baa/*
			 * If two blame entries that are next to each other came from
			 * contiguous lines in the same origin (i.e. <commit, path> pair),
			 * merge them together.
			 */);
		} 
	}
	public void blame_coalesce() {
		blame_entry ent = new blame_entry();
		blame_entry next = new blame_entry();
		blame_entry generatedNext = ent.getNext();
		blame_origin generatedSuspect = ent.getSuspect();
		int generatedS_lno = ent.getS_lno();
		int generatedNum_lines = ent.getNum_lines();
		int generatedIgnored = ent.getIgnored();
		int generatedUnblamable = ent.getUnblamable();
		blame_entry generatedEnt = this.getEnt();
		for (ent = generatedEnt; ent && (next = generatedNext); ent = next) {
			if (generatedSuspect == generatedSuspect && generatedS_lno + generatedNum_lines == generatedS_lno && generatedIgnored == generatedIgnored && generatedUnblamable == generatedUnblamable) {
				generatedNum_lines += generatedNum_lines;
				ent.setNext(generatedNext);
				generatedSuspect.blame_origin_decref();
				ModernizedCProgram.free(next);
				ent.setScore(0);
				next = /* again */ent;
			} 
		}
		int generatedDebug = this.getDebug();
		if (generatedDebug) {
			sb/*
			 * Merge the given sorted list of blames into a preexisting origin.
			 * If there were no previous blames to that commit, it is entered into
			 * the commit priority queue of the score board.
			 */.sanity_check_refcnt();
		} 
	}
	public Object blame_nth_line(long lno) {
		Object generatedFinal_buf = this.getFinal_buf();
		Integer generatedLineno = this.getLineno();
		return generatedFinal_buf + generatedLineno[lno/*
		 * It is known that lines between tlno to same came from parent, and e
		 * has an overlap with that range.  it also is known that parent's
		 * line plno corresponds to e's line tlno.
		 *
		 *                <---- e ----->
		 *                   <------>
		 *                   <------------>
		 *             <------------>
		 *             <------------------>
		 *
		 * Split e into potentially three parts; before this chunk, the chunk
		 * to be blamed for the parent, and after that portion.
		 */];
	}
	public void assign_blame(int opt) {
		rev_info generatedRevs = this.getRevs();
		rev_info revs = generatedRevs;
		prio_queue generatedCommits = this.getCommits();
		commit commit = generatedCommits.prio_queue_get();
		blame_origin blame_origin = new blame_origin();
		blame_entry generatedSuspects = suspect.getSuspects();
		blame_origin generatedNext = suspect.getNext();
		commit generatedCommit = suspect.getCommit();
		int generatedReverse = this.getReverse();
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		Object generatedMax_age = revs.getMax_age();
		Object generatedDate = commit.getDate();
		int generatedParsed = generatedObject.getParsed();
		commit_list generatedParents = commit.getParents();
		int generatedShow_root = this.getShow_root();
		Object generatedFound_guilty_entry = this.getFound_guilty_entry();
		Object generatedFound_guilty_entry_data = this.getFound_guilty_entry_data();
		blame_entry generatedEnt = this.getEnt();
		int generatedDebug = this.getDebug();
		while (commit) {
			blame_entry ent = new blame_entry();
			blame_origin suspect = blame_origin.get_blame_suspects(commit);
			while (suspect && !generatedSuspects) {
				suspect = generatedNext;
			}
			if (!suspect) {
				commit = generatedCommits.prio_queue_get();
				continue;
			} 
			((commit == generatedCommit) ? (Object)0 : ._assert("commit == suspect->commit", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\blame.c", 2526/*
					 * We will use this suspect later in the loop,
					 * so hold onto it in the meantime.
					 */));
			suspect.blame_origin_incref();
			ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, commit);
			if (generatedReverse || (!(generatedFlags & (-1024 << 1)) && !(generatedMax_age != -1 && generatedDate < generatedMax_age))) {
				ModernizedCProgram.pass_blame(sb, suspect, opt);
			} else {
					generatedFlags |=  (-1024 << 1);
					if (generatedParsed) {
						commit.mark_parents_uninteresting();
					} 
			} 
			if (!generatedParents && !generatedShow_root) {
				generatedFlags |=  (-1024 << 1);
			} 
			ent = generatedSuspects;
			if (ent) {
				suspect.setGuilty(1);
				for (; ; ) {
					blame_entry next = generatedNext;
					if (generatedFound_guilty_entry) {
						.UNRECOGNIZEDFUNCTIONNAME(ent, generatedFound_guilty_entry_data);
					} 
					if (next) {
						ent = next;
						continue;
					} 
					ent.setNext(generatedEnt);
					this.setEnt(generatedSuspects);
					suspect.setSuspects(((Object)0));
					break;
				}
			} 
			suspect.blame_origin_decref();
			if (generatedDebug) {
				sb/*
				 * To allow quick access to the contents of nth line in the
				 * final image, prepare an index in the scoreboard.
				 */.sanity_check_refcnt();
			} 
		}
	}
	public int prepare_lines() {
		Integer generatedLineno = this.getLineno();
		Object generatedFinal_buf = this.getFinal_buf();
		long generatedFinal_buf_size = this.getFinal_buf_size();
		this.setNum_lines(ModernizedCProgram.find_line_starts(generatedLineno, generatedFinal_buf, generatedFinal_buf_size));
		int generatedNum_lines = this.getNum_lines();
		return generatedNum_lines;
	}
	public void init_scoreboard() {
		.memset(sb, 0, );
		this.setMove_score(20);
		this.setCopy_score(40);
	}
	public commit getFinal() {
		return final;
	}
	public void setFinal(commit newFinal) {
		final = newFinal;
	}
	public prio_queue getCommits() {
		return commits;
	}
	public void setCommits(prio_queue newCommits) {
		commits = newCommits;
	}
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public rev_info getRevs() {
		return revs;
	}
	public void setRevs(rev_info newRevs) {
		revs = newRevs;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
	public Object getFinal_buf() {
		return final_buf;
	}
	public void setFinal_buf(Object newFinal_buf) {
		final_buf = newFinal_buf;
	}
	public long getFinal_buf_size() {
		return final_buf_size;
	}
	public void setFinal_buf_size(long newFinal_buf_size) {
		final_buf_size = newFinal_buf_size;
	}
	public blame_entry getEnt() {
		return ent;
	}
	public void setEnt(blame_entry newEnt) {
		ent = newEnt;
	}
	public oidset getIgnore_list() {
		return ignore_list;
	}
	public void setIgnore_list(oidset newIgnore_list) {
		ignore_list = newIgnore_list;
	}
	public int getNum_lines() {
		return num_lines;
	}
	public void setNum_lines(int newNum_lines) {
		num_lines = newNum_lines;
	}
	public Integer getLineno() {
		return lineno;
	}
	public void setLineno(Integer newLineno) {
		lineno = newLineno;
	}
	public int getNum_read_blob() {
		return num_read_blob;
	}
	public void setNum_read_blob(int newNum_read_blob) {
		num_read_blob = newNum_read_blob;
	}
	public int getNum_get_patch() {
		return num_get_patch;
	}
	public void setNum_get_patch(int newNum_get_patch) {
		num_get_patch = newNum_get_patch;
	}
	public int getNum_commits() {
		return num_commits;
	}
	public void setNum_commits(int newNum_commits) {
		num_commits = newNum_commits;
	}
	public int getMove_score() {
		return move_score;
	}
	public void setMove_score(int newMove_score) {
		move_score = newMove_score;
	}
	public int getCopy_score() {
		return copy_score;
	}
	public void setCopy_score(int newCopy_score) {
		copy_score = newCopy_score;
	}
	public Object getContents_from() {
		return contents_from;
	}
	public void setContents_from(Object newContents_from) {
		contents_from = newContents_from;
	}
	public int getReverse() {
		return reverse;
	}
	public void setReverse(int newReverse) {
		reverse = newReverse;
	}
	public int getShow_root() {
		return show_root;
	}
	public void setShow_root(int newShow_root) {
		show_root = newShow_root;
	}
	public int getXdl_opts() {
		return xdl_opts;
	}
	public void setXdl_opts(int newXdl_opts) {
		xdl_opts = newXdl_opts;
	}
	public int getNo_whole_file_rename() {
		return no_whole_file_rename;
	}
	public void setNo_whole_file_rename(int newNo_whole_file_rename) {
		no_whole_file_rename = newNo_whole_file_rename;
	}
	public int getDebug() {
		return debug;
	}
	public void setDebug(int newDebug) {
		debug = newDebug;
	}
	public Object getOn_sanity_fail() {
		return on_sanity_fail;
	}
	public void setOn_sanity_fail(Object newOn_sanity_fail) {
		on_sanity_fail = newOn_sanity_fail;
	}
	public Object getFound_guilty_entry() {
		return found_guilty_entry;
	}
	public void setFound_guilty_entry(Object newFound_guilty_entry) {
		found_guilty_entry = newFound_guilty_entry;
	}
	public Object getFound_guilty_entry_data() {
		return found_guilty_entry_data;
	}
	public void setFound_guilty_entry_data(Object newFound_guilty_entry_data) {
		found_guilty_entry_data = newFound_guilty_entry_data;
	}
}
/* the final commit (i.e. where we started digging from) */
