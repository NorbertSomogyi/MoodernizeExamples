package application;

public class socketlist {
	private int[] list;
	private Object nr;
	private Object alloc;
	
	public socketlist(int[] list, Object nr, Object alloc) {
		setList(list);
		setNr(nr);
		setAlloc(alloc);
	}
	public socketlist() {
	}
	
	public int setup_named_sock(Byte listen_addr, int listen_port) {
		int socknum = 0;
		byte[] pbuf = new byte[32];
		addrinfo hints = new addrinfo();
		addrinfo ai0 = new addrinfo();
		addrinfo ai = new addrinfo();
		int gai;
		long flags;
		ModernizedCProgram.xsnprintf(pbuf, /*Error: sizeof expression not supported yet*/, "%d", listen_port);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(hints, 0, /*Error: sizeof expression not supported yet*/);
		hints.setAddrinfo(0);
		hints.setAddrinfo(1);
		hints.setAddrinfo(6);
		hints.setAddrinfo(AI_PASSIVE);
		gai = /*Error: Function owner not recognized*/getaddrinfo(listen_addr, pbuf, hints, ai0);
		if (gai) {
			ModernizedCProgram.logerror("getaddrinfo() for %s failed: %s", listen_addr, /*Error: Function owner not recognized*/gai_strerror(gai));
			return 0;
		} 
		Object generatedAddrinfo = ai.getAddrinfo();
		Object generatedNr = this.getNr();
		Object generatedAlloc = this.getAlloc();
		int[] generatedList = this.getList();
		for (ai = ai0; ai; ai = generatedAddrinfo) {
			int sockfd;
			sockfd = /*Error: Function owner not recognized*/socket(generatedAddrinfo, generatedAddrinfo, generatedAddrinfo);
			if (sockfd < 0) {
				continue;
			} 
			if (sockfd >= 64) {
				ModernizedCProgram.logerror("Socket descriptor too large");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(sockfd);
				continue;
			} 
			if (ModernizedCProgram.set_reuse_addr(/* Note: error is not fatal */sockfd)) {
				ModernizedCProgram.logerror("Could not set SO_REUSEADDR: %s", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(sockfd);
				continue;
			} 
			ModernizedCProgram.set_keep_alive(sockfd);
			if (/*Error: Function owner not recognized*/bind(sockfd, generatedAddrinfo, generatedAddrinfo) < 0) {
				ModernizedCProgram.logerror("Could not bind to %s: %s", generatedAddrinfo.ip2str(generatedAddrinfo, generatedAddrinfo), /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(sockfd);
				continue;
			} 
			if (/*Error: Function owner not recognized*/listen(sockfd, 5) < 0) {
				ModernizedCProgram.logerror("Could not listen to %s: %s", generatedAddrinfo.ip2str(generatedAddrinfo, generatedAddrinfo), /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(sockfd);
				continue;
			} 
			flags = ModernizedCProgram.fcntl(sockfd, F_GETFD, 0);
			if (flags >= 0) {
				ModernizedCProgram.fcntl(sockfd, F_SETFD, flags | FD_CLOEXEC);
			} 
			do {
				if ((generatedNr + 1) > generatedAlloc) {
					if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNr + 1)) {
						this.setAlloc((generatedNr + 1));
					} else {
							this.setAlloc((((generatedAlloc) + 16) * 3 / 2));
					} 
					(generatedList) = ModernizedCProgram.xrealloc((generatedList), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedAlloc)));
				} 
			} while (0);
			generatedList[generatedNr++] = sockfd;
			socknum++;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/freeaddrinfo(ai0);
		return socknum/* NO_IPV6 */;
	}
	public int service_loop() {
		compat_pollfd pfd = new compat_pollfd();
		int i;
		Object generatedNr = this.getNr();
		pfd = ModernizedCProgram.xcalloc(generatedNr, /*Error: Unsupported expression*/);
		int[] generatedList = this.getList();
		for (i = 0; i < generatedNr; i++) {
			pfd[i].setFd(generatedList[i]);
			pfd[i].setEvents(-1024);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/signal(SIGCHLD, child_handler);
		Object generatedSa = ss.getSa();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			int i;
			ModernizedCProgram.check_dead_children();
			if (pfd.poll(generatedNr, -1) < 0) {
				if ((/*Error: Function owner not recognized*/_errno()) != 4) {
					ModernizedCProgram.logerror("Poll failed, resuming: %s", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
					ModernizedCProgram.sleep(1);
				} 
				continue;
			} 
			for (i = 0; i < generatedNr; i++) {
				if (pfd[i].getRevents() & -1024) {
					Object ss;
					 sslen = /*Error: sizeof expression not supported yet*/;
					int incoming = /*Error: Function owner not recognized*/accept(pfd[i].getFd(), generatedSa, sslen);
					if (incoming < 0) {
						switch ((/*Error: Function owner not recognized*/_errno())) {
						case 11:
						case 4:
						case ECONNABORTED:
								continue;
						default:
								ModernizedCProgram.die_errno("accept returned");
						}
					} 
					generatedSa.handle(incoming, sslen);
				} 
			}
		}
	}
	public int[] getList() {
		return list;
	}
	public void setList(int[] newList) {
		list = newList;
	}
	public Object getNr() {
		return nr;
	}
	public void setNr(Object newNr) {
		nr = newNr;
	}
	public Object getAlloc() {
		return alloc;
	}
	public void setAlloc(Object newAlloc) {
		alloc = newAlloc;
	}
}
