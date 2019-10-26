package application;

public class rev_list_info {
	private rev_info revs;
	private int flags;
	private int show_timestamp;
	private int hdr_termination;
	private Object header_prefix;
	
	public rev_list_info(rev_info revs, int flags, int show_timestamp, int hdr_termination, Object header_prefix) {
		setRevs(revs);
		setFlags(flags);
		setShow_timestamp(show_timestamp);
		setHdr_termination(hdr_termination);
		setHeader_prefix(header_prefix);
	}
	public rev_list_info() {
	}
	
	public int show_bisect_vars(int reaches, int all) {
		int generatedFlags = this.getFlags();
		int cnt;
		int flags = generatedFlags;
		byte[] hex = "";
		commit_list tried = new commit_list();
		rev_info generatedRevs = this.getRevs();
		rev_info revs = generatedRevs;
		commit_list generatedCommits = revs.getCommits();
		if (!generatedCommits) {
			return 1;
		} 
		revs.setCommits(generatedCommits.filter_skipped(tried, flags & (1 << 0), ((Object)0), ((Object)0/*
			 * revs->commits can reach "reaches" commits among
			 * "all" commits.  If it is good, then there are
			 * (all-reaches) commits left to be bisected.
			 * On the other hand, if it is bad, then the set
			 * to bisect is "reaches".
			 * A bisect set of size N has (N-1) commits further
			 * to test, as we already know one bad one.
			 */)));
		cnt = all - reaches;
		if (cnt < reaches) {
			cnt = reaches;
		} 
		commit generatedItem = generatedCommits.getItem();
		object generatedObject = generatedItem.getObject();
		object_id generatedOid = generatedObject.getOid();
		if (generatedCommits) {
			ModernizedCProgram.oid_to_hex_r(hex, generatedOid);
		} 
		if (flags & (1 << 0)) {
			revs.traverse_commit_list(show_commit, show_object, info);
			.printf("------\n");
		} 
		ModernizedCProgram.print_var_str("bisect_rev", hex);
		ModernizedCProgram.print_var_int("bisect_nr", cnt - 1);
		ModernizedCProgram.print_var_int("bisect_good", all - reaches - 1);
		ModernizedCProgram.print_var_int("bisect_bad", reaches - 1);
		ModernizedCProgram.print_var_int("bisect_all", all);
		ModernizedCProgram.print_var_int("bisect_steps", ModernizedCProgram.estimate_bisect_steps(all));
		return 0;
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
	public int getShow_timestamp() {
		return show_timestamp;
	}
	public void setShow_timestamp(int newShow_timestamp) {
		show_timestamp = newShow_timestamp;
	}
	public int getHdr_termination() {
		return hdr_termination;
	}
	public void setHdr_termination(int newHdr_termination) {
		hdr_termination = newHdr_termination;
	}
	public Object getHeader_prefix() {
		return header_prefix;
	}
	public void setHeader_prefix(Object newHeader_prefix) {
		header_prefix = newHeader_prefix;
	}
}
