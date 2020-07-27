package application;

/* told to sit idle */
/* told to stream */
public class httprequest {
	private Object reqbuf;
	private  connect_request;
	private int connect_port;
	private Object checkindex;
	private Object offset;
	private long testno;
	private long partno;
	private  open;
	private  auth_req;
	private  auth;
	private Object cl;
	private  digest;
	private  ntlm;
	private int writedelay;
	private int skip;
	private int rcmd;
	private int prot_version;
	private int callcount;
	private  connmon;
	private  upgrade;
	private  upgrade_request;
	private  close;
	private int done_processing;
	
	public httprequest(Object reqbuf,  connect_request, int connect_port, Object checkindex, Object offset, long testno, long partno,  open,  auth_req,  auth, Object cl,  digest,  ntlm, int writedelay, int skip, int rcmd, int prot_version, int callcount,  connmon,  upgrade,  upgrade_request,  close, int done_processing) {
		setReqbuf(reqbuf);
		setConnect_request(connect_request);
		setConnect_port(connect_port);
		setCheckindex(checkindex);
		setOffset(offset);
		setTestno(testno);
		setPartno(partno);
		setOpen(open);
		setAuth_req(auth_req);
		setAuth(auth);
		setCl(cl);
		setDigest(digest);
		setNtlm(ntlm);
		setWritedelay(writedelay);
		setSkip(skip);
		setRcmd(rcmd);
		setProt_version(prot_version);
		setCallcount(callcount);
		setConnmon(connmon);
		setUpgrade(upgrade);
		setUpgrade_request(upgrade_request);
		setClose(close);
		setDone_processing(done_processing);
	}
	public httprequest() {
	}
	
	public int ProcessRequest() {
		Object generatedReqbuf = this.getReqbuf();
		Object generatedCheckindex = this.getCheckindex();
		byte line = generatedReqbuf[generatedCheckindex];
		boolean chunked = 0;
		byte[] request = new byte[256];
		byte[] doc = new byte[140000];
		byte[] logbuf = new byte[456];
		int prot_major;
		int prot_minor;
		byte end = /*Error: Function owner not recognized*/strstr(line, ModernizedCProgram.end_of_headers);
		int generatedCallcount = this.getCallcount();
		generatedCallcount++;
		Object generatedOffset = this.getOffset();
		ModernizedCProgram.logmsg("Process %d bytes request%s", generatedOffset, generatedCallcount > 1 ? " [CONTINUED]" : ""/* try to figure out the request characteristics as soon as possible, but
		     only once! */);
		long generatedTestno = this.getTestno();
		long generatedPartno = this.getPartno();
		int generatedProt_version = this.getProt_version();
		int generatedConnect_port = this.getConnect_port();
		if (ModernizedCProgram.use_gopher && (generatedTestno == .DOCNUMBER_NOTHING) && !/*Error: Function owner not recognized*/strncmp("/verifiedserver", line, 15)) {
			ModernizedCProgram.logmsg("Are-we-friendly question received");
			this.setTestno(.DOCNUMBER_WERULEZ);
			return /* done */1;
		}  else if ((generatedTestno == .DOCNUMBER_NOTHING) && /*Error: Function owner not recognized*/sscanf(line, "%255s %139999s HTTP/%d.%d", request, doc, prot_major, prot_minor) == 4) {
			byte ptr;
			this.setProt_version(prot_major * 10 + prot_minor);
			ptr = /*Error: Function owner not recognized*/strrchr(doc, /* find the last slash */(byte)'/');
			if (/* get the number after it */ptr) {
				if ((/*Error: Function owner not recognized*/strlen(doc) + /*Error: Function owner not recognized*/strlen(request)) < 400) {
					ModernizedCProgram.curl_msnprintf(logbuf, /*Error: sizeof expression not supported yet*/, "Got request: %s %s HTTP/%d.%d", request, doc, prot_major, prot_minor);
				} else {
						ModernizedCProgram.curl_msnprintf(logbuf, /*Error: sizeof expression not supported yet*/, "Got a *HUGE* request HTTP/%d.%d", prot_major, prot_minor);
				} 
				ModernizedCProgram.logmsg("%s", logbuf);
				if (!/*Error: Function owner not recognized*/strncmp("/verifiedserver", ptr, 15)) {
					ModernizedCProgram.logmsg("Are-we-friendly question received");
					this.setTestno(.DOCNUMBER_WERULEZ);
					return /* done */1;
				} 
				if (!/*Error: Function owner not recognized*/strncmp("/quit", ptr, 5)) {
					ModernizedCProgram.logmsg("Request-to-quit received");
					this.setTestno(.DOCNUMBER_QUIT);
					return /* done */1;
				} 
				/* skip the slash */ptr++;
				while (ptr && !(ModernizedCProgram.Curl_isdigit((int)((byte)/* skip all non-numericals following the slash */ptr)))) {
					ptr++;
				}
				this.setTestno(/*Error: Function owner not recognized*/strtol(ptr, ptr, 10));
				if (generatedTestno > 10000) {
					this.setPartno(generatedTestno % 10000);
					generatedTestno /= 10000;
				} else {
						this.setPartno(0);
				} 
				if (generatedTestno) {
					ModernizedCProgram.curl_msnprintf(logbuf, /*Error: sizeof expression not supported yet*/, "Requested test number %ld part %ld", generatedTestno, generatedPartno);
					ModernizedCProgram.logmsg("%s", logbuf);
					/* find and parse <servercmd> for this test */req.parse_servercmd();
				} else {
						this.setTestno(.DOCNUMBER_NOTHING);
				} 
			} 
			if (generatedTestno == .DOCNUMBER_NOTHING/* didn't find any in the first scan, try alternative test case
			         number placements */) {
				if (/*Error: Function owner not recognized*/sscanf(generatedReqbuf, "CONNECT %139999s HTTP/%d.%d", doc, prot_major, prot_minor) == 3) {
					byte portp = ((Object)0);
					ModernizedCProgram.curl_msnprintf(logbuf, /*Error: sizeof expression not supported yet*/, "Received a CONNECT %s HTTP/%d.%d request", doc, prot_major, prot_minor);
					ModernizedCProgram.logmsg("%s", logbuf);
					this.setConnect_request(1);
					if (generatedProt_version == 10) {
						this.setOpen(/* HTTP 1.0 closes connection by default */0);
					} 
					if (doc[0] == (byte)'[') {
						byte p = doc[1];
						long part = 0/* scan through the hexgroups and store the value of the last group
						             in the 'part' variable and use as test case number!! */;
						while (p && ((ModernizedCProgram.Curl_isxdigit((int)((byte)p))) || (p == (byte)':') || (p == (byte)'.'))) {
							byte endp;
							part = /*Error: Function owner not recognized*/strtoul(p, endp, 16);
							if ((ModernizedCProgram.Curl_isxdigit((int)((byte)p)))) {
								p = endp;
							} else {
									p++;
							} 
						}
						if (p != (byte)']') {
							ModernizedCProgram.logmsg("Invalid CONNECT IPv6 address format");
						}  else if ((p + 1) != (byte)':') {
							ModernizedCProgram.logmsg("Invalid CONNECT IPv6 port format");
						} else {
								portp = p + 1;
						} 
						this.setTestno(part);
					} else {
							portp = /*Error: Function owner not recognized*/strchr(doc, (byte)':');
					} 
					if (portp && ((portp + 1) != (byte)'\0') && (ModernizedCProgram.Curl_isdigit((int)((byte)(portp + 1))))) {
						long ulnum = /*Error: Function owner not recognized*/strtoul(portp + 1, ((Object)0), 10);
						if (!ulnum || (ulnum > -1024)) {
							ModernizedCProgram.logmsg("Invalid CONNECT port received");
						} else {
								this.setConnect_port(ModernizedCProgram.curlx_ultous(ulnum));
						} 
					} 
					ModernizedCProgram.logmsg("Port number: %d, test case number: %ld", generatedConnect_port, generatedTestno);
				} 
			} 
			if (generatedTestno == .DOCNUMBER_NOTHING) {
				byte testno = /*Error: Function owner not recognized*/strstr(line, /* check for a Testno: header with the test case number */"\nTestno: ");
				if (testno) {
					this.setTestno(/*Error: Function owner not recognized*/strtol(testno[9], ((Object)0), 10));
					ModernizedCProgram.logmsg("Found test number %d in Testno: header!", generatedTestno);
				} 
			} 
			if (generatedTestno == .DOCNUMBER_NOTHING/* Still no test case number. Try to get the the number off the last dot
			         instead, IE we consider the TLD to be the test number. Test 123 can
			         then be written as "example.com.123". */) {
				ptr = /*Error: Function owner not recognized*/strrchr(doc, /* find the last dot */(byte)'.');
				if (/* get the number after it */ptr) {
					/* skip the dot */ptr++;
					this.setTestno(/*Error: Function owner not recognized*/strtol(ptr, ptr, 10));
					if (generatedTestno > 10000) {
						this.setPartno(generatedTestno % 10000);
						generatedTestno /= 10000;
						ModernizedCProgram.logmsg("found test %d in requested host name", generatedTestno);
					} else {
							this.setPartno(0);
					} 
					ModernizedCProgram.curl_msnprintf(logbuf, /*Error: sizeof expression not supported yet*/, "Requested test number %ld part %ld (from host name)", generatedTestno, generatedPartno);
					ModernizedCProgram.logmsg("%s", logbuf);
				} 
				if (!generatedTestno) {
					ModernizedCProgram.logmsg("Did not find test number in PATH");
					this.setTestno(.DOCNUMBER_404);
				} else {
						req.parse_servercmd();
				} 
			} 
		}  else if ((generatedOffset >= 3) && (generatedTestno == .DOCNUMBER_NOTHING)) {
			ModernizedCProgram.logmsg("** Unusual request. Starts with %02x %02x %02x", line[0], line[1], line[2]);
		} 
		if (!end) {
			ModernizedCProgram.logmsg(/* we don't have a complete request yet! */"request not complete yet");
			return /* not complete yet */0;
		} 
		ModernizedCProgram.logmsg("- request found to be complete");
		if (ModernizedCProgram.use_gopher/* when using gopher we cannot check the request until the entire
		       thing has been received */) {
			byte ptr;
			ptr = /*Error: Function owner not recognized*/strrchr(line, /* find the last slash in the line */(byte)'/');
			if (ptr) {
				/* skip the slash */ptr++;
				while (ptr && !(ModernizedCProgram.Curl_isdigit((int)((byte)/* skip all non-numericals following the slash */ptr)))) {
					ptr++;
				}
				this.setTestno(/*Error: Function owner not recognized*/strtol(ptr, ptr, 10));
				if (generatedTestno > 10000) {
					this.setPartno(generatedTestno % 10000);
					generatedTestno /= 10000;
				} else {
						this.setPartno(0);
				} 
				ModernizedCProgram.curl_msnprintf(logbuf, /*Error: sizeof expression not supported yet*/, "Requested GOPHER test number %ld part %ld", generatedTestno, generatedPartno);
				ModernizedCProgram.logmsg("%s", logbuf/* **** Persistence ****
				   *
				   * If the request is a HTTP/1.0 one, we close the connection unconditionally
				   * when we're done.
				   *
				   * If the request is a HTTP/1.1 one, we MUST check for a "Connection:"
				   * header that might say "close". If it does, we close a connection when
				   * this request is processed. Otherwise, we keep the connection alive for X
				   * seconds.
				   */);
			} 
		} 
		Object generatedCl = this.getCl();
		int generatedSkip = this.getSkip();
		do {
			if (ModernizedCProgram.got_exit_signal) {
				return /* done */1;
			} 
			if ((generatedCl == 0) && ModernizedCProgram.Curl_strncasecompare("Content-Length:", line, 15/* If we don't ignore content-length, we read it and we read the whole
			         request including the body before we return. If we've been told to
			         ignore the content-length, we will return as soon as all headers
			         have been received */)) {
				byte endptr;
				byte ptr = line + 15;
				long clen = 0;
				while (ptr && (ModernizedCProgram.Curl_isspace((int)((byte)ptr)))) {
					ptr++;
				}
				endptr = ptr;
				(/*Error: Function owner not recognized*/_errno()) = 0;
				clen = /*Error: Function owner not recognized*/strtoul(ptr, endptr, 10);
				if ((ptr == endptr) || !(ModernizedCProgram.Curl_isspace((int)((byte)endptr))) || (34 == (/*Error: Function owner not recognized*/_errno()))) {
					ModernizedCProgram.logmsg("Found invalid Content-Length: (%s) in the request", /* this assumes that a zero Content-Length is valid */ptr);
					this.setOpen(/* closes connection */0);
					return /* done */1;
				} 
				this.setCl(clen - generatedSkip);
				ModernizedCProgram.logmsg("Found Content-Length: %lu in the request", clen);
				if (generatedSkip) {
					ModernizedCProgram.logmsg("... but will abort after %zu bytes", generatedCl);
				} 
				break;
			}  else if (ModernizedCProgram.Curl_strncasecompare("Transfer-Encoding: chunked", line, /*Error: Function owner not recognized*/strlen("Transfer-Encoding: chunked"))) {
				chunked = /* chunked data coming in */1;
			} 
			if (chunked) {
				if (/*Error: Function owner not recognized*/strstr(generatedReqbuf, "\r\n0\r\n\r\n")) {
					return /* end of chunks reached *//* done */1;
				}  else if (/*Error: Function owner not recognized*/strstr(generatedReqbuf, "\r\n0\r\n")) {
					byte last_crlf_char = /*Error: Function owner not recognized*/strstr(generatedReqbuf, "\r\n\r\n");
					while (1) {
						if (!/*Error: Function owner not recognized*/strstr(last_crlf_char + 4, "\r\n\r\n")) {
							break;
						} 
						last_crlf_char = /*Error: Function owner not recognized*/strstr(last_crlf_char + 4, "\r\n\r\n");
					}
					if (last_crlf_char && last_crlf_char > /*Error: Function owner not recognized*/strstr(generatedReqbuf, "\r\n0\r\n")) {
						return 1;
					} 
					ModernizedCProgram.already_recv_zeroed_chunk = 1;
					return 0;
				}  else if (ModernizedCProgram.already_recv_zeroed_chunk && /*Error: Function owner not recognized*/strstr(generatedReqbuf, "\r\n\r\n")) {
					return 1;
				} else {
						return /* not done */0;
				} 
			} 
			line = /*Error: Function owner not recognized*/strchr(line, (byte)'\n');
			if (line) {
				line++;
			} 
		} while (line);
		 generatedAuth = this.getAuth();
		 generatedAuth_req = this.getAuth_req();
		if (!generatedAuth && /*Error: Function owner not recognized*/strstr(generatedReqbuf, "Authorization:")) {
			this.setAuth(/* Authorization: header present! */1);
			if (generatedAuth_req) {
				ModernizedCProgram.logmsg("Authorization header found, as required");
			} 
		} 
		 generatedDigest = this.getDigest();
		 generatedNtlm = this.getNtlm();
		if (/*Error: Function owner not recognized*/strstr(generatedReqbuf, "Authorization: Negotiate")) {
			long prev_testno = -/* Negotiate iterations */1;
			long prev_partno = -1;
			ModernizedCProgram.logmsg("Negotiate: prev_testno: %d, prev_partno: %d", prev_testno, prev_partno);
			if (generatedTestno != prev_testno) {
				prev_testno = generatedTestno;
				prev_partno = generatedPartno;
			} 
			prev_partno += 1;
			this.setPartno(prev_partno);
		}  else if (!generatedDigest && /*Error: Function owner not recognized*/strstr(generatedReqbuf, "Authorization: Digest"/* If the client is passing this Digest-header, we set the part number
		       to 1000. Not only to spice up the complexity of this, but to make
		       Digest stuff to work in the test suite. */)) {
			generatedPartno += 1000;
			this.setDigest(/* header found */1);
			ModernizedCProgram.logmsg("Received Digest request, sending back data %ld", generatedPartno);
		}  else if (!generatedNtlm && /*Error: Function owner not recognized*/strstr(generatedReqbuf, "Authorization: NTLM TlRMTVNTUAAD")) {
			generatedPartno += /* If the client is passing this type-3 NTLM header */1002;
			this.setNtlm(/* NTLM found */1);
			ModernizedCProgram.logmsg("Received NTLM type-3, sending back data %ld", generatedPartno);
			if (generatedCl) {
				ModernizedCProgram.logmsg("  Expecting %zu POSTed bytes", generatedCl);
			} 
		}  else if (!generatedNtlm && /*Error: Function owner not recognized*/strstr(generatedReqbuf, "Authorization: NTLM TlRMTVNTUAAB")) {
			generatedPartno += /* If the client is passing this type-1 NTLM header */1001;
			this.setNtlm(/* NTLM found */1);
			ModernizedCProgram.logmsg("Received NTLM type-1, sending back data %ld", generatedPartno);
		}  else if ((generatedPartno >= 1000) && /*Error: Function owner not recognized*/strstr(generatedReqbuf, "Authorization: Basic"/* If the client is passing this Basic-header and the part number is
		       already >=1000, we add 1 to the part number.  This allows simple Basic
		       authentication negotiation to work in the test suite. */)) {
			generatedPartno += 1;
			ModernizedCProgram.logmsg("Received Basic request, sending back data %ld", generatedPartno);
		} 
		if (/*Error: Function owner not recognized*/strstr(generatedReqbuf, "Connection: close")) {
			this.setOpen(/* close connection after this request */0);
		} 
		 generatedOpen = this.getOpen();
		if (generatedOpen && generatedProt_version >= 11 && end && generatedReqbuf + generatedOffset > end + /*Error: Function owner not recognized*/strlen(ModernizedCProgram.end_of_headers) && !generatedCl && (!/*Error: Function owner not recognized*/strncmp(generatedReqbuf, "GET", /*Error: Function owner not recognized*/strlen("GET")) || !/*Error: Function owner not recognized*/strncmp(generatedReqbuf, "HEAD", /*Error: Function owner not recognized*/strlen("HEAD"/* If we have a persistent connection, HTTP version >= 1.1
		       and GET/HEAD request, enable pipelining. */)))) {
			this.setCheckindex((end - generatedReqbuf) + /*Error: Function owner not recognized*/strlen(ModernizedCProgram.end_of_headers/* If authentication is required and no auth was provided, end now. This
			     makes the server NOT wait for PUT/POST data and you can then make the
			     test case send a rejection before any such data has been sent. Test case
			     154 uses this.*/));
		} 
		if (generatedAuth_req && !generatedAuth) {
			ModernizedCProgram.logmsg("Return early due to auth requested by none provided");
			return /* done */1;
		} 
		 generatedUpgrade = this.getUpgrade();
		if (generatedUpgrade && /*Error: Function owner not recognized*/strstr(generatedReqbuf, "Upgrade:")) {
			ModernizedCProgram.logmsg(/* we allow upgrade and there was one! */"Found Upgrade: in request and allows it");
			this.setUpgrade_request(1);
		} 
		if (generatedCl > 0) {
			if (generatedCl <= generatedOffset - (end - generatedReqbuf) - /*Error: Function owner not recognized*/strlen(ModernizedCProgram.end_of_headers)) {
				return /* done */1;
			} else {
					return /* not complete yet */0;
			} 
		} 
		return /* done */1;
		Object generatedReqbuf = this.getReqbuf();
		Object generatedCheckindex = this.getCheckindex();
		byte line = generatedReqbuf[generatedCheckindex];
		bool chunked = 0;
		byte[] request = new byte[256];
		byte[] doc = new byte[140000];
		byte[] prot_str = new byte[5];
		int prot_major;
		int prot_minor;
		byte end = /*Error: Function owner not recognized*/strstr(line, "\r\n\r\n");
		long generatedTestno = this.getTestno();
		ModernizedCProgram.logmsg("ProcessRequest() called with testno %ld and line [%s]", generatedTestno, line);
		long generatedPartno = this.getPartno();
		Object generatedRtp_buffer = this.getRtp_buffer();
		Object generatedRtp_buffersize = this.getRtp_buffersize();
		int generatedProt_version = this.getProt_version();
		if ((generatedTestno == /* try to figure out the request characteristics as soon as possible, but
		     only once! */.DOCNUMBER_NOTHING) && /*Error: Function owner not recognized*/sscanf(line, "%255s %139999s %4s/%d.%d", request, doc, prot_str, prot_major, prot_minor) == 5) {
			byte ptr;
			byte[] logbuf = new byte[256];
			if (!/*Error: Function owner not recognized*/strcmp(prot_str, "HTTP")) {
				this.setProtocol(.RPROT_HTTP);
			}  else if (!/*Error: Function owner not recognized*/strcmp(prot_str, "RTSP")) {
				this.setProtocol(.RPROT_RTSP);
			} else {
					this.setProtocol(.RPROT_NONE);
					ModernizedCProgram.logmsg("got unknown protocol %s", prot_str);
					return 1;
			} 
			this.setProt_version(prot_major * 10 + prot_minor);
			ptr = /*Error: Function owner not recognized*/strrchr(doc, /* find the last slash */(byte)'/');
			if (/* get the number after it */ptr) {
				FILE stream = new FILE();
				byte filename;
				if ((/*Error: Function owner not recognized*/strlen(doc) + /*Error: Function owner not recognized*/strlen(request)) < 200) {
					ModernizedCProgram.curl_msnprintf(logbuf, /*Error: sizeof expression not supported yet*/, "Got request: %s %s %s/%d.%d", request, doc, prot_str, prot_major, prot_minor);
				} else {
						ModernizedCProgram.curl_msnprintf(logbuf, /*Error: sizeof expression not supported yet*/, "Got a *HUGE* request %s/%d.%d", prot_str, prot_major, prot_minor);
				} 
				ModernizedCProgram.logmsg("%s", logbuf);
				if (!/*Error: Function owner not recognized*/strncmp("/verifiedserver", ptr, 15)) {
					ModernizedCProgram.logmsg("Are-we-friendly question received");
					this.setTestno(.DOCNUMBER_WERULEZ);
					return /* done */1;
				} 
				if (!/*Error: Function owner not recognized*/strncmp("/quit", ptr, 5)) {
					ModernizedCProgram.logmsg("Request-to-quit received");
					this.setTestno(.DOCNUMBER_QUIT);
					return /* done */1;
				} 
				/* skip the slash */ptr++;
				while (ptr && !(ModernizedCProgram.Curl_isdigit((int)((byte)/* skip all non-numericals following the slash */ptr)))) {
					ptr++;
				}
				this.setTestno(/*Error: Function owner not recognized*/strtol(ptr, ptr, 10));
				if (generatedTestno > 10000) {
					this.setPartno(generatedTestno % 10000);
					generatedTestno /= 10000;
				} else {
						this.setPartno(0);
				} 
				ModernizedCProgram.curl_msnprintf(logbuf, /*Error: sizeof expression not supported yet*/, "Requested test number %ld part %ld", generatedTestno, generatedPartno);
				ModernizedCProgram.logmsg("%s", logbuf);
				ModernizedCProgram.filename = ModernizedCProgram.test2file(generatedTestno);
				stream = /*Error: Function owner not recognized*/fopen(ModernizedCProgram.filename, "rb");
				if (!stream) {
					int error = (/*Error: Function owner not recognized*/_errno());
					ModernizedCProgram.logmsg("fopen() failed with error: %d %s", error, /*Error: Function owner not recognized*/strerror(error));
					ModernizedCProgram.logmsg("Error opening file: %s", ModernizedCProgram.filename);
					ModernizedCProgram.logmsg("Couldn't open test file %ld", generatedTestno);
					this.setOpen(/* closes connection */0);
					return /* done */1;
				} else {
						byte cmd = ((Object)0);
						size_t cmdsize = 0;
						int num = 0;
						int rtp_channel = 0;
						int rtp_size = 0;
						int rtp_partno = -1;
						byte rtp_scratch = ((Object)0);
						int error = /* get the custom server control "commands" */stream.getpart(cmd, cmdsize, "reply", "servercmd");
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(stream);
						if (error) {
							ModernizedCProgram.logmsg("getpart() failed with error: %d", error);
							this.setOpen(/* closes connection */0);
							return /* done */1;
						} 
						ptr = cmd;
						if (cmdsize) {
							ModernizedCProgram.logmsg("Found a reply-servercmd section!");
							do {
								if (!/*Error: Function owner not recognized*/strncmp("auth_required", ptr, /*Error: Function owner not recognized*/strlen("auth_required"))) {
									ModernizedCProgram.logmsg("instructed to require authorization header");
									this.setAuth_req(1);
								}  else if (!/*Error: Function owner not recognized*/strncmp("idle", ptr, /*Error: Function owner not recognized*/strlen("idle"))) {
									ModernizedCProgram.logmsg("instructed to idle");
									this.setRcmd(1);
									this.setOpen(1);
								}  else if (!/*Error: Function owner not recognized*/strncmp("stream", ptr, /*Error: Function owner not recognized*/strlen("stream"))) {
									ModernizedCProgram.logmsg("instructed to stream");
									this.setRcmd(2);
								}  else if (1 == /*Error: Function owner not recognized*/sscanf(ptr, "pipe: %d", num)) {
									ModernizedCProgram.logmsg("instructed to allow a pipe size of %d", num);
									if (num < 0) {
										ModernizedCProgram.logmsg("negative pipe size ignored");
									}  else if (num > 0) {
										this.setPipe(num - /* decrease by one since we don't count the
										                                      first request in this number */1);
									} 
								}  else if (1 == /*Error: Function owner not recognized*/sscanf(ptr, "skip: %d", num)) {
									ModernizedCProgram.logmsg("instructed to skip this number of bytes %d", num);
									this.setSkip(num);
								}  else if (3 == /*Error: Function owner not recognized*/sscanf(ptr, "rtp: part %d channel %d size %d", rtp_partno, rtp_channel, rtp_size)) {
									if (rtp_partno == generatedPartno) {
										int i = 0;
										ModernizedCProgram.logmsg("RTP: part %d channel %d size %d", rtp_partno, rtp_channel, rtp_size);
										rtp_scratch = /*Error: Function owner not recognized*/malloc(rtp_size + 4 + /* Make our scratch buffer enough to fit all the
										                 * desired data and one for padding */12);
										rtp_scratch[0] = /* RTP is signalled with a $ */(byte)'$';
										((rtp_scratch)[1] = (byte)((rtp_channel) & /* The channel follows and is one byte */-1024));
										();
										for (i = 0; i < rtp_size; i += /* Fill it with junk data */12) {
											/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(rtp_scratch + 4 + i, ModernizedCProgram.RTP_DATA, 12);
										}
										if (generatedRtp_buffer == ((Object)0)) {
											this.setRtp_buffer(rtp_scratch);
											this.setRtp_buffersize(rtp_size + 4);
										} else {
												this.setRtp_buffer(/*Error: Function owner not recognized*/realloc(generatedRtp_buffer, generatedRtp_buffersize + rtp_size + 4));
												/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedRtp_buffer + generatedRtp_buffersize, rtp_scratch, rtp_size + 4);
												generatedRtp_buffersize += rtp_size + 4;
												/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(rtp_scratch);
										} 
										ModernizedCProgram.logmsg("rtp_buffersize is %zu, rtp_size is %d.", generatedRtp_buffersize, rtp_size);
									} 
								} else {
										ModernizedCProgram.logmsg("funny instruction found: %s", ptr);
								} 
								ptr = /*Error: Function owner not recognized*/strchr(ptr, (byte)'\n');
								if (ptr) {
									ptr++;
								} else {
										ptr = ((Object)0);
								} 
							} while (ptr && ptr);
							ModernizedCProgram.logmsg("Done parsing server commands");
						} 
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(cmd);
				} 
			} else {
					if (/*Error: Function owner not recognized*/sscanf(generatedReqbuf, "CONNECT %139999s HTTP/%d.%d", doc, prot_major, prot_minor) == 3) {
						ModernizedCProgram.curl_msnprintf(logbuf, /*Error: sizeof expression not supported yet*/, "Received a CONNECT %s HTTP/%d.%d request", doc, prot_major, prot_minor);
						ModernizedCProgram.logmsg("%s", logbuf);
						if (generatedProt_version == 10) {
							this.setOpen(/* HTTP 1.0 closes connection by default */0);
						} 
						if (!/*Error: Function owner not recognized*/strncmp(doc, "bad", 3)) {
							this.setTestno(/* if the host name starts with bad, we fake an error here */.DOCNUMBER_BADCONNECT);
						}  else if (!/*Error: Function owner not recognized*/strncmp(doc, "test", 4/* if the host name starts with test, the port number used in the
						             CONNECT line will be used as test number! */)) {
							byte portp = /*Error: Function owner not recognized*/strchr(doc, (byte)':');
							if (portp && ((portp + 1) != (byte)'\0') && (ModernizedCProgram.Curl_isdigit((int)((byte)(portp + 1))))) {
								this.setTestno(/*Error: Function owner not recognized*/strtol(portp + 1, ((Object)0), 10));
							} else {
									this.setTestno(.DOCNUMBER_CONNECT);
							} 
						} else {
								this.setTestno(.DOCNUMBER_CONNECT);
						} 
					} else {
							ModernizedCProgram.logmsg("Did not find test number in PATH");
							this.setTestno(.DOCNUMBER_404);
					} 
			} 
		} 
		if (!end) {
			ModernizedCProgram.logmsg(/* we don't have a complete request yet! */"ProcessRequest returned without a complete request");
			return /* not complete yet */0;
		} 
		ModernizedCProgram.logmsg("ProcessRequest found a complete request");
		Object generatedPipe = this.getPipe();
		if (generatedPipe) {
			generatedCheckindex += (end - line) + /*Error: Function owner not recognized*/strlen("\r\n\r\n"/* **** Persistence ****
			   *
			   * If the request is a HTTP/1.0 one, we close the connection unconditionally
			   * when we're done.
			   *
			   * If the request is a HTTP/1.1 one, we MUST check for a "Connection:"
			   * header that might say "close". If it does, we close a connection when
			   * this request is processed. Otherwise, we keep the connection alive for X
			   * seconds.
			   */);
		} 
		Object generatedCl = this.getCl();
		int generatedSkip = this.getSkip();
		do {
			if (ModernizedCProgram.got_exit_signal) {
				return /* done */1;
			} 
			if ((generatedCl == 0) && ModernizedCProgram.Curl_strncasecompare("Content-Length:", line, 15/* If we don't ignore content-length, we read it and we read the whole
			         request including the body before we return. If we've been told to
			         ignore the content-length, we will return as soon as all headers
			         have been received */)) {
				byte endptr;
				byte ptr = line + 15;
				long clen = 0;
				while (ptr && (ModernizedCProgram.Curl_isspace((int)((byte)ptr)))) {
					ptr++;
				}
				endptr = ptr;
				(/*Error: Function owner not recognized*/_errno()) = 0;
				clen = /*Error: Function owner not recognized*/strtoul(ptr, endptr, 10);
				if ((ptr == endptr) || !(ModernizedCProgram.Curl_isspace((int)((byte)endptr))) || (34 == (/*Error: Function owner not recognized*/_errno()))) {
					ModernizedCProgram.logmsg("Found invalid Content-Length: (%s) in the request", /* this assumes that a zero Content-Length is valid */ptr);
					this.setOpen(/* closes connection */0);
					return /* done */1;
				} 
				this.setCl(clen - generatedSkip);
				ModernizedCProgram.logmsg("Found Content-Length: %lu in the request", clen);
				if (generatedSkip) {
					ModernizedCProgram.logmsg("... but will abort after %zu bytes", generatedCl);
				} 
				break;
			}  else if (ModernizedCProgram.Curl_strncasecompare("Transfer-Encoding: chunked", line, /*Error: Function owner not recognized*/strlen("Transfer-Encoding: chunked"))) {
				chunked = /* chunked data coming in */1;
			} 
			if (chunked) {
				if (/*Error: Function owner not recognized*/strstr(generatedReqbuf, "\r\n0\r\n\r\n")) {
					return /* end of chunks reached *//* done */1;
				} else {
						return /* not done */0;
				} 
			} 
			line = /*Error: Function owner not recognized*/strchr(line, (byte)'\n');
			if (line) {
				line++;
			} 
		} while (line);
		 generatedAuth = this.getAuth();
		 generatedAuth_req = this.getAuth_req();
		if (!generatedAuth && /*Error: Function owner not recognized*/strstr(generatedReqbuf, "Authorization:")) {
			this.setAuth(/* Authorization: header present! */1);
			if (generatedAuth_req) {
				ModernizedCProgram.logmsg("Authorization header found, as required");
			} 
		} 
		 generatedDigest = this.getDigest();
		 generatedNtlm = this.getNtlm();
		if (!generatedDigest && /*Error: Function owner not recognized*/strstr(generatedReqbuf, "Authorization: Digest"/* If the client is passing this Digest-header, we set the part number
		       to 1000. Not only to spice up the complexity of this, but to make
		       Digest stuff to work in the test suite. */)) {
			generatedPartno += 1000;
			this.setDigest(/* header found */1);
			ModernizedCProgram.logmsg("Received Digest request, sending back data %ld", generatedPartno);
		}  else if (!generatedNtlm && /*Error: Function owner not recognized*/strstr(generatedReqbuf, "Authorization: NTLM TlRMTVNTUAAD")) {
			generatedPartno += /* If the client is passing this type-3 NTLM header */1002;
			this.setNtlm(/* NTLM found */1);
			ModernizedCProgram.logmsg("Received NTLM type-3, sending back data %ld", generatedPartno);
			if (generatedCl) {
				ModernizedCProgram.logmsg("  Expecting %zu POSTed bytes", generatedCl);
			} 
		}  else if (!generatedNtlm && /*Error: Function owner not recognized*/strstr(generatedReqbuf, "Authorization: NTLM TlRMTVNTUAAB")) {
			generatedPartno += /* If the client is passing this type-1 NTLM header */1001;
			this.setNtlm(/* NTLM found */1);
			ModernizedCProgram.logmsg("Received NTLM type-1, sending back data %ld", generatedPartno);
		}  else if ((generatedPartno >= 1000) && /*Error: Function owner not recognized*/strstr(generatedReqbuf, "Authorization: Basic"/* If the client is passing this Basic-header and the part number is
		       already >=1000, we add 1 to the part number.  This allows simple Basic
		       authentication negotiation to work in the test suite. */)) {
			generatedPartno += 1;
			ModernizedCProgram.logmsg("Received Basic request, sending back data %ld", generatedPartno);
		} 
		if (/*Error: Function owner not recognized*/strstr(generatedReqbuf, "Connection: close")) {
			this.setOpen(/* close connection after this request */0);
		} 
		 generatedOpen = this.getOpen();
		Object generatedOffset = this.getOffset();
		if (!generatedPipe && generatedOpen && generatedProt_version >= 11 && end && generatedReqbuf + generatedOffset > end + /*Error: Function owner not recognized*/strlen("\r\n\r\n") && (!/*Error: Function owner not recognized*/strncmp(generatedReqbuf, "GET", /*Error: Function owner not recognized*/strlen("GET")) || !/*Error: Function owner not recognized*/strncmp(generatedReqbuf, "HEAD", /*Error: Function owner not recognized*/strlen("HEAD"/* If we have a persistent connection, HTTP version >= 1.1
		       and GET/HEAD request, enable pipelining. */)))) {
			this.setCheckindex((end - generatedReqbuf) + /*Error: Function owner not recognized*/strlen("\r\n\r\n"));
			this.setPipelining(1);
		} 
		while (generatedPipe) {
			if (ModernizedCProgram.got_exit_signal) {
				return /* done */1;
			} 
			line = generatedReqbuf[generatedCheckindex];
			end = /*Error: Function owner not recognized*/strstr(line, "\r\n\r\n");
			if (!end) {
				break;
			} 
			generatedCheckindex += (end - line) + /*Error: Function owner not recognized*/strlen("\r\n\r\n");
			generatedPipe--;
		}
		if (generatedAuth_req && !generatedAuth) {
			return /* done */1;
		} 
		if (generatedCl > 0) {
			if (generatedCl <= generatedOffset - (end - generatedReqbuf) - /*Error: Function owner not recognized*/strlen("\r\n\r\n")) {
				return /* done */1;
			} else {
					return /* not complete yet */0;
			} 
		} 
		return /* done */1;
	}
	public void init_httprequest() {
		this.setCheckindex(0);
		this.setOffset(0);
		this.setTestno(.DOCNUMBER_NOTHING);
		this.setPartno(0);
		this.setConnect_request(0);
		this.setOpen(1);
		this.setAuth_req(0);
		this.setAuth(0);
		this.setCl(0);
		this.setDigest(0);
		this.setNtlm(0);
		this.setSkip(0);
		this.setWritedelay(0);
		this.setRcmd(0);
		this.setProt_version(0);
		this.setCallcount(0);
		this.setConnect_port(0);
		this.setDone_processing(0);
		this.setUpgrade(0);
		this.setUpgrade_request(0);
	}
	/* returns 1 if the connection should be serviced again immediately, 0 if there
	   is no data waiting, or < 0 if it should be closed */
	public int get_request(Object sock) {
		int fail = 0;
		Object generatedReqbuf = this.getReqbuf();
		byte reqbuf = generatedReqbuf;
		ssize_t got = 0;
		int overflow = 0;
		Object generatedOffset = this.getOffset();
		int generatedSkip = this.getSkip();
		Object generatedCl = this.getCl();
		if (generatedOffset >= 150000 - 1) {
			overflow = /* buffer is already full; do nothing */1;
		} else {
				if (generatedSkip) {
					got = (ssize_t)/*Error: Function owner not recognized*/recv((SOCKET)(sock), (byte)(reqbuf + generatedOffset), (int)(generatedCl), (int)(false));
				} else {
						got = (ssize_t)/*Error: Function owner not recognized*/recv((SOCKET)(sock), (byte)(reqbuf + generatedOffset), (int)(150000 - 1 - generatedOffset), (int)(false));
				} 
				if (ModernizedCProgram.got_exit_signal) {
					return -1;
				} 
				if (got == 0) {
					ModernizedCProgram.logmsg("Connection closed by client");
					fail = 1;
				}  else if (got < 0) {
					int error = ((int)/*Error: Function owner not recognized*/WSAGetLastError());
					if (11 == error || -1024 == error) {
						return /* nothing to read at the moment */0;
					} 
					ModernizedCProgram.logmsg("recv() returned error: (%d) %s", error, /*Error: Function owner not recognized*/strerror(error));
					fail = 1;
				} 
				if (fail) {
					reqbuf[generatedOffset] = /* dump the request received so far to the external file */(byte)'\0';
					ModernizedCProgram.storerequest(reqbuf, generatedOffset);
					return -1;
				} 
				ModernizedCProgram.logmsg("Read %zd bytes", got);
				generatedOffset += (size_t)got;
				reqbuf[generatedOffset] = (byte)'\0';
				this.setDone_processing(req.ProcessRequest());
				if (ModernizedCProgram.got_exit_signal) {
					return -1;
				} 
		} 
		if (overflow || (generatedOffset == 150000 - 1 && got > 0)) {
			ModernizedCProgram.logmsg("Request would overflow buffer, closing connection");
			reqbuf[150000 - 1] = /* dump request received so far to external file anyway */(byte)'\0';
			fail = 1;
		}  else if (generatedOffset > 150000 - 1) {
			ModernizedCProgram.logmsg("Request buffer overflow, closing connection");
			reqbuf[150000 - 1] = /* dump request received so far to external file anyway */(byte)'\0';
			fail = 1;
		} else {
				reqbuf[generatedOffset] = (byte)'\0';
		} 
		int generatedDone_processing = this.getDone_processing();
		if (fail || generatedDone_processing) {
			ModernizedCProgram.storerequest(reqbuf, generatedOffset);
		} 
		if (ModernizedCProgram.got_exit_signal) {
			return -1;
		} 
		return fail ? -1 : 1;
		int error;
		int fail = 0;
		int done_processing = 0;
		Object generatedReqbuf = this.getReqbuf();
		byte reqbuf = generatedReqbuf;
		ssize_t got = 0;
		byte pipereq = ((Object)0);
		size_t pipereq_length = 0;
		Object generatedPipelining = this.getPipelining();
		Object generatedCheckindex = this.getCheckindex();
		Object generatedOffset = this.getOffset();
		if (generatedPipelining) {
			pipereq = reqbuf + generatedCheckindex;
			pipereq_length = generatedOffset - generatedCheckindex;
		} 
		this.setCheckindex(/*** Init the httprequest structure properly for the upcoming request ***/0);
		this.setOffset(0);
		this.setTestno(.DOCNUMBER_NOTHING);
		this.setPartno(0);
		this.setOpen(1);
		this.setAuth_req(0);
		this.setAuth(0);
		this.setCl(0);
		this.setDigest(0);
		this.setNtlm(0);
		this.setPipe(0);
		this.setSkip(0);
		this.setRcmd(0);
		this.setProtocol(.RPROT_NONE);
		this.setProt_version(0);
		this.setPipelining(0);
		this.setRtp_buffer(((Object)0));
		this.setRtp_buffersize(0);
		int generatedSkip = this.getSkip();
		Object generatedCl = this.getCl();
		Object generatedPipe = this.getPipe();
		while (!done_processing && (generatedOffset < 150000 - /*** end of httprequest init ***/1)) {
			if (pipereq_length && pipereq) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(reqbuf, pipereq, pipereq_length);
				got = ModernizedCProgram.curlx_uztosz(pipereq_length);
				pipereq_length = 0;
			} else {
					if (generatedSkip) {
						got = (ssize_t)/*Error: Function owner not recognized*/recv((SOCKET)(sock), (byte)(reqbuf + generatedOffset), (int)(generatedCl), (int)(false));
					} else {
							got = (ssize_t)/*Error: Function owner not recognized*/recv((SOCKET)(sock), (byte)(reqbuf + generatedOffset), (int)(150000 - 1 - generatedOffset), (int)(false));
					} 
			} 
			if (ModernizedCProgram.got_exit_signal) {
				return 1;
			} 
			if (got == 0) {
				ModernizedCProgram.logmsg("Connection closed by client");
				fail = 1;
			}  else if (got < 0) {
				error = ((int)/*Error: Function owner not recognized*/WSAGetLastError());
				ModernizedCProgram.logmsg("recv() returned error: (%d) %s", error, /*Error: Function owner not recognized*/strerror(error));
				fail = 1;
			} 
			if (fail) {
				reqbuf[generatedOffset] = /* dump the request received so far to the external file */(byte)'\0';
				ModernizedCProgram.storerequest(reqbuf, generatedOffset);
				return 1;
			} 
			ModernizedCProgram.logmsg("Read %zd bytes", got);
			generatedOffset += (size_t)got;
			reqbuf[generatedOffset] = (byte)'\0';
			done_processing = req.ProcessRequest();
			if (ModernizedCProgram.got_exit_signal) {
				return 1;
			} 
			if (done_processing && generatedPipe) {
				ModernizedCProgram.logmsg("Waiting for another piped request");
				done_processing = 0;
				generatedPipe--;
			} 
		}
		if ((generatedOffset == 150000 - 1) && (got > 0)) {
			ModernizedCProgram.logmsg("Request would overflow buffer, closing connection");
			reqbuf[150000 - 1] = /* dump request received so far to external file anyway */(byte)'\0';
			fail = 1;
		}  else if (generatedOffset > 150000 - 1) {
			ModernizedCProgram.logmsg("Request buffer overflow, closing connection");
			reqbuf[150000 - 1] = /* dump request received so far to external file anyway */(byte)'\0';
			fail = 1;
		} else {
				reqbuf[generatedOffset] = (byte)'\0';
		} 
		ModernizedCProgram.storerequest(reqbuf, generatedPipelining ? generatedCheckindex : generatedOffset);
		if (ModernizedCProgram.got_exit_signal) {
			return 1;
		} 
		return /* return 0 on success */fail;
	}
	/* returns -1 on failure */
	public int send_doc(Object sock) {
		ssize_t written = new ssize_t();
		size_t count = new size_t();
		byte buffer;
		byte ptr = ((Object)0);
		FILE stream = new FILE();
		byte cmd = ((Object)0);
		size_t cmdsize = 0;
		FILE dump = new FILE();
		bool persistent = 1;
		bool sendfailure = 0;
		size_t responsesize = new size_t();
		int error = 0;
		int res;
		byte responsedump = ModernizedCProgram.is_proxy ? "log/proxy.response" : "log/server.response";
		byte[] weare = new byte[256];
		int generatedRcmd = this.getRcmd();
		switch (generatedRcmd) {
		case 2:
				count = /*Error: Function owner not recognized*/strlen("a string to stream 01234567890\n");
				for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
					written = (ssize_t)/*Error: Function owner not recognized*/send((SOCKET)(sock), (byte)("a string to stream 01234567890\n"), (int)(count), (int)(false));
					if (ModernizedCProgram.got_exit_signal) {
						return -1;
					} 
					if (written != (ssize_t)count) {
						ModernizedCProgram.logmsg("Stopped streaming");
						break;
					} 
				}
				return -1;
		case 1:
				return /* Do nothing. Sit idle. Pretend it rains. */0;
		case 0:
				break;
		default:
		}
		this.setOpen(0);
		long generatedTestno = this.getTestno();
		 generatedConnect_request = this.getConnect_request();
		long generatedPartno = this.getPartno();
		if (generatedTestno < 0) {
			size_t msglen = new size_t();
			byte[] msgbuf = new byte[64];
			switch (generatedTestno) {
			case .DOCNUMBER_WERULEZ:
					ModernizedCProgram.logmsg(/* we got a "friends?" question, reply back that we sure are */"Identifying ourselves as friends");
					ModernizedCProgram.curl_msnprintf(msgbuf, /*Error: sizeof expression not supported yet*/, "WE ROOLZ: %ld\r\n", (long)/*Error: Function owner not recognized*/getpid());
					msglen = /*Error: Function owner not recognized*/strlen(msgbuf);
					if (ModernizedCProgram.use_gopher) {
						ModernizedCProgram.curl_msnprintf(weare, /*Error: sizeof expression not supported yet*/, "%s", msgbuf);
					} else {
							ModernizedCProgram.curl_msnprintf(weare, /*Error: sizeof expression not supported yet*/, "HTTP/1.1 200 OK\r\nContent-Length: %zu\r\n\r\n%s", msglen, msgbuf);
					} 
					buffer = weare;
					break;
			case .DOCNUMBER_404:
			case .DOCNUMBER_QUIT:
					ModernizedCProgram.logmsg("Replying to QUIT");
					buffer = ModernizedCProgram.docquit;
					break;
			default:
					ModernizedCProgram.logmsg("Replying to with a 404");
					buffer = ModernizedCProgram.doc404;
					break;
			}
			count = /*Error: Function owner not recognized*/strlen(buffer);
		} else {
				byte[] partbuf = new byte[80];
				byte filename = ModernizedCProgram.test2file(generatedTestno);
				byte section = generatedConnect_request ? "connect" : /* select the <data> tag for "normal" requests and the <connect> one
				       for CONNECT requests (within the <reply> section) */"data";
				if (generatedPartno) {
					ModernizedCProgram.curl_msnprintf(partbuf, /*Error: sizeof expression not supported yet*/, "%s%ld", section, generatedPartno);
				} else {
						ModernizedCProgram.curl_msnprintf(partbuf, /*Error: sizeof expression not supported yet*/, "%s", section);
				} 
				ModernizedCProgram.logmsg("Send response test%ld section <%s>", generatedTestno, partbuf);
				stream = /*Error: Function owner not recognized*/fopen(ModernizedCProgram.filename, "rb");
				if (!stream) {
					error = (/*Error: Function owner not recognized*/_errno());
					ModernizedCProgram.logmsg("fopen() failed with error: %d %s", error, /*Error: Function owner not recognized*/strerror(error));
					ModernizedCProgram.logmsg("  [3] Error opening file: %s", ModernizedCProgram.filename);
					return 0;
				} else {
						error = stream.getpart(ptr, count, "reply", partbuf);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(stream);
						if (error) {
							ModernizedCProgram.logmsg("getpart() failed with error: %d", error);
							return 0;
						} 
						buffer = ptr;
				} 
				if (ModernizedCProgram.got_exit_signal) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
					return -1;
				} 
				stream = /*Error: Function owner not recognized*/fopen(ModernizedCProgram.filename, /* re-open the same file again */"rb");
				if (!stream) {
					error = (/*Error: Function owner not recognized*/_errno());
					ModernizedCProgram.logmsg("fopen() failed with error: %d %s", error, /*Error: Function owner not recognized*/strerror(error));
					ModernizedCProgram.logmsg("  [4] Error opening file: %s", ModernizedCProgram.filename);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
					return 0;
				} else {
						error = /* get the custom server control "commands" */stream.getpart(cmd, cmdsize, "reply", "postcmd");
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(stream);
						if (error) {
							ModernizedCProgram.logmsg("getpart() failed with error: %d", error);
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
							return 0;
						} 
				} 
		} 
		if (ModernizedCProgram.got_exit_signal) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(cmd);
			return -1;
		} 
		 generatedClose = this.getClose();
		if (/*Error: Function owner not recognized*/strstr(buffer, "swsclose") || !count || generatedClose) {
			persistent = 0;
			ModernizedCProgram.logmsg("connection close instruction \"swsclose\" found in response");
		} 
		if (/*Error: Function owner not recognized*/strstr(buffer, "swsbounce")) {
			ModernizedCProgram.prevbounce = 1;
			ModernizedCProgram.logmsg("enable \"swsbounce\" in the next request");
		} else {
				ModernizedCProgram.prevbounce = 0;
		} 
		dump = /*Error: Function owner not recognized*/fopen(responsedump, "ab");
		if (!dump) {
			error = (/*Error: Function owner not recognized*/_errno());
			ModernizedCProgram.logmsg("fopen() failed with error: %d %s", error, /*Error: Function owner not recognized*/strerror(error));
			ModernizedCProgram.logmsg("  [5] Error opening file: %s", responsedump);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(cmd);
			return -1;
		} 
		responsesize = count;
		do {
			res = /*Error: Function owner not recognized*/fclose(dump);
		} while (res && ((error = (/*Error: Function owner not recognized*/_errno())) == 4));
		if (res) {
			ModernizedCProgram.logmsg("Error closing file %s error: %d %s", responsedump, error, /*Error: Function owner not recognized*/strerror(error));
		} 
		if (ModernizedCProgram.got_exit_signal) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(cmd);
			return -1;
		} 
		if (sendfailure) {
			ModernizedCProgram.logmsg("Sending response failed. Only (%zu bytes) of (%zu bytes) were sent", responsesize - count, responsesize);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(cmd);
			return -1;
		} 
		ModernizedCProgram.logmsg("Response sent (%zu bytes) and written to %s", responsesize, responsedump);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
		if (cmdsize > 0) {
			byte[] command = new byte[32];
			int quarters;
			int num;
			ptr = cmd;
			do {
				if (2 == /*Error: Function owner not recognized*/sscanf(ptr, "%31s %d", command, num)) {
					if (!/*Error: Function owner not recognized*/strcmp("wait", command)) {
						ModernizedCProgram.logmsg("Told to sleep for %d seconds", num);
						quarters = num * 4;
						while ((quarters > 0) && !ModernizedCProgram.got_exit_signal) {
							quarters--;
							res = ModernizedCProgram.wait_ms(250);
							if (res) {
								error = (/*Error: Function owner not recognized*/_errno());
								ModernizedCProgram.logmsg("wait_ms() failed with error: (%d) %s", error, /*Error: Function owner not recognized*/strerror(error));
								break;
							} 
						}
						if (!quarters) {
							ModernizedCProgram.logmsg("Continuing after sleeping %d seconds", num);
						} 
					} else {
							ModernizedCProgram.logmsg("Unknown command in reply command section");
					} 
				} 
				ptr = /*Error: Function owner not recognized*/strchr(ptr, (byte)'\n');
				if (ptr) {
					ptr++;
				} else {
						ptr = ((Object)0);
				} 
			} while (ptr && ptr);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(cmd);
		this.setOpen(ModernizedCProgram.use_gopher ? 0 : persistent);
		ModernizedCProgram.prevtestno = generatedTestno;
		ModernizedCProgram.prevpartno = generatedPartno;
		return 0;
		ssize_t written = new ssize_t();
		size_t count = new size_t();
		byte buffer;
		byte ptr = ((Object)0);
		byte cmd = ((Object)0);
		size_t cmdsize = 0;
		FILE dump = new FILE();
		bool persistent = 1;
		bool sendfailure = 0;
		size_t responsesize = new size_t();
		int error = 0;
		int res;
		byte[] weare = new byte[256];
		long generatedTestno = this.getTestno();
		long generatedPartno = this.getPartno();
		ModernizedCProgram.logmsg("Send response number %ld part %ld", generatedTestno, generatedPartno);
		int generatedRcmd = this.getRcmd();
		switch (generatedRcmd) {
		case 0:
				break;
		case 2:
				count = /*Error: Function owner not recognized*/strlen("a string to stream 01234567890\n");
				for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
					written = (ssize_t)/*Error: Function owner not recognized*/send((SOCKET)(sock), (byte)("a string to stream 01234567890\n"), (int)(count), (int)(false));
					if (ModernizedCProgram.got_exit_signal) {
						return -1;
					} 
					if (written != (ssize_t)count) {
						ModernizedCProgram.logmsg("Stopped streaming");
						break;
					} 
				}
				return -1;
		case 1:
				return /* Do nothing. Sit idle. Pretend it rains. */0;
		default:
		}
		this.setOpen(0);
		Object generatedProtocol = this.getProtocol();
		if (generatedTestno < 0) {
			size_t msglen = new size_t();
			byte[] msgbuf = new byte[64];
			switch (generatedTestno) {
			case .DOCNUMBER_INTERNAL:
					ModernizedCProgram.logmsg("Bailing out due to internal error");
					return -1;
			case .DOCNUMBER_WERULEZ:
					ModernizedCProgram.logmsg(/* we got a "friends?" question, reply back that we sure are */"Identifying ourselves as friends");
					ModernizedCProgram.curl_msnprintf(msgbuf, /*Error: sizeof expression not supported yet*/, "RTSP_SERVER WE ROOLZ: %ld\r\n", (long)/*Error: Function owner not recognized*/getpid());
					msglen = /*Error: Function owner not recognized*/strlen(msgbuf);
					ModernizedCProgram.curl_msnprintf(weare, /*Error: sizeof expression not supported yet*/, "HTTP/1.1 200 OK\r\nContent-Length: %zu\r\n\r\n%s", msglen, msgbuf);
					buffer = weare;
					break;
			case .DOCNUMBER_QUIT:
					ModernizedCProgram.logmsg("Replying to QUIT");
					buffer = ModernizedCProgram.docquit;
					break;
			case .DOCNUMBER_404:
			case .DOCNUMBER_CONNECT:
					ModernizedCProgram.logmsg("Replying to CONNECT");
					buffer = ModernizedCProgram.docconnect;
					break;
			case .DOCNUMBER_BADCONNECT:
					ModernizedCProgram.logmsg("Replying to a bad CONNECT");
					buffer = ModernizedCProgram.docbadconnect;
					break;
			default:
					ModernizedCProgram.logmsg("Replying to with a 404");
					if (generatedProtocol == .RPROT_HTTP) {
						buffer = ModernizedCProgram.doc404_HTTP;
					} else {
							buffer = ModernizedCProgram.doc404_RTSP;
					} 
					break;
			}
			count = /*Error: Function owner not recognized*/strlen(buffer);
		} else {
				byte filename = ModernizedCProgram.test2file(generatedTestno);
				byte[] partbuf = "data";
				FILE stream = new FILE();
				if (0 != generatedPartno) {
					ModernizedCProgram.curl_msnprintf(partbuf, /*Error: sizeof expression not supported yet*/, "data%ld", generatedPartno);
				} 
				stream = /*Error: Function owner not recognized*/fopen(ModernizedCProgram.filename, "rb");
				if (!stream) {
					error = (/*Error: Function owner not recognized*/_errno());
					ModernizedCProgram.logmsg("fopen() failed with error: %d %s", error, /*Error: Function owner not recognized*/strerror(error));
					ModernizedCProgram.logmsg("Error opening file: %s", ModernizedCProgram.filename);
					ModernizedCProgram.logmsg("Couldn't open test file");
					return 0;
				} else {
						error = stream.getpart(ptr, count, "reply", partbuf);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(stream);
						if (error) {
							ModernizedCProgram.logmsg("getpart() failed with error: %d", error);
							return 0;
						} 
						buffer = ptr;
				} 
				if (ModernizedCProgram.got_exit_signal) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
					return -1;
				} 
				stream = /*Error: Function owner not recognized*/fopen(ModernizedCProgram.filename, /* re-open the same file again */"rb");
				if (!stream) {
					error = (/*Error: Function owner not recognized*/_errno());
					ModernizedCProgram.logmsg("fopen() failed with error: %d %s", error, /*Error: Function owner not recognized*/strerror(error));
					ModernizedCProgram.logmsg("Error opening file: %s", ModernizedCProgram.filename);
					ModernizedCProgram.logmsg("Couldn't open test file");
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
					return 0;
				} else {
						error = /* get the custom server control "commands" */stream.getpart(cmd, cmdsize, "reply", "postcmd");
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(stream);
						if (error) {
							ModernizedCProgram.logmsg("getpart() failed with error: %d", error);
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
							return 0;
						} 
				} 
		} 
		if (ModernizedCProgram.got_exit_signal) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(cmd);
			return -1;
		} 
		if (/*Error: Function owner not recognized*/strstr(buffer, "swsclose") || !/* If the word 'swsclose' is present anywhere in the reply chunk, the
		     connection will be closed after the data has been sent to the requesting
		     client... */count) {
			persistent = 0;
			ModernizedCProgram.logmsg("connection close instruction \"swsclose\" found in response");
		} 
		if (/*Error: Function owner not recognized*/strstr(buffer, "swsbounce")) {
			ModernizedCProgram.prevbounce = 1;
			ModernizedCProgram.logmsg("enable \"swsbounce\" in the next request");
		} else {
				ModernizedCProgram.prevbounce = 0;
		} 
		dump = /*Error: Function owner not recognized*/fopen("log/server.response", "ab");
		if (!dump) {
			error = (/*Error: Function owner not recognized*/_errno());
			ModernizedCProgram.logmsg("fopen() failed with error: %d %s", error, /*Error: Function owner not recognized*/strerror(error));
			ModernizedCProgram.logmsg("Error opening file: %s", "log/server.response");
			ModernizedCProgram.logmsg("couldn't create logfile: log/server.response");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(cmd);
			return -1;
		} 
		responsesize = count;
		do {
			size_t num = count;
			if (num > 200) {
				num = 200;
			} 
			written = (ssize_t)/*Error: Function owner not recognized*/send((SOCKET)(sock), (byte)(buffer), (int)(num), (int)(false));
			if (written < 0) {
				sendfailure = 1;
				break;
			} else {
					ModernizedCProgram.logmsg("Sent off %zd bytes", written);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(buffer, 1, (size_t)written, /* write to file as well */dump);
			if (ModernizedCProgram.got_exit_signal) {
				break;
			} 
			count -= written;
			buffer += written;
		} while (count > 0);/* Ok, we send no more than 200 bytes at a time, just to make sure that
		       larger chunks are split up so that the client will need to do multiple
		       recv() calls to get it and thus we exercise that code better */
		Object generatedRtp_buffer = this.getRtp_buffer();
		Object generatedRtp_buffersize = this.getRtp_buffersize();
		if (generatedRtp_buffer) {
			ModernizedCProgram.logmsg("About to write %zu RTP bytes", generatedRtp_buffersize);
			count = generatedRtp_buffersize;
			do {
				size_t num = count;
				if (num > 200) {
					num = 200;
				} 
				written = (ssize_t)/*Error: Function owner not recognized*/send((SOCKET)(sock), (byte)(generatedRtp_buffer + (generatedRtp_buffersize - count)), (int)(num), (int)(false));
				if (written < 0) {
					sendfailure = 1;
					break;
				} 
				count -= written;
			} while (count > 0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedRtp_buffer);
			this.setRtp_buffersize(0);
		} 
		do {
			res = /*Error: Function owner not recognized*/fclose(dump);
		} while (res && ((error = (/*Error: Function owner not recognized*/_errno())) == 4));
		if (res) {
			ModernizedCProgram.logmsg("Error closing file %s error: %d %s", "log/server.response", error, /*Error: Function owner not recognized*/strerror(error));
		} 
		if (ModernizedCProgram.got_exit_signal) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(cmd);
			return -1;
		} 
		if (sendfailure) {
			ModernizedCProgram.logmsg("Sending response failed. Only (%zu bytes) of (%zu bytes) were sent", responsesize - count, responsesize);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(cmd);
			return -1;
		} 
		ModernizedCProgram.logmsg("Response sent (%zu bytes) and written to log/server.response", responsesize);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ptr);
		if (cmdsize > 0) {
			byte[] command = new byte[32];
			int quarters;
			int num;
			ptr = cmd;
			do {
				if (2 == /*Error: Function owner not recognized*/sscanf(ptr, "%31s %d", command, num)) {
					if (!/*Error: Function owner not recognized*/strcmp("wait", command)) {
						ModernizedCProgram.logmsg("Told to sleep for %d seconds", num);
						quarters = num * 4;
						while (quarters > 0) {
							quarters--;
							res = ModernizedCProgram.wait_ms(250);
							if (ModernizedCProgram.got_exit_signal) {
								break;
							} 
							if (res) {
								error = (/*Error: Function owner not recognized*/_errno());
								ModernizedCProgram.logmsg("wait_ms() failed with error: (%d) %s", error, /*Error: Function owner not recognized*/strerror(error));
								break;
							} 
						}
						if (!quarters) {
							ModernizedCProgram.logmsg("Continuing after sleeping %d seconds", num);
						} 
					} else {
							ModernizedCProgram.logmsg("Unknown command in reply command section");
					} 
				} 
				ptr = /*Error: Function owner not recognized*/strchr(ptr, (byte)'\n');
				if (ptr) {
					ptr++;
				} else {
						ptr = ((Object)0);
				} 
			} while (ptr && ptr);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(cmd);
		this.setOpen(persistent);
		ModernizedCProgram.prevtestno = generatedTestno;
		ModernizedCProgram.prevpartno = generatedPartno;
		return 0;
	}
	public void http2() {
		(Object)req;
		ModernizedCProgram.logmsg("switched to http2"/* left to implement */);
	}
	/* returns 1 if the connection should be serviced again immediately, 0 if there
	   is no data waiting, or < 0 if it should be closed */
	public int service_connection(Object msgsock, Object listensock, Object connecthost) {
		if (ModernizedCProgram.got_exit_signal) {
			return -1;
		} 
		int generatedDone_processing = this.getDone_processing();
		while (!generatedDone_processing) {
			int rc = req.get_request(msgsock);
			if (rc <= 0) {
				return /* Nothing further to read now, possibly because the socket was closed */rc;
			} 
		}
		long generatedTestno = this.getTestno();
		long generatedPartno = this.getPartno();
		if (ModernizedCProgram.prevbounce) {
			if ((generatedTestno == /* bounce treatment requested */ModernizedCProgram.prevtestno) && (generatedPartno == ModernizedCProgram.prevpartno)) {
				generatedPartno++;
				ModernizedCProgram.logmsg("BOUNCE part number to %ld", generatedPartno);
			} else {
					ModernizedCProgram.prevbounce = 0;
					ModernizedCProgram.prevtestno = -1;
					ModernizedCProgram.prevpartno = -1;
			} 
		} 
		req.send_doc(msgsock);
		if (ModernizedCProgram.got_exit_signal) {
			return -1;
		} 
		if (generatedTestno < 0) {
			ModernizedCProgram.logmsg("special request received, no persistency");
			return -1;
		} 
		 generatedOpen = this.getOpen();
		if (!generatedOpen) {
			ModernizedCProgram.logmsg("instructed to close connection after server-reply");
			return -1;
		} 
		 generatedConnect_request = this.getConnect_request();
		int generatedConnect_port = this.getConnect_port();
		if (generatedConnect_request) {
			if (!/* a CONNECT request, setup and talk the tunnel */ModernizedCProgram.is_proxy) {
				ModernizedCProgram.logmsg("received CONNECT but isn't running as proxy!");
				return 1;
			} else {
					ModernizedCProgram.http_connect(msgsock, listensock, connecthost, generatedConnect_port);
					return -1;
			} 
		} 
		 generatedUpgrade_request = this.getUpgrade_request();
		if (generatedUpgrade_request) {
			/* an upgrade request, switch to http2 here */req.http2();
			return -1;
		} 
		if (generatedOpen) {
			ModernizedCProgram.logmsg("=> persistent connection request ended, awaits new request\n");
			return 1;
		} 
		return -1;
	}
	public Object getReqbuf() {
		return reqbuf;
	}
	public void setReqbuf(Object newReqbuf) {
		reqbuf = newReqbuf;
	}
	public  getConnect_request() {
		return connect_request;
	}
	public void setConnect_request( newConnect_request) {
		connect_request = newConnect_request;
	}
	public int getConnect_port() {
		return connect_port;
	}
	public void setConnect_port(int newConnect_port) {
		connect_port = newConnect_port;
	}
	public Object getCheckindex() {
		return checkindex;
	}
	public void setCheckindex(Object newCheckindex) {
		checkindex = newCheckindex;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public long getTestno() {
		return testno;
	}
	public void setTestno(long newTestno) {
		testno = newTestno;
	}
	public long getPartno() {
		return partno;
	}
	public void setPartno(long newPartno) {
		partno = newPartno;
	}
	public  getOpen() {
		return open;
	}
	public void setOpen( newOpen) {
		open = newOpen;
	}
	public  getAuth_req() {
		return auth_req;
	}
	public void setAuth_req( newAuth_req) {
		auth_req = newAuth_req;
	}
	public  getAuth() {
		return auth;
	}
	public void setAuth( newAuth) {
		auth = newAuth;
	}
	public Object getCl() {
		return cl;
	}
	public void setCl(Object newCl) {
		cl = newCl;
	}
	public  getDigest() {
		return digest;
	}
	public void setDigest( newDigest) {
		digest = newDigest;
	}
	public  getNtlm() {
		return ntlm;
	}
	public void setNtlm( newNtlm) {
		ntlm = newNtlm;
	}
	public int getWritedelay() {
		return writedelay;
	}
	public void setWritedelay(int newWritedelay) {
		writedelay = newWritedelay;
	}
	public int getSkip() {
		return skip;
	}
	public void setSkip(int newSkip) {
		skip = newSkip;
	}
	public int getRcmd() {
		return rcmd;
	}
	public void setRcmd(int newRcmd) {
		rcmd = newRcmd;
	}
	public int getProt_version() {
		return prot_version;
	}
	public void setProt_version(int newProt_version) {
		prot_version = newProt_version;
	}
	public int getCallcount() {
		return callcount;
	}
	public void setCallcount(int newCallcount) {
		callcount = newCallcount;
	}
	public  getConnmon() {
		return connmon;
	}
	public void setConnmon( newConnmon) {
		connmon = newConnmon;
	}
	public  getUpgrade() {
		return upgrade;
	}
	public void setUpgrade( newUpgrade) {
		upgrade = newUpgrade;
	}
	public  getUpgrade_request() {
		return upgrade_request;
	}
	public void setUpgrade_request( newUpgrade_request) {
		upgrade_request = newUpgrade_request;
	}
	public  getClose() {
		return close;
	}
	public void setClose( newClose) {
		close = newClose;
	}
	public int getDone_processing() {
		return done_processing;
	}
	public void setDone_processing(int newDone_processing) {
		done_processing = newDone_processing;
	}
}
