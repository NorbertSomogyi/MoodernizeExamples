package application;

/* Always last in the struct */
/* Always last in the struct */
public class OperationConfig {
	private  remote_time;
	private Byte random_file;
	private Byte egd_file;
	private Byte useragent;
	private Byte cookie;
	private Byte cookiejar;
	private Byte cookiefile;
	private Byte altsvc;
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
	private Byte proto_default;
	private Object resume_from;
	private byte[] postfields;
	private Object postfieldsize;
	private Byte referer;
	private double timeout;
	private double connecttimeout;
	private long maxredirs;
	private Object max_filesize;
	private Byte headerfile;
	private Byte ftpport;
	private Byte iface;
	private long localport;
	private long localportrange;
	private int porttouse;
	private Byte range;
	private long low_speed_limit;
	private long low_speed_time;
	private Byte dns_servers;
	private Byte dns_interface;
	private Byte dns_ipv4_addr;
	private Byte dns_ipv6_addr;
	private Byte userpwd;
	private Byte login_options;
	private Byte tls_username;
	private Byte tls_password;
	private Byte tls_authtype;
	private Byte proxy_tls_username;
	private Byte proxy_tls_password;
	private Byte proxy_tls_authtype;
	private Byte proxyuserpwd;
	private Byte proxy;
	private int proxyver;
	private Byte noproxy;
	private Byte mail_from;
	private curl_slist mail_rcpt;
	private Byte mail_auth;
	private Byte sasl_authzid;
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
	private Byte netrc_file;
	private getout url_list;
	private getout url_last;
	private getout url_get;
	private getout url_out;
	private getout url_ul;
	private Byte doh_url;
	private Byte cipher_list;
	private Byte proxy_cipher_list;
	private Byte cipher13_list;
	private Byte proxy_cipher13_list;
	private Byte cert;
	private Byte proxy_cert;
	private Byte cert_type;
	private Byte proxy_cert_type;
	private Byte cacert;
	private Byte proxy_cacert;
	private Byte capath;
	private Byte proxy_capath;
	private Byte crlfile;
	private Byte proxy_crlfile;
	private Byte pinnedpubkey;
	private Byte proxy_pinnedpubkey;
	private Byte key;
	private Byte proxy_key;
	private Byte key_type;
	private Byte proxy_key_type;
	private Byte key_passwd;
	private Byte proxy_key_passwd;
	private Byte pubkey;
	private Byte hostpubmd5;
	private Byte engine;
	private  crlf;
	private Byte customrequest;
	private Byte krblevel;
	private Byte request_target;
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
	private Byte writeout;
	private curl_slist quote;
	private curl_slist postquote;
	private curl_slist prequote;
	private long ssl_version;
	private long ssl_version_max;
	private long proxy_ssl_version;
	private long ip_version;
	private Object timecond;
	private Object condtime;
	private curl_slist headers;
	private curl_slist proxyheaders;
	private tool_mime mimeroot;
	private tool_mime mimecurrent;
	private Object mimepost;
	private curl_slist telnet_options;
	private curl_slist resolve;
	private curl_slist connect_to;
	private  httpreq;
	private Object sendpersecond;
	private Object recvpersecond;
	private  ftp_ssl;
	private  ftp_ssl_reqd;
	private  ftp_ssl_control;
	private  ftp_ssl_ccc;
	private int ftp_ssl_ccc_mode;
	private Byte preproxy;
	private int socks5_gssapi_nec;
	private long socks5_auth;
	private Byte proxy_service_name;
	private Byte service_name;
	private  tcp_nodelay;
	private  tcp_fastopen;
	private long req_retry;
	private  retry_connrefused;
	private long retry_delay;
	private long retry_maxtime;
	private Byte ftp_account;
	private Byte ftp_alternative_to_user;
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
	private metalinkfile metalinkfile_list;
	private metalinkfile metalinkfile_last;
	private Byte oauth_bearer;
	private  nonpn;
	private  noalpn;
	private Byte unix_socket_path;
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
	private GlobalConfig global;
	private OperationConfig prev;
	private OperationConfig next;
	private State state;
	
	public OperationConfig( remote_time, Byte random_file, Byte egd_file, Byte useragent, Byte cookie, Byte cookiejar, Byte cookiefile, Byte altsvc,  cookiesession,  encoding,  tr_encoding, long authtype,  use_resume,  resume_from_current,  disable_epsv,  disable_eprt,  ftp_pret, long proto,  proto_present, long proto_redir,  proto_redir_present, Byte proto_default, Object resume_from, byte[] postfields, Object postfieldsize, Byte referer, double timeout, double connecttimeout, long maxredirs, Object max_filesize, Byte headerfile, Byte ftpport, Byte iface, long localport, long localportrange, int porttouse, Byte range, long low_speed_limit, long low_speed_time, Byte dns_servers, Byte dns_interface, Byte dns_ipv4_addr, Byte dns_ipv6_addr, Byte userpwd, Byte login_options, Byte tls_username, Byte tls_password, Byte tls_authtype, Byte proxy_tls_username, Byte proxy_tls_password, Byte proxy_tls_authtype, Byte proxyuserpwd, Byte proxy, int proxyver, Byte noproxy, Byte mail_from, curl_slist mail_rcpt, Byte mail_auth, Byte sasl_authzid,  sasl_ir,  proxytunnel,  ftp_append,  use_ascii,  autoreferer,  failonerror,  show_headers,  no_body,  dirlistonly,  followlocation,  unrestricted_auth,  netrc_opt,  netrc, Byte netrc_file, getout url_list, getout url_last, getout url_get, getout url_out, getout url_ul, Byte doh_url, Byte cipher_list, Byte proxy_cipher_list, Byte cipher13_list, Byte proxy_cipher13_list, Byte cert, Byte proxy_cert, Byte cert_type, Byte proxy_cert_type, Byte cacert, Byte proxy_cacert, Byte capath, Byte proxy_capath, Byte crlfile, Byte proxy_crlfile, Byte pinnedpubkey, Byte proxy_pinnedpubkey, Byte key, Byte proxy_key, Byte key_type, Byte proxy_key_type, Byte key_passwd, Byte proxy_key_passwd, Byte pubkey, Byte hostpubmd5, Byte engine,  crlf, Byte customrequest, Byte krblevel, Byte request_target, long httpversion,  http09_allowed,  nobuffer,  readbusy,  globoff,  use_httpget,  insecure_ok,  proxy_insecure_ok,  terminal_binary_ok,  verifystatus,  create_dirs,  ftp_create_dirs,  ftp_skip_ip,  proxynegotiate,  proxyntlm,  proxydigest,  proxybasic,  proxyanyauth, Byte writeout, curl_slist quote, curl_slist postquote, curl_slist prequote, long ssl_version, long ssl_version_max, long proxy_ssl_version, long ip_version, Object timecond, Object condtime, curl_slist headers, curl_slist proxyheaders, tool_mime mimeroot, tool_mime mimecurrent, Object mimepost, curl_slist telnet_options, curl_slist resolve, curl_slist connect_to,  httpreq, Object sendpersecond, Object recvpersecond,  ftp_ssl,  ftp_ssl_reqd,  ftp_ssl_control,  ftp_ssl_ccc, int ftp_ssl_ccc_mode, Byte preproxy, int socks5_gssapi_nec, long socks5_auth, Byte proxy_service_name, Byte service_name,  tcp_nodelay,  tcp_fastopen, long req_retry,  retry_connrefused, long retry_delay, long retry_maxtime, Byte ftp_account, Byte ftp_alternative_to_user, int ftp_filemethod, long tftp_blksize,  tftp_no_options,  ignorecl,  disable_sessionid,  raw,  post301,  post302,  post303,  nokeepalive, long alivetime,  content_disposition, int default_node_flags,  xattr, long gssapi_delegation,  ssl_allow_beast,  proxy_ssl_allow_beast,  ssl_no_revoke,  use_metalink, metalinkfile metalinkfile_list, metalinkfile metalinkfile_last, Byte oauth_bearer,  nonpn,  noalpn, Byte unix_socket_path,  abstract_unix_socket,  falsestart,  path_as_is, double expect100timeout,  suppress_connect_headers,  synthetic_error,  ssh_compression, long happy_eyeballs_timeout_ms,  haproxy_protocol,  disallow_username_in_url, GlobalConfig global, OperationConfig prev, OperationConfig next, State state) {
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
	/* keep this as LAST include */
	public void config_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.config, 0, /*Error: Unsupported expression*/);
		ModernizedCProgram.config.setPostfieldsize(-1);
		ModernizedCProgram.config.setUse_httpget(0);
		ModernizedCProgram.config.setCreate_dirs(0);
		ModernizedCProgram.config.setMaxredirs(-1024);
		ModernizedCProgram.config.setProto(CURLPROTO_ALL);
		ModernizedCProgram.config.setProto_present(0);
		ModernizedCProgram.config.setProto_redir(/* All except FILE, SCP and SMB */CURLPROTO_ALL & ~(CURLPROTO_FILE | CURLPROTO_SCP | CURLPROTO_SMB | CURLPROTO_SMBS));
		ModernizedCProgram.config.setProto_redir_present(0);
		ModernizedCProgram.config.setProto_default(((Object)0));
		ModernizedCProgram.config.setTcp_nodelay(/* enabled by default */1);
		ModernizedCProgram.config.setHappy_eyeballs_timeout_ms(CURL_HET_DEFAULT);
		ModernizedCProgram.config.setHttp09_allowed(0);
	}
	public void free_config_fields() {
		getout urlnode = new getout();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getRandom_file()));
			(ModernizedCProgram.config.getRandom_file()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getEgd_file()));
			(ModernizedCProgram.config.getEgd_file()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getUseragent()));
			(ModernizedCProgram.config.getUseragent()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getAltsvc()));
			(ModernizedCProgram.config.getAltsvc()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getCookie()));
			(ModernizedCProgram.config.getCookie()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getCookiejar()));
			(ModernizedCProgram.config.getCookiejar()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getCookiefile()));
			(ModernizedCProgram.config.getCookiefile()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getPostfields()));
			(ModernizedCProgram.config.getPostfields()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getReferer()));
			(ModernizedCProgram.config.getReferer()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getHeaderfile()));
			(ModernizedCProgram.config.getHeaderfile()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getFtpport()));
			(ModernizedCProgram.config.getFtpport()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getIface()));
			(ModernizedCProgram.config.getIface()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getRange()));
			(ModernizedCProgram.config.getRange()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getUserpwd()));
			(ModernizedCProgram.config.getUserpwd()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getTls_username()));
			(ModernizedCProgram.config.getTls_username()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getTls_password()));
			(ModernizedCProgram.config.getTls_password()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getTls_authtype()));
			(ModernizedCProgram.config.getTls_authtype()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_tls_username()));
			(ModernizedCProgram.config.getProxy_tls_username()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_tls_password()));
			(ModernizedCProgram.config.getProxy_tls_password()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_tls_authtype()));
			(ModernizedCProgram.config.getProxy_tls_authtype()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxyuserpwd()));
			(ModernizedCProgram.config.getProxyuserpwd()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy()));
			(ModernizedCProgram.config.getProxy()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getDns_ipv6_addr()));
			(ModernizedCProgram.config.getDns_ipv6_addr()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getDns_ipv4_addr()));
			(ModernizedCProgram.config.getDns_ipv4_addr()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getDns_interface()));
			(ModernizedCProgram.config.getDns_interface()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getDns_servers()));
			(ModernizedCProgram.config.getDns_servers()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getNoproxy()));
			(ModernizedCProgram.config.getNoproxy()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getMail_from()));
			(ModernizedCProgram.config.getMail_from()) = ((Object)0);
		} while (0);
		ModernizedCProgram.config.getMail_rcpt().curl_slist_free_all();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getMail_auth()));
			(ModernizedCProgram.config.getMail_auth()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getNetrc_file()));
			(ModernizedCProgram.config.getNetrc_file()) = ((Object)0);
		} while (0);
		urlnode = ModernizedCProgram.config.getUrl_list();
		getout generatedNext = urlnode.getNext();
		Byte generatedUrl = urlnode.getUrl();
		Byte generatedOutfile = urlnode.getOutfile();
		Byte generatedInfile = urlnode.getInfile();
		while (urlnode) {
			getout next = generatedNext;
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((generatedUrl));
				(generatedUrl) = ((Object)0);
			} while (0);
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((generatedOutfile));
				(generatedOutfile) = ((Object)0);
			} while (0);
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((generatedInfile));
				(generatedInfile) = ((Object)0);
			} while (0);
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((urlnode));
				(urlnode) = ((Object)0);
			} while (0);
			urlnode = next;
		}
		ModernizedCProgram.config.setUrl_list(((Object)0));
		ModernizedCProgram.config.setUrl_last(((Object)0));
		ModernizedCProgram.config.setUrl_get(((Object)0));
		ModernizedCProgram.config.setUrl_out(((Object)0));
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getDoh_url()));
			(ModernizedCProgram.config.getDoh_url()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getCipher_list()));
			(ModernizedCProgram.config.getCipher_list()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_cipher_list()));
			(ModernizedCProgram.config.getProxy_cipher_list()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getCert()));
			(ModernizedCProgram.config.getCert()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_cert()));
			(ModernizedCProgram.config.getProxy_cert()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getCert_type()));
			(ModernizedCProgram.config.getCert_type()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_cert_type()));
			(ModernizedCProgram.config.getProxy_cert_type()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getCacert()));
			(ModernizedCProgram.config.getCacert()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_cacert()));
			(ModernizedCProgram.config.getProxy_cacert()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getCapath()));
			(ModernizedCProgram.config.getCapath()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_capath()));
			(ModernizedCProgram.config.getProxy_capath()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getCrlfile()));
			(ModernizedCProgram.config.getCrlfile()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getPinnedpubkey()));
			(ModernizedCProgram.config.getPinnedpubkey()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_pinnedpubkey()));
			(ModernizedCProgram.config.getProxy_pinnedpubkey()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_crlfile()));
			(ModernizedCProgram.config.getProxy_crlfile()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getKey()));
			(ModernizedCProgram.config.getKey()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_key()));
			(ModernizedCProgram.config.getProxy_key()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getKey_type()));
			(ModernizedCProgram.config.getKey_type()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_key_type()));
			(ModernizedCProgram.config.getProxy_key_type()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getKey_passwd()));
			(ModernizedCProgram.config.getKey_passwd()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_key_passwd()));
			(ModernizedCProgram.config.getProxy_key_passwd()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getPubkey()));
			(ModernizedCProgram.config.getPubkey()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getHostpubmd5()));
			(ModernizedCProgram.config.getHostpubmd5()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getEngine()));
			(ModernizedCProgram.config.getEngine()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getRequest_target()));
			(ModernizedCProgram.config.getRequest_target()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getCustomrequest()));
			(ModernizedCProgram.config.getCustomrequest()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getKrblevel()));
			(ModernizedCProgram.config.getKrblevel()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getOauth_bearer()));
			(ModernizedCProgram.config.getOauth_bearer()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getSasl_authzid()));
			(ModernizedCProgram.config.getSasl_authzid()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getUnix_socket_path()));
			(ModernizedCProgram.config.getUnix_socket_path()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getWriteout()));
			(ModernizedCProgram.config.getWriteout()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProto_default()));
			(ModernizedCProgram.config.getProto_default()) = ((Object)0);
		} while (0);
		ModernizedCProgram.config.getQuote().curl_slist_free_all();
		ModernizedCProgram.config.getPostquote().curl_slist_free_all();
		ModernizedCProgram.config.getPrequote().curl_slist_free_all();
		ModernizedCProgram.config.getHeaders().curl_slist_free_all();
		ModernizedCProgram.config.getProxyheaders().curl_slist_free_all();
		ModernizedCProgram.curl_mime_free(ModernizedCProgram.config.getMimepost());
		ModernizedCProgram.config.setMimepost(((Object)0));
		ModernizedCProgram.config.getMimeroot().tool_mime_free();
		ModernizedCProgram.config.setMimeroot(((Object)0));
		ModernizedCProgram.config.setMimecurrent(((Object)0));
		ModernizedCProgram.config.getTelnet_options().curl_slist_free_all();
		ModernizedCProgram.config.getResolve().curl_slist_free_all();
		ModernizedCProgram.config.getConnect_to().curl_slist_free_all();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getPreproxy()));
			(ModernizedCProgram.config.getPreproxy()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getProxy_service_name()));
			(ModernizedCProgram.config.getProxy_service_name()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getService_name()));
			(ModernizedCProgram.config.getService_name()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getFtp_account()));
			(ModernizedCProgram.config.getFtp_account()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getFtp_alternative_to_user()));
			(ModernizedCProgram.config.getFtp_alternative_to_user()) = ((Object)0);
		} while (0);
	}
	public void config_free() {
		OperationConfig last = ModernizedCProgram.config;
		OperationConfig generatedPrev = last.getPrev();
		while (/* Free each of the structures in reverse order */last) {
			OperationConfig prev = generatedPrev;
			last.free_config_fields();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(last);
			last = prev;
		}
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
	 ***************************************************************************/
	/* use our own printf() functions */
	/* keep this as LAST include */
	public void clean_getout() {
		getout generatedNext = node.getNext();
		Byte generatedUrl = node.getUrl();
		Byte generatedOutfile = node.getOutfile();
		Byte generatedInfile = node.getInfile();
		if (ModernizedCProgram.config) {
			getout next = new getout();
			getout node = ModernizedCProgram.config.getUrl_list();
			while (node) {
				next = generatedNext;
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((generatedUrl));
					(generatedUrl) = ((Object)0);
				} while (0);
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((generatedOutfile));
					(generatedOutfile) = ((Object)0);
				} while (0);
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((generatedInfile));
					(generatedInfile) = ((Object)0);
				} while (0);
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((node));
					(node) = ((Object)0);
				} while (0);
				node = next;
			}
			ModernizedCProgram.config.setUrl_list(((Object)0));
		} 
	}
	/* MSDOS && (__DJGPP__ || __GO32__) */
	/*
	 * Function to find CACert bundle on a Win32 platform using SearchPath.
	 * (SearchPath is already declared via inclusions done in setup header file)
	 * (Use the ASCII version instead of the unicode one!)
	 * The order of the directories it searches is:
	 *  1. application's directory
	 *  2. current working directory
	 *  3. Windows System directory (e.g. C:\windows\system32)
	 *  4. Windows Directory (e.g. C:\windows)
	 *  5. all directories along %PATH%
	 *
	 * For WinXP and later search order actually depends on registry value:
	 * HKLM\SYSTEM\CurrentControlSet\Control\Session Manager\SafeProcessSearchMode
	 */
	public Object FindWin32CACert(Object backend, Object bundle_file) {
		 result = CURLE_OK/* Search and set cert file only if libcurl supports SSL.
		   *
		   * If Schannel is the selected SSL backend then these locations are
		   * ignored. We allow setting CA location for schannel only when explicitly
		   * specified by the user via CURLOPT_CAINFO / --cacert.
		   */;
		if ((ModernizedCProgram.curlinfo.getFeatures() & CURL_VERSION_SSL) && backend != CURLSSLBACKEND_SCHANNEL) {
			DWORD res_len = new DWORD();
			byte[] buf = new byte[260];
			byte ptr = ((Object)0);
			ModernizedCProgram.buf[0] = (byte)'\0';
			res_len = /*Error: Function owner not recognized*/SearchPathA(((Object)0), bundle_file, ((Object)0), 260, ModernizedCProgram.buf, ptr);
			if (res_len > 0) {
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((ModernizedCProgram.config.getCacert()));
					(ModernizedCProgram.config.getCacert()) = ((Object)0);
				} while (0);
				ModernizedCProgram.config.setCacert(/*Error: Function owner not recognized*/strdup(ModernizedCProgram.buf));
				if (!ModernizedCProgram.config.getCacert()) {
					result = CURLE_OUT_OF_MEMORY;
				} 
			} 
		} 
		return result;
	}
	public int SetHTTPrequest( req,  store) {
		/* this mirrors the HttpReq enum in tool_sdecls.h */byte[] reqname = new byte[]{/* unspec */"", "GET (-G, --get)", "HEAD (-I, --head)", "multipart formpost (-F, --form)", "POST (-d, --data)"};
		if ((store == .HTTPREQ_UNSPEC) || (store == req)) {
			store = req;
			return 0;
		} 
		ModernizedCProgram.config.getGlobal().warnf("You can only select one HTTP request method! You asked for both %s and %s.\n", reqname[req], reqname[store]);
		return 1;
	}
	public void customrequest_helper( req, Byte method) {
		/* this mirrors the HttpReq enum in tool_sdecls.h */byte[] dflt = new byte[]{"GET", "GET", "HEAD", "POST", "POST"};
		if (!method) {
			;
		}  else if (ModernizedCProgram.curl_strequal(method, dflt[req])) {
			ModernizedCProgram.config.getGlobal().notef("Unnecessary use of -X or --request, %s is already inferred.\n", dflt[req]);
		}  else if (ModernizedCProgram.curl_strequal(method, "head")) {
			ModernizedCProgram.config.getGlobal().warnf("Setting custom HTTP method to HEAD with -X/--request may not work the way you want. Consider using -I/--head instead.\n");
		} 
	}
	public long proto2num(Long val, Object str) {
		byte buffer;
		byte sep = ",";
		byte token;
		Object[] protos = new Object[]{{"all", CURLPROTO_ALL}, {"http", CURLPROTO_HTTP}, {"https", CURLPROTO_HTTPS}, {"ftp", CURLPROTO_FTP}, {"ftps", CURLPROTO_FTPS}, {"scp", CURLPROTO_SCP}, {"sftp", CURLPROTO_SFTP}, {"telnet", CURLPROTO_TELNET}, {"ldap", CURLPROTO_LDAP}, {"ldaps", CURLPROTO_LDAPS}, {"dict", CURLPROTO_DICT}, {"file", CURLPROTO_FILE}, {"tftp", CURLPROTO_TFTP}, {"imap", CURLPROTO_IMAP}, {"imaps", CURLPROTO_IMAPS}, {"pop3", CURLPROTO_POP3}, {"pop3s", CURLPROTO_POP3S}, {"smtp", CURLPROTO_SMTP}, {"smtps", CURLPROTO_SMTPS}, {"rtsp", CURLPROTO_RTSP}, {"gopher", CURLPROTO_GOPHER}, {"smb", CURLPROTO_SMB}, {"smbs", CURLPROTO_SMBS}, {((Object)0), 0}};
		if (!str) {
			return 1;
		} 
		buffer = /*Error: Function owner not recognized*/strdup(/* because strtok corrupts it */str);
		if (!buffer) {
			return 1;
		} 
		for (token = /*Error: Function owner not recognized*/strtok(buffer, /* Allow strtok() here since this isn't used threaded *//* !checksrc! disable BANNEDFUNC 2 */sep); token; token = /*Error: Function owner not recognized*/strtok(((Object)0), sep)) {
			Object action = e_action.allow;
			sprotos pp = new sprotos();
			while (!(ModernizedCProgram.Curl_isalnum((int)((byte)/* Process token modifiers *//* may be NULL if token is all modifiers */token)))) {
				switch (token++) {
				case (byte)'+':
						e_action.action = e_action.allow;
						break;
				case (byte)'=':
						e_action.action = e_action.set;
						break;
				case (byte)'-':
						e_action.action = e_action.deny;
						break;
				default:
						do {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((buffer));
							(buffer) = ((Object)0);
						} while (0);
						return 1;
				}
			}
			for (pp = protos; pp.getName(); pp++) {
				if (ModernizedCProgram.curl_strequal(token, pp.getName())) {
					switch (e_action.action) {
					case e_action.allow:
							val |=  pp.getBit();
							break;
					case e_action.set:
							val = pp.getBit();
							break;
					case e_action.deny:
							val &=  ~(pp.getBit());
							break;
					}
					break;
				} 
			}
			if (!(pp.getName())) {
				if (e_action.action == e_action.set) {
					val = 0;
				} 
				ModernizedCProgram.config.getGlobal().warnf("unrecognized protocol '%s'\n", token);
			} 
		}
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((buffer));
			(buffer) = ((Object)0);
		} while (0);
		return 0/**
		 * Check if the given string is a protocol supported by libcurl
		 *
		 * @param str  the protocol name
		 * @return PARAM_OK  protocol supported
		 * @return PARAM_LIBCURL_UNSUPPORTED_PROTOCOL  protocol not supported
		 * @return PARAM_REQUIRES_PARAMETER   missing parameter
		 */;
	}
	public int ftpfilemethod(Object str) {
		if (ModernizedCProgram.curl_strequal("singlecwd", str)) {
			return CURLFTPMETHOD_SINGLECWD;
		} 
		if (ModernizedCProgram.curl_strequal("nocwd", str)) {
			return CURLFTPMETHOD_NOCWD;
		} 
		if (ModernizedCProgram.curl_strequal("multicwd", str)) {
			return CURLFTPMETHOD_MULTICWD;
		} 
		ModernizedCProgram.config.getGlobal().warnf("unrecognized ftp file method '%s', using default\n", str);
		return CURLFTPMETHOD_MULTICWD;
	}
	public int ftpcccmethod(Object str) {
		if (ModernizedCProgram.curl_strequal("passive", str)) {
			return CURLFTPSSL_CCC_PASSIVE;
		} 
		if (ModernizedCProgram.curl_strequal("active", str)) {
			return CURLFTPSSL_CCC_ACTIVE;
		} 
		ModernizedCProgram.config.getGlobal().warnf("unrecognized ftp CCC method '%s', using default\n", str);
		return CURLFTPSSL_CCC_PASSIVE;
	}
	public long delegation(Byte str) {
		if (ModernizedCProgram.curl_strequal("none", str)) {
			return CURLGSSAPI_DELEGATION_NONE;
		} 
		if (ModernizedCProgram.curl_strequal("policy", str)) {
			return CURLGSSAPI_DELEGATION_POLICY_FLAG;
		} 
		if (ModernizedCProgram.curl_strequal("always", str)) {
			return CURLGSSAPI_DELEGATION_FLAG;
		} 
		ModernizedCProgram.config.getGlobal().warnf("unrecognized delegation method '%s', using none\n", str);
		return CURLGSSAPI_DELEGATION_NONE/*
		 * my_useragent: returns allocated string with default user agent
		 */;
	}
	public Object get_args(Object i) {
		 result = CURLE_OK;
		bool last = (ModernizedCProgram.config.getNext() ? 0 : 1);
		if (ModernizedCProgram.config.getUserpwd() && !ModernizedCProgram.config.getOauth_bearer()) {
			result = ModernizedCProgram.checkpasswd("host", i, last, ModernizedCProgram.config.getUserpwd());
			if (result) {
				return result;
			} 
		} 
		if (ModernizedCProgram.config.getProxyuserpwd()) {
			result = ModernizedCProgram.checkpasswd("proxy", i, last, ModernizedCProgram.config.getProxyuserpwd());
			if (result) {
				return result;
			} 
		} 
		if (!ModernizedCProgram.config.getUseragent()) {
			ModernizedCProgram.config.setUseragent(ModernizedCProgram.my_useragent());
			if (!ModernizedCProgram.config.getUseragent()) {
				ModernizedCProgram.config.getGlobal().getErrors().helpf("out of memory\n");
				result = CURLE_OUT_OF_MEMORY;
			} 
		} 
		return result/*
		 * Parse the string and modify ssl_version in the val argument. Return PARAM_OK
		 * on success, otherwise a parameter error enum. ONLY ACCEPTS POSITIVE NUMBERS!
		 *
		 * Since this function gets called with the 'nextarg' pointer from within the
		 * getparameter a lot, we must check it for NULL before accessing the str
		 * data.
		 */;
	}
	public void single_transfer_cleanup() {
		 generatedUrls = state.getUrls();
		Byte generatedOutfiles = state.getOutfiles();
		Byte generatedHttpgetfields = state.getHttpgetfields();
		Byte generatedUploadfile = state.getUploadfile();
		 generatedInglob = state.getInglob();
		if (ModernizedCProgram.config) {
			State state = ModernizedCProgram.config.getState();
			if (generatedUrls) {
				generatedUrls.glob_cleanup();
				state.setUrls(((Object)0));
			} 
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((generatedOutfiles));
				(generatedOutfiles) = ((Object)0);
			} while (0);
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((generatedHttpgetfields));
				(generatedHttpgetfields) = ((Object)0);
			} while (0);
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((generatedUploadfile));
				(generatedUploadfile) = ((Object)0);
			} while (0);
			if (generatedInglob) {
				generatedInglob.glob_cleanup();
				state.setInglob(((Object)0));
			} 
		} 
	}
	public int get_param_part(byte endchar, Byte str, Byte pdata, Byte ptype, Byte pfilename, Byte pencoder, Object pheaders) {
		byte p = str;
		byte type = ((Object)0);
		byte filename = ((Object)0);
		byte encoder = ((Object)0);
		byte endpos;
		byte tp;
		byte sep;
		byte[] type_major = "";
		byte[] type_minor = "";
		byte endct = ((Object)0);
		curl_slist headers = ((Object)0);
		if (ptype) {
			ptype = ((Object)0);
		} 
		if (pfilename) {
			pfilename = ((Object)0);
		} 
		if (pheaders) {
			pheaders = ((Object)0);
		} 
		if (pencoder) {
			pencoder = ((Object)0);
		} 
		while ((ModernizedCProgram.Curl_isspace((int)((byte)p)))) {
			p++;
		}
		tp = p;
		pdata = ModernizedCProgram.get_param_word(p, endpos, endchar);
		if (pdata == /* If not quoted, strip trailing spaces. */tp) {
			while (endpos > pdata && (ModernizedCProgram.Curl_isspace((int)((byte)endpos[-1])))) {
				endpos--;
			}
		} 
		sep = p;
		endpos = (byte)'\0';
		while (sep == (byte)';') {
			while ((ModernizedCProgram.Curl_isspace((int)((byte)++p)))) {
				;
			}
			if (!endct && ModernizedCProgram.curl_strnequal("type=", p, /*Error: Function owner not recognized*/strlen("type="))) {
				for (p += 5; (ModernizedCProgram.Curl_isspace((int)((byte)p))); p++) {
					;
				}
				type = /* set type pointer */p;
				if (2 != /*Error: Function owner not recognized*/sscanf(type, "%127[^/ ]/%127[^;, \n]", type_major, /* verify that this is a fine type specifier */type_minor)) {
					ModernizedCProgram.config.getGlobal().warnf("Illegally formatted content-type field!\n");
					headers.curl_slist_free_all();
					return -/* illegal content-type syntax! */1;
				} 
				p = type + /*Error: Function owner not recognized*/strlen(type_major) + /*Error: Function owner not recognized*/strlen(type_minor) + /* now point beyond the content-type specifier */1;
				for (endct = p; p && p != (byte)';' && p != endchar; p++) {
					if (!(ModernizedCProgram.Curl_isspace((int)((byte)p)))) {
						endct = p + 1;
					} 
				}
				sep = p;
			}  else if (ModernizedCProgram.curl_strnequal("filename=", p, /*Error: Function owner not recognized*/strlen("filename="))) {
				if (endct) {
					endct = (byte)'\0';
					endct = ((Object)0);
				} 
				for (p += 9; (ModernizedCProgram.Curl_isspace((int)((byte)p))); p++) {
					;
				}
				tp = p;
				filename = ModernizedCProgram.get_param_word(p, endpos, endchar);
				if (filename == /* If not quoted, strip trailing spaces. */tp) {
					while (endpos > filename && (ModernizedCProgram.Curl_isspace((int)((byte)endpos[-1])))) {
						endpos--;
					}
				} 
				sep = p;
				endpos = (byte)'\0';
			}  else if (ModernizedCProgram.curl_strnequal("headers=", p, /*Error: Function owner not recognized*/strlen("headers="))) {
				if (endct) {
					endct = (byte)'\0';
					endct = ((Object)0);
				} 
				p += 8;
				if (p == (byte)'@' || p == (byte)'<') {
					byte hdrfile;
					FILE fp = new FILE();
					do {
						p++;
					} while ((ModernizedCProgram.Curl_isspace((int)((byte)p))));
					tp = p;
					hdrfile = ModernizedCProgram.get_param_word(p, endpos, endchar);
					if (hdrfile == /* If not quoted, strip trailing spaces. */tp) {
						while (endpos > hdrfile && (ModernizedCProgram.Curl_isspace((int)((byte)endpos[-1])))) {
							endpos--;
						}
					} 
					sep = p;
					endpos = (byte)'\0';
					fp = /*Error: Function owner not recognized*/fopen(hdrfile, "rt");
					if (!fp) {
						ModernizedCProgram.config.getGlobal().warnf("Cannot read from %s: %s\n", hdrfile, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
					} else {
							int i = ModernizedCProgram.read_field_headers(ModernizedCProgram.config, hdrfile, fp, headers);
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(fp);
							if (i) {
								headers.curl_slist_free_all();
								return -1;
							} 
					} 
				} else {
						byte hdr;
						while ((ModernizedCProgram.Curl_isspace((int)((byte)p)))) {
							p++;
						}
						tp = p;
						hdr = ModernizedCProgram.get_param_word(p, endpos, endchar);
						if (hdr == /* If not quoted, strip trailing spaces. */tp) {
							while (endpos > hdr && (ModernizedCProgram.Curl_isspace((int)((byte)endpos[-1])))) {
								endpos--;
							}
						} 
						sep = p;
						endpos = (byte)'\0';
						if (ModernizedCProgram.slist_append(headers, hdr)) {
							ModernizedCProgram.config.getGlobal().getErrors().curl_mfprintf("Out of memory for field header!\n");
							headers.curl_slist_free_all();
							return -1;
						} 
				} 
			}  else if (ModernizedCProgram.curl_strnequal("encoder=", p, /*Error: Function owner not recognized*/strlen("encoder="))) {
				if (endct) {
					endct = (byte)'\0';
					endct = ((Object)0);
				} 
				for (p += 8; (ModernizedCProgram.Curl_isspace((int)((byte)p))); p++) {
					;
				}
				tp = p;
				encoder = ModernizedCProgram.get_param_word(p, endpos, endchar);
				if (encoder == /* If not quoted, strip trailing spaces. */tp) {
					while (endpos > encoder && (ModernizedCProgram.Curl_isspace((int)((byte)endpos[-1])))) {
						endpos--;
					}
				} 
				sep = p;
				endpos = (byte)'\0';
			}  else if (endct) {
				for (endct = p; p && p != (byte)';' && p != endchar; /* This is part of content type. */p++) {
					if (!(ModernizedCProgram.Curl_isspace((int)((byte)p)))) {
						endct = p + 1;
					} 
				}
				sep = p;
			} else {
					byte unknown = ModernizedCProgram.get_param_word(p, endpos, /* unknown prefix, skip to next block */endchar);
					sep = p;
					endpos = (byte)'\0';
					if (unknown) {
						ModernizedCProgram.config.getGlobal().warnf("skip unknown form field: %s\n", unknown);
					} 
			} 
		}
		if (/* Terminate content type. */endct) {
			endct = (byte)'\0';
		} 
		if (ptype) {
			ptype = type;
		}  else if (type) {
			ModernizedCProgram.config.getGlobal().warnf("Field content type not allowed here: %s\n", type);
		} 
		if (pfilename) {
			pfilename = filename;
		}  else if (filename) {
			ModernizedCProgram.config.getGlobal().warnf("Field file name not allowed here: %s\n", filename);
		} 
		if (pencoder) {
			pencoder = encoder;
		}  else if (encoder) {
			ModernizedCProgram.config.getGlobal().warnf("Field encoder not allowed here: %s\n", encoder);
		} 
		Object generatedCurl_slist = headers.getCurl_slist();
		if (pheaders) {
			pheaders = headers;
		}  else if (headers) {
			ModernizedCProgram.config.getGlobal().warnf("Field headers not allowed here: %s\n", generatedCurl_slist);
			headers.curl_slist_free_all();
		} 
		str = p;
		return sep & -1024/***************************************************************************
		 *
		 * formparse()
		 *
		 * Reads a 'name=value' parameter and builds the appropriate linked list.
		 *
		 * If the value is of the form '<filename', field data is read from the
		 * given file.
		
		 * Specify files to upload with 'name=@filename', or 'name=@"filename"'
		 * in case the filename contain ',' or ';'. Supports specified
		 * given Content-Type of the files. Such as ';type=<content-type>'.
		 *
		 * If literal_value is set, any initial '@' or '<' in the value string
		 * loses its special meaning, as does any embedded ';type='.
		 *
		 * You may specify more than one file for a single name (field). Specify
		 * multiple files by writing it like:
		 *
		 * 'name=@filename,filename2,filename3'
		 *
		 * or use double-quotes quote the filename:
		 *
		 * 'name=@"filename","filename2","filename3"'
		 *
		 * If you want content-types specified for each too, write them like:
		 *
		 * 'name=@filename;type=image/gif,filename2,filename3'
		 *
		 * If you want custom headers added for a single part, write them in a separate
		 * file and do like this:
		 *
		 * 'name=foo;headers=@headerfile' or why not
		 * 'name=@filemame;headers=@headerfile'
		 *
		 * To upload a file, but to fake the file name that will be included in the
		 * formpost, do like this:
		 *
		 * 'name=@filename;filename=/dev/null' or quote the faked filename like:
		 * 'name=@filename;filename="play, play, and play.txt"'
		 *
		 * If filename/path contains ',' or ';', it must be quoted by double-quotes,
		 * else curl will fail to figure out the correct filename. if the filename
		 * tobe quoted contains '"' or '\', '"' and '\' must be escaped by backslash.
		 *
		 ***************************************************************************/;
	}
	public  getRemote_time() {
		return remote_time;
	}
	public void setRemote_time( newRemote_time) {
		remote_time = newRemote_time;
	}
	public Byte getRandom_file() {
		return random_file;
	}
	public void setRandom_file(Byte newRandom_file) {
		random_file = newRandom_file;
	}
	public Byte getEgd_file() {
		return egd_file;
	}
	public void setEgd_file(Byte newEgd_file) {
		egd_file = newEgd_file;
	}
	public Byte getUseragent() {
		return useragent;
	}
	public void setUseragent(Byte newUseragent) {
		useragent = newUseragent;
	}
	public Byte getCookie() {
		return cookie;
	}
	public void setCookie(Byte newCookie) {
		cookie = newCookie;
	}
	public Byte getCookiejar() {
		return cookiejar;
	}
	public void setCookiejar(Byte newCookiejar) {
		cookiejar = newCookiejar;
	}
	public Byte getCookiefile() {
		return cookiefile;
	}
	public void setCookiefile(Byte newCookiefile) {
		cookiefile = newCookiefile;
	}
	public Byte getAltsvc() {
		return altsvc;
	}
	public void setAltsvc(Byte newAltsvc) {
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
	public Byte getProto_default() {
		return proto_default;
	}
	public void setProto_default(Byte newProto_default) {
		proto_default = newProto_default;
	}
	public Object getResume_from() {
		return resume_from;
	}
	public void setResume_from(Object newResume_from) {
		resume_from = newResume_from;
	}
	public byte[] getPostfields() {
		return postfields;
	}
	public void setPostfields(byte[] newPostfields) {
		postfields = newPostfields;
	}
	public Object getPostfieldsize() {
		return postfieldsize;
	}
	public void setPostfieldsize(Object newPostfieldsize) {
		postfieldsize = newPostfieldsize;
	}
	public Byte getReferer() {
		return referer;
	}
	public void setReferer(Byte newReferer) {
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
	public Byte getHeaderfile() {
		return headerfile;
	}
	public void setHeaderfile(Byte newHeaderfile) {
		headerfile = newHeaderfile;
	}
	public Byte getFtpport() {
		return ftpport;
	}
	public void setFtpport(Byte newFtpport) {
		ftpport = newFtpport;
	}
	public Byte getIface() {
		return iface;
	}
	public void setIface(Byte newIface) {
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
	public Byte getRange() {
		return range;
	}
	public void setRange(Byte newRange) {
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
	public Byte getDns_servers() {
		return dns_servers;
	}
	public void setDns_servers(Byte newDns_servers) {
		dns_servers = newDns_servers;
	}
	public Byte getDns_interface() {
		return dns_interface;
	}
	public void setDns_interface(Byte newDns_interface) {
		dns_interface = newDns_interface;
	}
	public Byte getDns_ipv4_addr() {
		return dns_ipv4_addr;
	}
	public void setDns_ipv4_addr(Byte newDns_ipv4_addr) {
		dns_ipv4_addr = newDns_ipv4_addr;
	}
	public Byte getDns_ipv6_addr() {
		return dns_ipv6_addr;
	}
	public void setDns_ipv6_addr(Byte newDns_ipv6_addr) {
		dns_ipv6_addr = newDns_ipv6_addr;
	}
	public Byte getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(Byte newUserpwd) {
		userpwd = newUserpwd;
	}
	public Byte getLogin_options() {
		return login_options;
	}
	public void setLogin_options(Byte newLogin_options) {
		login_options = newLogin_options;
	}
	public Byte getTls_username() {
		return tls_username;
	}
	public void setTls_username(Byte newTls_username) {
		tls_username = newTls_username;
	}
	public Byte getTls_password() {
		return tls_password;
	}
	public void setTls_password(Byte newTls_password) {
		tls_password = newTls_password;
	}
	public Byte getTls_authtype() {
		return tls_authtype;
	}
	public void setTls_authtype(Byte newTls_authtype) {
		tls_authtype = newTls_authtype;
	}
	public Byte getProxy_tls_username() {
		return proxy_tls_username;
	}
	public void setProxy_tls_username(Byte newProxy_tls_username) {
		proxy_tls_username = newProxy_tls_username;
	}
	public Byte getProxy_tls_password() {
		return proxy_tls_password;
	}
	public void setProxy_tls_password(Byte newProxy_tls_password) {
		proxy_tls_password = newProxy_tls_password;
	}
	public Byte getProxy_tls_authtype() {
		return proxy_tls_authtype;
	}
	public void setProxy_tls_authtype(Byte newProxy_tls_authtype) {
		proxy_tls_authtype = newProxy_tls_authtype;
	}
	public Byte getProxyuserpwd() {
		return proxyuserpwd;
	}
	public void setProxyuserpwd(Byte newProxyuserpwd) {
		proxyuserpwd = newProxyuserpwd;
	}
	public Byte getProxy() {
		return proxy;
	}
	public void setProxy(Byte newProxy) {
		proxy = newProxy;
	}
	public int getProxyver() {
		return proxyver;
	}
	public void setProxyver(int newProxyver) {
		proxyver = newProxyver;
	}
	public Byte getNoproxy() {
		return noproxy;
	}
	public void setNoproxy(Byte newNoproxy) {
		noproxy = newNoproxy;
	}
	public Byte getMail_from() {
		return mail_from;
	}
	public void setMail_from(Byte newMail_from) {
		mail_from = newMail_from;
	}
	public curl_slist getMail_rcpt() {
		return mail_rcpt;
	}
	public void setMail_rcpt(curl_slist newMail_rcpt) {
		mail_rcpt = newMail_rcpt;
	}
	public Byte getMail_auth() {
		return mail_auth;
	}
	public void setMail_auth(Byte newMail_auth) {
		mail_auth = newMail_auth;
	}
	public Byte getSasl_authzid() {
		return sasl_authzid;
	}
	public void setSasl_authzid(Byte newSasl_authzid) {
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
	public Byte getNetrc_file() {
		return netrc_file;
	}
	public void setNetrc_file(Byte newNetrc_file) {
		netrc_file = newNetrc_file;
	}
	public getout getUrl_list() {
		return url_list;
	}
	public void setUrl_list(getout newUrl_list) {
		url_list = newUrl_list;
	}
	public getout getUrl_last() {
		return url_last;
	}
	public void setUrl_last(getout newUrl_last) {
		url_last = newUrl_last;
	}
	public getout getUrl_get() {
		return url_get;
	}
	public void setUrl_get(getout newUrl_get) {
		url_get = newUrl_get;
	}
	public getout getUrl_out() {
		return url_out;
	}
	public void setUrl_out(getout newUrl_out) {
		url_out = newUrl_out;
	}
	public getout getUrl_ul() {
		return url_ul;
	}
	public void setUrl_ul(getout newUrl_ul) {
		url_ul = newUrl_ul;
	}
	public Byte getDoh_url() {
		return doh_url;
	}
	public void setDoh_url(Byte newDoh_url) {
		doh_url = newDoh_url;
	}
	public Byte getCipher_list() {
		return cipher_list;
	}
	public void setCipher_list(Byte newCipher_list) {
		cipher_list = newCipher_list;
	}
	public Byte getProxy_cipher_list() {
		return proxy_cipher_list;
	}
	public void setProxy_cipher_list(Byte newProxy_cipher_list) {
		proxy_cipher_list = newProxy_cipher_list;
	}
	public Byte getCipher13_list() {
		return cipher13_list;
	}
	public void setCipher13_list(Byte newCipher13_list) {
		cipher13_list = newCipher13_list;
	}
	public Byte getProxy_cipher13_list() {
		return proxy_cipher13_list;
	}
	public void setProxy_cipher13_list(Byte newProxy_cipher13_list) {
		proxy_cipher13_list = newProxy_cipher13_list;
	}
	public Byte getCert() {
		return cert;
	}
	public void setCert(Byte newCert) {
		cert = newCert;
	}
	public Byte getProxy_cert() {
		return proxy_cert;
	}
	public void setProxy_cert(Byte newProxy_cert) {
		proxy_cert = newProxy_cert;
	}
	public Byte getCert_type() {
		return cert_type;
	}
	public void setCert_type(Byte newCert_type) {
		cert_type = newCert_type;
	}
	public Byte getProxy_cert_type() {
		return proxy_cert_type;
	}
	public void setProxy_cert_type(Byte newProxy_cert_type) {
		proxy_cert_type = newProxy_cert_type;
	}
	public Byte getCacert() {
		return cacert;
	}
	public void setCacert(Byte newCacert) {
		cacert = newCacert;
	}
	public Byte getProxy_cacert() {
		return proxy_cacert;
	}
	public void setProxy_cacert(Byte newProxy_cacert) {
		proxy_cacert = newProxy_cacert;
	}
	public Byte getCapath() {
		return capath;
	}
	public void setCapath(Byte newCapath) {
		capath = newCapath;
	}
	public Byte getProxy_capath() {
		return proxy_capath;
	}
	public void setProxy_capath(Byte newProxy_capath) {
		proxy_capath = newProxy_capath;
	}
	public Byte getCrlfile() {
		return crlfile;
	}
	public void setCrlfile(Byte newCrlfile) {
		crlfile = newCrlfile;
	}
	public Byte getProxy_crlfile() {
		return proxy_crlfile;
	}
	public void setProxy_crlfile(Byte newProxy_crlfile) {
		proxy_crlfile = newProxy_crlfile;
	}
	public Byte getPinnedpubkey() {
		return pinnedpubkey;
	}
	public void setPinnedpubkey(Byte newPinnedpubkey) {
		pinnedpubkey = newPinnedpubkey;
	}
	public Byte getProxy_pinnedpubkey() {
		return proxy_pinnedpubkey;
	}
	public void setProxy_pinnedpubkey(Byte newProxy_pinnedpubkey) {
		proxy_pinnedpubkey = newProxy_pinnedpubkey;
	}
	public Byte getKey() {
		return key;
	}
	public void setKey(Byte newKey) {
		key = newKey;
	}
	public Byte getProxy_key() {
		return proxy_key;
	}
	public void setProxy_key(Byte newProxy_key) {
		proxy_key = newProxy_key;
	}
	public Byte getKey_type() {
		return key_type;
	}
	public void setKey_type(Byte newKey_type) {
		key_type = newKey_type;
	}
	public Byte getProxy_key_type() {
		return proxy_key_type;
	}
	public void setProxy_key_type(Byte newProxy_key_type) {
		proxy_key_type = newProxy_key_type;
	}
	public Byte getKey_passwd() {
		return key_passwd;
	}
	public void setKey_passwd(Byte newKey_passwd) {
		key_passwd = newKey_passwd;
	}
	public Byte getProxy_key_passwd() {
		return proxy_key_passwd;
	}
	public void setProxy_key_passwd(Byte newProxy_key_passwd) {
		proxy_key_passwd = newProxy_key_passwd;
	}
	public Byte getPubkey() {
		return pubkey;
	}
	public void setPubkey(Byte newPubkey) {
		pubkey = newPubkey;
	}
	public Byte getHostpubmd5() {
		return hostpubmd5;
	}
	public void setHostpubmd5(Byte newHostpubmd5) {
		hostpubmd5 = newHostpubmd5;
	}
	public Byte getEngine() {
		return engine;
	}
	public void setEngine(Byte newEngine) {
		engine = newEngine;
	}
	public  getCrlf() {
		return crlf;
	}
	public void setCrlf( newCrlf) {
		crlf = newCrlf;
	}
	public Byte getCustomrequest() {
		return customrequest;
	}
	public void setCustomrequest(Byte newCustomrequest) {
		customrequest = newCustomrequest;
	}
	public Byte getKrblevel() {
		return krblevel;
	}
	public void setKrblevel(Byte newKrblevel) {
		krblevel = newKrblevel;
	}
	public Byte getRequest_target() {
		return request_target;
	}
	public void setRequest_target(Byte newRequest_target) {
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
	public Byte getWriteout() {
		return writeout;
	}
	public void setWriteout(Byte newWriteout) {
		writeout = newWriteout;
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
	public Object getTimecond() {
		return timecond;
	}
	public void setTimecond(Object newTimecond) {
		timecond = newTimecond;
	}
	public Object getCondtime() {
		return condtime;
	}
	public void setCondtime(Object newCondtime) {
		condtime = newCondtime;
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
	public tool_mime getMimeroot() {
		return mimeroot;
	}
	public void setMimeroot(tool_mime newMimeroot) {
		mimeroot = newMimeroot;
	}
	public tool_mime getMimecurrent() {
		return mimecurrent;
	}
	public void setMimecurrent(tool_mime newMimecurrent) {
		mimecurrent = newMimecurrent;
	}
	public Object getMimepost() {
		return mimepost;
	}
	public void setMimepost(Object newMimepost) {
		mimepost = newMimepost;
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
	public Byte getPreproxy() {
		return preproxy;
	}
	public void setPreproxy(Byte newPreproxy) {
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
	public Byte getProxy_service_name() {
		return proxy_service_name;
	}
	public void setProxy_service_name(Byte newProxy_service_name) {
		proxy_service_name = newProxy_service_name;
	}
	public Byte getService_name() {
		return service_name;
	}
	public void setService_name(Byte newService_name) {
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
	public Byte getFtp_account() {
		return ftp_account;
	}
	public void setFtp_account(Byte newFtp_account) {
		ftp_account = newFtp_account;
	}
	public Byte getFtp_alternative_to_user() {
		return ftp_alternative_to_user;
	}
	public void setFtp_alternative_to_user(Byte newFtp_alternative_to_user) {
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
	public metalinkfile getMetalinkfile_list() {
		return metalinkfile_list;
	}
	public void setMetalinkfile_list(metalinkfile newMetalinkfile_list) {
		metalinkfile_list = newMetalinkfile_list;
	}
	public metalinkfile getMetalinkfile_last() {
		return metalinkfile_last;
	}
	public void setMetalinkfile_last(metalinkfile newMetalinkfile_last) {
		metalinkfile_last = newMetalinkfile_last;
	}
	public Byte getOauth_bearer() {
		return oauth_bearer;
	}
	public void setOauth_bearer(Byte newOauth_bearer) {
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
	public Byte getUnix_socket_path() {
		return unix_socket_path;
	}
	public void setUnix_socket_path(Byte newUnix_socket_path) {
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
	public GlobalConfig getGlobal() {
		return global;
	}
	public void setGlobal(GlobalConfig newGlobal) {
		global = newGlobal;
	}
	public OperationConfig getPrev() {
		return prev;
	}
	public void setPrev(OperationConfig newPrev) {
		prev = newPrev;
	}
	public OperationConfig getNext() {
		return next;
	}
	public void setNext(OperationConfig newNext) {
		next = newNext;
	}
	public State getState() {
		return state;
	}
	public void setState(State newState) {
		state = newState;
	}
}
