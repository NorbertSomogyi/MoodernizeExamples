package application;

/* Information associated with a specific socket */
public class _SockInfo {
	private Object sockfd;
	private Object easy;
	private int action;
	private long timeout;
	private ev_io ev;
	private int evset;
	private _GlobalInfo global;
	
	public _SockInfo(Object sockfd, Object easy, int action, long timeout, ev_io ev, int evset, _GlobalInfo global) {
		setSockfd(sockfd);
		setEasy(easy);
		setAction(action);
		setTimeout(timeout);
		setEv(ev);
		setEvset(evset);
		setGlobal(global);
	}
	public _SockInfo() {
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
	public ev_io getEv() {
		return ev;
	}
	public void setEv(ev_io newEv) {
		ev = newEv;
	}
	public int getEvset() {
		return evset;
	}
	public void setEvset(int newEvset) {
		evset = newEvset;
	}
	public _GlobalInfo getGlobal() {
		return global;
	}
	public void setGlobal(_GlobalInfo newGlobal) {
		global = newGlobal;
	}
}
