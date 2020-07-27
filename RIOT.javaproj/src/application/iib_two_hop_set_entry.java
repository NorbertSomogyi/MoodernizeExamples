package application;

/**< Pointer to next list entry */
public class iib_two_hop_set_entry {
	private iib_link_set_entry ls_elt;
	private nhdp_addr th_nb_addr;
	private  exp_time;
	private Object metric_in;
	private Object metric_out;
	private iib_two_hop_set_entry next;
	
	public iib_two_hop_set_entry(iib_link_set_entry ls_elt, nhdp_addr th_nb_addr,  exp_time, Object metric_in, Object metric_out, iib_two_hop_set_entry next) {
		setLs_elt(ls_elt);
		setTh_nb_addr(th_nb_addr);
		setExp_time(exp_time);
		setMetric_in(metric_in);
		setMetric_out(metric_out);
		setNext(next);
	}
	public iib_two_hop_set_entry() {
	}
	
	public iib_link_set_entry getLs_elt() {
		return ls_elt;
	}
	public void setLs_elt(iib_link_set_entry newLs_elt) {
		ls_elt = newLs_elt;
	}
	public nhdp_addr getTh_nb_addr() {
		return th_nb_addr;
	}
	public void setTh_nb_addr(nhdp_addr newTh_nb_addr) {
		th_nb_addr = newTh_nb_addr;
	}
	public  getExp_time() {
		return exp_time;
	}
	public void setExp_time( newExp_time) {
		exp_time = newExp_time;
	}
	public Object getMetric_in() {
		return metric_in;
	}
	public void setMetric_in(Object newMetric_in) {
		metric_in = newMetric_in;
	}
	public Object getMetric_out() {
		return metric_out;
	}
	public void setMetric_out(Object newMetric_out) {
		metric_out = newMetric_out;
	}
	public iib_two_hop_set_entry getNext() {
		return next;
	}
	public void setNext(iib_two_hop_set_entry newNext) {
		next = newNext;
	}
}
/**
 * @brief   Link set for a registered interface
 */
