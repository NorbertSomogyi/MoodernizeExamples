package application;

/* sub-option collection */
/* looking for sub-option end */
public class TELNET {
	private int please_negotiate;
	private int already_negotiated;
	private Object us;
	private Object usq;
	private Object us_preferred;
	private Object him;
	private Object himq;
	private Object him_preferred;
	private Object subnegotiation;
	private Object subopt_ttype;
	private Object subopt_xdisploc;
	private int subopt_wsx;
	private int subopt_wsy;
	private Object telnet_vars;
	private Object subbuffer;
	private Object subpointer;
	private Object subend;
	private  telrcv_state;
	
	public TELNET(int please_negotiate, int already_negotiated, Object us, Object usq, Object us_preferred, Object him, Object himq, Object him_preferred, Object subnegotiation, Object subopt_ttype, Object subopt_xdisploc, int subopt_wsx, int subopt_wsy, Object telnet_vars, Object subbuffer, Object subpointer, Object subend,  telrcv_state) {
		setPlease_negotiate(please_negotiate);
		setAlready_negotiated(already_negotiated);
		setUs(us);
		setUsq(usq);
		setUs_preferred(us_preferred);
		setHim(him);
		setHimq(himq);
		setHim_preferred(him_preferred);
		setSubnegotiation(subnegotiation);
		setSubopt_ttype(subopt_ttype);
		setSubopt_xdisploc(subopt_xdisploc);
		setSubopt_wsx(subopt_wsx);
		setSubopt_wsy(subopt_wsy);
		setTelnet_vars(telnet_vars);
		setSubbuffer(subbuffer);
		setSubpointer(subpointer);
		setSubend(subend);
		setTelrcv_state(telrcv_state);
	}
	public TELNET() {
	}
	
	public int getPlease_negotiate() {
		return please_negotiate;
	}
	public void setPlease_negotiate(int newPlease_negotiate) {
		please_negotiate = newPlease_negotiate;
	}
	public int getAlready_negotiated() {
		return already_negotiated;
	}
	public void setAlready_negotiated(int newAlready_negotiated) {
		already_negotiated = newAlready_negotiated;
	}
	public Object getUs() {
		return us;
	}
	public void setUs(Object newUs) {
		us = newUs;
	}
	public Object getUsq() {
		return usq;
	}
	public void setUsq(Object newUsq) {
		usq = newUsq;
	}
	public Object getUs_preferred() {
		return us_preferred;
	}
	public void setUs_preferred(Object newUs_preferred) {
		us_preferred = newUs_preferred;
	}
	public Object getHim() {
		return him;
	}
	public void setHim(Object newHim) {
		him = newHim;
	}
	public Object getHimq() {
		return himq;
	}
	public void setHimq(Object newHimq) {
		himq = newHimq;
	}
	public Object getHim_preferred() {
		return him_preferred;
	}
	public void setHim_preferred(Object newHim_preferred) {
		him_preferred = newHim_preferred;
	}
	public Object getSubnegotiation() {
		return subnegotiation;
	}
	public void setSubnegotiation(Object newSubnegotiation) {
		subnegotiation = newSubnegotiation;
	}
	public Object getSubopt_ttype() {
		return subopt_ttype;
	}
	public void setSubopt_ttype(Object newSubopt_ttype) {
		subopt_ttype = newSubopt_ttype;
	}
	public Object getSubopt_xdisploc() {
		return subopt_xdisploc;
	}
	public void setSubopt_xdisploc(Object newSubopt_xdisploc) {
		subopt_xdisploc = newSubopt_xdisploc;
	}
	public int getSubopt_wsx() {
		return subopt_wsx;
	}
	public void setSubopt_wsx(int newSubopt_wsx) {
		subopt_wsx = newSubopt_wsx;
	}
	public int getSubopt_wsy() {
		return subopt_wsy;
	}
	public void setSubopt_wsy(int newSubopt_wsy) {
		subopt_wsy = newSubopt_wsy;
	}
	public Object getTelnet_vars() {
		return telnet_vars;
	}
	public void setTelnet_vars(Object newTelnet_vars) {
		telnet_vars = newTelnet_vars;
	}
	public Object getSubbuffer() {
		return subbuffer;
	}
	public void setSubbuffer(Object newSubbuffer) {
		subbuffer = newSubbuffer;
	}
	public Object getSubpointer() {
		return subpointer;
	}
	public void setSubpointer(Object newSubpointer) {
		subpointer = newSubpointer;
	}
	public Object getSubend() {
		return subend;
	}
	public void setSubend(Object newSubend) {
		subend = newSubend;
	}
	public  getTelrcv_state() {
		return telrcv_state;
	}
	public void setTelrcv_state( newTelrcv_state) {
		telrcv_state = newTelrcv_state;
	}
}
