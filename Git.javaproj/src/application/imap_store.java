package application;

public class imap_store {
	private Object name;
	private int uidvalidity;
	private imap imap;
	private Object prefix;
	
	public imap_store(Object name, int uidvalidity, imap imap, Object prefix) {
		setName(name);
		setUidvalidity(uidvalidity);
		setImap(imap);
		setPrefix(prefix);
	}
	public imap_store() {
	}
	
	public void imap_close_server() {
		imap generatedImap = this.getImap();
		imap imap = generatedImap;
		imap_buffer generatedBuf = imap.getBuf();
		imap_socket generatedSock = generatedBuf.getSock();
		Object generatedFd = generatedSock.getFd();
		if (generatedFd[0] != -1) {
			ModernizedCProgram.imap_exec(ictx, ((Object)0), "LOGOUT");
			generatedSock.socket_shutdown();
		} 
		ModernizedCProgram.free(imap);
	}
	public void imap_close_store() {
		ModernizedCProgram.ctx.imap_close_server();
		ModernizedCProgram.free(ModernizedCProgram.ctx);
	}
	public imap_store imap_open_store(imap_server_conf srvc, Byte folder) {
		credential cred = new credential(new credential(((Object)0), 0, 0, 1, ((Object)0)));
		imap_store ctx = new imap_store();
		imap imap = new imap();
		byte arg;
		byte rsp;
		int s = -1;
		int preauth;
		ctx = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
		ctx.setImap(imap = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/));
		imap_buffer generatedBuf = imap.getBuf();
		imap_socket generatedSock = generatedBuf.getSock();
		Object generatedFd = generatedSock.getFd();
		generatedFd[0] = generatedFd[1] = -1;
		imap_cmd generatedIn_progress = imap.getIn_progress();
		imap.setIn_progress_append(generatedIn_progress);
		Byte generatedTunnel = srvc.getTunnel();
		argv_array generatedArgs = tunnel.getArgs();
		int generatedOut = tunnel.getOut();
		int generatedIn = tunnel.getIn();
		int generatedPort = srvc.getPort();
		Byte generatedHost = srvc.getHost();
		Object generatedAddrinfo = ai.getAddrinfo();
		int generatedUse_ssl = srvc.getUse_ssl();
		int generatedSsl_verify = srvc.getSsl_verify();
		if (generatedTunnel) {
			child_process tunnel = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
			ModernizedCProgram.imap_info("Starting tunnel '%s'... ", generatedTunnel);
			generatedArgs.argv_array_push(generatedTunnel);
			tunnel.setUse_shell(1);
			tunnel.setIn(-1);
			tunnel.setOut(-1);
			if (tunnel.start_command()) {
				ModernizedCProgram.die("cannot start proxy %s", generatedTunnel);
			} 
			generatedFd[0] = generatedOut;
			generatedFd[1] = generatedIn;
			ModernizedCProgram.imap_info("ok\n");
		} else {
				addrinfo hints = new addrinfo();
				addrinfo ai0 = new addrinfo();
				addrinfo ai = new addrinfo();
				int gai;
				byte[] portstr = new byte[6];
				ModernizedCProgram.xsnprintf(portstr, /*Error: sizeof expression not supported yet*/, "%d", generatedPort);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(hints, 0, /*Error: sizeof expression not supported yet*/);
				hints.setAddrinfo(1);
				hints.setAddrinfo(6);
				ModernizedCProgram.imap_info("Resolving %s... ", generatedHost);
				gai = /*Error: Function owner not recognized*/getaddrinfo(generatedHost, portstr, hints, ai);
				if (gai) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "getaddrinfo: %s\n", /*Error: Function owner not recognized*/gai_strerror(gai));
					;
				} 
				ModernizedCProgram.imap_info("ok\n");
				for (ai0 = ai; ai; ai = generatedAddrinfo) {
					byte[] addr = new byte[1025];
					s = /*Error: Function owner not recognized*/socket(generatedAddrinfo, generatedAddrinfo, generatedAddrinfo);
					if (s < 0) {
						continue;
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/getnameinfo(generatedAddrinfo, generatedAddrinfo, addr, /*Error: sizeof expression not supported yet*/, ((Object)0), 0, NI_NUMERICHOST);
					ModernizedCProgram.imap_info("Connecting to [%s]:%s... ", addr, portstr);
					if (/*Error: Function owner not recognized*/connect(s, generatedAddrinfo, generatedAddrinfo) < 0) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(s);
						s = -1;
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror("connect");
						continue;
					} 
					break;
				}
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/freeaddrinfo(ai0/* NO_IPV6 */);
				if (s < 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("Error: unable to connect to server.\n", (_iob[2]));
					;
				} 
				generatedFd[0] = s;
				generatedFd[1] = /*Error: Function owner not recognized*/dup(s);
				if (generatedUse_ssl && generatedSock.ssl_socket_connect(0, generatedSsl_verify)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(s);
					;
				} 
				ModernizedCProgram.imap_info("ok\n");
		} 
		if (generatedBuf.buffer_gets(/* read the greeting string */rsp)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "IMAP error: no greeting response\n");
			;
		} 
		arg = ModernizedCProgram.next_arg(rsp);
		if (!arg || arg != (byte)'*' || (arg = ModernizedCProgram.next_arg(rsp)) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "IMAP error: invalid greeting response\n");
			;
		} 
		preauth = 0;
		if (!/*Error: Function owner not recognized*/strcmp("PREAUTH", arg)) {
			preauth = 1;
		}  else if (/*Error: Function owner not recognized*/strcmp("OK", arg) != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "IMAP error: unknown greeting response\n");
			;
		} 
		ModernizedCProgram.parse_response_code(ctx, ((Object)0), rsp);
		int generatedCaps = imap.getCaps();
		if (!generatedCaps && ModernizedCProgram.imap_exec(ctx, ((Object)0), "CAPABILITY") != 0) {
			;
		} 
		Byte generatedAuth_method = srvc.getAuth_method();
		Byte generatedUser = srvc.getUser();
		Object generatedSsl = generatedSock.getSsl();
		Byte generatedPass = srvc.getPass();
		if (!preauth) {
			if (!generatedUse_ssl && (generatedCaps & (1 << (CAPABILITY.STARTTLS)))) {
				if (ModernizedCProgram.imap_exec(ctx, ((Object)0), "STARTTLS") != 0) {
					;
				} 
				if (generatedSock.ssl_socket_connect(1, generatedSsl_verify)) {
					;
				} 
				if (ModernizedCProgram.imap_exec(ctx, ((Object)0), "CAPABILITY") != /* capabilities may have changed, so get the new capabilities */0) {
					;
				} 
			} 
			ModernizedCProgram.imap_info("Logging in...\n");
			ModernizedCProgram.server_fill_credential(srvc, cred);
			if (generatedAuth_method) {
				imap_cmd_cb cb = new imap_cmd_cb();
				if (!/*Error: Function owner not recognized*/strcmp(generatedAuth_method, "CRAM-MD5")) {
					if (!(generatedCaps & (1 << (CAPABILITY.AUTH_CRAM_MD5)))) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "You specified CRAM-MD5 as authentication method, but %s doesn't support it.\n", generatedHost);
						;
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(cb, 0, /*Error: sizeof expression not supported yet*/);
					cb.setCont(auth_cram_md5);
					if (ModernizedCProgram.imap_exec(ctx, cb, "AUTHENTICATE CRAM-MD5") != 0) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "IMAP error: AUTHENTICATE CRAM-MD5 failed\n");
						;
					} 
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Unknown authentication method:%s\n", generatedHost);
						;
				} 
			} else {
					if ((generatedCaps & (1 << (CAPABILITY.NOLOGIN)))) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Skipping account %s@%s, server forbids LOGIN\n", generatedUser, generatedHost);
						;
					} 
					if (!generatedSsl) {
						ModernizedCProgram.imap_warn("*** IMAP Warning *** Password is being sent in the clear\n");
					} 
					if (ModernizedCProgram.imap_exec(ctx, ((Object)0), "LOGIN \"%s\" \"%s\"", generatedUser, generatedPass) != 0) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "IMAP error: LOGIN failed\n");
						;
					} 
			} 
		} 
		Byte generatedUsername = cred.getUsername();
		if (generatedUsername) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/credential_approve(cred);
		} 
		cred.credential_clear();
		ctx.setName(/* check the target mailbox exists */folder);
		Object generatedName = ctx.getName();
		switch (ModernizedCProgram.imap_exec(ctx, ((Object)0), "EXAMINE \"%s\"", generatedName)) {
		case 2:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "IMAP error: could not check mailbox\n");
				;
		case 0/* ok */:
				break;
		case 1:
				if (ModernizedCProgram.imap_exec(ctx, ((Object)0), "CREATE \"%s\"", generatedName) == 0) {
					ModernizedCProgram.imap_info("Created missing mailbox\n");
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "IMAP error: could not create missing mailbox\n");
						;
				} 
				break;
		}
		ctx.setPrefix("");
		return ctx;
		cred.credential_clear();
		return ((Object)0/*
		 * Insert CR characters as necessary in *msg to ensure that every LF
		 * character in *msg is preceded by a CR.
		 */);
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getUidvalidity() {
		return uidvalidity;
	}
	public void setUidvalidity(int newUidvalidity) {
		uidvalidity = newUidvalidity;
	}
	public imap getImap() {
		return imap;
	}
	public void setImap(imap newImap) {
		imap = newImap;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
}
/* currently open mailbox */
