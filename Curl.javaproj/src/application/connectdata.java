package application;

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
 ***************************************************************************/
/* This file is for lib internal stuff */
/* sometimes called SSMTP */
/* Convenience defines for checking protocols or their SSL based version. Each
   protocol handler should only ever have a single CURLPROTO_ in its protocol
   field. */
/* length of longest IPv6 address string including the trailing null */
/* Default FTP/IMAP etc response timeout in milliseconds.
   Symbian OS panics when given a timeout much greater than 1/2 hour.
*/
/* Max string intput length is a precaution against abuse and to detect junk
   input easier and better. */
/* for the structs and enum stuff */
/* return the count of bytes sent, or -1 on error */
/* connection data */
/* error to return */
/* return the count of bytes read, or -1 on error */
/* connection data */
/* These function pointer types are here only to allow easier typecasting
   within the source when we need to cast between data pointers (such as NULL)
   and function pointers. */
/* The last connection, NULL if undefined */
public class connectdata {
	private Object data;
	private curl_llist_element bundle_node;
	private Curl_chunker chunk;
	private Object fclosesocket;
	private Object closesocket_client;
	private long connection_id;
	private Object dns_entry;
	private Object ip_addr;
	private Object tempaddr;
	private Object ip_addr_str;
	private int scope_id;
	private  transport;
	private hostname host;
	private Object hostname_resolve;
	private Object secondaryhostname;
	private hostname conn_to_host;
	private proxy_info socks_proxy;
	private proxy_info http_proxy;
	private long port;
	private int remote_port;
	private int conn_to_port;
	private int secondary_port;
	private Object primary_ip;
	private long primary_port;
	private Object local_ip;
	private long local_port;
	private Object user;
	private Object passwd;
	private Object options;
	private Object oauth_bearer;
	private Object sasl_authzid;
	private int httpversion;
	private int rtspversion;
	private curltime now;
	private curltime created;
	private curltime lastused;
	private Object sock;
	private Object tempsock;
	private Object sock_accepted;
	private Object recv;
	private Object send;
	private Object postponed;
	private Object ssl;
	private Object proxy_ssl;
	private ssl_primary_config ssl_config;
	private ssl_primary_config proxy_ssl_config;
	private ConnectBits bits;
	private curltime connecttime;
	private int num_addr;
	private Object timeoutms_per_addr;
	private Object handler;
	private Object given;
	private long ip_version;
	private curltime keepalive;
	private long upkeep_interval_ms;
	private Object sockfd;
	private Object writesockfd;
	private dynamically_allocated_data allocptr;
	private curl_llist easyq;
	private Object seek_func;
	private Object seek_client;
	private  http_ntlm_state;
	private  proxy_ntlm_state;
	private ntlmdata ntlm;
	private ntlmdata proxyntlm;
	private Curl_async async;
	private Object trailer;
	private int trlMax;
	private int trlPos;
	private  proto;
	private int cselect_bits;
	private int waitfor;
	private Object localdev;
	private int localport;
	private int localportrange;
	private Object connect_state;
	private Object bundle;
	private int negnpn;
	private Object tls_upgraded;
	private Object readchannel_inuse;
	private Object writechannel_inuse;
	
	public connectdata(Object data, curl_llist_element bundle_node, Curl_chunker chunk, Object fclosesocket, Object closesocket_client, long connection_id, Object dns_entry, Object ip_addr, Object tempaddr, Object ip_addr_str, int scope_id,  transport, hostname host, Object hostname_resolve, Object secondaryhostname, hostname conn_to_host, proxy_info socks_proxy, proxy_info http_proxy, long port, int remote_port, int conn_to_port, int secondary_port, Object primary_ip, long primary_port, Object local_ip, long local_port, Object user, Object passwd, Object options, Object oauth_bearer, Object sasl_authzid, int httpversion, int rtspversion, curltime now, curltime created, curltime lastused, Object sock, Object tempsock, Object sock_accepted, Object recv, Object send, Object postponed, Object ssl, Object proxy_ssl, ssl_primary_config ssl_config, ssl_primary_config proxy_ssl_config, ConnectBits bits, curltime connecttime, int num_addr, Object timeoutms_per_addr, Object handler, Object given, long ip_version, curltime keepalive, long upkeep_interval_ms, Object sockfd, Object writesockfd, dynamically_allocated_data allocptr, curl_llist easyq, Object seek_func, Object seek_client,  http_ntlm_state,  proxy_ntlm_state, ntlmdata ntlm, ntlmdata proxyntlm, Curl_async async, Object trailer, int trlMax, int trlPos,  proto, int cselect_bits, int waitfor, Object localdev, int localport, int localportrange, Object connect_state, Object bundle, int negnpn, Object tls_upgraded, Object readchannel_inuse, Object writechannel_inuse) {
		setData(data);
		setBundle_node(bundle_node);
		setChunk(chunk);
		setFclosesocket(fclosesocket);
		setClosesocket_client(closesocket_client);
		setConnection_id(connection_id);
		setDns_entry(dns_entry);
		setIp_addr(ip_addr);
		setTempaddr(tempaddr);
		setIp_addr_str(ip_addr_str);
		setScope_id(scope_id);
		setTransport(transport);
		setHost(host);
		setHostname_resolve(hostname_resolve);
		setSecondaryhostname(secondaryhostname);
		setConn_to_host(conn_to_host);
		setSocks_proxy(socks_proxy);
		setHttp_proxy(http_proxy);
		setPort(port);
		setRemote_port(remote_port);
		setConn_to_port(conn_to_port);
		setSecondary_port(secondary_port);
		setPrimary_ip(primary_ip);
		setPrimary_port(primary_port);
		setLocal_ip(local_ip);
		setLocal_port(local_port);
		setUser(user);
		setPasswd(passwd);
		setOptions(options);
		setOauth_bearer(oauth_bearer);
		setSasl_authzid(sasl_authzid);
		setHttpversion(httpversion);
		setRtspversion(rtspversion);
		setNow(now);
		setCreated(created);
		setLastused(lastused);
		setSock(sock);
		setTempsock(tempsock);
		setSock_accepted(sock_accepted);
		setRecv(recv);
		setSend(send);
		setPostponed(postponed);
		setSsl(ssl);
		setProxy_ssl(proxy_ssl);
		setSsl_config(ssl_config);
		setProxy_ssl_config(proxy_ssl_config);
		setBits(bits);
		setConnecttime(connecttime);
		setNum_addr(num_addr);
		setTimeoutms_per_addr(timeoutms_per_addr);
		setHandler(handler);
		setGiven(given);
		setIp_version(ip_version);
		setKeepalive(keepalive);
		setUpkeep_interval_ms(upkeep_interval_ms);
		setSockfd(sockfd);
		setWritesockfd(writesockfd);
		setAllocptr(allocptr);
		setEasyq(easyq);
		setSeek_func(seek_func);
		setSeek_client(seek_client);
		setHttp_ntlm_state(http_ntlm_state);
		setProxy_ntlm_state(proxy_ntlm_state);
		setNtlm(ntlm);
		setProxyntlm(proxyntlm);
		setAsync(async);
		setTrailer(trailer);
		setTrlMax(trlMax);
		setTrlPos(trlPos);
		setProto(proto);
		setCselect_bits(cselect_bits);
		setWaitfor(waitfor);
		setLocaldev(localdev);
		setLocalport(localport);
		setLocalportrange(localportrange);
		setConnect_state(connect_state);
		setBundle(bundle);
		setNegnpn(negnpn);
		setTls_upgraded(tls_upgraded);
		setReadchannel_inuse(readchannel_inuse);
		setWritechannel_inuse(writechannel_inuse);
	}
	public connectdata() {
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public curl_llist_element getBundle_node() {
		return bundle_node;
	}
	public void setBundle_node(curl_llist_element newBundle_node) {
		bundle_node = newBundle_node;
	}
	public Curl_chunker getChunk() {
		return chunk;
	}
	public void setChunk(Curl_chunker newChunk) {
		chunk = newChunk;
	}
	public Object getFclosesocket() {
		return fclosesocket;
	}
	public void setFclosesocket(Object newFclosesocket) {
		fclosesocket = newFclosesocket;
	}
	public Object getClosesocket_client() {
		return closesocket_client;
	}
	public void setClosesocket_client(Object newClosesocket_client) {
		closesocket_client = newClosesocket_client;
	}
	public long getConnection_id() {
		return connection_id;
	}
	public void setConnection_id(long newConnection_id) {
		connection_id = newConnection_id;
	}
	public Object getDns_entry() {
		return dns_entry;
	}
	public void setDns_entry(Object newDns_entry) {
		dns_entry = newDns_entry;
	}
	public Object getIp_addr() {
		return ip_addr;
	}
	public void setIp_addr(Object newIp_addr) {
		ip_addr = newIp_addr;
	}
	public Object getTempaddr() {
		return tempaddr;
	}
	public void setTempaddr(Object newTempaddr) {
		tempaddr = newTempaddr;
	}
	public Object getIp_addr_str() {
		return ip_addr_str;
	}
	public void setIp_addr_str(Object newIp_addr_str) {
		ip_addr_str = newIp_addr_str;
	}
	public int getScope_id() {
		return scope_id;
	}
	public void setScope_id(int newScope_id) {
		scope_id = newScope_id;
	}
	public  getTransport() {
		return transport;
	}
	public void setTransport( newTransport) {
		transport = newTransport;
	}
	public hostname getHost() {
		return host;
	}
	public void setHost(hostname newHost) {
		host = newHost;
	}
	public Object getHostname_resolve() {
		return hostname_resolve;
	}
	public void setHostname_resolve(Object newHostname_resolve) {
		hostname_resolve = newHostname_resolve;
	}
	public Object getSecondaryhostname() {
		return secondaryhostname;
	}
	public void setSecondaryhostname(Object newSecondaryhostname) {
		secondaryhostname = newSecondaryhostname;
	}
	public hostname getConn_to_host() {
		return conn_to_host;
	}
	public void setConn_to_host(hostname newConn_to_host) {
		conn_to_host = newConn_to_host;
	}
	public proxy_info getSocks_proxy() {
		return socks_proxy;
	}
	public void setSocks_proxy(proxy_info newSocks_proxy) {
		socks_proxy = newSocks_proxy;
	}
	public proxy_info getHttp_proxy() {
		return http_proxy;
	}
	public void setHttp_proxy(proxy_info newHttp_proxy) {
		http_proxy = newHttp_proxy;
	}
	public long getPort() {
		return port;
	}
	public void setPort(long newPort) {
		port = newPort;
	}
	public int getRemote_port() {
		return remote_port;
	}
	public void setRemote_port(int newRemote_port) {
		remote_port = newRemote_port;
	}
	public int getConn_to_port() {
		return conn_to_port;
	}
	public void setConn_to_port(int newConn_to_port) {
		conn_to_port = newConn_to_port;
	}
	public int getSecondary_port() {
		return secondary_port;
	}
	public void setSecondary_port(int newSecondary_port) {
		secondary_port = newSecondary_port;
	}
	public Object getPrimary_ip() {
		return primary_ip;
	}
	public void setPrimary_ip(Object newPrimary_ip) {
		primary_ip = newPrimary_ip;
	}
	public long getPrimary_port() {
		return primary_port;
	}
	public void setPrimary_port(long newPrimary_port) {
		primary_port = newPrimary_port;
	}
	public Object getLocal_ip() {
		return local_ip;
	}
	public void setLocal_ip(Object newLocal_ip) {
		local_ip = newLocal_ip;
	}
	public long getLocal_port() {
		return local_port;
	}
	public void setLocal_port(long newLocal_port) {
		local_port = newLocal_port;
	}
	public Object getUser() {
		return user;
	}
	public void setUser(Object newUser) {
		user = newUser;
	}
	public Object getPasswd() {
		return passwd;
	}
	public void setPasswd(Object newPasswd) {
		passwd = newPasswd;
	}
	public Object getOptions() {
		return options;
	}
	public void setOptions(Object newOptions) {
		options = newOptions;
	}
	public Object getOauth_bearer() {
		return oauth_bearer;
	}
	public void setOauth_bearer(Object newOauth_bearer) {
		oauth_bearer = newOauth_bearer;
	}
	public Object getSasl_authzid() {
		return sasl_authzid;
	}
	public void setSasl_authzid(Object newSasl_authzid) {
		sasl_authzid = newSasl_authzid;
	}
	public int getHttpversion() {
		return httpversion;
	}
	public void setHttpversion(int newHttpversion) {
		httpversion = newHttpversion;
	}
	public int getRtspversion() {
		return rtspversion;
	}
	public void setRtspversion(int newRtspversion) {
		rtspversion = newRtspversion;
	}
	public curltime getNow() {
		return now;
	}
	public void setNow(curltime newNow) {
		now = newNow;
	}
	public curltime getCreated() {
		return created;
	}
	public void setCreated(curltime newCreated) {
		created = newCreated;
	}
	public curltime getLastused() {
		return lastused;
	}
	public void setLastused(curltime newLastused) {
		lastused = newLastused;
	}
	public Object getSock() {
		return sock;
	}
	public void setSock(Object newSock) {
		sock = newSock;
	}
	public Object getTempsock() {
		return tempsock;
	}
	public void setTempsock(Object newTempsock) {
		tempsock = newTempsock;
	}
	public Object getSock_accepted() {
		return sock_accepted;
	}
	public void setSock_accepted(Object newSock_accepted) {
		sock_accepted = newSock_accepted;
	}
	public Object getRecv() {
		return recv;
	}
	public void setRecv(Object newRecv) {
		recv = newRecv;
	}
	public Object getSend() {
		return send;
	}
	public void setSend(Object newSend) {
		send = newSend;
	}
	public Object getPostponed() {
		return postponed;
	}
	public void setPostponed(Object newPostponed) {
		postponed = newPostponed;
	}
	public Object getSsl() {
		return ssl;
	}
	public void setSsl(Object newSsl) {
		ssl = newSsl;
	}
	public Object getProxy_ssl() {
		return proxy_ssl;
	}
	public void setProxy_ssl(Object newProxy_ssl) {
		proxy_ssl = newProxy_ssl;
	}
	public ssl_primary_config getSsl_config() {
		return ssl_config;
	}
	public void setSsl_config(ssl_primary_config newSsl_config) {
		ssl_config = newSsl_config;
	}
	public ssl_primary_config getProxy_ssl_config() {
		return proxy_ssl_config;
	}
	public void setProxy_ssl_config(ssl_primary_config newProxy_ssl_config) {
		proxy_ssl_config = newProxy_ssl_config;
	}
	public ConnectBits getBits() {
		return bits;
	}
	public void setBits(ConnectBits newBits) {
		bits = newBits;
	}
	public curltime getConnecttime() {
		return connecttime;
	}
	public void setConnecttime(curltime newConnecttime) {
		connecttime = newConnecttime;
	}
	public int getNum_addr() {
		return num_addr;
	}
	public void setNum_addr(int newNum_addr) {
		num_addr = newNum_addr;
	}
	public Object getTimeoutms_per_addr() {
		return timeoutms_per_addr;
	}
	public void setTimeoutms_per_addr(Object newTimeoutms_per_addr) {
		timeoutms_per_addr = newTimeoutms_per_addr;
	}
	public Object getHandler() {
		return handler;
	}
	public void setHandler(Object newHandler) {
		handler = newHandler;
	}
	public Object getGiven() {
		return given;
	}
	public void setGiven(Object newGiven) {
		given = newGiven;
	}
	public long getIp_version() {
		return ip_version;
	}
	public void setIp_version(long newIp_version) {
		ip_version = newIp_version;
	}
	public curltime getKeepalive() {
		return keepalive;
	}
	public void setKeepalive(curltime newKeepalive) {
		keepalive = newKeepalive;
	}
	public long getUpkeep_interval_ms() {
		return upkeep_interval_ms;
	}
	public void setUpkeep_interval_ms(long newUpkeep_interval_ms) {
		upkeep_interval_ms = newUpkeep_interval_ms;
	}
	public Object getSockfd() {
		return sockfd;
	}
	public void setSockfd(Object newSockfd) {
		sockfd = newSockfd;
	}
	public Object getWritesockfd() {
		return writesockfd;
	}
	public void setWritesockfd(Object newWritesockfd) {
		writesockfd = newWritesockfd;
	}
	public dynamically_allocated_data getAllocptr() {
		return allocptr;
	}
	public void setAllocptr(dynamically_allocated_data newAllocptr) {
		allocptr = newAllocptr;
	}
	public curl_llist getEasyq() {
		return easyq;
	}
	public void setEasyq(curl_llist newEasyq) {
		easyq = newEasyq;
	}
	public Object getSeek_func() {
		return seek_func;
	}
	public void setSeek_func(Object newSeek_func) {
		seek_func = newSeek_func;
	}
	public Object getSeek_client() {
		return seek_client;
	}
	public void setSeek_client(Object newSeek_client) {
		seek_client = newSeek_client;
	}
	public  getHttp_ntlm_state() {
		return http_ntlm_state;
	}
	public void setHttp_ntlm_state( newHttp_ntlm_state) {
		http_ntlm_state = newHttp_ntlm_state;
	}
	public  getProxy_ntlm_state() {
		return proxy_ntlm_state;
	}
	public void setProxy_ntlm_state( newProxy_ntlm_state) {
		proxy_ntlm_state = newProxy_ntlm_state;
	}
	public ntlmdata getNtlm() {
		return ntlm;
	}
	public void setNtlm(ntlmdata newNtlm) {
		ntlm = newNtlm;
	}
	public ntlmdata getProxyntlm() {
		return proxyntlm;
	}
	public void setProxyntlm(ntlmdata newProxyntlm) {
		proxyntlm = newProxyntlm;
	}
	public Curl_async getAsync() {
		return async;
	}
	public void setAsync(Curl_async newAsync) {
		async = newAsync;
	}
	public Object getTrailer() {
		return trailer;
	}
	public void setTrailer(Object newTrailer) {
		trailer = newTrailer;
	}
	public int getTrlMax() {
		return trlMax;
	}
	public void setTrlMax(int newTrlMax) {
		trlMax = newTrlMax;
	}
	public int getTrlPos() {
		return trlPos;
	}
	public void setTrlPos(int newTrlPos) {
		trlPos = newTrlPos;
	}
	public  getProto() {
		return proto;
	}
	public void setProto( newProto) {
		proto = newProto;
	}
	public int getCselect_bits() {
		return cselect_bits;
	}
	public void setCselect_bits(int newCselect_bits) {
		cselect_bits = newCselect_bits;
	}
	public int getWaitfor() {
		return waitfor;
	}
	public void setWaitfor(int newWaitfor) {
		waitfor = newWaitfor;
	}
	public Object getLocaldev() {
		return localdev;
	}
	public void setLocaldev(Object newLocaldev) {
		localdev = newLocaldev;
	}
	public int getLocalport() {
		return localport;
	}
	public void setLocalport(int newLocalport) {
		localport = newLocalport;
	}
	public int getLocalportrange() {
		return localportrange;
	}
	public void setLocalportrange(int newLocalportrange) {
		localportrange = newLocalportrange;
	}
	public Object getConnect_state() {
		return connect_state;
	}
	public void setConnect_state(Object newConnect_state) {
		connect_state = newConnect_state;
	}
	public Object getBundle() {
		return bundle;
	}
	public void setBundle(Object newBundle) {
		bundle = newBundle;
	}
	public int getNegnpn() {
		return negnpn;
	}
	public void setNegnpn(int newNegnpn) {
		negnpn = newNegnpn;
	}
	public Object getTls_upgraded() {
		return tls_upgraded;
	}
	public void setTls_upgraded(Object newTls_upgraded) {
		tls_upgraded = newTls_upgraded;
	}
	public Object getReadchannel_inuse() {
		return readchannel_inuse;
	}
	public void setReadchannel_inuse(Object newReadchannel_inuse) {
		readchannel_inuse = newReadchannel_inuse;
	}
	public Object getWritechannel_inuse() {
		return writechannel_inuse;
	}
	public void setWritechannel_inuse(Object newWritechannel_inuse) {
		writechannel_inuse = newWritechannel_inuse;
	}
}
/* socketindex */
/* data to write */
/* max amount to write */
/* socketindex */
/* store data here */
/* max amount to read */
/* error to return */
/* HAVE_LIBSSH2_H */
/* Initial size of the buffer to store headers in, it'll be enlarged in case
   of need. */
/* the type we use for storing a single boolean bit */
/* 'data' is the CURRENT Curl_easy using this connection -- take great
     caution that this might very well vary between different times this
     connection is used! */
