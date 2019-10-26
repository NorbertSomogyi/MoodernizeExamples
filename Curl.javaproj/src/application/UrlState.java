package application;

/* struct for fields used for state info and
                                  other dynamic purposes */
public class UrlState {
	private conncache conn_cache;
	private curltime keeps_speed;
	private connectdata lastconnect;
	private Byte headerbuff;
	private Object headersize;
	private Byte buffer;
	private Byte ulbuf;
	private Object current_speed;
	private Byte first_host;
	private int first_remote_port;
	private curl_ssl_session session;
	private long sessionage;
	private int tempcount;
	private Object tempwrite;
	private Byte scratch;
	private int os_errno;
	private digestdata digest;
	private digestdata proxydigest;
	private auth authhost;
	private auth authproxy;
	private Object resolver;
	private curltime expiretime;
	private Curl_tree timenode;
	private curl_llist timeoutlist;
	private Object expires;
	private Byte most_recent_ftp_entrypath;
	private int httpversion;
	private Byte range;
	private Object resume_from;
	private long rtsp_next_client_CSeq;
	private long rtsp_next_server_CSeq;
	private long rtsp_CSeq_recv;
	private Object infilesize;
	private Object drain;
	private Object fread_func;
	private Object in;
	private Curl_easy stream_depends_on;
	private int stream_weight;
	private Object uh;
	private urlpieces up;
	private Object trailers_bytes_sent;
	private Curl_send_buffer trailers_buf;
	private  trailers_state;
	private Object multi_owned_by_easy;
	private Object this_is_a_follow;
	private Object refused_stream;
	private Object errorbuf;
	private Object allow_port;
	private Object authproblem;
	private Object ftp_trying_alternative;
	private Object wildcardmatch;
	private Object expect100header;
	private Object use_range;
	private Object rangestringalloc;
	private Object done;
	private Object stream_depends_e;
	private Object previouslypending;
	private Object cookie_engine;
	
	public UrlState(conncache conn_cache, curltime keeps_speed, connectdata lastconnect, Byte headerbuff, Object headersize, Byte buffer, Byte ulbuf, Object current_speed, Byte first_host, int first_remote_port, curl_ssl_session session, long sessionage, int tempcount, Object tempwrite, Byte scratch, int os_errno, digestdata digest, digestdata proxydigest, auth authhost, auth authproxy, Object resolver, curltime expiretime, Curl_tree timenode, curl_llist timeoutlist, Object expires, Byte most_recent_ftp_entrypath, int httpversion, Byte range, Object resume_from, long rtsp_next_client_CSeq, long rtsp_next_server_CSeq, long rtsp_CSeq_recv, Object infilesize, Object drain, Object fread_func, Object in, Curl_easy stream_depends_on, int stream_weight, Object uh, urlpieces up, Object trailers_bytes_sent, Curl_send_buffer trailers_buf,  trailers_state, Object multi_owned_by_easy, Object this_is_a_follow, Object refused_stream, Object errorbuf, Object allow_port, Object authproblem, Object ftp_trying_alternative, Object wildcardmatch, Object expect100header, Object use_range, Object rangestringalloc, Object done, Object stream_depends_e, Object previouslypending, Object cookie_engine) {
		setConn_cache(conn_cache);
		setKeeps_speed(keeps_speed);
		setLastconnect(lastconnect);
		setHeaderbuff(headerbuff);
		setHeadersize(headersize);
		setBuffer(buffer);
		setUlbuf(ulbuf);
		setCurrent_speed(current_speed);
		setFirst_host(first_host);
		setFirst_remote_port(first_remote_port);
		setSession(session);
		setSessionage(sessionage);
		setTempcount(tempcount);
		setTempwrite(tempwrite);
		setScratch(scratch);
		setOs_errno(os_errno);
		setDigest(digest);
		setProxydigest(proxydigest);
		setAuthhost(authhost);
		setAuthproxy(authproxy);
		setResolver(resolver);
		setExpiretime(expiretime);
		setTimenode(timenode);
		setTimeoutlist(timeoutlist);
		setExpires(expires);
		setMost_recent_ftp_entrypath(most_recent_ftp_entrypath);
		setHttpversion(httpversion);
		setRange(range);
		setResume_from(resume_from);
		setRtsp_next_client_CSeq(rtsp_next_client_CSeq);
		setRtsp_next_server_CSeq(rtsp_next_server_CSeq);
		setRtsp_CSeq_recv(rtsp_CSeq_recv);
		setInfilesize(infilesize);
		setDrain(drain);
		setFread_func(fread_func);
		setIn(in);
		setStream_depends_on(stream_depends_on);
		setStream_weight(stream_weight);
		setUh(uh);
		setUp(up);
		setTrailers_bytes_sent(trailers_bytes_sent);
		setTrailers_buf(trailers_buf);
		setTrailers_state(trailers_state);
		setMulti_owned_by_easy(multi_owned_by_easy);
		setThis_is_a_follow(this_is_a_follow);
		setRefused_stream(refused_stream);
		setErrorbuf(errorbuf);
		setAllow_port(allow_port);
		setAuthproblem(authproblem);
		setFtp_trying_alternative(ftp_trying_alternative);
		setWildcardmatch(wildcardmatch);
		setExpect100header(expect100header);
		setUse_range(use_range);
		setRangestringalloc(rangestringalloc);
		setDone(done);
		setStream_depends_e(stream_depends_e);
		setPreviouslypending(previouslypending);
		setCookie_engine(cookie_engine);
	}
	public UrlState() {
	}
	
	public conncache getConn_cache() {
		return conn_cache;
	}
	public void setConn_cache(conncache newConn_cache) {
		conn_cache = newConn_cache;
	}
	public curltime getKeeps_speed() {
		return keeps_speed;
	}
	public void setKeeps_speed(curltime newKeeps_speed) {
		keeps_speed = newKeeps_speed;
	}
	public connectdata getLastconnect() {
		return lastconnect;
	}
	public void setLastconnect(connectdata newLastconnect) {
		lastconnect = newLastconnect;
	}
	public Byte getHeaderbuff() {
		return headerbuff;
	}
	public void setHeaderbuff(Byte newHeaderbuff) {
		headerbuff = newHeaderbuff;
	}
	public Object getHeadersize() {
		return headersize;
	}
	public void setHeadersize(Object newHeadersize) {
		headersize = newHeadersize;
	}
	public Byte getBuffer() {
		return buffer;
	}
	public void setBuffer(Byte newBuffer) {
		buffer = newBuffer;
	}
	public Byte getUlbuf() {
		return ulbuf;
	}
	public void setUlbuf(Byte newUlbuf) {
		ulbuf = newUlbuf;
	}
	public Object getCurrent_speed() {
		return current_speed;
	}
	public void setCurrent_speed(Object newCurrent_speed) {
		current_speed = newCurrent_speed;
	}
	public Byte getFirst_host() {
		return first_host;
	}
	public void setFirst_host(Byte newFirst_host) {
		first_host = newFirst_host;
	}
	public int getFirst_remote_port() {
		return first_remote_port;
	}
	public void setFirst_remote_port(int newFirst_remote_port) {
		first_remote_port = newFirst_remote_port;
	}
	public curl_ssl_session getSession() {
		return session;
	}
	public void setSession(curl_ssl_session newSession) {
		session = newSession;
	}
	public long getSessionage() {
		return sessionage;
	}
	public void setSessionage(long newSessionage) {
		sessionage = newSessionage;
	}
	public int getTempcount() {
		return tempcount;
	}
	public void setTempcount(int newTempcount) {
		tempcount = newTempcount;
	}
	public Object getTempwrite() {
		return tempwrite;
	}
	public void setTempwrite(Object newTempwrite) {
		tempwrite = newTempwrite;
	}
	public Byte getScratch() {
		return scratch;
	}
	public void setScratch(Byte newScratch) {
		scratch = newScratch;
	}
	public int getOs_errno() {
		return os_errno;
	}
	public void setOs_errno(int newOs_errno) {
		os_errno = newOs_errno;
	}
	public digestdata getDigest() {
		return digest;
	}
	public void setDigest(digestdata newDigest) {
		digest = newDigest;
	}
	public digestdata getProxydigest() {
		return proxydigest;
	}
	public void setProxydigest(digestdata newProxydigest) {
		proxydigest = newProxydigest;
	}
	public auth getAuthhost() {
		return authhost;
	}
	public void setAuthhost(auth newAuthhost) {
		authhost = newAuthhost;
	}
	public auth getAuthproxy() {
		return authproxy;
	}
	public void setAuthproxy(auth newAuthproxy) {
		authproxy = newAuthproxy;
	}
	public Object getResolver() {
		return resolver;
	}
	public void setResolver(Object newResolver) {
		resolver = newResolver;
	}
	public curltime getExpiretime() {
		return expiretime;
	}
	public void setExpiretime(curltime newExpiretime) {
		expiretime = newExpiretime;
	}
	public Curl_tree getTimenode() {
		return timenode;
	}
	public void setTimenode(Curl_tree newTimenode) {
		timenode = newTimenode;
	}
	public curl_llist getTimeoutlist() {
		return timeoutlist;
	}
	public void setTimeoutlist(curl_llist newTimeoutlist) {
		timeoutlist = newTimeoutlist;
	}
	public Object getExpires() {
		return expires;
	}
	public void setExpires(Object newExpires) {
		expires = newExpires;
	}
	public Byte getMost_recent_ftp_entrypath() {
		return most_recent_ftp_entrypath;
	}
	public void setMost_recent_ftp_entrypath(Byte newMost_recent_ftp_entrypath) {
		most_recent_ftp_entrypath = newMost_recent_ftp_entrypath;
	}
	public int getHttpversion() {
		return httpversion;
	}
	public void setHttpversion(int newHttpversion) {
		httpversion = newHttpversion;
	}
	public Byte getRange() {
		return range;
	}
	public void setRange(Byte newRange) {
		range = newRange;
	}
	public Object getResume_from() {
		return resume_from;
	}
	public void setResume_from(Object newResume_from) {
		resume_from = newResume_from;
	}
	public long getRtsp_next_client_CSeq() {
		return rtsp_next_client_CSeq;
	}
	public void setRtsp_next_client_CSeq(long newRtsp_next_client_CSeq) {
		rtsp_next_client_CSeq = newRtsp_next_client_CSeq;
	}
	public long getRtsp_next_server_CSeq() {
		return rtsp_next_server_CSeq;
	}
	public void setRtsp_next_server_CSeq(long newRtsp_next_server_CSeq) {
		rtsp_next_server_CSeq = newRtsp_next_server_CSeq;
	}
	public long getRtsp_CSeq_recv() {
		return rtsp_CSeq_recv;
	}
	public void setRtsp_CSeq_recv(long newRtsp_CSeq_recv) {
		rtsp_CSeq_recv = newRtsp_CSeq_recv;
	}
	public Object getInfilesize() {
		return infilesize;
	}
	public void setInfilesize(Object newInfilesize) {
		infilesize = newInfilesize;
	}
	public Object getDrain() {
		return drain;
	}
	public void setDrain(Object newDrain) {
		drain = newDrain;
	}
	public Object getFread_func() {
		return fread_func;
	}
	public void setFread_func(Object newFread_func) {
		fread_func = newFread_func;
	}
	public Object getIn() {
		return in;
	}
	public void setIn(Object newIn) {
		in = newIn;
	}
	public Curl_easy getStream_depends_on() {
		return stream_depends_on;
	}
	public void setStream_depends_on(Curl_easy newStream_depends_on) {
		stream_depends_on = newStream_depends_on;
	}
	public int getStream_weight() {
		return stream_weight;
	}
	public void setStream_weight(int newStream_weight) {
		stream_weight = newStream_weight;
	}
	public Object getUh() {
		return uh;
	}
	public void setUh(Object newUh) {
		uh = newUh;
	}
	public urlpieces getUp() {
		return up;
	}
	public void setUp(urlpieces newUp) {
		up = newUp;
	}
	public Object getTrailers_bytes_sent() {
		return trailers_bytes_sent;
	}
	public void setTrailers_bytes_sent(Object newTrailers_bytes_sent) {
		trailers_bytes_sent = newTrailers_bytes_sent;
	}
	public Curl_send_buffer getTrailers_buf() {
		return trailers_buf;
	}
	public void setTrailers_buf(Curl_send_buffer newTrailers_buf) {
		trailers_buf = newTrailers_buf;
	}
	public  getTrailers_state() {
		return trailers_state;
	}
	public void setTrailers_state( newTrailers_state) {
		trailers_state = newTrailers_state;
	}
	public Object getMulti_owned_by_easy() {
		return multi_owned_by_easy;
	}
	public void setMulti_owned_by_easy(Object newMulti_owned_by_easy) {
		multi_owned_by_easy = newMulti_owned_by_easy;
	}
	public Object getThis_is_a_follow() {
		return this_is_a_follow;
	}
	public void setThis_is_a_follow(Object newThis_is_a_follow) {
		this_is_a_follow = newThis_is_a_follow;
	}
	public Object getRefused_stream() {
		return refused_stream;
	}
	public void setRefused_stream(Object newRefused_stream) {
		refused_stream = newRefused_stream;
	}
	public Object getErrorbuf() {
		return errorbuf;
	}
	public void setErrorbuf(Object newErrorbuf) {
		errorbuf = newErrorbuf;
	}
	public Object getAllow_port() {
		return allow_port;
	}
	public void setAllow_port(Object newAllow_port) {
		allow_port = newAllow_port;
	}
	public Object getAuthproblem() {
		return authproblem;
	}
	public void setAuthproblem(Object newAuthproblem) {
		authproblem = newAuthproblem;
	}
	public Object getFtp_trying_alternative() {
		return ftp_trying_alternative;
	}
	public void setFtp_trying_alternative(Object newFtp_trying_alternative) {
		ftp_trying_alternative = newFtp_trying_alternative;
	}
	public Object getWildcardmatch() {
		return wildcardmatch;
	}
	public void setWildcardmatch(Object newWildcardmatch) {
		wildcardmatch = newWildcardmatch;
	}
	public Object getExpect100header() {
		return expect100header;
	}
	public void setExpect100header(Object newExpect100header) {
		expect100header = newExpect100header;
	}
	public Object getUse_range() {
		return use_range;
	}
	public void setUse_range(Object newUse_range) {
		use_range = newUse_range;
	}
	public Object getRangestringalloc() {
		return rangestringalloc;
	}
	public void setRangestringalloc(Object newRangestringalloc) {
		rangestringalloc = newRangestringalloc;
	}
	public Object getDone() {
		return done;
	}
	public void setDone(Object newDone) {
		done = newDone;
	}
	public Object getStream_depends_e() {
		return stream_depends_e;
	}
	public void setStream_depends_e(Object newStream_depends_e) {
		stream_depends_e = newStream_depends_e;
	}
	public Object getPreviouslypending() {
		return previouslypending;
	}
	public void setPreviouslypending(Object newPreviouslypending) {
		previouslypending = newPreviouslypending;
	}
	public Object getCookie_engine() {
		return cookie_engine;
	}
	public void setCookie_engine(Object newCookie_engine) {
		cookie_engine = newCookie_engine;
	}
}
