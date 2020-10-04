package application;

public class usbus {
	private usbus_string manuf;
	private usbus_string product;
	private usbus_string config;
	private Object[] ep_out;
	private Object[] ep_in;
	private Object queue;
	private Object dev;
	private usbus_handler control;
	private usbus_hdr_gen hdr_gen;
	private usbus_string strings;
	private usbus_interface iface;
	private usbus_handler handlers;
	private Object ep_events;
	private Object pid;
	private Object str_idx;
	private  state;
	private  pstate;
	private Object addr;
	
	public usbus(usbus_string manuf, usbus_string product, usbus_string config, Object[] ep_out, Object[] ep_in, Object queue, Object dev, usbus_handler control, usbus_hdr_gen hdr_gen, usbus_string strings, usbus_interface iface, usbus_handler handlers, Object ep_events, Object pid, Object str_idx,  state,  pstate, Object addr) {
		setManuf(manuf);
		setProduct(product);
		setConfig(config);
		setEp_out(ep_out);
		setEp_in(ep_in);
		setQueue(queue);
		setDev(dev);
		setControl(control);
		setHdr_gen(hdr_gen);
		setStrings(strings);
		setIface(iface);
		setHandlers(handlers);
		setEp_events(ep_events);
		setPid(pid);
		setStr_idx(str_idx);
		setState(state);
		setPstate(pstate);
		setAddr(addr);
	}
	public usbus() {
	}
	
	public void usbus_event_post(Object event) {
		Object generatedQueue = this.getQueue();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/event_post(generatedQueue, event/**
		 * @brief Add a string descriptor to the USBUS thread context
		 *
		 * @param[in] usbus   USBUS context
		 * @param[in] desc    string descriptor context
		 * @param[in] str     C string to use
		 *
		 * @return            Index of the string descriptor
		 */);
	}
	public usbus_string getManuf() {
		return manuf;
	}
	public void setManuf(usbus_string newManuf) {
		manuf = newManuf;
	}
	public usbus_string getProduct() {
		return product;
	}
	public void setProduct(usbus_string newProduct) {
		product = newProduct;
	}
	public usbus_string getConfig() {
		return config;
	}
	public void setConfig(usbus_string newConfig) {
		config = newConfig;
	}
	public Object[] getEp_out() {
		return ep_out;
	}
	public void setEp_out(Object[] newEp_out) {
		ep_out = newEp_out;
	}
	public Object[] getEp_in() {
		return ep_in;
	}
	public void setEp_in(Object[] newEp_in) {
		ep_in = newEp_in;
	}
	public Object getQueue() {
		return queue;
	}
	public void setQueue(Object newQueue) {
		queue = newQueue;
	}
	public Object getDev() {
		return dev;
	}
	public void setDev(Object newDev) {
		dev = newDev;
	}
	public usbus_handler getControl() {
		return control;
	}
	public void setControl(usbus_handler newControl) {
		control = newControl;
	}
	public usbus_hdr_gen getHdr_gen() {
		return hdr_gen;
	}
	public void setHdr_gen(usbus_hdr_gen newHdr_gen) {
		hdr_gen = newHdr_gen;
	}
	public usbus_string getStrings() {
		return strings;
	}
	public void setStrings(usbus_string newStrings) {
		strings = newStrings;
	}
	public usbus_interface getIface() {
		return iface;
	}
	public void setIface(usbus_interface newIface) {
		iface = newIface;
	}
	public usbus_handler getHandlers() {
		return handlers;
	}
	public void setHandlers(usbus_handler newHandlers) {
		handlers = newHandlers;
	}
	public Object getEp_events() {
		return ep_events;
	}
	public void setEp_events(Object newEp_events) {
		ep_events = newEp_events;
	}
	public Object getPid() {
		return pid;
	}
	public void setPid(Object newPid) {
		pid = newPid;
	}
	public Object getStr_idx() {
		return str_idx;
	}
	public void setStr_idx(Object newStr_idx) {
		str_idx = newStr_idx;
	}
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
	public  getPstate() {
		return pstate;
	}
	public void setPstate( newPstate) {
		pstate = newPstate;
	}
	public Object getAddr() {
		return addr;
	}
	public void setAddr(Object newAddr) {
		addr = newAddr;
	}
}
/**
 * @brief USBUS event handler forward declaration
 */
