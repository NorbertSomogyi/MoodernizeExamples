package application;

/*
 * EBCDIC --> ASCII string mapping table.
 * Some strings returned by GSKit are dynamically allocated and automatically
 * released when closing the handle.
 * To provide the same functionality, we use a "private" handle that
 * holds the GSKit handle and a list of string mappings. This will allow
 * avoid conversion of already converted strings and releasing them upon
 * close time.
 */
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
