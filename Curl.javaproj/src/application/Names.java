package application;

public class Names {
	private Object hostcache;
	private  hostcachetype;
	
	public Names(Object hostcache,  hostcachetype) {
		setHostcache(hostcache);
		setHostcachetype(hostcachetype);
	}
	public Names() {
	}
	
	public Object getHostcache() {
		return hostcache;
	}
	public void setHostcache(Object newHostcache) {
		hostcache = newHostcache;
	}
	public  getHostcachetype() {
		return hostcachetype;
	}
	public void setHostcachetype( newHostcachetype) {
		hostcachetype = newHostcachetype;
	}
}
