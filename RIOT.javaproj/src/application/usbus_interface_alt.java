package application;

/**< Next alternative setting */
/**< List of alt settings              */
public class usbus_interface_alt {
	private usbus_interface_alt next;
	private usbus_hdr_gen hdr_gen;
	private usbus_endpoint ep;
	
	public usbus_interface_alt(usbus_interface_alt next, usbus_hdr_gen hdr_gen, usbus_endpoint ep) {
		setNext(next);
		setHdr_gen(hdr_gen);
		setEp(ep);
	}
	public usbus_interface_alt() {
	}
	
	public usbus_interface_alt getNext() {
		return next;
	}
	public void setNext(usbus_interface_alt newNext) {
		next = newNext;
	}
	public usbus_hdr_gen getHdr_gen() {
		return hdr_gen;
	}
	public void setHdr_gen(usbus_hdr_gen newHdr_gen) {
		hdr_gen = newHdr_gen;
	}
	public usbus_endpoint getEp() {
		return ep;
	}
	public void setEp(usbus_endpoint newEp) {
		ep = newEp;
	}
}
