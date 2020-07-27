package application;

public class ref_filter {
	private Object name_patterns;
	private oid_array points_at;
	private commit_list with_commit;
	private commit_list no_commit;
	private  merge;
	private commit merge_commit;
	private int with_commit_tag_algo;
	private int match_as_path;
	private int ignore_case;
	private int detached;
	private int kind;
	private int lines;
	private int abbrev;
	private int verbose;
	
	public ref_filter(Object name_patterns, oid_array points_at, commit_list with_commit, commit_list no_commit,  merge, commit merge_commit, int with_commit_tag_algo, int match_as_path, int ignore_case, int detached, int kind, int lines, int abbrev, int verbose) {
		setName_patterns(name_patterns);
		setPoints_at(points_at);
		setWith_commit(with_commit);
		setNo_commit(no_commit);
		setMerge(merge);
		setMerge_commit(merge_commit);
		setWith_commit_tag_algo(with_commit_tag_algo);
		setMatch_as_path(match_as_path);
		setIgnore_case(ignore_case);
		setDetached(detached);
		setKind(kind);
		setLines(lines);
		setAbbrev(abbrev);
		setVerbose(verbose);
	}
	public ref_filter() {
	}
	
	/* Return 1 if the refname matches one of the patterns, otherwise 0. */
	public int filter_pattern_match(Object refname) {
		if (!ModernizedCProgram.filter.getName_patterns()) {
			return /* No pattern always matches */1;
		} 
		if (ModernizedCProgram.filter.getMatch_as_path()) {
			return ModernizedCProgram.match_name_as_path(ModernizedCProgram.filter, refname);
		} 
		return ModernizedCProgram.match_pattern(ModernizedCProgram.filter, refname);
	}
	public int for_each_fullref_in_pattern(Object cb, Object cb_data, int broken) {
		string_list prefixes = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		string_list_item prefix = new string_list_item();
		int ret;
		if (!ModernizedCProgram.filter.getMatch_as_path()) {
			return ModernizedCProgram.for_each_fullref_in("", cb, cb_data, broken);
		} 
		if (ModernizedCProgram.filter.getIgnore_case()) {
			return ModernizedCProgram.for_each_fullref_in("", cb, cb_data, broken);
		} 
		if (!ModernizedCProgram.filter.getName_patterns()[0]) {
			return ModernizedCProgram.for_each_fullref_in("", cb, cb_data, /* no patterns; we have to look at everything */broken);
		} 
		prefixes.find_longest_prefixes(ModernizedCProgram.filter.getName_patterns());
		string_list_item[] generatedItems = (prefixes).getItems();
		int generatedNr = (prefixes).getNr();
		byte[] generatedString = prefix.getString();
		for (prefix = generatedItems; prefix && prefix < generatedItems + generatedNr; ++prefix) {
			ret = ModernizedCProgram.for_each_fullref_in(generatedString, cb, cb_data, broken);
			if (ret) {
				break;
			} 
		}
		prefixes.string_list_clear(0);
		return ret/*
		 * Given a ref (sha1, refname), check if the ref belongs to the array
		 * of sha1s. If the given ref is a tag, check if the given tag points
		 * at one of the sha1s in the given sha1 array.
		 * the given sha1_array.
		 * NEEDSWORK:
		 * 1. Only a single level of inderection is obtained, we might want to
		 * change this to account for multiple levels (e.g. annotated tags
		 * pointing to annotated tags pointing to a commit.)
		 * 2. As the refs are cached we might know what refname peels to without
		 * the need to parse the object via parse_object(). peel_ref() might be a
		 * more efficient alternative to obtain the pointee.
		 */;
	}
	public int filter_ref_kind(Object refname) {
		if (ModernizedCProgram.filter.getKind() == -1024 || ModernizedCProgram.filter.getKind() == -1024 || ModernizedCProgram.filter.getKind() == -1024) {
			return ModernizedCProgram.filter.getKind();
		} 
		return ModernizedCProgram.ref_kind_from_refname(refname);
	}
	public Object getName_patterns() {
		return name_patterns;
	}
	public void setName_patterns(Object newName_patterns) {
		name_patterns = newName_patterns;
	}
	public oid_array getPoints_at() {
		return points_at;
	}
	public void setPoints_at(oid_array newPoints_at) {
		points_at = newPoints_at;
	}
	public commit_list getWith_commit() {
		return with_commit;
	}
	public void setWith_commit(commit_list newWith_commit) {
		with_commit = newWith_commit;
	}
	public commit_list getNo_commit() {
		return no_commit;
	}
	public void setNo_commit(commit_list newNo_commit) {
		no_commit = newNo_commit;
	}
	public  getMerge() {
		return merge;
	}
	public void setMerge( newMerge) {
		merge = newMerge;
	}
	public commit getMerge_commit() {
		return merge_commit;
	}
	public void setMerge_commit(commit newMerge_commit) {
		merge_commit = newMerge_commit;
	}
	public int getWith_commit_tag_algo() {
		return with_commit_tag_algo;
	}
	public void setWith_commit_tag_algo(int newWith_commit_tag_algo) {
		with_commit_tag_algo = newWith_commit_tag_algo;
	}
	public int getMatch_as_path() {
		return match_as_path;
	}
	public void setMatch_as_path(int newMatch_as_path) {
		match_as_path = newMatch_as_path;
	}
	public int getIgnore_case() {
		return ignore_case;
	}
	public void setIgnore_case(int newIgnore_case) {
		ignore_case = newIgnore_case;
	}
	public int getDetached() {
		return detached;
	}
	public void setDetached(int newDetached) {
		detached = newDetached;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int newKind) {
		kind = newKind;
	}
	public int getLines() {
		return lines;
	}
	public void setLines(int newLines) {
		lines = newLines;
	}
	public int getAbbrev() {
		return abbrev;
	}
	public void setAbbrev(int newAbbrev) {
		abbrev = newAbbrev;
	}
	public int getVerbose() {
		return verbose;
	}
	public void setVerbose(int newVerbose) {
		verbose = newVerbose;
	}
}
