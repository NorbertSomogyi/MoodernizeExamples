package application;

/*
 * 'pingpong' is the generic struct used for protocols doing server<->client
 * conversations in a back-and-forth style such as FTP, IMAP, POP3, SMTP etc.
 *
 * It holds response cache and non-blocking sending data.
 */
public class pingpong {
	private Object cache;
	private Object cache_size;
	private Object nread_resp;
	private Object linestart_resp;
	private  pending_resp;
	private Object sendthis;
	private Object sendleft;
	private Object sendsize;
	private curltime response;
	private long response_time;
	private Object conn;
	private Object statemach_act;
	private Object endofresp;
	
	public pingpong(Object cache, Object cache_size, Object nread_resp, Object linestart_resp,  pending_resp, Object sendthis, Object sendleft, Object sendsize, curltime response, long response_time, Object conn, Object statemach_act, Object endofresp) {
		setCache(cache);
		setCache_size(cache_size);
		setNread_resp(nread_resp);
		setLinestart_resp(linestart_resp);
		setPending_resp(pending_resp);
		setSendthis(sendthis);
		setSendleft(sendleft);
		setSendsize(sendsize);
		setResponse(response);
		setResponse_time(response_time);
		setConn(conn);
		setStatemach_act(statemach_act);
		setEndofresp(endofresp);
	}
	public pingpong() {
	}
	
	public Object getCache() {
		return cache;
	}
	public void setCache(Object newCache) {
		cache = newCache;
	}
	public Object getCache_size() {
		return cache_size;
	}
	public void setCache_size(Object newCache_size) {
		cache_size = newCache_size;
	}
	public Object getNread_resp() {
		return nread_resp;
	}
	public void setNread_resp(Object newNread_resp) {
		nread_resp = newNread_resp;
	}
	public Object getLinestart_resp() {
		return linestart_resp;
	}
	public void setLinestart_resp(Object newLinestart_resp) {
		linestart_resp = newLinestart_resp;
	}
	public  getPending_resp() {
		return pending_resp;
	}
	public void setPending_resp( newPending_resp) {
		pending_resp = newPending_resp;
	}
	public Object getSendthis() {
		return sendthis;
	}
	public void setSendthis(Object newSendthis) {
		sendthis = newSendthis;
	}
	public Object getSendleft() {
		return sendleft;
	}
	public void setSendleft(Object newSendleft) {
		sendleft = newSendleft;
	}
	public Object getSendsize() {
		return sendsize;
	}
	public void setSendsize(Object newSendsize) {
		sendsize = newSendsize;
	}
	public curltime getResponse() {
		return response;
	}
	public void setResponse(curltime newResponse) {
		response = newResponse;
	}
	public long getResponse_time() {
		return response_time;
	}
	public void setResponse_time(long newResponse_time) {
		response_time = newResponse_time;
	}
	public Object getConn() {
		return conn;
	}
	public void setConn(Object newConn) {
		conn = newConn;
	}
	public Object getStatemach_act() {
		return statemach_act;
	}
	public void setStatemach_act(Object newStatemach_act) {
		statemach_act = newStatemach_act;
	}
	public Object getEndofresp() {
		return endofresp;
	}
	public void setEndofresp(Object newEndofresp) {
		endofresp = newEndofresp;
	}
}
/* return the server code if done */
/* size of the response */
