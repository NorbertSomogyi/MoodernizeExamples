package application;

public class ptw32_oll_ticket_t_ {
	private ptw32_oll_snziNodeOrRoot_t_ snziNodeOrRoot;
	
	public ptw32_oll_ticket_t_(ptw32_oll_snziNodeOrRoot_t_ snziNodeOrRoot) {
		setSnziNodeOrRoot(snziNodeOrRoot);
	}
	public ptw32_oll_ticket_t_() {
	}
	
	public ptw32_oll_ticket_t_ ptw32_oll_Arrive(ptw32_oll_csnzi_t_ csnzi) {
		ptw32_oll_snziRoot_t_ generatedProxyRoot = csnzi.getProxyRoot();
		ptw32_oll_counter_t_ generatedCounter = oldProxy.getCounter();
		Object generatedInternal = generatedCounter.getInternal();
		ptw32_oll_snziNodeOrRoot_t_ generatedSnziNodeOrRoot = ticket.getSnziNodeOrRoot();
		Object generatedWord = generatedCounter.getWord();
		Object generatedLeafs = csnzi.getLeafs();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			ptw32_oll_ticket_t ticket = new ptw32_oll_ticket_t();
			ptw32_oll_snziRoot_t oldProxy = generatedProxyRoot;
			if (generatedInternal.getState() != .ptw32_oll_snziRoot_open) {
				generatedSnziNodeOrRoot.setRootPtr((ptw32_oll_snziRoot_t)((Object)0));
				return ticket;
			} 
			if (!ModernizedCProgram.ptw32_oll_ShouldArriveAtTree()) {
				ptw32_oll_snziRoot_t newProxy = oldProxy;
				generatedInternal.getCount()++;
				if (/*Error: Unsupported expression*/ == (size_t)generatedWord) {
					generatedSnziNodeOrRoot.setRootPtr(generatedProxyRoot);
					return ticket;
				} 
			} else {
					ptw32_oll_snziNode_t leafPtr = generatedLeafs[ModernizedCProgram.ptw32_oll_GetLeafForThread()];
					generatedSnziNodeOrRoot.setNodePtr((leafPtr.ptw32_oll_TreeArrive() ? leafPtr : (ptw32_oll_snziNode_t)((Object)0)));
					return ticket/*
					 * Decrements the C-SNZI surplus. Returns false iff the
					 * resulting state is CLOSED and the surplus is zero.
					 * Ticket must have been returned by an arrival. Must have
					 * received this ticket from Arrive more times than Depart
					 * has been called with the ticket. (Thus, the surplus
					 * must be greater than zero.)
					 */;
			} 
		}
	}
	public Object ptw32_oll_Depart() {
		ptw32_oll_snziNodeOrRoot_t_ generatedSnziNodeOrRoot = this.getSnziNodeOrRoot();
		return generatedSnziNodeOrRoot.ptw32_oll_TreeDepart();
	}
	public Object ptw32_oll_Arrived() {
		ptw32_oll_snziNodeOrRoot_t_ generatedSnziNodeOrRoot = this.getSnziNodeOrRoot();
		Object generatedNodePtr = generatedSnziNodeOrRoot.getNodePtr();
		return (generatedNodePtr != ((Object)0/*
		 * Constructs and returns a ticket that can be used to
		 * depart from the root node.
		 */));
	}
	public ptw32_oll_ticket_t_ ptw32_oll_DirectTicket(ptw32_oll_csnzi_t_ csnziPtr) {
		ptw32_oll_ticket_t ticket = new ptw32_oll_ticket_t();
		ptw32_oll_snziRoot_t_ generatedProxyRoot = csnziPtr.getProxyRoot();
		ptw32_oll_snziNodeOrRoot_t_ generatedSnziNodeOrRoot = ticket.getSnziNodeOrRoot();
		generatedSnziNodeOrRoot.setRootPtr(generatedProxyRoot);
		return ticket;
	}
	public ptw32_oll_snziNodeOrRoot_t_ getSnziNodeOrRoot() {
		return snziNodeOrRoot;
	}
	public void setSnziNodeOrRoot(ptw32_oll_snziNodeOrRoot_t_ newSnziNodeOrRoot) {
		snziNodeOrRoot = newSnziNodeOrRoot;
	}
}
