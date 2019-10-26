package application;

public class gskstrlist {
	private gskstrlist next;
	private Object ebcdicstr;
	private Object asciistr;
	
	public gskstrlist(gskstrlist next, Object ebcdicstr, Object asciistr) {
		setNext(next);
		setEbcdicstr(ebcdicstr);
		setAsciistr(asciistr);
	}
	public gskstrlist() {
	}
	
	public gskstrlist getNext() {
		return next;
	}
	public void setNext(gskstrlist newNext) {
		next = newNext;
	}
	public Object getEbcdicstr() {
		return ebcdicstr;
	}
	public void setEbcdicstr(Object newEbcdicstr) {
		ebcdicstr = newEbcdicstr;
	}
	public Object getAsciistr() {
		return asciistr;
	}
	public void setAsciistr(Object newAsciistr) {
		asciistr = newAsciistr;
	}
}
