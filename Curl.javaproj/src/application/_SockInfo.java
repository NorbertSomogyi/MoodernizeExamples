package application;

/* Information associated with a specific socket */
public class _SockInfo {
	private Object sockfd;
	private Object easy;
	private int action;
	private long timeout;
	private event ev;
	private _GlobalInfo global;
	
	public _SockInfo(Object sockfd, Object easy, int action, long timeout, event ev, _GlobalInfo global) {
		setSockfd(sockfd);
		setEasy(easy);
		setAction(action);
		setTimeout(timeout);
		setEv(ev);
		setGlobal(global);
	}
	public _SockInfo() {
	}
	
	/* Clean up the SockInfo structure */
	public void remsock() {
		event generatedEv = this.getEv();
		if (f) {
			.event_del(generatedEv);
			.free(f);
		} 
		if (!f) {
			return ;
		} 
		event generatedEv = this.getEv();
		if (generatedEv) {
			.g_source_remove(generatedEv);
		} 
		.g_free(f);
		.printf("%s  \n", __PRETTY_FUNCTION__);
		Object generatedEvset = this.getEvset();
		Object generatedLoop = g.getLoop();
		event generatedEv = this.getEv();
		if (f) {
			if (generatedEvset) {
				.ev_io_stop(generatedLoop, generatedEv);
			} 
			.free(f);
		} 
		Object generatedSockfd = this.getSockfd();
		Object generatedEpfd = g.getEpfd();
		if (f) {
			if (generatedSockfd) {
				if (.epoll_ctl(generatedEpfd, EPOLL_CTL_DEL, generatedSockfd, ((Object)0))) {
					.fprintf((_iob[2]), "EPOLL_CTL_DEL failed for fd: %d : %s\n", generatedSockfd, .strerror((._errno())));
				} 
			} 
			.free(f);
		} 
		.fprintf(stdout, "\nremsock: ");
		if (f) {
			.free(f);
		} 
	}
	public Object getSockfd() {
		return sockfd;
	}
	public void setSockfd(Object newSockfd) {
		sockfd = newSockfd;
	}
	public Object getEasy() {
		return easy;
	}
	public void setEasy(Object newEasy) {
		easy = newEasy;
	}
	public int getAction() {
		return action;
	}
	public void setAction(int newAction) {
		action = newAction;
	}
	public long getTimeout() {
		return timeout;
	}
	public void setTimeout(long newTimeout) {
		timeout = newTimeout;
	}
	public event getEv() {
		return ev;
	}
	public void setEv(event newEv) {
		ev = newEv;
	}
	public _GlobalInfo getGlobal() {
		return global;
	}
	public void setGlobal(_GlobalInfo newGlobal) {
		global = newGlobal;
	}
}
