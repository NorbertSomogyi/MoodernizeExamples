package application;

/* Always last in the struct */
/* Always last in the struct */
public class OperationConfig {
	private  remote_time;
	private Object random_file;
	private Object egd_file;
	private Object useragent;
	private Object cookie;
	private Object cookiejar;
	private Object cookiefile;
	private Object altsvc;
	private  cookiesession;
	private  encoding;
	private  tr_encoding;
	private long authtype;
	private  use_resume;
	private  resume_from_current;
	private  disable_epsv;
	private  disable_eprt;
	private  ftp_pret;
	private long proto;
	private  proto_present;
	private long proto_redir;
	private  proto_redir_present;
	private Object proto_default;
	private Object resume_from;
	private Object postfields;
	private Object postfieldsize;
	private Object referer;
	private double timeout;
	private double connecttimeout;
	private long maxredirs;
	private Object max_filesize;
	private Object headerfile;
	private Object ftpport;
	private Object iface;
	private long localport;
	private long localportrange;
	private int porttouse;
	private Object range;
	private long low_speed_limit;
	private long low_speed_time;
	private Object dns_servers;
	private Object dns_interface;
	private Object dns_ipv4_addr;
	private Object dns_ipv6_addr;
	private Object userpwd;
	private Object login_options;
	private Object tls_username;
	private Object tls_password;
	private Object tls_authtype;
	private Object proxy_tls_username;
	private Object proxy_tls_password;
	private Object proxy_tls_authtype;
	private Object proxyuserpwd;
	private Object proxy;
	private int proxyver;
	private Object noproxy;
	private Object mail_from;
	private Object mail_rcpt;
	private Object mail_auth;
	private Object sasl_authzid;
	private  sasl_ir;
	private  proxytunnel;
	private  ftp_append;
	private  use_ascii;
	private  autoreferer;
	private  failonerror;
	private  show_headers;
	private  no_body;
	private  dirlistonly;
	private  followlocation;
	private  unrestricted_auth;
	private  netrc_opt;
	private  netrc;
	private Object netrc_file;
	private Object url_list;
	private Object url_last;
	private Object url_get;
	private Object url_out;
	private Object url_ul;
	private Object doh_url;
	private Object cipher_list;
	private Object proxy_cipher_list;
	private Object cipher13_list;
	private Object proxy_cipher13_list;
	private Object cert;
	private Object proxy_cert;
	private Object cert_type;
	private Object proxy_cert_type;
	private Object cacert;
	private Object proxy_cacert;
	private Object capath;
	private Object proxy_capath;
	private Object crlfile;
	private Object proxy_crlfile;
	private Object pinnedpubkey;
	private Object proxy_pinnedpubkey;
	private Object key;
	private Object proxy_key;
	private Object key_type;
	private Object proxy_key_type;
	private Object key_passwd;
	private Object proxy_key_passwd;
	private Object pubkey;
	private Object hostpubmd5;
	private Object engine;
	private  crlf;
	private Object customrequest;
	private Object krblevel;
	private Object request_target;
	private long httpversion;
	private  http09_allowed;
	private  nobuffer;
	private  readbusy;
	private  globoff;
	private  use_httpget;
	private  insecure_ok;
	private  proxy_insecure_ok;
	private  terminal_binary_ok;
	private  verifystatus;
	private  create_dirs;
	private  ftp_create_dirs;
	private  ftp_skip_ip;
	private  proxynegotiate;
	private  proxyntlm;
	private  proxydigest;
	private  proxybasic;
	private  proxyanyauth;
	private Object writeout;
	private Object quote;
	private Object postquote;
	private Object prequote;
	private long ssl_version;
	private long ssl_version_max;
	private long proxy_ssl_version;
	private long ip_version;
	private  timecond;
	private Object condtime;
	private Object headers;
	private Object proxyheaders;
	private Object mimeroot;
	private Object mimecurrent;
	private Object mimepost;
	private Object telnet_options;
	private Object resolve;
	private Object connect_to;
	private  httpreq;
	private Object sendpersecond;
	private Object recvpersecond;
	private  ftp_ssl;
	private  ftp_ssl_reqd;
	private  ftp_ssl_control;
	private  ftp_ssl_ccc;
	private int ftp_ssl_ccc_mode;
	private Object preproxy;
	private int socks5_gssapi_nec;
	private long socks5_auth;
	private Object proxy_service_name;
	private Object service_name;
	private  tcp_nodelay;
	private  tcp_fastopen;
	private long req_retry;
	private  retry_connrefused;
	private long retry_delay;
	private long retry_maxtime;
	private Object ftp_account;
	private Object ftp_alternative_to_user;
	private int ftp_filemethod;
	private long tftp_blksize;
	private  tftp_no_options;
	private  ignorecl;
	private  disable_sessionid;
	private  raw;
	private  post301;
	private  post302;
	private  post303;
	private  nokeepalive;
	private long alivetime;
	private  content_disposition;
	private int default_node_flags;
	private  xattr;
	private long gssapi_delegation;
	private  ssl_allow_beast;
	private  proxy_ssl_allow_beast;
	private  ssl_no_revoke;
	private  use_metalink;
	private Object metalinkfile_list;
	private Object metalinkfile_last;
	private Object oauth_bearer;
	private  nonpn;
	private  noalpn;
	private Object unix_socket_path;
	private  abstract_unix_socket;
	private  falsestart;
	private  path_as_is;
	private double expect100timeout;
	private  suppress_connect_headers;
	private  synthetic_error;
	private  ssh_compression;
	private long happy_eyeballs_timeout_ms;
	private  haproxy_protocol;
	private  disallow_username_in_url;
	private Object global;
	private Object prev;
	private Object next;
	private State state;
	
	public OperationConfig( remote_time, Object random_file, Object egd_file, Object useragent, Object cookie, Object cookiejar, Object cookiefile, Object altsvc,  cookiesession,  encoding,  tr_encoding, long authtype,  use_resume,  resume_from_current,  disable_epsv,  disable_eprt,  ftp_pret, long proto,  proto_present, long proto_redir,  proto_redir_present, Object proto_default, Object resume_from, Object postfields, Object postfieldsize, Object referer, double timeout, double connecttimeout, long maxredirs, Object max_filesize, Object headerfile, Object ftpport, Object iface, long localport, long localportrange, int porttouse, Object range, long low_speed_limit, long low_speed_time, Object dns_servers, Object dns_interface, Object dns_ipv4_addr, Object dns_ipv6_addr, Object userpwd, Object login_options, Object tls_username, Object tls_password, Object tls_authtype, Object proxy_tls_username, Object proxy_tls_password, Object proxy_tls_authtype, Object proxyuserpwd, Object proxy, int proxyver, Object noproxy, Object mail_from, Object mail_rcpt, Object mail_auth, Object sasl_authzid,  sasl_ir,  proxytunnel,  ftp_append,  use_ascii,  autoreferer,  failonerror,  show_headers,  no_body,  dirlistonly,  followlocation,  unrestricted_auth,  netrc_opt,  netrc, Object netrc_file, Object url_list, Object url_last, Object url_get, Object url_out, Object url_ul, Object doh_url, Object cipher_list, Object proxy_cipher_list, Object cipher13_list, Object proxy_cipher13_list, Object cert, Object proxy_cert, Object cert_type, Object proxy_cert_type, Object cacert, Object proxy_cacert, Object capath, Object proxy_capath, Object crlfile, Object proxy_crlfile, Object pinnedpubkey, Object proxy_pinnedpubkey, Object key, Object proxy_key, Object key_type, Object proxy_key_type, Object key_passwd, Object proxy_key_passwd, Object pubkey, Object hostpubmd5, Object engine,  crlf, Object customrequest, Object krblevel, Object request_target, long httpversion,  http09_allowed,  nobuffer,  readbusy,  globoff,  use_httpget,  insecure_ok,  proxy_insecure_ok,  terminal_binary_ok,  verifystatus,  create_dirs,  ftp_create_dirs,  ftp_skip_ip,  proxynegotiate,  proxyntlm,  proxydigest,  proxybasic,  proxyanyauth, Object writeout, Object quote, Object postquote, Object prequote, long ssl_version, long ssl_version_max, long proxy_ssl_version, long ip_version,  timecond, Object condtime, Object headers, Object proxyheaders, Object mimeroot, Object mimecurrent, Object mimepost, Object telnet_options, Object resolve, Object connect_to,  httpreq, Object sendpersecond, Object recvpersecond,  ftp_ssl,  ftp_ssl_reqd,  ftp_ssl_control,  ftp_ssl_ccc, int ftp_ssl_ccc_mode, Object preproxy, int socks5_gssapi_nec, long socks5_auth, Object proxy_service_name, Object service_name,  tcp_nodelay,  tcp_fastopen, long req_retry,  retry_connrefused, long retry_delay, long retry_maxtime, Object ftp_account, Object ftp_alternative_to_user, int ftp_filemethod, long tftp_blksize,  tftp_no_options,  ignorecl,  disable_sessionid,  raw,  post301,  post302,  post303,  nokeepalive, long alivetime,  content_disposition, int default_node_flags,  xattr, long gssapi_delegation,  ssl_allow_beast,  proxy_ssl_allow_beast,  ssl_no_revoke,  use_metalink, Object metalinkfile_list, Object metalinkfile_last, Object oauth_bearer,  nonpn,  noalpn, Object unix_socket_path,  abstract_unix_socket,  falsestart,  path_as_is, double expect100timeout,  suppress_connect_headers,  synthetic_error,  ssh_compression, long happy_eyeballs_timeout_ms,  haproxy_protocol,  disallow_username_in_url, Object global, Object prev, Object next, State state) {
		setRemote_time(remote_time);
		setRandom_file(random_file);
		setEgd_file(egd_file);
		setUseragent(useragent);
		setCookie(cookie);
		setCookiejar(cookiejar);
		setCookiefile(cookiefile);
		setAltsvc(altsvc);
		setCookiesession(cookiesession);
		setEncoding(encoding);
		setTr_encoding(tr_encoding);
		setAuthtype(authtype);
		setUse_resume(use_resume);
		setResume_from_current(resume_from_current);
		setDisable_epsv(disable_epsv);
		setDisable_eprt(disable_eprt);
		setFtp_pret(ftp_pret);
		setProto(proto);
		setProto_present(proto_present);
		setProto_redir(proto_redir);
		setProto_redir_present(proto_redir_present);
		setProto_default(proto_default);
		setResume_from(resume_from);
		setPostfields(postfields);
		setPostfieldsize(postfieldsize);
		setReferer(referer);
		setTimeout(timeout);
		setConnecttimeout(connecttimeout);
		setMaxredirs(maxredirs);
		setMax_filesize(max_filesize);
		setHeaderfile(headerfile);
		setFtpport(ftpport);
		setIface(iface);
		setLocalport(localport);
		setLocalportrange(localportrange);
		setPorttouse(porttouse);
		setRange(range);
		setLow_speed_limit(low_speed_limit);
		setLow_speed_time(low_speed_time);
		setDns_servers(dns_servers);
		setDns_interface(dns_interface);
		setDns_ipv4_addr(dns_ipv4_addr);
		setDns_ipv6_addr(dns_ipv6_addr);
		setUserpwd(userpwd);
		setLogin_options(login_options);
		setTls_username(tls_username);
		setTls_password(tls_password);
		setTls_authtype(tls_authtype);
		setProxy_tls_username(proxy_tls_username);
		setProxy_tls_password(proxy_tls_password);
		setProxy_tls_authtype(proxy_tls_authtype);
		setProxyuserpwd(proxyuserpwd);
		setProxy(proxy);
		setProxyver(proxyver);
		setNoproxy(noproxy);
		setMail_from(mail_from);
		setMail_rcpt(mail_rcpt);
		setMail_auth(mail_auth);
		setSasl_authzid(sasl_authzid);
		setSasl_ir(sasl_ir);
		setProxytunnel(proxytunnel);
		setFtp_append(ftp_append);
		setUse_ascii(use_ascii);
		setAutoreferer(autoreferer);
		setFailonerror(failonerror);
		setShow_headers(show_headers);
		setNo_body(no_body);
		setDirlistonly(dirlistonly);
		setFollowlocation(followlocation);
		setUnrestricted_auth(unrestricted_auth);
		setNetrc_opt(netrc_opt);
		setNetrc(netrc);
		setNetrc_file(netrc_file);
		setUrl_list(url_list);
		setUrl_last(url_last);
		setUrl_get(url_get);
		setUrl_out(url_out);
		setUrl_ul(url_ul);
		setDoh_url(doh_url);
		setCipher_list(cipher_list);
		setProxy_cipher_list(proxy_cipher_list);
		setCipher13_list(cipher13_list);
		setProxy_cipher13_list(proxy_cipher13_list);
		setCert(cert);
		setProxy_cert(proxy_cert);
		setCert_type(cert_type);
		setProxy_cert_type(proxy_cert_type);
		setCacert(cacert);
		setProxy_cacert(proxy_cacert);
		setCapath(capath);
		setProxy_capath(proxy_capath);
		setCrlfile(crlfile);
		setProxy_crlfile(proxy_crlfile);
		setPinnedpubkey(pinnedpubkey);
		setProxy_pinnedpubkey(proxy_pinnedpubkey);
		setKey(key);
		setProxy_key(proxy_key);
		setKey_type(key_type);
		setProxy_key_type(proxy_key_type);
		setKey_passwd(key_passwd);
		setProxy_key_passwd(proxy_key_passwd);
		setPubkey(pubkey);
		setHostpubmd5(hostpubmd5);
		setEngine(engine);
		setCrlf(crlf);
		setCustomrequest(customrequest);
		setKrblevel(krblevel);
		setRequest_target(request_target);
		setHttpversion(httpversion);
		setHttp09_allowed(http09_allowed);
		setNobuffer(nobuffer);
		setReadbusy(readbusy);
		setGloboff(globoff);
		setUse_httpget(use_httpget);
		setInsecure_ok(insecure_ok);
		setProxy_insecure_ok(proxy_insecure_ok);
		setTerminal_binary_ok(terminal_binary_ok);
		setVerifystatus(verifystatus);
		setCreate_dirs(create_dirs);
		setFtp_create_dirs(ftp_create_dirs);
		setFtp_skip_ip(ftp_skip_ip);
		setProxynegotiate(proxynegotiate);
		setProxyntlm(proxyntlm);
		setProxydigest(proxydigest);
		setProxybasic(proxybasic);
		setProxyanyauth(proxyanyauth);
		setWriteout(writeout);
		setQuote(quote);
		setPostquote(postquote);
		setPrequote(prequote);
		setSsl_version(ssl_version);
		setSsl_version_max(ssl_version_max);
		setProxy_ssl_version(proxy_ssl_version);
		setIp_version(ip_version);
		setTimecond(timecond);
		setCondtime(condtime);
		setHeaders(headers);
		setProxyheaders(proxyheaders);
		setMimeroot(mimeroot);
		setMimecurrent(mimecurrent);
		setMimepost(mimepost);
		setTelnet_options(telnet_options);
		setResolve(resolve);
		setConnect_to(connect_to);
		setHttpreq(httpreq);
		setSendpersecond(sendpersecond);
		setRecvpersecond(recvpersecond);
		setFtp_ssl(ftp_ssl);
		setFtp_ssl_reqd(ftp_ssl_reqd);
		setFtp_ssl_control(ftp_ssl_control);
		setFtp_ssl_ccc(ftp_ssl_ccc);
		setFtp_ssl_ccc_mode(ftp_ssl_ccc_mode);
		setPreproxy(preproxy);
		setSocks5_gssapi_nec(socks5_gssapi_nec);
		setSocks5_auth(socks5_auth);
		setProxy_service_name(proxy_service_name);
		setService_name(service_name);
		setTcp_nodelay(tcp_nodelay);
		setTcp_fastopen(tcp_fastopen);
		setReq_retry(req_retry);
		setRetry_connrefused(retry_connrefused);
		setRetry_delay(retry_delay);
		setRetry_maxtime(retry_maxtime);
		setFtp_account(ftp_account);
		setFtp_alternative_to_user(ftp_alternative_to_user);
		setFtp_filemethod(ftp_filemethod);
		setTftp_blksize(tftp_blksize);
		setTftp_no_options(tftp_no_options);
		setIgnorecl(ignorecl);
		setDisable_sessionid(disable_sessionid);
		setRaw(raw);
		setPost301(post301);
		setPost302(post302);
		setPost303(post303);
		setNokeepalive(nokeepalive);
		setAlivetime(alivetime);
		setContent_disposition(content_disposition);
		setDefault_node_flags(default_node_flags);
		setXattr(xattr);
		setGssapi_delegation(gssapi_delegation);
		setSsl_allow_beast(ssl_allow_beast);
		setProxy_ssl_allow_beast(proxy_ssl_allow_beast);
		setSsl_no_revoke(ssl_no_revoke);
		setUse_metalink(use_metalink);
		setMetalinkfile_list(metalinkfile_list);
		setMetalinkfile_last(metalinkfile_last);
		setOauth_bearer(oauth_bearer);
		setNonpn(nonpn);
		setNoalpn(noalpn);
		setUnix_socket_path(unix_socket_path);
		setAbstract_unix_socket(abstract_unix_socket);
		setFalsestart(falsestart);
		setPath_as_is(path_as_is);
		setExpect100timeout(expect100timeout);
		setSuppress_connect_headers(suppress_connect_headers);
		setSynthetic_error(synthetic_error);
		setSsh_compression(ssh_compression);
		setHappy_eyeballs_timeout_ms(happy_eyeballs_timeout_ms);
		setHaproxy_protocol(haproxy_protocol);
		setDisallow_username_in_url(disallow_username_in_url);
		setGlobal(global);
		setPrev(prev);
		setNext(next);
		setState(state);
	}
	public OperationConfig() {
	}
	
	public  getRemote_time() {
		return remote_time;
	}
	public void setRemote_time( newRemote_time) {
		remote_time = newRemote_time;
	}
	public Object getRandom_file() {
		return random_file;
	}
	public void setRandom_file(Object newRandom_file) {
		random_file = newRandom_file;
	}
	public Object getEgd_file() {
		return egd_file;
	}
	public void setEgd_file(Object newEgd_file) {
		egd_file = newEgd_file;
	}
	public Object getUseragent() {
		return useragent;
	}
	public void setUseragent(Object newUseragent) {
		useragent = newUseragent;
	}
	public Object getCookie() {
		return cookie;
	}
	public void setCookie(Object newCookie) {
		cookie = newCookie;
	}
	public Object getCookiejar() {
		return cookiejar;
	}
	public void setCookiejar(Object newCookiejar) {
		cookiejar = newCookiejar;
	}
	public Object getCookiefile() {
		return cookiefile;
	}
	public void setCookiefile(Object newCookiefile) {
		cookiefile = newCookiefile;
	}
	public Object getAltsvc() {
		return altsvc;
	}
	public void setAltsvc(Object newAltsvc) {
		altsvc = newAltsvc;
	}
	public  getCookiesession() {
		return cookiesession;
	}
	public void setCookiesession( newCookiesession) {
		cookiesession = newCookiesession;
	}
	public  getEncoding() {
		return encoding;
	}
	public void setEncoding( newEncoding) {
		encoding = newEncoding;
	}
	public  getTr_encoding() {
		return tr_encoding;
	}
	public void setTr_encoding( newTr_encoding) {
		tr_encoding = newTr_encoding;
	}
	public long getAuthtype() {
		return authtype;
	}
	public void setAuthtype(long newAuthtype) {
		authtype = newAuthtype;
	}
	public  getUse_resume() {
		return use_resume;
	}
	public void setUse_resume( newUse_resume) {
		use_resume = newUse_resume;
	}
	public  getResume_from_current() {
		return resume_from_current;
	}
	public void setResume_from_current( newResume_from_current) {
		resume_from_current = newResume_from_current;
	}
	public  getDisable_epsv() {
		return disable_epsv;
	}
	public void setDisable_epsv( newDisable_epsv) {
		disable_epsv = newDisable_epsv;
	}
	public  getDisable_eprt() {
		return disable_eprt;
	}
	public void setDisable_eprt( newDisable_eprt) {
		disable_eprt = newDisable_eprt;
	}
	public  getFtp_pret() {
		return ftp_pret;
	}
	public void setFtp_pret( newFtp_pret) {
		ftp_pret = newFtp_pret;
	}
	public long getProto() {
		return proto;
	}
	public void setProto(long newProto) {
		proto = newProto;
	}
	public  getProto_present() {
		return proto_present;
	}
	public void setProto_present( newProto_present) {
		proto_present = newProto_present;
	}
	public long getProto_redir() {
		return proto_redir;
	}
	public void setProto_redir(long newProto_redir) {
		proto_redir = newProto_redir;
	}
	public  getProto_redir_present() {
		return proto_redir_present;
	}
	public void setProto_redir_present( newProto_redir_present) {
		proto_redir_present = newProto_redir_present;
	}
	public Object getProto_default() {
		return proto_default;
	}
	public void setProto_default(Object newProto_default) {
		proto_default = newProto_default;
	}
	public Object getResume_from() {
		return resume_from;
	}
	public void setResume_from(Object newResume_from) {
		resume_from = newResume_from;
	}
	public Object getPostfields() {
		return postfields;
	}
	public void setPostfields(Object newPostfields) {
		postfields = newPostfields;
	}
	public Object getPostfieldsize() {
		return postfieldsize;
	}
	public void setPostfieldsize(Object newPostfieldsize) {
		postfieldsize = newPostfieldsize;
	}
	public Object getReferer() {
		return referer;
	}
	public void setReferer(Object newReferer) {
		referer = newReferer;
	}
	public double getTimeout() {
		return timeout;
	}
	public void setTimeout(double newTimeout) {
		timeout = newTimeout;
	}
	public double getConnecttimeout() {
		return connecttimeout;
	}
	public void setConnecttimeout(double newConnecttimeout) {
		connecttimeout = newConnecttimeout;
	}
	public long getMaxredirs() {
		return maxredirs;
	}
	public void setMaxredirs(long newMaxredirs) {
		maxredirs = newMaxredirs;
	}
	public Object getMax_filesize() {
		return max_filesize;
	}
	public void setMax_filesize(Object newMax_filesize) {
		max_filesize = newMax_filesize;
	}
	public Object getHeaderfile() {
		return headerfile;
	}
	public void setHeaderfile(Object newHeaderfile) {
		headerfile = newHeaderfile;
	}
	public Object getFtpport() {
		return ftpport;
	}
	public void setFtpport(Object newFtpport) {
		ftpport = newFtpport;
	}
	public Object getIface() {
		return iface;
	}
	public void setIface(Object newIface) {
		iface = newIface;
	}
	public long getLocalport() {
		return localport;
	}
	public void setLocalport(long newLocalport) {
		localport = newLocalport;
	}
	public long getLocalportrange() {
		return localportrange;
	}
	public void setLocalportrange(long newLocalportrange) {
		localportrange = newLocalportrange;
	}
	public int getPorttouse() {
		return porttouse;
	}
	public void setPorttouse(int newPorttouse) {
		porttouse = newPorttouse;
	}
	public Object getRange() {
		return range;
	}
	public void setRange(Object newRange) {
		range = newRange;
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
	public Object getDns_servers() {
		return dns_servers;
	}
	public void setDns_servers(Object newDns_servers) {
		dns_servers = newDns_servers;
	}
	public Object getDns_interface() {
		return dns_interface;
	}
	public void setDns_interface(Object newDns_interface) {
		dns_interface = newDns_interface;
	}
	public Object getDns_ipv4_addr() {
		return dns_ipv4_addr;
	}
	public void setDns_ipv4_addr(Object newDns_ipv4_addr) {
		dns_ipv4_addr = newDns_ipv4_addr;
	}
	public Object getDns_ipv6_addr() {
		return dns_ipv6_addr;
	}
	public void setDns_ipv6_addr(Object newDns_ipv6_addr) {
		dns_ipv6_addr = newDns_ipv6_addr;
	}
	public Object getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(Object newUserpwd) {
		userpwd = newUserpwd;
	}
	public Object getLogin_options() {
		return login_options;
	}
	public void setLogin_options(Object newLogin_options) {
		login_options = newLogin_options;
	}
	public Object getTls_username() {
		return tls_username;
	}
	public void setTls_username(Object newTls_username) {
		tls_username = newTls_username;
	}
	public Object getTls_password() {
		return tls_password;
	}
	public void setTls_password(Object newTls_password) {
		tls_password = newTls_password;
	}
	public Object getTls_authtype() {
		return tls_authtype;
	}
	public void setTls_authtype(Object newTls_authtype) {
		tls_authtype = newTls_authtype;
	}
	public Object getProxy_tls_username() {
		return proxy_tls_username;
	}
	public void setProxy_tls_username(Object newProxy_tls_username) {
		proxy_tls_username = newProxy_tls_username;
	}
	public Object getProxy_tls_password() {
		return proxy_tls_password;
	}
	public void setProxy_tls_password(Object newProxy_tls_password) {
		proxy_tls_password = newProxy_tls_password;
	}
	public Object getProxy_tls_authtype() {
		return proxy_tls_authtype;
	}
	public void setProxy_tls_authtype(Object newProxy_tls_authtype) {
		proxy_tls_authtype = newProxy_tls_authtype;
	}
	public Object getProxyuserpwd() {
		return proxyuserpwd;
	}
	public void setProxyuserpwd(Object newProxyuserpwd) {
		proxyuserpwd = newProxyuserpwd;
	}
	public Object getProxy() {
		return proxy;
	}
	public void setProxy(Object newProxy) {
		proxy = newProxy;
	}
	public int getProxyver() {
		return proxyver;
	}
	public void setProxyver(int newProxyver) {
		proxyver = newProxyver;
	}
	public Object getNoproxy() {
		return noproxy;
	}
	public void setNoproxy(Object newNoproxy) {
		noproxy = newNoproxy;
	}
	public Object getMail_from() {
		return mail_from;
	}
	public void setMail_from(Object newMail_from) {
		mail_from = newMail_from;
	}
	public Object getMail_rcpt() {
		return mail_rcpt;
	}
	public void setMail_rcpt(Object newMail_rcpt) {
		mail_rcpt = newMail_rcpt;
	}
	public Object getMail_auth() {
		return mail_auth;
	}
	public void setMail_auth(Object newMail_auth) {
		mail_auth = newMail_auth;
	}
	public Object getSasl_authzid() {
		return sasl_authzid;
	}
	public void setSasl_authzid(Object newSasl_authzid) {
		sasl_authzid = newSasl_authzid;
	}
	public  getSasl_ir() {
		return sasl_ir;
	}
	public void setSasl_ir( newSasl_ir) {
		sasl_ir = newSasl_ir;
	}
	public  getProxytunnel() {
		return proxytunnel;
	}
	public void setProxytunnel( newProxytunnel) {
		proxytunnel = newProxytunnel;
	}
	public  getFtp_append() {
		return ftp_append;
	}
	public void setFtp_append( newFtp_append) {
		ftp_append = newFtp_append;
	}
	public  getUse_ascii() {
		return use_ascii;
	}
	public void setUse_ascii( newUse_ascii) {
		use_ascii = newUse_ascii;
	}
	public  getAutoreferer() {
		return autoreferer;
	}
	public void setAutoreferer( newAutoreferer) {
		autoreferer = newAutoreferer;
	}
	public  getFailonerror() {
		return failonerror;
	}
	public void setFailonerror( newFailonerror) {
		failonerror = newFailonerror;
	}
	public  getShow_headers() {
		return show_headers;
	}
	public void setShow_headers( newShow_headers) {
		show_headers = newShow_headers;
	}
	public  getNo_body() {
		return no_body;
	}
	public void setNo_body( newNo_body) {
		no_body = newNo_body;
	}
	public  getDirlistonly() {
		return dirlistonly;
	}
	public void setDirlistonly( newDirlistonly) {
		dirlistonly = newDirlistonly;
	}
	public  getFollowlocation() {
		return followlocation;
	}
	public void setFollowlocation( newFollowlocation) {
		followlocation = newFollowlocation;
	}
	public  getUnrestricted_auth() {
		return unrestricted_auth;
	}
	public void setUnrestricted_auth( newUnrestricted_auth) {
		unrestricted_auth = newUnrestricted_auth;
	}
	public  getNetrc_opt() {
		return netrc_opt;
	}
	public void setNetrc_opt( newNetrc_opt) {
		netrc_opt = newNetrc_opt;
	}
	public  getNetrc() {
		return netrc;
	}
	public void setNetrc( newNetrc) {
		netrc = newNetrc;
	}
	public Object getNetrc_file() {
		return netrc_file;
	}
	public void setNetrc_file(Object newNetrc_file) {
		netrc_file = newNetrc_file;
	}
	public Object getUrl_list() {
		return url_list;
	}
	public void setUrl_list(Object newUrl_list) {
		url_list = newUrl_list;
	}
	public Object getUrl_last() {
		return url_last;
	}
	public void setUrl_last(Object newUrl_last) {
		url_last = newUrl_last;
	}
	public Object getUrl_get() {
		return url_get;
	}
	public void setUrl_get(Object newUrl_get) {
		url_get = newUrl_get;
	}
	public Object getUrl_out() {
		return url_out;
	}
	public void setUrl_out(Object newUrl_out) {
		url_out = newUrl_out;
	}
	public Object getUrl_ul() {
		return url_ul;
	}
	public void setUrl_ul(Object newUrl_ul) {
		url_ul = newUrl_ul;
	}
	public Object getDoh_url() {
		return doh_url;
	}
	public void setDoh_url(Object newDoh_url) {
		doh_url = newDoh_url;
	}
	public Object getCipher_list() {
		return cipher_list;
	}
	public void setCipher_list(Object newCipher_list) {
		cipher_list = newCipher_list;
	}
	public Object getProxy_cipher_list() {
		return proxy_cipher_list;
	}
	public void setProxy_cipher_list(Object newProxy_cipher_list) {
		proxy_cipher_list = newProxy_cipher_list;
	}
	public Object getCipher13_list() {
		return cipher13_list;
	}
	public void setCipher13_list(Object newCipher13_list) {
		cipher13_list = newCipher13_list;
	}
	public Object getProxy_cipher13_list() {
		return proxy_cipher13_list;
	}
	public void setProxy_cipher13_list(Object newProxy_cipher13_list) {
		proxy_cipher13_list = newProxy_cipher13_list;
	}
	public Object getCert() {
		return cert;
	}
	public void setCert(Object newCert) {
		cert = newCert;
	}
	public Object getProxy_cert() {
		return proxy_cert;
	}
	public void setProxy_cert(Object newProxy_cert) {
		proxy_cert = newProxy_cert;
	}
	public Object getCert_type() {
		return cert_type;
	}
	public void setCert_type(Object newCert_type) {
		cert_type = newCert_type;
	}
	public Object getProxy_cert_type() {
		return proxy_cert_type;
	}
	public void setProxy_cert_type(Object newProxy_cert_type) {
		proxy_cert_type = newProxy_cert_type;
	}
	public Object getCacert() {
		return cacert;
	}
	public void setCacert(Object newCacert) {
		cacert = newCacert;
	}
	public Object getProxy_cacert() {
		return proxy_cacert;
	}
	public void setProxy_cacert(Object newProxy_cacert) {
		proxy_cacert = newProxy_cacert;
	}
	public Object getCapath() {
		return capath;
	}
	public void setCapath(Object newCapath) {
		capath = newCapath;
	}
	public Object getProxy_capath() {
		return proxy_capath;
	}
	public void setProxy_capath(Object newProxy_capath) {
		proxy_capath = newProxy_capath;
	}
	public Object getCrlfile() {
		return crlfile;
	}
	public void setCrlfile(Object newCrlfile) {
		crlfile = newCrlfile;
	}
	public Object getProxy_crlfile() {
		return proxy_crlfile;
	}
	public void setProxy_crlfile(Object newProxy_crlfile) {
		proxy_crlfile = newProxy_crlfile;
	}
	public Object getPinnedpubkey() {
		return pinnedpubkey;
	}
	public void setPinnedpubkey(Object newPinnedpubkey) {
		pinnedpubkey = newPinnedpubkey;
	}
	public Object getProxy_pinnedpubkey() {
		return proxy_pinnedpubkey;
	}
	public void setProxy_pinnedpubkey(Object newProxy_pinnedpubkey) {
		proxy_pinnedpubkey = newProxy_pinnedpubkey;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
	public Object getProxy_key() {
		return proxy_key;
	}
	public void setProxy_key(Object newProxy_key) {
		proxy_key = newProxy_key;
	}
	public Object getKey_type() {
		return key_type;
	}
	public void setKey_type(Object newKey_type) {
		key_type = newKey_type;
	}
	public Object getProxy_key_type() {
		return proxy_key_type;
	}
	public void setProxy_key_type(Object newProxy_key_type) {
		proxy_key_type = newProxy_key_type;
	}
	public Object getKey_passwd() {
		return key_passwd;
	}
	public void setKey_passwd(Object newKey_passwd) {
		key_passwd = newKey_passwd;
	}
	public Object getProxy_key_passwd() {
		return proxy_key_passwd;
	}
	public void setProxy_key_passwd(Object newProxy_key_passwd) {
		proxy_key_passwd = newProxy_key_passwd;
	}
	public Object getPubkey() {
		return pubkey;
	}
	public void setPubkey(Object newPubkey) {
		pubkey = newPubkey;
	}
	public Object getHostpubmd5() {
		return hostpubmd5;
	}
	public void setHostpubmd5(Object newHostpubmd5) {
		hostpubmd5 = newHostpubmd5;
	}
	public Object getEngine() {
		return engine;
	}
	public void setEngine(Object newEngine) {
		engine = newEngine;
	}
	public  getCrlf() {
		return crlf;
	}
	public void setCrlf( newCrlf) {
		crlf = newCrlf;
	}
	public Object getCustomrequest() {
		return customrequest;
	}
	public void setCustomrequest(Object newCustomrequest) {
		customrequest = newCustomrequest;
	}
	public Object getKrblevel() {
		return krblevel;
	}
	public void setKrblevel(Object newKrblevel) {
		krblevel = newKrblevel;
	}
	public Object getRequest_target() {
		return request_target;
	}
	public void setRequest_target(Object newRequest_target) {
		request_target = newRequest_target;
	}
	public long getHttpversion() {
		return httpversion;
	}
	public void setHttpversion(long newHttpversion) {
		httpversion = newHttpversion;
	}
	public  getHttp09_allowed() {
		return http09_allowed;
	}
	public void setHttp09_allowed( newHttp09_allowed) {
		http09_allowed = newHttp09_allowed;
	}
	public  getNobuffer() {
		return nobuffer;
	}
	public void setNobuffer( newNobuffer) {
		nobuffer = newNobuffer;
	}
	public  getReadbusy() {
		return readbusy;
	}
	public void setReadbusy( newReadbusy) {
		readbusy = newReadbusy;
	}
	public  getGloboff() {
		return globoff;
	}
	public void setGloboff( newGloboff) {
		globoff = newGloboff;
	}
	public  getUse_httpget() {
		return use_httpget;
	}
	public void setUse_httpget( newUse_httpget) {
		use_httpget = newUse_httpget;
	}
	public  getInsecure_ok() {
		return insecure_ok;
	}
	public void setInsecure_ok( newInsecure_ok) {
		insecure_ok = newInsecure_ok;
	}
	public  getProxy_insecure_ok() {
		return proxy_insecure_ok;
	}
	public void setProxy_insecure_ok( newProxy_insecure_ok) {
		proxy_insecure_ok = newProxy_insecure_ok;
	}
	public  getTerminal_binary_ok() {
		return terminal_binary_ok;
	}
	public void setTerminal_binary_ok( newTerminal_binary_ok) {
		terminal_binary_ok = newTerminal_binary_ok;
	}
	public  getVerifystatus() {
		return verifystatus;
	}
	public void setVerifystatus( newVerifystatus) {
		verifystatus = newVerifystatus;
	}
	public  getCreate_dirs() {
		return create_dirs;
	}
	public void setCreate_dirs( newCreate_dirs) {
		create_dirs = newCreate_dirs;
	}
	public  getFtp_create_dirs() {
		return ftp_create_dirs;
	}
	public void setFtp_create_dirs( newFtp_create_dirs) {
		ftp_create_dirs = newFtp_create_dirs;
	}
	public  getFtp_skip_ip() {
		return ftp_skip_ip;
	}
	public void setFtp_skip_ip( newFtp_skip_ip) {
		ftp_skip_ip = newFtp_skip_ip;
	}
	public  getProxynegotiate() {
		return proxynegotiate;
	}
	public void setProxynegotiate( newProxynegotiate) {
		proxynegotiate = newProxynegotiate;
	}
	public  getProxyntlm() {
		return proxyntlm;
	}
	public void setProxyntlm( newProxyntlm) {
		proxyntlm = newProxyntlm;
	}
	public  getProxydigest() {
		return proxydigest;
	}
	public void setProxydigest( newProxydigest) {
		proxydigest = newProxydigest;
	}
	public  getProxybasic() {
		return proxybasic;
	}
	public void setProxybasic( newProxybasic) {
		proxybasic = newProxybasic;
	}
	public  getProxyanyauth() {
		return proxyanyauth;
	}
	public void setProxyanyauth( newProxyanyauth) {
		proxyanyauth = newProxyanyauth;
	}
	public Object getWriteout() {
		return writeout;
	}
	public void setWriteout(Object newWriteout) {
		writeout = newWriteout;
	}
	public Object getQuote() {
		return quote;
	}
	public void setQuote(Object newQuote) {
		quote = newQuote;
	}
	public Object getPostquote() {
		return postquote;
	}
	public void setPostquote(Object newPostquote) {
		postquote = newPostquote;
	}
	public Object getPrequote() {
		return prequote;
	}
	public void setPrequote(Object newPrequote) {
		prequote = newPrequote;
	}
	public long getSsl_version() {
		return ssl_version;
	}
	public void setSsl_version(long newSsl_version) {
		ssl_version = newSsl_version;
	}
	public long getSsl_version_max() {
		return ssl_version_max;
	}
	public void setSsl_version_max(long newSsl_version_max) {
		ssl_version_max = newSsl_version_max;
	}
	public long getProxy_ssl_version() {
		return proxy_ssl_version;
	}
	public void setProxy_ssl_version(long newProxy_ssl_version) {
		proxy_ssl_version = newProxy_ssl_version;
	}
	public long getIp_version() {
		return ip_version;
	}
	public void setIp_version(long newIp_version) {
		ip_version = newIp_version;
	}
	public  getTimecond() {
		return timecond;
	}
	public void setTimecond( newTimecond) {
		timecond = newTimecond;
	}
	public Object getCondtime() {
		return condtime;
	}
	public void setCondtime(Object newCondtime) {
		condtime = newCondtime;
	}
	public Object getHeaders() {
		return headers;
	}
	public void setHeaders(Object newHeaders) {
		headers = newHeaders;
	}
	public Object getProxyheaders() {
		return proxyheaders;
	}
	public void setProxyheaders(Object newProxyheaders) {
		proxyheaders = newProxyheaders;
	}
	public Object getMimeroot() {
		return mimeroot;
	}
	public void setMimeroot(Object newMimeroot) {
		mimeroot = newMimeroot;
	}
	public Object getMimecurrent() {
		return mimecurrent;
	}
	public void setMimecurrent(Object newMimecurrent) {
		mimecurrent = newMimecurrent;
	}
	public Object getMimepost() {
		return mimepost;
	}
	public void setMimepost(Object newMimepost) {
		mimepost = newMimepost;
	}
	public Object getTelnet_options() {
		return telnet_options;
	}
	public void setTelnet_options(Object newTelnet_options) {
		telnet_options = newTelnet_options;
	}
	public Object getResolve() {
		return resolve;
	}
	public void setResolve(Object newResolve) {
		resolve = newResolve;
	}
	public Object getConnect_to() {
		return connect_to;
	}
	public void setConnect_to(Object newConnect_to) {
		connect_to = newConnect_to;
	}
	public  getHttpreq() {
		return httpreq;
	}
	public void setHttpreq( newHttpreq) {
		httpreq = newHttpreq;
	}
	public Object getSendpersecond() {
		return sendpersecond;
	}
	public void setSendpersecond(Object newSendpersecond) {
		sendpersecond = newSendpersecond;
	}
	public Object getRecvpersecond() {
		return recvpersecond;
	}
	public void setRecvpersecond(Object newRecvpersecond) {
		recvpersecond = newRecvpersecond;
	}
	public  getFtp_ssl() {
		return ftp_ssl;
	}
	public void setFtp_ssl( newFtp_ssl) {
		ftp_ssl = newFtp_ssl;
	}
	public  getFtp_ssl_reqd() {
		return ftp_ssl_reqd;
	}
	public void setFtp_ssl_reqd( newFtp_ssl_reqd) {
		ftp_ssl_reqd = newFtp_ssl_reqd;
	}
	public  getFtp_ssl_control() {
		return ftp_ssl_control;
	}
	public void setFtp_ssl_control( newFtp_ssl_control) {
		ftp_ssl_control = newFtp_ssl_control;
	}
	public  getFtp_ssl_ccc() {
		return ftp_ssl_ccc;
	}
	public void setFtp_ssl_ccc( newFtp_ssl_ccc) {
		ftp_ssl_ccc = newFtp_ssl_ccc;
	}
	public int getFtp_ssl_ccc_mode() {
		return ftp_ssl_ccc_mode;
	}
	public void setFtp_ssl_ccc_mode(int newFtp_ssl_ccc_mode) {
		ftp_ssl_ccc_mode = newFtp_ssl_ccc_mode;
	}
	public Object getPreproxy() {
		return preproxy;
	}
	public void setPreproxy(Object newPreproxy) {
		preproxy = newPreproxy;
	}
	public int getSocks5_gssapi_nec() {
		return socks5_gssapi_nec;
	}
	public void setSocks5_gssapi_nec(int newSocks5_gssapi_nec) {
		socks5_gssapi_nec = newSocks5_gssapi_nec;
	}
	public long getSocks5_auth() {
		return socks5_auth;
	}
	public void setSocks5_auth(long newSocks5_auth) {
		socks5_auth = newSocks5_auth;
	}
	public Object getProxy_service_name() {
		return proxy_service_name;
	}
	public void setProxy_service_name(Object newProxy_service_name) {
		proxy_service_name = newProxy_service_name;
	}
	public Object getService_name() {
		return service_name;
	}
	public void setService_name(Object newService_name) {
		service_name = newService_name;
	}
	public  getTcp_nodelay() {
		return tcp_nodelay;
	}
	public void setTcp_nodelay( newTcp_nodelay) {
		tcp_nodelay = newTcp_nodelay;
	}
	public  getTcp_fastopen() {
		return tcp_fastopen;
	}
	public void setTcp_fastopen( newTcp_fastopen) {
		tcp_fastopen = newTcp_fastopen;
	}
	public long getReq_retry() {
		return req_retry;
	}
	public void setReq_retry(long newReq_retry) {
		req_retry = newReq_retry;
	}
	public  getRetry_connrefused() {
		return retry_connrefused;
	}
	public void setRetry_connrefused( newRetry_connrefused) {
		retry_connrefused = newRetry_connrefused;
	}
	public long getRetry_delay() {
		return retry_delay;
	}
	public void setRetry_delay(long newRetry_delay) {
		retry_delay = newRetry_delay;
	}
	public long getRetry_maxtime() {
		return retry_maxtime;
	}
	public void setRetry_maxtime(long newRetry_maxtime) {
		retry_maxtime = newRetry_maxtime;
	}
	public Object getFtp_account() {
		return ftp_account;
	}
	public void setFtp_account(Object newFtp_account) {
		ftp_account = newFtp_account;
	}
	public Object getFtp_alternative_to_user() {
		return ftp_alternative_to_user;
	}
	public void setFtp_alternative_to_user(Object newFtp_alternative_to_user) {
		ftp_alternative_to_user = newFtp_alternative_to_user;
	}
	public int getFtp_filemethod() {
		return ftp_filemethod;
	}
	public void setFtp_filemethod(int newFtp_filemethod) {
		ftp_filemethod = newFtp_filemethod;
	}
	public long getTftp_blksize() {
		return tftp_blksize;
	}
	public void setTftp_blksize(long newTftp_blksize) {
		tftp_blksize = newTftp_blksize;
	}
	public  getTftp_no_options() {
		return tftp_no_options;
	}
	public void setTftp_no_options( newTftp_no_options) {
		tftp_no_options = newTftp_no_options;
	}
	public  getIgnorecl() {
		return ignorecl;
	}
	public void setIgnorecl( newIgnorecl) {
		ignorecl = newIgnorecl;
	}
	public  getDisable_sessionid() {
		return disable_sessionid;
	}
	public void setDisable_sessionid( newDisable_sessionid) {
		disable_sessionid = newDisable_sessionid;
	}
	public  getRaw() {
		return raw;
	}
	public void setRaw( newRaw) {
		raw = newRaw;
	}
	public  getPost301() {
		return post301;
	}
	public void setPost301( newPost301) {
		post301 = newPost301;
	}
	public  getPost302() {
		return post302;
	}
	public void setPost302( newPost302) {
		post302 = newPost302;
	}
	public  getPost303() {
		return post303;
	}
	public void setPost303( newPost303) {
		post303 = newPost303;
	}
	public  getNokeepalive() {
		return nokeepalive;
	}
	public void setNokeepalive( newNokeepalive) {
		nokeepalive = newNokeepalive;
	}
	public long getAlivetime() {
		return alivetime;
	}
	public void setAlivetime(long newAlivetime) {
		alivetime = newAlivetime;
	}
	public  getContent_disposition() {
		return content_disposition;
	}
	public void setContent_disposition( newContent_disposition) {
		content_disposition = newContent_disposition;
	}
	public int getDefault_node_flags() {
		return default_node_flags;
	}
	public void setDefault_node_flags(int newDefault_node_flags) {
		default_node_flags = newDefault_node_flags;
	}
	public  getXattr() {
		return xattr;
	}
	public void setXattr( newXattr) {
		xattr = newXattr;
	}
	public long getGssapi_delegation() {
		return gssapi_delegation;
	}
	public void setGssapi_delegation(long newGssapi_delegation) {
		gssapi_delegation = newGssapi_delegation;
	}
	public  getSsl_allow_beast() {
		return ssl_allow_beast;
	}
	public void setSsl_allow_beast( newSsl_allow_beast) {
		ssl_allow_beast = newSsl_allow_beast;
	}
	public  getProxy_ssl_allow_beast() {
		return proxy_ssl_allow_beast;
	}
	public void setProxy_ssl_allow_beast( newProxy_ssl_allow_beast) {
		proxy_ssl_allow_beast = newProxy_ssl_allow_beast;
	}
	public  getSsl_no_revoke() {
		return ssl_no_revoke;
	}
	public void setSsl_no_revoke( newSsl_no_revoke) {
		ssl_no_revoke = newSsl_no_revoke;
	}
	public  getUse_metalink() {
		return use_metalink;
	}
	public void setUse_metalink( newUse_metalink) {
		use_metalink = newUse_metalink;
	}
	public Object getMetalinkfile_list() {
		return metalinkfile_list;
	}
	public void setMetalinkfile_list(Object newMetalinkfile_list) {
		metalinkfile_list = newMetalinkfile_list;
	}
	public Object getMetalinkfile_last() {
		return metalinkfile_last;
	}
	public void setMetalinkfile_last(Object newMetalinkfile_last) {
		metalinkfile_last = newMetalinkfile_last;
	}
	public Object getOauth_bearer() {
		return oauth_bearer;
	}
	public void setOauth_bearer(Object newOauth_bearer) {
		oauth_bearer = newOauth_bearer;
	}
	public  getNonpn() {
		return nonpn;
	}
	public void setNonpn( newNonpn) {
		nonpn = newNonpn;
	}
	public  getNoalpn() {
		return noalpn;
	}
	public void setNoalpn( newNoalpn) {
		noalpn = newNoalpn;
	}
	public Object getUnix_socket_path() {
		return unix_socket_path;
	}
	public void setUnix_socket_path(Object newUnix_socket_path) {
		unix_socket_path = newUnix_socket_path;
	}
	public  getAbstract_unix_socket() {
		return abstract_unix_socket;
	}
	public void setAbstract_unix_socket( newAbstract_unix_socket) {
		abstract_unix_socket = newAbstract_unix_socket;
	}
	public  getFalsestart() {
		return falsestart;
	}
	public void setFalsestart( newFalsestart) {
		falsestart = newFalsestart;
	}
	public  getPath_as_is() {
		return path_as_is;
	}
	public void setPath_as_is( newPath_as_is) {
		path_as_is = newPath_as_is;
	}
	public double getExpect100timeout() {
		return expect100timeout;
	}
	public void setExpect100timeout(double newExpect100timeout) {
		expect100timeout = newExpect100timeout;
	}
	public  getSuppress_connect_headers() {
		return suppress_connect_headers;
	}
	public void setSuppress_connect_headers( newSuppress_connect_headers) {
		suppress_connect_headers = newSuppress_connect_headers;
	}
	public  getSynthetic_error() {
		return synthetic_error;
	}
	public void setSynthetic_error( newSynthetic_error) {
		synthetic_error = newSynthetic_error;
	}
	public  getSsh_compression() {
		return ssh_compression;
	}
	public void setSsh_compression( newSsh_compression) {
		ssh_compression = newSsh_compression;
	}
	public long getHappy_eyeballs_timeout_ms() {
		return happy_eyeballs_timeout_ms;
	}
	public void setHappy_eyeballs_timeout_ms(long newHappy_eyeballs_timeout_ms) {
		happy_eyeballs_timeout_ms = newHappy_eyeballs_timeout_ms;
	}
	public  getHaproxy_protocol() {
		return haproxy_protocol;
	}
	public void setHaproxy_protocol( newHaproxy_protocol) {
		haproxy_protocol = newHaproxy_protocol;
	}
	public  getDisallow_username_in_url() {
		return disallow_username_in_url;
	}
	public void setDisallow_username_in_url( newDisallow_username_in_url) {
		disallow_username_in_url = newDisallow_username_in_url;
	}
	public Object getGlobal() {
		return global;
	}
	public void setGlobal(Object newGlobal) {
		global = newGlobal;
	}
	public Object getPrev() {
		return prev;
	}
	public void setPrev(Object newPrev) {
		prev = newPrev;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public State getState() {
		return state;
	}
	public void setState(State newState) {
		state = newState;
	}
}
