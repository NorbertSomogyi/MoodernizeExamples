package application;

public class ptw32_foll_local_t_ {
	private ptw32_foll_node_t_ rNodePtr;
	private ptw32_foll_node_t_ wNodePtr;
	private ptw32_foll_node_t_ departFromPtr;
	private ptw32_oll_ticket_t_ ticket;
	
	public ptw32_foll_local_t_(ptw32_foll_node_t_ rNodePtr, ptw32_foll_node_t_ wNodePtr, ptw32_foll_node_t_ departFromPtr, ptw32_oll_ticket_t_ ticket) {
		setRNodePtr(rNodePtr);
		setWNodePtr(wNodePtr);
		setDepartFromPtr(departFromPtr);
		setTicket(ticket);
	}
	public ptw32_foll_local_t_() {
	}
	
	public ptw32_foll_node_t_ getRNodePtr() {
		return rNodePtr;
	}
	public void setRNodePtr(ptw32_foll_node_t_ newRNodePtr) {
		rNodePtr = newRNodePtr;
	}
	public ptw32_foll_node_t_ getWNodePtr() {
		return wNodePtr;
	}
	public void setWNodePtr(ptw32_foll_node_t_ newWNodePtr) {
		wNodePtr = newWNodePtr;
	}
	public ptw32_foll_node_t_ getDepartFromPtr() {
		return departFromPtr;
	}
	public void setDepartFromPtr(ptw32_foll_node_t_ newDepartFromPtr) {
		departFromPtr = newDepartFromPtr;
	}
	public ptw32_oll_ticket_t_ getTicket() {
		return ticket;
	}
	public void setTicket(ptw32_oll_ticket_t_ newTicket) {
		ticket = newTicket;
	}
}
