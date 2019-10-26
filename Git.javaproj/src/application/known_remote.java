package application;

public class known_remote {
	private known_remote next;
	private remote remote;
	
	public known_remote(known_remote next, remote remote) {
		setNext(next);
		setRemote(remote);
	}
	public known_remote() {
	}
	
	public known_remote getNext() {
		return next;
	}
	public void setNext(known_remote newNext) {
		next = newNext;
	}
	public remote getRemote() {
		return remote;
	}
	public void setRemote(remote newRemote) {
		remote = newRemote;
	}
}
