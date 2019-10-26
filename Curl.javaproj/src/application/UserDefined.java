package application;

/* values set by the libcurl user */
public class UserDefined {
	private _iobuf err;
	private Object debugdata;
	private Byte errorbuffer;
	private long proxyport;
	private Object out;
	private Object in_set;
	private Object writeheader;
	private Object rtp_out;
	private long use_port;
	private long httpauth;
	private long proxyauth;
	private long socks5auth;
	private long followlocation;
	private long maxredirs;
	private int keep_post;
	private Object postfields;
	private Object seek_func;
	private Object postfieldsize;
	private int localport;
	private int localportrange;
	private Object fwrite_func;
	private Object fwrite_header;
	private Object fwrite_rtp;
	private Object fread_func_set;
	private Object fprogress;
	private Object fxferinfo;
	private Object fdebug;
	private Object ioctl_func;
	private Object fsockopt;
	private Object sockopt_client;
	private Object fopensocket;
	private Object opensocket_client;
	private Object fclosesocket;
	private Object closesocket_client;
	private Object seek_client;
	private Object convfromnetwork;
	private Object convtonetwork;
	private Object convfromutf8;
	private Object progress_client;
	private Object ioctl_client;
	private long timeout;
	private long connecttimeout;
	private long accepttimeout;
	private long happy_eyeballs_timeout;
	private long server_response_timeout;
	private long maxage_conn;
	private long tftp_blksize;
	private Object filesize;
	private long low_speed_limit;
	private long low_speed_time;
	private Object max_send_speed;
	private Object max_recv_speed;
	private Object set_resume_from;
	private curl_slist headers;
	private curl_slist proxyheaders;
	private curl_httppost httppost;
	private Object mimepost;
	private curl_slist quote;
	private curl_slist postquote;
	private curl_slist prequote;
	private curl_slist source_quote;
	private curl_slist source_prequote;
	private curl_slist source_postquote;
	private curl_slist telnet_options;
	private curl_slist resolve;
	private curl_slist connect_to;
	private Object timecondition;
	private Object timevalue;
	private  httpreq;
	private long httpversion;
	private ssl_config_data ssl;
	private ssl_config_data proxy_ssl;
	private ssl_general_config general_ssl;
	private Object proxytype;
	private long dns_cache_timeout;
	private long buffer_size;
	private Object upload_buffer_size;
	private Object private_data;
	private curl_slist http200aliases;
	private long ipver;
	private Object max_filesize;
	private  ftp_filemethod;
	private Object ftpsslauth;
	private Object ftp_ccc;
	private int ftp_create_missing_dirs;
	private Object ssh_keyfunc;
	private Object ssh_keyfunc_userp;
	private CURL_NETRC_OPTION use_netrc;
	private Object use_ssl;
	private long new_file_perms;
	private long new_directory_perms;
	private long ssh_auth_types;
	private Object str;
	private int scope_id;
	private long allowed_protocols;
	private long redir_protocols;
	private curl_slist mail_rcpt;
	private  rtspreq;
	private long rtspversion;
	private Object chunk_bgn;
	private Object chunk_end;
	private Object fnmatch;
	private Object fnmatch_data;
	private long gssapi_delegation;
	private long tcp_keepidle;
	private long tcp_keepintvl;
	private Object maxconnects;
	private long expect_100_timeout;
	private Curl_easy stream_depends_on;
	private int stream_weight;
	private Curl_http2_dep stream_dependents;
	private Object resolver_start;
	private Object resolver_start_client;
	private long upkeep_interval_ms;
	private Object fmultidone;
	private Curl_easy dohfor;
	private Object uh;
	private Object trailer_data;
	private Object trailer_callback;
	private Object is_fread_set;
	private Object is_fwrite_set;
	private Object free_referer;
	private Object tftp_no_options;
	private Object sep_headers;
	private Object cookiesession;
	private Object crlf;
	private Object strip_path_slash;
	private Object ssh_compression;
	private Object get_filetime;
	private Object tunnel_thru_httpproxy;
	private Object prefer_ascii;
	private Object ftp_append;
	private Object ftp_list_only;
	private Object ftp_use_port;
	private Object ftp_use_epsv;
	private Object ftp_use_eprt;
	private Object ftp_use_pret;
	private Object ftp_skip_ip;
	private Object hide_progress;
	private Object http_fail_on_error;
	private Object http_keep_sending_on_error;
	private Object http_follow_location;
	private Object http_transfer_encoding;
	private Object allow_auth_to_other_hosts;
	private Object include_header;
	private Object http_set_referer;
	private Object http_auto_referer;
	private Object opt_no_body;
	private Object upload;
	private Object verbose;
	private Object krb;
	private Object reuse_forbid;
	private Object reuse_fresh;
	private Object no_signal;
	private Object tcp_nodelay;
	private Object ignorecl;
	private Object connect_only;
	private Object http_te_skip;
	private Object http_ce_skip;
	private Object proxy_transfer_mode;
	private Object sasl_ir;
	private Object wildcard_enabled;
	private Object tcp_keepalive;
	private Object tcp_fastopen;
	private Object ssl_enable_npn;
	private Object ssl_enable_alpn;
	private Object path_as_is;
	private Object pipewait;
	private Object suppress_connect_headers;
	private Object dns_shuffle_addresses;
	private Object stream_depends_e;
	private Object haproxyprotocol;
	private Object abstract_unix_socket;
	private Object disallow_username_in_url;
	private Object doh;
	private Object doh_get;
	private Object http09_allowed;
	
	public UserDefined(_iobuf err, Object debugdata, Byte errorbuffer, long proxyport, Object out, Object in_set, Object writeheader, Object rtp_out, long use_port, long httpauth, long proxyauth, long socks5auth, long followlocation, long maxredirs, int keep_post, Object postfields, Object seek_func, Object postfieldsize, int localport, int localportrange, Object fwrite_func, Object fwrite_header, Object fwrite_rtp, Object fread_func_set, Object fprogress, Object fxferinfo, Object fdebug, Object ioctl_func, Object fsockopt, Object sockopt_client, Object fopensocket, Object opensocket_client, Object fclosesocket, Object closesocket_client, Object seek_client, Object convfromnetwork, Object convtonetwork, Object convfromutf8, Object progress_client, Object ioctl_client, long timeout, long connecttimeout, long accepttimeout, long happy_eyeballs_timeout, long server_response_timeout, long maxage_conn, long tftp_blksize, Object filesize, long low_speed_limit, long low_speed_time, Object max_send_speed, Object max_recv_speed, Object set_resume_from, curl_slist headers, curl_slist proxyheaders, curl_httppost httppost, Object mimepost, curl_slist quote, curl_slist postquote, curl_slist prequote, curl_slist source_quote, curl_slist source_prequote, curl_slist source_postquote, curl_slist telnet_options, curl_slist resolve, curl_slist connect_to, Object timecondition, Object timevalue,  httpreq, long httpversion, ssl_config_data ssl, ssl_config_data proxy_ssl, ssl_general_config general_ssl, Object proxytype, long dns_cache_timeout, long buffer_size, Object upload_buffer_size, Object private_data, curl_slist http200aliases, long ipver, Object max_filesize,  ftp_filemethod, Object ftpsslauth, Object ftp_ccc, int ftp_create_missing_dirs, Object ssh_keyfunc, Object ssh_keyfunc_userp, CURL_NETRC_OPTION use_netrc, Object use_ssl, long new_file_perms, long new_directory_perms, long ssh_auth_types, Object str, int scope_id, long allowed_protocols, long redir_protocols, curl_slist mail_rcpt,  rtspreq, long rtspversion, Object chunk_bgn, Object chunk_end, Object fnmatch, Object fnmatch_data, long gssapi_delegation, long tcp_keepidle, long tcp_keepintvl, Object maxconnects, long expect_100_timeout, Curl_easy stream_depends_on, int stream_weight, Curl_http2_dep stream_dependents, Object resolver_start, Object resolver_start_client, long upkeep_interval_ms, Object fmultidone, Curl_easy dohfor, Object uh, Object trailer_data, Object trailer_callback, Object is_fread_set, Object is_fwrite_set, Object free_referer, Object tftp_no_options, Object sep_headers, Object cookiesession, Object crlf, Object strip_path_slash, Object ssh_compression, Object get_filetime, Object tunnel_thru_httpproxy, Object prefer_ascii, Object ftp_append, Object ftp_list_only, Object ftp_use_port, Object ftp_use_epsv, Object ftp_use_eprt, Object ftp_use_pret, Object ftp_skip_ip, Object hide_progress, Object http_fail_on_error, Object http_keep_sending_on_error, Object http_follow_location, Object http_transfer_encoding, Object allow_auth_to_other_hosts, Object include_header, Object http_set_referer, Object http_auto_referer, Object opt_no_body, Object upload, Object verbose, Object krb, Object reuse_forbid, Object reuse_fresh, Object no_signal, Object tcp_nodelay, Object ignorecl, Object connect_only, Object http_te_skip, Object http_ce_skip, Object proxy_transfer_mode, Object sasl_ir, Object wildcard_enabled, Object tcp_keepalive, Object tcp_fastopen, Object ssl_enable_npn, Object ssl_enable_alpn, Object path_as_is, Object pipewait, Object suppress_connect_headers, Object dns_shuffle_addresses, Object stream_depends_e, Object haproxyprotocol, Object abstract_unix_socket, Object disallow_username_in_url, Object doh, Object doh_get, Object http09_allowed) {
		setErr(err);
		setDebugdata(debugdata);
		setErrorbuffer(errorbuffer);
		setProxyport(proxyport);
		setOut(out);
		setIn_set(in_set);
		setWriteheader(writeheader);
		setRtp_out(rtp_out);
		setUse_port(use_port);
		setHttpauth(httpauth);
		setProxyauth(proxyauth);
		setSocks5auth(socks5auth);
		setFollowlocation(followlocation);
		setMaxredirs(maxredirs);
		setKeep_post(keep_post);
		setPostfields(postfields);
		setSeek_func(seek_func);
		setPostfieldsize(postfieldsize);
		setLocalport(localport);
		setLocalportrange(localportrange);
		setFwrite_func(fwrite_func);
		setFwrite_header(fwrite_header);
		setFwrite_rtp(fwrite_rtp);
		setFread_func_set(fread_func_set);
		setFprogress(fprogress);
		setFxferinfo(fxferinfo);
		setFdebug(fdebug);
		setIoctl_func(ioctl_func);
		setFsockopt(fsockopt);
		setSockopt_client(sockopt_client);
		setFopensocket(fopensocket);
		setOpensocket_client(opensocket_client);
		setFclosesocket(fclosesocket);
		setClosesocket_client(closesocket_client);
		setSeek_client(seek_client);
		setConvfromnetwork(convfromnetwork);
		setConvtonetwork(convtonetwork);
		setConvfromutf8(convfromutf8);
		setProgress_client(progress_client);
		setIoctl_client(ioctl_client);
		setTimeout(timeout);
		setConnecttimeout(connecttimeout);
		setAccepttimeout(accepttimeout);
		setHappy_eyeballs_timeout(happy_eyeballs_timeout);
		setServer_response_timeout(server_response_timeout);
		setMaxage_conn(maxage_conn);
		setTftp_blksize(tftp_blksize);
		setFilesize(filesize);
		setLow_speed_limit(low_speed_limit);
		setLow_speed_time(low_speed_time);
		setMax_send_speed(max_send_speed);
		setMax_recv_speed(max_recv_speed);
		setSet_resume_from(set_resume_from);
		setHeaders(headers);
		setProxyheaders(proxyheaders);
		setHttppost(httppost);
		setMimepost(mimepost);
		setQuote(quote);
		setPostquote(postquote);
		setPrequote(prequote);
		setSource_quote(source_quote);
		setSource_prequote(source_prequote);
		setSource_postquote(source_postquote);
		setTelnet_options(telnet_options);
		setResolve(resolve);
		setConnect_to(connect_to);
		setTimecondition(timecondition);
		setTimevalue(timevalue);
		setHttpreq(httpreq);
		setHttpversion(httpversion);
		setSsl(ssl);
		setProxy_ssl(proxy_ssl);
		setGeneral_ssl(general_ssl);
		setProxytype(proxytype);
		setDns_cache_timeout(dns_cache_timeout);
		setBuffer_size(buffer_size);
		setUpload_buffer_size(upload_buffer_size);
		setPrivate_data(private_data);
		setHttp200aliases(http200aliases);
		setIpver(ipver);
		setMax_filesize(max_filesize);
		setFtp_filemethod(ftp_filemethod);
		setFtpsslauth(ftpsslauth);
		setFtp_ccc(ftp_ccc);
		setFtp_create_missing_dirs(ftp_create_missing_dirs);
		setSsh_keyfunc(ssh_keyfunc);
		setSsh_keyfunc_userp(ssh_keyfunc_userp);
		setUse_netrc(use_netrc);
		setUse_ssl(use_ssl);
		setNew_file_perms(new_file_perms);
		setNew_directory_perms(new_directory_perms);
		setSsh_auth_types(ssh_auth_types);
		setStr(str);
		setScope_id(scope_id);
		setAllowed_protocols(allowed_protocols);
		setRedir_protocols(redir_protocols);
		setMail_rcpt(mail_rcpt);
		setRtspreq(rtspreq);
		setRtspversion(rtspversion);
		setChunk_bgn(chunk_bgn);
		setChunk_end(chunk_end);
		setFnmatch(fnmatch);
		setFnmatch_data(fnmatch_data);
		setGssapi_delegation(gssapi_delegation);
		setTcp_keepidle(tcp_keepidle);
		setTcp_keepintvl(tcp_keepintvl);
		setMaxconnects(maxconnects);
		setExpect_100_timeout(expect_100_timeout);
		setStream_depends_on(stream_depends_on);
		setStream_weight(stream_weight);
		setStream_dependents(stream_dependents);
		setResolver_start(resolver_start);
		setResolver_start_client(resolver_start_client);
		setUpkeep_interval_ms(upkeep_interval_ms);
		setFmultidone(fmultidone);
		setDohfor(dohfor);
		setUh(uh);
		setTrailer_data(trailer_data);
		setTrailer_callback(trailer_callback);
		setIs_fread_set(is_fread_set);
		setIs_fwrite_set(is_fwrite_set);
		setFree_referer(free_referer);
		setTftp_no_options(tftp_no_options);
		setSep_headers(sep_headers);
		setCookiesession(cookiesession);
		setCrlf(crlf);
		setStrip_path_slash(strip_path_slash);
		setSsh_compression(ssh_compression);
		setGet_filetime(get_filetime);
		setTunnel_thru_httpproxy(tunnel_thru_httpproxy);
		setPrefer_ascii(prefer_ascii);
		setFtp_append(ftp_append);
		setFtp_list_only(ftp_list_only);
		setFtp_use_port(ftp_use_port);
		setFtp_use_epsv(ftp_use_epsv);
		setFtp_use_eprt(ftp_use_eprt);
		setFtp_use_pret(ftp_use_pret);
		setFtp_skip_ip(ftp_skip_ip);
		setHide_progress(hide_progress);
		setHttp_fail_on_error(http_fail_on_error);
		setHttp_keep_sending_on_error(http_keep_sending_on_error);
		setHttp_follow_location(http_follow_location);
		setHttp_transfer_encoding(http_transfer_encoding);
		setAllow_auth_to_other_hosts(allow_auth_to_other_hosts);
		setInclude_header(include_header);
		setHttp_set_referer(http_set_referer);
		setHttp_auto_referer(http_auto_referer);
		setOpt_no_body(opt_no_body);
		setUpload(upload);
		setVerbose(verbose);
		setKrb(krb);
		setReuse_forbid(reuse_forbid);
		setReuse_fresh(reuse_fresh);
		setNo_signal(no_signal);
		setTcp_nodelay(tcp_nodelay);
		setIgnorecl(ignorecl);
		setConnect_only(connect_only);
		setHttp_te_skip(http_te_skip);
		setHttp_ce_skip(http_ce_skip);
		setProxy_transfer_mode(proxy_transfer_mode);
		setSasl_ir(sasl_ir);
		setWildcard_enabled(wildcard_enabled);
		setTcp_keepalive(tcp_keepalive);
		setTcp_fastopen(tcp_fastopen);
		setSsl_enable_npn(ssl_enable_npn);
		setSsl_enable_alpn(ssl_enable_alpn);
		setPath_as_is(path_as_is);
		setPipewait(pipewait);
		setSuppress_connect_headers(suppress_connect_headers);
		setDns_shuffle_addresses(dns_shuffle_addresses);
		setStream_depends_e(stream_depends_e);
		setHaproxyprotocol(haproxyprotocol);
		setAbstract_unix_socket(abstract_unix_socket);
		setDisallow_username_in_url(disallow_username_in_url);
		setDoh(doh);
		setDoh_get(doh_get);
		setHttp09_allowed(http09_allowed);
	}
	public UserDefined() {
	}
	
	public _iobuf getErr() {
		return err;
	}
	public void setErr(_iobuf newErr) {
		err = newErr;
	}
	public Object getDebugdata() {
		return debugdata;
	}
	public void setDebugdata(Object newDebugdata) {
		debugdata = newDebugdata;
	}
	public Byte getErrorbuffer() {
		return errorbuffer;
	}
	public void setErrorbuffer(Byte newErrorbuffer) {
		errorbuffer = newErrorbuffer;
	}
	public long getProxyport() {
		return proxyport;
	}
	public void setProxyport(long newProxyport) {
		proxyport = newProxyport;
	}
	public Object getOut() {
		return out;
	}
	public void setOut(Object newOut) {
		out = newOut;
	}
	public Object getIn_set() {
		return in_set;
	}
	public void setIn_set(Object newIn_set) {
		in_set = newIn_set;
	}
	public Object getWriteheader() {
		return writeheader;
	}
	public void setWriteheader(Object newWriteheader) {
		writeheader = newWriteheader;
	}
	public Object getRtp_out() {
		return rtp_out;
	}
	public void setRtp_out(Object newRtp_out) {
		rtp_out = newRtp_out;
	}
	public long getUse_port() {
		return use_port;
	}
	public void setUse_port(long newUse_port) {
		use_port = newUse_port;
	}
	public long getHttpauth() {
		return httpauth;
	}
	public void setHttpauth(long newHttpauth) {
		httpauth = newHttpauth;
	}
	public long getProxyauth() {
		return proxyauth;
	}
	public void setProxyauth(long newProxyauth) {
		proxyauth = newProxyauth;
	}
	public long getSocks5auth() {
		return socks5auth;
	}
	public void setSocks5auth(long newSocks5auth) {
		socks5auth = newSocks5auth;
	}
	public long getFollowlocation() {
		return followlocation;
	}
	public void setFollowlocation(long newFollowlocation) {
		followlocation = newFollowlocation;
	}
	public long getMaxredirs() {
		return maxredirs;
	}
	public void setMaxredirs(long newMaxredirs) {
		maxredirs = newMaxredirs;
	}
	public int getKeep_post() {
		return keep_post;
	}
	public void setKeep_post(int newKeep_post) {
		keep_post = newKeep_post;
	}
	public Object getPostfields() {
		return postfields;
	}
	public void setPostfields(Object newPostfields) {
		postfields = newPostfields;
	}
	public Object getSeek_func() {
		return seek_func;
	}
	public void setSeek_func(Object newSeek_func) {
		seek_func = newSeek_func;
	}
	public Object getPostfieldsize() {
		return postfieldsize;
	}
	public void setPostfieldsize(Object newPostfieldsize) {
		postfieldsize = newPostfieldsize;
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
	public Object getFwrite_func() {
		return fwrite_func;
	}
	public void setFwrite_func(Object newFwrite_func) {
		fwrite_func = newFwrite_func;
	}
	public Object getFwrite_header() {
		return fwrite_header;
	}
	public void setFwrite_header(Object newFwrite_header) {
		fwrite_header = newFwrite_header;
	}
	public Object getFwrite_rtp() {
		return fwrite_rtp;
	}
	public void setFwrite_rtp(Object newFwrite_rtp) {
		fwrite_rtp = newFwrite_rtp;
	}
	public Object getFread_func_set() {
		return fread_func_set;
	}
	public void setFread_func_set(Object newFread_func_set) {
		fread_func_set = newFread_func_set;
	}
	public Object getFprogress() {
		return fprogress;
	}
	public void setFprogress(Object newFprogress) {
		fprogress = newFprogress;
	}
	public Object getFxferinfo() {
		return fxferinfo;
	}
	public void setFxferinfo(Object newFxferinfo) {
		fxferinfo = newFxferinfo;
	}
	public Object getFdebug() {
		return fdebug;
	}
	public void setFdebug(Object newFdebug) {
		fdebug = newFdebug;
	}
	public Object getIoctl_func() {
		return ioctl_func;
	}
	public void setIoctl_func(Object newIoctl_func) {
		ioctl_func = newIoctl_func;
	}
	public Object getFsockopt() {
		return fsockopt;
	}
	public void setFsockopt(Object newFsockopt) {
		fsockopt = newFsockopt;
	}
	public Object getSockopt_client() {
		return sockopt_client;
	}
	public void setSockopt_client(Object newSockopt_client) {
		sockopt_client = newSockopt_client;
	}
	public Object getFopensocket() {
		return fopensocket;
	}
	public void setFopensocket(Object newFopensocket) {
		fopensocket = newFopensocket;
	}
	public Object getOpensocket_client() {
		return opensocket_client;
	}
	public void setOpensocket_client(Object newOpensocket_client) {
		opensocket_client = newOpensocket_client;
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
	public Object getSeek_client() {
		return seek_client;
	}
	public void setSeek_client(Object newSeek_client) {
		seek_client = newSeek_client;
	}
	public Object getConvfromnetwork() {
		return convfromnetwork;
	}
	public void setConvfromnetwork(Object newConvfromnetwork) {
		convfromnetwork = newConvfromnetwork;
	}
	public Object getConvtonetwork() {
		return convtonetwork;
	}
	public void setConvtonetwork(Object newConvtonetwork) {
		convtonetwork = newConvtonetwork;
	}
	public Object getConvfromutf8() {
		return convfromutf8;
	}
	public void setConvfromutf8(Object newConvfromutf8) {
		convfromutf8 = newConvfromutf8;
	}
	public Object getProgress_client() {
		return progress_client;
	}
	public void setProgress_client(Object newProgress_client) {
		progress_client = newProgress_client;
	}
	public Object getIoctl_client() {
		return ioctl_client;
	}
	public void setIoctl_client(Object newIoctl_client) {
		ioctl_client = newIoctl_client;
	}
	public long getTimeout() {
		return timeout;
	}
	public void setTimeout(long newTimeout) {
		timeout = newTimeout;
	}
	public long getConnecttimeout() {
		return connecttimeout;
	}
	public void setConnecttimeout(long newConnecttimeout) {
		connecttimeout = newConnecttimeout;
	}
	public long getAccepttimeout() {
		return accepttimeout;
	}
	public void setAccepttimeout(long newAccepttimeout) {
		accepttimeout = newAccepttimeout;
	}
	public long getHappy_eyeballs_timeout() {
		return happy_eyeballs_timeout;
	}
	public void setHappy_eyeballs_timeout(long newHappy_eyeballs_timeout) {
		happy_eyeballs_timeout = newHappy_eyeballs_timeout;
	}
	public long getServer_response_timeout() {
		return server_response_timeout;
	}
	public void setServer_response_timeout(long newServer_response_timeout) {
		server_response_timeout = newServer_response_timeout;
	}
	public long getMaxage_conn() {
		return maxage_conn;
	}
	public void setMaxage_conn(long newMaxage_conn) {
		maxage_conn = newMaxage_conn;
	}
	public long getTftp_blksize() {
		return tftp_blksize;
	}
	public void setTftp_blksize(long newTftp_blksize) {
		tftp_blksize = newTftp_blksize;
	}
	public Object getFilesize() {
		return filesize;
	}
	public void setFilesize(Object newFilesize) {
		filesize = newFilesize;
	}
	public long getLow_speed_limit() {
		return low_speed_limit;
	}
	public void setLow_speed_limit(long newLow_speed_limit) {
		low_speed_limit = newLow_speed_limit;
	}
	public long getLow_speed_time() {
		return low_speed_time;
	}
	public void setLow_speed_time(long newLow_speed_time) {
		low_speed_time = newLow_speed_time;
	}
	public Object getMax_send_speed() {
		return max_send_speed;
	}
	public void setMax_send_speed(Object newMax_send_speed) {
		max_send_speed = newMax_send_speed;
	}
	public Object getMax_recv_speed() {
		return max_recv_speed;
	}
	public void setMax_recv_speed(Object newMax_recv_speed) {
		max_recv_speed = newMax_recv_speed;
	}
	public Object getSet_resume_from() {
		return set_resume_from;
	}
	public void setSet_resume_from(Object newSet_resume_from) {
		set_resume_from = newSet_resume_from;
	}
	public curl_slist getHeaders() {
		return headers;
	}
	public void setHeaders(curl_slist newHeaders) {
		headers = newHeaders;
	}
	public curl_slist getProxyheaders() {
		return proxyheaders;
	}
	public void setProxyheaders(curl_slist newProxyheaders) {
		proxyheaders = newProxyheaders;
	}
	public curl_httppost getHttppost() {
		return httppost;
	}
	public void setHttppost(curl_httppost newHttppost) {
		httppost = newHttppost;
	}
	public Object getMimepost() {
		return mimepost;
	}
	public void setMimepost(Object newMimepost) {
		mimepost = newMimepost;
	}
	public curl_slist getQuote() {
		return quote;
	}
	public void setQuote(curl_slist newQuote) {
		quote = newQuote;
	}
	public curl_slist getPostquote() {
		return postquote;
	}
	public void setPostquote(curl_slist newPostquote) {
		postquote = newPostquote;
	}
	public curl_slist getPrequote() {
		return prequote;
	}
	public void setPrequote(curl_slist newPrequote) {
		prequote = newPrequote;
	}
	public curl_slist getSource_quote() {
		return source_quote;
	}
	public void setSource_quote(curl_slist newSource_quote) {
		source_quote = newSource_quote;
	}
	public curl_slist getSource_prequote() {
		return source_prequote;
	}
	public void setSource_prequote(curl_slist newSource_prequote) {
		source_prequote = newSource_prequote;
	}
	public curl_slist getSource_postquote() {
		return source_postquote;
	}
	public void setSource_postquote(curl_slist newSource_postquote) {
		source_postquote = newSource_postquote;
	}
	public curl_slist getTelnet_options() {
		return telnet_options;
	}
	public void setTelnet_options(curl_slist newTelnet_options) {
		telnet_options = newTelnet_options;
	}
	public curl_slist getResolve() {
		return resolve;
	}
	public void setResolve(curl_slist newResolve) {
		resolve = newResolve;
	}
	public curl_slist getConnect_to() {
		return connect_to;
	}
	public void setConnect_to(curl_slist newConnect_to) {
		connect_to = newConnect_to;
	}
	public Object getTimecondition() {
		return timecondition;
	}
	public void setTimecondition(Object newTimecondition) {
		timecondition = newTimecondition;
	}
	public Object getTimevalue() {
		return timevalue;
	}
	public void setTimevalue(Object newTimevalue) {
		timevalue = newTimevalue;
	}
	public  getHttpreq() {
		return httpreq;
	}
	public void setHttpreq( newHttpreq) {
		httpreq = newHttpreq;
	}
	public long getHttpversion() {
		return httpversion;
	}
	public void setHttpversion(long newHttpversion) {
		httpversion = newHttpversion;
	}
	public ssl_config_data getSsl() {
		return ssl;
	}
	public void setSsl(ssl_config_data newSsl) {
		ssl = newSsl;
	}
	public ssl_config_data getProxy_ssl() {
		return proxy_ssl;
	}
	public void setProxy_ssl(ssl_config_data newProxy_ssl) {
		proxy_ssl = newProxy_ssl;
	}
	public ssl_general_config getGeneral_ssl() {
		return general_ssl;
	}
	public void setGeneral_ssl(ssl_general_config newGeneral_ssl) {
		general_ssl = newGeneral_ssl;
	}
	public Object getProxytype() {
		return proxytype;
	}
	public void setProxytype(Object newProxytype) {
		proxytype = newProxytype;
	}
	public long getDns_cache_timeout() {
		return dns_cache_timeout;
	}
	public void setDns_cache_timeout(long newDns_cache_timeout) {
		dns_cache_timeout = newDns_cache_timeout;
	}
	public long getBuffer_size() {
		return buffer_size;
	}
	public void setBuffer_size(long newBuffer_size) {
		buffer_size = newBuffer_size;
	}
	public Object getUpload_buffer_size() {
		return upload_buffer_size;
	}
	public void setUpload_buffer_size(Object newUpload_buffer_size) {
		upload_buffer_size = newUpload_buffer_size;
	}
	public Object getPrivate_data() {
		return private_data;
	}
	public void setPrivate_data(Object newPrivate_data) {
		private_data = newPrivate_data;
	}
	public curl_slist getHttp200aliases() {
		return http200aliases;
	}
	public void setHttp200aliases(curl_slist newHttp200aliases) {
		http200aliases = newHttp200aliases;
	}
	public long getIpver() {
		return ipver;
	}
	public void setIpver(long newIpver) {
		ipver = newIpver;
	}
	public Object getMax_filesize() {
		return max_filesize;
	}
	public void setMax_filesize(Object newMax_filesize) {
		max_filesize = newMax_filesize;
	}
	public  getFtp_filemethod() {
		return ftp_filemethod;
	}
	public void setFtp_filemethod( newFtp_filemethod) {
		ftp_filemethod = newFtp_filemethod;
	}
	public Object getFtpsslauth() {
		return ftpsslauth;
	}
	public void setFtpsslauth(Object newFtpsslauth) {
		ftpsslauth = newFtpsslauth;
	}
	public Object getFtp_ccc() {
		return ftp_ccc;
	}
	public void setFtp_ccc(Object newFtp_ccc) {
		ftp_ccc = newFtp_ccc;
	}
	public int getFtp_create_missing_dirs() {
		return ftp_create_missing_dirs;
	}
	public void setFtp_create_missing_dirs(int newFtp_create_missing_dirs) {
		ftp_create_missing_dirs = newFtp_create_missing_dirs;
	}
	public Object getSsh_keyfunc() {
		return ssh_keyfunc;
	}
	public void setSsh_keyfunc(Object newSsh_keyfunc) {
		ssh_keyfunc = newSsh_keyfunc;
	}
	public Object getSsh_keyfunc_userp() {
		return ssh_keyfunc_userp;
	}
	public void setSsh_keyfunc_userp(Object newSsh_keyfunc_userp) {
		ssh_keyfunc_userp = newSsh_keyfunc_userp;
	}
	public CURL_NETRC_OPTION getUse_netrc() {
		return use_netrc;
	}
	public void setUse_netrc(CURL_NETRC_OPTION newUse_netrc) {
		use_netrc = newUse_netrc;
	}
	public Object getUse_ssl() {
		return use_ssl;
	}
	public void setUse_ssl(Object newUse_ssl) {
		use_ssl = newUse_ssl;
	}
	public long getNew_file_perms() {
		return new_file_perms;
	}
	public void setNew_file_perms(long newNew_file_perms) {
		new_file_perms = newNew_file_perms;
	}
	public long getNew_directory_perms() {
		return new_directory_perms;
	}
	public void setNew_directory_perms(long newNew_directory_perms) {
		new_directory_perms = newNew_directory_perms;
	}
	public long getSsh_auth_types() {
		return ssh_auth_types;
	}
	public void setSsh_auth_types(long newSsh_auth_types) {
		ssh_auth_types = newSsh_auth_types;
	}
	public Object getStr() {
		return str;
	}
	public void setStr(Object newStr) {
		str = newStr;
	}
	public int getScope_id() {
		return scope_id;
	}
	public void setScope_id(int newScope_id) {
		scope_id = newScope_id;
	}
	public long getAllowed_protocols() {
		return allowed_protocols;
	}
	public void setAllowed_protocols(long newAllowed_protocols) {
		allowed_protocols = newAllowed_protocols;
	}
	public long getRedir_protocols() {
		return redir_protocols;
	}
	public void setRedir_protocols(long newRedir_protocols) {
		redir_protocols = newRedir_protocols;
	}
	public curl_slist getMail_rcpt() {
		return mail_rcpt;
	}
	public void setMail_rcpt(curl_slist newMail_rcpt) {
		mail_rcpt = newMail_rcpt;
	}
	public  getRtspreq() {
		return rtspreq;
	}
	public void setRtspreq( newRtspreq) {
		rtspreq = newRtspreq;
	}
	public long getRtspversion() {
		return rtspversion;
	}
	public void setRtspversion(long newRtspversion) {
		rtspversion = newRtspversion;
	}
	public Object getChunk_bgn() {
		return chunk_bgn;
	}
	public void setChunk_bgn(Object newChunk_bgn) {
		chunk_bgn = newChunk_bgn;
	}
	public Object getChunk_end() {
		return chunk_end;
	}
	public void setChunk_end(Object newChunk_end) {
		chunk_end = newChunk_end;
	}
	public Object getFnmatch() {
		return fnmatch;
	}
	public void setFnmatch(Object newFnmatch) {
		fnmatch = newFnmatch;
	}
	public Object getFnmatch_data() {
		return fnmatch_data;
	}
	public void setFnmatch_data(Object newFnmatch_data) {
		fnmatch_data = newFnmatch_data;
	}
	public long getGssapi_delegation() {
		return gssapi_delegation;
	}
	public void setGssapi_delegation(long newGssapi_delegation) {
		gssapi_delegation = newGssapi_delegation;
	}
	public long getTcp_keepidle() {
		return tcp_keepidle;
	}
	public void setTcp_keepidle(long newTcp_keepidle) {
		tcp_keepidle = newTcp_keepidle;
	}
	public long getTcp_keepintvl() {
		return tcp_keepintvl;
	}
	public void setTcp_keepintvl(long newTcp_keepintvl) {
		tcp_keepintvl = newTcp_keepintvl;
	}
	public Object getMaxconnects() {
		return maxconnects;
	}
	public void setMaxconnects(Object newMaxconnects) {
		maxconnects = newMaxconnects;
	}
	public long getExpect_100_timeout() {
		return expect_100_timeout;
	}
	public void setExpect_100_timeout(long newExpect_100_timeout) {
		expect_100_timeout = newExpect_100_timeout;
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
	public Curl_http2_dep getStream_dependents() {
		return stream_dependents;
	}
	public void setStream_dependents(Curl_http2_dep newStream_dependents) {
		stream_dependents = newStream_dependents;
	}
	public Object getResolver_start() {
		return resolver_start;
	}
	public void setResolver_start(Object newResolver_start) {
		resolver_start = newResolver_start;
	}
	public Object getResolver_start_client() {
		return resolver_start_client;
	}
	public void setResolver_start_client(Object newResolver_start_client) {
		resolver_start_client = newResolver_start_client;
	}
	public long getUpkeep_interval_ms() {
		return upkeep_interval_ms;
	}
	public void setUpkeep_interval_ms(long newUpkeep_interval_ms) {
		upkeep_interval_ms = newUpkeep_interval_ms;
	}
	public Object getFmultidone() {
		return fmultidone;
	}
	public void setFmultidone(Object newFmultidone) {
		fmultidone = newFmultidone;
	}
	public Curl_easy getDohfor() {
		return dohfor;
	}
	public void setDohfor(Curl_easy newDohfor) {
		dohfor = newDohfor;
	}
	public Object getUh() {
		return uh;
	}
	public void setUh(Object newUh) {
		uh = newUh;
	}
	public Object getTrailer_data() {
		return trailer_data;
	}
	public void setTrailer_data(Object newTrailer_data) {
		trailer_data = newTrailer_data;
	}
	public Object getTrailer_callback() {
		return trailer_callback;
	}
	public void setTrailer_callback(Object newTrailer_callback) {
		trailer_callback = newTrailer_callback;
	}
	public Object getIs_fread_set() {
		return is_fread_set;
	}
	public void setIs_fread_set(Object newIs_fread_set) {
		is_fread_set = newIs_fread_set;
	}
	public Object getIs_fwrite_set() {
		return is_fwrite_set;
	}
	public void setIs_fwrite_set(Object newIs_fwrite_set) {
		is_fwrite_set = newIs_fwrite_set;
	}
	public Object getFree_referer() {
		return free_referer;
	}
	public void setFree_referer(Object newFree_referer) {
		free_referer = newFree_referer;
	}
	public Object getTftp_no_options() {
		return tftp_no_options;
	}
	public void setTftp_no_options(Object newTftp_no_options) {
		tftp_no_options = newTftp_no_options;
	}
	public Object getSep_headers() {
		return sep_headers;
	}
	public void setSep_headers(Object newSep_headers) {
		sep_headers = newSep_headers;
	}
	public Object getCookiesession() {
		return cookiesession;
	}
	public void setCookiesession(Object newCookiesession) {
		cookiesession = newCookiesession;
	}
	public Object getCrlf() {
		return crlf;
	}
	public void setCrlf(Object newCrlf) {
		crlf = newCrlf;
	}
	public Object getStrip_path_slash() {
		return strip_path_slash;
	}
	public void setStrip_path_slash(Object newStrip_path_slash) {
		strip_path_slash = newStrip_path_slash;
	}
	public Object getSsh_compression() {
		return ssh_compression;
	}
	public void setSsh_compression(Object newSsh_compression) {
		ssh_compression = newSsh_compression;
	}
	public Object getGet_filetime() {
		return get_filetime;
	}
	public void setGet_filetime(Object newGet_filetime) {
		get_filetime = newGet_filetime;
	}
	public Object getTunnel_thru_httpproxy() {
		return tunnel_thru_httpproxy;
	}
	public void setTunnel_thru_httpproxy(Object newTunnel_thru_httpproxy) {
		tunnel_thru_httpproxy = newTunnel_thru_httpproxy;
	}
	public Object getPrefer_ascii() {
		return prefer_ascii;
	}
	public void setPrefer_ascii(Object newPrefer_ascii) {
		prefer_ascii = newPrefer_ascii;
	}
	public Object getFtp_append() {
		return ftp_append;
	}
	public void setFtp_append(Object newFtp_append) {
		ftp_append = newFtp_append;
	}
	public Object getFtp_list_only() {
		return ftp_list_only;
	}
	public void setFtp_list_only(Object newFtp_list_only) {
		ftp_list_only = newFtp_list_only;
	}
	public Object getFtp_use_port() {
		return ftp_use_port;
	}
	public void setFtp_use_port(Object newFtp_use_port) {
		ftp_use_port = newFtp_use_port;
	}
	public Object getFtp_use_epsv() {
		return ftp_use_epsv;
	}
	public void setFtp_use_epsv(Object newFtp_use_epsv) {
		ftp_use_epsv = newFtp_use_epsv;
	}
	public Object getFtp_use_eprt() {
		return ftp_use_eprt;
	}
	public void setFtp_use_eprt(Object newFtp_use_eprt) {
		ftp_use_eprt = newFtp_use_eprt;
	}
	public Object getFtp_use_pret() {
		return ftp_use_pret;
	}
	public void setFtp_use_pret(Object newFtp_use_pret) {
		ftp_use_pret = newFtp_use_pret;
	}
	public Object getFtp_skip_ip() {
		return ftp_skip_ip;
	}
	public void setFtp_skip_ip(Object newFtp_skip_ip) {
		ftp_skip_ip = newFtp_skip_ip;
	}
	public Object getHide_progress() {
		return hide_progress;
	}
	public void setHide_progress(Object newHide_progress) {
		hide_progress = newHide_progress;
	}
	public Object getHttp_fail_on_error() {
		return http_fail_on_error;
	}
	public void setHttp_fail_on_error(Object newHttp_fail_on_error) {
		http_fail_on_error = newHttp_fail_on_error;
	}
	public Object getHttp_keep_sending_on_error() {
		return http_keep_sending_on_error;
	}
	public void setHttp_keep_sending_on_error(Object newHttp_keep_sending_on_error) {
		http_keep_sending_on_error = newHttp_keep_sending_on_error;
	}
	public Object getHttp_follow_location() {
		return http_follow_location;
	}
	public void setHttp_follow_location(Object newHttp_follow_location) {
		http_follow_location = newHttp_follow_location;
	}
	public Object getHttp_transfer_encoding() {
		return http_transfer_encoding;
	}
	public void setHttp_transfer_encoding(Object newHttp_transfer_encoding) {
		http_transfer_encoding = newHttp_transfer_encoding;
	}
	public Object getAllow_auth_to_other_hosts() {
		return allow_auth_to_other_hosts;
	}
	public void setAllow_auth_to_other_hosts(Object newAllow_auth_to_other_hosts) {
		allow_auth_to_other_hosts = newAllow_auth_to_other_hosts;
	}
	public Object getInclude_header() {
		return include_header;
	}
	public void setInclude_header(Object newInclude_header) {
		include_header = newInclude_header;
	}
	public Object getHttp_set_referer() {
		return http_set_referer;
	}
	public void setHttp_set_referer(Object newHttp_set_referer) {
		http_set_referer = newHttp_set_referer;
	}
	public Object getHttp_auto_referer() {
		return http_auto_referer;
	}
	public void setHttp_auto_referer(Object newHttp_auto_referer) {
		http_auto_referer = newHttp_auto_referer;
	}
	public Object getOpt_no_body() {
		return opt_no_body;
	}
	public void setOpt_no_body(Object newOpt_no_body) {
		opt_no_body = newOpt_no_body;
	}
	public Object getUpload() {
		return upload;
	}
	public void setUpload(Object newUpload) {
		upload = newUpload;
	}
	public Object getVerbose() {
		return verbose;
	}
	public void setVerbose(Object newVerbose) {
		verbose = newVerbose;
	}
	public Object getKrb() {
		return krb;
	}
	public void setKrb(Object newKrb) {
		krb = newKrb;
	}
	public Object getReuse_forbid() {
		return reuse_forbid;
	}
	public void setReuse_forbid(Object newReuse_forbid) {
		reuse_forbid = newReuse_forbid;
	}
	public Object getReuse_fresh() {
		return reuse_fresh;
	}
	public void setReuse_fresh(Object newReuse_fresh) {
		reuse_fresh = newReuse_fresh;
	}
	public Object getNo_signal() {
		return no_signal;
	}
	public void setNo_signal(Object newNo_signal) {
		no_signal = newNo_signal;
	}
	public Object getTcp_nodelay() {
		return tcp_nodelay;
	}
	public void setTcp_nodelay(Object newTcp_nodelay) {
		tcp_nodelay = newTcp_nodelay;
	}
	public Object getIgnorecl() {
		return ignorecl;
	}
	public void setIgnorecl(Object newIgnorecl) {
		ignorecl = newIgnorecl;
	}
	public Object getConnect_only() {
		return connect_only;
	}
	public void setConnect_only(Object newConnect_only) {
		connect_only = newConnect_only;
	}
	public Object getHttp_te_skip() {
		return http_te_skip;
	}
	public void setHttp_te_skip(Object newHttp_te_skip) {
		http_te_skip = newHttp_te_skip;
	}
	public Object getHttp_ce_skip() {
		return http_ce_skip;
	}
	public void setHttp_ce_skip(Object newHttp_ce_skip) {
		http_ce_skip = newHttp_ce_skip;
	}
	public Object getProxy_transfer_mode() {
		return proxy_transfer_mode;
	}
	public void setProxy_transfer_mode(Object newProxy_transfer_mode) {
		proxy_transfer_mode = newProxy_transfer_mode;
	}
	public Object getSasl_ir() {
		return sasl_ir;
	}
	public void setSasl_ir(Object newSasl_ir) {
		sasl_ir = newSasl_ir;
	}
	public Object getWildcard_enabled() {
		return wildcard_enabled;
	}
	public void setWildcard_enabled(Object newWildcard_enabled) {
		wildcard_enabled = newWildcard_enabled;
	}
	public Object getTcp_keepalive() {
		return tcp_keepalive;
	}
	public void setTcp_keepalive(Object newTcp_keepalive) {
		tcp_keepalive = newTcp_keepalive;
	}
	public Object getTcp_fastopen() {
		return tcp_fastopen;
	}
	public void setTcp_fastopen(Object newTcp_fastopen) {
		tcp_fastopen = newTcp_fastopen;
	}
	public Object getSsl_enable_npn() {
		return ssl_enable_npn;
	}
	public void setSsl_enable_npn(Object newSsl_enable_npn) {
		ssl_enable_npn = newSsl_enable_npn;
	}
	public Object getSsl_enable_alpn() {
		return ssl_enable_alpn;
	}
	public void setSsl_enable_alpn(Object newSsl_enable_alpn) {
		ssl_enable_alpn = newSsl_enable_alpn;
	}
	public Object getPath_as_is() {
		return path_as_is;
	}
	public void setPath_as_is(Object newPath_as_is) {
		path_as_is = newPath_as_is;
	}
	public Object getPipewait() {
		return pipewait;
	}
	public void setPipewait(Object newPipewait) {
		pipewait = newPipewait;
	}
	public Object getSuppress_connect_headers() {
		return suppress_connect_headers;
	}
	public void setSuppress_connect_headers(Object newSuppress_connect_headers) {
		suppress_connect_headers = newSuppress_connect_headers;
	}
	public Object getDns_shuffle_addresses() {
		return dns_shuffle_addresses;
	}
	public void setDns_shuffle_addresses(Object newDns_shuffle_addresses) {
		dns_shuffle_addresses = newDns_shuffle_addresses;
	}
	public Object getStream_depends_e() {
		return stream_depends_e;
	}
	public void setStream_depends_e(Object newStream_depends_e) {
		stream_depends_e = newStream_depends_e;
	}
	public Object getHaproxyprotocol() {
		return haproxyprotocol;
	}
	public void setHaproxyprotocol(Object newHaproxyprotocol) {
		haproxyprotocol = newHaproxyprotocol;
	}
	public Object getAbstract_unix_socket() {
		return abstract_unix_socket;
	}
	public void setAbstract_unix_socket(Object newAbstract_unix_socket) {
		abstract_unix_socket = newAbstract_unix_socket;
	}
	public Object getDisallow_username_in_url() {
		return disallow_username_in_url;
	}
	public void setDisallow_username_in_url(Object newDisallow_username_in_url) {
		disallow_username_in_url = newDisallow_username_in_url;
	}
	public Object getDoh() {
		return doh;
	}
	public void setDoh(Object newDoh) {
		doh = newDoh;
	}
	public Object getDoh_get() {
		return doh_get;
	}
	public void setDoh_get(Object newDoh_get) {
		doh_get = newDoh_get;
	}
	public Object getHttp09_allowed() {
		return http09_allowed;
	}
	public void setHttp09_allowed(Object newHttp09_allowed) {
		http09_allowed = newHttp09_allowed;
	}
}
