package application;

public class Names {
	private curl_hash hostcache;
	private  hostcachetype;
	
	public Names(curl_hash hostcache,  hostcachetype) {
		setHostcache(hostcache);
		setHostcachetype(hostcachetype);
	}
	public Names() {
	}
	
	public curl_hash getHostcache() {
		return hostcache;
	}
	public void setHostcache(curl_hash newHostcache) {
		hostcache = newHostcache;
	}
	public  getHostcachetype() {
		return hostcachetype;
	}
	public void setHostcachetype( newHostcachetype) {
		hostcachetype = newHostcachetype;
	}
}
