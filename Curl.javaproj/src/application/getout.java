package application;

/* next one */
public class getout {
	private Object next;
	private Object url;
	private Object outfile;
	private Object infile;
	private int flags;
	
	public getout(Object next, Object url, Object outfile, Object infile, int flags) {
		setNext(next);
		setUrl(url);
		setOutfile(outfile);
		setInfile(infile);
		setFlags(flags);
	}
	public getout() {
	}
	
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public Object getUrl() {
		return url;
	}
	public void setUrl(Object newUrl) {
		url = newUrl;
	}
	public Object getOutfile() {
		return outfile;
	}
	public void setOutfile(Object newOutfile) {
		outfile = newOutfile;
	}
	public Object getInfile() {
		return infile;
	}
	public void setInfile(Object newInfile) {
		infile = newInfile;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
