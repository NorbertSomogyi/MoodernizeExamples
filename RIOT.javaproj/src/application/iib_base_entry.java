package application;

/**< Pointer to next list entry */
public class iib_base_entry {
	private Object if_pid;
	private iib_link_set_entry link_set_head;
	private iib_two_hop_set_entry two_hop_set_head;
	private iib_base_entry next;
	
	public iib_base_entry(Object if_pid, iib_link_set_entry link_set_head, iib_two_hop_set_entry two_hop_set_head, iib_base_entry next) {
		setIf_pid(if_pid);
		setLink_set_head(link_set_head);
		setTwo_hop_set_head(two_hop_set_head);
		setNext(next);
	}
	public iib_base_entry() {
	}
	
	public Object getIf_pid() {
		return if_pid;
	}
	public void setIf_pid(Object newIf_pid) {
		if_pid = newIf_pid;
	}
	public iib_link_set_entry getLink_set_head() {
		return link_set_head;
	}
	public void setLink_set_head(iib_link_set_entry newLink_set_head) {
		link_set_head = newLink_set_head;
	}
	public iib_two_hop_set_entry getTwo_hop_set_head() {
		return two_hop_set_head;
	}
	public void setTwo_hop_set_head(iib_two_hop_set_entry newTwo_hop_set_head) {
		two_hop_set_head = newTwo_hop_set_head;
	}
	public iib_base_entry getNext() {
		return next;
	}
	public void setNext(iib_base_entry newNext) {
		next = newNext;
	}
}
/**
 * @brief                   Register a new interface in the IIB
 *
 * This function creates a new empty Link Set and a new empty 2-Hop Set for the
 * given interface.
 *
 * @param[in] pid           PID of the interface
 *
 * @return                  0 on success
 * @return                  -1 on error
 */
