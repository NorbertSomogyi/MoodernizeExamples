package application;

/**
 * @brief USBUS endpoint context
 */
/**< Next endpoint in the
                                         @ref usbus_interface_t list of
                                         endpoints */
public class usbus_endpoint {
	private usbus_endpoint next;
	private usbus_hdr_gen hdr_gen;
	private Object ep;
	private Object maxpacketsize;
	private Object interval;
	private Object active;
	
	public usbus_endpoint(usbus_endpoint next, usbus_hdr_gen hdr_gen, Object ep, Object maxpacketsize, Object interval, Object active) {
		setNext(next);
		setHdr_gen(hdr_gen);
		setEp(ep);
		setMaxpacketsize(maxpacketsize);
		setInterval(interval);
		setActive(active);
	}
	public usbus_endpoint() {
	}
	
	public void usbus_enable_endpoint() {
		this.setActive(true/**
		 * @brief Disable an endpoint
		 *
		 * @note must only be used before the usb peripheral is attached to the host
		 *
		 * @param[in]   ep  endpoint to disable
		 */);
	}
	public void usbus_disable_endpoint() {
		this.setActive(false/**
		 * @brief enable a specific handler flag
		 *
		 * @param[in]   handler handler to enable the flag for
		 * @param[in]   flag    flag to enable
		 */);
	}
	public usbus_endpoint getNext() {
		return next;
	}
	public void setNext(usbus_endpoint newNext) {
		next = newNext;
	}
	public usbus_hdr_gen getHdr_gen() {
		return hdr_gen;
	}
	public void setHdr_gen(usbus_hdr_gen newHdr_gen) {
		hdr_gen = newHdr_gen;
	}
	public Object getEp() {
		return ep;
	}
	public void setEp(Object newEp) {
		ep = newEp;
	}
	public Object getMaxpacketsize() {
		return maxpacketsize;
	}
	public void setMaxpacketsize(Object newMaxpacketsize) {
		maxpacketsize = newMaxpacketsize;
	}
	public Object getInterval() {
		return interval;
	}
	public void setInterval(Object newInterval) {
		interval = newInterval;
	}
	public Object getActive() {
		return active;
	}
	public void setActive(Object newActive) {
		active = newActive;
	}
}
