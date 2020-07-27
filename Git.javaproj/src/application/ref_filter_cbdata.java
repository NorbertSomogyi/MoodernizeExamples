package application;

public class ref_filter_cbdata {
	private ref_array array;
	private ref_filter filter;
	private contains_cache contains_cache;
	private contains_cache no_contains_cache;
	
	public ref_filter_cbdata(ref_array array, ref_filter filter, contains_cache contains_cache, contains_cache no_contains_cache) {
		setArray(array);
		setFilter(filter);
		setContains_cache(contains_cache);
		setNo_contains_cache(no_contains_cache);
	}
	public ref_filter_cbdata() {
	}
	
	public void do_merge_filter() {
		rev_info revs = new rev_info();
		int i;
		int old_nr;
		ref_filter generatedFilter = this.getFilter();
		ref_filter filter = generatedFilter;
		ref_array generatedArray = this.getArray();
		ref_array array = generatedArray;
		int generatedNr = array.getNr();
		commit to_clear = ModernizedCProgram.xcalloc(/*Error: Unsupported expression*/, generatedNr);
		ModernizedCProgram.repo_init_revisions(ModernizedCProgram.the_repository, revs, ((Object)0));
		ref_array_item[][] generatedItems = array.getItems();
		commit generatedCommit = item.getCommit();
		object generatedObject = generatedCommit.getObject();
		Object generatedRefname = item.getRefname();
		for (i = 0; i < generatedNr; i++) {
			ref_array_item item = generatedItems[i];
			ModernizedCProgram.add_pending_object(revs, generatedObject, generatedRefname);
			to_clear[i] = generatedCommit;
		}
		int generatedFlags = generatedObject.getFlags();
		generatedFlags |=  (-1024 << 1);
		ModernizedCProgram.add_pending_object(revs, generatedObject, "");
		revs.setLimited(1);
		if (revs.prepare_revision_walk()) {
			ModernizedCProgram.die(ModernizedCProgram._("revision walk setup failed"));
		} 
		old_nr = generatedNr;
		array.setNr(0);
		 generatedMerge = filter.getMerge();
		for (i = 0; i < old_nr; i++) {
			ref_array_item item = generatedItems[i];
			commit commit = generatedCommit;
			int is_merged = !!(generatedFlags & (-1024 << 1));
			if (is_merged == (generatedMerge == .REF_FILTER_MERGED_INCLUDE)) {
				generatedItems[generatedNr++] = generatedItems[i];
			} else {
					item.free_array_item();
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clear_commit_marks_many(old_nr, to_clear, (((-1024 << 11) - 1) | (-1024 << 25) | (-1024 << 26)));
		commit generatedMerge_commit = filter.getMerge_commit();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clear_commit_marks(generatedMerge_commit, (((-1024 << 11) - 1) | (-1024 << 25) | (-1024 << 26)));
		ModernizedCProgram.free(to_clear/*
		 * API for filtering a set of refs. Based on the type of refs the user
		 * has requested, we iterate through those refs and apply filters
		 * as per the given ref_filter structure and finally store the
		 * filtered refs in the ref_array structure.
		 */);
	}
	public ref_array getArray() {
		return array;
	}
	public void setArray(ref_array newArray) {
		array = newArray;
	}
	public ref_filter getFilter() {
		return filter;
	}
	public void setFilter(ref_filter newFilter) {
		filter = newFilter;
	}
	public contains_cache getContains_cache() {
		return contains_cache;
	}
	public void setContains_cache(contains_cache newContains_cache) {
		contains_cache = newContains_cache;
	}
	public contains_cache getNo_contains_cache() {
		return no_contains_cache;
	}
	public void setNo_contains_cache(contains_cache newNo_contains_cache) {
		no_contains_cache = newNo_contains_cache;
	}
}
