package application;

/*
 * 'pingpong' is the generic struct used for protocols doing server<->client
 * conversations in a back-and-forth style such as FTP, IMAP, POP3, SMTP etc.
 *
 * It holds response cache and non-blocking sending data.
 */
public class pingpong {
	private Byte cache;
	private Object cache_size;
	private Object nread_resp;
	private Byte linestart_resp;
	private  pending_resp;
	private Byte sendthis;
	private Object sendleft;
	private Object sendsize;
	private curltime response;
	private long response_time;
	private connectdata conn;
	private Object statemach_act;
	private Object endofresp;
	
	public pingpong(Byte cache, Object cache_size, Object nread_resp, Byte linestart_resp,  pending_resp, Byte sendthis, Object sendleft, Object sendsize, curltime response, long response_time, connectdata conn, Object statemach_act, Object endofresp) {
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
	
	/***************************************************************************
	 *                                  _   _ ____  _
	 *  Project                     ___| | | |  _ \| |
	 *                             / __| | | | |_) | |
	 *                            | (__| |_| |  _ <| |___
	 *                             \___|\___/|_| \_\_____|
	 *
	 * Copyright (C) 1998 - 2019, Daniel Stenberg, <daniel@haxx.se>, et al.
	 *
	 * This software is licensed as described in the file COPYING, which
	 * you should have received as part of this distribution. The terms
	 * are also available at https://curl.haxx.se/docs/copyright.html.
	 *
	 * You may opt to use, copy, modify, merge, publish, distribute and/or sell
	 * copies of the Software, and permit persons to whom the Software is
	 * furnished to do so, under the terms of the COPYING file.
	 *
	 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
	 * KIND, either express or implied.
	 *
	 *   'pingpong' is for generic back-and-forth support functions used by FTP,
	 *   IMAP, POP3, SMTP and whatever more that likes them.
	 *
	 ***************************************************************************/
	/* The last 3 #include files should be in this order */
	/* Returns timeout in ms. 0 or negative number means the timeout has already
	   triggered */
	public Object Curl_pp_state_timeout( disconnecting) {
		connectdata generatedConn = this.getConn();
		connectdata conn = generatedConn;
		Curl_easy generatedData = conn.getData();
		Curl_easy data = generatedData;
		/* in milliseconds */time_t timeout_ms = new time_t();
		Object generatedSet = data.getSet();
		long generatedResponse_time = this.getResponse_time();
		long response_time = (generatedSet.getServer_response_timeout()) ? generatedSet.getServer_response_timeout() : generatedResponse_time;
		curltime curltime = new curltime();
		curltime generatedResponse = this.getResponse();
		timeout_ms = /* Without a requested timeout, we only wait 'response_time' seconds for the
		     full response to arrive before we bail out */response_time - (time_t)curltime.Curl_now().Curl_timediff(generatedResponse);
		curltime generatedNow = conn.getNow();
		if (generatedSet.getTimeout() && !disconnecting) {
			time_t timeout2_ms = generatedSet.getTimeout() - (time_t)curltime.Curl_now().Curl_timediff(generatedNow);
			timeout_ms = ((timeout_ms) < (timeout2_ms) ? (timeout_ms) : (/* pick the lowest number */timeout2_ms));
		} 
		return timeout_ms/*
		 * Curl_pp_statemach()
		 */;
	}
	public Object Curl_pp_statemach( block,  disconnecting) {
		connectdata generatedConn = this.getConn();
		connectdata conn = generatedConn;
		Object generatedSock = conn.getSock();
		 sock = generatedSock[0];
		int rc;
		time_t interval_ms = new time_t();
		time_t timeout_ms = pp.Curl_pp_state_timeout(disconnecting);
		Curl_easy generatedData = conn.getData();
		Curl_easy data = generatedData;
		 result = CURLE_OK;
		if (timeout_ms <= 0) {
			data.Curl_failf("server response timeout");
			return /* already too little time */CURLE_OPERATION_TIMEDOUT;
		} 
		if (block) {
			interval_ms = /* use 1 second timeout intervals */1000;
			if (timeout_ms < interval_ms) {
				interval_ms = timeout_ms;
			} 
		} else {
				interval_ms = /* immediate */0;
		} 
		Object generatedSendleft = this.getSendleft();
		if (.Curl_ssl_data_pending(conn, 0)) {
			rc = 1;
		}  else if (pp.Curl_pp_moredata()) {
			rc = /* We are receiving and there is data in the cache so just read it */1;
		}  else if (!generatedSendleft && .Curl_ssl_data_pending(conn, 0)) {
			rc = /* We are receiving and there is data ready in the SSL library */1;
		} else {
				rc = ModernizedCProgram.Curl_socket_check(generatedSendleft ? CURL_SOCKET_BAD : /* reading */sock, CURL_SOCKET_BAD, generatedSendleft ? sock : /* writing */CURL_SOCKET_BAD, interval_ms);
		} 
		curltime curltime = new curltime();
		if (block) {
			if (/* if we didn't wait, we don't have to spend time on this now */conn.Curl_pgrsUpdate()) {
				result = CURLE_ABORTED_BY_CALLBACK;
			} else {
					result = ModernizedCProgram.Curl_speedcheck(data, curltime.Curl_now());
			} 
			if (result) {
				return result;
			} 
		} 
		if (rc == -1) {
			data.Curl_failf("select/poll error");
			result = CURLE_OUT_OF_MEMORY;
		}  else if (rc) {
			result = .UNRECOGNIZEDFUNCTIONNAME(conn);
		} 
		return result;
	}
	/* initialize stuff to prepare for reading a fresh new response */
	public void Curl_pp_init() {
		connectdata generatedConn = this.getConn();
		connectdata conn = generatedConn;
		this.setNread_resp(0);
		Curl_easy generatedData = conn.getData();
		Object generatedState = generatedData.getState();
		this.setLinestart_resp(generatedState.getBuffer());
		this.setPending_resp(1);
		curltime curltime = new curltime();
		this.setResponse(curltime.Curl_now());
	}
	public Object Curl_pp_vsendf(Object fmt, Object args) {
		ssize_t bytes_written = new ssize_t();
		size_t write_len = new size_t();
		byte fmt_crlf;
		byte s;
		 result = new ();
		connectdata generatedConn = this.getConn();
		connectdata conn = generatedConn;
		Curl_easy data = new Curl_easy();
		do {
		} while (0);
		do {
		} while (0);
		do {
		} while (0);
		if (!conn) {
			return /* can't send without a connection! */CURLE_SEND_ERROR;
		} 
		Curl_easy generatedData = conn.getData();
		data = generatedData;
		fmt_crlf = ModernizedCProgram.curl_maprintf("%s\r\n", /* append a trailing CRLF */fmt);
		if (!fmt_crlf) {
			return CURLE_OUT_OF_MEMORY;
		} 
		s = ModernizedCProgram.curl_mvaprintf(fmt_crlf, /* trailing CRLF appended */args);
		.Curl_cfree(fmt_crlf);
		if (!s) {
			return CURLE_OUT_OF_MEMORY;
		} 
		bytes_written = 0;
		write_len = .strlen(s);
		pp.Curl_pp_init();
		result = ();
		if (/* Curl_convert_to_network calls failf if unsuccessful */result) {
			.Curl_cfree(s);
			return result;
		} 
		Object generatedSock = conn.getSock();
		result = conn.Curl_write(generatedSock[0], s, write_len, bytes_written);
		if (result) {
			.Curl_cfree(s);
			return result;
		} 
		Object generatedSet = generatedData.getSet();
		if (generatedSet.getVerbose()) {
			generatedData.Curl_debug(CURLINFO_HEADER_OUT, s, (size_t)bytes_written);
		} 
		curltime curltime = new curltime();
		if (bytes_written != (ssize_t)write_len) {
			this.setSendthis(/* the whole chunk was not sent, keep it around and adjust sizes */s);
			this.setSendsize(write_len);
			this.setSendleft(write_len - bytes_written);
		} else {
				.Curl_cfree(s);
				this.setSendthis(((Object)0));
				this.setSendleft(this.setSendsize(0));
				this.setResponse(curltime.Curl_now());
		} 
		return CURLE_OK/***********************************************************************
		 *
		 * Curl_pp_sendf()
		 *
		 * Send the formatted string as a command to a pingpong server. Note that
		 * the string should not have any CRLF appended, as this function will
		 * append the necessary things itself.
		 *
		 * made to never block
		 */;
	}
	public Object Curl_pp_sendf(Object fmt) {
		 result = new ();
		va_list ap = new va_list();
		.__builtin_va_start(ap, fmt);
		result = pp.Curl_pp_vsendf(fmt, ap);
		.__builtin_va_end(ap);
		return result/*
		 * Curl_pp_readresp()
		 *
		 * Reads a piece of a server response.
		 */;
	}
	public Object Curl_pp_readresp(Object sockfd, int code, Object size) {
		/* count bytes per line */ssize_t perline = new ssize_t();
		bool keepon = 1;
		ssize_t gotbytes = new ssize_t();
		byte ptr;
		connectdata generatedConn = this.getConn();
		connectdata conn = generatedConn;
		Curl_easy generatedData = conn.getData();
		Curl_easy data = generatedData;
		Object generatedState = data.getState();
		byte buf = generatedState.getBuffer();
		 result = CURLE_OK;
		code = /* 0 for errors or not done */0;
		size = 0;
		Object generatedNread_resp = this.getNread_resp();
		ptr = buf + generatedNread_resp;
		Byte generatedLinestart_resp = this.getLinestart_resp();
		perline = (ssize_t)(ptr - generatedLinestart_resp);
		Object generatedSet = data.getSet();
		Byte generatedCache = this.getCache();
		Object generatedCache_size = this.getCache_size();
		Object generatedReq = data.getReq();
		while ((generatedNread_resp < (size_t)generatedSet.getBuffer_size()) && (keepon && !result)) {
			if (generatedCache) {
				if ((ptr + generatedCache_size) > (buf + generatedSet.getBuffer_size() + 1)) {
					data.Curl_failf("cached response data too big to handle");
					return CURLE_RECV_ERROR;
				} 
				.memcpy(ptr, generatedCache, generatedCache_size);
				gotbytes = (ssize_t)generatedCache_size;
				.Curl_cfree(generatedCache);
				this.setCache(((Object)/* clear the pointer */0));
				this.setCache_size(/* zero the size just in case */0);
			} else {
					do {
					} while (0);
					result = conn.Curl_read(sockfd, ptr, generatedSet.getBuffer_size() - generatedNread_resp, gotbytes);
					if (result == CURLE_AGAIN) {
						return /* return */CURLE_OK;
					} 
					if (!result && (gotbytes > 0)) {
						result = ();
					} 
					if (result) {
						keepon = /* Set outer result variable to this error. */0;
					} 
			} 
			if (!keepon) {
				;
			}  else if (gotbytes <= 0) {
				keepon = 0;
				result = CURLE_RECV_ERROR;
				data.Curl_failf("response reading failed"/* we got a whole chunk of data, which can be anything from one
				       * byte to a set of lines and possible just a piece of the last
				       * line */);
			} else {
					ssize_t i = new ssize_t();
					ssize_t clipamount = 0;
					bool restart = 0;
					generatedReq.getHeaderbytecount() += (long)gotbytes;
					generatedNread_resp += gotbytes;
					for (i = 0; i < gotbytes; ) {
						perline++;
						if (ptr == (byte)'\n'/* a newline is CRLF in pp-talk, so the CR is ignored as
						             the line isn't really terminated until the LF comes */) {
							if (generatedSet.getVerbose()) {
								data.Curl_debug(CURLINFO_HEADER_IN, generatedLinestart_resp, (size_t)perline/*
								           * We pass all response-lines to the callback function registered
								           * for "headers". The response lines can be seen as a kind of
								           * headers.
								           */);
							} 
							result = conn.Curl_client_write((1 << 1), generatedLinestart_resp, perline);
							if (result) {
								return result;
							} 
							if (.UNRECOGNIZEDFUNCTIONNAME(conn, generatedLinestart_resp, perline, code/* This is the end of the last line, copy the last line to the
							               start of the buffer and zero terminate, for old times sake */)) {
								size_t n = ptr - generatedLinestart_resp;
								.memmove(buf, generatedLinestart_resp, n);
								buf[n] = /* zero terminate */0;
								keepon = 0;
								this.setLinestart_resp(ptr + /* advance pointer */1);
								/* skip this before getting out */i++;
								size = generatedNread_resp;
								this.setNread_resp(/* restart */0);
								break;
							} 
							perline = /* line starts over here */0;
							this.setLinestart_resp(ptr + 1);
						} 
					}
					if (!keepon && (i != gotbytes/* We found the end of the response lines, but we didn't parse the
					           full chunk of data we have read from the server. We therefore need
					           to store the rest of the data to be checked on the next invoke as
					           it may actually contain another end of response already! */)) {
						clipamount = gotbytes - i;
						restart = 1;
						do {
						} while (0);
					}  else if (keepon) {
						if ((perline == gotbytes) && (gotbytes > generatedSet.getBuffer_size() / 2/* We got an excessive line without newlines and we need to deal
						             with it. We keep the first bytes of the line then we throw
						             away the rest. */)) {
							data.Curl_infof("Excessive server response line length received, %zd bytes. Stripping\n", gotbytes);
							restart = 1;
							clipamount = /* we keep 40 bytes since all our pingpong protocols are only
							             interested in the first piece */40;
						}  else if (generatedNread_resp > (size_t)generatedSet.getBuffer_size() / 2/* We got a large chunk of data and there's potentially still
						             trailing data to take care of, so we put any such part in the
						             "cache", clear the buffer to make space and restart. */) {
							clipamount = perline;
							restart = 1;
						} 
					}  else if (i == gotbytes) {
						restart = 1;
					} 
					if (clipamount) {
						this.setCache_size(clipamount);
						this.setCache(.Curl_cmalloc(generatedCache_size));
						if (generatedCache) {
							.memcpy(generatedCache, generatedLinestart_resp, generatedCache_size);
						} else {
								return CURLE_OUT_OF_MEMORY;
						} 
					} 
					if (restart/* now reset a few variables to start over nicely from the start of
					           the big buffer */) {
						this.setNread_resp(/* start over from scratch in the buffer */0);
						ptr = this.setLinestart_resp(buf);
						perline = 0/* there was data */;
					} 
			} 
		}
		this.setPending_resp(/* while there's buffer left and loop is requested */0);
		return result;
	}
	public int Curl_pp_getsock(Object socks) {
		connectdata generatedConn = this.getConn();
		connectdata conn = generatedConn;
		Object generatedSock = conn.getSock();
		socks[0] = generatedSock[0];
		Object generatedSendleft = this.getSendleft();
		if (generatedSendleft) {
			return (1 << (16 + (/* write mode */false)));
		} 
		return (1 << (/* read mode */false));
	}
	public Object Curl_pp_flushsend() {
		connectdata generatedConn = this.getConn();
		connectdata conn = generatedConn;
		ssize_t written = new ssize_t();
		Object generatedSock = conn.getSock();
		 sock = generatedSock[0];
		Byte generatedSendthis = this.getSendthis();
		Object generatedSendsize = this.getSendsize();
		Object generatedSendleft = this.getSendleft();
		 result = conn.Curl_write(sock, generatedSendthis + generatedSendsize - generatedSendleft, generatedSendleft, written);
		if (result) {
			return result;
		} 
		curltime curltime = new curltime();
		if (written != (ssize_t)generatedSendleft) {
			generatedSendleft -= /* only a fraction was sent */written;
		} else {
				.Curl_cfree(generatedSendthis);
				this.setSendthis(((Object)0));
				this.setSendleft(this.setSendsize(0));
				this.setResponse(curltime.Curl_now());
		} 
		return CURLE_OK;
	}
	public Object Curl_pp_disconnect() {
		Byte generatedCache = this.getCache();
		.Curl_cfree(generatedCache);
		this.setCache(((Object)0));
		return CURLE_OK;
	}
	public  Curl_pp_moredata() {
		Object generatedSendleft = this.getSendleft();
		Byte generatedCache = this.getCache();
		Object generatedNread_resp = this.getNread_resp();
		Object generatedCache_size = this.getCache_size();
		return (!generatedSendleft && generatedCache && generatedNread_resp < generatedCache_size) ? 1 : 0;
	}
	public Object ftp_readresp(Object sockfd, int ftpcode, Object size) {
		connectdata generatedConn = this.getConn();
		connectdata conn = generatedConn;
		Curl_easy generatedData = conn.getData();
		Curl_easy data = generatedData;
		int code;
		 result = pp.Curl_pp_readresp(sockfd, code, size/* handle the security-oriented responses 6xx ***/);
		Object generatedInfo = data.getInfo();
		generatedInfo.setHttpcode(/* normal ftp stuff we pass through! *//* store the latest code for later retrieval */code);
		if (ftpcode) {
			ftpcode = code;
		} 
		if (421 == code/* 421 means "Service not available, closing control connection." and FTP
		     * servers use it to signal that idle session timeout has been exceeded.
		     * If we ignored the response, it could end up hanging in some cases.
		     *
		     * This response code can come at any point so having it treated
		     * generically is a good idea.
		     */) {
			data.Curl_infof("We got a 421 - timeout!\n");
			conn._state(.FTP_STOP);
			return CURLE_OPERATION_TIMEDOUT;
		} 
		return result/* --- parse FTP server responses --- *//*
		 * Curl_GetFTPResponse() is a BLOCKING function to read the full response
		 * from a server after a command.
		 *
		 */;
	}
	public Byte getCache() {
		return cache;
	}
	public void setCache(Byte newCache) {
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
	public Byte getLinestart_resp() {
		return linestart_resp;
	}
	public void setLinestart_resp(Byte newLinestart_resp) {
		linestart_resp = newLinestart_resp;
	}
	public  getPending_resp() {
		return pending_resp;
	}
	public void setPending_resp( newPending_resp) {
		pending_resp = newPending_resp;
	}
	public Byte getSendthis() {
		return sendthis;
	}
	public void setSendthis(Byte newSendthis) {
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
	public connectdata getConn() {
		return conn;
	}
	public void setConn(connectdata newConn) {
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
