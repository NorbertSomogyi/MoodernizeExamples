package application;

/* 10 - send off the request (part 2) */
/* 11 - done sending off request */
/* 12 - transfer data */
/* 13 - wait because limit-rate exceeded */
/* 14 - post data transfer operation */
/* 15 - operation complete */
/* 16 - the operation complete message is sent */
/* 17 - not a true state, never use this */
/* we support N sockets per easy handle. Set the corresponding bit to what
   action we should wait for */
/* This is the struct known as CURLM on the outside */
public class Curl_multi {
	private long type;
	private Object easyp;
	private Object easylp;
	private int num_easy;
	private int num_alive;
	private curl_llist msglist;
	private curl_llist pending;
	private Object socket_cb;
	private Object socket_userp;
	private Object push_cb;
	private Object push_userp;
	private curl_hash hostcache;
	private Object timetree;
	private curl_hash sockhash;
	private Object multiplexing;
	private Object recheckstate;
	private conncache conn_cache;
	private long maxconnects;
	private long max_host_connections;
	private long max_total_connections;
	private Object timer_cb;
	private Object timer_userp;
	private curltime timer_lastcall;
	private Object in_callback;
	private long max_concurrent_streams;
	
	public Curl_multi(long type, Object easyp, Object easylp, int num_easy, int num_alive, curl_llist msglist, curl_llist pending, Object socket_cb, Object socket_userp, Object push_cb, Object push_userp, curl_hash hostcache, Object timetree, curl_hash sockhash, Object multiplexing, Object recheckstate, conncache conn_cache, long maxconnects, long max_host_connections, long max_total_connections, Object timer_cb, Object timer_userp, curltime timer_lastcall, Object in_callback, long max_concurrent_streams) {
		setType(type);
		setEasyp(easyp);
		setEasylp(easylp);
		setNum_easy(num_easy);
		setNum_alive(num_alive);
		setMsglist(msglist);
		setPending(pending);
		setSocket_cb(socket_cb);
		setSocket_userp(socket_userp);
		setPush_cb(push_cb);
		setPush_userp(push_userp);
		setHostcache(hostcache);
		setTimetree(timetree);
		setSockhash(sockhash);
		setMultiplexing(multiplexing);
		setRecheckstate(recheckstate);
		setConn_cache(conn_cache);
		setMaxconnects(maxconnects);
		setMax_host_connections(max_host_connections);
		setMax_total_connections(max_total_connections);
		setTimer_cb(timer_cb);
		setTimer_userp(timer_userp);
		setTimer_lastcall(timer_lastcall);
		setIn_callback(in_callback);
		setMax_concurrent_streams(max_concurrent_streams);
	}
	public Curl_multi() {
	}
	
	public long getType() {
		return type;
	}
	public void setType(long newType) {
		type = newType;
	}
	public Object getEasyp() {
		return easyp;
	}
	public void setEasyp(Object newEasyp) {
		easyp = newEasyp;
	}
	public Object getEasylp() {
		return easylp;
	}
	public void setEasylp(Object newEasylp) {
		easylp = newEasylp;
	}
	public int getNum_easy() {
		return num_easy;
	}
	public void setNum_easy(int newNum_easy) {
		num_easy = newNum_easy;
	}
	public int getNum_alive() {
		return num_alive;
	}
	public void setNum_alive(int newNum_alive) {
		num_alive = newNum_alive;
	}
	public curl_llist getMsglist() {
		return msglist;
	}
	public void setMsglist(curl_llist newMsglist) {
		msglist = newMsglist;
	}
	public curl_llist getPending() {
		return pending;
	}
	public void setPending(curl_llist newPending) {
		pending = newPending;
	}
	public Object getSocket_cb() {
		return socket_cb;
	}
	public void setSocket_cb(Object newSocket_cb) {
		socket_cb = newSocket_cb;
	}
	public Object getSocket_userp() {
		return socket_userp;
	}
	public void setSocket_userp(Object newSocket_userp) {
		socket_userp = newSocket_userp;
	}
	public Object getPush_cb() {
		return push_cb;
	}
	public void setPush_cb(Object newPush_cb) {
		push_cb = newPush_cb;
	}
	public Object getPush_userp() {
		return push_userp;
	}
	public void setPush_userp(Object newPush_userp) {
		push_userp = newPush_userp;
	}
	public curl_hash getHostcache() {
		return hostcache;
	}
	public void setHostcache(curl_hash newHostcache) {
		hostcache = newHostcache;
	}
	public Object getTimetree() {
		return timetree;
	}
	public void setTimetree(Object newTimetree) {
		timetree = newTimetree;
	}
	public curl_hash getSockhash() {
		return sockhash;
	}
	public void setSockhash(curl_hash newSockhash) {
		sockhash = newSockhash;
	}
	public Object getMultiplexing() {
		return multiplexing;
	}
	public void setMultiplexing(Object newMultiplexing) {
		multiplexing = newMultiplexing;
	}
	public Object getRecheckstate() {
		return recheckstate;
	}
	public void setRecheckstate(Object newRecheckstate) {
		recheckstate = newRecheckstate;
	}
	public conncache getConn_cache() {
		return conn_cache;
	}
	public void setConn_cache(conncache newConn_cache) {
		conn_cache = newConn_cache;
	}
	public long getMaxconnects() {
		return maxconnects;
	}
	public void setMaxconnects(long newMaxconnects) {
		maxconnects = newMaxconnects;
	}
	public long getMax_host_connections() {
		return max_host_connections;
	}
	public void setMax_host_connections(long newMax_host_connections) {
		max_host_connections = newMax_host_connections;
	}
	public long getMax_total_connections() {
		return max_total_connections;
	}
	public void setMax_total_connections(long newMax_total_connections) {
		max_total_connections = newMax_total_connections;
	}
	public Object getTimer_cb() {
		return timer_cb;
	}
	public void setTimer_cb(Object newTimer_cb) {
		timer_cb = newTimer_cb;
	}
	public Object getTimer_userp() {
		return timer_userp;
	}
	public void setTimer_userp(Object newTimer_userp) {
		timer_userp = newTimer_userp;
	}
	public curltime getTimer_lastcall() {
		return timer_lastcall;
	}
	public void setTimer_lastcall(curltime newTimer_lastcall) {
		timer_lastcall = newTimer_lastcall;
	}
	public Object getIn_callback() {
		return in_callback;
	}
	public void setIn_callback(Object newIn_callback) {
		in_callback = newIn_callback;
	}
	public long getMax_concurrent_streams() {
		return max_concurrent_streams;
	}
	public void setMax_concurrent_streams(long newMax_concurrent_streams) {
		max_concurrent_streams = newMax_concurrent_streams;
	}
}
/* First a simple identifier to easier detect if a user mix up
     this multi handle with an easy handle. Set this to CURL_MULTI_HANDLE. */
