package application;

public class process_commit_data {
	private object_id current_commit;
	private object_id looking_for;
	private strbuf dst;
	private rev_info revs;
	
	public process_commit_data(object_id current_commit, object_id looking_for, strbuf dst, rev_info revs) {
		setCurrent_commit(current_commit);
		setLooking_for(looking_for);
		setDst(dst);
		setRevs(revs);
	}
	public process_commit_data() {
	}
	
	public object_id getCurrent_commit() {
		return current_commit;
	}
	public void setCurrent_commit(object_id newCurrent_commit) {
		current_commit = newCurrent_commit;
	}
	public object_id getLooking_for() {
		return looking_for;
	}
	public void setLooking_for(object_id newLooking_for) {
		looking_for = newLooking_for;
	}
	public strbuf getDst() {
		return dst;
	}
	public void setDst(strbuf newDst) {
		dst = newDst;
	}
	public rev_info getRevs() {
		return revs;
	}
	public void setRevs(rev_info newRevs) {
		revs = newRevs;
	}
}
