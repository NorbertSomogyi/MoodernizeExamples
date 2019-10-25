package application;

/* one of these for each DoH request */
public class dnsprobe {
	private Object easy;
	private int dnstype;
	private Object dohbuffer;
	private Object dohlen;
	private dohresponse serverdoh;
	
	public dnsprobe(Object easy, int dnstype, Object dohbuffer, Object dohlen, dohresponse serverdoh) {
		setEasy(easy);
		setDnstype(dnstype);
		setDohbuffer(dohbuffer);
		setDohlen(dohlen);
		setServerdoh(serverdoh);
	}
	public dnsprobe() {
	}
	
	public Object getEasy() {
		return easy;
	}
	public void setEasy(Object newEasy) {
		easy = newEasy;
	}
	public int getDnstype() {
		return dnstype;
	}
	public void setDnstype(int newDnstype) {
		dnstype = newDnstype;
	}
	public Object getDohbuffer() {
		return dohbuffer;
	}
	public void setDohbuffer(Object newDohbuffer) {
		dohbuffer = newDohbuffer;
	}
	public Object getDohlen() {
		return dohlen;
	}
	public void setDohlen(Object newDohlen) {
		dohlen = newDohlen;
	}
	public dohresponse getServerdoh() {
		return serverdoh;
	}
	public void setServerdoh(dohresponse newServerdoh) {
		serverdoh = newServerdoh;
	}
}
