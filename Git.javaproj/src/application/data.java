package application;

public class data {
	private prio_queue rev_list;
	private int non_common_revs;
	
	public data(prio_queue rev_list, int non_common_revs) {
		setRev_list(rev_list);
		setNon_common_revs(non_common_revs);
	}
	public data() {
	}
	
	public prio_queue getRev_list() {
		return rev_list;
	}
	public void setRev_list(prio_queue newRev_list) {
		rev_list = newRev_list;
	}
	public int getNon_common_revs() {
		return non_common_revs;
	}
	public void setNon_common_revs(int newNon_common_revs) {
		non_common_revs = newNon_common_revs;
	}
}
