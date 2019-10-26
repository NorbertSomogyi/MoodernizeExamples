package application;

/* struct containing data of a thread */
public class Tdata {
	private Object share;
	private Byte url;
	
	public Tdata(Object share, Byte url) {
		setShare(share);
		setUrl(url);
	}
	public Tdata() {
	}
	
	public Object getShare() {
		return share;
	}
	public void setShare(Object newShare) {
		share = newShare;
	}
	public Byte getUrl() {
		return url;
	}
	public void setUrl(Byte newUrl) {
		url = newUrl;
	}
}
