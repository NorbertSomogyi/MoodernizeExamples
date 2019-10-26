package application;

public class recent_command {
	private recent_command prev;
	private recent_command next;
	private Byte buf;
	
	public recent_command(recent_command prev, recent_command next, Byte buf) {
		setPrev(prev);
		setNext(next);
		setBuf(buf);
	}
	public recent_command() {
	}
	
	public recent_command getPrev() {
		return prev;
	}
	public void setPrev(recent_command newPrev) {
		prev = newPrev;
	}
	public recent_command getNext() {
		return next;
	}
	public void setNext(recent_command newNext) {
		next = newNext;
	}
	public Byte getBuf() {
		return buf;
	}
	public void setBuf(Byte newBuf) {
		buf = newBuf;
	}
}
