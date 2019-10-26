package application;

/* Remember to update object flag allocation in object.h */
/*
 * FILTER_SHOWN_BUT_REVISIT -- we set this bit on tree objects
 * that have been shown, but should be revisited if they appear
 * in the traversal (until we mark it SEEN).  This is a way to
 * let us silently de-dup calls to show() in the caller.  This
 * is subtly different from the "revision.h:SHOWN" and the
 * "sha1-name.c:ONELINE_SEEN" bits.  And also different from
 * the non-de-dup usage in pack-bitmap.c
 */
public class subfilter {
	private filter filter;
	private oidset seen;
	private oidset omits;
	private object_id skip_tree;
	private int is_skipping_tree;
	
	public subfilter(filter filter, oidset seen, oidset omits, object_id skip_tree, int is_skipping_tree) {
		setFilter(filter);
		setSeen(seen);
		setOmits(omits);
		setSkip_tree(skip_tree);
		setIs_skipping_tree(is_skipping_tree);
	}
	public subfilter() {
	}
	
	public filter getFilter() {
		return filter;
	}
	public void setFilter(filter newFilter) {
		filter = newFilter;
	}
	public oidset getSeen() {
		return seen;
	}
	public void setSeen(oidset newSeen) {
		seen = newSeen;
	}
	public oidset getOmits() {
		return omits;
	}
	public void setOmits(oidset newOmits) {
		omits = newOmits;
	}
	public object_id getSkip_tree() {
		return skip_tree;
	}
	public void setSkip_tree(object_id newSkip_tree) {
		skip_tree = newSkip_tree;
	}
	public int getIs_skipping_tree() {
		return is_skipping_tree;
	}
	public void setIs_skipping_tree(int newIs_skipping_tree) {
		is_skipping_tree = newIs_skipping_tree;
	}
}
