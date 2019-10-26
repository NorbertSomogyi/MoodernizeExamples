package application;

public class select_ws_data {
	private Object fd;
	private Object wsasock;
	private Object wsaevent;
	private Object thread;
	
	public select_ws_data(Object fd, Object wsasock, Object wsaevent, Object thread) {
		setFd(fd);
		setWsasock(wsasock);
		setWsaevent(wsaevent);
		setThread(thread);
	}
	public select_ws_data() {
	}
	
	public Object getFd() {
		return fd;
	}
	public void setFd(Object newFd) {
		fd = newFd;
	}
	public Object getWsasock() {
		return wsasock;
	}
	public void setWsasock(Object newWsasock) {
		wsasock = newWsasock;
	}
	public Object getWsaevent() {
		return wsaevent;
	}
	public void setWsaevent(Object newWsaevent) {
		wsaevent = newWsaevent;
	}
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
}
