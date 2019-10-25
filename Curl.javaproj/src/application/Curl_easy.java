package application;

/* List of hosts which should not use the proxy, if
                             used */
/* Session ID to use */
/* Stream URI for this request */
/* Transport for this session */
/* path to the private key file for auth */
/* path to the public key file for auth */
/* md5 of host public key in ascii hex */
/* file name of knownhosts file */
/* Proxy service name */
/* Service name */
/* TLS auth <username> */
/* TLS auth <username> */
/* TLS auth <password> */
/* TLS auth <password> */
/* <bearer>, if used */
/* path to Unix socket, if used */
/* CURLOPT_REQUEST_TARGET */
/* CURLOPT_DOH_URL */
/* CURLOPT_ALTSVC */
/* CURLOPT_SASL_AUTHZID */
/* temp URL storage for proxy use */
/* -- end of zero-terminated strings -- */
/* -- below this are pointers to binary data that cannot be strdup'ed. --- */
/* if POST, set the fields' values here */
/* not used, just an end-of-list marker */
/* callback that gets called when this easy handle is completed within a multi
   handle.  Only used for internally created transfers, like for example
   DoH. */
/* this is a DoH request for that transfer */
public class Curl_easy {
	private Object next;
	private Object prev;
	private Object conn;
	private curl_llist_element connect_queue;
	private curl_llist_element conn_queue;
	private  mstate;
	private  result;
	private Curl_message msg;
	private Object sockets;
	private Object actions;
	private int numsocks;
	private Names dns;
	private Object multi;
	private Object multi_easy;
	private Object share;
	private SingleRequest req;
	private UserDefined set;
	private DynamicStatic change;
	private Object cookies;
	private Progress progress;
	private UrlState state;
	private WildcardData wildcard;
	private PureInfo info;
	private curl_tlssessioninfo tsi;
	private int magic;
	
	public Curl_easy(Object next, Object prev, Object conn, curl_llist_element connect_queue, curl_llist_element conn_queue,  mstate,  result, Curl_message msg, Object sockets, Object actions, int numsocks, Names dns, Object multi, Object multi_easy, Object share, SingleRequest req, UserDefined set, DynamicStatic change, Object cookies, Progress progress, UrlState state, WildcardData wildcard, PureInfo info, curl_tlssessioninfo tsi, int magic) {
		setNext(next);
		setPrev(prev);
		setConn(conn);
		setConnect_queue(connect_queue);
		setConn_queue(conn_queue);
		setMstate(mstate);
		setResult(result);
		setMsg(msg);
		setSockets(sockets);
		setActions(actions);
		setNumsocks(numsocks);
		setDns(dns);
		setMulti(multi);
		setMulti_easy(multi_easy);
		setShare(share);
		setReq(req);
		setSet(set);
		setChange(change);
		setCookies(cookies);
		setProgress(progress);
		setState(state);
		setWildcard(wildcard);
		setInfo(info);
		setTsi(tsi);
		setMagic(magic);
	}
	public Curl_easy() {
	}
	
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public Object getPrev() {
		return prev;
	}
	public void setPrev(Object newPrev) {
		prev = newPrev;
	}
	public Object getConn() {
		return conn;
	}
	public void setConn(Object newConn) {
		conn = newConn;
	}
	public curl_llist_element getConnect_queue() {
		return connect_queue;
	}
	public void setConnect_queue(curl_llist_element newConnect_queue) {
		connect_queue = newConnect_queue;
	}
	public curl_llist_element getConn_queue() {
		return conn_queue;
	}
	public void setConn_queue(curl_llist_element newConn_queue) {
		conn_queue = newConn_queue;
	}
	public  getMstate() {
		return mstate;
	}
	public void setMstate( newMstate) {
		mstate = newMstate;
	}
	public  getResult() {
		return result;
	}
	public void setResult( newResult) {
		result = newResult;
	}
	public Curl_message getMsg() {
		return msg;
	}
	public void setMsg(Curl_message newMsg) {
		msg = newMsg;
	}
	public Object getSockets() {
		return sockets;
	}
	public void setSockets(Object newSockets) {
		sockets = newSockets;
	}
	public Object getActions() {
		return actions;
	}
	public void setActions(Object newActions) {
		actions = newActions;
	}
	public int getNumsocks() {
		return numsocks;
	}
	public void setNumsocks(int newNumsocks) {
		numsocks = newNumsocks;
	}
	public Names getDns() {
		return dns;
	}
	public void setDns(Names newDns) {
		dns = newDns;
	}
	public Object getMulti() {
		return multi;
	}
	public void setMulti(Object newMulti) {
		multi = newMulti;
	}
	public Object getMulti_easy() {
		return multi_easy;
	}
	public void setMulti_easy(Object newMulti_easy) {
		multi_easy = newMulti_easy;
	}
	public Object getShare() {
		return share;
	}
	public void setShare(Object newShare) {
		share = newShare;
	}
	public SingleRequest getReq() {
		return req;
	}
	public void setReq(SingleRequest newReq) {
		req = newReq;
	}
	public UserDefined getSet() {
		return set;
	}
	public void setSet(UserDefined newSet) {
		set = newSet;
	}
	public DynamicStatic getChange() {
		return change;
	}
	public void setChange(DynamicStatic newChange) {
		change = newChange;
	}
	public Object getCookies() {
		return cookies;
	}
	public void setCookies(Object newCookies) {
		cookies = newCookies;
	}
	public Progress getProgress() {
		return progress;
	}
	public void setProgress(Progress newProgress) {
		progress = newProgress;
	}
	public UrlState getState() {
		return state;
	}
	public void setState(UrlState newState) {
		state = newState;
	}
	public WildcardData getWildcard() {
		return wildcard;
	}
	public void setWildcard(WildcardData newWildcard) {
		wildcard = newWildcard;
	}
	public PureInfo getInfo() {
		return info;
	}
	public void setInfo(PureInfo newInfo) {
		info = newInfo;
	}
	public curl_tlssessioninfo getTsi() {
		return tsi;
	}
	public void setTsi(curl_tlssessioninfo newTsi) {
		tsi = newTsi;
	}
	public int getMagic() {
		return magic;
	}
	public void setMagic(int newMagic) {
		magic = newMagic;
	}
}
/*
 * This struct is for holding data that was attempted to get sent to the user's
 * callback but is held due to pausing. One instance per type (BOTH, HEADER,
 * BODY).
 */
/* first, two fields for the linked list of these */
