package application;

public class initurl {
	private Object url;
	private Object share;
	private int threadno;
	
	public initurl(Object url, Object share, int threadno) {
		setUrl(url);
		setShare(share);
		setThreadno(threadno);
	}
	public initurl() {
	}
	
	public Object getUrl() {
		return url;
	}
	public void setUrl(Object newUrl) {
		url = newUrl;
	}
	public Object getShare() {
		return share;
	}
	public void setShare(Object newShare) {
		share = newShare;
	}
	public int getThreadno() {
		return threadno;
	}
	public void setThreadno(int newThreadno) {
		threadno = newThreadno;
	}
}
