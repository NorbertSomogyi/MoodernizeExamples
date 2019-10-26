package application;

/* pointer to next pat_ptr */
public class pat_ptr {
	private syn_pattern pp_synp;
	private int pp_matchgroup_id;
	private pat_ptr pp_next;
	
	public pat_ptr(syn_pattern pp_synp, int pp_matchgroup_id, pat_ptr pp_next) {
		setPp_synp(pp_synp);
		setPp_matchgroup_id(pp_matchgroup_id);
		setPp_next(pp_next);
	}
	public pat_ptr() {
	}
	
	public syn_pattern getPp_synp() {
		return pp_synp;
	}
	public void setPp_synp(syn_pattern newPp_synp) {
		pp_synp = newPp_synp;
	}
	public int getPp_matchgroup_id() {
		return pp_matchgroup_id;
	}
	public void setPp_matchgroup_id(int newPp_matchgroup_id) {
		pp_matchgroup_id = newPp_matchgroup_id;
	}
	public pat_ptr getPp_next() {
		return pp_next;
	}
	public void setPp_next(pat_ptr newPp_next) {
		pp_next = newPp_next;
	}
}
