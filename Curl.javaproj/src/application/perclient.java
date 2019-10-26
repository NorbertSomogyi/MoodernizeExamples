package application;

public class perclient {
	private Object fromremote;
	private Object fromclient;
	private Object remotefd;
	private Object clientfd;
	private  used;
	
	public perclient(Object fromremote, Object fromclient, Object remotefd, Object clientfd,  used) {
		setFromremote(fromremote);
		setFromclient(fromclient);
		setRemotefd(remotefd);
		setClientfd(clientfd);
		setUsed(used);
	}
	public perclient() {
	}
	
	public Object getFromremote() {
		return fromremote;
	}
	public void setFromremote(Object newFromremote) {
		fromremote = newFromremote;
	}
	public Object getFromclient() {
		return fromclient;
	}
	public void setFromclient(Object newFromclient) {
		fromclient = newFromclient;
	}
	public Object getRemotefd() {
		return remotefd;
	}
	public void setRemotefd(Object newRemotefd) {
		remotefd = newRemotefd;
	}
	public Object getClientfd() {
		return clientfd;
	}
	public void setClientfd(Object newClientfd) {
		clientfd = newClientfd;
	}
	public  getUsed() {
		return used;
	}
	public void setUsed( newUsed) {
		used = newUsed;
	}
}
