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
	private Curl_easy data;
	private curl_llist_element bundle_node;
	private Curl_chunker chunk;
	private Object fclosesocket;
	private Object closesocket_client;
	private long connection_id;
	private Curl_dns_entry dns_entry;
	private Curl_addrinfo ip_addr;
	private Object tempaddr;
	private Object ip_addr_str;
	private int scope_id;
	private  transport;
	private hostname host;
	private Byte hostname_resolve;
	private Byte secondaryhostname;
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
	private Byte user;
	private Byte passwd;
	private Byte options;
	private Byte oauth_bearer;
	private Byte sasl_authzid;
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
	private Byte trailer;
	private int trlMax;
	private int trlPos;
	private  proto;
	private int cselect_bits;
	private int waitfor;
	private Byte localdev;
	private int localport;
	private int localportrange;
	private http_connect_state connect_state;
	private connectbundle bundle;
	private int negnpn;
	private Object tls_upgraded;
	private Object readchannel_inuse;
	private Object writechannel_inuse;
	
	public connectdata(Curl_easy data, curl_llist_element bundle_node, Curl_chunker chunk, Object fclosesocket, Object closesocket_client, long connection_id, Curl_dns_entry dns_entry, Curl_addrinfo ip_addr, Object tempaddr, Object ip_addr_str, int scope_id,  transport, hostname host, Byte hostname_resolve, Byte secondaryhostname, hostname conn_to_host, proxy_info socks_proxy, proxy_info http_proxy, long port, int remote_port, int conn_to_port, int secondary_port, Object primary_ip, long primary_port, Object local_ip, long local_port, Byte user, Byte passwd, Byte options, Byte oauth_bearer, Byte sasl_authzid, int httpversion, int rtspversion, curltime now, curltime created, curltime lastused, Object sock, Object tempsock, Object sock_accepted, Object recv, Object send, Object postponed, Object ssl, Object proxy_ssl, ssl_primary_config ssl_config, ssl_primary_config proxy_ssl_config, ConnectBits bits, curltime connecttime, int num_addr, Object timeoutms_per_addr, Object handler, Object given, long ip_version, curltime keepalive, long upkeep_interval_ms, Object sockfd, Object writesockfd, dynamically_allocated_data allocptr, curl_llist easyq, Object seek_func, Object seek_client,  http_ntlm_state,  proxy_ntlm_state, ntlmdata ntlm, ntlmdata proxyntlm, Curl_async async, Byte trailer, int trlMax, int trlPos,  proto, int cselect_bits, int waitfor, Byte localdev, int localport, int localportrange, http_connect_state connect_state, connectbundle bundle, int negnpn, Object tls_upgraded, Object readchannel_inuse, Object writechannel_inuse) {
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
	
	public void Curl_sasl_cleanup(int authused) {
		ntlmdata generatedNtlm = this.getNtlm();
		if (authused == (1 << /* Cleanup the NTLM structure */6)) {
			generatedNtlm.Curl_auth_cleanup_ntlm();
		} 
	}
	/* Cleanup the gssapi structure */
	/* Use ansi error strings in UNICODE builds */
	public Object Curl_ldap( done) {
		 result = CURLE_OK;
		int rc = 0;
		LDAP server = ((Object)0);
		CURL_LDAPURLDesc ludp = ((Object)0);
		LDAPMessage ldapmsg = ((Object)0);
		LDAPMessage entryIterator = new LDAPMessage();
		int num = 0;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		int ldap_proto = 3;
		int ldap_ssl = 0;
		byte val_b64 = ((Object)0);
		size_t val_b64_sz = 0;
		 dlsize = 0/* 10 sec connection/search timeout */;
		TCHAR host = ((Object)0);
		byte user = ((Object)0);
		byte passwd = ((Object)0);
		done = /* unconditionally */1;
		data.Curl_infof("LDAP local: LDAP Vendor = %s ; LDAP Version = %d\n", "Microsoft Corporation.", 510);
		Object generatedChange = data.getChange();
		data.Curl_infof("LDAP local: %s\n", generatedChange.getUrl());
		rc = ludp._ldap_url_parse(conn);
		if (rc != 0) {
			data.Curl_failf("LDAP local: %s", .ldap_err2stringA(rc));
			result = CURLE_LDAP_INVALID_URL;
			;
		} 
		Object generatedGiven = this.getGiven();
		if (generatedGiven.getFlags() & (1 << /* Get the URL scheme (either ldap or ldaps) */0)) {
			ldap_ssl = 1;
		} 
		data.Curl_infof("LDAP local: trying to establish %s connection\n", ldap_ssl ? "encrypted" : "cleartext");
		hostname generatedHost = this.getHost();
		Byte generatedName = generatedHost.getName();
		host = (generatedName);
		if (!host) {
			result = CURLE_OUT_OF_MEMORY;
			;
		} 
		ConnectBits generatedBits = this.getBits();
		Object generatedUser_passwd = generatedBits.getUser_passwd();
		Byte generatedUser = this.getUser();
		Byte generatedPasswd = this.getPasswd();
		if (generatedUser_passwd) {
			user = generatedUser;
			passwd = generatedPasswd;
		} 
		.ldap_set_optionA(((Object)0), -1024, ldap_proto);
		long generatedPort = this.getPort();
		Object generatedDispname = generatedHost.getDispname();
		if (ldap_ssl) {
			server = .ldap_sslinitA(host, (int)generatedPort, /* Win32 LDAP SDK doesn't support insecure mode without CA! */1);
			.ldap_set_optionA(server, -1024, ((Object)1));
		} else {
				server = .ldap_initA(host, (int)generatedPort);
				if (server == ((Object)0)) {
					data.Curl_failf("LDAP local: Cannot connect to %s:%ld", generatedDispname, generatedPort);
					result = CURLE_COULDNT_CONNECT;
					;
				} 
		} 
		/*
		    rc = ldap_start_tls_s(server, NULL, NULL);
		    if(rc != LDAP_SUCCESS) {
		      failf(data, "LDAP local: ERROR starting SSL/TLS mode: %s",
		              ldap_err2string(rc));
		      result = CURLE_SSL_CERTPROBLEM;
		      goto quit;
		    }
		*//*
		    rc = ldap_start_tls_s(server, NULL, NULL);
		    if(rc != LDAP_SUCCESS) {
		      failf(data, "LDAP local: ERROR starting SSL/TLS mode: %s",
		              ldap_err2string(rc));
		      result = CURLE_SSL_CERTPROBLEM;
		      goto quit;
		    }
		*/.ldap_set_optionA(server, -1024, ldap_proto);
		rc = ModernizedCProgram.ldap_win_bind(conn, server, user, passwd);
		if (!ldap_ssl && rc != 0) {
			ldap_proto = 2;
			.ldap_set_optionA(server, -1024, ldap_proto);
			rc = ModernizedCProgram.ldap_win_bind(conn, server, user, passwd);
		} 
		if (rc != 0) {
			data.Curl_failf("LDAP local: bind via ldap_win_bind %s", .ldap_err2stringA(rc));
			result = CURLE_LDAP_CANNOT_BIND;
			;
		} 
		Object generatedLud_dn = ludp.getLud_dn();
		Object generatedLud_scope = ludp.getLud_scope();
		Object generatedLud_filter = ludp.getLud_filter();
		Object generatedLud_attrs = ludp.getLud_attrs();
		rc = .ldap_search_sA(server, generatedLud_dn, generatedLud_scope, generatedLud_filter, generatedLud_attrs, 0, ldapmsg);
		if (rc != 0 && rc != -1024) {
			data.Curl_failf("LDAP remote: %s", .ldap_err2stringA(rc));
			result = CURLE_LDAP_SEARCH_FAILED;
			;
		} 
		for (; entryIterator; ) {
			BerElement ber = ((Object)0);
			TCHAR attribute = new TCHAR();
			int i;
			{ 
				byte name;
				size_t name_len = new size_t();
				TCHAR dn = .ldap_get_dnA(server, entryIterator);
				ModernizedCProgram.name = (dn);
				if (!ModernizedCProgram.name) {
					.ldap_memfreeA(dn);
					result = CURLE_OUT_OF_MEMORY;
					;
				} 
				name_len = .strlen(ModernizedCProgram.name);
				result = conn.Curl_client_write((1 << 0), (byte)"DN: ", 4);
				if (result) {
					do {
						(ModernizedCProgram.name) = ((Object)0);
					} while (0);
					.ldap_memfreeA(dn);
					;
				} 
				result = conn.Curl_client_write((1 << 0), (byte)ModernizedCProgram.name, name_len);
				if (result) {
					do {
						(ModernizedCProgram.name) = ((Object)0);
					} while (0);
					.ldap_memfreeA(dn);
					;
				} 
				result = conn.Curl_client_write((1 << 0), (byte)"\n", 1);
				if (result) {
					do {
						(ModernizedCProgram.name) = ((Object)0);
					} while (0);
					.ldap_memfreeA(dn);
					;
				} 
				dlsize += name_len + 5;
				do {
					(ModernizedCProgram.name) = ((Object)0);
				} while (0);
				.ldap_memfreeA(dn);
			}
			for (attribute = .ldap_first_attributeA(server, entryIterator, /* Get the attributes and write them to the client */ber); attribute; attribute = .ldap_next_attributeA(server, entryIterator, ber)) {
				BerValue vals = new BerValue();
				size_t attr_len = new size_t();
				byte attr = (attribute);
				if (!attr) {
					if (ber) {
						.ber_free(ber, 0);
					} 
					result = CURLE_OUT_OF_MEMORY;
					;
				} 
				attr_len = .strlen(attr);
				vals = .ldap_get_values_lenA(server, entryIterator, attribute);
				if (vals != ((Object)0)) {
					for (i = 0; (vals[i] != ((Object)0)); i++) {
						result = conn.Curl_client_write((1 << 0), (byte)"\t", 1);
						if (result) {
							.ldap_value_free_len(vals);
							do {
								(attr) = ((Object)0);
							} while (0);
							.ldap_memfreeA(attribute);
							if (ber) {
								.ber_free(ber, 0);
							} 
							;
						} 
						result = conn.Curl_client_write((1 << 0), (byte)attr, attr_len);
						if (result) {
							.ldap_value_free_len(vals);
							do {
								(attr) = ((Object)0);
							} while (0);
							.ldap_memfreeA(attribute);
							if (ber) {
								.ber_free(ber, 0);
							} 
							;
						} 
						result = conn.Curl_client_write((1 << 0), (byte)": ", 2);
						if (result) {
							.ldap_value_free_len(vals);
							do {
								(attr) = ((Object)0);
							} while (0);
							.ldap_memfreeA(attribute);
							if (ber) {
								.ber_free(ber, 0);
							} 
							;
						} 
						dlsize += attr_len + 3;
						if ((attr_len > 7) && (.strcmp(";binary", (byte)attr + (attr_len - 7)) == 0)) {
							result = /* Binary attribute, encode to base64. */data.Curl_base64_encode(vals[i].getBv_val(), vals[i].getBv_len(), val_b64, val_b64_sz);
							if (result) {
								.ldap_value_free_len(vals);
								do {
									(attr) = ((Object)0);
								} while (0);
								.ldap_memfreeA(attribute);
								if (ber) {
									.ber_free(ber, 0);
								} 
								;
							} 
							if (val_b64_sz > 0) {
								result = conn.Curl_client_write((1 << 0), val_b64, val_b64_sz);
								.Curl_cfree(val_b64);
								if (result) {
									.ldap_value_free_len(vals);
									do {
										(attr) = ((Object)0);
									} while (0);
									.ldap_memfreeA(attribute);
									if (ber) {
										.ber_free(ber, 0);
									} 
									;
								} 
								dlsize += val_b64_sz;
							} 
						} else {
								result = conn.Curl_client_write((1 << 0), vals[i].getBv_val(), vals[i].getBv_len());
								if (result) {
									.ldap_value_free_len(vals);
									do {
										(attr) = ((Object)0);
									} while (0);
									.ldap_memfreeA(attribute);
									if (ber) {
										.ber_free(ber, 0);
									} 
									;
								} 
								dlsize += vals[i].getBv_len();
						} 
						result = conn.Curl_client_write((1 << 0), (byte)"\n", 1);
						if (result) {
							.ldap_value_free_len(vals);
							do {
								(attr) = ((Object)0);
							} while (0);
							.ldap_memfreeA(attribute);
							if (ber) {
								.ber_free(ber, 0);
							} 
							;
						} 
						dlsize++;
					}
					.ldap_value_free_len(/* Free memory used to store values */vals);
				} 
				do {
					(attr) = ((Object)0);
				} while (/* Free the attribute as we are done with it */0);
				.ldap_memfreeA(attribute);
				result = conn.Curl_client_write((1 << 0), (byte)"\n", 1);
				if (result) {
					;
				} 
				dlsize++;
				data.Curl_pgrsSetDownloadCounter(dlsize);
			}
			if (ber) {
				.ber_free(ber, 0);
			} 
		}
		if (rc == -1024) {
			data.Curl_infof("There are more than %d entries\n", num);
		} 
		if (ludp) {
			ludp._ldap_free_urldesc();
		} 
		if (server) {
			.ldap_unbind_s(server);
		} 
		do {
			(host) = ((Object)0);
		} while (/* HAVE_LDAP_SSL && CURL_HAS_NOVELL_LDAPSDK */0);
		data.Curl_setup_transfer(-1, -1, 0, -/* no data to transfer */1);
		conn.Curl_conncontrol(1);
		return result;
	}
	/*
	 * LDAP protocol handler.
	 */
	/***********************************************************************
	 *
	 * smtp_endofresp()
	 *
	 * Checks for an ending SMTP status code at the start of the given string, but
	 * also detects various capabilities from the EHLO response including the
	 * supported authentication mechanisms.
	 */
	public  smtp_endofresp(Byte line, Object len, int resp) {
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		bool result = 0;
		if (len < 4 || !(ModernizedCProgram.Curl_isdigit((int)((byte)line[0]))) || !(ModernizedCProgram.Curl_isdigit((int)((byte)line[1]))) || !(ModernizedCProgram.Curl_isdigit((int)((byte)line[/* Nothing for us */2])))) {
			return 0/* Do we have a command response? This should be the response code followed
			     by a space and optionally some text as per RFC-5321 and as outlined in
			     Section 4. Examples of RFC-4954 but some e-mail servers ignore this and
			     only send the response code instead as per Section 4.2. */;
		} 
		 generatedState = smtpc.getState();
		if (line[3] == (byte)' ' || len == 5) {
			byte[] tmpline = new byte[6];
			result = 1;
			.memset(tmpline, (byte)'\0', );
			.memcpy(tmpline, line, (len == 5 ? 5 : 3));
			resp = ModernizedCProgram.curlx_sltosi(.strtol(tmpline, ((Object)0), 10));
			if (resp == /* Make sure real server never sends internal value */1) {
				resp = 0;
			} 
		}  else if (line[3] == /* Do we have a multiline (continuation) response? */(byte)'-' && (generatedState == .SMTP_EHLO || generatedState == .SMTP_COMMAND)) {
			result = 1;
			resp = /* Internal response code */1;
		} 
		return result/***********************************************************************
		 *
		 * smtp_get_message()
		 *
		 * Gets the authentication message from the response buffer.
		 */;
	}
	public Object smtp_perform_ehlo() {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		SASL generatedSasl = smtpc.getSasl();
		generatedSasl.setAuthmechs(/* No known auth. mechanism yet */0);
		generatedSasl.setAuthused(/* Clear the authentication mechanism
		                                             used for esmtp connections */0);
		smtpc.setTls_supported(/* Clear the TLS capability */0);
		smtpc.setAuth_supported(/* Clear the AUTH capability */0);
		pingpong generatedPp = smtpc.getPp();
		Byte generatedDomain = smtpc.getDomain();
		result = generatedPp.Curl_pp_sendf("EHLO %s", generatedDomain);
		if (!result) {
			ModernizedCProgram.state(conn, .SMTP_EHLO);
		} 
		return result/***********************************************************************
		 *
		 * smtp_perform_helo()
		 *
		 * Sends the HELO command to initialise communication with the SMTP server.
		 */;
	}
	public Object smtp_perform_helo() {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		SASL generatedSasl = smtpc.getSasl();
		generatedSasl.setAuthused(/* No authentication mechanism used
		                                            in smtp connections */0);
		pingpong generatedPp = smtpc.getPp();
		Byte generatedDomain = smtpc.getDomain();
		result = generatedPp.Curl_pp_sendf("HELO %s", generatedDomain);
		if (!result) {
			ModernizedCProgram.state(conn, .SMTP_HELO);
		} 
		return result/***********************************************************************
		 *
		 * smtp_perform_starttls()
		 *
		 * Sends the STLS command to start the upgrade to TLS.
		 */;
	}
	public Object smtp_perform_starttls() {
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		 result = generatedSmtpc.getPp().Curl_pp_sendf("%s", /* Send the STARTTLS command */"STARTTLS");
		if (!result) {
			ModernizedCProgram.state(conn, .SMTP_STARTTLS);
		} 
		return result/***********************************************************************
		 *
		 * smtp_perform_upgrade_tls()
		 *
		 * Performs the upgrade to TLS.
		 */;
	}
	public Object smtp_perform_upgrade_tls() {
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		 generatedSsldone = smtpc.getSsldone();
		 result = .Curl_ssl_connect_nonblocking(conn, 0, generatedSsldone);
		 generatedState = smtpc.getState();
		if (!result) {
			if (generatedState != .SMTP_UPGRADETLS) {
				ModernizedCProgram.state(conn, .SMTP_UPGRADETLS);
			} 
			if (generatedSsldone) {
				do {
				} while (0);
				result = conn.smtp_perform_ehlo();
			} 
		} 
		return result/***********************************************************************
		 *
		 * smtp_perform_auth()
		 *
		 * Sends an AUTH command allowing the client to login with the given SASL
		 * authentication mechanism.
		 */;
	}
	public Object smtp_perform_auth(Object mech, Object initresp) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		pingpong generatedPp = smtpc.getPp();
		if (/* AUTH <mech> ...<crlf> */initresp) {
			result = generatedPp.Curl_pp_sendf("AUTH %s %s", mech, /* Send the AUTH command with the initial response */initresp);
		} else {
				result = generatedPp.Curl_pp_sendf("AUTH %s", /* Send the AUTH command */mech);
		} 
		return result/***********************************************************************
		 *
		 * smtp_continue_auth()
		 *
		 * Sends SASL continuation data or cancellation.
		 */;
	}
	public Object smtp_continue_auth(Object resp) {
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		pingpong generatedPp = smtpc.getPp();
		return generatedPp.Curl_pp_sendf("%s", resp/***********************************************************************
		 *
		 * smtp_perform_authentication()
		 *
		 * Initiates the authentication sequence, with the appropriate SASL
		 * authentication mechanism.
		 */);
	}
	public Object smtp_perform_authentication() {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		saslprogress progress = new saslprogress();
		 generatedAuth_supported = smtpc.getAuth_supported();
		SASL generatedSasl = smtpc.getSasl();
		if (!generatedAuth_supported || !ModernizedCProgram.Curl_sasl_can_authenticate(generatedSasl, conn)) {
			ModernizedCProgram.state(conn, .SMTP_STOP);
			return result;
		} 
		result = ModernizedCProgram.Curl_sasl_start(generatedSasl, conn, 0, /* Calculate the SASL login details */progress);
		Curl_easy generatedData = this.getData();
		if (!result) {
			if (progress == .SASL_INPROGRESS) {
				ModernizedCProgram.state(conn, .SMTP_AUTH);
			} else {
					generatedData.Curl_infof(/* Other mechanisms not supported */"No known authentication mechanisms supported!\n");
					result = CURLE_LOGIN_DENIED;
			} 
		} 
		return result/***********************************************************************
		 *
		 * smtp_perform_command()
		 *
		 * Sends a SMTP based command.
		 */;
	}
	public Object smtp_perform_command() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		SMTP smtp = generatedReq.getProtop();
		curl_slist generatedRcpt = smtp.getRcpt();
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		Byte generatedCustom = smtp.getCustom();
		Object generatedCurl_slist = generatedRcpt.getCurl_slist();
		if (generatedRcpt) {
			result = generatedSmtpc.getPp().Curl_pp_sendf("%s %s", generatedCustom && generatedCustom[0] != (byte)'\0' ? generatedCustom : "VRFY", generatedCurl_slist);
		} else {
				result = generatedSmtpc.getPp().Curl_pp_sendf("%s", generatedCustom && generatedCustom[0] != (byte)'\0' ? generatedCustom : "HELP");
		} 
		if (!result) {
			ModernizedCProgram.state(conn, .SMTP_COMMAND);
		} 
		return result/***********************************************************************
		 *
		 * smtp_perform_mail()
		 *
		 * Sends an MAIL command to initiate the upload of a message.
		 */;
	}
	public Object smtp_perform_mail() {
		byte from = ((Object)0);
		byte auth = ((Object)0);
		byte size = ((Object)0);
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedSet = data.getSet();
		if (!generatedSet.getStr()[/* Calculate the FROM parameter */dupstring.STRING_MAIL_FROM]) {
			from = .Curl_cstrdup(/* Null reverse-path, RFC-5321, sect. 3.6.3 */"<>");
		}  else if (generatedSet.getStr()[dupstring.STRING_MAIL_FROM][0] == (byte)'<') {
			from = ModernizedCProgram.curl_maprintf("%s", generatedSet.getStr()[dupstring.STRING_MAIL_FROM]);
		} else {
				from = ModernizedCProgram.curl_maprintf("<%s>", generatedSet.getStr()[dupstring.STRING_MAIL_FROM]);
		} 
		if (!from) {
			return CURLE_OUT_OF_MEMORY;
		} 
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		if (generatedSet.getStr()[dupstring.STRING_MAIL_AUTH] && generatedSmtpc.getSasl().getAuthused()) {
			if (generatedSet.getStr()[dupstring.STRING_MAIL_AUTH][0] != (byte)'\0') {
				auth = ModernizedCProgram.curl_maprintf("%s", generatedSet.getStr()[dupstring.STRING_MAIL_AUTH]);
			} else {
					auth = .Curl_cstrdup(/* Empty AUTH, RFC-2554, sect. 5 */"<>");
			} 
			if (!auth) {
				.Curl_cfree(from);
				return CURLE_OUT_OF_MEMORY;
			} 
		} 
		Object generatedState = data.getState();
		if (generatedSet.getMimepost().getKind() != /* Prepare the mime data if some. */mimekind.MIMEKIND_NONE) {
			generatedSet.getMimepost().getFlags() &=  ~(1 << /* Use the whole structure as data. */1);
			generatedSet.getHeaders().curl_mime_headers(generatedSet.getMimepost(), /* Add external headers and mime version. */0);
			result = ModernizedCProgram.Curl_mime_prepare_headers(generatedSet.getMimepost(), ((Object)0), ((Object)0), mimestrategy.MIMESTRATEGY_MAIL);
			if (!result) {
				if (!ModernizedCProgram.Curl_checkheaders(conn, "Mime-Version")) {
					result = generatedSet.getMimepost().getCurlheaders().Curl_mime_add_header("Mime-Version: 1.0");
				} 
			} 
			if (!/* Make sure we will read the entire mime structure. */result) {
				result = ModernizedCProgram.Curl_mime_rewind(generatedSet.getMimepost());
			} 
			if (result) {
				.Curl_cfree(from);
				.Curl_cfree(auth);
				return result;
			} 
			generatedState.setInfilesize(ModernizedCProgram.Curl_mime_size(generatedSet.getMimepost()));
			generatedState.setFread_func(()/* Read from mime structure. */ModernizedCProgram.Curl_mime_read);
			generatedState.setIn((Object)generatedSet.getMimepost());
		} 
		if (!auth && !/* Send the MAIL command */size) {
			result = generatedSmtpc.getPp().Curl_pp_sendf("MAIL FROM:%s", from);
		}  else if (auth && !size) {
			result = generatedSmtpc.getPp().Curl_pp_sendf("MAIL FROM:%s AUTH=%s", from, auth);
		}  else if (auth && size) {
			result = generatedSmtpc.getPp().Curl_pp_sendf("MAIL FROM:%s AUTH=%s SIZE=%s", from, auth, size);
		} else {
				result = generatedSmtpc.getPp().Curl_pp_sendf("MAIL FROM:%s SIZE=%s", from, size);
		} 
		.Curl_cfree(from);
		.Curl_cfree(auth);
		.Curl_cfree(size);
		if (!result) {
			ModernizedCProgram.state(conn, .SMTP_MAIL);
		} 
		return result/***********************************************************************
		 *
		 * smtp_perform_rcpt_to()
		 *
		 * Sends a RCPT TO command for a given recipient as part of the message upload
		 * process.
		 */;
	}
	public Object smtp_perform_rcpt_to() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		SMTP smtp = generatedReq.getProtop();
		curl_slist generatedRcpt = smtp.getRcpt();
		Object generatedCurl_slist = generatedRcpt.getCurl_slist();
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		if (generatedCurl_slist[0] == /* Send the RCPT TO command */(byte)'<') {
			result = generatedSmtpc.getPp().Curl_pp_sendf("RCPT TO:%s", generatedCurl_slist);
		} else {
				result = generatedSmtpc.getPp().Curl_pp_sendf("RCPT TO:<%s>", generatedCurl_slist);
		} 
		if (!result) {
			ModernizedCProgram.state(conn, .SMTP_RCPT);
		} 
		return result/***********************************************************************
		 *
		 * smtp_perform_quit()
		 *
		 * Performs the quit action prior to sclose() being called.
		 */;
	}
	public Object smtp_perform_quit() {
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		 result = generatedSmtpc.getPp().Curl_pp_sendf("%s", /* Send the QUIT command */"QUIT");
		if (!result) {
			ModernizedCProgram.state(conn, .SMTP_QUIT);
		} 
		return result;
	}
	/* For the initial server greeting */
	public Object smtp_state_servergreet_resp(int smtpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		(Object)/* no use for this yet */instate;
		if (smtpcode / 100 != 2) {
			data.Curl_failf("Got unexpected smtp-server response: %d", smtpcode);
			result = CURLE_WEIRD_SERVER_REPLY;
		} else {
				result = conn.smtp_perform_ehlo();
		} 
		return result;
	}
	/* For STARTTLS responses */
	public Object smtp_state_starttls_resp(int smtpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		(Object)/* no use for this yet */instate;
		Object generatedSet = data.getSet();
		if (smtpcode != 220) {
			if (generatedSet.getUse_ssl() != CURLUSESSL_TRY) {
				data.Curl_failf("STARTTLS denied, code %d", smtpcode);
				result = CURLE_USE_SSL_FAILED;
			} else {
					result = conn.smtp_perform_authentication();
			} 
		} else {
				result = conn.smtp_perform_upgrade_tls();
		} 
		return result;
	}
	/* For EHLO responses */
	public Object smtp_state_ehlo_resp(int smtpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		Object generatedState = data.getState();
		byte line = generatedState.getBuffer();
		size_t len = .strlen(line);
		(Object)/* no use for this yet */instate;
		Object generatedSet = data.getSet();
		Object generatedSsl = this.getSsl();
		SASL generatedSasl = smtpc.getSasl();
		int generatedAuthmechs = generatedSasl.getAuthmechs();
		 generatedTls_supported = smtpc.getTls_supported();
		if (smtpcode / 100 != 2 && smtpcode != 1) {
			if (generatedSet.getUse_ssl() <= CURLUSESSL_TRY || generatedSsl[0].getUse()) {
				result = conn.smtp_perform_helo();
			} else {
					data.Curl_failf("Remote access denied: %d", smtpcode);
					result = CURLE_REMOTE_ACCESS_DENIED;
			} 
		}  else if (len >= 4) {
			line += 4;
			len -= 4;
			if (len >= 8 && !.memcmp(line, "STARTTLS", /* Does the server support the STARTTLS capability? */8)) {
				smtpc.setTls_supported(1);
			}  else if (len >= 4 && !.memcmp(line, "SIZE", /* Does the server support the SIZE capability? */4)) {
				smtpc.setSize_supported(1);
			}  else if (len >= 5 && !.memcmp(line, "AUTH ", /* Does the server support authentication? */5)) {
				smtpc.setAuth_supported(1);
				line += /* Advance past the AUTH keyword */5;
				len -= 5;
				for (; ; ) {
					size_t llen = new size_t();
					size_t wordlen = new size_t();
					int mechbit;
					while (len && (line == (byte)' ' || line == (byte)'\t' || line == (byte)'\r' || line == (byte)'\n')) {
						line++;
						len--;
					}
					if (!len) {
						break;
					} 
					for (wordlen = 0; wordlen < len && line[wordlen] != /* Extract the word */(byte)' ' && line[wordlen] != (byte)'\t' && line[wordlen] != (byte)'\r' && line[wordlen] != (byte)'\n'; ) {
						wordlen++;
					}
					mechbit = ModernizedCProgram.Curl_sasl_decode_mech(line, wordlen, /* Test the word for a matching authentication mechanism */llen);
					if (mechbit && llen == wordlen) {
						generatedAuthmechs |=  mechbit;
					} 
					line += wordlen;
					len -= wordlen;
				}
			} 
			if (smtpcode != 1) {
				if (generatedSet.getUse_ssl() && !generatedSsl[0].getUse()) {
					if (generatedTls_supported) {
						result = /* Switch to TLS connection now */conn.smtp_perform_starttls();
					}  else if (generatedSet.getUse_ssl() == CURLUSESSL_TRY) {
						result = /* Fallback and carry on with authentication */conn.smtp_perform_authentication();
					} else {
							data.Curl_failf("STARTTLS not supported.");
							result = CURLE_USE_SSL_FAILED;
					} 
				} else {
						result = conn.smtp_perform_authentication();
				} 
			} 
		} else {
				data.Curl_failf("Unexpectedly short EHLO response");
				result = CURLE_WEIRD_SERVER_REPLY;
		} 
		return result;
	}
	/* For HELO responses */
	public Object smtp_state_helo_resp(int smtpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		(Object)/* no use for this yet */instate;
		if (smtpcode / 100 != 2) {
			data.Curl_failf("Remote access denied: %d", smtpcode);
			result = CURLE_REMOTE_ACCESS_DENIED;
		} else {
				ModernizedCProgram.state(conn, /* End of connect phase */.SMTP_STOP);
		} 
		return result;
	}
	/* For SASL authentication responses */
	public Object smtp_state_auth_resp(int smtpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		saslprogress progress = new saslprogress();
		(Object)/* no use for this yet */instate;
		SASL generatedSasl = smtpc.getSasl();
		result = ModernizedCProgram.Curl_sasl_continue(generatedSasl, conn, smtpcode, progress);
		if (!result) {
			switch (progress) {
			case .SASL_DONE:
					ModernizedCProgram.state(conn, /* Authenticated */.SMTP_STOP);
					break;
			case /* No mechanism left after cancellation */.SASL_IDLE:
					data.Curl_failf("Authentication cancelled");
					result = CURLE_LOGIN_DENIED;
					break;
			default:
					break;
			}
		} 
		return result;
	}
	/* For command responses */
	public Object smtp_state_command_resp(int smtpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		SMTP smtp = generatedReq.getProtop();
		Object generatedState = data.getState();
		byte line = generatedState.getBuffer();
		size_t len = .strlen(line);
		(Object)/* no use for this yet */instate;
		curl_slist generatedRcpt = smtp.getRcpt();
		Object generatedSet = data.getSet();
		Object generatedCurl_slist = generatedRcpt.getCurl_slist();
		if ((generatedRcpt && smtpcode / 100 != 2 && smtpcode != 553 && smtpcode != 1) || (!generatedRcpt && smtpcode / 100 != 2 && smtpcode != 1)) {
			data.Curl_failf("Command failed: %d", smtpcode);
			result = CURLE_RECV_ERROR;
		} else {
				if (!generatedSet.getOpt_no_body()) {
					line[len] = (byte)'\n';
					result = conn.Curl_client_write((1 << 0), line, len + 1);
					line[len] = (byte)'\0';
				} 
				if (smtpcode != 1) {
					if (generatedRcpt) {
						smtp.setRcpt(generatedCurl_slist);
						if (generatedRcpt) {
							result = /* Send the next command */conn.smtp_perform_command();
						} else {
								ModernizedCProgram.state(conn, /* End of DO phase */.SMTP_STOP);
						} 
					} else {
							ModernizedCProgram.state(conn, /* End of DO phase */.SMTP_STOP);
					} 
				} 
		} 
		return result;
	}
	/* For MAIL responses */
	public Object smtp_state_mail_resp(int smtpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		(Object)/* no use for this yet */instate;
		if (smtpcode / 100 != 2) {
			data.Curl_failf("MAIL failed: %d", smtpcode);
			result = CURLE_SEND_ERROR;
		} else {
				result = /* Start the RCPT TO command */conn.smtp_perform_rcpt_to();
		} 
		return result;
	}
	/* For RCPT responses */
	public Object smtp_state_rcpt_resp(int smtpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		SMTP smtp = generatedReq.getProtop();
		(Object)/* no use for this yet */instate;
		curl_slist generatedRcpt = smtp.getRcpt();
		Object generatedCurl_slist = generatedRcpt.getCurl_slist();
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		if (smtpcode / 100 != 2) {
			data.Curl_failf("RCPT failed: %d", smtpcode);
			result = CURLE_SEND_ERROR;
		} else {
				smtp.setRcpt(generatedCurl_slist);
				if (generatedRcpt) {
					result = /* Send the next RCPT TO command */conn.smtp_perform_rcpt_to();
				} else {
						result = generatedSmtpc.getPp().Curl_pp_sendf("%s", /* Send the DATA command */"DATA");
						if (!result) {
							ModernizedCProgram.state(conn, .SMTP_DATA);
						} 
				} 
		} 
		return result;
	}
	/* For DATA response */
	public Object smtp_state_data_resp(int smtpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		(Object)/* no use for this yet */instate;
		Object generatedState = data.getState();
		if (smtpcode != 354) {
			data.Curl_failf("DATA failed: %d", smtpcode);
			result = CURLE_SEND_ERROR;
		} else {
				data.Curl_pgrsSetUploadSize(generatedState.getInfilesize());
				data.Curl_setup_transfer(-1, -1, 0, /* SMTP upload */0);
				ModernizedCProgram.state(conn, /* End of DO phase */.SMTP_STOP);
		} 
		return result;
	}
	/* For POSTDATA responses, which are received after the entire DATA
	   part has been sent to the server */
	public Object smtp_state_postdata_resp(int smtpcode,  instate) {
		 result = CURLE_OK;
		(Object)/* no use for this yet */instate;
		if (smtpcode != 250) {
			result = CURLE_RECV_ERROR;
		} 
		ModernizedCProgram.state(conn, /* End of DONE phase */.SMTP_STOP);
		return result;
	}
	public Object smtp_statemach_act() {
		 result = CURLE_OK;
		Object generatedSock = this.getSock();
		 sock = generatedSock[0];
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		int smtpcode;
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		pingpong generatedPp = smtpc.getPp();
		pingpong pp = generatedPp;
		size_t nread = 0;
		 generatedState = smtpc.getState();
		if (generatedState == /* Busy upgrading the connection; right now all I/O is SSL/TLS, not SMTP */.SMTP_UPGRADETLS) {
			return conn.smtp_perform_upgrade_tls();
		} 
		Object generatedSendleft = pp.getSendleft();
		if (generatedSendleft) {
			return pp.Curl_pp_flushsend();
		} 
		Object generatedInfo = data.getInfo();
		do {
			result = pp.Curl_pp_readresp(sock, smtpcode, /* Read the response from the server */nread);
			if (result) {
				return result;
			} 
			if (generatedState != .SMTP_QUIT && smtpcode != /* Store the latest response for later retrieval if necessary */1) {
				generatedInfo.setHttpcode(smtpcode);
			} 
			if (!smtpcode) {
				break;
			} 
			switch (generatedState) {
			case .SMTP_DATA:
					result = conn.smtp_state_data_resp(smtpcode, generatedState);
					break;
			case .SMTP_SERVERGREET:
					result = conn.smtp_state_servergreet_resp(smtpcode, generatedState);
					break;
			case .SMTP_RCPT:
					result = conn.smtp_state_rcpt_resp(smtpcode, generatedState);
					break;
			case .SMTP_STARTTLS:
					result = conn.smtp_state_starttls_resp(smtpcode, generatedState);
					break;
			case .SMTP_COMMAND:
					result = conn.smtp_state_command_resp(smtpcode, generatedState);
					break;
			case .SMTP_MAIL:
					result = conn.smtp_state_mail_resp(smtpcode, generatedState);
					break;
			case .SMTP_HELO:
					result = conn.smtp_state_helo_resp(smtpcode, generatedState);
					break;
			case .SMTP_POSTDATA:
					result = conn.smtp_state_postdata_resp(smtpcode, generatedState);
					break;
			case .SMTP_QUIT/* fallthrough, just stop! */:
			case .SMTP_EHLO:
					result = conn.smtp_state_ehlo_resp(smtpcode, generatedState);
					break;
			case .SMTP_AUTH:
					result = conn.smtp_state_auth_resp(smtpcode, generatedState);
					break;
			default:
					ModernizedCProgram.state(conn, /* internal error */.SMTP_STOP);
					break;
			}
		} while (!result && generatedState != .SMTP_STOP && pp.Curl_pp_moredata());
		return result;
	}
	/* Called repeatedly until done from multi.c */
	public Object smtp_multi_statemach( done) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		Object generatedHandler = this.getHandler();
		 generatedSsldone = smtpc.getSsldone();
		if ((generatedHandler.getFlags() & (1 << 0)) && !generatedSsldone) {
			result = .Curl_ssl_connect_nonblocking(conn, 0, generatedSsldone);
			if (result || !generatedSsldone) {
				return result;
			} 
		} 
		pingpong generatedPp = smtpc.getPp();
		result = generatedPp.Curl_pp_statemach(0, 0);
		 generatedState = smtpc.getState();
		done = (generatedState == .SMTP_STOP) ? 1 : 0;
		return result;
	}
	public Object smtp_block_statemach( disconnecting) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		 generatedState = smtpc.getState();
		pingpong generatedPp = smtpc.getPp();
		while (generatedState != .SMTP_STOP && !result) {
			result = generatedPp.Curl_pp_statemach(1, disconnecting);
		}
		return result;
	}
	/* Allocate and initialize the SMTP struct for the current Curl_easy if
	   required */
	public Object smtp_init() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		SMTP smtp = new SMTP();
		Object generatedReq = data.getReq();
		smtp = generatedReq.setProtop(.Curl_ccalloc(, 1));
		if (!smtp) {
			result = CURLE_OUT_OF_MEMORY;
		} 
		return result;
	}
	/* For the SMTP "protocol connect" and "doing" phases only */
	public int smtp_getsock(Object socks) {
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		return generatedSmtpc.getPp().Curl_pp_getsock(socks/***********************************************************************
		 *
		 * smtp_connect()
		 *
		 * This function should do everything that is to be considered a part of
		 * the connection phase.
		 *
		 * The variable pointed to by 'done' will be TRUE if the protocol-layer
		 * connect phase is done when this function returns, or FALSE if not.
		 */);
	}
	public Object smtp_connect( done) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		pingpong generatedPp = smtpc.getPp();
		pingpong pp = generatedPp;
		done = /* default to not done yet */0;
		conn.Curl_conncontrol(/* We always support persistent connections in SMTP */0);
		pp.setResponse_time((120 * /* Set the default response time-out */1000));
		pp.setStatemach_act(smtp_statemach_act);
		pp.setEndofresp(smtp_endofresp);
		pp.setConn(conn);
		SASL generatedSasl = smtpc.getSasl();
		generatedSasl.Curl_sasl_init(/* Initialize the SASL storage */ModernizedCProgram.saslsmtp);
		/* Initialise the pingpong layer */pp.Curl_pp_init();
		result = /* Parse the URL options */conn.smtp_parse_url_options();
		if (result) {
			return result;
		} 
		result = /* Parse the URL path */conn.smtp_parse_url_path();
		if (result) {
			return result;
		} 
		ModernizedCProgram.state(conn, /* Start off waiting for the server greeting response */.SMTP_SERVERGREET);
		result = conn.smtp_multi_statemach(done);
		return result/***********************************************************************
		 *
		 * smtp_done()
		 *
		 * The DONE function. This does what needs to be done after a single DO has
		 * performed.
		 *
		 * Input argument is already checked for validity.
		 */;
	}
	public Object smtp_done(Object status,  premature) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		SMTP smtp = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		pingpong pp = generatedSmtpc.getPp();
		byte eob;
		ssize_t len = new ssize_t();
		ssize_t bytes_written = new ssize_t();
		(Object)premature;
		connectdata generatedConn = pp.getConn();
		if (!smtp || !generatedConn) {
			return CURLE_OK;
		} 
		Byte generatedCustom = smtp.getCustom();
		do {
			.Curl_cfree((generatedCustom));
			(generatedCustom) = ((Object)0);
		} while (/* Cleanup our per-request based variables */0);
		Object generatedSet = data.getSet();
		 generatedTrailing_crlf = smtp.getTrailing_crlf();
		Object generatedState = generatedData.getState();
		Object generatedWritesockfd = this.getWritesockfd();
		curltime curltime = new curltime();
		if (status) {
			conn.Curl_conncontrol(/* marked for closure */1);
			result = /* use the already set error code */status;
		}  else if (!generatedSet.getConnect_only() && generatedSet.getMail_rcpt() && (generatedSet.getUpload() || generatedSet.getMimepost().getKind())) {
			if (generatedTrailing_crlf || !generatedState.getInfilesize()) {
				eob = .Curl_cstrdup("\x0d\x0a\x2e\x0d\x0a"[2]);
				len = 5 - 2;
			} else {
					eob = .Curl_cstrdup("\x0d\x0a\x2e\x0d\x0a");
					len = 5;
			} 
			if (!eob) {
				return CURLE_OUT_OF_MEMORY;
			} 
			result = conn.Curl_write(generatedWritesockfd, eob, len, /* Send the end of block data */bytes_written);
			if (result) {
				.Curl_cfree(eob);
				return result;
			} 
			if (bytes_written != len/* The whole chunk was not sent so keep it around and adjust the
			         pingpong structure accordingly */) {
				pp.setSendthis(eob);
				pp.setSendsize(len);
				pp.setSendleft(len - bytes_written);
			} else {
					pp.setResponse(curltime.Curl_now());
					.Curl_cfree(eob);
			} 
			ModernizedCProgram.state(conn, .SMTP_POSTDATA);
			result = conn.smtp_block_statemach(/* Run the state-machine */0);
		} 
		smtp.setTransfer(/* Clear the transfer mode for the next request */.FTPTRANSFER_BODY);
		return result/***********************************************************************
		 *
		 * smtp_perform()
		 *
		 * This is the actual DO function for SMTP. Transfer a mail, send a command
		 * or get some data according to the options previously setup.
		 */;
	}
	public Object smtp_perform( connected,  dophase_done) {
		 result = /* This is SMTP and no proxy */CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		SMTP smtp = generatedReq.getProtop();
		do {
		} while (0);
		Object generatedSet = data.getSet();
		if (generatedSet.getOpt_no_body()) {
			smtp.setTransfer(/* Requested no body means no transfer */.FTPTRANSFER_INFO);
		} 
		dophase_done = /* not done yet */0;
		smtp.setRcpt(generatedSet.getMail_rcpt());
		smtp.setTrailing_crlf(/* Initial data character is the first character in line: it is implicitly
		     preceded by a virtual CRLF. */1);
		smtp.setEob(2);
		if ((generatedSet.getUpload() || generatedSet.getMimepost().getKind()) && generatedSet.getMail_rcpt()) {
			result = /* MAIL transfer */conn.smtp_perform_mail();
		} else {
				result = /* SMTP based command (VRFY, EXPN, NOOP, RSET or HELP) */conn.smtp_perform_command();
		} 
		if (result) {
			return result;
		} 
		result = conn.smtp_multi_statemach(/* Run the state-machine */dophase_done);
		ConnectBits generatedBits = this.getBits();
		Object generatedTcpconnect = generatedBits.getTcpconnect();
		connected = generatedTcpconnect[0];
		if (dophase_done) {
			do {
			} while (0);
		} 
		return result/***********************************************************************
		 *
		 * smtp_do()
		 *
		 * This function is registered as 'curl_do' function. It decodes the path
		 * parts etc as a wrapper to the actual DO function (smtp_perform).
		 *
		 * The input argument is already checked for validity.
		 */;
	}
	public Object smtp_do( done) {
		 result = CURLE_OK;
		done = /* default to false */0;
		result = /* Parse the custom request */conn.smtp_parse_custom_request();
		if (result) {
			return result;
		} 
		result = conn.smtp_regular_transfer(done);
		return result/***********************************************************************
		 *
		 * smtp_disconnect()
		 *
		 * Disconnect from an SMTP server. Cleanup protocol-specific per-connection
		 * resources. BLOCKING.
		 */;
	}
	public Object smtp_disconnect( dead_connection) {
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		pingpong generatedPp = smtpc.getPp();
		connectdata generatedConn = generatedPp.getConn();
		ConnectBits generatedBits = generatedConn.getBits();
		Object generatedProtoconnstart = generatedBits.getProtoconnstart();
		if (!dead_connection && generatedConn && generatedProtoconnstart) {
			if (!conn.smtp_perform_quit()) {
				(Object)conn.smtp_block_statemach(/* ignore errors on QUIT */1);
			} 
		} 
		generatedPp.Curl_pp_disconnect();
		SASL generatedSasl = smtpc.getSasl();
		int generatedAuthused = generatedSasl.getAuthused();
		conn.Curl_sasl_cleanup(generatedAuthused);
		Byte generatedDomain = smtpc.getDomain();
		do {
			.Curl_cfree((generatedDomain));
			(generatedDomain) = ((Object)0);
		} while (/* Cleanup our connection based variables */0);
		return CURLE_OK;
	}
	/* Call this when the DO phase has completed */
	public Object smtp_dophase_done( connected) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		SMTP smtp = generatedReq.getProtop();
		(Object)connected;
		 generatedTransfer = smtp.getTransfer();
		if (generatedTransfer != .FTPTRANSFER_BODY) {
			generatedData.Curl_setup_transfer(-1, -1, 0, -/* no data to transfer */1);
		} 
		return CURLE_OK;
	}
	/* Called from multi.c while DOing */
	public Object smtp_doing( dophase_done) {
		 result = conn.smtp_multi_statemach(dophase_done);
		if (result) {
			do {
			} while (0);
		}  else if (dophase_done) {
			result = conn.smtp_dophase_done(/* not connected */0);
			do {
			} while (0);
		} 
		return result/***********************************************************************
		 *
		 * smtp_regular_transfer()
		 *
		 * The input argument is already checked for validity.
		 *
		 * Performs all commands done before a regular transfer between a local and a
		 * remote host.
		 */;
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
	 * RFC1870 SMTP Service Extension for Message Size
	 * RFC2195 CRAM-MD5 authentication
	 * RFC2831 DIGEST-MD5 authentication
	 * RFC3207 SMTP over TLS
	 * RFC4422 Simple Authentication and Security Layer (SASL)
	 * RFC4616 PLAIN authentication
	 * RFC4752 The Kerberos V5 ("GSSAPI") SASL Mechanism
	 * RFC4954 SMTP Authentication
	 * RFC5321 SMTP protocol
	 * RFC6749 OAuth 2.0 Authorization Framework
	 * RFC8314 Use of TLS for Email Submission and Access
	 * Draft   SMTP URL Interface   <draft-earhart-url-smtp-00.txt>
	 * Draft   LOGIN SASL Mechanism <draft-murchison-sasl-login-00.txt>
	 *
	 ***************************************************************************/
	/* for HTTP proxy tunnel stuff */
	/* The last 3 #include files should be in this order */
	/* Local API functions */
	public Object smtp_regular_transfer( dophase_done) {
		 result = CURLE_OK;
		bool connected = 0;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		generatedReq.setSize(-/* Make sure size is unknown at this point */1);
		data.Curl_pgrsSetUploadCounter(/* Set the progress data */0);
		data.Curl_pgrsSetDownloadCounter(0);
		data.Curl_pgrsSetUploadSize(-1);
		data.Curl_pgrsSetDownloadSize(-1);
		result = conn.smtp_perform(connected, /* Carry out the perform */dophase_done);
		if (!result && /* Perform post DO phase operations if necessary */dophase_done) {
			result = conn.smtp_dophase_done(connected);
		} 
		return result;
	}
	public Object smtp_setup_connection() {
		 result = new ();
		this.setTls_upgraded(/* Clear the TLS upgraded flag */0);
		result = /* Initialise the SMTP layer */conn.smtp_init();
		if (result) {
			return result;
		} 
		return CURLE_OK/***********************************************************************
		 *
		 * smtp_parse_url_options()
		 *
		 * Parse the URL login options.
		 */;
	}
	public Object smtp_parse_url_options() {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		Byte generatedOptions = this.getOptions();
		byte ptr = generatedOptions;
		SASL generatedSasl = smtpc.getSasl();
		generatedSasl.setResetprefs(1);
		while (!result && ptr && ptr) {
			byte key = ptr;
			byte value;
			while (ptr && ptr != (byte)'=') {
				ptr++;
			}
			value = ptr + 1;
			while (ptr && ptr != (byte)';') {
				ptr++;
			}
			if (ModernizedCProgram.Curl_strncasecompare(key, "AUTH=", 5)) {
				result = generatedSasl.Curl_sasl_parse_url_auth_option(value, ptr - value);
			} else {
					result = CURLE_URL_MALFORMAT;
			} 
			if (ptr == (byte)';') {
				ptr++;
			} 
		}
		return result/***********************************************************************
		 *
		 * smtp_parse_url_path()
		 *
		 * Parse the URL path into separate path components.
		 */;
	}
	public Object smtp_parse_url_path() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedSmtpc = generatedProto.getSmtpc();
		smtp_conn smtpc = generatedSmtpc;
		Object generatedState = data.getState();
		byte path = generatedState.getUp().getPath()[/* skip leading path */1];
		byte[] localhost = new byte[1024 + 1];
		if (!/* Calculate the path if necessary */path) {
			if (!ModernizedCProgram.Curl_gethostname(localhost, )) {
				path = localhost;
			} else {
					path = "localhost";
			} 
		} 
		Byte generatedDomain = smtpc.getDomain();
		return generatedData.Curl_urldecode(path, 0, generatedDomain, ((Object)0), /* URL decode the path and use it as the domain in our EHLO */1/***********************************************************************
		 *
		 * smtp_parse_custom_request()
		 *
		 * Parse the custom request.
		 */);
	}
	public Object smtp_parse_custom_request() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		SMTP smtp = generatedReq.getProtop();
		Object generatedSet = data.getSet();
		byte custom = generatedSet.getStr()[dupstring.STRING_CUSTOMREQUEST];
		Byte generatedCustom = smtp.getCustom();
		if (/* URL decode the custom request */custom) {
			result = data.Curl_urldecode(custom, 0, generatedCustom, ((Object)0), 1);
		} 
		return result;
	}
	public Object Curl_smtp_escape_eob(Object nread) {
		ssize_t i = new ssize_t();
		ssize_t si = new ssize_t();
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		SMTP smtp = generatedReq.getProtop();
		Object generatedState = data.getState();
		byte scratch = generatedState.getScratch();
		byte newscratch = ((Object)0);
		byte oldscratch = ((Object)0);
		size_t eob_sent = new size_t();
		Object generatedSet = data.getSet();
		if (!scratch || generatedSet.getCrlf()) {
			oldscratch = scratch;
			scratch = newscratch = .Curl_cmalloc(2 * generatedSet.getUpload_buffer_size());
			if (!newscratch) {
				data.Curl_failf("Failed to alloc scratch buffer!");
				return CURLE_OUT_OF_MEMORY;
			} 
		} 
		do {
		} while (0);
		Object generatedEob = smtp.getEob();
		eob_sent = generatedEob;
		for (; i < nread; /* This loop can be improved by some kind of Boyer-Moore style of
		     approach but that is saved for later... */i++) {
			if ("\x0d\x0a\x2e\x0d\x0a"[generatedEob] == generatedReq.getUpload_fromhere()[i]) {
				generatedEob++;
				if (2 == generatedEob || 5 == generatedEob) {
					smtp.setTrailing_crlf(1);
				} else {
						smtp.setTrailing_crlf(0);
				} 
			}  else if (generatedEob) {
				.memcpy(scratch[si], "\x0d\x0a\x2e\x0d\x0a"[eob_sent], generatedEob - /* A previous substring matched so output that first */eob_sent);
				si += generatedEob - eob_sent;
				if ("\x0d\x0a\x2e\x0d\x0a"[0] == generatedReq.getUpload_fromhere()[/* Then compare the first byte */i]) {
					smtp.setEob(1);
				} else {
						smtp.setEob(0);
				} 
				eob_sent = 0;
				smtp.setTrailing_crlf(/* Reset the trailing CRLF flag as there was more data */0);
			} 
			if (3 == generatedEob) {
				.memcpy(scratch[si], "\x0d\x0a\x2e\x2e"[/* Copy the replacement data to the target buffer */eob_sent], 4 - eob_sent);
				si += 4 - eob_sent;
				smtp.setEob(0);
				eob_sent = 0;
			}  else if (!generatedEob) {
				scratch[si++] = generatedReq.getUpload_fromhere()[i];
			} 
		}
		if (generatedEob - eob_sent) {
			.memcpy(scratch[si], "\x0d\x0a\x2e\x0d\x0a"[eob_sent], generatedEob - /* A substring matched before processing ended so output that now */eob_sent);
			si += generatedEob - eob_sent;
		} 
		if (si != /* Only use the new buffer if we replaced something */nread) {
			generatedReq.setUpload_fromhere(/* Upload from the new (replaced) buffer instead */scratch);
			generatedState.setScratch(/* Save the buffer so it can be freed later */scratch);
			.Curl_cfree(/* Free the old scratch buffer */oldscratch);
			generatedReq.setUpload_present(/* Set the new amount too */si);
		} else {
				.Curl_cfree(newscratch);
		} 
		return CURLE_OK/* CURL_DISABLE_SMTP */;
	}
	/* When sending a SMTP payload we must detect CRLF. sequences making sure
	     they are sent as CRLF.. instead, as a . on the beginning of a line will
	     be deleted by the server when not part of an EOB terminator and a
	     genuine CRLF.CRLF which isn't escaped will wrongly be detected as end of
	     data by the server
	  */
	public int conn_upkeep(Object param) {
		(Object)/* Param is unused. */param;
		Object generatedHandler = this.getHandler();
		if (generatedHandler.getConnection_check()) {
			.UNRECOGNIZEDFUNCTIONNAME(conn, (1 << /* Do a protocol-specific keepalive check on the connection. */1));
		} 
		return /* continue iteration */0;
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
	/* The last #include file should be: */
	/*
	 * Forward declarations.
	 */
	public Object gopher_do( done) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedSock = this.getSock();
		 sockfd = generatedSock[0];
		byte gopherpath;
		Object generatedState = data.getState();
		byte path = generatedState.getUp().getPath();
		byte query = generatedState.getUp().getQuery();
		byte sel = ((Object)0);
		byte sel_org = ((Object)0);
		ssize_t amount = new ssize_t();
		ssize_t k = new ssize_t();
		size_t len = new size_t();
		done = /* unconditionally */1;
		do {
		} while (/* path is guaranteed non-NULL */0);
		if (query) {
			gopherpath = ModernizedCProgram.curl_maprintf("%s?%s", path, query);
		} else {
				gopherpath = .Curl_cstrdup(path);
		} 
		if (!gopherpath) {
			return CURLE_OUT_OF_MEMORY;
		} 
		if (.strlen(gopherpath) <= /* Create selector. Degenerate cases: / and /1 => convert to "" */2) {
			sel = (byte)"";
			len = .strlen(sel);
			.Curl_cfree(gopherpath);
		} else {
				byte newp;
				newp = /* Otherwise, drop / and the first character (i.e., item type) ... */gopherpath;
				newp += 2;
				result = data.Curl_urldecode(newp, 0, sel, len, /* ... and finally unescape */0);
				.Curl_cfree(gopherpath);
				if (result) {
					return result;
				} 
				sel_org = sel;
		} 
		k = ModernizedCProgram.curlx_uztosz(/* We use Curl_write instead of Curl_sendf to make sure the entire buffer is
		     sent, which could be sizeable with long selectors. */len);
		for (; ; ) {
			result = conn.Curl_write(sockfd, sel, k, amount);
			if (!/* Which may not have written it all! */result) {
				result = conn.Curl_client_write((1 << 1), sel, amount);
				if (result) {
					break;
				} 
				k -= amount;
				sel += amount;
				if (k < 1) {
					break;
				} 
			} else {
					break;
			} 
			if (ModernizedCProgram.Curl_socket_check(CURL_SOCKET_BAD, CURL_SOCKET_BAD, sockfd, (time_t)100) < 0) {
				result = CURLE_SEND_ERROR;
				break;
			} 
		}
		.Curl_cfree(sel_org);
		if (!result/* We can use Curl_sendf to send the terminal \r\n relatively safely and
		       save allocing another string/doing another _write loop. */) {
			result = conn.Curl_sendf(sockfd, "\r\n");
		} 
		if (result) {
			data.Curl_failf("Failed sending Gopher request");
			return result;
		} 
		result = conn.Curl_client_write((1 << 1), (byte)"\r\n", 2);
		if (result) {
			return result;
		} 
		data.Curl_setup_transfer(0, -1, 0, -1);
		return CURLE_OK/*CURL_DISABLE_GOPHER*/;
	}
	/*
	 * Gopher protocol handler.
	 * This is also a nice simple template to build off for simple
	 * connect-command-download protocols.
	 */
	public void conn_reset_postponed_data(int num) {
		Object generatedPostponed = this.getPostponed();
		postponed_data psnd = (generatedPostponed[num]);
		Byte generatedBuffer = psnd.getBuffer();
		if (generatedBuffer) {
			do {
			} while (0);
			do {
			} while (0);
			do {
			} while (0);
			do {
			} while (0);
			.Curl_cfree(generatedBuffer);
			psnd.setBuffer(((Object)0));
			psnd.setAllocated_size(0);
			psnd.setRecv_size(0);
			psnd.setRecv_processed(0/* used only for DEBUGASSERT */);
		} else {
				do {
				} while (/* DEBUGBUILD */0);
				do {
				} while (0);
				do {
				} while (0);
				do {
				} while (0);
		} 
	}
	public void conn_reset_all_postponed_data() {
		conn.conn_reset_postponed_data(0);
		conn.conn_reset_postponed_data(1/* ! USE_RECV_BEFORE_SEND_WORKAROUND *//* Use "do-nothing" macro instead of function when workaround not used */);
	}
	/* ! USE_RECV_BEFORE_SEND_WORKAROUND */
	public void conn_shutdown() {
		if (!conn) {
			return ;
		} 
		Curl_easy generatedData = this.getData();
		long generatedConnection_id = this.getConnection_id();
		generatedData.Curl_infof("Closing connection %ld\n", generatedConnection_id);
		do {
		} while (0);
		/* possible left-overs from the async name resolvers */conn.Curl_resolver_cancel();
		.Curl_ssl_close(conn, /* close the SSL stuff before we close any sockets since they will/may
		     write to the sockets */0);
		.Curl_ssl_close(conn, 1);
		Object generatedSock = this.getSock();
		if (CURL_SOCKET_BAD != generatedSock[/* close possibly still open sockets */1]) {
			conn.Curl_closesocket(generatedSock[1]);
		} 
		if (CURL_SOCKET_BAD != generatedSock[0]) {
			conn.Curl_closesocket(generatedSock[0]);
		} 
		Object generatedTempsock = this.getTempsock();
		if (CURL_SOCKET_BAD != generatedTempsock[0]) {
			conn.Curl_closesocket(generatedTempsock[0]);
		} 
		if (CURL_SOCKET_BAD != generatedTempsock[1]) {
			conn.Curl_closesocket(generatedTempsock[1]);
		} 
		ModernizedCProgram.Curl_conncache_remove_conn(generatedData, conn, /* unlink ourselves. this should be called last since other shutdown
		     procedures need a valid conn->data and this may clear it. */1);
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
	/* prototype for curl_win32_idn_to_ascii() */
	/* USE_LIBIDN2 */
	/* And now for the protocols */
	/* The last 3 #include files should be in this order */
	public void conn_free() {
		if (!conn) {
			return ;
		} 
		hostname generatedHost = this.getHost();
		generatedHost.free_idnconverted_hostname();
		hostname generatedConn_to_host = this.getConn_to_host();
		generatedConn_to_host.free_idnconverted_hostname();
		generatedHost.free_idnconverted_hostname();
		generatedHost.free_idnconverted_hostname();
		Byte generatedUser = this.getUser();
		do {
			.Curl_cfree((generatedUser));
			(generatedUser) = ((Object)0);
		} while (0);
		Byte generatedPasswd = this.getPasswd();
		do {
			.Curl_cfree((generatedPasswd));
			(generatedPasswd) = ((Object)0);
		} while (0);
		Byte generatedOauth_bearer = this.getOauth_bearer();
		do {
			.Curl_cfree((generatedOauth_bearer));
			(generatedOauth_bearer) = ((Object)0);
		} while (0);
		Byte generatedSasl_authzid = this.getSasl_authzid();
		do {
			.Curl_cfree((generatedSasl_authzid));
			(generatedSasl_authzid) = ((Object)0);
		} while (0);
		Byte generatedOptions = this.getOptions();
		do {
			.Curl_cfree((generatedOptions));
			(generatedOptions) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedUser));
			(generatedUser) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedUser));
			(generatedUser) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedPasswd));
			(generatedPasswd) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedPasswd));
			(generatedPasswd) = ((Object)0);
		} while (0);
		dynamically_allocated_data generatedAllocptr = this.getAllocptr();
		Byte generatedProxyuserpwd = generatedAllocptr.getProxyuserpwd();
		do {
			.Curl_cfree((generatedProxyuserpwd));
			(generatedProxyuserpwd) = ((Object)0);
		} while (0);
		Byte generatedUagent = generatedAllocptr.getUagent();
		do {
			.Curl_cfree((generatedUagent));
			(generatedUagent) = ((Object)0);
		} while (0);
		Byte generatedUserpwd = generatedAllocptr.getUserpwd();
		do {
			.Curl_cfree((generatedUserpwd));
			(generatedUserpwd) = ((Object)0);
		} while (0);
		Byte generatedAccept_encoding = generatedAllocptr.getAccept_encoding();
		do {
			.Curl_cfree((generatedAccept_encoding));
			(generatedAccept_encoding) = ((Object)0);
		} while (0);
		Byte generatedTe = generatedAllocptr.getTe();
		do {
			.Curl_cfree((generatedTe));
			(generatedTe) = ((Object)0);
		} while (0);
		Byte generatedRangeline = generatedAllocptr.getRangeline();
		do {
			.Curl_cfree((generatedRangeline));
			(generatedRangeline) = ((Object)0);
		} while (0);
		Byte generatedRef = generatedAllocptr.getRef();
		do {
			.Curl_cfree((generatedRef));
			(generatedRef) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedHost));
			(generatedHost) = ((Object)0);
		} while (0);
		Byte generatedCookiehost = generatedAllocptr.getCookiehost();
		do {
			.Curl_cfree((generatedCookiehost));
			(generatedCookiehost) = ((Object)0);
		} while (0);
		Byte generatedRtsp_transport = generatedAllocptr.getRtsp_transport();
		do {
			.Curl_cfree((generatedRtsp_transport));
			(generatedRtsp_transport) = ((Object)0);
		} while (0);
		Byte generatedTrailer = this.getTrailer();
		do {
			.Curl_cfree((generatedTrailer));
			(generatedTrailer) = ((Object)0);
		} while (0);
		Byte generatedRawalloc = generatedHost.getRawalloc();
		do {
			.Curl_cfree((generatedRawalloc));
			(generatedRawalloc) = ((Object)0);
		} while (/* host name buffer */0);
		do {
			.Curl_cfree((generatedRawalloc));
			(generatedRawalloc) = ((Object)0);
		} while (/* host name buffer */0);
		Byte generatedHostname_resolve = this.getHostname_resolve();
		do {
			.Curl_cfree((generatedHostname_resolve));
			(generatedHostname_resolve) = ((Object)0);
		} while (0);
		Byte generatedSecondaryhostname = this.getSecondaryhostname();
		do {
			.Curl_cfree((generatedSecondaryhostname));
			(generatedSecondaryhostname) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedRawalloc));
			(generatedRawalloc) = ((Object)0);
		} while (/* http proxy name buffer */0);
		do {
			.Curl_cfree((generatedRawalloc));
			(generatedRawalloc) = ((Object)0);
		} while (/* socks proxy name buffer */0);
		http_connect_state generatedConnect_state = this.getConnect_state();
		do {
			.Curl_cfree((generatedConnect_state));
			(generatedConnect_state) = ((Object)0);
		} while (0);
		conn.conn_reset_all_postponed_data();
		curl_llist generatedEasyq = this.getEasyq();
		generatedEasyq.Curl_llist_destroy(((Object)0));
		Byte generatedLocaldev = this.getLocaldev();
		do {
			.Curl_cfree((generatedLocaldev));
			(generatedLocaldev) = ((Object)0);
		} while (0);
		ssl_primary_config generatedSsl_config = this.getSsl_config();
		generatedSsl_config.Curl_free_primary_ssl_config();
		ssl_primary_config generatedProxy_ssl_config = this.getProxy_ssl_config();
		generatedProxy_ssl_config.Curl_free_primary_ssl_config();
		.Curl_cfree(/* free all the connection oriented data */conn/*
		 * Disconnects the given connection. Note the connection may not be the
		 * primary connection, like when freeing room in the connection cache or
		 * killing of a dead old connection.
		 *
		 * A connection needs an easy handle when closing down. We support this passed
		 * in separately since the connection to get closed here is often already
		 * disassociated from an easy handle.
		 *
		 * This function MUST NOT reset state in the Curl_easy struct if that
		 * isn't strictly bound to the life-time of *this* particular connection.
		 *
		 */);
	}
	public int call_extract_if_dead(Object param) {
		prunedead p = (prunedead)param;
		Curl_easy generatedData = p.getData();
		if (ModernizedCProgram.extract_if_dead(conn, generatedData)) {
			p.setExtracted(/* stop the iteration here, pass back the connection that was extracted */conn);
			return 1;
		} 
		return /* continue iteration */0/*
		 * This function scans the connection cache for half-open/dead connections,
		 * closes and removes them.
		 * The cleanup is done at most once per second.
		 */;
	}
	public void Curl_verboseconnect() {
		Curl_easy generatedData = this.getData();
		Object generatedSet = generatedData.getSet();
		ConnectBits generatedBits = this.getBits();
		Object generatedSocksproxy = generatedBits.getSocksproxy();
		proxy_info generatedSocks_proxy = this.getSocks_proxy();
		hostname generatedHost = generatedSocks_proxy.getHost();
		Object generatedDispname = generatedHost.getDispname();
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		Object generatedConn_to_host = generatedBits.getConn_to_host();
		Object generatedIp_addr_str = this.getIp_addr_str();
		long generatedPort = this.getPort();
		long generatedConnection_id = this.getConnection_id();
		if (generatedSet.getVerbose()) {
			generatedData.Curl_infof("Connected to %s (%s) port %ld (#%ld)\n", generatedSocksproxy ? generatedDispname : generatedHttpproxy ? generatedDispname : generatedConn_to_host ? generatedDispname : generatedDispname, generatedIp_addr_str, generatedPort, generatedConnection_id);
		} 
	}
	public connectdata allocate_conn(Curl_easy data) {
		connectdata conn = .Curl_ccalloc(1, );
		if (!conn) {
			return ((Object)0/* The SSL backend-specific data (ssl_backend_data) objects are allocated as
			     a separate array to ensure suitable alignment.
			     Note that these backend pointers can be swapped by vtls (eg ssl backend
			     data becomes proxy backend data). */);
		} 
		conn.setHandler(/* Be sure we have a handler defined
		                                           already from start to avoid NULL
		                                           situations and checks */ModernizedCProgram.Curl_handler_dummy);
		Object generatedSock = conn.getSock();
		generatedSock[0] = /* and we setup a few fields in case we end up actually using this struct *//* no file descriptor */CURL_SOCKET_BAD;
		generatedSock[1] = /* no file descriptor */CURL_SOCKET_BAD;
		Object generatedTempsock = conn.getTempsock();
		generatedTempsock[0] = /* no file descriptor */CURL_SOCKET_BAD;
		generatedTempsock[1] = /* no file descriptor */CURL_SOCKET_BAD;
		conn.setConnection_id(-/* no ID */1);
		conn.setPort(-/* unknown at this point */1);
		conn.setRemote_port(-/* unknown at this point */1/* no file descriptor *//* no file descriptor *//* USE_RECV_BEFORE_SEND_WORKAROUND && DEBUGBUILD */);
		conn.Curl_conncontrol(/* Default protocol-independent behavior doesn't support persistent
		     connections, so we set this to force-close. Protocols that support
		     this need to set this to FALSE in their "curl_do" functions. */1);
		curltime curltime = new curltime();
		conn.setCreated(curltime.Curl_now());
		conn.setKeepalive(curltime.Curl_now());
		Object generatedSet = data.getSet();
		conn.setUpkeep_interval_ms(generatedSet.getUpkeep_interval_ms());
		conn.setData(/* Setup the association between this connection
		                        and the Curl_easy */data);
		proxy_info generatedHttp_proxy = conn.getHttp_proxy();
		generatedHttp_proxy.setProxytype(generatedSet.getProxytype());
		proxy_info generatedSocks_proxy = conn.getSocks_proxy();
		generatedSocks_proxy.setProxytype(CURLPROXY_SOCKS4);
		ConnectBits generatedBits = conn.getBits();
		generatedBits.setProxy((generatedSet.getStr()[/* note that these two proxy bits are now just on what looks to be
		     requested, they may be altered down the road */dupstring.STRING_PROXY] && generatedSet.getStr()[dupstring.STRING_PROXY]) ? 1 : 0);
		Object generatedProxy = generatedBits.getProxy();
		Object generatedProxytype = generatedHttp_proxy.getProxytype();
		generatedBits.setHttpproxy((generatedProxy && (generatedProxytype == CURLPROXY_HTTP || generatedProxytype == CURLPROXY_HTTP_1_0 || generatedProxytype == CURLPROXY_HTTPS)) ? 1 : 0);
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		generatedBits.setSocksproxy((generatedProxy && !generatedHttpproxy) ? 1 : 0);
		if (generatedSet.getStr()[dupstring.STRING_PRE_PROXY] && generatedSet.getStr()[dupstring.STRING_PRE_PROXY]) {
			generatedBits.setProxy(1);
			generatedBits.setSocksproxy(1);
		} 
		generatedBits.setProxy_user_passwd((generatedSet.getStr()[dupstring.STRING_PROXYUSERNAME]) ? 1 : 0);
		generatedBits.setTunnel_proxy(generatedSet.getTunnel_thru_httpproxy());
		generatedBits.setUser_passwd((generatedSet.getStr()[dupstring.STRING_USERNAME]) ? 1 : 0);
		generatedBits.setFtp_use_epsv(generatedSet.getFtp_use_epsv());
		generatedBits.setFtp_use_eprt(generatedSet.getFtp_use_eprt());
		ssl_primary_config generatedSsl_config = conn.getSsl_config();
		generatedSsl_config.setVerifystatus(generatedSet.getSsl().getPrimary().getVerifystatus());
		generatedSsl_config.setVerifypeer(generatedSet.getSsl().getPrimary().getVerifypeer());
		generatedSsl_config.setVerifyhost(generatedSet.getSsl().getPrimary().getVerifyhost());
		ssl_primary_config generatedProxy_ssl_config = conn.getProxy_ssl_config();
		generatedProxy_ssl_config.setVerifystatus(generatedSet.getProxy_ssl().getPrimary().getVerifystatus());
		generatedProxy_ssl_config.setVerifypeer(generatedSet.getProxy_ssl().getPrimary().getVerifypeer());
		generatedProxy_ssl_config.setVerifyhost(generatedSet.getProxy_ssl().getPrimary().getVerifyhost());
		conn.setIp_version(generatedSet.getIpver());
		generatedBits.setConnect_only(generatedSet.getConnect_only());
		conn.setTransport(/* most of them are TCP streams */.TRNSPRT_TCP);
		curl_llist generatedEasyq = conn.getEasyq();
		generatedEasyq.Curl_llist_init(((Object)/* Initialize the easy handle list */0));
		Byte generatedLocaldev = conn.getLocaldev();
		if (generatedSet.getStr()[/* Store the local bind parameters that will be used for this connection */dupstring.STRING_DEVICE]) {
			conn.setLocaldev(.Curl_cstrdup(generatedSet.getStr()[dupstring.STRING_DEVICE]));
			if (!generatedLocaldev) {
				;
			} 
		} 
		conn.setLocalportrange(generatedSet.getLocalportrange());
		conn.setLocalport(generatedSet.getLocalport());
		conn.setFclosesocket(generatedSet.getFclosesocket());
		conn.setClosesocket_client(generatedSet.getClosesocket_client());
		return conn;
		.Curl_cfree(generatedLocaldev);
		.Curl_cfree(conn);
		return ((Object)0);
	}
	public void zonefrom_url(Object uh) {
		byte zoneid;
		 uc = new ();
		uc = .curl_url_get(uh, CURLUPART_ZONEID, zoneid, 0);
		Curl_easy generatedData = this.getData();
		if (!uc && zoneid) {
			byte endp;
			long scope = .strtoul(zoneid, endp, 10);
			if (!endp && (scope < -1024)) {
				this.setScope_id((int)/* A plain number, use it directly as a scope id. */scope);
			}  else if (ModernizedCProgram.Curl_if_nametoindex) {
				int scopeidx = /* Zone identifier is not numeric */0;
				scopeidx = .Curl_if_nametoindex(zoneid);
				if (!scopeidx) {
					generatedData.Curl_infof("Invalid zoneid: %s; %s\n", zoneid, .strerror((._errno())));
				} else {
						this.setScope_id(scopeidx);
				} 
			} 
			.Curl_cfree(/* HAVE_IF_NAMETOINDEX || WIN32 */zoneid);
		} 
	}
	public Object setup_connection_internals() {
		Curl_handler p = new Curl_handler();
		 result = new ();
		Object generatedHandler = this.getHandler();
		p = generatedHandler;
		if (p.getSetup_connection()) {
			result = .UNRECOGNIZEDFUNCTIONNAME(conn);
			if (result) {
				return result;
			} 
			p = generatedHandler;
		} 
		long generatedPort = this.getPort();
		if (generatedPort < 0/* we check for -1 here since if proxy was detected already, this
		       was very likely already set to the proxy port */) {
			this.setPort(p.getDefport());
		} 
		return CURLE_OK/*
		 * Curl_free_request_state() should free temp data that was allocated in the
		 * Curl_easy for this single request.
		 */;
	}
	public Byte detect_proxy() {
		byte proxy = ((Object)0/* If proxy was not specified, we check for default proxy environment
		   * variables, to enable i.e Lynx compliance:
		   *
		   * http_proxy=http://some.server.dom:port/
		   * https_proxy=http://some.server.dom:port/
		   * ftp_proxy=http://some.server.dom:port/
		   * no_proxy=domain1.dom,host.domain2.dom
		   *   (a comma-separated list of hosts which should
		   *   not be proxied, or an asterisk to override
		   *   all proxy variables)
		   * all_proxy=http://some.server.dom:port/
		   *   (seems to exist for the CERN www lib. Probably
		   *   the first to check for.)
		   *
		   * For compatibility, the all-uppercase versions of these variables are
		   * checked if the lowercase versions don't exist.
		   */);
		byte[] proxy_env = new byte[128];
		Object generatedHandler = this.getHandler();
		byte protop = generatedHandler.getScheme();
		byte envp = proxy_env;
		byte prox;
		while (/* Now, build <protocol>_proxy and check for such a one to use */protop) {
			envp++ = (byte).tolower((int)protop++);
		}
		.strcpy(envp, /* append _proxy */"_proxy");
		prox = ModernizedCProgram.curl_getenv(/* read the protocol proxy: */proxy_env/*
		   * We don't try the uppercase version of HTTP_PROXY because of
		   * security reasons:
		   *
		   * When curl is used in a webserver application
		   * environment (cgi or php), this environment variable can
		   * be controlled by the web server user by setting the
		   * http header 'Proxy:' to some value.
		   *
		   * This can cause 'internal' http/ftp requests to be
		   * arbitrarily redirected by any external attacker.
		   */);
		if (!prox && !ModernizedCProgram.Curl_strcasecompare("http_proxy", proxy_env)) {
			ModernizedCProgram.Curl_strntoupper(proxy_env, proxy_env, );
			prox = ModernizedCProgram.curl_getenv(proxy_env);
		} 
		envp = proxy_env;
		if (prox) {
			proxy = /* use this */prox;
		} else {
				envp = (byte)"all_proxy";
				proxy = ModernizedCProgram.curl_getenv(/* default proxy to use */envp);
				if (!proxy) {
					envp = (byte)"ALL_PROXY";
					proxy = ModernizedCProgram.curl_getenv(envp);
				} 
		} 
		Curl_easy generatedData = this.getData();
		if (proxy) {
			generatedData.Curl_infof("Uses proxy env variable %s == '%s'\n", envp, proxy);
		} 
		return proxy/* CURL_DISABLE_HTTP *//*
		 * If this is supposed to use a proxy, we need to figure out the proxy
		 * host name, so that we can re-use an existing connection
		 * that may exist registered to the same proxy host.
		 */;
	}
	/* create_conn helper to parse and init proxy values. to be called after unix
	   socket init but before any proxy vars are evaluated. */
	public Object create_conn_helper_init_proxy() {
		byte proxy = ((Object)0);
		byte socksproxy = ((Object)0);
		byte no_proxy = ((Object)0);
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		ConnectBits generatedBits = this.getBits();
		Object generatedProxy_user_passwd = generatedBits.getProxy_user_passwd();
		if (generatedProxy_user_passwd) {
			result = ModernizedCProgram.parse_proxy_auth(data, conn);
			if (result) {
				;
			} 
		} 
		Object generatedSet = data.getSet();
		if (generatedSet.getStr()[/*************************************************************
		   * Detect what (if any) proxy to use
		   *************************************************************/dupstring.STRING_PROXY]) {
			proxy = .Curl_cstrdup(generatedSet.getStr()[dupstring.STRING_PROXY]);
			if (((Object)0) == /* if global proxy is set, this is it */proxy) {
				data.Curl_failf("memory shortage");
				result = CURLE_OUT_OF_MEMORY;
				;
			} 
		} 
		if (generatedSet.getStr()[dupstring.STRING_PRE_PROXY]) {
			socksproxy = .Curl_cstrdup(generatedSet.getStr()[dupstring.STRING_PRE_PROXY]);
			if (((Object)0) == /* if global socks proxy is set, this is it */socksproxy) {
				data.Curl_failf("memory shortage");
				result = CURLE_OUT_OF_MEMORY;
				;
			} 
		} 
		if (!generatedSet.getStr()[dupstring.STRING_NOPROXY]) {
			byte p = "no_proxy";
			no_proxy = ModernizedCProgram.curl_getenv(p);
			if (!no_proxy) {
				p = "NO_PROXY";
				no_proxy = ModernizedCProgram.curl_getenv(p);
			} 
			if (no_proxy) {
				generatedData.Curl_infof("Uses proxy env variable %s == '%s'\n", p, no_proxy);
			} 
		} 
		hostname generatedHost = this.getHost();
		Byte generatedName = generatedHost.getName();
		if (ModernizedCProgram.check_noproxy(generatedName, generatedSet.getStr()[dupstring.STRING_NOPROXY] ? generatedSet.getStr()[dupstring.STRING_NOPROXY] : no_proxy)) {
			do {
				.Curl_cfree((proxy));
				(proxy) = ((Object)0);
			} while (0);
			do {
				.Curl_cfree((socksproxy));
				(socksproxy) = ((Object)0);
			} while (0);
		}  else if (!proxy && !socksproxy) {
			proxy = /* if the host is not in the noproxy list, detect proxy. */conn/* CURL_DISABLE_HTTP */.detect_proxy();
		} 
		do {
			.Curl_cfree((no_proxy));
			(no_proxy) = ((Object)0);
		} while (0/* For the time being do not mix proxy and unix domain sockets. See #1274 */);
		Object generatedHandler = this.getHandler();
		if (proxy && (!proxy || (generatedHandler.getFlags() & (1 << 4)))) {
			.Curl_cfree(/* Don't bother with an empty proxy string or if the
			                     protocol doesn't work with network */proxy);
			proxy = ((Object)0);
		} 
		if (socksproxy && (!socksproxy || (generatedHandler.getFlags() & (1 << 4)))) {
			.Curl_cfree(/* Don't bother with an empty socks proxy string or if
			                          the protocol doesn't work with network */socksproxy);
			socksproxy = ((Object)0/***********************************************************************
			   * If this is supposed to use a proxy, we need to figure out the proxy host
			   * name, proxy type and port number, so that we can re-use an existing
			   * connection that may exist registered to the same proxy host.
			   ***********************************************************************/);
		} 
		proxy_info generatedHttp_proxy = this.getHttp_proxy();
		Object generatedProxytype = generatedHttp_proxy.getProxytype();
		Byte generatedRawalloc = generatedHost.getRawalloc();
		Object generatedTunnel_proxy = generatedBits.getTunnel_proxy();
		proxy_info generatedSocks_proxy = this.getSocks_proxy();
		Byte generatedUser = generatedSocks_proxy.getUser();
		Byte generatedPasswd = generatedSocks_proxy.getPasswd();
		if (proxy || socksproxy) {
			if (proxy) {
				result = ModernizedCProgram.parse_proxy(data, conn, proxy, generatedProxytype);
				do {
					.Curl_cfree((proxy));
					(proxy) = ((Object)0);
				} while (/* parse_proxy copies the proxy string */0);
				if (result) {
					;
				} 
			} 
			if (socksproxy) {
				result = ModernizedCProgram.parse_proxy(data, conn, socksproxy, generatedProxytype);
				do {
					.Curl_cfree((socksproxy));
					(socksproxy) = ((Object)0);
				} while (/* parse_proxy copies the socks proxy string */0);
				if (result) {
					;
				} 
			} 
			if (generatedRawalloc) {
				if (!(generatedHandler.getProtocol() & (CURLPROTO_HTTP | /* force this connection's protocol to become HTTP if compatible */CURLPROTO_HTTPS))) {
					if ((generatedHandler.getFlags() & (1 << 11)) && !generatedTunnel_proxy) {
						this.setHandler(ModernizedCProgram.Curl_handler_http);
					} else {
							generatedBits.setTunnel_proxy(/* if not converting to HTTP over the proxy, enforce tunneling */1);
					} 
				} 
				generatedBits.setHttpproxy(1);
			} else {
					generatedBits.setHttpproxy(/* not a HTTP proxy */0);
					generatedBits.setTunnel_proxy(/* no tunneling if not HTTP */0);
			} 
			if (generatedRawalloc) {
				if (!generatedRawalloc) {
					if (!generatedUser) {
						generatedSocks_proxy.setUser(generatedUser);
						generatedHttp_proxy.setUser(((Object)0));
						do {
							.Curl_cfree((generatedPasswd));
							(generatedPasswd) = ((Object)0);
						} while (0);
						generatedSocks_proxy.setPasswd(generatedPasswd);
						generatedHttp_proxy.setPasswd(((Object)0));
					} 
				} 
				generatedBits.setSocksproxy(1);
			} else {
					generatedBits.setSocksproxy(/* not a socks proxy */0);
			} 
		} else {
				generatedBits.setSocksproxy(0);
				generatedBits.setHttpproxy(0);
		} 
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		Object generatedSocksproxy = generatedBits.getSocksproxy();
		generatedBits.setProxy(generatedHttpproxy || generatedSocksproxy);
		Object generatedProxy = generatedBits.getProxy();
		if (!generatedProxy) {
			generatedBits.setProxy(/* we aren't using the proxy after all... */0);
			generatedBits.setHttpproxy(0);
			generatedBits.setSocksproxy(0);
			generatedBits.setProxy_user_passwd(0);
			generatedBits.setTunnel_proxy(0);
		} 
		.Curl_cfree(proxy);
		return result/* CURL_DISABLE_PROXY *//*
		 * Curl_parse_login_details()
		 *
		 * This is used to parse a login string for user name, password and options in
		 * the following formats:
		 *
		 *   user
		 *   user:password
		 *   user:password;options
		 *   user;options
		 *   user;options:password
		 *   :password
		 *   :password;options
		 *   ;options
		 *   ;options:password
		 *
		 * Parameters:
		 *
		 * login    [in]     - The login string.
		 * len      [in]     - The length of the login string.
		 * userp    [in/out] - The address where a pointer to newly allocated memory
		 *                     holding the user will be stored upon completion.
		 * passwdp  [in/out] - The address where a pointer to newly allocated memory
		 *                     holding the password will be stored upon completion.
		 * optionsp [in/out] - The address where a pointer to newly allocated memory
		 *                     holding the options will be stored upon completion.
		 *
		 * Returns CURLE_OK on success.
		 */;
	}
	public Object set_login() {
		 result = CURLE_OK;
		byte setuser = "anonymous";
		byte setpasswd = "ftp@example.com";
		Object generatedHandler = this.getHandler();
		ConnectBits generatedBits = this.getBits();
		Object generatedUser_passwd = generatedBits.getUser_passwd();
		if ((generatedHandler.getFlags() & (1 << 5)) && !generatedUser_passwd) {
			;
		} else {
				setuser = "";
				setpasswd = "";
		} 
		Byte generatedUser = this.getUser();
		if (!generatedUser) {
			this.setUser(.Curl_cstrdup(setuser));
			if (!generatedUser) {
				return CURLE_OUT_OF_MEMORY;
			} 
		} 
		Byte generatedPasswd = this.getPasswd();
		if (!generatedPasswd) {
			this.setPasswd(.Curl_cstrdup(setpasswd));
			if (!generatedPasswd) {
				result = CURLE_OUT_OF_MEMORY;
			} 
		} 
		return result/*
		 * Parses a "host:port" string to connect to.
		 * The hostname and the port may be empty; in this case, NULL is returned for
		 * the hostname and -1 for the port.
		 */;
	}
	public void reuse_conn(connectdata conn) {
		proxy_info generatedHttp_proxy = this.getHttp_proxy();
		hostname generatedHost = generatedHttp_proxy.getHost();
		generatedHost.free_idnconverted_hostname();
		generatedHost.free_idnconverted_hostname();
		Byte generatedRawalloc = generatedHost.getRawalloc();
		.Curl_cfree(generatedRawalloc);
		.Curl_cfree(generatedRawalloc);
		ssl_primary_config generatedSsl_config = this.getSsl_config();
		generatedSsl_config.Curl_free_primary_ssl_config();
		ssl_primary_config generatedProxy_ssl_config = this.getProxy_ssl_config();
		generatedProxy_ssl_config.Curl_free_primary_ssl_config();
		Curl_easy generatedData = this.getData();
		conn.setData(generatedData);
		ConnectBits generatedBits = this.getBits();
		Object generatedUser_passwd = generatedBits.getUser_passwd();
		generatedBits.setUser_passwd(generatedUser_passwd);
		Byte generatedUser = conn.getUser();
		Byte generatedPasswd = conn.getPasswd();
		if (generatedUser_passwd) {
			do {
				.Curl_cfree((generatedUser));
				(generatedUser) = ((Object)0);
			} while (/* use the new user name and password though */0);
			do {
				.Curl_cfree((generatedPasswd));
				(generatedPasswd) = ((Object)0);
			} while (0);
			conn.setUser(generatedUser);
			conn.setPasswd(generatedPasswd);
			this.setUser(((Object)0));
			this.setPasswd(((Object)0));
		} 
		Object generatedProxy_user_passwd = generatedBits.getProxy_user_passwd();
		generatedBits.setProxy_user_passwd(generatedProxy_user_passwd);
		proxy_info generatedSocks_proxy = conn.getSocks_proxy();
		if (generatedProxy_user_passwd) {
			do {
				.Curl_cfree((generatedUser));
				(generatedUser) = ((Object)0);
			} while (/* use the new proxy user name and proxy password though */0);
			do {
				.Curl_cfree((generatedUser));
				(generatedUser) = ((Object)0);
			} while (0);
			do {
				.Curl_cfree((generatedPasswd));
				(generatedPasswd) = ((Object)0);
			} while (0);
			do {
				.Curl_cfree((generatedPasswd));
				(generatedPasswd) = ((Object)0);
			} while (0);
			generatedHttp_proxy.setUser(generatedUser);
			generatedSocks_proxy.setUser(generatedUser);
			generatedHttp_proxy.setPasswd(generatedPasswd);
			generatedSocks_proxy.setPasswd(generatedPasswd);
			generatedHttp_proxy.setUser(((Object)0));
			generatedSocks_proxy.setUser(((Object)0));
			generatedHttp_proxy.setPasswd(((Object)0));
			generatedSocks_proxy.setPasswd(((Object)0));
		} 
		generatedHost.free_idnconverted_hostname();
		hostname generatedConn_to_host = conn.getConn_to_host();
		generatedConn_to_host.free_idnconverted_hostname();
		do {
			.Curl_cfree((generatedRawalloc));
			(generatedRawalloc) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedRawalloc));
			(generatedRawalloc) = ((Object)0);
		} while (0);
		conn.setHost(generatedHost);
		conn.setConn_to_host(generatedConn_to_host);
		int generatedConn_to_port = this.getConn_to_port();
		conn.setConn_to_port(generatedConn_to_port);
		int generatedRemote_port = this.getRemote_port();
		conn.setRemote_port(generatedRemote_port);
		Byte generatedHostname_resolve = conn.getHostname_resolve();
		do {
			.Curl_cfree((generatedHostname_resolve));
			(generatedHostname_resolve) = ((Object)0);
		} while (0);
		conn.setHostname_resolve(generatedHostname_resolve);
		this.setHostname_resolve(((Object)0));
		/* persist connection info in session handle */conn.Curl_persistconninfo();
		/* free buffers */old_conn.conn_reset_all_postponed_data();
		generatedBits.setReuse(/* re-use init *//* yes, we're re-using here */1);
		do {
			.Curl_cfree((generatedUser));
			(generatedUser) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedPasswd));
			(generatedPasswd) = ((Object)0);
		} while (0);
		Byte generatedOptions = this.getOptions();
		do {
			.Curl_cfree((generatedOptions));
			(generatedOptions) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedUser));
			(generatedUser) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedUser));
			(generatedUser) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedPasswd));
			(generatedPasswd) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedPasswd));
			(generatedPasswd) = ((Object)0);
		} while (0);
		Byte generatedLocaldev = this.getLocaldev();
		do {
			.Curl_cfree((generatedLocaldev));
			(generatedLocaldev) = ((Object)0);
		} while (0);
		curl_llist generatedEasyq = this.getEasyq();
		generatedEasyq.Curl_llist_destroy(((Object)0/**
		 * create_conn() sets up a new connectdata struct, or re-uses an already
		 * existing one, and resolves host name.
		 *
		 * if this function returns CURLE_OK and *async is set to TRUE, the resolve
		 * response will be coming asynchronously. If *async is FALSE, the name is
		 * already resolved.
		 *
		 * @param data The sessionhandle pointer
		 * @param in_connect is set to the next connection data pointer
		 * @param async is set TRUE when an async DNS resolution is pending
		 * @see Curl_setup_conn()
		 *
		 * *NOTE* this function assigns the conn->data pointer!
		 */));
	}
	public Object Curl_setup_conn( protocol_done) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		data.Curl_pgrsTime(.TIMER_NAMELOOKUP);
		Object generatedHandler = this.getHandler();
		if (generatedHandler.getFlags() & (1 << 4)) {
			protocol_done = /* nothing to setup when not using a network */1;
			return result;
		} 
		protocol_done = /* default to not done */0/* set proxy_connect_closed to false unconditionally already here since it
		     is used strictly to provide extra information to a parent function in the
		     case of proxy CONNECT failures and we must make sure we don't have it
		     lingering set from a previous invoke */;
		ConnectBits generatedBits = this.getBits();
		generatedBits.setProxy_connect_closed(0/*
		   * Set user-agent. Used for HTTP, but since we can attempt to tunnel
		   * basically anything through a http proxy we can't limit this based on
		   * protocol.
		   */);
		Object generatedSet = data.getSet();
		dynamically_allocated_data generatedAllocptr = this.getAllocptr();
		Byte generatedUagent = generatedAllocptr.getUagent();
		if (generatedSet.getStr()[dupstring.STRING_USERAGENT]) {
			do {
				.Curl_cfree((generatedUagent));
				(generatedUagent) = ((Object)0);
			} while (0);
			generatedAllocptr.setUagent(ModernizedCProgram.curl_maprintf("User-Agent: %s\r\n", generatedSet.getStr()[dupstring.STRING_USERAGENT]));
			if (!generatedUagent) {
				return CURLE_OUT_OF_MEMORY;
			} 
		} 
		Object generatedReq = data.getReq();
		generatedReq.setHeaderbytecount(0/* reset CRLF conversion counter */);
		curltime curltime = new curltime();
		this.setNow(curltime.Curl_now());
		Object generatedSock = this.getSock();
		Object generatedTcpconnect = generatedBits.getTcpconnect();
		Curl_dns_entry generatedDns_entry = this.getDns_entry();
		Object generatedSsl = this.getSsl();
		if (CURL_SOCKET_BAD == generatedSock[0]) {
			generatedTcpconnect[0] = 0;
			result = conn.Curl_connecthost(generatedDns_entry);
			if (result) {
				return result;
			} 
		} else {
				data.Curl_pgrsTime(/* we're connected already */.TIMER_CONNECT);
				if (generatedSsl[0].getUse() || (generatedHandler.getProtocol() & (CURLPROTO_SCP | CURLPROTO_SFTP))) {
					data.Curl_pgrsTime(/* we're connected already */.TIMER_APPCONNECT);
				} 
				generatedTcpconnect[0] = 1;
				protocol_done = 1;
				conn.Curl_updateconninfo(generatedSock[0]);
				conn.Curl_verboseconnect();
		} 
		this.setNow(curltime.Curl_now());
		return result;
	}
	/* Close and clean-up the connection's writer stack. */
	public void Curl_unencode_cleanup() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		SingleRequest k = generatedReq;
		contenc_writer_s generatedWriter_stack = k.getWriter_stack();
		contenc_writer writer = generatedWriter_stack;
		contenc_writer_s generatedDownstream = writer.getDownstream();
		while (writer) {
			k.setWriter_stack(generatedDownstream);
			.UNRECOGNIZEDFUNCTIONNAME(conn, writer);
			.Curl_cfree(writer);
			writer = generatedWriter_stack;
		}
	}
	/* Set-up the unencoding stack from the Content-Encoding header value.
	 * See RFC 7231 section 3.1.2.2. */
	public Object Curl_build_unencoding_stack(Object enclist, int maybechunked) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		SingleRequest k = generatedReq;
		contenc_writer_s generatedWriter_stack = k.getWriter_stack();
		do {
			byte name;
			size_t namelen = new size_t();
			while ((ModernizedCProgram.Curl_isspace((int)((byte)enclist))) || enclist == /* Parse a single encoding name. */(byte)',') {
				enclist++;
			}
			ModernizedCProgram.name = enclist;
			for (namelen = 0; enclist && enclist != (byte)','; enclist++) {
				if (!(ModernizedCProgram.Curl_isspace((int)((byte)enclist)))) {
					namelen = enclist - ModernizedCProgram.name + 1;
				} 
			}
			if (maybechunked && namelen == 7 && ModernizedCProgram.Curl_strncasecompare(ModernizedCProgram.name, "chunked", /* Special case: chunked encoding is handled at the reader level. */7)) {
				k.setChunk(/* chunks coming our way. */1);
				/* init our chunky engine. */conn.Curl_httpchunk_init();
			}  else if (namelen) {
				content_encoding encoding = ModernizedCProgram.find_encoding(ModernizedCProgram.name, namelen);
				contenc_writer writer = new contenc_writer();
				if (!generatedWriter_stack) {
					k.setWriter_stack(((Object)0).new_unencoding_writer(conn, ModernizedCProgram.client_encoding));
					if (!generatedWriter_stack) {
						return CURLE_OUT_OF_MEMORY;
					} 
				} 
				if (!encoding) {
					encoding = /* Defer error at stack use. */ModernizedCProgram.error_encoding;
				} 
				writer = generatedWriter_stack.new_unencoding_writer(conn, encoding);
				if (!writer) {
					return CURLE_OUT_OF_MEMORY;
				} 
				k.setWriter_stack(writer);
			} 
		} while (enclist);
		return CURLE_OK/* Stubs for builds without HTTP. */;
	}
	/* Satisfy caller. */
	/* CURL_DISABLE_HTTP */
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
	/* The last 3 #include files should be in this order */
	/*
	 * convert_lineends() changes CRLF (\r\n) end-of-line markers to a single LF
	 * (\n), with special processing for CRLF sequences that are split between two
	 * blocks of data.  Remaining, bare CRs are changed to LFs.  The possibly new
	 * size of the data is returned.
	 */
	/* sanity check */
	/* The previous block of incoming data
	       had a trailing CR, which was turned into a LF. */
	/* This block of incoming data starts with the
	         previous block's LF so get rid of it */
	/* and it wasn't a bare CR but a CRLF conversion instead */
	/* reset the flag */
	/* find 1st CR, if any */
	/* at least one CR, now look for CRLF */
	/* note that it's size-1, so we'll never look past the last byte */
	/* CRLF found, bump past the CR and copy the NL */
	/* keep track of how many CRLFs we converted */
	/* lone CR, move LF instead */
	/* not a CRLF nor a CR, just copy whatever it is */
	/* end of while loop */
	/* handle last byte */
	/* deal with a CR at the end of the buffer */
	/* copy a NL instead */
	/* note that a CRLF might be split across two blocks */
	/* copy last byte */
	/* tidy up by null terminating the now shorter data */
	/* CURL_DO_LINEEND_CONV */
	public  Curl_recv_has_postponed_data(int sockindex) {
		Object generatedPostponed = this.getPostponed();
		postponed_data psnd = (generatedPostponed[sockindex]);
		Byte generatedBuffer = psnd.getBuffer();
		Object generatedAllocated_size = psnd.getAllocated_size();
		Object generatedRecv_size = psnd.getRecv_size();
		Object generatedRecv_processed = psnd.getRecv_processed();
		return generatedBuffer && generatedAllocated_size && generatedRecv_size > generatedRecv_processed;
	}
	public void pre_receive_plain(int num) {
		Object generatedSock = this.getSock();
		 sockfd = generatedSock[num];
		Object generatedPostponed = this.getPostponed();
		postponed_data psnd = (generatedPostponed[num]);
		Object generatedAllocated_size = psnd.getAllocated_size();
		Object generatedRecv_size = psnd.getRecv_size();
		size_t bytestorecv = generatedAllocated_size - generatedRecv_size;
		Object generatedHandler = this.getHandler();
		Object generatedRecv = this.getRecv();
		Byte generatedBuffer = psnd.getBuffer();
		Curl_easy generatedData = this.getData();
		Object generatedSet = generatedData.getSet();
		if ((generatedHandler.getProtocol() & (CURLPROTO_HTTP | CURLPROTO_HTTPS)) != 0 && generatedRecv[num] == ModernizedCProgram.Curl_recv_plain && (!generatedBuffer || bytestorecv)) {
			int readymask = ModernizedCProgram.Curl_socket_check(sockfd, CURL_SOCKET_BAD, CURL_SOCKET_BAD, 0);
			if (readymask != -1 && (readymask & CURL_CSELECT_IN) != 0) {
				if (!generatedBuffer) {
					psnd.setAllocated_size(2 * generatedSet.getBuffer_size());
					psnd.setBuffer(.Curl_cmalloc(generatedAllocated_size));
					psnd.setRecv_size(0);
					psnd.setRecv_processed(0);
					bytestorecv = generatedAllocated_size;
				} 
				if (generatedBuffer) {
					ssize_t recvedbytes = new ssize_t();
					do {
					} while (0);
					recvedbytes = (ssize_t).recv((SOCKET)(sockfd), (byte)(generatedBuffer + generatedRecv_size), (int)(bytestorecv), (int)(false));
					if (recvedbytes > 0) {
						generatedRecv_size += recvedbytes;
					} 
				} else {
						psnd.setAllocated_size(0);
				} 
			} 
		} 
	}
	public Object get_pre_recved(int num, Byte buf, Object len) {
		Object generatedPostponed = this.getPostponed();
		postponed_data psnd = (generatedPostponed[num]);
		size_t copysize = new size_t();
		Byte generatedBuffer = psnd.getBuffer();
		if (!generatedBuffer) {
			return 0;
		} 
		do {
		} while (0);
		do {
		} while (0);
		do {
		} while (0/* Check and process data that already received and storied in internal
		     intermediate buffer */);
		Object generatedRecv_size = psnd.getRecv_size();
		Object generatedRecv_processed = psnd.getRecv_processed();
		if (generatedRecv_size > generatedRecv_processed) {
			do {
			} while (0);
			copysize = ((len) < (generatedRecv_size - generatedRecv_processed) ? (len) : (generatedRecv_size - generatedRecv_processed));
			.memcpy(buf, generatedBuffer + generatedRecv_processed, copysize);
			generatedRecv_processed += copysize;
		} else {
				copysize = /* buffer was allocated, but nothing was received */0;
		} 
		if (generatedRecv_processed == generatedRecv_size) {
			.Curl_cfree(generatedBuffer);
			psnd.setBuffer(((Object)0));
			psnd.setAllocated_size(0);
			psnd.setRecv_size(0);
			psnd.setRecv_processed(0);
		} 
		return (ssize_t)/* DEBUGBUILD */copysize/* ! USE_RECV_BEFORE_SEND_WORKAROUND *//* Use "do-nothing" macros instead of functions when workaround not used */;
	}
	/* Curl_sendf() sends formatted data to the server */
	public Object Curl_sendf(Object sockfd, Object fmt) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		ssize_t bytes_written = new ssize_t();
		size_t write_len = new size_t();
		 result = CURLE_OK;
		byte s;
		byte sptr;
		va_list ap = new va_list();
		.__builtin_va_start(ap, fmt);
		s = ModernizedCProgram.curl_mvaprintf(fmt, /* returns an allocated string */ap);
		.__builtin_va_end(ap);
		if (!s) {
			return /* failure */CURLE_OUT_OF_MEMORY;
		} 
		bytes_written = 0;
		write_len = .strlen(s);
		sptr = s;
		Object generatedSet = data.getSet();
		for (; ; ) {
			result = conn.Curl_write(sockfd, sptr, write_len, /* Write the buffer to the socket */bytes_written);
			if (result) {
				break;
			} 
			if (generatedSet.getVerbose()) {
				data.Curl_debug(CURLINFO_DATA_OUT, sptr, (size_t)bytes_written);
			} 
			if ((size_t)bytes_written != write_len/* if not all was written at once, we must advance the pointer, decrease
			         the size left and try again! */) {
				write_len -= bytes_written;
				sptr += bytes_written;
			} else {
					break;
			} 
		}
		.Curl_cfree(/* free the output string */s);
		return result/*
		 * Curl_write() is an internal write function that sends data to the
		 * server. Works with plain sockets, SCP, SSL or kerberos.
		 *
		 * If the write would block (CURLE_AGAIN), we return CURLE_OK and
		 * (*written == 0). Otherwise we return regular CURLcode value.
		 */;
	}
	public Object Curl_write(Object sockfd, Object mem, Object len, Object written) {
		ssize_t bytes_written = new ssize_t();
		 result = CURLE_OK;
		Object generatedSock = this.getSock();
		int num = (sockfd == generatedSock[1]);
		bytes_written = .UNRECOGNIZEDFUNCTIONNAME(conn, num, mem, len, result);
		written = bytes_written;
		if (bytes_written >= 0) {
			return /* we completely ignore the curlcode value when subzero is not returned */CURLE_OK;
		} 
		switch (/* handle CURLE_AGAIN or a send failure */result) {
		case CURLE_AGAIN:
				written = 0;
				return CURLE_OK;
		case CURLE_OK:
				return /* general send failure */CURLE_SEND_ERROR;
		default:
				return /* we got a specific curlcode, forward it */result;
		}
	}
	public Object Curl_send_plain(int num, Object mem, Object len, Object code) {
		Object generatedSock = this.getSock();
		 sockfd = generatedSock[num];
		ssize_t bytes_written = new ssize_t();
		/* WinSock will destroy unread received data if send() is
		     failed.
		     To avoid lossage of received data, recv() must be
		     performed before every send() if any incoming data is
		     available. */
		conn.pre_receive_plain(num/* Linux */);
		bytes_written = (ssize_t).send((SOCKET)(sockfd), (byte)(mem), (int)(len), (int)(false));
		code = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Object generatedState = generatedData.getState();
		if (-1 == bytes_written) {
			int err = ((int).WSAGetLastError());
			if ((-1024 == /* This is how Windows does it */err/* errno may be EWOULDBLOCK or on some systems EAGAIN when it returned
			         due to its inability to send off data without blocking. We therefore
			         treat both error codes the same here */)) {
				bytes_written = /* this is just a case of EWOULDBLOCK */0;
				code = CURLE_AGAIN;
			} else {
					byte[] buffer = new byte[128];
					generatedData.Curl_failf("Send failure: %s", ModernizedCProgram.Curl_strerror(err, ModernizedCProgram.buffer, ));
					generatedState.setOs_errno(err);
					code = CURLE_SEND_ERROR;
			} 
		} 
		return bytes_written/*
		 * Curl_write_plain() is an internal write function that sends data to the
		 * server using plain sockets only. Otherwise meant to have the exact same
		 * proto as Curl_write()
		 */;
	}
	public Object Curl_write_plain(Object sockfd, Object mem, Object len, Object written) {
		ssize_t bytes_written = new ssize_t();
		 result = new ();
		Object generatedSock = this.getSock();
		int num = (sockfd == generatedSock[1]);
		bytes_written = conn.Curl_send_plain(num, mem, len, result);
		written = bytes_written;
		return result;
	}
	public Object Curl_recv_plain(int num, Byte buf, Object len, Object code) {
		Object generatedSock = this.getSock();
		 sockfd = generatedSock[num];
		ssize_t nread = new ssize_t();
		/* Check and return data that already received and storied in internal
		     intermediate buffer */
		nread = conn.get_pre_recved(num, buf, len);
		if (nread > 0) {
			code = CURLE_OK;
			return nread;
		} 
		nread = (ssize_t).recv((SOCKET)(sockfd), (byte)(buf), (int)(len), (int)(false));
		code = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Object generatedState = generatedData.getState();
		if (-1 == nread) {
			int err = ((int).WSAGetLastError());
			if ((-1024 == /* This is how Windows does it */err/* errno may be EWOULDBLOCK or on some systems EAGAIN when it returned
			         due to its inability to send off data without blocking. We therefore
			         treat both error codes the same here */)) {
				code = /* this is just a case of EWOULDBLOCK */CURLE_AGAIN;
			} else {
					byte[] buffer = new byte[128];
					generatedData.Curl_failf("Recv failure: %s", ModernizedCProgram.Curl_strerror(err, ModernizedCProgram.buffer, ));
					generatedState.setOs_errno(err);
					code = CURLE_RECV_ERROR;
			} 
		} 
		return nread;
	}
	public Object chop_write(int type, Byte optr, Object olen) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 writeheader = ((Object)0);
		 writebody = ((Object)0);
		byte ptr = optr;
		size_t len = olen;
		if (!len) {
			return CURLE_OK;
		} 
		Object generatedReq = data.getReq();
		if (generatedReq.getKeepon() & (1 << /* If reading is paused, append this data to the already held data for this
		     type. */4)) {
			return data.pausewrite(type, ptr, len);
		} 
		Object generatedSet = data.getSet();
		if (type & (1 << /* Determine the callback(s) to use. */0)) {
			writebody = generatedSet.getFwrite_func();
		} 
		if ((type & (1 << 1)) && (generatedSet.getFwrite_header() || generatedSet.getWriteheader())) {
			writeheader = generatedSet.getFwrite_header() ? generatedSet.getFwrite_header() : generatedSet.getFwrite_func();
		} 
		Object generatedHandler = this.getHandler();
		while (/* Chop data, write chunks. */len) {
			size_t chunklen = len <= CURL_MAX_WRITE_SIZE ? len : CURL_MAX_WRITE_SIZE;
			if (writebody) {
				size_t wrote = new size_t();
				data.Curl_set_in_callback(.bool_true);
				wrote = .writebody(ptr, 1, chunklen, generatedSet.getOut());
				data.Curl_set_in_callback(.bool_false);
				if (CURL_WRITEFUNC_PAUSE == wrote) {
					if (generatedHandler.getFlags() & (1 << 4/* Protocols that work without network cannot be paused. This is
					             actually only FILE:// just now, and it can't pause since the
					             transfer isn't done using the "normal" procedure. */)) {
						data.Curl_failf("Write callback asked for PAUSE when not supported!");
						return CURLE_WRITE_ERROR;
					} 
					return data.pausewrite(type, ptr, len);
				} 
				if (wrote != chunklen) {
					data.Curl_failf("Failed writing body (%zu != %zu)", wrote, chunklen);
					return CURLE_WRITE_ERROR;
				} 
			} 
			ptr += chunklen;
			len -= chunklen;
		}
		if (writeheader) {
			size_t wrote = new size_t();
			ptr = optr;
			len = olen;
			data.Curl_set_in_callback(.bool_true);
			wrote = .writeheader(ptr, 1, len, generatedSet.getWriteheader());
			data.Curl_set_in_callback(.bool_false);
			if (CURL_WRITEFUNC_PAUSE == wrote/* here we pass in the HEADER bit only since if this was body as well
			         then it was passed already and clearly that didn't trigger the
			         pause, so this is saved for later with the HEADER bit only */) {
				return data.pausewrite((1 << 1), ptr, len);
			} 
			if (wrote != len) {
				data.Curl_failf("Failed writing header");
				return CURLE_WRITE_ERROR;
			} 
		} 
		return CURLE_OK/* Curl_client_write() sends data to the write callback(s)
		
		   The bit pattern defines to what "streams" to write to. Body and/or header.
		   The defines are in sendf.h of course.
		
		   If CURL_DO_LINEEND_CONV is enabled, data is converted IN PLACE to the
		   local character encoding.  This is a problem and should be changed in
		   the future to leave the original data alone.
		 */;
	}
	public Object Curl_client_write(int type, Byte ptr, Object len) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		if (0 == len) {
			len = .strlen(ptr);
		} 
		do {
		} while (0);
		Object generatedHandler = this.getHandler();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		if ((type & (1 << /* FTP data may need conversion. */0)) && (generatedHandler.getProtocol() & (CURLPROTO_FTP | CURLPROTO_FTPS)) && generatedFtpc.getTransfertype() == (byte)'A') {
			 result = ();
			if (/* Curl_convert_from_network calls failf if unsuccessful */ModernizedCProgram.result) {
				return ModernizedCProgram.result/* convert end-of-line markers */;
			} 
		} 
		return conn.chop_write(type, ptr, /* CURL_DO_LINEEND_CONV */len);
	}
	/* connection data */
	public Object Curl_read(Object sockfd, Byte buf, Object sizerequested, Object n) {
		 result = /* max amount to read *//* amount bytes read */CURLE_RECV_ERROR;
		ssize_t nread = 0;
		size_t bytesfromsocket = 0;
		byte buffertofill = ((Object)0);
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedSock = this.getSock();
		int num = (sockfd == generatedSock[1]);
		n = /* reset amount to zero */0;
		Object generatedSet = data.getSet();
		bytesfromsocket = ((sizerequested) < ((size_t)generatedSet.getBuffer_size()) ? (sizerequested) : ((size_t)generatedSet.getBuffer_size()));
		buffertofill = buf;
		nread = .UNRECOGNIZEDFUNCTIONNAME(conn, num, buffertofill, bytesfromsocket, result);
		if (nread < 0) {
			return result;
		} 
		n += nread;
		return CURLE_OK;
	}
	/* read from this socket */
	/* store read data here */
	public void conn_state(smb_conn_state newstate) {
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		smbc.setState(/* LAST */smb_conn_state.newstate);
	}
	public void request_state(smb_req_state newstate) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		smb_request req = generatedReq.getProtop();
		req.setState(/* LAST */smb_req_state.newstate);
	}
	/***************************************************************************
	 *                                  _   _ ____  _
	 *  Project                     ___| | | |  _ \| |
	 *                             / __| | | | |_) | |
	 *                            | (__| |_| |  _ <| |___
	 *                             \___|\___/|_| \_\_____|
	 *
	 * Copyright (C) 2014, Bill Nagel <wnagel@tycoint.com>, Exacq Technologies
	 * Copyright (C) 2016-2019, Daniel Stenberg, <daniel@haxx.se>, et al.
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
	/* The last #include files should be: */
	/* Local API functions */
	/* this should setup things in the connection, not in the easy
	   handle */
	public Object smb_setup_connection() {
		smb_request req = new smb_request();
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		generatedReq.setProtop(req = .Curl_ccalloc(1, /* Initialize the request state */));
		if (!req) {
			return CURLE_OUT_OF_MEMORY;
		} 
		return /* Parse the URL path */conn.smb_parse_url_path();
	}
	public Object smb_connect( done) {
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		byte slash;
		(Object)done;
		ConnectBits generatedBits = this.getBits();
		Object generatedUser_passwd = generatedBits.getUser_passwd();
		if (!generatedUser_passwd) {
			return CURLE_LOGIN_DENIED;
		} 
		smbc.setState(/* Initialize the connection state */smb_conn_state.SMB_CONNECTING);
		smbc.setRecv_buf(.Curl_cmalloc((-1024 + -1024)));
		Byte generatedRecv_buf = smbc.getRecv_buf();
		if (!generatedRecv_buf) {
			return CURLE_OUT_OF_MEMORY;
		} 
		conn.Curl_conncontrol(/* Multiple requests are allowed with this connection */0);
		Byte generatedUser = this.getUser();
		slash = .strchr(generatedUser, /* Parse the username, domain, and password */(byte)'/');
		if (!slash) {
			slash = .strchr(generatedUser, (byte)'\\');
		} 
		Byte generatedDomain = smbc.getDomain();
		hostname generatedHost = this.getHost();
		Byte generatedName = generatedHost.getName();
		if (slash) {
			smbc.setUser(slash + 1);
			smbc.setDomain(.Curl_cstrdup(generatedUser));
			if (!generatedDomain) {
				return CURLE_OUT_OF_MEMORY;
			} 
			generatedDomain[slash - generatedUser] = 0;
		} else {
				smbc.setUser(generatedUser);
				smbc.setDomain(.Curl_cstrdup(generatedName));
				if (!generatedDomain) {
					return CURLE_OUT_OF_MEMORY;
				} 
		} 
		return CURLE_OK;
	}
	public Object smb_recv_message(Object msg) {
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		Byte generatedRecv_buf = smbc.getRecv_buf();
		byte buf = generatedRecv_buf;
		ssize_t bytes_read = new ssize_t();
		size_t nbt_size = new size_t();
		size_t msg_size = new size_t();
		Object generatedGot = smbc.getGot();
		size_t len = (-1024 + -1024) - generatedGot;
		 result = new ();
		result = conn.Curl_read(0, buf + generatedGot, len, bytes_read);
		if (result) {
			return result;
		} 
		if (!bytes_read) {
			return CURLE_OK;
		} 
		generatedGot += bytes_read;
		if (generatedGot < /* Check for a 32-bit nbt header */) {
			return CURLE_OK;
		} 
		nbt_size = ModernizedCProgram.Curl_read16_be((byte)(buf + )) + ;
		if (generatedGot < nbt_size) {
			return CURLE_OK;
		} 
		msg_size = ;
		if (nbt_size >= msg_size + 1) {
			msg_size += 1 + ((byte)buf[msg_size]) * /* Add the word count */;
			if (nbt_size >= msg_size + ) {
				msg_size += /* Add the byte count */ + ModernizedCProgram.Curl_read16_le((byte)buf[msg_size]);
				if (nbt_size < msg_size) {
					return CURLE_READ_ERROR;
				} 
			} 
		} 
		msg = buf;
		return CURLE_OK;
	}
	public void smb_pop_message() {
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		smbc.setGot(0);
	}
	public Object smb_send(Object len, Object upload_size) {
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		ssize_t bytes_written = new ssize_t();
		 result = new ();
		Curl_easy generatedData = this.getData();
		Object generatedState = generatedData.getState();
		result = conn.Curl_write(0, generatedState.getUlbuf(), len, bytes_written);
		if (result) {
			return result;
		} 
		if (bytes_written != len) {
			smbc.setSend_size(len);
			smbc.setSent(bytes_written);
		} 
		smbc.setUpload_size(upload_size);
		return CURLE_OK;
	}
	public Object smb_flush() {
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		ssize_t bytes_written = new ssize_t();
		Object generatedSend_size = smbc.getSend_size();
		Object generatedSent = smbc.getSent();
		ssize_t len = generatedSend_size - generatedSent;
		 result = new ();
		if (!generatedSend_size) {
			return CURLE_OK;
		} 
		Curl_easy generatedData = this.getData();
		Object generatedState = generatedData.getState();
		result = conn.Curl_write(0, generatedState.getUlbuf() + generatedSent, len, bytes_written);
		if (result) {
			return result;
		} 
		if (bytes_written != len) {
			generatedSent += bytes_written;
		} else {
				smbc.setSend_size(0);
		} 
		return CURLE_OK;
	}
	public Object smb_send_message(byte cmd, Object msg, Object msg_len) {
		Curl_easy generatedData = this.getData();
		 result = generatedData.Curl_get_upload_buffer();
		if (result) {
			return result;
		} 
		Object generatedState = generatedData.getState();
		ModernizedCProgram.smb_format_message(conn, (smb_header)generatedState.getUlbuf(), cmd, msg_len);
		.memcpy(generatedState.getUlbuf() + , msg, msg_len);
		return conn.smb_send( + msg_len, 0);
	}
	public Object smb_send_negotiate() {
		byte msg = "\x00\x0c\x00\x02NT LM 0.12";
		return conn.smb_send_message(-1024, msg, 15);
	}
	public Object smb_send_setup() {
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		smb_setup msg = new smb_setup();
		Object generatedBytes = msg.getBytes();
		byte p = generatedBytes;
		byte[] lm_hash = new byte[21];
		byte[] lm = new byte[24];
		byte[] nt_hash = new byte[21];
		byte[] nt = new byte[24];
		size_t byte_count =  + ;
		Byte generatedUser = smbc.getUser();
		Byte generatedDomain = smbc.getDomain();
		byte_count += .strlen(generatedUser) + .strlen(generatedDomain);
		byte_count += .strlen("i386-pc-win32") + .strlen("curl") + /* 4 null chars */4;
		if (byte_count > ) {
			return CURLE_FILESIZE_EXCEEDED;
		} 
		Curl_easy generatedData = this.getData();
		Byte generatedPasswd = this.getPasswd();
		generatedData.Curl_ntlm_core_mk_lm_hash(generatedPasswd, lm_hash);
		Object generatedChallenge = smbc.getChallenge();
		ModernizedCProgram.Curl_ntlm_core_lm_resp(lm_hash, generatedChallenge, lm);
		generatedData.Curl_ntlm_core_mk_nt_hash(generatedPasswd, nt_hash);
		ModernizedCProgram.Curl_ntlm_core_lm_resp(nt_hash, generatedChallenge, nt);
		.memset(msg, 0, );
		msg.setWord_count(-1024);
		Object generatedAndx = msg.getAndx();
		generatedAndx.setCommand(-1024);
		msg.setMax_buffer_size(((-1024 + -1024)));
		msg.setMax_mpx_count((true));
		msg.setVc_number((true));
		int generatedSession_key = smbc.getSession_key();
		msg.setSession_key((generatedSession_key));
		msg.setCapabilities((true));
		Object generatedLengths = msg.getLengths();
		generatedLengths[0] = ();
		generatedLengths[1] = ();
		.memcpy(p, lm, );
		p += ;
		.memcpy(p, nt, );
		p += ;
		.strcpy(p, (generatedUser));
		p += .strlen(generatedUser) + 1;
		;
		.strcpy(p, (generatedDomain));
		p += .strlen(generatedDomain) + 1;
		;
		.strcpy(p, ("i386-pc-win32"));
		p += .strlen("i386-pc-win32") + 1;
		;
		.strcpy(p, ("curl"));
		p += .strlen("curl") + 1;
		;
		byte_count = p - generatedBytes;
		msg.setByte_count(((int)byte_count));
		return conn.smb_send_message(-1024, msg,  -  + byte_count);
	}
	public Object smb_send_tree_connect() {
		smb_tree_connect msg = new smb_tree_connect();
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		Object generatedBytes = msg.getBytes();
		byte p = generatedBytes;
		hostname generatedHost = this.getHost();
		Byte generatedName = generatedHost.getName();
		Byte generatedShare = smbc.getShare();
		size_t byte_count = .strlen(generatedName) + .strlen(generatedShare);
		byte_count += .strlen("?????") + /* 2 nulls and 3 backslashes */5;
		if (byte_count > ) {
			return CURLE_FILESIZE_EXCEEDED;
		} 
		.memset(msg, 0, );
		msg.setWord_count(-1024);
		Object generatedAndx = msg.getAndx();
		generatedAndx.setCommand(-1024);
		msg.setPw_len(0);
		.strcpy(p, ("\\\\"));
		p += .strlen("\\\\");
		;
		.strcpy(p, (generatedName));
		p += .strlen(generatedName);
		;
		.strcpy(p, ("\\"));
		p += .strlen("\\");
		;
		.strcpy(p, (generatedShare));
		p += .strlen(generatedShare) + 1;
		;
		.strcpy(p, ("?????"));
		p += .strlen("?????") + /* Match any type of service */1;
		;
		byte_count = p - generatedBytes;
		msg.setByte_count(((int)byte_count));
		return conn.smb_send_message(-1024, msg,  -  + byte_count);
	}
	public Object smb_send_open() {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		smb_request req = generatedReq.getProtop();
		smb_nt_create msg = new smb_nt_create();
		size_t byte_count = new size_t();
		Byte generatedPath = req.getPath();
		Object generatedBytes = msg.getBytes();
		if ((.strlen(generatedPath) + 1) > ) {
			return CURLE_FILESIZE_EXCEEDED;
		} 
		.memset(msg, 0, );
		msg.setWord_count(-1024);
		Object generatedAndx = msg.getAndx();
		generatedAndx.setCommand(-1024);
		byte_count = .strlen(generatedPath);
		msg.setName_length(((int)byte_count));
		msg.setShare_access((true));
		Object generatedSet = generatedData.getSet();
		if (generatedSet.getUpload()) {
			msg.setAccess((-1024 | -1024));
			msg.setCreate_disposition((true));
		} else {
				msg.setAccess((true));
				msg.setCreate_disposition((true));
		} 
		msg.setByte_count(((int)++byte_count));
		.strcpy(generatedBytes, generatedPath);
		return conn.smb_send_message(-1024, msg,  -  + byte_count);
	}
	public Object smb_send_close() {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		smb_request req = generatedReq.getProtop();
		smb_close msg = new smb_close();
		.memset(msg, 0, );
		msg.setWord_count(-1024);
		int generatedFid = req.getFid();
		msg.setFid((generatedFid));
		return conn.smb_send_message(-1024, msg, );
	}
	public Object smb_send_tree_disconnect() {
		smb_tree_disconnect msg = new smb_tree_disconnect();
		.memset(msg, 0, );
		return conn.smb_send_message(-1024, msg, );
	}
	public Object smb_send_read() {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		smb_request req = generatedReq.getProtop();
		 offset = generatedReq.getOffset();
		smb_read msg = new smb_read();
		.memset(msg, 0, );
		msg.setWord_count(-1024);
		Object generatedAndx = msg.getAndx();
		generatedAndx.setCommand(-1024);
		int generatedFid = req.getFid();
		msg.setFid((generatedFid));
		msg.setOffset(((int)offset));
		msg.setOffset_high(((int)(offset >> 32)));
		msg.setMin_bytes((true));
		msg.setMax_bytes((true));
		return conn.smb_send_message(-1024, msg, );
	}
	public Object smb_send_write() {
		smb_write msg = new smb_write();
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		smb_request req = generatedReq.getProtop();
		 offset = generatedReq.getOffset();
		 upload_size = generatedReq.getSize() - generatedReq.getBytecount();
		 result = generatedData.Curl_get_upload_buffer();
		if (result) {
			return result;
		} 
		Object generatedState = generatedData.getState();
		msg = (smb_write)generatedState.getUlbuf();
		if (upload_size >= -1024 - /* There is one byte of padding */1) {
			upload_size = -1024 - 1;
		} 
		.memset(msg, 0, );
		msg.setWord_count(-1024);
		Object generatedAndx = msg.getAndx();
		generatedAndx.setCommand(-1024);
		int generatedFid = req.getFid();
		msg.setFid((generatedFid));
		msg.setOffset(((int)offset));
		msg.setOffset_high(((int)(offset >> 32)));
		msg.setData_length(((int)upload_size));
		msg.setData_offset(( - ));
		msg.setByte_count(((int)(upload_size + 1)));
		Object generatedH = msg.getH();
		ModernizedCProgram.smb_format_message(conn, generatedH, -1024,  -  + (size_t)upload_size);
		return conn.smb_send(, (size_t)upload_size);
	}
	public Object smb_send_and_recv(Object msg) {
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		 result = new ();
		msg = ((Object)/* if it returns early */0);
		Object generatedSend_size = smbc.getSend_size();
		Object generatedUpload_size = smbc.getUpload_size();
		Curl_easy generatedData = this.getData();
		Object generatedSet = generatedData.getSet();
		Object generatedState = generatedData.getState();
		Object generatedReq = generatedData.getReq();
		if (!generatedSend_size && generatedUpload_size) {
			size_t nread = generatedUpload_size > generatedSet.getUpload_buffer_size() ? generatedSet.getUpload_buffer_size() : generatedUpload_size;
			generatedReq.setUpload_fromhere(generatedState.getUlbuf());
			result = conn.Curl_fillreadbuffer(nread, nread);
			if (result && result != CURLE_AGAIN) {
				return result;
			} 
			if (!nread) {
				return CURLE_OK;
			} 
			generatedUpload_size -= nread;
			smbc.setSend_size(nread);
			smbc.setSent(0);
		} 
		if (generatedSend_size) {
			result = conn.smb_flush();
			if (result) {
				return result;
			} 
		} 
		if (generatedSend_size || generatedUpload_size) {
			return CURLE_AGAIN;
		} 
		return conn.smb_recv_message(msg);
	}
	public Object smb_connection_state( done) {
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		smb_negotiate_response nrsp = new smb_negotiate_response();
		smb_header h = new smb_header();
		 result = new ();
		Object msg = ((Object)0);
		smb_conn_state generatedState = smbc.getState();
		if (generatedState == smb_conn_state.SMB_CONNECTING) {
			result = conn.smb_send_negotiate();
			if (result) {
				conn.Curl_conncontrol(1);
				return result;
			} 
			conn.conn_state(smb_conn_state.SMB_NEGOTIATE);
		} 
		result = conn.smb_send_and_recv(/* Send the previous message and check for a response */msg);
		if (result && result != CURLE_AGAIN) {
			conn.Curl_conncontrol(1);
			return result;
		} 
		if (!msg) {
			return CURLE_OK;
		} 
		h = msg;
		Object generatedGot = smbc.getGot();
		Object generatedChallenge = smbc.getChallenge();
		Object generatedStatus = h.getStatus();
		Object generatedBytes = nrsp.getBytes();
		Object generatedSession_key = nrsp.getSession_key();
		Object generatedUid = h.getUid();
		switch (generatedState) {
		case smb_conn_state.SMB_SETUP:
				if (generatedStatus) {
					conn.Curl_conncontrol(1);
					return CURLE_LOGIN_DENIED;
				} 
				smbc.setUid((generatedUid));
				conn.conn_state(smb_conn_state.SMB_CONNECTED);
				done = .bool_true;
				break;
		case smb_conn_state.SMB_NEGOTIATE:
				if ((generatedGot <  +  - 1) || generatedStatus) {
					conn.Curl_conncontrol(1);
					return CURLE_COULDNT_CONNECT;
				} 
				nrsp = msg;
				.memcpy(generatedChallenge, generatedBytes, );
				smbc.setSession_key((generatedSession_key));
				result = conn.smb_send_setup();
				if (result) {
					conn.Curl_conncontrol(1);
					return result;
				} 
				conn.conn_state(smb_conn_state.SMB_SETUP);
				break;
		default:
				conn.smb_pop_message();
				return /* ignore */CURLE_OK;
		}
		conn.smb_pop_message();
		return CURLE_OK/*
		 * Convert a timestamp from the Windows world (100 nsec units from 1 Jan 1601)
		 * to Posix time. Cap the output to fit within a time_t.
		 */;
	}
	public Object smb_request_state( done) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		smb_request req = generatedReq.getProtop();
		smb_header h = new smb_header();
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		smb_req_state next_state = smb_req_state.SMB_DONE;
		int len;
		int off;
		 result = new ();
		Object msg = ((Object)0);
		smb_nt_create_response smb_m = new smb_nt_create_response();
		smb_req_state generatedState = req.getState();
		if (generatedState == /* Start the request */smb_req_state.SMB_REQUESTING) {
			result = conn.smb_send_tree_connect();
			if (result) {
				conn.Curl_conncontrol(1);
				return result;
			} 
			conn.request_state(smb_req_state.SMB_TREE_CONNECT);
		} 
		result = conn.smb_send_and_recv(/* Send the previous message and check for a response */msg);
		if (result && result != CURLE_AGAIN) {
			conn.Curl_conncontrol(1);
			return result;
		} 
		if (!msg) {
			return CURLE_OK;
		} 
		h = msg;
		Object generatedStatus = h.getStatus();
		Object generatedTid = h.getTid();
		Object generatedGot = smbc.getGot();
		Object generatedSet = generatedData.getSet();
		Object generatedInfo = generatedData.getInfo();
		switch (generatedState) {
		case smb_req_state.SMB_CLOSE:
				smb_req_state.next_state = /* We don't care if the close failed, proceed to tree disconnect anyway */smb_req_state.SMB_TREE_DISCONNECT;
				break;
		case smb_req_state.SMB_UPLOAD:
				if (generatedStatus || generatedGot <  + 6) {
					req.setResult(CURLE_UPLOAD_FAILED);
					smb_req_state.next_state = smb_req_state.SMB_CLOSE;
					break;
				} 
				len = ModernizedCProgram.Curl_read16_le(((byte)msg) +  + 5);
				generatedReq.getBytecount() += len;
				generatedReq.getOffset() += len;
				generatedData.Curl_pgrsSetUploadCounter(generatedReq.getBytecount());
				if (generatedReq.getBytecount() >= generatedReq.getSize()) {
					smb_req_state.next_state = smb_req_state.SMB_CLOSE;
				} else {
						smb_req_state.next_state = smb_req_state.SMB_UPLOAD;
				} 
				break;
		case smb_req_state.SMB_TREE_CONNECT:
				if (generatedStatus) {
					req.setResult(CURLE_REMOTE_FILE_NOT_FOUND);
					if (generatedStatus == (true)) {
						req.setResult(CURLE_REMOTE_ACCESS_DENIED);
					} 
					break;
				} 
				req.setTid((generatedTid));
				smb_req_state.next_state = smb_req_state.SMB_OPEN;
				break;
		case smb_req_state.SMB_OPEN:
				if (generatedStatus || generatedGot < ) {
					req.setResult(CURLE_REMOTE_FILE_NOT_FOUND);
					if (generatedStatus == (true)) {
						req.setResult(CURLE_REMOTE_ACCESS_DENIED);
					} 
					smb_req_state.next_state = smb_req_state.SMB_TREE_DISCONNECT;
					break;
				} 
				smb_m = (smb_nt_create_response)msg;
				req.setFid((smb_m.getFid()));
				generatedReq.setOffset(0);
				if (generatedSet.getUpload()) {
					generatedReq.setSize(generatedState.getInfilesize());
					generatedData.Curl_pgrsSetUploadSize(generatedReq.getSize());
					smb_req_state.next_state = smb_req_state.SMB_UPLOAD;
				} else {
						smb_m = (smb_nt_create_response)msg;
						generatedReq.setSize((smb_m.getEnd_of_file()));
						if (generatedReq.getSize() < 0) {
							req.setResult(CURLE_WEIRD_SERVER_REPLY);
							smb_req_state.next_state = smb_req_state.SMB_CLOSE;
						} else {
								generatedData.Curl_pgrsSetDownloadSize(generatedReq.getSize());
								if (generatedSet.getGet_filetime()) {
									ModernizedCProgram.get_posix_time(generatedInfo.getFiletime(), smb_m.getLast_change_time());
								} 
								smb_req_state.next_state = smb_req_state.SMB_DOWNLOAD;
						} 
				} 
				break;
		case smb_req_state.SMB_TREE_DISCONNECT:
				smb_req_state.next_state = smb_req_state.SMB_DONE;
				break;
		case smb_req_state.SMB_DOWNLOAD:
				if (generatedStatus || generatedGot <  + 14) {
					req.setResult(CURLE_RECV_ERROR);
					smb_req_state.next_state = smb_req_state.SMB_CLOSE;
					break;
				} 
				len = ModernizedCProgram.Curl_read16_le(((byte)msg) +  + 11);
				off = ModernizedCProgram.Curl_read16_le(((byte)msg) +  + 13);
				if (len > 0) {
					if (off +  + len > generatedGot) {
						generatedData.Curl_failf("Invalid input packet");
						result = CURLE_RECV_ERROR;
					} else {
							result = conn.Curl_client_write((1 << 0), (byte)msg + off + , len);
					} 
					if (result) {
						req.setResult(result);
						smb_req_state.next_state = smb_req_state.SMB_CLOSE;
						break;
					} 
				} 
				generatedReq.getBytecount() += len;
				generatedReq.getOffset() += len;
				generatedData.Curl_pgrsSetDownloadCounter(generatedReq.getBytecount());
				smb_req_state.next_state = (len < -1024) ? smb_req_state.SMB_CLOSE : smb_req_state.SMB_DOWNLOAD;
				break;
		default:
				conn.smb_pop_message();
				return /* ignore */CURLE_OK;
		}
		conn.smb_pop_message();
		Object generatedResult = req.getResult();
		switch (smb_req_state.next_state) {
		case smb_req_state.SMB_OPEN:
				result = conn.smb_send_open();
				break;
		case smb_req_state.SMB_CLOSE:
				result = conn.smb_send_close();
				break;
		case smb_req_state.SMB_TREE_DISCONNECT:
				result = conn.smb_send_tree_disconnect();
				break;
		case smb_req_state.SMB_DONE:
				result = generatedResult;
				done = .bool_true;
				break;
		case smb_req_state.SMB_UPLOAD:
				result = conn.smb_send_write();
				break;
		case smb_req_state.SMB_DOWNLOAD:
				result = conn.smb_send_read();
				break;
		default:
				break;
		}
		if (result) {
			conn.Curl_conncontrol(1);
			return result;
		} 
		conn.request_state(smb_req_state.next_state);
		return CURLE_OK;
	}
	public Object smb_done(Object status,  premature) {
		(Object)premature;
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		do {
			.Curl_cfree((generatedReq.getProtop()));
			(generatedReq.getProtop()) = ((Object)0);
		} while (0);
		return status;
	}
	public Object smb_disconnect( dead) {
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		(Object)dead;
		Byte generatedShare = smbc.getShare();
		do {
			.Curl_cfree((generatedShare));
			(generatedShare) = ((Object)0);
		} while (0);
		Byte generatedDomain = smbc.getDomain();
		do {
			.Curl_cfree((generatedDomain));
			(generatedDomain) = ((Object)0);
		} while (0);
		Byte generatedRecv_buf = smbc.getRecv_buf();
		do {
			.Curl_cfree((generatedRecv_buf));
			(generatedRecv_buf) = ((Object)0);
		} while (0);
		return CURLE_OK;
	}
	public int smb_getsock(Object socks) {
		Object generatedSock = this.getSock();
		socks[0] = generatedSock[0];
		return (1 << (false)) | (1 << (16 + (false)));
	}
	public Object smb_do( done) {
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		done = 0;
		Byte generatedShare = smbc.getShare();
		if (generatedShare) {
			return CURLE_OK;
		} 
		return CURLE_URL_MALFORMAT;
	}
	public Object smb_parse_url_path() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		smb_request req = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedSmbc = generatedProto.getSmbc();
		smb_conn smbc = generatedSmbc;
		byte path;
		byte slash;
		Object generatedState = data.getState();
		 result = data.Curl_urldecode(generatedState.getUp().getPath(), 0, path, ((Object)/* URL decode the path */0), 1);
		if (result) {
			return result;
		} 
		smbc.setShare(.Curl_cstrdup((path == (byte)'/' || path == (byte)'\\') ? path + 1 : /* Parse the path for the share */path));
		.Curl_cfree(path);
		Byte generatedShare = smbc.getShare();
		if (!generatedShare) {
			return CURLE_OUT_OF_MEMORY;
		} 
		slash = .strchr(generatedShare, (byte)'/');
		if (!slash) {
			slash = .strchr(generatedShare, (byte)'\\');
		} 
		if (!/* The share must be present */slash) {
			do {
				.Curl_cfree((generatedShare));
				(generatedShare) = ((Object)0);
			} while (0);
			return CURLE_URL_MALFORMAT;
		} 
		slash++ = /* Parse the path for the file path converting any forward slashes into
		     backslashes */0;
		req.setPath(slash);
		for (; slash; slash++) {
			if (slash == (byte)'/') {
				slash = (byte)'\\';
			} 
		}
		return CURLE_OK/* !USE_WINDOWS_SSPI || USE_WIN32_CRYPTO *//* CURL_DISABLE_SMB && USE_NTLM && CURL_SIZEOF_CURL_OFF_T > 4 */;
	}
	/*
	 * SMB handler interface
	 */
	public  imap_endofresp(Byte line, Object len, int resp) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		IMAP imap = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		Object generatedResptag = imapc.getResptag();
		byte id = generatedResptag;
		size_t id_len = .strlen(id);
		if (len >= id_len + 1 && !.memcmp(id, line, id_len) && line[id_len] == /* Do we have a tagged command response? */(byte)' ') {
			line += id_len + 1;
			len -= id_len + 1;
			if (len >= 2 && !.memcmp(line, "OK", 2)) {
				resp = 1;
			}  else if (len >= 7 && !.memcmp(line, "PREAUTH", 7)) {
				resp = 3;
			} else {
					resp = 2;
			} 
			return 1;
		} 
		Byte generatedCustom = imap.getCustom();
		 generatedState = imapc.getState();
		if (len >= 2 && !.memcmp("* ", line, /* Do we have an untagged command response? */2)) {
			switch (generatedState) {
			case .IMAP_SELECT/* SELECT is special in that its untagged responses do not have a
			           common prefix so accept anything! */:
					break;
			case .IMAP_LIST:
					if ((!generatedCustom && !ModernizedCProgram.imap_matchresp(line, len, "LIST")) || (generatedCustom && !ModernizedCProgram.imap_matchresp(line, len, generatedCustom) && (!ModernizedCProgram.Curl_strcasecompare(generatedCustom, "STORE") || !ModernizedCProgram.imap_matchresp(line, len, "FETCH")) && !ModernizedCProgram.Curl_strcasecompare(generatedCustom, "SELECT") && !ModernizedCProgram.Curl_strcasecompare(generatedCustom, "EXAMINE") && !ModernizedCProgram.Curl_strcasecompare(generatedCustom, "SEARCH") && !ModernizedCProgram.Curl_strcasecompare(generatedCustom, "EXPUNGE") && !ModernizedCProgram.Curl_strcasecompare(generatedCustom, "LSUB") && !ModernizedCProgram.Curl_strcasecompare(generatedCustom, "UID") && !ModernizedCProgram.Curl_strcasecompare(generatedCustom, "NOOP"))) {
						return 0;
					} 
					break;
			case .IMAP_SEARCH:
					if (!ModernizedCProgram.imap_matchresp(line, len, "SEARCH")) {
						return 0;
					} 
					break;
			case .IMAP_FETCH:
					if (!ModernizedCProgram.imap_matchresp(line, len, "FETCH")) {
						return 0;
					} 
					break;
			case /* States which are interested in untagged responses */.IMAP_CAPABILITY:
					if (!ModernizedCProgram.imap_matchresp(line, len, "CAPABILITY")) {
						return 0;
					} 
					break;
			default:
					return 0;
			}
			resp = (byte)'*';
			return 1/* Do we have a continuation response? This should be a + symbol followed by
			     a space and optionally some text as per RFC-3501 for the AUTHENTICATE and
			     APPEND commands and as outlined in Section 4. Examples of RFC-4959 but
			     some e-mail servers ignore this and only send a single + instead. */;
		} 
		if (imap && !generatedCustom && ((len == 3 && line[0] == (byte)'+') || (len >= 2 && !.memcmp("+ ", line, 2)))) {
			switch (generatedState) {
			case /* States which are interested in continuation responses */.IMAP_AUTHENTICATE:
			case .IMAP_APPEND:
					resp = (byte)'+';
					break;
			default:
					generatedData.Curl_failf("Unexpected continuation response");
					resp = -1;
					break;
			}
			return 1;
		} 
		return /* Nothing for us */0/***********************************************************************
		 *
		 * imap_get_message()
		 *
		 * Gets the authentication message from the response buffer.
		 */;
	}
	public Object imap_perform_capability() {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		SASL generatedSasl = imapc.getSasl();
		generatedSasl.setAuthmechs(/* No known auth. mechanisms yet */0);
		generatedSasl.setAuthused(/* Clear the auth. mechanism used */0);
		imapc.setTls_supported(/* Clear the TLS capability */0);
		result = conn.imap_sendf(/* Send the CAPABILITY command */"CAPABILITY");
		if (!result) {
			ModernizedCProgram.state(conn, .IMAP_CAPABILITY);
		} 
		return result/***********************************************************************
		 *
		 * imap_perform_starttls()
		 *
		 * Sends the STARTTLS command to start the upgrade to TLS.
		 */;
	}
	public Object imap_perform_starttls() {
		 result = conn.imap_sendf(/* Send the STARTTLS command */"STARTTLS");
		if (!result) {
			ModernizedCProgram.state(conn, .IMAP_STARTTLS);
		} 
		return result/***********************************************************************
		 *
		 * imap_perform_upgrade_tls()
		 *
		 * Performs the upgrade to TLS.
		 */;
	}
	public Object imap_perform_upgrade_tls() {
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		 generatedSsldone = imapc.getSsldone();
		 result = .Curl_ssl_connect_nonblocking(conn, 0, generatedSsldone);
		 generatedState = imapc.getState();
		if (!result) {
			if (generatedState != .IMAP_UPGRADETLS) {
				ModernizedCProgram.state(conn, .IMAP_UPGRADETLS);
			} 
			if (generatedSsldone) {
				do {
				} while (0);
				result = conn.imap_perform_capability();
			} 
		} 
		return result/***********************************************************************
		 *
		 * imap_perform_login()
		 *
		 * Sends a clear text LOGIN command to authenticate with.
		 */;
	}
	public Object imap_perform_login() {
		 result = CURLE_OK;
		byte user;
		byte passwd;
		ConnectBits generatedBits = this.getBits();
		Object generatedUser_passwd = generatedBits.getUser_passwd();
		if (!generatedUser_passwd) {
			ModernizedCProgram.state(conn, .IMAP_STOP);
			return result;
		} 
		Byte generatedUser = this.getUser();
		user = ModernizedCProgram.imap_atom(generatedUser, /* Make sure the username and password are in the correct atom format */.bool_false);
		Byte generatedPasswd = this.getPasswd();
		passwd = ModernizedCProgram.imap_atom(generatedPasswd, .bool_false);
		result = conn.imap_sendf("LOGIN %s %s", user ? user : /* Send the LOGIN command */"", passwd ? passwd : "");
		.Curl_cfree(user);
		.Curl_cfree(passwd);
		if (!result) {
			ModernizedCProgram.state(conn, .IMAP_LOGIN);
		} 
		return result/***********************************************************************
		 *
		 * imap_perform_authenticate()
		 *
		 * Sends an AUTHENTICATE command allowing the client to login with the given
		 * SASL authentication mechanism.
		 */;
	}
	public Object imap_perform_authenticate(Object mech, Object initresp) {
		 result = CURLE_OK;
		if (initresp) {
			result = conn.imap_sendf("AUTHENTICATE %s %s", mech, /* Send the AUTHENTICATE command with the initial response */initresp);
		} else {
				result = conn.imap_sendf("AUTHENTICATE %s", /* Send the AUTHENTICATE command */mech);
		} 
		return result/***********************************************************************
		 *
		 * imap_continue_authenticate()
		 *
		 * Sends SASL continuation data or cancellation.
		 */;
	}
	public Object imap_continue_authenticate(Object resp) {
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		pingpong generatedPp = imapc.getPp();
		return generatedPp.Curl_pp_sendf("%s", resp/***********************************************************************
		 *
		 * imap_perform_authentication()
		 *
		 * Initiates the authentication sequence, with the appropriate SASL
		 * authentication mechanism, falling back to clear text should a common
		 * mechanism not be available between the client and server.
		 */);
	}
	public Object imap_perform_authentication() {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		saslprogress progress = new saslprogress();
		 generatedPreauth = imapc.getPreauth();
		SASL generatedSasl = imapc.getSasl();
		if (generatedPreauth || !ModernizedCProgram.Curl_sasl_can_authenticate(generatedSasl, conn)) {
			ModernizedCProgram.state(conn, .IMAP_STOP);
			return result;
		} 
		 generatedIr_supported = imapc.getIr_supported();
		result = ModernizedCProgram.Curl_sasl_start(generatedSasl, conn, generatedIr_supported, /* Calculate the SASL login details */progress);
		 generatedLogin_disabled = imapc.getLogin_disabled();
		int generatedPreftype = imapc.getPreftype();
		Curl_easy generatedData = this.getData();
		if (!result) {
			if (progress == .SASL_INPROGRESS) {
				ModernizedCProgram.state(conn, .IMAP_AUTHENTICATE);
			}  else if (!generatedLogin_disabled && (generatedPreftype & (1 << 0))) {
				result = /* Perform clear text authentication */conn.imap_perform_login();
			} else {
					generatedData.Curl_infof(/* Other mechanisms not supported */"No known authentication mechanisms supported!\n");
					result = CURLE_LOGIN_DENIED;
			} 
		} 
		return result/***********************************************************************
		 *
		 * imap_perform_list()
		 *
		 * Sends a LIST command or an alternative custom request.
		 */;
	}
	public Object imap_perform_list() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		IMAP imap = generatedReq.getProtop();
		Byte generatedCustom = imap.getCustom();
		Byte generatedCustom_params = imap.getCustom_params();
		Byte generatedMailbox = imap.getMailbox();
		if (generatedCustom) {
			result = conn.imap_sendf("%s%s", generatedCustom, generatedCustom_params ? generatedCustom_params : "");
		} else {
				byte mailbox = generatedMailbox ? ModernizedCProgram.imap_atom(generatedMailbox, /* Make sure the mailbox is in the correct atom format if necessary */.bool_true) : .Curl_cstrdup("");
				if (!mailbox) {
					return CURLE_OUT_OF_MEMORY;
				} 
				result = conn.imap_sendf("LIST \"%s\" *", /* Send the LIST command */mailbox);
				.Curl_cfree(mailbox);
		} 
		if (!result) {
			ModernizedCProgram.state(conn, .IMAP_LIST);
		} 
		return result/***********************************************************************
		 *
		 * imap_perform_select()
		 *
		 * Sends a SELECT command to ask the server to change the selected mailbox.
		 */;
	}
	public Object imap_perform_select() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		IMAP imap = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		byte mailbox;
		Byte generatedMailbox = imapc.getMailbox();
		do {
			.Curl_cfree((generatedMailbox));
			(generatedMailbox) = ((Object)0);
		} while (/* Invalidate old information as we are switching mailboxes */0);
		Byte generatedMailbox_uidvalidity = imapc.getMailbox_uidvalidity();
		do {
			.Curl_cfree((generatedMailbox_uidvalidity));
			(generatedMailbox_uidvalidity) = ((Object)0);
		} while (0);
		if (!generatedMailbox) {
			generatedData.Curl_failf("Cannot SELECT without a mailbox.");
			return CURLE_URL_MALFORMAT;
		} 
		mailbox = ModernizedCProgram.imap_atom(generatedMailbox, /* Make sure the mailbox is in the correct atom format */.bool_false);
		if (!mailbox) {
			return CURLE_OUT_OF_MEMORY;
		} 
		result = conn.imap_sendf("SELECT %s", /* Send the SELECT command */mailbox);
		.Curl_cfree(mailbox);
		if (!result) {
			ModernizedCProgram.state(conn, .IMAP_SELECT);
		} 
		return result/***********************************************************************
		 *
		 * imap_perform_fetch()
		 *
		 * Sends a FETCH command to initiate the download of a message.
		 */;
	}
	public Object imap_perform_fetch() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		IMAP imap = generatedReq.getProtop();
		Byte generatedUid = imap.getUid();
		Byte generatedPartial = imap.getPartial();
		Byte generatedSection = imap.getSection();
		Byte generatedMindex = imap.getMindex();
		if (generatedUid) {
			if (generatedPartial) {
				result = conn.imap_sendf("UID FETCH %s BODY[%s]<%s>", generatedUid, generatedSection ? generatedSection : "", generatedPartial);
			} else {
					result = conn.imap_sendf("UID FETCH %s BODY[%s]", generatedUid, generatedSection ? generatedSection : "");
			} 
		}  else if (generatedMindex) {
			if (generatedPartial) {
				result = conn.imap_sendf("FETCH %s BODY[%s]<%s>", generatedMindex, generatedSection ? generatedSection : "", generatedPartial);
			} else {
					result = conn.imap_sendf("FETCH %s BODY[%s]", generatedMindex, generatedSection ? generatedSection : "");
			} 
		} else {
				generatedData.Curl_failf("Cannot FETCH without a UID.");
				return CURLE_URL_MALFORMAT;
		} 
		if (!result) {
			ModernizedCProgram.state(conn, .IMAP_FETCH);
		} 
		return result/***********************************************************************
		 *
		 * imap_perform_append()
		 *
		 * Sends an APPEND command to initiate the upload of a message.
		 */;
	}
	public Object imap_perform_append() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		IMAP imap = generatedReq.getProtop();
		byte mailbox;
		Byte generatedMailbox = imap.getMailbox();
		if (!generatedMailbox) {
			data.Curl_failf("Cannot APPEND without a mailbox.");
			return CURLE_URL_MALFORMAT;
		} 
		Object generatedSet = data.getSet();
		Object generatedState = data.getState();
		if (generatedSet.getMimepost().getKind() != /* Prepare the mime data if some. */mimekind.MIMEKIND_NONE) {
			generatedSet.getMimepost().getFlags() &=  ~(1 << /* Use the whole structure as data. */1);
			generatedSet.getHeaders().curl_mime_headers(generatedSet.getMimepost(), /* Add external headers and mime version. */0);
			result = ModernizedCProgram.Curl_mime_prepare_headers(generatedSet.getMimepost(), ((Object)0), ((Object)0), mimestrategy.MIMESTRATEGY_MAIL);
			if (!result) {
				if (!ModernizedCProgram.Curl_checkheaders(conn, "Mime-Version")) {
					result = generatedSet.getMimepost().getCurlheaders().Curl_mime_add_header("Mime-Version: 1.0");
				} 
			} 
			if (!/* Make sure we will read the entire mime structure. */result) {
				result = ModernizedCProgram.Curl_mime_rewind(generatedSet.getMimepost());
			} 
			if (result) {
				return result;
			} 
			generatedState.setInfilesize(ModernizedCProgram.Curl_mime_size(generatedSet.getMimepost()));
			generatedState.setFread_func(()/* Read from mime structure. */ModernizedCProgram.Curl_mime_read);
			generatedState.setIn((Object)generatedSet.getMimepost());
		} 
		if (generatedState.getInfilesize() < /* Check we know the size of the upload */0) {
			data.Curl_failf("Cannot APPEND with unknown input file size\n");
			return CURLE_UPLOAD_FAILED;
		} 
		mailbox = ModernizedCProgram.imap_atom(generatedMailbox, /* Make sure the mailbox is in the correct atom format */.bool_false);
		if (!mailbox) {
			return CURLE_OUT_OF_MEMORY;
		} 
		.Curl_cfree(mailbox);
		if (!result) {
			ModernizedCProgram.state(conn, .IMAP_APPEND);
		} 
		return result/***********************************************************************
		 *
		 * imap_perform_search()
		 *
		 * Sends a SEARCH command.
		 */;
	}
	public Object imap_perform_search() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		IMAP imap = generatedReq.getProtop();
		Byte generatedQuery = imap.getQuery();
		if (!generatedQuery) {
			generatedData.Curl_failf("Cannot SEARCH without a query string.");
			return CURLE_URL_MALFORMAT;
		} 
		result = conn.imap_sendf("SEARCH %s", generatedQuery);
		if (!result) {
			ModernizedCProgram.state(conn, .IMAP_SEARCH);
		} 
		return result/***********************************************************************
		 *
		 * imap_perform_logout()
		 *
		 * Performs the logout action prior to sclose() being called.
		 */;
	}
	public Object imap_perform_logout() {
		 result = conn.imap_sendf(/* Send the LOGOUT command */"LOGOUT");
		if (!result) {
			ModernizedCProgram.state(conn, .IMAP_LOGOUT);
		} 
		return result;
	}
	/* For the initial server greeting */
	public Object imap_state_servergreet_resp(int imapcode,  instate) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		(Object)/* no use for this yet */instate;
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		if (imapcode == 3) {
			imap_conn imapc = generatedImapc;
			imapc.setPreauth(1);
			data.Curl_infof("PREAUTH connection, already authenticated!\n");
		}  else if (imapcode != 1) {
			data.Curl_failf("Got unexpected imap-server response");
			return CURLE_WEIRD_SERVER_REPLY;
		} 
		return conn.imap_perform_capability();
	}
	/* For CAPABILITY responses */
	public Object imap_state_capability_resp(int imapcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		Object generatedState = data.getState();
		byte line = generatedState.getBuffer();
		(Object)/* no use for this yet */instate;
		SASL generatedSasl = imapc.getSasl();
		int generatedAuthmechs = generatedSasl.getAuthmechs();
		Object generatedSet = data.getSet();
		Object generatedSsl = this.getSsl();
		 generatedTls_supported = imapc.getTls_supported();
		if (imapcode == /* Do we have a untagged response? */(byte)'*') {
			line += 2;
			for (; ; ) {
				size_t wordlen = new size_t();
				while (line && (line == (byte)' ' || line == (byte)'\t' || line == (byte)'\r' || line == (byte)'\n')) {
					line++;
				}
				if (!line) {
					break;
				} 
				for (wordlen = 0; line[wordlen] && line[wordlen] != /* Extract the word */(byte)' ' && line[wordlen] != (byte)'\t' && line[wordlen] != (byte)'\r' && line[wordlen] != (byte)'\n'; ) {
					wordlen++;
				}
				if (wordlen == 8 && !.memcmp(line, "STARTTLS", /* Does the server support the STARTTLS capability? */8)) {
					imapc.setTls_supported(1);
				}  else if (wordlen == 13 && !.memcmp(line, "LOGINDISABLED", /* Has the server explicitly disabled clear text authentication? */13)) {
					imapc.setLogin_disabled(1);
				}  else if (wordlen == 7 && !.memcmp(line, "SASL-IR", /* Does the server support the SASL-IR capability? */7)) {
					imapc.setIr_supported(1);
				}  else if (wordlen > 5 && !.memcmp(line, "AUTH=", /* Do we have a SASL based authentication mechanism? */5)) {
					size_t llen = new size_t();
					int mechbit;
					line += 5;
					wordlen -= 5;
					mechbit = ModernizedCProgram.Curl_sasl_decode_mech(line, wordlen, /* Test the word for a matching authentication mechanism */llen);
					if (mechbit && llen == wordlen) {
						generatedAuthmechs |=  mechbit;
					} 
				} 
				line += wordlen;
			}
		}  else if (imapcode == 1) {
			if (generatedSet.getUse_ssl() && !generatedSsl[0].getUse()) {
				if (generatedTls_supported) {
					result = /* Switch to TLS connection now */conn.imap_perform_starttls();
				}  else if (generatedSet.getUse_ssl() == CURLUSESSL_TRY) {
					result = /* Fallback and carry on with authentication */conn.imap_perform_authentication();
				} else {
						data.Curl_failf("STARTTLS not supported.");
						result = CURLE_USE_SSL_FAILED;
				} 
			} else {
					result = conn.imap_perform_authentication();
			} 
		} else {
				result = conn.imap_perform_authentication();
		} 
		return result;
	}
	/* For STARTTLS responses */
	public Object imap_state_starttls_resp(int imapcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		(Object)/* no use for this yet */instate;
		Object generatedSet = data.getSet();
		if (imapcode != 1) {
			if (generatedSet.getUse_ssl() != CURLUSESSL_TRY) {
				data.Curl_failf("STARTTLS denied");
				result = CURLE_USE_SSL_FAILED;
			} else {
					result = conn.imap_perform_authentication();
			} 
		} else {
				result = conn.imap_perform_upgrade_tls();
		} 
		return result;
	}
	/* For SASL authentication responses */
	public Object imap_state_auth_resp(int imapcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		saslprogress progress = new saslprogress();
		(Object)/* no use for this yet */instate;
		SASL generatedSasl = imapc.getSasl();
		result = ModernizedCProgram.Curl_sasl_continue(generatedSasl, conn, imapcode, progress);
		 generatedLogin_disabled = imapc.getLogin_disabled();
		int generatedPreftype = imapc.getPreftype();
		if (!result) {
			switch (progress) {
			case /* No mechanism left after cancellation */.SASL_IDLE:
					if ((!generatedLogin_disabled) && (generatedPreftype & (1 << 0))) {
						result = /* Perform clear text authentication */conn.imap_perform_login();
					} else {
							data.Curl_failf("Authentication cancelled");
							result = CURLE_LOGIN_DENIED;
					} 
					break;
			case .SASL_DONE:
					ModernizedCProgram.state(conn, /* Authenticated */.IMAP_STOP);
					break;
			default:
					break;
			}
		} 
		return result;
	}
	/* For LOGIN responses */
	public Object imap_state_login_resp(int imapcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		(Object)/* no use for this yet */instate;
		if (imapcode != 1) {
			data.Curl_failf("Access denied. %c", imapcode);
			result = CURLE_LOGIN_DENIED;
		} else {
				ModernizedCProgram.state(conn, /* End of connect phase */.IMAP_STOP);
		} 
		return result;
	}
	/* For LIST and SEARCH responses */
	public Object imap_state_listsearch_resp(int imapcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Object generatedState = generatedData.getState();
		byte line = generatedState.getBuffer();
		size_t len = .strlen(line);
		(Object)/* No use for this yet */instate;
		if (imapcode == (byte)'*') {
			line[len] = /* Temporarily add the LF character back and send as body to the client */(byte)'\n';
			result = conn.Curl_client_write((1 << 0), line, len + 1);
			line[len] = (byte)'\0';
		}  else if (imapcode != 1) {
			result = CURLE_QUOTE_ERROR;
		} else {
				ModernizedCProgram.state(conn, /* End of DO phase */.IMAP_STOP);
		} 
		return result;
	}
	/* For SELECT responses */
	public Object imap_state_select_resp(int imapcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = generatedData.getReq();
		IMAP imap = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		Object generatedState = data.getState();
		byte line = generatedState.getBuffer();
		(Object)/* no use for this yet */instate;
		Byte generatedMailbox_uidvalidity = imapc.getMailbox_uidvalidity();
		Byte generatedUidvalidity = imap.getUidvalidity();
		Byte generatedMailbox = imap.getMailbox();
		Byte generatedCustom = imap.getCustom();
		Byte generatedQuery = imap.getQuery();
		if (imapcode == (byte)'*') {
			byte[] tmp = new byte[/* See if this is an UIDVALIDITY response */20];
			if (.sscanf(line + 2, "OK [UIDVALIDITY %19[0123456789]]", tmp) == 1) {
				do {
					.Curl_cfree((generatedMailbox_uidvalidity));
					(generatedMailbox_uidvalidity) = ((Object)0);
				} while (0);
				imapc.setMailbox_uidvalidity(.Curl_cstrdup(tmp));
			} 
		}  else if (imapcode == 1) {
			if (generatedUidvalidity && generatedMailbox_uidvalidity && !ModernizedCProgram.Curl_strcasecompare(generatedUidvalidity, generatedMailbox_uidvalidity)) {
				generatedData.Curl_failf("Mailbox UIDVALIDITY has changed");
				result = CURLE_REMOTE_FILE_NOT_FOUND;
			} else {
					imapc.setMailbox(.Curl_cstrdup(generatedMailbox));
					if (generatedCustom) {
						result = conn.imap_perform_list();
					}  else if (generatedQuery) {
						result = conn.imap_perform_search();
					} else {
							result = conn.imap_perform_fetch();
					} 
			} 
		} else {
				data.Curl_failf("Select failed");
				result = CURLE_LOGIN_DENIED;
		} 
		return result;
	}
	/* For the (first line of the) FETCH responses */
	public Object imap_state_fetch_resp(int imapcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		pingpong generatedPp = imapc.getPp();
		pingpong pp = generatedPp;
		Object generatedState = data.getState();
		byte ptr = generatedState.getBuffer();
		bool parsed = 0;
		 size = 0;
		(Object)/* no use for this yet */instate;
		if (imapcode != (byte)'*') {
			data.Curl_pgrsSetDownloadSize(-1);
			ModernizedCProgram.state(conn, .IMAP_STOP);
			return CURLE_REMOTE_FILE_NOT_FOUND;
		} 
		while (ptr && (ptr != /* Something like this is received "* 1 FETCH (BODY[TEXT] {2021}\r" so parse
		     the continuation data contained within the curly brackets */(byte)'{')) {
			ptr++;
		}
		if (ptr == (byte)'{') {
			byte endptr;
			if (!ModernizedCProgram.curlx_strtoofft(ptr + 1, endptr, 10, size)) {
				if (endptr - ptr > 1 && endptr[0] == (byte)'}' && endptr[1] == (byte)'\r' && endptr[2] == (byte)'\0') {
					parsed = 1;
				} 
			} 
		} 
		ModernizedCProgram.state(conn, /* End of DO phase */.IMAP_STOP);
		return result;
	}
	/* For final FETCH responses performed after the download */
	public Object imap_state_fetch_final_resp(int imapcode,  instate) {
		 result = CURLE_OK;
		(Object)/* No use for this yet */instate;
		if (imapcode != 1) {
			result = CURLE_WEIRD_SERVER_REPLY;
		} else {
				ModernizedCProgram.state(conn, /* End of DONE phase */.IMAP_STOP);
		} 
		return result;
	}
	/* For APPEND responses */
	public Object imap_state_append_resp(int imapcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		(Object)/* No use for this yet */instate;
		Object generatedState = data.getState();
		if (imapcode != (byte)'+') {
			result = CURLE_UPLOAD_FAILED;
		} else {
				data.Curl_pgrsSetUploadSize(generatedState.getInfilesize());
				data.Curl_setup_transfer(-1, -1, 0, /* IMAP upload */0);
				ModernizedCProgram.state(conn, /* End of DO phase */.IMAP_STOP);
		} 
		return result;
	}
	/* For final APPEND responses performed after the upload */
	public Object imap_state_append_final_resp(int imapcode,  instate) {
		 result = CURLE_OK;
		(Object)/* No use for this yet */instate;
		if (imapcode != 1) {
			result = CURLE_UPLOAD_FAILED;
		} else {
				ModernizedCProgram.state(conn, /* End of DONE phase */.IMAP_STOP);
		} 
		return result;
	}
	public Object imap_statemach_act() {
		 result = CURLE_OK;
		Object generatedSock = this.getSock();
		 sock = generatedSock[0];
		int imapcode;
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		pingpong generatedPp = imapc.getPp();
		pingpong pp = generatedPp;
		size_t nread = 0;
		 generatedState = imapc.getState();
		if (generatedState == /* Busy upgrading the connection; right now all I/O is SSL/TLS, not IMAP */.IMAP_UPGRADETLS) {
			return conn.imap_perform_upgrade_tls();
		} 
		Object generatedSendleft = pp.getSendleft();
		if (generatedSendleft) {
			return pp.Curl_pp_flushsend();
		} 
		do {
			result = pp.Curl_pp_readresp(sock, imapcode, /* Read the response from the server */nread);
			if (result) {
				return result;
			} 
			if (imapcode == -/* Was there an error parsing the response line? */1) {
				return CURLE_WEIRD_SERVER_REPLY;
			} 
			if (!imapcode) {
				break;
			} 
			switch (generatedState) {
			case .IMAP_FETCH:
					result = conn.imap_state_fetch_resp(imapcode, generatedState);
					break;
			case .IMAP_APPEND:
					result = conn.imap_state_append_resp(imapcode, generatedState);
					break;
			case .IMAP_APPEND_FINAL:
					result = conn.imap_state_append_final_resp(imapcode, generatedState);
					break;
			case .IMAP_CAPABILITY:
					result = conn.imap_state_capability_resp(imapcode, generatedState);
					break;
			case .IMAP_SEARCH:
					result = conn.imap_state_listsearch_resp(imapcode, generatedState);
					break;
			case .IMAP_LOGOUT/* fallthrough, just stop! */:
			case .IMAP_LIST:
			case .IMAP_SERVERGREET:
					result = conn.imap_state_servergreet_resp(imapcode, generatedState);
					break;
			case .IMAP_LOGIN:
					result = conn.imap_state_login_resp(imapcode, generatedState);
					break;
			case .IMAP_SELECT:
					result = conn.imap_state_select_resp(imapcode, generatedState);
					break;
			case .IMAP_AUTHENTICATE:
					result = conn.imap_state_auth_resp(imapcode, generatedState);
					break;
			case .IMAP_FETCH_FINAL:
					result = conn.imap_state_fetch_final_resp(imapcode, generatedState);
					break;
			case .IMAP_STARTTLS:
					result = conn.imap_state_starttls_resp(imapcode, generatedState);
					break;
			default:
					ModernizedCProgram.state(conn, /* internal error */.IMAP_STOP);
					break;
			}
		} while (!result && generatedState != .IMAP_STOP && pp.Curl_pp_moredata());
		return result;
	}
	/* Called repeatedly until done from multi.c */
	public Object imap_multi_statemach( done) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		Object generatedHandler = this.getHandler();
		 generatedSsldone = imapc.getSsldone();
		if ((generatedHandler.getFlags() & (1 << 0)) && !generatedSsldone) {
			result = .Curl_ssl_connect_nonblocking(conn, 0, generatedSsldone);
			if (result || !generatedSsldone) {
				return result;
			} 
		} 
		pingpong generatedPp = imapc.getPp();
		result = generatedPp.Curl_pp_statemach(0, 0);
		 generatedState = imapc.getState();
		done = (generatedState == .IMAP_STOP) ? 1 : 0;
		return result;
	}
	public Object imap_block_statemach( disconnecting) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		 generatedState = imapc.getState();
		pingpong generatedPp = imapc.getPp();
		while (generatedState != .IMAP_STOP && !result) {
			result = generatedPp.Curl_pp_statemach(1, disconnecting);
		}
		return result;
	}
	/* Allocate and initialize the struct IMAP for the current Curl_easy if
	   required */
	public Object imap_init() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		IMAP imap = new IMAP();
		Object generatedReq = data.getReq();
		imap = generatedReq.setProtop(.Curl_ccalloc(, 1));
		if (!imap) {
			result = CURLE_OUT_OF_MEMORY;
		} 
		return result;
	}
	/* For the IMAP "protocol connect" and "doing" phases only */
	public int imap_getsock(Object socks) {
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		return generatedImapc.getPp().Curl_pp_getsock(socks/***********************************************************************
		 *
		 * imap_connect()
		 *
		 * This function should do everything that is to be considered a part of the
		 * connection phase.
		 *
		 * The variable 'done' points to will be TRUE if the protocol-layer connect
		 * phase is done when this function returns, or FALSE if not.
		 */);
	}
	public Object imap_connect( done) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		pingpong generatedPp = imapc.getPp();
		pingpong pp = generatedPp;
		done = /* default to not done yet */0;
		conn.Curl_conncontrol(/* We always support persistent connections in IMAP */0);
		pp.setResponse_time((120 * /* Set the default response time-out */1000));
		pp.setStatemach_act(imap_statemach_act);
		pp.setEndofresp(imap_endofresp);
		pp.setConn(conn);
		imapc.setPreftype(~/* Set the default preferred authentication type and mechanism */-1024);
		SASL generatedSasl = imapc.getSasl();
		generatedSasl.Curl_sasl_init(ModernizedCProgram.saslimap);
		/* Initialise the pingpong layer */pp.Curl_pp_init();
		result = /* Parse the URL options */conn.imap_parse_url_options();
		if (result) {
			return result;
		} 
		ModernizedCProgram.state(conn, /* Start off waiting for the server greeting response */.IMAP_SERVERGREET);
		Object generatedResptag = imapc.getResptag();
		.strcpy(generatedResptag, /* Start off with an response id of '*' */"*");
		result = conn.imap_multi_statemach(done);
		return result/***********************************************************************
		 *
		 * imap_done()
		 *
		 * The DONE function. This does what needs to be done after a single DO has
		 * performed.
		 *
		 * Input argument is already checked for validity.
		 */;
	}
	public Object imap_done(Object status,  premature) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		IMAP imap = generatedReq.getProtop();
		(Object)premature;
		if (!imap) {
			return CURLE_OK;
		} 
		Object generatedSet = data.getSet();
		Byte generatedCustom = imap.getCustom();
		Byte generatedUid = imap.getUid();
		Byte generatedMindex = imap.getMindex();
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		if (status) {
			conn.Curl_conncontrol(/* marked for closure */1);
			result = /* use the already set error code */status;
		}  else if (!generatedSet.getConnect_only() && !generatedCustom && (generatedUid || generatedMindex || generatedSet.getUpload() || generatedSet.getMimepost().getKind() != mimekind.MIMEKIND_NONE/* Handle responses after FETCH or APPEND transfer has finished */)) {
			if (!generatedSet.getUpload() && generatedSet.getMimepost().getKind() == mimekind.MIMEKIND_NONE) {
				ModernizedCProgram.state(conn, .IMAP_FETCH_FINAL);
			} else {
					result = generatedImapc.getPp().Curl_pp_sendf("%s", /* End the APPEND command first by sending an empty line */"");
					if (!result) {
						ModernizedCProgram.state(conn, .IMAP_APPEND_FINAL);
					} 
			} 
			if (!/* Run the state-machine */result) {
				result = conn.imap_block_statemach(0);
			} 
		} 
		Byte generatedMailbox = imap.getMailbox();
		do {
			.Curl_cfree((generatedMailbox));
			(generatedMailbox) = ((Object)0);
		} while (/* Cleanup our per-request based variables */0);
		Byte generatedUidvalidity = imap.getUidvalidity();
		do {
			.Curl_cfree((generatedUidvalidity));
			(generatedUidvalidity) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedUid));
			(generatedUid) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedMindex));
			(generatedMindex) = ((Object)0);
		} while (0);
		Byte generatedSection = imap.getSection();
		do {
			.Curl_cfree((generatedSection));
			(generatedSection) = ((Object)0);
		} while (0);
		Byte generatedPartial = imap.getPartial();
		do {
			.Curl_cfree((generatedPartial));
			(generatedPartial) = ((Object)0);
		} while (0);
		Byte generatedQuery = imap.getQuery();
		do {
			.Curl_cfree((generatedQuery));
			(generatedQuery) = ((Object)0);
		} while (0);
		do {
			.Curl_cfree((generatedCustom));
			(generatedCustom) = ((Object)0);
		} while (0);
		Byte generatedCustom_params = imap.getCustom_params();
		do {
			.Curl_cfree((generatedCustom_params));
			(generatedCustom_params) = ((Object)0);
		} while (0);
		imap.setTransfer(/* Clear the transfer mode for the next request */.FTPTRANSFER_BODY);
		return result/***********************************************************************
		 *
		 * imap_perform()
		 *
		 * This is the actual DO function for IMAP. Fetch or append a message, or do
		 * other things according to the options previously setup.
		 */;
	}
	public Object imap_perform( connected,  dophase_done) {
		 result = /* This is IMAP and no proxy */CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		IMAP imap = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		bool selected = 0;
		do {
		} while (0);
		Object generatedSet = generatedData.getSet();
		if (generatedSet.getOpt_no_body()) {
			imap.setTransfer(/* Requested no body means no transfer */.FTPTRANSFER_INFO);
		} 
		dophase_done = /* not done yet */0;
		Byte generatedMailbox = imap.getMailbox();
		Byte generatedUidvalidity = imap.getUidvalidity();
		Byte generatedMailbox_uidvalidity = imapc.getMailbox_uidvalidity();
		if (generatedMailbox && generatedMailbox && ModernizedCProgram.Curl_strcasecompare(generatedMailbox, generatedMailbox) && (!generatedUidvalidity || !generatedMailbox_uidvalidity || ModernizedCProgram.Curl_strcasecompare(generatedUidvalidity, generatedMailbox_uidvalidity))) {
			selected = 1;
		} 
		Byte generatedCustom = imap.getCustom();
		Byte generatedUid = imap.getUid();
		Byte generatedMindex = imap.getMindex();
		Byte generatedQuery = imap.getQuery();
		if (generatedSet.getUpload() || generatedSet.getMimepost().getKind() != /* Start the first command in the DO phase */mimekind.MIMEKIND_NONE) {
			result = /* APPEND can be executed directly */conn.imap_perform_append();
		}  else if (generatedCustom && (selected || !generatedMailbox)) {
			result = /* Custom command using the same mailbox or no mailbox */conn.imap_perform_list();
		}  else if (!generatedCustom && selected && (generatedUid || generatedMindex)) {
			result = /* FETCH from the same mailbox */conn.imap_perform_fetch();
		}  else if (!generatedCustom && selected && generatedQuery) {
			result = /* SEARCH the current mailbox */conn.imap_perform_search();
		}  else if (generatedMailbox && !selected && (generatedCustom || generatedUid || generatedMindex || generatedQuery)) {
			result = /* SELECT the mailbox */conn.imap_perform_select();
		} else {
				result = /* LIST */conn.imap_perform_list();
		} 
		if (result) {
			return result;
		} 
		result = conn.imap_multi_statemach(/* Run the state-machine */dophase_done);
		ConnectBits generatedBits = this.getBits();
		Object generatedTcpconnect = generatedBits.getTcpconnect();
		connected = generatedTcpconnect[0];
		if (dophase_done) {
			do {
			} while (0);
		} 
		return result/***********************************************************************
		 *
		 * imap_do()
		 *
		 * This function is registered as 'curl_do' function. It decodes the path
		 * parts etc as a wrapper to the actual DO function (imap_perform).
		 *
		 * The input argument is already checked for validity.
		 */;
	}
	public Object imap_do( done) {
		 result = CURLE_OK;
		done = /* default to false */0;
		result = /* Parse the URL path */conn.imap_parse_url_path();
		if (result) {
			return result;
		} 
		result = /* Parse the custom request */conn.imap_parse_custom_request();
		if (result) {
			return result;
		} 
		result = conn.imap_regular_transfer(done);
		return result/***********************************************************************
		 *
		 * imap_disconnect()
		 *
		 * Disconnect from an IMAP server. Cleanup protocol-specific per-connection
		 * resources. BLOCKING.
		 */;
	}
	public Object imap_disconnect( dead_connection) {
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		pingpong generatedPp = imapc.getPp();
		connectdata generatedConn = generatedPp.getConn();
		ConnectBits generatedBits = generatedConn.getBits();
		Object generatedProtoconnstart = generatedBits.getProtoconnstart();
		if (!dead_connection && generatedConn && generatedProtoconnstart) {
			if (!conn.imap_perform_logout()) {
				(Object)conn.imap_block_statemach(/* ignore errors on LOGOUT */1);
			} 
		} 
		generatedPp.Curl_pp_disconnect();
		SASL generatedSasl = imapc.getSasl();
		int generatedAuthused = generatedSasl.getAuthused();
		conn.Curl_sasl_cleanup(generatedAuthused);
		Byte generatedMailbox = imapc.getMailbox();
		do {
			.Curl_cfree((generatedMailbox));
			(generatedMailbox) = ((Object)0);
		} while (/* Cleanup our connection based variables */0);
		Byte generatedMailbox_uidvalidity = imapc.getMailbox_uidvalidity();
		do {
			.Curl_cfree((generatedMailbox_uidvalidity));
			(generatedMailbox_uidvalidity) = ((Object)0);
		} while (0);
		return CURLE_OK;
	}
	/* Call this when the DO phase has completed */
	public Object imap_dophase_done( connected) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		IMAP imap = generatedReq.getProtop();
		(Object)connected;
		 generatedTransfer = imap.getTransfer();
		if (generatedTransfer != .FTPTRANSFER_BODY) {
			generatedData.Curl_setup_transfer(-1, -1, 0, -/* no data to transfer */1);
		} 
		return CURLE_OK;
	}
	/* Called from multi.c while DOing */
	public Object imap_doing( dophase_done) {
		 result = conn.imap_multi_statemach(dophase_done);
		if (result) {
			do {
			} while (0);
		}  else if (dophase_done) {
			result = conn.imap_dophase_done(/* not connected */0);
			do {
			} while (0);
		} 
		return result/***********************************************************************
		 *
		 * imap_regular_transfer()
		 *
		 * The input argument is already checked for validity.
		 *
		 * Performs all commands done before a regular transfer between a local and a
		 * remote host.
		 */;
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
	 * RFC2195 CRAM-MD5 authentication
	 * RFC2595 Using TLS with IMAP, POP3 and ACAP
	 * RFC2831 DIGEST-MD5 authentication
	 * RFC3501 IMAPv4 protocol
	 * RFC4422 Simple Authentication and Security Layer (SASL)
	 * RFC4616 PLAIN authentication
	 * RFC4752 The Kerberos V5 ("GSSAPI") SASL Mechanism
	 * RFC4959 IMAP Extension for SASL Initial Client Response
	 * RFC5092 IMAP URL Scheme
	 * RFC6749 OAuth 2.0 Authorization Framework
	 * RFC8314 Use of TLS for Email Submission and Access
	 * Draft   LOGIN SASL Mechanism <draft-murchison-sasl-login-00.txt>
	 *
	 ***************************************************************************/
	/* for HTTP proxy tunnel stuff */
	/* The last 3 #include files should be in this order */
	/* Local API functions */
	public Object imap_regular_transfer( dophase_done) {
		 result = CURLE_OK;
		bool connected = 0;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		generatedReq.setSize(-/* Make sure size is unknown at this point */1);
		data.Curl_pgrsSetUploadCounter(/* Set the progress data */0);
		data.Curl_pgrsSetDownloadCounter(0);
		data.Curl_pgrsSetUploadSize(-1);
		data.Curl_pgrsSetDownloadSize(-1);
		result = conn.imap_perform(connected, /* Carry out the perform */dophase_done);
		if (!result && /* Perform post DO phase operations if necessary */dophase_done) {
			result = conn.imap_dophase_done(connected);
		} 
		return result;
	}
	public Object imap_setup_connection() {
		 result = /* Initialise the IMAP layer */conn.imap_init();
		if (result) {
			return result;
		} 
		this.setTls_upgraded(/* Clear the TLS upgraded flag */0);
		return CURLE_OK/***********************************************************************
		 *
		 * imap_sendf()
		 *
		 * Sends the formatted string as an IMAP command to the server.
		 *
		 * Designed to never block.
		 */;
	}
	public Object imap_sendf(Object fmt) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		byte taggedfmt;
		va_list ap = new va_list();
		do {
		} while (0);
		int generatedCmdid = imapc.getCmdid();
		imapc.setCmdid((generatedCmdid + 1) % /* Calculate the next command ID wrapping at 3 digits */1000);
		Object generatedResptag = imapc.getResptag();
		long generatedConnection_id = this.getConnection_id();
		ModernizedCProgram.curl_msnprintf(generatedResptag, , /* Calculate the tag based on the connection ID and command ID */"%c%03d", (byte)'A' + ModernizedCProgram.curlx_sltosi(generatedConnection_id % 26), generatedCmdid);
		taggedfmt = ModernizedCProgram.curl_maprintf("%s %s", generatedResptag, /* Prefix the format with the tag */fmt);
		if (!taggedfmt) {
			return CURLE_OUT_OF_MEMORY;
		} 
		.__builtin_va_start(ap, /* Send the data with the tag */fmt);
		pingpong generatedPp = imapc.getPp();
		result = generatedPp.Curl_pp_vsendf(taggedfmt, ap);
		.__builtin_va_end(ap);
		.Curl_cfree(taggedfmt);
		return result/***********************************************************************
		 *
		 * imap_atom()
		 *
		 * Checks the input string for characters that need escaping and returns an
		 * atom ready for sending to the server.
		 *
		 * The returned string needs to be freed.
		 *
		 */;
	}
	public Object imap_parse_url_options() {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedImapc = generatedProto.getImapc();
		imap_conn imapc = generatedImapc;
		Byte generatedOptions = this.getOptions();
		byte ptr = generatedOptions;
		SASL generatedSasl = imapc.getSasl();
		generatedSasl.setResetprefs(1);
		while (!result && ptr && ptr) {
			byte key = ptr;
			byte value;
			while (ptr && ptr != (byte)'=') {
				ptr++;
			}
			value = ptr + 1;
			while (ptr && ptr != (byte)';') {
				ptr++;
			}
			if (ModernizedCProgram.Curl_strncasecompare(key, "AUTH=", 5)) {
				result = generatedSasl.Curl_sasl_parse_url_auth_option(value, ptr - value);
			} else {
					result = CURLE_URL_MALFORMAT;
			} 
			if (ptr == (byte)';') {
				ptr++;
			} 
		}
		int generatedPrefmech = generatedSasl.getPrefmech();
		switch (generatedPrefmech) {
		case 0:
				imapc.setPreftype(0);
				break;
		case (~-1024 & ~(1 << 5)):
				imapc.setPreftype(~-1024);
				break;
		default:
				imapc.setPreftype((1 << 1));
				break;
		}
		return result/***********************************************************************
		 *
		 * imap_parse_url_path()
		 *
		 * Parse the URL path into separate path components.
		 *
		 */;
	}
	public Object imap_parse_url_path() {
		 result = /* The imap struct is already initialised in imap_connect() */CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		IMAP imap = generatedReq.getProtop();
		Object generatedState = data.getState();
		byte begin = generatedState.getUp().getPath()[/* skip leading slash */1];
		byte ptr = begin;
		while (ModernizedCProgram.imap_is_bchar(/* See how much of the URL is a valid path and decode it */ptr)) {
			ptr++;
		}
		Byte generatedMailbox = imap.getMailbox();
		if (ptr != begin) {
			byte end = /* Remove the trailing slash if present */ptr;
			if (end > begin && end[-1] == (byte)'/') {
				end--;
			} 
			result = data.Curl_urldecode(begin, end - begin, generatedMailbox, ((Object)0), 1);
			if (result) {
				return result;
			} 
		} else {
				imap.setMailbox(((Object)0));
		} 
		Byte generatedUidvalidity = imap.getUidvalidity();
		Byte generatedUid = imap.getUid();
		Byte generatedMindex = imap.getMindex();
		Byte generatedSection = imap.getSection();
		Byte generatedPartial = imap.getPartial();
		while (ptr == /* There can be any number of parameters in the form ";NAME=VALUE" */(byte)';') {
			byte name;
			byte value;
			size_t valuelen = new size_t();
			begin = ++/* Find the length of the name parameter */ptr;
			while (ptr && ptr != (byte)'=') {
				ptr++;
			}
			if (!ptr) {
				return CURLE_URL_MALFORMAT;
			} 
			result = data.Curl_urldecode(begin, ptr - begin, ModernizedCProgram.name, ((Object)0), /* Decode the name parameter */1);
			if (result) {
				return result;
			} 
			begin = ++/* Find the length of the value parameter */ptr;
			while (ModernizedCProgram.imap_is_bchar(ptr)) {
				ptr++;
			}
			result = data.Curl_urldecode(begin, ptr - begin, value, valuelen, /* Decode the value parameter */1);
			if (result) {
				.Curl_cfree(ModernizedCProgram.name);
				return result;
			} 
			do {
			} while (0/* Process the known hierarchical parameters (UIDVALIDITY, UID, SECTION and
			       PARTIAL) stripping of the trailing slash character if it is present.
			
			       Note: Unknown parameters trigger a URL_MALFORMAT error. */);
			if (ModernizedCProgram.Curl_strcasecompare(ModernizedCProgram.name, "UIDVALIDITY") && !generatedUidvalidity) {
				if (valuelen > 0 && value[valuelen - 1] == (byte)'/') {
					value[valuelen - 1] = (byte)'\0';
				} 
				imap.setUidvalidity(value);
				value = ((Object)0);
			}  else if (ModernizedCProgram.Curl_strcasecompare(ModernizedCProgram.name, "UID") && !generatedUid) {
				if (valuelen > 0 && value[valuelen - 1] == (byte)'/') {
					value[valuelen - 1] = (byte)'\0';
				} 
				imap.setUid(value);
				value = ((Object)0);
			}  else if (ModernizedCProgram.Curl_strcasecompare(ModernizedCProgram.name, "MAILINDEX") && !generatedMindex) {
				if (valuelen > 0 && value[valuelen - 1] == (byte)'/') {
					value[valuelen - 1] = (byte)'\0';
				} 
				imap.setMindex(value);
				value = ((Object)0);
			}  else if (ModernizedCProgram.Curl_strcasecompare(ModernizedCProgram.name, "SECTION") && !generatedSection) {
				if (valuelen > 0 && value[valuelen - 1] == (byte)'/') {
					value[valuelen - 1] = (byte)'\0';
				} 
				imap.setSection(value);
				value = ((Object)0);
			}  else if (ModernizedCProgram.Curl_strcasecompare(ModernizedCProgram.name, "PARTIAL") && !generatedPartial) {
				if (valuelen > 0 && value[valuelen - 1] == (byte)'/') {
					value[valuelen - 1] = (byte)'\0';
				} 
				imap.setPartial(value);
				value = ((Object)0);
			} else {
					.Curl_cfree(ModernizedCProgram.name);
					.Curl_cfree(value);
					return CURLE_URL_MALFORMAT;
			} 
			.Curl_cfree(ModernizedCProgram.name);
			.Curl_cfree(value);
		}
		Byte generatedQuery = imap.getQuery();
		if (generatedMailbox && !generatedUid && !generatedMindex) {
			(Object).curl_url_get(generatedState.getUh(), CURLUPART_QUERY, generatedQuery, CURLU_URLDECODE);
		} 
		if (/* Any extra stuff at the end of the URL is an error */ptr) {
			return CURLE_URL_MALFORMAT;
		} 
		return CURLE_OK/***********************************************************************
		 *
		 * imap_parse_custom_request()
		 *
		 * Parse the custom request.
		 */;
	}
	public Object imap_parse_custom_request() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		IMAP imap = generatedReq.getProtop();
		Object generatedSet = data.getSet();
		byte custom = generatedSet.getStr()[dupstring.STRING_CUSTOMREQUEST];
		Byte generatedCustom = imap.getCustom();
		Byte generatedCustom_params = imap.getCustom_params();
		if (custom) {
			result = data.Curl_urldecode(custom, 0, generatedCustom, ((Object)0), /* URL decode the custom request */1);
			if (!/* Extract the parameters if specified */result) {
				byte params = generatedCustom;
				while (ModernizedCProgram.params && ModernizedCProgram.params != (byte)' ') {
					ModernizedCProgram.params++;
				}
				if (ModernizedCProgram.params) {
					imap.setCustom_params(.Curl_cstrdup(ModernizedCProgram.params));
					generatedCustom[ModernizedCProgram.params - generatedCustom] = (byte)'\0';
					if (!generatedCustom_params) {
						result = CURLE_OUT_OF_MEMORY;
					} 
				} 
			} 
		} 
		return result/* CURL_DISABLE_IMAP */;
	}
	/* creates a key to find a bundle for this connection */
	public void hashkey(Byte buf, Object len, Object hostp) {
		byte hostname;
		int generatedRemote_port = this.getRemote_port();
		long port = generatedRemote_port;
		ConnectBits generatedBits = this.getBits();
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		Object generatedTunnel_proxy = generatedBits.getTunnel_proxy();
		proxy_info generatedHttp_proxy = this.getHttp_proxy();
		hostname generatedHost = generatedHttp_proxy.getHost();
		Byte generatedName = generatedHost.getName();
		long generatedPort = this.getPort();
		Object generatedConn_to_host = generatedBits.getConn_to_host();
		if (generatedHttpproxy && !generatedTunnel_proxy) {
			hostname = generatedName;
			port = generatedPort;
		}  else if (generatedConn_to_host) {
			hostname = generatedName;
		} else {
				hostname = generatedName;
		} 
		if (hostp) {
			hostp = /* report back which name we used */hostname;
		} 
		ModernizedCProgram.curl_msnprintf(buf, len, "%ld%s", port, /* put the number first so that the hostname gets cut off if too long */hostname);
	}
	/* something like 128 is fine */
	public Object Curl_conncache_bundle_size() {
		size_t num = new size_t();
		Curl_easy generatedData = this.getData();
		Object generatedShare = (generatedData).getShare();
		if (generatedShare) {
			(generatedData).Curl_share_lock(CURL_LOCK_DATA_CONNECT, CURL_LOCK_ACCESS_SINGLE);
		} 
		connectbundle generatedBundle = this.getBundle();
		Object generatedNum_connections = generatedBundle.getNum_connections();
		num = generatedNum_connections;
		if (generatedShare) {
			(generatedData).Curl_share_unlock(CURL_LOCK_DATA_CONNECT);
		} 
		return num/* Look up the bundle with all the connections to the same host this
		   connectdata struct is setup to use.
		
		   **NOTE**: When it returns, it holds the connection cache lock! */;
	}
	public connectdata conncache_find_first_connection(conncache connc) {
		curl_hash_iterator iter = new curl_hash_iterator();
		curl_hash_element he = new curl_hash_element();
		connectbundle bundle = new connectbundle();
		curl_hash generatedHash = connc.getHash();
		ModernizedCProgram.Curl_hash_start_iterate(generatedHash, iter);
		curl_hash_element curl_hash_element = new curl_hash_element();
		he = curl_hash_element.Curl_hash_next_element(iter);
		Object generatedPtr = he.getPtr();
		curl_llist generatedConn_list = bundle.getConn_list();
		curl_llist_element generatedHead = generatedConn_list.getHead();
		while (he) {
			curl_llist_element curr = new curl_llist_element();
			bundle = generatedPtr;
			curr = generatedHead;
			if (curr) {
				return generatedPtr;
			} 
			he = curl_hash_element.Curl_hash_next_element(iter);
		}
		return ((Object)0/*
		 * Give ownership of a connection back to the connection cache. Might
		 * disconnect the oldest existing in there to make space.
		 *
		 * Return TRUE if stored, FALSE if closed.
		 */);
	}
	public  Curl_conncache_return_conn() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedMulti = data.getMulti();
		/* data->multi->maxconnects can be negative, deal with it. */size_t maxconnects = (generatedMulti.getMaxconnects() < 0) ? generatedMulti.getNum_easy() * 4 : generatedMulti.getMaxconnects();
		connectdata conn_candidate = ((Object)0);
		this.setData(((Object)/* no owner anymore */0));
		curltime curltime = new curltime();
		this.setLastused(curltime.Curl_now());
		connectdata connectdata = new connectdata();
		if (maxconnects > 0 && data.Curl_conncache_size() > maxconnects) {
			data.Curl_infof("Connection cache is full, closing the oldest one.\n");
			conn_candidate = connectdata.Curl_conncache_extract_oldest(data);
			if (conn_candidate) {
				(Object)ModernizedCProgram.Curl_disconnect(data, conn_candidate, /* the winner gets the honour of being disconnected *//* dead_connection */0);
			} 
		} 
		return (conn_candidate == conn) ? 0 : 1/*
		 * This function finds the connection in the connection bundle that has been
		 * unused for the longest time.
		 *
		 * Does not lock the connection cache!
		 *
		 * Returns the pointer to the oldest idle connection, or NULL if none was
		 * found.
		 */;
	}
	public connectdata Curl_conncache_extract_bundle(Curl_easy data, connectbundle bundle) {
		curl_llist_element curr = new curl_llist_element();
		timediff_t highscore = -1;
		timediff_t score = new timediff_t();
		curltime now = new curltime();
		connectdata conn_candidate = ((Object)0);
		connectdata conn = new connectdata();
		(Object)data;
		curltime curltime = new curltime();
		now = curltime.Curl_now();
		curl_llist generatedConn_list = bundle.getConn_list();
		curl_llist_element generatedHead = generatedConn_list.getHead();
		curr = generatedHead;
		Object generatedPtr = curr.getPtr();
		curl_llist generatedEasyq = (conn).getEasyq();
		Object generatedSize = generatedEasyq.getSize();
		Curl_easy generatedData = conn.getData();
		curltime generatedLastused = conn.getLastused();
		curl_llist_element generatedNext = curr.getNext();
		while (curr) {
			conn = generatedPtr;
			if (!(generatedSize) && !generatedData) {
				score = now.Curl_timediff(generatedLastused);
				if (score > highscore) {
					highscore = score;
					conn_candidate = conn;
				} 
			} 
			curr = generatedNext;
		}
		Object generatedState = data.getState();
		if (conn_candidate) {
			ModernizedCProgram.bundle_remove_conn(bundle, /* remove it to prevent another thread from nicking it */conn_candidate);
			generatedState.getConn_cache().getNum_conn()--;
			do {
			} while (0);
			conn_candidate.setData(/* associate! */data);
		} 
		return conn_candidate/*
		 * This function finds the connection in the connection cache that has been
		 * unused for the longest time and extracts that from the bundle.
		 *
		 * Returns the pointer to the connection, or NULL if none was found.
		 */;
	}
	public connectdata Curl_conncache_extract_oldest(Curl_easy data) {
		Object generatedState = data.getState();
		conncache connc = generatedState.getConn_cache();
		curl_hash_iterator iter = new curl_hash_iterator();
		curl_llist_element curr = new curl_llist_element();
		curl_hash_element he = new curl_hash_element();
		timediff_t highscore = -1;
		timediff_t score = new timediff_t();
		curltime now = new curltime();
		connectdata conn_candidate = ((Object)0);
		connectbundle bundle = new connectbundle();
		connectbundle bundle_candidate = ((Object)0);
		curltime curltime = new curltime();
		now = curltime.Curl_now();
		Object generatedShare = (data).getShare();
		if (generatedShare) {
			(data).Curl_share_lock(CURL_LOCK_DATA_CONNECT, CURL_LOCK_ACCESS_SINGLE);
		} 
		curl_hash generatedHash = connc.getHash();
		ModernizedCProgram.Curl_hash_start_iterate(generatedHash, iter);
		curl_hash_element curl_hash_element = new curl_hash_element();
		he = curl_hash_element.Curl_hash_next_element(iter);
		Object generatedPtr = he.getPtr();
		curl_llist generatedConn_list = bundle.getConn_list();
		curl_llist_element generatedHead = generatedConn_list.getHead();
		curl_llist generatedEasyq = (conn).getEasyq();
		Object generatedSize = generatedEasyq.getSize();
		Curl_easy generatedData = conn.getData();
		curltime generatedLastused = conn.getLastused();
		curl_llist_element generatedNext = curr.getNext();
		while (he) {
			connectdata conn = new connectdata();
			bundle = generatedPtr;
			curr = generatedHead;
			while (curr) {
				conn = generatedPtr;
				if (!(generatedSize) && !generatedData) {
					score = now.Curl_timediff(generatedLastused);
					if (score > highscore) {
						highscore = score;
						conn_candidate = conn;
						bundle_candidate = bundle;
					} 
				} 
				curr = generatedNext;
			}
			he = curl_hash_element.Curl_hash_next_element(iter);
		}
		Object generatedNum_conn = connc.getNum_conn();
		if (conn_candidate) {
			ModernizedCProgram.bundle_remove_conn(bundle_candidate, /* remove it to prevent another thread from nicking it */conn_candidate);
			generatedNum_conn--;
			do {
			} while (0);
			conn_candidate.setData(/* associate! */data);
		} 
		if (generatedShare) {
			(data).Curl_share_unlock(CURL_LOCK_DATA_CONNECT);
		} 
		return conn_candidate;
	}
	public Object bindlocal(Object sockfd, int af, int scope) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Curl_sockaddr_storage sa = new Curl_sockaddr_storage();
		sockaddr sock = (sockaddr)/* bind to this address */sa;
		 sizeof_sa = /* size of the data sock points to */0;
		sockaddr_in si4 = (sockaddr_in)sa;
		Curl_dns_entry h = ((Object)0);
		Object generatedSet = data.getSet();
		int port = generatedSet.getLocalport();
		int portnum = generatedSet.getLocalportrange();
		byte dev = generatedSet.getStr()[dupstring.STRING_DEVICE];
		int error;
		/*************************************************************
		   * Select device to bind socket to
		   *************************************************************/
		if (!dev && !port) {
			return /* no local kind of binding was requested */CURLE_OK;
		} 
		.memset(sa, 0, );
		int generatedScope_id = this.getScope_id();
		long generatedIp_version = this.getIp_version();
		Curl_addrinfo generatedAddr = h.getAddr();
		int generatedAi_family = generatedAddr.getAi_family();
		Object generatedSin_addr = si4.getSin_addr();
		Object generatedState = data.getState();
		if (dev && (.strlen(dev) < 255)) {
			byte[] myhost = "";
			int done = /* -1 for error, 1 for address found */0;
			bool is_interface = 0;
			bool is_host = 0;
			byte if_prefix = "if!";
			byte host_prefix = "host!";
			if (.strncmp(if_prefix, dev, .strlen(if_prefix)) == 0) {
				dev += .strlen(if_prefix);
				is_interface = 1;
			}  else if (.strncmp(host_prefix, dev, .strlen(host_prefix)) == 0) {
				dev += .strlen(host_prefix);
				is_host = 1;
			} 
			if (!/* interface */is_host/* I am not sure any other OSs than Linux that provide this feature,
			       * and at the least I cannot test. --Ben
			       *
			       * This feature allows one to tightly bind the local socket to a
			       * particular interface.  This will force even requests to other
			       * local interfaces to go out the external interface.
			       *
			       *
			       * Only bind to the interface when specified as interface, not just
			       * as a hostname or ip address.
			       *
			       * interface might be a VRF, eg: vrf-blue, which means it cannot be
			       * converted to an IP address and would fail Curl_if2ip. Simply try
			       * to use it straight away.
			       */) {
				switch (ModernizedCProgram.Curl_if2ip(af, scope, generatedScope_id, /* This is typically "errno 1, error: Operation not permitted" if
				         * you're not running as root or another suitable privileged
				         * user.
				         * If it succeeds it means the parameter was a valid interface and
				         * not an IP address. Return immediately.
				         */dev, myhost, )) {
				case .IF2IP_FOUND:
						is_interface = 1/*
						           * We now have the numerical IP address in the 'myhost' buffer
						           */;
						data.Curl_infof("Local Interface %s is ip %s using address family %i\n", dev, myhost, af);
						done = 1;
						break;
				case .IF2IP_NOT_FOUND:
						if (is_interface) {
							data.Curl_failf("Couldn't bind to interface '%s'", /* Do not fall back to treating it as a host name */dev);
							return CURLE_INTERFACE_FAILED;
						} 
						break;
				case .IF2IP_AF_NOT_SUPPORTED:
						return /* Signal the caller to try another address family if available */CURLE_UNSUPPORTED_PROTOCOL;
				}
			} 
			if (!is_interface/*
			       * This was not an interface, resolve the name as a host name
			       * or IP number
			       *
			       * Temporarily force name resolution to use only the address type
			       * of the connection. The resolve functions should really be changed
			       * to take a type parameter instead.
			       */) {
				long ipver = generatedIp_version;
				int rc;
				if (af == 2) {
					this.setIp_version(CURL_IPRESOLVE_V4);
				} 
				rc = ModernizedCProgram.Curl_resolv(conn, dev, 0, 0, h);
				if (rc == 1) {
					(Object)ModernizedCProgram.Curl_resolver_wait_resolv(conn, h);
				} 
				this.setIp_version(ipver);
				if (h) {
					ModernizedCProgram.Curl_printable_address(generatedAddr, myhost, );
					data.Curl_infof("Name '%s' family %i resolved to '%s' family %i\n", dev, af, myhost, generatedAi_family);
					ModernizedCProgram.Curl_resolv_unlock(data, h);
					if (af != generatedAi_family) {
						return CURLE_UNSUPPORTED_PROTOCOL;
					} 
					done = 1/*
					         * provided dev was no interface (or interfaces are not supported
					         * e.g. solaris) no ip address and no domain we fail here
					         */;
				} else {
						done = -1;
				} 
			} 
			if (done > 0/* IPv6 address */) {
				if ((af == /* The "myhost" string either comes from Curl_if2ip or from
				               Curl_printable_address. The latter returns only numeric scope
				               IDs and the former returns none at all.  So the scope ID, if
				               present, is known to be numeric *//* IPv4 address */2) && (ModernizedCProgram.Curl_inet_pton(2, myhost, generatedSin_addr) > 0)) {
					si4.setSin_family(2);
					si4.setSin_port(.htons(port));
					sizeof_sa = ;
				} 
			} 
			if (done < 1/* errorbuf is set false so failf will overwrite any message already in
			         the error buffer, so the user receives this error message instead of a
			         generic resolve error. */) {
				generatedState.setErrorbuf(0);
				data.Curl_failf("Couldn't bind to '%s'", dev);
				return CURLE_INTERFACE_FAILED/* no device was given, prepare sa to match af's needs */;
			} 
		} else {
				if (af == 2) {
					si4.setSin_family(2);
					si4.setSin_port(.htons(port));
					sizeof_sa = ;
				} 
		} 
		ConnectBits generatedBits = this.getBits();
		Object generatedSa_family = sock.getSa_family();
		for (; ; ) {
			if (.bind(sockfd, sock, sizeof_sa) >= 0/* we succeeded to bind */) {
				Curl_sockaddr_storage add = new Curl_sockaddr_storage();
				 size = ;
				.memset(add, 0, );
				if (.getsockname(sockfd, (sockaddr)add, size) < 0) {
					byte[] buffer = new byte[128];
					generatedState.setOs_errno(error = ((int).WSAGetLastError()));
					data.Curl_failf("getsockname() failed with errno %d: %s", error, ModernizedCProgram.Curl_strerror(error, ModernizedCProgram.buffer, ));
					return CURLE_INTERFACE_FAILED;
				} 
				data.Curl_infof("Local port: %hu\n", port);
				generatedBits.setBound(1);
				return CURLE_OK;
			} 
			if (--portnum > 0) {
				data.Curl_infof("Bind to local port %hu failed, trying next\n", port);
				/* try next port */port++;
				if (generatedSa_family == /* We re-use/clobber the port variable here below */2) {
					si4.setSin_port(.ntohs(port));
				} 
			} else {
					break;
			} 
		}
		{ 
			byte[] buffer = new byte[128];
			generatedState.setOs_errno(error = ((int).WSAGetLastError()));
			data.Curl_failf("bind failed with errno %d: %s", error, ModernizedCProgram.Curl_strerror(error, ModernizedCProgram.buffer, ));
		}
		return CURLE_INTERFACE_FAILED/*
		 * verifyconnect() returns TRUE if the connect really has happened.
		 */;
	}
	/* Used within the multi interface. Try next IP address, return TRUE if no
	   more address exists or error */
	public Object trynextip(int sockindex, int tempindex) {
		int other = tempindex ^ 1;
		 result = CURLE_COULDNT_CONNECT/* First clean up after the failed socket.
		     Don't close it yet to ensure that the next IP's socket gets a different
		     file descriptor, which can prevent bugs when the curl_multi_socket_action
		     interface is used with certain select() replacements such as kqueue. */;
		Object generatedTempsock = this.getTempsock();
		 fd_to_close = generatedTempsock[tempindex];
		generatedTempsock[tempindex] = CURL_SOCKET_BAD;
		Object generatedTempaddr = this.getTempaddr();
		int generatedAi_family = ai.getAi_family();
		Curl_addrinfo generatedAi_next = ai.getAi_next();
		if (sockindex == 0) {
			Curl_addrinfo ai = ((Object)0);
			int family = 0;
			if (generatedTempaddr[tempindex]) {
				family = generatedTempaddr[tempindex].getAi_family();
				ai = generatedTempaddr[tempindex].getAi_next();
			} 
			while (ai) {
				if (generatedTempaddr[other]) {
					while (ai && generatedAi_family != /* we can safely skip addresses of the other protocol family */family) {
						ai = generatedAi_next;
					}
				} 
				if (ai) {
					result = conn.singleipconnect(ai, tempindex);
					if (result == CURLE_COULDNT_CONNECT) {
						ai = generatedAi_next;
						continue;
					} 
					generatedTempaddr[tempindex] = ai;
				} 
				break;
			}
		} 
		if (fd_to_close != CURL_SOCKET_BAD) {
			conn.Curl_closesocket(fd_to_close);
		} 
		return result;
	}
	/* Copies connection info into the session handle to make it available
	   when the session handle is no longer associated with a connection. */
	public void Curl_persistconninfo() {
		Curl_easy generatedData = this.getData();
		Object generatedInfo = generatedData.getInfo();
		Object generatedPrimary_ip = this.getPrimary_ip();
		.memcpy(generatedInfo.getConn_primary_ip(), generatedPrimary_ip, );
		Object generatedLocal_ip = this.getLocal_ip();
		.memcpy(generatedInfo.getConn_local_ip(), generatedLocal_ip, );
		Object generatedHandler = this.getHandler();
		generatedInfo.setConn_scheme(generatedHandler.getScheme());
		generatedInfo.setConn_protocol(generatedHandler.getProtocol());
		long generatedPrimary_port = this.getPrimary_port();
		generatedInfo.setConn_primary_port(generatedPrimary_port);
		long generatedLocal_port = this.getLocal_port();
		generatedInfo.setConn_local_port(generatedLocal_port);
	}
	/* retrieves the start/end point information of a socket of an established
	   connection */
	public void Curl_updateconninfo(Object sockfd) {
		 generatedTransport = this.getTransport();
		if (generatedTransport != .TRNSPRT_TCP/* there's no TCP connection! */) {
			return ;
		} 
		ConnectBits generatedBits = this.getBits();
		Object generatedReuse = generatedBits.getReuse();
		Object generatedTcp_fastopen = generatedBits.getTcp_fastopen();
		Curl_easy generatedData = this.getData();
		Object generatedPrimary_ip = this.getPrimary_ip();
		long generatedPrimary_port = this.getPrimary_port();
		Object generatedIp_addr_str = this.getIp_addr_str();
		Object generatedLocal_ip = this.getLocal_ip();
		long generatedLocal_port = this.getLocal_port();
		if (!generatedReuse && !generatedTcp_fastopen) {
			Curl_easy data = generatedData;
			byte[] buffer = new byte[128];
			Curl_sockaddr_storage ssrem = new Curl_sockaddr_storage();
			Curl_sockaddr_storage ssloc = new Curl_sockaddr_storage();
			 plen = new ();
			 slen = new ();
			plen = ;
			if (.getpeername(sockfd, (sockaddr)ssrem, plen)) {
				int error = ((int).WSAGetLastError());
				ModernizedCProgram.data.Curl_failf("getpeername() failed with errno %d: %s", error, ModernizedCProgram.Curl_strerror(error, ModernizedCProgram.buffer, ));
				return ;
			} 
			slen = ;
			.memset(ssloc, 0, );
			if (.getsockname(sockfd, (sockaddr)ssloc, slen)) {
				int error = ((int).WSAGetLastError());
				ModernizedCProgram.data.Curl_failf("getsockname() failed with errno %d: %s", error, ModernizedCProgram.Curl_strerror(error, ModernizedCProgram.buffer, ));
				return ;
			} 
			if (!(sockaddr)ssrem.Curl_addr2string(plen, generatedPrimary_ip, generatedPrimary_port)) {
				ModernizedCProgram.data.Curl_failf("ssrem inet_ntop() failed with errno %d: %s", (._errno()), ModernizedCProgram.Curl_strerror((._errno()), ModernizedCProgram.buffer, ));
				return ;
			} 
			.memcpy(generatedIp_addr_str, generatedPrimary_ip, );
			if (!(sockaddr)ssloc.Curl_addr2string(slen, generatedLocal_ip, generatedLocal_port)) {
				ModernizedCProgram.data.Curl_failf("ssloc inet_ntop() failed with errno %d: %s", (._errno()), ModernizedCProgram.Curl_strerror((._errno()), ModernizedCProgram.buffer, ));
				return ;
			} 
		} 
		/* unused *//* persist connection info in session handle */conn/* after a TCP connection to the proxy has been verified, this function does
		   the next magic step.
		
		   Note: this function's sub-functions call failf()
		
		*/.Curl_persistconninfo();
	}
	public Object connected_proxy(int sockindex) {
		 result = CURLE_OK;
		ConnectBits generatedBits = this.getBits();
		Object generatedSocksproxy = generatedBits.getSocksproxy();
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		proxy_info generatedHttp_proxy = this.getHttp_proxy();
		hostname generatedHost = generatedHttp_proxy.getHost();
		Byte generatedName = generatedHost.getName();
		Object generatedConn_to_host = generatedBits.getConn_to_host();
		Byte generatedSecondaryhostname = this.getSecondaryhostname();
		long generatedPort = generatedHttp_proxy.getPort();
		int generatedSecondary_port = this.getSecondary_port();
		Object generatedConn_to_port = generatedBits.getConn_to_port();
		int generatedRemote_port = this.getRemote_port();
		proxy_info generatedSocks_proxy = this.getSocks_proxy();
		Byte generatedUser = generatedSocks_proxy.getUser();
		Byte generatedPasswd = generatedSocks_proxy.getPasswd();
		Curl_easy generatedData = this.getData();
		Object generatedProxytype = generatedSocks_proxy.getProxytype();
		if (generatedSocksproxy) {
			byte host = generatedHttpproxy ? generatedName : generatedConn_to_host ? generatedName : sockindex == 1 ? generatedSecondaryhostname : generatedName;
			int port = generatedHttpproxy ? (int)generatedPort : sockindex == 1 ? generatedSecondary_port : generatedConn_to_port ? generatedConn_to_port : generatedRemote_port;
			generatedBits.setSocksproxy_connecting(1);
			switch (generatedProxytype) {
			case CURLPROXY_SOCKS5_HOSTNAME:
					result = conn.Curl_SOCKS5(generatedUser, generatedPasswd, host, ModernizedCProgram.port, sockindex);
					break;
			case CURLPROXY_SOCKS4:
			case CURLPROXY_SOCKS4A:
					result = conn.Curl_SOCKS4(generatedUser, host, ModernizedCProgram.port, sockindex);
					break;
			case CURLPROXY_SOCKS5:
			default:
					generatedData.Curl_failf("unknown proxytype option given");
					result = CURLE_COULDNT_CONNECT;
			}
			generatedBits.setSocksproxy_connecting(/* switch proxytype */0);
		} 
		return /* CURL_DISABLE_PROXY */result/*
		 * Curl_is_connected() checks if the socket has connected.
		 */;
	}
	public Object Curl_is_connected(int sockindex,  connected) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 result = CURLE_OK;
		timediff_t allow = new timediff_t();
		int error = 0;
		curltime now = new curltime();
		int rc;
		int i;
		do {
		} while (0);
		connected = /* a very negative world view is best */0;
		ConnectBits generatedBits = this.getBits();
		Object generatedTcpconnect = generatedBits.getTcpconnect();
		if (generatedTcpconnect[sockindex]) {
			connected = /* we are connected already! */1;
			return CURLE_OK;
		} 
		curltime curltime = new curltime();
		now = curltime.Curl_now();
		allow = ModernizedCProgram.Curl_timeleft(data, now, /* figure out how long time we have left to connect */1);
		if (allow < 0) {
			data.Curl_failf(/* time-out, bail out, go home */"Connection time-out");
			return CURLE_OPERATION_TIMEDOUT;
		} 
		Object generatedTempsock = this.getTempsock();
		curltime generatedConnecttime = this.getConnecttime();
		Object generatedTimeoutms_per_addr = this.getTimeoutms_per_addr();
		Object generatedTempaddr = this.getTempaddr();
		Object generatedSocksproxy = generatedBits.getSocksproxy();
		proxy_info generatedSocks_proxy = this.getSocks_proxy();
		hostname generatedHost = generatedSocks_proxy.getHost();
		Byte generatedName = generatedHost.getName();
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		Object generatedConn_to_host = generatedBits.getConn_to_host();
		long generatedPort = this.getPort();
		Object generatedState = data.getState();
		if (result/* no more addresses to try */) {
			byte hostname;
			byte[] buffer = new byte[128];
			if (generatedTempaddr[1] == ((Object)/* if the first address family runs out of addresses to try before
			       the happy eyeball timeout, go ahead and try the next family now */0)) {
				result = conn.trynextip(sockindex, 1);
				if (!result) {
					return result;
				} 
			} 
			if (generatedSocksproxy) {
				hostname = generatedName;
			}  else if (generatedHttpproxy) {
				hostname = generatedName;
			}  else if (generatedConn_to_host) {
				hostname = generatedName;
			} else {
					hostname = generatedName;
			} 
			data.Curl_failf("Failed to connect to %s port %ld: %s", hostname, generatedPort, ModernizedCProgram.Curl_strerror(error, ModernizedCProgram.buffer, ));
			if (-1024 == generatedState.getOs_errno()) {
				result = CURLE_OPERATION_TIMEDOUT;
			} 
		} 
		return result;
	}
	public void tcpnodelay(Object sockfd) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 onoff = ()1;
		int level = 6;
		byte[] buffer = new byte[128];
		if (.setsockopt(sockfd, level, -1024, (Object)onoff, ) < 0) {
			data.Curl_infof("Could not set TCP_NODELAY: %s\n", ModernizedCProgram.Curl_strerror(((int).WSAGetLastError()), buffer, ));
		} else {
				data.Curl_infof("TCP_NODELAY set\n"/* The preferred method on Mac OS X (10.2 and later) to prevent SIGPIPEs when
				   sending data to a dead peer (instead of relying on the 4th argument to send
				   being MSG_NOSIGNAL). Possibly also existing and in use on other BSD
				   systems? */);
		} 
	}
	/* Mac OS X style */
	public Object singleipconnect(Object ai, int sockindex) {
		Curl_sockaddr_ex addr = new Curl_sockaddr_ex();
		int rc = -1;
		int error = 0;
		bool isconnected = 0;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 sockfd = new ();
		 result = new ();
		byte[] ipaddress = new byte[];
		long port;
		bool is_tcp = new bool();
		byte[] buffer = new byte[128];
		Object generatedTempsock = this.getTempsock();
		 sockp = generatedTempsock[sockindex];
		sockp = CURL_SOCKET_BAD;
		result = ModernizedCProgram.Curl_socket(conn, ai, addr, sockfd);
		if (result/* Failed to create the socket, but still return OK since we signal the
		       lack of socket as well. This allows the parent function to keep looping
		       over alternative addresses/socket families etc. */) {
			return CURLE_OK;
		} 
		 generated_sa_ex_u = addr.get_sa_ex_u();
		Object generatedAddr = generated_sa_ex_u.getAddr();
		int generatedAddrlen = addr.getAddrlen();
		if (!(sockaddr)generatedAddr.Curl_addr2string(generatedAddrlen, ipaddress, port)) {
			data.Curl_failf(/* malformed address or bug in inet_ntop, try next address */"sa_addr inet_ntop() failed with errno %d: %s", (._errno()), ModernizedCProgram.Curl_strerror((._errno()), buffer, ));
			conn.Curl_closesocket(sockfd);
			return CURLE_OK;
		} 
		data.Curl_infof("  Trying %s:%ld...\n", ipaddress, port);
		int generatedFamily = addr.getFamily();
		int generatedSocktype = addr.getSocktype();
		is_tcp = (generatedFamily == 2) && generatedSocktype == 1;
		Object generatedSet = data.getSet();
		if (is_tcp && generatedSet.getTcp_nodelay()) {
			conn.tcpnodelay(sockfd);
		} 
		do {
		} while (0);
		ModernizedCProgram.Curl_sndbufset(sockfd);
		if (is_tcp && generatedSet.getTcp_keepalive()) {
			data.tcpkeepalive(sockfd);
		} 
		if (generatedSet.getFsockopt()) {
			data.Curl_set_in_callback(/* activate callback for setting socket options */.bool_true);
			error = .UNRECOGNIZEDFUNCTIONNAME(generatedSet.getSockopt_client(), sockfd, CURLSOCKTYPE_IPCXN);
			data.Curl_set_in_callback(.bool_false);
			if (error == CURL_SOCKOPT_ALREADY_CONNECTED) {
				isconnected = 1;
			}  else if (error) {
				conn.Curl_closesocket(/* close the socket and bail out */sockfd);
				return CURLE_ABORTED_BY_CALLBACK;
			} 
		} 
		if (generatedFamily == /* possibly bind the local end to an IP, interface or port */2) {
			result = conn.bindlocal(sockfd, generatedFamily, ModernizedCProgram.Curl_ipv6_scope((sockaddr)generatedAddr));
			if (result) {
				conn.Curl_closesocket(/* close socket and bail out */sockfd);
				if (result == CURLE_UNSUPPORTED_PROTOCOL/* The address family is not supported on this interface.
				           We can continue trying addresses */) {
					return CURLE_COULDNT_CONNECT;
				} 
				return result;
			} 
		} 
		(Object)ModernizedCProgram.curlx_nonblock(sockfd, /* set socket non-blocking */1);
		curltime curltime = new curltime();
		this.setConnecttime(curltime.Curl_now());
		int generatedNum_addr = this.getNum_addr();
		Object generatedTimeoutms_per_addr = this.getTimeoutms_per_addr();
		if (generatedNum_addr > 1) {
			data.Curl_expire(generatedTimeoutms_per_addr, .EXPIRE_DNS_PER_NAME);
		} 
		 generatedTransport = this.getTransport();
		ConnectBits generatedBits = this.getBits();
		Object generatedTcp_fastopen = generatedBits.getTcp_fastopen();
		if (!isconnected && (generatedTransport != /* Connect TCP and QUIC sockets */.TRNSPRT_UDP)) {
			if (generatedTcp_fastopen) {
			} else {
					rc = .connect(sockfd, generatedAddr, generatedAddrlen);
			} 
			if (-1 == rc) {
				error = ((int).WSAGetLastError());
			} 
		} else {
				sockp = sockfd;
				return CURLE_OK;
		} 
		Object generatedState = data.getState();
		if (-1 == rc) {
			switch (error) {
			case 11:
					result = CURLE_OK;
					break;
			case -1024/* On some platforms EAGAIN and EWOULDBLOCK are the
			       * same value, and on others they are different, hence
			       * the odd #if
			       */:
			case -1024:
			default:
					data.Curl_infof(/* unknown error, fallthrough and try another address! */"Immediate connect fail for %s: %s\n", ipaddress, ModernizedCProgram.Curl_strerror(error, buffer, ));
					generatedState.setOs_errno(error);
					conn.Curl_closesocket(/* connect failed */sockfd);
					result = CURLE_COULDNT_CONNECT;
			}
		} 
		if (!result) {
			sockp = sockfd;
		} 
		return result/*
		 * TCP connect to the given host with timeout, proxy or remote doesn't matter.
		 * There might be more than one IP address to try out. Fill in the passed
		 * pointer with the connected socket.
		 */;
	}
	/* start connecting to this */
	/* 0 or 1 among the temp ones */
	/*
	 * Curl_timeleft() returns the amount of milliseconds left allowed for the
	 * transfer/connection. If the value is negative, the timeout time has already
	 * elapsed.
	 *
	 * The start time is stored in progress.t_startsingle - as set with
	 * Curl_pgrsTime(..., TIMER_STARTSINGLE);
	 *
	 * If 'nowp' is non-NULL, it points to the current time.
	 * 'duringconnect' is FALSE if not during a connect, as then of course the
	 * connect timeout is not taken into account!
	 *
	 * @unittest: 1303
	 */
	/* context */
	public Object Curl_connecthost(Object remotehost) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		curltime curltime = new curltime();
		curltime before = curltime.Curl_now();
		 result = CURLE_COULDNT_CONNECT;
		timediff_t timeout_ms = ModernizedCProgram.Curl_timeleft(data, before, 1);
		if (timeout_ms < 0) {
			data.Curl_failf(/* a precaution, no need to continue if time already is up */"Connection time-out");
			return CURLE_OPERATION_TIMEDOUT;
		} 
		this.setNum_addr(ModernizedCProgram.Curl_num_addresses(remotehost.getAddr()));
		Object generatedTempaddr = this.getTempaddr();
		generatedTempaddr[0] = remotehost.getAddr();
		generatedTempaddr[1] = ((Object)0);
		Object generatedTempsock = this.getTempsock();
		generatedTempsock[0] = CURL_SOCKET_BAD;
		generatedTempsock[1] = CURL_SOCKET_BAD;
		this.setTimeoutms_per_addr(generatedTempaddr[0].getAi_next() == ((Object)0) ? timeout_ms : timeout_ms / 2);
		while (generatedTempaddr[/* start connecting to first IP */0]) {
			result = conn.singleipconnect(generatedTempaddr[0], 0);
			if (!result) {
				break;
			} 
			generatedTempaddr[0] = generatedTempaddr[0].getAi_next();
		}
		if (generatedTempsock[0] == CURL_SOCKET_BAD) {
			if (!result) {
				result = CURLE_COULDNT_CONNECT;
			} 
			return result;
		} 
		Object generatedInfo = data.getInfo();
		generatedInfo.getNumconnects()++;
		Object generatedSet = data.getSet();
		generatedData.Curl_expire(generatedSet.getHappy_eyeballs_timeout(), .EXPIRE_HAPPY_EYEBALLS);
		return CURLE_OK;
	}
	public int conn_is_conn(Object param) {
		connfind f = (connfind)param;
		connectdata generatedTofind = f.getTofind();
		if (conn == generatedTofind) {
			f.setFound(1);
			return 1;
		} 
		return 0/*
		 * Used to extract socket and connectdata struct for the most recent
		 * transfer on the given Curl_easy.
		 *
		 * The returned socket will be CURL_SOCKET_BAD in case of failure!
		 */;
	}
	public  Curl_connalive() {
		Object generatedSsl = this.getSsl();
		Object generatedSock = this.getSock();
		if (generatedSsl[0].getUse()) {
			if (!.Curl_ssl_check_cxn(/* use the SSL context */conn)) {
				return /* FIN received */.bool_false;
			} 
		}  else if (generatedSock[0] == /* Minix 3.1 doesn't support any flags on recv; just assume socket is OK */CURL_SOCKET_BAD) {
			return .bool_false;
		} else {
				byte buf;
				if (.recv((SOCKET)generatedSock[0], (byte)ModernizedCProgram.buf, (int)1, (int)2) == 0) {
					return /* FIN received */.bool_false;
				} 
		} 
		return .bool_true/*
		 * Close a socket.
		 *
		 * 'conn' can be NULL, beware!
		 */;
	}
	public int Curl_closesocket(Object sock) {
		Object generatedFclosesocket = this.getFclosesocket();
		Object generatedSock = this.getSock();
		Object generatedSock_accepted = this.getSock_accepted();
		Curl_easy generatedData = this.getData();
		Object generatedClosesocket_client = this.getClosesocket_client();
		if (conn && generatedFclosesocket) {
			if ((sock == generatedSock[1]) && generatedSock_accepted[1/* if this socket matches the second socket, and that was created with
			         accept, then we MUST NOT call the callback but clear the accepted
			         status */]) {
				generatedSock_accepted[1] = 0;
			} else {
					int rc;
					generatedData.Curl_multi_closed(sock);
					generatedData.Curl_set_in_callback(.bool_true);
					rc = .UNRECOGNIZEDFUNCTIONNAME(generatedClosesocket_client, sock);
					generatedData.Curl_set_in_callback(.bool_false);
					return rc;
			} 
		} 
		if (conn) {
			generatedData.Curl_multi_closed(/* tell the multi-socket code about this */sock);
		} 
		.closesocket((sock));
		return 0/*
		 * Create a socket based on info from 'conn' and 'ai'.
		 *
		 * 'addr' should be a pointer to the correct struct to get data back, or NULL.
		 * 'sockfd' must be a pointer to a socket descriptor.
		 *
		 * If the open socket callback is set, used that!
		 *
		 */;
	}
	/*
	 * Curl_conncontrol() marks streams or connection for closure.
	 */
	public void Curl_conncontrol(int ctrl) {
		Object generatedHandler = this.getHandler();
		bool closeit = (ctrl == /* close if a connection, or a stream that isn't multiplexed */1) || ((ctrl == 2) && !(generatedHandler.getFlags() & (1 << 9)));
		ConnectBits generatedBits = this.getBits();
		Object generatedClose = generatedBits.getClose();
		if ((ctrl == 2) && (generatedHandler.getFlags() & (1 << 9))) {
			do {
			} while (0);
		}  else if ((bit)closeit != generatedClose) {
			do {
			} while (0);
			generatedBits.setClose(/* the only place in the source code that
			                                   should assign this bit */closeit);
		} 
	}
	/* see defines in header */
	/* Data received can be cached at various levels, so check them all here. */
	public  Curl_conn_data_pending(int sockindex) {
		int readable;
		if (.Curl_ssl_data_pending(conn, sockindex) || conn.Curl_recv_has_postponed_data(sockindex)) {
			return .bool_true;
		} 
		Object generatedSock = this.getSock();
		readable = ModernizedCProgram.Curl_socket_check(generatedSock[sockindex], CURL_SOCKET_BAD, CURL_SOCKET_BAD, (time_t)0);
		return (readable > 0 && (readable & CURL_CSELECT_IN));
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
	/* The last 3 #include files should be in this order */
	/*
	 * Perform SSL initialization for HTTPS proxy.  Sets
	 * proxy_ssl_connected connection bit when complete.  Can be
	 * called multiple times.
	 */
	public Object https_proxy_connect(int sockindex) {
		(Object)/* a failed connection is marked for closure to
		                                  prevent (bad) re-use or similar */conn;
		(Object)sockindex;
		return CURLE_NOT_BUILT_IN;
	}
	/* perform SSL initialization for this socket */
	public Object Curl_proxy_connect(int sockindex) {
		proxy_info generatedHttp_proxy = this.getHttp_proxy();
		Object generatedProxytype = generatedHttp_proxy.getProxytype();
		ConnectBits generatedBits = this.getBits();
		Object generatedProxy_ssl_connected = generatedBits.getProxy_ssl_connected();
		if (generatedProxytype == CURLPROXY_HTTPS) {
			 result = conn.https_proxy_connect(sockindex);
			if (ModernizedCProgram.result) {
				return ModernizedCProgram.result;
			} 
			if (!generatedProxy_ssl_connected[sockindex]) {
				return /* wait for HTTPS proxy SSL initialization to complete */ModernizedCProgram.result;
			} 
		} 
		Object generatedTunnel_proxy = generatedBits.getTunnel_proxy();
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		Object generatedConn_to_host = generatedBits.getConn_to_host();
		Byte generatedSecondaryhostname = this.getSecondaryhostname();
		hostname generatedHost = this.getHost();
		Byte generatedName = generatedHost.getName();
		int generatedSecondary_port = this.getSecondary_port();
		Object generatedConn_to_port = generatedBits.getConn_to_port();
		int generatedRemote_port = this.getRemote_port();
		dynamically_allocated_data generatedAllocptr = this.getAllocptr();
		Byte generatedProxyuserpwd = generatedAllocptr.getProxyuserpwd();
		if (generatedTunnel_proxy && generatedHttpproxy) {
			HTTP http_proxy = new HTTP();
			Object prot_save;
			byte hostname;
			int remote_port;
			 result = new ();
			prot_save = generatedReq.getProtop();
			.memset(http_proxy, 0, );
			generatedReq.setProtop(http_proxy);
			conn.Curl_conncontrol(0/* for the secondary socket (FTP), use the "connect to host"
			     * but ignore the "connect to port" (use the secondary port)
			     */);
			if (generatedConn_to_host) {
				hostname = generatedConn_to_host.getName();
			}  else if (sockindex == 1) {
				hostname = generatedSecondaryhostname;
			} else {
					hostname = generatedName;
			} 
			if (sockindex == 1) {
				remote_port = generatedSecondary_port;
			}  else if (generatedConn_to_port) {
				remote_port = generatedConn_to_port;
			} else {
					remote_port = generatedRemote_port;
			} 
			ModernizedCProgram.result = conn.Curl_proxyCONNECT(sockindex, hostname, remote_port);
			generatedReq.setProtop(prot_save);
			if (CURLE_OK != ModernizedCProgram.result) {
				return ModernizedCProgram.result;
			} 
			do {
				.Curl_cfree((generatedProxyuserpwd));
				(generatedProxyuserpwd) = ((Object)0);
			} while (0);
		} 
		return /* no HTTP tunnel proxy, just return */CURLE_OK;
	}
	public  Curl_connect_complete() {
		http_connect_state generatedConnect_state = this.getConnect_state();
		 generatedTunnel_state = generatedConnect_state.getTunnel_state();
		return !generatedConnect_state || (generatedTunnel_state == .TUNNEL_COMPLETE);
	}
	public  Curl_connect_ongoing() {
		http_connect_state generatedConnect_state = this.getConnect_state();
		 generatedTunnel_state = generatedConnect_state.getTunnel_state();
		return generatedConnect_state && (generatedTunnel_state != .TUNNEL_COMPLETE);
	}
	public Object connect_init( reinit) {
		http_connect_state s = new http_connect_state();
		Curl_easy generatedData = this.getData();
		http_connect_state generatedConnect_state = this.getConnect_state();
		if (!reinit) {
			do {
			} while (0);
			s = .Curl_ccalloc(1, );
			if (!s) {
				return CURLE_OUT_OF_MEMORY;
			} 
			generatedData.Curl_infof("allocate connect buffer!\n");
			this.setConnect_state(s);
		} else {
				do {
				} while (0);
				s = generatedConnect_state;
		} 
		s.setTunnel_state(.TUNNEL_INIT);
		s.setKeepon(1);
		Object generatedConnect_buffer = s.getConnect_buffer();
		s.setLine_start(generatedConnect_buffer);
		Byte generatedLine_start = s.getLine_start();
		s.setPtr(generatedLine_start);
		s.setCl(0);
		s.setClose_connection(0);
		return CURLE_OK;
	}
	public void connect_done() {
		http_connect_state generatedConnect_state = this.getConnect_state();
		http_connect_state s = generatedConnect_state;
		s.setTunnel_state(.TUNNEL_COMPLETE);
		Curl_easy generatedData = this.getData();
		generatedData.Curl_infof("CONNECT phase completed!\n");
	}
	public Object CONNECT(int sockindex, Object hostname, int remote_port) {
		int subversion = 0;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		SingleRequest k = generatedReq;
		 result = new ();
		Object generatedSock = this.getSock();
		 tunnelsocket = generatedSock[sockindex];
		http_connect_state generatedConnect_state = this.getConnect_state();
		http_connect_state s = generatedConnect_state;
		if (conn.Curl_connect_complete()) {
			return /* CONNECT is already completed */CURLE_OK;
		} 
		ConnectBits generatedBits = this.getBits();
		generatedBits.setProxy_connect_closed(0);
		 generatedTunnel_state = s.getTunnel_state();
		Curl_send_buffer curl_send_buffer = new Curl_send_buffer();
		proxy_info generatedHttp_proxy = this.getHttp_proxy();
		Object generatedProxytype = generatedHttp_proxy.getProxytype();
		Object generatedIpv6_ip = generatedBits.getIpv6_ip();
		hostname generatedHost = this.getHost();
		Byte generatedName = generatedHost.getName();
		Object generatedSet = data.getSet();
		dynamically_allocated_data generatedAllocptr = this.getAllocptr();
		Byte generatedUagent = generatedAllocptr.getUagent();
		Byte generatedProxyuserpwd = generatedAllocptr.getProxyuserpwd();
		Object generatedInfo = data.getInfo();
		int generatedKeepon = s.getKeepon();
		byte generatedPtr = s.getPtr();
		Object generatedConnect_buffer = s.getConnect_buffer();
		Object generatedState = data.getState();
		Object generatedCl = s.getCl();
		int generatedPerline = s.getPerline();
		Byte generatedLine_start = s.getLine_start();
		int generatedHttpcode = k.getHttpcode();
		Object generatedClose_connection = s.getClose_connection();
		Object generatedProxy_connect_closed = generatedBits.getProxy_connect_closed();
		if (generatedInfo.getHttpproxycode() / 100 != 2) {
			if (generatedClose_connection && generatedReq.getNewurl()) {
				generatedBits.setProxy_connect_closed(1);
				data.Curl_infof("Connect me again please\n");
				conn.connect_done();
			} else {
					.Curl_cfree(generatedReq.getNewurl());
					generatedReq.setNewurl(((Object)0));
					conn.Curl_conncontrol(/* failure, close this connection to avoid re-use */2);
					conn.Curl_closesocket(generatedSock[sockindex]);
					generatedSock[sockindex] = CURL_SOCKET_BAD;
			} 
			s.setTunnel_state(/* to back to init state */.TUNNEL_INIT);
			if (generatedProxy_connect_closed) {
				return /* this is not an error, just part of the connection negotiation */CURLE_OK;
			} 
			data.Curl_failf("Received HTTP code %d from proxy after CONNECT", generatedHttpcode);
			return CURLE_RECV_ERROR;
		} 
		s.setTunnel_state(.TUNNEL_COMPLETE/* If a proxy-authorization header was used for the proxy, then we should
		     make sure that it isn't accidentally used for the document request
		     after we've connected. So let's free and clear it here. */);
		do {
			.Curl_cfree((generatedProxyuserpwd));
			(generatedProxyuserpwd) = ((Object)0);
		} while (0);
		generatedAllocptr.setProxyuserpwd(((Object)0));
		generatedState.getAuthproxy().setDone(1);
		generatedState.getAuthproxy().setMultipass(0);
		data.Curl_infof("Proxy replied %d to CONNECT request\n", generatedInfo.getHttpproxycode());
		generatedReq.setIgnorebody(/* put it (back) to non-ignore state */0);
		generatedBits.setRewindaftersend(/* make sure this isn't set for the
		                                         document request  */0);
		return CURLE_OK;
	}
	public Object Curl_proxyCONNECT(int sockindex, Object hostname, int remote_port) {
		 result = new ();
		http_connect_state generatedConnect_state = this.getConnect_state();
		if (!generatedConnect_state) {
			result = conn.connect_init(0);
			if (result) {
				return result;
			} 
		} 
		result = conn.CONNECT(sockindex, hostname, remote_port);
		if (result || conn.Curl_connect_complete()) {
			conn.connect_done();
		} 
		return result/* CURL_DISABLE_PROXY */;
	}
	/***************************************************************************
	 *                                  _   _ ____  _
	 *  Project                     ___| | | |  _ \| |
	 *                             / __| | | | |_) | |
	 *                            | (__| |_| |  _ <| |___
	 *                             \___|\___/|_| \_\_____|
	 *
	 * Copyright (C) 1998 - 2018, Daniel Stenberg, <daniel@haxx.se>, et al.
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
	/* Only include this function if one or more of FTP, FILE are enabled. */
	/*
	  Check if this is a range download, and if so, set the internal variables
	  properly.
	 */
	public Object Curl_range() {
		 from = new ();
		 to = new ();
		byte ptr;
		byte ptr2;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedState = data.getState();
		Object generatedReq = data.getReq();
		if (generatedState.getUse_range() && generatedState.getRange()) {
			CURLofft from_t = new CURLofft();
			CURLofft to_t = new CURLofft();
			from_t = ModernizedCProgram.curlx_strtoofft(generatedState.getRange(), ptr, 0, from);
			if (from_t == .CURL_OFFT_FLOW) {
				return CURLE_RANGE_ERROR;
			} 
			while (ptr && ((ModernizedCProgram.Curl_isspace((int)((byte)ptr))) || (ptr == (byte)'-'))) {
				ptr++;
			}
			to_t = ModernizedCProgram.curlx_strtoofft(ptr, ptr2, 0, to);
			if (to_t == .CURL_OFFT_FLOW) {
				return CURLE_RANGE_ERROR;
			} 
			if ((to_t == .CURL_OFFT_INVAL) && !from_t) {
				generatedState.setResume_from(/* X - */from);
				do {
				} while (0);
			}  else if ((from_t == .CURL_OFFT_INVAL) && !to_t) {
				generatedReq.setMaxdownload(/* -Y */to);
				generatedState.setResume_from(-to);
				do {
				} while (0);
			} else {
					 totalsize = new ();
					if (from > /* Ensure the range is sensible - to should follow from. */to) {
						return CURLE_RANGE_ERROR;
					} 
					totalsize = to - from;
					if (totalsize == .CURL_OFF_T_C(-1024)) {
						return CURLE_RANGE_ERROR;
					} 
					generatedReq.setMaxdownload(totalsize + /* include last byte */1);
					generatedState.setResume_from(from);
					do {
					} while (0);
			} 
			do {
			} while (0);
		} else {
				generatedReq.setMaxdownload(-1);
		} 
		return CURLE_OK;
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
	/* it includes http_chunks.h */
	/* it includes http_chunks.h */
	/* for the client write stuff */
	/* for Curl_convert_to_network prototype */
	/* The last #include files should be: */
	/*
	 * Chunk format (simplified):
	 *
	 * <HEX SIZE>[ chunk extension ] CRLF
	 * <DATA> CRLF
	 *
	 * Highlights from RFC2616 section 3.6 say:
	
	   The chunked encoding modifies the body of a message in order to
	   transfer it as a series of chunks, each with its own size indicator,
	   followed by an OPTIONAL trailer containing entity-header fields. This
	   allows dynamically produced content to be transferred along with the
	   information necessary for the recipient to verify that it has
	   received the full message.
	
	       Chunked-Body   = *chunk
	                        last-chunk
	                        trailer
	                        CRLF
	
	       chunk          = chunk-size [ chunk-extension ] CRLF
	                        chunk-data CRLF
	       chunk-size     = 1*HEX
	       last-chunk     = 1*("0") [ chunk-extension ] CRLF
	
	       chunk-extension= *( ";" chunk-ext-name [ "=" chunk-ext-val ] )
	       chunk-ext-name = token
	       chunk-ext-val  = token | quoted-string
	       chunk-data     = chunk-size(OCTET)
	       trailer        = *(entity-header CRLF)
	
	   The chunk-size field is a string of hex digits indicating the size of
	   the chunk. The chunked encoding is ended by any chunk whose size is
	   zero, followed by the trailer, which is terminated by an empty line.
	
	 */
	/* Check for an ASCII hex digit.
	   We avoid the use of ISXDIGIT to accommodate non-ASCII hosts. */
	/* 0-9 */
	/* A-F */
	/* a-f */
	public void Curl_httpchunk_init() {
		Curl_chunker generatedChunk = this.getChunk();
		Curl_chunker chunk = generatedChunk;
		chunk.setHexindex(/* start at 0 */0);
		chunk.setDataleft(/* no data left yet! */0);
		chunk.setState(/* we get hex first! */.CHUNK_HEX/*
		 * chunk_read() returns a OK for normal operations, or a positive return code
		 * for errors. STOP means this sequence of chunks is complete.  The 'wrote'
		 * argument is set to tell the caller how many bytes we actually passed to the
		 * client (for byte-counting and whatever).
		 *
		 * The states and the state-machine is further explained in the header file.
		 *
		 * This function always uses ASCII hex values to accommodate non-ASCII hosts.
		 * For example, 0x0d and 0x0a are used instead of '\r' and '\n'.
		 */);
	}
	public  Curl_httpchunk_read(byte datap, Object datalen, Object wrotep, Object extrap) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Curl_chunker generatedChunk = this.getChunk();
		Curl_chunker ch = generatedChunk;
		Object generatedReq = data.getReq();
		SingleRequest k = generatedReq;
		size_t piece = new size_t();
		 length = ()datalen;
		size_t wrote = (size_t)wrotep;
		wrote = /* nothing's written yet */0;
		Object generatedSet = data.getSet();
		Object generatedIgnorebody = k.getIgnorebody();
		if (generatedSet.getHttp_te_skip() && !generatedIgnorebody) {
			result = conn.Curl_client_write((1 << 0), datap, datalen);
			if (result) {
				extrap = result;
				return .CHUNKE_PASSTHRU_ERROR;
			} 
		} 
		int generatedHexindex = ch.getHexindex();
		Object generatedHexbuffer = ch.getHexbuffer();
		Object generatedDatasize = ch.getDatasize();
		contenc_writer_s generatedWriter_stack = k.getWriter_stack();
		int generatedTrlPos = this.getTrlPos();
		Byte generatedTrailer = this.getTrailer();
		int generatedTrlMax = this.getTrlMax();
		 generatedState = ch.getState();
		while (length) {
			switch (generatedState) {
			case .CHUNK_TRAILER_CR:
					if (datap == -1024) {
						ch.setState(.CHUNK_TRAILER_POSTCR);
						datap++;
						length--;
					} else {
							return .CHUNKE_BAD_CHUNK;
					} 
					break;
			case .CHUNK_TRAILER:
					if ((datap == -1024) || (datap == -1024/* this is the end of a trailer, but if the trailer was zero bytes
					           there was no trailer and we move on */)) {
						if (generatedTrlPos) {
							generatedTrailer[generatedTrlPos++] = /* we allocate trailer with 3 bytes extra room to fit this */-1024;
							generatedTrailer[generatedTrlPos++] = -1024;
							generatedTrailer[generatedTrlPos] = 0;
							result = ();
							if (result/* Curl_convert_from_network calls failf if unsuccessful */) {
								return /* Treat it as a bad chunk */.CHUNKE_BAD_CHUNK;
							} 
							if (!generatedSet.getHttp_te_skip()) {
								result = conn.Curl_client_write((1 << 1), generatedTrailer, generatedTrlPos);
								if (result) {
									extrap = result;
									return .CHUNKE_PASSTHRU_ERROR;
								} 
							} 
							this.setTrlPos(0);
							ch.setState(.CHUNK_TRAILER_CR);
							if (datap == -1024/* already on the LF */) {
								break;
							} 
						} else {
								ch.setState(/* no trailer, we're on the final CRLF pair */.CHUNK_TRAILER_POSTCR);
								break;
						} 
					} else {
							if (generatedTrlPos >= generatedTrlMax) {
								byte ptr;
								if (generatedTrlMax) {
									generatedTrlMax *= 2;
									ptr = .Curl_crealloc(generatedTrailer, generatedTrlMax + 3);
								} else {
										this.setTrlMax(128);
										ptr = .Curl_cmalloc(generatedTrlMax + 3);
								} 
								if (!ptr) {
									return .CHUNKE_OUT_OF_MEMORY;
								} 
								this.setTrailer(ptr);
							} 
							generatedTrailer[generatedTrlPos++] = datap;
					} 
					datap++;
					length--;
					break;
			case .CHUNK_HEX:
					if (ModernizedCProgram.Curl_isxdigit(datap)) {
						if (generatedHexindex < 16) {
							generatedHexbuffer[generatedHexindex] = datap;
							datap++;
							length--;
							generatedHexindex++;
						} else {
								return /* longer hex than we support */.CHUNKE_TOO_LONG_HEX;
						} 
					} else {
							byte endptr;
							if (0 == generatedHexindex) {
								return .CHUNKE_ILLEGAL_HEX;
							} 
							generatedHexbuffer[generatedHexindex] = /* length and datap are unmodified */0;
							result = ();
							if (result/* Curl_convert_from_network calls failf if unsuccessful */) {
								return /* Treat it as a bad hex character */.CHUNKE_ILLEGAL_HEX;
							} 
							if (ModernizedCProgram.curlx_strtoofft(generatedHexbuffer, endptr, 16, generatedDatasize)) {
								return .CHUNKE_ILLEGAL_HEX;
							} 
							ch.setState(/* now wait for the CRLF */.CHUNK_LF);
					} 
					break;
			case .CHUNK_STOP:
					if (datap == -1024) {
						length--;
						ch.setDataleft(ModernizedCProgram.curlx_sotouz(/* Record the length of any data left in the end of the buffer
						           even if there's no more chunks to read */length));
						return /* return stop */.CHUNKE_STOP;
					} else {
							return .CHUNKE_BAD_CHUNK;
					} 
			case .CHUNK_TRAILER_POSTCR/* We enter this state when a CR should arrive so we expect to
			         have to first pass a CR before we wait for LF */:
					if ((datap != -1024) && (datap != -1024)) {
						ch.setState(/* not a CR then it must be another header in the trailer */.CHUNK_TRAILER);
						break;
					} 
					if (datap == -1024) {
						/* skip if CR */datap++;
						length--;
					} 
					ch.setState(/* now wait for the final LF */.CHUNK_STOP);
					break;
			case .CHUNK_LF:
					if (datap == /* waiting for the LF after a chunk size */-1024) {
						if (0 == generatedDatasize) {
							ch.setState(/* now check for trailers */.CHUNK_TRAILER);
							this.setTrlPos(0);
						} else {
								ch.setState(.CHUNK_DATA);
						} 
					} 
					datap++;
					length--;
					break;
			case .CHUNK_DATA/* We expect 'datasize' of data. We have 'length' right now, it can be
			         more or less than 'datasize'. Get the smallest piece.
			      */:
					piece = ModernizedCProgram.curlx_sotouz((generatedDatasize >= length) ? length : generatedDatasize);
					if (!generatedSet.getHttp_te_skip() && !generatedIgnorebody) {
						if (!generatedSet.getHttp_ce_skip() && generatedWriter_stack) {
							result = ModernizedCProgram.Curl_unencode_write(conn, generatedWriter_stack, datap, piece);
						} else {
								result = conn.Curl_client_write((1 << 0), datap, piece);
						} 
						if (result) {
							extrap = result;
							return .CHUNKE_PASSTHRU_ERROR;
						} 
					} 
					wrote += piece;
					generatedDatasize -= /* decrease amount left to expect */piece;
					datap += /* move read pointer forward */piece;
					length -= /* decrease space left in this round */piece;
					if (0 == generatedDatasize) {
						ch.setState(/* end of data this round, we now expect a trailing CRLF */.CHUNK_POSTLF);
					} 
					break;
			case .CHUNK_POSTLF:
					if (datap == -1024) {
						/* The last one before we go back to hex state and start all over. *//* sets state back to CHUNK_HEX */conn.Curl_httpchunk_init();
					}  else if (datap != -1024) {
						return .CHUNKE_BAD_CHUNK;
					} 
					datap++;
					length--;
					break;
			}
		}
		return .CHUNKE_OK;
	}
	public int waitconnect_getsock(Object sock) {
		int i;
		int s = 0;
		int rc = 0;
		Object generatedTempsock = this.getTempsock();
		for (i = 0; i < 2; i++) {
			if (generatedTempsock[i] != CURL_SOCKET_BAD) {
				sock[s] = generatedTempsock[i];
				rc |=  (1 << (16 + (s)));
				/* when connecting QUIC, we want to read the socket too */s++;
			} 
		}
		return rc;
	}
	public int waitproxyconnect_getsock(Object sock) {
		Object generatedSock = this.getSock();
		sock[0] = generatedSock[0];
		http_connect_state generatedConnect_state = this.getConnect_state();
		if (generatedConnect_state) {
			return (1 << (false));
		} 
		return (1 << (16 + (false)));
	}
	public int domore_getsock(Object socks) {
		Object generatedHandler = this.getHandler();
		if (conn && generatedHandler.getDomore_getsock()) {
			return .UNRECOGNIZEDFUNCTIONNAME(conn, socks);
		} 
		return 0;
	}
	public int doing_getsock(Object socks) {
		Object generatedHandler = this.getHandler();
		if (conn && generatedHandler.getDoing_getsock()) {
			return .UNRECOGNIZEDFUNCTIONNAME(conn, socks);
		} 
		return 0;
	}
	public int protocol_getsock(Object socks) {
		Object generatedHandler = this.getHandler();
		if (generatedHandler.getProto_getsock()) {
			return .UNRECOGNIZEDFUNCTIONNAME(conn, socks/* Backup getsock logic. Since there is a live socket in use, we must wait
			     for it or it will be removed from watching when the multi_socket API is
			     used. */);
		} 
		Object generatedSock = this.getSock();
		socks[0] = generatedSock[0];
		return (1 << (false)) | (1 << (16 + (false)));
	}
	public void do_complete() {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		generatedReq.setChunk(0);
		generatedData.Curl_pgrsTime(.TIMER_PRETRANSFER);
	}
	public Object multi_do_more(int complete) {
		 result = CURLE_OK;
		complete = 0;
		Object generatedHandler = this.getHandler();
		if (generatedHandler.getDo_more()) {
			result = .UNRECOGNIZEDFUNCTIONNAME(conn, complete);
		} 
		if (!result && (complete == 1)) {
			/* do_complete must be called after the protocol-specific DO function */conn.do_complete();
		} 
		return result/*
		 * We are doing protocol-specific connecting and this is being called over and
		 * over from the multi interface until the connection phase is done on
		 * protocol layer.
		 */;
	}
	public Object protocol_connecting( done) {
		 result = CURLE_OK;
		Object generatedHandler = this.getHandler();
		if (conn && generatedHandler.getConnecting()) {
			done = 0;
			result = .UNRECOGNIZEDFUNCTIONNAME(conn, done);
		} else {
				done = 1;
		} 
		return result/*
		 * We are DOING this is being called over and over from the multi interface
		 * until the DOING phase is done on protocol layer.
		 */;
	}
	public Object protocol_doing( done) {
		 result = CURLE_OK;
		Object generatedHandler = this.getHandler();
		if (conn && generatedHandler.getDoing()) {
			done = 0;
			result = .UNRECOGNIZEDFUNCTIONNAME(conn, done);
		} else {
				done = 1;
		} 
		return result/*
		 * We have discovered that the TCP connection has been successful, we can now
		 * proceed with some action.
		 *
		 */;
	}
	public Object protocol_connect( protocol_done) {
		 result = CURLE_OK;
		do {
		} while (0);
		do {
		} while (0);
		protocol_done = 0;
		ConnectBits generatedBits = this.getBits();
		Object generatedTcpconnect = generatedBits.getTcpconnect();
		Object generatedProtoconnstart = generatedBits.getProtoconnstart();
		Object generatedHandler = this.getHandler();
		if (generatedTcpconnect[0] && generatedProtoconnstart) {
			if (!generatedHandler.getConnecting()) {
				protocol_done = 1;
			} 
			return CURLE_OK;
		} 
		proxy_info generatedHttp_proxy = this.getHttp_proxy();
		Object generatedProxytype = generatedHttp_proxy.getProxytype();
		Object generatedProxy_ssl_connected = generatedBits.getProxy_ssl_connected();
		Object generatedTunnel_proxy = generatedBits.getTunnel_proxy();
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		if (!generatedProtoconnstart) {
			result = conn.Curl_proxy_connect(0);
			if (result) {
				return result;
			} 
			if ((generatedProxytype == CURLPROXY_HTTPS && !generatedProxy_ssl_connected[0])) {
				return /* wait for HTTPS proxy SSL initialization to complete */CURLE_OK;
			} 
			if (generatedTunnel_proxy && generatedHttpproxy && conn/* when using an HTTP tunnel proxy, await complete tunnel establishment
			         before proceeding further. Return CURLE_OK so we'll be called again */.Curl_connect_ongoing()) {
				return CURLE_OK;
			} 
			if (generatedHandler.getConnect_it()) {
				result = .UNRECOGNIZEDFUNCTIONNAME(conn, /* Call the protocol-specific connect function */protocol_done);
			} else {
					protocol_done = 1;
			} 
			if (!/* it has started, possibly even completed but that knowledge isn't stored
			       in this bit! */result) {
				generatedBits.setProtoconnstart(1);
			} 
		} 
		return /* pass back status */result;
	}
	public void Curl_multiuse_state(int bundlestate) {
		do {
		} while (0);
		do {
		} while (0);
		do {
		} while (0);
		do {
		} while (0);
		connectbundle generatedBundle = this.getBundle();
		generatedBundle.setMultiuse(bundlestate);
		Curl_easy generatedData = this.getData();
		Object generatedMulti = generatedData.getMulti();
		generatedMulti.process_pending_handles();
	}
	/* use BUNDLE_* defines */
	/* doing */
	/* proto_getsock */
	/* doing_getsock */
	/* domore_getsock */
	/* perform_getsock */
	/* disconnect */
	/* readwrite */
	/* connection_check */
	/* defport */
	/* protocol */
	/* flags */
	public Object http_setup_conn() {
		/* allocate the HTTP-specific struct for the Curl_easy, only to survive
		     during this request */HTTP http = new HTTP();
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		do {
		} while (0);
		http = .Curl_ccalloc(1, );
		if (!http) {
			return CURLE_OUT_OF_MEMORY;
		} 
		Object generatedForm = http.getForm();
		generatedData.Curl_mime_initpart(generatedForm);
		Object generatedReq = data.getReq();
		generatedReq.setProtop(http);
		Object generatedSet = data.getSet();
		Object generatedHandler = this.getHandler();
		curl_llist generatedEasyq = (conn).getEasyq();
		Object generatedSize = generatedEasyq.getSize();
		if (generatedSet.getHttpversion() == CURL_HTTP_VERSION_3) {
			if (generatedHandler.getFlags() & (1 << 0/* Only go HTTP/3 directly on HTTPS URLs. It needs a UDP socket and does
			         the QUIC dance. */)) {
				this.setTransport(.TRNSPRT_QUIC);
			} else {
					data.Curl_failf("HTTP/3 requested for non-HTTPS URL");
					return CURLE_URL_MALFORMAT;
			} 
		} else {
				if (!(generatedSize)) {
					do {
					} while (/* if not already multi-using, setup connection details */0);
				} 
				;
		} 
		return CURLE_OK/*
		 * checkProxyHeaders() checks the linked list of custom proxy headers
		 * if proxy headers are not available, then it will lookup into http header
		 * link list
		 *
		 * It takes a connectdata struct as input instead of the Curl_easy simply to
		 * know if this is a proxy request or not, as it then might check a different
		 * header list. Provide the header prefix without colon!.
		 *//*
		 * checkProxyHeaders() checks the linked list of custom proxy headers
		 * if proxy headers are not available, then it will lookup into http header
		 * link list
		 *
		 * It takes a connectdata struct as input instead of the Curl_easy simply to
		 * know if this is a proxy request or not, as it then might check a different
		 * header list. Provide the header prefix without colon!.
		 */;
	}
	/*
	 * HTTP handler interface.
	 */
	public Object http_output_basic( proxy) {
		size_t size = 0;
		byte authorization = ((Object)0);
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		byte userp;
		byte user;
		byte pwd;
		 result = new ();
		byte out;
		dynamically_allocated_data generatedAllocptr = this.getAllocptr();
		Byte generatedProxyuserpwd = generatedAllocptr.getProxyuserpwd();
		proxy_info generatedHttp_proxy = this.getHttp_proxy();
		Byte generatedUser = generatedHttp_proxy.getUser();
		Byte generatedPasswd = generatedHttp_proxy.getPasswd();
		Byte generatedUserpwd = generatedAllocptr.getUserpwd();
		if (proxy) {
			userp = generatedProxyuserpwd;
			user = generatedUser;
			pwd = generatedPasswd;
		} else {
				userp = generatedUserpwd;
				user = generatedUser;
				pwd = generatedPasswd;
		} 
		out = ModernizedCProgram.curl_maprintf("%s:%s", user, pwd);
		if (!out) {
			return CURLE_OUT_OF_MEMORY;
		} 
		result = data.Curl_base64_encode(out, .strlen(out), authorization, size);
		if (result) {
			;
		} 
		if (!authorization) {
			result = CURLE_REMOTE_ACCESS_DENIED;
			;
		} 
		.Curl_cfree(userp);
		userp = ModernizedCProgram.curl_maprintf("%sAuthorization: Basic %s\r\n", proxy ? "Proxy-" : "", authorization);
		.Curl_cfree(authorization);
		if (!userp) {
			result = CURLE_OUT_OF_MEMORY;
			;
		} 
		return result/*
		 * http_output_bearer() sets up an Authorization: header
		 * for HTTP Bearer authentication.
		 *
		 * Returns CURLcode.
		 */;
	}
	public Object http_output_bearer() {
		byte userp;
		 result = CURLE_OK;
		dynamically_allocated_data generatedAllocptr = this.getAllocptr();
		Byte generatedUserpwd = generatedAllocptr.getUserpwd();
		userp = generatedUserpwd;
		.Curl_cfree(userp);
		Byte generatedOauth_bearer = this.getOauth_bearer();
		userp = ModernizedCProgram.curl_maprintf("Authorization: Bearer %s\r\n", generatedOauth_bearer);
		if (!userp) {
			result = CURLE_OUT_OF_MEMORY;
			;
		} 
	}
	public Object http_perhapsrewind() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		HTTP http = generatedReq.getProtop();
		 bytessent = new ();
		 expectsend = -/* default is unknown */1;
		if (!http/* If this is still NULL, we have not reach very far and we can safely
		       skip this rewinding stuff */) {
			return CURLE_OK;
		} 
		Object generatedSet = data.getSet();
		switch (generatedSet.getHttpreq()) {
		case .HTTPREQ_HEAD:
				return CURLE_OK;
		case .HTTPREQ_GET:
		default:
				break;
		}
		bytessent = generatedReq.getWritebytecount();
		ConnectBits generatedBits = this.getBits();
		Object generatedAuthneg = generatedBits.getAuthneg();
		Object generatedProtoconnstart = generatedBits.getProtoconnstart();
		Object generatedState = data.getState();
		Object generatedPostsize = http.getPostsize();
		if (generatedAuthneg) {
			expectsend = 0;
		}  else if (!generatedProtoconnstart) {
			expectsend = /* HTTP CONNECT in progress: there is no body */0;
		} else {
				switch (generatedSet.getHttpreq()) {
				case .HTTPREQ_POST_MIME:
						expectsend = generatedPostsize;
						break;
				case .HTTPREQ_POST:
				case .HTTPREQ_POST_FORM:
				case .HTTPREQ_PUT:
						if (generatedState.getInfilesize() != -1) {
							expectsend = generatedState.getInfilesize();
						} 
						break;
				default:
						break;
				}
		} 
		generatedBits.setRewindaftersend(/* default */0);
		 generatedHttp_ntlm_state = this.getHttp_ntlm_state();
		 generatedProxy_ntlm_state = this.getProxy_ntlm_state();
		Object generatedWritesockfd = this.getWritesockfd();
		Object generatedClose = generatedBits.getClose();
		if (bytessent) {
			return /* we rewind now at once since if we already sent something */conn.Curl_readrewind();
		} 
		return CURLE_OK/*
		 * Curl_http_auth_act() gets called when all HTTP headers have been received
		 * and it checks what authentication methods that are available and decides
		 * which one (if any) to use. It will set 'newurl' if an auth method was
		 * picked.
		 */;
	}
	public Object Curl_http_auth_act() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		bool pickhost = 0;
		bool pickproxy = 0;
		 result = CURLE_OK;
		long authmask = ~-1024;
		Byte generatedOauth_bearer = this.getOauth_bearer();
		if (!generatedOauth_bearer) {
			authmask &=  (long)~CURLAUTH_BEARER;
		} 
		Object generatedReq = data.getReq();
		if (100 <= generatedReq.getHttpcode() && 199 >= generatedReq.getHttpcode()) {
			return /* this is a transient response code, ignore */CURLE_OK;
		} 
		Object generatedState = data.getState();
		Object generatedSet = data.getSet();
		if (generatedState.getAuthproblem()) {
			return generatedSet.getHttp_fail_on_error() ? CURLE_HTTP_RETURNED_ERROR : CURLE_OK;
		} 
		ConnectBits generatedBits = this.getBits();
		Object generatedUser_passwd = generatedBits.getUser_passwd();
		Object generatedAuthneg = generatedBits.getAuthneg();
		int generatedHttpversion = this.getHttpversion();
		if ((generatedUser_passwd || generatedOauth_bearer) && ((generatedReq.getHttpcode() == 401) || (generatedAuthneg && generatedReq.getHttpcode() < 300))) {
			pickhost = generatedState.getAuthhost().pickoneauth(authmask);
			if (!pickhost) {
				generatedState.setAuthproblem(1);
			} 
			if (generatedState.getAuthhost().getPicked() == CURLAUTH_NTLM && generatedHttpversion > 11) {
				data.Curl_infof("Forcing HTTP/1.1 for NTLM");
				conn.Curl_conncontrol(1);
				generatedSet.setHttpversion(CURL_HTTP_VERSION_1_1);
			} 
		} 
		Object generatedProxy_user_passwd = generatedBits.getProxy_user_passwd();
		if (generatedProxy_user_passwd && ((generatedReq.getHttpcode() == 407) || (generatedAuthneg && generatedReq.getHttpcode() < 300))) {
			pickproxy = generatedState.getAuthproxy().pickoneauth(authmask & ~CURLAUTH_BEARER);
			if (!pickproxy) {
				generatedState.setAuthproblem(1);
			} 
		} 
		Object generatedRewindaftersend = generatedBits.getRewindaftersend();
		Object generatedChange = data.getChange();
		if (pickhost || pickproxy) {
			if ((generatedSet.getHttpreq() != .HTTPREQ_GET) && (generatedSet.getHttpreq() != .HTTPREQ_HEAD) && !generatedRewindaftersend) {
				result = conn.http_perhapsrewind();
				if (result) {
					return result/* In case this is GSS auth, the newurl field is already allocated so
					       we must make sure to free it before allocating a new one. As figured
					       out in bug #2284386 */;
				} 
			} 
			do {
				.Curl_cfree((generatedReq.getNewurl()));
				(generatedReq.getNewurl()) = ((Object)0);
			} while (0);
			generatedReq.setNewurl(.Curl_cstrdup(generatedChange.getUrl()));
			if (!generatedReq.getNewurl()) {
				return CURLE_OUT_OF_MEMORY;
			} 
		}  else if ((generatedReq.getHttpcode() < 300) && (!generatedState.getAuthhost().getDone()) && generatedAuthneg) {
			if ((generatedSet.getHttpreq() != .HTTPREQ_GET) && (generatedSet.getHttpreq() != .HTTPREQ_HEAD)) {
				generatedReq.setNewurl(.Curl_cstrdup(generatedChange.getUrl()));
				if (!generatedReq.getNewurl()) {
					return CURLE_OUT_OF_MEMORY;
				} 
				generatedState.getAuthhost().setDone(1);
			} 
		} 
		if (conn.http_should_fail()) {
			data.Curl_failf("The requested URL returned error: %d", generatedReq.getHttpcode());
			result = CURLE_HTTP_RETURNED_ERROR;
		} 
		return result/*
		 * Output the correct authentication header depending on the auth type
		 * and whether or not it is to a proxy.
		 *//*
		 * Output the correct authentication header depending on the auth type
		 * and whether or not it is to a proxy.
		 */;
	}
	public Object Curl_http_output_auth(Object request, Object path,  proxytunnel) {
		 result = /* TRUE if this is the request setting
		                                           up the proxy tunnel */CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		auth authhost = new auth();
		auth authproxy = new auth();
		do {
		} while (0);
		Object generatedState = data.getState();
		authhost = generatedState.getAuthhost();
		authproxy = generatedState.getAuthproxy();
		ConnectBits generatedBits = this.getBits();
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		Object generatedProxy_user_passwd = generatedBits.getProxy_user_passwd();
		Object generatedUser_passwd = generatedBits.getUser_passwd();
		Byte generatedOauth_bearer = this.getOauth_bearer();
		if ((generatedHttpproxy && generatedProxy_user_passwd) || generatedUser_passwd || generatedOauth_bearer) {
			;
		} else {
				authhost.setDone(1);
				authproxy.setDone(1);
				return /* no authentication with no user or password */CURLE_OK;
		} 
		long generatedWant = authhost.getWant();
		long generatedPicked = authhost.getPicked();
		if (generatedWant && !generatedPicked) {
			authhost.setPicked(generatedWant);
		} 
		if (generatedWant && !generatedPicked) {
			authproxy.setPicked(generatedWant);
		} 
		Object generatedTunnel_proxy = generatedBits.getTunnel_proxy();
		if (generatedHttpproxy && (generatedTunnel_proxy == (bit)proxytunnel)) {
			result = ModernizedCProgram.output_auth_headers(conn, authproxy, request, path, 1);
			if (result) {
				return result;
			} 
		} else {
				authproxy.setDone(/* CURL_DISABLE_PROXY *//* we have no proxy so let's pretend we're done authenticating
				       with it */1);
		} 
		Object generatedNetrc = generatedBits.getNetrc();
		Object generatedSet = data.getSet();
		hostname generatedHost = this.getHost();
		Byte generatedName = generatedHost.getName();
		if (!generatedState.getThis_is_a_follow() || generatedNetrc || !generatedState.getFirst_host() || generatedSet.getAllow_auth_to_other_hosts() || ModernizedCProgram.Curl_strcasecompare(generatedState.getFirst_host(), generatedName)) {
			result = ModernizedCProgram.output_auth_headers(conn, authhost, request, path, 0);
		} else {
				authhost.setDone(1);
		} 
		return result/* when disabled */;
	}
	/*
	 * Curl_http_input_auth() deals with Proxy-Authenticate: and WWW-Authenticate:
	 * headers. They are dealt with both in the transfer.c main loop and in the
	 * proxy CONNECT loop.
	 */
	public Object Curl_http_input_auth( proxy, Object auth) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		long availp;
		auth authp = new auth();
		Object generatedInfo = data.getInfo();
		Object generatedState = data.getState();
		if (proxy) {
			availp = generatedInfo.getProxyauthavail();
			authp = generatedState.getAuthproxy();
		} else {
				availp = generatedInfo.getHttpauthavail();
				authp = generatedState.getAuthhost();
		} 
		long generatedAvail = authp.getAvail();
		long generatedPicked = authp.getPicked();
		while (auth) {
			if (ModernizedCProgram.curl_strnequal("NTLM", auth, .strlen(/* NTLM support requires the SSL crypto libs */"NTLM"))) {
				if ((generatedAvail & CURLAUTH_NTLM) || (generatedAvail & CURLAUTH_NTLM_WB) || ModernizedCProgram.Curl_auth_is_ntlm_supported()) {
					availp |=  CURLAUTH_NTLM;
					generatedAvail |=  CURLAUTH_NTLM;
					if (generatedPicked == CURLAUTH_NTLM || generatedPicked == CURLAUTH_NTLM_WB) {
						 result = conn.Curl_input_ntlm(proxy, /* NTLM authentication is picked and activated */auth);
						if (!ModernizedCProgram.result) {
							generatedState.setAuthproblem(0);
						} else {
								data.Curl_infof("Authentication problem. Ignoring this.\n");
								generatedState.setAuthproblem(1);
						} 
					} 
				} 
			}  else if (ModernizedCProgram.curl_strnequal("Digest", auth, .strlen("Digest"))) {
				if ((generatedAvail & CURLAUTH_DIGEST) != 0) {
					data.Curl_infof("Ignoring duplicate digest auth header.\n");
				}  else if (ModernizedCProgram.Curl_auth_is_digest_supported()) {
					 result = new ();
					availp |=  CURLAUTH_DIGEST;
					generatedAvail |=  CURLAUTH_DIGEST/* We call this function on input Digest headers even if Digest
					             * authentication isn't activated yet, as we need to store the
					             * incoming data from this header in case we are going to use
					             * Digest */;
					ModernizedCProgram.result = conn.Curl_input_digest(proxy, auth);
					if (ModernizedCProgram.result) {
						data.Curl_infof("Authentication problem. Ignoring this.\n");
						generatedState.setAuthproblem(1);
					} 
				} 
			}  else if (ModernizedCProgram.curl_strnequal("Basic", auth, .strlen("Basic"))) {
				availp |=  CURLAUTH_BASIC;
				generatedAvail |=  CURLAUTH_BASIC;
				if (generatedPicked == CURLAUTH_BASIC/* We asked for Basic authentication but got a 40X back
				                 anyway, which basically means our name+password isn't
				                 valid. */) {
					authp.setAvail(CURLAUTH_NONE);
					data.Curl_infof("Authentication problem. Ignoring this.\n");
					generatedState.setAuthproblem(1);
				} 
			}  else if (ModernizedCProgram.curl_strnequal("Bearer", auth, .strlen("Bearer"))) {
				availp |=  CURLAUTH_BEARER;
				generatedAvail |=  CURLAUTH_BEARER;
				if (generatedPicked == CURLAUTH_BEARER/* We asked for Bearer authentication but got a 40X back
				                  anyway, which basically means our token isn't valid. */) {
					authp.setAvail(CURLAUTH_NONE);
					data.Curl_infof("Authentication problem. Ignoring this.\n");
					generatedState.setAuthproblem(1);
				} 
			} 
			while (auth && auth != /* there may be multiple methods on one line, so keep reading *//* read up to the next comma */(byte)',') {
				auth++;
			}
			if (auth == /* if we're on a comma, skip it */(byte)',') {
				auth++;
			} 
			while (auth && (ModernizedCProgram.Curl_isspace((int)((byte)auth)))) {
				auth++;
			}
		}
		return CURLE_OK/**
		 * http_should_fail() determines whether an HTTP response has gotten us
		 * into an error state or not.
		 *
		 * @param conn all information about the current connection
		 *
		 * @retval 0 communications should continue
		 *
		 * @retval 1 communications should not continue
		 */;
	}
	/* the first non-space */
	public int http_should_fail() {
		Curl_easy data = new Curl_easy();
		int httpcode;
		do {
		} while (0);
		Curl_easy generatedData = this.getData();
		data = generatedData;
		do {
		} while (0);
		Object generatedReq = data.getReq();
		httpcode = generatedReq.getHttpcode();
		Object generatedSet = data.getSet();
		if (!generatedSet.getHttp_fail_on_error()) {
			return 0/*
			  ** Any code < 400 is never terminal.
			  */;
		} 
		if (httpcode < 400) {
			return 0/*
			  ** Any code >= 400 that's not 401 or 407 is always
			  ** a terminal error
			  */;
		} 
		if ((httpcode != 401) && (httpcode != 407)) {
			return 1/*
			  ** All we have left to deal with is 401 and 407
			  */;
		} 
		do {
		} while (0/*
		  ** Examine the current authentication state to see if this
		  ** is an error.  The idea is for this function to get
		  ** called after processing all the headers in a response
		  ** message.  So, if we've been to asked to authenticate a
		  ** particular stage, and we've done it, we're OK.  But, if
		  ** we're already completely authenticated, it's not OK to
		  ** get another 401 or 407.
		  **
		  ** It is possible for authentication to go stale such that
		  ** the client needs to reauthenticate.  Once that info is
		  ** available, use it here.
		  */);
		ConnectBits generatedBits = this.getBits();
		Object generatedUser_passwd = generatedBits.getUser_passwd();
		if ((httpcode == 401) && !generatedUser_passwd) {
			return 1;
		} 
		Object generatedProxy_user_passwd = generatedBits.getProxy_user_passwd();
		if ((httpcode == 407) && !generatedProxy_user_passwd) {
			return 1;
		} 
		Object generatedState = data.getState();
		return generatedState.getAuthproblem();
	}
	public Object Curl_http_connect( done) {
		 result = new ();
		conn.Curl_conncontrol(/* We default to persistent connections. We set this already in this connect
		     function to make the re-use checks properly be able to check this bit. */0);
		result = conn.Curl_proxy_connect(/* the CONNECT procedure might not have been completed */0);
		if (result) {
			return result;
		} 
		ConnectBits generatedBits = this.getBits();
		Object generatedProxy_connect_closed = generatedBits.getProxy_connect_closed();
		if (generatedProxy_connect_closed) {
			return /* this is not an error, just part of the connection negotiation */CURLE_OK;
		} 
		proxy_info generatedHttp_proxy = this.getHttp_proxy();
		Object generatedProxytype = generatedHttp_proxy.getProxytype();
		Object generatedProxy_ssl_connected = generatedBits.getProxy_ssl_connected();
		if ((generatedProxytype == CURLPROXY_HTTPS && !generatedProxy_ssl_connected[0])) {
			return /* wait for HTTPS proxy SSL initialization to complete */CURLE_OK;
		} 
		if (conn.Curl_connect_ongoing()) {
			return /* nothing else to do except wait right now - we're not done here. */CURLE_OK;
		} 
		Curl_easy generatedData = this.getData();
		Object generatedSet = generatedData.getSet();
		if (generatedSet.getHaproxyprotocol()) {
			result = /* add HAProxy PROXY protocol header */conn.add_haproxy_protocol_header();
			if (result) {
				return result;
			} 
		} 
		Object generatedGiven = this.getGiven();
		if (generatedGiven.getProtocol() & CURLPROTO_HTTPS) {
			result = /* perform SSL initialization */CURLE_COULDNT_CONNECT;
			if (result) {
				return result;
			} 
		} else {
				done = 1;
		} 
		return CURLE_OK/* this returns the socket to wait for in the DO and DOING state for the multi
		   interface and then we're always _sending_ a request and thus we wait for
		   the single socket to become writable only */;
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
	/* for the week day and month names */
	/* The last 3 #include files should be in this order */
	/*
	 * Forward declarations.
	 */
	public int http_getsock_do(Object socks) {
		Object generatedSock = this.getSock();
		socks[0] = generatedSock[/* write mode */0];
		return (1 << (16 + (false)));
	}
	public Object add_haproxy_protocol_header() {
		byte[] proxy_header = new byte[128];
		Curl_send_buffer req_buffer = new Curl_send_buffer();
		 result = new ();
		byte[] tcp_version = new byte[5];
		ConnectBits generatedBits = this.getBits();
		Object generatedIpv6 = generatedBits.getIpv6();
		if (generatedIpv6) {
			.strcpy(tcp_version, "TCP6");
		} else {
				.strcpy(tcp_version, "TCP4");
		} 
		Curl_easy generatedData = this.getData();
		Object generatedInfo = generatedData.getInfo();
		ModernizedCProgram.curl_msnprintf(proxy_header, , "PROXY %s %s %s %li %li\r\n", tcp_version, generatedInfo.getConn_local_ip(), generatedInfo.getConn_primary_ip(), generatedInfo.getConn_local_port(), generatedInfo.getConn_primary_port());
		Curl_send_buffer curl_send_buffer = new Curl_send_buffer();
		req_buffer = curl_send_buffer.Curl_add_buffer_init();
		if (!req_buffer) {
			return CURLE_OUT_OF_MEMORY;
		} 
		result = req_buffer.Curl_add_bufferf(proxy_header);
		if (result) {
			return result;
		} 
		result = ModernizedCProgram.Curl_add_buffer_send(req_buffer, conn, generatedInfo.getRequest_size(), 0, 0);
		return result;
	}
	/* perform SSL initialization for this socket */
	/* USE_SSL */
	/*
	 * Curl_http_done() gets called after a single HTTP request has been
	 * performed.
	 */
	public Object Curl_http_done(Object status,  premature) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		HTTP http = generatedReq.getProtop();
		Object generatedState = data.getState();
		generatedState.getAuthhost().setMultipass(/* Clear multipass flag. If authentication isn't done yet, then it will get
		   * a chance to be set back to true when we output the next auth header */0);
		generatedState.getAuthproxy().setMultipass(0);
		conn.Curl_unencode_cleanup();
		Object generatedSet = data.getSet();
		this.setSeek_func(generatedSet.getSeek_func());
		this.setSeek_client(generatedSet.getSeek_client());
		if (!http) {
			return CURLE_OK;
		} 
		Curl_send_buffer generatedSend_buffer = http.getSend_buffer();
		if (generatedSend_buffer) {
			generatedSend_buffer.Curl_add_buffer_free();
		} 
		;
		Object generatedForm = http.getForm();
		ModernizedCProgram.Curl_mime_cleanpart(generatedForm);
		if (status) {
			return status;
		} 
		ConnectBits generatedBits = this.getBits();
		Object generatedRetry = generatedBits.getRetry();
		if (!/* this check is pointless when DONE is called before the
		                      entire operation is complete */premature && !generatedRetry && !generatedSet.getConnect_only() && (generatedReq.getBytecount() + generatedReq.getHeaderbytecount() - generatedReq.getDeductheadercount()) <= 0/* If this connection isn't simply closed to be retried, AND nothing was
		       read from the HTTP server (that counts), this can't be right so we
		       return an error here */) {
			data.Curl_failf("Empty reply from server");
			return CURLE_GOT_NOTHING;
		} 
		return CURLE_OK/*
		 * Determine if we should use HTTP 1.1 (OR BETTER) for this request. Reasons
		 * to avoid it include:
		 *
		 * - if the user specifically requested HTTP 1.0
		 * - if the server we are connected to only supports 1.0
		 * - if any server previously contacted to handle this request only supports
		 * 1.0.
		 */;
	}
	/*
	 * Curl_http() gets called from the generic multi_do() function when a HTTP
	 * request is to be performed. This creates and sends a properly constructed
	 * HTTP request.
	 */
	public Object Curl_http( done) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 result = CURLE_OK;
		HTTP http = new HTTP();
		Object generatedState = data.getState();
		byte path = generatedState.getUp().getPath();
		byte query = generatedState.getUp().getQuery();
		bool paste_ftp_userpwd = 0;
		byte[] ftp_typecode = "";
		hostname generatedHost = this.getHost();
		Byte generatedName = generatedHost.getName();
		byte host = generatedName;
		byte te = /* transfer-encoding */"";
		byte ptr;
		byte request;
		Object generatedSet = data.getSet();
		Curl_HttpReq httpreq = generatedSet.getHttpreq();
		byte addcookies = ((Object)0);
		 included_body = 0;
		byte httpstring;
		Curl_send_buffer req_buffer = new Curl_send_buffer();
		 postsize = /* curl_off_t to handle large file sizes */0;
		byte altused = ((Object)0/* Always consider the DO phase done after this function call, even if there
		     may be parts of the request that is not yet sent, since we can deal with
		     the rest of the request in the PERFORM phase. */);
		done = 1;
		 generatedTransport = this.getTransport();
		int generatedHttpversion = this.getHttpversion();
		int generatedNegnpn = this.getNegnpn();
		if (generatedTransport != .TRNSPRT_QUIC) {
			if (generatedHttpversion < /* unless the connection is re-used and
			                                    already http2 */20) {
				switch (generatedNegnpn) {
				case CURL_HTTP_VERSION_2:
						this.setHttpversion(/* we know we're on HTTP/2 now */20);
						result = CURLE_UNSUPPORTED_PROTOCOL;
						if (result) {
							return result;
						} 
						break;
				case CURL_HTTP_VERSION_1_1/* continue with HTTP/1.1 when explicitly requested */:
						break;
				default:
						break;
				}
			} else {
					result = /* prepare for a http2 request */CURLE_UNSUPPORTED_PROTOCOL;
					if (result) {
						return result;
					} 
			} 
		} 
		Object generatedReq = data.getReq();
		http = generatedReq.getProtop();
		do {
		} while (0);
		int generatedRemote_port = this.getRemote_port();
		if (!generatedState.getThis_is_a_follow()) {
			.Curl_cfree(generatedState.getFirst_host());
			generatedState.setFirst_host(.Curl_cstrdup(generatedName));
			if (!generatedState.getFirst_host()) {
				return CURLE_OUT_OF_MEMORY;
			} 
			generatedState.setFirst_remote_port(generatedRemote_port);
		} 
		Object generatedHandler = this.getHandler();
		if ((generatedHandler.getProtocol() & ((CURLPROTO_HTTP | CURLPROTO_HTTPS) | CURLPROTO_FTP)) && generatedSet.getUpload()) {
			httpreq = .HTTPREQ_PUT;
		} 
		if (generatedSet.getStr()[/* Now set the 'request' pointer to the proper request string */dupstring.STRING_CUSTOMREQUEST]) {
			request = generatedSet.getStr()[dupstring.STRING_CUSTOMREQUEST];
		} else {
				if (generatedSet.getOpt_no_body()) {
					request = "HEAD";
				} else {
						do {
						} while (0);
						switch (httpreq) {
						case .HTTPREQ_GET:
								request = "GET";
								break;
						case .HTTPREQ_HEAD:
								request = "HEAD";
								break;
						case .HTTPREQ_OPTIONS:
								request = "OPTIONS";
								break;
						case .HTTPREQ_POST_MIME:
								request = "POST";
								break;
						case .HTTPREQ_POST_FORM:
						case .HTTPREQ_PUT:
								request = "PUT";
								break;
						case .HTTPREQ_POST:
						default:
						}
				} 
		} 
		dynamically_allocated_data generatedAllocptr = this.getAllocptr();
		Byte generatedUagent = generatedAllocptr.getUagent();
		if (ModernizedCProgram.Curl_checkheaders(conn, /* The User-Agent string might have been allocated in url.c already, because
		     it might have been used in the proxy connect, but if we have got a header
		     with the user-agent string specified, we erase the previously made string
		     here. */"User-Agent")) {
			.Curl_cfree(generatedUagent);
			generatedAllocptr.setUagent(((Object)0));
		} 
		{ 
			byte pq = ((Object)/* setup the authentication headers */0);
			if (query && query) {
				pq = ModernizedCProgram.curl_maprintf("%s?%s", path, query);
				if (!pq) {
					return CURLE_OUT_OF_MEMORY;
				} 
			} 
			result = conn.Curl_http_output_auth(request, (pq ? pq : path), 0);
			.Curl_cfree(pq);
			if (result) {
				return result;
			} 
		}
		ConnectBits generatedBits = this.getBits();
		if (((generatedState.getAuthhost().getMultipass() && !generatedState.getAuthhost().getDone()) || (generatedState.getAuthproxy().getMultipass() && !generatedState.getAuthproxy().getDone())) && (httpreq != .HTTPREQ_GET) && (httpreq != .HTTPREQ_HEAD/* Auth is required and we are not authenticated yet. Make a PUT or POST
		       with content-length zero as a "probe". */)) {
			generatedBits.setAuthneg(1);
		} else {
				generatedBits.setAuthneg(0);
		} 
		Byte generatedRef = generatedAllocptr.getRef();
		do {
			.Curl_cfree((generatedRef));
			(generatedRef) = ((Object)0);
		} while (0);
		Object generatedChange = data.getChange();
		if (generatedChange.getReferer() && !ModernizedCProgram.Curl_checkheaders(conn, "Referer")) {
			generatedAllocptr.setRef(ModernizedCProgram.curl_maprintf("Referer: %s\r\n", generatedChange.getReferer()));
			if (!generatedRef) {
				return CURLE_OUT_OF_MEMORY;
			} 
		} else {
				generatedAllocptr.setRef(((Object)0));
		} 
		if (generatedSet.getStr()[dupstring.STRING_COOKIE] && !ModernizedCProgram.Curl_checkheaders(conn, "Cookie")) {
			addcookies = generatedSet.getStr()[dupstring.STRING_COOKIE];
		} 
		Byte generatedAccept_encoding = generatedAllocptr.getAccept_encoding();
		if (!ModernizedCProgram.Curl_checkheaders(conn, "Accept-Encoding") && generatedSet.getStr()[dupstring.STRING_ENCODING]) {
			do {
				.Curl_cfree((generatedAccept_encoding));
				(generatedAccept_encoding) = ((Object)0);
			} while (0);
			generatedAllocptr.setAccept_encoding(ModernizedCProgram.curl_maprintf("Accept-Encoding: %s\r\n", generatedSet.getStr()[dupstring.STRING_ENCODING]));
			if (!generatedAccept_encoding) {
				return CURLE_OUT_OF_MEMORY;
			} 
		} else {
				do {
					.Curl_cfree((generatedAccept_encoding));
					(generatedAccept_encoding) = ((Object)0);
				} while (0);
				generatedAllocptr.setAccept_encoding(((Object)0/* we only consider transfer-encoding magic if libz support is built-in *//* When we are to insert a TE: header in the request, we must also insert
				       TE in a Connection: header, so we need to merge the custom provided
				       Connection: header and prevent the original to get sent. Note that if
				       the user has inserted his/hers own TE: header we don't do this magic
				       but then assume that the user will handle it all! */));
		} 
		Object generatedForm = http.getForm();
		switch (/* Create the (updated) Connection: header */httpreq) {
		case .HTTPREQ_POST_FORM:
				ModernizedCProgram.Curl_mime_cleanpart(generatedForm);
				result = ModernizedCProgram.Curl_getformdata(data, generatedForm, generatedSet.getHttppost(), generatedState.getFread_func());
				if (result) {
					return result;
				} 
				http.setSendit(generatedForm);
				break;
		case .HTTPREQ_POST_MIME:
				http.setSendit(generatedSet.getMimepost());
				break;
		default:
				http.setSendit(((Object)0));
		}
		Object generatedSendit = http.getSendit();
		if (generatedSendit) {
			byte cthdr = ModernizedCProgram.Curl_checkheaders(conn, "Content-Type");
			generatedSendit.getFlags() |=  (1 << /* Read and seek body only. */1);
			if (/* Prepare the mime structure headers & set content type. */cthdr) {
				for (cthdr += 13; cthdr == (byte)' '; cthdr++) {
					;
				}
			}  else if (generatedSendit.getKind() == mimekind.MIMEKIND_MULTIPART) {
				cthdr = "multipart/form-data";
			} 
			generatedSet.getHeaders().curl_mime_headers(generatedSendit, 0);
			result = ModernizedCProgram.Curl_mime_prepare_headers(generatedSendit, cthdr, ((Object)0), mimestrategy.MIMESTRATEGY_FORM);
			((Object)0).curl_mime_headers(generatedSendit, 0);
			if (!result) {
				result = ModernizedCProgram.Curl_mime_rewind(generatedSendit);
			} 
			if (result) {
				return result;
			} 
			http.setPostsize(ModernizedCProgram.Curl_mime_size(generatedSendit));
		} 
		ptr = ModernizedCProgram.Curl_checkheaders(conn, "Transfer-Encoding");
		Object generatedPostsize = http.getPostsize();
		Object generatedAuthneg = generatedBits.getAuthneg();
		if (ptr) {
			generatedReq.setUpload_chunky(ModernizedCProgram.Curl_compareheader(ptr, "Transfer-Encoding:", "chunked"));
		} else {
				if ((generatedHandler.getProtocol() & (CURLPROTO_HTTP | CURLPROTO_HTTPS)) && (((httpreq == .HTTPREQ_POST_MIME || httpreq == .HTTPREQ_POST_FORM) && generatedPostsize < 0) || ((generatedSet.getUpload() || httpreq == .HTTPREQ_POST) && generatedState.getInfilesize() == -1))) {
					if (generatedAuthneg) {
						;
					}  else if (ModernizedCProgram.use_http_1_1plus(data, conn)) {
						if (generatedHttpversion < 20) {
							generatedReq.setUpload_chunky(/* HTTP, upload, unknown file size and not HTTP 1.0 */1);
						} 
					} else {
							data.Curl_failf("Chunky upload is not supported by HTTP 1.0");
							return CURLE_UPLOAD_FAILED;
					} 
				} else {
						generatedReq.setUpload_chunky(/* else, no chunky upload */0);
				} 
				if (generatedReq.getUpload_chunky()) {
					te = "Transfer-Encoding: chunked\r\n";
				} 
		} 
		do {
			.Curl_cfree((generatedHost));
			(generatedHost) = ((Object)0);
		} while (0);
		ptr = ModernizedCProgram.Curl_checkheaders(conn, "Host");
		Byte generatedCookiehost = generatedAllocptr.getCookiehost();
		Object generatedGiven = this.getGiven();
		Object generatedIpv6_ip = generatedBits.getIpv6_ip();
		if (ptr && (!generatedState.getThis_is_a_follow() || ModernizedCProgram.Curl_strcasecompare(generatedState.getFirst_host(), generatedName))) {
			byte cookiehost = ModernizedCProgram.Curl_copy_header_value(ptr);
			if (!cookiehost) {
				return CURLE_OUT_OF_MEMORY;
			} 
			if (!cookiehost) {
				.Curl_cfree(/* ignore empty data */cookiehost);
			} else {
					if (cookiehost == /* If the host begins with '[', we start searching for the port after
					         the bracket has been closed */(byte)'[') {
						byte closingbracket;
						.memmove(cookiehost, cookiehost + 1, .strlen(cookiehost) - 1);
						closingbracket = .strchr(cookiehost, (byte)']');
						if (closingbracket) {
							closingbracket = 0;
						} 
					} else {
							int startsearch = 0;
							byte colon = .strchr(cookiehost + startsearch, (byte)':');
							if (colon) {
								colon = /* The host must not include an embedded port number */0;
							} 
					} 
					do {
						.Curl_cfree((generatedCookiehost));
						(generatedCookiehost) = ((Object)0);
					} while (0);
					generatedAllocptr.setCookiehost(cookiehost);
			} 
			if (.strcmp("Host:", ptr)) {
				generatedAllocptr.setHost(ModernizedCProgram.curl_maprintf("Host:%s\r\n", ptr[5]));
				if (!generatedHost) {
					return CURLE_OUT_OF_MEMORY;
				} 
			} else {
					generatedAllocptr.setHost(((Object)/* when clearing the header */0));
			} 
		} else {
				if (((generatedGiven.getProtocol() & /* When building Host: headers, we must put the host name within
				       [brackets] if the host name is a plain IPv6-address. RFC2732-style. */CURLPROTO_HTTPS) && (generatedRemote_port == 443)) || ((generatedGiven.getProtocol() & CURLPROTO_HTTP) && (generatedRemote_port == 80/* if(HTTPS on port 443) OR (HTTP on port 80) then don't include
				         the port number in the host string */))) {
					generatedAllocptr.setHost(ModernizedCProgram.curl_maprintf("Host: %s%s%s\r\n", generatedIpv6_ip ? "[" : "", host, generatedIpv6_ip ? "]" : ""));
				} else {
						generatedAllocptr.setHost(ModernizedCProgram.curl_maprintf("Host: %s%s%s:%d\r\n", generatedIpv6_ip ? "[" : "", host, generatedIpv6_ip ? "]" : "", generatedRemote_port));
				} 
				if (!generatedHost) {
					return /* without Host: we can't make a nice request */CURLE_OUT_OF_MEMORY;
				} 
		} 
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		Object generatedTunnel_proxy = generatedBits.getTunnel_proxy();
		Object generatedDispname = generatedHost.getDispname();
		Object generatedUser_passwd = generatedBits.getUser_passwd();
		Object generatedUserpwd_in_url = generatedBits.getUserpwd_in_url();
		if (generatedHttpproxy && !generatedTunnel_proxy) {
			 uc = new ();
			 h = .curl_url_dup(generatedState.getUh());
			if (!h) {
				return CURLE_OUT_OF_MEMORY;
			} 
			if (generatedDispname != generatedName) {
				uc = .curl_url_set(h, CURLUPART_HOST, generatedName, 0);
				if (uc) {
					.curl_url_cleanup(h);
					return CURLE_OUT_OF_MEMORY;
				} 
			} 
			uc = .curl_url_set(h, CURLUPART_FRAGMENT, ((Object)0), 0);
			if (uc) {
				.curl_url_cleanup(h);
				return CURLE_OUT_OF_MEMORY;
			} 
			if (ModernizedCProgram.Curl_strcasecompare("http", generatedState.getUp().getScheme())) {
				uc = .curl_url_set(h, CURLUPART_USER, ((Object)0), /* when getting HTTP, we don't want the userinfo the URL */0);
				if (uc) {
					.curl_url_cleanup(h);
					return CURLE_OUT_OF_MEMORY;
				} 
				uc = .curl_url_set(h, CURLUPART_PASSWORD, ((Object)0), 0);
				if (uc) {
					.curl_url_cleanup(h);
					return CURLE_OUT_OF_MEMORY;
				} 
			} 
			uc = .curl_url_get(h, CURLUPART_URL, generatedSet.getStr()[dupstring.STRING_TEMP_URL], /* Extract the the URL to use in the request. Store in STRING_TEMP_URL for
			       clean-up reasons if the function returns before the free() further
			       down. */0);
			if (uc) {
				.curl_url_cleanup(h);
				return CURLE_OUT_OF_MEMORY;
			} 
			.curl_url_cleanup(h);
			if (ModernizedCProgram.Curl_strcasecompare("ftp", generatedState.getUp().getScheme())) {
				if (generatedSet.getProxy_transfer_mode()) {
					byte type = .strstr(path, /* when doing ftp, append ;type=<a|i> if not present */";type=");
					if (type && type[6] && type[7] == 0) {
						switch (ModernizedCProgram.Curl_raw_toupper(type[6])) {
						case (byte)'I':
								break;
						case (byte)'A':
						case (byte)'D':
						default:
								type = ((Object)0);
						}
					} 
					if (!type) {
						byte p = ftp_typecode/* avoid sending invalid URLs like ftp://example.com;type=i if the
						           * user specified ftp://example.com without the slash */;
						if (!generatedState.getUp().getPath() && path[.strlen(path) - 1] != (byte)'/') {
							p++ = (byte)'/';
						} 
						ModernizedCProgram.curl_msnprintf(p,  - 1, ";type=%c", generatedSet.getPrefer_ascii() ? (byte)'a' : (byte)'i');
					} 
				} 
				if (generatedUser_passwd && !generatedUserpwd_in_url) {
					paste_ftp_userpwd = 1;
				} 
			} 
		} 
		http.setP_accept(ModernizedCProgram.Curl_checkheaders(conn, "Accept") ? ((Object)0) : /* CURL_DISABLE_PROXY */"Accept: */*\r\n");
		Object generatedSeek_func = this.getSeek_func();
		Object generatedSeek_client = this.getSeek_client();
		Byte generatedRangeline = generatedAllocptr.getRangeline();
		httpstring = ModernizedCProgram.get_http_string(data, conn);
		Curl_send_buffer curl_send_buffer = new Curl_send_buffer();
		req_buffer = curl_send_buffer.Curl_add_buffer_init();
		if (!req_buffer) {
			return CURLE_OUT_OF_MEMORY;
		} 
		result = req_buffer.Curl_add_bufferf("%s ", /* add the main request stuff *//* GET/HEAD/POST/PUT */request);
		if (result) {
			return result;
		} 
		if (generatedSet.getStr()[dupstring.STRING_TARGET]) {
			path = generatedSet.getStr()[dupstring.STRING_TARGET];
			query = ((Object)0);
		} 
		Byte generatedUser = this.getUser();
		Byte generatedPasswd = this.getPasswd();
		if (generatedHttpproxy && !generatedTunnel_proxy) {
			byte url = generatedSet.getStr()[dupstring.STRING_TEMP_URL];
			result = req_buffer.Curl_add_buffer(url, .strlen(url));
			do {
				.Curl_cfree((generatedSet.getStr()[dupstring.STRING_TEMP_URL]));
				(generatedSet.getStr()[dupstring.STRING_TEMP_URL]) = ((Object)0);
			} while (0);
		}  else if (paste_ftp_userpwd) {
			result = req_buffer.Curl_add_bufferf("ftp://%s:%s@%s", generatedUser, generatedPasswd, path +  - 1);
		} else {
				result = req_buffer.Curl_add_buffer(path, .strlen(path));
				if (result) {
					return result;
				} 
				if (query) {
					result = req_buffer.Curl_add_bufferf("?%s", query);
				} 
		} 
		if (result) {
			return result;
		} 
		Byte generatedProxyuserpwd = generatedAllocptr.getProxyuserpwd();
		Byte generatedUserpwd = generatedAllocptr.getUserpwd();
		Object generatedP_accept = http.getP_accept();
		Byte generatedTe = generatedAllocptr.getTe();
		result = req_buffer.Curl_add_bufferf(/* ftp typecode (;type=x) */"%s HTTP/%s\r\n%s%s%s%s%s%s%s%s%s%s%s%s"/* HTTP version *//* host *//* proxyuserpwd *//* userpwd *//* range *//* user agent *//* accept */, /* TE: *//* accept-encoding *//* referer *//* Proxy-Connection *//* transfer-encoding *//* Alt-Used */ftp_typecode, httpstring, (generatedHost ? generatedHost : ""), generatedProxyuserpwd ? generatedProxyuserpwd : "", generatedUserpwd ? generatedUserpwd : "", (generatedState.getUse_range() && generatedRangeline) ? generatedRangeline : "", (generatedSet.getStr()[dupstring.STRING_USERAGENT] && generatedSet.getStr()[dupstring.STRING_USERAGENT] && generatedUagent) ? generatedUagent : "", generatedP_accept ? generatedP_accept : "", generatedTe ? generatedTe : "", (generatedSet.getStr()[dupstring.STRING_ENCODING] && generatedSet.getStr()[dupstring.STRING_ENCODING] && generatedAccept_encoding) ? generatedAccept_encoding : "", (generatedChange.getReferer() && generatedRef) ? generatedRef : /* Referer: <data> */"", (generatedHttpproxy && !generatedTunnel_proxy && !ModernizedCProgram.Curl_checkProxyheaders(conn, "Proxy-Connection")) ? "Proxy-Connection: Keep-Alive\r\n" : "", te, altused ? altused : "");
		do {
			.Curl_cfree((generatedUserpwd));
			(generatedUserpwd) = ((Object)0);
		} while (/* clear userpwd and proxyuserpwd to avoid re-using old credentials
		   * from re-used connections */0);
		do {
			.Curl_cfree((generatedProxyuserpwd));
			(generatedProxyuserpwd) = ((Object)0);
		} while (0);
		.Curl_cfree(altused);
		if (result) {
			return result;
		} 
		if (!(generatedHandler.getFlags() & (1 << 0)) && generatedHttpversion != 20 && (generatedHttpversion == CURL_HTTP_VERSION_2/* append HTTP2 upgrade magic stuff to the HTTP request if it isn't done
		       over SSL */)) {
			result = CURLE_UNSUPPORTED_PROTOCOL;
			if (result) {
				return result;
			} 
		} 
		Object generatedCookies = data.getCookies();
		Cookie cookie = new Cookie();
		Byte generatedValue = co.getValue();
		Cookie generatedNext = co.getNext();
		if (generatedCookies || addcookies) {
			Cookie co = ((Object)/* no cookies from start */0);
			int count = 0;
			if (generatedCookies && generatedState.getCookie_engine()) {
				data.Curl_share_lock(CURL_LOCK_DATA_COOKIE, CURL_LOCK_ACCESS_SINGLE);
				co = cookie.Curl_cookie_getlist(generatedCookies, generatedCookiehost ? generatedCookiehost : host, generatedState.getUp().getPath(), (generatedHandler.getProtocol() & CURLPROTO_HTTPS) ? 1 : 0);
				data.Curl_share_unlock(CURL_LOCK_DATA_COOKIE);
			} 
			if (co) {
				Cookie store = co;
				while (/* now loop through all cookies that matched */co) {
					if (generatedValue) {
						if (0 == count) {
							result = req_buffer.Curl_add_bufferf("Cookie: ");
							if (result) {
								break;
							} 
						} 
						result = req_buffer.Curl_add_bufferf("%s%s=%s", count ? "; " : "", generatedName, generatedValue);
						if (result) {
							break;
						} 
						count++;
					} 
					co = generatedNext;
				}
				store.Curl_cookie_freelist();
			} 
			if (addcookies && !result) {
				if (!count) {
					result = req_buffer.Curl_add_bufferf("Cookie: ");
				} 
				if (!result) {
					result = req_buffer.Curl_add_bufferf("%s%s", count ? "; " : "", addcookies);
					count++;
				} 
			} 
			if (count && !result) {
				result = req_buffer.Curl_add_buffer("\r\n", 2);
			} 
			if (result) {
				return result;
			} 
		} 
		result = req_buffer.Curl_add_timecondition(conn);
		if (result) {
			return result;
		} 
		result = ModernizedCProgram.Curl_add_custom_headers(conn, 0, req_buffer);
		if (result) {
			return result;
		} 
		http.setPostdata(((Object)/* nothing to post at this point */0));
		data.Curl_pgrsSetUploadSize(-/* upload size is unknown atm */1/* If 'authdone' is FALSE, we must not set the write socket index to the
		     Curl_transfer() call below, as we're not ready to actually upload any
		     data yet. */);
		if (result) {
			return result;
		} 
		if ((generatedHttpversion == 20) && generatedReq.getUpload_chunky()) {
			generatedReq.setUpload_chunky(0);
		} 
		return result/* not enough data to tell yet *//* a status line was read */;
	}
	/***********************************************************************
	 *
	 * pop3_endofresp()
	 *
	 * Checks for an ending POP3 status code at the start of the given string, but
	 * also detects the APOP timestamp from the server greeting and various
	 * capabilities from the CAPA response including the supported authentication
	 * types and allowed SASL mechanisms.
	 */
	public  pop3_endofresp(Byte line, Object len, int resp) {
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		if (len >= 4 && !.memcmp("-ERR", line, /* Do we have an error response? */4)) {
			resp = (byte)'-';
			return 1;
		} 
		 generatedState = pop3c.getState();
		if (generatedState == /* Are we processing CAPA command responses? */.POP3_CAPA) {
			if (len >= 1 && line[0] == /* Do we have the terminating line? */(byte)'.') {
				resp = /* Treat the response as a success */(byte)'+';
			} else {
					resp = /* Treat the response as an untagged continuation */(byte)'*';
			} 
			return 1;
		} 
		if (len >= 3 && !.memcmp("+OK", line, /* Do we have a success response? */3)) {
			resp = (byte)'+';
			return 1;
		} 
		if (len >= 1 && line[0] == /* Do we have a continuation response? */(byte)'+') {
			resp = (byte)'*';
			return 1;
		} 
		return /* Nothing for us */0/***********************************************************************
		 *
		 * pop3_get_message()
		 *
		 * Gets the authentication message from the response buffer.
		 */;
	}
	public Object pop3_perform_capa() {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		SASL generatedSasl = pop3c.getSasl();
		generatedSasl.setAuthmechs(/* No known auth. mechanisms yet */0);
		generatedSasl.setAuthused(/* Clear the auth. mechanism used */0);
		pop3c.setTls_supported(/* Clear the TLS capability */0);
		pingpong generatedPp = pop3c.getPp();
		result = generatedPp.Curl_pp_sendf("%s", /* Send the CAPA command */"CAPA");
		if (!result) {
			ModernizedCProgram.state(conn, .POP3_CAPA);
		} 
		return result/***********************************************************************
		 *
		 * pop3_perform_starttls()
		 *
		 * Sends the STLS command to start the upgrade to TLS.
		 */;
	}
	public Object pop3_perform_starttls() {
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		 result = generatedPop3c.getPp().Curl_pp_sendf("%s", /* Send the STLS command */"STLS");
		if (!result) {
			ModernizedCProgram.state(conn, .POP3_STARTTLS);
		} 
		return result/***********************************************************************
		 *
		 * pop3_perform_upgrade_tls()
		 *
		 * Performs the upgrade to TLS.
		 */;
	}
	public Object pop3_perform_upgrade_tls() {
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		 generatedSsldone = pop3c.getSsldone();
		 result = .Curl_ssl_connect_nonblocking(conn, 0, generatedSsldone);
		 generatedState = pop3c.getState();
		if (!result) {
			if (generatedState != .POP3_UPGRADETLS) {
				ModernizedCProgram.state(conn, .POP3_UPGRADETLS);
			} 
			if (generatedSsldone) {
				do {
				} while (0);
				result = conn.pop3_perform_capa();
			} 
		} 
		return result/***********************************************************************
		 *
		 * pop3_perform_user()
		 *
		 * Sends a clear text USER command to authenticate with.
		 */;
	}
	public Object pop3_perform_user() {
		 result = CURLE_OK;
		ConnectBits generatedBits = this.getBits();
		Object generatedUser_passwd = generatedBits.getUser_passwd();
		if (!generatedUser_passwd) {
			ModernizedCProgram.state(conn, .POP3_STOP);
			return result;
		} 
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		Byte generatedUser = this.getUser();
		result = generatedPop3c.getPp().Curl_pp_sendf(/* Send the USER command */"USER %s", generatedUser ? generatedUser : "");
		if (!result) {
			ModernizedCProgram.state(conn, .POP3_USER);
		} 
		return result/***********************************************************************
		 *
		 * pop3_perform_apop()
		 *
		 * Sends an APOP command to authenticate with.
		 *//***********************************************************************
		 *
		 * pop3_perform_apop()
		 *
		 * Sends an APOP command to authenticate with.
		 */;
	}
	public Object pop3_perform_apop() {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		size_t i = new size_t();
		MD5_context ctxt = new MD5_context();
		byte[] digest = new byte[16];
		byte[] secret = new byte[2 * 16 + 1];
		ConnectBits generatedBits = this.getBits();
		Object generatedUser_passwd = generatedBits.getUser_passwd();
		if (!generatedUser_passwd) {
			ModernizedCProgram.state(conn, .POP3_STOP);
			return result;
		} 
		ctxt = ModernizedCProgram.Curl_MD5_init(/* Create the digest */ModernizedCProgram.Curl_DIGEST_MD5);
		if (!ctxt) {
			return CURLE_OUT_OF_MEMORY;
		} 
		Byte generatedApoptimestamp = pop3c.getApoptimestamp();
		ctxt.Curl_MD5_update((byte)generatedApoptimestamp, ModernizedCProgram.curlx_uztoui(.strlen(generatedApoptimestamp)));
		Byte generatedPasswd = this.getPasswd();
		ctxt.Curl_MD5_update((byte)generatedPasswd, ModernizedCProgram.curlx_uztoui(.strlen(generatedPasswd)));
		ctxt.Curl_MD5_final(/* Finalise the digest */digest);
		for (i = 0; i < 16; /* Convert the calculated 16 octet digest into a 32 byte hex string */i++) {
			ModernizedCProgram.curl_msnprintf(secret[2 * i], 3, "%02x", digest[i]);
		}
		pingpong generatedPp = pop3c.getPp();
		Byte generatedUser = this.getUser();
		result = generatedPp.Curl_pp_sendf("APOP %s %s", generatedUser, secret);
		if (!result) {
			ModernizedCProgram.state(conn, .POP3_APOP);
		} 
		return result/***********************************************************************
		 *
		 * pop3_perform_auth()
		 *
		 * Sends an AUTH command allowing the client to login with the given SASL
		 * authentication mechanism.
		 */;
	}
	public Object pop3_perform_auth(Object mech, Object initresp) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		pingpong generatedPp = pop3c.getPp();
		if (/* AUTH <mech> ...<crlf> */initresp) {
			result = generatedPp.Curl_pp_sendf("AUTH %s %s", mech, /* Send the AUTH command with the initial response */initresp);
		} else {
				result = generatedPp.Curl_pp_sendf("AUTH %s", /* Send the AUTH command */mech);
		} 
		return result/***********************************************************************
		 *
		 * pop3_continue_auth()
		 *
		 * Sends SASL continuation data or cancellation.
		 */;
	}
	public Object pop3_continue_auth(Object resp) {
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		pingpong generatedPp = pop3c.getPp();
		return generatedPp.Curl_pp_sendf("%s", resp/***********************************************************************
		 *
		 * pop3_perform_authentication()
		 *
		 * Initiates the authentication sequence, with the appropriate SASL
		 * authentication mechanism, falling back to APOP and clear text should a
		 * common mechanism not be available between the client and server.
		 */);
	}
	public Object pop3_perform_authentication() {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		saslprogress progress = .SASL_IDLE;
		SASL generatedSasl = pop3c.getSasl();
		if (!ModernizedCProgram.Curl_sasl_can_authenticate(generatedSasl, /* Check we have enough data to authenticate with and end the
		     connect phase if we don't */conn)) {
			ModernizedCProgram.state(conn, .POP3_STOP);
			return result;
		} 
		int generatedAuthtypes = pop3c.getAuthtypes();
		int generatedPreftype = pop3c.getPreftype();
		if (generatedAuthtypes & generatedPreftype & (1 << 2)) {
			result = ModernizedCProgram.Curl_sasl_start(generatedSasl, conn, 0, /* Calculate the SASL login details */progress);
			if (!result) {
				if (progress == .SASL_INPROGRESS) {
					ModernizedCProgram.state(conn, .POP3_AUTH);
				} 
			} 
		} 
		Curl_easy generatedData = this.getData();
		if (!result && progress == .SASL_IDLE) {
			if (generatedAuthtypes & generatedPreftype & (1 << 1)) {
				result = /* Perform APOP authentication */conn.pop3_perform_apop();
			}  else if (generatedAuthtypes & generatedPreftype & (1 << 0)) {
				result = /* Perform clear text authentication */conn.pop3_perform_user();
			} else {
					generatedData.Curl_infof(/* Other mechanisms not supported */"No known authentication mechanisms supported!\n");
					result = CURLE_LOGIN_DENIED;
			} 
		} 
		return result/***********************************************************************
		 *
		 * pop3_perform_command()
		 *
		 * Sends a POP3 based command.
		 */;
	}
	public Object pop3_perform_command() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		POP3 pop3 = generatedReq.getProtop();
		byte command = ((Object)0);
		Byte generatedId = pop3.getId();
		Object generatedSet = generatedData.getSet();
		if (generatedId[0] == (byte)'\0' || generatedSet.getFtp_list_only()) {
			command = "LIST";
			if (generatedId[0] != (byte)'\0') {
				pop3.setTransfer(/* Message specific LIST so skip the BODY transfer */.FTPTRANSFER_INFO);
			} 
		} else {
				command = "RETR";
		} 
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		Byte generatedCustom = pop3.getCustom();
		if (generatedId[0] != /* Send the command */(byte)'\0') {
			result = generatedPop3c.getPp().Curl_pp_sendf("%s %s", (generatedCustom && generatedCustom[0] != (byte)'\0' ? generatedCustom : command), generatedId);
		} else {
				result = generatedPop3c.getPp().Curl_pp_sendf("%s", (generatedCustom && generatedCustom[0] != (byte)'\0' ? generatedCustom : command));
		} 
		if (!result) {
			ModernizedCProgram.state(conn, .POP3_COMMAND);
		} 
		return result/***********************************************************************
		 *
		 * pop3_perform_quit()
		 *
		 * Performs the quit action prior to sclose() be called.
		 */;
	}
	public Object pop3_perform_quit() {
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		 result = generatedPop3c.getPp().Curl_pp_sendf("%s", /* Send the QUIT command */"QUIT");
		if (!result) {
			ModernizedCProgram.state(conn, .POP3_QUIT);
		} 
		return result;
	}
	/* For the initial server greeting */
	public Object pop3_state_servergreet_resp(int pop3code,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		Object generatedState = data.getState();
		byte line = generatedState.getBuffer();
		size_t len = .strlen(line);
		(Object)/* no use for this yet */instate;
		Byte generatedApoptimestamp = pop3c.getApoptimestamp();
		int generatedAuthtypes = pop3c.getAuthtypes();
		if (pop3code != (byte)'+') {
			data.Curl_failf("Got unexpected pop3-server response");
			result = CURLE_WEIRD_SERVER_REPLY;
		} else {
				if (len >= 4 && line[len - 2] == /* Does the server support APOP authentication? */(byte)'>'/* Look for the APOP timestamp */) {
					size_t i = new size_t();
					for (i = 3; i < len - 2; ++i) {
						if (line[i] == (byte)'<') {
							size_t timestamplen = len - 1 - /* Calculate the length of the timestamp */i;
							byte at;
							if (!timestamplen) {
								break;
							} 
							pop3c.setApoptimestamp((byte).Curl_ccalloc(1, timestamplen + /* Allocate some memory for the timestamp */1));
							if (!generatedApoptimestamp) {
								break;
							} 
							.memcpy(generatedApoptimestamp, line + i, /* Copy the timestamp */timestamplen);
							generatedApoptimestamp[timestamplen] = (byte)'\0'/* If the timestamp does not contain '@' it is not (as required by
							             RFC-1939) conformant to the RFC-822 message id syntax, and we
							             therefore do not use APOP authentication. */;
							at = .strchr(generatedApoptimestamp, (byte)'@');
							if (!at) {
								do {
									.Curl_cfree((generatedApoptimestamp));
									(generatedApoptimestamp) = ((Object)0);
								} while (0);
							} else {
									generatedAuthtypes |=  (1 << /* Store the APOP capability */1);
							} 
							break;
						} 
					}
				} 
				result = conn.pop3_perform_capa();
		} 
		return result;
	}
	/* For CAPA responses */
	public Object pop3_state_capa_resp(int pop3code,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		Object generatedState = data.getState();
		byte line = generatedState.getBuffer();
		size_t len = .strlen(line);
		(Object)/* no use for this yet */instate;
		int generatedAuthtypes = pop3c.getAuthtypes();
		SASL generatedSasl = pop3c.getSasl();
		int generatedAuthmechs = generatedSasl.getAuthmechs();
		Object generatedSet = data.getSet();
		Object generatedSsl = this.getSsl();
		 generatedTls_supported = pop3c.getTls_supported();
		if (pop3code == /* Do we have a untagged continuation response? */(byte)'*') {
			if (len >= 4 && !.memcmp(line, "STLS", /* Does the server support the STLS capability? */4)) {
				pop3c.setTls_supported(1);
			}  else if (len >= 4 && !.memcmp(line, "USER", /* Does the server support clear text authentication? */4)) {
				generatedAuthtypes |=  (1 << 0);
			}  else if (len >= 5 && !.memcmp(line, "SASL ", /* Does the server support SASL based authentication? */5)) {
				generatedAuthtypes |=  (1 << 2);
				line += /* Advance past the SASL keyword */5;
				len -= 5;
				for (; ; ) {
					size_t llen = new size_t();
					size_t wordlen = new size_t();
					int mechbit;
					while (len && (line == (byte)' ' || line == (byte)'\t' || line == (byte)'\r' || line == (byte)'\n')) {
						line++;
						len--;
					}
					if (!len) {
						break;
					} 
					for (wordlen = 0; wordlen < len && line[wordlen] != /* Extract the word */(byte)' ' && line[wordlen] != (byte)'\t' && line[wordlen] != (byte)'\r' && line[wordlen] != (byte)'\n'; ) {
						wordlen++;
					}
					mechbit = ModernizedCProgram.Curl_sasl_decode_mech(line, wordlen, /* Test the word for a matching authentication mechanism */llen);
					if (mechbit && llen == wordlen) {
						generatedAuthmechs |=  mechbit;
					} 
					line += wordlen;
					len -= wordlen;
				}
			} 
		}  else if (pop3code == (byte)'+') {
			if (generatedSet.getUse_ssl() && !generatedSsl[0].getUse()) {
				if (generatedTls_supported) {
					result = /* Switch to TLS connection now */conn.pop3_perform_starttls();
				}  else if (generatedSet.getUse_ssl() == CURLUSESSL_TRY) {
					result = /* Fallback and carry on with authentication */conn.pop3_perform_authentication();
				} else {
						data.Curl_failf("STLS not supported.");
						result = CURLE_USE_SSL_FAILED;
				} 
			} else {
					result = conn.pop3_perform_authentication();
			} 
		} else {
				generatedAuthtypes |=  (1 << /* Clear text is supported when CAPA isn't recognised */0);
				result = conn.pop3_perform_authentication();
		} 
		return result;
	}
	/* For STARTTLS responses */
	public Object pop3_state_starttls_resp(int pop3code,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		(Object)/* no use for this yet */instate;
		Object generatedSet = data.getSet();
		if (pop3code != (byte)'+') {
			if (generatedSet.getUse_ssl() != CURLUSESSL_TRY) {
				data.Curl_failf("STARTTLS denied");
				result = CURLE_USE_SSL_FAILED;
			} else {
					result = conn.pop3_perform_authentication();
			} 
		} else {
				result = conn.pop3_perform_upgrade_tls();
		} 
		return result;
	}
	/* For SASL authentication responses */
	public Object pop3_state_auth_resp(int pop3code,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		saslprogress progress = new saslprogress();
		(Object)/* no use for this yet */instate;
		SASL generatedSasl = pop3c.getSasl();
		result = ModernizedCProgram.Curl_sasl_continue(generatedSasl, conn, pop3code, progress);
		int generatedAuthtypes = pop3c.getAuthtypes();
		int generatedPreftype = pop3c.getPreftype();
		if (!result) {
			switch (progress) {
			case .SASL_DONE:
					ModernizedCProgram.state(conn, /* Authenticated */.POP3_STOP);
					break;
			case /* No mechanism left after cancellation */.SASL_IDLE:
					if (generatedAuthtypes & generatedPreftype & (1 << 1)) {
						result = /* Perform APOP authentication */conn.pop3_perform_apop();
					}  else if (generatedAuthtypes & generatedPreftype & (1 << 0)) {
						result = /* Perform clear text authentication */conn.pop3_perform_user();
					} else {
							data.Curl_failf("Authentication cancelled");
							result = CURLE_LOGIN_DENIED;
					} 
					break;
			default:
					break;
			}
		} 
		return result;
	}
	/* For APOP responses */
	/* For APOP responses */
	public Object pop3_state_apop_resp(int pop3code,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		(Object)/* no use for this yet */instate;
		if (pop3code != (byte)'+') {
			data.Curl_failf("Authentication failed: %d", pop3code);
			result = CURLE_LOGIN_DENIED;
		} else {
				ModernizedCProgram.state(conn, /* End of connect phase */.POP3_STOP);
		} 
		return result;
	}
	/* For USER responses */
	public Object pop3_state_user_resp(int pop3code,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		(Object)/* no use for this yet */instate;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		Byte generatedPasswd = this.getPasswd();
		if (pop3code != (byte)'+') {
			data.Curl_failf("Access denied. %c", pop3code);
			result = CURLE_LOGIN_DENIED;
		} else {
				result = generatedPop3c.getPp().Curl_pp_sendf(/* Send the PASS command */"PASS %s", generatedPasswd ? generatedPasswd : "");
		} 
		if (!result) {
			ModernizedCProgram.state(conn, .POP3_PASS);
		} 
		return result;
	}
	/* For PASS responses */
	public Object pop3_state_pass_resp(int pop3code,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		(Object)/* no use for this yet */instate;
		if (pop3code != (byte)'+') {
			data.Curl_failf("Access denied. %c", pop3code);
			result = CURLE_LOGIN_DENIED;
		} else {
				ModernizedCProgram.state(conn, /* End of connect phase */.POP3_STOP);
		} 
		return result;
	}
	/* For command responses */
	public Object pop3_state_command_resp(int pop3code,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		POP3 pop3 = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		pingpong generatedPp = pop3c.getPp();
		pingpong pp = generatedPp;
		(Object)/* no use for this yet */instate;
		if (pop3code != (byte)'+') {
			ModernizedCProgram.state(conn, .POP3_STOP);
			return CURLE_RECV_ERROR/* This 'OK' line ends with a CR LF pair which is the two first bytes of the
			     EOB string so count this is two matching bytes. This is necessary to make
			     the code detect the EOB if the only data than comes now is %2e CR LF like
			     when there is no body to return. */;
		} 
		pop3c.setEob(2);
		pop3c.setStrip(/* But since this initial CR LF pair is not part of the actual body, we set
		     the strip counter here so that these bytes won't be delivered. */2);
		 generatedTransfer = pop3.getTransfer();
		Byte generatedCache = pp.getCache();
		Object generatedSet = data.getSet();
		Object generatedCache_size = pp.getCache_size();
		if (generatedTransfer == .FTPTRANSFER_BODY) {
			data.Curl_setup_transfer(0, -1, 0, -/* POP3 download */1);
			if (generatedCache) {
				if (!generatedSet.getOpt_no_body()) {
					result = conn.Curl_pop3_write(generatedCache, generatedCache_size);
					if (result) {
						return result;
					} 
				} 
				do {
					.Curl_cfree((generatedCache));
					(generatedCache) = ((Object)0);
				} while (/* Free the cache */0);
				pp.setCache_size(/* Reset the cache size */0);
			} 
		} 
		ModernizedCProgram.state(conn, /* End of DO phase */.POP3_STOP);
		return result;
	}
	public Object pop3_statemach_act() {
		 result = CURLE_OK;
		Object generatedSock = this.getSock();
		 sock = generatedSock[0];
		int pop3code;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		pingpong generatedPp = pop3c.getPp();
		pingpong pp = generatedPp;
		size_t nread = 0;
		 generatedState = pop3c.getState();
		if (generatedState == /* Busy upgrading the connection; right now all I/O is SSL/TLS, not POP3 */.POP3_UPGRADETLS) {
			return conn.pop3_perform_upgrade_tls();
		} 
		Object generatedSendleft = pp.getSendleft();
		if (generatedSendleft) {
			return pp.Curl_pp_flushsend();
		} 
		do {
			result = pp.Curl_pp_readresp(sock, pop3code, /* Read the response from the server */nread);
			if (result) {
				return result;
			} 
			if (!pop3code) {
				break;
			} 
			switch (generatedState) {
			case .POP3_SERVERGREET:
					result = conn.pop3_state_servergreet_resp(pop3code, generatedState);
					break;
			case .POP3_AUTH:
					result = conn.pop3_state_auth_resp(pop3code, generatedState);
					break;
			case .POP3_APOP:
					result = conn.pop3_state_apop_resp(pop3code, generatedState);
					break;
			case .POP3_CAPA:
					result = conn.pop3_state_capa_resp(pop3code, generatedState);
					break;
			case .POP3_USER:
					result = conn.pop3_state_user_resp(pop3code, generatedState);
					break;
			case .POP3_STARTTLS:
					result = conn.pop3_state_starttls_resp(pop3code, generatedState);
					break;
			case .POP3_COMMAND:
					result = conn.pop3_state_command_resp(pop3code, generatedState);
					break;
			case .POP3_QUIT/* fallthrough, just stop! */:
			case .POP3_PASS:
					result = conn.pop3_state_pass_resp(pop3code, generatedState);
					break;
			default:
					ModernizedCProgram.state(conn, /* internal error */.POP3_STOP);
					break;
			}
		} while (!result && generatedState != .POP3_STOP && pp.Curl_pp_moredata());
		return result;
	}
	/* Called repeatedly until done from multi.c */
	public Object pop3_multi_statemach( done) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		Object generatedHandler = this.getHandler();
		 generatedSsldone = pop3c.getSsldone();
		if ((generatedHandler.getFlags() & (1 << 0)) && !generatedSsldone) {
			result = .Curl_ssl_connect_nonblocking(conn, 0, generatedSsldone);
			if (result || !generatedSsldone) {
				return result;
			} 
		} 
		pingpong generatedPp = pop3c.getPp();
		result = generatedPp.Curl_pp_statemach(0, 0);
		 generatedState = pop3c.getState();
		done = (generatedState == .POP3_STOP) ? 1 : 0;
		return result;
	}
	public Object pop3_block_statemach( disconnecting) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		 generatedState = pop3c.getState();
		pingpong generatedPp = pop3c.getPp();
		while (generatedState != .POP3_STOP && !result) {
			result = generatedPp.Curl_pp_statemach(1, disconnecting);
		}
		return result;
	}
	/* Allocate and initialize the POP3 struct for the current Curl_easy if
	   required */
	public Object pop3_init() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		POP3 pop3 = new POP3();
		Object generatedReq = data.getReq();
		pop3 = generatedReq.setProtop(.Curl_ccalloc(, 1));
		if (!pop3) {
			result = CURLE_OUT_OF_MEMORY;
		} 
		return result;
	}
	/* For the POP3 "protocol connect" and "doing" phases only */
	public int pop3_getsock(Object socks) {
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		return generatedPop3c.getPp().Curl_pp_getsock(socks/***********************************************************************
		 *
		 * pop3_connect()
		 *
		 * This function should do everything that is to be considered a part of the
		 * connection phase.
		 *
		 * The variable 'done' points to will be TRUE if the protocol-layer connect
		 * phase is done when this function returns, or FALSE if not.
		 */);
	}
	public Object pop3_connect( done) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		pingpong generatedPp = pop3c.getPp();
		pingpong pp = generatedPp;
		done = /* default to not done yet */0;
		conn.Curl_conncontrol(/* We always support persistent connections in POP3 */0);
		pp.setResponse_time((120 * /* Set the default response time-out */1000));
		pp.setStatemach_act(pop3_statemach_act);
		pp.setEndofresp(pop3_endofresp);
		pp.setConn(conn);
		pop3c.setPreftype(~/* Set the default preferred authentication type and mechanism */-1024);
		SASL generatedSasl = pop3c.getSasl();
		generatedSasl.Curl_sasl_init(ModernizedCProgram.saslpop3);
		/* Initialise the pingpong layer */pp.Curl_pp_init();
		result = /* Parse the URL options */conn.pop3_parse_url_options();
		if (result) {
			return result;
		} 
		ModernizedCProgram.state(conn, /* Start off waiting for the server greeting response */.POP3_SERVERGREET);
		result = conn.pop3_multi_statemach(done);
		return result/***********************************************************************
		 *
		 * pop3_done()
		 *
		 * The DONE function. This does what needs to be done after a single DO has
		 * performed.
		 *
		 * Input argument is already checked for validity.
		 */;
	}
	public Object pop3_done(Object status,  premature) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		POP3 pop3 = generatedReq.getProtop();
		(Object)premature;
		if (!pop3) {
			return CURLE_OK;
		} 
		if (status) {
			conn.Curl_conncontrol(1);
			result = /* use the already set error code */status;
		} 
		Byte generatedId = pop3.getId();
		do {
			.Curl_cfree((generatedId));
			(generatedId) = ((Object)0);
		} while (/* Cleanup our per-request based variables */0);
		Byte generatedCustom = pop3.getCustom();
		do {
			.Curl_cfree((generatedCustom));
			(generatedCustom) = ((Object)0);
		} while (0);
		pop3.setTransfer(/* Clear the transfer mode for the next request */.FTPTRANSFER_BODY);
		return result/***********************************************************************
		 *
		 * pop3_perform()
		 *
		 * This is the actual DO function for POP3. Get a message/listing according to
		 * the options previously setup.
		 */;
	}
	public Object pop3_perform( connected,  dophase_done) {
		 result = /* This is POP3 and no proxy */CURLE_OK;
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		POP3 pop3 = generatedReq.getProtop();
		do {
		} while (0);
		Object generatedSet = generatedData.getSet();
		if (generatedSet.getOpt_no_body()) {
			pop3.setTransfer(/* Requested no body means no transfer */.FTPTRANSFER_INFO);
		} 
		dophase_done = /* not done yet */0;
		result = /* Start the first command in the DO phase */conn.pop3_perform_command();
		if (result) {
			return result;
		} 
		result = conn.pop3_multi_statemach(/* Run the state-machine */dophase_done);
		ConnectBits generatedBits = this.getBits();
		Object generatedTcpconnect = generatedBits.getTcpconnect();
		connected = generatedTcpconnect[0];
		if (dophase_done) {
			do {
			} while (0);
		} 
		return result/***********************************************************************
		 *
		 * pop3_do()
		 *
		 * This function is registered as 'curl_do' function. It decodes the path
		 * parts etc as a wrapper to the actual DO function (pop3_perform).
		 *
		 * The input argument is already checked for validity.
		 */;
	}
	public Object pop3_do( done) {
		 result = CURLE_OK;
		done = /* default to false */0;
		result = /* Parse the URL path */conn.pop3_parse_url_path();
		if (result) {
			return result;
		} 
		result = /* Parse the custom request */conn.pop3_parse_custom_request();
		if (result) {
			return result;
		} 
		result = conn.pop3_regular_transfer(done);
		return result/***********************************************************************
		 *
		 * pop3_disconnect()
		 *
		 * Disconnect from an POP3 server. Cleanup protocol-specific per-connection
		 * resources. BLOCKING.
		 */;
	}
	public Object pop3_disconnect( dead_connection) {
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		pingpong generatedPp = pop3c.getPp();
		connectdata generatedConn = generatedPp.getConn();
		ConnectBits generatedBits = generatedConn.getBits();
		Object generatedProtoconnstart = generatedBits.getProtoconnstart();
		if (!dead_connection && generatedConn && generatedProtoconnstart) {
			if (!conn.pop3_perform_quit()) {
				(Object)conn.pop3_block_statemach(/* ignore errors on QUIT */1);
			} 
		} 
		generatedPp.Curl_pp_disconnect();
		SASL generatedSasl = pop3c.getSasl();
		int generatedAuthused = generatedSasl.getAuthused();
		conn.Curl_sasl_cleanup(generatedAuthused);
		Byte generatedApoptimestamp = pop3c.getApoptimestamp();
		do {
			.Curl_cfree((generatedApoptimestamp));
			(generatedApoptimestamp) = ((Object)0);
		} while (/* Cleanup our connection based variables */0);
		return CURLE_OK;
	}
	/* Call this when the DO phase has completed */
	public Object pop3_dophase_done( connected) {
		(Object)conn;
		(Object)connected;
		return CURLE_OK;
	}
	/* Called from multi.c while DOing */
	public Object pop3_doing( dophase_done) {
		 result = conn.pop3_multi_statemach(dophase_done);
		if (result) {
			do {
			} while (0);
		}  else if (dophase_done) {
			result = conn.pop3_dophase_done(/* not connected */0);
			do {
			} while (0);
		} 
		return result/***********************************************************************
		 *
		 * pop3_regular_transfer()
		 *
		 * The input argument is already checked for validity.
		 *
		 * Performs all commands done before a regular transfer between a local and a
		 * remote host.
		 */;
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
	 * RFC1734 POP3 Authentication
	 * RFC1939 POP3 protocol
	 * RFC2195 CRAM-MD5 authentication
	 * RFC2384 POP URL Scheme
	 * RFC2449 POP3 Extension Mechanism
	 * RFC2595 Using TLS with IMAP, POP3 and ACAP
	 * RFC2831 DIGEST-MD5 authentication
	 * RFC4422 Simple Authentication and Security Layer (SASL)
	 * RFC4616 PLAIN authentication
	 * RFC4752 The Kerberos V5 ("GSSAPI") SASL Mechanism
	 * RFC5034 POP3 SASL Authentication Mechanism
	 * RFC6749 OAuth 2.0 Authorization Framework
	 * RFC8314 Use of TLS for Email Submission and Access
	 * Draft   LOGIN SASL Mechanism <draft-murchison-sasl-login-00.txt>
	 *
	 ***************************************************************************/
	/* for HTTP proxy tunnel stuff */
	/* The last 3 #include files should be in this order */
	/* Local API functions */
	public Object pop3_regular_transfer( dophase_done) {
		 result = CURLE_OK;
		bool connected = 0;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		generatedReq.setSize(-/* Make sure size is unknown at this point */1);
		data.Curl_pgrsSetUploadCounter(/* Set the progress data */0);
		data.Curl_pgrsSetDownloadCounter(0);
		data.Curl_pgrsSetUploadSize(-1);
		data.Curl_pgrsSetDownloadSize(-1);
		result = conn.pop3_perform(connected, /* Carry out the perform */dophase_done);
		if (!result && /* Perform post DO phase operations if necessary */dophase_done) {
			result = conn.pop3_dophase_done(connected);
		} 
		return result;
	}
	public Object pop3_setup_connection() {
		 result = /* Initialise the POP3 layer */conn.pop3_init();
		if (result) {
			return result;
		} 
		this.setTls_upgraded(/* Clear the TLS upgraded flag */0);
		return CURLE_OK/***********************************************************************
		 *
		 * pop3_parse_url_options()
		 *
		 * Parse the URL login options.
		 */;
	}
	public Object pop3_parse_url_options() {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		Byte generatedOptions = this.getOptions();
		byte ptr = generatedOptions;
		SASL generatedSasl = pop3c.getSasl();
		generatedSasl.setResetprefs(1);
		while (!result && ptr && ptr) {
			byte key = ptr;
			byte value;
			while (ptr && ptr != (byte)'=') {
				ptr++;
			}
			value = ptr + 1;
			while (ptr && ptr != (byte)';') {
				ptr++;
			}
			if (ModernizedCProgram.Curl_strncasecompare(key, "AUTH=", 5)) {
				result = generatedSasl.Curl_sasl_parse_url_auth_option(value, ptr - value);
				if (result && ModernizedCProgram.Curl_strncasecompare(value, "+APOP", ptr - value)) {
					pop3c.setPreftype((1 << 1));
					generatedSasl.setPrefmech(0);
					result = CURLE_OK;
				} 
			} else {
					result = CURLE_URL_MALFORMAT;
			} 
			if (ptr == (byte)';') {
				ptr++;
			} 
		}
		int generatedPreftype = pop3c.getPreftype();
		int generatedPrefmech = generatedSasl.getPrefmech();
		if (generatedPreftype != (1 << 1)) {
			switch (generatedPrefmech) {
			case (~-1024 & ~(1 << 5)):
					pop3c.setPreftype(~-1024);
					break;
			case 0:
					pop3c.setPreftype(0);
					break;
			default:
					pop3c.setPreftype((1 << 2));
					break;
			}
		} 
		return result/***********************************************************************
		 *
		 * pop3_parse_url_path()
		 *
		 * Parse the URL path into separate path components.
		 */;
	}
	public Object pop3_parse_url_path() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		POP3 pop3 = generatedReq.getProtop();
		Object generatedState = data.getState();
		byte path = generatedState.getUp().getPath()[/* skip leading path */1];
		Byte generatedId = pop3.getId();
		return data.Curl_urldecode(path, 0, generatedId, ((Object)0), /* URL decode the path for the message ID */1/***********************************************************************
		 *
		 * pop3_parse_custom_request()
		 *
		 * Parse the custom request.
		 */);
	}
	public Object pop3_parse_custom_request() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		POP3 pop3 = generatedReq.getProtop();
		Object generatedSet = data.getSet();
		byte custom = generatedSet.getStr()[dupstring.STRING_CUSTOMREQUEST];
		Byte generatedCustom = pop3.getCustom();
		if (/* URL decode the custom request */custom) {
			result = data.Curl_urldecode(custom, 0, generatedCustom, ((Object)0), 1);
		} 
		return result/***********************************************************************
		 *
		 * Curl_pop3_write()
		 *
		 * This function scans the body after the end-of-body and writes everything
		 * until the end is found.
		 */;
	}
	public Object Curl_pop3_write(Byte str, Object nread) {
		 result = /* This code could be made into a special function in the handler struct */CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		SingleRequest k = generatedReq;
		 generatedProto = this.getProto();
		Object generatedPop3c = generatedProto.getPop3c();
		pop3_conn pop3c = generatedPop3c;
		bool strip_dot = 0;
		size_t last = 0;
		size_t i = new size_t();
		/* Search through the buffer looking for the end-of-body marker which is
		     5 bytes (0d 0a 2e 0d 0a). Note that a line starting with a dot matches
		     the eob so the server will have prefixed it with an extra dot which we
		     need to strip out. Additionally the marker could of course be spread out
		     over 5 different data chunks. */
		Object generatedEob = pop3c.getEob();
		Object generatedStrip = pop3c.getStrip();
		for (i = 0; i < nread; i++) {
			size_t prev = generatedEob;
			switch (str[i]) {
			case -1024:
					if (generatedEob == 0) {
						generatedEob++;
						if (i) {
							result = conn.Curl_client_write((1 << 0), str[/* Write out the body part that didn't match */last], i - last);
							if (result) {
								return result;
							} 
							last = i;
						} 
					}  else if (generatedEob == 3) {
						generatedEob++;
					} else {
							pop3c.setEob(/* If the character match wasn't at position 0 or 3 then restart the
							           pattern matching */1);
					} 
					break;
			case -1024:
					if (generatedEob == 2) {
						generatedEob++;
					}  else if (generatedEob == 3) {
						strip_dot = /* We have an extra dot after the CRLF which we need to strip off */1;
						pop3c.setEob(0);
					} else {
							pop3c.setEob(/* If the character match wasn't at position 2 then start the search
							           again */0);
					} 
					break;
			case -1024:
					if (generatedEob == 1 || generatedEob == 4) {
						generatedEob++;
					} else {
							pop3c.setEob(/* If the character match wasn't at position 1 or 4 then start the
							           search again */0);
					} 
					break;
			default:
					pop3c.setEob(0);
					break;
			}
			if (prev && prev >= generatedEob) {
				while (prev && generatedStrip) {
					prev--;
					generatedStrip--;
				}
				if (prev/* If the partial match was the CRLF and dot then only write the CRLF
				           as the server would have inserted the dot */) {
					result = conn.Curl_client_write((1 << 0), (byte)"\x0d\x0a\x2e\x0d\x0a", strip_dot ? prev - 1 : prev);
					if (result) {
						return result;
					} 
					last = i;
					strip_dot = 0;
				} 
			} 
		}
		int generatedKeepon = k.getKeepon();
		if (generatedEob == 5/* We have a full match so the transfer is done, however we must transfer
		    the CRLF at the start of the EOB as this is considered to be part of the
		    message as per RFC-1939, sect. 3 */) {
			result = conn.Curl_client_write((1 << 0), (byte)"\x0d\x0a\x2e\x0d\x0a", 2);
			generatedKeepon &=  ~(1 << 0);
			pop3c.setEob(0);
			return result;
		} 
		if (generatedEob) {
			return /* While EOB is matching nothing should be output */CURLE_OK;
		} 
		if (nread - last) {
			result = conn.Curl_client_write((1 << 0), str[last], nread - last);
		} 
		return result/* CURL_DISABLE_POP3 */;
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
	/* The last 3 #include files should be in this order */
	/*
	 * Helper read-from-socket functions. Does the same as Curl_read() but it
	 * blocks until all bytes amount of buffersize will be read. No more, no less.
	 *
	 * This is STUPID BLOCKING behaviour which we frown upon, but right now this
	 * is what we have...
	 */
	/* connection data */
	public int Curl_blockread_all(Object sockfd, Byte buf, Object buffersize, Object n) {
		ssize_t nread = /* max amount to read *//* amount bytes read */0;
		ssize_t allread = 0;
		int result;
		n = 0;
		Curl_easy generatedData = this.getData();
		for (; ; ) {
			timediff_t timeleft = ModernizedCProgram.Curl_timeleft(generatedData, ((Object)0), 1);
			if (timeleft < 0) {
				result = /* we already got the timeout */CURLE_OPERATION_TIMEDOUT;
				break;
			} 
			if (ModernizedCProgram.Curl_socket_check(sockfd, CURL_SOCKET_BAD, CURL_SOCKET_BAD, (time_t)timeleft) <= 0) {
				result = ~CURLE_OK;
				break;
			} 
			result = ModernizedCProgram.Curl_read_plain(sockfd, buf, buffersize, nread);
			if (CURLE_AGAIN == result) {
				continue;
			} 
			if (result) {
				break;
			} 
			if (buffersize == nread) {
				allread += nread;
				n = allread;
				result = CURLE_OK;
				break;
			} 
			if (!nread) {
				result = ~CURLE_OK;
				break;
			} 
			buffersize -= nread;
			buf += nread;
			allread += nread;
		}
		return result/*
		* This function logs in to a SOCKS4 proxy and sends the specifics to the final
		* destination server.
		*
		* Reference :
		*   https://www.openssh.com/txt/socks4.protocol
		*
		* Note :
		*   Set protocol4a=true for  "SOCKS 4A (Simple Extension to SOCKS 4 Protocol)"
		*   Nonsupport "Identification Protocol (RFC1413)"
		*/;
	}
	/* read from this socket */
	/* store read data here */
	public Object Curl_SOCKS4(Object proxy_user, Object hostname, int remote_port, int sockindex) {
		proxy_info generatedSocks_proxy = this.getSocks_proxy();
		Object generatedProxytype = generatedSocks_proxy.getProxytype();
		bool protocol4a = (generatedProxytype == CURLPROXY_SOCKS4A) ? 1 : 0;
		byte[] socksreq = new byte[/* room for SOCKS4 request incl. user
		                                           id */262];
		 code = new ();
		Object generatedSock = this.getSock();
		 sock = generatedSock[sockindex];
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		if (ModernizedCProgram.Curl_timeleft(data, ((Object)0), 1) < 0) {
			data.Curl_failf(/* time-out, bail out, go home */"Connection time-out");
			return CURLE_OPERATION_TIMEDOUT;
		} 
		ConnectBits generatedBits = this.getBits();
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		if (generatedHttpproxy) {
			generatedData.Curl_infof("SOCKS4%s: connecting to HTTP proxy %s port %d\n", protocol4a ? "a" : "", hostname, remote_port);
		} 
		(Object)ModernizedCProgram.curlx_nonblock(sock, 0);
		data.Curl_infof("SOCKS4 communication to %s:%d\n", hostname, remote_port/*
		   * Compose socks4 request
		   *
		   * Request format
		   *
		   *     +----+----+----+----+----+----+----+----+----+----+....+----+
		   *     | VN | CD | DSTPORT |      DSTIP        | USERID       |NULL|
		   *     +----+----+----+----+----+----+----+----+----+----+....+----+
		   * # of bytes:  1    1      2              4           variable       1
		   */);
		socksreq[0] = /* version (SOCKS4) */4;
		socksreq[1] = /* connect */1;
		socksreq[2] = (byte)((remote_port >> 8) & /* PORT MSB */-1024);
		socksreq[3] = (byte)(remote_port & /* PORT LSB */-1024);
		Curl_addrinfo generatedAddr = dns.getAddr();
		Object generatedSin_addr = saddr_in.getSin_addr();
		if (!/* DNS resolve only for SOCKS4, not SOCKS4a */protocol4a) {
			Curl_dns_entry dns = new Curl_dns_entry();
			Curl_addrinfo hp = ((Object)0);
			int rc;
			rc = ModernizedCProgram.Curl_resolv(conn, hostname, remote_port, 0, dns);
			if (rc == -1) {
				return CURLE_COULDNT_RESOLVE_PROXY;
			} 
			if (rc == 1) {
				(Object)ModernizedCProgram.Curl_resolver_wait_resolv(conn, /* ignores the return code, but 'dns' remains NULL on failure */dns/*
				     * We cannot use 'hostent' as a struct that Curl_resolv() returns.  It
				     * returns a Curl_addrinfo pointer that may not always look the same.
				     */);
			} 
			if (dns) {
				ModernizedCProgram.hp = generatedAddr;
			} 
			if (ModernizedCProgram.hp) {
				byte[] buf = new byte[64];
				ModernizedCProgram.Curl_printable_address(ModernizedCProgram.hp, ModernizedCProgram.buf, );
				if (ModernizedCProgram.hp.getAi_family() == 2) {
					sockaddr_in saddr_in = new sockaddr_in();
					saddr_in = (sockaddr_in)(Object)ModernizedCProgram.hp.getAi_addr();
					socksreq[4] = ((byte)generatedSin_addr.getS_un().getS_addr())[0];
					socksreq[5] = ((byte)generatedSin_addr.getS_un().getS_addr())[1];
					socksreq[6] = ((byte)generatedSin_addr.getS_un().getS_addr())[2];
					socksreq[7] = ((byte)generatedSin_addr.getS_un().getS_addr())[3];
					data.Curl_infof("SOCKS4 connect to IPv4 %s (locally resolved)\n", ModernizedCProgram.buf);
				} else {
						ModernizedCProgram.hp = ((Object)/* fail! */0);
						data.Curl_failf("SOCKS4 connection to %s not supported\n", ModernizedCProgram.buf);
				} 
				ModernizedCProgram.Curl_resolv_unlock(data, /* not used anymore from now on */dns);
			} 
			if (!ModernizedCProgram.hp) {
				data.Curl_failf("Failed to resolve \"%s\" for SOCKS4 connect.", hostname);
				return CURLE_COULDNT_RESOLVE_HOST;
			} 
		} 
		socksreq[8] = /*
		   * This is currently not supporting "Identification Protocol (RFC1413)".
		   *//* ensure empty userid is NUL-terminated */0;
		if (proxy_user) {
			size_t plen = .strlen(proxy_user);
			if (plen >=  - 8) {
				data.Curl_failf("Too long SOCKS proxy name, can't use!\n");
				return CURLE_COULDNT_CONNECT;
			} 
			.memcpy(socksreq + 8, proxy_user, plen + /* copy the proxy name WITH trailing zero */1/*
			   * Make connection
			   */);
		} 
		{ 
			int result;
			ssize_t actualread = new ssize_t();
			ssize_t written = new ssize_t();
			ssize_t hostnamelen = 0;
			ssize_t packetsize = 9 + .strlen((byte)socksreq + /* size including NUL */8);
			if (/* If SOCKS4a, set special invalid IP address 0.0.0.x */protocol4a) {
				socksreq[4] = 0;
				socksreq[5] = 0;
				socksreq[6] = 0;
				socksreq[7] = 1;
				hostnamelen = (ssize_t).strlen(hostname) + /* If still enough room in buffer, also append hostname *//* length including NUL */1;
				if (packetsize + hostnamelen <= 262) {
					.strcpy((byte)socksreq + packetsize, hostname);
				} else {
						hostnamelen = /* Flag: hostname did not fit in buffer */0;
				} 
			} 
			code = conn.Curl_write_plain(sock, (byte)/* Send request */socksreq, packetsize + hostnamelen, written);
			if (code || (written != packetsize + hostnamelen)) {
				data.Curl_failf("Failed to send SOCKS4 connect request.");
				return CURLE_COULDNT_CONNECT;
			} 
			if (protocol4a && hostnamelen == 0) {
				hostnamelen = (ssize_t).strlen(hostname) + /* SOCKS4a with very long hostname - send that name separately */1;
				code = conn.Curl_write_plain(sock, (byte)hostname, hostnamelen, written);
				if (code || (written != hostnamelen)) {
					data.Curl_failf("Failed to send SOCKS4 connect request.");
					return CURLE_COULDNT_CONNECT;
				} 
			} 
			packetsize = /* receive data size */8;
			ModernizedCProgram.result = conn.Curl_blockread_all(sock, (byte)socksreq, /* Receive response */packetsize, actualread);
			if (ModernizedCProgram.result || (actualread != packetsize)) {
				data.Curl_failf("Failed to receive SOCKS4 connect request ack.");
				return CURLE_COULDNT_CONNECT/*
				     * Response format
				     *
				     *     +----+----+----+----+----+----+----+----+
				     *     | VN | CD | DSTPORT |      DSTIP        |
				     *     +----+----+----+----+----+----+----+----+
				     * # of bytes:  1    1      2              4
				     *
				     * VN is the version of the reply code and should be 0. CD is the result
				     * code with one of the following values:
				     *
				     * 90: request granted
				     * 91: request rejected or failed
				     * 92: request rejected because SOCKS server cannot connect to
				     *     identd on the client
				     * 93: request rejected because the client program and identd
				     *     report different user-ids
				     */;
			} 
			if (socksreq[0] != /* wrong version ? */0) {
				data.Curl_failf("SOCKS4 reply has wrong version, version should be 0.");
				return CURLE_COULDNT_CONNECT;
			} 
			switch (socksreq[/* Result */1]) {
			case 93:
					data.Curl_failf("Can't complete SOCKS4 connection to %d.%d.%d.%d:%d. (%d), request rejected because the client program and identd report different user-ids.", (byte)socksreq[4], (byte)socksreq[5], (byte)socksreq[6], (byte)socksreq[7], (((byte)socksreq[2] << 8) | (byte)socksreq[3]), (byte)socksreq[1]);
					return CURLE_COULDNT_CONNECT;
			case 91:
					data.Curl_failf("Can't complete SOCKS4 connection to %d.%d.%d.%d:%d. (%d), request rejected or failed.", (byte)socksreq[4], (byte)socksreq[5], (byte)socksreq[6], (byte)socksreq[7], (((byte)socksreq[2] << 8) | (byte)socksreq[3]), (byte)socksreq[1]);
					return CURLE_COULDNT_CONNECT;
			case 90:
					data.Curl_infof("SOCKS4%s request granted.\n", protocol4a ? "a" : "");
					break;
			case 92:
					data.Curl_failf("Can't complete SOCKS4 connection to %d.%d.%d.%d:%d. (%d), request rejected because SOCKS server cannot connect to identd on the client.", (byte)socksreq[4], (byte)socksreq[5], (byte)socksreq[6], (byte)socksreq[7], (((byte)socksreq[2] << 8) | (byte)socksreq[3]), (byte)socksreq[1]);
					return CURLE_COULDNT_CONNECT;
			default:
					data.Curl_failf("Can't complete SOCKS4 connection to %d.%d.%d.%d:%d. (%d), Unknown.", (byte)socksreq[4], (byte)socksreq[5], (byte)socksreq[6], (byte)socksreq[7], (((byte)socksreq[2] << 8) | (byte)socksreq[3]), (byte)socksreq[1]);
					return CURLE_COULDNT_CONNECT;
			}
		}
		(Object)ModernizedCProgram.curlx_nonblock(sock, 1);
		return /* Proxy was successful! */CURLE_OK/*
		 * This function logs in to a SOCKS5 proxy and sends the specifics to the final
		 * destination server.
		 */;
	}
	public Object Curl_SOCKS5(Object proxy_user, Object proxy_password, Object hostname, int remote_port, int sockindex) {
		byte[] socksreq = new byte[/* room for large user/pw (255 max each) */600];
		byte[] dest = /* printable hostname:port */"unknown";
		int idx;
		ssize_t actualread = new ssize_t();
		ssize_t written = new ssize_t();
		int result;
		 code = new ();
		Object generatedSock = this.getSock();
		 sock = generatedSock[sockindex];
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		timediff_t timeout = new timediff_t();
		proxy_info generatedSocks_proxy = this.getSocks_proxy();
		Object generatedProxytype = generatedSocks_proxy.getProxytype();
		bool socks5_resolve_local = (generatedProxytype == CURLPROXY_SOCKS5) ? 1 : 0;
		size_t hostname_len = .strlen(hostname);
		ssize_t len = 0;
		Object generatedSet = data.getSet();
		long auth = generatedSet.getSocks5auth();
		bool allow_gssapi = 0;
		ConnectBits generatedBits = this.getBits();
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		if (generatedHttpproxy) {
			generatedData.Curl_infof("SOCKS5: connecting to HTTP proxy %s port %d\n", hostname, remote_port);
		} 
		if (!socks5_resolve_local && hostname_len > /* RFC1928 chapter 5 specifies max 255 chars for domain name in packet */255) {
			generatedData.Curl_infof("SOCKS5: server resolving disabled for hostnames of length > 255 [actual len=%zu]\n", hostname_len);
			socks5_resolve_local = 1;
		} 
		timeout = ModernizedCProgram.Curl_timeleft(data, ((Object)0), /* get timeout */1);
		if (timeout < 0) {
			data.Curl_failf(/* time-out, bail out, go home */"Connection time-out");
			return CURLE_OPERATION_TIMEDOUT;
		} 
		(Object)ModernizedCProgram.curlx_nonblock(sock, 1);
		result = ModernizedCProgram.Curl_socket_check(CURL_SOCKET_BAD, CURL_SOCKET_BAD, sock, (time_t)/* wait until socket gets connected */timeout);
		if (-1 == result) {
			generatedData.Curl_failf("SOCKS5: no connection here");
			return CURLE_COULDNT_CONNECT;
		} 
		if (0 == result) {
			generatedData.Curl_failf("SOCKS5: connection timeout");
			return CURLE_OPERATION_TIMEDOUT;
		} 
		if (result & CURL_CSELECT_ERR) {
			generatedData.Curl_failf("SOCKS5: error occurred during connection");
			return CURLE_COULDNT_CONNECT;
		} 
		if (auth & ~(CURLAUTH_BASIC | CURLAUTH_GSSAPI)) {
			generatedData.Curl_infof("warning: unsupported value passed to CURLOPT_SOCKS5_AUTH: %lu\n", auth);
		} 
		if (!(auth & CURLAUTH_BASIC)) {
			proxy_user = ((Object)/* disable username/password auth */0);
		} 
		idx = 0;
		socksreq[idx++] = /* version */5;
		/* reserve for the number of authentication methods */idx++;
		socksreq[idx++] = /* no authentication */0;
		if (allow_gssapi) {
			socksreq[idx++] = /* GSS-API */1;
		} 
		if (proxy_user) {
			socksreq[idx++] = /* username/password */2;
		} 
		socksreq[1] = (byte)(idx - /* write the number of authentication methods */2);
		(Object)ModernizedCProgram.curlx_nonblock(sock, 0);
		data.Curl_infof("SOCKS5 communication to %s:%d\n", hostname, remote_port);
		code = conn.Curl_write_plain(sock, (byte)socksreq, (2 + (int)socksreq[1]), written);
		if (code || (written != (2 + (int)socksreq[1]))) {
			data.Curl_failf("Unable to send initial SOCKS5 request.");
			return CURLE_COULDNT_CONNECT;
		} 
		(Object)ModernizedCProgram.curlx_nonblock(sock, 1);
		result = ModernizedCProgram.Curl_socket_check(sock, CURL_SOCKET_BAD, CURL_SOCKET_BAD, (time_t)timeout);
		if (-1 == result) {
			generatedData.Curl_failf("SOCKS5 nothing to read");
			return CURLE_COULDNT_CONNECT;
		} 
		if (0 == result) {
			generatedData.Curl_failf("SOCKS5 read timeout");
			return CURLE_OPERATION_TIMEDOUT;
		} 
		if (result & CURL_CSELECT_ERR) {
			generatedData.Curl_failf("SOCKS5 read error occurred");
			return CURLE_RECV_ERROR;
		} 
		(Object)ModernizedCProgram.curlx_nonblock(sock, 0);
		result = conn.Curl_blockread_all(sock, (byte)socksreq, 2, actualread);
		if (result || (actualread != 2)) {
			data.Curl_failf("Unable to receive initial SOCKS5 response.");
			return CURLE_COULDNT_CONNECT;
		} 
		if (socksreq[0] != 5) {
			data.Curl_failf("Received invalid version in initial SOCKS5 response.");
			return CURLE_COULDNT_CONNECT;
		} 
		if (socksreq[1] == 0/* Nothing to do, no authentication needed */) {
			;
		}  else if (socksreq[1] == 2/* Needs user name and password */) {
			size_t proxy_user_len = new size_t();
			size_t proxy_password_len = new size_t();
			if (proxy_user && proxy_password) {
				proxy_user_len = .strlen(proxy_user);
				proxy_password_len = .strlen(proxy_password);
			} else {
					proxy_user_len = 0;
					proxy_password_len = 0/*   username/password request looks like
					     * +----+------+----------+------+----------+
					     * |VER | ULEN |  UNAME   | PLEN |  PASSWD  |
					     * +----+------+----------+------+----------+
					     * | 1  |  1   | 1 to 255 |  1   | 1 to 255 |
					     * +----+------+----------+------+----------+
					     */;
			} 
			len = 0;
			socksreq[len++] = /* username/pw subnegotiation version */1;
			socksreq[len++] = (byte)proxy_user_len;
			if (proxy_user && proxy_user_len) {
				if (proxy_user_len >= /* the length must fit in a single byte */255) {
					data.Curl_failf("Excessive user name length for proxy auth");
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				.memcpy(socksreq + len, proxy_user, proxy_user_len);
			} 
			len += proxy_user_len;
			socksreq[len++] = (byte)proxy_password_len;
			if (proxy_password && proxy_password_len) {
				if (proxy_password_len > /* the length must fit in a single byte */255) {
					data.Curl_failf("Excessive password length for proxy auth");
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				.memcpy(socksreq + len, proxy_password, proxy_password_len);
			} 
			len += proxy_password_len;
			code = conn.Curl_write_plain(sock, (byte)socksreq, len, written);
			if (code || (len != written)) {
				data.Curl_failf("Failed to send SOCKS5 sub-negotiation request.");
				return CURLE_COULDNT_CONNECT;
			} 
			result = conn.Curl_blockread_all(sock, (byte)socksreq, 2, actualread);
			if (result || (actualread != 2)) {
				data.Curl_failf("Unable to receive SOCKS5 sub-negotiation response.");
				return CURLE_COULDNT_CONNECT;
			} 
			if (socksreq[1] != /* ignore the first (VER) byte *//* status */0) {
				data.Curl_failf("User was rejected by the SOCKS5 server (%d %d).", socksreq[0], socksreq[1]);
				return CURLE_COULDNT_CONNECT/* Everything is good so far, user was authenticated! */;
			} 
		} else {
				if (!allow_gssapi && (socksreq[1] == /* error */1)) {
					data.Curl_failf("SOCKS5 GSSAPI per-message authentication is not supported.");
					return CURLE_COULDNT_CONNECT;
				} 
				if (socksreq[1] == 255) {
					if (!proxy_user || !proxy_user) {
						data.Curl_failf("No authentication method was acceptable. (It is quite likely that the SOCKS5 server wanted a username/password, since none was supplied to the server on this connection.)");
					} else {
							data.Curl_failf("No authentication method was acceptable.");
					} 
					return CURLE_COULDNT_CONNECT;
				} else {
						data.Curl_failf("Undocumented SOCKS5 mode attempted to be used by server.");
						return CURLE_COULDNT_CONNECT;
				} 
		} 
		len = /* Authentication is complete, now specify destination to the proxy */0;
		socksreq[len++] = /* version (SOCKS5) */5;
		socksreq[len++] = /* connect */1;
		socksreq[len++] = /* must be zero */0;
		Curl_addrinfo generatedAddr = dns.getAddr();
		Object generatedSin_addr = saddr_in.getSin_addr();
		if (!socks5_resolve_local) {
			socksreq[len++] = /* ATYP: domain name = 3 */3;
			socksreq[len++] = (byte)/* address length */hostname_len;
			.memcpy(socksreq[len], hostname, /* address str w/o NULL */hostname_len);
			len += hostname_len;
			ModernizedCProgram.curl_msnprintf(dest, , "%s:%d", hostname, remote_port);
			data.Curl_infof("SOCKS5 connect to %s (remotely resolved)\n", dest);
		} else {
				Curl_dns_entry dns = new Curl_dns_entry();
				Curl_addrinfo hp = ((Object)0);
				int rc = ModernizedCProgram.Curl_resolv(conn, hostname, remote_port, 0, dns);
				if (rc == -1) {
					return CURLE_COULDNT_RESOLVE_HOST;
				} 
				if (rc == 1) {
					code = ModernizedCProgram.Curl_resolver_wait_resolv(conn, /* this requires that we're in "wait for resolve" state */dns);
					if (code) {
						return code/*
						     * We cannot use 'hostent' as a struct that Curl_resolv() returns.  It
						     * returns a Curl_addrinfo pointer that may not always look the same.
						     */;
					} 
				} 
				if (dns) {
					ModernizedCProgram.hp = generatedAddr;
				} 
				if (ModernizedCProgram.hp) {
					if (ModernizedCProgram.Curl_printable_address(ModernizedCProgram.hp, dest, )) {
						size_t destlen = .strlen(dest);
						ModernizedCProgram.curl_msnprintf(dest + destlen,  - destlen, ":%d", remote_port);
					} else {
							.strcpy(dest, "unknown");
					} 
					if (ModernizedCProgram.hp.getAi_family() == 2) {
						int i;
						sockaddr_in saddr_in = new sockaddr_in();
						socksreq[len++] = /* ATYP: IPv4 = 1 */1;
						saddr_in = (sockaddr_in)(Object)ModernizedCProgram.hp.getAi_addr();
						for (i = 0; i < 4; i++) {
							socksreq[len++] = ((byte)generatedSin_addr.getS_un().getS_addr())[i];
						}
						data.Curl_infof("SOCKS5 connect to IPv4 %s (locally resolved)\n", dest/* ATYP: IPv6 = 4 */);
					} else {
							ModernizedCProgram.hp = ((Object)/* fail! */0);
							data.Curl_failf("SOCKS5 connection to %s not supported\n", dest);
					} 
					ModernizedCProgram.Curl_resolv_unlock(data, /* not used anymore from now on */dns);
				} 
				if (!ModernizedCProgram.hp) {
					data.Curl_failf("Failed to resolve \"%s\" for SOCKS5 connect.", hostname);
					return CURLE_COULDNT_RESOLVE_HOST;
				} 
		} 
		socksreq[len++] = (byte)((remote_port >> 8) & /* PORT MSB */-1024);
		socksreq[len++] = (byte)(remote_port & /* PORT LSB */-1024);
		code = conn.Curl_write_plain(sock, (byte)socksreq, len, written);
		if (code || (len != written)) {
			data.Curl_failf("Failed to send SOCKS5 connect request.");
			return CURLE_COULDNT_CONNECT;
		} 
		len = /* minimum packet size is 10 */10;
		result = conn.Curl_blockread_all(sock, (byte)socksreq, len, actualread);
		if (result || (len != actualread)) {
			data.Curl_failf("Failed to receive SOCKS5 connect request ack.");
			return CURLE_COULDNT_CONNECT;
		} 
		if (socksreq[0] != /* version */5) {
			data.Curl_failf("SOCKS5 reply has wrong version, version should be 5.");
			return CURLE_COULDNT_CONNECT/* Fix: in general, returned BND.ADDR is variable length parameter by RFC
			     1928, so the reply packet should be read until the end to avoid errors at
			     subsequent protocol level.
			
			    +----+-----+-------+------+----------+----------+
			    |VER | REP |  RSV  | ATYP | BND.ADDR | BND.PORT |
			    +----+-----+-------+------+----------+----------+
			    | 1  |  1  | X'00' |  1   | Variable |    2     |
			    +----+-----+-------+------+----------+----------+
			
			     ATYP:
			     o  IP v4 address: X'01', BND.ADDR = 4 byte
			     o  domain name:  X'03', BND.ADDR = [ 1 byte length, string ]
			     o  IP v6 address: X'04', BND.ADDR = 16 byte
			     */;
		} 
		if (socksreq[3] == /* Calculate real packet size */3) {
			int addrlen = (int)socksreq[/* domain name */4];
			len = 5 + addrlen + 2;
		}  else if (socksreq[3] == 4) {
			len = 4 + 16 + /* IPv6 */2/* At this point we already read first 10 bytes */;
		} 
		if (len > /* decrypt_gssapi_blockread already read the whole packet */10) {
			result = conn.Curl_blockread_all(sock, (byte)socksreq[10], len - 10, actualread);
			if (result || ((len - 10) != actualread)) {
				data.Curl_failf("Failed to receive SOCKS5 connect request ack.");
				return CURLE_COULDNT_CONNECT;
			} 
		} 
		if (socksreq[1] != /* Anything besides 0 is an error */0) {
			data.Curl_failf("Can't complete SOCKS5 connection to %s. (%d)", dest, (byte)socksreq[1]);
			return CURLE_COULDNT_CONNECT;
		} 
		data.Curl_infof("SOCKS5 request granted.\n");
		(Object)ModernizedCProgram.curlx_nonblock(sock, 1);
		return /* Proxy was successful! */CURLE_OK/* CURL_DISABLE_PROXY */;
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
	/* The last 3 #include files should be in this order */
	/* Test example headers:
	
	WWW-Authenticate: Digest realm="testrealm", nonce="1053604598"
	Proxy-Authenticate: Digest realm="testrealm", nonce="1053604598"
	
	*/
	public Object Curl_input_digest( proxy, Object header) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		/* Point to the correct struct with this */digestdata digest = new digestdata();
		Object generatedState = data.getState();
		if (proxy) {
			digest = generatedState.getProxydigest();
		} else {
				digest = generatedState.getDigest();
		} 
		if (!ModernizedCProgram.curl_strnequal("Digest", header, .strlen("Digest"))) {
			return CURLE_BAD_CONTENT_ENCODING;
		} 
		header += .strlen("Digest");
		while (header && (ModernizedCProgram.Curl_isspace((int)((byte)header)))) {
			header++;
		}
		return digest.Curl_auth_decode_digest_http_message(header);
	}
	/* rest of the *-authenticate:
	                                                  header */
	public Object Curl_output_digest( proxy, Object request, Object uripath) {
		 result = new ();
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		byte path = ((Object)0);
		byte tmp = ((Object)0);
		byte response;
		size_t len = new size_t();
		bool have_chlg = new bool();
		/* Point to the address of the pointer that holds the string to send to the
		     server, which is for a plain host or for a HTTP proxy */
		byte allocuserpwd;
		/* Point to the name and password for this */byte userp;
		byte passwdp;
		/* Point to the correct struct with this */digestdata digest = new digestdata();
		auth authp = new auth();
		Object generatedState = data.getState();
		dynamically_allocated_data generatedAllocptr = this.getAllocptr();
		Byte generatedProxyuserpwd = generatedAllocptr.getProxyuserpwd();
		proxy_info generatedHttp_proxy = this.getHttp_proxy();
		Byte generatedUser = generatedHttp_proxy.getUser();
		Byte generatedPasswd = generatedHttp_proxy.getPasswd();
		Byte generatedUserpwd = generatedAllocptr.getUserpwd();
		if (proxy) {
			digest = generatedState.getProxydigest();
			allocuserpwd = generatedProxyuserpwd;
			userp = generatedUser;
			passwdp = generatedPasswd;
			authp = generatedState.getAuthproxy();
		} else {
				digest = generatedState.getDigest();
				allocuserpwd = generatedUserpwd;
				userp = generatedUser;
				passwdp = generatedPasswd;
				authp = generatedState.getAuthhost();
		} 
		do {
			.Curl_cfree((allocuserpwd));
			(allocuserpwd) = ((Object)0);
		} while (0);
		if (!/* not set means empty */userp) {
			userp = "";
		} 
		if (!passwdp) {
			passwdp = "";
		} 
		Byte generatedNonce = digest.getNonce();
		have_chlg = generatedNonce ? 1 : 0;
		if (!have_chlg) {
			authp.setDone(0);
			return CURLE_OK/* So IE browsers < v7 cut off the URI part at the query part when they
			     evaluate the MD5 and some (IIS?) servers work with them so we may need to
			     do the Digest IE-style. Note that the different ways cause different MD5
			     sums to get sent.
			
			     Apache servers can be set to do the Digest IE-style automatically using
			     the BrowserMatch feature:
			     https://httpd.apache.org/docs/2.2/mod/mod_auth_digest.html#msie
			
			     Further details on Digest implementation differences:
			     http://www.fngtps.com/2006/09/http-authentication
			  */;
		} 
		Object generatedIestyle = authp.getIestyle();
		if (generatedIestyle) {
			tmp = .strchr((byte)uripath, (byte)'?');
			if (tmp) {
				size_t urilen = tmp - (byte)uripath;
				path = (byte)ModernizedCProgram.curl_maprintf("%.*s", urilen, uripath);
			} 
		} 
		if (!tmp) {
			path = (byte).Curl_cstrdup((byte)uripath);
		} 
		if (!path) {
			return CURLE_OUT_OF_MEMORY;
		} 
		result = ModernizedCProgram.Curl_auth_create_digest_http_message(data, userp, passwdp, request, path, digest, response, len);
		.Curl_cfree(path);
		if (result) {
			return result;
		} 
		allocuserpwd = ModernizedCProgram.curl_maprintf("%sAuthorization: Digest %s\r\n", proxy ? "Proxy-" : "", response);
		.Curl_cfree(response);
		if (!allocuserpwd) {
			return CURLE_OUT_OF_MEMORY;
		} 
		authp.setDone(1);
		return CURLE_OK;
	}
	public Object tftp_disconnect( dead_connection) {
		 generatedProto = this.getProto();
		Object generatedTftpc = generatedProto.getTftpc();
		tftp_state_data_t state = generatedTftpc;
		(Object)dead_connection;
		tftp_packet generatedRpacket = state.getRpacket();
		Byte generatedData = generatedRpacket.getData();
		if (/* done, free dynamically allocated pkt buffers */state) {
			do {
				.Curl_cfree((generatedData));
				(generatedData) = ((Object)0);
			} while (0);
			do {
				.Curl_cfree((generatedData));
				(generatedData) = ((Object)0);
			} while (0);
			.Curl_cfree(state);
		} 
		return CURLE_OK/**********************************************************
		 *
		 * tftp_connect
		 *
		 * The connect callback
		 *
		 **********************************************************/;
	}
	public Object tftp_connect( done) {
		tftp_state_data_t state = new tftp_state_data_t();
		int blksize;
		int need_blksize;
		blksize = 512;
		 generatedProto = this.getProto();
		state = generatedProto.setTftpc(.Curl_ccalloc(1, ));
		if (!state) {
			return CURLE_OUT_OF_MEMORY;
		} 
		Curl_easy generatedData = this.getData();
		Object generatedSet = generatedData.getSet();
		if (generatedSet.getTftp_blksize()) {
			blksize = (int)generatedSet.getTftp_blksize();
			if (blksize > 65464 || blksize < 8) {
				return CURLE_TFTP_ILLEGAL;
			} 
		} 
		need_blksize = blksize;
		if (need_blksize < /* default size is the fallback when no OACK is received */512) {
			need_blksize = 512;
		} 
		tftp_packet generatedRpacket = state.getRpacket();
		if (!generatedData) {
			generatedRpacket.setData(.Curl_ccalloc(1, need_blksize + 2 + 2));
			if (!generatedData) {
				return CURLE_OUT_OF_MEMORY;
			} 
		} 
		tftp_packet generatedSpacket = state.getSpacket();
		if (!generatedData) {
			generatedSpacket.setData(.Curl_ccalloc(1, need_blksize + 2 + 2));
			if (!generatedData) {
				return CURLE_OUT_OF_MEMORY;
			} 
		} 
		conn.Curl_conncontrol(/* we don't keep TFTP connections up basically because there's none or very
		   * little gain for UDP */1);
		state.setConn(conn);
		connectdata generatedConn = state.getConn();
		Object generatedSock = generatedConn.getSock();
		state.setSockfd(generatedSock[0]);
		state.setState(.TFTP_STATE_START);
		state.setError(.TFTP_ERR_NONE);
		state.setBlksize(/* Unless updated by OACK response */512);
		state.setRequested_blksize(blksize);
		Curl_addrinfo generatedIp_addr = this.getIp_addr();
		int generatedAi_family = generatedIp_addr.getAi_family();
		Curl_sockaddr_storage generatedLocal_addr = state.getLocal_addr();
		((sockaddr)generatedLocal_addr).setSa_family((int)(generatedAi_family));
		state.tftp_set_timeouts();
		ConnectBits generatedBits = this.getBits();
		Object generatedBound = generatedBits.getBound();
		Object generatedSockfd = state.getSockfd();
		Object generatedAi_addrlen = generatedIp_addr.getAi_addrlen();
		if (!generatedBound) {
			int rc = .bind(generatedSockfd, (sockaddr)generatedLocal_addr, generatedAi_addrlen);
			if (rc) {
				byte[] buffer = new byte[128];
				generatedData.Curl_failf("bind() failed; %s", ModernizedCProgram.Curl_strerror(((int).WSAGetLastError()), ModernizedCProgram.buffer, ));
				return CURLE_COULDNT_CONNECT;
			} 
			generatedBits.setBound(1);
		} 
		generatedData.Curl_pgrsStartNow();
		done = 1;
		return CURLE_OK/**********************************************************
		 *
		 * tftp_done
		 *
		 * The done callback
		 *
		 **********************************************************/;
	}
	public Object tftp_done(int status,  premature) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedTftpc = generatedProto.getTftpc();
		tftp_state_data_t state = (tftp_state_data_t)generatedTftpc;
		(Object)/* unused */status;
		(Object)/* not used */premature;
		if (conn.Curl_pgrsDone()) {
			return CURLE_ABORTED_BY_CALLBACK;
		} 
		 generatedError = state.getError();
		if (/* If we have encountered an error */state) {
			result = ModernizedCProgram.tftp_translate_code(generatedError);
		} 
		return result/**********************************************************
		 *
		 * tftp_getsock
		 *
		 * The getsock callback
		 *
		 **********************************************************/;
	}
	public int tftp_getsock(Object socks) {
		Object generatedSock = this.getSock();
		socks[0] = generatedSock[0];
		return (1 << (false/**********************************************************
		 *
		 * tftp_receive_packet
		 *
		 * Called once select fires and data is ready on the socket
		 *
		 **********************************************************/));
	}
	public Object tftp_receive_packet() {
		Curl_sockaddr_storage fromaddr = new Curl_sockaddr_storage();
		 fromlen = new ();
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedTftpc = generatedProto.getTftpc();
		tftp_state_data_t state = (tftp_state_data_t)generatedTftpc;
		Object generatedReq = data.getReq();
		SingleRequest k = generatedReq;
		fromlen = ;
		Object generatedSockfd = state.getSockfd();
		int generatedBlksize = state.getBlksize();
		state.setRbytes((int).recvfrom(generatedSockfd, (Object)generatedData, generatedBlksize + 4, 0, (sockaddr)fromaddr, fromlen));
		Object generatedRemote_addrlen = state.getRemote_addrlen();
		Curl_sockaddr_storage generatedRemote_addr = state.getRemote_addr();
		if (generatedRemote_addrlen == 0) {
			.memcpy(generatedRemote_addr, fromaddr, fromlen);
			state.setRemote_addrlen(fromlen);
		} 
		int generatedRbytes = state.getRbytes();
		tftp_packet generatedRpacket = state.getRpacket();
		int generatedBlock = state.getBlock();
		Object generatedBytecount = k.getBytecount();
		 generatedEvent = state.getEvent();
		if (generatedRbytes < /* Sanity check packet length */4) {
			data.Curl_failf("Received too short packet");
			state.setEvent(/* Not a timeout, but how best to handle it? */.TFTP_EVENT_TIMEOUT);
		} else {
				int event = ModernizedCProgram.getrpacketevent(generatedRpacket);
				state.setEvent((tftp_event_t)event);
				switch (generatedEvent) {
				case .TFTP_EVENT_RRQ:
				case .TFTP_EVENT_OACK:
						result = state.tftp_parse_option_ack((byte)generatedData + 2, generatedRbytes - 2);
						if (result) {
							return result;
						} 
						break;
				case .TFTP_EVENT_DATA:
						if (generatedRbytes > /* Don't pass to the client empty or retransmitted packets */4 && ((((generatedBlock) + 1) & -1024) == ModernizedCProgram.getrpacketblock(generatedRpacket))) {
							result = conn.Curl_client_write((1 << 0), (byte)generatedData + 4, generatedRbytes - 4);
							if (result) {
								state.tftp_state_machine(.TFTP_EVENT_ERROR);
								return result;
							} 
							generatedBytecount += generatedRbytes - 4;
							data.Curl_pgrsSetDownloadCounter(()generatedBytecount);
						} 
						break;
				case .TFTP_EVENT_WRQ:
				case .TFTP_EVENT_ERROR:
						{ 
							int error = ModernizedCProgram.getrpacketblock(generatedRpacket);
							byte str = (byte)generatedData + 4;
							size_t strn = generatedRbytes - 4;
							state.setError((tftp_error_t)error);
							if (ModernizedCProgram.Curl_strnlen(str, strn) < strn) {
								data.Curl_infof("TFTP error: %s\n", str);
							} 
							break;
						}
				case .TFTP_EVENT_ACK:
						break;
				default:
						data.Curl_failf("%s", "Internal error: Unexpected packet");
						break;
				}
				if (/* Update the progress meter */conn.Curl_pgrsUpdate()) {
					state.tftp_state_machine(.TFTP_EVENT_ERROR);
					return CURLE_ABORTED_BY_CALLBACK;
				} 
		} 
		return result/**********************************************************
		 *
		 * tftp_state_timeout
		 *
		 * Check if timeouts have been reached
		 *
		 **********************************************************/;
	}
	public long tftp_state_timeout( event) {
		time_t current = new time_t();
		 generatedProto = this.getProto();
		Object generatedTftpc = generatedProto.getTftpc();
		tftp_state_data_t state = (tftp_state_data_t)generatedTftpc;
		if (event) {
			event = .TFTP_EVENT_NONE;
		} 
		.time(current);
		Object generatedMax_time = state.getMax_time();
		if (current > generatedMax_time) {
			do {
			} while (0);
			state.setError(.TFTP_ERR_TIMEOUT);
			state.setState(.TFTP_STATE_FIN);
			return 0;
		} 
		Object generatedRx_time = state.getRx_time();
		int generatedRetry_time = state.getRetry_time();
		if (current > generatedRx_time + generatedRetry_time) {
			if (event) {
				event = .TFTP_EVENT_TIMEOUT;
			} 
			.time(generatedRx_time);
		} 
		return (long)(generatedMax_time - /* there's a typecast below here since 'time_t' may in fact be larger than
		     'long', but we estimate that a 'long' will still be able to hold number
		     of seconds even if "only" 32 bit */current/**********************************************************
		 *
		 * tftp_multi_statemach
		 *
		 * Handle single RX socket event and return
		 *
		 **********************************************************/);
	}
	public Object tftp_multi_statemach( done) {
		tftp_event_t event = new tftp_event_t();
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedTftpc = generatedProto.getTftpc();
		tftp_state_data_t state = (tftp_state_data_t)generatedTftpc;
		long timeout_ms = conn.tftp_state_timeout(event);
		done = 0;
		if (timeout_ms <= 0) {
			data.Curl_failf("TFTP response timeout");
			return CURLE_OPERATION_TIMEDOUT;
		} 
		 generatedState = state.getState();
		Object generatedSockfd = state.getSockfd();
		 generatedEvent = state.getEvent();
		if (event != .TFTP_EVENT_NONE) {
			result = state.tftp_state_machine(event);
			if (result) {
				return result;
			} 
			done = (generatedState == .TFTP_STATE_FIN) ? 1 : 0;
			if (done) {
				data.Curl_setup_transfer(-1, -1, 0, -/* Tell curl we're done */1);
			} 
		} else {
				int rc = ModernizedCProgram.Curl_socket_check(generatedSockfd, CURL_SOCKET_BAD, CURL_SOCKET_BAD, (time_t)/* no timeouts to handle, check our socket */0);
				if (rc == -1) {
					int error = ((int).WSAGetLastError());
					byte[] buffer = new byte[128];
					data.Curl_failf("%s", ModernizedCProgram.Curl_strerror(error, ModernizedCProgram.buffer, ));
					state.setEvent(.TFTP_EVENT_ERROR);
				}  else if (rc != 0) {
					result = conn.tftp_receive_packet();
					if (result) {
						return result;
					} 
					result = state.tftp_state_machine(generatedEvent);
					if (result) {
						return result;
					} 
					done = (generatedState == .TFTP_STATE_FIN) ? 1 : 0;
					if (done) {
						data.Curl_setup_transfer(-1, -1, 0, -/* Tell curl we're done */1/* if rc == 0, then select() timed out */);
					} 
				} 
		} 
		return result/**********************************************************
		 *
		 * tftp_doing
		 *
		 * Called from multi.c while DOing
		 *
		 **********************************************************/;
	}
	public Object tftp_doing( dophase_done) {
		 result = new ();
		result = conn.tftp_multi_statemach(dophase_done);
		Curl_easy generatedData = this.getData();
		curltime curltime = new curltime();
		if (dophase_done) {
			do {
			} while (0);
		}  else if (!result/* The multi code doesn't have this logic for the DOING state so we
		       provide it for TFTP since it may do the entire transfer in this
		       state. */) {
			if (conn.Curl_pgrsUpdate()) {
				result = CURLE_ABORTED_BY_CALLBACK;
			} else {
					result = ModernizedCProgram.Curl_speedcheck(generatedData, curltime.Curl_now());
			} 
		} 
		return result/**********************************************************
		 *
		 * tftp_peform
		 *
		 * Entry point for transfer from tftp_do, sarts state mach
		 *
		 **********************************************************/;
	}
	public Object tftp_perform( dophase_done) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedTftpc = generatedProto.getTftpc();
		tftp_state_data_t state = (tftp_state_data_t)generatedTftpc;
		dophase_done = 0;
		result = state.tftp_state_machine(.TFTP_EVENT_INIT);
		 generatedState = state.getState();
		if ((generatedState == .TFTP_STATE_FIN) || result) {
			return result;
		} 
		conn.tftp_multi_statemach(dophase_done);
		if (dophase_done) {
			do {
			} while (0);
		} 
		return result/**********************************************************
		 *
		 * tftp_do
		 *
		 * The do callback
		 *
		 * This callback initiates the TFTP transfer
		 *
		 **********************************************************/;
	}
	public Object tftp_do( done) {
		tftp_state_data_t state = new tftp_state_data_t();
		 result = new ();
		done = 0;
		 generatedProto = this.getProto();
		Object generatedTftpc = generatedProto.getTftpc();
		if (!generatedTftpc) {
			result = conn.tftp_connect(done);
			if (result) {
				return result;
			} 
		} 
		state = (tftp_state_data_t)generatedTftpc;
		if (!state) {
			return CURLE_TFTP_ILLEGAL;
		} 
		result = conn.tftp_perform(done);
		 generatedError = state.getError();
		if (!/* If tftp_perform() returned an error, use that for return code. If it
		     was OK, see if tftp_translate_code() has an error. */result) {
			result = ModernizedCProgram.tftp_translate_code(generatedError);
		} 
		return result;
	}
	public Object tftp_setup_connection() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		byte type;
		this.setTransport(.TRNSPRT_UDP);
		Object generatedState = data.getState();
		type = .strstr(generatedState.getUp().getPath(), /* TFTP URLs support an extension like ";mode=<typecode>" that
		   * we'll try to get now! */";mode=");
		hostname generatedHost = this.getHost();
		Byte generatedRawalloc = generatedHost.getRawalloc();
		if (!type) {
			type = .strstr(generatedRawalloc, ";mode=");
		} 
		Object generatedSet = data.getSet();
		if (type) {
			byte command;
			type = /* it was in the middle of the hostname */0;
			command = ModernizedCProgram.Curl_raw_toupper(type[6]);
			switch (command) {
			case /* binary mode */(byte)'I':
			case /* NETASCII mode */(byte)'N':
					generatedSet.setPrefer_ascii(1);
					break;
			case /* octet mode */(byte)'O':
			case /* ASCII mode */(byte)'A':
			default:
					generatedSet.setPrefer_ascii(/* switch off ASCII */0);
					break;
			}
		} 
		return CURLE_OK;
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
	/* The last #include file should be: */
	/*
	 * Forward declarations.
	 */
	public Object dict_do( done) {
		byte word;
		byte eword;
		byte ppath;
		byte database = ((Object)0);
		byte strategy = ((Object)0);
		byte nthdef = ((Object)/* This is not part of the protocol, but required
		                          by RFC 2229 */0);
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedSock = this.getSock();
		 sockfd = generatedSock[0];
		Object generatedState = data.getState();
		byte path = generatedState.getUp().getPath();
		done = /* unconditionally */1;
		ConnectBits generatedBits = this.getBits();
		Object generatedUser_passwd = generatedBits.getUser_passwd();
		if (generatedUser_passwd) {
		} 
		return CURLE_OK/*CURL_DISABLE_DICT*/;
	}
	/*
	 * DICT protocol handler.
	 */
	/* connecting */
	/* doing */
	/* proto_getsock */
	/* doing_getsock */
	/* domore_getsock */
	/* perform_getsock */
	/* disconnect */
	/* readwrite */
	/* connection_check */
	/* defport */
	/* protocol */
	/* flags */
	public void close_secondarysocket() {
		Object generatedSock = this.getSock();
		if (CURL_SOCKET_BAD != generatedSock[1]) {
			conn.Curl_closesocket(generatedSock[1]);
			generatedSock[1] = CURL_SOCKET_BAD;
		} 
		ConnectBits generatedBits = this.getBits();
		Object generatedTcpconnect = generatedBits.getTcpconnect();
		generatedTcpconnect[1] = 0/*
		 * NOTE: back in the old days, we added code in the FTP code that made NOBODY
		 * requests on files respond with headers passed to the client/stdout that
		 * looked like HTTP ones.
		 *
		 * This approach is not very elegant, it causes confusion and is error-prone.
		 * It is subject for removal at the next (or at least a future) soname bump.
		 * Until then you can test the effects of the removal by undefining the
		 * following define named CURL_FTP_HTTPSTYLE_HEAD.
		 */;
	}
	public Object AcceptServerConnect() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedSock = this.getSock();
		 sock = generatedSock[1];
		 s = CURL_SOCKET_BAD;
		sockaddr_in add = new sockaddr_in();
		 size = ();
		if (0 == .getsockname(sock, (sockaddr)add, size)) {
			size = ;
			s = .accept(sock, (sockaddr)add, size);
		} 
		conn.Curl_closesocket(/* close the first socket */sock);
		if (CURL_SOCKET_BAD == s) {
			data.Curl_failf("Error accept()ing server connect");
			return CURLE_FTP_PORT_FAILED;
		} 
		data.Curl_infof("Connection accepted from server\n"/* when this happens within the DO state it is important that we mark us as
		     not needing DO_MORE anymore */);
		ConnectBits generatedBits = this.getBits();
		generatedBits.setDo_more(0);
		generatedSock[1] = s;
		(Object)ModernizedCProgram.curlx_nonblock(s, /* enable non-blocking */1);
		Object generatedSock_accepted = this.getSock_accepted();
		generatedSock_accepted[1] = 1;
		Object generatedSet = data.getSet();
		if (generatedSet.getFsockopt()) {
			int error = 0;
			data.Curl_set_in_callback(/* activate callback for setting socket options */.bool_true);
			error = .UNRECOGNIZEDFUNCTIONNAME(generatedSet.getSockopt_client(), s, CURLSOCKTYPE_ACCEPT);
			data.Curl_set_in_callback(.bool_false);
			if (error) {
				conn.close_secondarysocket();
				return CURLE_ABORTED_BY_CALLBACK;
			} 
		} 
		return CURLE_OK/*
		 * ftp_timeleft_accept() returns the amount of milliseconds left allowed for
		 * waiting server to connect. If the value is negative, the timeout time has
		 * already elapsed.
		 *
		 * The start time is stored in progress.t_acceptdata - as set with
		 * Curl_pgrsTime(..., TIMER_STARTACCEPT);
		 *
		 */;
	}
	public Object ReceivedServerConnect( received) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedSock = this.getSock();
		 ctrl_sock = generatedSock[0];
		 data_sock = generatedSock[1];
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		pingpong generatedPp = ftpc.getPp();
		pingpong pp = generatedPp;
		int result;
		timediff_t timeout_ms = new timediff_t();
		ssize_t nread = new ssize_t();
		int ftpcode;
		received = 0;
		timeout_ms = data.ftp_timeleft_accept();
		data.Curl_infof("Checking for server connect\n");
		if (timeout_ms < 0) {
			data.Curl_failf(/* if a timeout was already reached, bail out */"Accept timeout occurred while waiting server connect");
			return CURLE_FTP_ACCEPT_TIMEOUT;
		} 
		Object generatedCache_size = pp.getCache_size();
		Byte generatedCache = pp.getCache();
		if (generatedCache_size && generatedCache && generatedCache[0] > /* First check whether there is a cached response from server */(byte)'3') {
			data.Curl_infof(/* Data connection could not be established, let's return */"There is negative response in cache while serv connect\n");
			conn.Curl_GetFTPResponse(nread, ftpcode);
			return CURLE_FTP_ACCEPT_FAILED;
		} 
		result = ModernizedCProgram.Curl_socket_check(ctrl_sock, data_sock, CURL_SOCKET_BAD, 0);
		switch (/* see if the connection request is already here */result) {
		case -/* error */1:
				data.Curl_failf(/* let's die here */"Error while waiting for server connect");
				return CURLE_FTP_ACCEPT_FAILED;
		case /* Server connect is not received yet */0:
				break;
		default:
				if (result & (CURL_CSELECT_ERR << 1)) {
					data.Curl_infof("Ready to accept data connection from server\n");
					received = 1;
				}  else if (result & CURL_CSELECT_IN) {
					data.Curl_infof("Ctrl conn has data while waiting for data conn\n");
					conn.Curl_GetFTPResponse(nread, ftpcode);
					if (ftpcode / 100 > 3) {
						return CURLE_FTP_ACCEPT_FAILED;
					} 
					return CURLE_WEIRD_SERVER_REPLY;
				} 
				break;
		}
		return CURLE_OK/***********************************************************************
		 *
		 * InitiateTransfer()
		 *
		 * After connection from server is accepted this function is called to
		 * setup transfer parameters and initiate the data transfer.
		 *
		 */;
	}
	public Object InitiateTransfer() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 result = CURLE_OK;
		ConnectBits generatedBits = this.getBits();
		Object generatedFtp_use_data_ssl = generatedBits.getFtp_use_data_ssl();
		if (generatedFtp_use_data_ssl) {
			data.Curl_infof("Doing the SSL/TLS handshake on the data stream\n");
			result = .Curl_ssl_connect(conn, 1);
			if (result) {
				return result;
			} 
		} 
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		Object generatedState = data.getState();
		Object generatedSock = this.getSock();
		if (generatedFtpc.getState_saved() == .FTP_STOR/* When we know we're uploading a specified file, we can get the file
		       size prior to the actual upload. */) {
			data.Curl_pgrsSetUploadSize(generatedState.getInfilesize());
			ModernizedCProgram.Curl_sndbufset(generatedSock[/* set the SO_SNDBUF for the secondary socket for those who need it */1]);
			data.Curl_setup_transfer(-1, -1, 0, 1);
		} else {
				data.Curl_setup_transfer(/* FTP download: */1, generatedFtpc.getRetr_size_saved(), 0, -1);
		} 
		generatedFtpc.getPp().setPending_resp(/* expect server response */1);
		conn._state(.FTP_STOP);
		return CURLE_OK/***********************************************************************
		 *
		 * AllowServerConnect()
		 *
		 * When we've issue the PORT command, we have told the server to connect to
		 * us. This function checks whether data connection is established if so it is
		 * accepted.
		 *
		 */;
	}
	public Object AllowServerConnect( connected) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		timediff_t timeout_ms = new timediff_t();
		 result = CURLE_OK;
		connected = 0;
		data.Curl_infof("Preparing for accepting server on data port\n");
		data.Curl_pgrsTime(/* Save the time we start accepting server connect */.TIMER_STARTACCEPT);
		timeout_ms = data.ftp_timeleft_accept();
		if (timeout_ms < 0) {
			data.Curl_failf(/* if a timeout was already reached, bail out */"Accept timeout occurred while waiting server connect");
			return CURLE_FTP_ACCEPT_TIMEOUT;
		} 
		result = conn.ReceivedServerConnect(/* see if the connection request is already here */connected);
		if (result) {
			return result;
		} 
		Object generatedSet = data.getSet();
		if (connected) {
			result = conn.AcceptServerConnect();
			if (result) {
				return result;
			} 
			result = conn.InitiateTransfer();
			if (result) {
				return result;
			} 
		} else {
				if (connected == /* Add timeout to multi handle and break out of the loop */0) {
					data.Curl_expire(generatedSet.getAccepttimeout() > 0 ? generatedSet.getAccepttimeout() : 60000, 0);
				} 
		} 
		return result/* macro to check for a three-digit ftp status code at the start of the
		   given string */;
	}
	/* macro to check for the last line in an FTP server response */
	public  ftp_endofresp(Byte line, Object len, int code) {
		(Object)conn;
		if ((len > 3) && (((ModernizedCProgram.Curl_isdigit((int)((byte)line[0]))) && (ModernizedCProgram.Curl_isdigit((int)((byte)line[1]))) && (ModernizedCProgram.Curl_isdigit((int)((byte)line[2])))) && ((byte)' ' == line[3]))) {
			code = ModernizedCProgram.curlx_sltosi(.strtol(line, ((Object)0), 10));
			return 1;
		} 
		return 0;
	}
	/* return number of bytes read */
	public Object Curl_GetFTPResponse(Object nreadp, int ftpcode) {
		Object generatedSock = this.getSock();
		 sockfd = generatedSock[0];
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		pingpong generatedPp = ftpc.getPp();
		pingpong pp = generatedPp;
		size_t nread = new size_t();
		int cache_skip = 0;
		int value_to_be_ignored = 0;
		if (ftpcode) {
			ftpcode = /* 0 for errors */0;
		} else {
				ftpcode = /* make the pointer point to something for the rest of this function */value_to_be_ignored;
		} 
		nreadp = 0;
		Byte generatedCache = pp.getCache();
		while (!ftpcode && !result) {
			time_t timeout = pp.Curl_pp_state_timeout(/* check and reset timeout value every lap */0);
			time_t interval_ms = new time_t();
			if (ModernizedCProgram.timeout <= 0) {
				data.Curl_failf("FTP response timeout");
				return /* already too little time */CURLE_OPERATION_TIMEDOUT;
			} 
			interval_ms = /* use 1 second timeout intervals */1000;
			if (ModernizedCProgram.timeout < interval_ms) {
				interval_ms = ModernizedCProgram.timeout/*
				     * Since this function is blocking, we need to wait here for input on the
				     * connection and only then we call the response reading function. We do
				     * timeout at least every second to make the timeout check run.
				     *
				     * A caution here is that the ftp_readresp() function has a cache that may
				     * contain pieces of a response from the previous invoke and we need to
				     * make sure we don't just wait for input while there is unhandled data in
				     * that cache. But also, if the cache is there, we call ftp_readresp() and
				     * the cache wasn't good enough to continue we must not just busy-loop
				     * around this function.
				     *
				     */;
			} 
			if (generatedCache && (cache_skip < 2/*
			       * There's a cache left since before. We then skipping the wait for
			       * socket action, unless this is the same cache like the previous round
			       * as then the cache was deemed not enough to act on and we then need to
			       * wait for more data anyway.
			       */)) {
			}  else if (!conn.Curl_conn_data_pending(0)) {
				switch (ModernizedCProgram.Curl_socket_check(sockfd, CURL_SOCKET_BAD, CURL_SOCKET_BAD, (time_t)interval_ms)) {
				case -/* select() error, stop reading */1:
						data.Curl_failf("FTP response aborted due to select/poll error: %d", ((int).WSAGetLastError()));
						return CURLE_RECV_ERROR;
				case /* timeout */0:
						if (conn.Curl_pgrsUpdate()) {
							return CURLE_ABORTED_BY_CALLBACK;
						} 
						continue;
				default:
						break;
				}
			} 
			result = pp.ftp_readresp(sockfd, ftpcode, nread);
			if (result) {
				break;
			} 
			if (!nread && generatedCache) {
				cache_skip++;
			} else {
					cache_skip = /* when we got data or there is no cache left, we reset the cache skip
					         counter */0;
			} 
			nreadp += nread;
		}
		pp.setPending_resp(/* while there's buffer left and loop is requested */0);
		return result/* for debug purposes */;
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
	/* for HTTP proxy tunnel stuff */
	/* for the week day and month names */
	/* required for Curl_sockaddr_storage */
	/* The last 3 #include files should be in this order */
	/* Local API functions */
	/* This is the ONLY way to change FTP state! */
	public void _state( newstate) {
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		ftpc.setState(newstate);
	}
	public Object ftp_state_user() {
		 result = new ();
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		FTP ftp = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		Byte generatedUser = ftp.getUser();
		result = generatedFtpc.getPp().Curl_pp_sendf("USER %s", generatedUser ? generatedUser : "");
		if (result) {
			return /* send USER */result;
		} 
		conn._state(.FTP_USER);
		Object generatedState = generatedData.getState();
		generatedState.setFtp_trying_alternative(0);
		return CURLE_OK;
	}
	public Object ftp_state_pwd() {
		 result = new ();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		result = generatedFtpc.getPp().Curl_pp_sendf("%s", "PWD");
		if (result) {
			return /* send PWD to discover our entry point */result;
		} 
		conn._state(.FTP_PWD);
		return CURLE_OK;
	}
	/* For the FTP "protocol connect" and "doing" phases only */
	public int ftp_getsock(Object socks) {
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		return generatedFtpc.getPp().Curl_pp_getsock(socks);
	}
	/* For the FTP "DO_MORE" phase only */
	public int ftp_domore_getsock(Object socks) {
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		 generatedState = ftpc.getState();
		Object generatedSock = this.getSock();
		Curl_easy generatedData = this.getData();
		Object generatedSet = generatedData.getSet();
		Object generatedTempsock = this.getTempsock();
		if (.FTP_STOP == generatedState) {
			int bits = (1 << (false));
			socks[0] = generatedSock[/* if stopped and still in this state, then we're also waiting for a
			       connect on the secondary connection */0];
			if (!generatedSet.getFtp_use_port()) {
				int s;
				int i;
				for (; i < 2; i++) {
					if (generatedTempsock[i] != CURL_SOCKET_BAD) {
						socks[s] = generatedTempsock[i];
						bits |=  (1 << (16 + (s++)));
					} 
				}
			} else {
					socks[1] = generatedSock[1];
					bits |=  (1 << (16 + (true))) | (1 << (true));
			} 
			return bits;
		} 
		return generatedFtpc.getPp().Curl_pp_getsock(socks/* This is called after the FTP_QUOTE state is passed.
		
		   ftp_state_cwd() sends the range of CWD commands to the server to change to
		   the correct directory. It may also need to send MKD commands to create
		   missing ones, if that option is enabled.
		*/);
	}
	public Object ftp_state_cwd() {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		 generatedCwddone = ftpc.getCwddone();
		Curl_easy generatedData = this.getData();
		Object generatedSet = generatedData.getSet();
		ConnectBits generatedBits = this.getBits();
		Object generatedReuse = generatedBits.getReuse();
		Byte generatedEntrypath = ftpc.getEntrypath();
		int generatedDirdepth = ftpc.getDirdepth();
		Byte generatedDirs = ftpc.getDirs();
		int generatedCwdcount = ftpc.getCwdcount();
		if (generatedCwddone) {
			result = /* already done and fine */conn.ftp_state_mdtm();
		} else {
				do {
				} while (/* FTPFILE_NOCWD with full path: expect ftpc->cwddone! */0);
				ftpc.setCount2(/* count2 counts failed CWDs */0/* count3 is set to allow a MKD to fail once. In the case when first CWD
				       fails and then MKD fails (due to another session raced it to create the
				       dir) this then allows for a second try to CWD to it */);
				ftpc.setCount3((generatedSet.getFtp_create_missing_dirs() == 2) ? 1 : 0);
				if (generatedReuse && generatedEntrypath && !(generatedDirdepth && generatedDirs[0][0] == /* no need to go to entrypath when we have an absolute path */(byte)'/'/* This is a re-used connection. Since we change directory to where the
				         transfer is taking place, we must first get back to the original dir
				         where we ended up after login: */)) {
					ftpc.setCwdcount(/* we count this as the first path, then we add one
					                             for all upcoming ones in the ftp->dirs[] array */0);
					result = generatedFtpc.getPp().Curl_pp_sendf("CWD %s", generatedEntrypath);
					if (result) {
						return result;
					} 
					conn._state(.FTP_CWD);
				} else {
						if (generatedDirdepth) {
							ftpc.setCwdcount(1/* issue the first CWD, the rest is sent when the CWD responses are
							           received... */);
							result = generatedFtpc.getPp().Curl_pp_sendf("CWD %s", generatedDirs[generatedCwdcount - 1]);
							if (result) {
								return result;
							} 
							conn._state(.FTP_CWD);
						} else {
								result = /* No CWD necessary */conn.ftp_state_mdtm();
						} 
				} 
		} 
		return result;
	}
	public Object ftp_state_use_port( fcmd) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 portsock = CURL_SOCKET_BAD;
		byte[] myhost = "";
		Curl_sockaddr_storage ss = new Curl_sockaddr_storage();
		Curl_addrinfo res = new Curl_addrinfo();
		Curl_addrinfo ai = new Curl_addrinfo();
		 sslen = new ();
		byte[] hbuf = new byte[1025];
		sockaddr sa = (sockaddr)ss;
		sockaddr_in sa4 = (Object)sa;
		byte[] tmp = new byte[1024];
		byte[][] mode = new byte[][]{"EPRT", "PORT"};
		int rc;
		int error;
		byte host = ((Object)0);
		Object generatedSet = data.getSet();
		byte string_ftpport = generatedSet.getStr()[dupstring.STRING_FTPPORT];
		Curl_dns_entry h = ((Object)0);
		int port_min = 0;
		int port_max = 0;
		int port;
		bool possibly_non_local = 1;
		byte[] buffer = new byte[128];
		byte addr = ((Object)0/* Step 1, figure out what is requested,
		   * accepted format :
		   * (ipv4|ipv6|domain|interface)?(:port(-range)?)?
		   */);
		Curl_addrinfo generatedIp_addr = this.getIp_addr();
		int generatedAi_family = generatedIp_addr.getAi_family();
		sockaddr generatedAi_addr = generatedIp_addr.getAi_addr();
		int generatedScope_id = this.getScope_id();
		if (generatedSet.getStr()[dupstring.STRING_FTPPORT] && (.strlen(generatedSet.getStr()[dupstring.STRING_FTPPORT]) > 1)) {
			size_t addrlen = 16 > .strlen(string_ftpport) ? 16 : .strlen(string_ftpport);
			byte ip_start = string_ftpport;
			byte ip_end = ((Object)0);
			byte port_start = ((Object)0);
			byte port_sep = ((Object)0);
			addr = .Curl_ccalloc(addrlen + 1, 1);
			if (!addr) {
				return CURLE_OUT_OF_MEMORY/* [ipv6]:port(-range) */;
			} 
			if (string_ftpport == (byte)':') {
				ip_end = /* :port */string_ftpport;
			} else {
					ip_end = .strchr(string_ftpport, (byte)':');
					if (ip_end/* either ipv6 or (ipv4|domain|interface):port(-range) *//* ipv6 */) {
						.strncpy(addr, string_ftpport, ip_end - /* this got no port ! *//* (ipv4|domain|interface):port(-range) */ip_start);
					} else {
							.strcpy(addr, /* ipv4|interface */string_ftpport);
					} 
			} 
			if (ip_end != ((Object)/* parse the port */0)) {
				port_start = .strchr(ip_end, (byte)':');
				if (port_start) {
					port_min = ModernizedCProgram.curlx_ultous(.strtoul(port_start + 1, ((Object)0), 10));
					port_sep = .strchr(port_start, (byte)'-');
					if (port_sep) {
						port_max = ModernizedCProgram.curlx_ultous(.strtoul(port_sep + 1, ((Object)0), 10));
					} else {
							port_max = port_min/* correct errors like:
							     *  :1234-1230
							     *  :-4711,  in this case port_min is (unsigned)-1,
							     *           therefore port_min > port_max for all cases
							     *           but port_max = (unsigned)-1
							     */;
					} 
				} 
			} 
			if (port_min > port_max) {
				port_min = port_max = 0;
			} 
			if (addr != (byte)'\0') {
				switch (ModernizedCProgram.Curl_if2ip(generatedAi_family, ModernizedCProgram.Curl_ipv6_scope(generatedAi_addr), generatedScope_id, addr, hbuf, )) {
				case .IF2IP_FOUND:
						host = /* use the hbuf for host name */hbuf;
				case .IF2IP_AF_NOT_SUPPORTED:
						return CURLE_FTP_PORT_FAILED;
				case .IF2IP_NOT_FOUND:
						host = /* not an interface, use the given string as host name instead */addr;
						break;
				}
			} else {
					host = ((Object)/* there was only a port(-range) given, default the host */0/* data->set.ftpport */);
			} 
		} 
		Object generatedSock = this.getSock();
		Object generatedSa_family = sa.getSa_family();
		Object generatedSin_addr = sa4.getSin_addr();
		if (!host/* not an interface and not a host name, get default by extracting
		       the IP from the control connection */) {
			sslen = ;
			if (.getsockname(generatedSock[0], sa, sslen)) {
				data.Curl_failf("getsockname() failed: %s", ModernizedCProgram.Curl_strerror(((int).WSAGetLastError()), buffer, ));
				.Curl_cfree(addr);
				return CURLE_FTP_PORT_FAILED;
			} 
			switch (generatedSa_family) {
			default:
					ModernizedCProgram.Curl_inet_ntop(generatedSa_family, generatedSin_addr, hbuf, );
					break;
			}
			host = /* use this host name */hbuf;
			possibly_non_local = /* we know it is local now */0;
		} 
		rc = ModernizedCProgram.Curl_resolv(conn, host, 0, 0, /* resolv ip/host to ip */h);
		if (rc == 1) {
			(Object)ModernizedCProgram.Curl_resolver_wait_resolv(conn, h);
		} 
		Curl_addrinfo generatedAddr = h.getAddr();
		if (h) {
			res = generatedAddr;
			ModernizedCProgram.Curl_resolv_unlock(data, h/* (h) */);
		} else {
				res = ((Object)/* failure! */0);
		} 
		if (res == ((Object)0)) {
			data.Curl_failf("failed to resolve the address provided to PORT: %s", host);
			.Curl_cfree(addr);
			return CURLE_FTP_PORT_FAILED;
		} 
		.Curl_cfree(addr);
		host = ((Object)0);
		portsock = /* step 2, create a socket for the requested address */CURL_SOCKET_BAD;
		error = 0;
		Curl_addrinfo generatedAi_next = ai.getAi_next();
		for (ai = res; ai; ai = generatedAi_next) {
			result = ModernizedCProgram.Curl_socket(conn, ai, ((Object)0), portsock);
			if (result) {
				error = ((int).WSAGetLastError());
				continue;
			} 
			break;
		}
		if (!ai) {
			data.Curl_failf("socket failure: %s", ModernizedCProgram.Curl_strerror(error, buffer, ));
			return CURLE_FTP_PORT_FAILED;
		} 
		Object generatedAi_addrlen = ai.getAi_addrlen();
		.memcpy(sa, generatedAi_addr, generatedAi_addrlen);
		sslen = generatedAi_addrlen;
		for (port = port_min; port <= port_max; ) {
			if (generatedSa_family == 2) {
				sa4.setSin_port(.htons(port));
			} 
			if (.bind(portsock, sa, /* Try binding the given address. */sslen)) {
				error = ((int).WSAGetLastError());
				if (possibly_non_local && (error == -1024/* The requested bind address is not local.  Use the address used for
				         * the control connection instead and restart the port loop
				         */)) {
					data.Curl_infof("bind(port=%hu) on non-local address failed: %s\n", port, ModernizedCProgram.Curl_strerror(error, buffer, ));
					sslen = ;
					if (.getsockname(generatedSock[0], sa, sslen)) {
						data.Curl_failf("getsockname() failed: %s", ModernizedCProgram.Curl_strerror(((int).WSAGetLastError()), buffer, ));
						conn.Curl_closesocket(portsock);
						return CURLE_FTP_PORT_FAILED;
					} 
					port = port_min;
					possibly_non_local = /* don't try this again */0;
					continue;
				} 
				if (error != -1024 && error != 13) {
					data.Curl_failf("bind(port=%hu) failed: %s", port, ModernizedCProgram.Curl_strerror(error, buffer, ));
					conn.Curl_closesocket(portsock);
					return CURLE_FTP_PORT_FAILED;
				} 
			} else {
					break;
			} 
			port++;
		}
		if (port > /* maybe all ports were in use already*/port_max) {
			data.Curl_failf("bind() failed, we ran out of ports!");
			conn.Curl_closesocket(portsock);
			return CURLE_FTP_PORT_FAILED;
		} 
		sslen = ;
		if (.getsockname(portsock, (sockaddr)sa, sslen)) {
			data.Curl_failf("getsockname() failed: %s", ModernizedCProgram.Curl_strerror(((int).WSAGetLastError()), buffer, ));
			conn.Curl_closesocket(portsock);
			return CURLE_FTP_PORT_FAILED;
		} 
		if (.listen(portsock, /* step 4, listen on the socket */1)) {
			data.Curl_failf("socket failure: %s", ModernizedCProgram.Curl_strerror(((int).WSAGetLastError()), buffer, ));
			conn.Curl_closesocket(portsock);
			return CURLE_FTP_PORT_FAILED/* step 5, send the proper FTP command */;
		} 
		ModernizedCProgram.Curl_printable_address(ai, myhost, );
		ConnectBits generatedBits = this.getBits();
		Object generatedFtp_use_eprt = generatedBits.getFtp_use_eprt();
		Object generatedSin_port = sa4.getSin_port();
		pingpong generatedPp = ftpc.getPp();
		for (; fcmd != .DONE; fcmd++) {
			if (!generatedFtp_use_eprt && (.EPRT == fcmd/* if disabled, goto next */)) {
				continue;
			} 
			if ((.PORT == fcmd) && generatedSa_family != 2/* PORT is IPv4 only */) {
				continue;
			} 
			switch (generatedSa_family) {
			case 2:
					port = .ntohs(generatedSin_port);
					break;
			default:
					continue;
			}
			if (.EPRT == fcmd/*
			       * Two fine examples from RFC2428;
			       *
			       * EPRT |1|132.235.1.2|6275|
			       *
			       * EPRT |2|1080::8:800:200C:417A|5282|
			       */) {
				result = generatedPp.Curl_pp_sendf("%s |%d|%s|%hu|", mode[fcmd], generatedSa_family == 2 ? 1 : 2, myhost, port);
				if (result) {
					data.Curl_failf("Failure sending EPRT command: %s", ModernizedCProgram.curl_easy_strerror(result));
					conn.Curl_closesocket(portsock);
					ftpc.setCount1(/* don't retry using PORT */.PORT);
					conn._state(/* bail out */.FTP_STOP);
					return result;
				} 
				break;
			} 
			if (.PORT == fcmd) {
				byte source = myhost;
				byte dest = tmp;
				while (source && /* translate x.x.x.x to x,x,x,x */source) {
					if (source == (byte)'.') {
						dest = (byte)',';
					} else {
							dest = source;
					} 
					dest++;
					source++;
				}
				dest = 0;
				ModernizedCProgram.curl_msnprintf(dest, 20, ",%d,%d", (int)(port >> 8), (int)(port & -1024));
				result = generatedPp.Curl_pp_sendf("%s %s", mode[fcmd], tmp);
				if (result) {
					data.Curl_failf("Failure sending PORT command: %s", ModernizedCProgram.curl_easy_strerror(result));
					conn.Curl_closesocket(portsock);
					conn._state(/* bail out */.FTP_STOP);
					return result;
				} 
				break;
			} 
		}
		ftpc.setCount1(/* store which command was sent */fcmd);
		conn/* we set the secondary socket variable to this for now, it is only so that
		     the cleanup function will close it in case we fail before the true
		     secondary stuff is made */.close_secondarysocket();
		generatedSock[1] = portsock/* this tcpconnect assignment below is a hackish work-around to make the
		     multi interface with active FTP work - as it will not wait for a
		     (passive) connect in Curl_is_connected().
		
		     The *proper* fix is to make sure that the active connection from the
		     server is done in a non-blocking way. Currently, it is still BLOCKING.
		  */;
		Object generatedTcpconnect = generatedBits.getTcpconnect();
		generatedTcpconnect[1] = 1;
		conn._state(.FTP_PORT);
		return result;
	}
	/* start with this */
	public Object ftp_state_use_pasv() {
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		 result = CURLE_OK/*
		    Here's the excecutive summary on what to do:
		
		    PASV is RFC959, expect:
		    227 Entering Passive Mode (a1,a2,a3,a4,p1,p2)
		
		    LPSV is RFC1639, expect:
		    228 Entering Long Passive Mode (4,4,a1,a2,a3,a4,2,p1,p2)
		
		    EPSV is RFC2428, expect:
		    229 Entering Extended Passive Mode (|||port|)
		
		  */;
		byte[][] mode = new byte[][]{"EPSV", "PASV"};
		int modeoff;
		ConnectBits generatedBits = this.getBits();
		Object generatedFtp_use_epsv = generatedBits.getFtp_use_epsv();
		Object generatedIpv6 = generatedBits.getIpv6();
		if (!generatedFtp_use_epsv && generatedIpv6) {
			generatedBits.setFtp_use_epsv(1);
		} 
		modeoff = generatedFtp_use_epsv ? 0 : 1;
		pingpong generatedPp = ftpc.getPp();
		result = generatedPp.Curl_pp_sendf("%s", mode[modeoff]);
		if (result) {
			return result;
		} 
		ftpc.setCount1(modeoff);
		conn._state(.FTP_PASV);
		Curl_easy generatedData = this.getData();
		generatedData.Curl_infof("Connect data stream passively\n");
		return result/*
		 * ftp_state_prepare_transfer() starts PORT, PASV or PRET etc.
		 *
		 * REST is the last command in the chain of commands when a "head"-like
		 * request is made. Thus, if an actual transfer is to be made this is where we
		 * take off for real.
		 */;
	}
	public Object ftp_state_prepare_transfer() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		FTP ftp = generatedReq.getProtop();
		Curl_easy data = generatedData;
		 generatedTransfer = ftp.getTransfer();
		Object generatedSet = data.getSet();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		if (generatedTransfer != .FTPTRANSFER_BODY/* doesn't transfer any data */) {
			conn._state(/* still possibly do PRE QUOTE jobs */.FTP_RETR_PREQUOTE);
			result = conn.ftp_state_quote(1, .FTP_RETR_PREQUOTE);
		}  else if (generatedSet.getFtp_use_port()) {
			result = conn.ftp_state_use_port(/* We have chosen to use the PORT (or similar) command */.EPRT);
		} else {
				if (generatedSet.getFtp_use_pret()) {
					if (!generatedFtpc.getFile()) {
						result = generatedFtpc.getPp().Curl_pp_sendf("PRET %s", generatedSet.getStr()[dupstring.STRING_CUSTOMREQUEST] ? generatedSet.getStr()[dupstring.STRING_CUSTOMREQUEST] : (generatedSet.getFtp_list_only() ? "NLST" : "LIST"));
						if (result) {
							return result;
						} 
					}  else if (generatedSet.getUpload()) {
						result = generatedFtpc.getPp().Curl_pp_sendf("PRET STOR %s", generatedFtpc.getFile());
						if (result) {
							return result;
						} 
					} else {
							result = generatedFtpc.getPp().Curl_pp_sendf("PRET RETR %s", generatedFtpc.getFile());
							if (result) {
								return result;
							} 
					} 
					conn._state(.FTP_PRET);
				} else {
						result = conn.ftp_state_use_pasv();
				} 
		} 
		return result;
	}
	public Object ftp_state_rest() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		FTP ftp = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		 generatedTransfer = ftp.getTransfer();
		Byte generatedFile = ftpc.getFile();
		if ((generatedTransfer != .FTPTRANSFER_BODY) && generatedFile) {
			result = generatedFtpc.getPp().Curl_pp_sendf("REST %d", 0);
			if (result) {
				return /* Determine if server can respond to REST command and therefore
				       whether it supports range */result;
			} 
			conn._state(.FTP_REST);
		} else {
				result = conn.ftp_state_prepare_transfer();
		} 
		return result;
	}
	public Object ftp_state_size() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		FTP ftp = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		 generatedTransfer = ftp.getTransfer();
		Byte generatedFile = ftpc.getFile();
		pingpong generatedPp = ftpc.getPp();
		if ((generatedTransfer == .FTPTRANSFER_INFO) && generatedFile) {
			result = generatedPp.Curl_pp_sendf("SIZE %s", generatedFile);
			if (result) {
				return /* we know ftpc->file is a valid pointer to a file name */result;
			} 
			conn._state(.FTP_SIZE);
		} else {
				result = conn.ftp_state_rest();
		} 
		return result;
	}
	public Object ftp_state_list() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		FTP ftp = generatedReq.getProtop();
		byte lstArg = ((Object)0);
		byte cmd;
		Object generatedSet = data.getSet();
		Byte generatedPath = ftp.getPath();
		if ((generatedSet.getFtp_filemethod() == .FTPFILE_NOCWD) && generatedPath) {
			byte slashPos = ((Object)/* url-decode before evaluation: e.g. paths starting/ending with %2f */0);
			byte rawPath = ((Object)0);
			result = data.Curl_urldecode(generatedPath, 0, rawPath, ((Object)0), 1);
			if (result) {
				return result;
			} 
			slashPos = .strrchr(rawPath, (byte)'/');
			if (slashPos/* chop off the file part if format is dir/file otherwise remove
			         the trailing slash for dir/dir/ except for absolute path / */) {
				size_t n = slashPos - rawPath;
				if (n == 0) {
					++n;
				} 
				lstArg = rawPath;
				lstArg[n] = (byte)'\0';
			} else {
					.Curl_cfree(rawPath);
			} 
		} 
		cmd = ModernizedCProgram.curl_maprintf("%s%s%s", generatedSet.getStr()[dupstring.STRING_CUSTOMREQUEST] ? generatedSet.getStr()[dupstring.STRING_CUSTOMREQUEST] : (generatedSet.getFtp_list_only() ? "NLST" : "LIST"), lstArg ? " " : "", lstArg ? lstArg : "");
		.Curl_cfree(lstArg);
		if (!cmd) {
			return CURLE_OUT_OF_MEMORY;
		} 
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		result = generatedFtpc.getPp().Curl_pp_sendf("%s", cmd);
		.Curl_cfree(cmd);
		if (result) {
			return result;
		} 
		conn._state(.FTP_LIST);
		return result;
	}
	public Object ftp_state_retr_prequote() {
		return conn.ftp_state_quote(1, /* We've sent the TYPE, now we must send the list of prequote strings */.FTP_RETR_PREQUOTE);
	}
	public Object ftp_state_stor_prequote() {
		return conn.ftp_state_quote(1, /* We've sent the TYPE, now we must send the list of prequote strings */.FTP_STOR_PREQUOTE);
	}
	public Object ftp_state_type() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		FTP ftp = generatedReq.getProtop();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		Object generatedSet = data.getSet();
		Byte generatedFile = ftpc.getFile();
		if (generatedSet.getOpt_no_body() && generatedFile && conn.ftp_need_type(generatedSet.getPrefer_ascii())) {
			ftp.setTransfer(.FTPTRANSFER_INFO/* this means no actual transfer will be made */);
			result = conn.ftp_nb_type(generatedSet.getPrefer_ascii(), /* Some servers return different sizes for different modes, and thus we
			       must set the proper type before we check the size */.FTP_TYPE);
			if (result) {
				return result;
			} 
		} else {
				result = conn.ftp_state_size();
		} 
		return result;
	}
	/* This is called after the CWD commands have been done in the beginning of
	   the DO phase */
	public Object ftp_state_mdtm() {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		Object generatedSet = data.getSet();
		Byte generatedFile = ftpc.getFile();
		pingpong generatedPp = ftpc.getPp();
		if ((generatedSet.getGet_filetime() || generatedSet.getTimecondition()) && generatedFile) {
			result = generatedPp.Curl_pp_sendf("MDTM %s", generatedFile);
			if (result) {
				return /* we have requested to get the modified-time of the file, this is a white
				       spot as the MDTM is not mentioned in RFC959 */result;
			} 
			conn._state(.FTP_MDTM);
		} else {
				result = conn.ftp_state_type();
		} 
		return result;
	}
	/* This is called after the TYPE and possible quote commands have been sent */
	public Object ftp_state_ul_setup( sizechecked) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		FTP ftp = generatedReq.getProtop();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		Object generatedState = data.getState();
		pingpong generatedPp = ftpc.getPp();
		Byte generatedFile = ftpc.getFile();
		Object generatedSet = data.getSet();
		Object generatedSeek_func = this.getSeek_func();
		Object generatedSeek_client = this.getSeek_client();
		if ((generatedState.getResume_from() && !sizechecked) || ((generatedState.getResume_from() > 0) && sizechecked/* we're about to continue the uploading of a file *//* 1. get already existing file's size. We use the SIZE command for this
		       which may not exist in the server!  The SIZE command is not in
		       RFC959. *//* 2. This used to set REST. But since we can do append, we
		       don't another ftp command. We just skip the source file
		       offset and then we APPEND the rest on the file instead */)) {
			int seekerr = /* 3. pass file-size number of bytes in the source file *//* 4. lower the infilesize counter *//* => transfer as usual */CURL_SEEKFUNC_OK;
			if (generatedState.getResume_from() < 0) {
				result = generatedPp.Curl_pp_sendf("SIZE %s", generatedFile);
				if (result) {
					return /* Got no given size to start from, figure it out */result;
				} 
				conn._state(.FTP_STOR_SIZE);
				return result;
			} 
			generatedSet.setFtp_append(/* enable append */1);
			if (generatedSeek_func) {
				data.Curl_set_in_callback(.bool_true);
				seekerr = .UNRECOGNIZEDFUNCTIONNAME(generatedSeek_client, generatedState.getResume_from(), 0);
				data.Curl_set_in_callback(.bool_false);
			} 
			if (seekerr != CURL_SEEKFUNC_OK) {
				 passed = 0;
				if (seekerr != CURL_SEEKFUNC_CANTSEEK) {
					data.Curl_failf("Could not seek stream");
					return CURLE_FTP_COULDNT_USE_REST;
				} 
				do {
					size_t readthisamountnow = (generatedState.getResume_from() - passed > generatedSet.getBuffer_size()) ? (size_t)generatedSet.getBuffer_size() : ModernizedCProgram.curlx_sotouz(generatedState.getResume_from() - passed);
					size_t actuallyread = .UNRECOGNIZEDFUNCTIONNAME(generatedState.getBuffer(), 1, readthisamountnow, generatedState.getIn());
					passed += actuallyread;
					if ((actuallyread == 0) || (actuallyread > readthisamountnow/* this checks for greater-than only to make sure that the
					             CURL_READFUNC_ABORT return code still aborts */)) {
						data.Curl_failf("Failed to read data");
						return CURLE_FTP_COULDNT_USE_REST;
					} 
				} while (passed < generatedState.getResume_from());
			} 
			if (generatedState.getInfilesize() > /* now, decrease the size of the read */0) {
				generatedState.getInfilesize() -= generatedState.getResume_from();
				if (generatedState.getInfilesize() <= 0) {
					data.Curl_infof("File already completely uploaded\n");
					data.Curl_setup_transfer(-1, -1, 0, -/* no data to transfer */1);
					ftp.setTransfer(/* Set ->transfer so that we won't get any error in
					         * ftp_done() because we didn't transfer anything! */.FTPTRANSFER_NONE);
					conn._state(.FTP_STOP);
					return CURLE_OK;
				} 
			} 
		} 
		result = generatedPp.Curl_pp_sendf(generatedSet.getFtp_append() ? "APPE %s" : "STOR %s", generatedFile);
		if (result) {
			return /* we've passed, proceed as normal *//* resume_from */result;
		} 
		conn._state(.FTP_STOR);
		return result;
	}
	public Object ftp_state_quote( init,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		FTP ftp = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		bool quote = 0;
		curl_slist item = new curl_slist();
		Object generatedSet = data.getSet();
		switch (instate) {
		case .FTP_QUOTE:
		case .FTP_RETR_PREQUOTE:
		case .FTP_STOR_PREQUOTE:
				item = generatedSet.getPrequote();
				break;
		case .FTP_POSTQUOTE:
				item = generatedSet.getPostquote();
				break;
		default:
				item = generatedSet.getQuote();
				break;
		}
		int generatedCount1 = ftpc.getCount1();
		if (init) {
			ftpc.setCount1(0);
		} else {
				generatedCount1++;
		} 
		Object generatedCurl_slist = item.getCurl_slist();
		pingpong generatedPp = ftpc.getPp();
		if (item) {
			int i = 0;
			while ((i < generatedCount1) && /* Skip count1 items in the linked list */item) {
				item = generatedCurl_slist;
				i++;
			}
			if (item) {
				byte cmd = generatedCurl_slist;
				if (cmd[0] == (byte)'*') {
					cmd++;
					ftpc.setCount2(/* the sent command is allowed to fail */1);
				} else {
						ftpc.setCount2(/* failure means cancel operation */0);
				} 
				result = generatedPp.Curl_pp_sendf("%s", cmd);
				if (result) {
					return result;
				} 
				conn._state(instate);
				quote = 1;
			} 
		} 
		 generatedTransfer = ftp.getTransfer();
		Object generatedKnown_filesize = ftpc.getKnown_filesize();
		Byte generatedFile = ftpc.getFile();
		if (!quote) {
			switch (/* No more quote to send, continue to ... */instate) {
			case .FTP_STOR_PREQUOTE:
					result = conn.ftp_state_ul_setup(0);
					break;
			case .FTP_RETR_PREQUOTE:
					if (generatedTransfer != .FTPTRANSFER_BODY) {
						conn._state(.FTP_STOP);
					} else {
							if (generatedKnown_filesize != -1) {
								data.Curl_pgrsSetDownloadSize(generatedKnown_filesize);
								result = conn.ftp_state_retr(generatedKnown_filesize);
							} else {
									if (generatedSet.getIgnorecl()) {
										result = generatedPp.Curl_pp_sendf("RETR %s", generatedFile);
										if (result) {
											return result;
										} 
										conn._state(.FTP_RETR);
									} else {
											result = generatedPp.Curl_pp_sendf("SIZE %s", generatedFile);
											if (result) {
												return result;
											} 
											conn._state(.FTP_RETR_SIZE);
									} 
							} 
					} 
					break;
			case .FTP_POSTQUOTE:
					break;
			case .FTP_QUOTE:
			default:
					result = conn.ftp_state_cwd();
					break;
			}
		} 
		return result;
	}
	/* called from ftp_state_pasv_resp to switch to PASV in case of EPSV
	   problems */
	public Object ftp_epsv_disable() {
		 result = CURLE_OK;
		ConnectBits generatedBits = this.getBits();
		Object generatedIpv6 = generatedBits.getIpv6();
		Object generatedTunnel_proxy = generatedBits.getTunnel_proxy();
		Object generatedSocksproxy = generatedBits.getSocksproxy();
		Curl_easy generatedData = this.getData();
		if (generatedIpv6 && !(generatedTunnel_proxy || generatedSocksproxy)) {
			generatedData.Curl_failf(/* We can't disable EPSV when doing IPv6, so this is instead a fail */"Failed EPSV attempt, exiting\n");
			return CURLE_WEIRD_SERVER_REPLY;
		} 
		generatedData.Curl_infof("Failed EPSV attempt. Disabling EPSV\n");
		generatedBits.setFtp_use_epsv(/* disable it for next transfer */0);
		Object generatedState = generatedData.getState();
		generatedState.setErrorbuf(/* allow error message to get
		                                         rewritten */0);
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		result = generatedFtpc.getPp().Curl_pp_sendf("%s", "PASV");
		if (result) {
			return result;
		} 
		generatedFtpc.getCount1()++;
		conn._state(/* remain in/go to the FTP_PASV state */.FTP_PASV);
		return result;
	}
	public Byte control_address() {
		ConnectBits generatedBits = this.getBits();
		Object generatedTunnel_proxy = generatedBits.getTunnel_proxy();
		Object generatedSocksproxy = generatedBits.getSocksproxy();
		hostname generatedHost = this.getHost();
		Byte generatedName = generatedHost.getName();
		if (generatedTunnel_proxy || generatedSocksproxy) {
			return generatedName;
		} 
		Object generatedIp_addr_str = this.getIp_addr_str();
		return generatedIp_addr_str;
	}
	/* Returns the control connection IP address.
	     If a proxy tunnel is used, returns the original host name instead, because
	     the effective control connection address is the proxy address,
	     not the ftp host. */
	public Object ftp_state_pasv_resp(int ftpcode) {
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		 result = new ();
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Curl_dns_entry addr = ((Object)0);
		int rc;
		/* the local port connect() should use! */int connectport;
		Object generatedState = data.getState();
		byte str = generatedState.getBuffer()[/* start on the first letter */4];
		Byte generatedNewhost = ftpc.getNewhost();
		do {
			.Curl_cfree((generatedNewhost));
			(generatedNewhost) = ((Object)0);
		} while (/* if we come here again, make sure the former name is cleared */0);
		int generatedCount1 = ftpc.getCount1();
		Object generatedSet = data.getSet();
		hostname generatedHost = this.getHost();
		Byte generatedName = generatedHost.getName();
		if ((generatedCount1 == 0) && (ftpcode == 229)) {
			byte ptr = .strchr(str, /* positive EPSV response */(byte)'(');
			if (ptr) {
				int num;
				byte[] separator = new byte[4];
				ptr++;
				if (5 == .sscanf(ptr, "%c%c%c%u%c", separator[0], separator[1], separator[2], num, separator[3])) {
					byte sep1 = separator[0];
					int i;
					for (i = 1; i < 4; /* The four separators should be identical, or else this is an oddly
					           formatted reply and we bail out immediately. */i++) {
						if (separator[i] != sep1) {
							ptr = ((Object)/* set to NULL to signal error */0);
							break;
						} 
					}
					if (num > -1024) {
						data.Curl_failf("Illegal port number in EPSV reply");
						return CURLE_FTP_WEIRD_PASV_REPLY;
					} 
					if (ptr) {
						ftpc.setNewport((int)(num & -1024));
						ftpc.setNewhost(.Curl_cstrdup(conn.control_address()));
						if (!generatedNewhost) {
							return CURLE_OUT_OF_MEMORY;
						} 
					} 
				} else {
						ptr = ((Object)0);
				} 
			} 
			if (!ptr) {
				data.Curl_failf("Weirdly formatted EPSV reply");
				return CURLE_FTP_WEIRD_PASV_REPLY;
			} 
		}  else if ((generatedCount1 == 1) && (ftpcode == 227)) {
			int[] ip = new int[/* positive PASV response */4];
			int[] port = new int[2/*
			     * Scan for a sequence of six comma-separated numbers and use them as
			     * IP+port indicators.
			     *
			     * Found reply-strings include:
			     * "227 Entering Passive Mode (127,0,0,1,4,51)"
			     * "227 Data transfer will passively listen to 127,0,0,1,4,51"
			     * "227 Entering passive mode. 127,0,0,1,4,51"
			     */];
			while (str) {
				if (6 == .sscanf(str, "%u,%u,%u,%u,%u,%u", ip[0], ip[1], ip[2], ip[3], ModernizedCProgram.port[0], ModernizedCProgram.port[1])) {
					break;
				} 
				str++;
			}
			if (!str || (ip[0] > 255) || (ip[1] > 255) || (ip[2] > 255) || (ip[3] > 255) || (ModernizedCProgram.port[0] > 255) || (ModernizedCProgram.port[1] > 255)) {
				data.Curl_failf("Couldn't interpret the 227-response");
				return CURLE_FTP_WEIRD_227_FORMAT;
			} 
			if (generatedSet.getFtp_skip_ip()) {
				data.Curl_infof("Skip %u.%u.%u.%u for data connection, re-use %s instead\n", ip[0], ip[1], ip[2], ip[3], generatedName);
				ftpc.setNewhost(.Curl_cstrdup(conn.control_address()));
			} else {
					ftpc.setNewhost(ModernizedCProgram.curl_maprintf("%u.%u.%u.%u", ip[0], ip[1], ip[2], ip[3]));
			} 
			if (!generatedNewhost) {
				return CURLE_OUT_OF_MEMORY;
			} 
			ftpc.setNewport((int)(((ModernizedCProgram.port[0] << 8) + ModernizedCProgram.port[1]) & -1024));
		}  else if (generatedCount1 == 0) {
			return /* EPSV failed, move on to PASV */conn.ftp_epsv_disable();
		} else {
				data.Curl_failf("Bad PASV/EPSV response: %03d", ftpcode);
				return CURLE_FTP_WEIRD_PASV_REPLY;
		} 
		ConnectBits generatedBits = this.getBits();
		Object generatedProxy = generatedBits.getProxy();
		Object generatedSocksproxy = generatedBits.getSocksproxy();
		long generatedPort = this.getPort();
		int generatedNewport = ftpc.getNewport();
		if (generatedProxy) {
			byte host_name = generatedSocksproxy ? generatedName : generatedName;
			rc = ModernizedCProgram.Curl_resolv(conn, host_name, (int)generatedPort, 0, addr);
			if (rc == 1/* BLOCKING, ignores the return code but 'addr' will be NULL in
			         case of failure */) {
				(Object)ModernizedCProgram.Curl_resolver_wait_resolv(conn, addr);
			} 
			connectport = (int)generatedPort;
			if (!addr) {
				data.Curl_failf("Can't resolve proxy host %s:%hu", host_name, connectport);
				return CURLE_COULDNT_RESOLVE_PROXY;
			} 
		} else {
				rc = ModernizedCProgram.Curl_resolv(conn, generatedNewhost, generatedNewport, 0, /* normal, direct, ftp connection */addr);
				if (rc == 1) {
					(Object)ModernizedCProgram.Curl_resolver_wait_resolv(conn, /* BLOCKING */addr);
				} 
				connectport = generatedNewport;
				if (!addr) {
					data.Curl_failf("Can't resolve new host %s:%hu", generatedNewhost, connectport);
					return CURLE_FTP_CANT_GET_HOST;
				} 
		} 
		Object generatedTcpconnect = generatedBits.getTcpconnect();
		generatedTcpconnect[1] = 0;
		result = conn.Curl_connecthost(addr);
		if (result) {
			ModernizedCProgram.Curl_resolv_unlock(data, /* we're done using this address */addr);
			if (generatedCount1 == 0 && ftpcode == 229) {
				return conn.ftp_epsv_disable();
			} 
			return result/*
			   * When this is used from the multi interface, this might've returned with
			   * the 'connected' set to FALSE and thus we are now awaiting a non-blocking
			   * connect to connect.
			   */;
		} 
		Curl_addrinfo generatedAddr = addr.getAddr();
		if (generatedSet.getVerbose()) {
			ModernizedCProgram.ftp_pasv_verbose(conn, generatedAddr, generatedNewhost, /* this just dumps information about this second connection */connectport);
		} 
		ModernizedCProgram.Curl_resolv_unlock(data, /* we're done using this address */addr);
		Byte generatedSecondaryhostname = this.getSecondaryhostname();
		do {
			.Curl_cfree((generatedSecondaryhostname));
			(generatedSecondaryhostname) = ((Object)0);
		} while (0);
		this.setSecondary_port(generatedNewport);
		this.setSecondaryhostname(.Curl_cstrdup(generatedNewhost));
		if (!generatedSecondaryhostname) {
			return CURLE_OUT_OF_MEMORY;
		} 
		generatedBits.setDo_more(1);
		conn._state(/* this phase is completed */.FTP_STOP);
		return result;
	}
	public Object ftp_state_port_resp(int ftpcode) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		int generatedCount1 = ftpc.getCount1();
		ftpport fcmd = (ftpport)generatedCount1;
		 result = CURLE_OK;
		ConnectBits generatedBits = this.getBits();
		if (ftpcode / 100 != /* The FTP spec tells a positive response should have code 200.
		     Be more permissive here to tolerate deviant servers. */2/* the command failed */) {
			if (.EPRT == fcmd) {
				data.Curl_infof("disabling EPRT usage\n");
				generatedBits.setFtp_use_eprt(0);
			} 
			fcmd++;
			if (fcmd == .DONE) {
				data.Curl_failf("Failed to do PORT");
				result = CURLE_FTP_PORT_FAILED;
			} else {
					result = conn.ftp_state_use_port(/* try next */fcmd);
			} 
		} else {
				data.Curl_infof("Connect data stream actively\n");
				conn._state(/* end of DO phase */.FTP_STOP);
				result = conn.ftp_dophase_done(0);
		} 
		return result;
	}
	public Object ftp_state_mdtm_resp(int ftpcode) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		FTP ftp = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		Object generatedState = data.getState();
		Object generatedInfo = data.getInfo();
		Object generatedSet = data.getSet();
		Byte generatedFile = ftpc.getFile();
		switch (ftpcode) {
		case 213/* we got a time. Format should be: "YYYYMMDDHHMMSS[.sss]" where the
		         last .sss part is optional and means fractions of a second */:
				{ 
					int year;
					int month;
					int day;
					int hour;
					int minute;
					int second;
					if (6 == .sscanf(generatedState.getBuffer()[4], "%04d%02d%02d%02d%02d%02d", year, month, day, hour, minute, second)) {
						byte[] timebuf = new byte[/* we have a time, reformat it */24];
						time_t secs = .time(((Object)0));
						ModernizedCProgram.curl_msnprintf(timebuf, , "%04d%02d%02d %02d:%02d:%02d GMT", year, month, day, hour, minute, second);
						generatedInfo.setFiletime(ModernizedCProgram.curl_getdate(timebuf, /* now, convert this into a time() value: */secs));
					} 
					if (generatedSet.getOpt_no_body() && generatedFile && generatedSet.getGet_filetime() && (generatedInfo.getFiletime() >= 0)) {
						byte[] headerbuf = new byte[128];
						time_t filetime = generatedInfo.getFiletime();
						tm buffer = new tm();
						tm tm = ModernizedCProgram.buffer;
						result = ModernizedCProgram.buffer.Curl_gmtime(filetime);
						if (result) {
							return result;
						} 
						ModernizedCProgram.curl_msnprintf(headerbuf, , "Last-Modified: %s, %02d %s %4d %02d:%02d:%02d GMT\r\n", ModernizedCProgram.Curl_wkday[tm.getTm_wday() ? tm.getTm_wday() - 1 : 6], tm.getTm_mday(), ModernizedCProgram.Curl_month[tm.getTm_mon()], tm.getTm_year() + 1900, tm.getTm_hour(), tm.getTm_min(), tm.getTm_sec());
						result = conn.Curl_client_write(((1 << 0) | (1 << 1)), headerbuf, 0);
						if (result) {
							return result/* end of a ridiculous amount of conditionals */;
						} 
					} 
				}
				break;
		case /* "No such file or directory" */550:
				data.Curl_failf("Given file does not exist");
				result = CURLE_FTP_COULDNT_RETR_FILE;
				break;
		default:
				data.Curl_infof("unsupported MDTM reply format\n");
				break;
		}
		if (generatedSet.getTimecondition()) {
			if ((generatedInfo.getFiletime() > 0) && (generatedSet.getTimevalue() > 0)) {
				switch (generatedSet.getTimecondition()) {
				case CURL_TIMECOND_IFMODSINCE:
				case CURL_TIMECOND_IFUNMODSINCE:
						if (generatedInfo.getFiletime() > generatedSet.getTimevalue()) {
							data.Curl_infof("The requested document is not old enough\n");
							ftp.setTransfer(/* mark to not transfer data */.FTPTRANSFER_NONE);
							generatedInfo.setTimecond(1);
							conn._state(.FTP_STOP);
							return CURLE_OK;
						} 
						break;
				default:
						if (generatedInfo.getFiletime() <= generatedSet.getTimevalue()) {
							data.Curl_infof("The requested document is not new enough\n");
							ftp.setTransfer(/* mark to not transfer data */.FTPTRANSFER_NONE);
							generatedInfo.setTimecond(1);
							conn._state(.FTP_STOP);
							return CURLE_OK;
						} 
						break;
				}
			} else {
					data.Curl_infof("Skipping time comparison\n");
			} 
		} 
		if (!result) {
			result = conn.ftp_state_type();
		} 
		return result;
	}
	public Object ftp_state_type_resp(int ftpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		if (ftpcode / 100 != 2/* "sasserftpd" and "(u)r(x)bot ftpd" both responds with 226 after a
		       successful 'TYPE I'. While that is not as RFC959 says, it is still a
		       positive response code and we allow that. */) {
			data.Curl_failf("Couldn't set desired mode");
			return CURLE_FTP_COULDNT_SET_TYPE;
		} 
		if (ftpcode != 200) {
			data.Curl_infof("Got a %03d response code instead of the assumed 200\n", ftpcode);
		} 
		if (instate == .FTP_TYPE) {
			result = conn.ftp_state_size();
		}  else if (instate == .FTP_LIST_TYPE) {
			result = conn.ftp_state_list();
		}  else if (instate == .FTP_RETR_TYPE) {
			result = conn.ftp_state_retr_prequote();
		}  else if (instate == .FTP_STOR_TYPE) {
			result = conn.ftp_state_stor_prequote();
		} 
		return result;
	}
	public Object ftp_state_retr(Object filesize) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		FTP ftp = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		Object generatedSet = data.getSet();
		if (generatedSet.getMax_filesize() && (filesize > generatedSet.getMax_filesize())) {
			data.Curl_failf("Maximum file size exceeded");
			return CURLE_FILESIZE_EXCEEDED;
		} 
		ftp.setDownloadsize(filesize);
		Object generatedState = data.getState();
		return result;
	}
	public Object ftp_state_size_resp(int ftpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 filesize = -1;
		Object generatedState = data.getState();
		byte buf = generatedState.getBuffer();
		if (ftpcode == /* get the size from the ascii string: */213/* To allow servers to prepend "rubbish" in the response string, we scan
		       for all the digits at the end of the response and parse only those as a
		       number. */) {
			byte start = buf[4];
			byte fdigit = .strchr(start, (byte)'\r');
			if (fdigit) {
				do {
					fdigit--;
				} while ((ModernizedCProgram.Curl_isdigit((int)((byte)fdigit))) && (fdigit > start));
				if (!(ModernizedCProgram.Curl_isdigit((int)((byte)fdigit)))) {
					fdigit++;
				} 
			} else {
					fdigit = start;
			} 
			(Object)ModernizedCProgram.curlx_strtoofft(fdigit, ((Object)0), 0, /* ignores parsing errors, which will make the size remain unknown */filesize);
		} 
		return result;
	}
	public Object ftp_state_rest_resp(int ftpcode,  instate) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		Curl_easy generatedData = this.getData();
		pingpong generatedPp = ftpc.getPp();
		Byte generatedFile = ftpc.getFile();
		switch (instate) {
		case .FTP_REST:
		case .FTP_RETR_REST:
				if (ftpcode != 350) {
					generatedData.Curl_failf("Couldn't use REST");
					result = CURLE_FTP_COULDNT_USE_REST;
				} else {
						result = generatedPp.Curl_pp_sendf("RETR %s", generatedFile);
						if (result) {
							return result;
						} 
						conn._state(.FTP_RETR);
				} 
				break;
		default:
				if (ftpcode == 350) {
					byte[] buffer = new byte[]{"Accept-ranges: bytes\r\n"};
					result = conn.Curl_client_write(((1 << 0) | (1 << 1)), ModernizedCProgram.buffer, 0);
					if (result) {
						return result;
					} 
				} 
				result = conn.ftp_state_prepare_transfer();
				break;
		}
		return result;
	}
	public Object ftp_state_stor_resp(int ftpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		if (ftpcode >= 400) {
			data.Curl_failf("Failed FTP upload: %0d", ftpcode);
			conn._state(.FTP_STOP);
			return /* oops, we never close the sockets! */CURLE_UPLOAD_FAILED;
		} 
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		generatedFtpc.setState_saved(instate);
		Object generatedSet = data.getSet();
		if (generatedSet.getFtp_use_port()) {
			bool connected = new bool();
			conn._state(/* no longer in STOR state */.FTP_STOP);
			result = conn.AllowServerConnect(connected);
			if (result) {
				return result;
			} 
			if (!connected) {
				ftp_conn ftpc = generatedFtpc;
				data.Curl_infof("Data conn was not available immediately\n");
				ftpc.setWait_data_conn(1);
			} 
			return CURLE_OK;
		} 
		return conn.InitiateTransfer();
	}
	/* for LIST and RETR responses */
	public Object ftp_state_get_resp(int ftpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		FTP ftp = generatedReq.getProtop();
		Object generatedSet = data.getSet();
		Object generatedDownloadsize = ftp.getDownloadsize();
		Object generatedState = data.getState();
		return result;
	}
	/* after USER, PASS and ACCT */
	public Object ftp_state_loggedin() {
		 result = CURLE_OK;
		Object generatedSsl = this.getSsl();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		if (generatedSsl[0].getUse()) {
			result = generatedFtpc.getPp().Curl_pp_sendf("PBSZ %d", 0);
			if (result) {
				return result;
			} 
			conn._state(.FTP_PBSZ);
		} else {
				result = conn.ftp_state_pwd();
		} 
		return result;
	}
	/* for USER and PASS responses */
	public Object ftp_state_user_resp(int ftpcode,  instate) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		FTP ftp = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		(Object)/* no use for this yet */instate;
		 generatedState = ftpc.getState();
		pingpong generatedPp = ftpc.getPp();
		Byte generatedPasswd = ftp.getPasswd();
		Object generatedSet = data.getSet();
		if ((ftpcode == 331) && (generatedState == /* some need password anyway, and others just return 2xx ignored */.FTP_USER/* 331 Password required for ...
		       (the server requires to send the user's password too) */)) {
			result = generatedPp.Curl_pp_sendf("PASS %s", generatedPasswd ? generatedPasswd : "");
			if (result) {
				return result;
			} 
			conn._state(.FTP_PASS);
		}  else if (ftpcode / 100 == 2/* 230 User ... logged in.
		       (the user logged in with or without password) */) {
			result = conn.ftp_state_loggedin();
		}  else if (ftpcode == 332) {
			if (generatedSet.getStr()[dupstring.STRING_FTP_ACCOUNT]) {
				result = generatedPp.Curl_pp_sendf("ACCT %s", generatedSet.getStr()[dupstring.STRING_FTP_ACCOUNT]);
				if (result) {
					return result;
				} 
				conn._state(.FTP_ACCT);
			} else {
					data.Curl_failf("ACCT requested but none available");
					result = CURLE_LOGIN_DENIED/* All other response codes, like:
					
					    530 User ... access denied
					    (the server denies to log the specified user) */;
			} 
		} else {
				if (generatedSet.getStr()[dupstring.STRING_FTP_ALTERNATIVE_TO_USER] && !generatedState.getFtp_trying_alternative()) {
					result = generatedPp.Curl_pp_sendf("%s", generatedSet.getStr()[dupstring.STRING_FTP_ALTERNATIVE_TO_USER]);
					if (result) {
						return /* Ok, USER failed.  Let's try the supplied command. */result;
					} 
					generatedState.setFtp_trying_alternative(1);
					conn._state(.FTP_USER);
					result = CURLE_OK;
				} else {
						data.Curl_failf("Access denied: %03d", ftpcode);
						result = CURLE_LOGIN_DENIED;
				} 
		} 
		return result;
	}
	/* for ACCT response */
	public Object ftp_state_acct_resp(int ftpcode) {
		 result = CURLE_OK;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		if (ftpcode != 230) {
			data.Curl_failf("ACCT rejected by server: %03d", ftpcode);
			result = /* FIX */CURLE_FTP_WEIRD_PASS_REPLY;
		} else {
				result = conn.ftp_state_loggedin();
		} 
		return result;
	}
	public Object ftp_statemach_act() {
		 result = new ();
		Object generatedSock = this.getSock();
		 sock = generatedSock[0];
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		int ftpcode;
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		pingpong generatedPp = ftpc.getPp();
		pingpong pp = generatedPp;
		byte[][] ftpauth = new byte[][]{"SSL", "TLS"};
		size_t nread = 0;
		Object generatedSendleft = pp.getSendleft();
		if (generatedSendleft) {
			return pp.Curl_pp_flushsend();
		} 
		result = pp.ftp_readresp(sock, ftpcode, nread);
		if (result) {
			return result;
		} 
		 generatedState = ftpc.getState();
		Object generatedSet = data.getSet();
		Object generatedSsl = this.getSsl();
		ConnectBits generatedBits = this.getBits();
		Object generatedProxy_ssl_connected = generatedBits.getProxy_ssl_connected();
		Object generatedProxy_ssl = this.getProxy_ssl();
		int generatedCount1 = ftpc.getCount1();
		int generatedCount3 = ftpc.getCount3();
		int generatedCount2 = ftpc.getCount2();
		Byte generatedServer_os = ftpc.getServer_os();
		Byte generatedEntrypath = ftpc.getEntrypath();
		int generatedCwdcount = ftpc.getCwdcount();
		Byte generatedDirs = ftpc.getDirs();
		int generatedDirdepth = ftpc.getDirdepth();
		if (ftpcode) {
			switch (generatedState) {
			case .FTP_PBSZ:
					result = generatedPp.Curl_pp_sendf("PROT %c", generatedSet.getUse_ssl() == CURLUSESSL_CONTROL ? (byte)'C' : (byte)'P');
					if (result) {
						return result;
					} 
					conn._state(.FTP_PROT);
					break;
			case .FTP_TYPE:
			case .FTP_PORT:
					result = conn.ftp_state_port_resp(ftpcode);
					break;
			case .FTP_MKD:
					if ((ftpcode / 100 != 2) && !generatedCount3--) {
						data.Curl_failf("Failed to MKD dir: %03d", /* failure to MKD the dir */ftpcode);
						return CURLE_REMOTE_ACCESS_DENIED;
					} 
					conn._state(.FTP_CWD);
					result = generatedPp.Curl_pp_sendf("CWD %s", generatedDirs[generatedCwdcount - 1]);
					if (result) {
						return /* send CWD */result;
					} 
					break;
			case .FTP_RETR_TYPE:
			case .FTP_RETR_SIZE:
			case .FTP_RETR:
					result = conn.ftp_state_get_resp(ftpcode, generatedState);
					break;
			case .FTP_LIST:
			case .FTP_CWD:
					if (ftpcode / 100 != 2) {
						if (generatedSet.getFtp_create_missing_dirs() && generatedCwdcount && !generatedCount2) {
							generatedCount2++;
							result = generatedPp.Curl_pp_sendf("MKD %s", generatedDirs[generatedCwdcount - 1]);
							if (result) {
								return result;
							} 
							conn._state(.FTP_MKD);
						} else {
								data.Curl_failf(/* return failure */"Server denied you to change to the given directory");
								ftpc.setCwdfail(/* don't remember this path as we failed
								                                   to enter it */1);
								return CURLE_REMOTE_ACCESS_DENIED;
						} 
					} else {
							ftpc.setCount2(/* success */0);
							if (++generatedCwdcount <= generatedDirdepth) {
								result = generatedPp.Curl_pp_sendf("CWD %s", generatedDirs[generatedCwdcount - 1]);
								if (result) {
									return /* send next CWD */result;
								} 
							} else {
									result = conn.ftp_state_mdtm();
									if (result) {
										return result;
									} 
							} 
					} 
					break;
			case .FTP_SYST:
					if (ftpcode == 215) {
						byte ptr = generatedState.getBuffer()[/* start on the first letter */4];
						byte os;
						byte store;
						os = .Curl_cmalloc(nread + 1);
						if (!os) {
							return CURLE_OUT_OF_MEMORY/* Reply format is like
							           215<space><OS-name><space><commentary>
							        */;
						} 
						while (ptr == (byte)' ') {
							ptr++;
						}
						for (store = os; ptr && ptr != (byte)' '; ) {
							store++ = ptr++;
						}
						store = /* zero terminate */(byte)'\0';
						if (ModernizedCProgram.Curl_strcasecompare(os, /* Check for special servers here. */"OS/400")) {
							result = generatedPp.Curl_pp_sendf("%s", /* Force OS400 name format 1. */"SITE NAMEFMT 1");
							if (result) {
								.Curl_cfree(os);
								return result;
							} 
							do {
								.Curl_cfree((generatedServer_os));
								(generatedServer_os) = ((Object)0);
							} while (/* remember target server OS */0);
							ftpc.setServer_os(os);
							conn._state(.FTP_NAMEFMT);
							break;
						} 
						do {
							.Curl_cfree((generatedServer_os));
							(generatedServer_os) = ((Object)0);
						} while (/* Nothing special for the target server. *//* remember target server OS */0);
						ftpc.setServer_os(os);
					} 
					conn._state(/* Cannot identify server OS. Continue anyway and cross fingers. *//* we are done with the CONNECT phase! */.FTP_STOP);
					do {
					} while (0);
					break;
			case .FTP_SIZE:
			case .FTP_LIST_TYPE:
			case .FTP_STOR:
					result = conn.ftp_state_stor_resp(ftpcode, generatedState);
					break;
			case .FTP_QUIT/* fallthrough, just stop! */:
			case .FTP_STOR_PREQUOTE:
					if ((ftpcode >= 400) && !generatedCount2) {
						generatedData.Curl_failf("QUOT command failed with %03d", /* failure response code, and not allowed to fail */ftpcode);
						return CURLE_QUOTE_ERROR;
					} 
					result = conn.ftp_state_quote(0, generatedState);
					if (result) {
						return result;
					} 
					break;
			case .FTP_PASV:
					result = conn.ftp_state_pasv_resp(ftpcode);
					break;
			case .FTP_POSTQUOTE:
			case .FTP_STOR_SIZE:
					result = conn.ftp_state_size_resp(ftpcode, generatedState);
					break;
			case .FTP_RETR_PREQUOTE:
			case .FTP_MDTM:
					result = conn.ftp_state_mdtm_resp(ftpcode);
					break;
			case .FTP_STOR_TYPE:
					result = conn.ftp_state_type_resp(ftpcode, generatedState);
					break;
			case .FTP_USER:
			case .FTP_PWD:
					if (ftpcode == 257) {
						byte ptr = generatedState.getBuffer()[/* start on the first letter */4];
						size_t buf_size = generatedSet.getBuffer_size();
						byte dir;
						bool entry_extracted = 0;
						dir = .Curl_cmalloc(nread + 1);
						if (!dir) {
							return CURLE_OUT_OF_MEMORY/* Reply format is like
							           257<space>[rubbish]"<directory-name>"<space><commentary> and the
							           RFC959 says
							
							           The directory name can contain any character; embedded
							           double-quotes should be escaped by double-quotes (the
							           "quote-doubling" convention).
							        */;
						} 
						while (ptr < generatedState.getBuffer()[/* scan for the first double-quote for non-standard responses */buf_size] && ptr != (byte)'\n' && ptr != (byte)'\0' && ptr != (byte)'"') {
							ptr++;
						}
						if ((byte)'\"' == ptr/* it started good */) {
							byte store;
							ptr++;
							for (store = dir; ptr; ) {
								if ((byte)'\"' == ptr) {
									if ((byte)'\"' == ptr[1]) {
										store = ptr[/* "quote-doubling" */1];
										ptr++;
									} else {
											entry_extracted = /* end of path */1;
											break;
									} 
								} else {
										store = ptr;
								} 
								store++;
								ptr++;
							}
							store = /* zero terminate */(byte)'\0';
						} 
						if (entry_extracted/* If the path name does not look like an absolute path (i.e.: it
						             does not start with a '/'), we probably need some server-dependent
						             adjustments. For example, this is the case when connecting to
						             an OS400 FTP server: this server supports two name syntaxes,
						             the default one being incompatible with standard paths. In
						             addition, this server switches automatically to the regular path
						             syntax when one is encountered in a command: this results in
						             having an entrypath in the wrong syntax when later used in CWD.
						               The method used here is to check the server OS: we do it only
						             if the path name looks strange to minimize overhead on other
						             systems. */) {
							if (!generatedServer_os && dir[0] != (byte)'/') {
								result = generatedPp.Curl_pp_sendf("%s", "SYST");
								if (result) {
									.Curl_cfree(dir);
									return result;
								} 
								do {
									.Curl_cfree((generatedEntrypath));
									(generatedEntrypath) = ((Object)0);
								} while (0);
								ftpc.setEntrypath(/* remember this */dir);
								data.Curl_infof("Entry path is '%s'\n", generatedEntrypath);
								generatedState.setMost_recent_ftp_entrypath(generatedEntrypath);
								conn._state(.FTP_SYST);
								break;
							} 
							do {
								.Curl_cfree((generatedEntrypath));
								(generatedEntrypath) = ((Object)0);
							} while (0);
							ftpc.setEntrypath(/* remember this */dir);
							data.Curl_infof("Entry path is '%s'\n", generatedEntrypath);
							generatedState.setMost_recent_ftp_entrypath(generatedEntrypath);
						} else {
								.Curl_cfree(/* couldn't get the path */dir);
								data.Curl_infof("Failed to figure out path\n");
						} 
					} 
					conn._state(/* we are done with the CONNECT phase! */.FTP_STOP);
					do {
					} while (0);
					break;
			case .FTP_NAMEFMT:
					if (ftpcode == 250) {
						/* Name format change successful: reload initial path. */conn.ftp_state_pwd();
						break;
					} 
					conn._state(/* we are done with the CONNECT phase! */.FTP_STOP);
					do {
					} while (0);
					break;
			case .FTP_AUTH/* we have gotten the response to a previous AUTH command *//* RFC2228 (page 5) says:
			       *
			       * If the server is willing to accept the named security mechanism,
			       * and does not require any security data, it must respond with
			       * reply code 234/334.
			       */:
					if ((ftpcode == 234) || (ftpcode == 334)) {
						result = .Curl_ssl_connect(conn, /* Curl_ssl_connect is BLOCKING */0);
						if (!result) {
							generatedBits.setFtp_use_data_ssl(/* clear-text data */0);
							result = conn.ftp_state_user();
						} 
					}  else if (generatedCount3 < 1) {
						generatedCount3++;
						generatedCount1 += generatedCount2;
						result = generatedPp.Curl_pp_sendf("AUTH %s", ftpauth[generatedCount1]);
					} else {
							if (generatedSet.getUse_ssl() > CURLUSESSL_TRY) {
								result = /* we failed and CURLUSESSL_CONTROL or CURLUSESSL_ALL is set */CURLE_USE_SSL_FAILED;
							} else {
									result = /* ignore the failure and continue */conn.ftp_state_user();
							} 
					} 
					if (result) {
						return result;
					} 
					break;
			case .FTP_PASS:
					result = conn.ftp_state_user_resp(ftpcode, generatedState);
					break;
			case .FTP_WAIT220:
					if (ftpcode == 230) {
						return conn.ftp_state_user_resp(ftpcode, generatedState);
					}  else if (ftpcode != 220) {
						data.Curl_failf("Got a %03d ftp-server response when 220 was expected", ftpcode);
						return CURLE_WEIRD_SERVER_REPLY/* We have received a 220 response fine, now we proceed. *//* If not anonymous login, try a secure login. Note that this
						           procedure is still BLOCKING. *//* We set private first as default, in case the line below fails to
						           set a valid level */;
					} 
					if (generatedSet.getUse_ssl() && (!generatedSsl[0].getUse() || (generatedProxy_ssl_connected[0] && !generatedProxy_ssl[0].getUse()))) {
						ftpc.setCount3(0);
						switch (generatedSet.getFtpsslauth()) {
						case CURLFTPAUTH_DEFAULT:
						case CURLFTPAUTH_SSL:
								ftpc.setCount2(/* add one to get next */1);
								ftpc.setCount1(0);
								break;
						case CURLFTPAUTH_TLS:
								ftpc.setCount2(-/* subtract one to get next */1);
								ftpc.setCount1(1);
								break;
						default:
								data.Curl_failf("unsupported parameter to CURLOPT_FTPSSLAUTH: %d", (int)generatedSet.getFtpsslauth());
								return /* we don't know what to do */CURLE_UNKNOWN_OPTION;
						}
						result = generatedPp.Curl_pp_sendf("AUTH %s", ftpauth[generatedCount1]);
						if (result) {
							return result;
						} 
						conn._state(.FTP_AUTH);
					} else {
							result = conn.ftp_state_user();
							if (result) {
								return result;
							} 
					} 
					break;
			case .FTP_PROT:
					if (ftpcode / 100 == 2) {
						generatedBits.setFtp_use_data_ssl((generatedSet.getUse_ssl() != CURLUSESSL_CONTROL) ? 1 : 0/* FTP servers typically responds with 500 if they decide to reject
						         our 'P' request */);
					}  else if (generatedSet.getUse_ssl() > CURLUSESSL_CONTROL) {
						return /* we failed and bails out */CURLE_USE_SSL_FAILED;
					} 
					if (generatedSet.getFtp_ccc()) {
						result = generatedPp.Curl_pp_sendf("%s", "CCC");
						if (result) {
							return result;
						} 
						conn._state(.FTP_CCC);
					} else {
							result = conn.ftp_state_pwd();
							if (result) {
								return result;
							} 
					} 
					break;
			case .FTP_CCC:
					if (ftpcode < 500) {
						result = .Curl_ssl_shutdown(conn, /* First shut down the SSL layer (note: this call will block) */0);
						if (result) {
							generatedData.Curl_failf("Failed to clear the command channel (CCC)");
							return result;
						} 
					} 
					result = /* Then continue as normal */conn.ftp_state_pwd();
					if (result) {
						return result;
					} 
					break;
			case .FTP_QUOTE:
			case .FTP_REST:
			case .FTP_RETR_REST:
					result = conn.ftp_state_rest_resp(ftpcode, generatedState);
					break;
			case .FTP_ACCT:
					result = conn.ftp_state_acct_resp(ftpcode);
					break;
			case .FTP_PRET:
					if (ftpcode != 200) {
						data.Curl_failf("PRET command not accepted: %03d", /* there only is this one standard OK return code. */ftpcode);
						return CURLE_FTP_PRET_FAILED;
					} 
					result = conn.ftp_state_use_pasv();
					break;
			default:
					conn._state(/* internal error */.FTP_STOP);
					break;
			}
		} 
		return /* if(ftpcode) */result;
	}
	/* called repeatedly until done from multi.c */
	public Object ftp_multi_statemach( done) {
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		pingpong generatedPp = ftpc.getPp();
		 result = generatedPp.Curl_pp_statemach(0, 0/* Check for the state outside of the Curl_socket_check() return code checks
		     since at times we are in fact already in this state when this function
		     gets called. */);
		 generatedState = ftpc.getState();
		done = (generatedState == .FTP_STOP) ? 1 : 0;
		return result;
	}
	public Object ftp_block_statemach() {
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		pingpong generatedPp = ftpc.getPp();
		pingpong pp = generatedPp;
		 result = CURLE_OK;
		 generatedState = ftpc.getState();
		while (generatedState != .FTP_STOP) {
			result = pp.Curl_pp_statemach(1, /* disconnecting */1);
			if (result) {
				break;
			} 
		}
		return result/*
		 * ftp_connect() should do everything that is to be considered a part of
		 * the connection phase.
		 *
		 * The variable 'done' points to will be TRUE if the protocol-layer connect
		 * phase is done when this function returns, or FALSE if not.
		 *
		 */;
	}
	public Object ftp_connect( done) {
		 result = new ();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		pingpong generatedPp = ftpc.getPp();
		pingpong pp = generatedPp;
		done = /* default to not done yet */0;
		conn.Curl_conncontrol(/* We always support persistent connections on ftp */0);
		pp.setResponse_time((120 * /* set default response time-out */1000));
		pp.setStatemach_act(ftp_statemach_act);
		pp.setEndofresp(ftp_endofresp);
		pp.setConn(conn);
		Object generatedHandler = this.getHandler();
		if (generatedHandler.getFlags() & (1 << 0)) {
			result = .Curl_ssl_connect(conn, /* BLOCKING */0);
			if (result) {
				return result;
			} 
		} 
		/* init the generic pingpong data */pp.Curl_pp_init();
		conn._state(/* When we connect, we start in the state where we await the 220
		     response */.FTP_WAIT220);
		result = conn.ftp_multi_statemach(done);
		return result/***********************************************************************
		 *
		 * ftp_done()
		 *
		 * The DONE function. This does what needs to be done after a single DO has
		 * performed.
		 *
		 * Input argument is already checked for validity.
		 */;
	}
	/* see description above */
	public Object ftp_done(Object status,  premature) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		FTP ftp = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		pingpong generatedPp = ftpc.getPp();
		pingpong pp = generatedPp;
		ssize_t nread = new ssize_t();
		int ftpcode;
		 result = CURLE_OK;
		byte rawPath = ((Object)0);
		size_t pathLen = 0;
		if (!ftp) {
			return CURLE_OK;
		} 
		switch (status) {
		case CURLE_FTP_COULDNT_SET_TYPE:
		case CURLE_PARTIAL_FILE:
		case CURLE_FTP_PORT_FAILED:
		case CURLE_UPLOAD_FAILED:
		case CURLE_FTP_ACCEPT_TIMEOUT:
		case CURLE_REMOTE_FILE_NOT_FOUND:
		case CURLE_FTP_WEIRD_PASV_REPLY:
		case CURLE_FTP_COULDNT_RETR_FILE:
		case CURLE_FTP_ACCEPT_FAILED:
		case CURLE_WRITE_ERROR/* the connection stays alive fine even though this happened */:
		case CURLE_BAD_DOWNLOAD_RESUME:
		case CURLE_FILESIZE_EXCEEDED:
		case /* fall-through *//* doesn't affect the control connection's status */CURLE_OK:
				if (!premature) {
					break;
				} 
		case CURLE_REMOTE_ACCESS_DENIED:
		default:
				ftpc.setCtl_valid(0);
				ftpc.setCwdfail(/* set this TRUE to prevent us to remember the
				                             current path, as this connection is going */1);
				conn.Curl_conncontrol(1);
				result = /* use the already set error code */status;
				break;
		}
		Object generatedState = data.getState();
		Object generatedSet = data.getSet();
		Byte generatedFile = ftpc.getFile();
		Object generatedWildcard = data.getWildcard();
		if (generatedState.getWildcardmatch()) {
			if (generatedSet.getChunk_end() && generatedFile) {
				data.Curl_set_in_callback(.bool_true);
				.UNRECOGNIZEDFUNCTIONNAME(generatedWildcard.getCustomptr());
				data.Curl_set_in_callback(.bool_false);
			} 
			ftpc.setKnown_filesize(-1);
		} 
		Byte generatedPath = ftp.getPath();
		if (!result) {
			result = data.Curl_urldecode(generatedPath, 0, rawPath, pathLen, /* get the url-decoded "raw" path */1);
		} 
		Byte generatedPrevpath = ftpc.getPrevpath();
		 generatedCwdfail = ftpc.getCwdfail();
		if (result/* We can limp along anyway (and should try to since we may already be in
		     * the error path) */) {
			ftpc.setCtl_valid(/* mark control connection as bad */0);
			conn.Curl_conncontrol(/* mark for connection closure */1);
			.Curl_cfree(generatedPrevpath);
			ftpc.setPrevpath(((Object)/* no path remembering */0));
		} else {
				if ((generatedSet.getFtp_filemethod() == .FTPFILE_NOCWD) && (rawPath[0] == /* remember working directory for connection reuse */(byte)'/')) {
					.Curl_cfree(/* full path => no CWDs happened => keep ftpc->prevpath */rawPath);
				} else {
						.Curl_cfree(generatedPrevpath);
						if (!generatedCwdfail) {
							if (generatedSet.getFtp_filemethod() == .FTPFILE_NOCWD) {
								pathLen = /* relative path => working directory is FTP home */0;
							} else {
									pathLen -= generatedFile ? .strlen(generatedFile) : /* file is url-decoded */0;
							} 
							rawPath[pathLen] = (byte)'\0';
							ftpc.setPrevpath(rawPath);
						} else {
								.Curl_cfree(rawPath);
								ftpc.setPrevpath(((Object)/* no path */0));
						} 
				} 
				if (generatedPrevpath) {
					data.Curl_infof("Remembering we are in dir \"%s\"\n", generatedPrevpath);
				} 
		} 
		/* free the dir tree and file parts */ftpc/* shut down the socket to inform the server we're done */.freedirs();
		Object generatedSock = this.getSock();
		 generatedDont_check = ftpc.getDont_check();
		Object generatedSsl = this.getSsl();
		if (generatedSock[1] != /* SD_BOTH */CURL_SOCKET_BAD) {
			if (!result && generatedDont_check && generatedReq.getMaxdownload() > 0) {
				result = pp.Curl_pp_sendf("%s", /* partial download completed */"ABOR");
				if (result) {
					data.Curl_failf("Failure sending ABOR command: %s", ModernizedCProgram.curl_easy_strerror(result));
					ftpc.setCtl_valid(/* mark control connection as bad */0);
					conn.Curl_conncontrol(/* connection closure */1);
				} 
			} 
			if (generatedSsl[1].getUse()) {
				.Curl_ssl_close(conn, 1/* Note that we keep "use" set to TRUE since that (next) connection is
				         still requested to use SSL */);
			} 
			conn.close_secondarysocket();
		} 
		 generatedTransfer = ftp.getTransfer();
		 generatedCtl_valid = ftpc.getCtl_valid();
		 generatedPending_resp = pp.getPending_resp();
		long generatedResponse_time = pp.getResponse_time();
		curltime curltime = new curltime();
		if (!result && (generatedTransfer == .FTPTRANSFER_BODY) && generatedCtl_valid && generatedPending_resp && !premature/*
		     * Let's see what the server says about the transfer we just performed,
		     * but lower the timeout as sometimes this connection has died while the
		     * data has been transferred. This happens when doing through NATs etc that
		     * abandon old silent connections.
		     */) {
			long old_time = generatedResponse_time;
			pp.setResponse_time(60 * /* give it only a minute for now */1000);
			pp.setResponse(curltime.Curl_now());
			result = conn.Curl_GetFTPResponse(nread, ftpcode);
			pp.setResponse_time(/* set this back to previous value */old_time);
			if (!nread && (CURLE_OPERATION_TIMEDOUT == result)) {
				data.Curl_failf("control connection looks dead");
				ftpc.setCtl_valid(/* mark control connection as bad */0);
				conn.Curl_conncontrol(/* close */1);
			} 
			if (result) {
				return result;
			} 
			if (generatedDont_check && generatedReq.getMaxdownload() > 0/* we have just sent ABOR and there is no reliable way to check if it was
			       * successful or not; we have to close the connection now */) {
				data.Curl_infof("partial download completed, closing connection\n");
				conn.Curl_conncontrol(1);
				return result;
			} 
			if (!generatedDont_check) {
				if ((ftpcode != 226) && (ftpcode != /* 226 Transfer complete, 250 Requested file action okay, completed. */250)) {
					data.Curl_failf("server did not report OK, got %d", ftpcode);
					result = CURLE_PARTIAL_FILE;
				} 
			} 
		} 
		ftp.setTransfer(/* clear these for next connection */.FTPTRANSFER_BODY);
		ftpc.setDont_check(0);
		if (!status && !result && !premature && generatedSet.getPostquote()) {
			result = ModernizedCProgram.ftp_sendquote(conn, generatedSet.getPostquote());
		} 
		Byte generatedPathalloc = ftp.getPathalloc();
		do {
			.Curl_cfree((generatedPathalloc));
			(generatedPathalloc) = ((Object)0);
		} while (0);
		return result/***********************************************************************
		 *
		 * ftp_sendquote()
		 *
		 * Where a 'quote' means a list of custom commands to send to the server.
		 * The quote list is passed as an argument.
		 *
		 * BLOCKING
		 */;
	}
	public int ftp_need_type( ascii_wanted) {
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		return generatedFtpc.getTransfertype() != (ascii_wanted ? (byte)'A' : (byte)'I'/***********************************************************************
		 *
		 * ftp_nb_type()
		 *
		 * Set TYPE. We only deal with ASCII or BINARY so this function
		 * sets one of them.
		 * If the transfer type is not sent, simulate on OK response in newstate
		 */);
	}
	public Object ftp_nb_type( ascii,  newstate) {
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		 result = new ();
		byte want = (byte)(ascii ? (byte)'A' : (byte)'I');
		byte generatedTransfertype = ftpc.getTransfertype();
		if (generatedTransfertype == want) {
			conn._state(newstate);
			return conn.ftp_state_type_resp(200, newstate);
		} 
		pingpong generatedPp = ftpc.getPp();
		result = generatedPp.Curl_pp_sendf("TYPE %c", want);
		if (result) {
			return result;
		} 
		conn._state(newstate);
		ftpc.setTransfertype(/* keep track of our current transfer type */want);
		return CURLE_OK/***************************************************************************
		 *
		 * ftp_pasv_verbose()
		 *
		 * This function only outputs some informationals about this second connection
		 * when we've issued a PASV command before and thus we have connected to a
		 * possibly new IP address.
		 *
		 */;
	}
	public Object ftp_do_more(int completep) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		 result = CURLE_OK;
		bool connected = 0;
		bool complete = 0;
		Object generatedReq = data.getReq();
		FTP ftp = generatedReq.getProtop();
		ConnectBits generatedBits = this.getBits();
		Object generatedTcpconnect = generatedBits.getTcpconnect();
		int generatedCount1 = ftpc.getCount1();
		if (!generatedTcpconnect[/* if the second connection isn't done yet, wait for it */1]) {
			if (conn/* As we're in TUNNEL_CONNECT state now, we know the proxy name and port
			         aren't used so we blank their arguments. */.Curl_connect_ongoing()) {
				result = conn.Curl_proxyCONNECT(1, ((Object)0), 0);
				return result;
			} 
			result = conn.Curl_is_connected(1, connected);
			if (/* Ready to do more? */connected) {
				do {
				} while (0);
			} else {
					if (result && (generatedCount1 == 0)) {
						completep = -/* go back to DOING please */1;
						return /* this is a EPSV connect failing, try PASV instead */conn.ftp_epsv_disable();
					} 
					return result;
			} 
		} 
		result = conn.Curl_proxy_connect(1);
		if (result) {
			return result;
		} 
		proxy_info generatedHttp_proxy = this.getHttp_proxy();
		Object generatedProxytype = generatedHttp_proxy.getProxytype();
		Object generatedProxy_ssl_connected = generatedBits.getProxy_ssl_connected();
		if ((generatedProxytype == CURLPROXY_HTTPS && !generatedProxy_ssl_connected[1])) {
			return result;
		} 
		Object generatedTunnel_proxy = generatedBits.getTunnel_proxy();
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		if (generatedTunnel_proxy && generatedHttpproxy && conn.Curl_connect_ongoing()) {
			return result;
		} 
		 generatedState = ftpc.getState();
		 generatedWait_data_conn = ftpc.getWait_data_conn();
		if (generatedState) {
			result = conn.ftp_multi_statemach(complete);
			completep = (int)complete;
			if (result || !generatedWait_data_conn) {
				return result/* if we reach the end of the FTP state machine here, *complete will be
				       TRUE but so is ftpc->wait_data_conn, which says we need to wait for the
				       data connection and therefore we're not actually complete */;
			} 
			completep = 0;
		} 
		 generatedTransfer = ftp.getTransfer();
		Object generatedSet = data.getSet();
		Byte generatedFile = ftpc.getFile();
		if (generatedTransfer <= .FTPTRANSFER_INFO/* a transfer is about to take place, or if not a file name was given
		       so we'll do a SIZE on it later and then we need the right TYPE first */) {
			if (generatedWait_data_conn == 1) {
				bool serv_conned = new bool();
				result = conn.ReceivedServerConnect(serv_conned);
				if (result) {
					return /* Failed to accept data connection */result;
				} 
				if (serv_conned) {
					result = /* It looks data connection is established */conn.AcceptServerConnect();
					ftpc.setWait_data_conn(0);
					if (!result) {
						result = conn.InitiateTransfer();
					} 
					if (result) {
						return result;
					} 
					completep = /* this state is now complete when the server has
					                           connected back to us */1;
				} 
			}  else if (generatedSet.getUpload()) {
				result = conn.ftp_nb_type(generatedSet.getPrefer_ascii(), .FTP_STOR_TYPE);
				if (result) {
					return result;
				} 
				result = conn.ftp_multi_statemach(complete);
				completep = (int)/* ftpc->wait_data_conn is always false here */complete;
			} else {
					ftp.setDownloadsize(-/* download *//* unknown as of yet */1);
					result = conn.Curl_range();
					if (result == CURLE_OK && generatedReq.getMaxdownload() >= 0) {
						ftpc.setDont_check(/* Don't check for successful transfer */1);
					} 
					if (result) {
						;
					}  else if (generatedSet.getFtp_list_only() || !generatedFile) {
						if (generatedTransfer == /* But only if a body transfer was requested. */.FTPTRANSFER_BODY) {
							result = conn.ftp_nb_type(1, .FTP_LIST_TYPE);
							if (result) {
								return result/* otherwise just fall through */;
							} 
						} 
					} else {
							result = conn.ftp_nb_type(generatedSet.getPrefer_ascii(), .FTP_RETR_TYPE);
							if (result) {
								return result;
							} 
					} 
					result = conn.ftp_multi_statemach(complete);
					completep = (int)complete;
			} 
			return result;
		} 
		data.Curl_setup_transfer(-1, -1, 0, -/* no data to transfer */1);
		if (!generatedWait_data_conn) {
			completep = /* no waiting for the data connection so this is now complete */1;
			do {
			} while (0);
		} 
		return result/***********************************************************************
		 *
		 * ftp_perform()
		 *
		 * This is the actual DO function for FTP. Get a file/directory according to
		 * the options previously setup.
		 */;
	}
	public Object ftp_perform( connected,  dophase_done) {
		 result = /* this is FTP and no proxy */CURLE_OK;
		do {
		} while (0);
		Curl_easy generatedData = this.getData();
		Object generatedSet = generatedData.getSet();
		Object generatedReq = generatedData.getReq();
		if (generatedSet.getOpt_no_body()) {
			FTP ftp = generatedReq.getProtop();
			ftp.setTransfer(.FTPTRANSFER_INFO);
		} 
		dophase_done = /* not done yet */0;
		result = conn.ftp_state_quote(1, /* start the first command in the DO phase */.FTP_QUOTE);
		if (result) {
			return result;
		} 
		result = conn.ftp_multi_statemach(/* run the state-machine */dophase_done);
		ConnectBits generatedBits = this.getBits();
		Object generatedTcpconnect = generatedBits.getTcpconnect();
		connected = generatedTcpconnect[1];
		generatedData.Curl_infof("ftp_perform ends with SECONDARY: %d\n", connected);
		if (dophase_done) {
			do {
			} while (0);
		} 
		return result;
	}
	/* connect status after PASV / PORT */
	public Object init_wc_data() {
		byte last_slash;
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		FTP ftp = generatedReq.getProtop();
		Byte generatedPath = ftp.getPath();
		byte path = generatedPath;
		Object generatedWildcard = generatedData.getWildcard();
		WildcardData wildcard = (generatedWildcard);
		 result = CURLE_OK;
		ftp_wc ftpwc = ((Object)0);
		last_slash = .strrchr(generatedPath, (byte)'/');
		Byte generatedPattern = wildcard.getPattern();
		if (last_slash) {
			last_slash++;
			if (last_slash[0] == (byte)'\0') {
				wildcard.setState(.CURLWC_CLEAN);
				result = conn.ftp_parse_url_path();
				return result;
			} 
			wildcard.setPattern(.Curl_cstrdup(last_slash));
			if (!generatedPattern) {
				return CURLE_OUT_OF_MEMORY;
			} 
			last_slash[0] = /* cut file from path */(byte)'\0';
		} else {
				if (path[/* there is only 'wildcard pattern' or nothing */0]) {
					wildcard.setPattern(.Curl_cstrdup(path));
					if (!generatedPattern) {
						return CURLE_OUT_OF_MEMORY;
					} 
					path[0] = (byte)'\0';
				} else {
						wildcard.setState(/* only list */.CURLWC_CLEAN);
						result = conn.ftp_parse_url_path();
						return result;
				} 
		} 
		ftpwc = .Curl_ccalloc(1, /* program continues only if URL is not ending with slash, allocate needed
		     resources for wildcard transfer *//* allocate ftp protocol specific wildcard data */);
		if (!ftpwc) {
			result = CURLE_OUT_OF_MEMORY;
			;
		} 
		ftp_parselist_data ftp_parselist_data = new ftp_parselist_data();
		ftpwc.setParser(ftp_parselist_data.Curl_ftp_parselist_data_alloc());
		ftp_parselist_data generatedParser = ftpwc.getParser();
		if (!generatedParser) {
			result = CURLE_OUT_OF_MEMORY;
			;
		} 
		wildcard.setProtdata(/* put it to the WildcardData tmp pointer */ftpwc);
		wildcard.setDtor(ModernizedCProgram.wc_data_dtor);
		Object generatedSet = generatedData.getSet();
		if (generatedSet.getFtp_filemethod() == /* wildcard does not support NOCWD option (assert it?) */.FTPFILE_NOCWD) {
			generatedSet.setFtp_filemethod(.FTPFILE_MULTICWD);
		} 
		result = /* try to parse ftp url */conn.ftp_parse_url_path();
		if (result) {
			;
		} 
		wildcard.setPath(.Curl_cstrdup(generatedPath));
		if (!generatedPath) {
			result = CURLE_OUT_OF_MEMORY;
			;
		} 
		 generatedBackup = ftpwc.getBackup();
		generatedBackup.setWrite_function(generatedSet.getFwrite_func());
		generatedSet.setFwrite_func(/* parsing write function */ModernizedCProgram.Curl_ftp_parselist);
		generatedBackup.setFile_descriptor(generatedSet.getOut());
		generatedSet.setOut(/* let the writefunc callback know what curl pointer is working with */conn);
		generatedData.Curl_infof("Wildcard - Parsing started\n");
		return CURLE_OK;
		do {
			.Curl_cfree((generatedPattern));
			(generatedPattern) = ((Object)0);
		} while (0);
		wildcard.setDtor(0);
		wildcard.setProtdata(((Object)0));
		return result;
	}
	/* This is called recursively */
	public Object wc_statemach() {
		Curl_easy generatedData = this.getData();
		Object generatedWildcard = generatedData.getWildcard();
		WildcardData wildcard = (generatedWildcard);
		 result = CURLE_OK;
		 generatedState = wildcard.getState();
		Object generatedProtdata = wildcard.getProtdata();
		 generatedBackup = ftpwc.getBackup();
		Object generatedWrite_function = generatedBackup.getWrite_function();
		Object generatedSet = generatedData.getSet();
		Object generatedFile_descriptor = generatedBackup.getFile_descriptor();
		ftp_parselist_data generatedParser = ftpwc.getParser();
		curl_llist generatedFilelist = wildcard.getFilelist();
		Object generatedSize = generatedFilelist.getSize();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		curl_llist_element generatedHead = generatedFilelist.getHead();
		Object generatedPtr = generatedHead.getPtr();
		Object generatedReq = generatedData.getReq();
		Byte generatedPath = wildcard.getPath();
		Object generatedCurl_fileinfo = finfo.getCurl_fileinfo();
		Byte generatedPathalloc = ftp.getPathalloc();
		Object generatedCustomptr = wildcard.getCustomptr();
		Object generatedDtor = wildcard.getDtor();
		switch (generatedState) {
		case .CURLWC_INIT:
				result = conn.init_wc_data();
				if (generatedState == .CURLWC_CLEAN/* only listing! */) {
					break;
				} 
				wildcard.setState(result ? .CURLWC_ERROR : .CURLWC_MATCHING);
				break;
		case .CURLWC_DONE:
		case .CURLWC_SKIP:
				{ 
					if (generatedSet.getChunk_end()) {
						generatedData.Curl_set_in_callback(.bool_true);
						.UNRECOGNIZEDFUNCTIONNAME(generatedCustomptr);
						generatedData.Curl_set_in_callback(.bool_false);
					} 
					ModernizedCProgram.Curl_llist_remove(generatedFilelist, generatedHead, ((Object)0));
					wildcard.setState((generatedSize == 0) ? .CURLWC_CLEAN : .CURLWC_DOWNLOADING);
					return conn.wc_statemach();
				}
		case .CURLWC_ERROR:
		case .CURLWC_CLEAN:
				{ 
					ftp_wc ftpwc = generatedProtdata;
					result = CURLE_OK;
					if (ftpwc) {
						result = generatedParser.Curl_ftp_parselist_geterror();
					} 
					wildcard.setState(result ? .CURLWC_ERROR : .CURLWC_DONE);
				}
				break;
		case .CURLWC_DOWNLOADING:
				{ 
					ftp_conn ftpc = generatedFtpc;
					curl_fileinfo finfo = generatedPtr;
					FTP ftp = generatedReq.getProtop();
					byte tmp_path = ModernizedCProgram.curl_maprintf("%s%s", generatedPath, generatedCurl_fileinfo);
					if (!tmp_path) {
						return CURLE_OUT_OF_MEMORY;
					} 
					.Curl_cfree(generatedPathalloc);
					ftp.setPathalloc(ftp.setPath(tmp_path));
					generatedData.Curl_infof("Wildcard - START of \"%s\"\n", generatedCurl_fileinfo);
					if (generatedSet.getChunk_bgn()) {
						long userresponse;
						generatedData.Curl_set_in_callback(.bool_true);
						userresponse = .UNRECOGNIZEDFUNCTIONNAME(finfo, generatedCustomptr, (int)generatedSize);
						generatedData.Curl_set_in_callback(.bool_false);
						switch (userresponse) {
						case CURL_CHUNK_BGN_FUNC_SKIP:
								generatedData.Curl_infof("Wildcard - \"%s\" skipped by user\n", generatedCurl_fileinfo);
								wildcard.setState(.CURLWC_SKIP);
								return conn.wc_statemach();
						case CURL_CHUNK_BGN_FUNC_FAIL:
								return CURLE_CHUNK_FAILED;
						}
					} 
					if (generatedCurl_fileinfo != CURLFILETYPE_FILE) {
						wildcard.setState(.CURLWC_SKIP);
						return conn.wc_statemach();
					} 
					if (generatedCurl_fileinfo & CURLFINFOFLAG_KNOWN_SIZE) {
						ftpc.setKnown_filesize(generatedCurl_fileinfo);
					} 
					result = conn.ftp_parse_url_path();
					if (result) {
						return result;
					} 
					ModernizedCProgram.Curl_llist_remove(generatedFilelist, generatedHead, ((Object)/* we don't need the Curl_fileinfo of first file anymore */0));
					if (generatedSize == /* remains only one file to down. */0) {
						wildcard.setState(.CURLWC_CLEAN/* after that will be ftp_do called once again and no transfer
						         will be done because of CURLWC_CLEAN state */);
						return CURLE_OK;
					} 
				}
				break;
		case .CURLWC_CLEAR:
				if (generatedDtor) {
					.UNRECOGNIZEDFUNCTIONNAME(generatedProtdata);
				} 
				break;
		case .CURLWC_MATCHING/* In this state is LIST response successfully parsed, so lets restore
		       previous WRITEFUNCTION callback and WRITEDATA pointer */:
				{ 
					ftp_wc ftpwc = generatedProtdata;
					generatedSet.setFwrite_func(generatedWrite_function);
					generatedSet.setOut(generatedFile_descriptor);
					generatedBackup.setWrite_function(0);
					generatedBackup.setFile_descriptor(((Object)0));
					wildcard.setState(.CURLWC_DOWNLOADING);
					if (generatedParser.Curl_ftp_parselist_geterror()) {
						wildcard.setState(/* error found in LIST parsing */.CURLWC_CLEAN);
						return conn.wc_statemach();
					} 
					if (generatedSize == 0) {
						wildcard.setState(/* no corresponding file */.CURLWC_CLEAN);
						return CURLE_REMOTE_FILE_NOT_FOUND;
					} 
					return conn.wc_statemach();
				}
		}
		return result/***********************************************************************
		 *
		 * ftp_do()
		 *
		 * This function is registered as 'curl_do' function. It decodes the path
		 * parts etc as a wrapper to the actual DO function (ftp_perform).
		 *
		 * The input argument is already checked for validity.
		 */;
	}
	public Object ftp_do( done) {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		done = /* default to false */0;
		ftpc.setWait_data_conn(/* default to no such wait */0);
		Curl_easy generatedData = this.getData();
		Object generatedState = generatedData.getState();
		if (generatedState.getWildcardmatch()) {
			result = conn.wc_statemach();
			if (generatedState == .CURLWC_SKIP || generatedState == .CURLWC_DONE) {
				return /* do not call ftp_regular_transfer */CURLE_OK;
			} 
			if (/* error, loop or skipping the file */result) {
				return result;
			} 
		} else {
				result = /* no wildcard FSM needed */conn.ftp_parse_url_path();
				if (result) {
					return result;
				} 
		} 
		result = conn.ftp_regular_transfer(done);
		return result;
	}
	public Object Curl_ftpsend(Object cmd) {
		ssize_t bytes_written = new ssize_t();
		byte[] s = new byte[1024];
		size_t write_len = new size_t();
		byte sptr = s;
		 result = CURLE_OK;
		if (!cmd) {
			return CURLE_BAD_FUNCTION_ARGUMENT;
		} 
		write_len = .strlen(cmd);
		if (!write_len || write_len > ( - 3)) {
			return CURLE_BAD_FUNCTION_ARGUMENT;
		} 
		.memcpy(s, cmd, write_len);
		.strcpy(s[write_len], /* append a trailing CRLF */"\r\n");
		write_len += 2;
		bytes_written = 0;
		result = ();
		if (/* Curl_convert_to_network calls failf if unsuccessful */result) {
			return result;
		} 
		Object generatedSock = this.getSock();
		Curl_easy generatedData = this.getData();
		Object generatedSet = generatedData.getSet();
		for (; ; ) {
			result = conn.Curl_write(generatedSock[0], sptr, write_len, bytes_written);
			if (result) {
				break;
			} 
			if (generatedSet.getVerbose()) {
				generatedData.Curl_debug(CURLINFO_HEADER_OUT, sptr, (size_t)bytes_written);
			} 
			if (bytes_written != (ssize_t)write_len) {
				write_len -= bytes_written;
				sptr += bytes_written;
			} else {
					break;
			} 
		}
		return result/***********************************************************************
		 *
		 * ftp_quit()
		 *
		 * This should be called before calling sclose() on an ftp control connection
		 * (not data connections). We should then wait for the response from the
		 * server before returning. The calling code should then try to close the
		 * connection.
		 *
		 */;
	}
	public Object ftp_quit() {
		 result = CURLE_OK;
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		Curl_easy generatedData = this.getData();
		if (generatedFtpc.getCtl_valid()) {
			result = generatedFtpc.getPp().Curl_pp_sendf("%s", "QUIT");
			if (result) {
				generatedData.Curl_failf("Failure sending QUIT command: %s", ModernizedCProgram.curl_easy_strerror(result));
				generatedFtpc.setCtl_valid(/* mark control connection as bad */0);
				conn.Curl_conncontrol(/* mark for connection closure */1);
				conn._state(.FTP_STOP);
				return result;
			} 
			conn._state(.FTP_QUIT);
			result = conn.ftp_block_statemach();
		} 
		return result/***********************************************************************
		 *
		 * ftp_disconnect()
		 *
		 * Disconnect from an FTP server. Cleanup protocol-specific per-connection
		 * resources. BLOCKING.
		 */;
	}
	public Object ftp_disconnect( dead_connection) {
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		pingpong generatedPp = ftpc.getPp();
		pingpong pp = generatedPp;
		if (dead_connection) {
			ftpc.setCtl_valid(0);
		} 
		(Object)/* The FTP session may or may not have been allocated/setup at this point! *//* ignore errors on the QUIT */conn.ftp_quit();
		Byte generatedEntrypath = ftpc.getEntrypath();
		Curl_easy generatedData = this.getData();
		if (generatedEntrypath) {
			Curl_easy data = generatedData;
			if (ModernizedCProgram.data.getState().getMost_recent_ftp_entrypath() == generatedEntrypath) {
				ModernizedCProgram.data.getState().setMost_recent_ftp_entrypath(((Object)0));
			} 
			.Curl_cfree(generatedEntrypath);
			ftpc.setEntrypath(((Object)0));
		} 
		ftpc.freedirs();
		Byte generatedPrevpath = ftpc.getPrevpath();
		.Curl_cfree(generatedPrevpath);
		ftpc.setPrevpath(((Object)0));
		Byte generatedServer_os = ftpc.getServer_os();
		.Curl_cfree(generatedServer_os);
		ftpc.setServer_os(((Object)0));
		pp.Curl_pp_disconnect();
		return CURLE_OK/***********************************************************************
		 *
		 * ftp_parse_url_path()
		 *
		 * Parse the URL path into separate path components.
		 *
		 */;
	}
	public Object ftp_parse_url_path() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		FTP ftp = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		byte slashPos = ((Object)0);
		byte fileName = ((Object)0);
		 result = CURLE_OK;
		byte rawPath = ((Object)/* url-decoded "raw" path */0);
		size_t pathLen = 0;
		ftpc.setCtl_valid(0);
		ftpc.setCwdfail(0);
		Byte generatedPath = ftp.getPath();
		result = data.Curl_urldecode(generatedPath, 0, rawPath, pathLen, /* url-decode ftp path before further evaluation */1);
		if (result) {
			return result;
		} 
		Byte generatedDirs = ftpc.getDirs();
		int generatedDirdepth = ftpc.getDirdepth();
		Object generatedSet = data.getSet();
		switch (generatedSet.getFtp_filemethod()) {
		case .FTPFILE_MULTICWD:
				{ 
					byte curPos = /* current position: begin of next path component */rawPath;
					int dirAlloc = /* number of entries allocated for the 'dirs' array */0;
					byte str = rawPath;
					for (; str != 0; ++str) {
						if (str == (byte)'/') {
							++dirAlloc;
						} 
					}
					if (dirAlloc > 0) {
						ftpc.setDirs(.Curl_ccalloc(dirAlloc, ));
						if (!generatedDirs) {
							.Curl_cfree(rawPath);
							return CURLE_OUT_OF_MEMORY;
						} 
						while ((slashPos = .strchr(curPos, (byte)'/')) != ((Object)/* parse the URL path into separate path components */0)) {
							size_t compLen = slashPos - curPos;
							if ((compLen == 0) && (generatedDirdepth == /* path starts with a slash: add that as a directory */0)) {
								++compLen/* we skip empty path components, like "x//y" since the FTP command
								             CWD requires a parameter and a non-existent parameter a) doesn't
								             work on many servers and b) has no effect on the others. */;
							} 
							if (compLen > 0) {
								byte comp = .Curl_ccalloc(1, compLen + 1);
								if (!comp) {
									.Curl_cfree(rawPath);
									return CURLE_OUT_OF_MEMORY;
								} 
								.strncpy(comp, curPos, compLen);
								generatedDirs[generatedDirdepth++] = comp;
							} 
							curPos = slashPos + 1;
						}
					} 
					do {
					} while (0);
					fileName = /* the rest is the file name (or empty) */curPos;
				}
				break;
		case .FTPFILE_SINGLECWD:
				slashPos = .strrchr(rawPath, (byte)'/');
				if (slashPos) {
					size_t dirlen = slashPos - /* get path before last slash, except for / */rawPath;
					if (dirlen == 0) {
						dirlen++;
					} 
					ftpc.setDirs(.Curl_ccalloc(1, ));
					if (!generatedDirs) {
						.Curl_cfree(rawPath);
						return CURLE_OUT_OF_MEMORY;
					} 
					generatedDirs[0] = .Curl_ccalloc(1, dirlen + 1);
					if (!generatedDirs[0]) {
						.Curl_cfree(rawPath);
						return CURLE_OUT_OF_MEMORY;
					} 
					.strncpy(generatedDirs[0], rawPath, dirlen);
					ftpc.setDirdepth(/* we consider it to be a single dir */1);
					fileName = slashPos + /* rest is file name */1;
				} else {
						fileName = /* file name only (or empty) */rawPath;
				} 
				break;
		case /* fastest, but less standard-compliant */.FTPFILE_NOCWD:
				if ((pathLen > 0) && (rawPath[pathLen - 1] != (byte)'/')) {
					fileName = /* this is a full file path */rawPath/*
					        else: ftpc->file is not used anywhere other than for operations on
					              a file. In other words, never for directory operations.
					              So we can safely leave filename as NULL here and use it as a
					              argument in dir/file decisions.
					      */;
				} 
				break;
		default:
		}
		if (fileName && fileName) {
			ftpc.setFile(.Curl_cstrdup(fileName));
		} else {
				ftpc.setFile(((Object)/* instead of point to a zero byte,
				                            we make it a NULL pointer */0));
		} 
		Byte generatedFile = ftpc.getFile();
		 generatedTransfer = ftp.getTransfer();
		if (generatedSet.getUpload() && !generatedFile && (generatedTransfer == .FTPTRANSFER_BODY)) {
			data.Curl_failf(/* We need a file name when uploading. Return error! */"Uploading to a URL without a file name!");
			.Curl_cfree(rawPath);
			return CURLE_URL_MALFORMAT;
		} 
		ftpc.setCwddone(/* default to not done */0);
		ConnectBits generatedBits = this.getBits();
		Object generatedReuse = generatedBits.getReuse();
		Byte generatedPrevpath = ftpc.getPrevpath();
		if ((generatedSet.getFtp_filemethod() == .FTPFILE_NOCWD) && (rawPath[0] == (byte)'/')) {
			ftpc.setCwddone(/* skip CWD for absolute paths */1);
		} else {
				byte oldPath = generatedReuse ? generatedPrevpath : /* newly created FTP connections are already in entry path */"";
				if (oldPath) {
					size_t n = pathLen;
					if (generatedSet.getFtp_filemethod() == .FTPFILE_NOCWD) {
						n = /* CWD to entry for relative paths */0;
					} else {
							n -= generatedFile ? .strlen(generatedFile) : 0;
					} 
					if ((.strlen(oldPath) == n) && !.strncmp(rawPath, oldPath, n)) {
						data.Curl_infof("Request has same path as previous transfer\n");
						ftpc.setCwddone(1);
					} 
				} 
		} 
		.Curl_cfree(rawPath);
		return CURLE_OK;
	}
	/* call this when the DO phase has completed */
	public Object ftp_dophase_done( connected) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		FTP ftp = generatedReq.getProtop();
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		if (connected) {
			int completed;
			 result = conn.ftp_do_more(completed);
			if (ModernizedCProgram.result) {
				conn.close_secondarysocket();
				return ModernizedCProgram.result;
			} 
		} 
		 generatedTransfer = ftp.getTransfer();
		ConnectBits generatedBits = this.getBits();
		if (generatedTransfer != .FTPTRANSFER_BODY) {
			generatedData.Curl_setup_transfer(-1, -1, 0, -/* no data to transfer */1);
		}  else if (!connected) {
			generatedBits.setDo_more(/* since we didn't connect now, we want do_more to get called */1);
		} 
		ftpc.setCtl_valid(/* seems good */1);
		return CURLE_OK;
	}
	/* easy-to-use macro: */
	/* called from multi.c while DOing */
	public Object ftp_doing( dophase_done) {
		 result = conn.ftp_multi_statemach(dophase_done);
		if (result) {
			do {
			} while (0);
		}  else if (dophase_done) {
			result = conn.ftp_dophase_done(/* not connected */0);
			do {
			} while (0);
		} 
		return result/***********************************************************************
		 *
		 * ftp_regular_transfer()
		 *
		 * The input argument is already checked for validity.
		 *
		 * Performs all commands done before a regular transfer between a local and a
		 * remote host.
		 *
		 * ftp->ctl_valid starts out as FALSE, and gets set to TRUE if we reach the
		 * ftp_done() function without finding any major problem.
		 */;
	}
	public Object ftp_regular_transfer( dophase_done) {
		 result = CURLE_OK;
		bool connected = 0;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		ftp_conn ftpc = generatedFtpc;
		Object generatedReq = data.getReq();
		generatedReq.setSize(-/* make sure this is unknown at this point */1);
		data.Curl_pgrsSetUploadCounter(0);
		data.Curl_pgrsSetDownloadCounter(0);
		data.Curl_pgrsSetUploadSize(-1);
		data.Curl_pgrsSetDownloadSize(-1);
		ftpc.setCtl_valid(/* starts good */1);
		result = conn.ftp_perform(/* have we connected after PASV/PORT */connected, /* all commands in the DO-phase done? */dophase_done);
		if (!result) {
			if (!dophase_done) {
				return /* the DO phase has not completed yet */CURLE_OK;
			} 
			result = conn.ftp_dophase_done(connected);
			if (result) {
				return result;
			} 
		} else {
				ftpc.freedirs();
		} 
		return result;
	}
	public Object ftp_setup_connection() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		byte type;
		FTP ftp = new FTP();
		Object generatedReq = generatedData.getReq();
		generatedReq.setProtop(ftp = .Curl_ccalloc(, 1));
		if (((Object)0) == ftp) {
			return CURLE_OUT_OF_MEMORY;
		} 
		Object generatedState = data.getState();
		ftp.setPath(generatedState.getUp().getPath()[/* don't include the initial slash */1]);
		Byte generatedPath = ftp.getPath();
		type = .strstr(generatedPath, /* FTP URLs support an extension like ";type=<typecode>" that
		   * we'll try to get now! */";type=");
		hostname generatedHost = this.getHost();
		Byte generatedRawalloc = generatedHost.getRawalloc();
		if (!type) {
			type = .strstr(generatedRawalloc, ";type=");
		} 
		ConnectBits generatedBits = this.getBits();
		Object generatedSet = data.getSet();
		if (type) {
			byte command;
			type = /* it was in the middle of the hostname */0;
			command = ModernizedCProgram.Curl_raw_toupper(type[6]);
			generatedBits.setType_set(1);
			switch (command) {
			case /* ASCII mode */(byte)'A':
					generatedSet.setPrefer_ascii(1);
					break;
			case /* directory mode */(byte)'D':
					generatedSet.setFtp_list_only(1);
					break;
			case /* binary mode */(byte)'I':
			default:
					generatedSet.setPrefer_ascii(/* switch off ASCII */0);
					break;
			}
		} 
		ftp.setTransfer(/* get some initial data into the ftp struct */.FTPTRANSFER_BODY);
		ftp.setDownloadsize(0/* No need to duplicate user+password, the connectdata struct won't change
		     during a session, but we re-init them here since on subsequent inits
		     since the conn struct may have changed or been replaced.
		  */);
		Byte generatedUser = this.getUser();
		ftp.setUser(generatedUser);
		Byte generatedPasswd = this.getPasswd();
		ftp.setPasswd(generatedPasswd);
		if (ModernizedCProgram.isBadFtpString(generatedUser)) {
			return CURLE_URL_MALFORMAT;
		} 
		if (ModernizedCProgram.isBadFtpString(generatedPasswd)) {
			return CURLE_URL_MALFORMAT;
		} 
		 generatedProto = this.getProto();
		Object generatedFtpc = generatedProto.getFtpc();
		generatedFtpc.setKnown_filesize(-/* unknown size for now */1);
		return CURLE_OK/* CURL_DISABLE_FTP */;
	}
	public int Curl_resolv_getsock(Object socks) {
		Curl_easy generatedData = this.getData();
		Object generatedSet = generatedData.getSet();
		if (generatedSet.getDoh()) {
			return 0;
		} 
		return conn.Curl_resolver_getsock(socks);
	}
	/* Call this function after Curl_connect() has returned async=TRUE and
	   then a successful name resolve has been received.
	
	   Note: this function disconnects and frees the conn data in case of
	   resolve failure */
	public Object Curl_once_resolved( protocol_done) {
		 result = new ();
		Curl_async generatedAsync = this.getAsync();
		Curl_dns_entry generatedDns = generatedAsync.getDns();
		if (generatedDns) {
			this.setDns_entry(generatedDns);
			generatedAsync.setDns(((Object)0));
		} 
		result = conn.Curl_setup_conn(protocol_done);
		Curl_easy generatedData = this.getData();
		if (result/* We're not allowed to return failure with memory left allocated
		       in the connectdata struct, free those here */) {
			ModernizedCProgram.Curl_disconnect(generatedData, conn, /* close the connection */1);
		} 
		return result;
	}
	public int Curl_pgrsDone() {
		int rc;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedProgress = data.getProgress();
		generatedProgress.setLastshow(0);
		rc = /* the final (forced) update */conn.Curl_pgrsUpdate();
		if (rc) {
			return rc;
		} 
		Object generatedSet = data.getSet();
		if (!(generatedProgress.getFlags() & (1 << 4)) && !generatedProgress.getCallback()) {
			generatedSet.getErr().curl_mfprintf("\n");
		} 
		generatedProgress.setSpeeder_c(/* reset the progress meter display */0);
		return 0;
	}
	public void progress_meter() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		byte[][] max5 = new byte[6][10];
		 dlpercen = 0;
		 ulpercen = 0;
		 total_percen = 0;
		 total_transfer = new ();
		 total_expected_transfer = new ();
		byte[] time_left = new byte[10];
		byte[] time_total = new byte[10];
		byte[] time_spent = new byte[10];
		 ulestimate = 0;
		 dlestimate = 0;
		 total_estimate = new ();
		Object generatedProgress = data.getProgress();
		 timespent = ()generatedProgress.getTimespent() / /* seconds */1000000;
		Object generatedState = data.getState();
		if ((generatedProgress.getFlags() & (1 << /* Figure out the estimated time of arrival for the upload */5)) && (generatedProgress.getUlspeed() > .CURL_OFF_T_C(0))) {
			ulestimate = generatedProgress.getSize_ul() / generatedProgress.getUlspeed();
			if (generatedProgress.getSize_ul() > .CURL_OFF_T_C(10000)) {
				ulpercen = generatedProgress.getUploaded() / (generatedProgress.getSize_ul() / .CURL_OFF_T_C(100));
			}  else if (generatedProgress.getSize_ul() > .CURL_OFF_T_C(0)) {
				ulpercen = (generatedProgress.getUploaded() * 100) / generatedProgress.getSize_ul();
			} 
		} 
		if ((generatedProgress.getFlags() & (1 << /* ... and the download */6)) && (generatedProgress.getDlspeed() > .CURL_OFF_T_C(0))) {
			dlestimate = generatedProgress.getSize_dl() / generatedProgress.getDlspeed();
			if (generatedProgress.getSize_dl() > .CURL_OFF_T_C(10000)) {
				dlpercen = generatedProgress.getDownloaded() / (generatedProgress.getSize_dl() / .CURL_OFF_T_C(100));
			}  else if (generatedProgress.getSize_dl() > .CURL_OFF_T_C(0)) {
				dlpercen = (generatedProgress.getDownloaded() * 100) / generatedProgress.getSize_dl();
			} 
		} 
		total_estimate = ulestimate > dlestimate ? ulestimate : /* Now figure out which of them is slower and use that one for the
		     total estimate! */dlestimate;
		ModernizedCProgram.time2str(time_left, total_estimate > 0 ? (total_estimate - timespent) : /* create the three time strings */0);
		ModernizedCProgram.time2str(time_total, total_estimate);
		ModernizedCProgram.time2str(time_spent, timespent);
		/* Get the total amount of data expected to get transferred */total_expected_transfer = ((generatedProgress.getFlags() & (1 << 5)) ? generatedProgress.getSize_ul() : generatedProgress.getUploaded()) + ((generatedProgress.getFlags() & (1 << 6)) ? generatedProgress.getSize_dl() : generatedProgress.getDownloaded());
		total_transfer = generatedProgress.getDownloaded() + generatedProgress.getUploaded();
		if (total_expected_transfer > .CURL_OFF_T_C(/* Get the percentage of data transferred so far */10000)) {
			total_percen = total_transfer / (total_expected_transfer / .CURL_OFF_T_C(100));
		}  else if (total_expected_transfer > .CURL_OFF_T_C(0)) {
			total_percen = (total_transfer * 100) / total_expected_transfer;
		} 
		Object generatedSet = data.getSet();
		.fflush(generatedSet.getErr());
		timeval stamp = new timeval();
		bool header = 0;
		timeval now = new timeval();
		long diff;
		 generatedNoprogress = global.getNoprogress();
		if (generatedNoprogress) {
			return 0;
		} 
		timeval timeval = new timeval();
		now = timeval.tvnow();
		diff = now.tvdiff(stamp);
		_iobuf generatedErrors = global.getErrors();
		if (!header) {
			header = 1;
			.fputs("DL% UL%  Dled  Uled  Xfers  Live   Qd Total     Current  Left    Speed\n", generatedErrors);
		} 
		Object generatedDlnow = per.getDlnow();
		Object generatedUlnow = per.getUlnow();
		Object generatedDltotal = per.getDltotal();
		 generatedDltotal_added = per.getDltotal_added();
		Object generatedUltotal = per.getUltotal();
		 generatedUltotal_added = per.getUltotal_added();
		 generatedAdded = per.getAdded();
		per_transfer generatedNext = per.getNext();
		return 0;
	}
	/*
	 * Curl_pgrsUpdate() returns 0 for success or the value returned by the
	 * progress callback!
	 */
	public int Curl_pgrsUpdate() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		curltime curltime = new curltime();
		curltime now = curltime.Curl_now();
		bool showprogress = ModernizedCProgram.progress_calc(conn, now);
		Object generatedProgress = data.getProgress();
		Object generatedSet = data.getSet();
		if (!(generatedProgress.getFlags() & (1 << 4))) {
			if (generatedSet.getFxferinfo()) {
				int result;
				data.Curl_set_in_callback(/* There's a callback set, call that */.bool_true);
				ModernizedCProgram.result = .UNRECOGNIZEDFUNCTIONNAME(generatedSet.getProgress_client(), generatedProgress.getSize_dl(), generatedProgress.getDownloaded(), generatedProgress.getSize_ul(), generatedProgress.getUploaded());
				data.Curl_set_in_callback(.bool_false);
				if (ModernizedCProgram.result) {
					data.Curl_failf("Callback aborted");
				} 
				return ModernizedCProgram.result;
			} 
			if (generatedSet.getFprogress()) {
				int result;
				data.Curl_set_in_callback(/* The older deprecated callback is set, call that */.bool_true);
				ModernizedCProgram.result = .UNRECOGNIZEDFUNCTIONNAME(generatedSet.getProgress_client(), (double)generatedProgress.getSize_dl(), (double)generatedProgress.getDownloaded(), (double)generatedProgress.getSize_ul(), (double)generatedProgress.getUploaded());
				data.Curl_set_in_callback(.bool_false);
				if (ModernizedCProgram.result) {
					data.Curl_failf("Callback aborted");
				} 
				return ModernizedCProgram.result;
			} 
			if (showprogress) {
				conn.progress_meter();
			} 
		} 
		return 0;
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
	/*
	 * NTLM details:
	 *
	 * https://davenport.sourceforge.io/ntlm.html
	 * https://www.innovation.ch/java/ntlm.html
	 */
	/* SSL backend-specific #if branches in this file must be kept in the order
	   documented in curl_ntlm_core. */
	/* The last 3 #include files should be in this order */
	public Object Curl_input_ntlm( proxy, Object header) {
		/* point to the correct struct with this */ntlmdata ntlm = new ntlmdata();
		curlntlm state = new curlntlm();
		 result = CURLE_OK;
		ntlmdata generatedProxyntlm = this.getProxyntlm();
		ntlmdata generatedNtlm = this.getNtlm();
		ntlm = proxy ? generatedProxyntlm : generatedNtlm;
		 generatedProxy_ntlm_state = this.getProxy_ntlm_state();
		 generatedHttp_ntlm_state = this.getHttp_ntlm_state();
		state = proxy ? generatedProxy_ntlm_state : generatedHttp_ntlm_state;
		Curl_easy generatedData = this.getData();
		if (ModernizedCProgram.curl_strnequal("NTLM", header, .strlen("NTLM"))) {
			header += .strlen("NTLM");
			while (header && (ModernizedCProgram.Curl_isspace((int)((byte)header)))) {
				header++;
			}
			if (header) {
				result = ModernizedCProgram.Curl_auth_decode_ntlm_type2_message(generatedData, header, ntlm);
				if (result) {
					return result;
				} 
				state = /* We got a type-2 message */.NTLMSTATE_TYPE2;
			} else {
					if (state == .NTLMSTATE_LAST) {
						generatedData.Curl_infof("NTLM auth restarted\n");
						conn.Curl_http_auth_cleanup_ntlm();
					}  else if (state == .NTLMSTATE_TYPE3) {
						generatedData.Curl_infof("NTLM handshake rejected\n");
						conn.Curl_http_auth_cleanup_ntlm();
						state = .NTLMSTATE_NONE;
						return CURLE_REMOTE_ACCESS_DENIED;
					}  else if (state >= .NTLMSTATE_TYPE1) {
						generatedData.Curl_infof("NTLM handshake failure (internal error)\n");
						return CURLE_REMOTE_ACCESS_DENIED;
					} 
					state = /* We should send away a type-1 */.NTLMSTATE_TYPE1;
			} 
		} 
		return result/*
		 * This is for creating ntlm header output
		 */;
	}
	/* if proxy or not */
	/* rest of the www-authenticate:
	                                                header */
	public Object Curl_output_ntlm( proxy) {
		byte base64 = ((Object)0);
		size_t len = 0;
		 result = new ();
		/* point to the address of the pointer that holds the string to send to the
		     server, which is for a plain host or for a HTTP proxy */
		byte allocuserpwd;
		/* point to the username, password, service and host */byte userp;
		byte passwdp;
		byte service = ((Object)0);
		byte hostname = ((Object)0);
		/* point to the correct struct with this */ntlmdata ntlm = new ntlmdata();
		curlntlm state = new curlntlm();
		auth authp = new auth();
		do {
		} while (0);
		do {
		} while (0);
		dynamically_allocated_data generatedAllocptr = this.getAllocptr();
		Byte generatedProxyuserpwd = generatedAllocptr.getProxyuserpwd();
		proxy_info generatedHttp_proxy = this.getHttp_proxy();
		Byte generatedUser = generatedHttp_proxy.getUser();
		Byte generatedPasswd = generatedHttp_proxy.getPasswd();
		Curl_easy generatedData = this.getData();
		Object generatedSet = generatedData.getSet();
		hostname generatedHost = generatedHttp_proxy.getHost();
		Byte generatedName = generatedHost.getName();
		ntlmdata generatedProxyntlm = this.getProxyntlm();
		 generatedProxy_ntlm_state = this.getProxy_ntlm_state();
		Object generatedState = generatedData.getState();
		Byte generatedUserpwd = generatedAllocptr.getUserpwd();
		ntlmdata generatedNtlm = this.getNtlm();
		 generatedHttp_ntlm_state = this.getHttp_ntlm_state();
		if (proxy) {
			allocuserpwd = generatedProxyuserpwd;
			userp = generatedUser;
			passwdp = generatedPasswd;
			service = generatedSet.getStr()[dupstring.STRING_PROXY_SERVICE_NAME] ? generatedSet.getStr()[dupstring.STRING_PROXY_SERVICE_NAME] : "HTTP";
			hostname = generatedName;
			ntlm = generatedProxyntlm;
			state = generatedProxy_ntlm_state;
			authp = generatedState.getAuthproxy();
		} else {
				allocuserpwd = generatedUserpwd;
				userp = generatedUser;
				passwdp = generatedPasswd;
				service = generatedSet.getStr()[dupstring.STRING_SERVICE_NAME] ? generatedSet.getStr()[dupstring.STRING_SERVICE_NAME] : "HTTP";
				hostname = generatedName;
				ntlm = generatedNtlm;
				state = generatedHttp_ntlm_state;
				authp = generatedState.getAuthhost();
		} 
		authp.setDone(0);
		if (!/* not set means empty */userp) {
			userp = "";
		} 
		if (!passwdp) {
			passwdp = ""/* not thread safe and leaks - use curl_global_init() to avoid */;
		} 
		switch (state) {
		case .NTLMSTATE_TYPE1:
		case .NTLMSTATE_TYPE2:
				result = ModernizedCProgram.Curl_auth_create_ntlm_type3_message(generatedData, userp, /* We already received the type-2 message, create a type-3 message */passwdp, ntlm, base64, len);
				if (result) {
					return result;
				} 
				if (base64) {
					.Curl_cfree(allocuserpwd);
					allocuserpwd = ModernizedCProgram.curl_maprintf("%sAuthorization: NTLM %s\r\n", proxy ? "Proxy-" : "", base64);
					.Curl_cfree(base64);
					if (!allocuserpwd) {
						return CURLE_OUT_OF_MEMORY;
					} 
					do {
					} while (0);
					state = /* we send a type-3 */.NTLMSTATE_TYPE3;
					authp.setDone(1);
				} 
				break;
		case .NTLMSTATE_TYPE3/* connection is already authenticated,
		     * don't send a header in future requests */:
				state = .NTLMSTATE_LAST;
		case /* FALLTHROUGH */.NTLMSTATE_LAST:
				do {
					.Curl_cfree((allocuserpwd));
					(allocuserpwd) = ((Object)0);
				} while (0);
				authp.setDone(1);
				break;
		default:
				result = ModernizedCProgram.Curl_auth_create_ntlm_type1_message(generatedData, userp, /* Create a type-1 message */passwdp, service, hostname, ntlm, base64, len);
				if (result) {
					return result;
				} 
				if (base64) {
					.Curl_cfree(allocuserpwd);
					allocuserpwd = ModernizedCProgram.curl_maprintf("%sAuthorization: NTLM %s\r\n", proxy ? "Proxy-" : "", base64);
					.Curl_cfree(base64);
					if (!allocuserpwd) {
						return CURLE_OUT_OF_MEMORY;
					} 
					do {
					} while (0);
				} 
				break;
		}
		return CURLE_OK;
	}
	public void Curl_http_auth_cleanup_ntlm() {
		ntlmdata generatedNtlm = this.getNtlm();
		generatedNtlm.Curl_auth_cleanup_ntlm();
		ntlmdata generatedProxyntlm = this.getProxyntlm();
		generatedProxyntlm.Curl_auth_cleanup_ntlm();
	}
	/***************************************************************************
	 *                                  _   _ ____  _
	 *  Project                     ___| | | |  _ \| |
	 *                             / __| | | | |_) | |
	 *                            | (__| |_| |  _ <| |___
	 *                             \___|\___/|_| \_\_____|
	 *
	 * Copyright (C) 1998 - 2018, Daniel Stenberg, <daniel@haxx.se>, et al.
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
	/***********************************************************************
	 * Only for plain IPv4 builds
	 **********************************************************************/
	/* plain IPv4 code coming up */
	/* The last 3 #include files should be in this order */
	/*
	 * Curl_ipvalid() checks what CURL_IPRESOLVE_* requirements that might've
	 * been set and returns TRUE if they are OK.
	 */
	public  Curl_ipvalid() {
		long generatedIp_version = this.getIp_version();
		if (generatedIp_version == CURL_IPRESOLVE_V6) {
			return /* An IPv6 address was requested and we can't get/use one */0;
		} 
		return /* OK, proceed */1/*
		 * Curl_getaddrinfo() - the IPv4 synchronous version.
		 *
		 * The original code to this function was from the Dancer source code, written
		 * by Bjorn Reese, it has since been patched and modified considerably.
		 *
		 * gethostbyname_r() is the thread-safe version of the gethostbyname()
		 * function. When we build for plain IPv4, we attempt to use this
		 * function. There are _three_ different gethostbyname_r() versions, and we
		 * detect which one this platform supports in the configure script and set up
		 * the HAVE_GETHOSTBYNAME_R_3, HAVE_GETHOSTBYNAME_R_5 or
		 * HAVE_GETHOSTBYNAME_R_6 defines accordingly. Note that HAVE_GETADDRBYNAME
		 * has the corresponding rules. This is primarily on *nix. Note that some unix
		 * flavours have thread-safe versions of the plain gethostbyname() etc.
		 *
		 */;
	}
	public Object Curl_fillreadbuffer(Object bytes, Object nreadp) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		size_t buffersize = bytes;
		size_t nread = new size_t();
		 readfunc = ((Object)0);
		Object extra_data = ((Object)0);
		Object generatedState = data.getState();
		Curl_send_buffer curl_send_buffer = new Curl_send_buffer();
		Object generatedSet = data.getSet();
		if (generatedState.getTrailers_state() == /* We're sending the HTTP request headers, not the data.
		         Remember that so we don't re-translate them into garbage. */.TRAILERS_INITIALIZED) {
			curl_slist trailers = ((Object)0);
			 result = new ();
			int trailers_ret_code;
			/* at this point we already verified that the callback exists
			       so we compile and store the trailers buffer, then proceed */data.Curl_infof("Moving trailers state machine from initialized to sending.\n");
			generatedState.setTrailers_state(.TRAILERS_SENDING);
			generatedState.setTrailers_buf(curl_send_buffer.Curl_add_buffer_init());
			if (!generatedState.getTrailers_buf()) {
				data.Curl_failf("Unable to allocate trailing headers buffer !");
				return CURLE_OUT_OF_MEMORY;
			} 
			generatedState.setTrailers_bytes_sent(0);
			data.Curl_set_in_callback(.bool_true);
			trailers_ret_code = .UNRECOGNIZEDFUNCTIONNAME(trailers, generatedSet.getTrailer_data());
			data.Curl_set_in_callback(.bool_false);
			if (trailers_ret_code == CURL_TRAILERFUNC_OK) {
				ModernizedCProgram.result = ModernizedCProgram.Curl_http_compile_trailers(trailers, generatedState.getTrailers_buf(), data);
			} else {
					data.Curl_failf("operation aborted by trailing headers callback");
					nreadp = 0;
					ModernizedCProgram.result = CURLE_ABORTED_BY_CALLBACK;
			} 
			if (ModernizedCProgram.result) {
				generatedState.getTrailers_buf().Curl_add_buffer_free();
				trailers.curl_slist_free_all();
				return ModernizedCProgram.result;
			} 
			data.Curl_infof("Successfully compiled trailers.\r\n");
			trailers.curl_slist_free_all();
		} 
		Object generatedReq = data.getReq();
		if (generatedReq.getUpload_chunky() && generatedState.getTrailers_state() == .TRAILERS_NONE) {
			buffersize -= (8 + 2 + /* if chunked Transfer-Encoding *//* 32bit hex + CRLF + CRLF */2);
			generatedReq.getUpload_fromhere() += (8 + /* 32bit hex + CRLF */2);
		} 
		if (generatedState.getTrailers_state() == .TRAILERS_SENDING/* if we're here then that means that we already sent the last empty chunk
		       but we didn't send a final CR LF, so we sent 0 CR LF. We then start
		       pulling trailing data until we have no more at which point we
		       simply return to the previous point in the state machine as if
		       nothing happened.
		       */) {
			readfunc = Curl_trailers_read;
			extra_data = (Object)data;
		} else {
				readfunc = generatedState.getFread_func();
				extra_data = generatedState.getIn();
		} 
		data.Curl_set_in_callback(.bool_true);
		nread = ModernizedCProgram.readfunc(generatedReq.getUpload_fromhere(), 1, buffersize, extra_data);
		data.Curl_set_in_callback(.bool_false);
		if (nread == CURL_READFUNC_ABORT) {
			data.Curl_failf("operation aborted by callback");
			nreadp = 0;
			return CURLE_ABORTED_BY_CALLBACK;
		} 
		Object generatedHandler = this.getHandler();
		int generatedKeepon = k.getKeepon();
		if (nread == CURL_READFUNC_PAUSE) {
			SingleRequest k = generatedReq;
			if (generatedHandler.getFlags() & (1 << 4/* protocols that work without network cannot be paused. This is
			         actually only FILE:// just now, and it can't pause since the transfer
			         isn't done using the "normal" procedure. */)) {
				data.Curl_failf("Read callback asked for PAUSE when not supported!");
				return CURLE_READ_ERROR;
			} 
			generatedKeepon |=  (1 << /* CURL_READFUNC_PAUSE pauses read callbacks that feed socket writes *//* mark socket send as paused */5);
			if (generatedReq.getUpload_chunky()) {
				generatedReq.getUpload_fromhere() -= (8 + /* Back out the preallocation done above */2);
			} 
			nreadp = 0;
			return /* nothing was read */CURLE_OK;
		}  else if (nread > buffersize) {
			nreadp = /* the read function returned a too large value */0;
			data.Curl_failf("read function returned funny value");
			return CURLE_READ_ERROR;
		} 
		if (!generatedReq.getForbidchunk() && generatedReq.getUpload_chunky()) {
			bool added_crlf = 0;
			int hexlen = 0;
			byte endofline_native;
			byte endofline_network;
			if ((generatedSet.getCrlf())) {
				endofline_native = /* \n will become \r\n later on */"\n";
				endofline_network = "\x0a";
			} else {
					endofline_native = "\r\n";
					endofline_network = "\x0d\x0a";
			} 
			if (generatedState.getTrailers_state() != /* if we're not handling trailing data, proceed as usual */.TRAILERS_SENDING) {
				byte[] hexbuffer = "";
				hexlen = ModernizedCProgram.curl_msnprintf(hexbuffer, , "%zx%s", nread, endofline_native);
				generatedReq.getUpload_fromhere() -= /* move buffer pointer */hexlen;
				nread += hexlen;
				.memcpy(generatedReq.getUpload_fromhere(), hexbuffer, /* copy the prefix to the buffer, leaving out the NUL */hexlen/* always append ASCII CRLF to the data unless
				         we have a valid trailer callback */);
				if ((nread - hexlen) == 0 && generatedSet.getTrailer_callback() != ((Object)0) && generatedState.getTrailers_state() == .TRAILERS_NONE) {
					generatedState.setTrailers_state(.TRAILERS_INITIALIZED);
				} else {
						.memcpy(generatedReq.getUpload_fromhere() + nread, endofline_network, .strlen(endofline_network));
						added_crlf = 1/* translate the protocol and data */;
				} 
			} 
			if (generatedState.getTrailers_state() == /* Curl_convert_to_network calls failf if unsuccessful *//* CURL_DOES_CONVERSIONS */.TRAILERS_SENDING && !ModernizedCProgram.Curl_trailers_left(data)) {
				generatedState.getTrailers_buf().Curl_add_buffer_free();
				generatedState.setTrailers_state(.TRAILERS_DONE);
				generatedSet.setTrailer_data(((Object)0));
				generatedSet.setTrailer_callback(((Object)0));
				generatedReq.setUpload_done(/* mark the transfer as done */1);
				data.Curl_infof("Signaling end of chunked upload after trailers.\n");
			}  else if ((nread - hexlen) == 0 && generatedState.getTrailers_state() != .TRAILERS_INITIALIZED) {
				generatedReq.setUpload_done(/* mark this as done once this chunk is transferred */1);
				data.Curl_infof("Signaling end of chunked upload via terminating chunk.\n");
			} 
			if (added_crlf) {
				nread += .strlen(/* for the added end of line */endofline_network);
			} 
		} 
		nreadp = /* Curl_convert_to_network calls failf if unsuccessful *//* CURL_DOES_CONVERSIONS */nread;
		return CURLE_OK/*
		 * Curl_readrewind() rewinds the read stream. This is typically used for HTTP
		 * POST/PUT with multi-pass authentication when a sending was denied and a
		 * resend is necessary.
		 */;
	}
	public Object Curl_readrewind() {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedSet = data.getSet();
		 mimepart = generatedSet.getMimepost();
		ConnectBits generatedBits = this.getBits();
		generatedBits.setRewindaftersend(/* we rewind now */0/* explicitly switch off sending data on this connection now since we are
		     about to restart a new transfer and thus we want to avoid inadvertently
		     sending more data on the existing connection until the next transfer
		     starts */);
		Object generatedReq = data.getReq();
		generatedReq.getKeepon() &=  ~(1 << 1/* We have sent away data. If not using CURLOPT_POSTFIELDS or
		     CURLOPT_HTTPPOST, call app to rewind
		  */);
		Object generatedHandler = this.getHandler();
		Object generatedSendit = http.getSendit();
		if (generatedHandler.getProtocol() & (CURLPROTO_HTTP | CURLPROTO_HTTPS)) {
			HTTP http = generatedReq.getProtop();
			if (generatedSendit) {
				mimepart = generatedSendit;
			} 
		} 
		Object generatedState = data.getState();
		if (generatedSet.getPostfields()) {
			;
		}  else if (generatedSet.getHttpreq() == .HTTPREQ_POST_MIME || generatedSet.getHttpreq() == .HTTPREQ_POST_FORM) {
			if (ModernizedCProgram.Curl_mime_rewind(mimepart)) {
				data.Curl_failf("Cannot rewind mime/post data");
				return CURLE_SEND_FAIL_REWIND;
			} 
		} else {
				if (generatedSet.getSeek_func()) {
					int err;
					data.Curl_set_in_callback(.bool_true);
					err = .UNRECOGNIZEDFUNCTIONNAME(generatedSet.getSeek_client(), 0, 0);
					data.Curl_set_in_callback(.bool_false);
					if (err) {
						data.Curl_failf("seek callback returned error %d", (int)err);
						return CURLE_SEND_FAIL_REWIND;
					} 
				}  else if (generatedSet.getIoctl_func()) {
					 err = new ();
					data.Curl_set_in_callback(.bool_true);
					err = .UNRECOGNIZEDFUNCTIONNAME(data, CURLIOCMD_RESTARTREAD, generatedSet.getIoctl_client());
					data.Curl_set_in_callback(.bool_false);
					data.Curl_infof("the ioctl callback returned %d\n", (int)err);
					if (err) {
						data.Curl_failf("ioctl callback returned error %d", (int)err);
						return CURLE_SEND_FAIL_REWIND;
					} 
				} else {
						if (generatedState.getFread_func() == ()/* If no CURLOPT_READFUNCTION is used, we know that we operate on a
						         given FILE * stream and we can actually attempt to rewind that
						         ourselves with fseek() */ModernizedCProgram.fread) {
							if (-1 != .fseek(generatedState.getIn(), 0, 0)) {
								return /* successful rewind */CURLE_OK;
							} 
						} 
						data.Curl_failf(/* no callback set or failure above, makes us fail at once */"necessary data rewind wasn't possible");
						return CURLE_SEND_FAIL_REWIND;
				} 
		} 
		return CURLE_OK;
	}
	/* Returns CURLE_OK *and* sets '*url' if a request retry is wanted.
	
	   NOTE: that the *url is malloc()ed. */
	public Object Curl_retry_request(byte url) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		bool retry = 0;
		url = ((Object)0);
		Object generatedSet = data.getSet();
		Object generatedHandler = this.getHandler();
		if (generatedSet.getUpload() && !(generatedHandler.getProtocol() & ((CURLPROTO_HTTP | CURLPROTO_HTTPS) | CURLPROTO_RTSP))) {
			return CURLE_OK;
		} 
		Object generatedReq = data.getReq();
		ConnectBits generatedBits = this.getBits();
		Object generatedReuse = generatedBits.getReuse();
		Object generatedState = data.getState();
		if ((generatedReq.getBytecount() + generatedReq.getHeaderbytecount() == 0) && generatedReuse && (!generatedSet.getOpt_no_body() || (generatedHandler.getProtocol() & (CURLPROTO_HTTP | CURLPROTO_HTTPS))) && (generatedSet.getRtspreq() != .RTSPREQ_RECEIVE/* We got no data, we attempted to re-use a connection. For HTTP this
		       can be a retry so we try again regardless if we expected a body.
		       For other protocols we only try again only if we expected a body.
		
		       This might happen if the connection was left alive when we were
		       done using it before, but that was closed when we wanted to read from
		       it again. Bad luck. Retry the same request on a fresh connect! */)) {
			retry = 1;
		}  else if (generatedState.getRefused_stream() && (generatedReq.getBytecount() + generatedReq.getHeaderbytecount() == 0/* This was sent on a refused stream, safe to rerun. A refused stream
		       error can typically only happen on HTTP/2 level if the stream is safe
		       to issue again, but the nghttp2 API can deliver the message to other
		       streams as well, which is why this adds the check the data counters
		       too. */)) {
			generatedData.Curl_infof("REFUSED_STREAM, retrying a fresh connect\n");
			generatedState.setRefused_stream(/* clear again */0);
			retry = 1;
		} 
		Object generatedChange = generatedData.getChange();
		if (retry) {
			generatedData.Curl_infof("Connection died, retrying a fresh connect\n");
			url = .Curl_cstrdup(generatedChange.getUrl());
			if (!url) {
				return CURLE_OUT_OF_MEMORY;
			} 
			conn.Curl_conncontrol(/* close this connection */1);
			generatedBits.setRetry(/* mark this as a connection we're about
			                                to retry. Marking it this way should
			                                prevent i.e HTTP transfers to return
			                                error just because nothing has been
			                                transferred! */1);
			if (generatedHandler.getProtocol() & (CURLPROTO_HTTP | CURLPROTO_HTTPS)) {
				if (generatedReq.getWritebytecount()) {
					 result = conn.Curl_readrewind();
					if (ModernizedCProgram.result) {
						do {
							.Curl_cfree((url));
							(url) = ((Object)0);
						} while (0);
						return ModernizedCProgram.result;
					} 
				} 
			} 
		} 
		return CURLE_OK/*
		 * Curl_setup_transfer() is called to setup some basic properties for the
		 * upcoming transfer.
		 */;
	}
	public Object file_setup_connection() {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		generatedReq.setProtop(.Curl_ccalloc(1, /* allocate the FILE specific struct */));
		if (!generatedReq.getProtop()) {
			return CURLE_OUT_OF_MEMORY;
		} 
		return CURLE_OK/*
		 * file_connect() gets called from Curl_protocol_connect() to allow us to
		 * do protocol-specific actions at connect-time.  We emulate a
		 * connect-then-transfer protocol and "connect" to the file here
		 */;
	}
	/*
	 * FILE scheme handler.
	 */
	public Object file_connect( done) {
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		byte real_path;
		Object generatedReq = data.getReq();
		FILEPROTO file = generatedReq.getProtop();
		int fd;
		size_t i = new size_t();
		byte actual_path;
		size_t real_path_len = new size_t();
		Object generatedState = data.getState();
		 result = data.Curl_urldecode(generatedState.getUp().getPath(), 0, real_path, real_path_len, 0);
		if (result) {
			return result/* If the first character is a slash, and there's
			     something that looks like a drive at the beginning of
			     the path, skip the slash.  If we remove the initial
			     slash in all cases, paths without drive letters end up
			     relative to the current directory which isn't how
			     browsers work.
			
			     Some browsers accept | instead of : as the drive letter
			     separator, so we do too.
			
			     On other platforms, we need the slash to indicate an
			     absolute pathname.  On Windows, absolute paths start
			     with a drive letter.
			  */;
		} 
		actual_path = real_path;
		if ((actual_path[0] == (byte)'/') && actual_path[1] && (actual_path[2] == (byte)':' || actual_path[2] == (byte)'|')) {
			actual_path[2] = (byte)':';
			actual_path++;
			real_path_len--;
		} 
		for (i = 0; i < real_path_len; ++/* change path separators from '/' to '\\' for DOS, Windows and OS/2 */i) {
			if (actual_path[i] == (byte)'/') {
				actual_path[i] = (byte)'\\';
			}  else if (!actual_path[/* binary zero */i]) {
				do {
					.Curl_cfree((real_path));
					(real_path) = ((Object)0);
				} while (0);
				return CURLE_URL_MALFORMAT;
			} 
		}
		fd = .open((actual_path), (0 | -1024));
		file.setPath(actual_path/* binary zeroes indicate foul play */);
		file.setFreepath(/* free this when done */real_path);
		file.setFd(fd);
		Object generatedSet = data.getSet();
		if (!generatedSet.getUpload() && (fd == -1)) {
			data.Curl_failf("Couldn't open file %s", generatedState.getUp().getPath());
			conn.file_done(CURLE_FILE_COULDNT_READ_FILE, 0);
			return CURLE_FILE_COULDNT_READ_FILE;
		} 
		done = 1;
		return CURLE_OK;
	}
	public Object file_done(Object status,  premature) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		FILEPROTO file = generatedReq.getProtop();
		(Object)/* not used */status;
		(Object)/* not used */premature;
		Byte generatedFreepath = file.getFreepath();
		int generatedFd = file.getFd();
		if (file) {
			do {
				.Curl_cfree((generatedFreepath));
				(generatedFreepath) = ((Object)0);
			} while (0);
			file.setPath(((Object)0));
			if (generatedFd != -1) {
				.close(generatedFd);
			} 
			file.setFd(-1);
		} 
		return CURLE_OK;
	}
	public Object file_disconnect( dead_connection) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		FILEPROTO file = generatedReq.getProtop();
		(Object)/* not used */dead_connection;
		Byte generatedFreepath = file.getFreepath();
		int generatedFd = file.getFd();
		if (file) {
			do {
				.Curl_cfree((generatedFreepath));
				(generatedFreepath) = ((Object)0);
			} while (0);
			file.setPath(((Object)0));
			if (generatedFd != -1) {
				.close(generatedFd);
			} 
			file.setFd(-1);
		} 
		return CURLE_OK;
	}
	public Object file_upload() {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		FILEPROTO file = generatedReq.getProtop();
		Byte generatedPath = file.getPath();
		byte dir = .strchr(generatedPath, (byte)'\\');
		int fd;
		int mode;
		 result = CURLE_OK;
		Curl_easy data = generatedData;
		Object generatedState = data.getState();
		byte buf = generatedState.getBuffer();
		 bytecount = 0;
		_stati64 file_stat = new _stati64();
		byte buf2;
		/*
		   * Since FILE: doesn't do the full init, we need to provide some extra
		   * assignments here.
		   */
		generatedReq.setUpload_fromhere(buf);
		if (!dir) {
			return /* fix: better error code */CURLE_FILE_COULDNT_READ_FILE;
		} 
		if (!dir[1]) {
			return /* fix: better error code */CURLE_FILE_COULDNT_READ_FILE;
		} 
		if (generatedState.getResume_from()) {
			mode = 1 | -1024 | -1024 | -1024;
		} else {
				mode = 1 | -1024 | -1024 | -1024;
		} 
		Object generatedSet = generatedData.getSet();
		fd = .open(generatedPath, mode, generatedSet.getNew_file_perms());
		if (fd < 0) {
			data.Curl_failf("Can't open %s for writing", generatedPath);
			return CURLE_WRITE_ERROR;
		} 
		if (-1 != generatedState.getInfilesize()) {
			data.Curl_pgrsSetUploadSize(generatedState.getInfilesize());
		} 
		Object generatedSt_size = file_stat.getSt_size();
		if (generatedState.getResume_from() < /* treat the negative resume offset value as the case of "-" */0) {
			if (._fstati64(fd, file_stat)) {
				.close(fd);
				data.Curl_failf("Can't get the size of %s", generatedPath);
				return CURLE_WRITE_ERROR;
			} 
			generatedState.setResume_from(()generatedSt_size);
		} 
		curltime curltime = new curltime();
		while (!result) {
			size_t nread = new size_t();
			size_t nwrite = new size_t();
			size_t readcount = new size_t();
			result = conn.Curl_fillreadbuffer(generatedSet.getBuffer_size(), readcount);
			if (result) {
				break;
			} 
			if (!readcount) {
				break;
			} 
			nread = readcount;
			if (generatedState.getResume_from()) {
				if (()nread <= generatedState.getResume_from()) {
					generatedState.getResume_from() -= nread;
					nread = 0;
					buf2 = buf;
				} else {
						buf2 = buf + generatedState.getResume_from();
						nread -= (size_t)generatedState.getResume_from();
						generatedState.setResume_from(0);
				} 
			} else {
					buf2 = buf;
			} 
			nwrite = ModernizedCProgram.curlx_write(fd, buf2, /* write the data to the target */nread);
			if (nwrite != nread) {
				result = CURLE_SEND_ERROR;
				break;
			} 
			bytecount += nread;
			data.Curl_pgrsSetUploadCounter(bytecount);
			if (conn.Curl_pgrsUpdate()) {
				result = CURLE_ABORTED_BY_CALLBACK;
			} else {
					result = ModernizedCProgram.Curl_speedcheck(data, curltime.Curl_now());
			} 
		}
		if (!result && conn.Curl_pgrsUpdate()) {
			result = CURLE_ABORTED_BY_CALLBACK;
		} 
		.close(fd);
		return result/*
		 * file_do() is the protocol-specific function for the do-phase, separated
		 * from the connect-phase above. Other protocols merely setup the transfer in
		 * the do-phase, to have it done in the main transfer loop but since some
		 * platforms we support don't allow select()ing etc on file handles (as
		 * opposed to sockets) we instead perform the whole do-operation in this
		 * function.
		 */;
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
	/* for the week day and month names */
	/* The last 3 #include files should be in this order */
	/*
	 * Forward declarations.
	 */
	public Object file_do( done) {
		 result = CURLE_OK;
		/* struct_stat instead of struct stat just to allow the
		                          Windows version to have a different struct without
		                          having to redefine the simple word 'stat' */_stati64 statbuf = new _stati64();
		 expected_size = 0;
		bool size_known = new bool();
		bool fstated = 0;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedState = data.getState();
		byte buf = generatedState.getBuffer();
		 bytecount = 0;
		int fd;
		FILEPROTO file = new FILEPROTO();
		done = /* unconditionally */1;
		data.Curl_pgrsStartNow();
		Object generatedSet = data.getSet();
		if (generatedSet.getUpload()) {
			return conn.file_upload();
		} 
		Object generatedReq = generatedData.getReq();
		file = generatedReq.getProtop();
		int generatedFd = file.getFd();
		fd = generatedFd;
		Object generatedSt_size = statbuf.getSt_size();
		Object generatedSt_mtime = statbuf.getSt_mtime();
		Object generatedInfo = data.getInfo();
		if (-1 != ._fstati64(fd, /* VMS: This only works reliable for STREAMLF files */statbuf)) {
			expected_size = generatedSt_size;
			generatedInfo.setFiletime(generatedSt_mtime);
			fstated = 1;
		} 
		if (fstated && !generatedState.getRange() && generatedSet.getTimecondition()) {
			if (!data.Curl_meets_timecondition(generatedInfo.getFiletime())) {
				done = 1;
				return CURLE_OK;
			} 
		} 
		result = /* Check whether file range has been specified */conn.Curl_range();
		if (result) {
			return result;
		} 
		if (generatedState.getResume_from() < /* Adjust the start offset in case we want to get the N last bytes
		   * of the stream if the filesize could be determined */0) {
			if (!fstated) {
				data.Curl_failf("Can't get the size of file.");
				return CURLE_READ_ERROR;
			} 
			generatedState.getResume_from() += ()generatedSt_size;
		} 
		if (generatedState.getResume_from() <= expected_size) {
			expected_size -= generatedState.getResume_from();
		} else {
				data.Curl_failf("failed to resume file:// transfer");
				return CURLE_BAD_DOWNLOAD_RESUME;
		} 
		if (generatedReq.getMaxdownload() > /* A high water mark has been specified so we obey... */0) {
			expected_size = generatedReq.getMaxdownload();
		} 
		if (!fstated || (expected_size == 0)) {
			size_known = 0;
		} else {
				size_known = 1/* The following is a shortcut implementation of file reading
				     this is both more efficient than the former call to download() and
				     it avoids problems with select() and recv() on file descriptors
				     in Winsock */;
		} 
		if (fstated) {
			data.Curl_pgrsSetDownloadSize(expected_size);
		} 
		if (generatedState.getResume_from()) {
			if (generatedState.getResume_from() != ._lseeki64(fd, generatedState.getResume_from(), 0)) {
				return CURLE_BAD_DOWNLOAD_RESUME;
			} 
		} 
		data.Curl_pgrsTime(.TIMER_STARTTRANSFER);
		curltime curltime = new curltime();
		while (!result) {
			ssize_t nread = new ssize_t();
			size_t bytestoread = new size_t();
			if (size_known) {
				bytestoread = (expected_size < generatedSet.getBuffer_size()) ? ModernizedCProgram.curlx_sotouz(expected_size) : (size_t)generatedSet.getBuffer_size();
			} else {
					bytestoread = generatedSet.getBuffer_size() - 1;
			} 
			nread = ModernizedCProgram.curlx_read(fd, buf, bytestoread);
			if (nread > 0) {
				buf[nread] = 0;
			} 
			if (nread <= 0 || (size_known && (expected_size == 0))) {
				break;
			} 
			bytecount += nread;
			if (size_known) {
				expected_size -= nread;
			} 
			result = conn.Curl_client_write((1 << 0), buf, nread);
			if (result) {
				return result;
			} 
			data.Curl_pgrsSetDownloadCounter(bytecount);
			if (conn.Curl_pgrsUpdate()) {
				result = CURLE_ABORTED_BY_CALLBACK;
			} else {
					result = ModernizedCProgram.Curl_speedcheck(data, curltime.Curl_now());
			} 
		}
		if (conn.Curl_pgrsUpdate()) {
			result = CURLE_ABORTED_BY_CALLBACK;
		} 
		return result;
	}
	/* This implementation ignores the host name in conformance with
	     RFC 1738. Only local files (reachable via the standard file system)
	     are supported. This means that files on remotely mounted directories
	     (via NFS, Samba, NT sharing) can be accessed through a file:// URL
	  */
	public void Curl_resolver_cancel() {
		Curl_async generatedAsync = this.getAsync();
		generatedAsync.destroy_async_data();
	}
	public int getaddrinfo_complete() {
		thread_sync_data thread_sync_data = new thread_sync_data();
		thread_sync_data tsd = thread_sync_data.conn_thread_sync_data(conn);
		int rc;
		int generatedSock_error = tsd.getSock_error();
		Curl_addrinfo generatedRes = tsd.getRes();
		rc = ModernizedCProgram.Curl_addrinfo_callback(conn, generatedSock_error, generatedRes);
		tsd.setRes(((Object)0));
		return rc/*
		 * getaddrinfo_thread() resolves a name and then exits.
		 *
		 * For builds without ARES, but with ENABLE_IPV6, create a resolver thread
		 * and wait on it.
		 */;
	}
	/* This function is used to init a threaded resolve */
	public  init_resolve_thread(Object hostname, int port, Object hints) {
		thread_data td = .Curl_ccalloc(1, );
		int err = 12;
		Curl_async generatedAsync = this.getAsync();
		generatedAsync.setOs_specific((Object)td);
		if (!td) {
			;
		} 
		generatedAsync.setPort(port);
		generatedAsync.setDone(0);
		generatedAsync.setStatus(0);
		generatedAsync.setDns(((Object)0));
		td.setThread_hnd((HANDLE)0);
		if (!td.init_thread_sync_data(hostname, port, hints)) {
			generatedAsync.setOs_specific(((Object)0));
			.Curl_cfree(td);
			;
		} 
		Byte generatedHostname = generatedAsync.getHostname();
		.Curl_cfree(generatedHostname);
		generatedAsync.setHostname(.Curl_cstrdup(hostname));
		if (!generatedHostname) {
			;
		} 
		thread_sync_data generatedTsd = td.getTsd();
		generatedTsd.setDone(/* The thread will set this to 1 when complete. */0);
		td.setThread_hnd(ModernizedCProgram.Curl_thread_create(gethostbyname_thread, generatedTsd));
		Object generatedThread_hnd = td.getThread_hnd();
		if (!generatedThread_hnd) {
			generatedTsd.setDone(/* The thread never started, so mark it as done here for proper cleanup. */1);
			err = (._errno());
			;
		} 
		return 1;
		return 0/*
		 * resolver_error() calls failf() with the appropriate message after a resolve
		 * error
		 */;
	}
	public Object resolver_error() {
		byte host_or_proxy;
		 result = new ();
		ConnectBits generatedBits = this.getBits();
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		if (generatedHttpproxy) {
			host_or_proxy = "proxy";
			result = CURLE_COULDNT_RESOLVE_PROXY;
		} else {
				host_or_proxy = "host";
				result = CURLE_COULDNT_RESOLVE_HOST;
		} 
		Curl_easy generatedData = this.getData();
		Curl_async generatedAsync = this.getAsync();
		Byte generatedHostname = generatedAsync.getHostname();
		generatedData.Curl_failf("Could not resolve %s: %s", host_or_proxy, generatedHostname);
		return result;
	}
	public void Curl_resolver_kill() {
		Curl_async generatedAsync = this.getAsync();
		Object generatedOs_specific = generatedAsync.getOs_specific();
		thread_data td = (thread_data)generatedOs_specific;
		Object generatedThread_hnd = td.getThread_hnd();
		if (td && generatedThread_hnd != (HANDLE)0) {
			(Object)ModernizedCProgram.thread_wait_resolv(conn, ((Object)0), 0);
		} else {
				conn/*
				 * Curl_resolver_wait_resolv()
				 *
				 * Waits for a resolve to finish. This function should be avoided since using
				 * this risk getting the multi interface to "hang".
				 *
				 * If 'entry' is non-NULL, make it point to the resolved dns entry
				 *
				 * Returns CURLE_COULDNT_RESOLVE_HOST if the host was not resolved,
				 * CURLE_OPERATION_TIMEDOUT if a time-out occurred, or other errors.
				 *
				 * This is the version for resolves-in-a-thread.
				 */.Curl_resolver_cancel();
		} 
	}
	public int Curl_resolver_getsock(Object socks) {
		int ret_val = 0;
		time_t milli = new time_t();
		timediff_t ms = new timediff_t();
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedState = data.getState();
		resdata reslv = (resdata)generatedState.getResolver();
		Curl_async generatedAsync = this.getAsync();
		Object generatedOs_specific = generatedAsync.getOs_specific();
		thread_data td = (thread_data)generatedOs_specific;
		thread_sync_data generatedTsd = td.getTsd();
		Object generatedSock_pair = generatedTsd.getSock_pair();
		curltime curltime = new curltime();
		curltime generatedStart = reslv.getStart();
		if (td) {
			socks[0] = generatedSock_pair[/* return read fd to client for polling the DNS resolution status */0];
			do {
			} while (0);
			generatedTsd.setConn(conn);
			ret_val = (1 << (false));
		} else {
				ms = curltime.Curl_now().Curl_timediff(generatedStart);
				if (ms < 3) {
					milli = 0;
				}  else if (ms <= 50) {
					milli = (time_t)ms / 3;
				}  else if (ms <= 250) {
					milli = 50;
				} else {
						milli = 200;
				} 
				data.Curl_expire(milli, .EXPIRE_ASYNC_NAME);
		} 
		return ret_val;
	}
	public Object init_telnet() {
		TELNET tn = new TELNET();
		tn = .Curl_ccalloc(1, );
		if (!tn) {
			return CURLE_OUT_OF_MEMORY;
		} 
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		generatedReq.setProtop(/* make us known */tn);
		tn.setTelrcv_state(.CURL_TS_DATA);
		Object generatedSubbuffer = tn.getSubbuffer();
		tn.setSubpointer(generatedSubbuffer);
		Object generatedUs_preferred = tn.getUs_preferred();
		generatedUs_preferred[3] = /* Set the options we want by default */1;
		Object generatedHim_preferred = tn.getHim_preferred();
		generatedHim_preferred[3] = 1/* To be compliant with previous releases of libcurl
		     we enable this option by default. This behaviour
		         can be changed thanks to the "BINARY" option in
		         CURLOPT_TELNETOPTIONS
		  */;
		generatedUs_preferred[0] = 1;
		generatedHim_preferred[0] = 1/* We must allow the server to echo what we sent
		         but it is not necessary to request the server
		         to do so (it might forces the server to close
		         the connection). Hence, we ignore ECHO in the
		         negotiate function
		  */;
		generatedHim_preferred[1] = 1/* Set the subnegotiation fields to send information
		    just after negotiation passed (do/will)
		
		     Default values are (0,0) initialized by calloc.
		     According to the RFC1013 it is valid:
		     A value equal to zero is acceptable for the width (or height),
		         and means that no character width (or height) is being sent.
		         In this case, the width (or height) that will be assumed by the
		         Telnet server is operating system specific (it will probably be
		         based upon the terminal type information that may have been sent
		         using the TERMINAL TYPE Telnet option). */;
		Object generatedSubnegotiation = tn.getSubnegotiation();
		generatedSubnegotiation[31] = 1;
		return CURLE_OK;
	}
	public void negotiate() {
		int i;
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		TELNET tn = (TELNET)generatedReq.getProtop();
		Object generatedUs_preferred = tn.getUs_preferred();
		Object generatedHim_preferred = tn.getHim_preferred();
		for (i = 0; i < 40; i++) {
			if (i == 1) {
				continue;
			} 
			if (generatedUs_preferred[i] == 1) {
				conn.set_local_option(i, 1);
			} 
			if (generatedHim_preferred[i] == 1) {
				conn.set_remote_option(i, 1);
			} 
		}
	}
	public void send_negotiation(int cmd, int option) {
		byte[] buf = new byte[3];
		ssize_t bytes_written = new ssize_t();
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		buf[0] = 255;
		buf[1] = (byte)cmd;
		buf[2] = (byte)option;
		Object generatedSock = this.getSock();
		bytes_written = (ssize_t).send((SOCKET)(generatedSock[0]), (byte)(buf), (int)(true), (int)(false));
		if (bytes_written < 0) {
			int err = ((int).WSAGetLastError());
			data.Curl_failf("Sending data failed (%d)", err);
		} 
		generatedData.printoption("SENT", cmd, option);
	}
	public void set_remote_option(int option, int newstate) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		TELNET tn = (TELNET)generatedReq.getProtop();
		Object generatedHim = tn.getHim();
		Object generatedHimq = tn.getHimq();
		if (newstate == 1) {
			switch (generatedHim[option]) {
			case 2:
					switch (generatedHimq[option]) {
					case 1:
							generatedHimq[option] = 0;
							break;
					case 0/* Error: already negotiating for enable */:
							break;
					}
					break;
			case 0:
					generatedHim[option] = 2;
					conn.send_negotiation(253, option);
					break;
			case 3:
					switch (generatedHimq[option]) {
					case 1/* Error: already queued an enable request */:
							break;
					case 0:
							generatedHimq[option] = /* Already negotiating for CURL_YES, queue the request */1;
							break;
					}
					break;
			case 1/* Already enabled */:
					break;
			}
		} else {
				switch (generatedHim[/* NO */option]) {
				case 1:
						generatedHim[option] = 3;
						conn.send_negotiation(254, option);
						break;
				case 2:
						switch (generatedHimq[option]) {
						case 0:
								generatedHimq[option] = 1;
								break;
						case 1:
								break;
						}
						break;
				case 0/* Already disabled */:
						break;
				case 3:
						switch (generatedHimq[option]) {
						case 1:
								generatedHimq[option] = 0;
								break;
						case 0/* Already negotiating for NO */:
								break;
						}
						break;
				}
		} 
	}
	public void rec_will(int option) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		TELNET tn = (TELNET)generatedReq.getProtop();
		Object generatedHim_preferred = tn.getHim_preferred();
		Object generatedHim = tn.getHim();
		Object generatedHimq = tn.getHimq();
		switch (generatedHim[option]) {
		case 2:
				switch (generatedHimq[option]) {
				case 0:
						generatedHim[option] = 1;
						break;
				case 1:
						generatedHim[option] = 3;
						generatedHimq[option] = 0;
						conn.send_negotiation(254, option);
						break;
				}
				break;
		case 3:
				switch (generatedHimq[option]) {
				case 0:
						generatedHim[option] = /* Error: DONT answered by WILL */0;
						break;
				case 1:
						generatedHim[option] = /* Error: DONT answered by WILL */1;
						generatedHimq[option] = 0;
						break;
				}
				break;
		case 1/* Already enabled */:
				break;
		case 0:
				if (generatedHim_preferred[option] == 1) {
					generatedHim[option] = 1;
					conn.send_negotiation(253, option);
				} else {
						conn.send_negotiation(254, option);
				} 
				break;
		}
	}
	public void rec_wont(int option) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		TELNET tn = (TELNET)generatedReq.getProtop();
		Object generatedHim = tn.getHim();
		Object generatedHimq = tn.getHimq();
		switch (generatedHim[option]) {
		case 1:
				generatedHim[option] = 0;
				conn.send_negotiation(254, option);
				break;
		case 0/* Already disabled */:
				break;
		case 2:
				switch (generatedHimq[option]) {
				case 1:
						generatedHim[option] = 0;
						generatedHimq[option] = 0;
						break;
				case 0:
						generatedHim[option] = 0;
						break;
				}
				break;
		case 3:
				switch (generatedHimq[option]) {
				case 1:
						generatedHim[option] = 2;
						generatedHimq[option] = 0;
						conn.send_negotiation(253, option);
						break;
				case 0:
						generatedHim[option] = 0;
						break;
				}
				break;
		}
	}
	public void set_local_option(int option, int newstate) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		TELNET tn = (TELNET)generatedReq.getProtop();
		Object generatedUs = tn.getUs();
		Object generatedUsq = tn.getUsq();
		if (newstate == 1) {
			switch (generatedUs[option]) {
			case 2:
					switch (generatedUsq[option]) {
					case 0/* Error: already negotiating for enable */:
							break;
					case 1:
							generatedUsq[option] = 0;
							break;
					}
					break;
			case 0:
					generatedUs[option] = 2;
					conn.send_negotiation(251, option);
					break;
			case 3:
					switch (generatedUsq[option]) {
					case 0:
							generatedUsq[option] = /* Already negotiating for CURL_YES, queue the request */1;
							break;
					case 1/* Error: already queued an enable request */:
							break;
					}
					break;
			case 1/* Already enabled */:
					break;
			}
		} else {
				switch (generatedUs[/* NO */option]) {
				case 3:
						switch (generatedUsq[option]) {
						case 0/* Already negotiating for NO */:
								break;
						case 1:
								generatedUsq[option] = 0;
								break;
						}
						break;
				case 1:
						generatedUs[option] = 3;
						conn.send_negotiation(252, option);
						break;
				case 2:
						switch (generatedUsq[option]) {
						case 1:
								break;
						case 0:
								generatedUsq[option] = 1;
								break;
						}
						break;
				case 0/* Already disabled */:
						break;
				}
		} 
	}
	public void rec_do(int option) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		TELNET tn = (TELNET)generatedReq.getProtop();
		Object generatedUs_preferred = tn.getUs_preferred();
		Object generatedUs = tn.getUs();
		Object generatedSubnegotiation = tn.getSubnegotiation();
		Object generatedUsq = tn.getUsq();
		Object generatedHimq = tn.getHimq();
		switch (generatedUs[option]) {
		case 1/* Already enabled */:
				break;
		case 3:
				switch (generatedUsq[option]) {
				case 0:
						generatedUs[option] = /* Error: DONT answered by WILL */0;
						break;
				case 1:
						generatedUs[option] = /* Error: DONT answered by WILL */1;
						generatedUsq[option] = 0;
						break;
				}
				break;
		case 0:
				if (generatedUs_preferred[option] == 1) {
					generatedUs[option] = 1;
					conn.send_negotiation(251, option);
					if (generatedSubnegotiation[option] == 1) {
						conn.sendsuboption(/* transmission of data option */option);
					} 
				}  else if (generatedSubnegotiation[option] == 1) {
					generatedUs[option] = /* send information to achieve this option*/1;
					conn.send_negotiation(251, option);
					conn.sendsuboption(option);
				} else {
						conn.send_negotiation(252, option);
				} 
				break;
		case 2:
				switch (generatedUsq[option]) {
				case 0:
						generatedUs[option] = 1;
						if (generatedSubnegotiation[option] == 1) {
							conn.sendsuboption(/* transmission of data option */option);
						} 
						break;
				case 1:
						generatedUs[option] = 3;
						generatedHimq[option] = 0;
						conn.send_negotiation(252, option);
						break;
				}
				break;
		}
	}
	public void rec_dont(int option) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		TELNET tn = (TELNET)generatedReq.getProtop();
		Object generatedUs = tn.getUs();
		Object generatedUsq = tn.getUsq();
		switch (generatedUs[option]) {
		case 3:
				switch (generatedUsq[option]) {
				case 1:
						generatedUs[option] = 2;
						generatedUsq[option] = 0;
						conn.send_negotiation(251, option);
						break;
				case 0:
						generatedUs[option] = 0;
						break;
				}
				break;
		case 1:
				generatedUs[option] = 0;
				conn.send_negotiation(252, option);
				break;
		case 2:
				switch (generatedUsq[option]) {
				case 0:
						generatedUs[option] = 0;
						break;
				case 1:
						generatedUs[option] = 0;
						generatedUsq[option] = 0;
						break;
				}
				break;
		case 0/* Already disabled */:
				break;
		}
	}
	public Object check_telnet_options() {
		curl_slist head = new curl_slist();
		curl_slist beg = new curl_slist();
		byte[] option_keyword = "";
		byte[] option_arg = "";
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = generatedData.getReq();
		TELNET tn = (TELNET)generatedReq.getProtop();
		 result = CURLE_OK;
		int binary_option;
		ConnectBits generatedBits = this.getBits();
		Object generatedUser_passwd = generatedBits.getUser_passwd();
		Byte generatedUser = this.getUser();
		curl_slist generatedTelnet_vars = tn.getTelnet_vars();
		Object generatedUs_preferred = tn.getUs_preferred();
		if (generatedUser_passwd) {
			ModernizedCProgram.curl_msnprintf(option_arg, , "USER,%s", generatedUser);
			beg = generatedTelnet_vars.curl_slist_append(option_arg);
			if (!beg) {
				generatedTelnet_vars.curl_slist_free_all();
				tn.setTelnet_vars(((Object)0));
				return CURLE_OUT_OF_MEMORY;
			} 
			tn.setTelnet_vars(beg);
			generatedUs_preferred[39] = 1;
		} 
		Object generatedCurl_slist = head.getCurl_slist();
		Object generatedSubopt_ttype = tn.getSubopt_ttype();
		Object generatedSubopt_xdisploc = tn.getSubopt_xdisploc();
		int generatedSubopt_wsx = tn.getSubopt_wsx();
		int generatedSubopt_wsy = tn.getSubopt_wsy();
		Object generatedHim_preferred = tn.getHim_preferred();
		Object generatedSet = data.getSet();
		for (head = generatedSet.getTelnet_options(); head; head = generatedCurl_slist) {
			if (.sscanf(generatedCurl_slist, "%127[^= ]%*[ =]%255s", option_keyword, option_arg) == 2) {
				if (ModernizedCProgram.Curl_strcasecompare(option_keyword, /* Terminal type */"TTYPE")) {
					.strncpy(generatedSubopt_ttype, option_arg, 31);
					generatedSubopt_ttype[31] = /* String termination */0;
					generatedUs_preferred[24] = 1;
					continue;
				} 
				if (ModernizedCProgram.Curl_strcasecompare(option_keyword, /* Display variable */"XDISPLOC")) {
					.strncpy(generatedSubopt_xdisploc, option_arg, 127);
					generatedSubopt_xdisploc[127] = /* String termination */0;
					generatedUs_preferred[35] = 1;
					continue;
				} 
				if (ModernizedCProgram.Curl_strcasecompare(option_keyword, /* Environment variable */"NEW_ENV")) {
					beg = generatedTelnet_vars.curl_slist_append(option_arg);
					if (!beg) {
						result = CURLE_OUT_OF_MEMORY;
						break;
					} 
					tn.setTelnet_vars(beg);
					generatedUs_preferred[39] = 1;
					continue;
				} 
				if (ModernizedCProgram.Curl_strcasecompare(option_keyword, /* Window Size */"WS")) {
					if (.sscanf(option_arg, "%hu%*[xX]%hu", generatedSubopt_wsx, generatedSubopt_wsy) == 2) {
						generatedUs_preferred[31] = 1;
					} else {
							data.Curl_failf("Syntax error in telnet option: %s", generatedCurl_slist);
							result = CURLE_TELNET_OPTION_SYNTAX;
							break;
					} 
					continue;
				} 
				if (ModernizedCProgram.Curl_strcasecompare(option_keyword, /* To take care or not of the 8th bit in data exchange */"BINARY")) {
					binary_option = .atoi(option_arg);
					if (binary_option != 1) {
						generatedUs_preferred[0] = 0;
						generatedHim_preferred[0] = 0;
					} 
					continue;
				} 
				data.Curl_failf("Unknown telnet option %s", generatedCurl_slist);
				result = CURLE_UNKNOWN_OPTION;
				break;
			} 
			data.Curl_failf("Syntax error in telnet option: %s", generatedCurl_slist);
			result = CURLE_TELNET_OPTION_SYNTAX;
			break;
		}
		if (result) {
			generatedTelnet_vars.curl_slist_free_all();
			tn.setTelnet_vars(((Object)0));
		} 
		return result/*
		 * suboption()
		 *
		 * Look at the sub-option buffer, and try to be helpful to the other
		 * side.
		 */;
	}
	public void suboption() {
		curl_slist v = new curl_slist();
		byte[] temp = new byte[2048];
		ssize_t bytes_written = new ssize_t();
		size_t len = new size_t();
		int err;
		byte[] varname = "";
		byte[] varval = "";
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		TELNET tn = (TELNET)generatedReq.getProtop();
		Object generatedSubbuffer = tn.getSubbuffer();
		Byte generatedSubend = tn.getSubend();
		byte generatedSubpointer = tn.getSubpointer();
		data.printsub((byte)'<', (byte)generatedSubbuffer, (generatedSubend - generatedSubpointer) + 2);
		Object generatedSubopt_ttype = tn.getSubopt_ttype();
		Object generatedSock = this.getSock();
		Object generatedSubopt_xdisploc = tn.getSubopt_xdisploc();
		Object generatedCurl_slist = v.getCurl_slist();
		curl_slist generatedTelnet_vars = tn.getTelnet_vars();
		switch (((generatedSubpointer++) & -1024)) {
		case 35:
				len = .strlen(generatedSubopt_xdisploc) + 4 + 2;
				ModernizedCProgram.curl_msnprintf((byte)temp, , "%c%c%c%c%s%c%c", 255, 250, 35, 0, generatedSubopt_xdisploc, 255, 240);
				bytes_written = (ssize_t).send((SOCKET)(generatedSock[0]), (byte)(temp), (int)(len), (int)(false));
				if (bytes_written < 0) {
					err = ((int).WSAGetLastError());
					data.Curl_failf("Sending data failed (%d)", err);
				} 
				data.printsub((byte)'>', temp[2], len - 2);
				break;
		case 39:
				ModernizedCProgram.curl_msnprintf((byte)temp, , "%c%c%c%c", 255, 250, 39, 0);
				len = 4;
				for (v = generatedTelnet_vars; v; v = generatedCurl_slist) {
					size_t tmplen = (.strlen(generatedCurl_slist) + 1);
					if (len + tmplen < (int) - /* Add the variable only if it fits */6) {
						if (.sscanf(generatedCurl_slist, "%127[^,],%127s", varname, varval)) {
							ModernizedCProgram.curl_msnprintf((byte)temp[len],  - len, "%c%s%c%s", 0, varname, 1, varval);
							len += tmplen;
						} 
					} 
				}
				ModernizedCProgram.curl_msnprintf((byte)temp[len],  - len, "%c%c", 255, 240);
				len += 2;
				bytes_written = (ssize_t).send((SOCKET)(generatedSock[0]), (byte)(temp), (int)(len), (int)(false));
				if (bytes_written < 0) {
					err = ((int).WSAGetLastError());
					data.Curl_failf("Sending data failed (%d)", err);
				} 
				data.printsub((byte)'>', temp[2], len - 2);
				break;
		case 24:
				len = .strlen(generatedSubopt_ttype) + 4 + 2;
				ModernizedCProgram.curl_msnprintf((byte)temp, , "%c%c%c%c%s%c%c", 255, 250, 24, 0, generatedSubopt_ttype, 255, 240);
				bytes_written = (ssize_t).send((SOCKET)(generatedSock[0]), (byte)(temp), (int)(len), (int)(false));
				if (bytes_written < 0) {
					err = ((int).WSAGetLastError());
					data.Curl_failf("Sending data failed (%d)", err);
				} 
				data.printsub((byte)'>', temp[2], len - 2);
				break;
		}
		return ;/*
		 * sendsuboption()
		 *
		 * Send suboption information to the server side.
		 */
	}
	public void sendsuboption(int option) {
		ssize_t bytes_written = new ssize_t();
		int err;
		int x;
		int y;
		byte uc1;
		byte uc2;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		TELNET tn = (TELNET)generatedReq.getProtop();
		Object generatedSubbuffer = tn.getSubbuffer();
		byte generatedSubpointer = tn.getSubpointer();
		int generatedSubopt_wsx = tn.getSubopt_wsx();
		int generatedSubopt_wsy = tn.getSubopt_wsy();
		Byte generatedSubend = tn.getSubend();
		Object generatedSock = this.getSock();
		switch (option) {
		case 31:
				tn.setSubpointer(generatedSubbuffer);
				do {
					if (generatedSubpointer < (generatedSubbuffer + )) {
						generatedSubpointer++ = (true);
					} 
				} while (0);
				do {
					if (generatedSubpointer < (generatedSubbuffer + )) {
						generatedSubpointer++ = (true);
					} 
				} while (0);
				do {
					if (generatedSubpointer < (generatedSubbuffer + )) {
						generatedSubpointer++ = (true);
					} 
				} while (0/* We must deal either with little or big endian processors */);
				x = .htons(generatedSubopt_wsx);
				y = .htons(generatedSubopt_wsy);
				uc1 = (byte)x;
				uc2 = (byte)y;
				do {
					if (generatedSubpointer < (generatedSubbuffer + )) {
						generatedSubpointer++ = (uc1[0]);
					} 
				} while (0);
				do {
					if (generatedSubpointer < (generatedSubbuffer + )) {
						generatedSubpointer++ = (uc1[1]);
					} 
				} while (0);
				do {
					if (generatedSubpointer < (generatedSubbuffer + )) {
						generatedSubpointer++ = (uc2[0]);
					} 
				} while (0);
				do {
					if (generatedSubpointer < (generatedSubbuffer + )) {
						generatedSubpointer++ = (uc2[1]);
					} 
				} while (0);
				do {
					if (generatedSubpointer < (generatedSubbuffer + )) {
						generatedSubpointer++ = (true);
					} 
				} while (0);
				do {
					if (generatedSubpointer < (generatedSubbuffer + )) {
						generatedSubpointer++ = (true);
					} 
				} while (0);
				do {
					tn.setSubend(generatedSubpointer);
					tn.setSubpointer(generatedSubbuffer);
				} while (0/* data suboption is now ready */);
				data.printsub((byte)'>', (byte)generatedSubbuffer + 2, (generatedSubend - generatedSubpointer) - 2);
				bytes_written = (ssize_t).send((SOCKET)(generatedSock[0]), (byte)(generatedSubbuffer), (int)(true), (int)(/* we send the header of the suboption... */false));
				if (bytes_written < 0) {
					err = ((int).WSAGetLastError());
					data.Curl_failf("Sending data failed (%d)", err);
				} 
				conn.send_telnet_data((byte)generatedSubbuffer + 3, /* ... then the window size with the send_telnet_data() function
				       to deal with 0xFF cases ... */4);
				bytes_written = (ssize_t).send((SOCKET)(generatedSock[0]), (byte)(generatedSubbuffer + 7), (int)(true), (int)(/* ... and the footer */false));
				if (bytes_written < 0) {
					err = ((int).WSAGetLastError());
					data.Curl_failf("Sending data failed (%d)", err);
				} 
				break;
		}
	}
	public Object telrcv(Object inbuf, Object count) {
		/* Number of bytes received */byte c;
		 result = new ();
		int in = 0;
		int startwrite = -1;
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedReq = data.getReq();
		TELNET tn = (TELNET)generatedReq.getProtop();
		if (startwrite >= 0) {
			result = conn.Curl_client_write((1 << 0), (byte)inbuf[startwrite], in - startwrite);
			if (result) {
				return result;
			} 
		} 
		startwrite = -1;
		return CURLE_OK;
	}
	/* Data received from socket */
	/* Number of bytes received */
	/* Data received from socket */
	/* Escape and send a telnet data block */
	public Object send_telnet_data(Byte buffer, Object nread) {
		ssize_t escapes = new ssize_t();
		ssize_t i = new ssize_t();
		ssize_t outlen = new ssize_t();
		byte outbuf = ((Object)0);
		 result = CURLE_OK;
		ssize_t bytes_written = new ssize_t();
		ssize_t total_written = new ssize_t();
		escapes = /* Determine size of new buffer after escaping */0;
		for (i = 0; i < nread; i++) {
			if ((byte)buffer[i] == 255) {
				escapes++;
			} 
		}
		outlen = nread + escapes;
		if (outlen == nread) {
			outbuf = (byte)buffer;
		} else {
				ssize_t j = new ssize_t();
				outbuf = .Curl_cmalloc(nread + escapes + 1);
				if (!outbuf) {
					return CURLE_OUT_OF_MEMORY;
				} 
				ModernizedCProgram.j = 0;
				for (i = 0; i < nread; i++) {
					outbuf[ModernizedCProgram.j++] = buffer[i];
					if ((byte)buffer[i] == 255) {
						outbuf[ModernizedCProgram.j++] = 255;
					} 
				}
				outbuf[ModernizedCProgram.j] = (byte)'\0';
		} 
		total_written = 0;
		Object generatedSock = this.getSock();
		while (!result && total_written < outlen) {
			pollfd[] pfd = new pollfd();
			pfd[0].setFd(generatedSock[0]);
			pfd[0].setEvents(-1024);
			switch (pfd.Curl_poll(1, -1)) {
			case /* timeout (will never happen) */0:
					result = CURLE_SEND_ERROR;
					break;
			case -/* error, abort writing */1:
			default:
					bytes_written = 0;
					result = conn.Curl_write(generatedSock[0], outbuf + total_written, outlen - total_written, bytes_written);
					total_written += bytes_written;
					break;
			}
		}
		if (outbuf != (byte)/* Free malloc copy if escaped */buffer) {
			.Curl_cfree(outbuf);
		} 
		return result;
	}
	/* For negotiation compliant to RFC 1143 */
	public Object telnet_done(int status,  premature) {
		Curl_easy generatedData = this.getData();
		Object generatedReq = generatedData.getReq();
		TELNET tn = (TELNET)generatedReq.getProtop();
		(Object)/* unused */status;
		(Object)/* not used */premature;
		if (!tn) {
			return CURLE_OK;
		} 
		curl_slist generatedTelnet_vars = tn.getTelnet_vars();
		generatedTelnet_vars.curl_slist_free_all();
		tn.setTelnet_vars(((Object)0));
		do {
			.Curl_cfree((generatedReq.getProtop()));
			(generatedReq.getProtop()) = ((Object)0);
		} while (0);
		return CURLE_OK;
	}
	public Object telnet_do( done) {
		 result = new ();
		Curl_easy generatedData = this.getData();
		Curl_easy data = generatedData;
		Object generatedSock = this.getSock();
		 sockfd = generatedSock[0];
		HMODULE wsock2 = new HMODULE();
		WSOCK2_FUNC close_event_func = new WSOCK2_FUNC();
		WSOCK2_EVENT create_event_func = new WSOCK2_EVENT();
		WSOCK2_FUNC event_select_func = new WSOCK2_FUNC();
		WSOCK2_FUNC enum_netevents_func = new WSOCK2_FUNC();
		HANDLE event_handle = new HANDLE();
		WSANETWORKEVENTS events = new WSANETWORKEVENTS();
		HANDLE stdin_handle = new HANDLE();
		HANDLE[] objs = new HANDLE();
		DWORD obj_count = new DWORD();
		DWORD wait_timeout = new DWORD();
		DWORD readfile_read = new DWORD();
		int err;
		ssize_t nread = new ssize_t();
		curltime now = new curltime();
		bool keepon = 1;
		Object generatedState = data.getState();
		byte buf = generatedState.getBuffer();
		TELNET tn = new TELNET();
		done = /* unconditionally */1;
		result = conn.init_telnet();
		if (result) {
			return result;
		} 
		Object generatedReq = data.getReq();
		tn = (TELNET)generatedReq.getProtop();
		result = conn.check_telnet_options();
		if (result) {
			return result/*
			  ** This functionality only works with WinSock >= 2.0.  So,
			  ** make sure we have it.
			  */;
		} 
		result = data.check_wsock2();
		if (result) {
			return result;
		} 
		wsock2 = ModernizedCProgram.Curl_load_library(/* OK, so we have WinSock 2.0.  We need to dynamically *//* load ws2_32.dll and get the function pointers we need. */"WS2_32.DLL");
		if (wsock2 == ((Object)0)) {
			data.Curl_failf("failed to load WS2_32.DLL (%u)", .GetLastError());
			return CURLE_FAILED_INIT;
		} 
		/* Grab a pointer to WSACreateEvent */create_event_func = (WSOCK2_EVENT)(Object)((.GetProcAddress(wsock2, "WSACreateEvent")));
		if (create_event_func == ((Object)0)) {
			data.Curl_failf("failed to find WSACreateEvent function (%u)", .GetLastError());
			.FreeLibrary(wsock2);
			return CURLE_FAILED_INIT;
		} 
		close_event_func = .GetProcAddress(wsock2, /* And WSACloseEvent */"WSACloseEvent");
		if (close_event_func == ((Object)0)) {
			data.Curl_failf("failed to find WSACloseEvent function (%u)", .GetLastError());
			.FreeLibrary(wsock2);
			return CURLE_FAILED_INIT;
		} 
		event_select_func = .GetProcAddress(wsock2, /* And WSAEventSelect */"WSAEventSelect");
		if (event_select_func == ((Object)0)) {
			data.Curl_failf("failed to find WSAEventSelect function (%u)", .GetLastError());
			.FreeLibrary(wsock2);
			return CURLE_FAILED_INIT;
		} 
		enum_netevents_func = .GetProcAddress(wsock2, /* And WSAEnumNetworkEvents */"WSAEnumNetworkEvents");
		if (enum_netevents_func == ((Object)0)) {
			data.Curl_failf("failed to find WSAEnumNetworkEvents function (%u)", .GetLastError());
			.FreeLibrary(wsock2);
			return CURLE_FAILED_INIT/* We want to wait for both stdin and the socket. Since
			  ** the select() function in winsock only works on sockets
			  ** we have to use the WaitForMultipleObjects() call.
			  */;
		} 
		event_handle = (HANDLE).create_event_func();
		if (event_handle == ((HANDLE)((Object)0))) {
			data.Curl_failf("WSACreateEvent failed (%d)", ((int).WSAGetLastError()));
			.FreeLibrary(wsock2);
			return CURLE_FAILED_INIT;
		} 
		if (.event_select_func(sockfd, event_handle, (1 << 0) | (1 << /* Tell winsock what events we want to listen to */5)) == (true)) {
			.close_event_func(event_handle);
			.FreeLibrary(wsock2);
			return CURLE_OK;
		} 
		stdin_handle = .GetStdHandle((DWORD)(/* The get the Windows file handle for stdin */true));
		objs[0] = /* Create the list of objects to wait for */event_handle;
		objs[1] = stdin_handle;
		Object generatedSet = data.getSet();
		if (.GetFileType(stdin_handle) == /* If stdin_handle is a pipe, use PeekNamedPipe() method to check it,
		     else use the old WaitForMultipleObjects() way */3 || generatedSet.getIs_fread_set()) {
			obj_count = /* Don't wait for stdin_handle, just wait for event_handle */1;
			wait_timeout = /* Check stdin_handle per 100 milliseconds */100;
		} else {
				obj_count = 2;
				wait_timeout = 1000;
		} 
		Object generatedLNetworkEvents = events.getLNetworkEvents();
		int generatedPlease_negotiate = tn.getPlease_negotiate();
		int generatedAlready_negotiated = tn.getAlready_negotiated();
		curltime curltime = new curltime();
		curltime generatedCreated = this.getCreated();
		while (/* Keep on listening and act on events */keepon) {
			DWORD buf_size = (DWORD)generatedSet.getBuffer_size();
			DWORD waitret = .WaitForMultipleObjects(obj_count, objs, 0, wait_timeout);
			switch (waitret) {
			case -1024:
					{ 
						for (; ; ) {
							if (generatedSet.getIs_fread_set()) {
								size_t n = new size_t();
								n = .UNRECOGNIZEDFUNCTIONNAME(buf, 1, buf_size, generatedState.getIn());
								if (n == CURL_READFUNC_ABORT) {
									keepon = 0;
									result = CURLE_READ_ERROR;
									break;
								} 
								if (n == CURL_READFUNC_PAUSE) {
									break;
								} 
								if (n == /* no bytes */0) {
									break;
								} 
								readfile_read = (DWORD)/* fall through with number of bytes read */n;
							} else {
									if (!.PeekNamedPipe(stdin_handle, ((Object)0), 0, ((Object)/* read from stdin */0), readfile_read, ((Object)0))) {
										keepon = 0;
										result = CURLE_READ_ERROR;
										break;
									} 
									if (!readfile_read) {
										break;
									} 
									if (!.ReadFile(stdin_handle, buf, buf_size, readfile_read, ((Object)0))) {
										keepon = 0;
										result = CURLE_READ_ERROR;
										break;
									} 
							} 
							result = conn.send_telnet_data(buf, readfile_read);
							if (result) {
								keepon = 0;
								break;
							} 
						}
					}
					break;
			case 0:
					events.setLNetworkEvents(0);
					if ((true) == .enum_netevents_func(sockfd, event_handle, events)) {
						err = ((int).WSAGetLastError());
						if (err != -1024) {
							data.Curl_infof("WSAEnumNetworkEvents failed (%d)", err);
							keepon = 0;
							result = CURLE_READ_ERROR;
						} 
						break;
					} 
					if (generatedLNetworkEvents & (1 << 0)) {
						result = conn.Curl_read(sockfd, buf, generatedSet.getBuffer_size(), /* read data from network */nread);
						if (result == /* read would've blocked. Loop again */CURLE_AGAIN) {
							break;
						}  else if (/* returned not-zero, this an error */result) {
							keepon = 0;
							break;
						}  else if (nread <= /* returned zero but actually received 0 or less here,
						           the server closed the connection and we bail out */0) {
							keepon = 0;
							break;
						} 
						result = conn.telrcv((byte)buf, nread);
						if (result) {
							keepon = 0;
							break;
						} 
						if (generatedPlease_negotiate && !generatedAlready_negotiated) {
							conn.negotiate();
							tn.setAlready_negotiated(1);
						} 
					} 
					if (generatedLNetworkEvents & (1 << 5)) {
						keepon = 0;
					} 
					break;
			case 0 + 1:
					{ 
						if (!.ReadFile(stdin_handle, buf, buf_size, readfile_read, ((Object)0))) {
							keepon = 0;
							result = CURLE_READ_ERROR;
							break;
						} 
						result = conn.send_telnet_data(buf, readfile_read);
						if (result) {
							keepon = 0;
							break;
						} 
					}
					break;
			}
			if (generatedSet.getTimeout()) {
				now = curltime.Curl_now();
				if (now.Curl_timediff(generatedCreated) >= generatedSet.getTimeout()) {
					data.Curl_failf("Time-out");
					result = CURLE_OPERATION_TIMEDOUT;
					keepon = 0;
				} 
			} 
		}
		if (!.close_event_func(/* We called WSACreateEvent, so call WSACloseEvent */event_handle)) {
			data.Curl_infof("WSACloseEvent failed (%d)", ((int).WSAGetLastError()));
		} 
		create_event_func = ((Object)/* "Forget" pointers into the library we're about to free */0);
		close_event_func = ((Object)0);
		event_select_func = ((Object)0);
		enum_netevents_func = ((Object)0);
		if (!.FreeLibrary(/* We called LoadLibrary, so call FreeLibrary */wsock2)) {
			data.Curl_infof("FreeLibrary(wsock2) failed (%u)", .GetLastError());
		} 
		/* error, stop reading *//* timeout *//* FALLTHROUGH *//* read! *//* read data from network *//* read would've blocked. Loop again *//* returned not-zero, this an error *//* returned zero but actually received 0 or less here,
		           the server closed the connection and we bail out *//* Negotiate if the peer has started negotiating,
		           otherwise don't. We don't want to speak telnet with
		           non-telnet servers, like POP or SMTP. */
		/* read from in file *//* read from user-supplied method *//* poll switch statement *//* read from in file *//* read from user-supplied method *//* poll switch statement */data.Curl_setup_transfer(-1, -1, 0, -/* mark this as "no further transfer wanted" */1);
		return result;
	}
	public Curl_easy getData() {
		return data;
	}
	public void setData(Curl_easy newData) {
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
	public Curl_dns_entry getDns_entry() {
		return dns_entry;
	}
	public void setDns_entry(Curl_dns_entry newDns_entry) {
		dns_entry = newDns_entry;
	}
	public Curl_addrinfo getIp_addr() {
		return ip_addr;
	}
	public void setIp_addr(Curl_addrinfo newIp_addr) {
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
	public Byte getHostname_resolve() {
		return hostname_resolve;
	}
	public void setHostname_resolve(Byte newHostname_resolve) {
		hostname_resolve = newHostname_resolve;
	}
	public Byte getSecondaryhostname() {
		return secondaryhostname;
	}
	public void setSecondaryhostname(Byte newSecondaryhostname) {
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
	public Byte getUser() {
		return user;
	}
	public void setUser(Byte newUser) {
		user = newUser;
	}
	public Byte getPasswd() {
		return passwd;
	}
	public void setPasswd(Byte newPasswd) {
		passwd = newPasswd;
	}
	public Byte getOptions() {
		return options;
	}
	public void setOptions(Byte newOptions) {
		options = newOptions;
	}
	public Byte getOauth_bearer() {
		return oauth_bearer;
	}
	public void setOauth_bearer(Byte newOauth_bearer) {
		oauth_bearer = newOauth_bearer;
	}
	public Byte getSasl_authzid() {
		return sasl_authzid;
	}
	public void setSasl_authzid(Byte newSasl_authzid) {
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
	public Byte getTrailer() {
		return trailer;
	}
	public void setTrailer(Byte newTrailer) {
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
	public Byte getLocaldev() {
		return localdev;
	}
	public void setLocaldev(Byte newLocaldev) {
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
	public http_connect_state getConnect_state() {
		return connect_state;
	}
	public void setConnect_state(http_connect_state newConnect_state) {
		connect_state = newConnect_state;
	}
	public connectbundle getBundle() {
		return bundle;
	}
	public void setBundle(connectbundle newBundle) {
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
