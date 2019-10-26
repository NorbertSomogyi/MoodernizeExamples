package application;

public class Curl_gsk_descriptor {
	private Object h;
	private gskstrlist strlist;
	
	public Curl_gsk_descriptor(Object h, gskstrlist strlist) {
		setH(h);
		setStrlist(strlist);
	}
	public Curl_gsk_descriptor() {
	}
	
	public void gsk_free_handle() {
		gskstrlist q = new gskstrlist();
		gskstrlist generatedStrlist = this.getStrlist();
		Object generatedAsciistr = q.getAsciistr();
		while ((q = generatedStrlist)) {
			this.setStrlist(q);
			.free((Object)generatedAsciistr);
			.free(q);
		}
		.free(p);
	}
	public int cachestring(Object ebcdicbuf, int bufsize, Object buffer) {
		int rc;
		byte asciibuf;
		gskstrlist sp = new gskstrlist();
		Object generatedEbcdicstr = sp.getEbcdicstr();
		gskstrlist generatedNext = sp.getNext();
		gskstrlist generatedStrlist = this.getStrlist();
		for (sp = generatedStrlist; sp; sp = generatedNext) {
			if (generatedEbcdicstr == ebcdicbuf) {
				break;
			} 
		}
		if (!sp) {
			sp = (gskstrlist).malloc();
			if (!sp) {
				return GSK_INSUFFICIENT_STORAGE;
			} 
			asciibuf = .malloc(bufsize + 1);
			if (!asciibuf) {
				.free(sp);
				return GSK_INSUFFICIENT_STORAGE;
			} 
			.QadrtConvertE2A(asciibuf, ebcdicbuf, bufsize, bufsize);
			asciibuf[bufsize] = (byte)'\0';
			sp.setEbcdicstr(ebcdicbuf);
			sp.setAsciistr(asciibuf);
			sp.setNext(generatedStrlist);
			this.setStrlist(sp);
		} 
		Object generatedAsciistr = sp.getAsciistr();
		buffer = generatedAsciistr;
		return GSK_OK;
	}
	public Object getH() {
		return h;
	}
	public void setH(Object newH) {
		h = newH;
	}
	public gskstrlist getStrlist() {
		return strlist;
	}
	public void setStrlist(gskstrlist newStrlist) {
		strlist = newStrlist;
	}
}
