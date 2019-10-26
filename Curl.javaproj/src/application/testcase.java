package application;

public class testcase {
	private Object optval;
	private Object host;
	private int port;
	private Object address;
	
	public testcase(Object optval, Object host, int port, Object address) {
		setOptval(optval);
		setHost(host);
		setPort(port);
		setAddress(address);
	}
	public testcase() {
	}
	
	public void read_ahead(int convert) {
		int i;
		byte p;
		int c;
		bf b = new bf();
		tftphdr dp = new tftphdr();
		b = ModernizedCProgram.bfs[/* look at "next" buffer */ModernizedCProgram.nextone];
		int generatedCounter = b.getCounter();
		if (generatedCounter != -/* nop if not free */2) {
			return ;
		} 
		ModernizedCProgram.nextone = !/* "incr" next buffer ptr */ModernizedCProgram.nextone;
		 generatedBuf = b.getBuf();
		Object generatedHdr = generatedBuf.getHdr();
		dp = generatedHdr;
		Object generatedTh_data = dp.getTh_data();
		if (convert == 0/* The former file reading code did this:
		       b->counter = read(fileno(file), dp->th_data, SEGSIZE); */) {
			size_t copy_n = ((true) < (ModernizedCProgram.test.getRcount()) ? (true) : (ModernizedCProgram.test.getRcount()));
			.memcpy(generatedTh_data, ModernizedCProgram.test.getRptr(), copy_n);
			ModernizedCProgram.test.getRcount() -= /* decrease amount, advance pointer */copy_n;
			ModernizedCProgram.test.getRptr() += copy_n;
			b.setCounter((int)copy_n);
			return ;
		} 
		p = generatedTh_data;
		for (i = 0; i < 512; i++) {
			if (ModernizedCProgram.newline) {
				if (ModernizedCProgram.prevchar == (byte)'\n') {
					c = /* lf to cr,lf */(byte)'\n';
				} else {
						c = /* cr to cr,nul */(byte)'\0';
				} 
				ModernizedCProgram.newline = 0;
			} else {
					if (ModernizedCProgram.test.getRcount()) {
						c = ModernizedCProgram.test.getRptr()[0];
						ModernizedCProgram.test.getRptr()++;
						ModernizedCProgram.test.getRcount()--;
					} else {
							break;
					} 
					if (c == (byte)'\n' || c == (byte)'\r') {
						ModernizedCProgram.prevchar = c;
						c = (byte)'\r';
						ModernizedCProgram.newline = 1;
					} 
			} 
			p++ = (byte)c;
		}
		b.setCounter((int)(p - generatedTh_data));
	}
	/* if true, convert to ascii */
	public Object write_behind(int convert) {
		byte writebuf;
		int count;
		int ct;
		byte p;
		/* current character */int c;
		bf b = new bf();
		tftphdr dp = new tftphdr();
		b = ModernizedCProgram.bfs[ModernizedCProgram.nextone];
		int generatedCounter = b.getCounter();
		if (generatedCounter < -/* anything to flush? */1) {
			return /* just nop if nothing to do */0;
		} 
		if (!ModernizedCProgram.test.getOfile()) {
			byte[] outfile = new byte[256];
			ModernizedCProgram.curl_msnprintf(outfile, , "log/upload.%ld", ModernizedCProgram.test.getTestno());
			ModernizedCProgram.test.setOfile(.open(outfile, -1024 | 2 | -1024, 777));
			if (ModernizedCProgram.test.getOfile() == -1) {
				ModernizedCProgram.logmsg("Couldn't create and/or open file %s for upload!", outfile);
				return -/* failure! */1;
			} 
		} 
		count = generatedCounter;
		b.setCounter(-/* reset flag */2);
		 generatedBuf = b.getBuf();
		Object generatedHdr = generatedBuf.getHdr();
		dp = generatedHdr;
		ModernizedCProgram.nextone = !/* incr for next time */ModernizedCProgram.nextone;
		Object generatedTh_data = dp.getTh_data();
		writebuf = generatedTh_data;
		if (count <= 0) {
			return -/* nak logic? */1;
		} 
		if (convert == 0) {
			return ModernizedCProgram.curlx_write(ModernizedCProgram.test.getOfile(), writebuf, count);
		} 
		p = writebuf;
		ct = count;
		return count/* When an error has occurred, it is possible that the two sides are out of
		 * synch.  Ie: that what I think is the other side's response to packet N is
		 * really their response to packet N-1.
		 *
		 * So, to try to prevent that, we flush all the input queued up for us on the
		 * network connection on our host.
		 *
		 * We return the number of packets we flushed (mostly for reporting when trace
		 * is active).
		 */;
	}
	/* Based on the testno, parse the correct server commands. */
	public int parse_servercmd() {
		FILE stream = new FILE();
		byte filename;
		int error;
		Object generatedTestno = this.getTestno();
		filename = ModernizedCProgram.test2file(generatedTestno);
		stream = .fopen(filename, "rb");
		if (!stream) {
			error = (._errno());
			ModernizedCProgram.logmsg("fopen() failed with error: %d %s", error, .strerror(error));
			ModernizedCProgram.logmsg("  [1] Error opening file: %s", filename);
			ModernizedCProgram.logmsg("  Couldn't open test file %ld", generatedTestno);
			return /* done */1;
		} else {
				byte orgcmd = ((Object)0);
				byte cmd = ((Object)0);
				size_t cmdsize = 0;
				int num = 0;
				error = /* get the custom server control "commands" */stream.getpart(orgcmd, cmdsize, "reply", "servercmd");
				.fclose(stream);
				if (error) {
					ModernizedCProgram.logmsg("getpart() failed with error: %d", error);
					return /* done */1;
				} 
				cmd = orgcmd;
				while (cmd && cmdsize) {
					byte check;
					if (1 == .sscanf(cmd, "writedelay: %d", num)) {
						ModernizedCProgram.logmsg("instructed to delay %d secs between packets", num);
						this.setWritedelay(num);
					} else {
							ModernizedCProgram.logmsg("Unknown <servercmd> instruction found: %s", cmd);
					} 
					check = .strchr(cmd, /* try to deal with CRLF or just LF */(byte)'\r');
					if (!check) {
						check = .strchr(cmd, (byte)'\n');
					} 
					if (check) {
						while ((check == (byte)'\r') || (check == /* get to the letter following the newline */(byte)'\n')) {
							check++;
						}
						if (!check/* if we reached a zero, get out */) {
							break;
						} 
						cmd = check;
					} else {
							break;
					} 
				}
				.free(orgcmd);
		} 
		return /* OK! */0;
		FILE stream = new FILE();
		byte filename;
		int error;
		long generatedTestno = this.getTestno();
		filename = ModernizedCProgram.test2file(generatedTestno);
		this.setClose(0);
		stream = .fopen(filename, "rb");
		if (!stream) {
			error = (._errno());
			ModernizedCProgram.logmsg("fopen() failed with error: %d %s", error, .strerror(error));
			ModernizedCProgram.logmsg("  [1] Error opening file: %s", filename);
			ModernizedCProgram.logmsg("  Couldn't open test file %ld", generatedTestno);
			this.setOpen(/* closes connection */0);
			return /* done */1;
		} else {
				byte orgcmd = ((Object)0);
				byte cmd = ((Object)0);
				size_t cmdsize = 0;
				int num = 0;
				error = /* get the custom server control "commands" */stream.getpart(orgcmd, cmdsize, "reply", "servercmd");
				.fclose(stream);
				if (error) {
					ModernizedCProgram.logmsg("getpart() failed with error: %d", error);
					this.setOpen(/* closes connection */0);
					return /* done */1;
				} 
				this.setConnmon(0);
				cmd = orgcmd;
				while (cmd && cmdsize) {
					byte check;
					if (!.strncmp("auth_required", cmd, .strlen("auth_required"))) {
						ModernizedCProgram.logmsg("instructed to require authorization header");
						this.setAuth_req(1);
					}  else if (!.strncmp("idle", cmd, .strlen("idle"))) {
						ModernizedCProgram.logmsg("instructed to idle");
						this.setRcmd(1);
						this.setOpen(1);
					}  else if (!.strncmp("stream", cmd, .strlen("stream"))) {
						ModernizedCProgram.logmsg("instructed to stream");
						this.setRcmd(2);
					}  else if (!.strncmp("connection-monitor", cmd, .strlen("connection-monitor"))) {
						ModernizedCProgram.logmsg("enabled connection monitoring");
						this.setConnmon(1);
					}  else if (!.strncmp("upgrade", cmd, .strlen("upgrade"))) {
						ModernizedCProgram.logmsg("enabled upgrade to http2");
						this.setUpgrade(1);
					}  else if (!.strncmp("swsclose", cmd, .strlen("swsclose"))) {
						ModernizedCProgram.logmsg("swsclose: close this connection after response");
						this.setClose(1);
					}  else if (1 == .sscanf(cmd, "skip: %d", num)) {
						ModernizedCProgram.logmsg("instructed to skip this number of bytes %d", num);
						this.setSkip(num);
					}  else if (1 == .sscanf(cmd, "writedelay: %d", num)) {
						ModernizedCProgram.logmsg("instructed to delay %d secs between packets", num);
						this.setWritedelay(num);
					} else {
							ModernizedCProgram.logmsg("Unknown <servercmd> instruction found: %s", cmd);
					} 
					check = .strchr(cmd, /* try to deal with CRLF or just LF */(byte)'\r');
					if (!check) {
						check = .strchr(cmd, (byte)'\n');
					} 
					if (check) {
						while ((check == (byte)'\r') || (check == /* get to the letter following the newline */(byte)'\n')) {
							check++;
						}
						if (!check/* if we reached a zero, get out */) {
							break;
						} 
						cmd = check;
					} else {
							break;
					} 
				}
				.free(orgcmd);
		} 
		return /* OK! */0;
	}
	/*
	 * Validate file access.
	 */
	public int validate_access(Object filename, int mode) {
		byte ptr;
		ModernizedCProgram.logmsg("trying to get file: %s mode %x", filename, mode);
		if (!.strncmp("verifiedserver", filename, 14)) {
			byte[] weare = new byte[128];
			size_t count = ModernizedCProgram.curl_msnprintf(weare, , "WE ROOLZ: %ld\r\n", (long).getpid());
			ModernizedCProgram.logmsg("Are-we-friendly question received");
			ModernizedCProgram.test.setBuffer(.strdup(weare));
			ModernizedCProgram.test.setRptr(ModernizedCProgram.test.getBuffer());
			ModernizedCProgram.test.setBufsize(/* set total count */count);
			ModernizedCProgram.test.setRcount(/* set data left to read */count);
			return /* fine */0;
		} 
		ptr = .strrchr(filename, /* find the last slash */(byte)'/');
		if (ptr) {
			byte[] partbuf = "data";
			long partno;
			long testno;
			byte file;
			/* skip the slash */ptr++;
			while (ptr && !(ModernizedCProgram.Curl_isdigit((int)((byte)/* skip all non-numericals following the slash */ptr)))) {
				ptr++;
			}
			testno = .strtol(ptr, ptr, /* get the number */10);
			if (testno > 10000) {
				partno = testno % 10000;
				testno /= 10000;
			} else {
					partno = 0;
			} 
			ModernizedCProgram.logmsg("requested test number %ld part %ld", testno, partno);
			ModernizedCProgram.test.setTestno(testno);
			(Object)ModernizedCProgram.test.parse_servercmd();
			file = ModernizedCProgram.test2file(testno);
			if (0 != partno) {
				ModernizedCProgram.curl_msnprintf(partbuf, , "data%ld", partno);
			} 
			if (file) {
				FILE stream = .fopen(file, "rb");
				if (!stream) {
					int error = (._errno());
					ModernizedCProgram.logmsg("fopen() failed with error: %d %s", error, .strerror(error));
					ModernizedCProgram.logmsg("Error opening file: %s", file);
					ModernizedCProgram.logmsg("Couldn't open test file: %s", file);
					return 2;
				} else {
						size_t count = new size_t();
						int error = stream.getpart(ModernizedCProgram.test.getBuffer(), count, "reply", partbuf);
						.fclose(stream);
						if (error) {
							ModernizedCProgram.logmsg("getpart() failed with error: %d", error);
							return 2;
						} 
						if (ModernizedCProgram.test.getBuffer()) {
							ModernizedCProgram.test.setRptr(ModernizedCProgram.test.getBuffer());
							ModernizedCProgram.test.setBufsize(/* set total count */count);
							ModernizedCProgram.test.setRcount(/* set data left to read */count);
						} else {
								return 2;
						} 
				} 
			} else {
					return 2;
			} 
		} else {
				ModernizedCProgram.logmsg("no slash found in path");
				return /* failure */2;
		} 
		ModernizedCProgram.logmsg("file opened and all is good");
		return 0/*
		 * Send the requested file.
		 */;
	}
	public Object getOptval() {
		return optval;
	}
	public void setOptval(Object newOptval) {
		optval = newOptval;
	}
	public Object getHost() {
		return host;
	}
	public void setHost(Object newHost) {
		host = newHost;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int newPort) {
		port = newPort;
	}
	public Object getAddress() {
		return address;
	}
	public void setAddress(Object newAddress) {
		address = newAddress;
	}
}
/* host:port:address[,address]... */
