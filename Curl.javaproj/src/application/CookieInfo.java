package application;

public class CookieInfo {
	private Object cookies;
	private Object filename;
	private  running;
	private long numcookies;
	private  newsession;
	private int lastct;
	
	public CookieInfo(Object cookies, Object filename,  running, long numcookies,  newsession, int lastct) {
		setCookies(cookies);
		setFilename(filename);
		setRunning(running);
		setNumcookies(numcookies);
		setNewsession(newsession);
		setLastct(lastct);
	}
	public CookieInfo() {
	}
	
	public Object getCookies() {
		return cookies;
	}
	public void setCookies(Object newCookies) {
		cookies = newCookies;
	}
	public Object getFilename() {
		return filename;
	}
	public void setFilename(Object newFilename) {
		filename = newFilename;
	}
	public  getRunning() {
		return running;
	}
	public void setRunning( newRunning) {
		running = newRunning;
	}
	public long getNumcookies() {
		return numcookies;
	}
	public void setNumcookies(long newNumcookies) {
		numcookies = newNumcookies;
	}
	public  getNewsession() {
		return newsession;
	}
	public void setNewsession( newNewsession) {
		newsession = newNewsession;
	}
	public int getLastct() {
		return lastct;
	}
	public void setLastct(int newLastct) {
		lastct = newLastct;
	}
}
