package application;

public class add_alternate_refs_data {
	private rev_info revs;
	private int flags;
	
	public add_alternate_refs_data(rev_info revs, int flags) {
		setRevs(revs);
		setFlags(flags);
	}
	public add_alternate_refs_data() {
	}
	
	public rev_info getRevs() {
		return revs;
	}
	public void setRevs(rev_info newRevs) {
		revs = newRevs;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
