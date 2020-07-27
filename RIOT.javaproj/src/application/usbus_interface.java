package application;

/**
 * @brief USBUS interface
 */
/**< Next interface (set by USBUS during
                                             registration)                     */
public class usbus_interface {
	private usbus_interface next;
	private usbus_hdr_gen hdr_gen;
	private usbus_endpoint ep;
	private usbus_interface_alt alts;
	private usbus_handler handler;
	private usbus_string descr;
	private Object idx;
	private Object class;
	private Object subclass;
	private Object protocol;
	
	public usbus_interface(usbus_interface next, usbus_hdr_gen hdr_gen, usbus_endpoint ep, usbus_interface_alt alts, usbus_handler handler, usbus_string descr, Object idx, Object class, Object subclass, Object protocol) {
		setNext(next);
		setHdr_gen(hdr_gen);
		setEp(ep);
		setAlts(alts);
		setHandler(handler);
		setDescr(descr);
		setIdx(idx);
		setClass(class);
		setSubclass(subclass);
		setProtocol(protocol);
	}
	public usbus_interface() {
	}
	
	public usbus_interface getNext() {
		return next;
	}
	public void setNext(usbus_interface newNext) {
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
	public usbus_interface_alt getAlts() {
		return alts;
	}
	public void setAlts(usbus_interface_alt newAlts) {
		alts = newAlts;
	}
	public usbus_handler getHandler() {
		return handler;
	}
	public void setHandler(usbus_handler newHandler) {
		handler = newHandler;
	}
	public usbus_string getDescr() {
		return descr;
	}
	public void setDescr(usbus_string newDescr) {
		descr = newDescr;
	}
	public Object getIdx() {
		return idx;
	}
	public void setIdx(Object newIdx) {
		idx = newIdx;
	}
	public Object getClass() {
		return class;
	}
	public void setClass(Object newClass) {
		class = newClass;
	}
	public Object getSubclass() {
		return subclass;
	}
	public void setSubclass(Object newSubclass) {
		subclass = newSubclass;
	}
	public Object getProtocol() {
		return protocol;
	}
	public void setProtocol(Object newProtocol) {
		protocol = newProtocol;
	}
}
